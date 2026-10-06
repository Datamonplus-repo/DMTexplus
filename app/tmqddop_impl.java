package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmqddop_impl extends GXDataArea
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
            A602MaqCod = httpContext.GetPar( "MaqCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A10111Mq_Dia = localUtil.parseDateParm( httpContext.GetPar( "Mq_Dia")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10111Mq_Dia", localUtil.format(A10111Mq_Dia, "99/99/99"));
            A10112Mq_Op = (int)(GXutil.lval( httpContext.GetPar( "Mq_Op"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10112Mq_Op", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10112Mq_Op), 6, 0));
            A10114Mq_Ln = (int)(GXutil.lval( httpContext.GetPar( "Mq_Ln"))) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CONTROL IN SECCION", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMq_Ultl_Internalname ;
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

   public tmqddop_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmqddop_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmqddop_impl.class ));
   }

   public tmqddop_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMQDDOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMQDDOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMQDDOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMQDDOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMQDDOP.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMQDDOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMQDDOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Código Máquina", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMQDDOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMQDDOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Dia IN Seccion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMQDDOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtMq_Dia_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMq_Dia_Internalname, localUtil.format(A10111Mq_Dia, "99/99/99"), localUtil.format( A10111Mq_Dia, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMq_Dia_Jsonclick, 0, "", "", "", "", "", 1, edtMq_Dia_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMQDDOP.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMq_Dia_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMq_Dia_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMQDDOP.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Operario IN Seccion", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMQDDOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMq_Op_Internalname, GXutil.ltrim( localUtil.ntoc( A10112Mq_Op, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMq_Op_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10112Mq_Op), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10112Mq_Op), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMq_Op_Jsonclick, 0, "", "", "", "", "", 1, edtMq_Op_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMQDDOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMQDDOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMQDDOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMQDDOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Linea Ultima", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMQDDOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMq_Ultl_Internalname, GXutil.ltrim( localUtil.ntoc( A10113Mq_Ultl, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMq_Ultl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10113Mq_Ultl), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10113Mq_Ultl), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMq_Ultl_Jsonclick, 0, "", "", "", "", "", 1, edtMq_Ultl_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMQDDOP.htm");
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
         nBlankRcdCount1371 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1371 = (short)(1) ;
            scanStart1701371( ) ;
            while ( RcdFound1371 != 0 )
            {
               init_level_properties1371( ) ;
               getByPrimaryKey1701371( ) ;
               addRow1701371( ) ;
               scanNext1701371( ) ;
            }
            scanEnd1701371( ) ;
            nBlankRcdCount1371 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1701371( ) ;
         standaloneModal1701371( ) ;
         sMode1371 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRow1701371( ) ;
            edtavnRcdDeleted_1371_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1371_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1371_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1371_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtMq_Ln_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_LN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMq_Ln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Ln_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtMq_Di_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_DI_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMq_Di_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Di_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtMq_Df_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_DF_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMq_Df_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Df_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtMq_Est_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_EST_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMq_Est_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Est_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtMq_Cont_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_CONT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMq_Cont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Cont_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtMq_Contf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_CONTF_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMq_Contf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Contf_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_1371 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1701371( ) ;
            }
            sendRow1701371( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode1371 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1371 = (short)(5) ;
         nRcdExists_1371 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1701371( ) ;
            while ( RcdFound1371 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_501371( ) ;
               init_level_properties1371( ) ;
               standaloneNotModal1701371( ) ;
               getByPrimaryKey1701371( ) ;
               standaloneModal1701371( ) ;
               addRow1701371( ) ;
               scanNext1701371( ) ;
            }
            scanEnd1701371( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1371 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_501371( ) ;
      initAll1701371( ) ;
      init_level_properties1371( ) ;
      nRcdExists_1371 = (short)(0) ;
      nIsMod_1371 = (short)(0) ;
      nRcdDeleted_1371 = (short)(0) ;
      nBlankRcdCount1371 = (short)(nBlankRcdUsr1371+nBlankRcdCount1371) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1371 > 0 )
      {
         standaloneNotModal1701371( ) ;
         standaloneModal1701371( ) ;
         addRow1701371( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMq_Di_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1371 = (short)(nBlankRcdCount1371-1) ;
      }
      Gx_mode = sMode1371 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMQDDOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMQDDOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMQDDOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMQDDOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TMQDDOP.htm");
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
      e111702 ();
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
            Z10113Mq_Ultl = (int)(localUtil.ctol( httpContext.cgiGet( "Z10113Mq_Ultl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMq_Ultl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMq_Ultl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MQ_ULTL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMq_Ultl_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10113Mq_Ultl = 0 ;
               n10113Mq_Ultl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10113Mq_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10113Mq_Ultl), 6, 0));
            }
            else
            {
               A10113Mq_Ultl = (int)(localUtil.ctol( httpContext.cgiGet( edtMq_Ultl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10113Mq_Ultl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10113Mq_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10113Mq_Ultl), 6, 0));
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
               A602MaqCod = httpContext.GetPar( "MaqCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
               A10111Mq_Dia = localUtil.parseDateParm( httpContext.GetPar( "Mq_Dia")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10111Mq_Dia", localUtil.format(A10111Mq_Dia, "99/99/99"));
               A10112Mq_Op = (int)(GXutil.lval( httpContext.GetPar( "Mq_Op"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10112Mq_Op", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10112Mq_Op), 6, 0));
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
                        e111702 ();
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
            initAll1701370( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1371_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1371_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      disableAttributes1701370( ) ;
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

   public void confirm_1700( )
   {
      beforeValidate1701370( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1701370( ) ;
         }
         else
         {
            checkExtendedTable1701370( ) ;
            if ( AnyError == 0 )
            {
               zm1701370( 7) ;
               zm1701370( 8) ;
            }
            closeExtendedTableCursors1701370( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1370 = Gx_mode ;
         confirm_1701371( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1370 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1370 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1700( ) ;
      }
   }

   public void confirm_1701371( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1701371( ) ;
         if ( ( nRcdExists_1371 != 0 ) || ( nIsMod_1371 != 0 ) )
         {
            getKey1701371( ) ;
            if ( ( nRcdExists_1371 == 0 ) && ( nRcdDeleted_1371 == 0 ) )
            {
               if ( RcdFound1371 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1701371( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1701371( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1701371( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound1371 != 0 )
               {
                  if ( nRcdDeleted_1371 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1701371( ) ;
                     load1701371( ) ;
                     beforeValidate1701371( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1701371( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1371 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1701371( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1701371( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1701371( ) ;
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
                  if ( nRcdDeleted_1371 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1371_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1371, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_Ln_Internalname, GXutil.ltrim( localUtil.ntoc( A10114Mq_Ln, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_Di_Internalname, localUtil.ttoc( A10115Mq_Di, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMq_Df_Internalname, localUtil.ttoc( A10116Mq_Df, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMq_Est_Internalname, GXutil.ltrim( localUtil.ntoc( A10117Mq_Est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_Cont_Internalname, GXutil.ltrim( localUtil.ntoc( A10118Mq_Cont, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_Contf_Internalname, GXutil.ltrim( localUtil.ntoc( A10179Mq_Contf, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10115Mq_Di_"+sGXsfl_50_idx, localUtil.ttoc( Z10115Mq_Di, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10116Mq_Df_"+sGXsfl_50_idx, localUtil.ttoc( Z10116Mq_Df, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10117Mq_Est_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10117Mq_Est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10118Mq_Cont_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10118Mq_Cont, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10179Mq_Contf_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10179Mq_Contf, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1371_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1371, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1371_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1371, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1371_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1371, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1371 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1371_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1371_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_LN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Ln_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_DI_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Di_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_DF_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Df_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_EST_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Est_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_CONT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Cont_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_CONTF_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Contf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1700( )
   {
   }

   public void e111702( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmqddop_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      tmqddop_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmqddop_impl.this.GXt_char1 = GXv_char2[0] ;
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
      tmqddop_impl.this.A396EmprCod = GXv_char2[0] ;
      tmqddop_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmqddop_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1701370( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10113Mq_Ultl = T01705_A10113Mq_Ultl[0] ;
         }
         else
         {
            Z10113Mq_Ultl = A10113Mq_Ultl ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z10111Mq_Dia = A10111Mq_Dia ;
         Z10112Mq_Op = A10112Mq_Op ;
         Z10113Mq_Ultl = A10113Mq_Ultl ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TMQDDOP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01706 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01706_A407EmprNom[0] ;
      n407EmprNom = T01706_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01707 */
      pr_default.execute(5, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(5);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion NO permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion NO permitida", ""), 1, "");
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

   public void load1701370( )
   {
      /* Using cursor T01708 */
      pr_default.execute(6, new Object[] {A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1370 = (short)(1) ;
         A407EmprNom = T01708_A407EmprNom[0] ;
         n407EmprNom = T01708_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10113Mq_Ultl = T01708_A10113Mq_Ultl[0] ;
         n10113Mq_Ultl = T01708_n10113Mq_Ultl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10113Mq_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10113Mq_Ultl), 6, 0));
         zm1701370( -6) ;
      }
      pr_default.close(6);
      onLoadActions1701370( ) ;
   }

   public void onLoadActions1701370( )
   {
   }

   public void checkExtendedTable1701370( )
   {
      nIsDirty_1370 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1701370( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1701370( )
   {
      /* Using cursor T01709 */
      pr_default.execute(7, new Object[] {A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1370 = (short)(1) ;
      }
      else
      {
         RcdFound1370 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01705 */
      pr_default.execute(3, new Object[] {A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op)});
      if ( (pr_default.getStatus(3) != 101) && GXutil.dateCompare(GXutil.resetTime(T01705_A10111Mq_Dia[0]), GXutil.resetTime(A10111Mq_Dia)) && ( T01705_A10112Mq_Op[0] == A10112Mq_Op ) && ( GXutil.strcmp(T01705_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01705_A602MaqCod[0], A602MaqCod) == 0 ) )
      {
         zm1701370( 6) ;
         RcdFound1370 = (short)(1) ;
         A10113Mq_Ultl = T01705_A10113Mq_Ultl[0] ;
         n10113Mq_Ultl = T01705_n10113Mq_Ultl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10113Mq_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10113Mq_Ultl), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z10111Mq_Dia = A10111Mq_Dia ;
         Z10112Mq_Op = A10112Mq_Op ;
         sMode1370 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1701370( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1370 = (short)(0) ;
            initializeNonKey1701370( ) ;
         }
         Gx_mode = sMode1370 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1370 = (short)(0) ;
         initializeNonKey1701370( ) ;
         sMode1370 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1370 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1701370( ) ;
      if ( RcdFound1370 == 0 )
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
      RcdFound1370 = (short)(0) ;
      /* Using cursor T017010 */
      pr_default.execute(8, new Object[] {A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T017010_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T017010_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T017010_A10111Mq_Dia[0]), GXutil.resetTime(A10111Mq_Dia)) && ( T017010_A10112Mq_Op[0] == A10112Mq_Op ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T017010_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T017010_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T017010_A10111Mq_Dia[0]), GXutil.resetTime(A10111Mq_Dia)) && ( T017010_A10112Mq_Op[0] == A10112Mq_Op ) )
         {
            RcdFound1370 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1370 = (short)(0) ;
      /* Using cursor T017011 */
      pr_default.execute(9, new Object[] {A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T017011_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T017011_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T017011_A10111Mq_Dia[0]), GXutil.resetTime(A10111Mq_Dia)) && ( T017011_A10112Mq_Op[0] == A10112Mq_Op ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T017011_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T017011_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T017011_A10111Mq_Dia[0]), GXutil.resetTime(A10111Mq_Dia)) && ( T017011_A10112Mq_Op[0] == A10112Mq_Op ) )
         {
            RcdFound1370 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1701370( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMq_Ultl_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1701370( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1370 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10111Mq_Dia), GXutil.resetTime(Z10111Mq_Dia)) ) || ( A10112Mq_Op != Z10112Mq_Op ) )
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
               GX_FocusControl = edtMq_Ultl_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1701370( ) ;
               GX_FocusControl = edtMq_Ultl_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10111Mq_Dia), GXutil.resetTime(Z10111Mq_Dia)) ) || ( A10112Mq_Op != Z10112Mq_Op ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMq_Ultl_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1701370( ) ;
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
                  GX_FocusControl = edtMq_Ultl_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1701370( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10111Mq_Dia), GXutil.resetTime(Z10111Mq_Dia)) ) || ( A10112Mq_Op != Z10112Mq_Op ) )
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
         GX_FocusControl = edtMq_Ultl_Internalname ;
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
      getKey1701370( ) ;
      if ( RcdFound1370 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10111Mq_Dia), GXutil.resetTime(Z10111Mq_Dia)) ) || ( A10112Mq_Op != Z10112Mq_Op ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10111Mq_Dia), GXutil.resetTime(Z10111Mq_Dia)) ) || ( A10112Mq_Op != Z10112Mq_Op ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmqddop");
      GX_FocusControl = edtMq_Ultl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1700( ) ;
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
      if ( RcdFound1370 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMq_Ultl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1701370( ) ;
      if ( RcdFound1370 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMq_Ultl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1701370( ) ;
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
      if ( RcdFound1370 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMq_Ultl_Internalname ;
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
      if ( RcdFound1370 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMq_Ultl_Internalname ;
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
      scanStart1701370( ) ;
      if ( RcdFound1370 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1370 != 0 )
         {
            scanNext1701370( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMq_Ultl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1701370( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1701370( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01704 */
         pr_default.execute(2, new Object[] {A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMQDDOP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z10113Mq_Ultl != T01704_A10113Mq_Ultl[0] ) )
         {
            if ( Z10113Mq_Ultl != T01704_A10113Mq_Ultl[0] )
            {
               GXutil.writeLogln("tmqddop:[seudo value changed for attri]"+"Mq_Ultl");
               GXutil.writeLogRaw("Old: ",Z10113Mq_Ultl);
               GXutil.writeLogRaw("Current: ",T01704_A10113Mq_Ultl[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMQDDOP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1701370( )
   {
      beforeValidate1701370( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1701370( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1701370( 0) ;
         checkOptimisticConcurrency1701370( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1701370( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1701370( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017012 */
                  pr_default.execute(10, new Object[] {A10111Mq_Dia, Integer.valueOf(A10112Mq_Op), Boolean.valueOf(n10113Mq_Ultl), Integer.valueOf(A10113Mq_Ultl), A396EmprCod, A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMQDDOP");
                  if ( (pr_default.getStatus(10) == 1) )
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
                        processLevel1701370( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1700( ) ;
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
            load1701370( ) ;
         }
         endLevel1701370( ) ;
      }
      closeExtendedTableCursors1701370( ) ;
   }

   public void update1701370( )
   {
      beforeValidate1701370( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1701370( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1701370( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1701370( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1701370( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017013 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n10113Mq_Ultl), Integer.valueOf(A10113Mq_Ultl), A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMQDDOP");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMQDDOP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1701370( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1701370( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1700( ) ;
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
         endLevel1701370( ) ;
      }
      closeExtendedTableCursors1701370( ) ;
   }

   public void deferredUpdate1701370( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1701370( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1701370( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1701370( ) ;
         afterConfirm1701370( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1701370( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T017014 */
               pr_default.execute(12, new Object[] {A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMQDDOP");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1370 == 0 )
                     {
                        initAll1701370( ) ;
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
                     resetCaption1700( ) ;
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
      sMode1370 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1701370( ) ;
      Gx_mode = sMode1370 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1701370( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1701371( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1701371( ) ;
         if ( ( nRcdExists_1371 != 0 ) || ( nIsMod_1371 != 0 ) )
         {
            standaloneNotModal1701371( ) ;
            getKey1701371( ) ;
            if ( ( nRcdExists_1371 == 0 ) && ( nRcdDeleted_1371 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1701371( ) ;
            }
            else
            {
               if ( RcdFound1371 != 0 )
               {
                  if ( ( nRcdDeleted_1371 != 0 ) && ( nRcdExists_1371 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1701371( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1371 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1701371( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1371 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1371_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1371, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_Ln_Internalname, GXutil.ltrim( localUtil.ntoc( A10114Mq_Ln, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_Di_Internalname, localUtil.ttoc( A10115Mq_Di, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMq_Df_Internalname, localUtil.ttoc( A10116Mq_Df, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMq_Est_Internalname, GXutil.ltrim( localUtil.ntoc( A10117Mq_Est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_Cont_Internalname, GXutil.ltrim( localUtil.ntoc( A10118Mq_Cont, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMq_Contf_Internalname, GXutil.ltrim( localUtil.ntoc( A10179Mq_Contf, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10115Mq_Di_"+sGXsfl_50_idx, localUtil.ttoc( Z10115Mq_Di, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10116Mq_Df_"+sGXsfl_50_idx, localUtil.ttoc( Z10116Mq_Df, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10117Mq_Est_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10117Mq_Est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10118Mq_Cont_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10118Mq_Cont, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10179Mq_Contf_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10179Mq_Contf, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1371_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1371, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1371_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1371, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1371_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1371, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1371 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1371_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1371_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_LN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Ln_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_DI_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Di_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_DF_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Df_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_EST_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Est_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_CONT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Cont_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MQ_CONTF_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Contf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1701371( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1371 = (short)(0) ;
      nIsMod_1371 = (short)(0) ;
      nRcdDeleted_1371 = (short)(0) ;
   }

   public void processLevel1701370( )
   {
      /* Save parent mode. */
      sMode1370 = Gx_mode ;
      processNestedLevel1701371( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1370 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1701370( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1701370( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmqddop");
         if ( AnyError == 0 )
         {
            confirmValues1700( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmqddop");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1701370( )
   {
      /* Scan By routine */
      /* Using cursor T017015 */
      pr_default.execute(13, new Object[] {A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op)});
      RcdFound1370 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1370 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1701370( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1370 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1370 = (short)(1) ;
      }
   }

   public void scanEnd1701370( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1701370( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1701370( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1701370( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1701370( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1701370( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1701370( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1701370( )
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
      edtMq_Ultl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Ultl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Ultl_Enabled), 5, 0), true);
      edtMq_Ln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Ln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Ln_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void zm1701371( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10115Mq_Di = T01703_A10115Mq_Di[0] ;
            Z10116Mq_Df = T01703_A10116Mq_Df[0] ;
            Z10117Mq_Est = T01703_A10117Mq_Est[0] ;
            Z10118Mq_Cont = T01703_A10118Mq_Cont[0] ;
            Z10179Mq_Contf = T01703_A10179Mq_Contf[0] ;
         }
         else
         {
            Z10115Mq_Di = A10115Mq_Di ;
            Z10116Mq_Df = A10116Mq_Df ;
            Z10117Mq_Est = A10117Mq_Est ;
            Z10118Mq_Cont = A10118Mq_Cont ;
            Z10179Mq_Contf = A10179Mq_Contf ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z602MaqCod = A602MaqCod ;
         Z10111Mq_Dia = A10111Mq_Dia ;
         Z10112Mq_Op = A10112Mq_Op ;
         Z10114Mq_Ln = A10114Mq_Ln ;
         Z10115Mq_Di = A10115Mq_Di ;
         Z10116Mq_Df = A10116Mq_Df ;
         Z10117Mq_Est = A10117Mq_Est ;
         Z10118Mq_Cont = A10118Mq_Cont ;
         Z10179Mq_Contf = A10179Mq_Contf ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1701371( )
   {
      edtMq_Est_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Est_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Est_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void standaloneModal1701371( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMq_Ln_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMq_Ln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Ln_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtMq_Ln_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMq_Ln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Ln_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void load1701371( )
   {
      /* Using cursor T017016 */
      pr_default.execute(14, new Object[] {A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op), Integer.valueOf(A10114Mq_Ln)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1371 = (short)(1) ;
         A10115Mq_Di = T017016_A10115Mq_Di[0] ;
         n10115Mq_Di = T017016_n10115Mq_Di[0] ;
         A10116Mq_Df = T017016_A10116Mq_Df[0] ;
         n10116Mq_Df = T017016_n10116Mq_Df[0] ;
         A10117Mq_Est = T017016_A10117Mq_Est[0] ;
         n10117Mq_Est = T017016_n10117Mq_Est[0] ;
         A10118Mq_Cont = T017016_A10118Mq_Cont[0] ;
         n10118Mq_Cont = T017016_n10118Mq_Cont[0] ;
         A10179Mq_Contf = T017016_A10179Mq_Contf[0] ;
         n10179Mq_Contf = T017016_n10179Mq_Contf[0] ;
         zm1701371( -9) ;
      }
      pr_default.close(14);
      onLoadActions1701371( ) ;
   }

   public void onLoadActions1701371( )
   {
   }

   public void checkExtendedTable1701371( )
   {
      nIsDirty_1371 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1701371( ) ;
   }

   public void closeExtendedTableCursors1701371( )
   {
   }

   public void enableDisable1701371( )
   {
   }

   public void getKey1701371( )
   {
      /* Using cursor T017017 */
      pr_default.execute(15, new Object[] {A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op), Integer.valueOf(A10114Mq_Ln)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1371 = (short)(1) ;
      }
      else
      {
         RcdFound1371 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey1701371( )
   {
      /* Using cursor T01703 */
      pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op), Integer.valueOf(A10114Mq_Ln)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01703_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T01703_A10111Mq_Dia[0]), GXutil.resetTime(A10111Mq_Dia)) && ( T01703_A10112Mq_Op[0] == A10112Mq_Op ) && ( T01703_A10114Mq_Ln[0] == A10114Mq_Ln ) && ( GXutil.strcmp(T01703_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1701371( 9) ;
         RcdFound1371 = (short)(1) ;
         initializeNonKey1701371( ) ;
         A10115Mq_Di = T01703_A10115Mq_Di[0] ;
         n10115Mq_Di = T01703_n10115Mq_Di[0] ;
         A10116Mq_Df = T01703_A10116Mq_Df[0] ;
         n10116Mq_Df = T01703_n10116Mq_Df[0] ;
         A10117Mq_Est = T01703_A10117Mq_Est[0] ;
         n10117Mq_Est = T01703_n10117Mq_Est[0] ;
         A10118Mq_Cont = T01703_A10118Mq_Cont[0] ;
         n10118Mq_Cont = T01703_n10118Mq_Cont[0] ;
         A10179Mq_Contf = T01703_A10179Mq_Contf[0] ;
         n10179Mq_Contf = T01703_n10179Mq_Contf[0] ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z10111Mq_Dia = A10111Mq_Dia ;
         Z10112Mq_Op = A10112Mq_Op ;
         Z10114Mq_Ln = A10114Mq_Ln ;
         sMode1371 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1701371( ) ;
         load1701371( ) ;
         Gx_mode = sMode1371 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1371 = (short)(0) ;
         initializeNonKey1701371( ) ;
         sMode1371 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1701371( ) ;
         Gx_mode = sMode1371 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1701371( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1701371( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01702 */
         pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op), Integer.valueOf(A10114Mq_Ln)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMQDDO1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(Z10115Mq_Di, T01702_A10115Mq_Di[0]) ) || !( GXutil.dateCompare(Z10116Mq_Df, T01702_A10116Mq_Df[0]) ) || ( Z10117Mq_Est != T01702_A10117Mq_Est[0] ) || ( DecimalUtil.compareTo(Z10118Mq_Cont, T01702_A10118Mq_Cont[0]) != 0 ) || ( DecimalUtil.compareTo(Z10179Mq_Contf, T01702_A10179Mq_Contf[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(Z10115Mq_Di, T01702_A10115Mq_Di[0]) ) )
            {
               GXutil.writeLogln("tmqddop:[seudo value changed for attri]"+"Mq_Di");
               GXutil.writeLogRaw("Old: ",Z10115Mq_Di);
               GXutil.writeLogRaw("Current: ",T01702_A10115Mq_Di[0]);
            }
            if ( !( GXutil.dateCompare(Z10116Mq_Df, T01702_A10116Mq_Df[0]) ) )
            {
               GXutil.writeLogln("tmqddop:[seudo value changed for attri]"+"Mq_Df");
               GXutil.writeLogRaw("Old: ",Z10116Mq_Df);
               GXutil.writeLogRaw("Current: ",T01702_A10116Mq_Df[0]);
            }
            if ( Z10117Mq_Est != T01702_A10117Mq_Est[0] )
            {
               GXutil.writeLogln("tmqddop:[seudo value changed for attri]"+"Mq_Est");
               GXutil.writeLogRaw("Old: ",Z10117Mq_Est);
               GXutil.writeLogRaw("Current: ",T01702_A10117Mq_Est[0]);
            }
            if ( DecimalUtil.compareTo(Z10118Mq_Cont, T01702_A10118Mq_Cont[0]) != 0 )
            {
               GXutil.writeLogln("tmqddop:[seudo value changed for attri]"+"Mq_Cont");
               GXutil.writeLogRaw("Old: ",Z10118Mq_Cont);
               GXutil.writeLogRaw("Current: ",T01702_A10118Mq_Cont[0]);
            }
            if ( DecimalUtil.compareTo(Z10179Mq_Contf, T01702_A10179Mq_Contf[0]) != 0 )
            {
               GXutil.writeLogln("tmqddop:[seudo value changed for attri]"+"Mq_Contf");
               GXutil.writeLogRaw("Old: ",Z10179Mq_Contf);
               GXutil.writeLogRaw("Current: ",T01702_A10179Mq_Contf[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMQDDO1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1701371( )
   {
      beforeValidate1701371( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1701371( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1701371( 0) ;
         checkOptimisticConcurrency1701371( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1701371( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1701371( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017018 */
                  pr_default.execute(16, new Object[] {A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op), Integer.valueOf(A10114Mq_Ln), Boolean.valueOf(n10115Mq_Di), A10115Mq_Di, Boolean.valueOf(n10116Mq_Df), A10116Mq_Df, Boolean.valueOf(n10117Mq_Est), Byte.valueOf(A10117Mq_Est), Boolean.valueOf(n10118Mq_Cont), A10118Mq_Cont, Boolean.valueOf(n10179Mq_Contf), A10179Mq_Contf, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMQDDO1");
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
            load1701371( ) ;
         }
         endLevel1701371( ) ;
      }
      closeExtendedTableCursors1701371( ) ;
   }

   public void update1701371( )
   {
      beforeValidate1701371( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1701371( ) ;
      }
      if ( ( nIsMod_1371 != 0 ) || ( nIsDirty_1371 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1701371( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1701371( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1701371( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T017019 */
                     pr_default.execute(17, new Object[] {Boolean.valueOf(n10115Mq_Di), A10115Mq_Di, Boolean.valueOf(n10116Mq_Df), A10116Mq_Df, Boolean.valueOf(n10117Mq_Est), Byte.valueOf(A10117Mq_Est), Boolean.valueOf(n10118Mq_Cont), A10118Mq_Cont, Boolean.valueOf(n10179Mq_Contf), A10179Mq_Contf, A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op), Integer.valueOf(A10114Mq_Ln)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMQDDO1");
                     if ( (pr_default.getStatus(17) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMQDDO1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1701371( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1701371( ) ;
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
            endLevel1701371( ) ;
         }
      }
      closeExtendedTableCursors1701371( ) ;
   }

   public void deferredUpdate1701371( )
   {
   }

   public void delete1701371( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1701371( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1701371( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1701371( ) ;
         afterConfirm1701371( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1701371( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T017020 */
               pr_default.execute(18, new Object[] {A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op), Integer.valueOf(A10114Mq_Ln)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMQDDO1");
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
      sMode1371 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1701371( ) ;
      Gx_mode = sMode1371 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1701371( )
   {
      standaloneModal1701371( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1701371( )
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

   public void scanStart1701371( )
   {
      /* Scan By routine */
      /* Using cursor T017021 */
      pr_default.execute(19, new Object[] {A396EmprCod, A602MaqCod, A10111Mq_Dia, Integer.valueOf(A10112Mq_Op), Integer.valueOf(A10114Mq_Ln)});
      RcdFound1371 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1371 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1701371( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound1371 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1371 = (short)(1) ;
      }
   }

   public void scanEnd1701371( )
   {
      pr_default.close(19);
   }

   public void afterConfirm1701371( )
   {
      /* After Confirm Rules */
      if ( ( A10118Mq_Cont.doubleValue() == 0 ) && ( GXutil.strcmp(A602MaqCod, httpContext.getMessage( "TIBL", "")) == 0 ) && true /* After */ )
      {
         GXCCtl = "MQ_CONT_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO se permite valor 0¡¡¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMq_Cont_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( ( A10179Mq_Contf.doubleValue() == 0 ) && ( GXutil.strcmp(A602MaqCod, httpContext.getMessage( "TIBL", "")) == 0 ) && true /* After */ )
      {
         GXCCtl = "MQ_CONTF_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO se permite valor 0¡¡¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMq_Contf_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1701371( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1701371( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1701371( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1701371( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1701371( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1701371( )
   {
      edtMq_Di_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Di_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Di_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtMq_Df_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Df_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Df_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtMq_Est_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Est_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Est_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtMq_Cont_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Cont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Cont_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtMq_Contf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Contf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Contf_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashes1701371( )
   {
   }

   public void send_integrity_lvl_hashes1701370( )
   {
   }

   public void subsflControlProps_501371( )
   {
      edtavnRcdDeleted_1371_Internalname = "vNRCDDELETED_1371_"+sGXsfl_50_idx ;
      edtMq_Ln_Internalname = "MQ_LN_"+sGXsfl_50_idx ;
      edtMq_Di_Internalname = "MQ_DI_"+sGXsfl_50_idx ;
      edtMq_Df_Internalname = "MQ_DF_"+sGXsfl_50_idx ;
      edtMq_Est_Internalname = "MQ_EST_"+sGXsfl_50_idx ;
      edtMq_Cont_Internalname = "MQ_CONT_"+sGXsfl_50_idx ;
      edtMq_Contf_Internalname = "MQ_CONTF_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_501371( )
   {
      edtavnRcdDeleted_1371_Internalname = "vNRCDDELETED_1371_"+sGXsfl_50_fel_idx ;
      edtMq_Ln_Internalname = "MQ_LN_"+sGXsfl_50_fel_idx ;
      edtMq_Di_Internalname = "MQ_DI_"+sGXsfl_50_fel_idx ;
      edtMq_Df_Internalname = "MQ_DF_"+sGXsfl_50_fel_idx ;
      edtMq_Est_Internalname = "MQ_EST_"+sGXsfl_50_fel_idx ;
      edtMq_Cont_Internalname = "MQ_CONT_"+sGXsfl_50_fel_idx ;
      edtMq_Contf_Internalname = "MQ_CONTF_"+sGXsfl_50_fel_idx ;
   }

   public void addRow1701371( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501371( ) ;
      sendRow1701371( ) ;
   }

   public void sendRow1701371( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1371_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1371_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1371, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1371_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1371), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1371), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1371_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1371_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMq_Ln_Internalname,GXutil.ltrim( localUtil.ntoc( A10114Mq_Ln, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10114Mq_Ln), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMq_Ln_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMq_Ln_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1371_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMq_Di_Internalname,localUtil.ttoc( A10115Mq_Di, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10115Mq_Di, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMq_Di_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMq_Di_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1371_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMq_Df_Internalname,localUtil.ttoc( A10116Mq_Df, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10116Mq_Df, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMq_Df_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMq_Df_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMq_Est_Internalname,GXutil.ltrim( localUtil.ntoc( A10117Mq_Est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMq_Est_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10117Mq_Est), "9") : localUtil.format( DecimalUtil.doubleToDec(A10117Mq_Est), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMq_Est_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMq_Est_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1371_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMq_Cont_Internalname,GXutil.ltrim( localUtil.ntoc( A10118Mq_Cont, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMq_Cont_Enabled!=0) ? localUtil.format( A10118Mq_Cont, "ZZZZZZ9.99") : localUtil.format( A10118Mq_Cont, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMq_Cont_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMq_Cont_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1371_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMq_Contf_Internalname,GXutil.ltrim( localUtil.ntoc( A10179Mq_Contf, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMq_Contf_Enabled!=0) ? localUtil.format( A10179Mq_Contf, "ZZZZZZ9.99") : localUtil.format( A10179Mq_Contf, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMq_Contf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMq_Contf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1701371( ) ;
      GXCCtl = "Z10115Mq_Di_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z10115Mq_Di, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z10116Mq_Df_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z10116Mq_Df, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z10117Mq_Est_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10117Mq_Est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10118Mq_Cont_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10118Mq_Cont, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10179Mq_Contf_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10179Mq_Contf, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1371_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1371, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1371_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1371, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1371_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1371, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1371_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1371_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQ_LN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Ln_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQ_DI_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Di_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQ_DF_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Df_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQ_EST_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Est_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQ_CONT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Cont_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MQ_CONTF_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Contf_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1701371( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501371( ) ;
      edtavnRcdDeleted_1371_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1371_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMq_Ln_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_LN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMq_Di_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_DI_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMq_Df_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_DF_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMq_Est_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_EST_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMq_Cont_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_CONT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMq_Contf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MQ_CONTF_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1371_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1371_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1371");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1371_Internalname ;
         wbErr = true ;
         nRcdDeleted_1371 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1371 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1371_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A10114Mq_Ln = (int)(localUtil.ctol( httpContext.cgiGet( edtMq_Ln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtMq_Di_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "MQ_DI_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMq_Di_Internalname ;
         wbErr = true ;
         A10115Mq_Di = GXutil.resetTime( GXutil.nullDate() );
         n10115Mq_Di = false ;
      }
      else
      {
         A10115Mq_Di = localUtil.ctot( httpContext.cgiGet( edtMq_Di_Internalname)) ;
         n10115Mq_Di = false ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtMq_Df_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "MQ_DF_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMq_Df_Internalname ;
         wbErr = true ;
         A10116Mq_Df = GXutil.resetTime( GXutil.nullDate() );
         n10116Mq_Df = false ;
      }
      else
      {
         A10116Mq_Df = localUtil.ctot( httpContext.cgiGet( edtMq_Df_Internalname)) ;
         n10116Mq_Df = false ;
      }
      A10117Mq_Est = (byte)(localUtil.ctol( httpContext.cgiGet( edtMq_Est_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n10117Mq_Est = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMq_Cont_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMq_Cont_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "MQ_CONT_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMq_Cont_Internalname ;
         wbErr = true ;
         A10118Mq_Cont = DecimalUtil.ZERO ;
         n10118Mq_Cont = false ;
      }
      else
      {
         A10118Mq_Cont = localUtil.ctond( httpContext.cgiGet( edtMq_Cont_Internalname)) ;
         n10118Mq_Cont = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMq_Contf_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMq_Contf_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "MQ_CONTF_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMq_Contf_Internalname ;
         wbErr = true ;
         A10179Mq_Contf = DecimalUtil.ZERO ;
         n10179Mq_Contf = false ;
      }
      else
      {
         A10179Mq_Contf = localUtil.ctond( httpContext.cgiGet( edtMq_Contf_Internalname)) ;
         n10179Mq_Contf = false ;
      }
      GXCCtl = "Z10115Mq_Di_" + sGXsfl_50_idx ;
      Z10115Mq_Di = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z10116Mq_Df_" + sGXsfl_50_idx ;
      Z10116Mq_Df = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z10117Mq_Est_" + sGXsfl_50_idx ;
      Z10117Mq_Est = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10118Mq_Cont_" + sGXsfl_50_idx ;
      Z10118Mq_Cont = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10179Mq_Contf_" + sGXsfl_50_idx ;
      Z10179Mq_Contf = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1371_" + sGXsfl_50_idx ;
      nRcdDeleted_1371 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1371_" + sGXsfl_50_idx ;
      nRcdExists_1371 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1371_" + sGXsfl_50_idx ;
      nIsMod_1371 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMq_Est_Enabled = edtMq_Est_Enabled ;
      defedtMq_Ln_Enabled = edtMq_Ln_Enabled ;
   }

   public void confirmValues1700( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501371( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501371( ) ;
         httpContext.changePostValue( "Z10115Mq_Di_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10115Mq_Di_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10115Mq_Di_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10116Mq_Df_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10116Mq_Df_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10116Mq_Df_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10117Mq_Est_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10117Mq_Est_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10117Mq_Est_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10118Mq_Cont_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10118Mq_Cont_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10118Mq_Cont_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10179Mq_Contf_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10179Mq_Contf_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10179Mq_Contf_"+sGXsfl_50_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tmqddop", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.formatDateParm(A10111Mq_Dia)),GXutil.URLEncode(GXutil.ltrimstr(A10112Mq_Op,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A10114Mq_Ln,6,0))}, new String[] {"EmprCod","MaqCod","Mq_Dia","Mq_Op","Mq_Ln"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10113Mq_Ultl", GXutil.ltrim( localUtil.ntoc( Z10113Mq_Ultl, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tmqddop", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.formatDateParm(A10111Mq_Dia)),GXutil.URLEncode(GXutil.ltrimstr(A10112Mq_Op,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A10114Mq_Ln,6,0))}, new String[] {"EmprCod","MaqCod","Mq_Dia","Mq_Op","Mq_Ln"})  ;
   }

   public String getPgmname( )
   {
      return "TMQDDOP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CONTROL IN SECCION", "") ;
   }

   public void initializeNonKey1701370( )
   {
      A10113Mq_Ultl = 0 ;
      n10113Mq_Ultl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10113Mq_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10113Mq_Ultl), 6, 0));
      Z10113Mq_Ultl = 0 ;
   }

   public void initAll1701370( )
   {
      initializeNonKey1701370( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1701371( )
   {
      A10115Mq_Di = GXutil.resetTime( GXutil.nullDate() );
      n10115Mq_Di = false ;
      A10116Mq_Df = GXutil.resetTime( GXutil.nullDate() );
      n10116Mq_Df = false ;
      A10117Mq_Est = (byte)(0) ;
      n10117Mq_Est = false ;
      A10118Mq_Cont = DecimalUtil.ZERO ;
      n10118Mq_Cont = false ;
      A10179Mq_Contf = DecimalUtil.ZERO ;
      n10179Mq_Contf = false ;
      Z10115Mq_Di = GXutil.resetTime( GXutil.nullDate() );
      Z10116Mq_Df = GXutil.resetTime( GXutil.nullDate() );
      Z10117Mq_Est = (byte)(0) ;
      Z10118Mq_Cont = DecimalUtil.ZERO ;
      Z10179Mq_Contf = DecimalUtil.ZERO ;
   }

   public void initAll1701371( )
   {
      initializeNonKey1701371( ) ;
   }

   public void standaloneModalInsert1701371( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824155284", true, true);
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
      httpContext.AddJavascriptSource("tmqddop.js", "?2026824155284", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1371( )
   {
      edtMq_Est_Enabled = defedtMq_Est_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Est_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Est_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtMq_Ln_Enabled = defedtMq_Ln_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMq_Ln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMq_Ln_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1371, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1371_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10114Mq_Ln, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Ln_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A10115Mq_Di, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Di_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A10116Mq_Df, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Df_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10117Mq_Est, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Est_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10118Mq_Cont, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Cont_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10179Mq_Contf, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMq_Contf_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtMaqCod_Internalname = "MAQCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtMq_Dia_Internalname = "MQ_DIA" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtMq_Op_Internalname = "MQ_OP" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtMq_Ultl_Internalname = "MQ_ULTL" ;
      edtavnRcdDeleted_1371_Internalname = "vNRCDDELETED_1371" ;
      edtMq_Ln_Internalname = "MQ_LN" ;
      edtMq_Di_Internalname = "MQ_DI" ;
      edtMq_Df_Internalname = "MQ_DF" ;
      edtMq_Est_Internalname = "MQ_EST" ;
      edtMq_Cont_Internalname = "MQ_CONT" ;
      edtMq_Contf_Internalname = "MQ_CONTF" ;
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
      Form.setCaption( httpContext.getMessage( "CONTROL IN SECCION", "") );
      edtMq_Contf_Jsonclick = "" ;
      edtMq_Cont_Jsonclick = "" ;
      edtMq_Est_Jsonclick = "" ;
      edtMq_Df_Jsonclick = "" ;
      edtMq_Di_Jsonclick = "" ;
      edtMq_Ln_Jsonclick = "" ;
      edtavnRcdDeleted_1371_Jsonclick = "" ;
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
      edtMq_Contf_Enabled = 1 ;
      edtMq_Cont_Enabled = 1 ;
      edtMq_Est_Enabled = 0 ;
      edtMq_Df_Enabled = 1 ;
      edtMq_Di_Enabled = 1 ;
      edtMq_Ln_Enabled = 0 ;
      edtavnRcdDeleted_1371_Enabled = 1 ;
      edtMq_Ultl_Jsonclick = "" ;
      edtMq_Ultl_Backcolor = (int)(0xFFFFFF) ;
      edtMq_Ultl_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_501371( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1701371( ) ;
         standaloneModal1701371( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1701371( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501371( ) ;
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
      /* Using cursor T017022 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017022_A407EmprNom[0] ;
      n407EmprNom = T017022_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(20);
      /* Using cursor T017023 */
      pr_default.execute(21, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(21);
      GX_FocusControl = edtMq_Ultl_Internalname ;
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

   public void valid_Mq_op( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10113Mq_Ultl", GXutil.ltrim( localUtil.ntoc( A10113Mq_Ultl, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10114Mq_Ln", GXutil.ltrim( localUtil.ntoc( A10114Mq_Ln, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10111Mq_Dia", localUtil.format(Z10111Mq_Dia, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10112Mq_Op", GXutil.ltrim( localUtil.ntoc( Z10112Mq_Op, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10113Mq_Ultl", GXutil.ltrim( localUtil.ntoc( Z10113Mq_Ultl, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10114Mq_Ln", GXutil.ltrim( localUtil.ntoc( Z10114Mq_Ln, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
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
      setEventMetadata("VALID_MQ_OP","{handler:'valid_Mq_op',iparms:[{av:'A10114Mq_Ln',fld:'MQ_LN',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A10111Mq_Dia',fld:'MQ_DIA',pic:''},{av:'A10112Mq_Op',fld:'MQ_OP',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MQ_OP",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10113Mq_Ultl',fld:'MQ_ULTL',pic:'ZZZZZ9'},{av:'A10114Mq_Ln',fld:'MQ_LN',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z602MaqCod'},{av:'Z10111Mq_Dia'},{av:'Z10112Mq_Op'},{av:'Z407EmprNom'},{av:'Z10113Mq_Ultl'},{av:'Z10114Mq_Ln'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MQ_LN","{handler:'valid_Mq_ln',iparms:[]");
      setEventMetadata("VALID_MQ_LN",",oparms:[]}");
      setEventMetadata("VALID_MQ_CONT","{handler:'valid_Mq_cont',iparms:[]");
      setEventMetadata("VALID_MQ_CONT",",oparms:[]}");
      setEventMetadata("VALID_MQ_CONTF","{handler:'valid_Mq_contf',iparms:[]");
      setEventMetadata("VALID_MQ_CONTF",",oparms:[]}");
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
      pr_default.close(20);
      pr_default.close(21);
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
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A10111Mq_Dia = GXutil.nullDate() ;
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
      sMode1371 = "" ;
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
      sMode1370 = "" ;
      A10115Mq_Di = GXutil.resetTime( GXutil.nullDate() );
      A10116Mq_Df = GXutil.resetTime( GXutil.nullDate() );
      A10118Mq_Cont = DecimalUtil.ZERO ;
      A10179Mq_Contf = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV14Lit2 = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      T01706_A407EmprNom = new String[] {""} ;
      T01706_n407EmprNom = new boolean[] {false} ;
      T01707_A396EmprCod = new String[] {""} ;
      T01708_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01708_A10112Mq_Op = new int[1] ;
      T01708_A407EmprNom = new String[] {""} ;
      T01708_n407EmprNom = new boolean[] {false} ;
      T01708_A10113Mq_Ultl = new int[1] ;
      T01708_n10113Mq_Ultl = new boolean[] {false} ;
      T01708_A396EmprCod = new String[] {""} ;
      T01708_A602MaqCod = new String[] {""} ;
      T01709_A396EmprCod = new String[] {""} ;
      T01709_A602MaqCod = new String[] {""} ;
      T01709_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01709_A10112Mq_Op = new int[1] ;
      T01705_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01705_A10112Mq_Op = new int[1] ;
      T01705_A10113Mq_Ultl = new int[1] ;
      T01705_n10113Mq_Ultl = new boolean[] {false} ;
      T01705_A396EmprCod = new String[] {""} ;
      T01705_A602MaqCod = new String[] {""} ;
      T017010_A396EmprCod = new String[] {""} ;
      T017010_A602MaqCod = new String[] {""} ;
      T017010_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017010_A10112Mq_Op = new int[1] ;
      T017011_A396EmprCod = new String[] {""} ;
      T017011_A602MaqCod = new String[] {""} ;
      T017011_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017011_A10112Mq_Op = new int[1] ;
      T01704_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01704_A10112Mq_Op = new int[1] ;
      T01704_A10113Mq_Ultl = new int[1] ;
      T01704_n10113Mq_Ultl = new boolean[] {false} ;
      T01704_A396EmprCod = new String[] {""} ;
      T01704_A602MaqCod = new String[] {""} ;
      T017015_A396EmprCod = new String[] {""} ;
      T017015_A602MaqCod = new String[] {""} ;
      T017015_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017015_A10112Mq_Op = new int[1] ;
      T017016_A602MaqCod = new String[] {""} ;
      T017016_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017016_A10112Mq_Op = new int[1] ;
      T017016_A10114Mq_Ln = new int[1] ;
      T017016_A10115Mq_Di = new java.util.Date[] {GXutil.nullDate()} ;
      T017016_n10115Mq_Di = new boolean[] {false} ;
      T017016_A10116Mq_Df = new java.util.Date[] {GXutil.nullDate()} ;
      T017016_n10116Mq_Df = new boolean[] {false} ;
      T017016_A10117Mq_Est = new byte[1] ;
      T017016_n10117Mq_Est = new boolean[] {false} ;
      T017016_A10118Mq_Cont = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017016_n10118Mq_Cont = new boolean[] {false} ;
      T017016_A10179Mq_Contf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017016_n10179Mq_Contf = new boolean[] {false} ;
      T017016_A396EmprCod = new String[] {""} ;
      T017017_A396EmprCod = new String[] {""} ;
      T017017_A602MaqCod = new String[] {""} ;
      T017017_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017017_A10112Mq_Op = new int[1] ;
      T017017_A10114Mq_Ln = new int[1] ;
      T01703_A602MaqCod = new String[] {""} ;
      T01703_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01703_A10112Mq_Op = new int[1] ;
      T01703_A10114Mq_Ln = new int[1] ;
      T01703_A10115Mq_Di = new java.util.Date[] {GXutil.nullDate()} ;
      T01703_n10115Mq_Di = new boolean[] {false} ;
      T01703_A10116Mq_Df = new java.util.Date[] {GXutil.nullDate()} ;
      T01703_n10116Mq_Df = new boolean[] {false} ;
      T01703_A10117Mq_Est = new byte[1] ;
      T01703_n10117Mq_Est = new boolean[] {false} ;
      T01703_A10118Mq_Cont = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01703_n10118Mq_Cont = new boolean[] {false} ;
      T01703_A10179Mq_Contf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01703_n10179Mq_Contf = new boolean[] {false} ;
      T01703_A396EmprCod = new String[] {""} ;
      T01702_A602MaqCod = new String[] {""} ;
      T01702_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01702_A10112Mq_Op = new int[1] ;
      T01702_A10114Mq_Ln = new int[1] ;
      T01702_A10115Mq_Di = new java.util.Date[] {GXutil.nullDate()} ;
      T01702_n10115Mq_Di = new boolean[] {false} ;
      T01702_A10116Mq_Df = new java.util.Date[] {GXutil.nullDate()} ;
      T01702_n10116Mq_Df = new boolean[] {false} ;
      T01702_A10117Mq_Est = new byte[1] ;
      T01702_n10117Mq_Est = new boolean[] {false} ;
      T01702_A10118Mq_Cont = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01702_n10118Mq_Cont = new boolean[] {false} ;
      T01702_A10179Mq_Contf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01702_n10179Mq_Contf = new boolean[] {false} ;
      T01702_A396EmprCod = new String[] {""} ;
      T017021_A396EmprCod = new String[] {""} ;
      T017021_A602MaqCod = new String[] {""} ;
      T017021_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017021_A10112Mq_Op = new int[1] ;
      T017021_A10114Mq_Ln = new int[1] ;
      GXCCtl = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T017022_A407EmprNom = new String[] {""} ;
      T017022_n407EmprNom = new boolean[] {false} ;
      T017023_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ602MaqCod = "" ;
      ZZ10111Mq_Dia = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tmqddop__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmqddop__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmqddop__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmqddop__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmqddop__default(),
         new Object[] {
             new Object[] {
            T01702_A602MaqCod, T01702_A10111Mq_Dia, T01702_A10112Mq_Op, T01702_A10114Mq_Ln, T01702_A10115Mq_Di, T01702_n10115Mq_Di, T01702_A10116Mq_Df, T01702_n10116Mq_Df, T01702_A10117Mq_Est, T01702_n10117Mq_Est,
            T01702_A10118Mq_Cont, T01702_n10118Mq_Cont, T01702_A10179Mq_Contf, T01702_n10179Mq_Contf, T01702_A396EmprCod
            }
            , new Object[] {
            T01703_A602MaqCod, T01703_A10111Mq_Dia, T01703_A10112Mq_Op, T01703_A10114Mq_Ln, T01703_A10115Mq_Di, T01703_n10115Mq_Di, T01703_A10116Mq_Df, T01703_n10116Mq_Df, T01703_A10117Mq_Est, T01703_n10117Mq_Est,
            T01703_A10118Mq_Cont, T01703_n10118Mq_Cont, T01703_A10179Mq_Contf, T01703_n10179Mq_Contf, T01703_A396EmprCod
            }
            , new Object[] {
            T01704_A10111Mq_Dia, T01704_A10112Mq_Op, T01704_A10113Mq_Ultl, T01704_n10113Mq_Ultl, T01704_A396EmprCod, T01704_A602MaqCod
            }
            , new Object[] {
            T01705_A10111Mq_Dia, T01705_A10112Mq_Op, T01705_A10113Mq_Ultl, T01705_n10113Mq_Ultl, T01705_A396EmprCod, T01705_A602MaqCod
            }
            , new Object[] {
            T01706_A407EmprNom, T01706_n407EmprNom
            }
            , new Object[] {
            T01707_A396EmprCod
            }
            , new Object[] {
            T01708_A10111Mq_Dia, T01708_A10112Mq_Op, T01708_A407EmprNom, T01708_n407EmprNom, T01708_A10113Mq_Ultl, T01708_n10113Mq_Ultl, T01708_A396EmprCod, T01708_A602MaqCod
            }
            , new Object[] {
            T01709_A396EmprCod, T01709_A602MaqCod, T01709_A10111Mq_Dia, T01709_A10112Mq_Op
            }
            , new Object[] {
            T017010_A396EmprCod, T017010_A602MaqCod, T017010_A10111Mq_Dia, T017010_A10112Mq_Op
            }
            , new Object[] {
            T017011_A396EmprCod, T017011_A602MaqCod, T017011_A10111Mq_Dia, T017011_A10112Mq_Op
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017015_A396EmprCod, T017015_A602MaqCod, T017015_A10111Mq_Dia, T017015_A10112Mq_Op
            }
            , new Object[] {
            T017016_A602MaqCod, T017016_A10111Mq_Dia, T017016_A10112Mq_Op, T017016_A10114Mq_Ln, T017016_A10115Mq_Di, T017016_n10115Mq_Di, T017016_A10116Mq_Df, T017016_n10116Mq_Df, T017016_A10117Mq_Est, T017016_n10117Mq_Est,
            T017016_A10118Mq_Cont, T017016_n10118Mq_Cont, T017016_A10179Mq_Contf, T017016_n10179Mq_Contf, T017016_A396EmprCod
            }
            , new Object[] {
            T017017_A396EmprCod, T017017_A602MaqCod, T017017_A10111Mq_Dia, T017017_A10112Mq_Op, T017017_A10114Mq_Ln
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017021_A396EmprCod, T017021_A602MaqCod, T017021_A10111Mq_Dia, T017021_A10112Mq_Op, T017021_A10114Mq_Ln
            }
            , new Object[] {
            T017022_A407EmprNom, T017022_n407EmprNom
            }
            , new Object[] {
            T017023_A396EmprCod
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
      AV32Pgmname = "TMQDDOP" ;
   }

   private byte Z10117Mq_Est ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A10117Mq_Est ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short nRcdDeleted_1371 ;
   private short nRcdExists_1371 ;
   private short nIsMod_1371 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1371 ;
   private short RcdFound1371 ;
   private short nBlankRcdUsr1371 ;
   private short RcdFound1370 ;
   private short nIsDirty_1370 ;
   private short nIsDirty_1371 ;
   private int wcpOA10112Mq_Op ;
   private int wcpOA10114Mq_Ln ;
   private int Z10112Mq_Op ;
   private int Z10113Mq_Ultl ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
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
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A10113Mq_Ultl ;
   private int edtMq_Ultl_Enabled ;
   private int edtavnRcdDeleted_1371_Enabled ;
   private int edtMq_Ln_Enabled ;
   private int edtMq_Di_Enabled ;
   private int edtMq_Df_Enabled ;
   private int edtMq_Est_Enabled ;
   private int edtMq_Cont_Enabled ;
   private int edtMq_Contf_Enabled ;
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
   private int Z10114Mq_Ln ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtMq_Est_Enabled ;
   private int defedtMq_Ln_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMq_Ultl_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtMq_Op_Backcolor ;
   private int edtMq_Dia_Backcolor ;
   private int edtMaqCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ10112Mq_Op ;
   private int ZZ10113Mq_Ultl ;
   private int ZZ10114Mq_Ln ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z10118Mq_Cont ;
   private java.math.BigDecimal Z10179Mq_Contf ;
   private java.math.BigDecimal A10118Mq_Cont ;
   private java.math.BigDecimal A10179Mq_Contf ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA602MaqCod ;
   private String Z396EmprCod ;
   private String Z602MaqCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMq_Ultl_Internalname ;
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
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtMq_Ultl_Jsonclick ;
   private String sMode1371 ;
   private String edtavnRcdDeleted_1371_Internalname ;
   private String edtMq_Ln_Internalname ;
   private String edtMq_Di_Internalname ;
   private String edtMq_Df_Internalname ;
   private String edtMq_Est_Internalname ;
   private String edtMq_Cont_Internalname ;
   private String edtMq_Contf_Internalname ;
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
   private String sMode1370 ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV14Lit2 ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String GXCCtl ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1371_Jsonclick ;
   private String edtMq_Ln_Jsonclick ;
   private String edtMq_Di_Jsonclick ;
   private String edtMq_Df_Jsonclick ;
   private String edtMq_Est_Jsonclick ;
   private String edtMq_Cont_Jsonclick ;
   private String edtMq_Contf_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ602MaqCod ;
   private String ZZ407EmprNom ;
   private java.util.Date Z10115Mq_Di ;
   private java.util.Date Z10116Mq_Df ;
   private java.util.Date A10115Mq_Di ;
   private java.util.Date A10116Mq_Df ;
   private java.util.Date wcpOA10111Mq_Dia ;
   private java.util.Date Z10111Mq_Dia ;
   private java.util.Date A10111Mq_Dia ;
   private java.util.Date ZZ10111Mq_Dia ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n10113Mq_Ultl ;
   private boolean returnInSub ;
   private boolean n10115Mq_Di ;
   private boolean n10116Mq_Df ;
   private boolean n10117Mq_Est ;
   private boolean n10118Mq_Cont ;
   private boolean n10179Mq_Contf ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01706_A407EmprNom ;
   private boolean[] T01706_n407EmprNom ;
   private String[] T01707_A396EmprCod ;
   private java.util.Date[] T01708_A10111Mq_Dia ;
   private int[] T01708_A10112Mq_Op ;
   private String[] T01708_A407EmprNom ;
   private boolean[] T01708_n407EmprNom ;
   private int[] T01708_A10113Mq_Ultl ;
   private boolean[] T01708_n10113Mq_Ultl ;
   private String[] T01708_A396EmprCod ;
   private String[] T01708_A602MaqCod ;
   private String[] T01709_A396EmprCod ;
   private String[] T01709_A602MaqCod ;
   private java.util.Date[] T01709_A10111Mq_Dia ;
   private int[] T01709_A10112Mq_Op ;
   private java.util.Date[] T01705_A10111Mq_Dia ;
   private int[] T01705_A10112Mq_Op ;
   private int[] T01705_A10113Mq_Ultl ;
   private boolean[] T01705_n10113Mq_Ultl ;
   private String[] T01705_A396EmprCod ;
   private String[] T01705_A602MaqCod ;
   private String[] T017010_A396EmprCod ;
   private String[] T017010_A602MaqCod ;
   private java.util.Date[] T017010_A10111Mq_Dia ;
   private int[] T017010_A10112Mq_Op ;
   private String[] T017011_A396EmprCod ;
   private String[] T017011_A602MaqCod ;
   private java.util.Date[] T017011_A10111Mq_Dia ;
   private int[] T017011_A10112Mq_Op ;
   private java.util.Date[] T01704_A10111Mq_Dia ;
   private int[] T01704_A10112Mq_Op ;
   private int[] T01704_A10113Mq_Ultl ;
   private boolean[] T01704_n10113Mq_Ultl ;
   private String[] T01704_A396EmprCod ;
   private String[] T01704_A602MaqCod ;
   private String[] T017015_A396EmprCod ;
   private String[] T017015_A602MaqCod ;
   private java.util.Date[] T017015_A10111Mq_Dia ;
   private int[] T017015_A10112Mq_Op ;
   private String[] T017016_A602MaqCod ;
   private java.util.Date[] T017016_A10111Mq_Dia ;
   private int[] T017016_A10112Mq_Op ;
   private int[] T017016_A10114Mq_Ln ;
   private java.util.Date[] T017016_A10115Mq_Di ;
   private boolean[] T017016_n10115Mq_Di ;
   private java.util.Date[] T017016_A10116Mq_Df ;
   private boolean[] T017016_n10116Mq_Df ;
   private byte[] T017016_A10117Mq_Est ;
   private boolean[] T017016_n10117Mq_Est ;
   private java.math.BigDecimal[] T017016_A10118Mq_Cont ;
   private boolean[] T017016_n10118Mq_Cont ;
   private java.math.BigDecimal[] T017016_A10179Mq_Contf ;
   private boolean[] T017016_n10179Mq_Contf ;
   private String[] T017016_A396EmprCod ;
   private String[] T017017_A396EmprCod ;
   private String[] T017017_A602MaqCod ;
   private java.util.Date[] T017017_A10111Mq_Dia ;
   private int[] T017017_A10112Mq_Op ;
   private int[] T017017_A10114Mq_Ln ;
   private String[] T01703_A602MaqCod ;
   private java.util.Date[] T01703_A10111Mq_Dia ;
   private int[] T01703_A10112Mq_Op ;
   private int[] T01703_A10114Mq_Ln ;
   private java.util.Date[] T01703_A10115Mq_Di ;
   private boolean[] T01703_n10115Mq_Di ;
   private java.util.Date[] T01703_A10116Mq_Df ;
   private boolean[] T01703_n10116Mq_Df ;
   private byte[] T01703_A10117Mq_Est ;
   private boolean[] T01703_n10117Mq_Est ;
   private java.math.BigDecimal[] T01703_A10118Mq_Cont ;
   private boolean[] T01703_n10118Mq_Cont ;
   private java.math.BigDecimal[] T01703_A10179Mq_Contf ;
   private boolean[] T01703_n10179Mq_Contf ;
   private String[] T01703_A396EmprCod ;
   private String[] T01702_A602MaqCod ;
   private java.util.Date[] T01702_A10111Mq_Dia ;
   private int[] T01702_A10112Mq_Op ;
   private int[] T01702_A10114Mq_Ln ;
   private java.util.Date[] T01702_A10115Mq_Di ;
   private boolean[] T01702_n10115Mq_Di ;
   private java.util.Date[] T01702_A10116Mq_Df ;
   private boolean[] T01702_n10116Mq_Df ;
   private byte[] T01702_A10117Mq_Est ;
   private boolean[] T01702_n10117Mq_Est ;
   private java.math.BigDecimal[] T01702_A10118Mq_Cont ;
   private boolean[] T01702_n10118Mq_Cont ;
   private java.math.BigDecimal[] T01702_A10179Mq_Contf ;
   private boolean[] T01702_n10179Mq_Contf ;
   private String[] T01702_A396EmprCod ;
   private String[] T017021_A396EmprCod ;
   private String[] T017021_A602MaqCod ;
   private java.util.Date[] T017021_A10111Mq_Dia ;
   private int[] T017021_A10112Mq_Op ;
   private int[] T017021_A10114Mq_Ln ;
   private String[] T017022_A407EmprNom ;
   private boolean[] T017022_n407EmprNom ;
   private String[] T017023_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmqddop__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmqddop__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmqddop__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmqddop__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmqddop__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01702", "SELECT MaqCod, Mq_Dia, Mq_Op, Mq_Ln, Mq_Di, Mq_Df, Mq_Est, Mq_Cont, Mq_Contf, EmprCod FROM TXPMQDDO1 WHERE EmprCod = ? AND MaqCod = ? AND Mq_Dia = ? AND Mq_Op = ? AND Mq_Ln = ?  FOR UPDATE OF Mq_Di, Mq_Df, Mq_Est, Mq_Cont, Mq_Contf NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01703", "SELECT MaqCod, Mq_Dia, Mq_Op, Mq_Ln, Mq_Di, Mq_Df, Mq_Est, Mq_Cont, Mq_Contf, EmprCod FROM TXPMQDDO1 WHERE EmprCod = ? AND MaqCod = ? AND Mq_Dia = ? AND Mq_Op = ? AND Mq_Ln = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01704", "SELECT Mq_Dia, Mq_Op, Mq_Ultl, EmprCod, MaqCod FROM TXPMQDDOP WHERE EmprCod = ? AND MaqCod = ? AND Mq_Dia = ? AND Mq_Op = ?  FOR UPDATE OF Mq_Ultl NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01705", "SELECT Mq_Dia, Mq_Op, Mq_Ultl, EmprCod, MaqCod FROM TXPMQDDOP WHERE EmprCod = ? AND MaqCod = ? AND Mq_Dia = ? AND Mq_Op = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01706", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01707", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01708", "SELECT /*+ FIRST_ROWS(1) */ TM1.Mq_Dia, TM1.Mq_Op, T2.EmprNom, TM1.Mq_Ultl, TM1.EmprCod, TM1.MaqCod FROM (TXPMQDDOP TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.MaqCod = ? and TM1.Mq_Dia = ? and TM1.Mq_Op = ? ORDER BY TM1.EmprCod, TM1.MaqCod, TM1.Mq_Dia, TM1.Mq_Op ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01709", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, Mq_Dia, Mq_Op FROM TXPMQDDOP WHERE EmprCod = ? AND MaqCod = ? AND Mq_Dia = ? AND Mq_Op = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017010", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, Mq_Dia, Mq_Op FROM TXPMQDDOP WHERE EmprCod = ? and MaqCod = ? and Mq_Dia = ? and Mq_Op = ? ORDER BY EmprCod, MaqCod, Mq_Dia, Mq_Op) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017011", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, Mq_Dia, Mq_Op FROM TXPMQDDOP WHERE EmprCod = ? and MaqCod = ? and Mq_Dia = ? and Mq_Op = ? ORDER BY EmprCod DESC, MaqCod DESC, Mq_Dia DESC, Mq_Op DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T017012", "INSERT INTO TXPMQDDOP(Mq_Dia, Mq_Op, Mq_Ultl, EmprCod, MaqCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPMQDDOP")
         ,new UpdateCursor("T017013", "UPDATE TXPMQDDOP SET Mq_Ultl=?  WHERE EmprCod = ? AND MaqCod = ? AND Mq_Dia = ? AND Mq_Op = ?", GX_NOMASK, "TXPMQDDOP")
         ,new UpdateCursor("T017014", "DELETE FROM TXPMQDDOP  WHERE EmprCod = ? AND MaqCod = ? AND Mq_Dia = ? AND Mq_Op = ?", GX_NOMASK, "TXPMQDDOP")
         ,new ForEachCursor("T017015", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqCod, Mq_Dia, Mq_Op FROM TXPMQDDOP WHERE EmprCod = ? and MaqCod = ? and Mq_Dia = ? and Mq_Op = ? ORDER BY EmprCod, MaqCod, Mq_Dia, Mq_Op ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017016", "SELECT MaqCod, Mq_Dia, Mq_Op, Mq_Ln, Mq_Di, Mq_Df, Mq_Est, Mq_Cont, Mq_Contf, EmprCod FROM TXPMQDDO1 WHERE EmprCod = ? and MaqCod = ? and Mq_Dia = ? and Mq_Op = ? and Mq_Ln = ? ORDER BY EmprCod, MaqCod, Mq_Dia, Mq_Op, Mq_Ln ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017017", "SELECT EmprCod, MaqCod, Mq_Dia, Mq_Op, Mq_Ln FROM TXPMQDDO1 WHERE EmprCod = ? AND MaqCod = ? AND Mq_Dia = ? AND Mq_Op = ? AND Mq_Ln = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T017018", "INSERT INTO TXPMQDDO1(MaqCod, Mq_Dia, Mq_Op, Mq_Ln, Mq_Di, Mq_Df, Mq_Est, Mq_Cont, Mq_Contf, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMQDDO1")
         ,new UpdateCursor("T017019", "UPDATE TXPMQDDO1 SET Mq_Di=?, Mq_Df=?, Mq_Est=?, Mq_Cont=?, Mq_Contf=?  WHERE EmprCod = ? AND MaqCod = ? AND Mq_Dia = ? AND Mq_Op = ? AND Mq_Ln = ?", GX_NOMASK, "TXPMQDDO1")
         ,new UpdateCursor("T017020", "DELETE FROM TXPMQDDO1  WHERE EmprCod = ? AND MaqCod = ? AND Mq_Dia = ? AND Mq_Op = ? AND Mq_Ln = ?", GX_NOMASK, "TXPMQDDO1")
         ,new ForEachCursor("T017021", "SELECT EmprCod, MaqCod, Mq_Dia, Mq_Op, Mq_Ln FROM TXPMQDDO1 WHERE EmprCod = ? and MaqCod = ? and Mq_Dia = ? and Mq_Op = ? and Mq_Ln = ? ORDER BY EmprCod, MaqCod, Mq_Dia, Mq_Op, Mq_Ln ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017022", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017023", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 3);
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 10 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setString(4, (String)parms[4], 3);
               stmt.setString(5, (String)parms[5], 6);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               stmt.setDate(4, (java.util.Date)parms[4]);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[13], 2);
               }
               stmt.setString(10, (String)parms[14], 3);
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
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
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

