package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talmpz2_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action16") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_16_10U7( A396EmprCod, A44AlbRecCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel15"+"_"+"ALBDETPIEU") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A56AlbRUni = httpContext.GetPar( "AlbRUni") ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx15asaalbdetpieu10U7( A396EmprCod, A44AlbRecCod, A56AlbRUni) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel19"+"_"+"ALBDETPIEU") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A56AlbRUni = httpContext.GetPar( "AlbRUni") ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx19asaalbdetpieu10U299( A396EmprCod, A44AlbRecCod, A56AlbRUni) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel23"+"_"+"vPIEUTI") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A2159AlbRecPie = httpContext.GetPar( "AlbRecPie") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx23asapieuti10U299( A396EmprCod, A44AlbRecCod, A2159AlbRecPie) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_32") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_32( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_33") == 0 )
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
         gxload_33( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_34") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A970ProceCod = (short)(GXutil.lval( httpContext.GetPar( "ProceCod"))) ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_34( A396EmprCod, A970ProceCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_35") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1211TipEntCod = (short)(GXutil.lval( httpContext.GetPar( "TipEntCod"))) ;
         n1211TipEntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_35( A396EmprCod, A1211TipEntCod) ;
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
            A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
            n44AlbRecCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ALMACEN DE PIEZAS - DETALLE", ""), (short)(0)) ;
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
      nRC_GXsfl_220 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_220"))) ;
      nGXsfl_220_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_220_idx"))) ;
      sGXsfl_220_idx = httpContext.GetPar( "sGXsfl_220_idx") ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      A2146AlbDetKgm = CommonUtil.decimalVal( httpContext.GetPar( "AlbDetKgm"), ".") ;
      A2148AlbDetKgmU = CommonUtil.decimalVal( httpContext.GetPar( "AlbDetKgmU"), ".") ;
      A2149AlbDetMtr = CommonUtil.decimalVal( httpContext.GetPar( "AlbDetMtr"), ".") ;
      A2151AlbDetMtrU = CommonUtil.decimalVal( httpContext.GetPar( "AlbDetMtrU"), ".") ;
      A2152AlbDetPie = (short)(GXutil.lval( httpContext.GetPar( "AlbDetPie"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
      n44AlbRecCod = false ;
      A56AlbRUni = httpContext.GetPar( "AlbRUni") ;
      A2153AlbDetPieU = (short)(GXutil.lval( httpContext.GetPar( "AlbDetPieU"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public talmpz2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public talmpz2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talmpz2_impl.class ));
   }

   public talmpz2_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbRUni = new HTMLChoice();
      cmbAlbRReo = new HTMLChoice();
      cmbAlbREst = new HTMLChoice();
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
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      }
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
      }
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      }
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMPZ2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMPZ2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMPZ2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMPZ2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TALMPZ2.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "N Recepcion ID", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRecCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Referencia", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef), GXutil.rtrim( localUtil.format( A45AlbRef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRef_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRef_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTrnCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "", "", "", "", "", 1, edtTrnCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre Transportista", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnNom_Internalname, GXutil.rtrim( A841TrnNom), GXutil.rtrim( localUtil.format( A841TrnNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnNom_Jsonclick, 0, "", "", "", "", "", 1, edtTrnNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Albaran Entrega", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbREnt_Internalname, GXutil.rtrim( A46AlbREnt), GXutil.rtrim( localUtil.format( A46AlbREnt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbREnt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbREnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Piezas Entregadas", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieEnt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPieEnt_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Unidad Medida", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRUni, cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni), 1, cmbAlbRUni.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRUni.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "", true, (byte)(0), "HLP_TALMPZ2.htm");
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Localizacion", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLoc_Internalname, GXutil.rtrim( A50AlbRLoc), GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLoc_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRLoc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbRFen_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRFen_Internalname, localUtil.format(A49AlbRFen, "99/99/99"), localUtil.format( A49AlbRFen, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRFen_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRFen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbRFen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRFen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALMPZ2.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Unidades Entrada", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniEnt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Reoperado", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRReo, cmbAlbRReo.getInternalname(), GXutil.rtrim( A55AlbRReo), 1, cmbAlbRReo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRReo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "", true, (byte)(0), "HLP_TALMPZ2.htm");
      cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Piezas Utilizadas", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieUti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieUti_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPieUti_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Piezas Rebajadas", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieReb_Internalname, GXutil.ltrim( localUtil.ntoc( A53AlbRPieReb, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieReb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A53AlbRPieReb), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A53AlbRPieReb), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieReb_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPieReb_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Unidades Utilizadas", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniUti_Enabled!=0) ? localUtil.format( A60AlbRUniUti, "ZZZZZ9.99") : localUtil.format( A60AlbRUniUti, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniUti_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniUti_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Unidades Rebajadas", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniReb_Internalname, GXutil.ltrim( localUtil.ntoc( A59AlbRUniReb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniReb_Enabled!=0) ? localUtil.format( A59AlbRUniReb, "ZZZZZ9.99") : localUtil.format( A59AlbRUniReb, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniReb_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniReb_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Piezas Disponibles", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieDis_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPieDis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Unidades Disponibles", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniDis_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniDis_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Fecha Ultima Utilizacion", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbRFecUlt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRFecUlt_Internalname, localUtil.format(A48AlbRFecUlt, "99/99/99"), localUtil.format( A48AlbRFecUlt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRFecUlt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRFecUlt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbRFecUlt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRFecUlt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALMPZ2.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Estado (0=No Cumpl. 1=Cumpl.)", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbREst, cmbAlbREst.getInternalname(), GXutil.trim( GXutil.str( A47AlbREst, 1, 0)), 1, cmbAlbREst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbREst.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "", true, (byte)(0), "HLP_TALMPZ2.htm");
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Codigo Tipo Entrada", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipEntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipEntCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1211TipEntCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1211TipEntCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipEntCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipEntCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Nombre Tipo Entrada", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipEntNom_Internalname, GXutil.rtrim( A1212TipEntNom), GXutil.rtrim( localUtil.format( A1212TipEntNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipEntNom_Jsonclick, 0, "", "", "", "", "", 1, edtTipEntNom_Enabled, 0, "text", "", 25, "chr", 1, "row", 25, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Numero de Etiquetas", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbNumEti_Internalname, GXutil.ltrim( localUtil.ntoc( A1222AlbNumEti, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbNumEti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1222AlbNumEti), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1222AlbNumEti), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbNumEti_Jsonclick, 0, "", "", "", "", "", 1, edtAlbNumEti_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Destino Empesa", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRDes_Internalname, GXutil.rtrim( A1291AlbRDes), GXutil.rtrim( localUtil.format( A1291AlbRDes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRDes_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRDes_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Código de Procedencia", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProceCod_Internalname, GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProceCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceCod_Jsonclick, 0, "", "", "", "", "", 1, edtProceCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Nombre Procedencia", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProceNom_Internalname, GXutil.rtrim( A971ProceNom), GXutil.rtrim( localUtil.format( A971ProceNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceNom_Jsonclick, 0, "", "", "", "", "", 1, edtProceNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Total Piezas", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetPie_Internalname, GXutil.ltrim( localUtil.ntoc( A2152AlbDetPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDetPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2152AlbDetPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2152AlbDetPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetPie_Jsonclick, 0, "", "", "", "", "", 1, edtAlbDetPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Total Metros Entrados", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A2149AlbDetMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDetMtr_Enabled!=0) ? localUtil.format( A2149AlbDetMtr, "ZZZZZ9.99") : localUtil.format( A2149AlbDetMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetMtr_Jsonclick, 0, "", "", "", "", "", 1, edtAlbDetMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Kilos Entrados", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A2146AlbDetKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDetKgm_Enabled!=0) ? localUtil.format( A2146AlbDetKgm, "ZZZZZ9.99") : localUtil.format( A2146AlbDetKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetKgm_Jsonclick, 0, "", "", "", "", "", 1, edtAlbDetKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Metros Utilizados", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetMtrU_Internalname, GXutil.ltrim( localUtil.ntoc( A2151AlbDetMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDetMtrU_Enabled!=0) ? localUtil.format( A2151AlbDetMtrU, "ZZZZZ9.99") : localUtil.format( A2151AlbDetMtrU, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetMtrU_Jsonclick, 0, "", "", "", "", "", 1, edtAlbDetMtrU_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Kilos Utilizados", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetKgmU_Internalname, GXutil.ltrim( localUtil.ntoc( A2148AlbDetKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDetKgmU_Enabled!=0) ? localUtil.format( A2148AlbDetKgmU, "ZZZZZ9.99") : localUtil.format( A2148AlbDetKgmU, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetKgmU_Jsonclick, 0, "", "", "", "", "", 1, edtAlbDetKgmU_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Metros Disponibles", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetMtrD_Internalname, GXutil.ltrim( localUtil.ntoc( A2150AlbDetMtrD, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDetMtrD_Enabled!=0) ? localUtil.format( A2150AlbDetMtrD, "ZZZZZ9.99") : localUtil.format( A2150AlbDetMtrD, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetMtrD_Jsonclick, 0, "", "", "", "", "", 1, edtAlbDetMtrD_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Kilos Disponibles", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetKgmD_Internalname, GXutil.ltrim( localUtil.ntoc( A2147AlbDetKgmD, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDetKgmD_Enabled!=0) ? localUtil.format( A2147AlbDetKgmD, "ZZZZZ9.99") : localUtil.format( A2147AlbDetKgmD, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetKgmD_Jsonclick, 0, "", "", "", "", "", 1, edtAlbDetKgmD_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Piezas Utilizadas", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetPieU_Internalname, GXutil.ltrim( localUtil.ntoc( A2153AlbDetPieU, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDetPieU_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2153AlbDetPieU), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2153AlbDetPieU), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetPieU_Jsonclick, 0, "", "", "", "", "", 1, edtAlbDetPieU_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "Hora de entrada", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbRHEn_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRHEn_Internalname, localUtil.ttoc( A4606AlbRHEn, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A4606AlbRHEn, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,206);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRHEn_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRHEn_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ2.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbRHEn_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRHEn_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALMPZ2.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "Nota Fiscal?", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrNF_Internalname, GXutil.rtrim( A6182AlbrNF), GXutil.rtrim( localUtil.format( A6182AlbrNF, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,211);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrNF_Jsonclick, 0, "", "", "", "", "", 1, edtAlbrNF_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "Ultima Pieza", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBod_UltPz_Internalname, GXutil.rtrim( A8835Bod_UltPz), GXutil.rtrim( localUtil.format( A8835Bod_UltPz, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,216);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBod_UltPz_Jsonclick, 0, "", "", "", "", "", 1, edtBod_UltPz_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALMPZ2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol220( ) ;
      nGXsfl_220_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount299 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_299 = (short)(1) ;
            scanStart10U299( ) ;
            while ( RcdFound299 != 0 )
            {
               init_level_properties299( ) ;
               getByPrimaryKey10U299( ) ;
               addRow10U299( ) ;
               scanNext10U299( ) ;
            }
            scanEnd10U299( ) ;
            nBlankRcdCount299 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal10U299( ) ;
         standaloneModal10U299( ) ;
         sMode299 = Gx_mode ;
         while ( nGXsfl_220_idx < nRC_GXsfl_220 )
         {
            bGXsfl_220_Refreshing = true ;
            readRow10U299( ) ;
            edtavnRcdDeleted_299_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_299_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_299_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_299_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbRecPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECPIE_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbRecAnh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECANH_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecAnh_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbRecMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECMTR_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtr_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbRecKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECKGM_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgm_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbRecMtrU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECMTRU_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtrU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtrU_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbRecKgmU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECKGMU_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgmU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgmU_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbRecCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECCOL_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCol_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbRecIdPz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECIDPZ_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecIdPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecIdPz_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbRecIdRc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECIDRC_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecIdRc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecIdRc_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbRecPal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECPAL_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPal_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtALRPIELOC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIELOC_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtALRPIELOC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALRPIELOC_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtALRPIETEL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIETEL_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtALRPIETEL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALRPIETEL_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtALRPIEOPE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIEOPE_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtALRPIEOPE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALRPIEOPE_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtALRPIEST_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIEST_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtALRPIEST_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALRPIEST_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbRecFec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECFEC_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecFec_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbRecPnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECPNT_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPnt_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbRecCo1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECCO1_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCo1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCo1_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbRecCo2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECCO2_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCo2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCo2_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbHdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDR_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdr_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbHdrr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRR_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrr_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbHdrp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRP_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrp_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbSerT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBSERT_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbSerT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSerT_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbColNm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOLNM_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbColNm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColNm_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbColNn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOLNN_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbColNn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColNn_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbKgsPf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBKGSPF_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbKgsPf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbKgsPf_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbMtsPf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBMTSPF_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbMtsPf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMtsPf_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbAfin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBAFIN_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbAfin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbAfin_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbNPed_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBNPED_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbNPed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNPed_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtAlbObsp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBOBSP_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbObsp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbObsp_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtBod_Dib_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_DIB_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_Dib_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Dib_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtBod_Tua_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_TUA_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_Tua_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Tua_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtBod_Tub_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_TUB_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_Tub_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Tub_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtBod_Tuc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_TUC_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_Tuc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Tuc_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtBod_Hilz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_HILZ_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_Hilz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Hilz_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtBod_FecE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_FECE_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_FecE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_FecE_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtBod_PedOr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_PEDOR_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_PedOr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_PedOr_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtBod_Rack_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_RACK_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_Rack_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Rack_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtBod_PoS_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_POS_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_PoS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_PoS_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtBod_Ok_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_OK_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_Ok_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Ok_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtBod_Talla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_TALLA_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_Talla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Talla_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtBod_Und_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_UND_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_Und_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Und_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtBod_Medt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_MEDT_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_Medt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Medt_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtBod_ColNNn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_COLNNN_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_ColNNn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_ColNNn_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtBod_Por_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_POR_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_Por_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Por_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtBod_codb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_CODB_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_codb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_codb_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtBod_Pes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_PES_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_Pes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Pes_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtBod_DibO_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_DIBO_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_DibO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_DibO_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtBod_item3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_ITEM3_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_item3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_item3_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtBod_ToE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_TOE_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_ToE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_ToE_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtBod_DescP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_DESCP_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_DescP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_DescP_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtBod_CVar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_CVAR_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_CVar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_CVar_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            edtBod_NVar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_NVAR_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBod_NVar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_NVar_Enabled), 5, 0), !bGXsfl_220_Refreshing);
            if ( ( nRcdExists_299 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal10U299( ) ;
            }
            sendRow10U299( ) ;
            bGXsfl_220_Refreshing = false ;
         }
         Gx_mode = sMode299 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount299 = (short)(5) ;
         nRcdExists_299 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart10U299( ) ;
            while ( RcdFound299 != 0 )
            {
               sGXsfl_220_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_220_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_220299( ) ;
               init_level_properties299( ) ;
               standaloneNotModal10U299( ) ;
               getByPrimaryKey10U299( ) ;
               standaloneModal10U299( ) ;
               addRow10U299( ) ;
               scanNext10U299( ) ;
            }
            scanEnd10U299( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode299 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_220_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_220_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_220299( ) ;
      initAll10U299( ) ;
      init_level_properties299( ) ;
      nRcdExists_299 = (short)(0) ;
      nIsMod_299 = (short)(0) ;
      nRcdDeleted_299 = (short)(0) ;
      nBlankRcdCount299 = (short)(nBlankRcdUsr299+nBlankRcdCount299) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount299 > 0 )
      {
         standaloneNotModal10U299( ) ;
         standaloneModal10U299( ) ;
         addRow10U299( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtAlbRecPie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount299 = (short)(nBlankRcdCount299-1) ;
      }
      Gx_mode = sMode299 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 276,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMPZ2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 277,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMPZ2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 278,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMPZ2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 279,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMPZ2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 280,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TALMPZ2.htm");
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
         Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "Z58AlbRUniEnt")) ;
         Z60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "Z60AlbRUniUti")) ;
         Z52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "Z52AlbRPieEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "Z54AlbRPieUti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z45AlbRef = httpContext.cgiGet( "Z45AlbRef") ;
         Z46AlbREnt = httpContext.cgiGet( "Z46AlbREnt") ;
         Z56AlbRUni = httpContext.cgiGet( "Z56AlbRUni") ;
         Z50AlbRLoc = httpContext.cgiGet( "Z50AlbRLoc") ;
         Z49AlbRFen = localUtil.ctod( httpContext.cgiGet( "Z49AlbRFen"), 0) ;
         Z55AlbRReo = httpContext.cgiGet( "Z55AlbRReo") ;
         Z53AlbRPieReb = (int)(localUtil.ctol( httpContext.cgiGet( "Z53AlbRPieReb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z59AlbRUniReb = localUtil.ctond( httpContext.cgiGet( "Z59AlbRUniReb")) ;
         Z48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( "Z48AlbRFecUlt"), 0) ;
         Z47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z47AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1222AlbNumEti = (short)(localUtil.ctol( httpContext.cgiGet( "Z1222AlbNumEti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1291AlbRDes = httpContext.cgiGet( "Z1291AlbRDes") ;
         Z4606AlbRHEn = localUtil.ctot( httpContext.cgiGet( "Z4606AlbRHEn"), 0) ;
         Z6182AlbrNF = httpContext.cgiGet( "Z6182AlbrNF") ;
         Z8835Bod_UltPz = httpContext.cgiGet( "Z8835Bod_UltPz") ;
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z970ProceCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z1211TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_220 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_220"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
         AV18AlbCum = httpContext.cgiGet( "vALBCUM") ;
         Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV67Lindalana = (byte)(localUtil.ctol( httpContext.cgiGet( "vLINDALANA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A4795AlRPieCal = httpContext.cgiGet( "ALRPIECAL") ;
         AV54PieUti = httpContext.cgiGet( "vPIEUTI") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         else
         {
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
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
         A46AlbREnt = httpContext.cgiGet( edtAlbREnt_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPIEENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRPieEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A52AlbRPieEnt = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         }
         else
         {
            A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         }
         cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
         cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
         A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A50AlbRLoc = httpContext.cgiGet( edtAlbRLoc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         if ( localUtil.vcdate( httpContext.cgiGet( edtAlbRFen_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ALBRFEN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRFen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A49AlbRFen = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         }
         else
         {
            A49AlbRFen = localUtil.ctod( httpContext.cgiGet( edtAlbRFen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUNIENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRUniEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A58AlbRUniEnt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
         else
         {
            A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
         cmbAlbRReo.setName( cmbAlbRReo.getInternalname() );
         cmbAlbRReo.setValue( httpContext.cgiGet( cmbAlbRReo.getInternalname()) );
         A55AlbRReo = httpContext.cgiGet( cmbAlbRReo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPIEUTI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRPieUti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A54AlbRPieUti = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         }
         else
         {
            A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieReb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieReb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPIEREB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRPieReb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A53AlbRPieReb = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
         }
         else
         {
            A53AlbRPieReb = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieReb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUNIUTI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRUniUti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A60AlbRUniUti = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
         else
         {
            A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRUniReb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRUniReb_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUNIREB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRUniReb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A59AlbRUniReb = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
         }
         else
         {
            A59AlbRUniReb = localUtil.ctond( httpContext.cgiGet( edtAlbRUniReb_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
         }
         A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
         A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         if ( localUtil.vcdate( httpContext.cgiGet( edtAlbRFecUlt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ALBRFECULT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRFecUlt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A48AlbRFecUlt = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         }
         else
         {
            A48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( edtAlbRFecUlt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         }
         cmbAlbREst.setName( cmbAlbREst.getInternalname() );
         cmbAlbREst.setValue( httpContext.cgiGet( cmbAlbREst.getInternalname()) );
         A47AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbREst.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipEntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipEntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipEntCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1211TipEntCod = (short)(0) ;
            n1211TipEntCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         }
         else
         {
            A1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipEntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1211TipEntCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         }
         A1212TipEntNom = httpContext.cgiGet( edtTipEntNom_Internalname) ;
         n1212TipEntNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbNumEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbNumEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBNUMETI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbNumEti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1222AlbNumEti = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
         }
         else
         {
            A1222AlbNumEti = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbNumEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
         }
         A1291AlbRDes = httpContext.cgiGet( edtAlbRDes_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProceCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A970ProceCod = (short)(0) ;
            n970ProceCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         }
         else
         {
            A970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n970ProceCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         }
         A971ProceNom = httpContext.cgiGet( edtProceNom_Internalname) ;
         n971ProceNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         A2152AlbDetPie = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbDetPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = localUtil.ctond( httpContext.cgiGet( edtAlbDetMtr_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = localUtil.ctond( httpContext.cgiGet( edtAlbDetKgm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = localUtil.ctond( httpContext.cgiGet( edtAlbDetMtrU_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = localUtil.ctond( httpContext.cgiGet( edtAlbDetKgmU_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
         A2150AlbDetMtrD = localUtil.ctond( httpContext.cgiGet( edtAlbDetMtrD_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
         A2147AlbDetKgmD = localUtil.ctond( httpContext.cgiGet( edtAlbDetKgmD_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
         A2153AlbDetPieU = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbDetPieU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         if ( localUtil.vcdtime( httpContext.cgiGet( edtAlbRHEn_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "ALBRHEN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRHEn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
            n4606AlbRHEn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A4606AlbRHEn = localUtil.ctot( httpContext.cgiGet( edtAlbRHEn_Internalname)) ;
            n4606AlbRHEn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A6182AlbrNF = GXutil.upper( httpContext.cgiGet( edtAlbrNF_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6182AlbrNF", A6182AlbrNF);
         A8835Bod_UltPz = httpContext.cgiGet( edtBod_UltPz_Internalname) ;
         n8835Bod_UltPz = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8835Bod_UltPz", A8835Bod_UltPz);
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
            A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
            n44AlbRecCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
            initAll10U7( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_299_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_299_Enabled), 5, 0), !bGXsfl_220_Refreshing);
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
      disableAttributes10U7( ) ;
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

   public void confirm_10U0( )
   {
      beforeValidate10U7( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls10U7( ) ;
         }
         else
         {
            checkExtendedTable10U7( ) ;
            if ( AnyError == 0 )
            {
               zm10U7( 31) ;
               zm10U7( 32) ;
               zm10U7( 33) ;
               zm10U7( 34) ;
               zm10U7( 35) ;
               zm10U7( 36) ;
            }
            closeExtendedTableCursors10U7( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode7 = Gx_mode ;
         confirm_10U299( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode7 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues10U0( ) ;
      }
   }

   public void confirm_10U299( )
   {
      s2147AlbDetKgmD = O2147AlbDetKgmD ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      s2150AlbDetMtrD = O2150AlbDetMtrD ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      s2153AlbDetPieU = O2153AlbDetPieU ;
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      nGXsfl_220_idx = 0 ;
      while ( nGXsfl_220_idx < nRC_GXsfl_220 )
      {
         readRow10U299( ) ;
         if ( ( nRcdExists_299 != 0 ) || ( nIsMod_299 != 0 ) )
         {
            getKey10U299( ) ;
            if ( ( nRcdExists_299 == 0 ) && ( nRcdDeleted_299 == 0 ) )
            {
               if ( RcdFound299 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate10U299( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable10U299( ) ;
                     if ( AnyError == 0 )
                     {
                        zm10U299( 39) ;
                     }
                     closeExtendedTableCursors10U299( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O2147AlbDetKgmD = A2147AlbDetKgmD ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
                     O2150AlbDetMtrD = A2150AlbDetMtrD ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
                     O2153AlbDetPieU = A2153AlbDetPieU ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "ALBRECPIE_" + sGXsfl_220_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbRecPie_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound299 != 0 )
               {
                  if ( nRcdDeleted_299 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey10U299( ) ;
                     load10U299( ) ;
                     beforeValidate10U299( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls10U299( ) ;
                        O2147AlbDetKgmD = A2147AlbDetKgmD ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
                        O2150AlbDetMtrD = A2150AlbDetMtrD ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
                        O2153AlbDetPieU = A2153AlbDetPieU ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_299 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate10U299( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable10U299( ) ;
                           if ( AnyError == 0 )
                           {
                              zm10U299( 39) ;
                           }
                           closeExtendedTableCursors10U299( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O2147AlbDetKgmD = A2147AlbDetKgmD ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
                           O2150AlbDetMtrD = A2150AlbDetMtrD ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
                           O2153AlbDetPieU = A2153AlbDetPieU ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_299 == 0 )
                  {
                     GXCCtl = "ALBRECPIE_" + sGXsfl_220_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecPie_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_299_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecPie_Internalname, GXutil.rtrim( A2159AlbRecPie)) ;
         httpContext.changePostValue( edtAlbRecAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A2154AlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecMtrU_Internalname, GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecKgmU_Internalname, GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecCol_Internalname, GXutil.ltrim( localUtil.ntoc( A3730AlbRecCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecIdPz_Internalname, GXutil.rtrim( A3731AlbRecIdPz)) ;
         httpContext.changePostValue( edtAlbRecIdRc_Internalname, GXutil.ltrim( localUtil.ntoc( A3732AlbRecIdRc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecPal_Internalname, GXutil.ltrim( localUtil.ntoc( A4410AlbRecPal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtALRPIELOC_Internalname, GXutil.rtrim( A7408ALRPIELOC)) ;
         httpContext.changePostValue( edtALRPIETEL_Internalname, GXutil.ltrim( localUtil.ntoc( A7409ALRPIETEL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtALRPIEOPE_Internalname, GXutil.rtrim( A7410ALRPIEOPE)) ;
         httpContext.changePostValue( edtALRPIEST_Internalname, GXutil.rtrim( A7411ALRPIEST)) ;
         httpContext.changePostValue( edtAlbRecFec_Internalname, localUtil.ttoc( A4411AlbRecFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtAlbRecPnt_Internalname, GXutil.ltrim( localUtil.ntoc( A7792AlbRecPnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecCo1_Internalname, GXutil.rtrim( A7793AlbRecCo1)) ;
         httpContext.changePostValue( edtAlbRecCo2_Internalname, GXutil.ltrim( localUtil.ntoc( A7794AlbRecCo2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdr_Internalname, GXutil.ltrim( localUtil.ntoc( A7998AlbHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdrr_Internalname, GXutil.ltrim( localUtil.ntoc( A7999AlbHdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdrp_Internalname, GXutil.rtrim( A8000AlbHdrp)) ;
         httpContext.changePostValue( edtAlbSerT_Internalname, GXutil.rtrim( A8001AlbSerT)) ;
         httpContext.changePostValue( edtAlbColNm_Internalname, GXutil.rtrim( A8002AlbColNm)) ;
         httpContext.changePostValue( edtAlbColNn_Internalname, GXutil.ltrim( localUtil.ntoc( A8003AlbColNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbKgsPf_Internalname, GXutil.ltrim( localUtil.ntoc( A8004AlbKgsPf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbMtsPf_Internalname, GXutil.ltrim( localUtil.ntoc( A8005AlbMtsPf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbAfin_Internalname, GXutil.ltrim( localUtil.ntoc( A8006AlbAfin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbNPed_Internalname, GXutil.rtrim( A8037AlbNPed)) ;
         httpContext.changePostValue( edtAlbObsp_Internalname, A8051AlbObsp) ;
         httpContext.changePostValue( edtBod_Dib_Internalname, GXutil.rtrim( A8679Bod_Dib)) ;
         httpContext.changePostValue( edtBod_Tua_Internalname, GXutil.ltrim( localUtil.ntoc( A8680Bod_Tua, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBod_Tub_Internalname, GXutil.ltrim( localUtil.ntoc( A8681Bod_Tub, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBod_Tuc_Internalname, GXutil.ltrim( localUtil.ntoc( A8682Bod_Tuc, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBod_Hilz_Internalname, GXutil.rtrim( A8683Bod_Hilz)) ;
         httpContext.changePostValue( edtBod_FecE_Internalname, localUtil.format(A8684Bod_FecE, "99/99/99")) ;
         httpContext.changePostValue( edtBod_PedOr_Internalname, GXutil.rtrim( A8685Bod_PedOr)) ;
         httpContext.changePostValue( edtBod_Rack_Internalname, GXutil.rtrim( A8774Bod_Rack)) ;
         httpContext.changePostValue( edtBod_PoS_Internalname, GXutil.rtrim( A8775Bod_PoS)) ;
         httpContext.changePostValue( edtBod_Ok_Internalname, GXutil.rtrim( A8776Bod_Ok)) ;
         httpContext.changePostValue( edtBod_Talla_Internalname, GXutil.rtrim( A8779Bod_Talla)) ;
         httpContext.changePostValue( edtBod_Und_Internalname, GXutil.ltrim( localUtil.ntoc( A8780Bod_Und, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBod_Medt_Internalname, GXutil.rtrim( A8781Bod_Medt)) ;
         httpContext.changePostValue( edtBod_ColNNn_Internalname, GXutil.rtrim( A8831Bod_ColNNn)) ;
         httpContext.changePostValue( edtBod_Por_Internalname, GXutil.ltrim( localUtil.ntoc( A8832Bod_Por, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBod_codb_Internalname, GXutil.rtrim( A8833Bod_codb)) ;
         httpContext.changePostValue( edtBod_Pes_Internalname, GXutil.rtrim( A8834Bod_Pes)) ;
         httpContext.changePostValue( edtBod_DibO_Internalname, GXutil.rtrim( A8848Bod_DibO)) ;
         httpContext.changePostValue( edtBod_item3_Internalname, GXutil.rtrim( A9376Bod_item3)) ;
         httpContext.changePostValue( edtBod_ToE_Internalname, GXutil.rtrim( A9540Bod_ToE)) ;
         httpContext.changePostValue( edtBod_DescP_Internalname, GXutil.rtrim( A9560Bod_DescP)) ;
         httpContext.changePostValue( edtBod_CVar_Internalname, GXutil.rtrim( A9561Bod_CVar)) ;
         httpContext.changePostValue( edtBod_NVar_Internalname, GXutil.rtrim( A9562Bod_NVar)) ;
         httpContext.changePostValue( "ZT_"+"Z2159AlbRecPie_"+sGXsfl_220_idx, GXutil.rtrim( Z2159AlbRecPie)) ;
         httpContext.changePostValue( "ZT_"+"Z4795AlRPieCal_"+sGXsfl_220_idx, GXutil.rtrim( Z4795AlRPieCal)) ;
         httpContext.changePostValue( "ZT_"+"Z4411AlbRecFec_"+sGXsfl_220_idx, localUtil.ttoc( Z4411AlbRecFec, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z2154AlbRecAnh_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z2154AlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2157AlbRecMtr_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2155AlbRecKgm_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2158AlbRecMtrU_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2156AlbRecKgmU_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3730AlbRecCol_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z3730AlbRecCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3731AlbRecIdPz_"+sGXsfl_220_idx, GXutil.rtrim( Z3731AlbRecIdPz)) ;
         httpContext.changePostValue( "ZT_"+"Z3732AlbRecIdRc_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z3732AlbRecIdRc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4410AlbRecPal_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z4410AlbRecPal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7408ALRPIELOC_"+sGXsfl_220_idx, GXutil.rtrim( Z7408ALRPIELOC)) ;
         httpContext.changePostValue( "ZT_"+"Z7409ALRPIETEL_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z7409ALRPIETEL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7410ALRPIEOPE_"+sGXsfl_220_idx, GXutil.rtrim( Z7410ALRPIEOPE)) ;
         httpContext.changePostValue( "ZT_"+"Z7411ALRPIEST_"+sGXsfl_220_idx, GXutil.rtrim( Z7411ALRPIEST)) ;
         httpContext.changePostValue( "ZT_"+"Z7792AlbRecPnt_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z7792AlbRecPnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7793AlbRecCo1_"+sGXsfl_220_idx, GXutil.rtrim( Z7793AlbRecCo1)) ;
         httpContext.changePostValue( "ZT_"+"Z7794AlbRecCo2_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z7794AlbRecCo2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7998AlbHdr_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z7998AlbHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7999AlbHdrr_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z7999AlbHdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8000AlbHdrp_"+sGXsfl_220_idx, GXutil.rtrim( Z8000AlbHdrp)) ;
         httpContext.changePostValue( "ZT_"+"Z8001AlbSerT_"+sGXsfl_220_idx, GXutil.rtrim( Z8001AlbSerT)) ;
         httpContext.changePostValue( "ZT_"+"Z8002AlbColNm_"+sGXsfl_220_idx, GXutil.rtrim( Z8002AlbColNm)) ;
         httpContext.changePostValue( "ZT_"+"Z8003AlbColNn_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z8003AlbColNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8004AlbKgsPf_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z8004AlbKgsPf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8005AlbMtsPf_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z8005AlbMtsPf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8006AlbAfin_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z8006AlbAfin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8037AlbNPed_"+sGXsfl_220_idx, GXutil.rtrim( Z8037AlbNPed)) ;
         httpContext.changePostValue( "ZT_"+"Z8051AlbObsp_"+sGXsfl_220_idx, Z8051AlbObsp) ;
         httpContext.changePostValue( "ZT_"+"Z8679Bod_Dib_"+sGXsfl_220_idx, GXutil.rtrim( Z8679Bod_Dib)) ;
         httpContext.changePostValue( "ZT_"+"Z8680Bod_Tua_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z8680Bod_Tua, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8681Bod_Tub_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z8681Bod_Tub, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8682Bod_Tuc_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z8682Bod_Tuc, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8683Bod_Hilz_"+sGXsfl_220_idx, GXutil.rtrim( Z8683Bod_Hilz)) ;
         httpContext.changePostValue( "ZT_"+"Z8684Bod_FecE_"+sGXsfl_220_idx, localUtil.dtoc( Z8684Bod_FecE, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z8685Bod_PedOr_"+sGXsfl_220_idx, GXutil.rtrim( Z8685Bod_PedOr)) ;
         httpContext.changePostValue( "ZT_"+"Z8774Bod_Rack_"+sGXsfl_220_idx, GXutil.rtrim( Z8774Bod_Rack)) ;
         httpContext.changePostValue( "ZT_"+"Z8775Bod_PoS_"+sGXsfl_220_idx, GXutil.rtrim( Z8775Bod_PoS)) ;
         httpContext.changePostValue( "ZT_"+"Z8776Bod_Ok_"+sGXsfl_220_idx, GXutil.rtrim( Z8776Bod_Ok)) ;
         httpContext.changePostValue( "ZT_"+"Z8779Bod_Talla_"+sGXsfl_220_idx, GXutil.rtrim( Z8779Bod_Talla)) ;
         httpContext.changePostValue( "ZT_"+"Z8780Bod_Und_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z8780Bod_Und, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8781Bod_Medt_"+sGXsfl_220_idx, GXutil.rtrim( Z8781Bod_Medt)) ;
         httpContext.changePostValue( "ZT_"+"Z8831Bod_ColNNn_"+sGXsfl_220_idx, GXutil.rtrim( Z8831Bod_ColNNn)) ;
         httpContext.changePostValue( "ZT_"+"Z8832Bod_Por_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z8832Bod_Por, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8833Bod_codb_"+sGXsfl_220_idx, GXutil.rtrim( Z8833Bod_codb)) ;
         httpContext.changePostValue( "ZT_"+"Z8834Bod_Pes_"+sGXsfl_220_idx, GXutil.rtrim( Z8834Bod_Pes)) ;
         httpContext.changePostValue( "ZT_"+"Z8848Bod_DibO_"+sGXsfl_220_idx, GXutil.rtrim( Z8848Bod_DibO)) ;
         httpContext.changePostValue( "ZT_"+"Z9376Bod_item3_"+sGXsfl_220_idx, GXutil.rtrim( Z9376Bod_item3)) ;
         httpContext.changePostValue( "ZT_"+"Z9540Bod_ToE_"+sGXsfl_220_idx, GXutil.rtrim( Z9540Bod_ToE)) ;
         httpContext.changePostValue( "ZT_"+"Z9560Bod_DescP_"+sGXsfl_220_idx, GXutil.rtrim( Z9560Bod_DescP)) ;
         httpContext.changePostValue( "ZT_"+"Z9561Bod_CVar_"+sGXsfl_220_idx, GXutil.rtrim( Z9561Bod_CVar)) ;
         httpContext.changePostValue( "ZT_"+"Z9562Bod_NVar_"+sGXsfl_220_idx, GXutil.rtrim( Z9562Bod_NVar)) ;
         httpContext.changePostValue( "nRcdDeleted_299_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_299_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_299_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_299 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_299_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_299_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECPIE_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECANH_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecAnh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECMTR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECKGM_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECMTRU_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtrU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECKGMU_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgmU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECCOL_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECIDPZ_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecIdPz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECIDRC_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecIdRc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECPAL_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRPIELOC_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALRPIELOC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRPIETEL_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALRPIETEL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRPIEOPE_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALRPIEOPE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRPIEST_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALRPIEST_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECFEC_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecFec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECPNT_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECCO1_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCo1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECCO2_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCo2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRP_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBSERT_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbSerT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOLNM_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbColNm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOLNN_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbColNn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBKGSPF_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbKgsPf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBMTSPF_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbMtsPf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBAFIN_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbAfin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBNPED_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbNPed_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBOBSP_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbObsp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_DIB_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Dib_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_TUA_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Tua_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_TUB_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Tub_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_TUC_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Tuc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_HILZ_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Hilz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_FECE_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_FecE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_PEDOR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_PedOr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_RACK_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Rack_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_POS_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_PoS_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_OK_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Ok_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_TALLA_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Talla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_UND_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Und_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_MEDT_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Medt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_COLNNN_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_ColNNn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_POR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Por_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_CODB_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_codb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_PES_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Pes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_DIBO_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_DibO_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_ITEM3_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_item3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_TOE_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_ToE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_DESCP_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_DescP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_CVAR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_CVar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_NVAR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_NVar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O2147AlbDetKgmD = s2147AlbDetKgmD ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      O2150AlbDetMtrD = s2150AlbDetMtrD ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      O2153AlbDetPieU = s2153AlbDetPieU ;
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      /* Start of After( level) rules */
      /* Using cursor T010U5 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A2152AlbDetPie = T010U5_A2152AlbDetPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = T010U5_A2149AlbDetMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = T010U5_A2146AlbDetKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = T010U5_A2151AlbDetMtrU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = T010U5_A2148AlbDetKgmU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
      }
      else
      {
         A2152AlbDetPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
      }
      A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2149AlbDetMtr)==0) )
      {
         A58AlbRUniEnt = A2149AlbDetMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2146AlbDetKgm)==0) )
         {
            A58AlbRUniEnt = A2146AlbDetKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2151AlbDetMtrU)==0) )
      {
         A60AlbRUniUti = A2151AlbDetMtrU ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2148AlbDetKgmU)==0) )
         {
            A60AlbRUniUti = A2148AlbDetKgmU ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      if ( ! (0==A2152AlbDetPie) )
      {
         A52AlbRPieEnt = A2152AlbDetPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      }
      /* End of After( level) rules */
   }

   public void resetCaption10U0( )
   {
   }

   public void zm10U7( int GX_JID )
   {
      if ( ( GX_JID == 30 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z58AlbRUniEnt = T010U7_A58AlbRUniEnt[0] ;
            Z60AlbRUniUti = T010U7_A60AlbRUniUti[0] ;
            Z52AlbRPieEnt = T010U7_A52AlbRPieEnt[0] ;
            Z54AlbRPieUti = T010U7_A54AlbRPieUti[0] ;
            Z45AlbRef = T010U7_A45AlbRef[0] ;
            Z46AlbREnt = T010U7_A46AlbREnt[0] ;
            Z56AlbRUni = T010U7_A56AlbRUni[0] ;
            Z50AlbRLoc = T010U7_A50AlbRLoc[0] ;
            Z49AlbRFen = T010U7_A49AlbRFen[0] ;
            Z55AlbRReo = T010U7_A55AlbRReo[0] ;
            Z53AlbRPieReb = T010U7_A53AlbRPieReb[0] ;
            Z59AlbRUniReb = T010U7_A59AlbRUniReb[0] ;
            Z48AlbRFecUlt = T010U7_A48AlbRFecUlt[0] ;
            Z47AlbREst = T010U7_A47AlbREst[0] ;
            Z1222AlbNumEti = T010U7_A1222AlbNumEti[0] ;
            Z1291AlbRDes = T010U7_A1291AlbRDes[0] ;
            Z4606AlbRHEn = T010U7_A4606AlbRHEn[0] ;
            Z6182AlbrNF = T010U7_A6182AlbrNF[0] ;
            Z8835Bod_UltPz = T010U7_A8835Bod_UltPz[0] ;
            Z252CliCod = T010U7_A252CliCod[0] ;
            Z840TrnCod = T010U7_A840TrnCod[0] ;
            Z970ProceCod = T010U7_A970ProceCod[0] ;
            Z1211TipEntCod = T010U7_A1211TipEntCod[0] ;
         }
         else
         {
            Z58AlbRUniEnt = A58AlbRUniEnt ;
            Z60AlbRUniUti = A60AlbRUniUti ;
            Z52AlbRPieEnt = A52AlbRPieEnt ;
            Z54AlbRPieUti = A54AlbRPieUti ;
            Z45AlbRef = A45AlbRef ;
            Z46AlbREnt = A46AlbREnt ;
            Z56AlbRUni = A56AlbRUni ;
            Z50AlbRLoc = A50AlbRLoc ;
            Z49AlbRFen = A49AlbRFen ;
            Z55AlbRReo = A55AlbRReo ;
            Z53AlbRPieReb = A53AlbRPieReb ;
            Z59AlbRUniReb = A59AlbRUniReb ;
            Z48AlbRFecUlt = A48AlbRFecUlt ;
            Z47AlbREst = A47AlbREst ;
            Z1222AlbNumEti = A1222AlbNumEti ;
            Z1291AlbRDes = A1291AlbRDes ;
            Z4606AlbRHEn = A4606AlbRHEn ;
            Z6182AlbrNF = A6182AlbrNF ;
            Z8835Bod_UltPz = A8835Bod_UltPz ;
            Z252CliCod = A252CliCod ;
            Z840TrnCod = A840TrnCod ;
            Z970ProceCod = A970ProceCod ;
            Z1211TipEntCod = A1211TipEntCod ;
         }
      }
      if ( GX_JID == -30 )
      {
         Z44AlbRecCod = A44AlbRecCod ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z45AlbRef = A45AlbRef ;
         Z46AlbREnt = A46AlbREnt ;
         Z56AlbRUni = A56AlbRUni ;
         Z50AlbRLoc = A50AlbRLoc ;
         Z49AlbRFen = A49AlbRFen ;
         Z55AlbRReo = A55AlbRReo ;
         Z53AlbRPieReb = A53AlbRPieReb ;
         Z59AlbRUniReb = A59AlbRUniReb ;
         Z48AlbRFecUlt = A48AlbRFecUlt ;
         Z47AlbREst = A47AlbREst ;
         Z1222AlbNumEti = A1222AlbNumEti ;
         Z1291AlbRDes = A1291AlbRDes ;
         Z4606AlbRHEn = A4606AlbRHEn ;
         Z6182AlbrNF = A6182AlbrNF ;
         Z8835Bod_UltPz = A8835Bod_UltPz ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z840TrnCod = A840TrnCod ;
         Z970ProceCod = A970ProceCod ;
         Z1211TipEntCod = A1211TipEntCod ;
         Z407EmprNom = A407EmprNom ;
         Z2152AlbDetPie = A2152AlbDetPie ;
         Z2149AlbDetMtr = A2149AlbDetMtr ;
         Z2146AlbDetKgm = A2146AlbDetKgm ;
         Z2151AlbDetMtrU = A2151AlbDetMtrU ;
         Z2148AlbDetKgmU = A2148AlbDetKgmU ;
         Z279CliNom = A279CliNom ;
         Z841TrnNom = A841TrnNom ;
         Z1212TipEntNom = A1212TipEntNom ;
         Z971ProceNom = A971ProceNom ;
      }
   }

   public void standaloneNotModal( )
   {
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      /* Using cursor T010U8 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T010U8_A407EmprNom[0] ;
      n407EmprNom = T010U8_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T010U5 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A2152AlbDetPie = T010U5_A2152AlbDetPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = T010U5_A2149AlbDetMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = T010U5_A2146AlbDetKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = T010U5_A2151AlbDetMtrU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = T010U5_A2148AlbDetKgmU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
      }
      else
      {
         A2152AlbDetPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
      }
      pr_default.close(2);
      A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
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
      if ( ! (0==A2152AlbDetPie) )
      {
         A52AlbRPieEnt = A2152AlbDetPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A4606AlbRHEn) && ( Gx_BScreen == 0 ) )
      {
         A4606AlbRHEn = GXutil.now( ) ;
         n4606AlbRHEn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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

   public void load10U7( )
   {
      /* Using cursor T010U14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A58AlbRUniEnt = T010U14_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A60AlbRUniUti = T010U14_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A52AlbRPieEnt = T010U14_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A54AlbRPieUti = T010U14_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A407EmprNom = T010U14_A407EmprNom[0] ;
         n407EmprNom = T010U14_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T010U14_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A45AlbRef = T010U14_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A841TrnNom = T010U14_A841TrnNom[0] ;
         n841TrnNom = T010U14_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A46AlbREnt = T010U14_A46AlbREnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         A56AlbRUni = T010U14_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A50AlbRLoc = T010U14_A50AlbRLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         A49AlbRFen = T010U14_A49AlbRFen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         A55AlbRReo = T010U14_A55AlbRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         A53AlbRPieReb = T010U14_A53AlbRPieReb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
         A59AlbRUniReb = T010U14_A59AlbRUniReb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
         A48AlbRFecUlt = T010U14_A48AlbRFecUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         A47AlbREst = T010U14_A47AlbREst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         A1212TipEntNom = T010U14_A1212TipEntNom[0] ;
         n1212TipEntNom = T010U14_n1212TipEntNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
         A1222AlbNumEti = T010U14_A1222AlbNumEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
         A1291AlbRDes = T010U14_A1291AlbRDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         A971ProceNom = T010U14_A971ProceNom[0] ;
         n971ProceNom = T010U14_n971ProceNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         A4606AlbRHEn = T010U14_A4606AlbRHEn[0] ;
         n4606AlbRHEn = T010U14_n4606AlbRHEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A6182AlbrNF = T010U14_A6182AlbrNF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6182AlbrNF", A6182AlbrNF);
         A8835Bod_UltPz = T010U14_A8835Bod_UltPz[0] ;
         n8835Bod_UltPz = T010U14_n8835Bod_UltPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8835Bod_UltPz", A8835Bod_UltPz);
         A252CliCod = T010U14_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A840TrnCod = T010U14_A840TrnCod[0] ;
         n840TrnCod = T010U14_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A970ProceCod = T010U14_A970ProceCod[0] ;
         n970ProceCod = T010U14_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         A1211TipEntCod = T010U14_A1211TipEntCod[0] ;
         n1211TipEntCod = T010U14_n1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         A2152AlbDetPie = T010U14_A2152AlbDetPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = T010U14_A2149AlbDetMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = T010U14_A2146AlbDetKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = T010U14_A2151AlbDetMtrU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = T010U14_A2148AlbDetKgmU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
         zm10U7( -30) ;
      }
      pr_default.close(10);
      onLoadActions10U7( ) ;
   }

   public void onLoadActions10U7( )
   {
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
      {
         A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            A2153AlbDetPieU = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
      }
      if ( ! (0==A2153AlbDetPieU) )
      {
         A54AlbRPieUti = A2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      if ( A47AlbREst == 1 )
      {
         AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      }
      else
      {
         if ( A47AlbREst == 0 )
         {
            AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2149AlbDetMtr)==0) )
      {
         A58AlbRUniEnt = A2149AlbDetMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2146AlbDetKgm)==0) )
         {
            A58AlbRUniEnt = A2146AlbDetKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2151AlbDetMtrU)==0) )
      {
         A60AlbRUniUti = A2151AlbDetMtrU ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2148AlbDetKgmU)==0) )
         {
            A60AlbRUniUti = A2148AlbDetKgmU ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
   }

   public void checkExtendedTable10U7( )
   {
      nIsDirty_7 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T010U9 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T010U9_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(6);
      /* Using cursor T010U10 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T010U10_A841TrnNom[0] ;
      n841TrnNom = T010U10_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      pr_default.close(7);
      /* Using cursor T010U11 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProceCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A971ProceNom = T010U11_A971ProceNom[0] ;
      n971ProceNom = T010U11_n971ProceNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
      pr_default.close(8);
      /* Using cursor T010U12 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1211TipEntCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipEntCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A1212TipEntNom = T010U12_A1212TipEntNom[0] ;
      n1212TipEntNom = T010U12_n1212TipEntNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
      pr_default.close(9);
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
      {
         nIsDirty_7 = (short)(1) ;
         A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            nIsDirty_7 = (short)(1) ;
            A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            nIsDirty_7 = (short)(1) ;
            A2153AlbDetPieU = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
      }
      if ( ! (0==A2153AlbDetPieU) )
      {
         nIsDirty_7 = (short)(1) ;
         A54AlbRPieUti = A2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      }
      nIsDirty_7 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      if ( ! ( ( GXutil.strcmp(A56AlbRUni, "K") == 0 ) || ( GXutil.strcmp(A56AlbRUni, "M") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBRUNI");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbRUni.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A55AlbRReo, "SI") == 0 ) || ( GXutil.strcmp(A55AlbRReo, "NO") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Reclamacion?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBRREO");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbRReo.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( A47AlbREst == 0 ) || ( A47AlbREst == 1 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Estado", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBREST");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbREst.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( A47AlbREst == 1 )
      {
         AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      }
      else
      {
         if ( A47AlbREst == 0 )
         {
            AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2149AlbDetMtr)==0) )
      {
         nIsDirty_7 = (short)(1) ;
         A58AlbRUniEnt = A2149AlbDetMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2146AlbDetKgm)==0) )
         {
            nIsDirty_7 = (short)(1) ;
            A58AlbRUniEnt = A2146AlbDetKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2151AlbDetMtrU)==0) )
      {
         nIsDirty_7 = (short)(1) ;
         A60AlbRUniUti = A2151AlbDetMtrU ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2148AlbDetKgmU)==0) )
         {
            nIsDirty_7 = (short)(1) ;
            A60AlbRUniUti = A2148AlbDetKgmU ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         nIsDirty_7 = (short)(1) ;
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            nIsDirty_7 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            nIsDirty_7 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
   }

   public void closeExtendedTableCursors10U7( )
   {
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
   }

   public void enableDisable( )
   {
   }

   public void gxload_32( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T010U15 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T010U15_A279CliNom[0] ;
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

   public void gxload_33( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T010U16 */
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
      A841TrnNom = T010U16_A841TrnNom[0] ;
      n841TrnNom = T010U16_n841TrnNom[0] ;
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

   public void gxload_34( String A396EmprCod ,
                          short A970ProceCod )
   {
      /* Using cursor T010U17 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProceCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A971ProceNom = T010U17_A971ProceNom[0] ;
      n971ProceNom = T010U17_n971ProceNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A971ProceNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_35( String A396EmprCod ,
                          short A1211TipEntCod )
   {
      /* Using cursor T010U18 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1211TipEntCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipEntCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A1212TipEntNom = T010U18_A1212TipEntNom[0] ;
      n1212TipEntNom = T010U18_n1212TipEntNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1212TipEntNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void getKey10U7( )
   {
      /* Using cursor T010U19 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound7 = (short)(1) ;
      }
      else
      {
         RcdFound7 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T010U7 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(4) != 101) && ( T010U7_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T010U7_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm10U7( 30) ;
         RcdFound7 = (short)(1) ;
         A58AlbRUniEnt = T010U7_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A60AlbRUniUti = T010U7_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A52AlbRPieEnt = T010U7_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A54AlbRPieUti = T010U7_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A45AlbRef = T010U7_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A46AlbREnt = T010U7_A46AlbREnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         A56AlbRUni = T010U7_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A50AlbRLoc = T010U7_A50AlbRLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         A49AlbRFen = T010U7_A49AlbRFen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         A55AlbRReo = T010U7_A55AlbRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         A53AlbRPieReb = T010U7_A53AlbRPieReb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
         A59AlbRUniReb = T010U7_A59AlbRUniReb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
         A48AlbRFecUlt = T010U7_A48AlbRFecUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         A47AlbREst = T010U7_A47AlbREst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         A1222AlbNumEti = T010U7_A1222AlbNumEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
         A1291AlbRDes = T010U7_A1291AlbRDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         A4606AlbRHEn = T010U7_A4606AlbRHEn[0] ;
         n4606AlbRHEn = T010U7_n4606AlbRHEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A6182AlbrNF = T010U7_A6182AlbrNF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6182AlbrNF", A6182AlbrNF);
         A8835Bod_UltPz = T010U7_A8835Bod_UltPz[0] ;
         n8835Bod_UltPz = T010U7_n8835Bod_UltPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8835Bod_UltPz", A8835Bod_UltPz);
         A252CliCod = T010U7_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A840TrnCod = T010U7_A840TrnCod[0] ;
         n840TrnCod = T010U7_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A970ProceCod = T010U7_A970ProceCod[0] ;
         n970ProceCod = T010U7_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         A1211TipEntCod = T010U7_A1211TipEntCod[0] ;
         n1211TipEntCod = T010U7_n1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load10U7( ) ;
         if ( AnyError == 1 )
         {
            RcdFound7 = (short)(0) ;
            initializeNonKey10U7( ) ;
         }
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound7 = (short)(0) ;
         initializeNonKey10U7( ) ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey10U7( ) ;
      if ( RcdFound7 == 0 )
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
      RcdFound7 = (short)(0) ;
      /* Using cursor T010U20 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( GXutil.strcmp(T010U20_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010U20_A44AlbRecCod[0] == A44AlbRecCod ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( GXutil.strcmp(T010U20_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010U20_A44AlbRecCod[0] == A44AlbRecCod ) )
         {
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void move_previous( )
   {
      RcdFound7 = (short)(0) ;
      /* Using cursor T010U21 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( GXutil.strcmp(T010U21_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010U21_A44AlbRecCod[0] == A44AlbRecCod ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( GXutil.strcmp(T010U21_A396EmprCod[0], A396EmprCod) == 0 ) && ( T010U21_A44AlbRecCod[0] == A44AlbRecCod ) )
         {
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey10U7( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A2147AlbDetKgmD = O2147AlbDetKgmD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
         A2150AlbDetMtrD = O2150AlbDetMtrD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
         A2153AlbDetPieU = O2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert10U7( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound7 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A2147AlbDetKgmD = O2147AlbDetKgmD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
               A2150AlbDetMtrD = O2150AlbDetMtrD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
               A2153AlbDetPieU = O2153AlbDetPieU ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
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
               A2147AlbDetKgmD = O2147AlbDetKgmD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
               A2150AlbDetMtrD = O2150AlbDetMtrD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
               A2153AlbDetPieU = O2153AlbDetPieU ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
               update10U7( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A2147AlbDetKgmD = O2147AlbDetKgmD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
               A2150AlbDetMtrD = O2150AlbDetMtrD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
               A2153AlbDetPieU = O2153AlbDetPieU ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert10U7( ) ;
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
                  A2147AlbDetKgmD = O2147AlbDetKgmD ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
                  A2150AlbDetMtrD = O2150AlbDetMtrD ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
                  A2153AlbDetPieU = O2153AlbDetPieU ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert10U7( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A2147AlbDetKgmD = O2147AlbDetKgmD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
         A2150AlbDetMtrD = O2150AlbDetMtrD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
         A2153AlbDetPieU = O2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
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
      getKey10U7( ) ;
      if ( RcdFound7 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "talmpz2");
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_10U0( ) ;
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
      if ( RcdFound7 == 0 )
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
      scanStart10U7( ) ;
      if ( RcdFound7 == 0 )
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
      scanEnd10U7( ) ;
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
      if ( RcdFound7 == 0 )
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
      if ( RcdFound7 == 0 )
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
      scanStart10U7( ) ;
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound7 != 0 )
         {
            scanNext10U7( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd10U7( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency10U7( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T010U6 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( DecimalUtil.compareTo(Z58AlbRUniEnt, T010U6_A58AlbRUniEnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z60AlbRUniUti, T010U6_A60AlbRUniUti[0]) != 0 ) || ( Z52AlbRPieEnt != T010U6_A52AlbRPieEnt[0] ) || ( Z54AlbRPieUti != T010U6_A54AlbRPieUti[0] ) || ( GXutil.strcmp(Z45AlbRef, T010U6_A45AlbRef[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z46AlbREnt, T010U6_A46AlbREnt[0]) != 0 ) || ( GXutil.strcmp(Z56AlbRUni, T010U6_A56AlbRUni[0]) != 0 ) || ( GXutil.strcmp(Z50AlbRLoc, T010U6_A50AlbRLoc[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z49AlbRFen), GXutil.resetTime(T010U6_A49AlbRFen[0])) ) || ( GXutil.strcmp(Z55AlbRReo, T010U6_A55AlbRReo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z53AlbRPieReb != T010U6_A53AlbRPieReb[0] ) || ( DecimalUtil.compareTo(Z59AlbRUniReb, T010U6_A59AlbRUniReb[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z48AlbRFecUlt), GXutil.resetTime(T010U6_A48AlbRFecUlt[0])) ) || ( Z47AlbREst != T010U6_A47AlbREst[0] ) || ( Z1222AlbNumEti != T010U6_A1222AlbNumEti[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z1291AlbRDes, T010U6_A1291AlbRDes[0]) != 0 ) || !( GXutil.dateCompare(Z4606AlbRHEn, T010U6_A4606AlbRHEn[0]) ) || ( GXutil.strcmp(Z6182AlbrNF, T010U6_A6182AlbrNF[0]) != 0 ) || ( GXutil.strcmp(Z8835Bod_UltPz, T010U6_A8835Bod_UltPz[0]) != 0 ) || ( Z252CliCod != T010U6_A252CliCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z840TrnCod != T010U6_A840TrnCod[0] ) || ( Z970ProceCod != T010U6_A970ProceCod[0] ) || ( Z1211TipEntCod != T010U6_A1211TipEntCod[0] ) )
         {
            if ( DecimalUtil.compareTo(Z58AlbRUniEnt, T010U6_A58AlbRUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRUniEnt");
               GXutil.writeLogRaw("Old: ",Z58AlbRUniEnt);
               GXutil.writeLogRaw("Current: ",T010U6_A58AlbRUniEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z60AlbRUniUti, T010U6_A60AlbRUniUti[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRUniUti");
               GXutil.writeLogRaw("Old: ",Z60AlbRUniUti);
               GXutil.writeLogRaw("Current: ",T010U6_A60AlbRUniUti[0]);
            }
            if ( Z52AlbRPieEnt != T010U6_A52AlbRPieEnt[0] )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRPieEnt");
               GXutil.writeLogRaw("Old: ",Z52AlbRPieEnt);
               GXutil.writeLogRaw("Current: ",T010U6_A52AlbRPieEnt[0]);
            }
            if ( Z54AlbRPieUti != T010U6_A54AlbRPieUti[0] )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRPieUti");
               GXutil.writeLogRaw("Old: ",Z54AlbRPieUti);
               GXutil.writeLogRaw("Current: ",T010U6_A54AlbRPieUti[0]);
            }
            if ( GXutil.strcmp(Z45AlbRef, T010U6_A45AlbRef[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRef");
               GXutil.writeLogRaw("Old: ",Z45AlbRef);
               GXutil.writeLogRaw("Current: ",T010U6_A45AlbRef[0]);
            }
            if ( GXutil.strcmp(Z46AlbREnt, T010U6_A46AlbREnt[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbREnt");
               GXutil.writeLogRaw("Old: ",Z46AlbREnt);
               GXutil.writeLogRaw("Current: ",T010U6_A46AlbREnt[0]);
            }
            if ( GXutil.strcmp(Z56AlbRUni, T010U6_A56AlbRUni[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRUni");
               GXutil.writeLogRaw("Old: ",Z56AlbRUni);
               GXutil.writeLogRaw("Current: ",T010U6_A56AlbRUni[0]);
            }
            if ( GXutil.strcmp(Z50AlbRLoc, T010U6_A50AlbRLoc[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRLoc");
               GXutil.writeLogRaw("Old: ",Z50AlbRLoc);
               GXutil.writeLogRaw("Current: ",T010U6_A50AlbRLoc[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z49AlbRFen), GXutil.resetTime(T010U6_A49AlbRFen[0])) ) )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRFen");
               GXutil.writeLogRaw("Old: ",Z49AlbRFen);
               GXutil.writeLogRaw("Current: ",T010U6_A49AlbRFen[0]);
            }
            if ( GXutil.strcmp(Z55AlbRReo, T010U6_A55AlbRReo[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRReo");
               GXutil.writeLogRaw("Old: ",Z55AlbRReo);
               GXutil.writeLogRaw("Current: ",T010U6_A55AlbRReo[0]);
            }
            if ( Z53AlbRPieReb != T010U6_A53AlbRPieReb[0] )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRPieReb");
               GXutil.writeLogRaw("Old: ",Z53AlbRPieReb);
               GXutil.writeLogRaw("Current: ",T010U6_A53AlbRPieReb[0]);
            }
            if ( DecimalUtil.compareTo(Z59AlbRUniReb, T010U6_A59AlbRUniReb[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRUniReb");
               GXutil.writeLogRaw("Old: ",Z59AlbRUniReb);
               GXutil.writeLogRaw("Current: ",T010U6_A59AlbRUniReb[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z48AlbRFecUlt), GXutil.resetTime(T010U6_A48AlbRFecUlt[0])) ) )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRFecUlt");
               GXutil.writeLogRaw("Old: ",Z48AlbRFecUlt);
               GXutil.writeLogRaw("Current: ",T010U6_A48AlbRFecUlt[0]);
            }
            if ( Z47AlbREst != T010U6_A47AlbREst[0] )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbREst");
               GXutil.writeLogRaw("Old: ",Z47AlbREst);
               GXutil.writeLogRaw("Current: ",T010U6_A47AlbREst[0]);
            }
            if ( Z1222AlbNumEti != T010U6_A1222AlbNumEti[0] )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbNumEti");
               GXutil.writeLogRaw("Old: ",Z1222AlbNumEti);
               GXutil.writeLogRaw("Current: ",T010U6_A1222AlbNumEti[0]);
            }
            if ( GXutil.strcmp(Z1291AlbRDes, T010U6_A1291AlbRDes[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRDes");
               GXutil.writeLogRaw("Old: ",Z1291AlbRDes);
               GXutil.writeLogRaw("Current: ",T010U6_A1291AlbRDes[0]);
            }
            if ( !( GXutil.dateCompare(Z4606AlbRHEn, T010U6_A4606AlbRHEn[0]) ) )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRHEn");
               GXutil.writeLogRaw("Old: ",Z4606AlbRHEn);
               GXutil.writeLogRaw("Current: ",T010U6_A4606AlbRHEn[0]);
            }
            if ( GXutil.strcmp(Z6182AlbrNF, T010U6_A6182AlbrNF[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbrNF");
               GXutil.writeLogRaw("Old: ",Z6182AlbrNF);
               GXutil.writeLogRaw("Current: ",T010U6_A6182AlbrNF[0]);
            }
            if ( GXutil.strcmp(Z8835Bod_UltPz, T010U6_A8835Bod_UltPz[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"Bod_UltPz");
               GXutil.writeLogRaw("Old: ",Z8835Bod_UltPz);
               GXutil.writeLogRaw("Current: ",T010U6_A8835Bod_UltPz[0]);
            }
            if ( Z252CliCod != T010U6_A252CliCod[0] )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T010U6_A252CliCod[0]);
            }
            if ( Z840TrnCod != T010U6_A840TrnCod[0] )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T010U6_A840TrnCod[0]);
            }
            if ( Z970ProceCod != T010U6_A970ProceCod[0] )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"ProceCod");
               GXutil.writeLogRaw("Old: ",Z970ProceCod);
               GXutil.writeLogRaw("Current: ",T010U6_A970ProceCod[0]);
            }
            if ( Z1211TipEntCod != T010U6_A1211TipEntCod[0] )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"TipEntCod");
               GXutil.writeLogRaw("Old: ",Z1211TipEntCod);
               GXutil.writeLogRaw("Current: ",T010U6_A1211TipEntCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert10U7( )
   {
      beforeValidate10U7( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10U7( ) ;
      }
      if ( AnyError == 0 )
      {
         zm10U7( 0) ;
         checkOptimisticConcurrency10U7( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10U7( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert10U7( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010U22 */
                  pr_default.execute(18, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A58AlbRUniEnt, A60AlbRUniUti, Integer.valueOf(A52AlbRPieEnt), Integer.valueOf(A54AlbRPieUti), A45AlbRef, A46AlbREnt, A56AlbRUni, A50AlbRLoc, A49AlbRFen, A55AlbRReo, Integer.valueOf(A53AlbRPieReb), A59AlbRUniReb, A48AlbRFecUlt, Byte.valueOf(A47AlbREst), Short.valueOf(A1222AlbNumEti), A1291AlbRDes, Boolean.valueOf(n4606AlbRHEn), A4606AlbRHEn, A6182AlbrNF, Boolean.valueOf(n8835Bod_UltPz), A8835Bod_UltPz, A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( (pr_default.getStatus(18) == 1) )
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
                        processLevel10U7( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption10U0( ) ;
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
            load10U7( ) ;
         }
         endLevel10U7( ) ;
      }
      closeExtendedTableCursors10U7( ) ;
   }

   public void update10U7( )
   {
      beforeValidate10U7( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10U7( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10U7( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10U7( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate10U7( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010U23 */
                  pr_default.execute(19, new Object[] {A58AlbRUniEnt, A60AlbRUniUti, Integer.valueOf(A52AlbRPieEnt), Integer.valueOf(A54AlbRPieUti), A45AlbRef, A46AlbREnt, A56AlbRUni, A50AlbRLoc, A49AlbRFen, A55AlbRReo, Integer.valueOf(A53AlbRPieReb), A59AlbRUniReb, A48AlbRFecUlt, Byte.valueOf(A47AlbREst), Short.valueOf(A1222AlbNumEti), A1291AlbRDes, Boolean.valueOf(n4606AlbRHEn), A4606AlbRHEn, A6182AlbrNF, Boolean.valueOf(n8835Bod_UltPz), A8835Bod_UltPz, Integer.valueOf(A252CliCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( (pr_default.getStatus(19) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate10U7( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char1[0] = A396EmprCod ;
                     GXv_int2[0] = A44AlbRecCod ;
                     new app.txpalbrecupdateredundancy(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
                     talmpz2_impl.this.A396EmprCod = GXv_char1[0] ;
                     talmpz2_impl.this.A44AlbRecCod = GXv_int2[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel10U7( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption10U0( ) ;
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
         endLevel10U7( ) ;
      }
      closeExtendedTableCursors10U7( ) ;
   }

   public void deferredUpdate10U7( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate10U7( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10U7( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls10U7( ) ;
         afterConfirm10U7( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete10U7( ) ;
            if ( AnyError == 0 )
            {
               A2147AlbDetKgmD = O2147AlbDetKgmD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
               A2150AlbDetMtrD = O2150AlbDetMtrD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
               A2153AlbDetPieU = O2153AlbDetPieU ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
               scanStart10U299( ) ;
               while ( RcdFound299 != 0 )
               {
                  getByPrimaryKey10U299( ) ;
                  delete10U299( ) ;
                  scanNext10U299( ) ;
                  O2147AlbDetKgmD = A2147AlbDetKgmD ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
                  O2150AlbDetMtrD = A2150AlbDetMtrD ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
                  O2153AlbDetPieU = A2153AlbDetPieU ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
               }
               scanEnd10U299( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010U24 */
                  pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound7 == 0 )
                        {
                           initAll10U7( ) ;
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
                        resetCaption10U0( ) ;
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
      sMode7 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel10U7( ) ;
      Gx_mode = sMode7 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls10U7( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T010U25 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T010U25_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(21);
         /* Using cursor T010U26 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T010U26_A841TrnNom[0] ;
         n841TrnNom = T010U26_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         pr_default.close(22);
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
            {
               A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
            }
            else
            {
               A2153AlbDetPieU = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
         }
         if ( A47AlbREst == 1 )
         {
            AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
         }
         else
         {
            if ( A47AlbREst == 0 )
            {
               AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
            }
         }
         /* Using cursor T010U27 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
         A1212TipEntNom = T010U27_A1212TipEntNom[0] ;
         n1212TipEntNom = T010U27_n1212TipEntNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
         pr_default.close(23);
         /* Using cursor T010U28 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         A971ProceNom = T010U28_A971ProceNom[0] ;
         n971ProceNom = T010U28_n971ProceNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         pr_default.close(24);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T010U29 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Entradas Almacen Crudo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T010U30 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T010U31 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T010U32 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPPZS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T010U33 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPTAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T010U34 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPMAT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T010U35 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREPg", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T010U36 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVEM1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T010U37 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBRDF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T010U38 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AlRPieDef", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T010U39 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T010U40 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBROB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T010U41 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T010U42 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVGEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T010U43 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
      }
   }

   public void processNestedLevel10U299( )
   {
      s2147AlbDetKgmD = O2147AlbDetKgmD ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      s2150AlbDetMtrD = O2150AlbDetMtrD ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      s2153AlbDetPieU = O2153AlbDetPieU ;
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      nGXsfl_220_idx = 0 ;
      while ( nGXsfl_220_idx < nRC_GXsfl_220 )
      {
         readRow10U299( ) ;
         if ( ( nRcdExists_299 != 0 ) || ( nIsMod_299 != 0 ) )
         {
            standaloneNotModal10U299( ) ;
            getKey10U299( ) ;
            if ( ( nRcdExists_299 == 0 ) && ( nRcdDeleted_299 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert10U299( ) ;
            }
            else
            {
               if ( RcdFound299 != 0 )
               {
                  if ( ( nRcdDeleted_299 != 0 ) && ( nRcdExists_299 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete10U299( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_299 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update10U299( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_299 == 0 )
                  {
                     GXCCtl = "ALBRECPIE_" + sGXsfl_220_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecPie_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O2147AlbDetKgmD = A2147AlbDetKgmD ;
            httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
            O2150AlbDetMtrD = A2150AlbDetMtrD ;
            httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
            O2153AlbDetPieU = A2153AlbDetPieU ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_299_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecPie_Internalname, GXutil.rtrim( A2159AlbRecPie)) ;
         httpContext.changePostValue( edtAlbRecAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A2154AlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecMtrU_Internalname, GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecKgmU_Internalname, GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecCol_Internalname, GXutil.ltrim( localUtil.ntoc( A3730AlbRecCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecIdPz_Internalname, GXutil.rtrim( A3731AlbRecIdPz)) ;
         httpContext.changePostValue( edtAlbRecIdRc_Internalname, GXutil.ltrim( localUtil.ntoc( A3732AlbRecIdRc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecPal_Internalname, GXutil.ltrim( localUtil.ntoc( A4410AlbRecPal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtALRPIELOC_Internalname, GXutil.rtrim( A7408ALRPIELOC)) ;
         httpContext.changePostValue( edtALRPIETEL_Internalname, GXutil.ltrim( localUtil.ntoc( A7409ALRPIETEL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtALRPIEOPE_Internalname, GXutil.rtrim( A7410ALRPIEOPE)) ;
         httpContext.changePostValue( edtALRPIEST_Internalname, GXutil.rtrim( A7411ALRPIEST)) ;
         httpContext.changePostValue( edtAlbRecFec_Internalname, localUtil.ttoc( A4411AlbRecFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtAlbRecPnt_Internalname, GXutil.ltrim( localUtil.ntoc( A7792AlbRecPnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecCo1_Internalname, GXutil.rtrim( A7793AlbRecCo1)) ;
         httpContext.changePostValue( edtAlbRecCo2_Internalname, GXutil.ltrim( localUtil.ntoc( A7794AlbRecCo2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdr_Internalname, GXutil.ltrim( localUtil.ntoc( A7998AlbHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdrr_Internalname, GXutil.ltrim( localUtil.ntoc( A7999AlbHdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdrp_Internalname, GXutil.rtrim( A8000AlbHdrp)) ;
         httpContext.changePostValue( edtAlbSerT_Internalname, GXutil.rtrim( A8001AlbSerT)) ;
         httpContext.changePostValue( edtAlbColNm_Internalname, GXutil.rtrim( A8002AlbColNm)) ;
         httpContext.changePostValue( edtAlbColNn_Internalname, GXutil.ltrim( localUtil.ntoc( A8003AlbColNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbKgsPf_Internalname, GXutil.ltrim( localUtil.ntoc( A8004AlbKgsPf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbMtsPf_Internalname, GXutil.ltrim( localUtil.ntoc( A8005AlbMtsPf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbAfin_Internalname, GXutil.ltrim( localUtil.ntoc( A8006AlbAfin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbNPed_Internalname, GXutil.rtrim( A8037AlbNPed)) ;
         httpContext.changePostValue( edtAlbObsp_Internalname, A8051AlbObsp) ;
         httpContext.changePostValue( edtBod_Dib_Internalname, GXutil.rtrim( A8679Bod_Dib)) ;
         httpContext.changePostValue( edtBod_Tua_Internalname, GXutil.ltrim( localUtil.ntoc( A8680Bod_Tua, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBod_Tub_Internalname, GXutil.ltrim( localUtil.ntoc( A8681Bod_Tub, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBod_Tuc_Internalname, GXutil.ltrim( localUtil.ntoc( A8682Bod_Tuc, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBod_Hilz_Internalname, GXutil.rtrim( A8683Bod_Hilz)) ;
         httpContext.changePostValue( edtBod_FecE_Internalname, localUtil.format(A8684Bod_FecE, "99/99/99")) ;
         httpContext.changePostValue( edtBod_PedOr_Internalname, GXutil.rtrim( A8685Bod_PedOr)) ;
         httpContext.changePostValue( edtBod_Rack_Internalname, GXutil.rtrim( A8774Bod_Rack)) ;
         httpContext.changePostValue( edtBod_PoS_Internalname, GXutil.rtrim( A8775Bod_PoS)) ;
         httpContext.changePostValue( edtBod_Ok_Internalname, GXutil.rtrim( A8776Bod_Ok)) ;
         httpContext.changePostValue( edtBod_Talla_Internalname, GXutil.rtrim( A8779Bod_Talla)) ;
         httpContext.changePostValue( edtBod_Und_Internalname, GXutil.ltrim( localUtil.ntoc( A8780Bod_Und, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBod_Medt_Internalname, GXutil.rtrim( A8781Bod_Medt)) ;
         httpContext.changePostValue( edtBod_ColNNn_Internalname, GXutil.rtrim( A8831Bod_ColNNn)) ;
         httpContext.changePostValue( edtBod_Por_Internalname, GXutil.ltrim( localUtil.ntoc( A8832Bod_Por, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBod_codb_Internalname, GXutil.rtrim( A8833Bod_codb)) ;
         httpContext.changePostValue( edtBod_Pes_Internalname, GXutil.rtrim( A8834Bod_Pes)) ;
         httpContext.changePostValue( edtBod_DibO_Internalname, GXutil.rtrim( A8848Bod_DibO)) ;
         httpContext.changePostValue( edtBod_item3_Internalname, GXutil.rtrim( A9376Bod_item3)) ;
         httpContext.changePostValue( edtBod_ToE_Internalname, GXutil.rtrim( A9540Bod_ToE)) ;
         httpContext.changePostValue( edtBod_DescP_Internalname, GXutil.rtrim( A9560Bod_DescP)) ;
         httpContext.changePostValue( edtBod_CVar_Internalname, GXutil.rtrim( A9561Bod_CVar)) ;
         httpContext.changePostValue( edtBod_NVar_Internalname, GXutil.rtrim( A9562Bod_NVar)) ;
         httpContext.changePostValue( "ZT_"+"Z2159AlbRecPie_"+sGXsfl_220_idx, GXutil.rtrim( Z2159AlbRecPie)) ;
         httpContext.changePostValue( "ZT_"+"Z4795AlRPieCal_"+sGXsfl_220_idx, GXutil.rtrim( Z4795AlRPieCal)) ;
         httpContext.changePostValue( "ZT_"+"Z4411AlbRecFec_"+sGXsfl_220_idx, localUtil.ttoc( Z4411AlbRecFec, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z2154AlbRecAnh_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z2154AlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2157AlbRecMtr_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2155AlbRecKgm_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2158AlbRecMtrU_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2156AlbRecKgmU_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3730AlbRecCol_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z3730AlbRecCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3731AlbRecIdPz_"+sGXsfl_220_idx, GXutil.rtrim( Z3731AlbRecIdPz)) ;
         httpContext.changePostValue( "ZT_"+"Z3732AlbRecIdRc_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z3732AlbRecIdRc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4410AlbRecPal_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z4410AlbRecPal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7408ALRPIELOC_"+sGXsfl_220_idx, GXutil.rtrim( Z7408ALRPIELOC)) ;
         httpContext.changePostValue( "ZT_"+"Z7409ALRPIETEL_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z7409ALRPIETEL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7410ALRPIEOPE_"+sGXsfl_220_idx, GXutil.rtrim( Z7410ALRPIEOPE)) ;
         httpContext.changePostValue( "ZT_"+"Z7411ALRPIEST_"+sGXsfl_220_idx, GXutil.rtrim( Z7411ALRPIEST)) ;
         httpContext.changePostValue( "ZT_"+"Z7792AlbRecPnt_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z7792AlbRecPnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7793AlbRecCo1_"+sGXsfl_220_idx, GXutil.rtrim( Z7793AlbRecCo1)) ;
         httpContext.changePostValue( "ZT_"+"Z7794AlbRecCo2_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z7794AlbRecCo2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7998AlbHdr_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z7998AlbHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7999AlbHdrr_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z7999AlbHdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8000AlbHdrp_"+sGXsfl_220_idx, GXutil.rtrim( Z8000AlbHdrp)) ;
         httpContext.changePostValue( "ZT_"+"Z8001AlbSerT_"+sGXsfl_220_idx, GXutil.rtrim( Z8001AlbSerT)) ;
         httpContext.changePostValue( "ZT_"+"Z8002AlbColNm_"+sGXsfl_220_idx, GXutil.rtrim( Z8002AlbColNm)) ;
         httpContext.changePostValue( "ZT_"+"Z8003AlbColNn_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z8003AlbColNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8004AlbKgsPf_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z8004AlbKgsPf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8005AlbMtsPf_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z8005AlbMtsPf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8006AlbAfin_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z8006AlbAfin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8037AlbNPed_"+sGXsfl_220_idx, GXutil.rtrim( Z8037AlbNPed)) ;
         httpContext.changePostValue( "ZT_"+"Z8051AlbObsp_"+sGXsfl_220_idx, Z8051AlbObsp) ;
         httpContext.changePostValue( "ZT_"+"Z8679Bod_Dib_"+sGXsfl_220_idx, GXutil.rtrim( Z8679Bod_Dib)) ;
         httpContext.changePostValue( "ZT_"+"Z8680Bod_Tua_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z8680Bod_Tua, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8681Bod_Tub_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z8681Bod_Tub, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8682Bod_Tuc_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z8682Bod_Tuc, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8683Bod_Hilz_"+sGXsfl_220_idx, GXutil.rtrim( Z8683Bod_Hilz)) ;
         httpContext.changePostValue( "ZT_"+"Z8684Bod_FecE_"+sGXsfl_220_idx, localUtil.dtoc( Z8684Bod_FecE, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z8685Bod_PedOr_"+sGXsfl_220_idx, GXutil.rtrim( Z8685Bod_PedOr)) ;
         httpContext.changePostValue( "ZT_"+"Z8774Bod_Rack_"+sGXsfl_220_idx, GXutil.rtrim( Z8774Bod_Rack)) ;
         httpContext.changePostValue( "ZT_"+"Z8775Bod_PoS_"+sGXsfl_220_idx, GXutil.rtrim( Z8775Bod_PoS)) ;
         httpContext.changePostValue( "ZT_"+"Z8776Bod_Ok_"+sGXsfl_220_idx, GXutil.rtrim( Z8776Bod_Ok)) ;
         httpContext.changePostValue( "ZT_"+"Z8779Bod_Talla_"+sGXsfl_220_idx, GXutil.rtrim( Z8779Bod_Talla)) ;
         httpContext.changePostValue( "ZT_"+"Z8780Bod_Und_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z8780Bod_Und, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8781Bod_Medt_"+sGXsfl_220_idx, GXutil.rtrim( Z8781Bod_Medt)) ;
         httpContext.changePostValue( "ZT_"+"Z8831Bod_ColNNn_"+sGXsfl_220_idx, GXutil.rtrim( Z8831Bod_ColNNn)) ;
         httpContext.changePostValue( "ZT_"+"Z8832Bod_Por_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( Z8832Bod_Por, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8833Bod_codb_"+sGXsfl_220_idx, GXutil.rtrim( Z8833Bod_codb)) ;
         httpContext.changePostValue( "ZT_"+"Z8834Bod_Pes_"+sGXsfl_220_idx, GXutil.rtrim( Z8834Bod_Pes)) ;
         httpContext.changePostValue( "ZT_"+"Z8848Bod_DibO_"+sGXsfl_220_idx, GXutil.rtrim( Z8848Bod_DibO)) ;
         httpContext.changePostValue( "ZT_"+"Z9376Bod_item3_"+sGXsfl_220_idx, GXutil.rtrim( Z9376Bod_item3)) ;
         httpContext.changePostValue( "ZT_"+"Z9540Bod_ToE_"+sGXsfl_220_idx, GXutil.rtrim( Z9540Bod_ToE)) ;
         httpContext.changePostValue( "ZT_"+"Z9560Bod_DescP_"+sGXsfl_220_idx, GXutil.rtrim( Z9560Bod_DescP)) ;
         httpContext.changePostValue( "ZT_"+"Z9561Bod_CVar_"+sGXsfl_220_idx, GXutil.rtrim( Z9561Bod_CVar)) ;
         httpContext.changePostValue( "ZT_"+"Z9562Bod_NVar_"+sGXsfl_220_idx, GXutil.rtrim( Z9562Bod_NVar)) ;
         httpContext.changePostValue( "nRcdDeleted_299_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_299_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_299_"+sGXsfl_220_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_299 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_299_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_299_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECPIE_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECANH_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecAnh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECMTR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECKGM_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECMTRU_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtrU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECKGMU_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgmU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECCOL_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECIDPZ_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecIdPz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECIDRC_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecIdRc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECPAL_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRPIELOC_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALRPIELOC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRPIETEL_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALRPIETEL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRPIEOPE_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALRPIEOPE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRPIEST_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALRPIEST_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECFEC_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecFec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECPNT_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECCO1_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCo1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECCO2_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCo2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRP_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBSERT_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbSerT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOLNM_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbColNm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOLNN_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbColNn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBKGSPF_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbKgsPf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBMTSPF_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbMtsPf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBAFIN_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbAfin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBNPED_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbNPed_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBOBSP_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbObsp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_DIB_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Dib_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_TUA_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Tua_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_TUB_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Tub_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_TUC_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Tuc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_HILZ_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Hilz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_FECE_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_FecE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_PEDOR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_PedOr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_RACK_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Rack_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_POS_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_PoS_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_OK_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Ok_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_TALLA_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Talla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_UND_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Und_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_MEDT_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Medt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_COLNNN_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_ColNNn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_POR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Por_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_CODB_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_codb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_PES_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Pes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_DIBO_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_DibO_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_ITEM3_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_item3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_TOE_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_ToE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_DESCP_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_DescP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_CVAR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_CVar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BOD_NVAR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_NVar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T010U45 */
      pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(40) != 101) )
      {
         A2152AlbDetPie = T010U45_A2152AlbDetPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = T010U45_A2149AlbDetMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = T010U45_A2146AlbDetKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = T010U45_A2151AlbDetMtrU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = T010U45_A2148AlbDetKgmU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
      }
      else
      {
         A2152AlbDetPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
      }
      A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2149AlbDetMtr)==0) )
      {
         A58AlbRUniEnt = A2149AlbDetMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2146AlbDetKgm)==0) )
         {
            A58AlbRUniEnt = A2146AlbDetKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2151AlbDetMtrU)==0) )
      {
         A60AlbRUniUti = A2151AlbDetMtrU ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2148AlbDetKgmU)==0) )
         {
            A60AlbRUniUti = A2148AlbDetKgmU ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      if ( ! (0==A2152AlbDetPie) )
      {
         A52AlbRPieEnt = A2152AlbDetPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      }
      /* End of After( level) rules */
      initAll10U299( ) ;
      if ( AnyError != 0 )
      {
         O2147AlbDetKgmD = s2147AlbDetKgmD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
         O2150AlbDetMtrD = s2150AlbDetMtrD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
         O2153AlbDetPieU = s2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      }
      nRcdExists_299 = (short)(0) ;
      nIsMod_299 = (short)(0) ;
      nRcdDeleted_299 = (short)(0) ;
   }

   public void processLevel10U7( )
   {
      /* Save parent mode. */
      sMode7 = Gx_mode ;
      processNestedLevel10U299( ) ;
      if ( AnyError != 0 )
      {
         O2147AlbDetKgmD = s2147AlbDetKgmD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
         O2150AlbDetMtrD = s2150AlbDetMtrD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
         O2153AlbDetPieU = s2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode7 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T010U46 */
      pr_default.execute(41, new Object[] {A58AlbRUniEnt, A60AlbRUniUti, Integer.valueOf(A52AlbRPieEnt), Integer.valueOf(A54AlbRPieUti), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void endLevel10U7( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeComplete10U7( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "talmpz2");
         if ( AnyError == 0 )
         {
            confirmValues10U0( ) ;
         }
         /* After transaction rules */
         if ( true /* After */ )
         {
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A44AlbRecCod ;
            new app.pprueba5(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
            talmpz2_impl.this.A396EmprCod = GXv_char1[0] ;
            talmpz2_impl.this.A44AlbRecCod = GXv_int2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         }
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "talmpz2");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart10U7( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A44AlbRecCod = A44AlbRecCod ;
      /* Scan By routine */
      /* Using cursor T010U47 */
      pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(42) != 101) )
      {
         RcdFound7 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext10U7( )
   {
      /* Scan next routine */
      pr_default.readNext(42);
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(42) != 101) )
      {
         RcdFound7 = (short)(1) ;
      }
   }

   public void scanEnd10U7( )
   {
      pr_default.close(42);
   }

   public void afterConfirm10U7( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert10U7( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate10U7( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete10U7( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete10U7( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate10U7( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes10U7( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtTrnNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Enabled), 5, 0), true);
      edtAlbREnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Enabled), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      cmbAlbRUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      edtAlbRLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
      edtAlbRFen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      cmbAlbRReo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRPieReb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieReb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieReb_Enabled), 5, 0), true);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRUniReb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniReb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniReb_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), true);
      edtAlbRFecUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFecUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFecUlt_Enabled), 5, 0), true);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), true);
      edtTipEntCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
      edtTipEntNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipEntNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntNom_Enabled), 5, 0), true);
      edtAlbNumEti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNumEti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumEti_Enabled), 5, 0), true);
      edtAlbRDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRDes_Enabled), 5, 0), true);
      edtProceCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceCod_Enabled), 5, 0), true);
      edtProceNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceNom_Enabled), 5, 0), true);
      edtAlbDetPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetPie_Enabled), 5, 0), true);
      edtAlbDetMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetMtr_Enabled), 5, 0), true);
      edtAlbDetKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetKgm_Enabled), 5, 0), true);
      edtAlbDetMtrU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetMtrU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetMtrU_Enabled), 5, 0), true);
      edtAlbDetKgmU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetKgmU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetKgmU_Enabled), 5, 0), true);
      edtAlbDetMtrD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetMtrD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetMtrD_Enabled), 5, 0), true);
      edtAlbDetKgmD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetKgmD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetKgmD_Enabled), 5, 0), true);
      edtAlbDetPieU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetPieU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetPieU_Enabled), 5, 0), true);
      edtAlbRHEn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRHEn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRHEn_Enabled), 5, 0), true);
      edtAlbrNF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrNF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrNF_Enabled), 5, 0), true);
      edtBod_UltPz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_UltPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_UltPz_Enabled), 5, 0), true);
   }

   public void zm10U299( int GX_JID )
   {
      if ( ( GX_JID == 37 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4795AlRPieCal = T010U3_A4795AlRPieCal[0] ;
            Z4411AlbRecFec = T010U3_A4411AlbRecFec[0] ;
            Z2154AlbRecAnh = T010U3_A2154AlbRecAnh[0] ;
            Z2157AlbRecMtr = T010U3_A2157AlbRecMtr[0] ;
            Z2155AlbRecKgm = T010U3_A2155AlbRecKgm[0] ;
            Z2158AlbRecMtrU = T010U3_A2158AlbRecMtrU[0] ;
            Z2156AlbRecKgmU = T010U3_A2156AlbRecKgmU[0] ;
            Z3730AlbRecCol = T010U3_A3730AlbRecCol[0] ;
            Z3731AlbRecIdPz = T010U3_A3731AlbRecIdPz[0] ;
            Z3732AlbRecIdRc = T010U3_A3732AlbRecIdRc[0] ;
            Z4410AlbRecPal = T010U3_A4410AlbRecPal[0] ;
            Z7408ALRPIELOC = T010U3_A7408ALRPIELOC[0] ;
            Z7409ALRPIETEL = T010U3_A7409ALRPIETEL[0] ;
            Z7410ALRPIEOPE = T010U3_A7410ALRPIEOPE[0] ;
            Z7411ALRPIEST = T010U3_A7411ALRPIEST[0] ;
            Z7792AlbRecPnt = T010U3_A7792AlbRecPnt[0] ;
            Z7793AlbRecCo1 = T010U3_A7793AlbRecCo1[0] ;
            Z7794AlbRecCo2 = T010U3_A7794AlbRecCo2[0] ;
            Z7998AlbHdr = T010U3_A7998AlbHdr[0] ;
            Z7999AlbHdrr = T010U3_A7999AlbHdrr[0] ;
            Z8000AlbHdrp = T010U3_A8000AlbHdrp[0] ;
            Z8001AlbSerT = T010U3_A8001AlbSerT[0] ;
            Z8002AlbColNm = T010U3_A8002AlbColNm[0] ;
            Z8003AlbColNn = T010U3_A8003AlbColNn[0] ;
            Z8004AlbKgsPf = T010U3_A8004AlbKgsPf[0] ;
            Z8005AlbMtsPf = T010U3_A8005AlbMtsPf[0] ;
            Z8006AlbAfin = T010U3_A8006AlbAfin[0] ;
            Z8037AlbNPed = T010U3_A8037AlbNPed[0] ;
            Z8051AlbObsp = T010U3_A8051AlbObsp[0] ;
            Z8679Bod_Dib = T010U3_A8679Bod_Dib[0] ;
            Z8680Bod_Tua = T010U3_A8680Bod_Tua[0] ;
            Z8681Bod_Tub = T010U3_A8681Bod_Tub[0] ;
            Z8682Bod_Tuc = T010U3_A8682Bod_Tuc[0] ;
            Z8683Bod_Hilz = T010U3_A8683Bod_Hilz[0] ;
            Z8684Bod_FecE = T010U3_A8684Bod_FecE[0] ;
            Z8685Bod_PedOr = T010U3_A8685Bod_PedOr[0] ;
            Z8774Bod_Rack = T010U3_A8774Bod_Rack[0] ;
            Z8775Bod_PoS = T010U3_A8775Bod_PoS[0] ;
            Z8776Bod_Ok = T010U3_A8776Bod_Ok[0] ;
            Z8779Bod_Talla = T010U3_A8779Bod_Talla[0] ;
            Z8780Bod_Und = T010U3_A8780Bod_Und[0] ;
            Z8781Bod_Medt = T010U3_A8781Bod_Medt[0] ;
            Z8831Bod_ColNNn = T010U3_A8831Bod_ColNNn[0] ;
            Z8832Bod_Por = T010U3_A8832Bod_Por[0] ;
            Z8833Bod_codb = T010U3_A8833Bod_codb[0] ;
            Z8834Bod_Pes = T010U3_A8834Bod_Pes[0] ;
            Z8848Bod_DibO = T010U3_A8848Bod_DibO[0] ;
            Z9376Bod_item3 = T010U3_A9376Bod_item3[0] ;
            Z9540Bod_ToE = T010U3_A9540Bod_ToE[0] ;
            Z9560Bod_DescP = T010U3_A9560Bod_DescP[0] ;
            Z9561Bod_CVar = T010U3_A9561Bod_CVar[0] ;
            Z9562Bod_NVar = T010U3_A9562Bod_NVar[0] ;
         }
         else
         {
            Z4795AlRPieCal = A4795AlRPieCal ;
            Z4411AlbRecFec = A4411AlbRecFec ;
            Z2154AlbRecAnh = A2154AlbRecAnh ;
            Z2157AlbRecMtr = A2157AlbRecMtr ;
            Z2155AlbRecKgm = A2155AlbRecKgm ;
            Z2158AlbRecMtrU = A2158AlbRecMtrU ;
            Z2156AlbRecKgmU = A2156AlbRecKgmU ;
            Z3730AlbRecCol = A3730AlbRecCol ;
            Z3731AlbRecIdPz = A3731AlbRecIdPz ;
            Z3732AlbRecIdRc = A3732AlbRecIdRc ;
            Z4410AlbRecPal = A4410AlbRecPal ;
            Z7408ALRPIELOC = A7408ALRPIELOC ;
            Z7409ALRPIETEL = A7409ALRPIETEL ;
            Z7410ALRPIEOPE = A7410ALRPIEOPE ;
            Z7411ALRPIEST = A7411ALRPIEST ;
            Z7792AlbRecPnt = A7792AlbRecPnt ;
            Z7793AlbRecCo1 = A7793AlbRecCo1 ;
            Z7794AlbRecCo2 = A7794AlbRecCo2 ;
            Z7998AlbHdr = A7998AlbHdr ;
            Z7999AlbHdrr = A7999AlbHdrr ;
            Z8000AlbHdrp = A8000AlbHdrp ;
            Z8001AlbSerT = A8001AlbSerT ;
            Z8002AlbColNm = A8002AlbColNm ;
            Z8003AlbColNn = A8003AlbColNn ;
            Z8004AlbKgsPf = A8004AlbKgsPf ;
            Z8005AlbMtsPf = A8005AlbMtsPf ;
            Z8006AlbAfin = A8006AlbAfin ;
            Z8037AlbNPed = A8037AlbNPed ;
            Z8051AlbObsp = A8051AlbObsp ;
            Z8679Bod_Dib = A8679Bod_Dib ;
            Z8680Bod_Tua = A8680Bod_Tua ;
            Z8681Bod_Tub = A8681Bod_Tub ;
            Z8682Bod_Tuc = A8682Bod_Tuc ;
            Z8683Bod_Hilz = A8683Bod_Hilz ;
            Z8684Bod_FecE = A8684Bod_FecE ;
            Z8685Bod_PedOr = A8685Bod_PedOr ;
            Z8774Bod_Rack = A8774Bod_Rack ;
            Z8775Bod_PoS = A8775Bod_PoS ;
            Z8776Bod_Ok = A8776Bod_Ok ;
            Z8779Bod_Talla = A8779Bod_Talla ;
            Z8780Bod_Und = A8780Bod_Und ;
            Z8781Bod_Medt = A8781Bod_Medt ;
            Z8831Bod_ColNNn = A8831Bod_ColNNn ;
            Z8832Bod_Por = A8832Bod_Por ;
            Z8833Bod_codb = A8833Bod_codb ;
            Z8834Bod_Pes = A8834Bod_Pes ;
            Z8848Bod_DibO = A8848Bod_DibO ;
            Z9376Bod_item3 = A9376Bod_item3 ;
            Z9540Bod_ToE = A9540Bod_ToE ;
            Z9560Bod_DescP = A9560Bod_DescP ;
            Z9561Bod_CVar = A9561Bod_CVar ;
            Z9562Bod_NVar = A9562Bod_NVar ;
         }
      }
      if ( GX_JID == -37 )
      {
         Z4795AlRPieCal = A4795AlRPieCal ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         Z4411AlbRecFec = A4411AlbRecFec ;
         Z2154AlbRecAnh = A2154AlbRecAnh ;
         Z2157AlbRecMtr = A2157AlbRecMtr ;
         Z2155AlbRecKgm = A2155AlbRecKgm ;
         Z2158AlbRecMtrU = A2158AlbRecMtrU ;
         Z2156AlbRecKgmU = A2156AlbRecKgmU ;
         Z3730AlbRecCol = A3730AlbRecCol ;
         Z3731AlbRecIdPz = A3731AlbRecIdPz ;
         Z3732AlbRecIdRc = A3732AlbRecIdRc ;
         Z4410AlbRecPal = A4410AlbRecPal ;
         Z7408ALRPIELOC = A7408ALRPIELOC ;
         Z7409ALRPIETEL = A7409ALRPIETEL ;
         Z7410ALRPIEOPE = A7410ALRPIEOPE ;
         Z7411ALRPIEST = A7411ALRPIEST ;
         Z7792AlbRecPnt = A7792AlbRecPnt ;
         Z7793AlbRecCo1 = A7793AlbRecCo1 ;
         Z7794AlbRecCo2 = A7794AlbRecCo2 ;
         Z7998AlbHdr = A7998AlbHdr ;
         Z7999AlbHdrr = A7999AlbHdrr ;
         Z8000AlbHdrp = A8000AlbHdrp ;
         Z8001AlbSerT = A8001AlbSerT ;
         Z8002AlbColNm = A8002AlbColNm ;
         Z8003AlbColNn = A8003AlbColNn ;
         Z8004AlbKgsPf = A8004AlbKgsPf ;
         Z8005AlbMtsPf = A8005AlbMtsPf ;
         Z8006AlbAfin = A8006AlbAfin ;
         Z8037AlbNPed = A8037AlbNPed ;
         Z8051AlbObsp = A8051AlbObsp ;
         Z8679Bod_Dib = A8679Bod_Dib ;
         Z8680Bod_Tua = A8680Bod_Tua ;
         Z8681Bod_Tub = A8681Bod_Tub ;
         Z8682Bod_Tuc = A8682Bod_Tuc ;
         Z8683Bod_Hilz = A8683Bod_Hilz ;
         Z8684Bod_FecE = A8684Bod_FecE ;
         Z8685Bod_PedOr = A8685Bod_PedOr ;
         Z8774Bod_Rack = A8774Bod_Rack ;
         Z8775Bod_PoS = A8775Bod_PoS ;
         Z8776Bod_Ok = A8776Bod_Ok ;
         Z8779Bod_Talla = A8779Bod_Talla ;
         Z8780Bod_Und = A8780Bod_Und ;
         Z8781Bod_Medt = A8781Bod_Medt ;
         Z8831Bod_ColNNn = A8831Bod_ColNNn ;
         Z8832Bod_Por = A8832Bod_Por ;
         Z8833Bod_codb = A8833Bod_codb ;
         Z8834Bod_Pes = A8834Bod_Pes ;
         Z8848Bod_DibO = A8848Bod_DibO ;
         Z9376Bod_item3 = A9376Bod_item3 ;
         Z9540Bod_ToE = A9540Bod_ToE ;
         Z9560Bod_DescP = A9560Bod_DescP ;
         Z9561Bod_CVar = A9561Bod_CVar ;
         Z9562Bod_NVar = A9562Bod_NVar ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal10U299( )
   {
      A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      if ( ! (0==A2152AlbDetPie) )
      {
         A52AlbRPieEnt = A2152AlbDetPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      }
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
      {
         A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            A2153AlbDetPieU = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
      }
      O2153AlbDetPieU = A2153AlbDetPieU ;
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      if ( ! (0==A2153AlbDetPieU) )
      {
         A54AlbRPieUti = A2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2149AlbDetMtr)==0) )
      {
         A58AlbRUniEnt = A2149AlbDetMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2146AlbDetKgm)==0) )
         {
            A58AlbRUniEnt = A2146AlbDetKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2151AlbDetMtrU)==0) )
      {
         A60AlbRUniUti = A2151AlbDetMtrU ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2148AlbDetKgmU)==0) )
         {
            A60AlbRUniUti = A2148AlbDetKgmU ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
   }

   public void standaloneModal10U299( )
   {
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A4411AlbRecFec) && ( Gx_BScreen == 0 ) )
      {
         A4411AlbRecFec = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n4411AlbRecFec = false ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbRecPie_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      }
      else
      {
         edtAlbRecPie_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      }
   }

   public void load10U299( )
   {
      /* Using cursor T010U48 */
      pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(43) != 101) )
      {
         RcdFound299 = (short)(1) ;
         A4795AlRPieCal = T010U48_A4795AlRPieCal[0] ;
         A4411AlbRecFec = T010U48_A4411AlbRecFec[0] ;
         n4411AlbRecFec = T010U48_n4411AlbRecFec[0] ;
         A2154AlbRecAnh = T010U48_A2154AlbRecAnh[0] ;
         A2157AlbRecMtr = T010U48_A2157AlbRecMtr[0] ;
         A2155AlbRecKgm = T010U48_A2155AlbRecKgm[0] ;
         A2158AlbRecMtrU = T010U48_A2158AlbRecMtrU[0] ;
         A2156AlbRecKgmU = T010U48_A2156AlbRecKgmU[0] ;
         A3730AlbRecCol = T010U48_A3730AlbRecCol[0] ;
         A3731AlbRecIdPz = T010U48_A3731AlbRecIdPz[0] ;
         A3732AlbRecIdRc = T010U48_A3732AlbRecIdRc[0] ;
         A4410AlbRecPal = T010U48_A4410AlbRecPal[0] ;
         A7408ALRPIELOC = T010U48_A7408ALRPIELOC[0] ;
         A7409ALRPIETEL = T010U48_A7409ALRPIETEL[0] ;
         n7409ALRPIETEL = T010U48_n7409ALRPIETEL[0] ;
         A7410ALRPIEOPE = T010U48_A7410ALRPIEOPE[0] ;
         n7410ALRPIEOPE = T010U48_n7410ALRPIEOPE[0] ;
         A7411ALRPIEST = T010U48_A7411ALRPIEST[0] ;
         n7411ALRPIEST = T010U48_n7411ALRPIEST[0] ;
         A7792AlbRecPnt = T010U48_A7792AlbRecPnt[0] ;
         n7792AlbRecPnt = T010U48_n7792AlbRecPnt[0] ;
         A7793AlbRecCo1 = T010U48_A7793AlbRecCo1[0] ;
         n7793AlbRecCo1 = T010U48_n7793AlbRecCo1[0] ;
         A7794AlbRecCo2 = T010U48_A7794AlbRecCo2[0] ;
         n7794AlbRecCo2 = T010U48_n7794AlbRecCo2[0] ;
         A7998AlbHdr = T010U48_A7998AlbHdr[0] ;
         n7998AlbHdr = T010U48_n7998AlbHdr[0] ;
         A7999AlbHdrr = T010U48_A7999AlbHdrr[0] ;
         n7999AlbHdrr = T010U48_n7999AlbHdrr[0] ;
         A8000AlbHdrp = T010U48_A8000AlbHdrp[0] ;
         n8000AlbHdrp = T010U48_n8000AlbHdrp[0] ;
         A8001AlbSerT = T010U48_A8001AlbSerT[0] ;
         n8001AlbSerT = T010U48_n8001AlbSerT[0] ;
         A8002AlbColNm = T010U48_A8002AlbColNm[0] ;
         n8002AlbColNm = T010U48_n8002AlbColNm[0] ;
         A8003AlbColNn = T010U48_A8003AlbColNn[0] ;
         n8003AlbColNn = T010U48_n8003AlbColNn[0] ;
         A8004AlbKgsPf = T010U48_A8004AlbKgsPf[0] ;
         n8004AlbKgsPf = T010U48_n8004AlbKgsPf[0] ;
         A8005AlbMtsPf = T010U48_A8005AlbMtsPf[0] ;
         n8005AlbMtsPf = T010U48_n8005AlbMtsPf[0] ;
         A8006AlbAfin = T010U48_A8006AlbAfin[0] ;
         n8006AlbAfin = T010U48_n8006AlbAfin[0] ;
         A8037AlbNPed = T010U48_A8037AlbNPed[0] ;
         n8037AlbNPed = T010U48_n8037AlbNPed[0] ;
         A8051AlbObsp = T010U48_A8051AlbObsp[0] ;
         n8051AlbObsp = T010U48_n8051AlbObsp[0] ;
         A8679Bod_Dib = T010U48_A8679Bod_Dib[0] ;
         n8679Bod_Dib = T010U48_n8679Bod_Dib[0] ;
         A8680Bod_Tua = T010U48_A8680Bod_Tua[0] ;
         n8680Bod_Tua = T010U48_n8680Bod_Tua[0] ;
         A8681Bod_Tub = T010U48_A8681Bod_Tub[0] ;
         n8681Bod_Tub = T010U48_n8681Bod_Tub[0] ;
         A8682Bod_Tuc = T010U48_A8682Bod_Tuc[0] ;
         n8682Bod_Tuc = T010U48_n8682Bod_Tuc[0] ;
         A8683Bod_Hilz = T010U48_A8683Bod_Hilz[0] ;
         n8683Bod_Hilz = T010U48_n8683Bod_Hilz[0] ;
         A8684Bod_FecE = T010U48_A8684Bod_FecE[0] ;
         n8684Bod_FecE = T010U48_n8684Bod_FecE[0] ;
         A8685Bod_PedOr = T010U48_A8685Bod_PedOr[0] ;
         n8685Bod_PedOr = T010U48_n8685Bod_PedOr[0] ;
         A8774Bod_Rack = T010U48_A8774Bod_Rack[0] ;
         n8774Bod_Rack = T010U48_n8774Bod_Rack[0] ;
         A8775Bod_PoS = T010U48_A8775Bod_PoS[0] ;
         n8775Bod_PoS = T010U48_n8775Bod_PoS[0] ;
         A8776Bod_Ok = T010U48_A8776Bod_Ok[0] ;
         n8776Bod_Ok = T010U48_n8776Bod_Ok[0] ;
         A8779Bod_Talla = T010U48_A8779Bod_Talla[0] ;
         A8780Bod_Und = T010U48_A8780Bod_Und[0] ;
         A8781Bod_Medt = T010U48_A8781Bod_Medt[0] ;
         n8781Bod_Medt = T010U48_n8781Bod_Medt[0] ;
         A8831Bod_ColNNn = T010U48_A8831Bod_ColNNn[0] ;
         n8831Bod_ColNNn = T010U48_n8831Bod_ColNNn[0] ;
         A8832Bod_Por = T010U48_A8832Bod_Por[0] ;
         n8832Bod_Por = T010U48_n8832Bod_Por[0] ;
         A8833Bod_codb = T010U48_A8833Bod_codb[0] ;
         n8833Bod_codb = T010U48_n8833Bod_codb[0] ;
         A8834Bod_Pes = T010U48_A8834Bod_Pes[0] ;
         n8834Bod_Pes = T010U48_n8834Bod_Pes[0] ;
         A8848Bod_DibO = T010U48_A8848Bod_DibO[0] ;
         n8848Bod_DibO = T010U48_n8848Bod_DibO[0] ;
         A9376Bod_item3 = T010U48_A9376Bod_item3[0] ;
         n9376Bod_item3 = T010U48_n9376Bod_item3[0] ;
         A9540Bod_ToE = T010U48_A9540Bod_ToE[0] ;
         n9540Bod_ToE = T010U48_n9540Bod_ToE[0] ;
         A9560Bod_DescP = T010U48_A9560Bod_DescP[0] ;
         n9560Bod_DescP = T010U48_n9560Bod_DescP[0] ;
         A9561Bod_CVar = T010U48_A9561Bod_CVar[0] ;
         n9561Bod_CVar = T010U48_n9561Bod_CVar[0] ;
         A9562Bod_NVar = T010U48_A9562Bod_NVar[0] ;
         n9562Bod_NVar = T010U48_n9562Bod_NVar[0] ;
         zm10U299( -37) ;
      }
      pr_default.close(43);
      onLoadActions10U299( ) ;
   }

   public void onLoadActions10U299( )
   {
      GXt_char3 = A4795AlRPieCal ;
      GXv_char1[0] = A396EmprCod ;
      GXv_int2[0] = A44AlbRecCod ;
      GXv_char4[0] = A2159AlbRecPie ;
      GXv_char5[0] = GXt_char3 ;
      new app.ppiecalact(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char4, GXv_char5) ;
      talmpz2_impl.this.A396EmprCod = GXv_char1[0] ;
      talmpz2_impl.this.A44AlbRecCod = GXv_int2[0] ;
      talmpz2_impl.this.A2159AlbRecPie = GXv_char4[0] ;
      talmpz2_impl.this.GXt_char3 = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      A4795AlRPieCal = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", A4795AlRPieCal);
      if ( true /* Level */ )
      {
         GXt_char3 = AV54PieUti ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int2[0] = A44AlbRecCod ;
         GXv_char4[0] = A2159AlbRecPie ;
         GXv_char1[0] = GXt_char3 ;
         new app.palrpieuti(remoteHandle, context).execute( GXv_char5, GXv_int2, GXv_char4, GXv_char1) ;
         talmpz2_impl.this.A396EmprCod = GXv_char5[0] ;
         talmpz2_impl.this.A44AlbRecCod = GXv_int2[0] ;
         talmpz2_impl.this.A2159AlbRecPie = GXv_char4[0] ;
         talmpz2_impl.this.GXt_char3 = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         AV54PieUti = GXt_char3 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54PieUti", AV54PieUti);
      }
   }

   public void checkExtendedTable10U299( )
   {
      nIsDirty_299 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal10U299( ) ;
      nIsDirty_299 = (short)(1) ;
      GXt_char3 = A4795AlRPieCal ;
      GXv_char5[0] = A396EmprCod ;
      GXv_int2[0] = A44AlbRecCod ;
      GXv_char4[0] = A2159AlbRecPie ;
      GXv_char1[0] = GXt_char3 ;
      new app.ppiecalact(remoteHandle, context).execute( GXv_char5, GXv_int2, GXv_char4, GXv_char1) ;
      talmpz2_impl.this.A396EmprCod = GXv_char5[0] ;
      talmpz2_impl.this.A44AlbRecCod = GXv_int2[0] ;
      talmpz2_impl.this.A2159AlbRecPie = GXv_char4[0] ;
      talmpz2_impl.this.GXt_char3 = GXv_char1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      A4795AlRPieCal = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", A4795AlRPieCal);
      if ( true /* Level */ )
      {
         GXt_char3 = AV54PieUti ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int2[0] = A44AlbRecCod ;
         GXv_char4[0] = A2159AlbRecPie ;
         GXv_char1[0] = GXt_char3 ;
         new app.palrpieuti(remoteHandle, context).execute( GXv_char5, GXv_int2, GXv_char4, GXv_char1) ;
         talmpz2_impl.this.A396EmprCod = GXv_char5[0] ;
         talmpz2_impl.this.A44AlbRecCod = GXv_int2[0] ;
         talmpz2_impl.this.A2159AlbRecPie = GXv_char4[0] ;
         talmpz2_impl.this.GXt_char3 = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         AV54PieUti = GXt_char3 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54PieUti", AV54PieUti);
      }
      if ( DecimalUtil.compareTo(A2158AlbRecMtrU, A2157AlbRecMtr) > 0 )
      {
         GXCCtl = "ALBRECMTR_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Metros Insuficientes", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecMtr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( DecimalUtil.compareTo(A2156AlbRecKgmU, A2155AlbRecKgm) > 0 )
      {
         GXCCtl = "ALBRECKGM_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Kilos Insuficientes", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecKgm_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors10U299( )
   {
   }

   public void enableDisable10U299( )
   {
   }

   public void getKey10U299( )
   {
      /* Using cursor T010U49 */
      pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(44) != 101) )
      {
         RcdFound299 = (short)(1) ;
      }
      else
      {
         RcdFound299 = (short)(0) ;
      }
      pr_default.close(44);
   }

   public void getByPrimaryKey10U299( )
   {
      /* Using cursor T010U3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(1) != 101) && ( T010U3_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T010U3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm10U299( 37) ;
         RcdFound299 = (short)(1) ;
         initializeNonKey10U299( ) ;
         A4795AlRPieCal = T010U3_A4795AlRPieCal[0] ;
         A2159AlbRecPie = T010U3_A2159AlbRecPie[0] ;
         A4411AlbRecFec = T010U3_A4411AlbRecFec[0] ;
         n4411AlbRecFec = T010U3_n4411AlbRecFec[0] ;
         A2154AlbRecAnh = T010U3_A2154AlbRecAnh[0] ;
         A2157AlbRecMtr = T010U3_A2157AlbRecMtr[0] ;
         A2155AlbRecKgm = T010U3_A2155AlbRecKgm[0] ;
         A2158AlbRecMtrU = T010U3_A2158AlbRecMtrU[0] ;
         A2156AlbRecKgmU = T010U3_A2156AlbRecKgmU[0] ;
         A3730AlbRecCol = T010U3_A3730AlbRecCol[0] ;
         A3731AlbRecIdPz = T010U3_A3731AlbRecIdPz[0] ;
         A3732AlbRecIdRc = T010U3_A3732AlbRecIdRc[0] ;
         A4410AlbRecPal = T010U3_A4410AlbRecPal[0] ;
         A7408ALRPIELOC = T010U3_A7408ALRPIELOC[0] ;
         A7409ALRPIETEL = T010U3_A7409ALRPIETEL[0] ;
         n7409ALRPIETEL = T010U3_n7409ALRPIETEL[0] ;
         A7410ALRPIEOPE = T010U3_A7410ALRPIEOPE[0] ;
         n7410ALRPIEOPE = T010U3_n7410ALRPIEOPE[0] ;
         A7411ALRPIEST = T010U3_A7411ALRPIEST[0] ;
         n7411ALRPIEST = T010U3_n7411ALRPIEST[0] ;
         A7792AlbRecPnt = T010U3_A7792AlbRecPnt[0] ;
         n7792AlbRecPnt = T010U3_n7792AlbRecPnt[0] ;
         A7793AlbRecCo1 = T010U3_A7793AlbRecCo1[0] ;
         n7793AlbRecCo1 = T010U3_n7793AlbRecCo1[0] ;
         A7794AlbRecCo2 = T010U3_A7794AlbRecCo2[0] ;
         n7794AlbRecCo2 = T010U3_n7794AlbRecCo2[0] ;
         A7998AlbHdr = T010U3_A7998AlbHdr[0] ;
         n7998AlbHdr = T010U3_n7998AlbHdr[0] ;
         A7999AlbHdrr = T010U3_A7999AlbHdrr[0] ;
         n7999AlbHdrr = T010U3_n7999AlbHdrr[0] ;
         A8000AlbHdrp = T010U3_A8000AlbHdrp[0] ;
         n8000AlbHdrp = T010U3_n8000AlbHdrp[0] ;
         A8001AlbSerT = T010U3_A8001AlbSerT[0] ;
         n8001AlbSerT = T010U3_n8001AlbSerT[0] ;
         A8002AlbColNm = T010U3_A8002AlbColNm[0] ;
         n8002AlbColNm = T010U3_n8002AlbColNm[0] ;
         A8003AlbColNn = T010U3_A8003AlbColNn[0] ;
         n8003AlbColNn = T010U3_n8003AlbColNn[0] ;
         A8004AlbKgsPf = T010U3_A8004AlbKgsPf[0] ;
         n8004AlbKgsPf = T010U3_n8004AlbKgsPf[0] ;
         A8005AlbMtsPf = T010U3_A8005AlbMtsPf[0] ;
         n8005AlbMtsPf = T010U3_n8005AlbMtsPf[0] ;
         A8006AlbAfin = T010U3_A8006AlbAfin[0] ;
         n8006AlbAfin = T010U3_n8006AlbAfin[0] ;
         A8037AlbNPed = T010U3_A8037AlbNPed[0] ;
         n8037AlbNPed = T010U3_n8037AlbNPed[0] ;
         A8051AlbObsp = T010U3_A8051AlbObsp[0] ;
         n8051AlbObsp = T010U3_n8051AlbObsp[0] ;
         A8679Bod_Dib = T010U3_A8679Bod_Dib[0] ;
         n8679Bod_Dib = T010U3_n8679Bod_Dib[0] ;
         A8680Bod_Tua = T010U3_A8680Bod_Tua[0] ;
         n8680Bod_Tua = T010U3_n8680Bod_Tua[0] ;
         A8681Bod_Tub = T010U3_A8681Bod_Tub[0] ;
         n8681Bod_Tub = T010U3_n8681Bod_Tub[0] ;
         A8682Bod_Tuc = T010U3_A8682Bod_Tuc[0] ;
         n8682Bod_Tuc = T010U3_n8682Bod_Tuc[0] ;
         A8683Bod_Hilz = T010U3_A8683Bod_Hilz[0] ;
         n8683Bod_Hilz = T010U3_n8683Bod_Hilz[0] ;
         A8684Bod_FecE = T010U3_A8684Bod_FecE[0] ;
         n8684Bod_FecE = T010U3_n8684Bod_FecE[0] ;
         A8685Bod_PedOr = T010U3_A8685Bod_PedOr[0] ;
         n8685Bod_PedOr = T010U3_n8685Bod_PedOr[0] ;
         A8774Bod_Rack = T010U3_A8774Bod_Rack[0] ;
         n8774Bod_Rack = T010U3_n8774Bod_Rack[0] ;
         A8775Bod_PoS = T010U3_A8775Bod_PoS[0] ;
         n8775Bod_PoS = T010U3_n8775Bod_PoS[0] ;
         A8776Bod_Ok = T010U3_A8776Bod_Ok[0] ;
         n8776Bod_Ok = T010U3_n8776Bod_Ok[0] ;
         A8779Bod_Talla = T010U3_A8779Bod_Talla[0] ;
         A8780Bod_Und = T010U3_A8780Bod_Und[0] ;
         A8781Bod_Medt = T010U3_A8781Bod_Medt[0] ;
         n8781Bod_Medt = T010U3_n8781Bod_Medt[0] ;
         A8831Bod_ColNNn = T010U3_A8831Bod_ColNNn[0] ;
         n8831Bod_ColNNn = T010U3_n8831Bod_ColNNn[0] ;
         A8832Bod_Por = T010U3_A8832Bod_Por[0] ;
         n8832Bod_Por = T010U3_n8832Bod_Por[0] ;
         A8833Bod_codb = T010U3_A8833Bod_codb[0] ;
         n8833Bod_codb = T010U3_n8833Bod_codb[0] ;
         A8834Bod_Pes = T010U3_A8834Bod_Pes[0] ;
         n8834Bod_Pes = T010U3_n8834Bod_Pes[0] ;
         A8848Bod_DibO = T010U3_A8848Bod_DibO[0] ;
         n8848Bod_DibO = T010U3_n8848Bod_DibO[0] ;
         A9376Bod_item3 = T010U3_A9376Bod_item3[0] ;
         n9376Bod_item3 = T010U3_n9376Bod_item3[0] ;
         A9540Bod_ToE = T010U3_A9540Bod_ToE[0] ;
         n9540Bod_ToE = T010U3_n9540Bod_ToE[0] ;
         A9560Bod_DescP = T010U3_A9560Bod_DescP[0] ;
         n9560Bod_DescP = T010U3_n9560Bod_DescP[0] ;
         A9561Bod_CVar = T010U3_A9561Bod_CVar[0] ;
         n9561Bod_CVar = T010U3_n9561Bod_CVar[0] ;
         A9562Bod_NVar = T010U3_A9562Bod_NVar[0] ;
         n9562Bod_NVar = T010U3_n9562Bod_NVar[0] ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         sMode299 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10U299( ) ;
         load10U299( ) ;
         Gx_mode = sMode299 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound299 = (short)(0) ;
         initializeNonKey10U299( ) ;
         sMode299 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal10U299( ) ;
         Gx_mode = sMode299 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes10U299( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency10U299( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T010U2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBDET"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4795AlRPieCal, T010U2_A4795AlRPieCal[0]) != 0 ) || !( GXutil.dateCompare(Z4411AlbRecFec, T010U2_A4411AlbRecFec[0]) ) || ( Z2154AlbRecAnh != T010U2_A2154AlbRecAnh[0] ) || ( DecimalUtil.compareTo(Z2157AlbRecMtr, T010U2_A2157AlbRecMtr[0]) != 0 ) || ( DecimalUtil.compareTo(Z2155AlbRecKgm, T010U2_A2155AlbRecKgm[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z2158AlbRecMtrU, T010U2_A2158AlbRecMtrU[0]) != 0 ) || ( DecimalUtil.compareTo(Z2156AlbRecKgmU, T010U2_A2156AlbRecKgmU[0]) != 0 ) || ( Z3730AlbRecCol != T010U2_A3730AlbRecCol[0] ) || ( GXutil.strcmp(Z3731AlbRecIdPz, T010U2_A3731AlbRecIdPz[0]) != 0 ) || ( Z3732AlbRecIdRc != T010U2_A3732AlbRecIdRc[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z4410AlbRecPal, T010U2_A4410AlbRecPal[0]) != 0 ) || ( GXutil.strcmp(Z7408ALRPIELOC, T010U2_A7408ALRPIELOC[0]) != 0 ) || ( Z7409ALRPIETEL != T010U2_A7409ALRPIETEL[0] ) || ( GXutil.strcmp(Z7410ALRPIEOPE, T010U2_A7410ALRPIEOPE[0]) != 0 ) || ( GXutil.strcmp(Z7411ALRPIEST, T010U2_A7411ALRPIEST[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z7792AlbRecPnt != T010U2_A7792AlbRecPnt[0] ) || ( GXutil.strcmp(Z7793AlbRecCo1, T010U2_A7793AlbRecCo1[0]) != 0 ) || ( Z7794AlbRecCo2 != T010U2_A7794AlbRecCo2[0] ) || ( Z7998AlbHdr != T010U2_A7998AlbHdr[0] ) || ( Z7999AlbHdrr != T010U2_A7999AlbHdrr[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8000AlbHdrp, T010U2_A8000AlbHdrp[0]) != 0 ) || ( GXutil.strcmp(Z8001AlbSerT, T010U2_A8001AlbSerT[0]) != 0 ) || ( GXutil.strcmp(Z8002AlbColNm, T010U2_A8002AlbColNm[0]) != 0 ) || ( Z8003AlbColNn != T010U2_A8003AlbColNn[0] ) || ( DecimalUtil.compareTo(Z8004AlbKgsPf, T010U2_A8004AlbKgsPf[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z8005AlbMtsPf, T010U2_A8005AlbMtsPf[0]) != 0 ) || ( Z8006AlbAfin != T010U2_A8006AlbAfin[0] ) || ( GXutil.strcmp(Z8037AlbNPed, T010U2_A8037AlbNPed[0]) != 0 ) || ( GXutil.strcmp(Z8051AlbObsp, T010U2_A8051AlbObsp[0]) != 0 ) || ( GXutil.strcmp(Z8679Bod_Dib, T010U2_A8679Bod_Dib[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z8680Bod_Tua != T010U2_A8680Bod_Tua[0] ) || ( Z8681Bod_Tub != T010U2_A8681Bod_Tub[0] ) || ( Z8682Bod_Tuc != T010U2_A8682Bod_Tuc[0] ) || ( GXutil.strcmp(Z8683Bod_Hilz, T010U2_A8683Bod_Hilz[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z8684Bod_FecE), GXutil.resetTime(T010U2_A8684Bod_FecE[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8685Bod_PedOr, T010U2_A8685Bod_PedOr[0]) != 0 ) || ( GXutil.strcmp(Z8774Bod_Rack, T010U2_A8774Bod_Rack[0]) != 0 ) || ( GXutil.strcmp(Z8775Bod_PoS, T010U2_A8775Bod_PoS[0]) != 0 ) || ( GXutil.strcmp(Z8776Bod_Ok, T010U2_A8776Bod_Ok[0]) != 0 ) || ( GXutil.strcmp(Z8779Bod_Talla, T010U2_A8779Bod_Talla[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z8780Bod_Und != T010U2_A8780Bod_Und[0] ) || ( GXutil.strcmp(Z8781Bod_Medt, T010U2_A8781Bod_Medt[0]) != 0 ) || ( GXutil.strcmp(Z8831Bod_ColNNn, T010U2_A8831Bod_ColNNn[0]) != 0 ) || ( DecimalUtil.compareTo(Z8832Bod_Por, T010U2_A8832Bod_Por[0]) != 0 ) || ( GXutil.strcmp(Z8833Bod_codb, T010U2_A8833Bod_codb[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8834Bod_Pes, T010U2_A8834Bod_Pes[0]) != 0 ) || ( GXutil.strcmp(Z8848Bod_DibO, T010U2_A8848Bod_DibO[0]) != 0 ) || ( GXutil.strcmp(Z9376Bod_item3, T010U2_A9376Bod_item3[0]) != 0 ) || ( GXutil.strcmp(Z9540Bod_ToE, T010U2_A9540Bod_ToE[0]) != 0 ) || ( GXutil.strcmp(Z9560Bod_DescP, T010U2_A9560Bod_DescP[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z9561Bod_CVar, T010U2_A9561Bod_CVar[0]) != 0 ) || ( GXutil.strcmp(Z9562Bod_NVar, T010U2_A9562Bod_NVar[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4795AlRPieCal, T010U2_A4795AlRPieCal[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlRPieCal");
               GXutil.writeLogRaw("Old: ",Z4795AlRPieCal);
               GXutil.writeLogRaw("Current: ",T010U2_A4795AlRPieCal[0]);
            }
            if ( !( GXutil.dateCompare(Z4411AlbRecFec, T010U2_A4411AlbRecFec[0]) ) )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRecFec");
               GXutil.writeLogRaw("Old: ",Z4411AlbRecFec);
               GXutil.writeLogRaw("Current: ",T010U2_A4411AlbRecFec[0]);
            }
            if ( Z2154AlbRecAnh != T010U2_A2154AlbRecAnh[0] )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRecAnh");
               GXutil.writeLogRaw("Old: ",Z2154AlbRecAnh);
               GXutil.writeLogRaw("Current: ",T010U2_A2154AlbRecAnh[0]);
            }
            if ( DecimalUtil.compareTo(Z2157AlbRecMtr, T010U2_A2157AlbRecMtr[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRecMtr");
               GXutil.writeLogRaw("Old: ",Z2157AlbRecMtr);
               GXutil.writeLogRaw("Current: ",T010U2_A2157AlbRecMtr[0]);
            }
            if ( DecimalUtil.compareTo(Z2155AlbRecKgm, T010U2_A2155AlbRecKgm[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRecKgm");
               GXutil.writeLogRaw("Old: ",Z2155AlbRecKgm);
               GXutil.writeLogRaw("Current: ",T010U2_A2155AlbRecKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z2158AlbRecMtrU, T010U2_A2158AlbRecMtrU[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRecMtrU");
               GXutil.writeLogRaw("Old: ",Z2158AlbRecMtrU);
               GXutil.writeLogRaw("Current: ",T010U2_A2158AlbRecMtrU[0]);
            }
            if ( DecimalUtil.compareTo(Z2156AlbRecKgmU, T010U2_A2156AlbRecKgmU[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRecKgmU");
               GXutil.writeLogRaw("Old: ",Z2156AlbRecKgmU);
               GXutil.writeLogRaw("Current: ",T010U2_A2156AlbRecKgmU[0]);
            }
            if ( Z3730AlbRecCol != T010U2_A3730AlbRecCol[0] )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRecCol");
               GXutil.writeLogRaw("Old: ",Z3730AlbRecCol);
               GXutil.writeLogRaw("Current: ",T010U2_A3730AlbRecCol[0]);
            }
            if ( GXutil.strcmp(Z3731AlbRecIdPz, T010U2_A3731AlbRecIdPz[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRecIdPz");
               GXutil.writeLogRaw("Old: ",Z3731AlbRecIdPz);
               GXutil.writeLogRaw("Current: ",T010U2_A3731AlbRecIdPz[0]);
            }
            if ( Z3732AlbRecIdRc != T010U2_A3732AlbRecIdRc[0] )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRecIdRc");
               GXutil.writeLogRaw("Old: ",Z3732AlbRecIdRc);
               GXutil.writeLogRaw("Current: ",T010U2_A3732AlbRecIdRc[0]);
            }
            if ( DecimalUtil.compareTo(Z4410AlbRecPal, T010U2_A4410AlbRecPal[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRecPal");
               GXutil.writeLogRaw("Old: ",Z4410AlbRecPal);
               GXutil.writeLogRaw("Current: ",T010U2_A4410AlbRecPal[0]);
            }
            if ( GXutil.strcmp(Z7408ALRPIELOC, T010U2_A7408ALRPIELOC[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"ALRPIELOC");
               GXutil.writeLogRaw("Old: ",Z7408ALRPIELOC);
               GXutil.writeLogRaw("Current: ",T010U2_A7408ALRPIELOC[0]);
            }
            if ( Z7409ALRPIETEL != T010U2_A7409ALRPIETEL[0] )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"ALRPIETEL");
               GXutil.writeLogRaw("Old: ",Z7409ALRPIETEL);
               GXutil.writeLogRaw("Current: ",T010U2_A7409ALRPIETEL[0]);
            }
            if ( GXutil.strcmp(Z7410ALRPIEOPE, T010U2_A7410ALRPIEOPE[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"ALRPIEOPE");
               GXutil.writeLogRaw("Old: ",Z7410ALRPIEOPE);
               GXutil.writeLogRaw("Current: ",T010U2_A7410ALRPIEOPE[0]);
            }
            if ( GXutil.strcmp(Z7411ALRPIEST, T010U2_A7411ALRPIEST[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"ALRPIEST");
               GXutil.writeLogRaw("Old: ",Z7411ALRPIEST);
               GXutil.writeLogRaw("Current: ",T010U2_A7411ALRPIEST[0]);
            }
            if ( Z7792AlbRecPnt != T010U2_A7792AlbRecPnt[0] )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRecPnt");
               GXutil.writeLogRaw("Old: ",Z7792AlbRecPnt);
               GXutil.writeLogRaw("Current: ",T010U2_A7792AlbRecPnt[0]);
            }
            if ( GXutil.strcmp(Z7793AlbRecCo1, T010U2_A7793AlbRecCo1[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRecCo1");
               GXutil.writeLogRaw("Old: ",Z7793AlbRecCo1);
               GXutil.writeLogRaw("Current: ",T010U2_A7793AlbRecCo1[0]);
            }
            if ( Z7794AlbRecCo2 != T010U2_A7794AlbRecCo2[0] )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbRecCo2");
               GXutil.writeLogRaw("Old: ",Z7794AlbRecCo2);
               GXutil.writeLogRaw("Current: ",T010U2_A7794AlbRecCo2[0]);
            }
            if ( Z7998AlbHdr != T010U2_A7998AlbHdr[0] )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbHdr");
               GXutil.writeLogRaw("Old: ",Z7998AlbHdr);
               GXutil.writeLogRaw("Current: ",T010U2_A7998AlbHdr[0]);
            }
            if ( Z7999AlbHdrr != T010U2_A7999AlbHdrr[0] )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbHdrr");
               GXutil.writeLogRaw("Old: ",Z7999AlbHdrr);
               GXutil.writeLogRaw("Current: ",T010U2_A7999AlbHdrr[0]);
            }
            if ( GXutil.strcmp(Z8000AlbHdrp, T010U2_A8000AlbHdrp[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbHdrp");
               GXutil.writeLogRaw("Old: ",Z8000AlbHdrp);
               GXutil.writeLogRaw("Current: ",T010U2_A8000AlbHdrp[0]);
            }
            if ( GXutil.strcmp(Z8001AlbSerT, T010U2_A8001AlbSerT[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbSerT");
               GXutil.writeLogRaw("Old: ",Z8001AlbSerT);
               GXutil.writeLogRaw("Current: ",T010U2_A8001AlbSerT[0]);
            }
            if ( GXutil.strcmp(Z8002AlbColNm, T010U2_A8002AlbColNm[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbColNm");
               GXutil.writeLogRaw("Old: ",Z8002AlbColNm);
               GXutil.writeLogRaw("Current: ",T010U2_A8002AlbColNm[0]);
            }
            if ( Z8003AlbColNn != T010U2_A8003AlbColNn[0] )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbColNn");
               GXutil.writeLogRaw("Old: ",Z8003AlbColNn);
               GXutil.writeLogRaw("Current: ",T010U2_A8003AlbColNn[0]);
            }
            if ( DecimalUtil.compareTo(Z8004AlbKgsPf, T010U2_A8004AlbKgsPf[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbKgsPf");
               GXutil.writeLogRaw("Old: ",Z8004AlbKgsPf);
               GXutil.writeLogRaw("Current: ",T010U2_A8004AlbKgsPf[0]);
            }
            if ( DecimalUtil.compareTo(Z8005AlbMtsPf, T010U2_A8005AlbMtsPf[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbMtsPf");
               GXutil.writeLogRaw("Old: ",Z8005AlbMtsPf);
               GXutil.writeLogRaw("Current: ",T010U2_A8005AlbMtsPf[0]);
            }
            if ( Z8006AlbAfin != T010U2_A8006AlbAfin[0] )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbAfin");
               GXutil.writeLogRaw("Old: ",Z8006AlbAfin);
               GXutil.writeLogRaw("Current: ",T010U2_A8006AlbAfin[0]);
            }
            if ( GXutil.strcmp(Z8037AlbNPed, T010U2_A8037AlbNPed[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbNPed");
               GXutil.writeLogRaw("Old: ",Z8037AlbNPed);
               GXutil.writeLogRaw("Current: ",T010U2_A8037AlbNPed[0]);
            }
            if ( GXutil.strcmp(Z8051AlbObsp, T010U2_A8051AlbObsp[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"AlbObsp");
               GXutil.writeLogRaw("Old: ",Z8051AlbObsp);
               GXutil.writeLogRaw("Current: ",T010U2_A8051AlbObsp[0]);
            }
            if ( GXutil.strcmp(Z8679Bod_Dib, T010U2_A8679Bod_Dib[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"Bod_Dib");
               GXutil.writeLogRaw("Old: ",Z8679Bod_Dib);
               GXutil.writeLogRaw("Current: ",T010U2_A8679Bod_Dib[0]);
            }
            if ( Z8680Bod_Tua != T010U2_A8680Bod_Tua[0] )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"Bod_Tua");
               GXutil.writeLogRaw("Old: ",Z8680Bod_Tua);
               GXutil.writeLogRaw("Current: ",T010U2_A8680Bod_Tua[0]);
            }
            if ( Z8681Bod_Tub != T010U2_A8681Bod_Tub[0] )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"Bod_Tub");
               GXutil.writeLogRaw("Old: ",Z8681Bod_Tub);
               GXutil.writeLogRaw("Current: ",T010U2_A8681Bod_Tub[0]);
            }
            if ( Z8682Bod_Tuc != T010U2_A8682Bod_Tuc[0] )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"Bod_Tuc");
               GXutil.writeLogRaw("Old: ",Z8682Bod_Tuc);
               GXutil.writeLogRaw("Current: ",T010U2_A8682Bod_Tuc[0]);
            }
            if ( GXutil.strcmp(Z8683Bod_Hilz, T010U2_A8683Bod_Hilz[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"Bod_Hilz");
               GXutil.writeLogRaw("Old: ",Z8683Bod_Hilz);
               GXutil.writeLogRaw("Current: ",T010U2_A8683Bod_Hilz[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z8684Bod_FecE), GXutil.resetTime(T010U2_A8684Bod_FecE[0])) ) )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"Bod_FecE");
               GXutil.writeLogRaw("Old: ",Z8684Bod_FecE);
               GXutil.writeLogRaw("Current: ",T010U2_A8684Bod_FecE[0]);
            }
            if ( GXutil.strcmp(Z8685Bod_PedOr, T010U2_A8685Bod_PedOr[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"Bod_PedOr");
               GXutil.writeLogRaw("Old: ",Z8685Bod_PedOr);
               GXutil.writeLogRaw("Current: ",T010U2_A8685Bod_PedOr[0]);
            }
            if ( GXutil.strcmp(Z8774Bod_Rack, T010U2_A8774Bod_Rack[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"Bod_Rack");
               GXutil.writeLogRaw("Old: ",Z8774Bod_Rack);
               GXutil.writeLogRaw("Current: ",T010U2_A8774Bod_Rack[0]);
            }
            if ( GXutil.strcmp(Z8775Bod_PoS, T010U2_A8775Bod_PoS[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"Bod_PoS");
               GXutil.writeLogRaw("Old: ",Z8775Bod_PoS);
               GXutil.writeLogRaw("Current: ",T010U2_A8775Bod_PoS[0]);
            }
            if ( GXutil.strcmp(Z8776Bod_Ok, T010U2_A8776Bod_Ok[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"Bod_Ok");
               GXutil.writeLogRaw("Old: ",Z8776Bod_Ok);
               GXutil.writeLogRaw("Current: ",T010U2_A8776Bod_Ok[0]);
            }
            if ( GXutil.strcmp(Z8779Bod_Talla, T010U2_A8779Bod_Talla[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"Bod_Talla");
               GXutil.writeLogRaw("Old: ",Z8779Bod_Talla);
               GXutil.writeLogRaw("Current: ",T010U2_A8779Bod_Talla[0]);
            }
            if ( Z8780Bod_Und != T010U2_A8780Bod_Und[0] )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"Bod_Und");
               GXutil.writeLogRaw("Old: ",Z8780Bod_Und);
               GXutil.writeLogRaw("Current: ",T010U2_A8780Bod_Und[0]);
            }
            if ( GXutil.strcmp(Z8781Bod_Medt, T010U2_A8781Bod_Medt[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"Bod_Medt");
               GXutil.writeLogRaw("Old: ",Z8781Bod_Medt);
               GXutil.writeLogRaw("Current: ",T010U2_A8781Bod_Medt[0]);
            }
            if ( GXutil.strcmp(Z8831Bod_ColNNn, T010U2_A8831Bod_ColNNn[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"Bod_ColNNn");
               GXutil.writeLogRaw("Old: ",Z8831Bod_ColNNn);
               GXutil.writeLogRaw("Current: ",T010U2_A8831Bod_ColNNn[0]);
            }
            if ( DecimalUtil.compareTo(Z8832Bod_Por, T010U2_A8832Bod_Por[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"Bod_Por");
               GXutil.writeLogRaw("Old: ",Z8832Bod_Por);
               GXutil.writeLogRaw("Current: ",T010U2_A8832Bod_Por[0]);
            }
            if ( GXutil.strcmp(Z8833Bod_codb, T010U2_A8833Bod_codb[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"Bod_codb");
               GXutil.writeLogRaw("Old: ",Z8833Bod_codb);
               GXutil.writeLogRaw("Current: ",T010U2_A8833Bod_codb[0]);
            }
            if ( GXutil.strcmp(Z8834Bod_Pes, T010U2_A8834Bod_Pes[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"Bod_Pes");
               GXutil.writeLogRaw("Old: ",Z8834Bod_Pes);
               GXutil.writeLogRaw("Current: ",T010U2_A8834Bod_Pes[0]);
            }
            if ( GXutil.strcmp(Z8848Bod_DibO, T010U2_A8848Bod_DibO[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"Bod_DibO");
               GXutil.writeLogRaw("Old: ",Z8848Bod_DibO);
               GXutil.writeLogRaw("Current: ",T010U2_A8848Bod_DibO[0]);
            }
            if ( GXutil.strcmp(Z9376Bod_item3, T010U2_A9376Bod_item3[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"Bod_item3");
               GXutil.writeLogRaw("Old: ",Z9376Bod_item3);
               GXutil.writeLogRaw("Current: ",T010U2_A9376Bod_item3[0]);
            }
            if ( GXutil.strcmp(Z9540Bod_ToE, T010U2_A9540Bod_ToE[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"Bod_ToE");
               GXutil.writeLogRaw("Old: ",Z9540Bod_ToE);
               GXutil.writeLogRaw("Current: ",T010U2_A9540Bod_ToE[0]);
            }
            if ( GXutil.strcmp(Z9560Bod_DescP, T010U2_A9560Bod_DescP[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"Bod_DescP");
               GXutil.writeLogRaw("Old: ",Z9560Bod_DescP);
               GXutil.writeLogRaw("Current: ",T010U2_A9560Bod_DescP[0]);
            }
            if ( GXutil.strcmp(Z9561Bod_CVar, T010U2_A9561Bod_CVar[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"Bod_CVar");
               GXutil.writeLogRaw("Old: ",Z9561Bod_CVar);
               GXutil.writeLogRaw("Current: ",T010U2_A9561Bod_CVar[0]);
            }
            if ( GXutil.strcmp(Z9562Bod_NVar, T010U2_A9562Bod_NVar[0]) != 0 )
            {
               GXutil.writeLogln("talmpz2:[seudo value changed for attri]"+"Bod_NVar");
               GXutil.writeLogRaw("Old: ",Z9562Bod_NVar);
               GXutil.writeLogRaw("Current: ",T010U2_A9562Bod_NVar[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBDET"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert10U299( )
   {
      beforeValidate10U299( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10U299( ) ;
      }
      if ( AnyError == 0 )
      {
         zm10U299( 0) ;
         checkOptimisticConcurrency10U299( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm10U299( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert10U299( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T010U50 */
                  pr_default.execute(45, new Object[] {A4795AlRPieCal, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Boolean.valueOf(n4411AlbRecFec), A4411AlbRecFec, Short.valueOf(A2154AlbRecAnh), A2157AlbRecMtr, A2155AlbRecKgm, A2158AlbRecMtrU, A2156AlbRecKgmU, Short.valueOf(A3730AlbRecCol), A3731AlbRecIdPz, Integer.valueOf(A3732AlbRecIdRc), A4410AlbRecPal, A7408ALRPIELOC, Boolean.valueOf(n7409ALRPIETEL), Short.valueOf(A7409ALRPIETEL), Boolean.valueOf(n7410ALRPIEOPE), A7410ALRPIEOPE, Boolean.valueOf(n7411ALRPIEST), A7411ALRPIEST, Boolean.valueOf(n7792AlbRecPnt), Short.valueOf(A7792AlbRecPnt), Boolean.valueOf(n7793AlbRecCo1), A7793AlbRecCo1, Boolean.valueOf(n7794AlbRecCo2), Integer.valueOf(A7794AlbRecCo2), Boolean.valueOf(n7998AlbHdr), Integer.valueOf(A7998AlbHdr), Boolean.valueOf(n7999AlbHdrr), Byte.valueOf(A7999AlbHdrr), Boolean.valueOf(n8000AlbHdrp), A8000AlbHdrp, Boolean.valueOf(n8001AlbSerT), A8001AlbSerT, Boolean.valueOf(n8002AlbColNm), A8002AlbColNm, Boolean.valueOf(n8003AlbColNn), Integer.valueOf(A8003AlbColNn), Boolean.valueOf(n8004AlbKgsPf), A8004AlbKgsPf, Boolean.valueOf(n8005AlbMtsPf), A8005AlbMtsPf, Boolean.valueOf(n8006AlbAfin), Byte.valueOf(A8006AlbAfin), Boolean.valueOf(n8037AlbNPed), A8037AlbNPed, Boolean.valueOf(n8051AlbObsp), A8051AlbObsp, Boolean.valueOf(n8679Bod_Dib), A8679Bod_Dib, Boolean.valueOf(n8680Bod_Tua), Long.valueOf(A8680Bod_Tua), Boolean.valueOf(n8681Bod_Tub), Long.valueOf(A8681Bod_Tub), Boolean.valueOf(n8682Bod_Tuc), Long.valueOf(A8682Bod_Tuc), Boolean.valueOf(n8683Bod_Hilz), A8683Bod_Hilz, Boolean.valueOf(n8684Bod_FecE), A8684Bod_FecE, Boolean.valueOf(n8685Bod_PedOr), A8685Bod_PedOr, Boolean.valueOf(n8774Bod_Rack), A8774Bod_Rack, Boolean.valueOf(n8775Bod_PoS), A8775Bod_PoS, Boolean.valueOf(n8776Bod_Ok), A8776Bod_Ok, A8779Bod_Talla, Short.valueOf(A8780Bod_Und), Boolean.valueOf(n8781Bod_Medt), A8781Bod_Medt, Boolean.valueOf(n8831Bod_ColNNn), A8831Bod_ColNNn, Boolean.valueOf(n8832Bod_Por), A8832Bod_Por, Boolean.valueOf(n8833Bod_codb), A8833Bod_codb, Boolean.valueOf(n8834Bod_Pes), A8834Bod_Pes, Boolean.valueOf(n8848Bod_DibO), A8848Bod_DibO, Boolean.valueOf(n9376Bod_item3), A9376Bod_item3, Boolean.valueOf(n9540Bod_ToE), A9540Bod_ToE, Boolean.valueOf(n9560Bod_DescP), A9560Bod_DescP, Boolean.valueOf(n9561Bod_CVar), A9561Bod_CVar, Boolean.valueOf(n9562Bod_NVar), A9562Bod_NVar, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
                  if ( (pr_default.getStatus(45) == 1) )
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
            load10U299( ) ;
         }
         endLevel10U299( ) ;
      }
      closeExtendedTableCursors10U299( ) ;
   }

   public void update10U299( )
   {
      beforeValidate10U299( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable10U299( ) ;
      }
      if ( ( nIsMod_299 != 0 ) || ( nIsDirty_299 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency10U299( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm10U299( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate10U299( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T010U51 */
                     pr_default.execute(46, new Object[] {A4795AlRPieCal, Boolean.valueOf(n4411AlbRecFec), A4411AlbRecFec, Short.valueOf(A2154AlbRecAnh), A2157AlbRecMtr, A2155AlbRecKgm, A2158AlbRecMtrU, A2156AlbRecKgmU, Short.valueOf(A3730AlbRecCol), A3731AlbRecIdPz, Integer.valueOf(A3732AlbRecIdRc), A4410AlbRecPal, A7408ALRPIELOC, Boolean.valueOf(n7409ALRPIETEL), Short.valueOf(A7409ALRPIETEL), Boolean.valueOf(n7410ALRPIEOPE), A7410ALRPIEOPE, Boolean.valueOf(n7411ALRPIEST), A7411ALRPIEST, Boolean.valueOf(n7792AlbRecPnt), Short.valueOf(A7792AlbRecPnt), Boolean.valueOf(n7793AlbRecCo1), A7793AlbRecCo1, Boolean.valueOf(n7794AlbRecCo2), Integer.valueOf(A7794AlbRecCo2), Boolean.valueOf(n7998AlbHdr), Integer.valueOf(A7998AlbHdr), Boolean.valueOf(n7999AlbHdrr), Byte.valueOf(A7999AlbHdrr), Boolean.valueOf(n8000AlbHdrp), A8000AlbHdrp, Boolean.valueOf(n8001AlbSerT), A8001AlbSerT, Boolean.valueOf(n8002AlbColNm), A8002AlbColNm, Boolean.valueOf(n8003AlbColNn), Integer.valueOf(A8003AlbColNn), Boolean.valueOf(n8004AlbKgsPf), A8004AlbKgsPf, Boolean.valueOf(n8005AlbMtsPf), A8005AlbMtsPf, Boolean.valueOf(n8006AlbAfin), Byte.valueOf(A8006AlbAfin), Boolean.valueOf(n8037AlbNPed), A8037AlbNPed, Boolean.valueOf(n8051AlbObsp), A8051AlbObsp, Boolean.valueOf(n8679Bod_Dib), A8679Bod_Dib, Boolean.valueOf(n8680Bod_Tua), Long.valueOf(A8680Bod_Tua), Boolean.valueOf(n8681Bod_Tub), Long.valueOf(A8681Bod_Tub), Boolean.valueOf(n8682Bod_Tuc), Long.valueOf(A8682Bod_Tuc), Boolean.valueOf(n8683Bod_Hilz), A8683Bod_Hilz, Boolean.valueOf(n8684Bod_FecE), A8684Bod_FecE, Boolean.valueOf(n8685Bod_PedOr), A8685Bod_PedOr, Boolean.valueOf(n8774Bod_Rack), A8774Bod_Rack, Boolean.valueOf(n8775Bod_PoS), A8775Bod_PoS, Boolean.valueOf(n8776Bod_Ok), A8776Bod_Ok, A8779Bod_Talla, Short.valueOf(A8780Bod_Und), Boolean.valueOf(n8781Bod_Medt), A8781Bod_Medt, Boolean.valueOf(n8831Bod_ColNNn), A8831Bod_ColNNn, Boolean.valueOf(n8832Bod_Por), A8832Bod_Por, Boolean.valueOf(n8833Bod_codb), A8833Bod_codb, Boolean.valueOf(n8834Bod_Pes), A8834Bod_Pes, Boolean.valueOf(n8848Bod_DibO), A8848Bod_DibO, Boolean.valueOf(n9376Bod_item3), A9376Bod_item3, Boolean.valueOf(n9540Bod_ToE), A9540Bod_ToE, Boolean.valueOf(n9560Bod_DescP), A9560Bod_DescP, Boolean.valueOf(n9561Bod_CVar), A9561Bod_CVar, Boolean.valueOf(n9562Bod_NVar), A9562Bod_NVar, A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
                     if ( (pr_default.getStatus(46) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBDET"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate10U299( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char5[0] = A396EmprCod ;
                        GXv_int2[0] = A44AlbRecCod ;
                        new app.txpalbrecupdateredundancy(remoteHandle, context).execute( GXv_char5, GXv_int2) ;
                        talmpz2_impl.this.A396EmprCod = GXv_char5[0] ;
                        talmpz2_impl.this.A44AlbRecCod = GXv_int2[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey10U299( ) ;
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
            endLevel10U299( ) ;
         }
      }
      closeExtendedTableCursors10U299( ) ;
   }

   public void deferredUpdate10U299( )
   {
   }

   public void delete10U299( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate10U299( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency10U299( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls10U299( ) ;
         afterConfirm10U299( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete10U299( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T010U52 */
               pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
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
      sMode299 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel10U299( ) ;
      Gx_mode = sMode299 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls10U299( )
   {
      standaloneModal10U299( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true /* Level */ )
         {
            GXt_char3 = AV54PieUti ;
            GXv_char5[0] = A396EmprCod ;
            GXv_int2[0] = A44AlbRecCod ;
            GXv_char4[0] = A2159AlbRecPie ;
            GXv_char1[0] = GXt_char3 ;
            new app.palrpieuti(remoteHandle, context).execute( GXv_char5, GXv_int2, GXv_char4, GXv_char1) ;
            talmpz2_impl.this.A396EmprCod = GXv_char5[0] ;
            talmpz2_impl.this.A44AlbRecCod = GXv_int2[0] ;
            talmpz2_impl.this.A2159AlbRecPie = GXv_char4[0] ;
            talmpz2_impl.this.GXt_char3 = GXv_char1[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            AV54PieUti = GXt_char3 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54PieUti", AV54PieUti);
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T010U53 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AlrPiF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T010U54 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HILZPZ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T010U55 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AlRPi1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T010U56 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Historia de las Piezas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T010U57 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AlRPieDef", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
      }
   }

   public void endLevel10U299( )
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

   public void scanStart10U299( )
   {
      /* Scan By routine */
      /* Using cursor T010U58 */
      pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      RcdFound299 = (short)(0) ;
      if ( (pr_default.getStatus(53) != 101) )
      {
         RcdFound299 = (short)(1) ;
         A2159AlbRecPie = T010U58_A2159AlbRecPie[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext10U299( )
   {
      /* Scan next routine */
      pr_default.readNext(53);
      RcdFound299 = (short)(0) ;
      if ( (pr_default.getStatus(53) != 101) )
      {
         RcdFound299 = (short)(1) ;
         A2159AlbRecPie = T010U58_A2159AlbRecPie[0] ;
      }
   }

   public void scanEnd10U299( )
   {
      pr_default.close(53);
   }

   public void afterConfirm10U299( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert10U299( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate10U299( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete10U299( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete10U299( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate10U299( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes10U299( )
   {
      edtAlbRecPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAlbRecAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecAnh_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAlbRecMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtr_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAlbRecKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgm_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAlbRecMtrU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtrU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtrU_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAlbRecKgmU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgmU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgmU_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAlbRecCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCol_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAlbRecIdPz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecIdPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecIdPz_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAlbRecIdRc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecIdRc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecIdRc_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAlbRecPal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPal_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtALRPIELOC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtALRPIELOC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALRPIELOC_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtALRPIETEL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtALRPIETEL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALRPIETEL_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtALRPIEOPE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtALRPIEOPE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALRPIEOPE_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtALRPIEST_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtALRPIEST_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALRPIEST_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAlbRecFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecFec_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAlbRecPnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPnt_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAlbRecCo1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCo1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCo1_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAlbRecCo2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCo2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCo2_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAlbHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdr_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAlbHdrr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrr_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAlbHdrp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrp_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAlbSerT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbSerT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSerT_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAlbColNm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbColNm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColNm_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAlbColNn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbColNn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColNn_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAlbKgsPf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbKgsPf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbKgsPf_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAlbMtsPf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMtsPf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMtsPf_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAlbAfin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbAfin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbAfin_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAlbNPed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNPed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNPed_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtAlbObsp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbObsp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbObsp_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtBod_Dib_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_Dib_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Dib_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtBod_Tua_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_Tua_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Tua_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtBod_Tub_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_Tub_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Tub_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtBod_Tuc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_Tuc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Tuc_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtBod_Hilz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_Hilz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Hilz_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtBod_FecE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_FecE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_FecE_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtBod_PedOr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_PedOr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_PedOr_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtBod_Rack_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_Rack_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Rack_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtBod_PoS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_PoS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_PoS_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtBod_Ok_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_Ok_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Ok_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtBod_Talla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_Talla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Talla_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtBod_Und_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_Und_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Und_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtBod_Medt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_Medt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Medt_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtBod_ColNNn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_ColNNn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_ColNNn_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtBod_Por_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_Por_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Por_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtBod_codb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_codb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_codb_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtBod_Pes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_Pes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_Pes_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtBod_DibO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_DibO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_DibO_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtBod_item3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_item3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_item3_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtBod_ToE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_ToE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_ToE_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtBod_DescP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_DescP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_DescP_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtBod_CVar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_CVar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_CVar_Enabled), 5, 0), !bGXsfl_220_Refreshing);
      edtBod_NVar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBod_NVar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBod_NVar_Enabled), 5, 0), !bGXsfl_220_Refreshing);
   }

   public void send_integrity_lvl_hashes10U299( )
   {
   }

   public void send_integrity_lvl_hashes10U7( )
   {
   }

   public void subsflControlProps_220299( )
   {
      edtavnRcdDeleted_299_Internalname = "vNRCDDELETED_299_"+sGXsfl_220_idx ;
      edtAlbRecPie_Internalname = "ALBRECPIE_"+sGXsfl_220_idx ;
      edtAlbRecAnh_Internalname = "ALBRECANH_"+sGXsfl_220_idx ;
      edtAlbRecMtr_Internalname = "ALBRECMTR_"+sGXsfl_220_idx ;
      edtAlbRecKgm_Internalname = "ALBRECKGM_"+sGXsfl_220_idx ;
      edtAlbRecMtrU_Internalname = "ALBRECMTRU_"+sGXsfl_220_idx ;
      edtAlbRecKgmU_Internalname = "ALBRECKGMU_"+sGXsfl_220_idx ;
      edtAlbRecCol_Internalname = "ALBRECCOL_"+sGXsfl_220_idx ;
      edtAlbRecIdPz_Internalname = "ALBRECIDPZ_"+sGXsfl_220_idx ;
      edtAlbRecIdRc_Internalname = "ALBRECIDRC_"+sGXsfl_220_idx ;
      edtAlbRecPal_Internalname = "ALBRECPAL_"+sGXsfl_220_idx ;
      edtALRPIELOC_Internalname = "ALRPIELOC_"+sGXsfl_220_idx ;
      edtALRPIETEL_Internalname = "ALRPIETEL_"+sGXsfl_220_idx ;
      edtALRPIEOPE_Internalname = "ALRPIEOPE_"+sGXsfl_220_idx ;
      edtALRPIEST_Internalname = "ALRPIEST_"+sGXsfl_220_idx ;
      edtAlbRecFec_Internalname = "ALBRECFEC_"+sGXsfl_220_idx ;
      edtAlbRecPnt_Internalname = "ALBRECPNT_"+sGXsfl_220_idx ;
      edtAlbRecCo1_Internalname = "ALBRECCO1_"+sGXsfl_220_idx ;
      edtAlbRecCo2_Internalname = "ALBRECCO2_"+sGXsfl_220_idx ;
      edtAlbHdr_Internalname = "ALBHDR_"+sGXsfl_220_idx ;
      edtAlbHdrr_Internalname = "ALBHDRR_"+sGXsfl_220_idx ;
      edtAlbHdrp_Internalname = "ALBHDRP_"+sGXsfl_220_idx ;
      edtAlbSerT_Internalname = "ALBSERT_"+sGXsfl_220_idx ;
      edtAlbColNm_Internalname = "ALBCOLNM_"+sGXsfl_220_idx ;
      edtAlbColNn_Internalname = "ALBCOLNN_"+sGXsfl_220_idx ;
      edtAlbKgsPf_Internalname = "ALBKGSPF_"+sGXsfl_220_idx ;
      edtAlbMtsPf_Internalname = "ALBMTSPF_"+sGXsfl_220_idx ;
      edtAlbAfin_Internalname = "ALBAFIN_"+sGXsfl_220_idx ;
      edtAlbNPed_Internalname = "ALBNPED_"+sGXsfl_220_idx ;
      edtAlbObsp_Internalname = "ALBOBSP_"+sGXsfl_220_idx ;
      edtBod_Dib_Internalname = "BOD_DIB_"+sGXsfl_220_idx ;
      edtBod_Tua_Internalname = "BOD_TUA_"+sGXsfl_220_idx ;
      edtBod_Tub_Internalname = "BOD_TUB_"+sGXsfl_220_idx ;
      edtBod_Tuc_Internalname = "BOD_TUC_"+sGXsfl_220_idx ;
      edtBod_Hilz_Internalname = "BOD_HILZ_"+sGXsfl_220_idx ;
      edtBod_FecE_Internalname = "BOD_FECE_"+sGXsfl_220_idx ;
      edtBod_PedOr_Internalname = "BOD_PEDOR_"+sGXsfl_220_idx ;
      edtBod_Rack_Internalname = "BOD_RACK_"+sGXsfl_220_idx ;
      edtBod_PoS_Internalname = "BOD_POS_"+sGXsfl_220_idx ;
      edtBod_Ok_Internalname = "BOD_OK_"+sGXsfl_220_idx ;
      edtBod_Talla_Internalname = "BOD_TALLA_"+sGXsfl_220_idx ;
      edtBod_Und_Internalname = "BOD_UND_"+sGXsfl_220_idx ;
      edtBod_Medt_Internalname = "BOD_MEDT_"+sGXsfl_220_idx ;
      edtBod_ColNNn_Internalname = "BOD_COLNNN_"+sGXsfl_220_idx ;
      edtBod_Por_Internalname = "BOD_POR_"+sGXsfl_220_idx ;
      edtBod_codb_Internalname = "BOD_CODB_"+sGXsfl_220_idx ;
      edtBod_Pes_Internalname = "BOD_PES_"+sGXsfl_220_idx ;
      edtBod_DibO_Internalname = "BOD_DIBO_"+sGXsfl_220_idx ;
      edtBod_item3_Internalname = "BOD_ITEM3_"+sGXsfl_220_idx ;
      edtBod_ToE_Internalname = "BOD_TOE_"+sGXsfl_220_idx ;
      edtBod_DescP_Internalname = "BOD_DESCP_"+sGXsfl_220_idx ;
      edtBod_CVar_Internalname = "BOD_CVAR_"+sGXsfl_220_idx ;
      edtBod_NVar_Internalname = "BOD_NVAR_"+sGXsfl_220_idx ;
   }

   public void subsflControlProps_fel_220299( )
   {
      edtavnRcdDeleted_299_Internalname = "vNRCDDELETED_299_"+sGXsfl_220_fel_idx ;
      edtAlbRecPie_Internalname = "ALBRECPIE_"+sGXsfl_220_fel_idx ;
      edtAlbRecAnh_Internalname = "ALBRECANH_"+sGXsfl_220_fel_idx ;
      edtAlbRecMtr_Internalname = "ALBRECMTR_"+sGXsfl_220_fel_idx ;
      edtAlbRecKgm_Internalname = "ALBRECKGM_"+sGXsfl_220_fel_idx ;
      edtAlbRecMtrU_Internalname = "ALBRECMTRU_"+sGXsfl_220_fel_idx ;
      edtAlbRecKgmU_Internalname = "ALBRECKGMU_"+sGXsfl_220_fel_idx ;
      edtAlbRecCol_Internalname = "ALBRECCOL_"+sGXsfl_220_fel_idx ;
      edtAlbRecIdPz_Internalname = "ALBRECIDPZ_"+sGXsfl_220_fel_idx ;
      edtAlbRecIdRc_Internalname = "ALBRECIDRC_"+sGXsfl_220_fel_idx ;
      edtAlbRecPal_Internalname = "ALBRECPAL_"+sGXsfl_220_fel_idx ;
      edtALRPIELOC_Internalname = "ALRPIELOC_"+sGXsfl_220_fel_idx ;
      edtALRPIETEL_Internalname = "ALRPIETEL_"+sGXsfl_220_fel_idx ;
      edtALRPIEOPE_Internalname = "ALRPIEOPE_"+sGXsfl_220_fel_idx ;
      edtALRPIEST_Internalname = "ALRPIEST_"+sGXsfl_220_fel_idx ;
      edtAlbRecFec_Internalname = "ALBRECFEC_"+sGXsfl_220_fel_idx ;
      edtAlbRecPnt_Internalname = "ALBRECPNT_"+sGXsfl_220_fel_idx ;
      edtAlbRecCo1_Internalname = "ALBRECCO1_"+sGXsfl_220_fel_idx ;
      edtAlbRecCo2_Internalname = "ALBRECCO2_"+sGXsfl_220_fel_idx ;
      edtAlbHdr_Internalname = "ALBHDR_"+sGXsfl_220_fel_idx ;
      edtAlbHdrr_Internalname = "ALBHDRR_"+sGXsfl_220_fel_idx ;
      edtAlbHdrp_Internalname = "ALBHDRP_"+sGXsfl_220_fel_idx ;
      edtAlbSerT_Internalname = "ALBSERT_"+sGXsfl_220_fel_idx ;
      edtAlbColNm_Internalname = "ALBCOLNM_"+sGXsfl_220_fel_idx ;
      edtAlbColNn_Internalname = "ALBCOLNN_"+sGXsfl_220_fel_idx ;
      edtAlbKgsPf_Internalname = "ALBKGSPF_"+sGXsfl_220_fel_idx ;
      edtAlbMtsPf_Internalname = "ALBMTSPF_"+sGXsfl_220_fel_idx ;
      edtAlbAfin_Internalname = "ALBAFIN_"+sGXsfl_220_fel_idx ;
      edtAlbNPed_Internalname = "ALBNPED_"+sGXsfl_220_fel_idx ;
      edtAlbObsp_Internalname = "ALBOBSP_"+sGXsfl_220_fel_idx ;
      edtBod_Dib_Internalname = "BOD_DIB_"+sGXsfl_220_fel_idx ;
      edtBod_Tua_Internalname = "BOD_TUA_"+sGXsfl_220_fel_idx ;
      edtBod_Tub_Internalname = "BOD_TUB_"+sGXsfl_220_fel_idx ;
      edtBod_Tuc_Internalname = "BOD_TUC_"+sGXsfl_220_fel_idx ;
      edtBod_Hilz_Internalname = "BOD_HILZ_"+sGXsfl_220_fel_idx ;
      edtBod_FecE_Internalname = "BOD_FECE_"+sGXsfl_220_fel_idx ;
      edtBod_PedOr_Internalname = "BOD_PEDOR_"+sGXsfl_220_fel_idx ;
      edtBod_Rack_Internalname = "BOD_RACK_"+sGXsfl_220_fel_idx ;
      edtBod_PoS_Internalname = "BOD_POS_"+sGXsfl_220_fel_idx ;
      edtBod_Ok_Internalname = "BOD_OK_"+sGXsfl_220_fel_idx ;
      edtBod_Talla_Internalname = "BOD_TALLA_"+sGXsfl_220_fel_idx ;
      edtBod_Und_Internalname = "BOD_UND_"+sGXsfl_220_fel_idx ;
      edtBod_Medt_Internalname = "BOD_MEDT_"+sGXsfl_220_fel_idx ;
      edtBod_ColNNn_Internalname = "BOD_COLNNN_"+sGXsfl_220_fel_idx ;
      edtBod_Por_Internalname = "BOD_POR_"+sGXsfl_220_fel_idx ;
      edtBod_codb_Internalname = "BOD_CODB_"+sGXsfl_220_fel_idx ;
      edtBod_Pes_Internalname = "BOD_PES_"+sGXsfl_220_fel_idx ;
      edtBod_DibO_Internalname = "BOD_DIBO_"+sGXsfl_220_fel_idx ;
      edtBod_item3_Internalname = "BOD_ITEM3_"+sGXsfl_220_fel_idx ;
      edtBod_ToE_Internalname = "BOD_TOE_"+sGXsfl_220_fel_idx ;
      edtBod_DescP_Internalname = "BOD_DESCP_"+sGXsfl_220_fel_idx ;
      edtBod_CVar_Internalname = "BOD_CVAR_"+sGXsfl_220_fel_idx ;
      edtBod_NVar_Internalname = "BOD_NVAR_"+sGXsfl_220_fel_idx ;
   }

   public void addRow10U299( )
   {
      nGXsfl_220_idx = (int)(nGXsfl_220_idx+1) ;
      sGXsfl_220_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_220_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_220299( ) ;
      sendRow10U299( ) ;
   }

   public void sendRow10U299( )
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
         if ( ((int)((nGXsfl_220_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 221,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_299_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_299_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_299), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_299), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,221);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_299_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_299_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 222,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecPie_Internalname,GXutil.rtrim( A2159AlbRecPie),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,222);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecPie_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 223,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecAnh_Internalname,GXutil.ltrim( localUtil.ntoc( A2154AlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecAnh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2154AlbRecAnh), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2154AlbRecAnh), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,223);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecAnh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecAnh_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 224,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecMtr_Enabled!=0) ? localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99") : localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,224);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 225,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecKgm_Enabled!=0) ? localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99") : localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,225);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 226,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecMtrU_Internalname,GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecMtrU_Enabled!=0) ? localUtil.format( A2158AlbRecMtrU, "ZZZZZ9.99") : localUtil.format( A2158AlbRecMtrU, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,226);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecMtrU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecMtrU_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 227,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecKgmU_Internalname,GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecKgmU_Enabled!=0) ? localUtil.format( A2156AlbRecKgmU, "ZZZZZ9.99") : localUtil.format( A2156AlbRecKgmU, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,227);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecKgmU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecKgmU_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 228,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCol_Internalname,GXutil.ltrim( localUtil.ntoc( A3730AlbRecCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3730AlbRecCol), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3730AlbRecCol), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,228);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecCol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 229,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecIdPz_Internalname,GXutil.rtrim( A3731AlbRecIdPz),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,229);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecIdPz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecIdPz_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 230,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecIdRc_Internalname,GXutil.ltrim( localUtil.ntoc( A3732AlbRecIdRc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecIdRc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3732AlbRecIdRc), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3732AlbRecIdRc), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,230);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecIdRc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecIdRc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 231,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecPal_Internalname,GXutil.ltrim( localUtil.ntoc( A4410AlbRecPal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecPal_Enabled!=0) ? localUtil.format( A4410AlbRecPal, "ZZZZZ9.99") : localUtil.format( A4410AlbRecPal, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,231);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecPal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecPal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 232,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtALRPIELOC_Internalname,GXutil.rtrim( A7408ALRPIELOC),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,232);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtALRPIELOC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtALRPIELOC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 233,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtALRPIETEL_Internalname,GXutil.ltrim( localUtil.ntoc( A7409ALRPIETEL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtALRPIETEL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7409ALRPIETEL), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7409ALRPIETEL), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,233);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtALRPIETEL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtALRPIETEL_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 234,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtALRPIEOPE_Internalname,GXutil.rtrim( A7410ALRPIEOPE),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,234);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtALRPIEOPE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtALRPIEOPE_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 235,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtALRPIEST_Internalname,GXutil.rtrim( A7411ALRPIEST),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,235);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtALRPIEST_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtALRPIEST_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 236,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecFec_Internalname,localUtil.ttoc( A4411AlbRecFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4411AlbRecFec, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,236);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecFec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 237,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecPnt_Internalname,GXutil.ltrim( localUtil.ntoc( A7792AlbRecPnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecPnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7792AlbRecPnt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7792AlbRecPnt), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,237);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecPnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecPnt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 238,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCo1_Internalname,GXutil.rtrim( A7793AlbRecCo1),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,238);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCo1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecCo1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 239,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCo2_Internalname,GXutil.ltrim( localUtil.ntoc( A7794AlbRecCo2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecCo2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7794AlbRecCo2), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7794AlbRecCo2), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,239);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCo2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecCo2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 240,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdr_Internalname,GXutil.ltrim( localUtil.ntoc( A7998AlbHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbHdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7998AlbHdr), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7998AlbHdr), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,240);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbHdr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 241,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrr_Internalname,GXutil.ltrim( localUtil.ntoc( A7999AlbHdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbHdrr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7999AlbHdrr), "9") : localUtil.format( DecimalUtil.doubleToDec(A7999AlbHdrr), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,241);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbHdrr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 242,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdrp_Internalname,GXutil.rtrim( A8000AlbHdrp),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,242);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdrp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbHdrp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 243,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbSerT_Internalname,GXutil.rtrim( A8001AlbSerT),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,243);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbSerT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbSerT_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 244,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbColNm_Internalname,GXutil.rtrim( A8002AlbColNm),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,244);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbColNm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbColNm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 245,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbColNn_Internalname,GXutil.ltrim( localUtil.ntoc( A8003AlbColNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbColNn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8003AlbColNn), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8003AlbColNn), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,245);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbColNn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbColNn_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 246,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbKgsPf_Internalname,GXutil.ltrim( localUtil.ntoc( A8004AlbKgsPf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbKgsPf_Enabled!=0) ? localUtil.format( A8004AlbKgsPf, "ZZZZZ9.99") : localUtil.format( A8004AlbKgsPf, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,246);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbKgsPf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbKgsPf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 247,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbMtsPf_Internalname,GXutil.ltrim( localUtil.ntoc( A8005AlbMtsPf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbMtsPf_Enabled!=0) ? localUtil.format( A8005AlbMtsPf, "ZZZZZ9.99") : localUtil.format( A8005AlbMtsPf, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,247);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbMtsPf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbMtsPf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 248,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbAfin_Internalname,GXutil.ltrim( localUtil.ntoc( A8006AlbAfin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbAfin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8006AlbAfin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A8006AlbAfin), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,248);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbAfin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbAfin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 249,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbNPed_Internalname,GXutil.rtrim( A8037AlbNPed),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,249);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbNPed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbNPed_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 250,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbObsp_Internalname,A8051AlbObsp,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,250);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbObsp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbObsp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 251,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_Dib_Internalname,GXutil.rtrim( A8679Bod_Dib),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,251);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_Dib_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBod_Dib_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 252,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_Tua_Internalname,GXutil.ltrim( localUtil.ntoc( A8680Bod_Tua, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBod_Tua_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8680Bod_Tua), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8680Bod_Tua), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,252);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_Tua_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBod_Tua_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 253,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_Tub_Internalname,GXutil.ltrim( localUtil.ntoc( A8681Bod_Tub, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBod_Tub_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8681Bod_Tub), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8681Bod_Tub), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,253);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_Tub_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBod_Tub_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 254,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_Tuc_Internalname,GXutil.ltrim( localUtil.ntoc( A8682Bod_Tuc, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBod_Tuc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8682Bod_Tuc), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8682Bod_Tuc), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,254);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_Tuc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBod_Tuc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 255,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_Hilz_Internalname,GXutil.rtrim( A8683Bod_Hilz),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,255);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_Hilz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBod_Hilz_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(800),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 256,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_FecE_Internalname,localUtil.format(A8684Bod_FecE, "99/99/99"),localUtil.format( A8684Bod_FecE, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,256);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_FecE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBod_FecE_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 257,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_PedOr_Internalname,GXutil.rtrim( A8685Bod_PedOr),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,257);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_PedOr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBod_PedOr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 258,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_Rack_Internalname,GXutil.rtrim( A8774Bod_Rack),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,258);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_Rack_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBod_Rack_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 259,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_PoS_Internalname,GXutil.rtrim( A8775Bod_PoS),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,259);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_PoS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBod_PoS_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 260,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_Ok_Internalname,GXutil.rtrim( A8776Bod_Ok),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,260);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_Ok_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBod_Ok_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 261,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_Talla_Internalname,GXutil.rtrim( A8779Bod_Talla),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,261);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_Talla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBod_Talla_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 262,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_Und_Internalname,GXutil.ltrim( localUtil.ntoc( A8780Bod_Und, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBod_Und_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8780Bod_Und), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8780Bod_Und), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,262);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_Und_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBod_Und_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 263,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_Medt_Internalname,GXutil.rtrim( A8781Bod_Medt),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,263);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_Medt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBod_Medt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 264,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_ColNNn_Internalname,GXutil.rtrim( A8831Bod_ColNNn),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,264);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_ColNNn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBod_ColNNn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 265,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_Por_Internalname,GXutil.ltrim( localUtil.ntoc( A8832Bod_Por, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBod_Por_Enabled!=0) ? localUtil.format( A8832Bod_Por, "ZZ9.99") : localUtil.format( A8832Bod_Por, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,265);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_Por_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBod_Por_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 266,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_codb_Internalname,GXutil.rtrim( A8833Bod_codb),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,266);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_codb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBod_codb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 267,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_Pes_Internalname,GXutil.rtrim( A8834Bod_Pes),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,267);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_Pes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBod_Pes_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 268,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_DibO_Internalname,GXutil.rtrim( A8848Bod_DibO),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,268);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_DibO_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBod_DibO_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 269,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_item3_Internalname,GXutil.rtrim( A9376Bod_item3),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,269);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_item3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBod_item3_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 270,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_ToE_Internalname,GXutil.rtrim( A9540Bod_ToE),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,270);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_ToE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBod_ToE_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 271,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_DescP_Internalname,GXutil.rtrim( A9560Bod_DescP),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,271);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_DescP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBod_DescP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 272,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_CVar_Internalname,GXutil.rtrim( A9561Bod_CVar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,272);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_CVar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBod_CVar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_220_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 273,'',false,'" + sGXsfl_220_idx + "',220)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBod_NVar_Internalname,GXutil.rtrim( A9562Bod_NVar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,273);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBod_NVar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBod_NVar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(31),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(220),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes10U299( ) ;
      GXCCtl = "Z2159AlbRecPie_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2159AlbRecPie));
      GXCCtl = "Z4795AlRPieCal_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4795AlRPieCal));
      GXCCtl = "Z4411AlbRecFec_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z4411AlbRecFec, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z2154AlbRecAnh_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2154AlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2157AlbRecMtr_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2155AlbRecKgm_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2158AlbRecMtrU_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2156AlbRecKgmU_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3730AlbRecCol_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3730AlbRecCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3731AlbRecIdPz_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3731AlbRecIdPz));
      GXCCtl = "Z3732AlbRecIdRc_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3732AlbRecIdRc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4410AlbRecPal_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4410AlbRecPal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7408ALRPIELOC_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7408ALRPIELOC));
      GXCCtl = "Z7409ALRPIETEL_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7409ALRPIETEL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7410ALRPIEOPE_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7410ALRPIEOPE));
      GXCCtl = "Z7411ALRPIEST_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7411ALRPIEST));
      GXCCtl = "Z7792AlbRecPnt_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7792AlbRecPnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7793AlbRecCo1_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7793AlbRecCo1));
      GXCCtl = "Z7794AlbRecCo2_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7794AlbRecCo2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7998AlbHdr_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7998AlbHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7999AlbHdrr_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7999AlbHdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8000AlbHdrp_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8000AlbHdrp));
      GXCCtl = "Z8001AlbSerT_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8001AlbSerT));
      GXCCtl = "Z8002AlbColNm_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8002AlbColNm));
      GXCCtl = "Z8003AlbColNn_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8003AlbColNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8004AlbKgsPf_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8004AlbKgsPf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8005AlbMtsPf_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8005AlbMtsPf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8006AlbAfin_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8006AlbAfin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8037AlbNPed_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8037AlbNPed));
      GXCCtl = "Z8051AlbObsp_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z8051AlbObsp);
      GXCCtl = "Z8679Bod_Dib_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8679Bod_Dib));
      GXCCtl = "Z8680Bod_Tua_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8680Bod_Tua, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8681Bod_Tub_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8681Bod_Tub, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8682Bod_Tuc_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8682Bod_Tuc, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8683Bod_Hilz_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8683Bod_Hilz));
      GXCCtl = "Z8684Bod_FecE_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z8684Bod_FecE, 0, "/"));
      GXCCtl = "Z8685Bod_PedOr_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8685Bod_PedOr));
      GXCCtl = "Z8774Bod_Rack_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8774Bod_Rack));
      GXCCtl = "Z8775Bod_PoS_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8775Bod_PoS));
      GXCCtl = "Z8776Bod_Ok_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8776Bod_Ok));
      GXCCtl = "Z8779Bod_Talla_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8779Bod_Talla));
      GXCCtl = "Z8780Bod_Und_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8780Bod_Und, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8781Bod_Medt_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8781Bod_Medt));
      GXCCtl = "Z8831Bod_ColNNn_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8831Bod_ColNNn));
      GXCCtl = "Z8832Bod_Por_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8832Bod_Por, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8833Bod_codb_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8833Bod_codb));
      GXCCtl = "Z8834Bod_Pes_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8834Bod_Pes));
      GXCCtl = "Z8848Bod_DibO_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8848Bod_DibO));
      GXCCtl = "Z9376Bod_item3_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9376Bod_item3));
      GXCCtl = "Z9540Bod_ToE_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9540Bod_ToE));
      GXCCtl = "Z9560Bod_DescP_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9560Bod_DescP));
      GXCCtl = "Z9561Bod_CVar_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9561Bod_CVar));
      GXCCtl = "Z9562Bod_NVar_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9562Bod_NVar));
      GXCCtl = "nRcdDeleted_299_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_299_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_299_" + sGXsfl_220_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_299_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_299_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECPIE_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECANH_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecAnh_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECMTR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECKGM_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECMTRU_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtrU_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECKGMU_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgmU_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECCOL_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECIDPZ_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecIdPz_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECIDRC_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecIdRc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECPAL_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIELOC_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALRPIELOC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIETEL_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALRPIETEL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIEOPE_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALRPIEOPE_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIEST_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALRPIEST_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECFEC_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecFec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECPNT_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECCO1_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCo1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECCO2_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCo2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRP_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBSERT_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbSerT_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOLNM_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbColNm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOLNN_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbColNn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBKGSPF_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbKgsPf_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBMTSPF_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbMtsPf_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBAFIN_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbAfin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBNPED_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbNPed_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBOBSP_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbObsp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_DIB_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Dib_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_TUA_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Tua_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_TUB_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Tub_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_TUC_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Tuc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_HILZ_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Hilz_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_FECE_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_FecE_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_PEDOR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_PedOr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_RACK_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Rack_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_POS_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_PoS_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_OK_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Ok_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_TALLA_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Talla_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_UND_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Und_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_MEDT_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Medt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_COLNNN_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_ColNNn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_POR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Por_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_CODB_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_codb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_PES_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Pes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_DIBO_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_DibO_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_ITEM3_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_item3_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_TOE_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_ToE_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_DESCP_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_DescP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_CVAR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_CVar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_NVAR_"+sGXsfl_220_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_NVar_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow10U299( )
   {
      nGXsfl_220_idx = (int)(nGXsfl_220_idx+1) ;
      sGXsfl_220_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_220_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_220299( ) ;
      edtavnRcdDeleted_299_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_299_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECPIE_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecAnh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECANH_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECMTR_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECKGM_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecMtrU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECMTRU_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecKgmU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECKGMU_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECCOL_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecIdPz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECIDPZ_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecIdRc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECIDRC_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecPal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECPAL_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtALRPIELOC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIELOC_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtALRPIETEL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIETEL_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtALRPIEOPE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIEOPE_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtALRPIEST_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIEST_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecFec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECFEC_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecPnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECPNT_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecCo1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECCO1_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecCo2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECCO2_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbHdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDR_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbHdrr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRR_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbHdrp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRP_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbSerT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBSERT_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbColNm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOLNM_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbColNn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOLNN_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbKgsPf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBKGSPF_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbMtsPf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBMTSPF_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbAfin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBAFIN_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbNPed_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBNPED_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbObsp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBOBSP_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_Dib_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_DIB_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_Tua_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_TUA_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_Tub_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_TUB_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_Tuc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_TUC_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_Hilz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_HILZ_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_FecE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_FECE_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_PedOr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_PEDOR_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_Rack_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_RACK_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_PoS_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_POS_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_Ok_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_OK_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_Talla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_TALLA_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_Und_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_UND_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_Medt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_MEDT_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_ColNNn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_COLNNN_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_Por_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_POR_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_codb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_CODB_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_Pes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_PES_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_DibO_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_DIBO_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_item3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_ITEM3_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_ToE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_TOE_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_DescP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_DESCP_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_CVar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_CVAR_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBod_NVar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BOD_NVAR_"+sGXsfl_220_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_299_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_299_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_299");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_299_Internalname ;
         wbErr = true ;
         nRcdDeleted_299 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_299 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_299_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A2159AlbRecPie = httpContext.cgiGet( edtAlbRecPie_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "ALBRECANH_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecAnh_Internalname ;
         wbErr = true ;
         A2154AlbRecAnh = (short)(0) ;
      }
      else
      {
         A2154AlbRecAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRecAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRecMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRecMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBRECMTR_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecMtr_Internalname ;
         wbErr = true ;
         A2157AlbRecMtr = DecimalUtil.ZERO ;
      }
      else
      {
         A2157AlbRecMtr = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtr_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRecKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRecKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBRECKGM_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecKgm_Internalname ;
         wbErr = true ;
         A2155AlbRecKgm = DecimalUtil.ZERO ;
      }
      else
      {
         A2155AlbRecKgm = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgm_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRecMtrU_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRecMtrU_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBRECMTRU_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecMtrU_Internalname ;
         wbErr = true ;
         A2158AlbRecMtrU = DecimalUtil.ZERO ;
      }
      else
      {
         A2158AlbRecMtrU = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtrU_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRecKgmU_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRecKgmU_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBRECKGMU_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecKgmU_Internalname ;
         wbErr = true ;
         A2156AlbRecKgmU = DecimalUtil.ZERO ;
      }
      else
      {
         A2156AlbRecKgmU = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgmU_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALBRECCOL_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCol_Internalname ;
         wbErr = true ;
         A3730AlbRecCol = (short)(0) ;
      }
      else
      {
         A3730AlbRecCol = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A3731AlbRecIdPz = httpContext.cgiGet( edtAlbRecIdPz_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecIdRc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecIdRc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "ALBRECIDRC_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecIdRc_Internalname ;
         wbErr = true ;
         A3732AlbRecIdRc = 0 ;
      }
      else
      {
         A3732AlbRecIdRc = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecIdRc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRecPal_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRecPal_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBRECPAL_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecPal_Internalname ;
         wbErr = true ;
         A4410AlbRecPal = DecimalUtil.ZERO ;
      }
      else
      {
         A4410AlbRecPal = localUtil.ctond( httpContext.cgiGet( edtAlbRecPal_Internalname)) ;
      }
      A7408ALRPIELOC = httpContext.cgiGet( edtALRPIELOC_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtALRPIETEL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtALRPIETEL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALRPIETEL_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtALRPIETEL_Internalname ;
         wbErr = true ;
         A7409ALRPIETEL = (short)(0) ;
         n7409ALRPIETEL = false ;
      }
      else
      {
         A7409ALRPIETEL = (short)(localUtil.ctol( httpContext.cgiGet( edtALRPIETEL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7409ALRPIETEL = false ;
      }
      A7410ALRPIEOPE = httpContext.cgiGet( edtALRPIEOPE_Internalname) ;
      n7410ALRPIEOPE = false ;
      A7411ALRPIEST = httpContext.cgiGet( edtALRPIEST_Internalname) ;
      n7411ALRPIEST = false ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtAlbRecFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "ALBRECFEC_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecFec_Internalname ;
         wbErr = true ;
         A4411AlbRecFec = GXutil.resetTime( GXutil.nullDate() );
         n4411AlbRecFec = false ;
      }
      else
      {
         A4411AlbRecFec = localUtil.ctot( httpContext.cgiGet( edtAlbRecFec_Internalname)) ;
         n4411AlbRecFec = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecPnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecPnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALBRECPNT_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecPnt_Internalname ;
         wbErr = true ;
         A7792AlbRecPnt = (short)(0) ;
         n7792AlbRecPnt = false ;
      }
      else
      {
         A7792AlbRecPnt = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRecPnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7792AlbRecPnt = false ;
      }
      A7793AlbRecCo1 = httpContext.cgiGet( edtAlbRecCo1_Internalname) ;
      n7793AlbRecCo1 = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCo2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCo2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "ALBRECCO2_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCo2_Internalname ;
         wbErr = true ;
         A7794AlbRecCo2 = 0 ;
         n7794AlbRecCo2 = false ;
      }
      else
      {
         A7794AlbRecCo2 = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCo2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7794AlbRecCo2 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "ALBHDR_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbHdr_Internalname ;
         wbErr = true ;
         A7998AlbHdr = 0 ;
         n7998AlbHdr = false ;
      }
      else
      {
         A7998AlbHdr = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7998AlbHdr = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdrr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdrr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "ALBHDRR_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbHdrr_Internalname ;
         wbErr = true ;
         A7999AlbHdrr = (byte)(0) ;
         n7999AlbHdrr = false ;
      }
      else
      {
         A7999AlbHdrr = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7999AlbHdrr = false ;
      }
      A8000AlbHdrp = httpContext.cgiGet( edtAlbHdrp_Internalname) ;
      n8000AlbHdrp = false ;
      A8001AlbSerT = httpContext.cgiGet( edtAlbSerT_Internalname) ;
      n8001AlbSerT = false ;
      A8002AlbColNm = httpContext.cgiGet( edtAlbColNm_Internalname) ;
      n8002AlbColNm = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbColNn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbColNn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "ALBCOLNN_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbColNn_Internalname ;
         wbErr = true ;
         A8003AlbColNn = 0 ;
         n8003AlbColNn = false ;
      }
      else
      {
         A8003AlbColNn = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbColNn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8003AlbColNn = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbKgsPf_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbKgsPf_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBKGSPF_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbKgsPf_Internalname ;
         wbErr = true ;
         A8004AlbKgsPf = DecimalUtil.ZERO ;
         n8004AlbKgsPf = false ;
      }
      else
      {
         A8004AlbKgsPf = localUtil.ctond( httpContext.cgiGet( edtAlbKgsPf_Internalname)) ;
         n8004AlbKgsPf = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbMtsPf_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbMtsPf_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBMTSPF_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbMtsPf_Internalname ;
         wbErr = true ;
         A8005AlbMtsPf = DecimalUtil.ZERO ;
         n8005AlbMtsPf = false ;
      }
      else
      {
         A8005AlbMtsPf = localUtil.ctond( httpContext.cgiGet( edtAlbMtsPf_Internalname)) ;
         n8005AlbMtsPf = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbAfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbAfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "ALBAFIN_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbAfin_Internalname ;
         wbErr = true ;
         A8006AlbAfin = (byte)(0) ;
         n8006AlbAfin = false ;
      }
      else
      {
         A8006AlbAfin = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbAfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8006AlbAfin = false ;
      }
      A8037AlbNPed = httpContext.cgiGet( edtAlbNPed_Internalname) ;
      n8037AlbNPed = false ;
      A8051AlbObsp = httpContext.cgiGet( edtAlbObsp_Internalname) ;
      n8051AlbObsp = false ;
      A8679Bod_Dib = httpContext.cgiGet( edtBod_Dib_Internalname) ;
      n8679Bod_Dib = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBod_Tua_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBod_Tua_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
      {
         GXCCtl = "BOD_TUA_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBod_Tua_Internalname ;
         wbErr = true ;
         A8680Bod_Tua = 0 ;
         n8680Bod_Tua = false ;
      }
      else
      {
         A8680Bod_Tua = localUtil.ctol( httpContext.cgiGet( edtBod_Tua_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n8680Bod_Tua = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBod_Tub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBod_Tub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
      {
         GXCCtl = "BOD_TUB_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBod_Tub_Internalname ;
         wbErr = true ;
         A8681Bod_Tub = 0 ;
         n8681Bod_Tub = false ;
      }
      else
      {
         A8681Bod_Tub = localUtil.ctol( httpContext.cgiGet( edtBod_Tub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n8681Bod_Tub = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBod_Tuc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBod_Tuc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
      {
         GXCCtl = "BOD_TUC_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBod_Tuc_Internalname ;
         wbErr = true ;
         A8682Bod_Tuc = 0 ;
         n8682Bod_Tuc = false ;
      }
      else
      {
         A8682Bod_Tuc = localUtil.ctol( httpContext.cgiGet( edtBod_Tuc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n8682Bod_Tuc = false ;
      }
      A8683Bod_Hilz = httpContext.cgiGet( edtBod_Hilz_Internalname) ;
      n8683Bod_Hilz = false ;
      if ( localUtil.vcdate( httpContext.cgiGet( edtBod_FecE_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "BOD_FECE_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBod_FecE_Internalname ;
         wbErr = true ;
         A8684Bod_FecE = GXutil.nullDate() ;
         n8684Bod_FecE = false ;
      }
      else
      {
         A8684Bod_FecE = localUtil.ctod( httpContext.cgiGet( edtBod_FecE_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n8684Bod_FecE = false ;
      }
      A8685Bod_PedOr = httpContext.cgiGet( edtBod_PedOr_Internalname) ;
      n8685Bod_PedOr = false ;
      A8774Bod_Rack = httpContext.cgiGet( edtBod_Rack_Internalname) ;
      n8774Bod_Rack = false ;
      A8775Bod_PoS = httpContext.cgiGet( edtBod_PoS_Internalname) ;
      n8775Bod_PoS = false ;
      A8776Bod_Ok = httpContext.cgiGet( edtBod_Ok_Internalname) ;
      n8776Bod_Ok = false ;
      A8779Bod_Talla = httpContext.cgiGet( edtBod_Talla_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBod_Und_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBod_Und_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BOD_UND_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBod_Und_Internalname ;
         wbErr = true ;
         A8780Bod_Und = (short)(0) ;
      }
      else
      {
         A8780Bod_Und = (short)(localUtil.ctol( httpContext.cgiGet( edtBod_Und_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A8781Bod_Medt = httpContext.cgiGet( edtBod_Medt_Internalname) ;
      n8781Bod_Medt = false ;
      A8831Bod_ColNNn = httpContext.cgiGet( edtBod_ColNNn_Internalname) ;
      n8831Bod_ColNNn = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBod_Por_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBod_Por_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "BOD_POR_" + sGXsfl_220_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBod_Por_Internalname ;
         wbErr = true ;
         A8832Bod_Por = DecimalUtil.ZERO ;
         n8832Bod_Por = false ;
      }
      else
      {
         A8832Bod_Por = localUtil.ctond( httpContext.cgiGet( edtBod_Por_Internalname)) ;
         n8832Bod_Por = false ;
      }
      A8833Bod_codb = httpContext.cgiGet( edtBod_codb_Internalname) ;
      n8833Bod_codb = false ;
      A8834Bod_Pes = httpContext.cgiGet( edtBod_Pes_Internalname) ;
      n8834Bod_Pes = false ;
      A8848Bod_DibO = httpContext.cgiGet( edtBod_DibO_Internalname) ;
      n8848Bod_DibO = false ;
      A9376Bod_item3 = httpContext.cgiGet( edtBod_item3_Internalname) ;
      n9376Bod_item3 = false ;
      A9540Bod_ToE = httpContext.cgiGet( edtBod_ToE_Internalname) ;
      n9540Bod_ToE = false ;
      A9560Bod_DescP = httpContext.cgiGet( edtBod_DescP_Internalname) ;
      n9560Bod_DescP = false ;
      A9561Bod_CVar = httpContext.cgiGet( edtBod_CVar_Internalname) ;
      n9561Bod_CVar = false ;
      A9562Bod_NVar = httpContext.cgiGet( edtBod_NVar_Internalname) ;
      n9562Bod_NVar = false ;
      GXCCtl = "Z2159AlbRecPie_" + sGXsfl_220_idx ;
      Z2159AlbRecPie = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4795AlRPieCal_" + sGXsfl_220_idx ;
      Z4795AlRPieCal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4411AlbRecFec_" + sGXsfl_220_idx ;
      Z4411AlbRecFec = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z2154AlbRecAnh_" + sGXsfl_220_idx ;
      Z2154AlbRecAnh = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2157AlbRecMtr_" + sGXsfl_220_idx ;
      Z2157AlbRecMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2155AlbRecKgm_" + sGXsfl_220_idx ;
      Z2155AlbRecKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2158AlbRecMtrU_" + sGXsfl_220_idx ;
      Z2158AlbRecMtrU = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2156AlbRecKgmU_" + sGXsfl_220_idx ;
      Z2156AlbRecKgmU = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3730AlbRecCol_" + sGXsfl_220_idx ;
      Z3730AlbRecCol = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3731AlbRecIdPz_" + sGXsfl_220_idx ;
      Z3731AlbRecIdPz = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3732AlbRecIdRc_" + sGXsfl_220_idx ;
      Z3732AlbRecIdRc = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4410AlbRecPal_" + sGXsfl_220_idx ;
      Z4410AlbRecPal = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7408ALRPIELOC_" + sGXsfl_220_idx ;
      Z7408ALRPIELOC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7409ALRPIETEL_" + sGXsfl_220_idx ;
      Z7409ALRPIETEL = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7410ALRPIEOPE_" + sGXsfl_220_idx ;
      Z7410ALRPIEOPE = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7411ALRPIEST_" + sGXsfl_220_idx ;
      Z7411ALRPIEST = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7792AlbRecPnt_" + sGXsfl_220_idx ;
      Z7792AlbRecPnt = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7793AlbRecCo1_" + sGXsfl_220_idx ;
      Z7793AlbRecCo1 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7794AlbRecCo2_" + sGXsfl_220_idx ;
      Z7794AlbRecCo2 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7998AlbHdr_" + sGXsfl_220_idx ;
      Z7998AlbHdr = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7999AlbHdrr_" + sGXsfl_220_idx ;
      Z7999AlbHdrr = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8000AlbHdrp_" + sGXsfl_220_idx ;
      Z8000AlbHdrp = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8001AlbSerT_" + sGXsfl_220_idx ;
      Z8001AlbSerT = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8002AlbColNm_" + sGXsfl_220_idx ;
      Z8002AlbColNm = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8003AlbColNn_" + sGXsfl_220_idx ;
      Z8003AlbColNn = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8004AlbKgsPf_" + sGXsfl_220_idx ;
      Z8004AlbKgsPf = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8005AlbMtsPf_" + sGXsfl_220_idx ;
      Z8005AlbMtsPf = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8006AlbAfin_" + sGXsfl_220_idx ;
      Z8006AlbAfin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8037AlbNPed_" + sGXsfl_220_idx ;
      Z8037AlbNPed = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8051AlbObsp_" + sGXsfl_220_idx ;
      Z8051AlbObsp = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8679Bod_Dib_" + sGXsfl_220_idx ;
      Z8679Bod_Dib = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8680Bod_Tua_" + sGXsfl_220_idx ;
      Z8680Bod_Tua = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z8681Bod_Tub_" + sGXsfl_220_idx ;
      Z8681Bod_Tub = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z8682Bod_Tuc_" + sGXsfl_220_idx ;
      Z8682Bod_Tuc = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z8683Bod_Hilz_" + sGXsfl_220_idx ;
      Z8683Bod_Hilz = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8684Bod_FecE_" + sGXsfl_220_idx ;
      Z8684Bod_FecE = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z8685Bod_PedOr_" + sGXsfl_220_idx ;
      Z8685Bod_PedOr = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8774Bod_Rack_" + sGXsfl_220_idx ;
      Z8774Bod_Rack = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8775Bod_PoS_" + sGXsfl_220_idx ;
      Z8775Bod_PoS = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8776Bod_Ok_" + sGXsfl_220_idx ;
      Z8776Bod_Ok = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8779Bod_Talla_" + sGXsfl_220_idx ;
      Z8779Bod_Talla = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8780Bod_Und_" + sGXsfl_220_idx ;
      Z8780Bod_Und = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8781Bod_Medt_" + sGXsfl_220_idx ;
      Z8781Bod_Medt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8831Bod_ColNNn_" + sGXsfl_220_idx ;
      Z8831Bod_ColNNn = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8832Bod_Por_" + sGXsfl_220_idx ;
      Z8832Bod_Por = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8833Bod_codb_" + sGXsfl_220_idx ;
      Z8833Bod_codb = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8834Bod_Pes_" + sGXsfl_220_idx ;
      Z8834Bod_Pes = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8848Bod_DibO_" + sGXsfl_220_idx ;
      Z8848Bod_DibO = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9376Bod_item3_" + sGXsfl_220_idx ;
      Z9376Bod_item3 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9540Bod_ToE_" + sGXsfl_220_idx ;
      Z9540Bod_ToE = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9560Bod_DescP_" + sGXsfl_220_idx ;
      Z9560Bod_DescP = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9561Bod_CVar_" + sGXsfl_220_idx ;
      Z9561Bod_CVar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9562Bod_NVar_" + sGXsfl_220_idx ;
      Z9562Bod_NVar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4795AlRPieCal_" + sGXsfl_220_idx ;
      A4795AlRPieCal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_299_" + sGXsfl_220_idx ;
      nRcdDeleted_299 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_299_" + sGXsfl_220_idx ;
      nRcdExists_299 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_299_" + sGXsfl_220_idx ;
      nIsMod_299 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbRecPie_Enabled = edtAlbRecPie_Enabled ;
   }

   public void confirmValues10U0( )
   {
      nGXsfl_220_idx = 0 ;
      sGXsfl_220_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_220_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_220299( ) ;
      while ( nGXsfl_220_idx < nRC_GXsfl_220 )
      {
         nGXsfl_220_idx = (int)(nGXsfl_220_idx+1) ;
         sGXsfl_220_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_220_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_220299( ) ;
         httpContext.changePostValue( "Z2159AlbRecPie_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z2159AlbRecPie_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2159AlbRecPie_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z4795AlRPieCal_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z4795AlRPieCal_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4795AlRPieCal_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z4411AlbRecFec_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z4411AlbRecFec_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4411AlbRecFec_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z2154AlbRecAnh_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z2154AlbRecAnh_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2154AlbRecAnh_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z2157AlbRecMtr_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z2157AlbRecMtr_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2157AlbRecMtr_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z2155AlbRecKgm_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z2155AlbRecKgm_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2155AlbRecKgm_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z2158AlbRecMtrU_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z2158AlbRecMtrU_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2158AlbRecMtrU_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z2156AlbRecKgmU_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z2156AlbRecKgmU_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2156AlbRecKgmU_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z3730AlbRecCol_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z3730AlbRecCol_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3730AlbRecCol_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z3731AlbRecIdPz_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z3731AlbRecIdPz_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3731AlbRecIdPz_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z3732AlbRecIdRc_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z3732AlbRecIdRc_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3732AlbRecIdRc_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z4410AlbRecPal_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z4410AlbRecPal_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4410AlbRecPal_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z7408ALRPIELOC_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z7408ALRPIELOC_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7408ALRPIELOC_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z7409ALRPIETEL_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z7409ALRPIETEL_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7409ALRPIETEL_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z7410ALRPIEOPE_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z7410ALRPIEOPE_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7410ALRPIEOPE_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z7411ALRPIEST_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z7411ALRPIEST_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7411ALRPIEST_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z7792AlbRecPnt_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z7792AlbRecPnt_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7792AlbRecPnt_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z7793AlbRecCo1_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z7793AlbRecCo1_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7793AlbRecCo1_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z7794AlbRecCo2_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z7794AlbRecCo2_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7794AlbRecCo2_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z7998AlbHdr_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z7998AlbHdr_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7998AlbHdr_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z7999AlbHdrr_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z7999AlbHdrr_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7999AlbHdrr_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8000AlbHdrp_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8000AlbHdrp_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8000AlbHdrp_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8001AlbSerT_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8001AlbSerT_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8001AlbSerT_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8002AlbColNm_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8002AlbColNm_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8002AlbColNm_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8003AlbColNn_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8003AlbColNn_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8003AlbColNn_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8004AlbKgsPf_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8004AlbKgsPf_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8004AlbKgsPf_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8005AlbMtsPf_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8005AlbMtsPf_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8005AlbMtsPf_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8006AlbAfin_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8006AlbAfin_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8006AlbAfin_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8037AlbNPed_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8037AlbNPed_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8037AlbNPed_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8051AlbObsp_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8051AlbObsp_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8051AlbObsp_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8679Bod_Dib_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8679Bod_Dib_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8679Bod_Dib_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8680Bod_Tua_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8680Bod_Tua_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8680Bod_Tua_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8681Bod_Tub_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8681Bod_Tub_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8681Bod_Tub_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8682Bod_Tuc_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8682Bod_Tuc_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8682Bod_Tuc_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8683Bod_Hilz_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8683Bod_Hilz_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8683Bod_Hilz_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8684Bod_FecE_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8684Bod_FecE_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8684Bod_FecE_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8685Bod_PedOr_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8685Bod_PedOr_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8685Bod_PedOr_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8774Bod_Rack_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8774Bod_Rack_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8774Bod_Rack_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8775Bod_PoS_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8775Bod_PoS_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8775Bod_PoS_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8776Bod_Ok_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8776Bod_Ok_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8776Bod_Ok_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8779Bod_Talla_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8779Bod_Talla_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8779Bod_Talla_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8780Bod_Und_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8780Bod_Und_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8780Bod_Und_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8781Bod_Medt_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8781Bod_Medt_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8781Bod_Medt_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8831Bod_ColNNn_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8831Bod_ColNNn_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8831Bod_ColNNn_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8832Bod_Por_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8832Bod_Por_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8832Bod_Por_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8833Bod_codb_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8833Bod_codb_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8833Bod_codb_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8834Bod_Pes_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8834Bod_Pes_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8834Bod_Pes_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z8848Bod_DibO_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z8848Bod_DibO_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8848Bod_DibO_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z9376Bod_item3_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z9376Bod_item3_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9376Bod_item3_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z9540Bod_ToE_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z9540Bod_ToE_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9540Bod_ToE_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z9560Bod_DescP_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z9560Bod_DescP_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9560Bod_DescP_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z9561Bod_CVar_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z9561Bod_CVar_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9561Bod_CVar_"+sGXsfl_220_idx) ;
         httpContext.changePostValue( "Z9562Bod_NVar_"+sGXsfl_220_idx, httpContext.cgiGet( "ZT_"+"Z9562Bod_NVar_"+sGXsfl_220_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9562Bod_NVar_"+sGXsfl_220_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.talmpz2", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"EmprCod","AlbRecCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( Z60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( Z54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z46AlbREnt", GXutil.rtrim( Z46AlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z50AlbRLoc", GXutil.rtrim( Z50AlbRLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z49AlbRFen", localUtil.dtoc( Z49AlbRFen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z55AlbRReo", GXutil.rtrim( Z55AlbRReo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z53AlbRPieReb", GXutil.ltrim( localUtil.ntoc( Z53AlbRPieReb, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z59AlbRUniReb", GXutil.ltrim( localUtil.ntoc( Z59AlbRUniReb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z48AlbRFecUlt", localUtil.dtoc( Z48AlbRFecUlt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z47AlbREst", GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1222AlbNumEti", GXutil.ltrim( localUtil.ntoc( Z1222AlbNumEti, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1291AlbRDes", GXutil.rtrim( Z1291AlbRDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4606AlbRHEn", localUtil.ttoc( Z4606AlbRHEn, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6182AlbrNF", GXutil.rtrim( Z6182AlbrNF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8835Bod_UltPz", GXutil.rtrim( Z8835Bod_UltPz));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z970ProceCod", GXutil.ltrim( localUtil.ntoc( Z970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1211TipEntCod", GXutil.ltrim( localUtil.ntoc( Z1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_220", GXutil.ltrim( localUtil.ntoc( nGXsfl_220_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBCUM", GXutil.rtrim( AV18AlbCum));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLINDALANA", GXutil.ltrim( localUtil.ntoc( AV67Lindalana, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIECAL", GXutil.rtrim( A4795AlRPieCal));
      app.GxWebStd.gx_hidden_field( httpContext, "vPIEUTI", GXutil.rtrim( AV54PieUti));
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
      return formatLink("app.talmpz2", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"EmprCod","AlbRecCod"})  ;
   }

   public String getPgmname( )
   {
      return "TALMPZ2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ALMACEN DE PIEZAS - DETALLE", "") ;
   }

   public void initializeNonKey10U7( )
   {
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A60AlbRUniUti = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A52AlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A54AlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      AV18AlbCum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      A57AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      A2153AlbDetPieU = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      A51AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      AV67Lindalana = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67Lindalana", GXutil.str( AV67Lindalana, 1, 0));
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A45AlbRef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A46AlbREnt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
      A56AlbRUni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A50AlbRLoc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
      A49AlbRFen = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
      A55AlbRReo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      A53AlbRPieReb = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
      A59AlbRUniReb = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
      A48AlbRFecUlt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      A47AlbREst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      A1211TipEntCod = (short)(0) ;
      n1211TipEntCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
      A1212TipEntNom = "" ;
      n1212TipEntNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
      A1222AlbNumEti = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
      A1291AlbRDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
      A970ProceCod = (short)(0) ;
      n970ProceCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      A971ProceNom = "" ;
      n971ProceNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
      A6182AlbrNF = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6182AlbrNF", A6182AlbrNF);
      A8835Bod_UltPz = "" ;
      n8835Bod_UltPz = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8835Bod_UltPz", A8835Bod_UltPz);
      A4606AlbRHEn = GXutil.now( ) ;
      n4606AlbRHEn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z52AlbRPieEnt = 0 ;
      Z54AlbRPieUti = 0 ;
      Z45AlbRef = "" ;
      Z46AlbREnt = "" ;
      Z56AlbRUni = "" ;
      Z50AlbRLoc = "" ;
      Z49AlbRFen = GXutil.nullDate() ;
      Z55AlbRReo = "" ;
      Z53AlbRPieReb = 0 ;
      Z59AlbRUniReb = DecimalUtil.ZERO ;
      Z48AlbRFecUlt = GXutil.nullDate() ;
      Z47AlbREst = (byte)(0) ;
      Z1222AlbNumEti = (short)(0) ;
      Z1291AlbRDes = "" ;
      Z4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      Z6182AlbrNF = "" ;
      Z8835Bod_UltPz = "" ;
      Z252CliCod = 0 ;
      Z840TrnCod = (short)(0) ;
      Z970ProceCod = (short)(0) ;
      Z1211TipEntCod = (short)(0) ;
   }

   public void initAll10U7( )
   {
      initializeNonKey10U7( ) ;
   }

   public void standaloneModalInsert( )
   {
      A4606AlbRHEn = i4606AlbRHEn ;
      n4606AlbRHEn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
   }

   public void initializeNonKey10U299( )
   {
      AV54PieUti = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54PieUti", AV54PieUti);
      A4795AlRPieCal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", A4795AlRPieCal);
      A2154AlbRecAnh = (short)(0) ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A3730AlbRecCol = (short)(0) ;
      A3731AlbRecIdPz = "" ;
      A3732AlbRecIdRc = 0 ;
      A4410AlbRecPal = DecimalUtil.ZERO ;
      A7408ALRPIELOC = "" ;
      A7409ALRPIETEL = (short)(0) ;
      n7409ALRPIETEL = false ;
      A7410ALRPIEOPE = "" ;
      n7410ALRPIEOPE = false ;
      A7411ALRPIEST = "" ;
      n7411ALRPIEST = false ;
      A7792AlbRecPnt = (short)(0) ;
      n7792AlbRecPnt = false ;
      A7793AlbRecCo1 = "" ;
      n7793AlbRecCo1 = false ;
      A7794AlbRecCo2 = 0 ;
      n7794AlbRecCo2 = false ;
      A7998AlbHdr = 0 ;
      n7998AlbHdr = false ;
      A7999AlbHdrr = (byte)(0) ;
      n7999AlbHdrr = false ;
      A8000AlbHdrp = "" ;
      n8000AlbHdrp = false ;
      A8001AlbSerT = "" ;
      n8001AlbSerT = false ;
      A8002AlbColNm = "" ;
      n8002AlbColNm = false ;
      A8003AlbColNn = 0 ;
      n8003AlbColNn = false ;
      A8004AlbKgsPf = DecimalUtil.ZERO ;
      n8004AlbKgsPf = false ;
      A8005AlbMtsPf = DecimalUtil.ZERO ;
      n8005AlbMtsPf = false ;
      A8006AlbAfin = (byte)(0) ;
      n8006AlbAfin = false ;
      A8037AlbNPed = "" ;
      n8037AlbNPed = false ;
      A8051AlbObsp = "" ;
      n8051AlbObsp = false ;
      A8679Bod_Dib = "" ;
      n8679Bod_Dib = false ;
      A8680Bod_Tua = 0 ;
      n8680Bod_Tua = false ;
      A8681Bod_Tub = 0 ;
      n8681Bod_Tub = false ;
      A8682Bod_Tuc = 0 ;
      n8682Bod_Tuc = false ;
      A8683Bod_Hilz = "" ;
      n8683Bod_Hilz = false ;
      A8684Bod_FecE = GXutil.nullDate() ;
      n8684Bod_FecE = false ;
      A8685Bod_PedOr = "" ;
      n8685Bod_PedOr = false ;
      A8774Bod_Rack = "" ;
      n8774Bod_Rack = false ;
      A8775Bod_PoS = "" ;
      n8775Bod_PoS = false ;
      A8776Bod_Ok = "" ;
      n8776Bod_Ok = false ;
      A8779Bod_Talla = "" ;
      A8780Bod_Und = (short)(0) ;
      A8781Bod_Medt = "" ;
      n8781Bod_Medt = false ;
      A8831Bod_ColNNn = "" ;
      n8831Bod_ColNNn = false ;
      A8832Bod_Por = DecimalUtil.ZERO ;
      n8832Bod_Por = false ;
      A8833Bod_codb = "" ;
      n8833Bod_codb = false ;
      A8834Bod_Pes = "" ;
      n8834Bod_Pes = false ;
      A8848Bod_DibO = "" ;
      n8848Bod_DibO = false ;
      A9376Bod_item3 = "" ;
      n9376Bod_item3 = false ;
      A9540Bod_ToE = "" ;
      n9540Bod_ToE = false ;
      A9560Bod_DescP = "" ;
      n9560Bod_DescP = false ;
      A9561Bod_CVar = "" ;
      n9561Bod_CVar = false ;
      A9562Bod_NVar = "" ;
      n9562Bod_NVar = false ;
      A4411AlbRecFec = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n4411AlbRecFec = false ;
      Z4795AlRPieCal = "" ;
      Z4411AlbRecFec = GXutil.resetTime( GXutil.nullDate() );
      Z2154AlbRecAnh = (short)(0) ;
      Z2157AlbRecMtr = DecimalUtil.ZERO ;
      Z2155AlbRecKgm = DecimalUtil.ZERO ;
      Z2158AlbRecMtrU = DecimalUtil.ZERO ;
      Z2156AlbRecKgmU = DecimalUtil.ZERO ;
      Z3730AlbRecCol = (short)(0) ;
      Z3731AlbRecIdPz = "" ;
      Z3732AlbRecIdRc = 0 ;
      Z4410AlbRecPal = DecimalUtil.ZERO ;
      Z7408ALRPIELOC = "" ;
      Z7409ALRPIETEL = (short)(0) ;
      Z7410ALRPIEOPE = "" ;
      Z7411ALRPIEST = "" ;
      Z7792AlbRecPnt = (short)(0) ;
      Z7793AlbRecCo1 = "" ;
      Z7794AlbRecCo2 = 0 ;
      Z7998AlbHdr = 0 ;
      Z7999AlbHdrr = (byte)(0) ;
      Z8000AlbHdrp = "" ;
      Z8001AlbSerT = "" ;
      Z8002AlbColNm = "" ;
      Z8003AlbColNn = 0 ;
      Z8004AlbKgsPf = DecimalUtil.ZERO ;
      Z8005AlbMtsPf = DecimalUtil.ZERO ;
      Z8006AlbAfin = (byte)(0) ;
      Z8037AlbNPed = "" ;
      Z8051AlbObsp = "" ;
      Z8679Bod_Dib = "" ;
      Z8680Bod_Tua = 0 ;
      Z8681Bod_Tub = 0 ;
      Z8682Bod_Tuc = 0 ;
      Z8683Bod_Hilz = "" ;
      Z8684Bod_FecE = GXutil.nullDate() ;
      Z8685Bod_PedOr = "" ;
      Z8774Bod_Rack = "" ;
      Z8775Bod_PoS = "" ;
      Z8776Bod_Ok = "" ;
      Z8779Bod_Talla = "" ;
      Z8780Bod_Und = (short)(0) ;
      Z8781Bod_Medt = "" ;
      Z8831Bod_ColNNn = "" ;
      Z8832Bod_Por = DecimalUtil.ZERO ;
      Z8833Bod_codb = "" ;
      Z8834Bod_Pes = "" ;
      Z8848Bod_DibO = "" ;
      Z9376Bod_item3 = "" ;
      Z9540Bod_ToE = "" ;
      Z9560Bod_DescP = "" ;
      Z9561Bod_CVar = "" ;
      Z9562Bod_NVar = "" ;
   }

   public void initAll10U299( )
   {
      A2159AlbRecPie = "" ;
      initializeNonKey10U299( ) ;
   }

   public void standaloneModalInsert10U299( )
   {
      A4411AlbRecFec = i4411AlbRecFec ;
      n4411AlbRecFec = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241535933", true, true);
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
      httpContext.AddJavascriptSource("talmpz2.js", "?20268241535933", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties299( )
   {
      edtAlbRecPie_Enabled = defedtAlbRecPie_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_220_Refreshing);
   }

   public void startgridcontrol220( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_299, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_299_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2159AlbRecPie));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2154AlbRecAnh, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecAnh_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtrU_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgmU_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3730AlbRecCol, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3731AlbRecIdPz));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecIdPz_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3732AlbRecIdRc, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecIdRc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4410AlbRecPal, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7408ALRPIELOC));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtALRPIELOC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7409ALRPIETEL, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtALRPIETEL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7410ALRPIEOPE));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtALRPIEOPE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7411ALRPIEST));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtALRPIEST_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A4411AlbRecFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecFec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7792AlbRecPnt, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7793AlbRecCo1));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCo1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7794AlbRecCo2, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCo2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7998AlbHdr, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7999AlbHdrr, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8000AlbHdrp));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdrp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8001AlbSerT));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbSerT_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8002AlbColNm));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbColNm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8003AlbColNn, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbColNn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8004AlbKgsPf, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbKgsPf_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8005AlbMtsPf, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbMtsPf_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8006AlbAfin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbAfin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8037AlbNPed));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbNPed_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A8051AlbObsp);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbObsp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8679Bod_Dib));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Dib_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8680Bod_Tua, (byte)(10), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Tua_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8681Bod_Tub, (byte)(10), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Tub_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8682Bod_Tuc, (byte)(10), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Tuc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8683Bod_Hilz));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Hilz_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A8684Bod_FecE, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_FecE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8685Bod_PedOr));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_PedOr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8774Bod_Rack));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Rack_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8775Bod_PoS));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_PoS_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8776Bod_Ok));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Ok_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8779Bod_Talla));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Talla_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8780Bod_Und, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Und_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8781Bod_Medt));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Medt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8831Bod_ColNNn));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_ColNNn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8832Bod_Por, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Por_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8833Bod_codb));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_codb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8834Bod_Pes));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_Pes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8848Bod_DibO));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_DibO_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9376Bod_item3));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_item3_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9540Bod_ToE));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_ToE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9560Bod_DescP));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_DescP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9561Bod_CVar));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_CVar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9562Bod_NVar));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBod_NVar_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtAlbRef_Internalname = "ALBREF" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtTrnNom_Internalname = "TRNNOM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtAlbREnt_Internalname = "ALBRENT" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtAlbRLoc_Internalname = "ALBRLOC" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtAlbRFen_Internalname = "ALBRFEN" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      cmbAlbRReo.setInternalname( "ALBRREO" );
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtAlbRPieReb_Internalname = "ALBRPIEREB" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtAlbRUniReb_Internalname = "ALBRUNIREB" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtAlbRFecUlt_Internalname = "ALBRFECULT" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      cmbAlbREst.setInternalname( "ALBREST" );
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtTipEntCod_Internalname = "TIPENTCOD" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtTipEntNom_Internalname = "TIPENTNOM" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtAlbNumEti_Internalname = "ALBNUMETI" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtAlbRDes_Internalname = "ALBRDES" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtProceCod_Internalname = "PROCECOD" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtProceNom_Internalname = "PROCENOM" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtAlbDetPie_Internalname = "ALBDETPIE" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtAlbDetMtr_Internalname = "ALBDETMTR" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtAlbDetKgm_Internalname = "ALBDETKGM" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtAlbDetMtrU_Internalname = "ALBDETMTRU" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtAlbDetKgmU_Internalname = "ALBDETKGMU" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtAlbDetMtrD_Internalname = "ALBDETMTRD" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtAlbDetKgmD_Internalname = "ALBDETKGMD" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtAlbDetPieU_Internalname = "ALBDETPIEU" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtAlbRHEn_Internalname = "ALBRHEN" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtAlbrNF_Internalname = "ALBRNF" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtBod_UltPz_Internalname = "BOD_ULTPZ" ;
      edtavnRcdDeleted_299_Internalname = "vNRCDDELETED_299" ;
      edtAlbRecPie_Internalname = "ALBRECPIE" ;
      edtAlbRecAnh_Internalname = "ALBRECANH" ;
      edtAlbRecMtr_Internalname = "ALBRECMTR" ;
      edtAlbRecKgm_Internalname = "ALBRECKGM" ;
      edtAlbRecMtrU_Internalname = "ALBRECMTRU" ;
      edtAlbRecKgmU_Internalname = "ALBRECKGMU" ;
      edtAlbRecCol_Internalname = "ALBRECCOL" ;
      edtAlbRecIdPz_Internalname = "ALBRECIDPZ" ;
      edtAlbRecIdRc_Internalname = "ALBRECIDRC" ;
      edtAlbRecPal_Internalname = "ALBRECPAL" ;
      edtALRPIELOC_Internalname = "ALRPIELOC" ;
      edtALRPIETEL_Internalname = "ALRPIETEL" ;
      edtALRPIEOPE_Internalname = "ALRPIEOPE" ;
      edtALRPIEST_Internalname = "ALRPIEST" ;
      edtAlbRecFec_Internalname = "ALBRECFEC" ;
      edtAlbRecPnt_Internalname = "ALBRECPNT" ;
      edtAlbRecCo1_Internalname = "ALBRECCO1" ;
      edtAlbRecCo2_Internalname = "ALBRECCO2" ;
      edtAlbHdr_Internalname = "ALBHDR" ;
      edtAlbHdrr_Internalname = "ALBHDRR" ;
      edtAlbHdrp_Internalname = "ALBHDRP" ;
      edtAlbSerT_Internalname = "ALBSERT" ;
      edtAlbColNm_Internalname = "ALBCOLNM" ;
      edtAlbColNn_Internalname = "ALBCOLNN" ;
      edtAlbKgsPf_Internalname = "ALBKGSPF" ;
      edtAlbMtsPf_Internalname = "ALBMTSPF" ;
      edtAlbAfin_Internalname = "ALBAFIN" ;
      edtAlbNPed_Internalname = "ALBNPED" ;
      edtAlbObsp_Internalname = "ALBOBSP" ;
      edtBod_Dib_Internalname = "BOD_DIB" ;
      edtBod_Tua_Internalname = "BOD_TUA" ;
      edtBod_Tub_Internalname = "BOD_TUB" ;
      edtBod_Tuc_Internalname = "BOD_TUC" ;
      edtBod_Hilz_Internalname = "BOD_HILZ" ;
      edtBod_FecE_Internalname = "BOD_FECE" ;
      edtBod_PedOr_Internalname = "BOD_PEDOR" ;
      edtBod_Rack_Internalname = "BOD_RACK" ;
      edtBod_PoS_Internalname = "BOD_POS" ;
      edtBod_Ok_Internalname = "BOD_OK" ;
      edtBod_Talla_Internalname = "BOD_TALLA" ;
      edtBod_Und_Internalname = "BOD_UND" ;
      edtBod_Medt_Internalname = "BOD_MEDT" ;
      edtBod_ColNNn_Internalname = "BOD_COLNNN" ;
      edtBod_Por_Internalname = "BOD_POR" ;
      edtBod_codb_Internalname = "BOD_CODB" ;
      edtBod_Pes_Internalname = "BOD_PES" ;
      edtBod_DibO_Internalname = "BOD_DIBO" ;
      edtBod_item3_Internalname = "BOD_ITEM3" ;
      edtBod_ToE_Internalname = "BOD_TOE" ;
      edtBod_DescP_Internalname = "BOD_DESCP" ;
      edtBod_CVar_Internalname = "BOD_CVAR" ;
      edtBod_NVar_Internalname = "BOD_NVAR" ;
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
      Form.setCaption( httpContext.getMessage( "ALMACEN DE PIEZAS - DETALLE", "") );
      edtBod_NVar_Jsonclick = "" ;
      edtBod_CVar_Jsonclick = "" ;
      edtBod_DescP_Jsonclick = "" ;
      edtBod_ToE_Jsonclick = "" ;
      edtBod_item3_Jsonclick = "" ;
      edtBod_DibO_Jsonclick = "" ;
      edtBod_Pes_Jsonclick = "" ;
      edtBod_codb_Jsonclick = "" ;
      edtBod_Por_Jsonclick = "" ;
      edtBod_ColNNn_Jsonclick = "" ;
      edtBod_Medt_Jsonclick = "" ;
      edtBod_Und_Jsonclick = "" ;
      edtBod_Talla_Jsonclick = "" ;
      edtBod_Ok_Jsonclick = "" ;
      edtBod_PoS_Jsonclick = "" ;
      edtBod_Rack_Jsonclick = "" ;
      edtBod_PedOr_Jsonclick = "" ;
      edtBod_FecE_Jsonclick = "" ;
      edtBod_Hilz_Jsonclick = "" ;
      edtBod_Tuc_Jsonclick = "" ;
      edtBod_Tub_Jsonclick = "" ;
      edtBod_Tua_Jsonclick = "" ;
      edtBod_Dib_Jsonclick = "" ;
      edtAlbObsp_Jsonclick = "" ;
      edtAlbNPed_Jsonclick = "" ;
      edtAlbAfin_Jsonclick = "" ;
      edtAlbMtsPf_Jsonclick = "" ;
      edtAlbKgsPf_Jsonclick = "" ;
      edtAlbColNn_Jsonclick = "" ;
      edtAlbColNm_Jsonclick = "" ;
      edtAlbSerT_Jsonclick = "" ;
      edtAlbHdrp_Jsonclick = "" ;
      edtAlbHdrr_Jsonclick = "" ;
      edtAlbHdr_Jsonclick = "" ;
      edtAlbRecCo2_Jsonclick = "" ;
      edtAlbRecCo1_Jsonclick = "" ;
      edtAlbRecPnt_Jsonclick = "" ;
      edtAlbRecFec_Jsonclick = "" ;
      edtALRPIEST_Jsonclick = "" ;
      edtALRPIEOPE_Jsonclick = "" ;
      edtALRPIETEL_Jsonclick = "" ;
      edtALRPIELOC_Jsonclick = "" ;
      edtAlbRecPal_Jsonclick = "" ;
      edtAlbRecIdRc_Jsonclick = "" ;
      edtAlbRecIdPz_Jsonclick = "" ;
      edtAlbRecCol_Jsonclick = "" ;
      edtAlbRecKgmU_Jsonclick = "" ;
      edtAlbRecMtrU_Jsonclick = "" ;
      edtAlbRecKgm_Jsonclick = "" ;
      edtAlbRecMtr_Jsonclick = "" ;
      edtAlbRecAnh_Jsonclick = "" ;
      edtAlbRecPie_Jsonclick = "" ;
      edtavnRcdDeleted_299_Jsonclick = "" ;
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
      edtBod_NVar_Enabled = 1 ;
      edtBod_CVar_Enabled = 1 ;
      edtBod_DescP_Enabled = 1 ;
      edtBod_ToE_Enabled = 1 ;
      edtBod_item3_Enabled = 1 ;
      edtBod_DibO_Enabled = 1 ;
      edtBod_Pes_Enabled = 1 ;
      edtBod_codb_Enabled = 1 ;
      edtBod_Por_Enabled = 1 ;
      edtBod_ColNNn_Enabled = 1 ;
      edtBod_Medt_Enabled = 1 ;
      edtBod_Und_Enabled = 1 ;
      edtBod_Talla_Enabled = 1 ;
      edtBod_Ok_Enabled = 1 ;
      edtBod_PoS_Enabled = 1 ;
      edtBod_Rack_Enabled = 1 ;
      edtBod_PedOr_Enabled = 1 ;
      edtBod_FecE_Enabled = 1 ;
      edtBod_Hilz_Enabled = 1 ;
      edtBod_Tuc_Enabled = 1 ;
      edtBod_Tub_Enabled = 1 ;
      edtBod_Tua_Enabled = 1 ;
      edtBod_Dib_Enabled = 1 ;
      edtAlbObsp_Enabled = 1 ;
      edtAlbNPed_Enabled = 1 ;
      edtAlbAfin_Enabled = 1 ;
      edtAlbMtsPf_Enabled = 1 ;
      edtAlbKgsPf_Enabled = 1 ;
      edtAlbColNn_Enabled = 1 ;
      edtAlbColNm_Enabled = 1 ;
      edtAlbSerT_Enabled = 1 ;
      edtAlbHdrp_Enabled = 1 ;
      edtAlbHdrr_Enabled = 1 ;
      edtAlbHdr_Enabled = 1 ;
      edtAlbRecCo2_Enabled = 1 ;
      edtAlbRecCo1_Enabled = 1 ;
      edtAlbRecPnt_Enabled = 1 ;
      edtAlbRecFec_Enabled = 1 ;
      edtALRPIEST_Enabled = 1 ;
      edtALRPIEOPE_Enabled = 1 ;
      edtALRPIETEL_Enabled = 1 ;
      edtALRPIELOC_Enabled = 1 ;
      edtAlbRecPal_Enabled = 1 ;
      edtAlbRecIdRc_Enabled = 1 ;
      edtAlbRecIdPz_Enabled = 1 ;
      edtAlbRecCol_Enabled = 1 ;
      edtAlbRecKgmU_Enabled = 1 ;
      edtAlbRecMtrU_Enabled = 1 ;
      edtAlbRecKgm_Enabled = 1 ;
      edtAlbRecMtr_Enabled = 1 ;
      edtAlbRecAnh_Enabled = 1 ;
      edtAlbRecPie_Enabled = 1 ;
      edtavnRcdDeleted_299_Enabled = 1 ;
      edtBod_UltPz_Jsonclick = "" ;
      edtBod_UltPz_Backcolor = (int)(0xFFFFFF) ;
      edtBod_UltPz_Enabled = 1 ;
      edtAlbrNF_Jsonclick = "" ;
      edtAlbrNF_Backcolor = (int)(0xFFFFFF) ;
      edtAlbrNF_Enabled = 1 ;
      edtAlbRHEn_Jsonclick = "" ;
      edtAlbRHEn_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRHEn_Enabled = 1 ;
      edtAlbDetPieU_Jsonclick = "" ;
      edtAlbDetPieU_Backcolor = (int)(0xFFFFFF) ;
      edtAlbDetPieU_Enabled = 0 ;
      edtAlbDetKgmD_Jsonclick = "" ;
      edtAlbDetKgmD_Backcolor = (int)(0xFFFFFF) ;
      edtAlbDetKgmD_Enabled = 0 ;
      edtAlbDetMtrD_Jsonclick = "" ;
      edtAlbDetMtrD_Backcolor = (int)(0xFFFFFF) ;
      edtAlbDetMtrD_Enabled = 0 ;
      edtAlbDetKgmU_Jsonclick = "" ;
      edtAlbDetKgmU_Backcolor = (int)(0xFFFFFF) ;
      edtAlbDetKgmU_Enabled = 0 ;
      edtAlbDetMtrU_Jsonclick = "" ;
      edtAlbDetMtrU_Backcolor = (int)(0xFFFFFF) ;
      edtAlbDetMtrU_Enabled = 0 ;
      edtAlbDetKgm_Jsonclick = "" ;
      edtAlbDetKgm_Backcolor = (int)(0xFFFFFF) ;
      edtAlbDetKgm_Enabled = 0 ;
      edtAlbDetMtr_Jsonclick = "" ;
      edtAlbDetMtr_Backcolor = (int)(0xFFFFFF) ;
      edtAlbDetMtr_Enabled = 0 ;
      edtAlbDetPie_Jsonclick = "" ;
      edtAlbDetPie_Backcolor = (int)(0xFFFFFF) ;
      edtAlbDetPie_Enabled = 0 ;
      edtProceNom_Jsonclick = "" ;
      edtProceNom_Backcolor = (int)(0xFFFFFF) ;
      edtProceNom_Enabled = 0 ;
      edtProceCod_Jsonclick = "" ;
      edtProceCod_Backcolor = (int)(0xFFFFFF) ;
      edtProceCod_Enabled = 1 ;
      edtAlbRDes_Jsonclick = "" ;
      edtAlbRDes_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRDes_Enabled = 1 ;
      edtAlbNumEti_Jsonclick = "" ;
      edtAlbNumEti_Backcolor = (int)(0xFFFFFF) ;
      edtAlbNumEti_Enabled = 1 ;
      edtTipEntNom_Jsonclick = "" ;
      edtTipEntNom_Backcolor = (int)(0xFFFFFF) ;
      edtTipEntNom_Enabled = 0 ;
      edtTipEntCod_Jsonclick = "" ;
      edtTipEntCod_Backcolor = (int)(0xFFFFFF) ;
      edtTipEntCod_Enabled = 1 ;
      cmbAlbREst.setJsonclick( "" );
      cmbAlbREst.setEnabled( 1 );
      cmbAlbREst.setIBackground( (int)(0xFFFFFF) );
      edtAlbRFecUlt_Jsonclick = "" ;
      edtAlbRFecUlt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRFecUlt_Enabled = 1 ;
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRUniDis_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUniDis_Enabled = 0 ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRPieDis_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRPieDis_Enabled = 0 ;
      edtAlbRUniReb_Jsonclick = "" ;
      edtAlbRUniReb_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUniReb_Enabled = 1 ;
      edtAlbRUniUti_Jsonclick = "" ;
      edtAlbRUniUti_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUniUti_Enabled = 1 ;
      edtAlbRPieReb_Jsonclick = "" ;
      edtAlbRPieReb_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRPieReb_Enabled = 1 ;
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRPieUti_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRPieUti_Enabled = 1 ;
      cmbAlbRReo.setJsonclick( "" );
      cmbAlbRReo.setEnabled( 1 );
      cmbAlbRReo.setIBackground( (int)(0xFFFFFF) );
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRUniEnt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUniEnt_Enabled = 1 ;
      edtAlbRFen_Jsonclick = "" ;
      edtAlbRFen_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRFen_Enabled = 1 ;
      edtAlbRLoc_Jsonclick = "" ;
      edtAlbRLoc_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRLoc_Enabled = 1 ;
      cmbAlbRUni.setJsonclick( "" );
      cmbAlbRUni.setEnabled( 1 );
      cmbAlbRUni.setIBackground( (int)(0xFFFFFF) );
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRPieEnt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRPieEnt_Enabled = 1 ;
      edtAlbREnt_Jsonclick = "" ;
      edtAlbREnt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbREnt_Enabled = 1 ;
      edtTrnNom_Jsonclick = "" ;
      edtTrnNom_Backcolor = (int)(0xFFFFFF) ;
      edtTrnNom_Enabled = 0 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Backcolor = (int)(0xFFFFFF) ;
      edtTrnCod_Enabled = 1 ;
      edtAlbRef_Jsonclick = "" ;
      edtAlbRef_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRef_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRecCod_Enabled = 0 ;
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

   public void gx15asaalbdetpieu10U7( String A396EmprCod ,
                                      int A44AlbRecCod ,
                                      String A56AlbRUni )
   {
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
      {
         A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            A2153AlbDetPieU = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2153AlbDetPieU, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx19asaalbdetpieu10U299( String A396EmprCod ,
                                        int A44AlbRecCod ,
                                        String A56AlbRUni )
   {
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
      {
         A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            A2153AlbDetPieU = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2153AlbDetPieU, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx23asapieuti10U299( String A396EmprCod ,
                                    int A44AlbRecCod ,
                                    String A2159AlbRecPie )
   {
      if ( true /* Level */ )
      {
         GXt_char3 = AV54PieUti ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int2[0] = A44AlbRecCod ;
         GXv_char4[0] = A2159AlbRecPie ;
         GXv_char1[0] = GXt_char3 ;
         new app.palrpieuti(remoteHandle, context).execute( GXv_char5, GXv_int2, GXv_char4, GXv_char1) ;
         talmpz2_impl.this.A396EmprCod = GXv_char5[0] ;
         talmpz2_impl.this.A44AlbRecCod = GXv_int2[0] ;
         talmpz2_impl.this.A2159AlbRecPie = GXv_char4[0] ;
         talmpz2_impl.this.GXt_char3 = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         AV54PieUti = GXt_char3 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54PieUti", AV54PieUti);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV54PieUti))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_16_10U7( String A396EmprCod ,
                           int A44AlbRecCod )
   {
      if ( true /* After */ )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int2[0] = A44AlbRecCod ;
         new app.pprueba5(remoteHandle, context).execute( GXv_char5, GXv_int2) ;
         A396EmprCod = GXv_char5[0] ;
         A44AlbRecCod = GXv_int2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
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
      subsflControlProps_220299( ) ;
      while ( nGXsfl_220_idx <= nRC_GXsfl_220 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal10U299( ) ;
         standaloneModal10U299( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow10U299( ) ;
         nGXsfl_220_idx = (int)(nGXsfl_220_idx+1) ;
         sGXsfl_220_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_220_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_220299( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      cmbAlbRUni.setName( "ALBRUNI" );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      cmbAlbRReo.setName( "ALBRREO" );
      cmbAlbRReo.setWebtags( "" );
      cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
      cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      }
      cmbAlbREst.setName( "ALBREST" );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T010U59 */
      pr_default.execute(54, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(54) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T010U59_A407EmprNom[0] ;
      n407EmprNom = T010U59_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(54);
      /* Using cursor T010U45 */
      pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(40) != 101) )
      {
         A2152AlbDetPie = T010U45_A2152AlbDetPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = T010U45_A2149AlbDetMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = T010U45_A2146AlbDetKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = T010U45_A2151AlbDetMtrU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = T010U45_A2148AlbDetKgmU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
      }
      else
      {
         A2152AlbDetPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
      }
      pr_default.close(40);
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

   public void valid_Albreccod( )
   {
      A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValue())) ;
      cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      A55AlbRReo = cmbAlbRReo.getValue() ;
      cmbAlbRReo.setValue( A55AlbRReo );
      A56AlbRUni = cmbAlbRUni.getValue() ;
      cmbAlbRUni.setValue( A56AlbRUni );
      n44AlbRecCod = false ;
      n4606AlbRHEn = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         cmbAlbRUni.setValue( A56AlbRUni );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      }
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         cmbAlbRReo.setValue( A55AlbRReo );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      }
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrim( localUtil.ntoc( A2147AlbDetKgmD, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrim( localUtil.ntoc( A2150AlbDetMtrD, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", GXutil.rtrim( A46AlbREnt));
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", GXutil.rtrim( A56AlbRUni));
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", GXutil.rtrim( A50AlbRLoc));
      httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", GXutil.rtrim( A55AlbRReo));
      cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrim( localUtil.ntoc( A53AlbRPieReb, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrim( localUtil.ntoc( A59AlbRUniReb, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrim( localUtil.ntoc( A1222AlbNumEti, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", GXutil.rtrim( A1291AlbRDes));
      httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrim( localUtil.ntoc( A2152AlbDetPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrim( localUtil.ntoc( A2149AlbDetMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrim( localUtil.ntoc( A2146AlbDetKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrim( localUtil.ntoc( A2151AlbDetMtrU, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrim( localUtil.ntoc( A2148AlbDetKgmU, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A6182AlbrNF", GXutil.rtrim( A6182AlbrNF));
      httpContext.ajax_rsp_assign_attri("", false, "A8835Bod_UltPz", GXutil.rtrim( A8835Bod_UltPz));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", GXutil.rtrim( A971ProceNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", GXutil.rtrim( A1212TipEntNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrim( localUtil.ntoc( A2153AlbDetPieU, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", GXutil.rtrim( AV18AlbCum));
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2147AlbDetKgmD", GXutil.ltrim( localUtil.ntoc( Z2147AlbDetKgmD, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2150AlbDetMtrD", GXutil.ltrim( localUtil.ntoc( Z2150AlbDetMtrD, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z46AlbREnt", GXutil.rtrim( Z46AlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z50AlbRLoc", GXutil.rtrim( Z50AlbRLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z49AlbRFen", localUtil.format(Z49AlbRFen, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z55AlbRReo", GXutil.rtrim( Z55AlbRReo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z53AlbRPieReb", GXutil.ltrim( localUtil.ntoc( Z53AlbRPieReb, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z59AlbRUniReb", GXutil.ltrim( localUtil.ntoc( Z59AlbRUniReb, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z48AlbRFecUlt", localUtil.format(Z48AlbRFecUlt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z47AlbREst", GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1211TipEntCod", GXutil.ltrim( localUtil.ntoc( Z1211TipEntCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1222AlbNumEti", GXutil.ltrim( localUtil.ntoc( Z1222AlbNumEti, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1291AlbRDes", GXutil.rtrim( Z1291AlbRDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z970ProceCod", GXutil.ltrim( localUtil.ntoc( Z970ProceCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2152AlbDetPie", GXutil.ltrim( localUtil.ntoc( Z2152AlbDetPie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2149AlbDetMtr", GXutil.ltrim( localUtil.ntoc( Z2149AlbDetMtr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2146AlbDetKgm", GXutil.ltrim( localUtil.ntoc( Z2146AlbDetKgm, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2151AlbDetMtrU", GXutil.ltrim( localUtil.ntoc( Z2151AlbDetMtrU, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2148AlbDetKgmU", GXutil.ltrim( localUtil.ntoc( Z2148AlbDetKgmU, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4606AlbRHEn", localUtil.ttoc( Z4606AlbRHEn, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6182AlbrNF", GXutil.rtrim( Z6182AlbrNF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8835Bod_UltPz", GXutil.rtrim( Z8835Bod_UltPz));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z841TrnNom", GXutil.rtrim( Z841TrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z971ProceNom", GXutil.rtrim( Z971ProceNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1212TipEntNom", GXutil.rtrim( Z1212TipEntNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2153AlbDetPieU", GXutil.ltrim( localUtil.ntoc( Z2153AlbDetPieU, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( Z54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( Z51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV18AlbCum", GXutil.rtrim( ZV18AlbCum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( Z60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( Z57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Clicod( )
   {
      /* Using cursor T010U25 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T010U25_A279CliNom[0] ;
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Trncod( )
   {
      n840TrnCod = false ;
      n841TrnNom = false ;
      /* Using cursor T010U26 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
         }
      }
      A841TrnNom = T010U26_A841TrnNom[0] ;
      n841TrnNom = T010U26_n841TrnNom[0] ;
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
   }

   public void valid_Albruni( )
   {
      A56AlbRUni = cmbAlbRUni.getValue() ;
      n44AlbRecCod = false ;
      if ( ! ( ( GXutil.strcmp(A56AlbRUni, "K") == 0 ) || ( GXutil.strcmp(A56AlbRUni, "M") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBRUNI");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbRUni.getInternalname() ;
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2149AlbDetMtr)==0) )
      {
         A58AlbRUniEnt = A2149AlbDetMtr ;
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2146AlbDetKgm)==0) )
         {
            A58AlbRUniEnt = A2146AlbDetKgm ;
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2151AlbDetMtrU)==0) )
      {
         A60AlbRUniUti = A2151AlbDetMtrU ;
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2148AlbDetKgmU)==0) )
         {
            A60AlbRUniUti = A2148AlbDetKgmU ;
         }
      }
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
      {
         A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
         }
         else
         {
            A2153AlbDetPieU = (short)(0) ;
         }
      }
      if ( ! (0==A2153AlbDetPieU) )
      {
         A54AlbRPieUti = A2153AlbDetPieU ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrim( localUtil.ntoc( A2153AlbDetPieU, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Albrest( )
   {
      A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValue())) ;
      if ( ! ( ( A47AlbREst == 0 ) || ( A47AlbREst == 1 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Estado", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBREST");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbREst.getInternalname() ;
      }
      if ( A47AlbREst == 1 )
      {
         AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
      }
      else
      {
         if ( A47AlbREst == 0 )
         {
            AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", GXutil.rtrim( AV18AlbCum));
   }

   public void valid_Tipentcod( )
   {
      n1211TipEntCod = false ;
      n1212TipEntNom = false ;
      /* Using cursor T010U27 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1211TipEntCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipEntCod_Internalname ;
         }
      }
      A1212TipEntNom = T010U27_A1212TipEntNom[0] ;
      n1212TipEntNom = T010U27_n1212TipEntNom[0] ;
      pr_default.close(23);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", GXutil.rtrim( A1212TipEntNom));
   }

   public void valid_Procecod( )
   {
      n970ProceCod = false ;
      n971ProceNom = false ;
      /* Using cursor T010U28 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProceCod_Internalname ;
         }
      }
      A971ProceNom = T010U28_A971ProceNom[0] ;
      n971ProceNom = T010U28_n971ProceNom[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", GXutil.rtrim( A971ProceNom));
   }

   public void valid_Albrnf( )
   {
      if ( ( GXutil.strcmp(A6182AlbrNF, httpContext.getMessage( "S", "")) == 0 ) && ( AV67Lindalana == 1 ) && ( isUpd( )  || isDlt( )  ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Este Registro no se puede modificar", ""), 1, "ALBRNF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbrNF_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Albrecpie( )
   {
      n44AlbRecCod = false ;
      GXt_char3 = A4795AlRPieCal ;
      GXv_char5[0] = A396EmprCod ;
      GXv_int2[0] = A44AlbRecCod ;
      GXv_char4[0] = A2159AlbRecPie ;
      GXv_char1[0] = GXt_char3 ;
      new app.ppiecalact(remoteHandle, context).execute( GXv_char5, GXv_int2, GXv_char4, GXv_char1) ;
      talmpz2_impl.this.A396EmprCod = GXv_char5[0] ;
      talmpz2_impl.this.A44AlbRecCod = GXv_int2[0] ;
      talmpz2_impl.this.A2159AlbRecPie = GXv_char4[0] ;
      talmpz2_impl.this.GXt_char3 = GXv_char1[0] ;
      A4795AlRPieCal = GXt_char3 ;
      if ( true /* Level */ )
      {
         GXt_char3 = AV54PieUti ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int2[0] = A44AlbRecCod ;
         GXv_char4[0] = A2159AlbRecPie ;
         GXv_char1[0] = GXt_char3 ;
         new app.palrpieuti(remoteHandle, context).execute( GXv_char5, GXv_int2, GXv_char4, GXv_char1) ;
         talmpz2_impl.this.A396EmprCod = GXv_char5[0] ;
         talmpz2_impl.this.A44AlbRecCod = GXv_int2[0] ;
         talmpz2_impl.this.A2159AlbRecPie = GXv_char4[0] ;
         talmpz2_impl.this.GXt_char3 = GXv_char1[0] ;
         AV54PieUti = GXt_char3 ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", GXutil.rtrim( A4795AlRPieCal));
      httpContext.ajax_rsp_assign_attri("", false, "AV54PieUti", GXutil.rtrim( AV54PieUti));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'A2153AlbDetPieU',fld:'ALBDETPIEU',pic:'ZZZ9'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'cmbAlbRReo'},{av:'A55AlbRReo',fld:'ALBRREO',pic:'@!'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A2152AlbDetPie',fld:'ALBDETPIE',pic:'ZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A2149AlbDetMtr',fld:'ALBDETMTR',pic:'ZZZZZ9.99'},{av:'A2151AlbDetMtrU',fld:'ALBDETMTRU',pic:'ZZZZZ9.99'},{av:'A2146AlbDetKgm',fld:'ALBDETKGM',pic:'ZZZZZ9.99'},{av:'A2148AlbDetKgmU',fld:'ALBDETKGMU',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A4606AlbRHEn',fld:'ALBRHEN',pic:'99/99/99 99:99'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV18AlbCum',fld:'vALBCUM',pic:''}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A2147AlbDetKgmD',fld:'ALBDETKGMD',pic:'ZZZZZ9.99'},{av:'A2150AlbDetMtrD',fld:'ALBDETMTRD',pic:'ZZZZZ9.99'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A46AlbREnt',fld:'ALBRENT',pic:''},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A50AlbRLoc',fld:'ALBRLOC',pic:''},{av:'A49AlbRFen',fld:'ALBRFEN',pic:''},{av:'cmbAlbRReo'},{av:'A55AlbRReo',fld:'ALBRREO',pic:'@!'},{av:'A53AlbRPieReb',fld:'ALBRPIEREB',pic:'ZZZ9'},{av:'A59AlbRUniReb',fld:'ALBRUNIREB',pic:'ZZZZZ9.99'},{av:'A48AlbRFecUlt',fld:'ALBRFECULT',pic:''},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'},{av:'A1222AlbNumEti',fld:'ALBNUMETI',pic:'ZZZ9'},{av:'A1291AlbRDes',fld:'ALBRDES',pic:''},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'A2152AlbDetPie',fld:'ALBDETPIE',pic:'ZZZ9'},{av:'A2149AlbDetMtr',fld:'ALBDETMTR',pic:'ZZZZZ9.99'},{av:'A2146AlbDetKgm',fld:'ALBDETKGM',pic:'ZZZZZ9.99'},{av:'A2151AlbDetMtrU',fld:'ALBDETMTRU',pic:'ZZZZZ9.99'},{av:'A2148AlbDetKgmU',fld:'ALBDETKGMU',pic:'ZZZZZ9.99'},{av:'A4606AlbRHEn',fld:'ALBRHEN',pic:'99/99/99 99:99'},{av:'A6182AlbrNF',fld:'ALBRNF',pic:'@!'},{av:'A8835Bod_UltPz',fld:'BOD_ULTPZ',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'A971ProceNom',fld:'PROCENOM',pic:''},{av:'A1212TipEntNom',fld:'TIPENTNOM',pic:''},{av:'A2153AlbDetPieU',fld:'ALBDETPIEU',pic:'ZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV18AlbCum',fld:'vALBCUM',pic:''},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z44AlbRecCod'},{av:'Z52AlbRPieEnt'},{av:'Z2147AlbDetKgmD'},{av:'Z2150AlbDetMtrD'},{av:'Z407EmprNom'},{av:'Z252CliCod'},{av:'Z45AlbRef'},{av:'Z840TrnCod'},{av:'Z46AlbREnt'},{av:'Z56AlbRUni'},{av:'Z50AlbRLoc'},{av:'Z49AlbRFen'},{av:'Z55AlbRReo'},{av:'Z53AlbRPieReb'},{av:'Z59AlbRUniReb'},{av:'Z48AlbRFecUlt'},{av:'Z47AlbREst'},{av:'Z1211TipEntCod'},{av:'Z1222AlbNumEti'},{av:'Z1291AlbRDes'},{av:'Z970ProceCod'},{av:'Z2152AlbDetPie'},{av:'Z2149AlbDetMtr'},{av:'Z2146AlbDetKgm'},{av:'Z2151AlbDetMtrU'},{av:'Z2148AlbDetKgmU'},{av:'Z4606AlbRHEn'},{av:'Z6182AlbrNF'},{av:'Z8835Bod_UltPz'},{av:'Z279CliNom'},{av:'Z841TrnNom'},{av:'Z971ProceNom'},{av:'Z1212TipEntNom'},{av:'Z2153AlbDetPieU'},{av:'Z54AlbRPieUti'},{av:'Z51AlbRPieDis'},{av:'ZV18AlbCum'},{av:'Z58AlbRUniEnt'},{av:'Z60AlbRUniUti'},{av:'Z57AlbRUniDis'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A841TrnNom',fld:'TRNNOM',pic:''}]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNI","{handler:'valid_Albruni',iparms:[{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A2149AlbDetMtr',fld:'ALBDETMTR',pic:'ZZZZZ9.99'},{av:'A2146AlbDetKgm',fld:'ALBDETKGM',pic:'ZZZZZ9.99'},{av:'A2151AlbDetMtrU',fld:'ALBDETMTRU',pic:'ZZZZZ9.99'},{av:'A2148AlbDetKgmU',fld:'ALBDETKGMU',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A2153AlbDetPieU',fld:'ALBDETPIEU',pic:'ZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_ALBRUNI",",oparms:[{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A2153AlbDetPieU',fld:'ALBDETPIEU',pic:'ZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRREO","{handler:'valid_Albrreo',iparms:[]");
      setEventMetadata("VALID_ALBRREO",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEUTI","{handler:'valid_Albrpieuti',iparms:[]");
      setEventMetadata("VALID_ALBRPIEUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIUTI","{handler:'valid_Albruniuti',iparms:[]");
      setEventMetadata("VALID_ALBRUNIUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBREST","{handler:'valid_Albrest',iparms:[{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'AV18AlbCum',fld:'vALBCUM',pic:''}]");
      setEventMetadata("VALID_ALBREST",",oparms:[{av:'AV18AlbCum',fld:'vALBCUM',pic:''}]}");
      setEventMetadata("VALID_TIPENTCOD","{handler:'valid_Tipentcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'},{av:'A1212TipEntNom',fld:'TIPENTNOM',pic:''}]");
      setEventMetadata("VALID_TIPENTCOD",",oparms:[{av:'A1212TipEntNom',fld:'TIPENTNOM',pic:''}]}");
      setEventMetadata("VALID_PROCECOD","{handler:'valid_Procecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'A971ProceNom',fld:'PROCENOM',pic:''}]");
      setEventMetadata("VALID_PROCECOD",",oparms:[{av:'A971ProceNom',fld:'PROCENOM',pic:''}]}");
      setEventMetadata("VALID_ALBDETPIE","{handler:'valid_Albdetpie',iparms:[]");
      setEventMetadata("VALID_ALBDETPIE",",oparms:[]}");
      setEventMetadata("VALID_ALBDETMTR","{handler:'valid_Albdetmtr',iparms:[]");
      setEventMetadata("VALID_ALBDETMTR",",oparms:[]}");
      setEventMetadata("VALID_ALBDETKGM","{handler:'valid_Albdetkgm',iparms:[]");
      setEventMetadata("VALID_ALBDETKGM",",oparms:[]}");
      setEventMetadata("VALID_ALBDETMTRU","{handler:'valid_Albdetmtru',iparms:[]");
      setEventMetadata("VALID_ALBDETMTRU",",oparms:[]}");
      setEventMetadata("VALID_ALBDETKGMU","{handler:'valid_Albdetkgmu',iparms:[]");
      setEventMetadata("VALID_ALBDETKGMU",",oparms:[]}");
      setEventMetadata("VALID_ALBDETPIEU","{handler:'valid_Albdetpieu',iparms:[]");
      setEventMetadata("VALID_ALBDETPIEU",",oparms:[]}");
      setEventMetadata("VALID_ALBRNF","{handler:'valid_Albrnf',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A6182AlbrNF',fld:'ALBRNF',pic:'@!'},{av:'AV67Lindalana',fld:'vLINDALANA',pic:'9'}]");
      setEventMetadata("VALID_ALBRNF",",oparms:[]}");
      setEventMetadata("VALID_ALBRECPIE","{handler:'valid_Albrecpie',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A2159AlbRecPie',fld:'ALBRECPIE',pic:''},{av:'A4795AlRPieCal',fld:'ALRPIECAL',pic:''},{av:'AV54PieUti',fld:'vPIEUTI',pic:''}]");
      setEventMetadata("VALID_ALBRECPIE",",oparms:[{av:'A4795AlRPieCal',fld:'ALRPIECAL',pic:''},{av:'AV54PieUti',fld:'vPIEUTI',pic:''}]}");
      setEventMetadata("VALID_ALBRECMTR","{handler:'valid_Albrecmtr',iparms:[]");
      setEventMetadata("VALID_ALBRECMTR",",oparms:[]}");
      setEventMetadata("VALID_ALBRECKGM","{handler:'valid_Albreckgm',iparms:[]");
      setEventMetadata("VALID_ALBRECKGM",",oparms:[]}");
      setEventMetadata("VALID_ALBRECMTRU","{handler:'valid_Albrecmtru',iparms:[]");
      setEventMetadata("VALID_ALBRECMTRU",",oparms:[]}");
      setEventMetadata("VALID_ALBRECKGMU","{handler:'valid_Albreckgmu',iparms:[]");
      setEventMetadata("VALID_ALBRECKGMU",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Bod_nvar',iparms:[]");
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
      pr_default.close(21);
      pr_default.close(54);
      pr_default.close(22);
      pr_default.close(24);
      pr_default.close(23);
      pr_default.close(40);
   }

   /* Aggregate/select formulas */
   public int getAlbDetPieU1( String E396EmprCod ,
                              int E44AlbRecCod )
   {
      Gx_cnt = 0 ;
      /* Using cursor T010U60 */
      pr_default.execute(55, new Object[] {E396EmprCod, Boolean.valueOf(nA44AlbRecCod), Integer.valueOf(E44AlbRecCod)});
      if ( (pr_default.getStatus(55) != 101) )
      {
         Gx_cnt = T010U60_Gx_cnt[0] ;
      }
      pr_default.close(55);
      return Gx_cnt ;
   }

   public int getAlbDetPieU0( String E396EmprCod ,
                              int E44AlbRecCod )
   {
      Gx_cnt = 0 ;
      /* Using cursor T010U61 */
      pr_default.execute(56, new Object[] {E396EmprCod, Boolean.valueOf(nE44AlbRecCod), Integer.valueOf(E44AlbRecCod)});
      if ( (pr_default.getStatus(56) != 101) )
      {
         Gx_cnt = T010U61_Gx_cnt[0] ;
      }
      pr_default.close(56);
      return Gx_cnt ;
   }

   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z45AlbRef = "" ;
      Z46AlbREnt = "" ;
      Z56AlbRUni = "" ;
      Z50AlbRLoc = "" ;
      Z49AlbRFen = GXutil.nullDate() ;
      Z55AlbRReo = "" ;
      Z59AlbRUniReb = DecimalUtil.ZERO ;
      Z48AlbRFecUlt = GXutil.nullDate() ;
      Z1291AlbRDes = "" ;
      Z4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      Z6182AlbrNF = "" ;
      Z8835Bod_UltPz = "" ;
      Z2159AlbRecPie = "" ;
      Z4795AlRPieCal = "" ;
      Z4411AlbRecFec = GXutil.resetTime( GXutil.nullDate() );
      Z2157AlbRecMtr = DecimalUtil.ZERO ;
      Z2155AlbRecKgm = DecimalUtil.ZERO ;
      Z2158AlbRecMtrU = DecimalUtil.ZERO ;
      Z2156AlbRecKgmU = DecimalUtil.ZERO ;
      Z3731AlbRecIdPz = "" ;
      Z4410AlbRecPal = DecimalUtil.ZERO ;
      Z7408ALRPIELOC = "" ;
      Z7410ALRPIEOPE = "" ;
      Z7411ALRPIEST = "" ;
      Z7793AlbRecCo1 = "" ;
      Z8000AlbHdrp = "" ;
      Z8001AlbSerT = "" ;
      Z8002AlbColNm = "" ;
      Z8004AlbKgsPf = DecimalUtil.ZERO ;
      Z8005AlbMtsPf = DecimalUtil.ZERO ;
      Z8037AlbNPed = "" ;
      Z8051AlbObsp = "" ;
      Z8679Bod_Dib = "" ;
      Z8683Bod_Hilz = "" ;
      Z8684Bod_FecE = GXutil.nullDate() ;
      Z8685Bod_PedOr = "" ;
      Z8774Bod_Rack = "" ;
      Z8775Bod_PoS = "" ;
      Z8776Bod_Ok = "" ;
      Z8779Bod_Talla = "" ;
      Z8781Bod_Medt = "" ;
      Z8831Bod_ColNNn = "" ;
      Z8832Bod_Por = DecimalUtil.ZERO ;
      Z8833Bod_codb = "" ;
      Z8834Bod_Pes = "" ;
      Z8848Bod_DibO = "" ;
      Z9376Bod_item3 = "" ;
      Z9540Bod_ToE = "" ;
      Z9560Bod_DescP = "" ;
      Z9561Bod_CVar = "" ;
      Z9562Bod_NVar = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A56AlbRUni = "" ;
      A2159AlbRecPie = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
      A2146AlbDetKgm = DecimalUtil.ZERO ;
      A2148AlbDetKgmU = DecimalUtil.ZERO ;
      A2149AlbDetMtr = DecimalUtil.ZERO ;
      A2151AlbDetMtrU = DecimalUtil.ZERO ;
      A55AlbRReo = "" ;
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
      A407EmprNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      A45AlbRef = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A841TrnNom = "" ;
      lblTextblock9_Jsonclick = "" ;
      A46AlbREnt = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A50AlbRLoc = "" ;
      lblTextblock13_Jsonclick = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      lblTextblock14_Jsonclick = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      lblTextblock19_Jsonclick = "" ;
      A59AlbRUniReb = DecimalUtil.ZERO ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      lblTextblock22_Jsonclick = "" ;
      A48AlbRFecUlt = GXutil.nullDate() ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      A1212TipEntNom = "" ;
      lblTextblock26_Jsonclick = "" ;
      lblTextblock27_Jsonclick = "" ;
      A1291AlbRDes = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      A971ProceNom = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      A2150AlbDetMtrD = DecimalUtil.ZERO ;
      lblTextblock36_Jsonclick = "" ;
      A2147AlbDetKgmD = DecimalUtil.ZERO ;
      lblTextblock37_Jsonclick = "" ;
      lblTextblock38_Jsonclick = "" ;
      A4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock39_Jsonclick = "" ;
      A6182AlbrNF = "" ;
      lblTextblock40_Jsonclick = "" ;
      A8835Bod_UltPz = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode299 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV17UsurCod = "" ;
      AV18AlbCum = "" ;
      A4795AlRPieCal = "" ;
      AV54PieUti = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode7 = "" ;
      s2147AlbDetKgmD = DecimalUtil.ZERO ;
      O2147AlbDetKgmD = DecimalUtil.ZERO ;
      s2150AlbDetMtrD = DecimalUtil.ZERO ;
      O2150AlbDetMtrD = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A3731AlbRecIdPz = "" ;
      A4410AlbRecPal = DecimalUtil.ZERO ;
      A7408ALRPIELOC = "" ;
      A7410ALRPIEOPE = "" ;
      A7411ALRPIEST = "" ;
      A4411AlbRecFec = GXutil.resetTime( GXutil.nullDate() );
      A7793AlbRecCo1 = "" ;
      A8000AlbHdrp = "" ;
      A8001AlbSerT = "" ;
      A8002AlbColNm = "" ;
      A8004AlbKgsPf = DecimalUtil.ZERO ;
      A8005AlbMtsPf = DecimalUtil.ZERO ;
      A8037AlbNPed = "" ;
      A8051AlbObsp = "" ;
      A8679Bod_Dib = "" ;
      A8683Bod_Hilz = "" ;
      A8684Bod_FecE = GXutil.nullDate() ;
      A8685Bod_PedOr = "" ;
      A8774Bod_Rack = "" ;
      A8775Bod_PoS = "" ;
      A8776Bod_Ok = "" ;
      A8779Bod_Talla = "" ;
      A8781Bod_Medt = "" ;
      A8831Bod_ColNNn = "" ;
      A8832Bod_Por = DecimalUtil.ZERO ;
      A8833Bod_codb = "" ;
      A8834Bod_Pes = "" ;
      A8848Bod_DibO = "" ;
      A9376Bod_item3 = "" ;
      A9540Bod_ToE = "" ;
      A9560Bod_DescP = "" ;
      A9561Bod_CVar = "" ;
      A9562Bod_NVar = "" ;
      T010U5_A2152AlbDetPie = new short[1] ;
      T010U5_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U5_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U5_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U5_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      Z407EmprNom = "" ;
      Z2149AlbDetMtr = DecimalUtil.ZERO ;
      Z2146AlbDetKgm = DecimalUtil.ZERO ;
      Z2151AlbDetMtrU = DecimalUtil.ZERO ;
      Z2148AlbDetKgmU = DecimalUtil.ZERO ;
      Z279CliNom = "" ;
      Z841TrnNom = "" ;
      Z1212TipEntNom = "" ;
      Z971ProceNom = "" ;
      T010U8_A407EmprNom = new String[] {""} ;
      T010U8_n407EmprNom = new boolean[] {false} ;
      T010U14_A44AlbRecCod = new int[1] ;
      T010U14_n44AlbRecCod = new boolean[] {false} ;
      T010U14_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U14_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U14_A52AlbRPieEnt = new int[1] ;
      T010U14_A54AlbRPieUti = new int[1] ;
      T010U14_A407EmprNom = new String[] {""} ;
      T010U14_n407EmprNom = new boolean[] {false} ;
      T010U14_A279CliNom = new String[] {""} ;
      T010U14_A45AlbRef = new String[] {""} ;
      T010U14_A841TrnNom = new String[] {""} ;
      T010U14_n841TrnNom = new boolean[] {false} ;
      T010U14_A46AlbREnt = new String[] {""} ;
      T010U14_A56AlbRUni = new String[] {""} ;
      T010U14_A50AlbRLoc = new String[] {""} ;
      T010U14_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T010U14_A55AlbRReo = new String[] {""} ;
      T010U14_A53AlbRPieReb = new int[1] ;
      T010U14_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U14_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T010U14_A47AlbREst = new byte[1] ;
      T010U14_A1212TipEntNom = new String[] {""} ;
      T010U14_n1212TipEntNom = new boolean[] {false} ;
      T010U14_A1222AlbNumEti = new short[1] ;
      T010U14_A1291AlbRDes = new String[] {""} ;
      T010U14_A971ProceNom = new String[] {""} ;
      T010U14_n971ProceNom = new boolean[] {false} ;
      T010U14_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      T010U14_n4606AlbRHEn = new boolean[] {false} ;
      T010U14_A6182AlbrNF = new String[] {""} ;
      T010U14_A8835Bod_UltPz = new String[] {""} ;
      T010U14_n8835Bod_UltPz = new boolean[] {false} ;
      T010U14_A396EmprCod = new String[] {""} ;
      T010U14_A252CliCod = new int[1] ;
      T010U14_A840TrnCod = new short[1] ;
      T010U14_n840TrnCod = new boolean[] {false} ;
      T010U14_A970ProceCod = new short[1] ;
      T010U14_n970ProceCod = new boolean[] {false} ;
      T010U14_A1211TipEntCod = new short[1] ;
      T010U14_n1211TipEntCod = new boolean[] {false} ;
      T010U14_A2152AlbDetPie = new short[1] ;
      T010U14_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U14_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U14_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U14_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U9_A279CliNom = new String[] {""} ;
      T010U10_A841TrnNom = new String[] {""} ;
      T010U10_n841TrnNom = new boolean[] {false} ;
      T010U11_A971ProceNom = new String[] {""} ;
      T010U11_n971ProceNom = new boolean[] {false} ;
      T010U12_A1212TipEntNom = new String[] {""} ;
      T010U12_n1212TipEntNom = new boolean[] {false} ;
      T010U15_A279CliNom = new String[] {""} ;
      T010U16_A841TrnNom = new String[] {""} ;
      T010U16_n841TrnNom = new boolean[] {false} ;
      T010U17_A971ProceNom = new String[] {""} ;
      T010U17_n971ProceNom = new boolean[] {false} ;
      T010U18_A1212TipEntNom = new String[] {""} ;
      T010U18_n1212TipEntNom = new boolean[] {false} ;
      T010U19_A396EmprCod = new String[] {""} ;
      T010U19_A44AlbRecCod = new int[1] ;
      T010U19_n44AlbRecCod = new boolean[] {false} ;
      T010U7_A44AlbRecCod = new int[1] ;
      T010U7_n44AlbRecCod = new boolean[] {false} ;
      T010U7_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U7_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U7_A52AlbRPieEnt = new int[1] ;
      T010U7_A54AlbRPieUti = new int[1] ;
      T010U7_A45AlbRef = new String[] {""} ;
      T010U7_A46AlbREnt = new String[] {""} ;
      T010U7_A56AlbRUni = new String[] {""} ;
      T010U7_A50AlbRLoc = new String[] {""} ;
      T010U7_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T010U7_A55AlbRReo = new String[] {""} ;
      T010U7_A53AlbRPieReb = new int[1] ;
      T010U7_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U7_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T010U7_A47AlbREst = new byte[1] ;
      T010U7_A1222AlbNumEti = new short[1] ;
      T010U7_A1291AlbRDes = new String[] {""} ;
      T010U7_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      T010U7_n4606AlbRHEn = new boolean[] {false} ;
      T010U7_A6182AlbrNF = new String[] {""} ;
      T010U7_A8835Bod_UltPz = new String[] {""} ;
      T010U7_n8835Bod_UltPz = new boolean[] {false} ;
      T010U7_A396EmprCod = new String[] {""} ;
      T010U7_A252CliCod = new int[1] ;
      T010U7_A840TrnCod = new short[1] ;
      T010U7_n840TrnCod = new boolean[] {false} ;
      T010U7_A970ProceCod = new short[1] ;
      T010U7_n970ProceCod = new boolean[] {false} ;
      T010U7_A1211TipEntCod = new short[1] ;
      T010U7_n1211TipEntCod = new boolean[] {false} ;
      T010U20_A396EmprCod = new String[] {""} ;
      T010U20_A44AlbRecCod = new int[1] ;
      T010U20_n44AlbRecCod = new boolean[] {false} ;
      T010U21_A396EmprCod = new String[] {""} ;
      T010U21_A44AlbRecCod = new int[1] ;
      T010U21_n44AlbRecCod = new boolean[] {false} ;
      T010U6_A44AlbRecCod = new int[1] ;
      T010U6_n44AlbRecCod = new boolean[] {false} ;
      T010U6_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U6_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U6_A52AlbRPieEnt = new int[1] ;
      T010U6_A54AlbRPieUti = new int[1] ;
      T010U6_A45AlbRef = new String[] {""} ;
      T010U6_A46AlbREnt = new String[] {""} ;
      T010U6_A56AlbRUni = new String[] {""} ;
      T010U6_A50AlbRLoc = new String[] {""} ;
      T010U6_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T010U6_A55AlbRReo = new String[] {""} ;
      T010U6_A53AlbRPieReb = new int[1] ;
      T010U6_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U6_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T010U6_A47AlbREst = new byte[1] ;
      T010U6_A1222AlbNumEti = new short[1] ;
      T010U6_A1291AlbRDes = new String[] {""} ;
      T010U6_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      T010U6_n4606AlbRHEn = new boolean[] {false} ;
      T010U6_A6182AlbrNF = new String[] {""} ;
      T010U6_A8835Bod_UltPz = new String[] {""} ;
      T010U6_n8835Bod_UltPz = new boolean[] {false} ;
      T010U6_A396EmprCod = new String[] {""} ;
      T010U6_A252CliCod = new int[1] ;
      T010U6_A840TrnCod = new short[1] ;
      T010U6_n840TrnCod = new boolean[] {false} ;
      T010U6_A970ProceCod = new short[1] ;
      T010U6_n970ProceCod = new boolean[] {false} ;
      T010U6_A1211TipEntCod = new short[1] ;
      T010U6_n1211TipEntCod = new boolean[] {false} ;
      T010U25_A279CliNom = new String[] {""} ;
      T010U26_A841TrnNom = new String[] {""} ;
      T010U26_n841TrnNom = new boolean[] {false} ;
      T010U27_A1212TipEntNom = new String[] {""} ;
      T010U27_n1212TipEntNom = new boolean[] {false} ;
      T010U28_A971ProceNom = new String[] {""} ;
      T010U28_n971ProceNom = new boolean[] {false} ;
      T010U29_A396EmprCod = new String[] {""} ;
      T010U29_A13026PedDGId = new int[1] ;
      T010U29_A44AlbRecCod = new int[1] ;
      T010U29_n44AlbRecCod = new boolean[] {false} ;
      T010U30_A396EmprCod = new String[] {""} ;
      T010U30_A11669DevCruId = new int[1] ;
      T010U30_A44AlbRecCod = new int[1] ;
      T010U30_n44AlbRecCod = new boolean[] {false} ;
      T010U31_A396EmprCod = new String[] {""} ;
      T010U31_A44AlbRecCod = new int[1] ;
      T010U31_n44AlbRecCod = new boolean[] {false} ;
      T010U31_A9743Emp_CUb = new String[] {""} ;
      T010U31_A5860Emp_Anp = new short[1] ;
      T010U32_A396EmprCod = new String[] {""} ;
      T010U32_A44AlbRecCod = new int[1] ;
      T010U32_n44AlbRecCod = new boolean[] {false} ;
      T010U32_A7130MatC_Pz = new String[] {""} ;
      T010U33_A396EmprCod = new String[] {""} ;
      T010U33_A44AlbRecCod = new int[1] ;
      T010U33_n44AlbRecCod = new boolean[] {false} ;
      T010U33_A7132MatC_Talla = new String[] {""} ;
      T010U34_A396EmprCod = new String[] {""} ;
      T010U34_A44AlbRecCod = new int[1] ;
      T010U34_n44AlbRecCod = new boolean[] {false} ;
      T010U34_A7115MatC_Lin = new short[1] ;
      T010U35_A396EmprCod = new String[] {""} ;
      T010U35_A30AlbProCod = new long[1] ;
      T010U35_A129BarCod = new int[1] ;
      T010U35_A132BarCodReo = new byte[1] ;
      T010U35_A130BarCodPar = new String[] {""} ;
      T010U35_A6622AlbHdRLn = new short[1] ;
      T010U36_A396EmprCod = new String[] {""} ;
      T010U36_A6235DevEmpCod = new int[1] ;
      T010U36_A6243DevNumLin = new byte[1] ;
      T010U37_A396EmprCod = new String[] {""} ;
      T010U37_A44AlbRecCod = new int[1] ;
      T010U37_n44AlbRecCod = new boolean[] {false} ;
      T010U37_A4596AlbRDefCod = new short[1] ;
      T010U38_A396EmprCod = new String[] {""} ;
      T010U38_A44AlbRecCod = new int[1] ;
      T010U38_n44AlbRecCod = new boolean[] {false} ;
      T010U38_A2159AlbRecPie = new String[] {""} ;
      T010U38_A4395AlRDefCod = new short[1] ;
      T010U38_A4412AlRFasCod = new String[] {""} ;
      T010U39_A396EmprCod = new String[] {""} ;
      T010U39_A44AlbRecCod = new int[1] ;
      T010U39_n44AlbRecCod = new boolean[] {false} ;
      T010U39_A2165HisEmpLin = new short[1] ;
      T010U40_A396EmprCod = new String[] {""} ;
      T010U40_A44AlbRecCod = new int[1] ;
      T010U40_n44AlbRecCod = new boolean[] {false} ;
      T010U40_A1299AlbRLin = new byte[1] ;
      T010U41_A396EmprCod = new String[] {""} ;
      T010U41_A361DisCod = new int[1] ;
      T010U41_A44AlbRecCod = new int[1] ;
      T010U41_n44AlbRecCod = new boolean[] {false} ;
      T010U42_A396EmprCod = new String[] {""} ;
      T010U42_A323DevGenCod = new int[1] ;
      T010U43_A396EmprCod = new String[] {""} ;
      T010U43_A129BarCod = new int[1] ;
      T010U43_A132BarCodReo = new byte[1] ;
      T010U43_A130BarCodPar = new String[] {""} ;
      T010U43_A200BarPieCod = new String[] {""} ;
      T010U45_A2152AlbDetPie = new short[1] ;
      T010U45_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U45_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U45_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U45_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U47_A396EmprCod = new String[] {""} ;
      T010U47_A44AlbRecCod = new int[1] ;
      T010U47_n44AlbRecCod = new boolean[] {false} ;
      T010U48_A4795AlRPieCal = new String[] {""} ;
      T010U48_A44AlbRecCod = new int[1] ;
      T010U48_n44AlbRecCod = new boolean[] {false} ;
      T010U48_A2159AlbRecPie = new String[] {""} ;
      T010U48_A4411AlbRecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T010U48_n4411AlbRecFec = new boolean[] {false} ;
      T010U48_A2154AlbRecAnh = new short[1] ;
      T010U48_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U48_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U48_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U48_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U48_A3730AlbRecCol = new short[1] ;
      T010U48_A3731AlbRecIdPz = new String[] {""} ;
      T010U48_A3732AlbRecIdRc = new int[1] ;
      T010U48_A4410AlbRecPal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U48_A7408ALRPIELOC = new String[] {""} ;
      T010U48_A7409ALRPIETEL = new short[1] ;
      T010U48_n7409ALRPIETEL = new boolean[] {false} ;
      T010U48_A7410ALRPIEOPE = new String[] {""} ;
      T010U48_n7410ALRPIEOPE = new boolean[] {false} ;
      T010U48_A7411ALRPIEST = new String[] {""} ;
      T010U48_n7411ALRPIEST = new boolean[] {false} ;
      T010U48_A7792AlbRecPnt = new short[1] ;
      T010U48_n7792AlbRecPnt = new boolean[] {false} ;
      T010U48_A7793AlbRecCo1 = new String[] {""} ;
      T010U48_n7793AlbRecCo1 = new boolean[] {false} ;
      T010U48_A7794AlbRecCo2 = new int[1] ;
      T010U48_n7794AlbRecCo2 = new boolean[] {false} ;
      T010U48_A7998AlbHdr = new int[1] ;
      T010U48_n7998AlbHdr = new boolean[] {false} ;
      T010U48_A7999AlbHdrr = new byte[1] ;
      T010U48_n7999AlbHdrr = new boolean[] {false} ;
      T010U48_A8000AlbHdrp = new String[] {""} ;
      T010U48_n8000AlbHdrp = new boolean[] {false} ;
      T010U48_A8001AlbSerT = new String[] {""} ;
      T010U48_n8001AlbSerT = new boolean[] {false} ;
      T010U48_A8002AlbColNm = new String[] {""} ;
      T010U48_n8002AlbColNm = new boolean[] {false} ;
      T010U48_A8003AlbColNn = new int[1] ;
      T010U48_n8003AlbColNn = new boolean[] {false} ;
      T010U48_A8004AlbKgsPf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U48_n8004AlbKgsPf = new boolean[] {false} ;
      T010U48_A8005AlbMtsPf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U48_n8005AlbMtsPf = new boolean[] {false} ;
      T010U48_A8006AlbAfin = new byte[1] ;
      T010U48_n8006AlbAfin = new boolean[] {false} ;
      T010U48_A8037AlbNPed = new String[] {""} ;
      T010U48_n8037AlbNPed = new boolean[] {false} ;
      T010U48_A8051AlbObsp = new String[] {""} ;
      T010U48_n8051AlbObsp = new boolean[] {false} ;
      T010U48_A8679Bod_Dib = new String[] {""} ;
      T010U48_n8679Bod_Dib = new boolean[] {false} ;
      T010U48_A8680Bod_Tua = new long[1] ;
      T010U48_n8680Bod_Tua = new boolean[] {false} ;
      T010U48_A8681Bod_Tub = new long[1] ;
      T010U48_n8681Bod_Tub = new boolean[] {false} ;
      T010U48_A8682Bod_Tuc = new long[1] ;
      T010U48_n8682Bod_Tuc = new boolean[] {false} ;
      T010U48_A8683Bod_Hilz = new String[] {""} ;
      T010U48_n8683Bod_Hilz = new boolean[] {false} ;
      T010U48_A8684Bod_FecE = new java.util.Date[] {GXutil.nullDate()} ;
      T010U48_n8684Bod_FecE = new boolean[] {false} ;
      T010U48_A8685Bod_PedOr = new String[] {""} ;
      T010U48_n8685Bod_PedOr = new boolean[] {false} ;
      T010U48_A8774Bod_Rack = new String[] {""} ;
      T010U48_n8774Bod_Rack = new boolean[] {false} ;
      T010U48_A8775Bod_PoS = new String[] {""} ;
      T010U48_n8775Bod_PoS = new boolean[] {false} ;
      T010U48_A8776Bod_Ok = new String[] {""} ;
      T010U48_n8776Bod_Ok = new boolean[] {false} ;
      T010U48_A8779Bod_Talla = new String[] {""} ;
      T010U48_A8780Bod_Und = new short[1] ;
      T010U48_A8781Bod_Medt = new String[] {""} ;
      T010U48_n8781Bod_Medt = new boolean[] {false} ;
      T010U48_A8831Bod_ColNNn = new String[] {""} ;
      T010U48_n8831Bod_ColNNn = new boolean[] {false} ;
      T010U48_A8832Bod_Por = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U48_n8832Bod_Por = new boolean[] {false} ;
      T010U48_A8833Bod_codb = new String[] {""} ;
      T010U48_n8833Bod_codb = new boolean[] {false} ;
      T010U48_A8834Bod_Pes = new String[] {""} ;
      T010U48_n8834Bod_Pes = new boolean[] {false} ;
      T010U48_A8848Bod_DibO = new String[] {""} ;
      T010U48_n8848Bod_DibO = new boolean[] {false} ;
      T010U48_A9376Bod_item3 = new String[] {""} ;
      T010U48_n9376Bod_item3 = new boolean[] {false} ;
      T010U48_A9540Bod_ToE = new String[] {""} ;
      T010U48_n9540Bod_ToE = new boolean[] {false} ;
      T010U48_A9560Bod_DescP = new String[] {""} ;
      T010U48_n9560Bod_DescP = new boolean[] {false} ;
      T010U48_A9561Bod_CVar = new String[] {""} ;
      T010U48_n9561Bod_CVar = new boolean[] {false} ;
      T010U48_A9562Bod_NVar = new String[] {""} ;
      T010U48_n9562Bod_NVar = new boolean[] {false} ;
      T010U48_A396EmprCod = new String[] {""} ;
      T010U49_A396EmprCod = new String[] {""} ;
      T010U49_A44AlbRecCod = new int[1] ;
      T010U49_n44AlbRecCod = new boolean[] {false} ;
      T010U49_A2159AlbRecPie = new String[] {""} ;
      T010U3_A4795AlRPieCal = new String[] {""} ;
      T010U3_A44AlbRecCod = new int[1] ;
      T010U3_n44AlbRecCod = new boolean[] {false} ;
      T010U3_A2159AlbRecPie = new String[] {""} ;
      T010U3_A4411AlbRecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T010U3_n4411AlbRecFec = new boolean[] {false} ;
      T010U3_A2154AlbRecAnh = new short[1] ;
      T010U3_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U3_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U3_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U3_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U3_A3730AlbRecCol = new short[1] ;
      T010U3_A3731AlbRecIdPz = new String[] {""} ;
      T010U3_A3732AlbRecIdRc = new int[1] ;
      T010U3_A4410AlbRecPal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U3_A7408ALRPIELOC = new String[] {""} ;
      T010U3_A7409ALRPIETEL = new short[1] ;
      T010U3_n7409ALRPIETEL = new boolean[] {false} ;
      T010U3_A7410ALRPIEOPE = new String[] {""} ;
      T010U3_n7410ALRPIEOPE = new boolean[] {false} ;
      T010U3_A7411ALRPIEST = new String[] {""} ;
      T010U3_n7411ALRPIEST = new boolean[] {false} ;
      T010U3_A7792AlbRecPnt = new short[1] ;
      T010U3_n7792AlbRecPnt = new boolean[] {false} ;
      T010U3_A7793AlbRecCo1 = new String[] {""} ;
      T010U3_n7793AlbRecCo1 = new boolean[] {false} ;
      T010U3_A7794AlbRecCo2 = new int[1] ;
      T010U3_n7794AlbRecCo2 = new boolean[] {false} ;
      T010U3_A7998AlbHdr = new int[1] ;
      T010U3_n7998AlbHdr = new boolean[] {false} ;
      T010U3_A7999AlbHdrr = new byte[1] ;
      T010U3_n7999AlbHdrr = new boolean[] {false} ;
      T010U3_A8000AlbHdrp = new String[] {""} ;
      T010U3_n8000AlbHdrp = new boolean[] {false} ;
      T010U3_A8001AlbSerT = new String[] {""} ;
      T010U3_n8001AlbSerT = new boolean[] {false} ;
      T010U3_A8002AlbColNm = new String[] {""} ;
      T010U3_n8002AlbColNm = new boolean[] {false} ;
      T010U3_A8003AlbColNn = new int[1] ;
      T010U3_n8003AlbColNn = new boolean[] {false} ;
      T010U3_A8004AlbKgsPf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U3_n8004AlbKgsPf = new boolean[] {false} ;
      T010U3_A8005AlbMtsPf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U3_n8005AlbMtsPf = new boolean[] {false} ;
      T010U3_A8006AlbAfin = new byte[1] ;
      T010U3_n8006AlbAfin = new boolean[] {false} ;
      T010U3_A8037AlbNPed = new String[] {""} ;
      T010U3_n8037AlbNPed = new boolean[] {false} ;
      T010U3_A8051AlbObsp = new String[] {""} ;
      T010U3_n8051AlbObsp = new boolean[] {false} ;
      T010U3_A8679Bod_Dib = new String[] {""} ;
      T010U3_n8679Bod_Dib = new boolean[] {false} ;
      T010U3_A8680Bod_Tua = new long[1] ;
      T010U3_n8680Bod_Tua = new boolean[] {false} ;
      T010U3_A8681Bod_Tub = new long[1] ;
      T010U3_n8681Bod_Tub = new boolean[] {false} ;
      T010U3_A8682Bod_Tuc = new long[1] ;
      T010U3_n8682Bod_Tuc = new boolean[] {false} ;
      T010U3_A8683Bod_Hilz = new String[] {""} ;
      T010U3_n8683Bod_Hilz = new boolean[] {false} ;
      T010U3_A8684Bod_FecE = new java.util.Date[] {GXutil.nullDate()} ;
      T010U3_n8684Bod_FecE = new boolean[] {false} ;
      T010U3_A8685Bod_PedOr = new String[] {""} ;
      T010U3_n8685Bod_PedOr = new boolean[] {false} ;
      T010U3_A8774Bod_Rack = new String[] {""} ;
      T010U3_n8774Bod_Rack = new boolean[] {false} ;
      T010U3_A8775Bod_PoS = new String[] {""} ;
      T010U3_n8775Bod_PoS = new boolean[] {false} ;
      T010U3_A8776Bod_Ok = new String[] {""} ;
      T010U3_n8776Bod_Ok = new boolean[] {false} ;
      T010U3_A8779Bod_Talla = new String[] {""} ;
      T010U3_A8780Bod_Und = new short[1] ;
      T010U3_A8781Bod_Medt = new String[] {""} ;
      T010U3_n8781Bod_Medt = new boolean[] {false} ;
      T010U3_A8831Bod_ColNNn = new String[] {""} ;
      T010U3_n8831Bod_ColNNn = new boolean[] {false} ;
      T010U3_A8832Bod_Por = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U3_n8832Bod_Por = new boolean[] {false} ;
      T010U3_A8833Bod_codb = new String[] {""} ;
      T010U3_n8833Bod_codb = new boolean[] {false} ;
      T010U3_A8834Bod_Pes = new String[] {""} ;
      T010U3_n8834Bod_Pes = new boolean[] {false} ;
      T010U3_A8848Bod_DibO = new String[] {""} ;
      T010U3_n8848Bod_DibO = new boolean[] {false} ;
      T010U3_A9376Bod_item3 = new String[] {""} ;
      T010U3_n9376Bod_item3 = new boolean[] {false} ;
      T010U3_A9540Bod_ToE = new String[] {""} ;
      T010U3_n9540Bod_ToE = new boolean[] {false} ;
      T010U3_A9560Bod_DescP = new String[] {""} ;
      T010U3_n9560Bod_DescP = new boolean[] {false} ;
      T010U3_A9561Bod_CVar = new String[] {""} ;
      T010U3_n9561Bod_CVar = new boolean[] {false} ;
      T010U3_A9562Bod_NVar = new String[] {""} ;
      T010U3_n9562Bod_NVar = new boolean[] {false} ;
      T010U3_A396EmprCod = new String[] {""} ;
      T010U2_A4795AlRPieCal = new String[] {""} ;
      T010U2_A44AlbRecCod = new int[1] ;
      T010U2_n44AlbRecCod = new boolean[] {false} ;
      T010U2_A2159AlbRecPie = new String[] {""} ;
      T010U2_A4411AlbRecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T010U2_n4411AlbRecFec = new boolean[] {false} ;
      T010U2_A2154AlbRecAnh = new short[1] ;
      T010U2_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U2_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U2_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U2_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U2_A3730AlbRecCol = new short[1] ;
      T010U2_A3731AlbRecIdPz = new String[] {""} ;
      T010U2_A3732AlbRecIdRc = new int[1] ;
      T010U2_A4410AlbRecPal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U2_A7408ALRPIELOC = new String[] {""} ;
      T010U2_A7409ALRPIETEL = new short[1] ;
      T010U2_n7409ALRPIETEL = new boolean[] {false} ;
      T010U2_A7410ALRPIEOPE = new String[] {""} ;
      T010U2_n7410ALRPIEOPE = new boolean[] {false} ;
      T010U2_A7411ALRPIEST = new String[] {""} ;
      T010U2_n7411ALRPIEST = new boolean[] {false} ;
      T010U2_A7792AlbRecPnt = new short[1] ;
      T010U2_n7792AlbRecPnt = new boolean[] {false} ;
      T010U2_A7793AlbRecCo1 = new String[] {""} ;
      T010U2_n7793AlbRecCo1 = new boolean[] {false} ;
      T010U2_A7794AlbRecCo2 = new int[1] ;
      T010U2_n7794AlbRecCo2 = new boolean[] {false} ;
      T010U2_A7998AlbHdr = new int[1] ;
      T010U2_n7998AlbHdr = new boolean[] {false} ;
      T010U2_A7999AlbHdrr = new byte[1] ;
      T010U2_n7999AlbHdrr = new boolean[] {false} ;
      T010U2_A8000AlbHdrp = new String[] {""} ;
      T010U2_n8000AlbHdrp = new boolean[] {false} ;
      T010U2_A8001AlbSerT = new String[] {""} ;
      T010U2_n8001AlbSerT = new boolean[] {false} ;
      T010U2_A8002AlbColNm = new String[] {""} ;
      T010U2_n8002AlbColNm = new boolean[] {false} ;
      T010U2_A8003AlbColNn = new int[1] ;
      T010U2_n8003AlbColNn = new boolean[] {false} ;
      T010U2_A8004AlbKgsPf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U2_n8004AlbKgsPf = new boolean[] {false} ;
      T010U2_A8005AlbMtsPf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U2_n8005AlbMtsPf = new boolean[] {false} ;
      T010U2_A8006AlbAfin = new byte[1] ;
      T010U2_n8006AlbAfin = new boolean[] {false} ;
      T010U2_A8037AlbNPed = new String[] {""} ;
      T010U2_n8037AlbNPed = new boolean[] {false} ;
      T010U2_A8051AlbObsp = new String[] {""} ;
      T010U2_n8051AlbObsp = new boolean[] {false} ;
      T010U2_A8679Bod_Dib = new String[] {""} ;
      T010U2_n8679Bod_Dib = new boolean[] {false} ;
      T010U2_A8680Bod_Tua = new long[1] ;
      T010U2_n8680Bod_Tua = new boolean[] {false} ;
      T010U2_A8681Bod_Tub = new long[1] ;
      T010U2_n8681Bod_Tub = new boolean[] {false} ;
      T010U2_A8682Bod_Tuc = new long[1] ;
      T010U2_n8682Bod_Tuc = new boolean[] {false} ;
      T010U2_A8683Bod_Hilz = new String[] {""} ;
      T010U2_n8683Bod_Hilz = new boolean[] {false} ;
      T010U2_A8684Bod_FecE = new java.util.Date[] {GXutil.nullDate()} ;
      T010U2_n8684Bod_FecE = new boolean[] {false} ;
      T010U2_A8685Bod_PedOr = new String[] {""} ;
      T010U2_n8685Bod_PedOr = new boolean[] {false} ;
      T010U2_A8774Bod_Rack = new String[] {""} ;
      T010U2_n8774Bod_Rack = new boolean[] {false} ;
      T010U2_A8775Bod_PoS = new String[] {""} ;
      T010U2_n8775Bod_PoS = new boolean[] {false} ;
      T010U2_A8776Bod_Ok = new String[] {""} ;
      T010U2_n8776Bod_Ok = new boolean[] {false} ;
      T010U2_A8779Bod_Talla = new String[] {""} ;
      T010U2_A8780Bod_Und = new short[1] ;
      T010U2_A8781Bod_Medt = new String[] {""} ;
      T010U2_n8781Bod_Medt = new boolean[] {false} ;
      T010U2_A8831Bod_ColNNn = new String[] {""} ;
      T010U2_n8831Bod_ColNNn = new boolean[] {false} ;
      T010U2_A8832Bod_Por = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T010U2_n8832Bod_Por = new boolean[] {false} ;
      T010U2_A8833Bod_codb = new String[] {""} ;
      T010U2_n8833Bod_codb = new boolean[] {false} ;
      T010U2_A8834Bod_Pes = new String[] {""} ;
      T010U2_n8834Bod_Pes = new boolean[] {false} ;
      T010U2_A8848Bod_DibO = new String[] {""} ;
      T010U2_n8848Bod_DibO = new boolean[] {false} ;
      T010U2_A9376Bod_item3 = new String[] {""} ;
      T010U2_n9376Bod_item3 = new boolean[] {false} ;
      T010U2_A9540Bod_ToE = new String[] {""} ;
      T010U2_n9540Bod_ToE = new boolean[] {false} ;
      T010U2_A9560Bod_DescP = new String[] {""} ;
      T010U2_n9560Bod_DescP = new boolean[] {false} ;
      T010U2_A9561Bod_CVar = new String[] {""} ;
      T010U2_n9561Bod_CVar = new boolean[] {false} ;
      T010U2_A9562Bod_NVar = new String[] {""} ;
      T010U2_n9562Bod_NVar = new boolean[] {false} ;
      T010U2_A396EmprCod = new String[] {""} ;
      T010U53_A396EmprCod = new String[] {""} ;
      T010U53_A44AlbRecCod = new int[1] ;
      T010U53_n44AlbRecCod = new boolean[] {false} ;
      T010U53_A2159AlbRecPie = new String[] {""} ;
      T010U53_A10188AlRFibOrd = new int[1] ;
      T010U54_A396EmprCod = new String[] {""} ;
      T010U54_A44AlbRecCod = new int[1] ;
      T010U54_n44AlbRecCod = new boolean[] {false} ;
      T010U54_A2159AlbRecPie = new String[] {""} ;
      T010U54_A9568CodHilz = new String[] {""} ;
      T010U55_A396EmprCod = new String[] {""} ;
      T010U55_A44AlbRecCod = new int[1] ;
      T010U55_n44AlbRecCod = new boolean[] {false} ;
      T010U55_A2159AlbRecPie = new String[] {""} ;
      T010U55_A7697AlREtiTpo = new byte[1] ;
      T010U56_A396EmprCod = new String[] {""} ;
      T010U56_A44AlbRecCod = new int[1] ;
      T010U56_n44AlbRecCod = new boolean[] {false} ;
      T010U56_A2159AlbRecPie = new String[] {""} ;
      T010U56_A5262AlbRecEvt = new short[1] ;
      T010U57_A396EmprCod = new String[] {""} ;
      T010U57_A44AlbRecCod = new int[1] ;
      T010U57_n44AlbRecCod = new boolean[] {false} ;
      T010U57_A2159AlbRecPie = new String[] {""} ;
      T010U57_A4395AlRDefCod = new short[1] ;
      T010U57_A4412AlRFasCod = new String[] {""} ;
      T010U58_A396EmprCod = new String[] {""} ;
      T010U58_A44AlbRecCod = new int[1] ;
      T010U58_n44AlbRecCod = new boolean[] {false} ;
      T010U58_A2159AlbRecPie = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      i4411AlbRecFec = GXutil.resetTime( GXutil.nullDate() );
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T010U59_A407EmprNom = new String[] {""} ;
      T010U59_n407EmprNom = new boolean[] {false} ;
      Z2147AlbDetKgmD = DecimalUtil.ZERO ;
      Z2150AlbDetMtrD = DecimalUtil.ZERO ;
      ZV18AlbCum = "" ;
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ2147AlbDetKgmD = DecimalUtil.ZERO ;
      ZZ2150AlbDetMtrD = DecimalUtil.ZERO ;
      ZZ407EmprNom = "" ;
      ZZ45AlbRef = "" ;
      ZZ46AlbREnt = "" ;
      ZZ56AlbRUni = "" ;
      ZZ50AlbRLoc = "" ;
      ZZ49AlbRFen = GXutil.nullDate() ;
      ZZ55AlbRReo = "" ;
      ZZ59AlbRUniReb = DecimalUtil.ZERO ;
      ZZ48AlbRFecUlt = GXutil.nullDate() ;
      ZZ1291AlbRDes = "" ;
      ZZ2149AlbDetMtr = DecimalUtil.ZERO ;
      ZZ2146AlbDetKgm = DecimalUtil.ZERO ;
      ZZ2151AlbDetMtrU = DecimalUtil.ZERO ;
      ZZ2148AlbDetKgmU = DecimalUtil.ZERO ;
      ZZ4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      ZZ6182AlbrNF = "" ;
      ZZ8835Bod_UltPz = "" ;
      ZZ279CliNom = "" ;
      ZZ841TrnNom = "" ;
      ZZ971ProceNom = "" ;
      ZZ1212TipEntNom = "" ;
      ZZV18AlbCum = "" ;
      ZZ58AlbRUniEnt = DecimalUtil.ZERO ;
      ZZ60AlbRUniUti = DecimalUtil.ZERO ;
      ZZ57AlbRUniDis = DecimalUtil.ZERO ;
      GXt_char3 = "" ;
      GXv_char5 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char1 = new String[1] ;
      ZV54PieUti = "" ;
      T010U60_Gx_cnt = new int[1] ;
      T010U61_Gx_cnt = new int[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.talmpz2__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.talmpz2__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.talmpz2__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.talmpz2__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talmpz2__default(),
         new Object[] {
             new Object[] {
            T010U2_A4795AlRPieCal, T010U2_A44AlbRecCod, T010U2_A2159AlbRecPie, T010U2_A4411AlbRecFec, T010U2_n4411AlbRecFec, T010U2_A2154AlbRecAnh, T010U2_A2157AlbRecMtr, T010U2_A2155AlbRecKgm, T010U2_A2158AlbRecMtrU, T010U2_A2156AlbRecKgmU,
            T010U2_A3730AlbRecCol, T010U2_A3731AlbRecIdPz, T010U2_A3732AlbRecIdRc, T010U2_A4410AlbRecPal, T010U2_A7408ALRPIELOC, T010U2_A7409ALRPIETEL, T010U2_n7409ALRPIETEL, T010U2_A7410ALRPIEOPE, T010U2_n7410ALRPIEOPE, T010U2_A7411ALRPIEST,
            T010U2_n7411ALRPIEST, T010U2_A7792AlbRecPnt, T010U2_n7792AlbRecPnt, T010U2_A7793AlbRecCo1, T010U2_n7793AlbRecCo1, T010U2_A7794AlbRecCo2, T010U2_n7794AlbRecCo2, T010U2_A7998AlbHdr, T010U2_n7998AlbHdr, T010U2_A7999AlbHdrr,
            T010U2_n7999AlbHdrr, T010U2_A8000AlbHdrp, T010U2_n8000AlbHdrp, T010U2_A8001AlbSerT, T010U2_n8001AlbSerT, T010U2_A8002AlbColNm, T010U2_n8002AlbColNm, T010U2_A8003AlbColNn, T010U2_n8003AlbColNn, T010U2_A8004AlbKgsPf,
            T010U2_n8004AlbKgsPf, T010U2_A8005AlbMtsPf, T010U2_n8005AlbMtsPf, T010U2_A8006AlbAfin, T010U2_n8006AlbAfin, T010U2_A8037AlbNPed, T010U2_n8037AlbNPed, T010U2_A8051AlbObsp, T010U2_n8051AlbObsp, T010U2_A8679Bod_Dib,
            T010U2_n8679Bod_Dib, T010U2_A8680Bod_Tua, T010U2_n8680Bod_Tua, T010U2_A8681Bod_Tub, T010U2_n8681Bod_Tub, T010U2_A8682Bod_Tuc, T010U2_n8682Bod_Tuc, T010U2_A8683Bod_Hilz, T010U2_n8683Bod_Hilz, T010U2_A8684Bod_FecE,
            T010U2_n8684Bod_FecE, T010U2_A8685Bod_PedOr, T010U2_n8685Bod_PedOr, T010U2_A8774Bod_Rack, T010U2_n8774Bod_Rack, T010U2_A8775Bod_PoS, T010U2_n8775Bod_PoS, T010U2_A8776Bod_Ok, T010U2_n8776Bod_Ok, T010U2_A8779Bod_Talla,
            T010U2_A8780Bod_Und, T010U2_A8781Bod_Medt, T010U2_n8781Bod_Medt, T010U2_A8831Bod_ColNNn, T010U2_n8831Bod_ColNNn, T010U2_A8832Bod_Por, T010U2_n8832Bod_Por, T010U2_A8833Bod_codb, T010U2_n8833Bod_codb, T010U2_A8834Bod_Pes,
            T010U2_n8834Bod_Pes, T010U2_A8848Bod_DibO, T010U2_n8848Bod_DibO, T010U2_A9376Bod_item3, T010U2_n9376Bod_item3, T010U2_A9540Bod_ToE, T010U2_n9540Bod_ToE, T010U2_A9560Bod_DescP, T010U2_n9560Bod_DescP, T010U2_A9561Bod_CVar,
            T010U2_n9561Bod_CVar, T010U2_A9562Bod_NVar, T010U2_n9562Bod_NVar, T010U2_A396EmprCod
            }
            , new Object[] {
            T010U3_A4795AlRPieCal, T010U3_A44AlbRecCod, T010U3_A2159AlbRecPie, T010U3_A4411AlbRecFec, T010U3_n4411AlbRecFec, T010U3_A2154AlbRecAnh, T010U3_A2157AlbRecMtr, T010U3_A2155AlbRecKgm, T010U3_A2158AlbRecMtrU, T010U3_A2156AlbRecKgmU,
            T010U3_A3730AlbRecCol, T010U3_A3731AlbRecIdPz, T010U3_A3732AlbRecIdRc, T010U3_A4410AlbRecPal, T010U3_A7408ALRPIELOC, T010U3_A7409ALRPIETEL, T010U3_n7409ALRPIETEL, T010U3_A7410ALRPIEOPE, T010U3_n7410ALRPIEOPE, T010U3_A7411ALRPIEST,
            T010U3_n7411ALRPIEST, T010U3_A7792AlbRecPnt, T010U3_n7792AlbRecPnt, T010U3_A7793AlbRecCo1, T010U3_n7793AlbRecCo1, T010U3_A7794AlbRecCo2, T010U3_n7794AlbRecCo2, T010U3_A7998AlbHdr, T010U3_n7998AlbHdr, T010U3_A7999AlbHdrr,
            T010U3_n7999AlbHdrr, T010U3_A8000AlbHdrp, T010U3_n8000AlbHdrp, T010U3_A8001AlbSerT, T010U3_n8001AlbSerT, T010U3_A8002AlbColNm, T010U3_n8002AlbColNm, T010U3_A8003AlbColNn, T010U3_n8003AlbColNn, T010U3_A8004AlbKgsPf,
            T010U3_n8004AlbKgsPf, T010U3_A8005AlbMtsPf, T010U3_n8005AlbMtsPf, T010U3_A8006AlbAfin, T010U3_n8006AlbAfin, T010U3_A8037AlbNPed, T010U3_n8037AlbNPed, T010U3_A8051AlbObsp, T010U3_n8051AlbObsp, T010U3_A8679Bod_Dib,
            T010U3_n8679Bod_Dib, T010U3_A8680Bod_Tua, T010U3_n8680Bod_Tua, T010U3_A8681Bod_Tub, T010U3_n8681Bod_Tub, T010U3_A8682Bod_Tuc, T010U3_n8682Bod_Tuc, T010U3_A8683Bod_Hilz, T010U3_n8683Bod_Hilz, T010U3_A8684Bod_FecE,
            T010U3_n8684Bod_FecE, T010U3_A8685Bod_PedOr, T010U3_n8685Bod_PedOr, T010U3_A8774Bod_Rack, T010U3_n8774Bod_Rack, T010U3_A8775Bod_PoS, T010U3_n8775Bod_PoS, T010U3_A8776Bod_Ok, T010U3_n8776Bod_Ok, T010U3_A8779Bod_Talla,
            T010U3_A8780Bod_Und, T010U3_A8781Bod_Medt, T010U3_n8781Bod_Medt, T010U3_A8831Bod_ColNNn, T010U3_n8831Bod_ColNNn, T010U3_A8832Bod_Por, T010U3_n8832Bod_Por, T010U3_A8833Bod_codb, T010U3_n8833Bod_codb, T010U3_A8834Bod_Pes,
            T010U3_n8834Bod_Pes, T010U3_A8848Bod_DibO, T010U3_n8848Bod_DibO, T010U3_A9376Bod_item3, T010U3_n9376Bod_item3, T010U3_A9540Bod_ToE, T010U3_n9540Bod_ToE, T010U3_A9560Bod_DescP, T010U3_n9560Bod_DescP, T010U3_A9561Bod_CVar,
            T010U3_n9561Bod_CVar, T010U3_A9562Bod_NVar, T010U3_n9562Bod_NVar, T010U3_A396EmprCod
            }
            , new Object[] {
            T010U5_A2152AlbDetPie, T010U5_A2149AlbDetMtr, T010U5_A2146AlbDetKgm, T010U5_A2151AlbDetMtrU, T010U5_A2148AlbDetKgmU
            }
            , new Object[] {
            T010U6_A44AlbRecCod, T010U6_A58AlbRUniEnt, T010U6_A60AlbRUniUti, T010U6_A52AlbRPieEnt, T010U6_A54AlbRPieUti, T010U6_A45AlbRef, T010U6_A46AlbREnt, T010U6_A56AlbRUni, T010U6_A50AlbRLoc, T010U6_A49AlbRFen,
            T010U6_A55AlbRReo, T010U6_A53AlbRPieReb, T010U6_A59AlbRUniReb, T010U6_A48AlbRFecUlt, T010U6_A47AlbREst, T010U6_A1222AlbNumEti, T010U6_A1291AlbRDes, T010U6_A4606AlbRHEn, T010U6_n4606AlbRHEn, T010U6_A6182AlbrNF,
            T010U6_A8835Bod_UltPz, T010U6_n8835Bod_UltPz, T010U6_A396EmprCod, T010U6_A252CliCod, T010U6_A840TrnCod, T010U6_n840TrnCod, T010U6_A970ProceCod, T010U6_n970ProceCod, T010U6_A1211TipEntCod, T010U6_n1211TipEntCod
            }
            , new Object[] {
            T010U7_A44AlbRecCod, T010U7_A58AlbRUniEnt, T010U7_A60AlbRUniUti, T010U7_A52AlbRPieEnt, T010U7_A54AlbRPieUti, T010U7_A45AlbRef, T010U7_A46AlbREnt, T010U7_A56AlbRUni, T010U7_A50AlbRLoc, T010U7_A49AlbRFen,
            T010U7_A55AlbRReo, T010U7_A53AlbRPieReb, T010U7_A59AlbRUniReb, T010U7_A48AlbRFecUlt, T010U7_A47AlbREst, T010U7_A1222AlbNumEti, T010U7_A1291AlbRDes, T010U7_A4606AlbRHEn, T010U7_n4606AlbRHEn, T010U7_A6182AlbrNF,
            T010U7_A8835Bod_UltPz, T010U7_n8835Bod_UltPz, T010U7_A396EmprCod, T010U7_A252CliCod, T010U7_A840TrnCod, T010U7_n840TrnCod, T010U7_A970ProceCod, T010U7_n970ProceCod, T010U7_A1211TipEntCod, T010U7_n1211TipEntCod
            }
            , new Object[] {
            T010U8_A407EmprNom, T010U8_n407EmprNom
            }
            , new Object[] {
            T010U9_A279CliNom
            }
            , new Object[] {
            T010U10_A841TrnNom, T010U10_n841TrnNom
            }
            , new Object[] {
            T010U11_A971ProceNom, T010U11_n971ProceNom
            }
            , new Object[] {
            T010U12_A1212TipEntNom, T010U12_n1212TipEntNom
            }
            , new Object[] {
            T010U14_A44AlbRecCod, T010U14_A58AlbRUniEnt, T010U14_A60AlbRUniUti, T010U14_A52AlbRPieEnt, T010U14_A54AlbRPieUti, T010U14_A407EmprNom, T010U14_n407EmprNom, T010U14_A279CliNom, T010U14_A45AlbRef, T010U14_A841TrnNom,
            T010U14_n841TrnNom, T010U14_A46AlbREnt, T010U14_A56AlbRUni, T010U14_A50AlbRLoc, T010U14_A49AlbRFen, T010U14_A55AlbRReo, T010U14_A53AlbRPieReb, T010U14_A59AlbRUniReb, T010U14_A48AlbRFecUlt, T010U14_A47AlbREst,
            T010U14_A1212TipEntNom, T010U14_n1212TipEntNom, T010U14_A1222AlbNumEti, T010U14_A1291AlbRDes, T010U14_A971ProceNom, T010U14_n971ProceNom, T010U14_A4606AlbRHEn, T010U14_n4606AlbRHEn, T010U14_A6182AlbrNF, T010U14_A8835Bod_UltPz,
            T010U14_n8835Bod_UltPz, T010U14_A396EmprCod, T010U14_A252CliCod, T010U14_A840TrnCod, T010U14_n840TrnCod, T010U14_A970ProceCod, T010U14_n970ProceCod, T010U14_A1211TipEntCod, T010U14_n1211TipEntCod, T010U14_A2152AlbDetPie,
            T010U14_A2149AlbDetMtr, T010U14_A2146AlbDetKgm, T010U14_A2151AlbDetMtrU, T010U14_A2148AlbDetKgmU
            }
            , new Object[] {
            T010U15_A279CliNom
            }
            , new Object[] {
            T010U16_A841TrnNom, T010U16_n841TrnNom
            }
            , new Object[] {
            T010U17_A971ProceNom, T010U17_n971ProceNom
            }
            , new Object[] {
            T010U18_A1212TipEntNom, T010U18_n1212TipEntNom
            }
            , new Object[] {
            T010U19_A396EmprCod, T010U19_A44AlbRecCod
            }
            , new Object[] {
            T010U20_A396EmprCod, T010U20_A44AlbRecCod
            }
            , new Object[] {
            T010U21_A396EmprCod, T010U21_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T010U25_A279CliNom
            }
            , new Object[] {
            T010U26_A841TrnNom, T010U26_n841TrnNom
            }
            , new Object[] {
            T010U27_A1212TipEntNom, T010U27_n1212TipEntNom
            }
            , new Object[] {
            T010U28_A971ProceNom, T010U28_n971ProceNom
            }
            , new Object[] {
            T010U29_A396EmprCod, T010U29_A13026PedDGId, T010U29_A44AlbRecCod
            }
            , new Object[] {
            T010U30_A396EmprCod, T010U30_A11669DevCruId, T010U30_A44AlbRecCod
            }
            , new Object[] {
            T010U31_A396EmprCod, T010U31_A44AlbRecCod, T010U31_A9743Emp_CUb, T010U31_A5860Emp_Anp
            }
            , new Object[] {
            T010U32_A396EmprCod, T010U32_A44AlbRecCod, T010U32_A7130MatC_Pz
            }
            , new Object[] {
            T010U33_A396EmprCod, T010U33_A44AlbRecCod, T010U33_A7132MatC_Talla
            }
            , new Object[] {
            T010U34_A396EmprCod, T010U34_A44AlbRecCod, T010U34_A7115MatC_Lin
            }
            , new Object[] {
            T010U35_A396EmprCod, T010U35_A30AlbProCod, T010U35_A129BarCod, T010U35_A132BarCodReo, T010U35_A130BarCodPar, T010U35_A6622AlbHdRLn
            }
            , new Object[] {
            T010U36_A396EmprCod, T010U36_A6235DevEmpCod, T010U36_A6243DevNumLin
            }
            , new Object[] {
            T010U37_A396EmprCod, T010U37_A44AlbRecCod, T010U37_A4596AlbRDefCod
            }
            , new Object[] {
            T010U38_A396EmprCod, T010U38_A44AlbRecCod, T010U38_A2159AlbRecPie, T010U38_A4395AlRDefCod, T010U38_A4412AlRFasCod
            }
            , new Object[] {
            T010U39_A396EmprCod, T010U39_A44AlbRecCod, T010U39_A2165HisEmpLin
            }
            , new Object[] {
            T010U40_A396EmprCod, T010U40_A44AlbRecCod, T010U40_A1299AlbRLin
            }
            , new Object[] {
            T010U41_A396EmprCod, T010U41_A361DisCod, T010U41_A44AlbRecCod
            }
            , new Object[] {
            T010U42_A396EmprCod, T010U42_A323DevGenCod
            }
            , new Object[] {
            T010U43_A396EmprCod, T010U43_A129BarCod, T010U43_A132BarCodReo, T010U43_A130BarCodPar, T010U43_A200BarPieCod
            }
            , new Object[] {
            T010U45_A2152AlbDetPie, T010U45_A2149AlbDetMtr, T010U45_A2146AlbDetKgm, T010U45_A2151AlbDetMtrU, T010U45_A2148AlbDetKgmU
            }
            , new Object[] {
            }
            , new Object[] {
            T010U47_A396EmprCod, T010U47_A44AlbRecCod
            }
            , new Object[] {
            T010U48_A4795AlRPieCal, T010U48_A44AlbRecCod, T010U48_A2159AlbRecPie, T010U48_A4411AlbRecFec, T010U48_n4411AlbRecFec, T010U48_A2154AlbRecAnh, T010U48_A2157AlbRecMtr, T010U48_A2155AlbRecKgm, T010U48_A2158AlbRecMtrU, T010U48_A2156AlbRecKgmU,
            T010U48_A3730AlbRecCol, T010U48_A3731AlbRecIdPz, T010U48_A3732AlbRecIdRc, T010U48_A4410AlbRecPal, T010U48_A7408ALRPIELOC, T010U48_A7409ALRPIETEL, T010U48_n7409ALRPIETEL, T010U48_A7410ALRPIEOPE, T010U48_n7410ALRPIEOPE, T010U48_A7411ALRPIEST,
            T010U48_n7411ALRPIEST, T010U48_A7792AlbRecPnt, T010U48_n7792AlbRecPnt, T010U48_A7793AlbRecCo1, T010U48_n7793AlbRecCo1, T010U48_A7794AlbRecCo2, T010U48_n7794AlbRecCo2, T010U48_A7998AlbHdr, T010U48_n7998AlbHdr, T010U48_A7999AlbHdrr,
            T010U48_n7999AlbHdrr, T010U48_A8000AlbHdrp, T010U48_n8000AlbHdrp, T010U48_A8001AlbSerT, T010U48_n8001AlbSerT, T010U48_A8002AlbColNm, T010U48_n8002AlbColNm, T010U48_A8003AlbColNn, T010U48_n8003AlbColNn, T010U48_A8004AlbKgsPf,
            T010U48_n8004AlbKgsPf, T010U48_A8005AlbMtsPf, T010U48_n8005AlbMtsPf, T010U48_A8006AlbAfin, T010U48_n8006AlbAfin, T010U48_A8037AlbNPed, T010U48_n8037AlbNPed, T010U48_A8051AlbObsp, T010U48_n8051AlbObsp, T010U48_A8679Bod_Dib,
            T010U48_n8679Bod_Dib, T010U48_A8680Bod_Tua, T010U48_n8680Bod_Tua, T010U48_A8681Bod_Tub, T010U48_n8681Bod_Tub, T010U48_A8682Bod_Tuc, T010U48_n8682Bod_Tuc, T010U48_A8683Bod_Hilz, T010U48_n8683Bod_Hilz, T010U48_A8684Bod_FecE,
            T010U48_n8684Bod_FecE, T010U48_A8685Bod_PedOr, T010U48_n8685Bod_PedOr, T010U48_A8774Bod_Rack, T010U48_n8774Bod_Rack, T010U48_A8775Bod_PoS, T010U48_n8775Bod_PoS, T010U48_A8776Bod_Ok, T010U48_n8776Bod_Ok, T010U48_A8779Bod_Talla,
            T010U48_A8780Bod_Und, T010U48_A8781Bod_Medt, T010U48_n8781Bod_Medt, T010U48_A8831Bod_ColNNn, T010U48_n8831Bod_ColNNn, T010U48_A8832Bod_Por, T010U48_n8832Bod_Por, T010U48_A8833Bod_codb, T010U48_n8833Bod_codb, T010U48_A8834Bod_Pes,
            T010U48_n8834Bod_Pes, T010U48_A8848Bod_DibO, T010U48_n8848Bod_DibO, T010U48_A9376Bod_item3, T010U48_n9376Bod_item3, T010U48_A9540Bod_ToE, T010U48_n9540Bod_ToE, T010U48_A9560Bod_DescP, T010U48_n9560Bod_DescP, T010U48_A9561Bod_CVar,
            T010U48_n9561Bod_CVar, T010U48_A9562Bod_NVar, T010U48_n9562Bod_NVar, T010U48_A396EmprCod
            }
            , new Object[] {
            T010U49_A396EmprCod, T010U49_A44AlbRecCod, T010U49_A2159AlbRecPie
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T010U53_A396EmprCod, T010U53_A44AlbRecCod, T010U53_A2159AlbRecPie, T010U53_A10188AlRFibOrd
            }
            , new Object[] {
            T010U54_A396EmprCod, T010U54_A44AlbRecCod, T010U54_A2159AlbRecPie, T010U54_A9568CodHilz
            }
            , new Object[] {
            T010U55_A396EmprCod, T010U55_A44AlbRecCod, T010U55_A2159AlbRecPie, T010U55_A7697AlREtiTpo
            }
            , new Object[] {
            T010U56_A396EmprCod, T010U56_A44AlbRecCod, T010U56_A2159AlbRecPie, T010U56_A5262AlbRecEvt
            }
            , new Object[] {
            T010U57_A396EmprCod, T010U57_A44AlbRecCod, T010U57_A2159AlbRecPie, T010U57_A4395AlRDefCod, T010U57_A4412AlRFasCod
            }
            , new Object[] {
            T010U58_A396EmprCod, T010U58_A44AlbRecCod, T010U58_A2159AlbRecPie
            }
            , new Object[] {
            T010U59_A407EmprNom, T010U59_n407EmprNom
            }
            , new Object[] {
            T010U60_Gx_cnt
            }
            , new Object[] {
            T010U61_Gx_cnt
            }
         }
      );
      Z44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      E44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      A44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      Z396EmprCod = "" ;
      E396EmprCod = "" ;
      A396EmprCod = "" ;
      Z4411AlbRecFec = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n4411AlbRecFec = false ;
      A4411AlbRecFec = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n4411AlbRecFec = false ;
      i4411AlbRecFec = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n4411AlbRecFec = false ;
      Z4606AlbRHEn = GXutil.now( ) ;
      n4606AlbRHEn = false ;
      A4606AlbRHEn = GXutil.now( ) ;
      n4606AlbRHEn = false ;
      i4606AlbRHEn = GXutil.now( ) ;
      n4606AlbRHEn = false ;
   }

   private byte Z47AlbREst ;
   private byte Z7999AlbHdrr ;
   private byte Z8006AlbAfin ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A47AlbREst ;
   private byte AV67Lindalana ;
   private byte A7999AlbHdrr ;
   private byte A8006AlbAfin ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ47AlbREst ;
   private short Z1222AlbNumEti ;
   private short Z840TrnCod ;
   private short Z970ProceCod ;
   private short Z1211TipEntCod ;
   private short Z2154AlbRecAnh ;
   private short Z3730AlbRecCol ;
   private short Z7409ALRPIETEL ;
   private short Z7792AlbRecPnt ;
   private short Z8780Bod_Und ;
   private short nRcdDeleted_299 ;
   private short nRcdExists_299 ;
   private short nIsMod_299 ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short A1211TipEntCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A2152AlbDetPie ;
   private short A2153AlbDetPieU ;
   private short A1222AlbNumEti ;
   private short nBlankRcdCount299 ;
   private short RcdFound299 ;
   private short nBlankRcdUsr299 ;
   private short s2153AlbDetPieU ;
   private short O2153AlbDetPieU ;
   private short A2154AlbRecAnh ;
   private short A3730AlbRecCol ;
   private short A7409ALRPIETEL ;
   private short A7792AlbRecPnt ;
   private short A8780Bod_Und ;
   private short Z2152AlbDetPie ;
   private short RcdFound7 ;
   private short nIsDirty_7 ;
   private short nIsDirty_299 ;
   private short Z2153AlbDetPieU ;
   private short ZZ840TrnCod ;
   private short ZZ1211TipEntCod ;
   private short ZZ1222AlbNumEti ;
   private short ZZ970ProceCod ;
   private short ZZ2152AlbDetPie ;
   private short ZZ2153AlbDetPieU ;
   private int wcpOA44AlbRecCod ;
   private int Z44AlbRecCod ;
   private int Z52AlbRPieEnt ;
   private int Z54AlbRPieUti ;
   private int Z53AlbRPieReb ;
   private int Z252CliCod ;
   private int nRC_GXsfl_220 ;
   private int nGXsfl_220_idx=1 ;
   private int Z3732AlbRecIdRc ;
   private int Z7794AlbRecCo2 ;
   private int Z7998AlbHdr ;
   private int Z8003AlbColNn ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtAlbRecCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtAlbRef_Enabled ;
   private int edtTrnCod_Enabled ;
   private int edtTrnNom_Enabled ;
   private int edtAlbREnt_Enabled ;
   private int A52AlbRPieEnt ;
   private int edtAlbRPieEnt_Enabled ;
   private int edtAlbRLoc_Enabled ;
   private int edtAlbRFen_Enabled ;
   private int edtAlbRUniEnt_Enabled ;
   private int A54AlbRPieUti ;
   private int edtAlbRPieUti_Enabled ;
   private int A53AlbRPieReb ;
   private int edtAlbRPieReb_Enabled ;
   private int edtAlbRUniUti_Enabled ;
   private int edtAlbRUniReb_Enabled ;
   private int A51AlbRPieDis ;
   private int edtAlbRPieDis_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int edtAlbRFecUlt_Enabled ;
   private int edtTipEntCod_Enabled ;
   private int edtTipEntNom_Enabled ;
   private int edtAlbNumEti_Enabled ;
   private int edtAlbRDes_Enabled ;
   private int edtProceCod_Enabled ;
   private int edtProceNom_Enabled ;
   private int edtAlbDetPie_Enabled ;
   private int edtAlbDetMtr_Enabled ;
   private int edtAlbDetKgm_Enabled ;
   private int edtAlbDetMtrU_Enabled ;
   private int edtAlbDetKgmU_Enabled ;
   private int edtAlbDetMtrD_Enabled ;
   private int edtAlbDetKgmD_Enabled ;
   private int edtAlbDetPieU_Enabled ;
   private int edtAlbRHEn_Enabled ;
   private int edtAlbrNF_Enabled ;
   private int edtBod_UltPz_Enabled ;
   private int edtavnRcdDeleted_299_Enabled ;
   private int edtAlbRecPie_Enabled ;
   private int edtAlbRecAnh_Enabled ;
   private int edtAlbRecMtr_Enabled ;
   private int edtAlbRecKgm_Enabled ;
   private int edtAlbRecMtrU_Enabled ;
   private int edtAlbRecKgmU_Enabled ;
   private int edtAlbRecCol_Enabled ;
   private int edtAlbRecIdPz_Enabled ;
   private int edtAlbRecIdRc_Enabled ;
   private int edtAlbRecPal_Enabled ;
   private int edtALRPIELOC_Enabled ;
   private int edtALRPIETEL_Enabled ;
   private int edtALRPIEOPE_Enabled ;
   private int edtALRPIEST_Enabled ;
   private int edtAlbRecFec_Enabled ;
   private int edtAlbRecPnt_Enabled ;
   private int edtAlbRecCo1_Enabled ;
   private int edtAlbRecCo2_Enabled ;
   private int edtAlbHdr_Enabled ;
   private int edtAlbHdrr_Enabled ;
   private int edtAlbHdrp_Enabled ;
   private int edtAlbSerT_Enabled ;
   private int edtAlbColNm_Enabled ;
   private int edtAlbColNn_Enabled ;
   private int edtAlbKgsPf_Enabled ;
   private int edtAlbMtsPf_Enabled ;
   private int edtAlbAfin_Enabled ;
   private int edtAlbNPed_Enabled ;
   private int edtAlbObsp_Enabled ;
   private int edtBod_Dib_Enabled ;
   private int edtBod_Tua_Enabled ;
   private int edtBod_Tub_Enabled ;
   private int edtBod_Tuc_Enabled ;
   private int edtBod_Hilz_Enabled ;
   private int edtBod_FecE_Enabled ;
   private int edtBod_PedOr_Enabled ;
   private int edtBod_Rack_Enabled ;
   private int edtBod_PoS_Enabled ;
   private int edtBod_Ok_Enabled ;
   private int edtBod_Talla_Enabled ;
   private int edtBod_Und_Enabled ;
   private int edtBod_Medt_Enabled ;
   private int edtBod_ColNNn_Enabled ;
   private int edtBod_Por_Enabled ;
   private int edtBod_codb_Enabled ;
   private int edtBod_Pes_Enabled ;
   private int edtBod_DibO_Enabled ;
   private int edtBod_item3_Enabled ;
   private int edtBod_ToE_Enabled ;
   private int edtBod_DescP_Enabled ;
   private int edtBod_CVar_Enabled ;
   private int edtBod_NVar_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A3732AlbRecIdRc ;
   private int A7794AlbRecCo2 ;
   private int A7998AlbHdr ;
   private int A8003AlbColNn ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtAlbRecPie_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtBod_UltPz_Backcolor ;
   private int edtAlbrNF_Backcolor ;
   private int edtAlbRHEn_Backcolor ;
   private int edtAlbDetPieU_Backcolor ;
   private int edtAlbDetKgmD_Backcolor ;
   private int edtAlbDetMtrD_Backcolor ;
   private int edtAlbDetKgmU_Backcolor ;
   private int edtAlbDetMtrU_Backcolor ;
   private int edtAlbDetKgm_Backcolor ;
   private int edtAlbDetMtr_Backcolor ;
   private int edtAlbDetPie_Backcolor ;
   private int edtProceNom_Backcolor ;
   private int edtProceCod_Backcolor ;
   private int edtAlbRDes_Backcolor ;
   private int edtAlbNumEti_Backcolor ;
   private int edtTipEntNom_Backcolor ;
   private int edtTipEntCod_Backcolor ;
   private int edtAlbRFecUlt_Backcolor ;
   private int edtAlbRUniDis_Backcolor ;
   private int edtAlbRPieDis_Backcolor ;
   private int edtAlbRUniReb_Backcolor ;
   private int edtAlbRUniUti_Backcolor ;
   private int edtAlbRPieReb_Backcolor ;
   private int edtAlbRPieUti_Backcolor ;
   private int edtAlbRUniEnt_Backcolor ;
   private int edtAlbRFen_Backcolor ;
   private int edtAlbRLoc_Backcolor ;
   private int edtAlbRPieEnt_Backcolor ;
   private int edtAlbREnt_Backcolor ;
   private int edtTrnNom_Backcolor ;
   private int edtTrnCod_Backcolor ;
   private int edtAlbRef_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtAlbRecCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int Z51AlbRPieDis ;
   private int ZZ44AlbRecCod ;
   private int ZZ52AlbRPieEnt ;
   private int ZZ252CliCod ;
   private int ZZ53AlbRPieReb ;
   private int ZZ54AlbRPieUti ;
   private int ZZ51AlbRPieDis ;
   private int GXv_int2[] ;
   private int Gx_cnt ;
   private int E44AlbRecCod ;
   private long Z8680Bod_Tua ;
   private long Z8681Bod_Tub ;
   private long Z8682Bod_Tuc ;
   private long GRID1_nFirstRecordOnPage ;
   private long A8680Bod_Tua ;
   private long A8681Bod_Tub ;
   private long A8682Bod_Tuc ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal Z59AlbRUniReb ;
   private java.math.BigDecimal Z2157AlbRecMtr ;
   private java.math.BigDecimal Z2155AlbRecKgm ;
   private java.math.BigDecimal Z2158AlbRecMtrU ;
   private java.math.BigDecimal Z2156AlbRecKgmU ;
   private java.math.BigDecimal Z4410AlbRecPal ;
   private java.math.BigDecimal Z8004AlbKgsPf ;
   private java.math.BigDecimal Z8005AlbMtsPf ;
   private java.math.BigDecimal Z8832Bod_Por ;
   private java.math.BigDecimal A2146AlbDetKgm ;
   private java.math.BigDecimal A2148AlbDetKgmU ;
   private java.math.BigDecimal A2149AlbDetMtr ;
   private java.math.BigDecimal A2151AlbDetMtrU ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A59AlbRUniReb ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A2150AlbDetMtrD ;
   private java.math.BigDecimal A2147AlbDetKgmD ;
   private java.math.BigDecimal s2147AlbDetKgmD ;
   private java.math.BigDecimal O2147AlbDetKgmD ;
   private java.math.BigDecimal s2150AlbDetMtrD ;
   private java.math.BigDecimal O2150AlbDetMtrD ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal A4410AlbRecPal ;
   private java.math.BigDecimal A8004AlbKgsPf ;
   private java.math.BigDecimal A8005AlbMtsPf ;
   private java.math.BigDecimal A8832Bod_Por ;
   private java.math.BigDecimal Z2149AlbDetMtr ;
   private java.math.BigDecimal Z2146AlbDetKgm ;
   private java.math.BigDecimal Z2151AlbDetMtrU ;
   private java.math.BigDecimal Z2148AlbDetKgmU ;
   private java.math.BigDecimal Z2147AlbDetKgmD ;
   private java.math.BigDecimal Z2150AlbDetMtrD ;
   private java.math.BigDecimal Z57AlbRUniDis ;
   private java.math.BigDecimal ZZ2147AlbDetKgmD ;
   private java.math.BigDecimal ZZ2150AlbDetMtrD ;
   private java.math.BigDecimal ZZ59AlbRUniReb ;
   private java.math.BigDecimal ZZ2149AlbDetMtr ;
   private java.math.BigDecimal ZZ2146AlbDetKgm ;
   private java.math.BigDecimal ZZ2151AlbDetMtrU ;
   private java.math.BigDecimal ZZ2148AlbDetKgmU ;
   private java.math.BigDecimal ZZ58AlbRUniEnt ;
   private java.math.BigDecimal ZZ60AlbRUniUti ;
   private java.math.BigDecimal ZZ57AlbRUniDis ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String Z45AlbRef ;
   private String Z46AlbREnt ;
   private String Z56AlbRUni ;
   private String Z50AlbRLoc ;
   private String Z55AlbRReo ;
   private String Z1291AlbRDes ;
   private String Z6182AlbrNF ;
   private String Z8835Bod_UltPz ;
   private String Z2159AlbRecPie ;
   private String Z4795AlRPieCal ;
   private String Z3731AlbRecIdPz ;
   private String Z7408ALRPIELOC ;
   private String Z7410ALRPIEOPE ;
   private String Z7411ALRPIEST ;
   private String Z7793AlbRecCo1 ;
   private String Z8000AlbHdrp ;
   private String Z8001AlbSerT ;
   private String Z8002AlbColNm ;
   private String Z8037AlbNPed ;
   private String Z8679Bod_Dib ;
   private String Z8683Bod_Hilz ;
   private String Z8685Bod_PedOr ;
   private String Z8774Bod_Rack ;
   private String Z8775Bod_PoS ;
   private String Z8776Bod_Ok ;
   private String Z8779Bod_Talla ;
   private String Z8781Bod_Medt ;
   private String Z8831Bod_ColNNn ;
   private String Z8833Bod_codb ;
   private String Z8834Bod_Pes ;
   private String Z8848Bod_DibO ;
   private String Z9376Bod_item3 ;
   private String Z9540Bod_ToE ;
   private String Z9560Bod_DescP ;
   private String Z9561Bod_CVar ;
   private String Z9562Bod_NVar ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A56AlbRUni ;
   private String A2159AlbRecPie ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
   private String sGXsfl_220_idx="0001" ;
   private String Gx_mode ;
   private String A55AlbRReo ;
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
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRecCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtAlbRef_Internalname ;
   private String A45AlbRef ;
   private String edtAlbRef_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtTrnNom_Internalname ;
   private String A841TrnNom ;
   private String edtTrnNom_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtAlbREnt_Internalname ;
   private String A46AlbREnt ;
   private String edtAlbREnt_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtAlbRLoc_Internalname ;
   private String A50AlbRLoc ;
   private String edtAlbRLoc_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtAlbRFen_Internalname ;
   private String edtAlbRFen_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtAlbRPieUti_Internalname ;
   private String edtAlbRPieUti_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtAlbRPieReb_Internalname ;
   private String edtAlbRPieReb_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtAlbRUniUti_Internalname ;
   private String edtAlbRUniUti_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtAlbRUniReb_Internalname ;
   private String edtAlbRUniReb_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRPieDis_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRUniDis_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtAlbRFecUlt_Internalname ;
   private String edtAlbRFecUlt_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtTipEntCod_Internalname ;
   private String edtTipEntCod_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtTipEntNom_Internalname ;
   private String A1212TipEntNom ;
   private String edtTipEntNom_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtAlbNumEti_Internalname ;
   private String edtAlbNumEti_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtAlbRDes_Internalname ;
   private String A1291AlbRDes ;
   private String edtAlbRDes_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtProceCod_Internalname ;
   private String edtProceCod_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtProceNom_Internalname ;
   private String A971ProceNom ;
   private String edtProceNom_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtAlbDetPie_Internalname ;
   private String edtAlbDetPie_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtAlbDetMtr_Internalname ;
   private String edtAlbDetMtr_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtAlbDetKgm_Internalname ;
   private String edtAlbDetKgm_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtAlbDetMtrU_Internalname ;
   private String edtAlbDetMtrU_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtAlbDetKgmU_Internalname ;
   private String edtAlbDetKgmU_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtAlbDetMtrD_Internalname ;
   private String edtAlbDetMtrD_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtAlbDetKgmD_Internalname ;
   private String edtAlbDetKgmD_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtAlbDetPieU_Internalname ;
   private String edtAlbDetPieU_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtAlbRHEn_Internalname ;
   private String edtAlbRHEn_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String edtAlbrNF_Internalname ;
   private String A6182AlbrNF ;
   private String edtAlbrNF_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtBod_UltPz_Internalname ;
   private String A8835Bod_UltPz ;
   private String edtBod_UltPz_Jsonclick ;
   private String sMode299 ;
   private String edtavnRcdDeleted_299_Internalname ;
   private String edtAlbRecPie_Internalname ;
   private String edtAlbRecAnh_Internalname ;
   private String edtAlbRecMtr_Internalname ;
   private String edtAlbRecKgm_Internalname ;
   private String edtAlbRecMtrU_Internalname ;
   private String edtAlbRecKgmU_Internalname ;
   private String edtAlbRecCol_Internalname ;
   private String edtAlbRecIdPz_Internalname ;
   private String edtAlbRecIdRc_Internalname ;
   private String edtAlbRecPal_Internalname ;
   private String edtALRPIELOC_Internalname ;
   private String edtALRPIETEL_Internalname ;
   private String edtALRPIEOPE_Internalname ;
   private String edtALRPIEST_Internalname ;
   private String edtAlbRecFec_Internalname ;
   private String edtAlbRecPnt_Internalname ;
   private String edtAlbRecCo1_Internalname ;
   private String edtAlbRecCo2_Internalname ;
   private String edtAlbHdr_Internalname ;
   private String edtAlbHdrr_Internalname ;
   private String edtAlbHdrp_Internalname ;
   private String edtAlbSerT_Internalname ;
   private String edtAlbColNm_Internalname ;
   private String edtAlbColNn_Internalname ;
   private String edtAlbKgsPf_Internalname ;
   private String edtAlbMtsPf_Internalname ;
   private String edtAlbAfin_Internalname ;
   private String edtAlbNPed_Internalname ;
   private String edtAlbObsp_Internalname ;
   private String edtBod_Dib_Internalname ;
   private String edtBod_Tua_Internalname ;
   private String edtBod_Tub_Internalname ;
   private String edtBod_Tuc_Internalname ;
   private String edtBod_Hilz_Internalname ;
   private String edtBod_FecE_Internalname ;
   private String edtBod_PedOr_Internalname ;
   private String edtBod_Rack_Internalname ;
   private String edtBod_PoS_Internalname ;
   private String edtBod_Ok_Internalname ;
   private String edtBod_Talla_Internalname ;
   private String edtBod_Und_Internalname ;
   private String edtBod_Medt_Internalname ;
   private String edtBod_ColNNn_Internalname ;
   private String edtBod_Por_Internalname ;
   private String edtBod_codb_Internalname ;
   private String edtBod_Pes_Internalname ;
   private String edtBod_DibO_Internalname ;
   private String edtBod_item3_Internalname ;
   private String edtBod_ToE_Internalname ;
   private String edtBod_DescP_Internalname ;
   private String edtBod_CVar_Internalname ;
   private String edtBod_NVar_Internalname ;
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
   private String AV17UsurCod ;
   private String AV18AlbCum ;
   private String A4795AlRPieCal ;
   private String AV54PieUti ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode7 ;
   private String GXCCtl ;
   private String A3731AlbRecIdPz ;
   private String A7408ALRPIELOC ;
   private String A7410ALRPIEOPE ;
   private String A7411ALRPIEST ;
   private String A7793AlbRecCo1 ;
   private String A8000AlbHdrp ;
   private String A8001AlbSerT ;
   private String A8002AlbColNm ;
   private String A8037AlbNPed ;
   private String A8679Bod_Dib ;
   private String A8683Bod_Hilz ;
   private String A8685Bod_PedOr ;
   private String A8774Bod_Rack ;
   private String A8775Bod_PoS ;
   private String A8776Bod_Ok ;
   private String A8779Bod_Talla ;
   private String A8781Bod_Medt ;
   private String A8831Bod_ColNNn ;
   private String A8833Bod_codb ;
   private String A8834Bod_Pes ;
   private String A8848Bod_DibO ;
   private String A9376Bod_item3 ;
   private String A9540Bod_ToE ;
   private String A9560Bod_DescP ;
   private String A9561Bod_CVar ;
   private String A9562Bod_NVar ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z841TrnNom ;
   private String Z1212TipEntNom ;
   private String Z971ProceNom ;
   private String sGXsfl_220_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_299_Jsonclick ;
   private String edtAlbRecPie_Jsonclick ;
   private String edtAlbRecAnh_Jsonclick ;
   private String edtAlbRecMtr_Jsonclick ;
   private String edtAlbRecKgm_Jsonclick ;
   private String edtAlbRecMtrU_Jsonclick ;
   private String edtAlbRecKgmU_Jsonclick ;
   private String edtAlbRecCol_Jsonclick ;
   private String edtAlbRecIdPz_Jsonclick ;
   private String edtAlbRecIdRc_Jsonclick ;
   private String edtAlbRecPal_Jsonclick ;
   private String edtALRPIELOC_Jsonclick ;
   private String edtALRPIETEL_Jsonclick ;
   private String edtALRPIEOPE_Jsonclick ;
   private String edtALRPIEST_Jsonclick ;
   private String edtAlbRecFec_Jsonclick ;
   private String edtAlbRecPnt_Jsonclick ;
   private String edtAlbRecCo1_Jsonclick ;
   private String edtAlbRecCo2_Jsonclick ;
   private String edtAlbHdr_Jsonclick ;
   private String edtAlbHdrr_Jsonclick ;
   private String edtAlbHdrp_Jsonclick ;
   private String edtAlbSerT_Jsonclick ;
   private String edtAlbColNm_Jsonclick ;
   private String edtAlbColNn_Jsonclick ;
   private String edtAlbKgsPf_Jsonclick ;
   private String edtAlbMtsPf_Jsonclick ;
   private String edtAlbAfin_Jsonclick ;
   private String edtAlbNPed_Jsonclick ;
   private String edtAlbObsp_Jsonclick ;
   private String edtBod_Dib_Jsonclick ;
   private String edtBod_Tua_Jsonclick ;
   private String edtBod_Tub_Jsonclick ;
   private String edtBod_Tuc_Jsonclick ;
   private String edtBod_Hilz_Jsonclick ;
   private String edtBod_FecE_Jsonclick ;
   private String edtBod_PedOr_Jsonclick ;
   private String edtBod_Rack_Jsonclick ;
   private String edtBod_PoS_Jsonclick ;
   private String edtBod_Ok_Jsonclick ;
   private String edtBod_Talla_Jsonclick ;
   private String edtBod_Und_Jsonclick ;
   private String edtBod_Medt_Jsonclick ;
   private String edtBod_ColNNn_Jsonclick ;
   private String edtBod_Por_Jsonclick ;
   private String edtBod_codb_Jsonclick ;
   private String edtBod_Pes_Jsonclick ;
   private String edtBod_DibO_Jsonclick ;
   private String edtBod_item3_Jsonclick ;
   private String edtBod_ToE_Jsonclick ;
   private String edtBod_DescP_Jsonclick ;
   private String edtBod_CVar_Jsonclick ;
   private String edtBod_NVar_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZV18AlbCum ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ45AlbRef ;
   private String ZZ46AlbREnt ;
   private String ZZ56AlbRUni ;
   private String ZZ50AlbRLoc ;
   private String ZZ55AlbRReo ;
   private String ZZ1291AlbRDes ;
   private String ZZ6182AlbrNF ;
   private String ZZ8835Bod_UltPz ;
   private String ZZ279CliNom ;
   private String ZZ841TrnNom ;
   private String ZZ971ProceNom ;
   private String ZZ1212TipEntNom ;
   private String ZZV18AlbCum ;
   private String GXt_char3 ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String ZV54PieUti ;
   private String E396EmprCod ;
   private java.util.Date Z4606AlbRHEn ;
   private java.util.Date Z4411AlbRecFec ;
   private java.util.Date A4606AlbRHEn ;
   private java.util.Date A4411AlbRecFec ;
   private java.util.Date i4606AlbRHEn ;
   private java.util.Date i4411AlbRecFec ;
   private java.util.Date ZZ4606AlbRHEn ;
   private java.util.Date Z49AlbRFen ;
   private java.util.Date Z48AlbRFecUlt ;
   private java.util.Date Z8684Bod_FecE ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date A48AlbRFecUlt ;
   private java.util.Date A8684Bod_FecE ;
   private java.util.Date ZZ49AlbRFen ;
   private java.util.Date ZZ48AlbRFecUlt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n44AlbRecCod ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean n1211TipEntCod ;
   private boolean wbErr ;
   private boolean bGXsfl_220_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private boolean n1212TipEntNom ;
   private boolean n971ProceNom ;
   private boolean n4606AlbRHEn ;
   private boolean n8835Bod_UltPz ;
   private boolean Gx_longc ;
   private boolean n4411AlbRecFec ;
   private boolean n7409ALRPIETEL ;
   private boolean n7410ALRPIEOPE ;
   private boolean n7411ALRPIEST ;
   private boolean n7792AlbRecPnt ;
   private boolean n7793AlbRecCo1 ;
   private boolean n7794AlbRecCo2 ;
   private boolean n7998AlbHdr ;
   private boolean n7999AlbHdrr ;
   private boolean n8000AlbHdrp ;
   private boolean n8001AlbSerT ;
   private boolean n8002AlbColNm ;
   private boolean n8003AlbColNn ;
   private boolean n8004AlbKgsPf ;
   private boolean n8005AlbMtsPf ;
   private boolean n8006AlbAfin ;
   private boolean n8037AlbNPed ;
   private boolean n8051AlbObsp ;
   private boolean n8679Bod_Dib ;
   private boolean n8680Bod_Tua ;
   private boolean n8681Bod_Tub ;
   private boolean n8682Bod_Tuc ;
   private boolean n8683Bod_Hilz ;
   private boolean n8684Bod_FecE ;
   private boolean n8685Bod_PedOr ;
   private boolean n8774Bod_Rack ;
   private boolean n8775Bod_PoS ;
   private boolean n8776Bod_Ok ;
   private boolean n8781Bod_Medt ;
   private boolean n8831Bod_ColNNn ;
   private boolean n8832Bod_Por ;
   private boolean n8833Bod_codb ;
   private boolean n8834Bod_Pes ;
   private boolean n8848Bod_DibO ;
   private boolean n9376Bod_item3 ;
   private boolean n9540Bod_ToE ;
   private boolean n9560Bod_DescP ;
   private boolean n9561Bod_CVar ;
   private boolean n9562Bod_NVar ;
   private boolean nA44AlbRecCod ;
   private boolean nE44AlbRecCod ;
   private String Z8051AlbObsp ;
   private String A8051AlbObsp ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbAlbRReo ;
   private HTMLChoice cmbAlbREst ;
   private IDataStoreProvider pr_default ;
   private short[] T010U5_A2152AlbDetPie ;
   private java.math.BigDecimal[] T010U5_A2149AlbDetMtr ;
   private java.math.BigDecimal[] T010U5_A2146AlbDetKgm ;
   private java.math.BigDecimal[] T010U5_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] T010U5_A2148AlbDetKgmU ;
   private String[] T010U8_A407EmprNom ;
   private boolean[] T010U8_n407EmprNom ;
   private int[] T010U14_A44AlbRecCod ;
   private boolean[] T010U14_n44AlbRecCod ;
   private java.math.BigDecimal[] T010U14_A58AlbRUniEnt ;
   private java.math.BigDecimal[] T010U14_A60AlbRUniUti ;
   private int[] T010U14_A52AlbRPieEnt ;
   private int[] T010U14_A54AlbRPieUti ;
   private String[] T010U14_A407EmprNom ;
   private boolean[] T010U14_n407EmprNom ;
   private String[] T010U14_A279CliNom ;
   private String[] T010U14_A45AlbRef ;
   private String[] T010U14_A841TrnNom ;
   private boolean[] T010U14_n841TrnNom ;
   private String[] T010U14_A46AlbREnt ;
   private String[] T010U14_A56AlbRUni ;
   private String[] T010U14_A50AlbRLoc ;
   private java.util.Date[] T010U14_A49AlbRFen ;
   private String[] T010U14_A55AlbRReo ;
   private int[] T010U14_A53AlbRPieReb ;
   private java.math.BigDecimal[] T010U14_A59AlbRUniReb ;
   private java.util.Date[] T010U14_A48AlbRFecUlt ;
   private byte[] T010U14_A47AlbREst ;
   private String[] T010U14_A1212TipEntNom ;
   private boolean[] T010U14_n1212TipEntNom ;
   private short[] T010U14_A1222AlbNumEti ;
   private String[] T010U14_A1291AlbRDes ;
   private String[] T010U14_A971ProceNom ;
   private boolean[] T010U14_n971ProceNom ;
   private java.util.Date[] T010U14_A4606AlbRHEn ;
   private boolean[] T010U14_n4606AlbRHEn ;
   private String[] T010U14_A6182AlbrNF ;
   private String[] T010U14_A8835Bod_UltPz ;
   private boolean[] T010U14_n8835Bod_UltPz ;
   private String[] T010U14_A396EmprCod ;
   private int[] T010U14_A252CliCod ;
   private short[] T010U14_A840TrnCod ;
   private boolean[] T010U14_n840TrnCod ;
   private short[] T010U14_A970ProceCod ;
   private boolean[] T010U14_n970ProceCod ;
   private short[] T010U14_A1211TipEntCod ;
   private boolean[] T010U14_n1211TipEntCod ;
   private short[] T010U14_A2152AlbDetPie ;
   private java.math.BigDecimal[] T010U14_A2149AlbDetMtr ;
   private java.math.BigDecimal[] T010U14_A2146AlbDetKgm ;
   private java.math.BigDecimal[] T010U14_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] T010U14_A2148AlbDetKgmU ;
   private String[] T010U9_A279CliNom ;
   private String[] T010U10_A841TrnNom ;
   private boolean[] T010U10_n841TrnNom ;
   private String[] T010U11_A971ProceNom ;
   private boolean[] T010U11_n971ProceNom ;
   private String[] T010U12_A1212TipEntNom ;
   private boolean[] T010U12_n1212TipEntNom ;
   private String[] T010U15_A279CliNom ;
   private String[] T010U16_A841TrnNom ;
   private boolean[] T010U16_n841TrnNom ;
   private String[] T010U17_A971ProceNom ;
   private boolean[] T010U17_n971ProceNom ;
   private String[] T010U18_A1212TipEntNom ;
   private boolean[] T010U18_n1212TipEntNom ;
   private String[] T010U19_A396EmprCod ;
   private int[] T010U19_A44AlbRecCod ;
   private boolean[] T010U19_n44AlbRecCod ;
   private int[] T010U7_A44AlbRecCod ;
   private boolean[] T010U7_n44AlbRecCod ;
   private java.math.BigDecimal[] T010U7_A58AlbRUniEnt ;
   private java.math.BigDecimal[] T010U7_A60AlbRUniUti ;
   private int[] T010U7_A52AlbRPieEnt ;
   private int[] T010U7_A54AlbRPieUti ;
   private String[] T010U7_A45AlbRef ;
   private String[] T010U7_A46AlbREnt ;
   private String[] T010U7_A56AlbRUni ;
   private String[] T010U7_A50AlbRLoc ;
   private java.util.Date[] T010U7_A49AlbRFen ;
   private String[] T010U7_A55AlbRReo ;
   private int[] T010U7_A53AlbRPieReb ;
   private java.math.BigDecimal[] T010U7_A59AlbRUniReb ;
   private java.util.Date[] T010U7_A48AlbRFecUlt ;
   private byte[] T010U7_A47AlbREst ;
   private short[] T010U7_A1222AlbNumEti ;
   private String[] T010U7_A1291AlbRDes ;
   private java.util.Date[] T010U7_A4606AlbRHEn ;
   private boolean[] T010U7_n4606AlbRHEn ;
   private String[] T010U7_A6182AlbrNF ;
   private String[] T010U7_A8835Bod_UltPz ;
   private boolean[] T010U7_n8835Bod_UltPz ;
   private String[] T010U7_A396EmprCod ;
   private int[] T010U7_A252CliCod ;
   private short[] T010U7_A840TrnCod ;
   private boolean[] T010U7_n840TrnCod ;
   private short[] T010U7_A970ProceCod ;
   private boolean[] T010U7_n970ProceCod ;
   private short[] T010U7_A1211TipEntCod ;
   private boolean[] T010U7_n1211TipEntCod ;
   private String[] T010U20_A396EmprCod ;
   private int[] T010U20_A44AlbRecCod ;
   private boolean[] T010U20_n44AlbRecCod ;
   private String[] T010U21_A396EmprCod ;
   private int[] T010U21_A44AlbRecCod ;
   private boolean[] T010U21_n44AlbRecCod ;
   private int[] T010U6_A44AlbRecCod ;
   private boolean[] T010U6_n44AlbRecCod ;
   private java.math.BigDecimal[] T010U6_A58AlbRUniEnt ;
   private java.math.BigDecimal[] T010U6_A60AlbRUniUti ;
   private int[] T010U6_A52AlbRPieEnt ;
   private int[] T010U6_A54AlbRPieUti ;
   private String[] T010U6_A45AlbRef ;
   private String[] T010U6_A46AlbREnt ;
   private String[] T010U6_A56AlbRUni ;
   private String[] T010U6_A50AlbRLoc ;
   private java.util.Date[] T010U6_A49AlbRFen ;
   private String[] T010U6_A55AlbRReo ;
   private int[] T010U6_A53AlbRPieReb ;
   private java.math.BigDecimal[] T010U6_A59AlbRUniReb ;
   private java.util.Date[] T010U6_A48AlbRFecUlt ;
   private byte[] T010U6_A47AlbREst ;
   private short[] T010U6_A1222AlbNumEti ;
   private String[] T010U6_A1291AlbRDes ;
   private java.util.Date[] T010U6_A4606AlbRHEn ;
   private boolean[] T010U6_n4606AlbRHEn ;
   private String[] T010U6_A6182AlbrNF ;
   private String[] T010U6_A8835Bod_UltPz ;
   private boolean[] T010U6_n8835Bod_UltPz ;
   private String[] T010U6_A396EmprCod ;
   private int[] T010U6_A252CliCod ;
   private short[] T010U6_A840TrnCod ;
   private boolean[] T010U6_n840TrnCod ;
   private short[] T010U6_A970ProceCod ;
   private boolean[] T010U6_n970ProceCod ;
   private short[] T010U6_A1211TipEntCod ;
   private boolean[] T010U6_n1211TipEntCod ;
   private String[] T010U25_A279CliNom ;
   private String[] T010U26_A841TrnNom ;
   private boolean[] T010U26_n841TrnNom ;
   private String[] T010U27_A1212TipEntNom ;
   private boolean[] T010U27_n1212TipEntNom ;
   private String[] T010U28_A971ProceNom ;
   private boolean[] T010U28_n971ProceNom ;
   private String[] T010U29_A396EmprCod ;
   private int[] T010U29_A13026PedDGId ;
   private int[] T010U29_A44AlbRecCod ;
   private boolean[] T010U29_n44AlbRecCod ;
   private String[] T010U30_A396EmprCod ;
   private int[] T010U30_A11669DevCruId ;
   private int[] T010U30_A44AlbRecCod ;
   private boolean[] T010U30_n44AlbRecCod ;
   private String[] T010U31_A396EmprCod ;
   private int[] T010U31_A44AlbRecCod ;
   private boolean[] T010U31_n44AlbRecCod ;
   private String[] T010U31_A9743Emp_CUb ;
   private short[] T010U31_A5860Emp_Anp ;
   private String[] T010U32_A396EmprCod ;
   private int[] T010U32_A44AlbRecCod ;
   private boolean[] T010U32_n44AlbRecCod ;
   private String[] T010U32_A7130MatC_Pz ;
   private String[] T010U33_A396EmprCod ;
   private int[] T010U33_A44AlbRecCod ;
   private boolean[] T010U33_n44AlbRecCod ;
   private String[] T010U33_A7132MatC_Talla ;
   private String[] T010U34_A396EmprCod ;
   private int[] T010U34_A44AlbRecCod ;
   private boolean[] T010U34_n44AlbRecCod ;
   private short[] T010U34_A7115MatC_Lin ;
   private String[] T010U35_A396EmprCod ;
   private long[] T010U35_A30AlbProCod ;
   private int[] T010U35_A129BarCod ;
   private byte[] T010U35_A132BarCodReo ;
   private String[] T010U35_A130BarCodPar ;
   private short[] T010U35_A6622AlbHdRLn ;
   private String[] T010U36_A396EmprCod ;
   private int[] T010U36_A6235DevEmpCod ;
   private byte[] T010U36_A6243DevNumLin ;
   private String[] T010U37_A396EmprCod ;
   private int[] T010U37_A44AlbRecCod ;
   private boolean[] T010U37_n44AlbRecCod ;
   private short[] T010U37_A4596AlbRDefCod ;
   private String[] T010U38_A396EmprCod ;
   private int[] T010U38_A44AlbRecCod ;
   private boolean[] T010U38_n44AlbRecCod ;
   private String[] T010U38_A2159AlbRecPie ;
   private short[] T010U38_A4395AlRDefCod ;
   private String[] T010U38_A4412AlRFasCod ;
   private String[] T010U39_A396EmprCod ;
   private int[] T010U39_A44AlbRecCod ;
   private boolean[] T010U39_n44AlbRecCod ;
   private short[] T010U39_A2165HisEmpLin ;
   private String[] T010U40_A396EmprCod ;
   private int[] T010U40_A44AlbRecCod ;
   private boolean[] T010U40_n44AlbRecCod ;
   private byte[] T010U40_A1299AlbRLin ;
   private String[] T010U41_A396EmprCod ;
   private int[] T010U41_A361DisCod ;
   private int[] T010U41_A44AlbRecCod ;
   private boolean[] T010U41_n44AlbRecCod ;
   private String[] T010U42_A396EmprCod ;
   private int[] T010U42_A323DevGenCod ;
   private String[] T010U43_A396EmprCod ;
   private int[] T010U43_A129BarCod ;
   private byte[] T010U43_A132BarCodReo ;
   private String[] T010U43_A130BarCodPar ;
   private String[] T010U43_A200BarPieCod ;
   private short[] T010U45_A2152AlbDetPie ;
   private java.math.BigDecimal[] T010U45_A2149AlbDetMtr ;
   private java.math.BigDecimal[] T010U45_A2146AlbDetKgm ;
   private java.math.BigDecimal[] T010U45_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] T010U45_A2148AlbDetKgmU ;
   private String[] T010U47_A396EmprCod ;
   private int[] T010U47_A44AlbRecCod ;
   private boolean[] T010U47_n44AlbRecCod ;
   private String[] T010U48_A4795AlRPieCal ;
   private int[] T010U48_A44AlbRecCod ;
   private boolean[] T010U48_n44AlbRecCod ;
   private String[] T010U48_A2159AlbRecPie ;
   private java.util.Date[] T010U48_A4411AlbRecFec ;
   private boolean[] T010U48_n4411AlbRecFec ;
   private short[] T010U48_A2154AlbRecAnh ;
   private java.math.BigDecimal[] T010U48_A2157AlbRecMtr ;
   private java.math.BigDecimal[] T010U48_A2155AlbRecKgm ;
   private java.math.BigDecimal[] T010U48_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] T010U48_A2156AlbRecKgmU ;
   private short[] T010U48_A3730AlbRecCol ;
   private String[] T010U48_A3731AlbRecIdPz ;
   private int[] T010U48_A3732AlbRecIdRc ;
   private java.math.BigDecimal[] T010U48_A4410AlbRecPal ;
   private String[] T010U48_A7408ALRPIELOC ;
   private short[] T010U48_A7409ALRPIETEL ;
   private boolean[] T010U48_n7409ALRPIETEL ;
   private String[] T010U48_A7410ALRPIEOPE ;
   private boolean[] T010U48_n7410ALRPIEOPE ;
   private String[] T010U48_A7411ALRPIEST ;
   private boolean[] T010U48_n7411ALRPIEST ;
   private short[] T010U48_A7792AlbRecPnt ;
   private boolean[] T010U48_n7792AlbRecPnt ;
   private String[] T010U48_A7793AlbRecCo1 ;
   private boolean[] T010U48_n7793AlbRecCo1 ;
   private int[] T010U48_A7794AlbRecCo2 ;
   private boolean[] T010U48_n7794AlbRecCo2 ;
   private int[] T010U48_A7998AlbHdr ;
   private boolean[] T010U48_n7998AlbHdr ;
   private byte[] T010U48_A7999AlbHdrr ;
   private boolean[] T010U48_n7999AlbHdrr ;
   private String[] T010U48_A8000AlbHdrp ;
   private boolean[] T010U48_n8000AlbHdrp ;
   private String[] T010U48_A8001AlbSerT ;
   private boolean[] T010U48_n8001AlbSerT ;
   private String[] T010U48_A8002AlbColNm ;
   private boolean[] T010U48_n8002AlbColNm ;
   private int[] T010U48_A8003AlbColNn ;
   private boolean[] T010U48_n8003AlbColNn ;
   private java.math.BigDecimal[] T010U48_A8004AlbKgsPf ;
   private boolean[] T010U48_n8004AlbKgsPf ;
   private java.math.BigDecimal[] T010U48_A8005AlbMtsPf ;
   private boolean[] T010U48_n8005AlbMtsPf ;
   private byte[] T010U48_A8006AlbAfin ;
   private boolean[] T010U48_n8006AlbAfin ;
   private String[] T010U48_A8037AlbNPed ;
   private boolean[] T010U48_n8037AlbNPed ;
   private String[] T010U48_A8051AlbObsp ;
   private boolean[] T010U48_n8051AlbObsp ;
   private String[] T010U48_A8679Bod_Dib ;
   private boolean[] T010U48_n8679Bod_Dib ;
   private long[] T010U48_A8680Bod_Tua ;
   private boolean[] T010U48_n8680Bod_Tua ;
   private long[] T010U48_A8681Bod_Tub ;
   private boolean[] T010U48_n8681Bod_Tub ;
   private long[] T010U48_A8682Bod_Tuc ;
   private boolean[] T010U48_n8682Bod_Tuc ;
   private String[] T010U48_A8683Bod_Hilz ;
   private boolean[] T010U48_n8683Bod_Hilz ;
   private java.util.Date[] T010U48_A8684Bod_FecE ;
   private boolean[] T010U48_n8684Bod_FecE ;
   private String[] T010U48_A8685Bod_PedOr ;
   private boolean[] T010U48_n8685Bod_PedOr ;
   private String[] T010U48_A8774Bod_Rack ;
   private boolean[] T010U48_n8774Bod_Rack ;
   private String[] T010U48_A8775Bod_PoS ;
   private boolean[] T010U48_n8775Bod_PoS ;
   private String[] T010U48_A8776Bod_Ok ;
   private boolean[] T010U48_n8776Bod_Ok ;
   private String[] T010U48_A8779Bod_Talla ;
   private short[] T010U48_A8780Bod_Und ;
   private String[] T010U48_A8781Bod_Medt ;
   private boolean[] T010U48_n8781Bod_Medt ;
   private String[] T010U48_A8831Bod_ColNNn ;
   private boolean[] T010U48_n8831Bod_ColNNn ;
   private java.math.BigDecimal[] T010U48_A8832Bod_Por ;
   private boolean[] T010U48_n8832Bod_Por ;
   private String[] T010U48_A8833Bod_codb ;
   private boolean[] T010U48_n8833Bod_codb ;
   private String[] T010U48_A8834Bod_Pes ;
   private boolean[] T010U48_n8834Bod_Pes ;
   private String[] T010U48_A8848Bod_DibO ;
   private boolean[] T010U48_n8848Bod_DibO ;
   private String[] T010U48_A9376Bod_item3 ;
   private boolean[] T010U48_n9376Bod_item3 ;
   private String[] T010U48_A9540Bod_ToE ;
   private boolean[] T010U48_n9540Bod_ToE ;
   private String[] T010U48_A9560Bod_DescP ;
   private boolean[] T010U48_n9560Bod_DescP ;
   private String[] T010U48_A9561Bod_CVar ;
   private boolean[] T010U48_n9561Bod_CVar ;
   private String[] T010U48_A9562Bod_NVar ;
   private boolean[] T010U48_n9562Bod_NVar ;
   private String[] T010U48_A396EmprCod ;
   private String[] T010U49_A396EmprCod ;
   private int[] T010U49_A44AlbRecCod ;
   private boolean[] T010U49_n44AlbRecCod ;
   private String[] T010U49_A2159AlbRecPie ;
   private String[] T010U3_A4795AlRPieCal ;
   private int[] T010U3_A44AlbRecCod ;
   private boolean[] T010U3_n44AlbRecCod ;
   private String[] T010U3_A2159AlbRecPie ;
   private java.util.Date[] T010U3_A4411AlbRecFec ;
   private boolean[] T010U3_n4411AlbRecFec ;
   private short[] T010U3_A2154AlbRecAnh ;
   private java.math.BigDecimal[] T010U3_A2157AlbRecMtr ;
   private java.math.BigDecimal[] T010U3_A2155AlbRecKgm ;
   private java.math.BigDecimal[] T010U3_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] T010U3_A2156AlbRecKgmU ;
   private short[] T010U3_A3730AlbRecCol ;
   private String[] T010U3_A3731AlbRecIdPz ;
   private int[] T010U3_A3732AlbRecIdRc ;
   private java.math.BigDecimal[] T010U3_A4410AlbRecPal ;
   private String[] T010U3_A7408ALRPIELOC ;
   private short[] T010U3_A7409ALRPIETEL ;
   private boolean[] T010U3_n7409ALRPIETEL ;
   private String[] T010U3_A7410ALRPIEOPE ;
   private boolean[] T010U3_n7410ALRPIEOPE ;
   private String[] T010U3_A7411ALRPIEST ;
   private boolean[] T010U3_n7411ALRPIEST ;
   private short[] T010U3_A7792AlbRecPnt ;
   private boolean[] T010U3_n7792AlbRecPnt ;
   private String[] T010U3_A7793AlbRecCo1 ;
   private boolean[] T010U3_n7793AlbRecCo1 ;
   private int[] T010U3_A7794AlbRecCo2 ;
   private boolean[] T010U3_n7794AlbRecCo2 ;
   private int[] T010U3_A7998AlbHdr ;
   private boolean[] T010U3_n7998AlbHdr ;
   private byte[] T010U3_A7999AlbHdrr ;
   private boolean[] T010U3_n7999AlbHdrr ;
   private String[] T010U3_A8000AlbHdrp ;
   private boolean[] T010U3_n8000AlbHdrp ;
   private String[] T010U3_A8001AlbSerT ;
   private boolean[] T010U3_n8001AlbSerT ;
   private String[] T010U3_A8002AlbColNm ;
   private boolean[] T010U3_n8002AlbColNm ;
   private int[] T010U3_A8003AlbColNn ;
   private boolean[] T010U3_n8003AlbColNn ;
   private java.math.BigDecimal[] T010U3_A8004AlbKgsPf ;
   private boolean[] T010U3_n8004AlbKgsPf ;
   private java.math.BigDecimal[] T010U3_A8005AlbMtsPf ;
   private boolean[] T010U3_n8005AlbMtsPf ;
   private byte[] T010U3_A8006AlbAfin ;
   private boolean[] T010U3_n8006AlbAfin ;
   private String[] T010U3_A8037AlbNPed ;
   private boolean[] T010U3_n8037AlbNPed ;
   private String[] T010U3_A8051AlbObsp ;
   private boolean[] T010U3_n8051AlbObsp ;
   private String[] T010U3_A8679Bod_Dib ;
   private boolean[] T010U3_n8679Bod_Dib ;
   private long[] T010U3_A8680Bod_Tua ;
   private boolean[] T010U3_n8680Bod_Tua ;
   private long[] T010U3_A8681Bod_Tub ;
   private boolean[] T010U3_n8681Bod_Tub ;
   private long[] T010U3_A8682Bod_Tuc ;
   private boolean[] T010U3_n8682Bod_Tuc ;
   private String[] T010U3_A8683Bod_Hilz ;
   private boolean[] T010U3_n8683Bod_Hilz ;
   private java.util.Date[] T010U3_A8684Bod_FecE ;
   private boolean[] T010U3_n8684Bod_FecE ;
   private String[] T010U3_A8685Bod_PedOr ;
   private boolean[] T010U3_n8685Bod_PedOr ;
   private String[] T010U3_A8774Bod_Rack ;
   private boolean[] T010U3_n8774Bod_Rack ;
   private String[] T010U3_A8775Bod_PoS ;
   private boolean[] T010U3_n8775Bod_PoS ;
   private String[] T010U3_A8776Bod_Ok ;
   private boolean[] T010U3_n8776Bod_Ok ;
   private String[] T010U3_A8779Bod_Talla ;
   private short[] T010U3_A8780Bod_Und ;
   private String[] T010U3_A8781Bod_Medt ;
   private boolean[] T010U3_n8781Bod_Medt ;
   private String[] T010U3_A8831Bod_ColNNn ;
   private boolean[] T010U3_n8831Bod_ColNNn ;
   private java.math.BigDecimal[] T010U3_A8832Bod_Por ;
   private boolean[] T010U3_n8832Bod_Por ;
   private String[] T010U3_A8833Bod_codb ;
   private boolean[] T010U3_n8833Bod_codb ;
   private String[] T010U3_A8834Bod_Pes ;
   private boolean[] T010U3_n8834Bod_Pes ;
   private String[] T010U3_A8848Bod_DibO ;
   private boolean[] T010U3_n8848Bod_DibO ;
   private String[] T010U3_A9376Bod_item3 ;
   private boolean[] T010U3_n9376Bod_item3 ;
   private String[] T010U3_A9540Bod_ToE ;
   private boolean[] T010U3_n9540Bod_ToE ;
   private String[] T010U3_A9560Bod_DescP ;
   private boolean[] T010U3_n9560Bod_DescP ;
   private String[] T010U3_A9561Bod_CVar ;
   private boolean[] T010U3_n9561Bod_CVar ;
   private String[] T010U3_A9562Bod_NVar ;
   private boolean[] T010U3_n9562Bod_NVar ;
   private String[] T010U3_A396EmprCod ;
   private String[] T010U2_A4795AlRPieCal ;
   private int[] T010U2_A44AlbRecCod ;
   private boolean[] T010U2_n44AlbRecCod ;
   private String[] T010U2_A2159AlbRecPie ;
   private java.util.Date[] T010U2_A4411AlbRecFec ;
   private boolean[] T010U2_n4411AlbRecFec ;
   private short[] T010U2_A2154AlbRecAnh ;
   private java.math.BigDecimal[] T010U2_A2157AlbRecMtr ;
   private java.math.BigDecimal[] T010U2_A2155AlbRecKgm ;
   private java.math.BigDecimal[] T010U2_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] T010U2_A2156AlbRecKgmU ;
   private short[] T010U2_A3730AlbRecCol ;
   private String[] T010U2_A3731AlbRecIdPz ;
   private int[] T010U2_A3732AlbRecIdRc ;
   private java.math.BigDecimal[] T010U2_A4410AlbRecPal ;
   private String[] T010U2_A7408ALRPIELOC ;
   private short[] T010U2_A7409ALRPIETEL ;
   private boolean[] T010U2_n7409ALRPIETEL ;
   private String[] T010U2_A7410ALRPIEOPE ;
   private boolean[] T010U2_n7410ALRPIEOPE ;
   private String[] T010U2_A7411ALRPIEST ;
   private boolean[] T010U2_n7411ALRPIEST ;
   private short[] T010U2_A7792AlbRecPnt ;
   private boolean[] T010U2_n7792AlbRecPnt ;
   private String[] T010U2_A7793AlbRecCo1 ;
   private boolean[] T010U2_n7793AlbRecCo1 ;
   private int[] T010U2_A7794AlbRecCo2 ;
   private boolean[] T010U2_n7794AlbRecCo2 ;
   private int[] T010U2_A7998AlbHdr ;
   private boolean[] T010U2_n7998AlbHdr ;
   private byte[] T010U2_A7999AlbHdrr ;
   private boolean[] T010U2_n7999AlbHdrr ;
   private String[] T010U2_A8000AlbHdrp ;
   private boolean[] T010U2_n8000AlbHdrp ;
   private String[] T010U2_A8001AlbSerT ;
   private boolean[] T010U2_n8001AlbSerT ;
   private String[] T010U2_A8002AlbColNm ;
   private boolean[] T010U2_n8002AlbColNm ;
   private int[] T010U2_A8003AlbColNn ;
   private boolean[] T010U2_n8003AlbColNn ;
   private java.math.BigDecimal[] T010U2_A8004AlbKgsPf ;
   private boolean[] T010U2_n8004AlbKgsPf ;
   private java.math.BigDecimal[] T010U2_A8005AlbMtsPf ;
   private boolean[] T010U2_n8005AlbMtsPf ;
   private byte[] T010U2_A8006AlbAfin ;
   private boolean[] T010U2_n8006AlbAfin ;
   private String[] T010U2_A8037AlbNPed ;
   private boolean[] T010U2_n8037AlbNPed ;
   private String[] T010U2_A8051AlbObsp ;
   private boolean[] T010U2_n8051AlbObsp ;
   private String[] T010U2_A8679Bod_Dib ;
   private boolean[] T010U2_n8679Bod_Dib ;
   private long[] T010U2_A8680Bod_Tua ;
   private boolean[] T010U2_n8680Bod_Tua ;
   private long[] T010U2_A8681Bod_Tub ;
   private boolean[] T010U2_n8681Bod_Tub ;
   private long[] T010U2_A8682Bod_Tuc ;
   private boolean[] T010U2_n8682Bod_Tuc ;
   private String[] T010U2_A8683Bod_Hilz ;
   private boolean[] T010U2_n8683Bod_Hilz ;
   private java.util.Date[] T010U2_A8684Bod_FecE ;
   private boolean[] T010U2_n8684Bod_FecE ;
   private String[] T010U2_A8685Bod_PedOr ;
   private boolean[] T010U2_n8685Bod_PedOr ;
   private String[] T010U2_A8774Bod_Rack ;
   private boolean[] T010U2_n8774Bod_Rack ;
   private String[] T010U2_A8775Bod_PoS ;
   private boolean[] T010U2_n8775Bod_PoS ;
   private String[] T010U2_A8776Bod_Ok ;
   private boolean[] T010U2_n8776Bod_Ok ;
   private String[] T010U2_A8779Bod_Talla ;
   private short[] T010U2_A8780Bod_Und ;
   private String[] T010U2_A8781Bod_Medt ;
   private boolean[] T010U2_n8781Bod_Medt ;
   private String[] T010U2_A8831Bod_ColNNn ;
   private boolean[] T010U2_n8831Bod_ColNNn ;
   private java.math.BigDecimal[] T010U2_A8832Bod_Por ;
   private boolean[] T010U2_n8832Bod_Por ;
   private String[] T010U2_A8833Bod_codb ;
   private boolean[] T010U2_n8833Bod_codb ;
   private String[] T010U2_A8834Bod_Pes ;
   private boolean[] T010U2_n8834Bod_Pes ;
   private String[] T010U2_A8848Bod_DibO ;
   private boolean[] T010U2_n8848Bod_DibO ;
   private String[] T010U2_A9376Bod_item3 ;
   private boolean[] T010U2_n9376Bod_item3 ;
   private String[] T010U2_A9540Bod_ToE ;
   private boolean[] T010U2_n9540Bod_ToE ;
   private String[] T010U2_A9560Bod_DescP ;
   private boolean[] T010U2_n9560Bod_DescP ;
   private String[] T010U2_A9561Bod_CVar ;
   private boolean[] T010U2_n9561Bod_CVar ;
   private String[] T010U2_A9562Bod_NVar ;
   private boolean[] T010U2_n9562Bod_NVar ;
   private String[] T010U2_A396EmprCod ;
   private String[] T010U53_A396EmprCod ;
   private int[] T010U53_A44AlbRecCod ;
   private boolean[] T010U53_n44AlbRecCod ;
   private String[] T010U53_A2159AlbRecPie ;
   private int[] T010U53_A10188AlRFibOrd ;
   private String[] T010U54_A396EmprCod ;
   private int[] T010U54_A44AlbRecCod ;
   private boolean[] T010U54_n44AlbRecCod ;
   private String[] T010U54_A2159AlbRecPie ;
   private String[] T010U54_A9568CodHilz ;
   private String[] T010U55_A396EmprCod ;
   private int[] T010U55_A44AlbRecCod ;
   private boolean[] T010U55_n44AlbRecCod ;
   private String[] T010U55_A2159AlbRecPie ;
   private byte[] T010U55_A7697AlREtiTpo ;
   private String[] T010U56_A396EmprCod ;
   private int[] T010U56_A44AlbRecCod ;
   private boolean[] T010U56_n44AlbRecCod ;
   private String[] T010U56_A2159AlbRecPie ;
   private short[] T010U56_A5262AlbRecEvt ;
   private String[] T010U57_A396EmprCod ;
   private int[] T010U57_A44AlbRecCod ;
   private boolean[] T010U57_n44AlbRecCod ;
   private String[] T010U57_A2159AlbRecPie ;
   private short[] T010U57_A4395AlRDefCod ;
   private String[] T010U57_A4412AlRFasCod ;
   private String[] T010U58_A396EmprCod ;
   private int[] T010U58_A44AlbRecCod ;
   private boolean[] T010U58_n44AlbRecCod ;
   private String[] T010U58_A2159AlbRecPie ;
   private String[] T010U59_A407EmprNom ;
   private boolean[] T010U59_n407EmprNom ;
   private int[] T010U60_Gx_cnt ;
   private int[] T010U61_Gx_cnt ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class talmpz2__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talmpz2__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talmpz2__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talmpz2__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talmpz2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T010U2", "SELECT AlRPieCal, AlbRecCod, AlbRecPie, AlbRecFec, AlbRecAnh, AlbRecMtr, AlbRecKgm, AlbRecMtrU, AlbRecKgmU, AlbRecCol, AlbRecIdPz, AlbRecIdRc, AlbRecPal, ALRPIELOC, ALRPIETEL, ALRPIEOPE, ALRPIEST, AlbRecPnt, AlbRecCo1, AlbRecCo2, AlbHdr, AlbHdrr, AlbHdrp, AlbSerT, AlbColNm, AlbColNn, AlbKgsPf, AlbMtsPf, AlbAfin, AlbNPed, AlbObsp, Bod_Dib, Bod_Tua, Bod_Tub, Bod_Tuc, Bod_Hilz, Bod_FecE, Bod_PedOr, Bod_Rack, Bod_PoS, Bod_Ok, Bod_Talla, Bod_Und, Bod_Medt, Bod_ColNNn, Bod_Por, Bod_codb, Bod_Pes, Bod_DibO, Bod_item3, Bod_ToE, Bod_DescP, Bod_CVar, Bod_NVar, EmprCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?  FOR UPDATE OF AlRPieCal, AlbRecFec, AlbRecAnh, AlbRecMtr, AlbRecKgm, AlbRecMtrU, AlbRecKgmU, AlbRecCol, AlbRecIdPz, AlbRecIdRc, AlbRecPal, ALRPIELOC, ALRPIETEL, ALRPIEOPE, ALRPIEST, AlbRecPnt, AlbRecCo1, AlbRecCo2, AlbHdr, AlbHdrr, AlbHdrp, AlbSerT, AlbColNm, AlbColNn, AlbKgsPf, AlbMtsPf, AlbAfin, AlbNPed, AlbObsp, Bod_Dib, Bod_Tua, Bod_Tub, Bod_Tuc, Bod_Hilz, Bod_FecE, Bod_PedOr, Bod_Rack, Bod_PoS, Bod_Ok, Bod_Talla, Bod_Und, Bod_Medt, Bod_ColNNn, Bod_Por, Bod_codb, Bod_Pes, Bod_DibO, Bod_item3, Bod_ToE, Bod_DescP, Bod_CVar, Bod_NVar NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010U3", "SELECT AlRPieCal, AlbRecCod, AlbRecPie, AlbRecFec, AlbRecAnh, AlbRecMtr, AlbRecKgm, AlbRecMtrU, AlbRecKgmU, AlbRecCol, AlbRecIdPz, AlbRecIdRc, AlbRecPal, ALRPIELOC, ALRPIETEL, ALRPIEOPE, ALRPIEST, AlbRecPnt, AlbRecCo1, AlbRecCo2, AlbHdr, AlbHdrr, AlbHdrp, AlbSerT, AlbColNm, AlbColNn, AlbKgsPf, AlbMtsPf, AlbAfin, AlbNPed, AlbObsp, Bod_Dib, Bod_Tua, Bod_Tub, Bod_Tuc, Bod_Hilz, Bod_FecE, Bod_PedOr, Bod_Rack, Bod_PoS, Bod_Ok, Bod_Talla, Bod_Und, Bod_Medt, Bod_ColNNn, Bod_Por, Bod_codb, Bod_Pes, Bod_DibO, Bod_item3, Bod_ToE, Bod_DescP, Bod_CVar, Bod_NVar, EmprCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010U5", "SELECT COALESCE( T1.GXC1, 0) AS AlbDetPie, COALESCE( T1.AlbDetMtr, 0) AS AlbDetMtr, COALESCE( T1.AlbDetKgm, 0) AS AlbDetKgm, COALESCE( T1.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T1.AlbDetKgmU, 0) AS AlbDetKgmU FROM (SELECT COUNT(*) AS GXC1, EmprCod, AlbRecCod, SUM(AlbRecMtr) AS AlbDetMtr, SUM(AlbRecKgm) AS AlbDetKgm, SUM(AlbRecMtrU) AS AlbDetMtrU, SUM(AlbRecKgmU) AS AlbDetKgmU FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U6", "SELECT AlbRecCod, AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbRef, AlbREnt, AlbRUni, AlbRLoc, AlbRFen, AlbRReo, AlbRPieReb, AlbRUniReb, AlbRFecUlt, AlbREst, AlbNumEti, AlbRDes, AlbRHEn, AlbrNF, Bod_UltPz, EmprCod, CliCod, TrnCod, ProceCod, TipEntCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbRef, AlbREnt, AlbRUni, AlbRLoc, AlbRFen, AlbRReo, AlbRPieReb, AlbRUniReb, AlbRFecUlt, AlbREst, AlbNumEti, AlbRDes, AlbRHEn, AlbrNF, Bod_UltPz, CliCod, TrnCod, ProceCod, TipEntCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U7", "SELECT AlbRecCod, AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbRef, AlbREnt, AlbRUni, AlbRLoc, AlbRFen, AlbRReo, AlbRPieReb, AlbRUniReb, AlbRFecUlt, AlbREst, AlbNumEti, AlbRDes, AlbRHEn, AlbrNF, Bod_UltPz, EmprCod, CliCod, TrnCod, ProceCod, TipEntCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U9", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U10", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U11", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U12", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U14", "SELECT /*+ FIRST_ROWS(1) */ TM1.AlbRecCod, TM1.AlbRUniEnt, TM1.AlbRUniUti, TM1.AlbRPieEnt, TM1.AlbRPieUti, T2.EmprNom, T4.CliNom, TM1.AlbRef, T5.TrnNom, TM1.AlbREnt, TM1.AlbRUni, TM1.AlbRLoc, TM1.AlbRFen, TM1.AlbRReo, TM1.AlbRPieReb, TM1.AlbRUniReb, TM1.AlbRFecUlt, TM1.AlbREst, T6.TipEntNom, TM1.AlbNumEti, TM1.AlbRDes, T7.ProceNom, TM1.AlbRHEn, TM1.AlbrNF, TM1.Bod_UltPz, TM1.EmprCod, TM1.CliCod, TM1.TrnCod, TM1.ProceCod, TM1.TipEntCod, COALESCE( T3.GXC1, 0) AS AlbDetPie, COALESCE( T3.AlbDetMtr, 0) AS AlbDetMtr, COALESCE( T3.AlbDetKgm, 0) AS AlbDetKgm, COALESCE( T3.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T3.AlbDetKgmU, 0) AS AlbDetKgmU FROM ((((((TXPALBREC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT COUNT(*) AS GXC1, EmprCod, AlbRecCod, SUM(AlbRecMtr) AS AlbDetMtr, SUM(AlbRecKgm) AS AlbDetKgm, SUM(AlbRecMtrU) AS AlbDetMtrU, SUM(AlbRecKgmU) AS AlbDetKgmU FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.AlbRecCod = TM1.AlbRecCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod) LEFT JOIN TXPTRANSP T5 ON T5.EmprCod = TM1.EmprCod AND T5.TrnCod = TM1.TrnCod) LEFT JOIN TXPENTRAD T6 ON T6.EmprCod = TM1.EmprCod AND T6.TipEntCod = TM1.TipEntCod) LEFT JOIN TXPPROCED T7 ON T7.EmprCod = TM1.EmprCod AND T7.ProceCod = TM1.ProceCod) WHERE TM1.EmprCod = ? and TM1.AlbRecCod = ? ORDER BY TM1.EmprCod, TM1.AlbRecCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U15", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U16", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U17", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U18", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U19", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U20", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U21", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod DESC, AlbRecCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T010U22", "INSERT INTO TXPALBREC(AlbRecCod, AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbRef, AlbREnt, AlbRUni, AlbRLoc, AlbRFen, AlbRReo, AlbRPieReb, AlbRUniReb, AlbRFecUlt, AlbREst, AlbNumEti, AlbRDes, AlbRHEn, AlbrNF, Bod_UltPz, EmprCod, CliCod, TrnCod, ProceCod, TipEntCod, AlbRUlin, HisEmpULin, AlbRDisCli, AlbRImp, AlbRefDsc, AlbPmPPza, AlbRTam, AlbRMdlCod, AlbRUniLot, AlbRPieLot, ClasCod, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbREnt2, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrFeNf, AlbrCfop, AlbRTartC, AlbRLote, AlbRTelar, AlbRLu, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlmCod, MatC_ULin, AlbRecSec, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, Emp_Item1, AlbPdaC, AlbOStj, AlbStLot, AlbTurno, AlbUltP, Cod_mta, AlbOEKOTEX, AlbRPh, AlbRRLong, AlbRRTrans, AlbRLot2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', ' ', 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ')", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("T010U23", "UPDATE TXPALBREC SET AlbRUniEnt=?, AlbRUniUti=?, AlbRPieEnt=?, AlbRPieUti=?, AlbRef=?, AlbREnt=?, AlbRUni=?, AlbRLoc=?, AlbRFen=?, AlbRReo=?, AlbRPieReb=?, AlbRUniReb=?, AlbRFecUlt=?, AlbREst=?, AlbNumEti=?, AlbRDes=?, AlbRHEn=?, AlbrNF=?, Bod_UltPz=?, CliCod=?, TrnCod=?, ProceCod=?, TipEntCod=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("T010U24", "DELETE FROM TXPALBREC  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T010U25", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U26", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U27", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U28", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U29", "SELECT * FROM (SELECT EmprCod, PedDGId, AlbRecCod FROM TXPPEDDG3 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U30", "SELECT * FROM (SELECT EmprCod, DevCruId, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U31", "SELECT * FROM (SELECT EmprCod, AlbRecCod, Emp_CUb, Emp_Anp FROM TXPUBIIN WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U32", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Pz FROM TXPREPPZS WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U33", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Talla FROM TXPREPTAL WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U34", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Lin FROM TXPREPMAT WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U35", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U36", "SELECT * FROM (SELECT EmprCod, DevEmpCod, DevNumLin FROM TXPDEVEM1 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U37", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRDefCod FROM TXPALBRDF WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U38", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod FROM TXPAlRPie WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U39", "SELECT * FROM (SELECT EmprCod, AlbRecCod, HisEmpLin FROM TXPHISEMP WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U40", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRLin FROM TXPALBROB WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U41", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U42", "SELECT * FROM (SELECT EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U43", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U45", "SELECT COALESCE( T1.GXC1, 0) AS AlbDetPie, COALESCE( T1.AlbDetMtr, 0) AS AlbDetMtr, COALESCE( T1.AlbDetKgm, 0) AS AlbDetKgm, COALESCE( T1.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T1.AlbDetKgmU, 0) AS AlbDetKgmU FROM (SELECT COUNT(*) AS GXC1, EmprCod, AlbRecCod, SUM(AlbRecMtr) AS AlbDetMtr, SUM(AlbRecKgm) AS AlbDetKgm, SUM(AlbRecMtrU) AS AlbDetMtrU, SUM(AlbRecKgmU) AS AlbDetKgmU FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T010U46", "UPDATE TXPALBREC SET AlbRUniEnt=?, AlbRUniUti=?, AlbRPieEnt=?, AlbRPieUti=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T010U47", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U48", "SELECT AlRPieCal, AlbRecCod, AlbRecPie, AlbRecFec, AlbRecAnh, AlbRecMtr, AlbRecKgm, AlbRecMtrU, AlbRecKgmU, AlbRecCol, AlbRecIdPz, AlbRecIdRc, AlbRecPal, ALRPIELOC, ALRPIETEL, ALRPIEOPE, ALRPIEST, AlbRecPnt, AlbRecCo1, AlbRecCo2, AlbHdr, AlbHdrr, AlbHdrp, AlbSerT, AlbColNm, AlbColNn, AlbKgsPf, AlbMtsPf, AlbAfin, AlbNPed, AlbObsp, Bod_Dib, Bod_Tua, Bod_Tub, Bod_Tuc, Bod_Hilz, Bod_FecE, Bod_PedOr, Bod_Rack, Bod_PoS, Bod_Ok, Bod_Talla, Bod_Und, Bod_Medt, Bod_ColNNn, Bod_Por, Bod_codb, Bod_Pes, Bod_DibO, Bod_item3, Bod_ToE, Bod_DescP, Bod_CVar, Bod_NVar, EmprCod FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010U49", "SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T010U50", "INSERT INTO TXPALBDET(AlRPieCal, AlbRecCod, AlbRecPie, AlbRecFec, AlbRecAnh, AlbRecMtr, AlbRecKgm, AlbRecMtrU, AlbRecKgmU, AlbRecCol, AlbRecIdPz, AlbRecIdRc, AlbRecPal, ALRPIELOC, ALRPIETEL, ALRPIEOPE, ALRPIEST, AlbRecPnt, AlbRecCo1, AlbRecCo2, AlbHdr, AlbHdrr, AlbHdrp, AlbSerT, AlbColNm, AlbColNn, AlbKgsPf, AlbMtsPf, AlbAfin, AlbNPed, AlbObsp, Bod_Dib, Bod_Tua, Bod_Tub, Bod_Tuc, Bod_Hilz, Bod_FecE, Bod_PedOr, Bod_Rack, Bod_PoS, Bod_Ok, Bod_Talla, Bod_Und, Bod_Medt, Bod_ColNNn, Bod_Por, Bod_codb, Bod_Pes, Bod_DibO, Bod_item3, Bod_ToE, Bod_DescP, Bod_CVar, Bod_NVar, EmprCod, AlRPieClaM, AlRPieUltC, AlRPieDefT, AlRPieDefC, AlRExp1, AlRExp2, AlbRecPar, AlbRecCue, AlRPieTelT, AlRPieCon, AlRPieOri, AlRPieDst, AlrPieKgmT, AlbPCont) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', 0, ' ', ' ', 0, 0)", GX_NOMASK, "TXPALBDET")
         ,new UpdateCursor("T010U51", "UPDATE TXPALBDET SET AlRPieCal=?, AlbRecFec=?, AlbRecAnh=?, AlbRecMtr=?, AlbRecKgm=?, AlbRecMtrU=?, AlbRecKgmU=?, AlbRecCol=?, AlbRecIdPz=?, AlbRecIdRc=?, AlbRecPal=?, ALRPIELOC=?, ALRPIETEL=?, ALRPIEOPE=?, ALRPIEST=?, AlbRecPnt=?, AlbRecCo1=?, AlbRecCo2=?, AlbHdr=?, AlbHdrr=?, AlbHdrp=?, AlbSerT=?, AlbColNm=?, AlbColNn=?, AlbKgsPf=?, AlbMtsPf=?, AlbAfin=?, AlbNPed=?, AlbObsp=?, Bod_Dib=?, Bod_Tua=?, Bod_Tub=?, Bod_Tuc=?, Bod_Hilz=?, Bod_FecE=?, Bod_PedOr=?, Bod_Rack=?, Bod_PoS=?, Bod_Ok=?, Bod_Talla=?, Bod_Und=?, Bod_Medt=?, Bod_ColNNn=?, Bod_Por=?, Bod_codb=?, Bod_Pes=?, Bod_DibO=?, Bod_item3=?, Bod_ToE=?, Bod_DescP=?, Bod_CVar=?, Bod_NVar=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPALBDET")
         ,new UpdateCursor("T010U52", "DELETE FROM TXPALBDET  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPALBDET")
         ,new ForEachCursor("T010U53", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, AlRFibOrd FROM TXPAlrPiF WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U54", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, CodHilz FROM TXPHILZPZ WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U55", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, AlREtiTpo FROM TXPAlRPi1 WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U56", "SELECT * FROM (SELECT EmprCod, albreccod, AlbRecPie, AlbRecEvt FROM TXPALRHIS WHERE EmprCod = ? AND albreccod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U57", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod FROM TXPAlRPie WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T010U58", "SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010U59", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010U60", "SELECT COUNT(*) FROM TXPALBDET WHERE ( EmprCod = ? and AlbRecCod = ?) and ( AlbRecKgm = AlbRecKgmU) ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T010U61", "SELECT COUNT(*) FROM TXPALBDET WHERE ( EmprCod = ? and AlbRecCod = ?) and ( AlbRecMtr = AlbRecMtrU) ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 15);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[14])[0] = rslt.getString(14, 10);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(16, 40);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(18);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(19, 13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(21);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(22);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(24, 16);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(25, 13);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(26);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((byte[]) buf[43])[0] = rslt.getByte(29);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(30, 20);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(31);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(32, 20);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((long[]) buf[51])[0] = rslt.getLong(33);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((long[]) buf[53])[0] = rslt.getLong(34);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((long[]) buf[55])[0] = rslt.getLong(35);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(36, 800);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[59])[0] = rslt.getGXDate(37);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(38, 20);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(39, 10);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(40, 1);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(41, 1);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(42, 4);
               ((short[]) buf[70])[0] = rslt.getShort(43);
               ((String[]) buf[71])[0] = rslt.getString(44, 10);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(45, 40);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[75])[0] = rslt.getBigDecimal(46,2);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(47, 20);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(48, 20);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(49, 20);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getString(50, 20);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(51, 1);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getString(52, 80);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(53, 12);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getString(54, 31);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getString(55, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 15);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[14])[0] = rslt.getString(14, 10);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(16, 40);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(18);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(19, 13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(21);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(22);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(24, 16);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(25, 13);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(26);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((byte[]) buf[43])[0] = rslt.getByte(29);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(30, 20);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(31);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(32, 20);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((long[]) buf[51])[0] = rslt.getLong(33);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((long[]) buf[53])[0] = rslt.getLong(34);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((long[]) buf[55])[0] = rslt.getLong(35);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(36, 800);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[59])[0] = rslt.getGXDate(37);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(38, 20);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(39, 10);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(40, 1);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(41, 1);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(42, 4);
               ((short[]) buf[70])[0] = rslt.getShort(43);
               ((String[]) buf[71])[0] = rslt.getString(44, 10);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(45, 40);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[75])[0] = rslt.getBigDecimal(46,2);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(47, 20);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(48, 20);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(49, 20);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getString(50, 20);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(51, 1);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getString(52, 80);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(53, 12);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getString(54, 31);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getString(55, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 2);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 20);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               ((String[]) buf[20])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(21, 3);
               ((int[]) buf[23])[0] = rslt.getInt(22);
               ((short[]) buf[24])[0] = rslt.getShort(23);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(24);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(25);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 2);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 20);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               ((String[]) buf[20])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(21, 3);
               ((int[]) buf[23])[0] = rslt.getInt(22);
               ((short[]) buf[24])[0] = rslt.getShort(23);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(24);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(25);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((String[]) buf[13])[0] = rslt.getString(12, 10);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 2);
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(17);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               ((String[]) buf[20])[0] = rslt.getString(19, 25);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(20);
               ((String[]) buf[23])[0] = rslt.getString(21, 20);
               ((String[]) buf[24])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(23);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(24, 1);
               ((String[]) buf[29])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(26, 3);
               ((int[]) buf[32])[0] = rslt.getInt(27);
               ((short[]) buf[33])[0] = rslt.getShort(28);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(29);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(30);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(31);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(32,2);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(33,2);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(35,2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 40 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 15);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[14])[0] = rslt.getString(14, 10);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(16, 40);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(18);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(19, 13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(21);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(22);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(24, 16);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(25, 13);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(26);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((byte[]) buf[43])[0] = rslt.getByte(29);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(30, 20);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(31);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(32, 20);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((long[]) buf[51])[0] = rslt.getLong(33);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((long[]) buf[53])[0] = rslt.getLong(34);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((long[]) buf[55])[0] = rslt.getLong(35);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(36, 800);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[59])[0] = rslt.getGXDate(37);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(38, 20);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(39, 10);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(40, 1);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(41, 1);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(42, 4);
               ((short[]) buf[70])[0] = rslt.getShort(43);
               ((String[]) buf[71])[0] = rslt.getString(44, 10);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(45, 40);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[75])[0] = rslt.getBigDecimal(46,2);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(47, 20);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(48, 20);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(49, 20);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getString(50, 20);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(51, 1);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getString(52, 80);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(53, 12);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getString(54, 31);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getString(55, 3);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 55 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 56 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               stmt.setString(3, (String)parms[3], 9);
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
               stmt.setString(3, (String)parms[3], 9);
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
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
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
            case 8 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setString(6, (String)parms[6], 16);
               stmt.setString(7, (String)parms[7], 8);
               stmt.setString(8, (String)parms[8], 1);
               stmt.setString(9, (String)parms[9], 10);
               stmt.setDate(10, (java.util.Date)parms[10]);
               stmt.setString(11, (String)parms[11], 2);
               stmt.setInt(12, ((Number) parms[12]).intValue());
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[13], 2);
               stmt.setDate(14, (java.util.Date)parms[14]);
               stmt.setByte(15, ((Number) parms[15]).byteValue());
               stmt.setShort(16, ((Number) parms[16]).shortValue());
               stmt.setString(17, (String)parms[17], 20);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(18, (java.util.Date)parms[19], false);
               }
               stmt.setString(19, (String)parms[20], 1);
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[22], 1);
               }
               stmt.setString(21, (String)parms[23], 3);
               stmt.setInt(22, ((Number) parms[24]).intValue());
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[26]).shortValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(24, ((Number) parms[28]).shortValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(25, ((Number) parms[30]).shortValue());
               }
               return;
            case 19 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 16);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 10);
               stmt.setDate(9, (java.util.Date)parms[8]);
               stmt.setString(10, (String)parms[9], 2);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 2);
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setString(16, (String)parms[15], 20);
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(17, (java.util.Date)parms[17], false);
               }
               stmt.setString(18, (String)parms[18], 1);
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[20], 1);
               }
               stmt.setInt(20, ((Number) parms[21]).intValue());
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[27]).shortValue());
               }
               stmt.setString(24, (String)parms[28], 3);
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(25, ((Number) parms[30]).intValue());
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
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
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
            case 23 :
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
            case 24 :
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 40 :
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
            case 41 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[6]).intValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
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
               stmt.setString(3, (String)parms[3], 9);
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
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 16);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[5], false);
               }
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 2);
               stmt.setShort(10, ((Number) parms[11]).shortValue());
               stmt.setString(11, (String)parms[12], 15);
               stmt.setInt(12, ((Number) parms[13]).intValue());
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[14], 2);
               stmt.setString(14, (String)parms[15], 10);
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[19], 40);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[25], 13);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(20, ((Number) parms[27]).intValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(21, ((Number) parms[29]).intValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(22, ((Number) parms[31]).byteValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[35], 16);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[37], 13);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(26, ((Number) parms[39]).intValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(29, ((Number) parms[45]).byteValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[47], 20);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(31, (String)parms[49], 200);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[51], 20);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(33, ((Number) parms[53]).longValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(34, ((Number) parms[55]).longValue());
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(35, ((Number) parms[57]).longValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[59], 800);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.DATE );
               }
               else
               {
                  stmt.setDate(37, (java.util.Date)parms[61]);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[63], 20);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[65], 10);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[67], 1);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[69], 1);
               }
               stmt.setString(42, (String)parms[70], 4);
               stmt.setShort(43, ((Number) parms[71]).shortValue());
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[73], 10);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[75], 40);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(46, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(47, (String)parms[79], 20);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[81], 20);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[83], 20);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[85], 20);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(51, (String)parms[87], 1);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[89], 80);
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(53, (String)parms[91], 12);
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(54, (String)parms[93], 31);
               }
               stmt.setString(55, (String)parms[94], 3);
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 16);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[2], false);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               stmt.setString(9, (String)parms[9], 15);
               stmt.setInt(10, ((Number) parms[10]).intValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[11], 2);
               stmt.setString(12, (String)parms[12], 10);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[16], 40);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[22], 13);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(18, ((Number) parms[24]).intValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[26]).intValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[28]).byteValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[30], 1);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[32], 16);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[34], 13);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(24, ((Number) parms[36]).intValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(27, ((Number) parms[42]).byteValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[44], 20);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(29, (String)parms[46], 200);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[48], 20);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(31, ((Number) parms[50]).longValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(32, ((Number) parms[52]).longValue());
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(33, ((Number) parms[54]).longValue());
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[56], 800);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DATE );
               }
               else
               {
                  stmt.setDate(35, (java.util.Date)parms[58]);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[60], 20);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[62], 10);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[64], 1);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[66], 1);
               }
               stmt.setString(40, (String)parms[67], 4);
               stmt.setShort(41, ((Number) parms[68]).shortValue());
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[70], 10);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(43, (String)parms[72], 40);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(44, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[76], 20);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(46, (String)parms[78], 20);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(47, (String)parms[80], 20);
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[82], 20);
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[84], 1);
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[86], 80);
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(51, (String)parms[88], 12);
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[90], 31);
               }
               stmt.setString(53, (String)parms[91], 3);
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(54, ((Number) parms[93]).intValue());
               }
               stmt.setString(55, (String)parms[94], 9);
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
               stmt.setString(3, (String)parms[3], 9);
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
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
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
               stmt.setString(3, (String)parms[3], 9);
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
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 53 :
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
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 55 :
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
            case 56 :
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
      }
   }

}

