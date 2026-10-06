package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmaqdo2_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_2") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Documentos de las máquinas", ""), (short)(0)) ;
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
      nRC_GXsfl_35 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_35"))) ;
      nGXsfl_35_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_35_idx"))) ;
      sGXsfl_35_idx = httpContext.GetPar( "sGXsfl_35_idx") ;
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

   public tmaqdo2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmaqdo2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmaqdo2_impl.class ));
   }

   public tmaqdo2_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMaqDo2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMaqDo2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMaqDo2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMaqDo2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMaqDo2.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMaqDo2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMaqDo2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Código Máquina", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMaqDo2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMaqDo2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMaqDo2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Maq Ult Doc", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMaqDo2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqUltDoc_Internalname, GXutil.ltrim( localUtil.ntoc( A11429MaqUltDoc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqUltDoc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11429MaqUltDoc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11429MaqUltDoc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqUltDoc_Jsonclick, 0, "", "", "", "", "", 1, edtMaqUltDoc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMaqDo2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol35( ) ;
      nGXsfl_35_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1517 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1517 = (short)(1) ;
            scanStart1BT1517( ) ;
            while ( RcdFound1517 != 0 )
            {
               init_level_properties1517( ) ;
               getByPrimaryKey1BT1517( ) ;
               addRow1BT1517( ) ;
               scanNext1BT1517( ) ;
            }
            scanEnd1BT1517( ) ;
            nBlankRcdCount1517 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1BT1517( ) ;
         standaloneModal1BT1517( ) ;
         sMode1517 = Gx_mode ;
         while ( nGXsfl_35_idx < nRC_GXsfl_35 )
         {
            bGXsfl_35_Refreshing = true ;
            readRow1BT1517( ) ;
            edtavnRcdDeleted_1517_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1517_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1517_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1517_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtMaqDocId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQDOCID_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqDocId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDocId_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtMaqDocPath_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQDOCPATH_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqDocPath_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDocPath_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtMaqDocDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQDOCDSC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqDocDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDocDsc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            if ( ( nRcdExists_1517 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1BT1517( ) ;
            }
            sendRow1BT1517( ) ;
            bGXsfl_35_Refreshing = false ;
         }
         Gx_mode = sMode1517 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1517 = (short)(5) ;
         nRcdExists_1517 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1BT1517( ) ;
            while ( RcdFound1517 != 0 )
            {
               sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_351517( ) ;
               init_level_properties1517( ) ;
               standaloneNotModal1BT1517( ) ;
               getByPrimaryKey1BT1517( ) ;
               standaloneModal1BT1517( ) ;
               addRow1BT1517( ) ;
               scanNext1BT1517( ) ;
            }
            scanEnd1BT1517( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1517 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_351517( ) ;
      initAll1BT1517( ) ;
      init_level_properties1517( ) ;
      nRcdExists_1517 = (short)(0) ;
      nIsMod_1517 = (short)(0) ;
      nRcdDeleted_1517 = (short)(0) ;
      nBlankRcdCount1517 = (short)(nBlankRcdUsr1517+nBlankRcdCount1517) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1517 > 0 )
      {
         standaloneNotModal1BT1517( ) ;
         standaloneModal1BT1517( ) ;
         addRow1BT1517( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMaqDocId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1517 = (short)(nBlankRcdCount1517-1) ;
      }
      Gx_mode = sMode1517 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMaqDo2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMaqDo2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMaqDo2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMaqDo2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TMaqDo2.htm");
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
         Z602MaqCod = httpContext.cgiGet( "Z602MaqCod") ;
         Z11429MaqUltDoc = (short)(localUtil.ctol( httpContext.cgiGet( "Z11429MaqUltDoc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_35 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_35"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqUltDoc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqUltDoc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQULTDOC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMaqUltDoc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11429MaqUltDoc = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11429MaqUltDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11429MaqUltDoc), 4, 0));
         }
         else
         {
            A11429MaqUltDoc = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqUltDoc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11429MaqUltDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11429MaqUltDoc), 4, 0));
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
            n602MaqCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
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
            initAll1BT65( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1517_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1517_Enabled), 5, 0), !bGXsfl_35_Refreshing);
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
      disableAttributes1BT65( ) ;
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

   public void confirm_1BT0( )
   {
      beforeValidate1BT65( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1BT65( ) ;
         }
         else
         {
            checkExtendedTable1BT65( ) ;
            if ( AnyError == 0 )
            {
               zm1BT65( 2) ;
            }
            closeExtendedTableCursors1BT65( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode65 = Gx_mode ;
         confirm_1BT1517( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode65 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode65 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1BT0( ) ;
      }
   }

   public void confirm_1BT1517( )
   {
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRow1BT1517( ) ;
         if ( ( nRcdExists_1517 != 0 ) || ( nIsMod_1517 != 0 ) )
         {
            getKey1BT1517( ) ;
            if ( ( nRcdExists_1517 == 0 ) && ( nRcdDeleted_1517 == 0 ) )
            {
               if ( RcdFound1517 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1BT1517( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1BT1517( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1BT1517( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "MAQDOCID_" + sGXsfl_35_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMaqDocId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1517 != 0 )
               {
                  if ( nRcdDeleted_1517 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1BT1517( ) ;
                     load1BT1517( ) ;
                     beforeValidate1BT1517( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1BT1517( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1517 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1BT1517( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1BT1517( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1BT1517( ) ;
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
                  if ( nRcdDeleted_1517 == 0 )
                  {
                     GXCCtl = "MAQDOCID_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMaqDocId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1517_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1517, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqDocId_Internalname, GXutil.ltrim( localUtil.ntoc( A11432MaqDocId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqDocPath_Internalname, A11430MaqDocPath) ;
         httpContext.changePostValue( edtMaqDocDsc_Internalname, GXutil.rtrim( A11431MaqDocDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z11432MaqDocId_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z11432MaqDocId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11430MaqDocPath_"+sGXsfl_35_idx, Z11430MaqDocPath) ;
         httpContext.changePostValue( "ZT_"+"Z11431MaqDocDsc_"+sGXsfl_35_idx, GXutil.rtrim( Z11431MaqDocDsc)) ;
         httpContext.changePostValue( "nRcdDeleted_1517_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1517, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1517_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1517, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1517_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1517, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1517 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1517_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1517_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQDOCID_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqDocId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQDOCPATH_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqDocPath_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQDOCDSC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqDocDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1BT0( )
   {
   }

   public void zm1BT65( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11429MaqUltDoc = T01BT5_A11429MaqUltDoc[0] ;
         }
         else
         {
            Z11429MaqUltDoc = A11429MaqUltDoc ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z602MaqCod = A602MaqCod ;
         Z11429MaqUltDoc = A11429MaqUltDoc ;
         Z396EmprCod = A396EmprCod ;
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

   public void load1BT65( )
   {
      /* Using cursor T01BT7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A11429MaqUltDoc = T01BT7_A11429MaqUltDoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11429MaqUltDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11429MaqUltDoc), 4, 0));
         zm1BT65( -1) ;
      }
      pr_default.close(5);
      onLoadActions1BT65( ) ;
   }

   public void onLoadActions1BT65( )
   {
   }

   public void checkExtendedTable1BT65( )
   {
      nIsDirty_65 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01BT6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(4);
   }

   public void closeExtendedTableCursors1BT65( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01BT8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1BT65( )
   {
      /* Using cursor T01BT9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound65 = (short)(1) ;
      }
      else
      {
         RcdFound65 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01BT5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1BT65( 1) ;
         RcdFound65 = (short)(1) ;
         A602MaqCod = T01BT5_A602MaqCod[0] ;
         n602MaqCod = T01BT5_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A11429MaqUltDoc = T01BT5_A11429MaqUltDoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11429MaqUltDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11429MaqUltDoc), 4, 0));
         A396EmprCod = T01BT5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         sMode65 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1BT65( ) ;
         if ( AnyError == 1 )
         {
            RcdFound65 = (short)(0) ;
            initializeNonKey1BT65( ) ;
         }
         Gx_mode = sMode65 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound65 = (short)(0) ;
         initializeNonKey1BT65( ) ;
         sMode65 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode65 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1BT65( ) ;
      if ( RcdFound65 == 0 )
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
      RcdFound65 = (short)(0) ;
      /* Using cursor T01BT10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01BT10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01BT10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01BT10_A602MaqCod[0], A602MaqCod) < 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01BT10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01BT10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01BT10_A602MaqCod[0], A602MaqCod) > 0 ) ) )
         {
            A396EmprCod = T01BT10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = T01BT10_A602MaqCod[0] ;
            n602MaqCod = T01BT10_n602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            RcdFound65 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound65 = (short)(0) ;
      /* Using cursor T01BT11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01BT11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01BT11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01BT11_A602MaqCod[0], A602MaqCod) > 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01BT11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01BT11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01BT11_A602MaqCod[0], A602MaqCod) < 0 ) ) )
         {
            A396EmprCod = T01BT11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = T01BT11_A602MaqCod[0] ;
            n602MaqCod = T01BT11_n602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            RcdFound65 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1BT65( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1BT65( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound65 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A602MaqCod = Z602MaqCod ;
               n602MaqCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
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
               update1BT65( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1BT65( ) ;
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
                  insert1BT65( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = Z602MaqCod ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
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
      getKey1BT65( ) ;
      if ( RcdFound65 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = Z602MaqCod ;
            n602MaqCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmaqdo2");
      GX_FocusControl = edtMaqUltDoc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1BT0( ) ;
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
      if ( RcdFound65 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMaqUltDoc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1BT65( ) ;
      if ( RcdFound65 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqUltDoc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1BT65( ) ;
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
      if ( RcdFound65 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqUltDoc_Internalname ;
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
      if ( RcdFound65 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqUltDoc_Internalname ;
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
      scanStart1BT65( ) ;
      if ( RcdFound65 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound65 != 0 )
         {
            scanNext1BT65( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqUltDoc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1BT65( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1BT65( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BT4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQUIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z11429MaqUltDoc != T01BT4_A11429MaqUltDoc[0] ) )
         {
            if ( Z11429MaqUltDoc != T01BT4_A11429MaqUltDoc[0] )
            {
               GXutil.writeLogln("tmaqdo2:[seudo value changed for attri]"+"MaqUltDoc");
               GXutil.writeLogRaw("Old: ",Z11429MaqUltDoc);
               GXutil.writeLogRaw("Current: ",T01BT4_A11429MaqUltDoc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAQUIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BT65( )
   {
      beforeValidate1BT65( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BT65( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BT65( 0) ;
         checkOptimisticConcurrency1BT65( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BT65( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BT65( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BT12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n602MaqCod), A602MaqCod, Short.valueOf(A11429MaqUltDoc), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
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
                        processLevel1BT65( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1BT0( ) ;
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
            load1BT65( ) ;
         }
         endLevel1BT65( ) ;
      }
      closeExtendedTableCursors1BT65( ) ;
   }

   public void update1BT65( )
   {
      beforeValidate1BT65( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BT65( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BT65( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BT65( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1BT65( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BT13 */
                  pr_default.execute(11, new Object[] {Short.valueOf(A11429MaqUltDoc), A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQUIN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1BT65( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1BT65( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1BT0( ) ;
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
         endLevel1BT65( ) ;
      }
      closeExtendedTableCursors1BT65( ) ;
   }

   public void deferredUpdate1BT65( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BT65( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BT65( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BT65( ) ;
         afterConfirm1BT65( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BT65( ) ;
            if ( AnyError == 0 )
            {
               scanStart1BT1517( ) ;
               while ( RcdFound1517 != 0 )
               {
                  getByPrimaryKey1BT1517( ) ;
                  delete1BT1517( ) ;
                  scanNext1BT1517( ) ;
               }
               scanEnd1BT1517( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BT14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound65 == 0 )
                        {
                           initAll1BT65( ) ;
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
                        resetCaption1BT0( ) ;
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
      sMode65 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BT65( ) ;
      Gx_mode = sMode65 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BT65( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01BT15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Costes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01BT16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01BT17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Maquinas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01BT18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PLNMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01BT19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "No Conformidades", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01BT20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Recetas Lavados Maquina", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01BT21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Calendario Maquinas Tiempo NO planificado", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01BT22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Calendario Maquinas Tiempo por Mantenimiento", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01BT23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Consumos Lab. JBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01BT24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pedidos Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01BT25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Uso", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01BT26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Piezas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01BT27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MQDDOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01BT28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLATF1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01BT29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQTMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01BT30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQFABS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01BT31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MSolicitudes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01BT32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MPreventivo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01BT33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MOrdenes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01BT34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQPRG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01BT35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONVPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01BT36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01BT37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQTNQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01BT38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TARTM1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01BT39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01BT40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQGR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01BT41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Líneas Costes Retroalimentados", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01BT42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PlaMaq", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01BT43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01BT44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01BT45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFOC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01BT46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQTA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01BT47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANBRL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01BT48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Parámetros por maquina", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01BT49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01BT50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPLATI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01BT51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMAQMAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01BT52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMAQCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01BT53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COSTES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01BT54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01BT55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMHPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01BT56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01BT57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQHNP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01BT58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01BT59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CHIPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01BT60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRULIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01BT61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01BT62 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T01BT63 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
      }
   }

   public void processNestedLevel1BT1517( )
   {
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRow1BT1517( ) ;
         if ( ( nRcdExists_1517 != 0 ) || ( nIsMod_1517 != 0 ) )
         {
            standaloneNotModal1BT1517( ) ;
            getKey1BT1517( ) ;
            if ( ( nRcdExists_1517 == 0 ) && ( nRcdDeleted_1517 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1BT1517( ) ;
            }
            else
            {
               if ( RcdFound1517 != 0 )
               {
                  if ( ( nRcdDeleted_1517 != 0 ) && ( nRcdExists_1517 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1BT1517( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1517 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1BT1517( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1517 == 0 )
                  {
                     GXCCtl = "MAQDOCID_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMaqDocId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1517_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1517, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqDocId_Internalname, GXutil.ltrim( localUtil.ntoc( A11432MaqDocId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqDocPath_Internalname, A11430MaqDocPath) ;
         httpContext.changePostValue( edtMaqDocDsc_Internalname, GXutil.rtrim( A11431MaqDocDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z11432MaqDocId_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z11432MaqDocId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11430MaqDocPath_"+sGXsfl_35_idx, Z11430MaqDocPath) ;
         httpContext.changePostValue( "ZT_"+"Z11431MaqDocDsc_"+sGXsfl_35_idx, GXutil.rtrim( Z11431MaqDocDsc)) ;
         httpContext.changePostValue( "nRcdDeleted_1517_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1517, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1517_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1517, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1517_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1517, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1517 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1517_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1517_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQDOCID_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqDocId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQDOCPATH_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqDocPath_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQDOCDSC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqDocDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1BT1517( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1517 = (short)(0) ;
      nIsMod_1517 = (short)(0) ;
      nRcdDeleted_1517 = (short)(0) ;
   }

   public void processLevel1BT65( )
   {
      /* Save parent mode. */
      sMode65 = Gx_mode ;
      processNestedLevel1BT1517( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode65 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1BT65( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1BT65( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmaqdo2");
         if ( AnyError == 0 )
         {
            confirmValues1BT0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmaqdo2");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1BT65( )
   {
      /* Using cursor T01BT64 */
      pr_default.execute(62);
      RcdFound65 = (short)(0) ;
      if ( (pr_default.getStatus(62) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A396EmprCod = T01BT64_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T01BT64_A602MaqCod[0] ;
         n602MaqCod = T01BT64_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BT65( )
   {
      /* Scan next routine */
      pr_default.readNext(62);
      RcdFound65 = (short)(0) ;
      if ( (pr_default.getStatus(62) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A396EmprCod = T01BT64_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T01BT64_A602MaqCod[0] ;
         n602MaqCod = T01BT64_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      }
   }

   public void scanEnd1BT65( )
   {
      pr_default.close(62);
   }

   public void afterConfirm1BT65( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1BT65( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BT65( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BT65( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BT65( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BT65( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BT65( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtMaqUltDoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqUltDoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqUltDoc_Enabled), 5, 0), true);
   }

   public void zm1BT1517( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11430MaqDocPath = T01BT3_A11430MaqDocPath[0] ;
            Z11431MaqDocDsc = T01BT3_A11431MaqDocDsc[0] ;
         }
         else
         {
            Z11430MaqDocPath = A11430MaqDocPath ;
            Z11431MaqDocDsc = A11431MaqDocDsc ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z602MaqCod = A602MaqCod ;
         Z11432MaqDocId = A11432MaqDocId ;
         Z11430MaqDocPath = A11430MaqDocPath ;
         Z11431MaqDocDsc = A11431MaqDocDsc ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1BT1517( )
   {
   }

   public void standaloneModal1BT1517( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMaqDocId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqDocId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDocId_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      else
      {
         edtMaqDocId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqDocId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDocId_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
   }

   public void load1BT1517( )
   {
      /* Using cursor T01BT65 */
      pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Short.valueOf(A11432MaqDocId)});
      if ( (pr_default.getStatus(63) != 101) )
      {
         RcdFound1517 = (short)(1) ;
         A11430MaqDocPath = T01BT65_A11430MaqDocPath[0] ;
         A11431MaqDocDsc = T01BT65_A11431MaqDocDsc[0] ;
         zm1BT1517( -3) ;
      }
      pr_default.close(63);
      onLoadActions1BT1517( ) ;
   }

   public void onLoadActions1BT1517( )
   {
   }

   public void checkExtendedTable1BT1517( )
   {
      nIsDirty_1517 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1BT1517( ) ;
   }

   public void closeExtendedTableCursors1BT1517( )
   {
   }

   public void enableDisable1BT1517( )
   {
   }

   public void getKey1BT1517( )
   {
      /* Using cursor T01BT66 */
      pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Short.valueOf(A11432MaqDocId)});
      if ( (pr_default.getStatus(64) != 101) )
      {
         RcdFound1517 = (short)(1) ;
      }
      else
      {
         RcdFound1517 = (short)(0) ;
      }
      pr_default.close(64);
   }

   public void getByPrimaryKey1BT1517( )
   {
      /* Using cursor T01BT3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Short.valueOf(A11432MaqDocId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1BT1517( 3) ;
         RcdFound1517 = (short)(1) ;
         initializeNonKey1BT1517( ) ;
         A11432MaqDocId = T01BT3_A11432MaqDocId[0] ;
         A11430MaqDocPath = T01BT3_A11430MaqDocPath[0] ;
         A11431MaqDocDsc = T01BT3_A11431MaqDocDsc[0] ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z11432MaqDocId = A11432MaqDocId ;
         sMode1517 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BT1517( ) ;
         load1BT1517( ) ;
         Gx_mode = sMode1517 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1517 = (short)(0) ;
         initializeNonKey1BT1517( ) ;
         sMode1517 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BT1517( ) ;
         Gx_mode = sMode1517 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1BT1517( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1BT1517( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BT2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Short.valueOf(A11432MaqDocId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMaqDoc"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z11430MaqDocPath, T01BT2_A11430MaqDocPath[0]) != 0 ) || ( GXutil.strcmp(Z11431MaqDocDsc, T01BT2_A11431MaqDocDsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z11430MaqDocPath, T01BT2_A11430MaqDocPath[0]) != 0 )
            {
               GXutil.writeLogln("tmaqdo2:[seudo value changed for attri]"+"MaqDocPath");
               GXutil.writeLogRaw("Old: ",Z11430MaqDocPath);
               GXutil.writeLogRaw("Current: ",T01BT2_A11430MaqDocPath[0]);
            }
            if ( GXutil.strcmp(Z11431MaqDocDsc, T01BT2_A11431MaqDocDsc[0]) != 0 )
            {
               GXutil.writeLogln("tmaqdo2:[seudo value changed for attri]"+"MaqDocDsc");
               GXutil.writeLogRaw("Old: ",Z11431MaqDocDsc);
               GXutil.writeLogRaw("Current: ",T01BT2_A11431MaqDocDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMaqDoc"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BT1517( )
   {
      beforeValidate1BT1517( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BT1517( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BT1517( 0) ;
         checkOptimisticConcurrency1BT1517( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BT1517( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BT1517( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BT67 */
                  pr_default.execute(65, new Object[] {Boolean.valueOf(n602MaqCod), A602MaqCod, Short.valueOf(A11432MaqDocId), A11430MaqDocPath, A11431MaqDocDsc, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMaqDoc");
                  if ( (pr_default.getStatus(65) == 1) )
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
            load1BT1517( ) ;
         }
         endLevel1BT1517( ) ;
      }
      closeExtendedTableCursors1BT1517( ) ;
   }

   public void update1BT1517( )
   {
      beforeValidate1BT1517( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BT1517( ) ;
      }
      if ( ( nIsMod_1517 != 0 ) || ( nIsDirty_1517 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1BT1517( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1BT1517( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1BT1517( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01BT68 */
                     pr_default.execute(66, new Object[] {A11430MaqDocPath, A11431MaqDocDsc, A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Short.valueOf(A11432MaqDocId)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMaqDoc");
                     if ( (pr_default.getStatus(66) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMaqDoc"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1BT1517( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1BT1517( ) ;
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
            endLevel1BT1517( ) ;
         }
      }
      closeExtendedTableCursors1BT1517( ) ;
   }

   public void deferredUpdate1BT1517( )
   {
   }

   public void delete1BT1517( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BT1517( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BT1517( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BT1517( ) ;
         afterConfirm1BT1517( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BT1517( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01BT69 */
               pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Short.valueOf(A11432MaqDocId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMaqDoc");
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
      sMode1517 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BT1517( ) ;
      Gx_mode = sMode1517 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BT1517( )
   {
      standaloneModal1BT1517( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1BT1517( )
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

   public void scanStart1BT1517( )
   {
      /* Scan By routine */
      /* Using cursor T01BT70 */
      pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      RcdFound1517 = (short)(0) ;
      if ( (pr_default.getStatus(68) != 101) )
      {
         RcdFound1517 = (short)(1) ;
         A11432MaqDocId = T01BT70_A11432MaqDocId[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BT1517( )
   {
      /* Scan next routine */
      pr_default.readNext(68);
      RcdFound1517 = (short)(0) ;
      if ( (pr_default.getStatus(68) != 101) )
      {
         RcdFound1517 = (short)(1) ;
         A11432MaqDocId = T01BT70_A11432MaqDocId[0] ;
      }
   }

   public void scanEnd1BT1517( )
   {
      pr_default.close(68);
   }

   public void afterConfirm1BT1517( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1BT1517( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BT1517( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BT1517( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BT1517( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BT1517( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BT1517( )
   {
      edtMaqDocId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDocId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDocId_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtMaqDocPath_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDocPath_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDocPath_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtMaqDocDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDocDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDocDsc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void send_integrity_lvl_hashes1BT1517( )
   {
   }

   public void send_integrity_lvl_hashes1BT65( )
   {
   }

   public void subsflControlProps_351517( )
   {
      edtavnRcdDeleted_1517_Internalname = "vNRCDDELETED_1517_"+sGXsfl_35_idx ;
      edtMaqDocId_Internalname = "MAQDOCID_"+sGXsfl_35_idx ;
      edtMaqDocPath_Internalname = "MAQDOCPATH_"+sGXsfl_35_idx ;
      edtMaqDocDsc_Internalname = "MAQDOCDSC_"+sGXsfl_35_idx ;
   }

   public void subsflControlProps_fel_351517( )
   {
      edtavnRcdDeleted_1517_Internalname = "vNRCDDELETED_1517_"+sGXsfl_35_fel_idx ;
      edtMaqDocId_Internalname = "MAQDOCID_"+sGXsfl_35_fel_idx ;
      edtMaqDocPath_Internalname = "MAQDOCPATH_"+sGXsfl_35_fel_idx ;
      edtMaqDocDsc_Internalname = "MAQDOCDSC_"+sGXsfl_35_fel_idx ;
   }

   public void addRow1BT1517( )
   {
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_351517( ) ;
      sendRow1BT1517( ) ;
   }

   public void sendRow1BT1517( )
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
         if ( ((int)((nGXsfl_35_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1517_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1517_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1517, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1517_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1517), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1517), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1517_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1517_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1517_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqDocId_Internalname,GXutil.ltrim( localUtil.ntoc( A11432MaqDocId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11432MaqDocId), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqDocId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqDocId_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1517_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqDocPath_Internalname,A11430MaqDocPath,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqDocPath_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqDocPath_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1024),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1517_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqDocDsc_Internalname,GXutil.rtrim( A11431MaqDocDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqDocDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqDocDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1BT1517( ) ;
      GXCCtl = "Z11432MaqDocId_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11432MaqDocId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11430MaqDocPath_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z11430MaqDocPath);
      GXCCtl = "Z11431MaqDocDsc_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11431MaqDocDsc));
      GXCCtl = "nRcdDeleted_1517_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1517, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1517_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1517, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1517_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1517, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1517_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1517_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQDOCID_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqDocId_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQDOCPATH_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqDocPath_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQDOCDSC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqDocDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1BT1517( )
   {
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_351517( ) ;
      edtavnRcdDeleted_1517_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1517_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqDocId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQDOCID_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqDocPath_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQDOCPATH_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqDocDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQDOCDSC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1517_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1517_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1517");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1517_Internalname ;
         wbErr = true ;
         nRcdDeleted_1517 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1517 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1517_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMaqDocId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMaqDocId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "MAQDOCID_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqDocId_Internalname ;
         wbErr = true ;
         A11432MaqDocId = (short)(0) ;
      }
      else
      {
         A11432MaqDocId = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqDocId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A11430MaqDocPath = httpContext.cgiGet( edtMaqDocPath_Internalname) ;
      A11431MaqDocDsc = httpContext.cgiGet( edtMaqDocDsc_Internalname) ;
      GXCCtl = "Z11432MaqDocId_" + sGXsfl_35_idx ;
      Z11432MaqDocId = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11430MaqDocPath_" + sGXsfl_35_idx ;
      Z11430MaqDocPath = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11431MaqDocDsc_" + sGXsfl_35_idx ;
      Z11431MaqDocDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1517_" + sGXsfl_35_idx ;
      nRcdDeleted_1517 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1517_" + sGXsfl_35_idx ;
      nRcdExists_1517 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1517_" + sGXsfl_35_idx ;
      nIsMod_1517 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMaqDocId_Enabled = edtMaqDocId_Enabled ;
   }

   public void confirmValues1BT0( )
   {
      nGXsfl_35_idx = 0 ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_351517( ) ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_351517( ) ;
         httpContext.changePostValue( "Z11432MaqDocId_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z11432MaqDocId_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11432MaqDocId_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z11430MaqDocPath_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z11430MaqDocPath_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11430MaqDocPath_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z11431MaqDocDsc_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z11431MaqDocDsc_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11431MaqDocDsc_"+sGXsfl_35_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tmaqdo2", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11429MaqUltDoc", GXutil.ltrim( localUtil.ntoc( Z11429MaqUltDoc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_35", GXutil.ltrim( localUtil.ntoc( nGXsfl_35_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tmaqdo2", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TMaqDo2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Documentos de las máquinas", "") ;
   }

   public void initializeNonKey1BT65( )
   {
      A11429MaqUltDoc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11429MaqUltDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11429MaqUltDoc), 4, 0));
      Z11429MaqUltDoc = (short)(0) ;
   }

   public void initAll1BT65( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A602MaqCod = "" ;
      n602MaqCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      initializeNonKey1BT65( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1BT1517( )
   {
      A11430MaqDocPath = "" ;
      A11431MaqDocDsc = "" ;
      Z11430MaqDocPath = "" ;
      Z11431MaqDocDsc = "" ;
   }

   public void initAll1BT1517( )
   {
      A11432MaqDocId = (short)(0) ;
      initializeNonKey1BT1517( ) ;
   }

   public void standaloneModalInsert1BT1517( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824156571", true, true);
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
      httpContext.AddJavascriptSource("tmaqdo2.js", "?2026824156572", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1517( )
   {
      edtMaqDocId_Enabled = defedtMaqDocId_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDocId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDocId_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void startgridcontrol35( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1517, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1517_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11432MaqDocId, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqDocId_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A11430MaqDocPath);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqDocPath_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11431MaqDocDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqDocDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtMaqUltDoc_Internalname = "MAQULTDOC" ;
      edtavnRcdDeleted_1517_Internalname = "vNRCDDELETED_1517" ;
      edtMaqDocId_Internalname = "MAQDOCID" ;
      edtMaqDocPath_Internalname = "MAQDOCPATH" ;
      edtMaqDocDsc_Internalname = "MAQDOCDSC" ;
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
      Form.setCaption( httpContext.getMessage( "Documentos de las máquinas", "") );
      edtMaqDocDsc_Jsonclick = "" ;
      edtMaqDocPath_Jsonclick = "" ;
      edtMaqDocId_Jsonclick = "" ;
      edtavnRcdDeleted_1517_Jsonclick = "" ;
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
      edtMaqDocDsc_Enabled = 1 ;
      edtMaqDocPath_Enabled = 1 ;
      edtMaqDocId_Enabled = 1 ;
      edtavnRcdDeleted_1517_Enabled = 1 ;
      edtMaqUltDoc_Jsonclick = "" ;
      edtMaqUltDoc_Backcolor = (int)(0xFFFFFF) ;
      edtMaqUltDoc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Backcolor = (int)(0xFFFFFF) ;
      edtMaqCod_Enabled = 1 ;
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
      subsflControlProps_351517( ) ;
      while ( nGXsfl_35_idx <= nRC_GXsfl_35 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1BT1517( ) ;
         standaloneModal1BT1517( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1BT1517( ) ;
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_351517( ) ;
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
      /* Using cursor T01BT71 */
      pr_default.execute(69, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(69) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(69);
      GX_FocusControl = edtMaqUltDoc_Internalname ;
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
      /* Using cursor T01BT71 */
      pr_default.execute(69, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(69) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(69);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Maqcod( )
   {
      n602MaqCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11429MaqUltDoc", GXutil.ltrim( localUtil.ntoc( A11429MaqUltDoc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11429MaqUltDoc", GXutil.ltrim( localUtil.ntoc( Z11429MaqUltDoc, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MAQCOD",",oparms:[{av:'A11429MaqUltDoc',fld:'MAQULTDOC',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z602MaqCod'},{av:'Z11429MaqUltDoc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MAQDOCID","{handler:'valid_Maqdocid',iparms:[]");
      setEventMetadata("VALID_MAQDOCID",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Maqdocdsc',iparms:[]");
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
      pr_default.close(69);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z602MaqCod = "" ;
      Z11430MaqDocPath = "" ;
      Z11431MaqDocDsc = "" ;
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
      A602MaqCod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1517 = "" ;
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
      sMode65 = "" ;
      GXCCtl = "" ;
      A11430MaqDocPath = "" ;
      A11431MaqDocDsc = "" ;
      T01BT7_A602MaqCod = new String[] {""} ;
      T01BT7_n602MaqCod = new boolean[] {false} ;
      T01BT7_A11429MaqUltDoc = new short[1] ;
      T01BT7_A396EmprCod = new String[] {""} ;
      T01BT6_A396EmprCod = new String[] {""} ;
      T01BT8_A396EmprCod = new String[] {""} ;
      T01BT9_A396EmprCod = new String[] {""} ;
      T01BT9_A602MaqCod = new String[] {""} ;
      T01BT9_n602MaqCod = new boolean[] {false} ;
      T01BT5_A602MaqCod = new String[] {""} ;
      T01BT5_n602MaqCod = new boolean[] {false} ;
      T01BT5_A11429MaqUltDoc = new short[1] ;
      T01BT5_A396EmprCod = new String[] {""} ;
      T01BT10_A396EmprCod = new String[] {""} ;
      T01BT10_A602MaqCod = new String[] {""} ;
      T01BT10_n602MaqCod = new boolean[] {false} ;
      T01BT11_A396EmprCod = new String[] {""} ;
      T01BT11_A602MaqCod = new String[] {""} ;
      T01BT11_n602MaqCod = new boolean[] {false} ;
      T01BT4_A602MaqCod = new String[] {""} ;
      T01BT4_n602MaqCod = new boolean[] {false} ;
      T01BT4_A11429MaqUltDoc = new short[1] ;
      T01BT4_A396EmprCod = new String[] {""} ;
      T01BT15_A396EmprCod = new String[] {""} ;
      T01BT15_A602MaqCod = new String[] {""} ;
      T01BT15_n602MaqCod = new boolean[] {false} ;
      T01BT15_A14529MqCAnyo = new short[1] ;
      T01BT15_A14530MqCMes = new byte[1] ;
      T01BT16_A396EmprCod = new String[] {""} ;
      T01BT16_A129BarCod = new int[1] ;
      T01BT16_A132BarCodReo = new byte[1] ;
      T01BT16_A130BarCodPar = new String[] {""} ;
      T01BT16_A14152MEnvOrd = new short[1] ;
      T01BT17_A396EmprCod = new String[] {""} ;
      T01BT17_A13604RARID = new int[1] ;
      T01BT17_A602MaqCod = new String[] {""} ;
      T01BT17_n602MaqCod = new boolean[] {false} ;
      T01BT18_A396EmprCod = new String[] {""} ;
      T01BT18_A602MaqCod = new String[] {""} ;
      T01BT18_n602MaqCod = new boolean[] {false} ;
      T01BT18_A13193MaqHdr = new int[1] ;
      T01BT18_A13194MaqHdrR = new byte[1] ;
      T01BT18_A13195MaqHdrP = new String[] {""} ;
      T01BT18_A13196MaqRecLinM = new short[1] ;
      T01BT19_A396EmprCod = new String[] {""} ;
      T01BT19_A13137NCHdr = new int[1] ;
      T01BT19_A13138NCHdrr = new byte[1] ;
      T01BT19_A13139NCHdrp = new String[] {""} ;
      T01BT20_A396EmprCod = new String[] {""} ;
      T01BT20_A12673LavMqId = new int[1] ;
      T01BT21_A396EmprCod = new String[] {""} ;
      T01BT21_A602MaqCod = new String[] {""} ;
      T01BT21_n602MaqCod = new boolean[] {false} ;
      T01BT21_A12444MaqAnyNP = new short[1] ;
      T01BT21_A12445MaqMesNP = new byte[1] ;
      T01BT22_A396EmprCod = new String[] {""} ;
      T01BT22_A602MaqCod = new String[] {""} ;
      T01BT22_n602MaqCod = new boolean[] {false} ;
      T01BT22_A12434MaqAnyM = new short[1] ;
      T01BT22_A12435MaqMesM = new byte[1] ;
      T01BT23_A396EmprCod = new String[] {""} ;
      T01BT23_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01BT23_A5728JBCLLin = new short[1] ;
      T01BT24_A396EmprCod = new String[] {""} ;
      T01BT24_A11604PArtId = new int[1] ;
      T01BT25_A396EmprCod = new String[] {""} ;
      T01BT25_A602MaqCod = new String[] {""} ;
      T01BT25_n602MaqCod = new boolean[] {false} ;
      T01BT25_A11445MaqFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01BT26_A396EmprCod = new String[] {""} ;
      T01BT26_A602MaqCod = new String[] {""} ;
      T01BT26_n602MaqCod = new boolean[] {false} ;
      T01BT26_A11438MaqEquCod = new String[] {""} ;
      T01BT26_A11439MaqSEqCod = new String[] {""} ;
      T01BT26_A11440MaqPieCod = new String[] {""} ;
      T01BT27_A396EmprCod = new String[] {""} ;
      T01BT27_A602MaqCod = new String[] {""} ;
      T01BT27_n602MaqCod = new boolean[] {false} ;
      T01BT27_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01BT27_A10112Mq_Op = new int[1] ;
      T01BT28_A396EmprCod = new String[] {""} ;
      T01BT28_A252CliCod = new int[1] ;
      T01BT28_A65ArtCod = new String[] {""} ;
      T01BT28_A10041ArtSH = new String[] {""} ;
      T01BT28_A10042ArtMqFa = new String[] {""} ;
      T01BT29_A396EmprCod = new String[] {""} ;
      T01BT29_A602MaqCod = new String[] {""} ;
      T01BT29_n602MaqCod = new boolean[] {false} ;
      T01BT29_A74MaqTMuIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01BT30_A396EmprCod = new String[] {""} ;
      T01BT30_A602MaqCod = new String[] {""} ;
      T01BT30_n602MaqCod = new boolean[] {false} ;
      T01BT30_A9725MaqFabC = new String[] {""} ;
      T01BT31_A396EmprCod = new String[] {""} ;
      T01BT31_A9428SMCod = new int[1] ;
      T01BT32_A396EmprCod = new String[] {""} ;
      T01BT32_A9429PMCod = new int[1] ;
      T01BT33_A396EmprCod = new String[] {""} ;
      T01BT33_A9425OMCod = new int[1] ;
      T01BT34_A396EmprCod = new String[] {""} ;
      T01BT34_A602MaqCod = new String[] {""} ;
      T01BT34_n602MaqCod = new boolean[] {false} ;
      T01BT34_A8008Maq_Prg = new String[] {""} ;
      T01BT35_A396EmprCod = new String[] {""} ;
      T01BT35_A602MaqCod = new String[] {""} ;
      T01BT35_n602MaqCod = new boolean[] {false} ;
      T01BT35_A6874CPROCORIG = new String[] {""} ;
      T01BT36_A396EmprCod = new String[] {""} ;
      T01BT36_A6319C_Barcod = new int[1] ;
      T01BT36_A6320C_Barcodre = new byte[1] ;
      T01BT36_A6321C_Barcodpa = new String[] {""} ;
      T01BT36_A6322C_Reclinma = new short[1] ;
      T01BT37_A396EmprCod = new String[] {""} ;
      T01BT37_A602MaqCod = new String[] {""} ;
      T01BT37_n602MaqCod = new boolean[] {false} ;
      T01BT37_A6260MaqTqn = new byte[1] ;
      T01BT38_A396EmprCod = new String[] {""} ;
      T01BT38_A6188MaqTArt = new short[1] ;
      T01BT38_A602MaqCod = new String[] {""} ;
      T01BT38_n602MaqCod = new boolean[] {false} ;
      T01BT39_A396EmprCod = new String[] {""} ;
      T01BT39_A602MaqCod = new String[] {""} ;
      T01BT39_n602MaqCod = new boolean[] {false} ;
      T01BT39_A6078MaqCliCod = new int[1] ;
      T01BT39_A6079MaqArtCod = new String[] {""} ;
      T01BT40_A396EmprCod = new String[] {""} ;
      T01BT40_A6037Mq_Grupo = new byte[1] ;
      T01BT40_A602MaqCod = new String[] {""} ;
      T01BT40_n602MaqCod = new boolean[] {false} ;
      T01BT41_A396EmprCod = new String[] {""} ;
      T01BT41_A6000CRCod = new String[] {""} ;
      T01BT41_A6005CRLin = new short[1] ;
      T01BT42_A396EmprCod = new String[] {""} ;
      T01BT42_A602MaqCod = new String[] {""} ;
      T01BT42_n602MaqCod = new boolean[] {false} ;
      T01BT42_A5879PlaMTAOrd = new short[1] ;
      T01BT43_A396EmprCod = new String[] {""} ;
      T01BT43_A5603PrdNumM = new String[] {""} ;
      T01BT43_A602MaqCod = new String[] {""} ;
      T01BT43_n602MaqCod = new boolean[] {false} ;
      T01BT44_A396EmprCod = new String[] {""} ;
      T01BT44_A602MaqCod = new String[] {""} ;
      T01BT44_n602MaqCod = new boolean[] {false} ;
      T01BT44_A5525MaqPrdNum = new String[] {""} ;
      T01BT45_A396EmprCod = new String[] {""} ;
      T01BT45_A764ProForCod = new String[] {""} ;
      T01BT45_A5191ProForLC = new short[1] ;
      T01BT46_A396EmprCod = new String[] {""} ;
      T01BT46_A4686MaqTipArt = new short[1] ;
      T01BT46_A602MaqCod = new String[] {""} ;
      T01BT46_n602MaqCod = new boolean[] {false} ;
      T01BT47_A396EmprCod = new String[] {""} ;
      T01BT47_A3331LanBroCod = new byte[1] ;
      T01BT47_A3333LanBroLin = new short[1] ;
      T01BT48_A396EmprCod = new String[] {""} ;
      T01BT48_A602MaqCod = new String[] {""} ;
      T01BT48_n602MaqCod = new boolean[] {false} ;
      T01BT48_A3047LOParId = new String[] {""} ;
      T01BT49_A396EmprCod = new String[] {""} ;
      T01BT49_A129BarCod = new int[1] ;
      T01BT49_A132BarCodReo = new byte[1] ;
      T01BT49_A130BarCodPar = new String[] {""} ;
      T01BT49_A2804RecLinMaq = new short[1] ;
      T01BT50_A396EmprCod = new String[] {""} ;
      T01BT50_A602MaqCod = new String[] {""} ;
      T01BT50_n602MaqCod = new boolean[] {false} ;
      T01BT50_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T01BT51_A396EmprCod = new String[] {""} ;
      T01BT51_A602MaqCod = new String[] {""} ;
      T01BT51_n602MaqCod = new boolean[] {false} ;
      T01BT51_A2019MaqMadLin = new short[1] ;
      T01BT52_A396EmprCod = new String[] {""} ;
      T01BT52_A602MaqCod = new String[] {""} ;
      T01BT52_n602MaqCod = new boolean[] {false} ;
      T01BT52_A2014MaqConLin = new short[1] ;
      T01BT53_A396EmprCod = new String[] {""} ;
      T01BT53_A1621CosTermCod = new String[] {""} ;
      T01BT53_A1615CosLin = new int[1] ;
      T01BT54_A396EmprCod = new String[] {""} ;
      T01BT54_A602MaqCod = new String[] {""} ;
      T01BT54_n602MaqCod = new boolean[] {false} ;
      T01BT54_A1142MaqFCod = new String[] {""} ;
      T01BT55_A396EmprCod = new String[] {""} ;
      T01BT55_A602MaqCod = new String[] {""} ;
      T01BT55_n602MaqCod = new boolean[] {false} ;
      T01BT55_A634MhiMes = new byte[1] ;
      T01BT55_A632MhiAny = new short[1] ;
      T01BT56_A396EmprCod = new String[] {""} ;
      T01BT56_A602MaqCod = new String[] {""} ;
      T01BT56_n602MaqCod = new boolean[] {false} ;
      T01BT56_A320DesTecLin = new byte[1] ;
      T01BT57_A396EmprCod = new String[] {""} ;
      T01BT57_A602MaqCod = new String[] {""} ;
      T01BT57_n602MaqCod = new boolean[] {false} ;
      T01BT57_A599MaqAny = new short[1] ;
      T01BT57_A614MaqMes = new byte[1] ;
      T01BT58_A396EmprCod = new String[] {""} ;
      T01BT58_A539HisBarCod = new int[1] ;
      T01BT58_A545HisCodReo = new byte[1] ;
      T01BT58_A544HisCodPar = new String[] {""} ;
      T01BT58_A833TipDefCod = new short[1] ;
      T01BT59_A396EmprCod = new String[] {""} ;
      T01BT59_A602MaqCod = new String[] {""} ;
      T01BT59_n602MaqCod = new boolean[] {false} ;
      T01BT59_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01BT60_A396EmprCod = new String[] {""} ;
      T01BT60_A501GruMaqCod = new String[] {""} ;
      T01BT60_A602MaqCod = new String[] {""} ;
      T01BT60_n602MaqCod = new boolean[] {false} ;
      T01BT61_A396EmprCod = new String[] {""} ;
      T01BT61_A457FasCod = new String[] {""} ;
      T01BT62_A396EmprCod = new String[] {""} ;
      T01BT62_A361DisCod = new int[1] ;
      T01BT63_A396EmprCod = new String[] {""} ;
      T01BT63_A129BarCod = new int[1] ;
      T01BT63_A132BarCodReo = new byte[1] ;
      T01BT63_A130BarCodPar = new String[] {""} ;
      T01BT63_A758ProCod = new String[] {""} ;
      T01BT63_A194BarOrdLin = new short[1] ;
      T01BT64_A396EmprCod = new String[] {""} ;
      T01BT64_A602MaqCod = new String[] {""} ;
      T01BT64_n602MaqCod = new boolean[] {false} ;
      T01BT65_A602MaqCod = new String[] {""} ;
      T01BT65_n602MaqCod = new boolean[] {false} ;
      T01BT65_A11432MaqDocId = new short[1] ;
      T01BT65_A11430MaqDocPath = new String[] {""} ;
      T01BT65_A11431MaqDocDsc = new String[] {""} ;
      T01BT65_A396EmprCod = new String[] {""} ;
      T01BT66_A396EmprCod = new String[] {""} ;
      T01BT66_A602MaqCod = new String[] {""} ;
      T01BT66_n602MaqCod = new boolean[] {false} ;
      T01BT66_A11432MaqDocId = new short[1] ;
      T01BT3_A602MaqCod = new String[] {""} ;
      T01BT3_n602MaqCod = new boolean[] {false} ;
      T01BT3_A11432MaqDocId = new short[1] ;
      T01BT3_A11430MaqDocPath = new String[] {""} ;
      T01BT3_A11431MaqDocDsc = new String[] {""} ;
      T01BT3_A396EmprCod = new String[] {""} ;
      T01BT2_A602MaqCod = new String[] {""} ;
      T01BT2_n602MaqCod = new boolean[] {false} ;
      T01BT2_A11432MaqDocId = new short[1] ;
      T01BT2_A11430MaqDocPath = new String[] {""} ;
      T01BT2_A11431MaqDocDsc = new String[] {""} ;
      T01BT2_A396EmprCod = new String[] {""} ;
      T01BT70_A396EmprCod = new String[] {""} ;
      T01BT70_A602MaqCod = new String[] {""} ;
      T01BT70_n602MaqCod = new boolean[] {false} ;
      T01BT70_A11432MaqDocId = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01BT71_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ602MaqCod = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tmaqdo2__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmaqdo2__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmaqdo2__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmaqdo2__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmaqdo2__default(),
         new Object[] {
             new Object[] {
            T01BT2_A602MaqCod, T01BT2_A11432MaqDocId, T01BT2_A11430MaqDocPath, T01BT2_A11431MaqDocDsc, T01BT2_A396EmprCod
            }
            , new Object[] {
            T01BT3_A602MaqCod, T01BT3_A11432MaqDocId, T01BT3_A11430MaqDocPath, T01BT3_A11431MaqDocDsc, T01BT3_A396EmprCod
            }
            , new Object[] {
            T01BT4_A602MaqCod, T01BT4_A11429MaqUltDoc, T01BT4_A396EmprCod
            }
            , new Object[] {
            T01BT5_A602MaqCod, T01BT5_A11429MaqUltDoc, T01BT5_A396EmprCod
            }
            , new Object[] {
            T01BT6_A396EmprCod
            }
            , new Object[] {
            T01BT7_A602MaqCod, T01BT7_A11429MaqUltDoc, T01BT7_A396EmprCod
            }
            , new Object[] {
            T01BT8_A396EmprCod
            }
            , new Object[] {
            T01BT9_A396EmprCod, T01BT9_A602MaqCod
            }
            , new Object[] {
            T01BT10_A396EmprCod, T01BT10_A602MaqCod
            }
            , new Object[] {
            T01BT11_A396EmprCod, T01BT11_A602MaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BT15_A396EmprCod, T01BT15_A602MaqCod, T01BT15_A14529MqCAnyo, T01BT15_A14530MqCMes
            }
            , new Object[] {
            T01BT16_A396EmprCod, T01BT16_A129BarCod, T01BT16_A132BarCodReo, T01BT16_A130BarCodPar, T01BT16_A14152MEnvOrd
            }
            , new Object[] {
            T01BT17_A396EmprCod, T01BT17_A13604RARID, T01BT17_A602MaqCod
            }
            , new Object[] {
            T01BT18_A396EmprCod, T01BT18_A602MaqCod, T01BT18_A13193MaqHdr, T01BT18_A13194MaqHdrR, T01BT18_A13195MaqHdrP, T01BT18_A13196MaqRecLinM
            }
            , new Object[] {
            T01BT19_A396EmprCod, T01BT19_A13137NCHdr, T01BT19_A13138NCHdrr, T01BT19_A13139NCHdrp
            }
            , new Object[] {
            T01BT20_A396EmprCod, T01BT20_A12673LavMqId
            }
            , new Object[] {
            T01BT21_A396EmprCod, T01BT21_A602MaqCod, T01BT21_A12444MaqAnyNP, T01BT21_A12445MaqMesNP
            }
            , new Object[] {
            T01BT22_A396EmprCod, T01BT22_A602MaqCod, T01BT22_A12434MaqAnyM, T01BT22_A12435MaqMesM
            }
            , new Object[] {
            T01BT23_A396EmprCod, T01BT23_A4929Inc_Dia, T01BT23_A5728JBCLLin
            }
            , new Object[] {
            T01BT24_A396EmprCod, T01BT24_A11604PArtId
            }
            , new Object[] {
            T01BT25_A396EmprCod, T01BT25_A602MaqCod, T01BT25_A11445MaqFch
            }
            , new Object[] {
            T01BT26_A396EmprCod, T01BT26_A602MaqCod, T01BT26_A11438MaqEquCod, T01BT26_A11439MaqSEqCod, T01BT26_A11440MaqPieCod
            }
            , new Object[] {
            T01BT27_A396EmprCod, T01BT27_A602MaqCod, T01BT27_A10111Mq_Dia, T01BT27_A10112Mq_Op
            }
            , new Object[] {
            T01BT28_A396EmprCod, T01BT28_A252CliCod, T01BT28_A65ArtCod, T01BT28_A10041ArtSH, T01BT28_A10042ArtMqFa
            }
            , new Object[] {
            T01BT29_A396EmprCod, T01BT29_A602MaqCod, T01BT29_A74MaqTMuIni
            }
            , new Object[] {
            T01BT30_A396EmprCod, T01BT30_A602MaqCod, T01BT30_A9725MaqFabC
            }
            , new Object[] {
            T01BT31_A396EmprCod, T01BT31_A9428SMCod
            }
            , new Object[] {
            T01BT32_A396EmprCod, T01BT32_A9429PMCod
            }
            , new Object[] {
            T01BT33_A396EmprCod, T01BT33_A9425OMCod
            }
            , new Object[] {
            T01BT34_A396EmprCod, T01BT34_A602MaqCod, T01BT34_A8008Maq_Prg
            }
            , new Object[] {
            T01BT35_A396EmprCod, T01BT35_A602MaqCod, T01BT35_A6874CPROCORIG
            }
            , new Object[] {
            T01BT36_A396EmprCod, T01BT36_A6319C_Barcod, T01BT36_A6320C_Barcodre, T01BT36_A6321C_Barcodpa, T01BT36_A6322C_Reclinma
            }
            , new Object[] {
            T01BT37_A396EmprCod, T01BT37_A602MaqCod, T01BT37_A6260MaqTqn
            }
            , new Object[] {
            T01BT38_A396EmprCod, T01BT38_A6188MaqTArt, T01BT38_A602MaqCod
            }
            , new Object[] {
            T01BT39_A396EmprCod, T01BT39_A602MaqCod, T01BT39_A6078MaqCliCod, T01BT39_A6079MaqArtCod
            }
            , new Object[] {
            T01BT40_A396EmprCod, T01BT40_A6037Mq_Grupo, T01BT40_A602MaqCod
            }
            , new Object[] {
            T01BT41_A396EmprCod, T01BT41_A6000CRCod, T01BT41_A6005CRLin
            }
            , new Object[] {
            T01BT42_A396EmprCod, T01BT42_A602MaqCod, T01BT42_A5879PlaMTAOrd
            }
            , new Object[] {
            T01BT43_A396EmprCod, T01BT43_A5603PrdNumM, T01BT43_A602MaqCod
            }
            , new Object[] {
            T01BT44_A396EmprCod, T01BT44_A602MaqCod, T01BT44_A5525MaqPrdNum
            }
            , new Object[] {
            T01BT45_A396EmprCod, T01BT45_A764ProForCod, T01BT45_A5191ProForLC
            }
            , new Object[] {
            T01BT46_A396EmprCod, T01BT46_A4686MaqTipArt, T01BT46_A602MaqCod
            }
            , new Object[] {
            T01BT47_A396EmprCod, T01BT47_A3331LanBroCod, T01BT47_A3333LanBroLin
            }
            , new Object[] {
            T01BT48_A396EmprCod, T01BT48_A602MaqCod, T01BT48_A3047LOParId
            }
            , new Object[] {
            T01BT49_A396EmprCod, T01BT49_A129BarCod, T01BT49_A132BarCodReo, T01BT49_A130BarCodPar, T01BT49_A2804RecLinMaq
            }
            , new Object[] {
            T01BT50_A396EmprCod, T01BT50_A602MaqCod, T01BT50_A2461PlaFecTin
            }
            , new Object[] {
            T01BT51_A396EmprCod, T01BT51_A602MaqCod, T01BT51_A2019MaqMadLin
            }
            , new Object[] {
            T01BT52_A396EmprCod, T01BT52_A602MaqCod, T01BT52_A2014MaqConLin
            }
            , new Object[] {
            T01BT53_A396EmprCod, T01BT53_A1621CosTermCod, T01BT53_A1615CosLin
            }
            , new Object[] {
            T01BT54_A396EmprCod, T01BT54_A602MaqCod, T01BT54_A1142MaqFCod
            }
            , new Object[] {
            T01BT55_A396EmprCod, T01BT55_A602MaqCod, T01BT55_A634MhiMes, T01BT55_A632MhiAny
            }
            , new Object[] {
            T01BT56_A396EmprCod, T01BT56_A602MaqCod, T01BT56_A320DesTecLin
            }
            , new Object[] {
            T01BT57_A396EmprCod, T01BT57_A602MaqCod, T01BT57_A599MaqAny, T01BT57_A614MaqMes
            }
            , new Object[] {
            T01BT58_A396EmprCod, T01BT58_A539HisBarCod, T01BT58_A545HisCodReo, T01BT58_A544HisCodPar, T01BT58_A833TipDefCod
            }
            , new Object[] {
            T01BT59_A396EmprCod, T01BT59_A602MaqCod, T01BT59_A558HisProFec
            }
            , new Object[] {
            T01BT60_A396EmprCod, T01BT60_A501GruMaqCod, T01BT60_A602MaqCod
            }
            , new Object[] {
            T01BT61_A396EmprCod, T01BT61_A457FasCod
            }
            , new Object[] {
            T01BT62_A396EmprCod, T01BT62_A361DisCod
            }
            , new Object[] {
            T01BT63_A396EmprCod, T01BT63_A129BarCod, T01BT63_A132BarCodReo, T01BT63_A130BarCodPar, T01BT63_A758ProCod, T01BT63_A194BarOrdLin
            }
            , new Object[] {
            T01BT64_A396EmprCod, T01BT64_A602MaqCod
            }
            , new Object[] {
            T01BT65_A602MaqCod, T01BT65_A11432MaqDocId, T01BT65_A11430MaqDocPath, T01BT65_A11431MaqDocDsc, T01BT65_A396EmprCod
            }
            , new Object[] {
            T01BT66_A396EmprCod, T01BT66_A602MaqCod, T01BT66_A11432MaqDocId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BT70_A396EmprCod, T01BT70_A602MaqCod, T01BT70_A11432MaqDocId
            }
            , new Object[] {
            T01BT71_A396EmprCod
            }
         }
      );
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
   private short Z11429MaqUltDoc ;
   private short Z11432MaqDocId ;
   private short nRcdDeleted_1517 ;
   private short nRcdExists_1517 ;
   private short nIsMod_1517 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11429MaqUltDoc ;
   private short nBlankRcdCount1517 ;
   private short RcdFound1517 ;
   private short nBlankRcdUsr1517 ;
   private short A11432MaqDocId ;
   private short RcdFound65 ;
   private short nIsDirty_65 ;
   private short nIsDirty_1517 ;
   private short ZZ11429MaqUltDoc ;
   private int nRC_GXsfl_35 ;
   private int nGXsfl_35_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMaqCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtMaqUltDoc_Enabled ;
   private int edtavnRcdDeleted_1517_Enabled ;
   private int edtMaqDocId_Enabled ;
   private int edtMaqDocPath_Enabled ;
   private int edtMaqDocDsc_Enabled ;
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
   private int defedtMaqDocId_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMaqUltDoc_Backcolor ;
   private int edtMaqCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z602MaqCod ;
   private String Z11431MaqDocDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_35_idx="0001" ;
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
   private String edtMaqCod_Internalname ;
   private String A602MaqCod ;
   private String edtMaqCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtMaqUltDoc_Internalname ;
   private String edtMaqUltDoc_Jsonclick ;
   private String sMode1517 ;
   private String edtavnRcdDeleted_1517_Internalname ;
   private String edtMaqDocId_Internalname ;
   private String edtMaqDocPath_Internalname ;
   private String edtMaqDocDsc_Internalname ;
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
   private String sMode65 ;
   private String GXCCtl ;
   private String A11431MaqDocDsc ;
   private String sGXsfl_35_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1517_Jsonclick ;
   private String edtMaqDocId_Jsonclick ;
   private String edtMaqDocPath_Jsonclick ;
   private String edtMaqDocDsc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ602MaqCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_35_Refreshing=false ;
   private boolean n602MaqCod ;
   private String Z11430MaqDocPath ;
   private String A11430MaqDocPath ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01BT7_A602MaqCod ;
   private boolean[] T01BT7_n602MaqCod ;
   private short[] T01BT7_A11429MaqUltDoc ;
   private String[] T01BT7_A396EmprCod ;
   private String[] T01BT6_A396EmprCod ;
   private String[] T01BT8_A396EmprCod ;
   private String[] T01BT9_A396EmprCod ;
   private String[] T01BT9_A602MaqCod ;
   private boolean[] T01BT9_n602MaqCod ;
   private String[] T01BT5_A602MaqCod ;
   private boolean[] T01BT5_n602MaqCod ;
   private short[] T01BT5_A11429MaqUltDoc ;
   private String[] T01BT5_A396EmprCod ;
   private String[] T01BT10_A396EmprCod ;
   private String[] T01BT10_A602MaqCod ;
   private boolean[] T01BT10_n602MaqCod ;
   private String[] T01BT11_A396EmprCod ;
   private String[] T01BT11_A602MaqCod ;
   private boolean[] T01BT11_n602MaqCod ;
   private String[] T01BT4_A602MaqCod ;
   private boolean[] T01BT4_n602MaqCod ;
   private short[] T01BT4_A11429MaqUltDoc ;
   private String[] T01BT4_A396EmprCod ;
   private String[] T01BT15_A396EmprCod ;
   private String[] T01BT15_A602MaqCod ;
   private boolean[] T01BT15_n602MaqCod ;
   private short[] T01BT15_A14529MqCAnyo ;
   private byte[] T01BT15_A14530MqCMes ;
   private String[] T01BT16_A396EmprCod ;
   private int[] T01BT16_A129BarCod ;
   private byte[] T01BT16_A132BarCodReo ;
   private String[] T01BT16_A130BarCodPar ;
   private short[] T01BT16_A14152MEnvOrd ;
   private String[] T01BT17_A396EmprCod ;
   private int[] T01BT17_A13604RARID ;
   private String[] T01BT17_A602MaqCod ;
   private boolean[] T01BT17_n602MaqCod ;
   private String[] T01BT18_A396EmprCod ;
   private String[] T01BT18_A602MaqCod ;
   private boolean[] T01BT18_n602MaqCod ;
   private int[] T01BT18_A13193MaqHdr ;
   private byte[] T01BT18_A13194MaqHdrR ;
   private String[] T01BT18_A13195MaqHdrP ;
   private short[] T01BT18_A13196MaqRecLinM ;
   private String[] T01BT19_A396EmprCod ;
   private int[] T01BT19_A13137NCHdr ;
   private byte[] T01BT19_A13138NCHdrr ;
   private String[] T01BT19_A13139NCHdrp ;
   private String[] T01BT20_A396EmprCod ;
   private int[] T01BT20_A12673LavMqId ;
   private String[] T01BT21_A396EmprCod ;
   private String[] T01BT21_A602MaqCod ;
   private boolean[] T01BT21_n602MaqCod ;
   private short[] T01BT21_A12444MaqAnyNP ;
   private byte[] T01BT21_A12445MaqMesNP ;
   private String[] T01BT22_A396EmprCod ;
   private String[] T01BT22_A602MaqCod ;
   private boolean[] T01BT22_n602MaqCod ;
   private short[] T01BT22_A12434MaqAnyM ;
   private byte[] T01BT22_A12435MaqMesM ;
   private String[] T01BT23_A396EmprCod ;
   private java.util.Date[] T01BT23_A4929Inc_Dia ;
   private short[] T01BT23_A5728JBCLLin ;
   private String[] T01BT24_A396EmprCod ;
   private int[] T01BT24_A11604PArtId ;
   private String[] T01BT25_A396EmprCod ;
   private String[] T01BT25_A602MaqCod ;
   private boolean[] T01BT25_n602MaqCod ;
   private java.util.Date[] T01BT25_A11445MaqFch ;
   private String[] T01BT26_A396EmprCod ;
   private String[] T01BT26_A602MaqCod ;
   private boolean[] T01BT26_n602MaqCod ;
   private String[] T01BT26_A11438MaqEquCod ;
   private String[] T01BT26_A11439MaqSEqCod ;
   private String[] T01BT26_A11440MaqPieCod ;
   private String[] T01BT27_A396EmprCod ;
   private String[] T01BT27_A602MaqCod ;
   private boolean[] T01BT27_n602MaqCod ;
   private java.util.Date[] T01BT27_A10111Mq_Dia ;
   private int[] T01BT27_A10112Mq_Op ;
   private String[] T01BT28_A396EmprCod ;
   private int[] T01BT28_A252CliCod ;
   private String[] T01BT28_A65ArtCod ;
   private String[] T01BT28_A10041ArtSH ;
   private String[] T01BT28_A10042ArtMqFa ;
   private String[] T01BT29_A396EmprCod ;
   private String[] T01BT29_A602MaqCod ;
   private boolean[] T01BT29_n602MaqCod ;
   private java.util.Date[] T01BT29_A74MaqTMuIni ;
   private String[] T01BT30_A396EmprCod ;
   private String[] T01BT30_A602MaqCod ;
   private boolean[] T01BT30_n602MaqCod ;
   private String[] T01BT30_A9725MaqFabC ;
   private String[] T01BT31_A396EmprCod ;
   private int[] T01BT31_A9428SMCod ;
   private String[] T01BT32_A396EmprCod ;
   private int[] T01BT32_A9429PMCod ;
   private String[] T01BT33_A396EmprCod ;
   private int[] T01BT33_A9425OMCod ;
   private String[] T01BT34_A396EmprCod ;
   private String[] T01BT34_A602MaqCod ;
   private boolean[] T01BT34_n602MaqCod ;
   private String[] T01BT34_A8008Maq_Prg ;
   private String[] T01BT35_A396EmprCod ;
   private String[] T01BT35_A602MaqCod ;
   private boolean[] T01BT35_n602MaqCod ;
   private String[] T01BT35_A6874CPROCORIG ;
   private String[] T01BT36_A396EmprCod ;
   private int[] T01BT36_A6319C_Barcod ;
   private byte[] T01BT36_A6320C_Barcodre ;
   private String[] T01BT36_A6321C_Barcodpa ;
   private short[] T01BT36_A6322C_Reclinma ;
   private String[] T01BT37_A396EmprCod ;
   private String[] T01BT37_A602MaqCod ;
   private boolean[] T01BT37_n602MaqCod ;
   private byte[] T01BT37_A6260MaqTqn ;
   private String[] T01BT38_A396EmprCod ;
   private short[] T01BT38_A6188MaqTArt ;
   private String[] T01BT38_A602MaqCod ;
   private boolean[] T01BT38_n602MaqCod ;
   private String[] T01BT39_A396EmprCod ;
   private String[] T01BT39_A602MaqCod ;
   private boolean[] T01BT39_n602MaqCod ;
   private int[] T01BT39_A6078MaqCliCod ;
   private String[] T01BT39_A6079MaqArtCod ;
   private String[] T01BT40_A396EmprCod ;
   private byte[] T01BT40_A6037Mq_Grupo ;
   private String[] T01BT40_A602MaqCod ;
   private boolean[] T01BT40_n602MaqCod ;
   private String[] T01BT41_A396EmprCod ;
   private String[] T01BT41_A6000CRCod ;
   private short[] T01BT41_A6005CRLin ;
   private String[] T01BT42_A396EmprCod ;
   private String[] T01BT42_A602MaqCod ;
   private boolean[] T01BT42_n602MaqCod ;
   private short[] T01BT42_A5879PlaMTAOrd ;
   private String[] T01BT43_A396EmprCod ;
   private String[] T01BT43_A5603PrdNumM ;
   private String[] T01BT43_A602MaqCod ;
   private boolean[] T01BT43_n602MaqCod ;
   private String[] T01BT44_A396EmprCod ;
   private String[] T01BT44_A602MaqCod ;
   private boolean[] T01BT44_n602MaqCod ;
   private String[] T01BT44_A5525MaqPrdNum ;
   private String[] T01BT45_A396EmprCod ;
   private String[] T01BT45_A764ProForCod ;
   private short[] T01BT45_A5191ProForLC ;
   private String[] T01BT46_A396EmprCod ;
   private short[] T01BT46_A4686MaqTipArt ;
   private String[] T01BT46_A602MaqCod ;
   private boolean[] T01BT46_n602MaqCod ;
   private String[] T01BT47_A396EmprCod ;
   private byte[] T01BT47_A3331LanBroCod ;
   private short[] T01BT47_A3333LanBroLin ;
   private String[] T01BT48_A396EmprCod ;
   private String[] T01BT48_A602MaqCod ;
   private boolean[] T01BT48_n602MaqCod ;
   private String[] T01BT48_A3047LOParId ;
   private String[] T01BT49_A396EmprCod ;
   private int[] T01BT49_A129BarCod ;
   private byte[] T01BT49_A132BarCodReo ;
   private String[] T01BT49_A130BarCodPar ;
   private short[] T01BT49_A2804RecLinMaq ;
   private String[] T01BT50_A396EmprCod ;
   private String[] T01BT50_A602MaqCod ;
   private boolean[] T01BT50_n602MaqCod ;
   private java.util.Date[] T01BT50_A2461PlaFecTin ;
   private String[] T01BT51_A396EmprCod ;
   private String[] T01BT51_A602MaqCod ;
   private boolean[] T01BT51_n602MaqCod ;
   private short[] T01BT51_A2019MaqMadLin ;
   private String[] T01BT52_A396EmprCod ;
   private String[] T01BT52_A602MaqCod ;
   private boolean[] T01BT52_n602MaqCod ;
   private short[] T01BT52_A2014MaqConLin ;
   private String[] T01BT53_A396EmprCod ;
   private String[] T01BT53_A1621CosTermCod ;
   private int[] T01BT53_A1615CosLin ;
   private String[] T01BT54_A396EmprCod ;
   private String[] T01BT54_A602MaqCod ;
   private boolean[] T01BT54_n602MaqCod ;
   private String[] T01BT54_A1142MaqFCod ;
   private String[] T01BT55_A396EmprCod ;
   private String[] T01BT55_A602MaqCod ;
   private boolean[] T01BT55_n602MaqCod ;
   private byte[] T01BT55_A634MhiMes ;
   private short[] T01BT55_A632MhiAny ;
   private String[] T01BT56_A396EmprCod ;
   private String[] T01BT56_A602MaqCod ;
   private boolean[] T01BT56_n602MaqCod ;
   private byte[] T01BT56_A320DesTecLin ;
   private String[] T01BT57_A396EmprCod ;
   private String[] T01BT57_A602MaqCod ;
   private boolean[] T01BT57_n602MaqCod ;
   private short[] T01BT57_A599MaqAny ;
   private byte[] T01BT57_A614MaqMes ;
   private String[] T01BT58_A396EmprCod ;
   private int[] T01BT58_A539HisBarCod ;
   private byte[] T01BT58_A545HisCodReo ;
   private String[] T01BT58_A544HisCodPar ;
   private short[] T01BT58_A833TipDefCod ;
   private String[] T01BT59_A396EmprCod ;
   private String[] T01BT59_A602MaqCod ;
   private boolean[] T01BT59_n602MaqCod ;
   private java.util.Date[] T01BT59_A558HisProFec ;
   private String[] T01BT60_A396EmprCod ;
   private String[] T01BT60_A501GruMaqCod ;
   private String[] T01BT60_A602MaqCod ;
   private boolean[] T01BT60_n602MaqCod ;
   private String[] T01BT61_A396EmprCod ;
   private String[] T01BT61_A457FasCod ;
   private String[] T01BT62_A396EmprCod ;
   private int[] T01BT62_A361DisCod ;
   private String[] T01BT63_A396EmprCod ;
   private int[] T01BT63_A129BarCod ;
   private byte[] T01BT63_A132BarCodReo ;
   private String[] T01BT63_A130BarCodPar ;
   private String[] T01BT63_A758ProCod ;
   private short[] T01BT63_A194BarOrdLin ;
   private String[] T01BT64_A396EmprCod ;
   private String[] T01BT64_A602MaqCod ;
   private boolean[] T01BT64_n602MaqCod ;
   private String[] T01BT65_A602MaqCod ;
   private boolean[] T01BT65_n602MaqCod ;
   private short[] T01BT65_A11432MaqDocId ;
   private String[] T01BT65_A11430MaqDocPath ;
   private String[] T01BT65_A11431MaqDocDsc ;
   private String[] T01BT65_A396EmprCod ;
   private String[] T01BT66_A396EmprCod ;
   private String[] T01BT66_A602MaqCod ;
   private boolean[] T01BT66_n602MaqCod ;
   private short[] T01BT66_A11432MaqDocId ;
   private String[] T01BT3_A602MaqCod ;
   private boolean[] T01BT3_n602MaqCod ;
   private short[] T01BT3_A11432MaqDocId ;
   private String[] T01BT3_A11430MaqDocPath ;
   private String[] T01BT3_A11431MaqDocDsc ;
   private String[] T01BT3_A396EmprCod ;
   private String[] T01BT2_A602MaqCod ;
   private boolean[] T01BT2_n602MaqCod ;
   private short[] T01BT2_A11432MaqDocId ;
   private String[] T01BT2_A11430MaqDocPath ;
   private String[] T01BT2_A11431MaqDocDsc ;
   private String[] T01BT2_A396EmprCod ;
   private String[] T01BT70_A396EmprCod ;
   private String[] T01BT70_A602MaqCod ;
   private boolean[] T01BT70_n602MaqCod ;
   private short[] T01BT70_A11432MaqDocId ;
   private String[] T01BT71_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmaqdo2__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqdo2__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqdo2__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqdo2__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqdo2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01BT2", "SELECT MaqCod, MaqDocId, MaqDocPath, MaqDocDsc, EmprCod FROM TXPMaqDoc WHERE EmprCod = ? AND MaqCod = ? AND MaqDocId = ?  FOR UPDATE OF MaqDocPath, MaqDocDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BT3", "SELECT MaqCod, MaqDocId, MaqDocPath, MaqDocDsc, EmprCod FROM TXPMaqDoc WHERE EmprCod = ? AND MaqCod = ? AND MaqDocId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BT4", "SELECT MaqCod, MaqUltDoc, EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ?  FOR UPDATE OF MaqUltDoc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BT5", "SELECT MaqCod, MaqUltDoc, EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BT6", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BT7", "SELECT /*+ FIRST_ROWS(100) */ TM1.MaqCod, TM1.MaqUltDoc, TM1.EmprCod FROM TXPMAQUIN TM1 WHERE TM1.EmprCod = ? and TM1.MaqCod = ? ORDER BY TM1.EmprCod, TM1.MaqCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BT8", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BT9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BT10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod FROM TXPMAQUIN WHERE ( EmprCod > ? or EmprCod = ? and MaqCod > ?) ORDER BY EmprCod, MaqCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod FROM TXPMAQUIN WHERE ( EmprCod < ? or EmprCod = ? and MaqCod < ?) ORDER BY EmprCod DESC, MaqCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01BT12", "INSERT INTO TXPMAQUIN(MaqCod, MaqUltDoc, EmprCod, MaqDsc, MaqCodFor, MaqVolMax, MaqVolMin, MaqVolMed, MaqTemMax, MaqChp, MaqTinTip, MaqCap, MaqCosMin, MaqHorPro, MaqMinPro, MaqTip, MaqEst, MaqUltFec, MaqResDia, MaqHorAsi, MaqOrdSeq, MaqUltLin, MaqFasUni, MaqConUlt, MaqMadUlt, MaqMicro, MaqVolRes, MaqVolTop, MaqCapac, MaqPri, MaqNhd, MaqNroTub, MaqRelBan, MaqTipMaq, TipMaqCod, MaqFormul, MaqKgsMin, MaqKgsMed, MaqKgsMax, MaqPrdMin, MaqPrdMed, MaqPrdMax, MaqCCoCod, MaqCodBan, MaqSalM, MaqSalMKi, MaqSalMKf, MaqCantCor, MaqTipCen, MaqDosifP, MaqDteCol, MaqFacAbs, MaqKgsId, MaqPln, MaqPlnVis, MaqConFas, MaqVaril, MaqPasw, MaqLoc, MaqObs, MaqFabsHm, MaqHhCon, MaqHhCtr, MaqDTTipo, MaqDTMar, MaqDTMod, MaqDTRef, MaqDTSer, MaqDTFab, MaqDTOri, MaqDTAdqFc, MaqDTAdqFo, MaqDTPrv, MaqDTPrvDi, MaqDTAdqCo, MaqDTRepCo, MaqDTCar, MaqDTVolt, MaqDTReq, MaqDTMnt, MaqDTCal, MaqDTServ, MaqDTInv, MaqDTGarIn, MaqDTGarFi, MaqVolBal, MaqCosGen, MaqOgtId, MaqMOD, MaqMOI, MaqEnerg, MaqGas, MaqAgua, MaqTmCarg, MaqTmDcarg, MaqMtsMn, MaqMtsMx, MaqCosFijo, MaqCosKg, MaqDscLarg, MaqCuerdas, MaqGI, MaqAdCent, MaqAmort) VALUES(?, ?, ?, ' ', ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0)", GX_NOMASK, "TXPMAQUIN")
         ,new UpdateCursor("T01BT13", "UPDATE TXPMAQUIN SET MaqUltDoc=?  WHERE EmprCod = ? AND MaqCod = ?", GX_NOMASK, "TXPMAQUIN")
         ,new UpdateCursor("T01BT14", "DELETE FROM TXPMAQUIN  WHERE EmprCod = ? AND MaqCod = ?", GX_NOMASK, "TXPMAQUIN")
         ,new ForEachCursor("T01BT15", "SELECT * FROM (SELECT EmprCod, MaqCod, MqCAnyo, MqCMes FROM TXPMAQCOS WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT16", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND MEnvMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT17", "SELECT * FROM (SELECT EmprCod, RARID, MaqCod FROM TXPDSPRA3 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT18", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqHdr, MaqHdrR, MaqHdrP, MaqRecLinM FROM TXPPLNMAQ WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT19", "SELECT * FROM (SELECT EmprCod, NCHdr, NCHdrr, NCHdrp FROM TXPNOCONF WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT20", "SELECT * FROM (SELECT EmprCod, LavMqId FROM TXPLAVMQ0 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT21", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqAnyNP, MaqMesNP FROM TXPMAQNP1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT22", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqAnyM, MaqMesM FROM TXPMAQMT1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT23", "SELECT * FROM (SELECT EmprCod, Inc_Dia, JBCLLin FROM TXPJBConL WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT24", "SELECT * FROM (SELECT EmprCod, PArtId FROM TXPPedAEs WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT25", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFch FROM TXPMAQUSO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT26", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqEquCod, MaqSEqCod, MaqPieCod FROM TXPMaqPie WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT27", "SELECT * FROM (SELECT EmprCod, MaqCod, Mq_Dia, Mq_Op FROM TXPMQDDOP WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT28", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtSH, ArtMqFa FROM TXPCLATF1 WHERE EmprCod = ? AND ArtMqFa = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT29", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqTMuIni FROM TXPMAQTMU WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT30", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFabC FROM TXPMAQFAB WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT31", "SELECT * FROM (SELECT EmprCod, SMCod FROM TXPMSOLIC WHERE EmprCod = ? AND SMMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT32", "SELECT * FROM (SELECT EmprCod, PMCod FROM TXPMPREVE WHERE EmprCod = ? AND PMMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT33", "SELECT * FROM (SELECT EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? AND OMMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT34", "SELECT * FROM (SELECT EmprCod, MaqCod, Maq_Prg FROM TXPMAQPRG WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT35", "SELECT * FROM (SELECT EmprCod, MaqCod, CPROCORIG FROM TXPCONVPR WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT36", "SELECT * FROM (SELECT EmprCod, C_Barcod, C_Barcodre, C_Barcodpa, C_Reclinma FROM TXPRECMA1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT37", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqTqn FROM TXPMAQTNQ WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT38", "SELECT * FROM (SELECT EmprCod, MaqTArt, MaqCod FROM TXPTARTM1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT39", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT40", "SELECT * FROM (SELECT EmprCod, Mq_Grupo, MaqCod FROM TXPMAQGR1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT41", "SELECT * FROM (SELECT EmprCod, CRCod, CRLin FROM TXPLCOSRE WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT42", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaMTAOrd FROM TXPPlaMaq WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT43", "SELECT * FROM (SELECT EmprCod, PrdNumM, MaqCod FROM TXPPRDMAQ WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT44", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqPrdNum FROM TXPMAQPRO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT45", "SELECT * FROM (SELECT EmprCod, ProForCod, ProForLC FROM TXPPROFOC WHERE EmprCod = ? AND ProFoMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT46", "SELECT * FROM (SELECT EmprCod, MaqTipArt, MaqCod FROM TXPMAQTA1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT47", "SELECT * FROM (SELECT EmprCod, LanBroCod, LanBroLin FROM TXPLANBRL WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT48", "SELECT * FROM (SELECT EmprCod, MaqCod, LOParId FROM TXPLOMaqP WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT49", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT50", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaFecTin FROM TXPCPLATI WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT51", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqMadLin FROM TXPLMAQMA WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT52", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqConLin FROM TXPLMAQCO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT53", "SELECT * FROM (SELECT EmprCod, CosTermCod, CosLin FROM TXPCOSTES WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT54", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFCod FROM TXPMAQFAS WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT55", "SELECT * FROM (SELECT EmprCod, MaqCod, MhiMes, MhiAny FROM TXPCMHPRO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT56", "SELECT * FROM (SELECT EmprCod, MaqCod, DesTecLin FROM TXPMAQLIN WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT57", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqAny, MaqMes FROM TXPMAQHNP WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT58", "SELECT * FROM (SELECT EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT59", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec FROM TXPCHIPRO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT60", "SELECT * FROM (SELECT EmprCod, GruMaqCod, MaqCod FROM TXPGRULIN WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT61", "SELECT * FROM (SELECT EmprCod, FasCod FROM TXPFASPRO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT62", "SELECT * FROM (SELECT EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND MaqCodDis = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT63", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? AND MaqCodBis = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BT64", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqCod FROM TXPMAQUIN ORDER BY EmprCod, MaqCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BT65", "SELECT MaqCod, MaqDocId, MaqDocPath, MaqDocDsc, EmprCod FROM TXPMaqDoc WHERE EmprCod = ? and MaqCod = ? and MaqDocId = ? ORDER BY EmprCod, MaqCod, MaqDocId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BT66", "SELECT EmprCod, MaqCod, MaqDocId FROM TXPMaqDoc WHERE EmprCod = ? AND MaqCod = ? AND MaqDocId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01BT67", "INSERT INTO TXPMaqDoc(MaqCod, MaqDocId, MaqDocPath, MaqDocDsc, EmprCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPMaqDoc")
         ,new UpdateCursor("T01BT68", "UPDATE TXPMaqDoc SET MaqDocPath=?, MaqDocDsc=?  WHERE EmprCod = ? AND MaqCod = ? AND MaqDocId = ?", GX_NOMASK, "TXPMaqDoc")
         ,new UpdateCursor("T01BT69", "DELETE FROM TXPMaqDoc  WHERE EmprCod = ? AND MaqCod = ? AND MaqDocId = ?", GX_NOMASK, "TXPMaqDoc")
         ,new ForEachCursor("T01BT70", "SELECT EmprCod, MaqCod, MaqDocId FROM TXPMaqDoc WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod, MaqDocId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BT71", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 15);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 69 :
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
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 12 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 49 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 52 :
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
            case 53 :
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
            case 54 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 57 :
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
            case 58 :
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
            case 59 :
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
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
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
            case 61 :
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
            case 63 :
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
            case 64 :
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
            case 65 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setVarchar(3, (String)parms[3], 1024, false);
               stmt.setString(4, (String)parms[4], 30);
               stmt.setString(5, (String)parms[5], 3);
               return;
            case 66 :
               stmt.setVarchar(1, (String)parms[0], 1024, false);
               stmt.setString(2, (String)parms[1], 30);
               stmt.setString(3, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 6);
               }
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
            case 67 :
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
            case 68 :
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
            case 69 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

