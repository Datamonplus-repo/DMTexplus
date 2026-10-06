package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmqddln_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action7") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV33Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
         AV8UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
         AV12Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
         AV32Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Inc_obs", AV32Inc_obs);
         A10118Mq_Cont = CommonUtil.decimalVal( httpContext.GetPar( "Mq_Cont"), ".") ;
         n10118Mq_Cont = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10118Mq_Cont", GXutil.ltrimstr( A10118Mq_Cont, 10, 2));
         A10179Mq_Contf = CommonUtil.decimalVal( httpContext.GetPar( "Mq_Contf"), ".") ;
         n10179Mq_Contf = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10179Mq_Contf", GXutil.ltrimstr( A10179Mq_Contf, 10, 2));
         A10115Mq_Di = localUtil.parseDTimeParm( httpContext.GetPar( "Mq_Di")) ;
         n10115Mq_Di = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10115Mq_Di", localUtil.ttoc( A10115Mq_Di, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10116Mq_Df = localUtil.parseDTimeParm( httpContext.GetPar( "Mq_Df")) ;
         n10116Mq_Df = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10116Mq_Df", localUtil.ttoc( A10116Mq_Df, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_7_17G1371( Gx_mode, A396EmprCod, AV33Pgmname, AV8UsurCod, AV12Station, AV32Inc_obs, A10118Mq_Cont, A10179Mq_Contf, A10115Mq_Di, A10116Mq_Df) ;
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
            A602MaqCod = httpContext.GetPar( "MaqCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A10111Mq_Dia = localUtil.parseDateParm( httpContext.GetPar( "Mq_Dia")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10111Mq_Dia", localUtil.format(A10111Mq_Dia, "99/99/99"));
            A10112Mq_Op = (int)(GXutil.lval( httpContext.GetPar( "Mq_Op"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10112Mq_Op", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10112Mq_Op), 6, 0));
            A10114Mq_Ln = (int)(GXutil.lval( httpContext.GetPar( "Mq_Ln"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10114Mq_Ln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10114Mq_Ln), 6, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CONTROL ACREDITACION LINEA", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMq_Di_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tmqddln_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmqddln_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmqddln_impl.class ));
   }

   public tmqddln_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMQDDLN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMQDDLN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMQDDLN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMQDDLN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMQDDLN.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMQDDLN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMQDDLN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Código Máquina", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMQDDLN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMQDDLN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Dia IN Seccion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMQDDLN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtMq_Dia_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMq_Dia_Internalname, localUtil.format(A10111Mq_Dia, "99/99/99"), localUtil.format( A10111Mq_Dia, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMq_Dia_Jsonclick, 0, "", "", "", "", "", 1, edtMq_Dia_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMQDDLN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMq_Dia_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMq_Dia_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMQDDLN.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Operario IN Seccion", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMQDDLN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMq_Op_Internalname, GXutil.ltrim( localUtil.ntoc( A10112Mq_Op, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMq_Op_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10112Mq_Op), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10112Mq_Op), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMq_Op_Jsonclick, 0, "", "", "", "", "", 1, edtMq_Op_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMQDDLN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMQDDLN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMQDDLN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Linea", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMQDDLN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMq_Ln_Internalname, GXutil.ltrim( localUtil.ntoc( A10114Mq_Ln, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMq_Ln_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10114Mq_Ln), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10114Mq_Ln), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMq_Ln_Jsonclick, 0, "", "", "", "", "", 1, edtMq_Ln_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMQDDLN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMQDDLN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Dia Inicio In Seccion", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMQDDLN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMq_Di_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMq_Di_Internalname, localUtil.ttoc( A10115Mq_Di, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10115Mq_Di, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMq_Di_Jsonclick, 0, "", "", "", "", "", 1, edtMq_Di_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMQDDLN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMq_Di_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMq_Di_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMQDDLN.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Dia Fin IN Seccion", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMQDDLN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMq_Df_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMq_Df_Internalname, localUtil.ttoc( A10116Mq_Df, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10116Mq_Df, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMq_Df_Jsonclick, 0, "", "", "", "", "", 1, edtMq_Df_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMQDDLN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMq_Df_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMq_Df_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMQDDLN.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMQDDLN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMq_Est_Internalname, GXutil.ltrim( localUtil.ntoc( A10117Mq_Est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMq_Est_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10117Mq_Est), "9") : localUtil.format( DecimalUtil.doubleToDec(A10117Mq_Est), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMq_Est_Jsonclick, 0, "", "", "", "", "", 1, edtMq_Est_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMQDDLN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Contador HMM TIBL", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMQDDLN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMq_Cont_Internalname, GXutil.ltrim( localUtil.ntoc( A10118Mq_Cont, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMq_Cont_Enabled!=0) ? localUtil.format( A10118Mq_Cont, "ZZZZZZ9.99") : localUtil.format( A10118Mq_Cont, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMq_Cont_Jsonclick, 0, "", "", "", "", "", 1, edtMq_Cont_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMQDDLN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Contador HMM TIBL Final", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMQDDLN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMq_Contf_Internalname, GXutil.ltrim( localUtil.ntoc( A10179Mq_Contf, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMq_Contf_Enabled!=0) ? localUtil.format( A10179Mq_Contf, "ZZZZZZ9.99") : localUtil.format( A10179Mq_Contf, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMq_Contf_Jsonclick, 0, "", "", "", "", "", 1, edtMq_Contf_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMQDDLN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMQDDLN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMQDDLN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMQDDLN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMQDDLN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TMQDDLN.htm");
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
      e1117G2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z602MaqCod = httpContext.cgiGet( "Z602MaqCod") ;
            Z10111Mq_Dia = localUtil.ctod( httpContext.cgiGet( "Z10111Mq_Dia"), 0) ;
            Z10112Mq_Op = (int)(localUtil.ctol( httpContext.cgiGet( "Z10112Mq_Op"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10114Mq_Ln = (int)(localUtil.ctol( httpContext.cgiGet( "Z10114Mq_Ln"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10117Mq_Est = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10117Mq_Est"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10115Mq_Di = localUtil.ctot( httpContext.cgiGet( "Z10115Mq_Di"), 0) ;
            Z10116Mq_Df = localUtil.ctot( httpContext.cgiGet( "Z10116Mq_Df"), 0) ;
            Z10118Mq_Cont = localUtil.ctond( httpContext.cgiGet( "Z10118Mq_Cont")) ;
            Z10179Mq_Contf = localUtil.ctond( httpContext.cgiGet( "Z10179Mq_Contf")) ;
            O10116Mq_Df = localUtil.ctot( httpContext.cgiGet( "O10116Mq_Df"), 0) ;
            O10115Mq_Di = localUtil.ctot( httpContext.cgiGet( "O10115Mq_Di"), 0) ;
            O10179Mq_Contf = localUtil.ctond( httpContext.cgiGet( "O10179Mq_Contf")) ;
            O10118Mq_Cont = localUtil.ctond( httpContext.cgiGet( "O10118Mq_Cont")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV32Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV12Station = httpContext.cgiGet( "vSTATION") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A10111Mq_Dia = localUtil.ctod( httpContext.cgiGet( edtMq_Dia_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10111Mq_Dia", localUtil.format(A10111Mq_Dia, "99/99/99"));
            A10112Mq_Op = (int)(localUtil.ctol( httpContext.cgiGet( edtMq_Op_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10112Mq_Op", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10112Mq_Op), 6, 0));
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A10114Mq_Ln = (int)(localUtil.ctol( httpContext.cgiGet( edtMq_Ln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10114Mq_Ln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10114Mq_Ln), 6, 0));
            if ( localUtil.vcdtime( httpContext.cgiGet( edtMq_Di_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "MQ_DI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMq_Di_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10115Mq_Di = GXutil.resetTime( GXutil.nullDate() );
               n10115Mq_Di = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10115Mq_Di", localUtil.ttoc( A10115Mq_Di, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A10115Mq_Di = localUtil.ctot( httpContext.cgiGet( edtMq_Di_Internalname)) ;
               n10115Mq_Di = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10115Mq_Di", localUtil.ttoc( A10115Mq_Di, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtMq_Df_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "MQ_DF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMq_Df_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10116Mq_Df = GXutil.resetTime( GXutil.nullDate() );
               n10116Mq_Df = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10116Mq_Df", localUtil.ttoc( A10116Mq_Df, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A10116Mq_Df = localUtil.ctot( httpContext.cgiGet( edtMq_Df_Internalname)) ;
               n10116Mq_Df = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10116Mq_Df", localUtil.ttoc( A10116Mq_Df, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            A10117Mq_Est = (byte)(localUtil.ctol( httpContext.cgiGet( edtMq_Est_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10117Mq_Est = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10117Mq_Est", GXutil.str( A10117Mq_Est, 1, 0));
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMq_Cont_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMq_Cont_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MQ_CONT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMq_Cont_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10118Mq_Cont = DecimalUtil.ZERO ;
               n10118Mq_Cont = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10118Mq_Cont", GXutil.ltrimstr( A10118Mq_Cont, 10, 2));
            }
            else
            {
               A10118Mq_Cont = localUtil.ctond( httpContext.cgiGet( edtMq_Cont_Internalname)) ;
               n10118Mq_Cont = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10118Mq_Cont", GXutil.ltrimstr( A10118Mq_Cont, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMq_Contf_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMq_Contf_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MQ_CONTF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMq_Contf_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10179Mq_Contf = DecimalUtil.ZERO ;
               n10179Mq_Contf = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10179Mq_Contf", GXutil.ltrimstr( A10179Mq_Contf, 10, 2));
            }
            else
            {
               A10179Mq_Contf = localUtil.ctond( httpContext.cgiGet( edtMq_Contf_Internalname)) ;
               n10179Mq_Contf = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10179Mq_Contf", GXutil.ltrimstr( A10179Mq_Contf, 10, 2));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
               A602MaqCod = httpContext.GetPar( "MaqCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
               A10111Mq_Dia = localUtil.parseDateParm( httpContext.GetPar( "Mq_Dia")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10111Mq_Dia", localUtil.format(A10111Mq_Dia, "99/99/99"));
               A10112Mq_Op = (int)(GXutil.lval( httpContext.GetPar( "Mq_Op"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10112Mq_Op", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10112Mq_Op), 6, 0));
               A10114Mq_Ln = (int)(GXutil.lval( httpContext.GetPar( "Mq_Ln"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10114Mq_Ln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10114Mq_Ln), 6, 0));
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
                        e1117G2 ();
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
            initAll17G1371( ) ;
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
      disableAttributes17G1371( ) ;
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

   public void confirm_17G0( )
   {
      beforeValidate17G1371( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls17G1371( ) ;
         }
         else
         {
            checkExtendedTable17G1371( ) ;
            if ( AnyError == 0 )
            {
               zm17G1371( 9) ;
               zm17G1371( 10) ;
            }
            closeExtendedTableCursors17G1371( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues17G0( ) ;
      }
   }

   public void resetCaption17G0( )
   {
   }

   public void e1117G2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmqddln_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tmqddln_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmqddln_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV14Lit2 = httpContext.getMessage( "Maquina", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      AV15Lit3 = httpContext.getMessage( "Operario", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      AV16Lit4 = httpContext.getMessage( "Dia", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmqddln_impl.this.A396EmprCod = GXv_char2[0] ;
      tmqddln_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmqddln_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm17G1371( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10117Mq_Est = T017G3_A10117Mq_Est[0] ;
            Z10115Mq_Di = T017G3_A10115Mq_Di[0] ;
            Z10116Mq_Df = T017G3_A10116Mq_Df[0] ;
            Z10118Mq_Cont = T017G3_A10118Mq_Cont[0] ;
            Z10179Mq_Contf = T017G3_A10179Mq_Contf[0] ;
         }
         else
         {
            Z10117Mq_Est = A10117Mq_Est ;
            Z10115Mq_Di = A10115Mq_Di ;
            Z10116Mq_Df = A10116Mq_Df ;
            Z10118Mq_Cont = A10118Mq_Cont ;
            Z10179Mq_Contf = A10179Mq_Contf ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z10114Mq_Ln = A10114Mq_Ln ;
         Z10117Mq_Est = A10117Mq_Est ;
         Z10115Mq_Di = A10115Mq_Di ;
         Z10116Mq_Df = A10116Mq_Df ;
         Z10118Mq_Cont = A10118Mq_Cont ;
         Z10179Mq_Contf = A10179Mq_Contf ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z10111Mq_Dia = A10111Mq_Dia ;
         Z10112Mq_Op = A10112Mq_Op ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtMq_Est_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Est_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Est_Enabled), 5, 0), true);
      AV33Pgmname = "TMQDDLN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      edtMq_Est_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Est_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Est_Enabled), 5, 0), true);
      /* Using cursor T017G4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017G4_A407EmprNom[0] ;
      n407EmprNom = T017G4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T017G5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MQDDOP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MQ_OP");
         AnyError = (short)(1) ;
      }
      pr_default.close(3);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Registro Eliminado.¡¡¡", ""), 1, "");
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

   public void load17G1371( )
   {
      /* Using cursor T017G6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op), Integer.valueOf(A10114Mq_Ln)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1371 = (short)(1) ;
         A10117Mq_Est = T017G6_A10117Mq_Est[0] ;
         n10117Mq_Est = T017G6_n10117Mq_Est[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10117Mq_Est", GXutil.str( A10117Mq_Est, 1, 0));
         A407EmprNom = T017G6_A407EmprNom[0] ;
         n407EmprNom = T017G6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10115Mq_Di = T017G6_A10115Mq_Di[0] ;
         n10115Mq_Di = T017G6_n10115Mq_Di[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10115Mq_Di", localUtil.ttoc( A10115Mq_Di, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10116Mq_Df = T017G6_A10116Mq_Df[0] ;
         n10116Mq_Df = T017G6_n10116Mq_Df[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10116Mq_Df", localUtil.ttoc( A10116Mq_Df, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10118Mq_Cont = T017G6_A10118Mq_Cont[0] ;
         n10118Mq_Cont = T017G6_n10118Mq_Cont[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10118Mq_Cont", GXutil.ltrimstr( A10118Mq_Cont, 10, 2));
         A10179Mq_Contf = T017G6_A10179Mq_Contf[0] ;
         n10179Mq_Contf = T017G6_n10179Mq_Contf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10179Mq_Contf", GXutil.ltrimstr( A10179Mq_Contf, 10, 2));
         zm17G1371( -8) ;
      }
      pr_default.close(4);
      onLoadActions17G1371( ) ;
   }

   public void onLoadActions17G1371( )
   {
      if ( ( ( DecimalUtil.compareTo(O10118Mq_Cont, A10118Mq_Cont) != 0 ) ) || ( ( DecimalUtil.compareTo(A10179Mq_Contf, O10179Mq_Contf) != 0 ) ) || ( !( GXutil.dateCompare(O10115Mq_Di, A10115Mq_Di) ) ) || ( !( GXutil.dateCompare(O10116Mq_Df, A10116Mq_Df) ) ) && isUpd( )  )
      {
         AV32Inc_obs = httpContext.getMessage( httpContext.getMessage( "Cambio datos ", ""), "") + httpContext.getMessage( httpContext.getMessage( "Valores Iniciales ", ""), "") + localUtil.ttoc( O10115Mq_Di, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + " " + localUtil.ttoc( O10116Mq_Df, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + " " + GXutil.str( O10118Mq_Cont, 10, 2) + " " + GXutil.str( O10179Mq_Contf, 10, 2) + httpContext.getMessage( httpContext.getMessage( " Valores Finales ", ""), "") + localUtil.ttoc( (A10115Mq_Di), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + " " + localUtil.ttoc( (A10116Mq_Df), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + " " + (GXutil.str( A10118Mq_Cont, 10, 2)) + " " + (GXutil.str( A10179Mq_Contf, 10, 2)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Inc_obs", AV32Inc_obs);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), A10116Mq_Df) && isUpd( )  )
      {
         A10117Mq_Est = (byte)(2) ;
         n10117Mq_Est = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10117Mq_Est", GXutil.str( A10117Mq_Est, 1, 0));
      }
   }

   public void checkExtendedTable17G1371( )
   {
      nIsDirty_1371 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ( ( DecimalUtil.compareTo(O10118Mq_Cont, A10118Mq_Cont) != 0 ) ) || ( ( DecimalUtil.compareTo(A10179Mq_Contf, O10179Mq_Contf) != 0 ) ) || ( !( GXutil.dateCompare(O10115Mq_Di, A10115Mq_Di) ) ) || ( !( GXutil.dateCompare(O10116Mq_Df, A10116Mq_Df) ) ) && isUpd( )  )
      {
         AV32Inc_obs = httpContext.getMessage( httpContext.getMessage( "Cambio datos ", ""), "") + httpContext.getMessage( httpContext.getMessage( "Valores Iniciales ", ""), "") + localUtil.ttoc( O10115Mq_Di, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + " " + localUtil.ttoc( O10116Mq_Df, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + " " + GXutil.str( O10118Mq_Cont, 10, 2) + " " + GXutil.str( O10179Mq_Contf, 10, 2) + httpContext.getMessage( httpContext.getMessage( " Valores Finales ", ""), "") + localUtil.ttoc( (A10115Mq_Di), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + " " + localUtil.ttoc( (A10116Mq_Df), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + " " + (GXutil.str( A10118Mq_Cont, 10, 2)) + " " + (GXutil.str( A10179Mq_Contf, 10, 2)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Inc_obs", AV32Inc_obs);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), A10116Mq_Df) && isUpd( )  )
      {
         nIsDirty_1371 = (short)(1) ;
         A10117Mq_Est = (byte)(2) ;
         n10117Mq_Est = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10117Mq_Est", GXutil.str( A10117Mq_Est, 1, 0));
      }
      if ( ( ( DecimalUtil.compareTo(O10118Mq_Cont, A10118Mq_Cont) != 0 ) ) || ( ( DecimalUtil.compareTo(A10179Mq_Contf, O10179Mq_Contf) != 0 ) ) || ( !( GXutil.dateCompare(O10115Mq_Di, A10115Mq_Di) ) ) || ( !( GXutil.dateCompare(O10116Mq_Df, A10116Mq_Df) ) ) && isUpd( )  )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV33Pgmname, AV8UsurCod, AV12Station, AV32Inc_obs, 99999999, (byte)(0), " ") ;
      }
   }

   public void closeExtendedTableCursors17G1371( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey17G1371( )
   {
      /* Using cursor T017G7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op), Integer.valueOf(A10114Mq_Ln)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1371 = (short)(1) ;
      }
      else
      {
         RcdFound1371 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T017G3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op), Integer.valueOf(A10114Mq_Ln)});
      if ( (pr_default.getStatus(1) != 101) && ( T017G3_A10114Mq_Ln[0] == A10114Mq_Ln ) && ( GXutil.strcmp(T017G3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T017G3_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T017G3_A10111Mq_Dia[0]), GXutil.resetTime(A10111Mq_Dia)) && ( T017G3_A10112Mq_Op[0] == A10112Mq_Op ) )
      {
         zm17G1371( 8) ;
         RcdFound1371 = (short)(1) ;
         A10117Mq_Est = T017G3_A10117Mq_Est[0] ;
         n10117Mq_Est = T017G3_n10117Mq_Est[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10117Mq_Est", GXutil.str( A10117Mq_Est, 1, 0));
         A10115Mq_Di = T017G3_A10115Mq_Di[0] ;
         n10115Mq_Di = T017G3_n10115Mq_Di[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10115Mq_Di", localUtil.ttoc( A10115Mq_Di, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10116Mq_Df = T017G3_A10116Mq_Df[0] ;
         n10116Mq_Df = T017G3_n10116Mq_Df[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10116Mq_Df", localUtil.ttoc( A10116Mq_Df, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10118Mq_Cont = T017G3_A10118Mq_Cont[0] ;
         n10118Mq_Cont = T017G3_n10118Mq_Cont[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10118Mq_Cont", GXutil.ltrimstr( A10118Mq_Cont, 10, 2));
         A10179Mq_Contf = T017G3_A10179Mq_Contf[0] ;
         n10179Mq_Contf = T017G3_n10179Mq_Contf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10179Mq_Contf", GXutil.ltrimstr( A10179Mq_Contf, 10, 2));
         O10116Mq_Df = A10116Mq_Df ;
         n10116Mq_Df = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10116Mq_Df", localUtil.ttoc( A10116Mq_Df, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         O10115Mq_Di = A10115Mq_Di ;
         n10115Mq_Di = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10115Mq_Di", localUtil.ttoc( A10115Mq_Di, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         O10179Mq_Contf = A10179Mq_Contf ;
         n10179Mq_Contf = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10179Mq_Contf", GXutil.ltrimstr( A10179Mq_Contf, 10, 2));
         O10118Mq_Cont = A10118Mq_Cont ;
         n10118Mq_Cont = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10118Mq_Cont", GXutil.ltrimstr( A10118Mq_Cont, 10, 2));
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z10111Mq_Dia = A10111Mq_Dia ;
         Z10112Mq_Op = A10112Mq_Op ;
         Z10114Mq_Ln = A10114Mq_Ln ;
         sMode1371 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load17G1371( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1371 = (short)(0) ;
            initializeNonKey17G1371( ) ;
         }
         Gx_mode = sMode1371 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1371 = (short)(0) ;
         initializeNonKey17G1371( ) ;
         sMode1371 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1371 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey17G1371( ) ;
      if ( RcdFound1371 == 0 )
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
      RcdFound1371 = (short)(0) ;
      /* Using cursor T017G8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op), Integer.valueOf(A10114Mq_Ln)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(T017G8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T017G8_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T017G8_A10111Mq_Dia[0]), GXutil.resetTime(A10111Mq_Dia)) && ( T017G8_A10112Mq_Op[0] == A10112Mq_Op ) && ( T017G8_A10114Mq_Ln[0] == A10114Mq_Ln ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(T017G8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T017G8_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T017G8_A10111Mq_Dia[0]), GXutil.resetTime(A10111Mq_Dia)) && ( T017G8_A10112Mq_Op[0] == A10112Mq_Op ) && ( T017G8_A10114Mq_Ln[0] == A10114Mq_Ln ) )
         {
            RcdFound1371 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1371 = (short)(0) ;
      /* Using cursor T017G9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op), Integer.valueOf(A10114Mq_Ln)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T017G9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T017G9_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T017G9_A10111Mq_Dia[0]), GXutil.resetTime(A10111Mq_Dia)) && ( T017G9_A10112Mq_Op[0] == A10112Mq_Op ) && ( T017G9_A10114Mq_Ln[0] == A10114Mq_Ln ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T017G9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T017G9_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T017G9_A10111Mq_Dia[0]), GXutil.resetTime(A10111Mq_Dia)) && ( T017G9_A10112Mq_Op[0] == A10112Mq_Op ) && ( T017G9_A10114Mq_Ln[0] == A10114Mq_Ln ) )
         {
            RcdFound1371 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey17G1371( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMq_Di_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert17G1371( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1371 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10111Mq_Dia), GXutil.resetTime(Z10111Mq_Dia)) ) || ( A10112Mq_Op != Z10112Mq_Op ) || ( A10114Mq_Ln != Z10114Mq_Ln ) )
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
               GX_FocusControl = edtMq_Di_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update17G1371( ) ;
               GX_FocusControl = edtMq_Di_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10111Mq_Dia), GXutil.resetTime(Z10111Mq_Dia)) ) || ( A10112Mq_Op != Z10112Mq_Op ) || ( A10114Mq_Ln != Z10114Mq_Ln ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMq_Di_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert17G1371( ) ;
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
                  GX_FocusControl = edtMq_Di_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert17G1371( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10111Mq_Dia), GXutil.resetTime(Z10111Mq_Dia)) ) || ( A10112Mq_Op != Z10112Mq_Op ) || ( A10114Mq_Ln != Z10114Mq_Ln ) )
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
         GX_FocusControl = edtMq_Di_Internalname ;
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
      getKey17G1371( ) ;
      if ( RcdFound1371 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10111Mq_Dia), GXutil.resetTime(Z10111Mq_Dia)) ) || ( A10112Mq_Op != Z10112Mq_Op ) || ( A10114Mq_Ln != Z10114Mq_Ln ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10111Mq_Dia), GXutil.resetTime(Z10111Mq_Dia)) ) || ( A10112Mq_Op != Z10112Mq_Op ) || ( A10114Mq_Ln != Z10114Mq_Ln ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmqddln");
      GX_FocusControl = edtMq_Di_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_17G0( ) ;
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
      if ( RcdFound1371 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMq_Di_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart17G1371( ) ;
      if ( RcdFound1371 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMq_Di_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd17G1371( ) ;
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
      if ( RcdFound1371 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMq_Di_Internalname ;
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
      if ( RcdFound1371 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMq_Di_Internalname ;
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
      scanStart17G1371( ) ;
      if ( RcdFound1371 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1371 != 0 )
         {
            scanNext17G1371( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMq_Di_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd17G1371( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency17G1371( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T017G2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op), Integer.valueOf(A10114Mq_Ln)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMQDDO1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z10117Mq_Est != T017G2_A10117Mq_Est[0] ) || !( GXutil.dateCompare(Z10115Mq_Di, T017G2_A10115Mq_Di[0]) ) || !( GXutil.dateCompare(Z10116Mq_Df, T017G2_A10116Mq_Df[0]) ) || ( DecimalUtil.compareTo(Z10118Mq_Cont, T017G2_A10118Mq_Cont[0]) != 0 ) || ( DecimalUtil.compareTo(Z10179Mq_Contf, T017G2_A10179Mq_Contf[0]) != 0 ) )
         {
            if ( Z10117Mq_Est != T017G2_A10117Mq_Est[0] )
            {
               GXutil.writeLogln("tmqddln:[seudo value changed for attri]"+"Mq_Est");
               GXutil.writeLogRaw("Old: ",Z10117Mq_Est);
               GXutil.writeLogRaw("Current: ",T017G2_A10117Mq_Est[0]);
            }
            if ( !( GXutil.dateCompare(Z10115Mq_Di, T017G2_A10115Mq_Di[0]) ) )
            {
               GXutil.writeLogln("tmqddln:[seudo value changed for attri]"+"Mq_Di");
               GXutil.writeLogRaw("Old: ",Z10115Mq_Di);
               GXutil.writeLogRaw("Current: ",T017G2_A10115Mq_Di[0]);
            }
            if ( !( GXutil.dateCompare(Z10116Mq_Df, T017G2_A10116Mq_Df[0]) ) )
            {
               GXutil.writeLogln("tmqddln:[seudo value changed for attri]"+"Mq_Df");
               GXutil.writeLogRaw("Old: ",Z10116Mq_Df);
               GXutil.writeLogRaw("Current: ",T017G2_A10116Mq_Df[0]);
            }
            if ( DecimalUtil.compareTo(Z10118Mq_Cont, T017G2_A10118Mq_Cont[0]) != 0 )
            {
               GXutil.writeLogln("tmqddln:[seudo value changed for attri]"+"Mq_Cont");
               GXutil.writeLogRaw("Old: ",Z10118Mq_Cont);
               GXutil.writeLogRaw("Current: ",T017G2_A10118Mq_Cont[0]);
            }
            if ( DecimalUtil.compareTo(Z10179Mq_Contf, T017G2_A10179Mq_Contf[0]) != 0 )
            {
               GXutil.writeLogln("tmqddln:[seudo value changed for attri]"+"Mq_Contf");
               GXutil.writeLogRaw("Old: ",Z10179Mq_Contf);
               GXutil.writeLogRaw("Current: ",T017G2_A10179Mq_Contf[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMQDDO1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert17G1371( )
   {
      beforeValidate17G1371( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17G1371( ) ;
      }
      if ( AnyError == 0 )
      {
         zm17G1371( 0) ;
         checkOptimisticConcurrency17G1371( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17G1371( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert17G1371( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017G10 */
                  pr_default.execute(8, new Object[] {Integer.valueOf(A10114Mq_Ln), Boolean.valueOf(n10117Mq_Est), Byte.valueOf(A10117Mq_Est), Boolean.valueOf(n10115Mq_Di), A10115Mq_Di, Boolean.valueOf(n10116Mq_Df), A10116Mq_Df, Boolean.valueOf(n10118Mq_Cont), A10118Mq_Cont, Boolean.valueOf(n10179Mq_Contf), A10179Mq_Contf, A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMQDDO1");
                  if ( (pr_default.getStatus(8) == 1) )
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
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption17G0( ) ;
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
            load17G1371( ) ;
         }
         endLevel17G1371( ) ;
      }
      closeExtendedTableCursors17G1371( ) ;
   }

   public void update17G1371( )
   {
      beforeValidate17G1371( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17G1371( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17G1371( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17G1371( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate17G1371( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017G11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n10117Mq_Est), Byte.valueOf(A10117Mq_Est), Boolean.valueOf(n10115Mq_Di), A10115Mq_Di, Boolean.valueOf(n10116Mq_Df), A10116Mq_Df, Boolean.valueOf(n10118Mq_Cont), A10118Mq_Cont, Boolean.valueOf(n10179Mq_Contf), A10179Mq_Contf, A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op), Integer.valueOf(A10114Mq_Ln)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMQDDO1");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMQDDO1"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate17G1371( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption17G0( ) ;
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
         endLevel17G1371( ) ;
      }
      closeExtendedTableCursors17G1371( ) ;
   }

   public void deferredUpdate17G1371( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate17G1371( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17G1371( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls17G1371( ) ;
         afterConfirm17G1371( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete17G1371( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T017G12 */
               pr_default.execute(10, new Object[] {A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op), Integer.valueOf(A10114Mq_Ln)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMQDDO1");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1371 == 0 )
                     {
                        initAll17G1371( ) ;
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
                     resetCaption17G0( ) ;
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
      sMode1371 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel17G1371( ) ;
      Gx_mode = sMode1371 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls17G1371( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ( ( DecimalUtil.compareTo(O10118Mq_Cont, A10118Mq_Cont) != 0 ) ) || ( ( DecimalUtil.compareTo(A10179Mq_Contf, O10179Mq_Contf) != 0 ) ) || ( !( GXutil.dateCompare(O10115Mq_Di, A10115Mq_Di) ) ) || ( !( GXutil.dateCompare(O10116Mq_Df, A10116Mq_Df) ) ) && isUpd( )  )
         {
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV33Pgmname, AV8UsurCod, AV12Station, AV32Inc_obs, 99999999, (byte)(0), " ") ;
         }
         if ( ( ( DecimalUtil.compareTo(O10118Mq_Cont, A10118Mq_Cont) != 0 ) ) || ( ( DecimalUtil.compareTo(A10179Mq_Contf, O10179Mq_Contf) != 0 ) ) || ( !( GXutil.dateCompare(O10115Mq_Di, A10115Mq_Di) ) ) || ( !( GXutil.dateCompare(O10116Mq_Df, A10116Mq_Df) ) ) && isUpd( )  )
         {
            AV32Inc_obs = httpContext.getMessage( httpContext.getMessage( "Cambio datos ", ""), "") + httpContext.getMessage( httpContext.getMessage( "Valores Iniciales ", ""), "") + localUtil.ttoc( O10115Mq_Di, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + " " + localUtil.ttoc( O10116Mq_Df, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + " " + GXutil.str( O10118Mq_Cont, 10, 2) + " " + GXutil.str( O10179Mq_Contf, 10, 2) + httpContext.getMessage( httpContext.getMessage( " Valores Finales ", ""), "") + localUtil.ttoc( (A10115Mq_Di), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + " " + localUtil.ttoc( (A10116Mq_Df), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + " " + (GXutil.str( A10118Mq_Cont, 10, 2)) + " " + (GXutil.str( A10179Mq_Contf, 10, 2)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32Inc_obs", AV32Inc_obs);
         }
      }
   }

   public void endLevel17G1371( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete17G1371( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmqddln");
         if ( AnyError == 0 )
         {
            confirmValues17G0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmqddln");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart17G1371( )
   {
      /* Scan By routine */
      /* Using cursor T017G13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op), Integer.valueOf(A10114Mq_Ln)});
      RcdFound1371 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1371 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext17G1371( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1371 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1371 = (short)(1) ;
      }
   }

   public void scanEnd17G1371( )
   {
      pr_default.close(11);
   }

   public void afterConfirm17G1371( )
   {
      /* After Confirm Rules */
      if ( ( A10118Mq_Cont.doubleValue() == 0 ) && ( GXutil.strcmp(A602MaqCod, httpContext.getMessage( "TIBL", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO se permite valor 0¡¡¡", ""), 1, "MQ_CONT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMq_Cont_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( ( A10179Mq_Contf.doubleValue() == 0 ) && ( GXutil.strcmp(A602MaqCod, httpContext.getMessage( "TIBL", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO se permite valor 0¡¡¡", ""), 1, "MQ_CONTF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMq_Contf_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert17G1371( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate17G1371( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete17G1371( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete17G1371( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate17G1371( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes17G1371( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtMq_Dia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Dia_Enabled), 5, 0), true);
      edtMq_Op_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Op_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Op_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtMq_Ln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Ln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Ln_Enabled), 5, 0), true);
      edtMq_Di_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Di_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Di_Enabled), 5, 0), true);
      edtMq_Df_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Df_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Df_Enabled), 5, 0), true);
      edtMq_Est_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Est_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Est_Enabled), 5, 0), true);
      edtMq_Cont_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Cont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Cont_Enabled), 5, 0), true);
      edtMq_Contf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Contf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Contf_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes17G1371( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues17G0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tmqddln", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.formatDateParm(A10111Mq_Dia)),GXutil.URLEncode(GXutil.ltrimstr(A10112Mq_Op,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A10114Mq_Ln,6,0))}, new String[] {"EmprCod","MaqCod","Mq_Dia","Mq_Op","Mq_Ln"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10111Mq_Dia", localUtil.dtoc( Z10111Mq_Dia, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10112Mq_Op", GXutil.ltrim( localUtil.ntoc( Z10112Mq_Op, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10114Mq_Ln", GXutil.ltrim( localUtil.ntoc( Z10114Mq_Ln, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10117Mq_Est", GXutil.ltrim( localUtil.ntoc( Z10117Mq_Est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10115Mq_Di", localUtil.ttoc( Z10115Mq_Di, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10116Mq_Df", localUtil.ttoc( Z10116Mq_Df, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10118Mq_Cont", GXutil.ltrim( localUtil.ntoc( Z10118Mq_Cont, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10179Mq_Contf", GXutil.ltrim( localUtil.ntoc( Z10179Mq_Contf, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O10116Mq_Df", localUtil.ttoc( O10116Mq_Df, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "O10115Mq_Di", localUtil.ttoc( O10115Mq_Di, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "O10179Mq_Contf", GXutil.ltrim( localUtil.ntoc( O10179Mq_Contf, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O10118Mq_Cont", GXutil.ltrim( localUtil.ntoc( O10118Mq_Cont, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV32Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV12Station));
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
      return formatLink("app.tmqddln", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.formatDateParm(A10111Mq_Dia)),GXutil.URLEncode(GXutil.ltrimstr(A10112Mq_Op,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A10114Mq_Ln,6,0))}, new String[] {"EmprCod","MaqCod","Mq_Dia","Mq_Op","Mq_Ln"})  ;
   }

   public String getPgmname( )
   {
      return "TMQDDLN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CONTROL ACREDITACION LINEA", "") ;
   }

   public void initializeNonKey17G1371( )
   {
      AV32Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Inc_obs", AV32Inc_obs);
      A10117Mq_Est = (byte)(0) ;
      n10117Mq_Est = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10117Mq_Est", GXutil.str( A10117Mq_Est, 1, 0));
      A10115Mq_Di = GXutil.resetTime( GXutil.nullDate() );
      n10115Mq_Di = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10115Mq_Di", localUtil.ttoc( A10115Mq_Di, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A10116Mq_Df = GXutil.resetTime( GXutil.nullDate() );
      n10116Mq_Df = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10116Mq_Df", localUtil.ttoc( A10116Mq_Df, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A10118Mq_Cont = DecimalUtil.ZERO ;
      n10118Mq_Cont = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10118Mq_Cont", GXutil.ltrimstr( A10118Mq_Cont, 10, 2));
      A10179Mq_Contf = DecimalUtil.ZERO ;
      n10179Mq_Contf = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10179Mq_Contf", GXutil.ltrimstr( A10179Mq_Contf, 10, 2));
      O10116Mq_Df = A10116Mq_Df ;
      n10116Mq_Df = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10116Mq_Df", localUtil.ttoc( A10116Mq_Df, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      O10115Mq_Di = A10115Mq_Di ;
      n10115Mq_Di = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10115Mq_Di", localUtil.ttoc( A10115Mq_Di, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      O10179Mq_Contf = A10179Mq_Contf ;
      n10179Mq_Contf = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10179Mq_Contf", GXutil.ltrimstr( A10179Mq_Contf, 10, 2));
      O10118Mq_Cont = A10118Mq_Cont ;
      n10118Mq_Cont = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10118Mq_Cont", GXutil.ltrimstr( A10118Mq_Cont, 10, 2));
      Z10117Mq_Est = (byte)(0) ;
      Z10115Mq_Di = GXutil.resetTime( GXutil.nullDate() );
      Z10116Mq_Df = GXutil.resetTime( GXutil.nullDate() );
      Z10118Mq_Cont = DecimalUtil.ZERO ;
      Z10179Mq_Contf = DecimalUtil.ZERO ;
   }

   public void initAll17G1371( )
   {
      initializeNonKey17G1371( ) ;
   }

   public void standaloneModalInsert( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241551061", true, true);
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
      httpContext.AddJavascriptSource("tmqddln.js", "?20268241551061", false, true);
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
      edtMaqCod_Internalname = "MAQCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtMq_Dia_Internalname = "MQ_DIA" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtMq_Op_Internalname = "MQ_OP" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtMq_Ln_Internalname = "MQ_LN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtMq_Di_Internalname = "MQ_DI" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtMq_Df_Internalname = "MQ_DF" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtMq_Est_Internalname = "MQ_EST" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtMq_Cont_Internalname = "MQ_CONT" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtMq_Contf_Internalname = "MQ_CONTF" ;
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
      Form.setCaption( httpContext.getMessage( "CONTROL ACREDITACION LINEA", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMq_Contf_Jsonclick = "" ;
      edtMq_Contf_Backcolor = (int)(0xFFFFFF) ;
      edtMq_Contf_Enabled = 1 ;
      edtMq_Cont_Jsonclick = "" ;
      edtMq_Cont_Backcolor = (int)(0xFFFFFF) ;
      edtMq_Cont_Enabled = 1 ;
      edtMq_Est_Jsonclick = "" ;
      edtMq_Est_Backcolor = (int)(0xFFFFFF) ;
      edtMq_Est_Enabled = 0 ;
      edtMq_Df_Jsonclick = "" ;
      edtMq_Df_Backcolor = (int)(0xFFFFFF) ;
      edtMq_Df_Enabled = 1 ;
      edtMq_Di_Jsonclick = "" ;
      edtMq_Di_Backcolor = (int)(0xFFFFFF) ;
      edtMq_Di_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMq_Ln_Jsonclick = "" ;
      edtMq_Ln_Backcolor = (int)(0xFFFFFF) ;
      edtMq_Ln_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtMq_Op_Jsonclick = "" ;
      edtMq_Op_Backcolor = (int)(0xFFFFFF) ;
      edtMq_Op_Enabled = 0 ;
      edtMq_Dia_Jsonclick = "" ;
      edtMq_Dia_Backcolor = (int)(0xFFFFFF) ;
      edtMq_Dia_Enabled = 0 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Backcolor = (int)(0xFFFFFF) ;
      edtMaqCod_Enabled = 0 ;
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

   public void xc_7_17G1371( String Gx_mode ,
                             String A396EmprCod ,
                             String AV33Pgmname ,
                             String AV8UsurCod ,
                             String AV12Station ,
                             String AV32Inc_obs ,
                             java.math.BigDecimal A10118Mq_Cont ,
                             java.math.BigDecimal A10179Mq_Contf ,
                             java.util.Date A10115Mq_Di ,
                             java.util.Date A10116Mq_Df )
   {
      if ( ( ( DecimalUtil.compareTo(O10118Mq_Cont, A10118Mq_Cont) != 0 ) ) || ( ( DecimalUtil.compareTo(A10179Mq_Contf, O10179Mq_Contf) != 0 ) ) || ( !( GXutil.dateCompare(O10115Mq_Di, A10115Mq_Di) ) ) || ( !( GXutil.dateCompare(O10116Mq_Df, A10116Mq_Df) ) ) && isUpd( )  )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV33Pgmname, AV8UsurCod, AV12Station, AV32Inc_obs, 99999999, (byte)(0), " ") ;
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

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T017G14 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017G14_A407EmprNom[0] ;
      n407EmprNom = T017G14_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(12);
      /* Using cursor T017G15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MQDDOP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MQ_OP");
         AnyError = (short)(1) ;
      }
      pr_default.close(13);
      GX_FocusControl = edtMq_Di_Internalname ;
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

   public void valid_Mq_ln( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10115Mq_Di", localUtil.ttoc( A10115Mq_Di, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A10116Mq_Df", localUtil.ttoc( A10116Mq_Df, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A10118Mq_Cont", GXutil.ltrim( localUtil.ntoc( A10118Mq_Cont, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10179Mq_Contf", GXutil.ltrim( localUtil.ntoc( A10179Mq_Contf, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV32Inc_obs", AV32Inc_obs);
      httpContext.ajax_rsp_assign_attri("", false, "A10117Mq_Est", GXutil.ltrim( localUtil.ntoc( A10117Mq_Est, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10111Mq_Dia", localUtil.format(Z10111Mq_Dia, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10112Mq_Op", GXutil.ltrim( localUtil.ntoc( Z10112Mq_Op, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10114Mq_Ln", GXutil.ltrim( localUtil.ntoc( Z10114Mq_Ln, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10115Mq_Di", localUtil.ttoc( Z10115Mq_Di, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10116Mq_Df", localUtil.ttoc( Z10116Mq_Df, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10118Mq_Cont", GXutil.ltrim( localUtil.ntoc( Z10118Mq_Cont, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10179Mq_Contf", GXutil.ltrim( localUtil.ntoc( Z10179Mq_Contf, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV32Inc_obs", ZV32Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10117Mq_Est", GXutil.ltrim( localUtil.ntoc( Z10117Mq_Est, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O10116Mq_Df", localUtil.ttoc( O10116Mq_Df, 10, 8, 0, 0, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "O10115Mq_Di", localUtil.ttoc( O10115Mq_Di, 10, 8, 0, 0, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "O10179Mq_Contf", GXutil.ltrim( localUtil.ntoc( O10179Mq_Contf, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O10118Mq_Cont", GXutil.ltrim( localUtil.ntoc( O10118Mq_Cont, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Mq_contf( )
   {
      n10115Mq_Di = false ;
      n10116Mq_Df = false ;
      n10118Mq_Cont = false ;
      n10179Mq_Contf = false ;
      if ( ( ( DecimalUtil.compareTo(O10118Mq_Cont, A10118Mq_Cont) != 0 ) ) || ( ( DecimalUtil.compareTo(A10179Mq_Contf, O10179Mq_Contf) != 0 ) ) || ( !( GXutil.dateCompare(O10115Mq_Di, A10115Mq_Di) ) ) || ( !( GXutil.dateCompare(O10116Mq_Df, A10116Mq_Df) ) ) && isUpd( )  )
      {
         AV32Inc_obs = httpContext.getMessage( httpContext.getMessage( "Cambio datos ", ""), "") + httpContext.getMessage( httpContext.getMessage( "Valores Iniciales ", ""), "") + localUtil.ttoc( O10115Mq_Di, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + " " + localUtil.ttoc( O10116Mq_Df, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + " " + GXutil.str( O10118Mq_Cont, 10, 2) + " " + GXutil.str( O10179Mq_Contf, 10, 2) + httpContext.getMessage( httpContext.getMessage( " Valores Finales ", ""), "") + localUtil.ttoc( (A10115Mq_Di), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + " " + localUtil.ttoc( (A10116Mq_Df), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + " " + (GXutil.str( A10118Mq_Cont, 10, 2)) + " " + (GXutil.str( A10179Mq_Contf, 10, 2)) ;
      }
      if ( ( ( DecimalUtil.compareTo(O10118Mq_Cont, A10118Mq_Cont) != 0 ) ) || ( ( DecimalUtil.compareTo(A10179Mq_Contf, O10179Mq_Contf) != 0 ) ) || ( !( GXutil.dateCompare(O10115Mq_Di, A10115Mq_Di) ) ) || ( !( GXutil.dateCompare(O10116Mq_Df, A10116Mq_Df) ) ) && isUpd( )  )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV33Pgmname, AV8UsurCod, AV12Station, AV32Inc_obs, 99999999, (byte)(0), " ") ;
      }
      O10116Mq_Df = A10116Mq_Df ;
      n10116Mq_Df = false ;
      O10115Mq_Di = A10115Mq_Di ;
      n10115Mq_Di = false ;
      O10179Mq_Contf = A10179Mq_Contf ;
      n10179Mq_Contf = false ;
      O10118Mq_Cont = A10118Mq_Cont ;
      n10118Mq_Cont = false ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV32Inc_obs", AV32Inc_obs);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A10111Mq_Dia',fld:'MQ_DIA',pic:''},{av:'A10112Mq_Op',fld:'MQ_OP',pic:'ZZZZZ9'},{av:'A10114Mq_Ln',fld:'MQ_LN',pic:'ZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
      setEventMetadata("VALID_MQ_DIA","{handler:'valid_Mq_dia',iparms:[]");
      setEventMetadata("VALID_MQ_DIA",",oparms:[]}");
      setEventMetadata("VALID_MQ_OP","{handler:'valid_Mq_op',iparms:[]");
      setEventMetadata("VALID_MQ_OP",",oparms:[]}");
      setEventMetadata("VALID_MQ_LN","{handler:'valid_Mq_ln',iparms:[{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'AV12Station',fld:'vSTATION',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A10111Mq_Dia',fld:'MQ_DIA',pic:''},{av:'A10112Mq_Op',fld:'MQ_OP',pic:'ZZZZZ9'},{av:'A10114Mq_Ln',fld:'MQ_LN',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV32Inc_obs',fld:'vINC_OBS',pic:''}]");
      setEventMetadata("VALID_MQ_LN",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10115Mq_Di',fld:'MQ_DI',pic:'99/99/99 99:99'},{av:'A10116Mq_Df',fld:'MQ_DF',pic:'99/99/99 99:99'},{av:'A10118Mq_Cont',fld:'MQ_CONT',pic:'ZZZZZZ9.99'},{av:'A10179Mq_Contf',fld:'MQ_CONTF',pic:'ZZZZZZ9.99'},{av:'AV32Inc_obs',fld:'vINC_OBS',pic:''},{av:'A10117Mq_Est',fld:'MQ_EST',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z602MaqCod'},{av:'Z10111Mq_Dia'},{av:'Z10112Mq_Op'},{av:'Z10114Mq_Ln'},{av:'Z407EmprNom'},{av:'Z10115Mq_Di'},{av:'Z10116Mq_Df'},{av:'Z10118Mq_Cont'},{av:'Z10179Mq_Contf'},{av:'ZV32Inc_obs'},{av:'Z10117Mq_Est'},{av:'O10116Mq_Df'},{av:'O10115Mq_Di'},{av:'O10179Mq_Contf'},{av:'O10118Mq_Cont'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MQ_DI","{handler:'valid_Mq_di',iparms:[]");
      setEventMetadata("VALID_MQ_DI",",oparms:[]}");
      setEventMetadata("VALID_MQ_DF","{handler:'valid_Mq_df',iparms:[]");
      setEventMetadata("VALID_MQ_DF",",oparms:[]}");
      setEventMetadata("VALID_MQ_CONT","{handler:'valid_Mq_cont',iparms:[]");
      setEventMetadata("VALID_MQ_CONT",",oparms:[]}");
      setEventMetadata("VALID_MQ_CONTF","{handler:'valid_Mq_contf',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O10179Mq_Contf'},{av:'O10118Mq_Cont'},{av:'O10116Mq_Df'},{av:'O10115Mq_Di'},{av:'A10115Mq_Di',fld:'MQ_DI',pic:'99/99/99 99:99'},{av:'A10116Mq_Df',fld:'MQ_DF',pic:'99/99/99 99:99'},{av:'A10118Mq_Cont',fld:'MQ_CONT',pic:'ZZZZZZ9.99'},{av:'A10179Mq_Contf',fld:'MQ_CONTF',pic:'ZZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV33Pgmname',fld:'vPGMNAME',pic:''},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'AV12Station',fld:'vSTATION',pic:''},{av:'AV32Inc_obs',fld:'vINC_OBS',pic:''}]");
      setEventMetadata("VALID_MQ_CONTF",",oparms:[{av:'AV32Inc_obs',fld:'vINC_OBS',pic:''}]}");
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
      pr_default.close(12);
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA602MaqCod = "" ;
      wcpOA10111Mq_Dia = GXutil.nullDate() ;
      Z396EmprCod = "" ;
      Z602MaqCod = "" ;
      Z10111Mq_Dia = GXutil.nullDate() ;
      Z10115Mq_Di = GXutil.resetTime( GXutil.nullDate() );
      Z10116Mq_Df = GXutil.resetTime( GXutil.nullDate() );
      Z10118Mq_Cont = DecimalUtil.ZERO ;
      Z10179Mq_Contf = DecimalUtil.ZERO ;
      O10116Mq_Df = GXutil.resetTime( GXutil.nullDate() );
      O10115Mq_Di = GXutil.resetTime( GXutil.nullDate() );
      O10179Mq_Contf = DecimalUtil.ZERO ;
      O10118Mq_Cont = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "" ;
      AV8UsurCod = "" ;
      AV12Station = "" ;
      AV32Inc_obs = "" ;
      A10118Mq_Cont = DecimalUtil.ZERO ;
      A10179Mq_Contf = DecimalUtil.ZERO ;
      A10115Mq_Di = GXutil.resetTime( GXutil.nullDate() );
      A10116Mq_Df = GXutil.resetTime( GXutil.nullDate() );
      A602MaqCod = "" ;
      A10111Mq_Dia = GXutil.nullDate() ;
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
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
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
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV14Lit2 = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      T017G4_A407EmprNom = new String[] {""} ;
      T017G4_n407EmprNom = new boolean[] {false} ;
      T017G5_A396EmprCod = new String[] {""} ;
      T017G6_A10114Mq_Ln = new int[1] ;
      T017G6_A10117Mq_Est = new byte[1] ;
      T017G6_n10117Mq_Est = new boolean[] {false} ;
      T017G6_A407EmprNom = new String[] {""} ;
      T017G6_n407EmprNom = new boolean[] {false} ;
      T017G6_A10115Mq_Di = new java.util.Date[] {GXutil.nullDate()} ;
      T017G6_n10115Mq_Di = new boolean[] {false} ;
      T017G6_A10116Mq_Df = new java.util.Date[] {GXutil.nullDate()} ;
      T017G6_n10116Mq_Df = new boolean[] {false} ;
      T017G6_A10118Mq_Cont = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017G6_n10118Mq_Cont = new boolean[] {false} ;
      T017G6_A10179Mq_Contf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017G6_n10179Mq_Contf = new boolean[] {false} ;
      T017G6_A396EmprCod = new String[] {""} ;
      T017G6_A602MaqCod = new String[] {""} ;
      T017G6_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017G6_A10112Mq_Op = new int[1] ;
      T017G7_A396EmprCod = new String[] {""} ;
      T017G7_A602MaqCod = new String[] {""} ;
      T017G7_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017G7_A10112Mq_Op = new int[1] ;
      T017G7_A10114Mq_Ln = new int[1] ;
      T017G3_A10114Mq_Ln = new int[1] ;
      T017G3_A10117Mq_Est = new byte[1] ;
      T017G3_n10117Mq_Est = new boolean[] {false} ;
      T017G3_A10115Mq_Di = new java.util.Date[] {GXutil.nullDate()} ;
      T017G3_n10115Mq_Di = new boolean[] {false} ;
      T017G3_A10116Mq_Df = new java.util.Date[] {GXutil.nullDate()} ;
      T017G3_n10116Mq_Df = new boolean[] {false} ;
      T017G3_A10118Mq_Cont = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017G3_n10118Mq_Cont = new boolean[] {false} ;
      T017G3_A10179Mq_Contf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017G3_n10179Mq_Contf = new boolean[] {false} ;
      T017G3_A396EmprCod = new String[] {""} ;
      T017G3_A602MaqCod = new String[] {""} ;
      T017G3_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017G3_A10112Mq_Op = new int[1] ;
      sMode1371 = "" ;
      T017G8_A396EmprCod = new String[] {""} ;
      T017G8_A602MaqCod = new String[] {""} ;
      T017G8_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017G8_A10112Mq_Op = new int[1] ;
      T017G8_A10114Mq_Ln = new int[1] ;
      T017G9_A396EmprCod = new String[] {""} ;
      T017G9_A602MaqCod = new String[] {""} ;
      T017G9_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017G9_A10112Mq_Op = new int[1] ;
      T017G9_A10114Mq_Ln = new int[1] ;
      T017G2_A10114Mq_Ln = new int[1] ;
      T017G2_A10117Mq_Est = new byte[1] ;
      T017G2_n10117Mq_Est = new boolean[] {false} ;
      T017G2_A10115Mq_Di = new java.util.Date[] {GXutil.nullDate()} ;
      T017G2_n10115Mq_Di = new boolean[] {false} ;
      T017G2_A10116Mq_Df = new java.util.Date[] {GXutil.nullDate()} ;
      T017G2_n10116Mq_Df = new boolean[] {false} ;
      T017G2_A10118Mq_Cont = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017G2_n10118Mq_Cont = new boolean[] {false} ;
      T017G2_A10179Mq_Contf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017G2_n10179Mq_Contf = new boolean[] {false} ;
      T017G2_A396EmprCod = new String[] {""} ;
      T017G2_A602MaqCod = new String[] {""} ;
      T017G2_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017G2_A10112Mq_Op = new int[1] ;
      T017G13_A396EmprCod = new String[] {""} ;
      T017G13_A602MaqCod = new String[] {""} ;
      T017G13_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017G13_A10112Mq_Op = new int[1] ;
      T017G13_A10114Mq_Ln = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T017G14_A407EmprNom = new String[] {""} ;
      T017G14_n407EmprNom = new boolean[] {false} ;
      T017G15_A396EmprCod = new String[] {""} ;
      ZV32Inc_obs = "" ;
      ZZ396EmprCod = "" ;
      ZZ602MaqCod = "" ;
      ZZ10111Mq_Dia = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      ZZ10115Mq_Di = GXutil.resetTime( GXutil.nullDate() );
      ZZ10116Mq_Df = GXutil.resetTime( GXutil.nullDate() );
      ZZ10118Mq_Cont = DecimalUtil.ZERO ;
      ZZ10179Mq_Contf = DecimalUtil.ZERO ;
      ZZV32Inc_obs = "" ;
      ZO10116Mq_Df = GXutil.resetTime( GXutil.nullDate() );
      ZO10115Mq_Di = GXutil.resetTime( GXutil.nullDate() );
      ZO10179Mq_Contf = DecimalUtil.ZERO ;
      ZO10118Mq_Cont = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tmqddln__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmqddln__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmqddln__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmqddln__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmqddln__default(),
         new Object[] {
             new Object[] {
            T017G2_A10114Mq_Ln, T017G2_A10117Mq_Est, T017G2_n10117Mq_Est, T017G2_A10115Mq_Di, T017G2_n10115Mq_Di, T017G2_A10116Mq_Df, T017G2_n10116Mq_Df, T017G2_A10118Mq_Cont, T017G2_n10118Mq_Cont, T017G2_A10179Mq_Contf,
            T017G2_n10179Mq_Contf, T017G2_A396EmprCod, T017G2_A602MaqCod, T017G2_A10111Mq_Dia, T017G2_A10112Mq_Op
            }
            , new Object[] {
            T017G3_A10114Mq_Ln, T017G3_A10117Mq_Est, T017G3_n10117Mq_Est, T017G3_A10115Mq_Di, T017G3_n10115Mq_Di, T017G3_A10116Mq_Df, T017G3_n10116Mq_Df, T017G3_A10118Mq_Cont, T017G3_n10118Mq_Cont, T017G3_A10179Mq_Contf,
            T017G3_n10179Mq_Contf, T017G3_A396EmprCod, T017G3_A602MaqCod, T017G3_A10111Mq_Dia, T017G3_A10112Mq_Op
            }
            , new Object[] {
            T017G4_A407EmprNom, T017G4_n407EmprNom
            }
            , new Object[] {
            T017G5_A396EmprCod
            }
            , new Object[] {
            T017G6_A10114Mq_Ln, T017G6_A10117Mq_Est, T017G6_n10117Mq_Est, T017G6_A407EmprNom, T017G6_n407EmprNom, T017G6_A10115Mq_Di, T017G6_n10115Mq_Di, T017G6_A10116Mq_Df, T017G6_n10116Mq_Df, T017G6_A10118Mq_Cont,
            T017G6_n10118Mq_Cont, T017G6_A10179Mq_Contf, T017G6_n10179Mq_Contf, T017G6_A396EmprCod, T017G6_A602MaqCod, T017G6_A10111Mq_Dia, T017G6_A10112Mq_Op
            }
            , new Object[] {
            T017G7_A396EmprCod, T017G7_A602MaqCod, T017G7_A10111Mq_Dia, T017G7_A10112Mq_Op, T017G7_A10114Mq_Ln
            }
            , new Object[] {
            T017G8_A396EmprCod, T017G8_A602MaqCod, T017G8_A10111Mq_Dia, T017G8_A10112Mq_Op, T017G8_A10114Mq_Ln
            }
            , new Object[] {
            T017G9_A396EmprCod, T017G9_A602MaqCod, T017G9_A10111Mq_Dia, T017G9_A10112Mq_Op, T017G9_A10114Mq_Ln
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017G13_A396EmprCod, T017G13_A602MaqCod, T017G13_A10111Mq_Dia, T017G13_A10112Mq_Op, T017G13_A10114Mq_Ln
            }
            , new Object[] {
            T017G14_A407EmprNom, T017G14_n407EmprNom
            }
            , new Object[] {
            T017G15_A396EmprCod
            }
         }
      );
      Z10114Mq_Ln = 0 ;
      A10114Mq_Ln = 0 ;
      Z10112Mq_Op = 0 ;
      A10112Mq_Op = 0 ;
      Z10111Mq_Dia = GXutil.nullDate() ;
      A10111Mq_Dia = GXutil.nullDate() ;
      Z602MaqCod = "" ;
      A602MaqCod = "" ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TMQDDLN" ;
   }

   private byte Z10117Mq_Est ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A10117Mq_Est ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ10117Mq_Est ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1371 ;
   private short nIsDirty_1371 ;
   private int wcpOA10112Mq_Op ;
   private int wcpOA10114Mq_Ln ;
   private int Z10112Mq_Op ;
   private int Z10114Mq_Ln ;
   private int A10112Mq_Op ;
   private int A10114Mq_Ln ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtMq_Dia_Enabled ;
   private int edtMq_Op_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtMq_Ln_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtMq_Di_Enabled ;
   private int edtMq_Df_Enabled ;
   private int edtMq_Est_Enabled ;
   private int edtMq_Cont_Enabled ;
   private int edtMq_Contf_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GX_JID ;
   private int idxLst ;
   private int edtMq_Contf_Backcolor ;
   private int edtMq_Cont_Backcolor ;
   private int edtMq_Est_Backcolor ;
   private int edtMq_Df_Backcolor ;
   private int edtMq_Di_Backcolor ;
   private int edtMq_Ln_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtMq_Op_Backcolor ;
   private int edtMq_Dia_Backcolor ;
   private int edtMaqCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ10112Mq_Op ;
   private int ZZ10114Mq_Ln ;
   private java.math.BigDecimal Z10118Mq_Cont ;
   private java.math.BigDecimal Z10179Mq_Contf ;
   private java.math.BigDecimal O10179Mq_Contf ;
   private java.math.BigDecimal O10118Mq_Cont ;
   private java.math.BigDecimal A10118Mq_Cont ;
   private java.math.BigDecimal A10179Mq_Contf ;
   private java.math.BigDecimal ZZ10118Mq_Cont ;
   private java.math.BigDecimal ZZ10179Mq_Contf ;
   private java.math.BigDecimal ZO10179Mq_Contf ;
   private java.math.BigDecimal ZO10118Mq_Cont ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA602MaqCod ;
   private String Z396EmprCod ;
   private String Z602MaqCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String AV33Pgmname ;
   private String AV8UsurCod ;
   private String AV12Station ;
   private String A602MaqCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMq_Di_Internalname ;
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
   private String edtMaqCod_Internalname ;
   private String edtMaqCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtMq_Dia_Internalname ;
   private String edtMq_Dia_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtMq_Op_Internalname ;
   private String edtMq_Op_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtMq_Ln_Internalname ;
   private String edtMq_Ln_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtMq_Di_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtMq_Df_Internalname ;
   private String edtMq_Df_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtMq_Est_Internalname ;
   private String edtMq_Est_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtMq_Cont_Internalname ;
   private String edtMq_Cont_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtMq_Contf_Internalname ;
   private String edtMq_Contf_Jsonclick ;
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
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV14Lit2 ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sMode1371 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ602MaqCod ;
   private String ZZ407EmprNom ;
   private java.util.Date Z10115Mq_Di ;
   private java.util.Date Z10116Mq_Df ;
   private java.util.Date O10116Mq_Df ;
   private java.util.Date O10115Mq_Di ;
   private java.util.Date A10115Mq_Di ;
   private java.util.Date A10116Mq_Df ;
   private java.util.Date ZZ10115Mq_Di ;
   private java.util.Date ZZ10116Mq_Df ;
   private java.util.Date ZO10116Mq_Df ;
   private java.util.Date ZO10115Mq_Di ;
   private java.util.Date wcpOA10111Mq_Dia ;
   private java.util.Date Z10111Mq_Dia ;
   private java.util.Date A10111Mq_Dia ;
   private java.util.Date ZZ10111Mq_Dia ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n10118Mq_Cont ;
   private boolean n10179Mq_Contf ;
   private boolean n10115Mq_Di ;
   private boolean n10116Mq_Df ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n10117Mq_Est ;
   private boolean returnInSub ;
   private String AV32Inc_obs ;
   private String ZV32Inc_obs ;
   private String ZZV32Inc_obs ;
   private IDataStoreProvider pr_default ;
   private String[] T017G4_A407EmprNom ;
   private boolean[] T017G4_n407EmprNom ;
   private String[] T017G5_A396EmprCod ;
   private int[] T017G6_A10114Mq_Ln ;
   private byte[] T017G6_A10117Mq_Est ;
   private boolean[] T017G6_n10117Mq_Est ;
   private String[] T017G6_A407EmprNom ;
   private boolean[] T017G6_n407EmprNom ;
   private java.util.Date[] T017G6_A10115Mq_Di ;
   private boolean[] T017G6_n10115Mq_Di ;
   private java.util.Date[] T017G6_A10116Mq_Df ;
   private boolean[] T017G6_n10116Mq_Df ;
   private java.math.BigDecimal[] T017G6_A10118Mq_Cont ;
   private boolean[] T017G6_n10118Mq_Cont ;
   private java.math.BigDecimal[] T017G6_A10179Mq_Contf ;
   private boolean[] T017G6_n10179Mq_Contf ;
   private String[] T017G6_A396EmprCod ;
   private String[] T017G6_A602MaqCod ;
   private java.util.Date[] T017G6_A10111Mq_Dia ;
   private int[] T017G6_A10112Mq_Op ;
   private String[] T017G7_A396EmprCod ;
   private String[] T017G7_A602MaqCod ;
   private java.util.Date[] T017G7_A10111Mq_Dia ;
   private int[] T017G7_A10112Mq_Op ;
   private int[] T017G7_A10114Mq_Ln ;
   private int[] T017G3_A10114Mq_Ln ;
   private byte[] T017G3_A10117Mq_Est ;
   private boolean[] T017G3_n10117Mq_Est ;
   private java.util.Date[] T017G3_A10115Mq_Di ;
   private boolean[] T017G3_n10115Mq_Di ;
   private java.util.Date[] T017G3_A10116Mq_Df ;
   private boolean[] T017G3_n10116Mq_Df ;
   private java.math.BigDecimal[] T017G3_A10118Mq_Cont ;
   private boolean[] T017G3_n10118Mq_Cont ;
   private java.math.BigDecimal[] T017G3_A10179Mq_Contf ;
   private boolean[] T017G3_n10179Mq_Contf ;
   private String[] T017G3_A396EmprCod ;
   private String[] T017G3_A602MaqCod ;
   private java.util.Date[] T017G3_A10111Mq_Dia ;
   private int[] T017G3_A10112Mq_Op ;
   private String[] T017G8_A396EmprCod ;
   private String[] T017G8_A602MaqCod ;
   private java.util.Date[] T017G8_A10111Mq_Dia ;
   private int[] T017G8_A10112Mq_Op ;
   private int[] T017G8_A10114Mq_Ln ;
   private String[] T017G9_A396EmprCod ;
   private String[] T017G9_A602MaqCod ;
   private java.util.Date[] T017G9_A10111Mq_Dia ;
   private int[] T017G9_A10112Mq_Op ;
   private int[] T017G9_A10114Mq_Ln ;
   private int[] T017G2_A10114Mq_Ln ;
   private byte[] T017G2_A10117Mq_Est ;
   private boolean[] T017G2_n10117Mq_Est ;
   private java.util.Date[] T017G2_A10115Mq_Di ;
   private boolean[] T017G2_n10115Mq_Di ;
   private java.util.Date[] T017G2_A10116Mq_Df ;
   private boolean[] T017G2_n10116Mq_Df ;
   private java.math.BigDecimal[] T017G2_A10118Mq_Cont ;
   private boolean[] T017G2_n10118Mq_Cont ;
   private java.math.BigDecimal[] T017G2_A10179Mq_Contf ;
   private boolean[] T017G2_n10179Mq_Contf ;
   private String[] T017G2_A396EmprCod ;
   private String[] T017G2_A602MaqCod ;
   private java.util.Date[] T017G2_A10111Mq_Dia ;
   private int[] T017G2_A10112Mq_Op ;
   private String[] T017G13_A396EmprCod ;
   private String[] T017G13_A602MaqCod ;
   private java.util.Date[] T017G13_A10111Mq_Dia ;
   private int[] T017G13_A10112Mq_Op ;
   private int[] T017G13_A10114Mq_Ln ;
   private String[] T017G14_A407EmprNom ;
   private boolean[] T017G14_n407EmprNom ;
   private String[] T017G15_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmqddln__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmqddln__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmqddln__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmqddln__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmqddln__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T017G2", "SELECT Mq_Ln, Mq_Est, Mq_Di, Mq_Df, Mq_Cont, Mq_Contf, EmprCod, MaqCod, Mq_Dia, Mq_Op FROM TXPMQDDO1 WHERE EmprCod = ? AND MaqCod = ? AND Mq_Dia = ? AND Mq_Op = ? AND Mq_Ln = ?  FOR UPDATE OF Mq_Est, Mq_Di, Mq_Df, Mq_Cont, Mq_Contf NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017G3", "SELECT Mq_Ln, Mq_Est, Mq_Di, Mq_Df, Mq_Cont, Mq_Contf, EmprCod, MaqCod, Mq_Dia, Mq_Op FROM TXPMQDDO1 WHERE EmprCod = ? AND MaqCod = ? AND Mq_Dia = ? AND Mq_Op = ? AND Mq_Ln = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017G4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017G5", "SELECT EmprCod FROM TXPMQDDOP WHERE EmprCod = ? AND MaqCod = ? AND Mq_Dia = ? AND Mq_Op = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017G6", "SELECT /*+ FIRST_ROWS(1) */ TM1.Mq_Ln, TM1.Mq_Est, T2.EmprNom, TM1.Mq_Di, TM1.Mq_Df, TM1.Mq_Cont, TM1.Mq_Contf, TM1.EmprCod, TM1.MaqCod, TM1.Mq_Dia, TM1.Mq_Op FROM (TXPMQDDO1 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.MaqCod = ? and TM1.Mq_Dia = ? and TM1.Mq_Op = ? and TM1.Mq_Ln = ? ORDER BY TM1.EmprCod, TM1.MaqCod, TM1.Mq_Dia, TM1.Mq_Op, TM1.Mq_Ln ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017G7", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, Mq_Dia, Mq_Op, Mq_Ln FROM TXPMQDDO1 WHERE EmprCod = ? AND MaqCod = ? AND Mq_Dia = ? AND Mq_Op = ? AND Mq_Ln = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017G8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, Mq_Dia, Mq_Op, Mq_Ln FROM TXPMQDDO1 WHERE EmprCod = ? and MaqCod = ? and Mq_Dia = ? and Mq_Op = ? and Mq_Ln = ? ORDER BY EmprCod, MaqCod, Mq_Dia, Mq_Op, Mq_Ln) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017G9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, Mq_Dia, Mq_Op, Mq_Ln FROM TXPMQDDO1 WHERE EmprCod = ? and MaqCod = ? and Mq_Dia = ? and Mq_Op = ? and Mq_Ln = ? ORDER BY EmprCod DESC, MaqCod DESC, Mq_Dia DESC, Mq_Op DESC, Mq_Ln DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T017G10", "INSERT INTO TXPMQDDO1(Mq_Ln, Mq_Est, Mq_Di, Mq_Df, Mq_Cont, Mq_Contf, EmprCod, MaqCod, Mq_Dia, Mq_Op) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMQDDO1")
         ,new UpdateCursor("T017G11", "UPDATE TXPMQDDO1 SET Mq_Est=?, Mq_Di=?, Mq_Df=?, Mq_Cont=?, Mq_Contf=?  WHERE EmprCod = ? AND MaqCod = ? AND Mq_Dia = ? AND Mq_Op = ? AND Mq_Ln = ?", GX_NOMASK, "TXPMQDDO1")
         ,new UpdateCursor("T017G12", "DELETE FROM TXPMQDDO1  WHERE EmprCod = ? AND MaqCod = ? AND Mq_Dia = ? AND Mq_Op = ? AND Mq_Ln = ?", GX_NOMASK, "TXPMQDDO1")
         ,new ForEachCursor("T017G13", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqCod, Mq_Dia, Mq_Op, Mq_Ln FROM TXPMQDDO1 WHERE EmprCod = ? and MaqCod = ? and Mq_Dia = ? and Mq_Op = ? and Mq_Ln = ? ORDER BY EmprCod, MaqCod, Mq_Dia, Mq_Op, Mq_Ln ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017G14", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017G15", "SELECT EmprCod FROM TXPMQDDOP WHERE EmprCod = ? AND MaqCod = ? AND Mq_Dia = ? AND Mq_Op = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((String[]) buf[12])[0] = rslt.getString(8, 6);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(9);
               ((int[]) buf[14])[0] = rslt.getInt(10);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((String[]) buf[12])[0] = rslt.getString(8, 6);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(9);
               ((int[]) buf[14])[0] = rslt.getInt(10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((String[]) buf[14])[0] = rslt.getString(9, 6);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(10);
               ((int[]) buf[16])[0] = rslt.getInt(11);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[4], false);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[6], false);
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
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[10], 2);
               }
               stmt.setString(7, (String)parms[11], 3);
               stmt.setString(8, (String)parms[12], 6);
               stmt.setDate(9, (java.util.Date)parms[13]);
               stmt.setInt(10, ((Number) parms[14]).intValue());
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], false);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], false);
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
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setString(7, (String)parms[11], 6);
               stmt.setDate(8, (java.util.Date)parms[12]);
               stmt.setInt(9, ((Number) parms[13]).intValue());
               stmt.setInt(10, ((Number) parms[14]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

