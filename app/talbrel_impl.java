package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talbrel_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action29") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         AV46Obs = httpContext.GetPar( "Obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46Obs", AV46Obs);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_29_LM7( A396EmprCod, A44AlbRecCod, AV46Obs) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_35") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4295ClasCod = (short)(GXutil.lval( httpContext.GetPar( "ClasCod"))) ;
         n4295ClasCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_35( A396EmprCod, A4295ClasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_36") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A45AlbRef = httpContext.GetPar( "AlbRef") ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A4602AlbRMdlCod = httpContext.GetPar( "AlbRMdlCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_36( A396EmprCod, A252CliCod, A45AlbRef, A4602AlbRMdlCod) ;
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
            A45AlbRef = httpContext.GetPar( "AlbRef") ;
            httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
            A3613AlbRefDsc = httpContext.GetPar( "AlbRefDsc") ;
            httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
            A46AlbREnt = httpContext.GetPar( "AlbREnt") ;
            httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
            A840TrnCod = (short)(GXutil.lval( httpContext.GetPar( "TrnCod"))) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            A970ProceCod = (short)(GXutil.lval( httpContext.GetPar( "ProceCod"))) ;
            n970ProceCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
            A49AlbRFen = localUtil.parseDateParm( httpContext.GetPar( "AlbRFen")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
            A4606AlbRHEn = localUtil.parseDTimeParm( httpContext.GetPar( "AlbRHEn")) ;
            n4606AlbRHEn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A55AlbRReo = httpContext.GetPar( "AlbRReo") ;
            httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
            AV46Obs = httpContext.GetPar( "Obs") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46Obs", AV46Obs);
            AV56AlbRecIni = (int)(GXutil.lval( httpContext.GetPar( "AlbRecIni"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56AlbRecIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56AlbRecIni), 8, 0));
            AV57AlbRecFin = (int)(GXutil.lval( httpContext.GetPar( "AlbRecFin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57AlbRecFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57AlbRecFin), 8, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ALBARANES DE RECEPCIÓN (2/2)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAlbRPieEnt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public talbrel_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public talbrel_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talbrel_impl.class ));
   }

   public talbrel_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBREL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBREL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBREL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBREL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TALBREL.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "N Recepcion ID", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRecCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBREL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Referencia", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef), GXutil.rtrim( localUtil.format( A45AlbRef, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRef_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRef_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTrnCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "", "", "", "", "", 1, edtTrnCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre Transportista", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnNom_Internalname, GXutil.rtrim( A841TrnNom), GXutil.rtrim( localUtil.format( A841TrnNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnNom_Jsonclick, 0, "", "", "", "", "", 1, edtTrnNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Albaran Entrega", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbREnt_Internalname, GXutil.rtrim( A46AlbREnt), GXutil.rtrim( localUtil.format( A46AlbREnt, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbREnt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbREnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Piezas Entregadas", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieEnt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPieEnt_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Unidad Medida", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRUni, cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni), 1, cmbAlbRUni.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRUni.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "", true, (byte)(0), "HLP_TALBREL.htm");
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Localizacion", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLoc_Internalname, GXutil.rtrim( A50AlbRLoc), GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLoc_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRLoc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbRFen_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRFen_Internalname, localUtil.format(A49AlbRFen, "99/99/99"), localUtil.format( A49AlbRFen, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRFen_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRFen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBREL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbRFen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRFen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBREL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Unidades Entrada", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniEnt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Reoperado", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRReo, cmbAlbRReo.getInternalname(), GXutil.rtrim( A55AlbRReo), 1, cmbAlbRReo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRReo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", "", "", true, (byte)(0), "HLP_TALBREL.htm");
      cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Piezas Utilizadas", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieUti_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPieUti_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Piezas Rebajadas", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieReb_Internalname, GXutil.ltrim( localUtil.ntoc( A53AlbRPieReb, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieReb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A53AlbRPieReb), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A53AlbRPieReb), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieReb_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPieReb_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Unidades Utilizadas", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A60AlbRUniUti, "ZZZZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniUti_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniUti_Enabled, 1, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Unidades Rebajadas", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniReb_Internalname, GXutil.ltrim( localUtil.ntoc( A59AlbRUniReb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniReb_Enabled!=0) ? localUtil.format( A59AlbRUniReb, "ZZZZZ9.99") : localUtil.format( A59AlbRUniReb, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniReb_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniReb_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Piezas Disponibles", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieDis_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPieDis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Unidades Disponibles", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniDis_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniDis_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Fecha Ultima Utilizacion", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbRFecUlt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRFecUlt_Internalname, localUtil.format(A48AlbRFecUlt, "99/99/99"), localUtil.format( A48AlbRFecUlt, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRFecUlt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRFecUlt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBREL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbRFecUlt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRFecUlt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBREL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Estado (0=No Cumpl. 1=Cumpl.)", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbREst, cmbAlbREst.getInternalname(), GXutil.trim( GXutil.str( A47AlbREst, 1, 0)), 1, cmbAlbREst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbREst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "", true, (byte)(0), "HLP_TALBREL.htm");
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Codigo Tipo Entrada", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipEntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipEntCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1211TipEntCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1211TipEntCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipEntCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipEntCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Nombre Tipo Entrada", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipEntNom_Internalname, GXutil.rtrim( A1212TipEntNom), GXutil.rtrim( localUtil.format( A1212TipEntNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipEntNom_Jsonclick, 0, "", "", "", "", "", 1, edtTipEntNom_Enabled, 0, "text", "", 25, "chr", 1, "row", 25, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Numero de Etiquetas", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbNumEti_Internalname, GXutil.ltrim( localUtil.ntoc( A1222AlbNumEti, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbNumEti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1222AlbNumEti), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1222AlbNumEti), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbNumEti_Jsonclick, 0, "", "", "", "", "", 1, edtAlbNumEti_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Destino Empesa", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRDes_Internalname, GXutil.rtrim( A1291AlbRDes), GXutil.rtrim( localUtil.format( A1291AlbRDes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRDes_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRDes_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Código de Procedencia", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProceCod_Internalname, GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProceCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceCod_Jsonclick, 0, "", "", "", "", "", 1, edtProceCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Nombre Procedencia", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProceNom_Internalname, GXutil.rtrim( A971ProceNom), GXutil.rtrim( localUtil.format( A971ProceNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceNom_Jsonclick, 0, "", "", "", "", "", 1, edtProceNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Ultima Linea de Observaciones", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUlin_Internalname, GXutil.ltrim( localUtil.ntoc( A1301AlbRUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1301AlbRUlin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1301AlbRUlin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUlin_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUlin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Descripcion Referencia", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRefDsc_Internalname, GXutil.rtrim( A3613AlbRefDsc), GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRefDsc_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRefDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Peso Medio p/Pza.", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPmPPza_Internalname, GXutil.ltrim( localUtil.ntoc( A4290AlbPmPPza, (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPmPPza_Enabled!=0) ? localUtil.format( A4290AlbPmPPza, "Z9.999") : localUtil.format( A4290AlbPmPPza, "Z9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPmPPza_Jsonclick, 0, "", "", "", "", "", 1, edtAlbPmPPza_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Piezas Estimadas", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPzaEst_Internalname, GXutil.ltrim( localUtil.ntoc( A4291AlbPzaEst, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPzaEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4291AlbPzaEst), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4291AlbPzaEst), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPzaEst_Jsonclick, 0, "", "", "", "", "", 1, edtAlbPzaEst_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Tamaño", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRTam_Internalname, GXutil.rtrim( A4601AlbRTam), GXutil.rtrim( localUtil.format( A4601AlbRTam, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRTam_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRTam_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Modelo", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRMdlCod_Internalname, GXutil.rtrim( A4602AlbRMdlCod), GXutil.rtrim( localUtil.format( A4602AlbRMdlCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRMdlCod_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRMdlCod_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Desc. Modelo", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRMdlDsc_Internalname, GXutil.rtrim( A4603AlbRMdlDsc), GXutil.rtrim( localUtil.format( A4603AlbRMdlDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRMdlDsc_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRMdlDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Unidades del Lote", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniLot_Internalname, GXutil.ltrim( localUtil.ntoc( A4604AlbRUniLot, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniLot_Enabled!=0) ? localUtil.format( A4604AlbRUniLot, "ZZZZZ9.99") : localUtil.format( A4604AlbRUniLot, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniLot_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniLot_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "Piezas del Lote", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieLot_Internalname, GXutil.ltrim( localUtil.ntoc( A4605AlbRPieLot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieLot_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4605AlbRPieLot), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4605AlbRPieLot), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,206);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieLot_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPieLot_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "Hora de entrada", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbRHEn_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRHEn_Internalname, localUtil.ttoc( A4606AlbRHEn, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A4606AlbRHEn, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRHEn_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRHEn_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBREL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbRHEn_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRHEn_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBREL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "Tipo Clasificacion", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtClasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4295ClasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtClasCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4295ClasCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4295ClasCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,216);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClasCod_Jsonclick, 0, "", "", "", "", "", 1, edtClasCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtClasDsc_Internalname, GXutil.rtrim( A4296ClasDsc), GXutil.rtrim( localUtil.format( A4296ClasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClasDsc_Jsonclick, 0, "", "", "", "", "", 1, edtClasDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBREL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 224,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBREL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 225,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBREL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 226,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBREL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 227,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBREL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 228,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TALBREL.htm");
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
         Z47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z47AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4290AlbPmPPza = localUtil.ctond( httpContext.cgiGet( "Z4290AlbPmPPza")) ;
         Z52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "Z52AlbRPieEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z56AlbRUni = httpContext.cgiGet( "Z56AlbRUni") ;
         Z50AlbRLoc = httpContext.cgiGet( "Z50AlbRLoc") ;
         Z58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "Z58AlbRUniEnt")) ;
         Z54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "Z54AlbRPieUti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z53AlbRPieReb = (int)(localUtil.ctol( httpContext.cgiGet( "Z53AlbRPieReb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "Z60AlbRUniUti")) ;
         Z59AlbRUniReb = localUtil.ctond( httpContext.cgiGet( "Z59AlbRUniReb")) ;
         Z48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( "Z48AlbRFecUlt"), 0) ;
         Z1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z1211TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1222AlbNumEti = (short)(localUtil.ctol( httpContext.cgiGet( "Z1222AlbNumEti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1291AlbRDes = httpContext.cgiGet( "Z1291AlbRDes") ;
         Z1301AlbRUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1301AlbRUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4601AlbRTam = httpContext.cgiGet( "Z4601AlbRTam") ;
         Z4602AlbRMdlCod = httpContext.cgiGet( "Z4602AlbRMdlCod") ;
         Z4604AlbRUniLot = localUtil.ctond( httpContext.cgiGet( "Z4604AlbRUniLot")) ;
         Z4605AlbRPieLot = (int)(localUtil.ctol( httpContext.cgiGet( "Z4605AlbRPieLot"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4295ClasCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z4295ClasCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         AV36Modo = httpContext.cgiGet( "MODO") ;
         AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
         AV36Modo = httpContext.cgiGet( "vMODO") ;
         Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV18AlbCum = httpContext.cgiGet( "vALBCUM") ;
         AV46Obs = httpContext.cgiGet( "vOBS") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
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
         cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
         A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A50AlbRLoc = httpContext.cgiGet( edtAlbRLoc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         A49AlbRFen = localUtil.ctod( httpContext.cgiGet( edtAlbRFen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
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
         A48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( edtAlbRFecUlt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
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
         A970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         A971ProceNom = httpContext.cgiGet( edtProceNom_Internalname) ;
         n971ProceNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRULIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRUlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1301AlbRUlin = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
         }
         else
         {
            A1301AlbRUlin = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbRUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
         }
         A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         A4290AlbPmPPza = localUtil.ctond( httpContext.cgiGet( edtAlbPmPPza_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrimstr( A4290AlbPmPPza, 6, 3));
         A4291AlbPzaEst = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbPzaEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4291AlbPzaEst), 8, 0));
         A4601AlbRTam = httpContext.cgiGet( edtAlbRTam_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4601AlbRTam", A4601AlbRTam);
         A4602AlbRMdlCod = httpContext.cgiGet( edtAlbRMdlCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
         A4603AlbRMdlDsc = httpContext.cgiGet( edtAlbRMdlDsc_Internalname) ;
         n4603AlbRMdlDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4603AlbRMdlDsc", A4603AlbRMdlDsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRUniLot_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRUniLot_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUNILOT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRUniLot_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4604AlbRUniLot = DecimalUtil.ZERO ;
            n4604AlbRUniLot = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4604AlbRUniLot", GXutil.ltrimstr( A4604AlbRUniLot, 9, 2));
         }
         else
         {
            A4604AlbRUniLot = localUtil.ctond( httpContext.cgiGet( edtAlbRUniLot_Internalname)) ;
            n4604AlbRUniLot = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4604AlbRUniLot", GXutil.ltrimstr( A4604AlbRUniLot, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPIELOT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRPieLot_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4605AlbRPieLot = 0 ;
            n4605AlbRPieLot = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4605AlbRPieLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4605AlbRPieLot), 6, 0));
         }
         else
         {
            A4605AlbRPieLot = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4605AlbRPieLot = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4605AlbRPieLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4605AlbRPieLot), 6, 0));
         }
         A4606AlbRHEn = localUtil.ctot( httpContext.cgiGet( edtAlbRHEn_Internalname)) ;
         n4606AlbRHEn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLASCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtClasCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4295ClasCod = (short)(0) ;
            n4295ClasCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
         }
         else
         {
            A4295ClasCod = (short)(localUtil.ctol( httpContext.cgiGet( edtClasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4295ClasCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
         }
         A4296ClasDsc = httpContext.cgiGet( edtClasDsc_Internalname) ;
         n4296ClasDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4296ClasDsc", A4296ClasDsc);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TALBREL");
         A48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( edtAlbRFecUlt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         forbiddenHiddens.add("AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV36Modo, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ( ! ( ( A44AlbRecCod != Z44AlbRecCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("talbrel:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            AnyError = (short)(1) ;
            return  ;
         }
         forbiddenHiddens2 = new com.genexus.util.GXProperties() ;
         if ( isIns( )  )
         {
            A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
            forbiddenHiddens2.add("AlbRPieUti", localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9"));
         }
         hsh2 = httpContext.cgiGet( "hsh2") ;
         if ( ( ! ( ( A44AlbRecCod != Z44AlbRecCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens2.toString(), hsh2, GXKey) )
         {
            GXutil.writeLogError("talbrel:[ CondSecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens2.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            AnyError = (short)(1) ;
            return  ;
         }
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
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
            initAllLM7( ) ;
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
      disableAttributesLM7( ) ;
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

   public void confirm_LM0( )
   {
      beforeValidateLM7( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsLM7( ) ;
         }
         else
         {
            checkExtendedTableLM7( ) ;
            if ( AnyError == 0 )
            {
               zmLM7( 31) ;
               zmLM7( 32) ;
               zmLM7( 33) ;
               zmLM7( 34) ;
               zmLM7( 35) ;
               zmLM7( 36) ;
            }
            closeExtendedTableCursorsLM7( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValuesLM0( ) ;
      }
   }

   public void resetCaptionLM0( )
   {
   }

   public void zmLM7( int GX_JID )
   {
      if ( ( GX_JID == 30 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z47AlbREst = T00LM3_A47AlbREst[0] ;
            Z4290AlbPmPPza = T00LM3_A4290AlbPmPPza[0] ;
            Z52AlbRPieEnt = T00LM3_A52AlbRPieEnt[0] ;
            Z56AlbRUni = T00LM3_A56AlbRUni[0] ;
            Z50AlbRLoc = T00LM3_A50AlbRLoc[0] ;
            Z58AlbRUniEnt = T00LM3_A58AlbRUniEnt[0] ;
            Z54AlbRPieUti = T00LM3_A54AlbRPieUti[0] ;
            Z53AlbRPieReb = T00LM3_A53AlbRPieReb[0] ;
            Z60AlbRUniUti = T00LM3_A60AlbRUniUti[0] ;
            Z59AlbRUniReb = T00LM3_A59AlbRUniReb[0] ;
            Z48AlbRFecUlt = T00LM3_A48AlbRFecUlt[0] ;
            Z1211TipEntCod = T00LM3_A1211TipEntCod[0] ;
            Z1222AlbNumEti = T00LM3_A1222AlbNumEti[0] ;
            Z1291AlbRDes = T00LM3_A1291AlbRDes[0] ;
            Z1301AlbRUlin = T00LM3_A1301AlbRUlin[0] ;
            Z4601AlbRTam = T00LM3_A4601AlbRTam[0] ;
            Z4602AlbRMdlCod = T00LM3_A4602AlbRMdlCod[0] ;
            Z4604AlbRUniLot = T00LM3_A4604AlbRUniLot[0] ;
            Z4605AlbRPieLot = T00LM3_A4605AlbRPieLot[0] ;
            Z4295ClasCod = T00LM3_A4295ClasCod[0] ;
         }
         else
         {
            Z47AlbREst = A47AlbREst ;
            Z4290AlbPmPPza = A4290AlbPmPPza ;
            Z52AlbRPieEnt = A52AlbRPieEnt ;
            Z56AlbRUni = A56AlbRUni ;
            Z50AlbRLoc = A50AlbRLoc ;
            Z58AlbRUniEnt = A58AlbRUniEnt ;
            Z54AlbRPieUti = A54AlbRPieUti ;
            Z53AlbRPieReb = A53AlbRPieReb ;
            Z60AlbRUniUti = A60AlbRUniUti ;
            Z59AlbRUniReb = A59AlbRUniReb ;
            Z48AlbRFecUlt = A48AlbRFecUlt ;
            Z1211TipEntCod = A1211TipEntCod ;
            Z1222AlbNumEti = A1222AlbNumEti ;
            Z1291AlbRDes = A1291AlbRDes ;
            Z1301AlbRUlin = A1301AlbRUlin ;
            Z4601AlbRTam = A4601AlbRTam ;
            Z4602AlbRMdlCod = A4602AlbRMdlCod ;
            Z4604AlbRUniLot = A4604AlbRUniLot ;
            Z4605AlbRPieLot = A4605AlbRPieLot ;
            Z4295ClasCod = A4295ClasCod ;
         }
      }
      if ( GX_JID == -30 )
      {
         Z252CliCod = A252CliCod ;
         Z45AlbRef = A45AlbRef ;
         Z3613AlbRefDsc = A3613AlbRefDsc ;
         Z46AlbREnt = A46AlbREnt ;
         Z840TrnCod = A840TrnCod ;
         Z970ProceCod = A970ProceCod ;
         Z49AlbRFen = A49AlbRFen ;
         Z4606AlbRHEn = A4606AlbRHEn ;
         Z55AlbRReo = A55AlbRReo ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z47AlbREst = A47AlbREst ;
         Z4290AlbPmPPza = A4290AlbPmPPza ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z56AlbRUni = A56AlbRUni ;
         Z50AlbRLoc = A50AlbRLoc ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z53AlbRPieReb = A53AlbRPieReb ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z59AlbRUniReb = A59AlbRUniReb ;
         Z48AlbRFecUlt = A48AlbRFecUlt ;
         Z1211TipEntCod = A1211TipEntCod ;
         Z1222AlbNumEti = A1222AlbNumEti ;
         Z1291AlbRDes = A1291AlbRDes ;
         Z1301AlbRUlin = A1301AlbRUlin ;
         Z4601AlbRTam = A4601AlbRTam ;
         Z4602AlbRMdlCod = A4602AlbRMdlCod ;
         Z4604AlbRUniLot = A4604AlbRUniLot ;
         Z4605AlbRPieLot = A4605AlbRPieLot ;
         Z396EmprCod = A396EmprCod ;
         Z4295ClasCod = A4295ClasCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z841TrnNom = A841TrnNom ;
         Z971ProceNom = A971ProceNom ;
         Z4603AlbRMdlDsc = A4603AlbRMdlDsc ;
         Z4296ClasDsc = A4296ClasDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
      edtAlbRFecUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFecUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFecUlt_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtAlbPmPPza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPmPPza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPmPPza_Enabled), 5, 0), true);
      edtAlbRPieDis_Inputmask = "999999" ;
      edtAlbRPieUti_Inputmask = "999999" ;
      edtAlbRPieEnt_Inputmask = "999999" ;
      edtAlbRPieLot_Inputmask = "999999" ;
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtAlbRFecUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFecUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFecUlt_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtAlbPmPPza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPmPPza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPmPPza_Enabled), 5, 0), true);
      /* Using cursor T00LM4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00LM4_A407EmprNom[0] ;
      n407EmprNom = T00LM4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T00LM5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T00LM5_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(3);
      /* Using cursor T00LM6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
         }
      }
      A841TrnNom = T00LM6_A841TrnNom[0] ;
      n841TrnNom = T00LM6_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      pr_default.close(4);
      /* Using cursor T00LM7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
         }
      }
      A971ProceNom = T00LM7_A971ProceNom[0] ;
      n971ProceNom = T00LM7_n971ProceNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
      pr_default.close(5);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && true /* Level */ )
      {
         AV36Modo = httpContext.getMessage( httpContext.getMessage( "INS", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Modo", AV36Modo);
      }
      if ( isIns( )  )
      {
         edtAlbRPieUti_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRPieUti_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      }
      if ( isIns( )  )
      {
         edtAlbRUniUti_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRUniUti_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      }
      if ( isIns( )  )
      {
         edtAlbRPieUti_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      }
      if ( isIns( )  )
      {
         edtAlbRUniUti_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
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
      if ( isIns( )  && (GXutil.strcmp("", A56AlbRUni)==0) && ( Gx_BScreen == 0 ) )
      {
         A56AlbRUni = httpContext.getMessage( httpContext.getMessage( "K", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A48AlbRFecUlt)) && ( Gx_BScreen == 0 ) )
      {
         A48AlbRFecUlt = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      }
      if ( isIns( )  && (GXutil.strcmp("", A50AlbRLoc)==0) && ( Gx_BScreen == 0 ) )
      {
         A50AlbRLoc = E50AlbRLoc ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
      }
      if ( isIns( )  && (GXutil.strcmp("", A4602AlbRMdlCod)==0) && ( Gx_BScreen == 0 ) )
      {
         A4602AlbRMdlCod = E4602AlbRMdlCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
      }
      if ( isIns( )  && (GXutil.strcmp("", A4601AlbRTam)==0) && ( Gx_BScreen == 0 ) )
      {
         A4601AlbRTam = E4601AlbRTam ;
         httpContext.ajax_rsp_assign_attri("", false, "A4601AlbRTam", A4601AlbRTam);
      }
      if ( isIns( )  && (GXutil.strcmp("", A1291AlbRDes)==0) && ( Gx_BScreen == 0 ) )
      {
         A1291AlbRDes = E1291AlbRDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
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
         /* Using cursor T00LM9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A45AlbRef, A4602AlbRMdlCod});
         if ( (pr_default.getStatus(7) != 101) )
         {
            A4603AlbRMdlDsc = T00LM9_A4603AlbRMdlDsc[0] ;
            n4603AlbRMdlDsc = T00LM9_n4603AlbRMdlDsc[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4603AlbRMdlDsc", A4603AlbRMdlDsc);
         }
         else
         {
            A4603AlbRMdlDsc = "No Existe Modelo." ;
            n4603AlbRMdlDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4603AlbRMdlDsc", A4603AlbRMdlDsc);
         }
         pr_default.close(7);
      }
   }

   public void loadLM7( )
   {
      /* Using cursor T00LM10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A252CliCod), A45AlbRef, A3613AlbRefDsc, A46AlbREnt, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), A49AlbRFen, Boolean.valueOf(n4606AlbRHEn), A4606AlbRHEn, A55AlbRReo});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A47AlbREst = T00LM10_A47AlbREst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         A4290AlbPmPPza = T00LM10_A4290AlbPmPPza[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrimstr( A4290AlbPmPPza, 6, 3));
         A407EmprNom = T00LM10_A407EmprNom[0] ;
         n407EmprNom = T00LM10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T00LM10_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A841TrnNom = T00LM10_A841TrnNom[0] ;
         n841TrnNom = T00LM10_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A52AlbRPieEnt = T00LM10_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A56AlbRUni = T00LM10_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A50AlbRLoc = T00LM10_A50AlbRLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         A58AlbRUniEnt = T00LM10_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A54AlbRPieUti = T00LM10_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A53AlbRPieReb = T00LM10_A53AlbRPieReb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
         A60AlbRUniUti = T00LM10_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A59AlbRUniReb = T00LM10_A59AlbRUniReb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
         A48AlbRFecUlt = T00LM10_A48AlbRFecUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         A1211TipEntCod = T00LM10_A1211TipEntCod[0] ;
         n1211TipEntCod = T00LM10_n1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         A1222AlbNumEti = T00LM10_A1222AlbNumEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
         A1291AlbRDes = T00LM10_A1291AlbRDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         A971ProceNom = T00LM10_A971ProceNom[0] ;
         n971ProceNom = T00LM10_n971ProceNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         A1301AlbRUlin = T00LM10_A1301AlbRUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
         A4601AlbRTam = T00LM10_A4601AlbRTam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4601AlbRTam", A4601AlbRTam);
         A4602AlbRMdlCod = T00LM10_A4602AlbRMdlCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
         A4604AlbRUniLot = T00LM10_A4604AlbRUniLot[0] ;
         n4604AlbRUniLot = T00LM10_n4604AlbRUniLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4604AlbRUniLot", GXutil.ltrimstr( A4604AlbRUniLot, 9, 2));
         A4605AlbRPieLot = T00LM10_A4605AlbRPieLot[0] ;
         n4605AlbRPieLot = T00LM10_n4605AlbRPieLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4605AlbRPieLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4605AlbRPieLot), 6, 0));
         A4296ClasDsc = T00LM10_A4296ClasDsc[0] ;
         n4296ClasDsc = T00LM10_n4296ClasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4296ClasDsc", A4296ClasDsc);
         A4295ClasCod = T00LM10_A4295ClasCod[0] ;
         n4295ClasCod = T00LM10_n4295ClasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
         A4603AlbRMdlDsc = T00LM10_A4603AlbRMdlDsc[0] ;
         n4603AlbRMdlDsc = T00LM10_n4603AlbRMdlDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4603AlbRMdlDsc", A4603AlbRMdlDsc);
         zmLM7( -30) ;
      }
      pr_default.close(8);
      onLoadActionsLM7( ) ;
   }

   public void onLoadActionsLM7( )
   {
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
      if ( A4605AlbRPieLot == 0 )
      {
         A4290AlbPmPPza = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrimstr( A4290AlbPmPPza, 6, 3));
      }
      else
      {
         if ( ! ( A4605AlbRPieLot == 0 ) )
         {
            A4290AlbPmPPza = A4604AlbRUniLot.divide(DecimalUtil.doubleToDec(A4605AlbRPieLot), 18, java.math.RoundingMode.DOWN) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrimstr( A4290AlbPmPPza, 6, 3));
         }
      }
      if ( A4290AlbPmPPza.doubleValue() > 0 )
      {
         A4291AlbPzaEst = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A58AlbRUniEnt.divide(A4290AlbPmPPza, 18, java.math.RoundingMode.DOWN), 0))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4291AlbPzaEst), 8, 0));
      }
      else
      {
         A4291AlbPzaEst = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4291AlbPzaEst), 8, 0));
      }
      if ( isIns( )  && (0==A47AlbREst) && ( Gx_BScreen == 0 ) )
      {
         A47AlbREst = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( A57AlbRUniDis.doubleValue() == 0 )
         {
            A47AlbREst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         else
         {
            if ( A57AlbRUniDis.doubleValue() != 0 )
            {
               A47AlbREst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            }
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
   }

   public void checkExtendedTableLM7( )
   {
      nIsDirty_7 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T00LM8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLAPEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtClasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4296ClasDsc = T00LM8_A4296ClasDsc[0] ;
      n4296ClasDsc = T00LM8_n4296ClasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4296ClasDsc", A4296ClasDsc);
      pr_default.close(6);
      /* Using cursor T00LM9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A45AlbRef, A4602AlbRMdlCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A4603AlbRMdlDsc = T00LM9_A4603AlbRMdlDsc[0] ;
         n4603AlbRMdlDsc = T00LM9_n4603AlbRMdlDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4603AlbRMdlDsc", A4603AlbRMdlDsc);
      }
      else
      {
         nIsDirty_7 = (short)(1) ;
         A4603AlbRMdlDsc = "No Existe Modelo." ;
         n4603AlbRMdlDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4603AlbRMdlDsc", A4603AlbRMdlDsc);
      }
      pr_default.close(7);
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
      if ( A4605AlbRPieLot == 0 )
      {
         nIsDirty_7 = (short)(1) ;
         A4290AlbPmPPza = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrimstr( A4290AlbPmPPza, 6, 3));
      }
      else
      {
         if ( ! ( A4605AlbRPieLot == 0 ) )
         {
            nIsDirty_7 = (short)(1) ;
            A4290AlbPmPPza = A4604AlbRUniLot.divide(DecimalUtil.doubleToDec(A4605AlbRPieLot), 18, java.math.RoundingMode.DOWN) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrimstr( A4290AlbPmPPza, 6, 3));
         }
      }
      if ( A4290AlbPmPPza.doubleValue() > 0 )
      {
         nIsDirty_7 = (short)(1) ;
         A4291AlbPzaEst = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A58AlbRUniEnt.divide(A4290AlbPmPPza, 18, java.math.RoundingMode.DOWN), 0))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4291AlbPzaEst), 8, 0));
      }
      else
      {
         nIsDirty_7 = (short)(1) ;
         A4291AlbPzaEst = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4291AlbPzaEst), 8, 0));
      }
      if ( isIns( )  && (0==A47AlbREst) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_7 = (short)(1) ;
         A47AlbREst = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( A57AlbRUniDis.doubleValue() == 0 )
         {
            nIsDirty_7 = (short)(1) ;
            A47AlbREst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         else
         {
            if ( A57AlbRUniDis.doubleValue() != 0 )
            {
               nIsDirty_7 = (short)(1) ;
               A47AlbREst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            }
         }
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
   }

   public void closeExtendedTableCursorsLM7( )
   {
      pr_default.close(6);
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_35( String A396EmprCod ,
                          short A4295ClasCod )
   {
      /* Using cursor T00LM11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLAPEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtClasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4296ClasDsc = T00LM11_A4296ClasDsc[0] ;
      n4296ClasDsc = T00LM11_n4296ClasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4296ClasDsc", A4296ClasDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4296ClasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_36( String A396EmprCod ,
                          int A252CliCod ,
                          String A45AlbRef ,
                          String A4602AlbRMdlCod )
   {
      /* Using cursor T00LM12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A45AlbRef, A4602AlbRMdlCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A4603AlbRMdlDsc = T00LM12_A4603AlbRMdlDsc[0] ;
         n4603AlbRMdlDsc = T00LM12_n4603AlbRMdlDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4603AlbRMdlDsc", A4603AlbRMdlDsc);
      }
      else
      {
         A4603AlbRMdlDsc = "No Existe Modelo." ;
         n4603AlbRMdlDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4603AlbRMdlDsc", A4603AlbRMdlDsc);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4603AlbRMdlDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKeyLM7( )
   {
      /* Using cursor T00LM13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound7 = (short)(1) ;
      }
      else
      {
         RcdFound7 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00LM3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(1) != 101) && ( T00LM3_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00LM3_A45AlbRef[0], A45AlbRef) == 0 ) && ( GXutil.strcmp(T00LM3_A3613AlbRefDsc[0], A3613AlbRefDsc) == 0 ) && ( GXutil.strcmp(T00LM3_A46AlbREnt[0], A46AlbREnt) == 0 ) && ( T00LM3_A840TrnCod[0] == A840TrnCod ) && ( T00LM3_A970ProceCod[0] == A970ProceCod ) && GXutil.dateCompare(GXutil.resetTime(T00LM3_A49AlbRFen[0]), GXutil.resetTime(A49AlbRFen)) && GXutil.dateCompare(T00LM3_A4606AlbRHEn[0], A4606AlbRHEn) && ( GXutil.strcmp(T00LM3_A55AlbRReo[0], A55AlbRReo) == 0 ) && ( GXutil.strcmp(T00LM3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmLM7( 30) ;
         RcdFound7 = (short)(1) ;
         A44AlbRecCod = T00LM3_A44AlbRecCod[0] ;
         n44AlbRecCod = T00LM3_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A47AlbREst = T00LM3_A47AlbREst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         A4290AlbPmPPza = T00LM3_A4290AlbPmPPza[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrimstr( A4290AlbPmPPza, 6, 3));
         A52AlbRPieEnt = T00LM3_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A56AlbRUni = T00LM3_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A50AlbRLoc = T00LM3_A50AlbRLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         A58AlbRUniEnt = T00LM3_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A54AlbRPieUti = T00LM3_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A53AlbRPieReb = T00LM3_A53AlbRPieReb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
         A60AlbRUniUti = T00LM3_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A59AlbRUniReb = T00LM3_A59AlbRUniReb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
         A48AlbRFecUlt = T00LM3_A48AlbRFecUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         A1211TipEntCod = T00LM3_A1211TipEntCod[0] ;
         n1211TipEntCod = T00LM3_n1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         A1222AlbNumEti = T00LM3_A1222AlbNumEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
         A1291AlbRDes = T00LM3_A1291AlbRDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         A1301AlbRUlin = T00LM3_A1301AlbRUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
         A4601AlbRTam = T00LM3_A4601AlbRTam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4601AlbRTam", A4601AlbRTam);
         A4602AlbRMdlCod = T00LM3_A4602AlbRMdlCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
         A4604AlbRUniLot = T00LM3_A4604AlbRUniLot[0] ;
         n4604AlbRUniLot = T00LM3_n4604AlbRUniLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4604AlbRUniLot", GXutil.ltrimstr( A4604AlbRUniLot, 9, 2));
         A4605AlbRPieLot = T00LM3_A4605AlbRPieLot[0] ;
         n4605AlbRPieLot = T00LM3_n4605AlbRPieLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4605AlbRPieLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4605AlbRPieLot), 6, 0));
         A4295ClasCod = T00LM3_A4295ClasCod[0] ;
         n4295ClasCod = T00LM3_n4295ClasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadLM7( ) ;
         if ( AnyError == 1 )
         {
            RcdFound7 = (short)(0) ;
            initializeNonKeyLM7( ) ;
         }
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound7 = (short)(0) ;
         initializeNonKeyLM7( ) ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKeyLM7( ) ;
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
      /* Using cursor T00LM14 */
      pr_default.execute(12, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A396EmprCod, Integer.valueOf(A252CliCod), A45AlbRef, A3613AlbRefDsc, A46AlbREnt, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), A49AlbRFen, Boolean.valueOf(n4606AlbRHEn), A4606AlbRHEn, A55AlbRReo});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T00LM14_A44AlbRecCod[0] < A44AlbRecCod ) ) && ( GXutil.strcmp(T00LM14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00LM14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00LM14_A45AlbRef[0], A45AlbRef) == 0 ) && ( GXutil.strcmp(T00LM14_A3613AlbRefDsc[0], A3613AlbRefDsc) == 0 ) && ( GXutil.strcmp(T00LM14_A46AlbREnt[0], A46AlbREnt) == 0 ) && ( T00LM14_A840TrnCod[0] == A840TrnCod ) && ( T00LM14_A970ProceCod[0] == A970ProceCod ) && GXutil.dateCompare(GXutil.resetTime(T00LM14_A49AlbRFen[0]), GXutil.resetTime(A49AlbRFen)) && GXutil.dateCompare(T00LM14_A4606AlbRHEn[0], A4606AlbRHEn) && ( GXutil.strcmp(T00LM14_A55AlbRReo[0], A55AlbRReo) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T00LM14_A44AlbRecCod[0] > A44AlbRecCod ) ) && ( GXutil.strcmp(T00LM14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00LM14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00LM14_A45AlbRef[0], A45AlbRef) == 0 ) && ( GXutil.strcmp(T00LM14_A3613AlbRefDsc[0], A3613AlbRefDsc) == 0 ) && ( GXutil.strcmp(T00LM14_A46AlbREnt[0], A46AlbREnt) == 0 ) && ( T00LM14_A840TrnCod[0] == A840TrnCod ) && ( T00LM14_A970ProceCod[0] == A970ProceCod ) && GXutil.dateCompare(GXutil.resetTime(T00LM14_A49AlbRFen[0]), GXutil.resetTime(A49AlbRFen)) && GXutil.dateCompare(T00LM14_A4606AlbRHEn[0], A4606AlbRHEn) && ( GXutil.strcmp(T00LM14_A55AlbRReo[0], A55AlbRReo) == 0 ) )
         {
            A44AlbRecCod = T00LM14_A44AlbRecCod[0] ;
            n44AlbRecCod = T00LM14_n44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound7 = (short)(0) ;
      /* Using cursor T00LM15 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A396EmprCod, Integer.valueOf(A252CliCod), A45AlbRef, A3613AlbRefDsc, A46AlbREnt, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), A49AlbRFen, Boolean.valueOf(n4606AlbRHEn), A4606AlbRHEn, A55AlbRReo});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T00LM15_A44AlbRecCod[0] > A44AlbRecCod ) ) && ( GXutil.strcmp(T00LM15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00LM15_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00LM15_A45AlbRef[0], A45AlbRef) == 0 ) && ( GXutil.strcmp(T00LM15_A3613AlbRefDsc[0], A3613AlbRefDsc) == 0 ) && ( GXutil.strcmp(T00LM15_A46AlbREnt[0], A46AlbREnt) == 0 ) && ( T00LM15_A840TrnCod[0] == A840TrnCod ) && ( T00LM15_A970ProceCod[0] == A970ProceCod ) && GXutil.dateCompare(GXutil.resetTime(T00LM15_A49AlbRFen[0]), GXutil.resetTime(A49AlbRFen)) && GXutil.dateCompare(T00LM15_A4606AlbRHEn[0], A4606AlbRHEn) && ( GXutil.strcmp(T00LM15_A55AlbRReo[0], A55AlbRReo) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T00LM15_A44AlbRecCod[0] < A44AlbRecCod ) ) && ( GXutil.strcmp(T00LM15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00LM15_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00LM15_A45AlbRef[0], A45AlbRef) == 0 ) && ( GXutil.strcmp(T00LM15_A3613AlbRefDsc[0], A3613AlbRefDsc) == 0 ) && ( GXutil.strcmp(T00LM15_A46AlbREnt[0], A46AlbREnt) == 0 ) && ( T00LM15_A840TrnCod[0] == A840TrnCod ) && ( T00LM15_A970ProceCod[0] == A970ProceCod ) && GXutil.dateCompare(GXutil.resetTime(T00LM15_A49AlbRFen[0]), GXutil.resetTime(A49AlbRFen)) && GXutil.dateCompare(T00LM15_A4606AlbRHEn[0], A4606AlbRHEn) && ( GXutil.strcmp(T00LM15_A55AlbRReo[0], A55AlbRReo) == 0 ) )
         {
            A44AlbRecCod = T00LM15_A44AlbRecCod[0] ;
            n44AlbRecCod = T00LM15_n44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyLM7( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAlbRPieEnt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertLM7( ) ;
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
               A44AlbRecCod = Z44AlbRecCod ;
               n44AlbRecCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAlbRPieEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateLM7( ) ;
               GX_FocusControl = edtAlbRPieEnt_Internalname ;
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
               GX_FocusControl = edtAlbRPieEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertLM7( ) ;
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
                  GX_FocusControl = edtAlbRPieEnt_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertLM7( ) ;
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
         A44AlbRecCod = Z44AlbRecCod ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAlbRPieEnt_Internalname ;
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
      getKeyLM7( ) ;
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
            A44AlbRecCod = Z44AlbRecCod ;
            n44AlbRecCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "talbrel");
      GX_FocusControl = edtAlbRPieEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_LM0( ) ;
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
      GX_FocusControl = edtAlbRPieEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartLM7( ) ;
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbRPieEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndLM7( ) ;
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
      GX_FocusControl = edtAlbRPieEnt_Internalname ;
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
      GX_FocusControl = edtAlbRPieEnt_Internalname ;
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
      scanStartLM7( ) ;
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound7 != 0 )
         {
            scanNextLM7( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbRPieEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndLM7( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyLM7( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00LM2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z47AlbREst != T00LM2_A47AlbREst[0] ) || ( DecimalUtil.compareTo(Z4290AlbPmPPza, T00LM2_A4290AlbPmPPza[0]) != 0 ) || ( Z52AlbRPieEnt != T00LM2_A52AlbRPieEnt[0] ) || ( GXutil.strcmp(Z56AlbRUni, T00LM2_A56AlbRUni[0]) != 0 ) || ( GXutil.strcmp(Z50AlbRLoc, T00LM2_A50AlbRLoc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z58AlbRUniEnt, T00LM2_A58AlbRUniEnt[0]) != 0 ) || ( Z54AlbRPieUti != T00LM2_A54AlbRPieUti[0] ) || ( Z53AlbRPieReb != T00LM2_A53AlbRPieReb[0] ) || ( DecimalUtil.compareTo(Z60AlbRUniUti, T00LM2_A60AlbRUniUti[0]) != 0 ) || ( DecimalUtil.compareTo(Z59AlbRUniReb, T00LM2_A59AlbRUniReb[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z48AlbRFecUlt), GXutil.resetTime(T00LM2_A48AlbRFecUlt[0])) ) || ( Z1211TipEntCod != T00LM2_A1211TipEntCod[0] ) || ( Z1222AlbNumEti != T00LM2_A1222AlbNumEti[0] ) || ( GXutil.strcmp(Z1291AlbRDes, T00LM2_A1291AlbRDes[0]) != 0 ) || ( Z1301AlbRUlin != T00LM2_A1301AlbRUlin[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4601AlbRTam, T00LM2_A4601AlbRTam[0]) != 0 ) || ( GXutil.strcmp(Z4602AlbRMdlCod, T00LM2_A4602AlbRMdlCod[0]) != 0 ) || ( DecimalUtil.compareTo(Z4604AlbRUniLot, T00LM2_A4604AlbRUniLot[0]) != 0 ) || ( Z4605AlbRPieLot != T00LM2_A4605AlbRPieLot[0] ) || ( Z4295ClasCod != T00LM2_A4295ClasCod[0] ) )
         {
            if ( Z47AlbREst != T00LM2_A47AlbREst[0] )
            {
               GXutil.writeLogln("talbrel:[seudo value changed for attri]"+"AlbREst");
               GXutil.writeLogRaw("Old: ",Z47AlbREst);
               GXutil.writeLogRaw("Current: ",T00LM2_A47AlbREst[0]);
            }
            if ( DecimalUtil.compareTo(Z4290AlbPmPPza, T00LM2_A4290AlbPmPPza[0]) != 0 )
            {
               GXutil.writeLogln("talbrel:[seudo value changed for attri]"+"AlbPmPPza");
               GXutil.writeLogRaw("Old: ",Z4290AlbPmPPza);
               GXutil.writeLogRaw("Current: ",T00LM2_A4290AlbPmPPza[0]);
            }
            if ( Z52AlbRPieEnt != T00LM2_A52AlbRPieEnt[0] )
            {
               GXutil.writeLogln("talbrel:[seudo value changed for attri]"+"AlbRPieEnt");
               GXutil.writeLogRaw("Old: ",Z52AlbRPieEnt);
               GXutil.writeLogRaw("Current: ",T00LM2_A52AlbRPieEnt[0]);
            }
            if ( GXutil.strcmp(Z56AlbRUni, T00LM2_A56AlbRUni[0]) != 0 )
            {
               GXutil.writeLogln("talbrel:[seudo value changed for attri]"+"AlbRUni");
               GXutil.writeLogRaw("Old: ",Z56AlbRUni);
               GXutil.writeLogRaw("Current: ",T00LM2_A56AlbRUni[0]);
            }
            if ( GXutil.strcmp(Z50AlbRLoc, T00LM2_A50AlbRLoc[0]) != 0 )
            {
               GXutil.writeLogln("talbrel:[seudo value changed for attri]"+"AlbRLoc");
               GXutil.writeLogRaw("Old: ",Z50AlbRLoc);
               GXutil.writeLogRaw("Current: ",T00LM2_A50AlbRLoc[0]);
            }
            if ( DecimalUtil.compareTo(Z58AlbRUniEnt, T00LM2_A58AlbRUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("talbrel:[seudo value changed for attri]"+"AlbRUniEnt");
               GXutil.writeLogRaw("Old: ",Z58AlbRUniEnt);
               GXutil.writeLogRaw("Current: ",T00LM2_A58AlbRUniEnt[0]);
            }
            if ( Z54AlbRPieUti != T00LM2_A54AlbRPieUti[0] )
            {
               GXutil.writeLogln("talbrel:[seudo value changed for attri]"+"AlbRPieUti");
               GXutil.writeLogRaw("Old: ",Z54AlbRPieUti);
               GXutil.writeLogRaw("Current: ",T00LM2_A54AlbRPieUti[0]);
            }
            if ( Z53AlbRPieReb != T00LM2_A53AlbRPieReb[0] )
            {
               GXutil.writeLogln("talbrel:[seudo value changed for attri]"+"AlbRPieReb");
               GXutil.writeLogRaw("Old: ",Z53AlbRPieReb);
               GXutil.writeLogRaw("Current: ",T00LM2_A53AlbRPieReb[0]);
            }
            if ( DecimalUtil.compareTo(Z60AlbRUniUti, T00LM2_A60AlbRUniUti[0]) != 0 )
            {
               GXutil.writeLogln("talbrel:[seudo value changed for attri]"+"AlbRUniUti");
               GXutil.writeLogRaw("Old: ",Z60AlbRUniUti);
               GXutil.writeLogRaw("Current: ",T00LM2_A60AlbRUniUti[0]);
            }
            if ( DecimalUtil.compareTo(Z59AlbRUniReb, T00LM2_A59AlbRUniReb[0]) != 0 )
            {
               GXutil.writeLogln("talbrel:[seudo value changed for attri]"+"AlbRUniReb");
               GXutil.writeLogRaw("Old: ",Z59AlbRUniReb);
               GXutil.writeLogRaw("Current: ",T00LM2_A59AlbRUniReb[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z48AlbRFecUlt), GXutil.resetTime(T00LM2_A48AlbRFecUlt[0])) ) )
            {
               GXutil.writeLogln("talbrel:[seudo value changed for attri]"+"AlbRFecUlt");
               GXutil.writeLogRaw("Old: ",Z48AlbRFecUlt);
               GXutil.writeLogRaw("Current: ",T00LM2_A48AlbRFecUlt[0]);
            }
            if ( Z1211TipEntCod != T00LM2_A1211TipEntCod[0] )
            {
               GXutil.writeLogln("talbrel:[seudo value changed for attri]"+"TipEntCod");
               GXutil.writeLogRaw("Old: ",Z1211TipEntCod);
               GXutil.writeLogRaw("Current: ",T00LM2_A1211TipEntCod[0]);
            }
            if ( Z1222AlbNumEti != T00LM2_A1222AlbNumEti[0] )
            {
               GXutil.writeLogln("talbrel:[seudo value changed for attri]"+"AlbNumEti");
               GXutil.writeLogRaw("Old: ",Z1222AlbNumEti);
               GXutil.writeLogRaw("Current: ",T00LM2_A1222AlbNumEti[0]);
            }
            if ( GXutil.strcmp(Z1291AlbRDes, T00LM2_A1291AlbRDes[0]) != 0 )
            {
               GXutil.writeLogln("talbrel:[seudo value changed for attri]"+"AlbRDes");
               GXutil.writeLogRaw("Old: ",Z1291AlbRDes);
               GXutil.writeLogRaw("Current: ",T00LM2_A1291AlbRDes[0]);
            }
            if ( Z1301AlbRUlin != T00LM2_A1301AlbRUlin[0] )
            {
               GXutil.writeLogln("talbrel:[seudo value changed for attri]"+"AlbRUlin");
               GXutil.writeLogRaw("Old: ",Z1301AlbRUlin);
               GXutil.writeLogRaw("Current: ",T00LM2_A1301AlbRUlin[0]);
            }
            if ( GXutil.strcmp(Z4601AlbRTam, T00LM2_A4601AlbRTam[0]) != 0 )
            {
               GXutil.writeLogln("talbrel:[seudo value changed for attri]"+"AlbRTam");
               GXutil.writeLogRaw("Old: ",Z4601AlbRTam);
               GXutil.writeLogRaw("Current: ",T00LM2_A4601AlbRTam[0]);
            }
            if ( GXutil.strcmp(Z4602AlbRMdlCod, T00LM2_A4602AlbRMdlCod[0]) != 0 )
            {
               GXutil.writeLogln("talbrel:[seudo value changed for attri]"+"AlbRMdlCod");
               GXutil.writeLogRaw("Old: ",Z4602AlbRMdlCod);
               GXutil.writeLogRaw("Current: ",T00LM2_A4602AlbRMdlCod[0]);
            }
            if ( DecimalUtil.compareTo(Z4604AlbRUniLot, T00LM2_A4604AlbRUniLot[0]) != 0 )
            {
               GXutil.writeLogln("talbrel:[seudo value changed for attri]"+"AlbRUniLot");
               GXutil.writeLogRaw("Old: ",Z4604AlbRUniLot);
               GXutil.writeLogRaw("Current: ",T00LM2_A4604AlbRUniLot[0]);
            }
            if ( Z4605AlbRPieLot != T00LM2_A4605AlbRPieLot[0] )
            {
               GXutil.writeLogln("talbrel:[seudo value changed for attri]"+"AlbRPieLot");
               GXutil.writeLogRaw("Old: ",Z4605AlbRPieLot);
               GXutil.writeLogRaw("Current: ",T00LM2_A4605AlbRPieLot[0]);
            }
            if ( Z4295ClasCod != T00LM2_A4295ClasCod[0] )
            {
               GXutil.writeLogln("talbrel:[seudo value changed for attri]"+"ClasCod");
               GXutil.writeLogRaw("Old: ",Z4295ClasCod);
               GXutil.writeLogRaw("Current: ",T00LM2_A4295ClasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertLM7( )
   {
      beforeValidateLM7( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableLM7( ) ;
      }
      if ( AnyError == 0 )
      {
         zmLM7( 0) ;
         checkOptimisticConcurrencyLM7( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmLM7( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertLM7( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00LM16 */
                  pr_default.execute(14, new Object[] {Integer.valueOf(A252CliCod), A45AlbRef, A3613AlbRefDsc, A46AlbREnt, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), A49AlbRFen, Boolean.valueOf(n4606AlbRHEn), A4606AlbRHEn, A55AlbRReo, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Byte.valueOf(A47AlbREst), A4290AlbPmPPza, Integer.valueOf(A52AlbRPieEnt), A56AlbRUni, A50AlbRLoc, A58AlbRUniEnt, Integer.valueOf(A54AlbRPieUti), Integer.valueOf(A53AlbRPieReb), A60AlbRUniUti, A59AlbRUniReb, A48AlbRFecUlt, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod), Short.valueOf(A1222AlbNumEti), A1291AlbRDes, Byte.valueOf(A1301AlbRUlin), A4601AlbRTam, A4602AlbRMdlCod, Boolean.valueOf(n4604AlbRUniLot), A4604AlbRUniLot, Boolean.valueOf(n4605AlbRPieLot), Integer.valueOf(A4605AlbRPieLot), A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( (pr_default.getStatus(14) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ )
                     {
                        GXv_char1[0] = A396EmprCod ;
                        GXv_int2[0] = A44AlbRecCod ;
                        GXv_char3[0] = AV46Obs ;
                        new app.palbrelobs(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3) ;
                        talbrel_impl.this.A396EmprCod = GXv_char1[0] ;
                        talbrel_impl.this.A44AlbRecCod = GXv_int2[0] ;
                        talbrel_impl.this.AV46Obs = GXv_char3[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV46Obs", AV46Obs);
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        E1291AlbRDes = A1291AlbRDes ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
                        E4601AlbRTam = A4601AlbRTam ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4601AlbRTam", A4601AlbRTam);
                        E4602AlbRMdlCod = A4602AlbRMdlCod ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
                        E50AlbRLoc = A50AlbRLoc ;
                        httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaptionLM0( ) ;
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
            loadLM7( ) ;
         }
         endLevelLM7( ) ;
      }
      closeExtendedTableCursorsLM7( ) ;
   }

   public void updateLM7( )
   {
      beforeValidateLM7( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableLM7( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyLM7( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmLM7( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateLM7( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00LM17 */
                  pr_default.execute(15, new Object[] {Integer.valueOf(A252CliCod), A45AlbRef, A3613AlbRefDsc, A46AlbREnt, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), A49AlbRFen, Boolean.valueOf(n4606AlbRHEn), A4606AlbRHEn, A55AlbRReo, Byte.valueOf(A47AlbREst), A4290AlbPmPPza, Integer.valueOf(A52AlbRPieEnt), A56AlbRUni, A50AlbRLoc, A58AlbRUniEnt, Integer.valueOf(A54AlbRPieUti), Integer.valueOf(A53AlbRPieReb), A60AlbRUniUti, A59AlbRUniReb, A48AlbRFecUlt, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod), Short.valueOf(A1222AlbNumEti), A1291AlbRDes, Byte.valueOf(A1301AlbRUlin), A4601AlbRTam, A4602AlbRMdlCod, Boolean.valueOf(n4604AlbRUniLot), A4604AlbRUniLot, Boolean.valueOf(n4605AlbRPieLot), Integer.valueOf(A4605AlbRPieLot), Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateLM7( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char3[0] = A396EmprCod ;
                     GXv_int2[0] = A44AlbRecCod ;
                     new app.txpalbrecupdateredundancy(remoteHandle, context).execute( GXv_char3, GXv_int2) ;
                     talbrel_impl.this.A396EmprCod = GXv_char3[0] ;
                     talbrel_impl.this.A44AlbRecCod = GXv_int2[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaptionLM0( ) ;
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
         endLevelLM7( ) ;
      }
      closeExtendedTableCursorsLM7( ) ;
   }

   public void deferredUpdateLM7( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateLM7( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyLM7( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsLM7( ) ;
         afterConfirmLM7( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteLM7( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00LM18 */
               pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
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
                        initAllLM7( ) ;
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
                     resetCaptionLM0( ) ;
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
      sMode7 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelLM7( ) ;
      Gx_mode = sMode7 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsLM7( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
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
         /* Using cursor T00LM19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A45AlbRef, A4602AlbRMdlCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            A4603AlbRMdlDsc = T00LM19_A4603AlbRMdlDsc[0] ;
            n4603AlbRMdlDsc = T00LM19_n4603AlbRMdlDsc[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4603AlbRMdlDsc", A4603AlbRMdlDsc);
         }
         else
         {
            A4603AlbRMdlDsc = "No Existe Modelo." ;
            n4603AlbRMdlDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4603AlbRMdlDsc", A4603AlbRMdlDsc);
         }
         pr_default.close(17);
         /* Using cursor T00LM20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
         A4296ClasDsc = T00LM20_A4296ClasDsc[0] ;
         n4296ClasDsc = T00LM20_n4296ClasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4296ClasDsc", A4296ClasDsc);
         pr_default.close(18);
         if ( A4290AlbPmPPza.doubleValue() > 0 )
         {
            A4291AlbPzaEst = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A58AlbRUniEnt.divide(A4290AlbPmPPza, 18, java.math.RoundingMode.DOWN), 0))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4291AlbPzaEst), 8, 0));
         }
         else
         {
            A4291AlbPzaEst = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4291AlbPzaEst), 8, 0));
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00LM21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Entradas Almacen Crudo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T00LM22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T00LM23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00LM24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPPZS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T00LM25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPTAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T00LM26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPMAT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T00LM27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREPg", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T00LM28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVEM1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T00LM29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBRDF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T00LM30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBDET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T00LM31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T00LM32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBROB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T00LM33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T00LM34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVGEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T00LM35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
      }
   }

   public void endLevelLM7( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteLM7( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "talbrel");
         if ( AnyError == 0 )
         {
            confirmValuesLM0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "talbrel");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartLM7( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A252CliCod = A252CliCod ;
      this.A45AlbRef = A45AlbRef ;
      this.A3613AlbRefDsc = A3613AlbRefDsc ;
      this.A46AlbREnt = A46AlbREnt ;
      this.A840TrnCod = A840TrnCod ;
      this.A970ProceCod = A970ProceCod ;
      this.A49AlbRFen = A49AlbRFen ;
      this.A4606AlbRHEn = A4606AlbRHEn ;
      this.A55AlbRReo = A55AlbRReo ;
      /* Scan By routine */
      /* Using cursor T00LM36 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A45AlbRef, A3613AlbRefDsc, A46AlbREnt, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), A49AlbRFen, Boolean.valueOf(n4606AlbRHEn), A4606AlbRHEn, A55AlbRReo});
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A44AlbRecCod = T00LM36_A44AlbRecCod[0] ;
         n44AlbRecCod = T00LM36_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextLM7( )
   {
      /* Scan next routine */
      pr_default.readNext(34);
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A44AlbRecCod = T00LM36_A44AlbRecCod[0] ;
         n44AlbRecCod = T00LM36_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
   }

   public void scanEndLM7( )
   {
      pr_default.close(34);
   }

   public void afterConfirmLM7( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertLM7( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateLM7( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteLM7( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteLM7( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateLM7( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesLM7( )
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
      edtAlbRUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUlin_Enabled), 5, 0), true);
      edtAlbRefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Enabled), 5, 0), true);
      edtAlbPmPPza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPmPPza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPmPPza_Enabled), 5, 0), true);
      edtAlbPzaEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPzaEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPzaEst_Enabled), 5, 0), true);
      edtAlbRTam_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRTam_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRTam_Enabled), 5, 0), true);
      edtAlbRMdlCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRMdlCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRMdlCod_Enabled), 5, 0), true);
      edtAlbRMdlDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRMdlDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRMdlDsc_Enabled), 5, 0), true);
      edtAlbRUniLot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniLot_Enabled), 5, 0), true);
      edtAlbRPieLot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieLot_Enabled), 5, 0), true);
      edtAlbRHEn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRHEn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRHEn_Enabled), 5, 0), true);
      edtClasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClasCod_Enabled), 5, 0), true);
      edtClasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClasDsc_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashesLM7( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValuesLM0( )
   {
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.talbrel", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A45AlbRef)),GXutil.URLEncode(GXutil.rtrim(A3613AlbRefDsc)),GXutil.URLEncode(GXutil.rtrim(A46AlbREnt)),GXutil.URLEncode(GXutil.ltrimstr(A840TrnCod,4,0)),GXutil.URLEncode(GXutil.ltrimstr(A970ProceCod,4,0)),GXutil.URLEncode(GXutil.formatDateParm(A49AlbRFen)),GXutil.URLEncode(GXutil.formatDateTimeParm(A4606AlbRHEn)),GXutil.URLEncode(GXutil.rtrim(A55AlbRReo)),GXutil.URLEncode(GXutil.rtrim(AV46Obs)),GXutil.URLEncode(GXutil.ltrimstr(AV56AlbRecIni,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV57AlbRecFin,8,0))}, new String[] {"EmprCod","CliCod","AlbRef","AlbRefDsc","AlbREnt","TrnCod","ProceCod","AlbRFen","AlbRHEn","AlbRReo","Obs","AlbRecIni","AlbRecFin"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TALBREL");
      forbiddenHiddens.add("AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV36Modo, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("talbrel:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      forbiddenHiddens2 = new com.genexus.util.GXProperties() ;
      if ( isIns( )  )
      {
         forbiddenHiddens2.add("AlbRPieUti", localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9"));
      }
      app.GxWebStd.gx_hidden_field( httpContext, "hsh2", httpContext.getEncryptedSignature( forbiddenHiddens2.toString(), GXKey));
      GXutil.writeLogInfo("talbrel:[ SendCondSecurityCheck value for]"+forbiddenHiddens2.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z47AlbREst", GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4290AlbPmPPza", GXutil.ltrim( localUtil.ntoc( Z4290AlbPmPPza, (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z50AlbRLoc", GXutil.rtrim( Z50AlbRLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( Z54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z53AlbRPieReb", GXutil.ltrim( localUtil.ntoc( Z53AlbRPieReb, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( Z60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z59AlbRUniReb", GXutil.ltrim( localUtil.ntoc( Z59AlbRUniReb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z48AlbRFecUlt", localUtil.dtoc( Z48AlbRFecUlt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1211TipEntCod", GXutil.ltrim( localUtil.ntoc( Z1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1222AlbNumEti", GXutil.ltrim( localUtil.ntoc( Z1222AlbNumEti, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1291AlbRDes", GXutil.rtrim( Z1291AlbRDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1301AlbRUlin", GXutil.ltrim( localUtil.ntoc( Z1301AlbRUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4601AlbRTam", GXutil.rtrim( Z4601AlbRTam));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4602AlbRMdlCod", GXutil.rtrim( Z4602AlbRMdlCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4604AlbRUniLot", GXutil.ltrim( localUtil.ntoc( Z4604AlbRUniLot, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4605AlbRPieLot", GXutil.ltrim( localUtil.ntoc( Z4605AlbRPieLot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4295ClasCod", GXutil.ltrim( localUtil.ntoc( Z4295ClasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRECINI", GXutil.ltrim( localUtil.ntoc( AV56AlbRecIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRECFIN", GXutil.ltrim( localUtil.ntoc( AV57AlbRecFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MODO", GXutil.rtrim( AV36Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODO", GXutil.rtrim( AV36Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBCUM", GXutil.rtrim( AV18AlbCum));
      app.GxWebStd.gx_hidden_field( httpContext, "vOBS", AV46Obs);
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
      return formatLink("app.talbrel", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A45AlbRef)),GXutil.URLEncode(GXutil.rtrim(A3613AlbRefDsc)),GXutil.URLEncode(GXutil.rtrim(A46AlbREnt)),GXutil.URLEncode(GXutil.ltrimstr(A840TrnCod,4,0)),GXutil.URLEncode(GXutil.ltrimstr(A970ProceCod,4,0)),GXutil.URLEncode(GXutil.formatDateParm(A49AlbRFen)),GXutil.URLEncode(GXutil.formatDateTimeParm(A4606AlbRHEn)),GXutil.URLEncode(GXutil.rtrim(A55AlbRReo)),GXutil.URLEncode(GXutil.rtrim(AV46Obs)),GXutil.URLEncode(GXutil.ltrimstr(AV56AlbRecIni,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV57AlbRecFin,8,0))}, new String[] {"EmprCod","CliCod","AlbRef","AlbRefDsc","AlbREnt","TrnCod","ProceCod","AlbRFen","AlbRHEn","AlbRReo","Obs","AlbRecIni","AlbRecFin"})  ;
   }

   public String getPgmname( )
   {
      return "TALBREL" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ALBARANES DE RECEPCIÓN (2/2)", "") ;
   }

   public void initializeNonKeyLM7( )
   {
      AV36Modo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Modo", AV36Modo);
      AV18AlbCum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      A4290AlbPmPPza = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrimstr( A4290AlbPmPPza, 6, 3));
      A57AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      A4291AlbPzaEst = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4291AlbPzaEst), 8, 0));
      A51AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      A4603AlbRMdlDsc = "" ;
      n4603AlbRMdlDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4603AlbRMdlDsc", A4603AlbRMdlDsc);
      A52AlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A54AlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      A53AlbRPieReb = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
      A60AlbRUniUti = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A59AlbRUniReb = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
      A1211TipEntCod = (short)(0) ;
      n1211TipEntCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
      A1212TipEntNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
      A1222AlbNumEti = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
      A1301AlbRUlin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
      A4604AlbRUniLot = DecimalUtil.ZERO ;
      n4604AlbRUniLot = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4604AlbRUniLot", GXutil.ltrimstr( A4604AlbRUniLot, 9, 2));
      A4605AlbRPieLot = 0 ;
      n4605AlbRPieLot = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4605AlbRPieLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4605AlbRPieLot), 6, 0));
      A4295ClasCod = (short)(0) ;
      n4295ClasCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
      A4296ClasDsc = "" ;
      n4296ClasDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4296ClasDsc", A4296ClasDsc);
      A47AlbREst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      A56AlbRUni = httpContext.getMessage( "K", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A50AlbRLoc = E50AlbRLoc ;
      httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
      A48AlbRFecUlt = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      A1291AlbRDes = E1291AlbRDes ;
      httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
      A4601AlbRTam = E4601AlbRTam ;
      httpContext.ajax_rsp_assign_attri("", false, "A4601AlbRTam", A4601AlbRTam);
      A4602AlbRMdlCod = E4602AlbRMdlCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
      Z47AlbREst = (byte)(0) ;
      Z4290AlbPmPPza = DecimalUtil.ZERO ;
      Z52AlbRPieEnt = 0 ;
      Z56AlbRUni = "" ;
      Z50AlbRLoc = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z54AlbRPieUti = 0 ;
      Z53AlbRPieReb = 0 ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z59AlbRUniReb = DecimalUtil.ZERO ;
      Z48AlbRFecUlt = GXutil.nullDate() ;
      Z1211TipEntCod = (short)(0) ;
      Z1222AlbNumEti = (short)(0) ;
      Z1291AlbRDes = "" ;
      Z1301AlbRUlin = (byte)(0) ;
      Z4601AlbRTam = "" ;
      Z4602AlbRMdlCod = "" ;
      Z4604AlbRUniLot = DecimalUtil.ZERO ;
      Z4605AlbRPieLot = 0 ;
      Z4295ClasCod = (short)(0) ;
   }

   public void initAllLM7( )
   {
      A44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      initializeNonKeyLM7( ) ;
   }

   public void standaloneModalInsert( )
   {
      AV36Modo = iV36Modo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Modo", AV36Modo);
      A56AlbRUni = i56AlbRUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A48AlbRFecUlt = i48AlbRFecUlt ;
      httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      A50AlbRLoc = i50AlbRLoc ;
      httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
      A4602AlbRMdlCod = i4602AlbRMdlCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
      A4601AlbRTam = i4601AlbRTam ;
      httpContext.ajax_rsp_assign_attri("", false, "A4601AlbRTam", A4601AlbRTam);
      A1291AlbRDes = i1291AlbRDes ;
      httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241521993", true, true);
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
      httpContext.AddJavascriptSource("talbrel.js", "?20268241521993", false, true);
      /* End function include_jscripts */
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
      edtAlbRUlin_Internalname = "ALBRULIN" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtAlbRefDsc_Internalname = "ALBREFDSC" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtAlbPmPPza_Internalname = "ALBPMPPZA" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtAlbPzaEst_Internalname = "ALBPZAEST" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtAlbRTam_Internalname = "ALBRTAM" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtAlbRMdlCod_Internalname = "ALBRMDLCOD" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtAlbRMdlDsc_Internalname = "ALBRMDLDSC" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtAlbRUniLot_Internalname = "ALBRUNILOT" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtAlbRPieLot_Internalname = "ALBRPIELOT" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtAlbRHEn_Internalname = "ALBRHEN" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtClasCod_Internalname = "CLASCOD" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      edtClasDsc_Internalname = "CLASDSC" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "ALBARANES DE RECEPCIÓN (2/2)", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtClasDsc_Jsonclick = "" ;
      edtClasDsc_Backcolor = (int)(0xFFFFFF) ;
      edtClasDsc_Enabled = 0 ;
      edtClasCod_Jsonclick = "" ;
      edtClasCod_Backcolor = (int)(0xFFFFFF) ;
      edtClasCod_Enabled = 1 ;
      edtAlbRHEn_Jsonclick = "" ;
      edtAlbRHEn_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRHEn_Enabled = 0 ;
      edtAlbRPieLot_Jsonclick = "" ;
      edtAlbRPieLot_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRPieLot_Enabled = 1 ;
      edtAlbRUniLot_Jsonclick = "" ;
      edtAlbRUniLot_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUniLot_Enabled = 1 ;
      edtAlbRMdlDsc_Jsonclick = "" ;
      edtAlbRMdlDsc_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRMdlDsc_Enabled = 0 ;
      edtAlbRMdlCod_Jsonclick = "" ;
      edtAlbRMdlCod_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRMdlCod_Enabled = 1 ;
      edtAlbRTam_Jsonclick = "" ;
      edtAlbRTam_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRTam_Enabled = 1 ;
      edtAlbPzaEst_Jsonclick = "" ;
      edtAlbPzaEst_Backcolor = (int)(0xFFFFFF) ;
      edtAlbPzaEst_Enabled = 0 ;
      edtAlbPmPPza_Jsonclick = "" ;
      edtAlbPmPPza_Backcolor = (int)(0xFFFFFF) ;
      edtAlbPmPPza_Enabled = 0 ;
      edtAlbRefDsc_Jsonclick = "" ;
      edtAlbRefDsc_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRefDsc_Enabled = 0 ;
      edtAlbRUlin_Jsonclick = "" ;
      edtAlbRUlin_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUlin_Enabled = 1 ;
      edtProceNom_Jsonclick = "" ;
      edtProceNom_Backcolor = (int)(0xFFFFFF) ;
      edtProceNom_Enabled = 0 ;
      edtProceCod_Jsonclick = "" ;
      edtProceCod_Backcolor = (int)(0xFFFFFF) ;
      edtProceCod_Enabled = 0 ;
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
      edtAlbRFecUlt_Enabled = 0 ;
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
      cmbAlbRReo.setEnabled( 0 );
      cmbAlbRReo.setIBackground( (int)(0xFFFFFF) );
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRUniEnt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUniEnt_Enabled = 1 ;
      edtAlbRFen_Jsonclick = "" ;
      edtAlbRFen_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRFen_Enabled = 0 ;
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
      edtAlbREnt_Enabled = 0 ;
      edtTrnNom_Jsonclick = "" ;
      edtTrnNom_Backcolor = (int)(0xFFFFFF) ;
      edtTrnNom_Enabled = 0 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Backcolor = (int)(0xFFFFFF) ;
      edtTrnCod_Enabled = 0 ;
      edtAlbRef_Jsonclick = "" ;
      edtAlbRef_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRef_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
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

   public void xc_29_LM7( String A396EmprCod ,
                          int A44AlbRecCod ,
                          String AV46Obs )
   {
      if ( true /* After */ )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int2[0] = A44AlbRecCod ;
         GXv_char1[0] = AV46Obs ;
         new app.palbrelobs(remoteHandle, context).execute( GXv_char3, GXv_int2, GXv_char1) ;
         A396EmprCod = GXv_char3[0] ;
         A44AlbRecCod = GXv_int2[0] ;
         AV46Obs = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV46Obs", AV46Obs);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( AV46Obs)+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void init_web_controls( )
   {
      cmbAlbRUni.setName( "ALBRUNI" );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A56AlbRUni)==0) )
         {
            A56AlbRUni = httpContext.getMessage( "K", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         }
      }
      cmbAlbRReo.setName( "ALBRREO" );
      cmbAlbRReo.setWebtags( "" );
      cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
      cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A55AlbRReo)==0) )
         {
            A55AlbRReo = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         }
      }
      cmbAlbREst.setName( "ALBREST" );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         if ( isIns( ) && (0==A47AlbREst) )
         {
            A47AlbREst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T00LM37 */
      pr_default.execute(35, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00LM37_A407EmprNom[0] ;
      n407EmprNom = T00LM37_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(35);
      GX_FocusControl = edtAlbRPieEnt_Internalname ;
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
      n44AlbRecCod = false ;
      n840TrnCod = false ;
      n970ProceCod = false ;
      A56AlbRUni = cmbAlbRUni.getValue() ;
      cmbAlbRUni.setValue( A56AlbRUni );
      E1291AlbRDes = A1291AlbRDes ;
      E4601AlbRTam = A4601AlbRTam ;
      E4602AlbRMdlCod = A4602AlbRMdlCod ;
      E50AlbRLoc = A50AlbRLoc ;
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
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", GXutil.rtrim( A56AlbRUni));
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", GXutil.rtrim( A50AlbRLoc));
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrim( localUtil.ntoc( A53AlbRPieReb, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrim( localUtil.ntoc( A59AlbRUniReb, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", GXutil.rtrim( A1212TipEntNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrim( localUtil.ntoc( A1222AlbNumEti, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", GXutil.rtrim( A1291AlbRDes));
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", GXutil.rtrim( A971ProceNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrim( localUtil.ntoc( A1301AlbRUlin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4601AlbRTam", GXutil.rtrim( A4601AlbRTam));
      httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", GXutil.rtrim( A4602AlbRMdlCod));
      httpContext.ajax_rsp_assign_attri("", false, "A4604AlbRUniLot", GXutil.ltrim( localUtil.ntoc( A4604AlbRUniLot, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4605AlbRPieLot", GXutil.ltrim( localUtil.ntoc( A4605AlbRPieLot, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrim( localUtil.ntoc( A4295ClasCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", GXutil.rtrim( A3613AlbRefDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", GXutil.rtrim( A46AlbREnt));
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", GXutil.rtrim( A55AlbRReo));
      cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A4296ClasDsc", GXutil.rtrim( A4296ClasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4603AlbRMdlDsc", GXutil.rtrim( A4603AlbRMdlDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrim( localUtil.ntoc( A4290AlbPmPPza, (byte)(6), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrim( localUtil.ntoc( A4291AlbPzaEst, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", GXutil.rtrim( AV18AlbCum));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z841TrnNom", GXutil.rtrim( Z841TrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z50AlbRLoc", GXutil.rtrim( Z50AlbRLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( Z54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z53AlbRPieReb", GXutil.ltrim( localUtil.ntoc( Z53AlbRPieReb, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( Z60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z59AlbRUniReb", GXutil.ltrim( localUtil.ntoc( Z59AlbRUniReb, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z48AlbRFecUlt", localUtil.format(Z48AlbRFecUlt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1211TipEntCod", GXutil.ltrim( localUtil.ntoc( Z1211TipEntCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1212TipEntNom", GXutil.rtrim( Z1212TipEntNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1222AlbNumEti", GXutil.ltrim( localUtil.ntoc( Z1222AlbNumEti, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1291AlbRDes", GXutil.rtrim( Z1291AlbRDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z971ProceNom", GXutil.rtrim( Z971ProceNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1301AlbRUlin", GXutil.ltrim( localUtil.ntoc( Z1301AlbRUlin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4601AlbRTam", GXutil.rtrim( Z4601AlbRTam));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4602AlbRMdlCod", GXutil.rtrim( Z4602AlbRMdlCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4604AlbRUniLot", GXutil.ltrim( localUtil.ntoc( Z4604AlbRUniLot, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4605AlbRPieLot", GXutil.ltrim( localUtil.ntoc( Z4605AlbRPieLot, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4295ClasCod", GXutil.ltrim( localUtil.ntoc( Z4295ClasCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3613AlbRefDsc", GXutil.rtrim( Z3613AlbRefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z46AlbREnt", GXutil.rtrim( Z46AlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z970ProceCod", GXutil.ltrim( localUtil.ntoc( Z970ProceCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z49AlbRFen", localUtil.format(Z49AlbRFen, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4606AlbRHEn", localUtil.ttoc( Z4606AlbRHEn, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z55AlbRReo", GXutil.rtrim( Z55AlbRReo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4296ClasDsc", GXutil.rtrim( Z4296ClasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4603AlbRMdlDsc", GXutil.rtrim( Z4603AlbRMdlDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( Z51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( Z57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4290AlbPmPPza", GXutil.ltrim( localUtil.ntoc( Z4290AlbPmPPza, (byte)(6), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4291AlbPzaEst", GXutil.ltrim( localUtil.ntoc( Z4291AlbPzaEst, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z47AlbREst", GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV18AlbCum", GXutil.rtrim( ZV18AlbCum));
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Albruniuti( )
   {
      A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValue())) ;
      cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
      }
      if ( isIns( )  && (0==A47AlbREst) && ( Gx_BScreen == 0 ) )
      {
         A47AlbREst = (byte)(0) ;
         cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      }
      else
      {
         if ( A57AlbRUniDis.doubleValue() == 0 )
         {
            A47AlbREst = (byte)(1) ;
            cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
         }
         else
         {
            if ( A57AlbRUniDis.doubleValue() != 0 )
            {
               A47AlbREst = (byte)(0) ;
               cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
            }
         }
      }
      dynload_actions( ) ;
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
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
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

   public void valid_Albrmdlcod( )
   {
      n4603AlbRMdlDsc = false ;
      /* Using cursor T00LM19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A45AlbRef, A4602AlbRMdlCod});
      if ( (pr_default.getStatus(17) != 101) )
      {
         A4603AlbRMdlDsc = T00LM19_A4603AlbRMdlDsc[0] ;
         n4603AlbRMdlDsc = T00LM19_n4603AlbRMdlDsc[0] ;
      }
      else
      {
         A4603AlbRMdlDsc = "No Existe Modelo." ;
         n4603AlbRMdlDsc = false ;
      }
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4603AlbRMdlDsc", GXutil.rtrim( A4603AlbRMdlDsc));
   }

   public void valid_Clascod( )
   {
      n4295ClasCod = false ;
      n4296ClasDsc = false ;
      /* Using cursor T00LM20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLAPEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtClasCod_Internalname ;
      }
      A4296ClasDsc = T00LM20_A4296ClasDsc[0] ;
      n4296ClasDsc = T00LM20_n4296ClasDsc[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4296ClasDsc", GXutil.rtrim( A4296ClasDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'A46AlbREnt',fld:'ALBRENT',pic:''},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'A49AlbRFen',fld:'ALBRFEN',pic:''},{av:'A4606AlbRHEn',fld:'ALBRHEN',pic:'99/99/99 99:99'},{av:'cmbAlbRReo'},{av:'A55AlbRReo',fld:'ALBRREO',pic:'@!'},{av:'AV46Obs',fld:'vOBS',pic:''},{av:'AV56AlbRecIni',fld:'vALBRECINI',pic:'ZZZZZZZ9'},{av:'AV57AlbRecFin',fld:'vALBRECFIN',pic:'ZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A48AlbRFecUlt',fld:'ALBRFECULT',pic:''},{av:'AV36Modo',fld:'vMODO',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'AV46Obs',fld:'vOBS',pic:''},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'cmbAlbRReo'},{av:'A55AlbRReo',fld:'ALBRREO',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'AV36Modo',fld:'vMODO',pic:''},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A48AlbRFecUlt',fld:'ALBRFECULT',pic:''},{av:'A50AlbRLoc',fld:'ALBRLOC',pic:''},{av:'A4602AlbRMdlCod',fld:'ALBRMDLCOD',pic:''},{av:'A4601AlbRTam',fld:'ALBRTAM',pic:''},{av:'A1291AlbRDes',fld:'ALBRDES',pic:''},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV18AlbCum',fld:'vALBCUM',pic:''}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A50AlbRLoc',fld:'ALBRLOC',pic:''},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A53AlbRPieReb',fld:'ALBRPIEREB',pic:'ZZZ9'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A59AlbRUniReb',fld:'ALBRUNIREB',pic:'ZZZZZ9.99'},{av:'A48AlbRFecUlt',fld:'ALBRFECULT',pic:''},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'},{av:'A1212TipEntNom',fld:'TIPENTNOM',pic:''},{av:'A1222AlbNumEti',fld:'ALBNUMETI',pic:'ZZZ9'},{av:'A1291AlbRDes',fld:'ALBRDES',pic:''},{av:'A971ProceNom',fld:'PROCENOM',pic:''},{av:'A1301AlbRUlin',fld:'ALBRULIN',pic:'Z9'},{av:'A4601AlbRTam',fld:'ALBRTAM',pic:''},{av:'A4602AlbRMdlCod',fld:'ALBRMDLCOD',pic:''},{av:'A4604AlbRUniLot',fld:'ALBRUNILOT',pic:'ZZZZZ9.99'},{av:'A4605AlbRPieLot',fld:'ALBRPIELOT',pic:'ZZZZZ9'},{av:'A4295ClasCod',fld:'CLASCOD',pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'A46AlbREnt',fld:'ALBRENT',pic:''},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'A49AlbRFen',fld:'ALBRFEN',pic:''},{av:'A4606AlbRHEn',fld:'ALBRHEN',pic:'99/99/99 99:99'},{av:'cmbAlbRReo'},{av:'A55AlbRReo',fld:'ALBRREO',pic:'@!'},{av:'A4296ClasDsc',fld:'CLASDSC',pic:''},{av:'A4603AlbRMdlDsc',fld:'ALBRMDLDSC',pic:''},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A4290AlbPmPPza',fld:'ALBPMPPZA',pic:'Z9.999'},{av:'A4291AlbPzaEst',fld:'ALBPZAEST',pic:'ZZZZZZZ9'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'AV18AlbCum',fld:'vALBCUM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z44AlbRecCod'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z841TrnNom'},{av:'Z52AlbRPieEnt'},{av:'Z56AlbRUni'},{av:'Z50AlbRLoc'},{av:'Z58AlbRUniEnt'},{av:'Z54AlbRPieUti'},{av:'Z53AlbRPieReb'},{av:'Z60AlbRUniUti'},{av:'Z59AlbRUniReb'},{av:'Z48AlbRFecUlt'},{av:'Z1211TipEntCod'},{av:'Z1212TipEntNom'},{av:'Z1222AlbNumEti'},{av:'Z1291AlbRDes'},{av:'Z971ProceNom'},{av:'Z1301AlbRUlin'},{av:'Z4601AlbRTam'},{av:'Z4602AlbRMdlCod'},{av:'Z4604AlbRUniLot'},{av:'Z4605AlbRPieLot'},{av:'Z4295ClasCod'},{av:'Z252CliCod'},{av:'Z45AlbRef'},{av:'Z3613AlbRefDsc'},{av:'Z46AlbREnt'},{av:'Z840TrnCod'},{av:'Z970ProceCod'},{av:'Z49AlbRFen'},{av:'Z4606AlbRHEn'},{av:'Z55AlbRReo'},{av:'Z4296ClasDsc'},{av:'Z4603AlbRMdlDsc'},{av:'Z51AlbRPieDis'},{av:'Z57AlbRUniDis'},{av:'Z4290AlbPmPPza'},{av:'Z4291AlbPzaEst'},{av:'Z47AlbREst'},{av:'ZV18AlbCum'},{av:'edtAlbRPieUti_Enabled',ctrl:'ALBRPIEUTI',prop:'Enabled'},{av:'edtAlbRUniUti_Enabled',ctrl:'ALBRUNIUTI',prop:'Enabled'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ALBREF","{handler:'valid_Albref',iparms:[]");
      setEventMetadata("VALID_ALBREF",",oparms:[]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[]");
      setEventMetadata("VALID_TRNCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNI","{handler:'valid_Albruni',iparms:[]");
      setEventMetadata("VALID_ALBRUNI",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEUTI","{handler:'valid_Albrpieuti',iparms:[]");
      setEventMetadata("VALID_ALBRPIEUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIUTI","{handler:'valid_Albruniuti',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'}]");
      setEventMetadata("VALID_ALBRUNIUTI",",oparms:[{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'}]}");
      setEventMetadata("VALID_ALBRUNIDIS","{handler:'valid_Albrunidis',iparms:[]");
      setEventMetadata("VALID_ALBRUNIDIS",",oparms:[]}");
      setEventMetadata("VALID_ALBREST","{handler:'valid_Albrest',iparms:[{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'AV18AlbCum',fld:'vALBCUM',pic:''}]");
      setEventMetadata("VALID_ALBREST",",oparms:[{av:'AV18AlbCum',fld:'vALBCUM',pic:''}]}");
      setEventMetadata("VALID_PROCECOD","{handler:'valid_Procecod',iparms:[]");
      setEventMetadata("VALID_PROCECOD",",oparms:[]}");
      setEventMetadata("VALID_ALBPMPPZA","{handler:'valid_Albpmppza',iparms:[]");
      setEventMetadata("VALID_ALBPMPPZA",",oparms:[]}");
      setEventMetadata("VALID_ALBRMDLCOD","{handler:'valid_Albrmdlcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A4602AlbRMdlCod',fld:'ALBRMDLCOD',pic:''},{av:'A4603AlbRMdlDsc',fld:'ALBRMDLDSC',pic:''}]");
      setEventMetadata("VALID_ALBRMDLCOD",",oparms:[{av:'A4603AlbRMdlDsc',fld:'ALBRMDLDSC',pic:''}]}");
      setEventMetadata("VALID_ALBRUNILOT","{handler:'valid_Albrunilot',iparms:[]");
      setEventMetadata("VALID_ALBRUNILOT",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIELOT","{handler:'valid_Albrpielot',iparms:[]");
      setEventMetadata("VALID_ALBRPIELOT",",oparms:[]}");
      setEventMetadata("VALID_CLASCOD","{handler:'valid_Clascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4295ClasCod',fld:'CLASCOD',pic:'ZZZ9'},{av:'A4296ClasDsc',fld:'CLASDSC',pic:''}]");
      setEventMetadata("VALID_CLASCOD",",oparms:[{av:'A4296ClasDsc',fld:'CLASDSC',pic:''}]}");
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
      pr_default.close(18);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      E1291AlbRDes = "" ;
      E4601AlbRTam = "" ;
      E4602AlbRMdlCod = "" ;
      E50AlbRLoc = "" ;
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA45AlbRef = "" ;
      wcpOA3613AlbRefDsc = "" ;
      wcpOA46AlbREnt = "" ;
      wcpOA49AlbRFen = GXutil.nullDate() ;
      wcpOA4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      wcpOA55AlbRReo = "" ;
      wcpOAV46Obs = "" ;
      Z396EmprCod = "" ;
      Z4290AlbPmPPza = DecimalUtil.ZERO ;
      Z56AlbRUni = "" ;
      Z50AlbRLoc = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z59AlbRUniReb = DecimalUtil.ZERO ;
      Z48AlbRFecUlt = GXutil.nullDate() ;
      Z1291AlbRDes = "" ;
      Z4601AlbRTam = "" ;
      Z4602AlbRMdlCod = "" ;
      Z4604AlbRUniLot = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV46Obs = "" ;
      A45AlbRef = "" ;
      A4602AlbRMdlCod = "" ;
      A3613AlbRefDsc = "" ;
      A46AlbREnt = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      A55AlbRReo = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A56AlbRUni = "" ;
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
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A841TrnNom = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A50AlbRLoc = "" ;
      lblTextblock13_Jsonclick = "" ;
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
      A4290AlbPmPPza = DecimalUtil.ZERO ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      A4601AlbRTam = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
      A4603AlbRMdlDsc = "" ;
      lblTextblock37_Jsonclick = "" ;
      A4604AlbRUniLot = DecimalUtil.ZERO ;
      lblTextblock38_Jsonclick = "" ;
      lblTextblock39_Jsonclick = "" ;
      lblTextblock40_Jsonclick = "" ;
      lblTextblock41_Jsonclick = "" ;
      A4296ClasDsc = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV36Modo = "" ;
      AV17UsurCod = "" ;
      AV18AlbCum = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      forbiddenHiddens2 = new com.genexus.util.GXProperties();
      hsh2 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z45AlbRef = "" ;
      Z3613AlbRefDsc = "" ;
      Z46AlbREnt = "" ;
      Z49AlbRFen = GXutil.nullDate() ;
      Z4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      Z55AlbRReo = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z841TrnNom = "" ;
      Z971ProceNom = "" ;
      Z4603AlbRMdlDsc = "" ;
      Z4296ClasDsc = "" ;
      edtAlbRPieDis_Inputmask = "" ;
      edtAlbRPieUti_Inputmask = "" ;
      edtAlbRPieEnt_Inputmask = "" ;
      edtAlbRPieLot_Inputmask = "" ;
      T00LM4_A407EmprNom = new String[] {""} ;
      T00LM4_n407EmprNom = new boolean[] {false} ;
      T00LM5_A279CliNom = new String[] {""} ;
      T00LM6_A841TrnNom = new String[] {""} ;
      T00LM6_n841TrnNom = new boolean[] {false} ;
      T00LM7_A971ProceNom = new String[] {""} ;
      T00LM7_n971ProceNom = new boolean[] {false} ;
      E50AlbRLoc = "" ;
      E4602AlbRMdlCod = "" ;
      E4601AlbRTam = "" ;
      E1291AlbRDes = "" ;
      T00LM9_A4603AlbRMdlDsc = new String[] {""} ;
      T00LM9_n4603AlbRMdlDsc = new boolean[] {false} ;
      T00LM10_A65ArtCod = new String[] {""} ;
      T00LM10_A4658MdlCod = new String[] {""} ;
      T00LM10_A252CliCod = new int[1] ;
      T00LM10_A45AlbRef = new String[] {""} ;
      T00LM10_A3613AlbRefDsc = new String[] {""} ;
      T00LM10_A46AlbREnt = new String[] {""} ;
      T00LM10_A840TrnCod = new short[1] ;
      T00LM10_n840TrnCod = new boolean[] {false} ;
      T00LM10_A970ProceCod = new short[1] ;
      T00LM10_n970ProceCod = new boolean[] {false} ;
      T00LM10_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T00LM10_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      T00LM10_n4606AlbRHEn = new boolean[] {false} ;
      T00LM10_A55AlbRReo = new String[] {""} ;
      T00LM10_A44AlbRecCod = new int[1] ;
      T00LM10_n44AlbRecCod = new boolean[] {false} ;
      T00LM10_A47AlbREst = new byte[1] ;
      T00LM10_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LM10_A407EmprNom = new String[] {""} ;
      T00LM10_n407EmprNom = new boolean[] {false} ;
      T00LM10_A279CliNom = new String[] {""} ;
      T00LM10_A841TrnNom = new String[] {""} ;
      T00LM10_n841TrnNom = new boolean[] {false} ;
      T00LM10_A52AlbRPieEnt = new int[1] ;
      T00LM10_A56AlbRUni = new String[] {""} ;
      T00LM10_A50AlbRLoc = new String[] {""} ;
      T00LM10_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LM10_A54AlbRPieUti = new int[1] ;
      T00LM10_A53AlbRPieReb = new int[1] ;
      T00LM10_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LM10_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LM10_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T00LM10_A1211TipEntCod = new short[1] ;
      T00LM10_n1211TipEntCod = new boolean[] {false} ;
      T00LM10_A1222AlbNumEti = new short[1] ;
      T00LM10_A1291AlbRDes = new String[] {""} ;
      T00LM10_A971ProceNom = new String[] {""} ;
      T00LM10_n971ProceNom = new boolean[] {false} ;
      T00LM10_A1301AlbRUlin = new byte[1] ;
      T00LM10_A4601AlbRTam = new String[] {""} ;
      T00LM10_A4602AlbRMdlCod = new String[] {""} ;
      T00LM10_A4604AlbRUniLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LM10_n4604AlbRUniLot = new boolean[] {false} ;
      T00LM10_A4605AlbRPieLot = new int[1] ;
      T00LM10_n4605AlbRPieLot = new boolean[] {false} ;
      T00LM10_A4296ClasDsc = new String[] {""} ;
      T00LM10_n4296ClasDsc = new boolean[] {false} ;
      T00LM10_A396EmprCod = new String[] {""} ;
      T00LM10_A4295ClasCod = new short[1] ;
      T00LM10_n4295ClasCod = new boolean[] {false} ;
      T00LM10_A4603AlbRMdlDsc = new String[] {""} ;
      T00LM10_n4603AlbRMdlDsc = new boolean[] {false} ;
      T00LM8_A4296ClasDsc = new String[] {""} ;
      T00LM8_n4296ClasDsc = new boolean[] {false} ;
      T00LM11_A4296ClasDsc = new String[] {""} ;
      T00LM11_n4296ClasDsc = new boolean[] {false} ;
      T00LM12_A4603AlbRMdlDsc = new String[] {""} ;
      T00LM12_n4603AlbRMdlDsc = new boolean[] {false} ;
      T00LM13_A396EmprCod = new String[] {""} ;
      T00LM13_A44AlbRecCod = new int[1] ;
      T00LM13_n44AlbRecCod = new boolean[] {false} ;
      T00LM3_A252CliCod = new int[1] ;
      T00LM3_A45AlbRef = new String[] {""} ;
      T00LM3_A3613AlbRefDsc = new String[] {""} ;
      T00LM3_A46AlbREnt = new String[] {""} ;
      T00LM3_A840TrnCod = new short[1] ;
      T00LM3_n840TrnCod = new boolean[] {false} ;
      T00LM3_A970ProceCod = new short[1] ;
      T00LM3_n970ProceCod = new boolean[] {false} ;
      T00LM3_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T00LM3_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      T00LM3_n4606AlbRHEn = new boolean[] {false} ;
      T00LM3_A55AlbRReo = new String[] {""} ;
      T00LM3_A44AlbRecCod = new int[1] ;
      T00LM3_n44AlbRecCod = new boolean[] {false} ;
      T00LM3_A47AlbREst = new byte[1] ;
      T00LM3_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LM3_A52AlbRPieEnt = new int[1] ;
      T00LM3_A56AlbRUni = new String[] {""} ;
      T00LM3_A50AlbRLoc = new String[] {""} ;
      T00LM3_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LM3_A54AlbRPieUti = new int[1] ;
      T00LM3_A53AlbRPieReb = new int[1] ;
      T00LM3_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LM3_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LM3_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T00LM3_A1211TipEntCod = new short[1] ;
      T00LM3_n1211TipEntCod = new boolean[] {false} ;
      T00LM3_A1222AlbNumEti = new short[1] ;
      T00LM3_A1291AlbRDes = new String[] {""} ;
      T00LM3_A1301AlbRUlin = new byte[1] ;
      T00LM3_A4601AlbRTam = new String[] {""} ;
      T00LM3_A4602AlbRMdlCod = new String[] {""} ;
      T00LM3_A4604AlbRUniLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LM3_n4604AlbRUniLot = new boolean[] {false} ;
      T00LM3_A4605AlbRPieLot = new int[1] ;
      T00LM3_n4605AlbRPieLot = new boolean[] {false} ;
      T00LM3_A396EmprCod = new String[] {""} ;
      T00LM3_A4295ClasCod = new short[1] ;
      T00LM3_n4295ClasCod = new boolean[] {false} ;
      sMode7 = "" ;
      T00LM14_A396EmprCod = new String[] {""} ;
      T00LM14_A44AlbRecCod = new int[1] ;
      T00LM14_n44AlbRecCod = new boolean[] {false} ;
      T00LM14_A252CliCod = new int[1] ;
      T00LM14_A45AlbRef = new String[] {""} ;
      T00LM14_A3613AlbRefDsc = new String[] {""} ;
      T00LM14_A46AlbREnt = new String[] {""} ;
      T00LM14_A840TrnCod = new short[1] ;
      T00LM14_n840TrnCod = new boolean[] {false} ;
      T00LM14_A970ProceCod = new short[1] ;
      T00LM14_n970ProceCod = new boolean[] {false} ;
      T00LM14_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T00LM14_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      T00LM14_n4606AlbRHEn = new boolean[] {false} ;
      T00LM14_A55AlbRReo = new String[] {""} ;
      T00LM15_A396EmprCod = new String[] {""} ;
      T00LM15_A44AlbRecCod = new int[1] ;
      T00LM15_n44AlbRecCod = new boolean[] {false} ;
      T00LM15_A252CliCod = new int[1] ;
      T00LM15_A45AlbRef = new String[] {""} ;
      T00LM15_A3613AlbRefDsc = new String[] {""} ;
      T00LM15_A46AlbREnt = new String[] {""} ;
      T00LM15_A840TrnCod = new short[1] ;
      T00LM15_n840TrnCod = new boolean[] {false} ;
      T00LM15_A970ProceCod = new short[1] ;
      T00LM15_n970ProceCod = new boolean[] {false} ;
      T00LM15_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T00LM15_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      T00LM15_n4606AlbRHEn = new boolean[] {false} ;
      T00LM15_A55AlbRReo = new String[] {""} ;
      T00LM2_A252CliCod = new int[1] ;
      T00LM2_A45AlbRef = new String[] {""} ;
      T00LM2_A3613AlbRefDsc = new String[] {""} ;
      T00LM2_A46AlbREnt = new String[] {""} ;
      T00LM2_A840TrnCod = new short[1] ;
      T00LM2_n840TrnCod = new boolean[] {false} ;
      T00LM2_A970ProceCod = new short[1] ;
      T00LM2_n970ProceCod = new boolean[] {false} ;
      T00LM2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T00LM2_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      T00LM2_n4606AlbRHEn = new boolean[] {false} ;
      T00LM2_A55AlbRReo = new String[] {""} ;
      T00LM2_A44AlbRecCod = new int[1] ;
      T00LM2_n44AlbRecCod = new boolean[] {false} ;
      T00LM2_A47AlbREst = new byte[1] ;
      T00LM2_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LM2_A52AlbRPieEnt = new int[1] ;
      T00LM2_A56AlbRUni = new String[] {""} ;
      T00LM2_A50AlbRLoc = new String[] {""} ;
      T00LM2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LM2_A54AlbRPieUti = new int[1] ;
      T00LM2_A53AlbRPieReb = new int[1] ;
      T00LM2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LM2_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LM2_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T00LM2_A1211TipEntCod = new short[1] ;
      T00LM2_n1211TipEntCod = new boolean[] {false} ;
      T00LM2_A1222AlbNumEti = new short[1] ;
      T00LM2_A1291AlbRDes = new String[] {""} ;
      T00LM2_A1301AlbRUlin = new byte[1] ;
      T00LM2_A4601AlbRTam = new String[] {""} ;
      T00LM2_A4602AlbRMdlCod = new String[] {""} ;
      T00LM2_A4604AlbRUniLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LM2_n4604AlbRUniLot = new boolean[] {false} ;
      T00LM2_A4605AlbRPieLot = new int[1] ;
      T00LM2_n4605AlbRPieLot = new boolean[] {false} ;
      T00LM2_A396EmprCod = new String[] {""} ;
      T00LM2_A4295ClasCod = new short[1] ;
      T00LM2_n4295ClasCod = new boolean[] {false} ;
      T00LM19_A4603AlbRMdlDsc = new String[] {""} ;
      T00LM19_n4603AlbRMdlDsc = new boolean[] {false} ;
      T00LM20_A4296ClasDsc = new String[] {""} ;
      T00LM20_n4296ClasDsc = new boolean[] {false} ;
      T00LM21_A396EmprCod = new String[] {""} ;
      T00LM21_A13026PedDGId = new int[1] ;
      T00LM21_A44AlbRecCod = new int[1] ;
      T00LM21_n44AlbRecCod = new boolean[] {false} ;
      T00LM22_A396EmprCod = new String[] {""} ;
      T00LM22_A11669DevCruId = new int[1] ;
      T00LM22_A44AlbRecCod = new int[1] ;
      T00LM22_n44AlbRecCod = new boolean[] {false} ;
      T00LM23_A396EmprCod = new String[] {""} ;
      T00LM23_A44AlbRecCod = new int[1] ;
      T00LM23_n44AlbRecCod = new boolean[] {false} ;
      T00LM23_A9743Emp_CUb = new String[] {""} ;
      T00LM23_A5860Emp_Anp = new short[1] ;
      T00LM24_A396EmprCod = new String[] {""} ;
      T00LM24_A44AlbRecCod = new int[1] ;
      T00LM24_n44AlbRecCod = new boolean[] {false} ;
      T00LM24_A7130MatC_Pz = new String[] {""} ;
      T00LM25_A396EmprCod = new String[] {""} ;
      T00LM25_A44AlbRecCod = new int[1] ;
      T00LM25_n44AlbRecCod = new boolean[] {false} ;
      T00LM25_A7132MatC_Talla = new String[] {""} ;
      T00LM26_A396EmprCod = new String[] {""} ;
      T00LM26_A44AlbRecCod = new int[1] ;
      T00LM26_n44AlbRecCod = new boolean[] {false} ;
      T00LM26_A7115MatC_Lin = new short[1] ;
      T00LM27_A396EmprCod = new String[] {""} ;
      T00LM27_A30AlbProCod = new long[1] ;
      T00LM27_A129BarCod = new int[1] ;
      T00LM27_A132BarCodReo = new byte[1] ;
      T00LM27_A130BarCodPar = new String[] {""} ;
      T00LM27_A6622AlbHdRLn = new short[1] ;
      T00LM28_A396EmprCod = new String[] {""} ;
      T00LM28_A6235DevEmpCod = new int[1] ;
      T00LM28_A6243DevNumLin = new byte[1] ;
      T00LM29_A396EmprCod = new String[] {""} ;
      T00LM29_A44AlbRecCod = new int[1] ;
      T00LM29_n44AlbRecCod = new boolean[] {false} ;
      T00LM29_A4596AlbRDefCod = new short[1] ;
      T00LM30_A396EmprCod = new String[] {""} ;
      T00LM30_A44AlbRecCod = new int[1] ;
      T00LM30_n44AlbRecCod = new boolean[] {false} ;
      T00LM30_A2159AlbRecPie = new String[] {""} ;
      T00LM31_A396EmprCod = new String[] {""} ;
      T00LM31_A44AlbRecCod = new int[1] ;
      T00LM31_n44AlbRecCod = new boolean[] {false} ;
      T00LM31_A2165HisEmpLin = new short[1] ;
      T00LM32_A396EmprCod = new String[] {""} ;
      T00LM32_A44AlbRecCod = new int[1] ;
      T00LM32_n44AlbRecCod = new boolean[] {false} ;
      T00LM32_A1299AlbRLin = new byte[1] ;
      T00LM33_A396EmprCod = new String[] {""} ;
      T00LM33_A361DisCod = new int[1] ;
      T00LM33_A44AlbRecCod = new int[1] ;
      T00LM33_n44AlbRecCod = new boolean[] {false} ;
      T00LM34_A396EmprCod = new String[] {""} ;
      T00LM34_A323DevGenCod = new int[1] ;
      T00LM35_A396EmprCod = new String[] {""} ;
      T00LM35_A129BarCod = new int[1] ;
      T00LM35_A132BarCodReo = new byte[1] ;
      T00LM35_A130BarCodPar = new String[] {""} ;
      T00LM35_A200BarPieCod = new String[] {""} ;
      T00LM36_A396EmprCod = new String[] {""} ;
      T00LM36_A44AlbRecCod = new int[1] ;
      T00LM36_n44AlbRecCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      iV36Modo = "" ;
      i56AlbRUni = "" ;
      i48AlbRFecUlt = GXutil.nullDate() ;
      i50AlbRLoc = "" ;
      i4602AlbRMdlCod = "" ;
      i4601AlbRTam = "" ;
      i1291AlbRDes = "" ;
      GXv_char3 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char1 = new String[1] ;
      T00LM37_A407EmprNom = new String[] {""} ;
      T00LM37_n407EmprNom = new boolean[] {false} ;
      Z1212TipEntNom = "" ;
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      ZV18AlbCum = "" ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ841TrnNom = "" ;
      ZZ56AlbRUni = "" ;
      ZZ50AlbRLoc = "" ;
      ZZ58AlbRUniEnt = DecimalUtil.ZERO ;
      ZZ60AlbRUniUti = DecimalUtil.ZERO ;
      ZZ59AlbRUniReb = DecimalUtil.ZERO ;
      ZZ48AlbRFecUlt = GXutil.nullDate() ;
      ZZ1212TipEntNom = "" ;
      ZZ1291AlbRDes = "" ;
      ZZ971ProceNom = "" ;
      ZZ4601AlbRTam = "" ;
      ZZ4602AlbRMdlCod = "" ;
      ZZ4604AlbRUniLot = DecimalUtil.ZERO ;
      ZZ45AlbRef = "" ;
      ZZ3613AlbRefDsc = "" ;
      ZZ46AlbREnt = "" ;
      ZZ49AlbRFen = GXutil.nullDate() ;
      ZZ4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      ZZ55AlbRReo = "" ;
      ZZ4296ClasDsc = "" ;
      ZZ4603AlbRMdlDsc = "" ;
      ZZ57AlbRUniDis = DecimalUtil.ZERO ;
      ZZ4290AlbPmPPza = DecimalUtil.ZERO ;
      ZZV18AlbCum = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.talbrel__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.talbrel__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.talbrel__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.talbrel__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbrel__default(),
         new Object[] {
             new Object[] {
            T00LM2_A252CliCod, T00LM2_A45AlbRef, T00LM2_A3613AlbRefDsc, T00LM2_A46AlbREnt, T00LM2_A840TrnCod, T00LM2_n840TrnCod, T00LM2_A970ProceCod, T00LM2_n970ProceCod, T00LM2_A49AlbRFen, T00LM2_A4606AlbRHEn,
            T00LM2_n4606AlbRHEn, T00LM2_A55AlbRReo, T00LM2_A44AlbRecCod, T00LM2_A47AlbREst, T00LM2_A4290AlbPmPPza, T00LM2_A52AlbRPieEnt, T00LM2_A56AlbRUni, T00LM2_A50AlbRLoc, T00LM2_A58AlbRUniEnt, T00LM2_A54AlbRPieUti,
            T00LM2_A53AlbRPieReb, T00LM2_A60AlbRUniUti, T00LM2_A59AlbRUniReb, T00LM2_A48AlbRFecUlt, T00LM2_A1211TipEntCod, T00LM2_n1211TipEntCod, T00LM2_A1222AlbNumEti, T00LM2_A1291AlbRDes, T00LM2_A1301AlbRUlin, T00LM2_A4601AlbRTam,
            T00LM2_A4602AlbRMdlCod, T00LM2_A4604AlbRUniLot, T00LM2_n4604AlbRUniLot, T00LM2_A4605AlbRPieLot, T00LM2_n4605AlbRPieLot, T00LM2_A396EmprCod, T00LM2_A4295ClasCod, T00LM2_n4295ClasCod
            }
            , new Object[] {
            T00LM3_A252CliCod, T00LM3_A45AlbRef, T00LM3_A3613AlbRefDsc, T00LM3_A46AlbREnt, T00LM3_A840TrnCod, T00LM3_n840TrnCod, T00LM3_A970ProceCod, T00LM3_n970ProceCod, T00LM3_A49AlbRFen, T00LM3_A4606AlbRHEn,
            T00LM3_n4606AlbRHEn, T00LM3_A55AlbRReo, T00LM3_A44AlbRecCod, T00LM3_A47AlbREst, T00LM3_A4290AlbPmPPza, T00LM3_A52AlbRPieEnt, T00LM3_A56AlbRUni, T00LM3_A50AlbRLoc, T00LM3_A58AlbRUniEnt, T00LM3_A54AlbRPieUti,
            T00LM3_A53AlbRPieReb, T00LM3_A60AlbRUniUti, T00LM3_A59AlbRUniReb, T00LM3_A48AlbRFecUlt, T00LM3_A1211TipEntCod, T00LM3_n1211TipEntCod, T00LM3_A1222AlbNumEti, T00LM3_A1291AlbRDes, T00LM3_A1301AlbRUlin, T00LM3_A4601AlbRTam,
            T00LM3_A4602AlbRMdlCod, T00LM3_A4604AlbRUniLot, T00LM3_n4604AlbRUniLot, T00LM3_A4605AlbRPieLot, T00LM3_n4605AlbRPieLot, T00LM3_A396EmprCod, T00LM3_A4295ClasCod, T00LM3_n4295ClasCod
            }
            , new Object[] {
            T00LM4_A407EmprNom, T00LM4_n407EmprNom
            }
            , new Object[] {
            T00LM5_A279CliNom
            }
            , new Object[] {
            T00LM6_A841TrnNom, T00LM6_n841TrnNom
            }
            , new Object[] {
            T00LM7_A971ProceNom, T00LM7_n971ProceNom
            }
            , new Object[] {
            T00LM8_A4296ClasDsc, T00LM8_n4296ClasDsc
            }
            , new Object[] {
            T00LM9_A4603AlbRMdlDsc, T00LM9_n4603AlbRMdlDsc
            }
            , new Object[] {
            T00LM10_A65ArtCod, T00LM10_A4658MdlCod, T00LM10_A252CliCod, T00LM10_A45AlbRef, T00LM10_A3613AlbRefDsc, T00LM10_A46AlbREnt, T00LM10_A840TrnCod, T00LM10_n840TrnCod, T00LM10_A970ProceCod, T00LM10_n970ProceCod,
            T00LM10_A49AlbRFen, T00LM10_A4606AlbRHEn, T00LM10_n4606AlbRHEn, T00LM10_A55AlbRReo, T00LM10_A44AlbRecCod, T00LM10_A47AlbREst, T00LM10_A4290AlbPmPPza, T00LM10_A407EmprNom, T00LM10_n407EmprNom, T00LM10_A279CliNom,
            T00LM10_A841TrnNom, T00LM10_n841TrnNom, T00LM10_A52AlbRPieEnt, T00LM10_A56AlbRUni, T00LM10_A50AlbRLoc, T00LM10_A58AlbRUniEnt, T00LM10_A54AlbRPieUti, T00LM10_A53AlbRPieReb, T00LM10_A60AlbRUniUti, T00LM10_A59AlbRUniReb,
            T00LM10_A48AlbRFecUlt, T00LM10_A1211TipEntCod, T00LM10_n1211TipEntCod, T00LM10_A1222AlbNumEti, T00LM10_A1291AlbRDes, T00LM10_A971ProceNom, T00LM10_n971ProceNom, T00LM10_A1301AlbRUlin, T00LM10_A4601AlbRTam, T00LM10_A4602AlbRMdlCod,
            T00LM10_A4604AlbRUniLot, T00LM10_n4604AlbRUniLot, T00LM10_A4605AlbRPieLot, T00LM10_n4605AlbRPieLot, T00LM10_A4296ClasDsc, T00LM10_n4296ClasDsc, T00LM10_A396EmprCod, T00LM10_A4295ClasCod, T00LM10_n4295ClasCod, T00LM10_A4603AlbRMdlDsc,
            T00LM10_n4603AlbRMdlDsc
            }
            , new Object[] {
            T00LM11_A4296ClasDsc, T00LM11_n4296ClasDsc
            }
            , new Object[] {
            T00LM12_A4603AlbRMdlDsc, T00LM12_n4603AlbRMdlDsc
            }
            , new Object[] {
            T00LM13_A396EmprCod, T00LM13_A44AlbRecCod
            }
            , new Object[] {
            T00LM14_A396EmprCod, T00LM14_A44AlbRecCod, T00LM14_A252CliCod, T00LM14_A45AlbRef, T00LM14_A3613AlbRefDsc, T00LM14_A46AlbREnt, T00LM14_A840TrnCod, T00LM14_n840TrnCod, T00LM14_A970ProceCod, T00LM14_n970ProceCod,
            T00LM14_A49AlbRFen, T00LM14_A4606AlbRHEn, T00LM14_n4606AlbRHEn, T00LM14_A55AlbRReo
            }
            , new Object[] {
            T00LM15_A396EmprCod, T00LM15_A44AlbRecCod, T00LM15_A252CliCod, T00LM15_A45AlbRef, T00LM15_A3613AlbRefDsc, T00LM15_A46AlbREnt, T00LM15_A840TrnCod, T00LM15_n840TrnCod, T00LM15_A970ProceCod, T00LM15_n970ProceCod,
            T00LM15_A49AlbRFen, T00LM15_A4606AlbRHEn, T00LM15_n4606AlbRHEn, T00LM15_A55AlbRReo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00LM19_A4603AlbRMdlDsc, T00LM19_n4603AlbRMdlDsc
            }
            , new Object[] {
            T00LM20_A4296ClasDsc, T00LM20_n4296ClasDsc
            }
            , new Object[] {
            T00LM21_A396EmprCod, T00LM21_A13026PedDGId, T00LM21_A44AlbRecCod
            }
            , new Object[] {
            T00LM22_A396EmprCod, T00LM22_A11669DevCruId, T00LM22_A44AlbRecCod
            }
            , new Object[] {
            T00LM23_A396EmprCod, T00LM23_A44AlbRecCod, T00LM23_A9743Emp_CUb, T00LM23_A5860Emp_Anp
            }
            , new Object[] {
            T00LM24_A396EmprCod, T00LM24_A44AlbRecCod, T00LM24_A7130MatC_Pz
            }
            , new Object[] {
            T00LM25_A396EmprCod, T00LM25_A44AlbRecCod, T00LM25_A7132MatC_Talla
            }
            , new Object[] {
            T00LM26_A396EmprCod, T00LM26_A44AlbRecCod, T00LM26_A7115MatC_Lin
            }
            , new Object[] {
            T00LM27_A396EmprCod, T00LM27_A30AlbProCod, T00LM27_A129BarCod, T00LM27_A132BarCodReo, T00LM27_A130BarCodPar, T00LM27_A6622AlbHdRLn
            }
            , new Object[] {
            T00LM28_A396EmprCod, T00LM28_A6235DevEmpCod, T00LM28_A6243DevNumLin
            }
            , new Object[] {
            T00LM29_A396EmprCod, T00LM29_A44AlbRecCod, T00LM29_A4596AlbRDefCod
            }
            , new Object[] {
            T00LM30_A396EmprCod, T00LM30_A44AlbRecCod, T00LM30_A2159AlbRecPie
            }
            , new Object[] {
            T00LM31_A396EmprCod, T00LM31_A44AlbRecCod, T00LM31_A2165HisEmpLin
            }
            , new Object[] {
            T00LM32_A396EmprCod, T00LM32_A44AlbRecCod, T00LM32_A1299AlbRLin
            }
            , new Object[] {
            T00LM33_A396EmprCod, T00LM33_A361DisCod, T00LM33_A44AlbRecCod
            }
            , new Object[] {
            T00LM34_A396EmprCod, T00LM34_A323DevGenCod
            }
            , new Object[] {
            T00LM35_A396EmprCod, T00LM35_A129BarCod, T00LM35_A132BarCodReo, T00LM35_A130BarCodPar, T00LM35_A200BarPieCod
            }
            , new Object[] {
            T00LM36_A396EmprCod, T00LM36_A44AlbRecCod
            }
            , new Object[] {
            T00LM37_A407EmprNom, T00LM37_n407EmprNom
            }
         }
      );
      Z55AlbRReo = "" ;
      A55AlbRReo = "" ;
      Z4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      n4606AlbRHEn = false ;
      A4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      n4606AlbRHEn = false ;
      Z49AlbRFen = GXutil.nullDate() ;
      A49AlbRFen = GXutil.nullDate() ;
      Z970ProceCod = (short)(0) ;
      n970ProceCod = false ;
      A970ProceCod = (short)(0) ;
      n970ProceCod = false ;
      Z840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      Z46AlbREnt = "" ;
      A46AlbREnt = "" ;
      Z3613AlbRefDsc = "" ;
      A3613AlbRefDsc = "" ;
      Z45AlbRef = "" ;
      A45AlbRef = "" ;
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z1291AlbRDes = "" ;
      A1291AlbRDes = "" ;
      E1291AlbRDes = "" ;
      i1291AlbRDes = "" ;
      Z4601AlbRTam = "" ;
      A4601AlbRTam = "" ;
      E4601AlbRTam = "" ;
      i4601AlbRTam = "" ;
      Z4602AlbRMdlCod = "" ;
      E4602AlbRMdlCod = "" ;
      i4602AlbRMdlCod = "" ;
      A4602AlbRMdlCod = "" ;
      Z50AlbRLoc = "" ;
      A50AlbRLoc = "" ;
      E50AlbRLoc = "" ;
      i50AlbRLoc = "" ;
      Z48AlbRFecUlt = GXutil.today( ) ;
      A48AlbRFecUlt = GXutil.today( ) ;
      i48AlbRFecUlt = GXutil.today( ) ;
      Z47AlbREst = (byte)(0) ;
      A47AlbREst = (byte)(0) ;
      Z56AlbRUni = httpContext.getMessage( "K", "") ;
      A56AlbRUni = httpContext.getMessage( "K", "") ;
      i56AlbRUni = httpContext.getMessage( "K", "") ;
   }

   private byte Z47AlbREst ;
   private byte Z1301AlbRUlin ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A47AlbREst ;
   private byte A1301AlbRUlin ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ1301AlbRUlin ;
   private byte ZZ47AlbREst ;
   private short wcpOA840TrnCod ;
   private short wcpOA970ProceCod ;
   private short Z1211TipEntCod ;
   private short Z1222AlbNumEti ;
   private short Z4295ClasCod ;
   private short A4295ClasCod ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1211TipEntCod ;
   private short A1222AlbNumEti ;
   private short Z840TrnCod ;
   private short Z970ProceCod ;
   private short RcdFound7 ;
   private short nIsDirty_7 ;
   private short ZZ1211TipEntCod ;
   private short ZZ1222AlbNumEti ;
   private short ZZ4295ClasCod ;
   private short ZZ840TrnCod ;
   private short ZZ970ProceCod ;
   private int wcpOA252CliCod ;
   private int wcpOAV56AlbRecIni ;
   private int wcpOAV57AlbRecFin ;
   private int Z44AlbRecCod ;
   private int Z52AlbRPieEnt ;
   private int Z54AlbRPieUti ;
   private int Z53AlbRPieReb ;
   private int Z4605AlbRPieLot ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int AV56AlbRecIni ;
   private int AV57AlbRecFin ;
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
   private int edtAlbRUlin_Enabled ;
   private int edtAlbRefDsc_Enabled ;
   private int edtAlbPmPPza_Enabled ;
   private int A4291AlbPzaEst ;
   private int edtAlbPzaEst_Enabled ;
   private int edtAlbRTam_Enabled ;
   private int edtAlbRMdlCod_Enabled ;
   private int edtAlbRMdlDsc_Enabled ;
   private int edtAlbRUniLot_Enabled ;
   private int A4605AlbRPieLot ;
   private int edtAlbRPieLot_Enabled ;
   private int edtAlbRHEn_Enabled ;
   private int edtClasCod_Enabled ;
   private int edtClasDsc_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GX_JID ;
   private int Z252CliCod ;
   private int idxLst ;
   private int edtClasDsc_Backcolor ;
   private int edtClasCod_Backcolor ;
   private int edtAlbRHEn_Backcolor ;
   private int edtAlbRPieLot_Backcolor ;
   private int edtAlbRUniLot_Backcolor ;
   private int edtAlbRMdlDsc_Backcolor ;
   private int edtAlbRMdlCod_Backcolor ;
   private int edtAlbRTam_Backcolor ;
   private int edtAlbPzaEst_Backcolor ;
   private int edtAlbPmPPza_Backcolor ;
   private int edtAlbRefDsc_Backcolor ;
   private int edtAlbRUlin_Backcolor ;
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
   private int GXv_int2[] ;
   private int Z51AlbRPieDis ;
   private int Z4291AlbPzaEst ;
   private int ZZ44AlbRecCod ;
   private int ZZ52AlbRPieEnt ;
   private int ZZ54AlbRPieUti ;
   private int ZZ53AlbRPieReb ;
   private int ZZ4605AlbRPieLot ;
   private int ZZ252CliCod ;
   private int ZZ51AlbRPieDis ;
   private int ZZ4291AlbPzaEst ;
   private java.math.BigDecimal Z4290AlbPmPPza ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal Z59AlbRUniReb ;
   private java.math.BigDecimal Z4604AlbRUniLot ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A59AlbRUniReb ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A4290AlbPmPPza ;
   private java.math.BigDecimal A4604AlbRUniLot ;
   private java.math.BigDecimal Z57AlbRUniDis ;
   private java.math.BigDecimal ZZ58AlbRUniEnt ;
   private java.math.BigDecimal ZZ60AlbRUniUti ;
   private java.math.BigDecimal ZZ59AlbRUniReb ;
   private java.math.BigDecimal ZZ4604AlbRUniLot ;
   private java.math.BigDecimal ZZ57AlbRUniDis ;
   private java.math.BigDecimal ZZ4290AlbPmPPza ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA45AlbRef ;
   private String wcpOA3613AlbRefDsc ;
   private String wcpOA46AlbREnt ;
   private String wcpOA55AlbRReo ;
   private String Z396EmprCod ;
   private String Z56AlbRUni ;
   private String Z50AlbRLoc ;
   private String Z1291AlbRDes ;
   private String Z4601AlbRTam ;
   private String Z4602AlbRMdlCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A45AlbRef ;
   private String A4602AlbRMdlCod ;
   private String A3613AlbRefDsc ;
   private String A46AlbREnt ;
   private String A55AlbRReo ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbRPieEnt_Internalname ;
   private String A56AlbRUni ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtAlbRef_Internalname ;
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
   private String edtAlbREnt_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
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
   private String edtAlbRUlin_Internalname ;
   private String edtAlbRUlin_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtAlbRefDsc_Internalname ;
   private String edtAlbRefDsc_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtAlbPmPPza_Internalname ;
   private String edtAlbPmPPza_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtAlbPzaEst_Internalname ;
   private String edtAlbPzaEst_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtAlbRTam_Internalname ;
   private String A4601AlbRTam ;
   private String edtAlbRTam_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtAlbRMdlCod_Internalname ;
   private String edtAlbRMdlCod_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtAlbRMdlDsc_Internalname ;
   private String A4603AlbRMdlDsc ;
   private String edtAlbRMdlDsc_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtAlbRUniLot_Internalname ;
   private String edtAlbRUniLot_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtAlbRPieLot_Internalname ;
   private String edtAlbRPieLot_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String edtAlbRHEn_Internalname ;
   private String edtAlbRHEn_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtClasCod_Internalname ;
   private String edtClasCod_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String edtClasDsc_Internalname ;
   private String A4296ClasDsc ;
   private String edtClasDsc_Jsonclick ;
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
   private String Gx_mode ;
   private String AV36Modo ;
   private String AV17UsurCod ;
   private String AV18AlbCum ;
   private String hsh ;
   private String hsh2 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z45AlbRef ;
   private String Z3613AlbRefDsc ;
   private String Z46AlbREnt ;
   private String Z55AlbRReo ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z841TrnNom ;
   private String Z971ProceNom ;
   private String Z4603AlbRMdlDsc ;
   private String Z4296ClasDsc ;
   private String edtAlbRPieDis_Inputmask ;
   private String edtAlbRPieUti_Inputmask ;
   private String edtAlbRPieEnt_Inputmask ;
   private String edtAlbRPieLot_Inputmask ;
   private String E50AlbRLoc ;
   private String E4602AlbRMdlCod ;
   private String E4601AlbRTam ;
   private String E1291AlbRDes ;
   private String sMode7 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String iV36Modo ;
   private String i56AlbRUni ;
   private String i50AlbRLoc ;
   private String i4602AlbRMdlCod ;
   private String i4601AlbRTam ;
   private String i1291AlbRDes ;
   private String GXv_char3[] ;
   private String GXv_char1[] ;
   private String Z1212TipEntNom ;
   private String ZV18AlbCum ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ841TrnNom ;
   private String ZZ56AlbRUni ;
   private String ZZ50AlbRLoc ;
   private String ZZ1212TipEntNom ;
   private String ZZ1291AlbRDes ;
   private String ZZ971ProceNom ;
   private String ZZ4601AlbRTam ;
   private String ZZ4602AlbRMdlCod ;
   private String ZZ45AlbRef ;
   private String ZZ3613AlbRefDsc ;
   private String ZZ46AlbREnt ;
   private String ZZ55AlbRReo ;
   private String ZZ4296ClasDsc ;
   private String ZZ4603AlbRMdlDsc ;
   private String ZZV18AlbCum ;
   private java.util.Date wcpOA4606AlbRHEn ;
   private java.util.Date A4606AlbRHEn ;
   private java.util.Date Z4606AlbRHEn ;
   private java.util.Date ZZ4606AlbRHEn ;
   private java.util.Date wcpOA49AlbRFen ;
   private java.util.Date Z48AlbRFecUlt ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date A48AlbRFecUlt ;
   private java.util.Date Z49AlbRFen ;
   private java.util.Date i48AlbRFecUlt ;
   private java.util.Date ZZ48AlbRFecUlt ;
   private java.util.Date ZZ49AlbRFen ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n44AlbRecCod ;
   private boolean n4295ClasCod ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean n4606AlbRHEn ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private boolean n1211TipEntCod ;
   private boolean n971ProceNom ;
   private boolean n4603AlbRMdlDsc ;
   private boolean n4604AlbRUniLot ;
   private boolean n4605AlbRPieLot ;
   private boolean n4296ClasDsc ;
   private boolean Gx_longc ;
   private String wcpOAV46Obs ;
   private String AV46Obs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexus.util.GXProperties forbiddenHiddens2 ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbAlbRReo ;
   private HTMLChoice cmbAlbREst ;
   private IDataStoreProvider pr_default ;
   private String[] T00LM4_A407EmprNom ;
   private boolean[] T00LM4_n407EmprNom ;
   private String[] T00LM5_A279CliNom ;
   private String[] T00LM6_A841TrnNom ;
   private boolean[] T00LM6_n841TrnNom ;
   private String[] T00LM7_A971ProceNom ;
   private boolean[] T00LM7_n971ProceNom ;
   private String[] T00LM9_A4603AlbRMdlDsc ;
   private boolean[] T00LM9_n4603AlbRMdlDsc ;
   private String[] T00LM10_A65ArtCod ;
   private String[] T00LM10_A4658MdlCod ;
   private int[] T00LM10_A252CliCod ;
   private String[] T00LM10_A45AlbRef ;
   private String[] T00LM10_A3613AlbRefDsc ;
   private String[] T00LM10_A46AlbREnt ;
   private short[] T00LM10_A840TrnCod ;
   private boolean[] T00LM10_n840TrnCod ;
   private short[] T00LM10_A970ProceCod ;
   private boolean[] T00LM10_n970ProceCod ;
   private java.util.Date[] T00LM10_A49AlbRFen ;
   private java.util.Date[] T00LM10_A4606AlbRHEn ;
   private boolean[] T00LM10_n4606AlbRHEn ;
   private String[] T00LM10_A55AlbRReo ;
   private int[] T00LM10_A44AlbRecCod ;
   private boolean[] T00LM10_n44AlbRecCod ;
   private byte[] T00LM10_A47AlbREst ;
   private java.math.BigDecimal[] T00LM10_A4290AlbPmPPza ;
   private String[] T00LM10_A407EmprNom ;
   private boolean[] T00LM10_n407EmprNom ;
   private String[] T00LM10_A279CliNom ;
   private String[] T00LM10_A841TrnNom ;
   private boolean[] T00LM10_n841TrnNom ;
   private int[] T00LM10_A52AlbRPieEnt ;
   private String[] T00LM10_A56AlbRUni ;
   private String[] T00LM10_A50AlbRLoc ;
   private java.math.BigDecimal[] T00LM10_A58AlbRUniEnt ;
   private int[] T00LM10_A54AlbRPieUti ;
   private int[] T00LM10_A53AlbRPieReb ;
   private java.math.BigDecimal[] T00LM10_A60AlbRUniUti ;
   private java.math.BigDecimal[] T00LM10_A59AlbRUniReb ;
   private java.util.Date[] T00LM10_A48AlbRFecUlt ;
   private short[] T00LM10_A1211TipEntCod ;
   private boolean[] T00LM10_n1211TipEntCod ;
   private short[] T00LM10_A1222AlbNumEti ;
   private String[] T00LM10_A1291AlbRDes ;
   private String[] T00LM10_A971ProceNom ;
   private boolean[] T00LM10_n971ProceNom ;
   private byte[] T00LM10_A1301AlbRUlin ;
   private String[] T00LM10_A4601AlbRTam ;
   private String[] T00LM10_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] T00LM10_A4604AlbRUniLot ;
   private boolean[] T00LM10_n4604AlbRUniLot ;
   private int[] T00LM10_A4605AlbRPieLot ;
   private boolean[] T00LM10_n4605AlbRPieLot ;
   private String[] T00LM10_A4296ClasDsc ;
   private boolean[] T00LM10_n4296ClasDsc ;
   private String[] T00LM10_A396EmprCod ;
   private short[] T00LM10_A4295ClasCod ;
   private boolean[] T00LM10_n4295ClasCod ;
   private String[] T00LM10_A4603AlbRMdlDsc ;
   private boolean[] T00LM10_n4603AlbRMdlDsc ;
   private String[] T00LM8_A4296ClasDsc ;
   private boolean[] T00LM8_n4296ClasDsc ;
   private String[] T00LM11_A4296ClasDsc ;
   private boolean[] T00LM11_n4296ClasDsc ;
   private String[] T00LM12_A4603AlbRMdlDsc ;
   private boolean[] T00LM12_n4603AlbRMdlDsc ;
   private String[] T00LM13_A396EmprCod ;
   private int[] T00LM13_A44AlbRecCod ;
   private boolean[] T00LM13_n44AlbRecCod ;
   private int[] T00LM3_A252CliCod ;
   private String[] T00LM3_A45AlbRef ;
   private String[] T00LM3_A3613AlbRefDsc ;
   private String[] T00LM3_A46AlbREnt ;
   private short[] T00LM3_A840TrnCod ;
   private boolean[] T00LM3_n840TrnCod ;
   private short[] T00LM3_A970ProceCod ;
   private boolean[] T00LM3_n970ProceCod ;
   private java.util.Date[] T00LM3_A49AlbRFen ;
   private java.util.Date[] T00LM3_A4606AlbRHEn ;
   private boolean[] T00LM3_n4606AlbRHEn ;
   private String[] T00LM3_A55AlbRReo ;
   private int[] T00LM3_A44AlbRecCod ;
   private boolean[] T00LM3_n44AlbRecCod ;
   private byte[] T00LM3_A47AlbREst ;
   private java.math.BigDecimal[] T00LM3_A4290AlbPmPPza ;
   private int[] T00LM3_A52AlbRPieEnt ;
   private String[] T00LM3_A56AlbRUni ;
   private String[] T00LM3_A50AlbRLoc ;
   private java.math.BigDecimal[] T00LM3_A58AlbRUniEnt ;
   private int[] T00LM3_A54AlbRPieUti ;
   private int[] T00LM3_A53AlbRPieReb ;
   private java.math.BigDecimal[] T00LM3_A60AlbRUniUti ;
   private java.math.BigDecimal[] T00LM3_A59AlbRUniReb ;
   private java.util.Date[] T00LM3_A48AlbRFecUlt ;
   private short[] T00LM3_A1211TipEntCod ;
   private boolean[] T00LM3_n1211TipEntCod ;
   private short[] T00LM3_A1222AlbNumEti ;
   private String[] T00LM3_A1291AlbRDes ;
   private byte[] T00LM3_A1301AlbRUlin ;
   private String[] T00LM3_A4601AlbRTam ;
   private String[] T00LM3_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] T00LM3_A4604AlbRUniLot ;
   private boolean[] T00LM3_n4604AlbRUniLot ;
   private int[] T00LM3_A4605AlbRPieLot ;
   private boolean[] T00LM3_n4605AlbRPieLot ;
   private String[] T00LM3_A396EmprCod ;
   private short[] T00LM3_A4295ClasCod ;
   private boolean[] T00LM3_n4295ClasCod ;
   private String[] T00LM14_A396EmprCod ;
   private int[] T00LM14_A44AlbRecCod ;
   private boolean[] T00LM14_n44AlbRecCod ;
   private int[] T00LM14_A252CliCod ;
   private String[] T00LM14_A45AlbRef ;
   private String[] T00LM14_A3613AlbRefDsc ;
   private String[] T00LM14_A46AlbREnt ;
   private short[] T00LM14_A840TrnCod ;
   private boolean[] T00LM14_n840TrnCod ;
   private short[] T00LM14_A970ProceCod ;
   private boolean[] T00LM14_n970ProceCod ;
   private java.util.Date[] T00LM14_A49AlbRFen ;
   private java.util.Date[] T00LM14_A4606AlbRHEn ;
   private boolean[] T00LM14_n4606AlbRHEn ;
   private String[] T00LM14_A55AlbRReo ;
   private String[] T00LM15_A396EmprCod ;
   private int[] T00LM15_A44AlbRecCod ;
   private boolean[] T00LM15_n44AlbRecCod ;
   private int[] T00LM15_A252CliCod ;
   private String[] T00LM15_A45AlbRef ;
   private String[] T00LM15_A3613AlbRefDsc ;
   private String[] T00LM15_A46AlbREnt ;
   private short[] T00LM15_A840TrnCod ;
   private boolean[] T00LM15_n840TrnCod ;
   private short[] T00LM15_A970ProceCod ;
   private boolean[] T00LM15_n970ProceCod ;
   private java.util.Date[] T00LM15_A49AlbRFen ;
   private java.util.Date[] T00LM15_A4606AlbRHEn ;
   private boolean[] T00LM15_n4606AlbRHEn ;
   private String[] T00LM15_A55AlbRReo ;
   private int[] T00LM2_A252CliCod ;
   private String[] T00LM2_A45AlbRef ;
   private String[] T00LM2_A3613AlbRefDsc ;
   private String[] T00LM2_A46AlbREnt ;
   private short[] T00LM2_A840TrnCod ;
   private boolean[] T00LM2_n840TrnCod ;
   private short[] T00LM2_A970ProceCod ;
   private boolean[] T00LM2_n970ProceCod ;
   private java.util.Date[] T00LM2_A49AlbRFen ;
   private java.util.Date[] T00LM2_A4606AlbRHEn ;
   private boolean[] T00LM2_n4606AlbRHEn ;
   private String[] T00LM2_A55AlbRReo ;
   private int[] T00LM2_A44AlbRecCod ;
   private boolean[] T00LM2_n44AlbRecCod ;
   private byte[] T00LM2_A47AlbREst ;
   private java.math.BigDecimal[] T00LM2_A4290AlbPmPPza ;
   private int[] T00LM2_A52AlbRPieEnt ;
   private String[] T00LM2_A56AlbRUni ;
   private String[] T00LM2_A50AlbRLoc ;
   private java.math.BigDecimal[] T00LM2_A58AlbRUniEnt ;
   private int[] T00LM2_A54AlbRPieUti ;
   private int[] T00LM2_A53AlbRPieReb ;
   private java.math.BigDecimal[] T00LM2_A60AlbRUniUti ;
   private java.math.BigDecimal[] T00LM2_A59AlbRUniReb ;
   private java.util.Date[] T00LM2_A48AlbRFecUlt ;
   private short[] T00LM2_A1211TipEntCod ;
   private boolean[] T00LM2_n1211TipEntCod ;
   private short[] T00LM2_A1222AlbNumEti ;
   private String[] T00LM2_A1291AlbRDes ;
   private byte[] T00LM2_A1301AlbRUlin ;
   private String[] T00LM2_A4601AlbRTam ;
   private String[] T00LM2_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] T00LM2_A4604AlbRUniLot ;
   private boolean[] T00LM2_n4604AlbRUniLot ;
   private int[] T00LM2_A4605AlbRPieLot ;
   private boolean[] T00LM2_n4605AlbRPieLot ;
   private String[] T00LM2_A396EmprCod ;
   private short[] T00LM2_A4295ClasCod ;
   private boolean[] T00LM2_n4295ClasCod ;
   private String[] T00LM19_A4603AlbRMdlDsc ;
   private boolean[] T00LM19_n4603AlbRMdlDsc ;
   private String[] T00LM20_A4296ClasDsc ;
   private boolean[] T00LM20_n4296ClasDsc ;
   private String[] T00LM21_A396EmprCod ;
   private int[] T00LM21_A13026PedDGId ;
   private int[] T00LM21_A44AlbRecCod ;
   private boolean[] T00LM21_n44AlbRecCod ;
   private String[] T00LM22_A396EmprCod ;
   private int[] T00LM22_A11669DevCruId ;
   private int[] T00LM22_A44AlbRecCod ;
   private boolean[] T00LM22_n44AlbRecCod ;
   private String[] T00LM23_A396EmprCod ;
   private int[] T00LM23_A44AlbRecCod ;
   private boolean[] T00LM23_n44AlbRecCod ;
   private String[] T00LM23_A9743Emp_CUb ;
   private short[] T00LM23_A5860Emp_Anp ;
   private String[] T00LM24_A396EmprCod ;
   private int[] T00LM24_A44AlbRecCod ;
   private boolean[] T00LM24_n44AlbRecCod ;
   private String[] T00LM24_A7130MatC_Pz ;
   private String[] T00LM25_A396EmprCod ;
   private int[] T00LM25_A44AlbRecCod ;
   private boolean[] T00LM25_n44AlbRecCod ;
   private String[] T00LM25_A7132MatC_Talla ;
   private String[] T00LM26_A396EmprCod ;
   private int[] T00LM26_A44AlbRecCod ;
   private boolean[] T00LM26_n44AlbRecCod ;
   private short[] T00LM26_A7115MatC_Lin ;
   private String[] T00LM27_A396EmprCod ;
   private long[] T00LM27_A30AlbProCod ;
   private int[] T00LM27_A129BarCod ;
   private byte[] T00LM27_A132BarCodReo ;
   private String[] T00LM27_A130BarCodPar ;
   private short[] T00LM27_A6622AlbHdRLn ;
   private String[] T00LM28_A396EmprCod ;
   private int[] T00LM28_A6235DevEmpCod ;
   private byte[] T00LM28_A6243DevNumLin ;
   private String[] T00LM29_A396EmprCod ;
   private int[] T00LM29_A44AlbRecCod ;
   private boolean[] T00LM29_n44AlbRecCod ;
   private short[] T00LM29_A4596AlbRDefCod ;
   private String[] T00LM30_A396EmprCod ;
   private int[] T00LM30_A44AlbRecCod ;
   private boolean[] T00LM30_n44AlbRecCod ;
   private String[] T00LM30_A2159AlbRecPie ;
   private String[] T00LM31_A396EmprCod ;
   private int[] T00LM31_A44AlbRecCod ;
   private boolean[] T00LM31_n44AlbRecCod ;
   private short[] T00LM31_A2165HisEmpLin ;
   private String[] T00LM32_A396EmprCod ;
   private int[] T00LM32_A44AlbRecCod ;
   private boolean[] T00LM32_n44AlbRecCod ;
   private byte[] T00LM32_A1299AlbRLin ;
   private String[] T00LM33_A396EmprCod ;
   private int[] T00LM33_A361DisCod ;
   private int[] T00LM33_A44AlbRecCod ;
   private boolean[] T00LM33_n44AlbRecCod ;
   private String[] T00LM34_A396EmprCod ;
   private int[] T00LM34_A323DevGenCod ;
   private String[] T00LM35_A396EmprCod ;
   private int[] T00LM35_A129BarCod ;
   private byte[] T00LM35_A132BarCodReo ;
   private String[] T00LM35_A130BarCodPar ;
   private String[] T00LM35_A200BarPieCod ;
   private String[] T00LM36_A396EmprCod ;
   private int[] T00LM36_A44AlbRecCod ;
   private boolean[] T00LM36_n44AlbRecCod ;
   private String[] T00LM37_A407EmprNom ;
   private boolean[] T00LM37_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class talbrel__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbrel__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbrel__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbrel__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbrel__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00LM2", "SELECT CliCod, AlbRef, AlbRefDsc, AlbREnt, TrnCod, ProceCod, AlbRFen, AlbRHEn, AlbRReo, AlbRecCod, AlbREst, AlbPmPPza, AlbRPieEnt, AlbRUni, AlbRLoc, AlbRUniEnt, AlbRPieUti, AlbRPieReb, AlbRUniUti, AlbRUniReb, AlbRFecUlt, TipEntCod, AlbNumEti, AlbRDes, AlbRUlin, AlbRTam, AlbRMdlCod, AlbRUniLot, AlbRPieLot, EmprCod, ClasCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF CliCod, AlbRef, AlbRefDsc, AlbREnt, TrnCod, ProceCod, AlbRFen, AlbRHEn, AlbRReo, AlbREst, AlbPmPPza, AlbRPieEnt, AlbRUni, AlbRLoc, AlbRUniEnt, AlbRPieUti, AlbRPieReb, AlbRUniUti, AlbRUniReb, AlbRFecUlt, TipEntCod, AlbNumEti, AlbRDes, AlbRUlin, AlbRTam, AlbRMdlCod, AlbRUniLot, AlbRPieLot, ClasCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LM3", "SELECT CliCod, AlbRef, AlbRefDsc, AlbREnt, TrnCod, ProceCod, AlbRFen, AlbRHEn, AlbRReo, AlbRecCod, AlbREst, AlbPmPPza, AlbRPieEnt, AlbRUni, AlbRLoc, AlbRUniEnt, AlbRPieUti, AlbRPieReb, AlbRUniUti, AlbRUniReb, AlbRFecUlt, TipEntCod, AlbNumEti, AlbRDes, AlbRUlin, AlbRTam, AlbRMdlCod, AlbRUniLot, AlbRPieLot, EmprCod, ClasCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LM4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LM5", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LM6", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LM7", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LM8", "SELECT ClasDsc FROM TXPCLAPEN WHERE EmprCod = ? AND ClasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LM9", "SELECT COALESCE( MdlDsc, 'No Existe Modelo.') AS AlbRMdlDsc FROM TXPModels WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND MdlCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LM10", "SELECT /*+ FIRST_ROWS(100) */ T6.ArtCod, T6.MdlCod, TM1.CliCod, TM1.AlbRef, TM1.AlbRefDsc, TM1.AlbREnt, TM1.TrnCod, TM1.ProceCod, TM1.AlbRFen, TM1.AlbRHEn, TM1.AlbRReo, TM1.AlbRecCod, TM1.AlbREst, TM1.AlbPmPPza, T2.EmprNom, T3.CliNom, T4.TrnNom, TM1.AlbRPieEnt, TM1.AlbRUni, TM1.AlbRLoc, TM1.AlbRUniEnt, TM1.AlbRPieUti, TM1.AlbRPieReb, TM1.AlbRUniUti, TM1.AlbRUniReb, TM1.AlbRFecUlt, TM1.TipEntCod, TM1.AlbNumEti, TM1.AlbRDes, T5.ProceNom, TM1.AlbRUlin, TM1.AlbRTam, TM1.AlbRMdlCod, TM1.AlbRUniLot, TM1.AlbRPieLot, T7.ClasDsc, TM1.EmprCod, TM1.ClasCod, COALESCE( T6.MdlDsc, 'No Existe Modelo.') AS AlbRMdlDsc FROM ((((((TXPALBREC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = TM1.EmprCod AND T4.TrnCod = TM1.TrnCod) LEFT JOIN TXPPROCED T5 ON T5.EmprCod = TM1.EmprCod AND T5.ProceCod = TM1.ProceCod) LEFT JOIN TXPModels T6 ON T6.EmprCod = TM1.EmprCod AND T6.CliCod = TM1.CliCod AND T6.ArtCod = TM1.AlbRef AND T6.MdlCod = TM1.AlbRMdlCod) LEFT JOIN TXPCLAPEN T7 ON T7.EmprCod = TM1.EmprCod AND T7.ClasCod = TM1.ClasCod) WHERE TM1.EmprCod = ? and TM1.AlbRecCod = ? and TM1.CliCod = ? and TM1.AlbRef = ? and TM1.AlbRefDsc = ? and TM1.AlbREnt = ? and TM1.TrnCod = ? and TM1.ProceCod = ? and TM1.AlbRFen = ? and TM1.AlbRHEn = ? and TM1.AlbRReo = ? ORDER BY TM1.EmprCod, TM1.AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LM11", "SELECT ClasDsc FROM TXPCLAPEN WHERE EmprCod = ? AND ClasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LM12", "SELECT COALESCE( MdlDsc, 'No Existe Modelo.') AS AlbRMdlDsc FROM TXPModels WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND MdlCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LM13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LM14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod, CliCod, AlbRef, AlbRefDsc, AlbREnt, TrnCod, ProceCod, AlbRFen, AlbRHEn, AlbRReo FROM TXPALBREC WHERE ( AlbRecCod > ?) and EmprCod = ? and CliCod = ? and AlbRef = ? and AlbRefDsc = ? and AlbREnt = ? and TrnCod = ? and ProceCod = ? and AlbRFen = ? and AlbRHEn = ? and AlbRReo = ? ORDER BY EmprCod, AlbRecCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LM15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod, CliCod, AlbRef, AlbRefDsc, AlbREnt, TrnCod, ProceCod, AlbRFen, AlbRHEn, AlbRReo FROM TXPALBREC WHERE ( AlbRecCod < ?) and EmprCod = ? and CliCod = ? and AlbRef = ? and AlbRefDsc = ? and AlbREnt = ? and TrnCod = ? and ProceCod = ? and AlbRFen = ? and AlbRHEn = ? and AlbRReo = ? ORDER BY EmprCod DESC, AlbRecCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00LM16", "INSERT INTO TXPALBREC(CliCod, AlbRef, AlbRefDsc, AlbREnt, TrnCod, ProceCod, AlbRFen, AlbRHEn, AlbRReo, AlbRecCod, AlbREst, AlbPmPPza, AlbRPieEnt, AlbRUni, AlbRLoc, AlbRUniEnt, AlbRPieUti, AlbRPieReb, AlbRUniUti, AlbRUniReb, AlbRFecUlt, TipEntCod, AlbNumEti, AlbRDes, AlbRUlin, AlbRTam, AlbRMdlCod, AlbRUniLot, AlbRPieLot, EmprCod, ClasCod, HisEmpULin, AlbRDisCli, AlbRImp, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbREnt2, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRTartC, AlbRLote, AlbRTelar, AlbRLu, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlmCod, MatC_ULin, AlbRecSec, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, Bod_UltPz, Emp_Item1, AlbPdaC, AlbOStj, AlbStLot, AlbTurno, AlbUltP, Cod_mta, AlbOEKOTEX, AlbRPh, AlbRRLong, AlbRRTrans, AlbRLot2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ')", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("T00LM17", "UPDATE TXPALBREC SET CliCod=?, AlbRef=?, AlbRefDsc=?, AlbREnt=?, TrnCod=?, ProceCod=?, AlbRFen=?, AlbRHEn=?, AlbRReo=?, AlbREst=?, AlbPmPPza=?, AlbRPieEnt=?, AlbRUni=?, AlbRLoc=?, AlbRUniEnt=?, AlbRPieUti=?, AlbRPieReb=?, AlbRUniUti=?, AlbRUniReb=?, AlbRFecUlt=?, TipEntCod=?, AlbNumEti=?, AlbRDes=?, AlbRUlin=?, AlbRTam=?, AlbRMdlCod=?, AlbRUniLot=?, AlbRPieLot=?, ClasCod=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("T00LM18", "DELETE FROM TXPALBREC  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T00LM19", "SELECT COALESCE( MdlDsc, 'No Existe Modelo.') AS AlbRMdlDsc FROM TXPModels WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND MdlCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LM20", "SELECT ClasDsc FROM TXPCLAPEN WHERE EmprCod = ? AND ClasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LM21", "SELECT * FROM (SELECT EmprCod, PedDGId, AlbRecCod FROM TXPPEDDG3 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LM22", "SELECT * FROM (SELECT EmprCod, DevCruId, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LM23", "SELECT * FROM (SELECT EmprCod, AlbRecCod, Emp_CUb, Emp_Anp FROM TXPUBIIN WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LM24", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Pz FROM TXPREPPZS WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LM25", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Talla FROM TXPREPTAL WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LM26", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Lin FROM TXPREPMAT WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LM27", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LM28", "SELECT * FROM (SELECT EmprCod, DevEmpCod, DevNumLin FROM TXPDEVEM1 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LM29", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRDefCod FROM TXPALBRDF WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LM30", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LM31", "SELECT * FROM (SELECT EmprCod, AlbRecCod, HisEmpLin FROM TXPHISEMP WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LM32", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRLin FROM TXPALBROB WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LM33", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LM34", "SELECT * FROM (SELECT EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LM35", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LM36", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? and CliCod = ? and AlbRef = ? and AlbRefDsc = ? and AlbREnt = ? and TrnCod = ? and ProceCod = ? and AlbRFen = ? and AlbRHEn = ? and AlbRReo = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LM37", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 2);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((byte[]) buf[13])[0] = rslt.getByte(11);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,3);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((String[]) buf[17])[0] = rslt.getString(15, 10);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,2);
               ((int[]) buf[19])[0] = rslt.getInt(17);
               ((int[]) buf[20])[0] = rslt.getInt(18);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(21);
               ((short[]) buf[24])[0] = rslt.getShort(22);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(23);
               ((String[]) buf[27])[0] = rslt.getString(24, 20);
               ((byte[]) buf[28])[0] = rslt.getByte(25);
               ((String[]) buf[29])[0] = rslt.getString(26, 4);
               ((String[]) buf[30])[0] = rslt.getString(27, 13);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((int[]) buf[33])[0] = rslt.getInt(29);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(30, 3);
               ((short[]) buf[36])[0] = rslt.getShort(31);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 2);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((byte[]) buf[13])[0] = rslt.getByte(11);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,3);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((String[]) buf[17])[0] = rslt.getString(15, 10);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,2);
               ((int[]) buf[19])[0] = rslt.getInt(17);
               ((int[]) buf[20])[0] = rslt.getInt(18);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(21);
               ((short[]) buf[24])[0] = rslt.getShort(22);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(23);
               ((String[]) buf[27])[0] = rslt.getString(24, 20);
               ((byte[]) buf[28])[0] = rslt.getByte(25);
               ((String[]) buf[29])[0] = rslt.getString(26, 4);
               ((String[]) buf[30])[0] = rslt.getString(27, 13);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((int[]) buf[33])[0] = rslt.getInt(29);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(30, 3);
               ((short[]) buf[36])[0] = rslt.getShort(31);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 2);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((byte[]) buf[15])[0] = rslt.getByte(13);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,3);
               ((String[]) buf[17])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((String[]) buf[20])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(18);
               ((String[]) buf[23])[0] = rslt.getString(19, 1);
               ((String[]) buf[24])[0] = rslt.getString(20, 10);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[26])[0] = rslt.getInt(22);
               ((int[]) buf[27])[0] = rslt.getInt(23);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(25,2);
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(26);
               ((short[]) buf[31])[0] = rslt.getShort(27);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(28);
               ((String[]) buf[34])[0] = rslt.getString(29, 20);
               ((String[]) buf[35])[0] = rslt.getString(30, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(31);
               ((String[]) buf[38])[0] = rslt.getString(32, 4);
               ((String[]) buf[39])[0] = rslt.getString(33, 13);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((int[]) buf[42])[0] = rslt.getInt(35);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(36, 40);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(37, 3);
               ((short[]) buf[47])[0] = rslt.getShort(38);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(39, 40);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 35 :
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
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
            case 5 :
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
            case 6 :
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
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 26);
               stmt.setString(6, (String)parms[6], 8);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[10]).shortValue());
               }
               stmt.setDate(9, (java.util.Date)parms[11]);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[13], false);
               }
               stmt.setString(11, (String)parms[14], 2);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 26);
               stmt.setString(6, (String)parms[6], 8);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[10]).shortValue());
               }
               stmt.setDate(9, (java.util.Date)parms[11]);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[13], false);
               }
               stmt.setString(11, (String)parms[14], 2);
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 26);
               stmt.setString(6, (String)parms[6], 8);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[10]).shortValue());
               }
               stmt.setDate(9, (java.util.Date)parms[11]);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[13], false);
               }
               stmt.setString(11, (String)parms[14], 2);
               return;
            case 14 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setString(4, (String)parms[3], 8);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[7]).shortValue());
               }
               stmt.setDate(7, (java.util.Date)parms[8]);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[10], false);
               }
               stmt.setString(9, (String)parms[11], 2);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[13]).intValue());
               }
               stmt.setByte(11, ((Number) parms[14]).byteValue());
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[15], 3);
               stmt.setInt(13, ((Number) parms[16]).intValue());
               stmt.setString(14, (String)parms[17], 1);
               stmt.setString(15, (String)parms[18], 10);
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[19], 2);
               stmt.setInt(17, ((Number) parms[20]).intValue());
               stmt.setInt(18, ((Number) parms[21]).intValue());
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[22], 2);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[23], 2);
               stmt.setDate(21, (java.util.Date)parms[24]);
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[26]).shortValue());
               }
               stmt.setShort(23, ((Number) parms[27]).shortValue());
               stmt.setString(24, (String)parms[28], 20);
               stmt.setByte(25, ((Number) parms[29]).byteValue());
               stmt.setString(26, (String)parms[30], 4);
               stmt.setString(27, (String)parms[31], 13);
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(29, ((Number) parms[35]).intValue());
               }
               stmt.setString(30, (String)parms[36], 3);
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[38]).shortValue());
               }
               return;
            case 15 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setString(4, (String)parms[3], 8);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[7]).shortValue());
               }
               stmt.setDate(7, (java.util.Date)parms[8]);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[10], false);
               }
               stmt.setString(9, (String)parms[11], 2);
               stmt.setByte(10, ((Number) parms[12]).byteValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[13], 3);
               stmt.setInt(12, ((Number) parms[14]).intValue());
               stmt.setString(13, (String)parms[15], 1);
               stmt.setString(14, (String)parms[16], 10);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[17], 2);
               stmt.setInt(16, ((Number) parms[18]).intValue());
               stmt.setInt(17, ((Number) parms[19]).intValue());
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[20], 2);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[21], 2);
               stmt.setDate(20, (java.util.Date)parms[22]);
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[24]).shortValue());
               }
               stmt.setShort(22, ((Number) parms[25]).shortValue());
               stmt.setString(23, (String)parms[26], 20);
               stmt.setByte(24, ((Number) parms[27]).byteValue());
               stmt.setString(25, (String)parms[28], 4);
               stmt.setString(26, (String)parms[29], 13);
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(28, ((Number) parms[33]).intValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[35]).shortValue());
               }
               stmt.setString(30, (String)parms[36], 3);
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(31, ((Number) parms[38]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 18 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 26);
               stmt.setString(5, (String)parms[4], 8);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[8]).shortValue());
               }
               stmt.setDate(8, (java.util.Date)parms[9]);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[11], false);
               }
               stmt.setString(10, (String)parms[12], 2);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

