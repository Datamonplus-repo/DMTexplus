package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talbeob_impl extends GXDataArea
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
            A3435XAlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "XAlbRecCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3435XAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3435XAlbRecCod), 8, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TRASPASO ALBARANES ENTRADA", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtXAlbRULin_Internalname ;
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
      nRC_GXsfl_40 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_40"))) ;
      nGXsfl_40_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_40_idx"))) ;
      sGXsfl_40_idx = httpContext.GetPar( "sGXsfl_40_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public talbeob_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public talbeob_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talbeob_impl.class ));
   }

   public talbeob_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBEOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBEOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBEOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBEOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TALBEOB.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBEOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "XAlbRecCod", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3435XAlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXAlbRecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3435XAlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3435XAlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAlbRecCod_Jsonclick, 0, "", "", "", "", "", 1, edtXAlbRecCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBEOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBEOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "XAlbRULin", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAlbRULin_Internalname, GXutil.ltrim( localUtil.ntoc( A3456XAlbRULin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXAlbRULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3456XAlbRULin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3456XAlbRULin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAlbRULin_Jsonclick, 0, "", "", "", "", "", 1, edtXAlbRULin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBEOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBEOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol40( ) ;
      nGXsfl_40_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1575 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1575 = (short)(1) ;
            scanStart1FL1575( ) ;
            while ( RcdFound1575 != 0 )
            {
               init_level_properties1575( ) ;
               getByPrimaryKey1FL1575( ) ;
               addRow1FL1575( ) ;
               scanNext1FL1575( ) ;
            }
            scanEnd1FL1575( ) ;
            nBlankRcdCount1575 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1FL1575( ) ;
         standaloneModal1FL1575( ) ;
         sMode1575 = Gx_mode ;
         while ( nGXsfl_40_idx < nRC_GXsfl_40 )
         {
            bGXsfl_40_Refreshing = true ;
            readRow1FL1575( ) ;
            edtavnRcdDeleted_1575_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1575_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1575_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1575_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtXAlbRLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XALBRLIN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAlbRLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRLin_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtXAlbRObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XALBROBS_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAlbRObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRObs_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            if ( ( nRcdExists_1575 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1FL1575( ) ;
            }
            sendRow1FL1575( ) ;
            bGXsfl_40_Refreshing = false ;
         }
         Gx_mode = sMode1575 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1575 = (short)(5) ;
         nRcdExists_1575 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1FL1575( ) ;
            while ( RcdFound1575 != 0 )
            {
               sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_401575( ) ;
               init_level_properties1575( ) ;
               standaloneNotModal1FL1575( ) ;
               getByPrimaryKey1FL1575( ) ;
               standaloneModal1FL1575( ) ;
               addRow1FL1575( ) ;
               scanNext1FL1575( ) ;
            }
            scanEnd1FL1575( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1575 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_401575( ) ;
      initAll1FL1575( ) ;
      init_level_properties1575( ) ;
      nRcdExists_1575 = (short)(0) ;
      nIsMod_1575 = (short)(0) ;
      nRcdDeleted_1575 = (short)(0) ;
      nBlankRcdCount1575 = (short)(nBlankRcdUsr1575+nBlankRcdCount1575) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1575 > 0 )
      {
         standaloneNotModal1FL1575( ) ;
         standaloneModal1FL1575( ) ;
         addRow1FL1575( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtXAlbRObs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1575 = (short)(nBlankRcdCount1575-1) ;
      }
      Gx_mode = sMode1575 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBEOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBEOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBEOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBEOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TALBEOB.htm");
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
      e111FL2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z3435XAlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z3435XAlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3456XAlbRULin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3456XAlbRULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A3435XAlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtXAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3435XAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3435XAlbRecCod), 8, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXAlbRULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXAlbRULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XALBRULIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXAlbRULin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3456XAlbRULin = (byte)(0) ;
               n3456XAlbRULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3456XAlbRULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3456XAlbRULin), 2, 0));
            }
            else
            {
               A3456XAlbRULin = (byte)(localUtil.ctol( httpContext.cgiGet( edtXAlbRULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3456XAlbRULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3456XAlbRULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3456XAlbRULin), 2, 0));
            }
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
               A3435XAlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "XAlbRecCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3435XAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3435XAlbRecCod), 8, 0));
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
                        e111FL2 ();
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
            initAll1FL493( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1575_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1575_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      disableAttributes1FL493( ) ;
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

   public void confirm_1FL0( )
   {
      beforeValidate1FL493( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1FL493( ) ;
         }
         else
         {
            checkExtendedTable1FL493( ) ;
            if ( AnyError == 0 )
            {
               zm1FL493( 5) ;
            }
            closeExtendedTableCursors1FL493( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode493 = Gx_mode ;
         confirm_1FL1575( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode493 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode493 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1FL0( ) ;
      }
   }

   public void confirm_1FL1575( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1FL1575( ) ;
         if ( ( nRcdExists_1575 != 0 ) || ( nIsMod_1575 != 0 ) )
         {
            getKey1FL1575( ) ;
            if ( ( nRcdExists_1575 == 0 ) && ( nRcdDeleted_1575 == 0 ) )
            {
               if ( RcdFound1575 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1FL1575( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1FL1575( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1FL1575( ) ;
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
               if ( RcdFound1575 != 0 )
               {
                  if ( nRcdDeleted_1575 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1FL1575( ) ;
                     load1FL1575( ) ;
                     beforeValidate1FL1575( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1FL1575( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1575 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1FL1575( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1FL1575( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1FL1575( ) ;
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
                  if ( nRcdDeleted_1575 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1575_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1575, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAlbRLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3467XAlbRLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAlbRObs_Internalname, GXutil.rtrim( A3468XAlbRObs)) ;
         httpContext.changePostValue( "ZT_"+"Z3467XAlbRLin_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z3467XAlbRLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3468XAlbRObs_"+sGXsfl_40_idx, GXutil.rtrim( Z3468XAlbRObs)) ;
         httpContext.changePostValue( "T3467XAlbRLin_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( O3467XAlbRLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1575_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1575, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1575_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1575, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1575_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1575, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1575 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1575_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1575_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XALBRLIN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XALBROBS_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1FL0( )
   {
   }

   public void e111FL2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV16Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      talbeob_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit0", AV16Lit0);
      GXt_char1 = AV23LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      talbeob_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23LitFe", AV23LitFe);
      GXt_char1 = AV17Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1107_", ""), (byte)(99), GXv_char2) ;
      talbeob_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit1", AV17Lit1);
      GXt_char1 = AV18Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1266_", ""), (byte)(99), GXv_char2) ;
      talbeob_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit2", AV18Lit2);
      GXt_char1 = AV19Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN184_", ""), (byte)(99), GXv_char2) ;
      talbeob_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit4", AV19Lit4);
      GXt_char1 = AV20Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1515_", ""), (byte)(99), GXv_char2) ;
      talbeob_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit5", AV20Lit5);
      GXt_char1 = AV21lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1289_", ""), (byte)(99), GXv_char2) ;
      talbeob_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21lit6", AV21lit6);
      AV25Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Station", AV25Station);
      GXv_char2[0] = AV24EmprCod ;
      GXv_char3[0] = AV26EmprNom ;
      GXv_char4[0] = AV22UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV25Station, GXv_char2, GXv_char3, GXv_char4) ;
      talbeob_impl.this.AV24EmprCod = GXv_char2[0] ;
      talbeob_impl.this.AV26EmprNom = GXv_char3[0] ;
      talbeob_impl.this.AV22UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV26EmprNom", AV26EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV22UsurCod", AV22UsurCod);
      AV27FlagImp = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27FlagImp", GXutil.str( AV27FlagImp, 1, 0));
      GXv_int5[0] = AV27FlagImp ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "IMPALR", ""), GXv_int5) ;
      talbeob_impl.this.AV27FlagImp = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27FlagImp", GXutil.str( AV27FlagImp, 1, 0));
   }

   public void zm1FL493( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3456XAlbRULin = T01FL5_A3456XAlbRULin[0] ;
         }
         else
         {
            Z3456XAlbRULin = A3456XAlbRULin ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z3435XAlbRecCod = A3435XAlbRecCod ;
         Z3456XAlbRULin = A3456XAlbRULin ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      /* Using cursor T01FL6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FL6_A407EmprNom[0] ;
      n407EmprNom = T01FL6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
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

   public void load1FL493( )
   {
      /* Using cursor T01FL7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound493 = (short)(1) ;
         A3456XAlbRULin = T01FL7_A3456XAlbRULin[0] ;
         n3456XAlbRULin = T01FL7_n3456XAlbRULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3456XAlbRULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3456XAlbRULin), 2, 0));
         A407EmprNom = T01FL7_A407EmprNom[0] ;
         n407EmprNom = T01FL7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm1FL493( -4) ;
      }
      pr_default.close(5);
      onLoadActions1FL493( ) ;
   }

   public void onLoadActions1FL493( )
   {
   }

   public void checkExtendedTable1FL493( )
   {
      nIsDirty_493 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1FL493( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1FL493( )
   {
      /* Using cursor T01FL8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound493 = (short)(1) ;
      }
      else
      {
         RcdFound493 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01FL5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod)});
      if ( (pr_default.getStatus(3) != 101) && ( T01FL5_A3435XAlbRecCod[0] == A3435XAlbRecCod ) && ( GXutil.strcmp(T01FL5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1FL493( 4) ;
         RcdFound493 = (short)(1) ;
         A3456XAlbRULin = T01FL5_A3456XAlbRULin[0] ;
         n3456XAlbRULin = T01FL5_n3456XAlbRULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3456XAlbRULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3456XAlbRULin), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z3435XAlbRecCod = A3435XAlbRecCod ;
         sMode493 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1FL493( ) ;
         if ( AnyError == 1 )
         {
            RcdFound493 = (short)(0) ;
            initializeNonKey1FL493( ) ;
         }
         Gx_mode = sMode493 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound493 = (short)(0) ;
         initializeNonKey1FL493( ) ;
         sMode493 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode493 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1FL493( ) ;
      if ( RcdFound493 == 0 )
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
      RcdFound493 = (short)(0) ;
      /* Using cursor T01FL9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01FL9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FL9_A3435XAlbRecCod[0] == A3435XAlbRecCod ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01FL9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FL9_A3435XAlbRecCod[0] == A3435XAlbRecCod ) )
         {
            RcdFound493 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound493 = (short)(0) ;
      /* Using cursor T01FL10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01FL10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FL10_A3435XAlbRecCod[0] == A3435XAlbRecCod ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01FL10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FL10_A3435XAlbRecCod[0] == A3435XAlbRecCod ) )
         {
            RcdFound493 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1FL493( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtXAlbRULin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1FL493( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound493 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3435XAlbRecCod != Z3435XAlbRecCod ) )
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
               GX_FocusControl = edtXAlbRULin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1FL493( ) ;
               GX_FocusControl = edtXAlbRULin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3435XAlbRecCod != Z3435XAlbRecCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtXAlbRULin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1FL493( ) ;
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
                  GX_FocusControl = edtXAlbRULin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1FL493( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3435XAlbRecCod != Z3435XAlbRecCod ) )
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
         GX_FocusControl = edtXAlbRULin_Internalname ;
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
      getKey1FL493( ) ;
      if ( RcdFound493 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3435XAlbRecCod != Z3435XAlbRecCod ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3435XAlbRecCod != Z3435XAlbRecCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "talbeob");
      GX_FocusControl = edtXAlbRULin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1FL0( ) ;
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
      if ( RcdFound493 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtXAlbRULin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1FL493( ) ;
      if ( RcdFound493 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXAlbRULin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FL493( ) ;
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
      if ( RcdFound493 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXAlbRULin_Internalname ;
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
      if ( RcdFound493 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXAlbRULin_Internalname ;
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
      scanStart1FL493( ) ;
      if ( RcdFound493 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound493 != 0 )
         {
            scanNext1FL493( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXAlbRULin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FL493( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1FL493( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FL4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBEUR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z3456XAlbRULin != T01FL4_A3456XAlbRULin[0] ) )
         {
            if ( Z3456XAlbRULin != T01FL4_A3456XAlbRULin[0] )
            {
               GXutil.writeLogln("talbeob:[seudo value changed for attri]"+"XAlbRULin");
               GXutil.writeLogRaw("Old: ",Z3456XAlbRULin);
               GXutil.writeLogRaw("Current: ",T01FL4_A3456XAlbRULin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBEUR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FL493( )
   {
      beforeValidate1FL493( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FL493( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FL493( 0) ;
         checkOptimisticConcurrency1FL493( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FL493( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FL493( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FL11 */
                  pr_default.execute(9, new Object[] {Integer.valueOf(A3435XAlbRecCod), Boolean.valueOf(n3456XAlbRULin), Byte.valueOf(A3456XAlbRULin), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEUR");
                  if ( (pr_default.getStatus(9) == 1) )
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
                        processLevel1FL493( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1FL0( ) ;
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
            load1FL493( ) ;
         }
         endLevel1FL493( ) ;
      }
      closeExtendedTableCursors1FL493( ) ;
   }

   public void update1FL493( )
   {
      beforeValidate1FL493( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FL493( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FL493( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FL493( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1FL493( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FL12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n3456XAlbRULin), Byte.valueOf(A3456XAlbRULin), A396EmprCod, Integer.valueOf(A3435XAlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEUR");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBEUR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1FL493( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1FL493( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1FL0( ) ;
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
         endLevel1FL493( ) ;
      }
      closeExtendedTableCursors1FL493( ) ;
   }

   public void deferredUpdate1FL493( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FL493( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FL493( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FL493( ) ;
         afterConfirm1FL493( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FL493( ) ;
            if ( AnyError == 0 )
            {
               scanStart1FL1575( ) ;
               while ( RcdFound1575 != 0 )
               {
                  getByPrimaryKey1FL1575( ) ;
                  delete1FL1575( ) ;
                  scanNext1FL1575( ) ;
               }
               scanEnd1FL1575( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FL13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEUR");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound493 == 0 )
                        {
                           initAll1FL493( ) ;
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
                        resetCaption1FL0( ) ;
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
      sMode493 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FL493( ) ;
      Gx_mode = sMode493 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FL493( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01FL14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBEUD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T01FL15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBVPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void processNestedLevel1FL1575( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1FL1575( ) ;
         if ( ( nRcdExists_1575 != 0 ) || ( nIsMod_1575 != 0 ) )
         {
            standaloneNotModal1FL1575( ) ;
            getKey1FL1575( ) ;
            if ( ( nRcdExists_1575 == 0 ) && ( nRcdDeleted_1575 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1FL1575( ) ;
            }
            else
            {
               if ( RcdFound1575 != 0 )
               {
                  if ( ( nRcdDeleted_1575 != 0 ) && ( nRcdExists_1575 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1FL1575( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1575 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1FL1575( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1575 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1575_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1575, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAlbRLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3467XAlbRLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAlbRObs_Internalname, GXutil.rtrim( A3468XAlbRObs)) ;
         httpContext.changePostValue( "ZT_"+"Z3467XAlbRLin_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z3467XAlbRLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3468XAlbRObs_"+sGXsfl_40_idx, GXutil.rtrim( Z3468XAlbRObs)) ;
         httpContext.changePostValue( "T3467XAlbRLin_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( O3467XAlbRLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1575_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1575, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1575_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1575, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1575_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1575, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1575 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1575_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1575_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XALBRLIN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XALBROBS_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1FL1575( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1575 = (short)(0) ;
      nIsMod_1575 = (short)(0) ;
      nRcdDeleted_1575 = (short)(0) ;
   }

   public void processLevel1FL493( )
   {
      /* Save parent mode. */
      sMode493 = Gx_mode ;
      processNestedLevel1FL1575( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode493 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01FL16 */
      pr_default.execute(14, new Object[] {Boolean.valueOf(n3456XAlbRULin), Byte.valueOf(A3456XAlbRULin), A396EmprCod, Integer.valueOf(A3435XAlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEUR");
   }

   public void endLevel1FL493( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1FL493( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "talbeob");
         if ( AnyError == 0 )
         {
            confirmValues1FL0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "talbeob");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1FL493( )
   {
      /* Scan By routine */
      /* Using cursor T01FL17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod)});
      RcdFound493 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound493 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FL493( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound493 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound493 = (short)(1) ;
      }
   }

   public void scanEnd1FL493( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1FL493( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FL493( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FL493( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FL493( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FL493( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FL493( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FL493( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtXAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRecCod_Enabled), 5, 0), true);
      edtXAlbRULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRULin_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zm1FL1575( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3468XAlbRObs = T01FL3_A3468XAlbRObs[0] ;
         }
         else
         {
            Z3468XAlbRObs = A3468XAlbRObs ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z396EmprCod = A396EmprCod ;
         Z3435XAlbRecCod = A3435XAlbRecCod ;
         Z3467XAlbRLin = A3467XAlbRLin ;
         Z3468XAlbRObs = A3468XAlbRObs ;
      }
   }

   public void standaloneNotModal1FL1575( )
   {
      edtXAlbRLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRLin_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void standaloneModal1FL1575( )
   {
   }

   public void load1FL1575( )
   {
      /* Using cursor T01FL18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod), Byte.valueOf(A3467XAlbRLin)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1575 = (short)(1) ;
         A3468XAlbRObs = T01FL18_A3468XAlbRObs[0] ;
         n3468XAlbRObs = T01FL18_n3468XAlbRObs[0] ;
         zm1FL1575( -6) ;
      }
      pr_default.close(16);
      onLoadActions1FL1575( ) ;
   }

   public void onLoadActions1FL1575( )
   {
      if ( isIns( )  )
      {
         A3467XAlbRLin = (byte)(O3467XAlbRLin+1) ;
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A3456XAlbRULin = A3467XAlbRLin ;
         n3456XAlbRULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3456XAlbRULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3456XAlbRULin), 2, 0));
      }
   }

   public void checkExtendedTable1FL1575( )
   {
      nIsDirty_1575 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1FL1575( ) ;
      if ( isIns( )  )
      {
         nIsDirty_1575 = (short)(1) ;
         A3467XAlbRLin = (byte)(O3467XAlbRLin+1) ;
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         nIsDirty_1575 = (short)(1) ;
         A3456XAlbRULin = A3467XAlbRLin ;
         n3456XAlbRULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3456XAlbRULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3456XAlbRULin), 2, 0));
      }
   }

   public void closeExtendedTableCursors1FL1575( )
   {
   }

   public void enableDisable1FL1575( )
   {
   }

   public void getKey1FL1575( )
   {
      /* Using cursor T01FL19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod), Byte.valueOf(A3467XAlbRLin)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1575 = (short)(1) ;
      }
      else
      {
         RcdFound1575 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey1FL1575( )
   {
      /* Using cursor T01FL3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod), Byte.valueOf(A3467XAlbRLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01FL3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FL3_A3435XAlbRecCod[0] == A3435XAlbRecCod ) )
      {
         zm1FL1575( 6) ;
         RcdFound1575 = (short)(1) ;
         initializeNonKey1FL1575( ) ;
         A3467XAlbRLin = T01FL3_A3467XAlbRLin[0] ;
         A3468XAlbRObs = T01FL3_A3468XAlbRObs[0] ;
         n3468XAlbRObs = T01FL3_n3468XAlbRObs[0] ;
         O3467XAlbRLin = A3467XAlbRLin ;
         Z396EmprCod = A396EmprCod ;
         Z3435XAlbRecCod = A3435XAlbRecCod ;
         Z3467XAlbRLin = A3467XAlbRLin ;
         sMode1575 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FL1575( ) ;
         load1FL1575( ) ;
         Gx_mode = sMode1575 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1575 = (short)(0) ;
         initializeNonKey1FL1575( ) ;
         sMode1575 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FL1575( ) ;
         Gx_mode = sMode1575 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1FL1575( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1FL1575( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FL2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod), Byte.valueOf(A3467XAlbRLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBEOB"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z3468XAlbRObs, T01FL2_A3468XAlbRObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z3468XAlbRObs, T01FL2_A3468XAlbRObs[0]) != 0 )
            {
               GXutil.writeLogln("talbeob:[seudo value changed for attri]"+"XAlbRObs");
               GXutil.writeLogRaw("Old: ",Z3468XAlbRObs);
               GXutil.writeLogRaw("Current: ",T01FL2_A3468XAlbRObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBEOB"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FL1575( )
   {
      beforeValidate1FL1575( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FL1575( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FL1575( 0) ;
         checkOptimisticConcurrency1FL1575( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FL1575( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FL1575( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FL20 */
                  pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod), Byte.valueOf(A3467XAlbRLin), Boolean.valueOf(n3468XAlbRObs), A3468XAlbRObs});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEOB");
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
            load1FL1575( ) ;
         }
         endLevel1FL1575( ) ;
      }
      closeExtendedTableCursors1FL1575( ) ;
   }

   public void update1FL1575( )
   {
      beforeValidate1FL1575( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FL1575( ) ;
      }
      if ( ( nIsMod_1575 != 0 ) || ( nIsDirty_1575 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1FL1575( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1FL1575( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1FL1575( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01FL21 */
                     pr_default.execute(19, new Object[] {Boolean.valueOf(n3468XAlbRObs), A3468XAlbRObs, A396EmprCod, Integer.valueOf(A3435XAlbRecCod), Byte.valueOf(A3467XAlbRLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEOB");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBEOB"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1FL1575( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1FL1575( ) ;
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
            endLevel1FL1575( ) ;
         }
      }
      closeExtendedTableCursors1FL1575( ) ;
   }

   public void deferredUpdate1FL1575( )
   {
   }

   public void delete1FL1575( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FL1575( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FL1575( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FL1575( ) ;
         afterConfirm1FL1575( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FL1575( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01FL22 */
               pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod), Byte.valueOf(A3467XAlbRLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEOB");
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
      sMode1575 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FL1575( ) ;
      Gx_mode = sMode1575 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FL1575( )
   {
      standaloneModal1FL1575( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && ( Gx_BScreen == 1 ) )
         {
            A3456XAlbRULin = A3467XAlbRLin ;
            n3456XAlbRULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3456XAlbRULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3456XAlbRULin), 2, 0));
         }
      }
   }

   public void endLevel1FL1575( )
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

   public void scanStart1FL1575( )
   {
      /* Scan By routine */
      /* Using cursor T01FL23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod)});
      RcdFound1575 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1575 = (short)(1) ;
         A3467XAlbRLin = T01FL23_A3467XAlbRLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FL1575( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound1575 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1575 = (short)(1) ;
         A3467XAlbRLin = T01FL23_A3467XAlbRLin[0] ;
      }
   }

   public void scanEnd1FL1575( )
   {
      pr_default.close(21);
   }

   public void afterConfirm1FL1575( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FL1575( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FL1575( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FL1575( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FL1575( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FL1575( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FL1575( )
   {
      edtXAlbRLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRLin_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtXAlbRObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRObs_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void send_integrity_lvl_hashes1FL1575( )
   {
   }

   public void send_integrity_lvl_hashes1FL493( )
   {
   }

   public void subsflControlProps_401575( )
   {
      edtavnRcdDeleted_1575_Internalname = "vNRCDDELETED_1575_"+sGXsfl_40_idx ;
      edtXAlbRLin_Internalname = "XALBRLIN_"+sGXsfl_40_idx ;
      edtXAlbRObs_Internalname = "XALBROBS_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_401575( )
   {
      edtavnRcdDeleted_1575_Internalname = "vNRCDDELETED_1575_"+sGXsfl_40_fel_idx ;
      edtXAlbRLin_Internalname = "XALBRLIN_"+sGXsfl_40_fel_idx ;
      edtXAlbRObs_Internalname = "XALBROBS_"+sGXsfl_40_fel_idx ;
   }

   public void addRow1FL1575( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401575( ) ;
      sendRow1FL1575( ) ;
   }

   public void sendRow1FL1575( )
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
         if ( ((int)((nGXsfl_40_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1575_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1575_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1575, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1575_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1575), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1575), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1575_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1575_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAlbRLin_Internalname,GXutil.ltrim( localUtil.ntoc( A3467XAlbRLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAlbRLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3467XAlbRLin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3467XAlbRLin), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAlbRLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAlbRLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1575_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAlbRObs_Internalname,GXutil.rtrim( A3468XAlbRObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAlbRObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAlbRObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1FL1575( ) ;
      GXCCtl = "Z3467XAlbRLin_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3467XAlbRLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3468XAlbRObs_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3468XAlbRObs));
      GXCCtl = "O3467XAlbRLin_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O3467XAlbRLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1575_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1575, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1575_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1575, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1575_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1575, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1575_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1575_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XALBRLIN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XALBROBS_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1FL1575( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401575( ) ;
      edtavnRcdDeleted_1575_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1575_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAlbRLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XALBRLIN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAlbRObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XALBROBS_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1575_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1575_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1575");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1575_Internalname ;
         wbErr = true ;
         nRcdDeleted_1575 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1575 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1575_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A3467XAlbRLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtXAlbRLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A3468XAlbRObs = httpContext.cgiGet( edtXAlbRObs_Internalname) ;
      n3468XAlbRObs = false ;
      GXCCtl = "Z3467XAlbRLin_" + sGXsfl_40_idx ;
      Z3467XAlbRLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3468XAlbRObs_" + sGXsfl_40_idx ;
      Z3468XAlbRObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O3467XAlbRLin_" + sGXsfl_40_idx ;
      O3467XAlbRLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1575_" + sGXsfl_40_idx ;
      nRcdDeleted_1575 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1575_" + sGXsfl_40_idx ;
      nRcdExists_1575 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1575_" + sGXsfl_40_idx ;
      nIsMod_1575 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtXAlbRLin_Enabled = edtXAlbRLin_Enabled ;
   }

   public void confirmValues1FL0( )
   {
      nGXsfl_40_idx = 0 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401575( ) ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401575( ) ;
         httpContext.changePostValue( "Z3467XAlbRLin_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z3467XAlbRLin_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3467XAlbRLin_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z3468XAlbRObs_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z3468XAlbRObs_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3468XAlbRObs_"+sGXsfl_40_idx) ;
      }
      httpContext.changePostValue( "O3467XAlbRLin", httpContext.cgiGet( "T3467XAlbRLin")) ;
      httpContext.deletePostValue( "T3467XAlbRLin") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.talbeob", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A3435XAlbRecCod,8,0))}, new String[] {"EmprCod","XAlbRecCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z3435XAlbRecCod", GXutil.ltrim( localUtil.ntoc( Z3435XAlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3456XAlbRULin", GXutil.ltrim( localUtil.ntoc( Z3456XAlbRULin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nGXsfl_40_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.talbeob", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A3435XAlbRecCod,8,0))}, new String[] {"EmprCod","XAlbRecCod"})  ;
   }

   public String getPgmname( )
   {
      return "TALBEOB" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TRASPASO ALBARANES ENTRADA", "") ;
   }

   public void initializeNonKey1FL493( )
   {
      A3456XAlbRULin = (byte)(0) ;
      n3456XAlbRULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3456XAlbRULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3456XAlbRULin), 2, 0));
      Z3456XAlbRULin = (byte)(0) ;
   }

   public void initAll1FL493( )
   {
      initializeNonKey1FL493( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1FL1575( )
   {
      A3468XAlbRObs = "" ;
      n3468XAlbRObs = false ;
      Z3468XAlbRObs = "" ;
   }

   public void initAll1FL1575( )
   {
      A3467XAlbRLin = (byte)(0) ;
      initializeNonKey1FL1575( ) ;
   }

   public void standaloneModalInsert1FL1575( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241572028", true, true);
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
      httpContext.AddJavascriptSource("talbeob.js", "?20268241572028", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1575( )
   {
      edtXAlbRLin_Enabled = defedtXAlbRLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRLin_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void startgridcontrol40( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1575, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1575_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3467XAlbRLin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3468XAlbRObs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRObs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtXAlbRecCod_Internalname = "XALBRECCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtXAlbRULin_Internalname = "XALBRULIN" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtavnRcdDeleted_1575_Internalname = "vNRCDDELETED_1575" ;
      edtXAlbRLin_Internalname = "XALBRLIN" ;
      edtXAlbRObs_Internalname = "XALBROBS" ;
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
      Form.setCaption( httpContext.getMessage( "TRASPASO ALBARANES ENTRADA", "") );
      edtXAlbRObs_Jsonclick = "" ;
      edtXAlbRLin_Jsonclick = "" ;
      edtavnRcdDeleted_1575_Jsonclick = "" ;
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
      edtXAlbRObs_Enabled = 1 ;
      edtXAlbRLin_Enabled = 0 ;
      edtavnRcdDeleted_1575_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtXAlbRULin_Jsonclick = "" ;
      edtXAlbRULin_Backcolor = (int)(0xFFFFFF) ;
      edtXAlbRULin_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtXAlbRecCod_Jsonclick = "" ;
      edtXAlbRecCod_Backcolor = (int)(0xFFFFFF) ;
      edtXAlbRecCod_Enabled = 0 ;
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
      subsflControlProps_401575( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1FL1575( ) ;
         standaloneModal1FL1575( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1FL1575( ) ;
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401575( ) ;
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
      /* Using cursor T01FL24 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FL24_A407EmprNom[0] ;
      n407EmprNom = T01FL24_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(22);
      GX_FocusControl = edtXAlbRULin_Internalname ;
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

   public void valid_Xalbreccod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3456XAlbRULin", GXutil.ltrim( localUtil.ntoc( A3456XAlbRULin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3435XAlbRecCod", GXutil.ltrim( localUtil.ntoc( Z3435XAlbRecCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3456XAlbRULin", GXutil.ltrim( localUtil.ntoc( Z3456XAlbRULin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3435XAlbRecCod',fld:'XALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_XALBRECCOD","{handler:'valid_Xalbreccod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3435XAlbRecCod',fld:'XALBRECCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_XALBRECCOD",",oparms:[{av:'A3456XAlbRULin',fld:'XALBRULIN',pic:'Z9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z3435XAlbRecCod'},{av:'Z3456XAlbRULin'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_XALBRLIN","{handler:'valid_Xalbrlin',iparms:[]");
      setEventMetadata("VALID_XALBRLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Xalbrobs',iparms:[]");
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
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z3468XAlbRObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      lblTextblock4_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1575 = "" ;
      Gx_mode = "" ;
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
      sMode493 = "" ;
      A3468XAlbRObs = "" ;
      AV16Lit0 = "" ;
      AV23LitFe = "" ;
      AV17Lit1 = "" ;
      AV18Lit2 = "" ;
      AV19Lit4 = "" ;
      AV20Lit5 = "" ;
      AV21lit6 = "" ;
      GXt_char1 = "" ;
      AV25Station = "" ;
      AV24EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV26EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV22UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new byte[1] ;
      Z407EmprNom = "" ;
      T01FL6_A407EmprNom = new String[] {""} ;
      T01FL6_n407EmprNom = new boolean[] {false} ;
      T01FL7_A3435XAlbRecCod = new int[1] ;
      T01FL7_A3456XAlbRULin = new byte[1] ;
      T01FL7_n3456XAlbRULin = new boolean[] {false} ;
      T01FL7_A407EmprNom = new String[] {""} ;
      T01FL7_n407EmprNom = new boolean[] {false} ;
      T01FL7_A396EmprCod = new String[] {""} ;
      T01FL8_A396EmprCod = new String[] {""} ;
      T01FL8_A3435XAlbRecCod = new int[1] ;
      T01FL5_A3435XAlbRecCod = new int[1] ;
      T01FL5_A3456XAlbRULin = new byte[1] ;
      T01FL5_n3456XAlbRULin = new boolean[] {false} ;
      T01FL5_A396EmprCod = new String[] {""} ;
      T01FL9_A396EmprCod = new String[] {""} ;
      T01FL9_A3435XAlbRecCod = new int[1] ;
      T01FL10_A396EmprCod = new String[] {""} ;
      T01FL10_A3435XAlbRecCod = new int[1] ;
      T01FL4_A3435XAlbRecCod = new int[1] ;
      T01FL4_A3456XAlbRULin = new byte[1] ;
      T01FL4_n3456XAlbRULin = new boolean[] {false} ;
      T01FL4_A396EmprCod = new String[] {""} ;
      T01FL14_A396EmprCod = new String[] {""} ;
      T01FL14_A3435XAlbRecCod = new int[1] ;
      T01FL14_A3461XAlbRecPie = new String[] {""} ;
      T01FL15_A396EmprCod = new String[] {""} ;
      T01FL15_A3435XAlbRecCod = new int[1] ;
      T01FL15_A5619XProCodAlb = new String[] {""} ;
      T01FL15_A5620XProFasLin = new byte[1] ;
      T01FL17_A396EmprCod = new String[] {""} ;
      T01FL17_A3435XAlbRecCod = new int[1] ;
      T01FL18_A396EmprCod = new String[] {""} ;
      T01FL18_A3435XAlbRecCod = new int[1] ;
      T01FL18_A3467XAlbRLin = new byte[1] ;
      T01FL18_A3468XAlbRObs = new String[] {""} ;
      T01FL18_n3468XAlbRObs = new boolean[] {false} ;
      T01FL19_A396EmprCod = new String[] {""} ;
      T01FL19_A3435XAlbRecCod = new int[1] ;
      T01FL19_A3467XAlbRLin = new byte[1] ;
      T01FL3_A396EmprCod = new String[] {""} ;
      T01FL3_A3435XAlbRecCod = new int[1] ;
      T01FL3_A3467XAlbRLin = new byte[1] ;
      T01FL3_A3468XAlbRObs = new String[] {""} ;
      T01FL3_n3468XAlbRObs = new boolean[] {false} ;
      T01FL2_A396EmprCod = new String[] {""} ;
      T01FL2_A3435XAlbRecCod = new int[1] ;
      T01FL2_A3467XAlbRLin = new byte[1] ;
      T01FL2_A3468XAlbRObs = new String[] {""} ;
      T01FL2_n3468XAlbRObs = new boolean[] {false} ;
      T01FL23_A396EmprCod = new String[] {""} ;
      T01FL23_A3435XAlbRecCod = new int[1] ;
      T01FL23_A3467XAlbRLin = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01FL24_A407EmprNom = new String[] {""} ;
      T01FL24_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.talbeob__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.talbeob__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.talbeob__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.talbeob__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbeob__default(),
         new Object[] {
             new Object[] {
            T01FL2_A396EmprCod, T01FL2_A3435XAlbRecCod, T01FL2_A3467XAlbRLin, T01FL2_A3468XAlbRObs, T01FL2_n3468XAlbRObs
            }
            , new Object[] {
            T01FL3_A396EmprCod, T01FL3_A3435XAlbRecCod, T01FL3_A3467XAlbRLin, T01FL3_A3468XAlbRObs, T01FL3_n3468XAlbRObs
            }
            , new Object[] {
            T01FL4_A3435XAlbRecCod, T01FL4_A3456XAlbRULin, T01FL4_n3456XAlbRULin, T01FL4_A396EmprCod
            }
            , new Object[] {
            T01FL5_A3435XAlbRecCod, T01FL5_A3456XAlbRULin, T01FL5_n3456XAlbRULin, T01FL5_A396EmprCod
            }
            , new Object[] {
            T01FL6_A407EmprNom, T01FL6_n407EmprNom
            }
            , new Object[] {
            T01FL7_A3435XAlbRecCod, T01FL7_A3456XAlbRULin, T01FL7_n3456XAlbRULin, T01FL7_A407EmprNom, T01FL7_n407EmprNom, T01FL7_A396EmprCod
            }
            , new Object[] {
            T01FL8_A396EmprCod, T01FL8_A3435XAlbRecCod
            }
            , new Object[] {
            T01FL9_A396EmprCod, T01FL9_A3435XAlbRecCod
            }
            , new Object[] {
            T01FL10_A396EmprCod, T01FL10_A3435XAlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FL14_A396EmprCod, T01FL14_A3435XAlbRecCod, T01FL14_A3461XAlbRecPie
            }
            , new Object[] {
            T01FL15_A396EmprCod, T01FL15_A3435XAlbRecCod, T01FL15_A5619XProCodAlb, T01FL15_A5620XProFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            T01FL17_A396EmprCod, T01FL17_A3435XAlbRecCod
            }
            , new Object[] {
            T01FL18_A396EmprCod, T01FL18_A3435XAlbRecCod, T01FL18_A3467XAlbRLin, T01FL18_A3468XAlbRObs, T01FL18_n3468XAlbRObs
            }
            , new Object[] {
            T01FL19_A396EmprCod, T01FL19_A3435XAlbRecCod, T01FL19_A3467XAlbRLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FL23_A396EmprCod, T01FL23_A3435XAlbRecCod, T01FL23_A3467XAlbRLin
            }
            , new Object[] {
            T01FL24_A407EmprNom, T01FL24_n407EmprNom
            }
         }
      );
      Z3435XAlbRecCod = 0 ;
      A3435XAlbRecCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z3456XAlbRULin ;
   private byte Z3467XAlbRLin ;
   private byte O3467XAlbRLin ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A3456XAlbRULin ;
   private byte Gx_BScreen ;
   private byte A3467XAlbRLin ;
   private byte T3467XAlbRLin ;
   private byte AV27FlagImp ;
   private byte GXv_int5[] ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ3456XAlbRULin ;
   private short nRcdDeleted_1575 ;
   private short nRcdExists_1575 ;
   private short nIsMod_1575 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1575 ;
   private short RcdFound1575 ;
   private short nBlankRcdUsr1575 ;
   private short RcdFound493 ;
   private short nIsDirty_493 ;
   private short nIsDirty_1575 ;
   private int wcpOA3435XAlbRecCod ;
   private int Z3435XAlbRecCod ;
   private int nRC_GXsfl_40 ;
   private int nGXsfl_40_idx=1 ;
   private int A3435XAlbRecCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtXAlbRecCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtXAlbRULin_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtavnRcdDeleted_1575_Enabled ;
   private int edtXAlbRLin_Enabled ;
   private int edtXAlbRObs_Enabled ;
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
   private int defedtXAlbRLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtXAlbRULin_Backcolor ;
   private int edtXAlbRecCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ3435XAlbRecCod ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String Z3468XAlbRObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtXAlbRULin_Internalname ;
   private String sGXsfl_40_idx="0001" ;
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
   private String edtXAlbRecCod_Internalname ;
   private String edtXAlbRecCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtXAlbRULin_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode1575 ;
   private String Gx_mode ;
   private String edtavnRcdDeleted_1575_Internalname ;
   private String edtXAlbRLin_Internalname ;
   private String edtXAlbRObs_Internalname ;
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
   private String sMode493 ;
   private String A3468XAlbRObs ;
   private String AV16Lit0 ;
   private String AV23LitFe ;
   private String AV17Lit1 ;
   private String AV18Lit2 ;
   private String AV19Lit4 ;
   private String AV20Lit5 ;
   private String AV21lit6 ;
   private String GXt_char1 ;
   private String AV25Station ;
   private String AV24EmprCod ;
   private String GXv_char2[] ;
   private String AV26EmprNom ;
   private String GXv_char3[] ;
   private String AV22UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1575_Jsonclick ;
   private String edtXAlbRLin_Jsonclick ;
   private String edtXAlbRObs_Jsonclick ;
   private String GXCCtl ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean n3456XAlbRULin ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n3468XAlbRObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01FL6_A407EmprNom ;
   private boolean[] T01FL6_n407EmprNom ;
   private int[] T01FL7_A3435XAlbRecCod ;
   private byte[] T01FL7_A3456XAlbRULin ;
   private boolean[] T01FL7_n3456XAlbRULin ;
   private String[] T01FL7_A407EmprNom ;
   private boolean[] T01FL7_n407EmprNom ;
   private String[] T01FL7_A396EmprCod ;
   private String[] T01FL8_A396EmprCod ;
   private int[] T01FL8_A3435XAlbRecCod ;
   private int[] T01FL5_A3435XAlbRecCod ;
   private byte[] T01FL5_A3456XAlbRULin ;
   private boolean[] T01FL5_n3456XAlbRULin ;
   private String[] T01FL5_A396EmprCod ;
   private String[] T01FL9_A396EmprCod ;
   private int[] T01FL9_A3435XAlbRecCod ;
   private String[] T01FL10_A396EmprCod ;
   private int[] T01FL10_A3435XAlbRecCod ;
   private int[] T01FL4_A3435XAlbRecCod ;
   private byte[] T01FL4_A3456XAlbRULin ;
   private boolean[] T01FL4_n3456XAlbRULin ;
   private String[] T01FL4_A396EmprCod ;
   private String[] T01FL14_A396EmprCod ;
   private int[] T01FL14_A3435XAlbRecCod ;
   private String[] T01FL14_A3461XAlbRecPie ;
   private String[] T01FL15_A396EmprCod ;
   private int[] T01FL15_A3435XAlbRecCod ;
   private String[] T01FL15_A5619XProCodAlb ;
   private byte[] T01FL15_A5620XProFasLin ;
   private String[] T01FL17_A396EmprCod ;
   private int[] T01FL17_A3435XAlbRecCod ;
   private String[] T01FL18_A396EmprCod ;
   private int[] T01FL18_A3435XAlbRecCod ;
   private byte[] T01FL18_A3467XAlbRLin ;
   private String[] T01FL18_A3468XAlbRObs ;
   private boolean[] T01FL18_n3468XAlbRObs ;
   private String[] T01FL19_A396EmprCod ;
   private int[] T01FL19_A3435XAlbRecCod ;
   private byte[] T01FL19_A3467XAlbRLin ;
   private String[] T01FL3_A396EmprCod ;
   private int[] T01FL3_A3435XAlbRecCod ;
   private byte[] T01FL3_A3467XAlbRLin ;
   private String[] T01FL3_A3468XAlbRObs ;
   private boolean[] T01FL3_n3468XAlbRObs ;
   private String[] T01FL2_A396EmprCod ;
   private int[] T01FL2_A3435XAlbRecCod ;
   private byte[] T01FL2_A3467XAlbRLin ;
   private String[] T01FL2_A3468XAlbRObs ;
   private boolean[] T01FL2_n3468XAlbRObs ;
   private String[] T01FL23_A396EmprCod ;
   private int[] T01FL23_A3435XAlbRecCod ;
   private byte[] T01FL23_A3467XAlbRLin ;
   private String[] T01FL24_A407EmprNom ;
   private boolean[] T01FL24_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class talbeob__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbeob__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbeob__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbeob__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbeob__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01FL2", "SELECT EmprCod, XAlbRecCod, XAlbRLin, XAlbRObs FROM TXPALBEOB WHERE EmprCod = ? AND XAlbRecCod = ? AND XAlbRLin = ?  FOR UPDATE OF XAlbRObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FL3", "SELECT EmprCod, XAlbRecCod, XAlbRLin, XAlbRObs FROM TXPALBEOB WHERE EmprCod = ? AND XAlbRecCod = ? AND XAlbRLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FL4", "SELECT XAlbRecCod, XAlbRULin, EmprCod FROM TXPALBEUR WHERE EmprCod = ? AND XAlbRecCod = ?  FOR UPDATE OF XAlbRULin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FL5", "SELECT XAlbRecCod, XAlbRULin, EmprCod FROM TXPALBEUR WHERE EmprCod = ? AND XAlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FL6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FL7", "SELECT /*+ FIRST_ROWS(1) */ TM1.XAlbRecCod, TM1.XAlbRULin, T2.EmprNom, TM1.EmprCod FROM (TXPALBEUR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.XAlbRecCod = ? ORDER BY TM1.EmprCod, TM1.XAlbRecCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FL8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, XAlbRecCod FROM TXPALBEUR WHERE EmprCod = ? AND XAlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FL9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, XAlbRecCod FROM TXPALBEUR WHERE EmprCod = ? and XAlbRecCod = ? ORDER BY EmprCod, XAlbRecCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FL10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, XAlbRecCod FROM TXPALBEUR WHERE EmprCod = ? and XAlbRecCod = ? ORDER BY EmprCod DESC, XAlbRecCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FL11", "INSERT INTO TXPALBEUR(XAlbRecCod, XAlbRULin, EmprCod, XCliCod, XAlbRef, XTrnCod, XAlbREnt, XAlbRPieEn, XAlbRUni, XAlbRLoc, XAlbRFen, XAlbRUniEn, XAlbRReo, XAlbRPieUt, XAlbRPieRe, XAlbRUniUt, XAlbRUniRe, XAlbRFecUl, XAlbREst, XTipEntCod, XAlbNumEti, XAlbRDes, XProceCod, XHisEmpUL, XAlbRDisC, XAlbRImp, XRutina, XAlbRefDsc, XAlbRefCom, Xprioritat) VALUES(?, ?, ?, 0, ' ', 0, ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', 0)", GX_NOMASK, "TXPALBEUR")
         ,new UpdateCursor("T01FL12", "UPDATE TXPALBEUR SET XAlbRULin=?  WHERE EmprCod = ? AND XAlbRecCod = ?", GX_NOMASK, "TXPALBEUR")
         ,new UpdateCursor("T01FL13", "DELETE FROM TXPALBEUR  WHERE EmprCod = ? AND XAlbRecCod = ?", GX_NOMASK, "TXPALBEUR")
         ,new ForEachCursor("T01FL14", "SELECT * FROM (SELECT EmprCod, XAlbRecCod, XAlbRecPie FROM TXPALBEUD WHERE EmprCod = ? AND XAlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FL15", "SELECT * FROM (SELECT EmprCod, XAlbRecCod, XProCodAlb, XProFasLin FROM TXPALBVPR WHERE EmprCod = ? AND XAlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FL16", "UPDATE TXPALBEUR SET XAlbRULin=?  WHERE EmprCod = ? AND XAlbRecCod = ?", GX_NOMASK, "TXPALBEUR")
         ,new ForEachCursor("T01FL17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, XAlbRecCod FROM TXPALBEUR WHERE EmprCod = ? and XAlbRecCod = ? ORDER BY EmprCod, XAlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FL18", "SELECT EmprCod, XAlbRecCod, XAlbRLin, XAlbRObs FROM TXPALBEOB WHERE EmprCod = ? and XAlbRecCod = ? and XAlbRLin = ? ORDER BY EmprCod, XAlbRecCod, XAlbRLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FL19", "SELECT EmprCod, XAlbRecCod, XAlbRLin FROM TXPALBEOB WHERE EmprCod = ? AND XAlbRecCod = ? AND XAlbRLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01FL20", "INSERT INTO TXPALBEOB(EmprCod, XAlbRecCod, XAlbRLin, XAlbRObs) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPALBEOB")
         ,new UpdateCursor("T01FL21", "UPDATE TXPALBEOB SET XAlbRObs=?  WHERE EmprCod = ? AND XAlbRecCod = ? AND XAlbRLin = ?", GX_NOMASK, "TXPALBEOB")
         ,new UpdateCursor("T01FL22", "DELETE FROM TXPALBEOB  WHERE EmprCod = ? AND XAlbRecCod = ? AND XAlbRLin = ?", GX_NOMASK, "TXPALBEOB")
         ,new ForEachCursor("T01FL23", "SELECT EmprCod, XAlbRecCod, XAlbRLin FROM TXPALBEOB WHERE EmprCod = ? and XAlbRecCod = ? ORDER BY EmprCod, XAlbRecCod, XAlbRLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FL24", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 22 :
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 60);
               }
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 60);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

