package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tvxalmacen_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Estructura ALMACEN  en VERTEX", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtVxAlmCod_Internalname ;
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
      nRC_GXsfl_30 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_30"))) ;
      nGXsfl_30_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_30_idx"))) ;
      sGXsfl_30_idx = httpContext.GetPar( "sGXsfl_30_idx") ;
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

   public tvxalmacen_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tvxalmacen_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tvxalmacen_impl.class ));
   }

   public tvxalmacen_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxAlmacen.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxAlmacen.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxAlmacen.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxAlmacen.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TVxAlmacen.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Almacén", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxAlmacen.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxAlmCod_Internalname, GXutil.rtrim( A12248VxAlmCod), GXutil.rtrim( localUtil.format( A12248VxAlmCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxAlmCod_Jsonclick, 0, "", "", "", "", "", 1, edtVxAlmCod_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxAlmacen.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxAlmacen.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Descripción", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxAlmacen.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxAlmDsc_Internalname, GXutil.rtrim( A12669VxAlmDsc), GXutil.rtrim( localUtil.format( A12669VxAlmDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxAlmDsc_Jsonclick, 0, "", "", "", "", "", 1, edtVxAlmDsc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxAlmacen.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol30( ) ;
      nGXsfl_30_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1744 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1744 = (short)(1) ;
            scanStart1KZ1744( ) ;
            while ( RcdFound1744 != 0 )
            {
               init_level_properties1744( ) ;
               getByPrimaryKey1KZ1744( ) ;
               addRow1KZ1744( ) ;
               scanNext1KZ1744( ) ;
            }
            scanEnd1KZ1744( ) ;
            nBlankRcdCount1744 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1KZ1744( ) ;
         standaloneModal1KZ1744( ) ;
         sMode1744 = Gx_mode ;
         while ( nGXsfl_30_idx < nRC_GXsfl_30 )
         {
            bGXsfl_30_Refreshing = true ;
            readRow1KZ1744( ) ;
            edtavnRcdDeleted_1744_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1744_"+sGXsfl_30_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1744_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1744_Enabled), 5, 0), !bGXsfl_30_Refreshing);
            edtVxAlmUbi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXALMUBI_"+sGXsfl_30_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVxAlmUbi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxAlmUbi_Enabled), 5, 0), !bGXsfl_30_Refreshing);
            if ( ( nRcdExists_1744 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1KZ1744( ) ;
            }
            sendRow1KZ1744( ) ;
            bGXsfl_30_Refreshing = false ;
         }
         Gx_mode = sMode1744 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1744 = (short)(5) ;
         nRcdExists_1744 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1KZ1744( ) ;
            while ( RcdFound1744 != 0 )
            {
               sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_301744( ) ;
               init_level_properties1744( ) ;
               standaloneNotModal1KZ1744( ) ;
               getByPrimaryKey1KZ1744( ) ;
               standaloneModal1KZ1744( ) ;
               addRow1KZ1744( ) ;
               scanNext1KZ1744( ) ;
            }
            scanEnd1KZ1744( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1744 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_301744( ) ;
      initAll1KZ1744( ) ;
      init_level_properties1744( ) ;
      nRcdExists_1744 = (short)(0) ;
      nIsMod_1744 = (short)(0) ;
      nRcdDeleted_1744 = (short)(0) ;
      nBlankRcdCount1744 = (short)(nBlankRcdUsr1744+nBlankRcdCount1744) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1744 > 0 )
      {
         standaloneNotModal1KZ1744( ) ;
         standaloneModal1KZ1744( ) ;
         addRow1KZ1744( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtVxAlmUbi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1744 = (short)(nBlankRcdCount1744-1) ;
      }
      Gx_mode = sMode1744 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxAlmacen.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxAlmacen.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxAlmacen.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxAlmacen.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TVxAlmacen.htm");
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
         Z12248VxAlmCod = httpContext.cgiGet( "Z12248VxAlmCod") ;
         Z12669VxAlmDsc = httpContext.cgiGet( "Z12669VxAlmDsc") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_30 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_30"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A12248VxAlmCod = httpContext.cgiGet( edtVxAlmCod_Internalname) ;
         n12248VxAlmCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12248VxAlmCod", A12248VxAlmCod);
         A12669VxAlmDsc = httpContext.cgiGet( edtVxAlmDsc_Internalname) ;
         n12669VxAlmDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12669VxAlmDsc", A12669VxAlmDsc);
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
            A12248VxAlmCod = httpContext.GetPar( "VxAlmCod") ;
            n12248VxAlmCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12248VxAlmCod", A12248VxAlmCod);
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
            initAll1KZ1743( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1744_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1744_Enabled), 5, 0), !bGXsfl_30_Refreshing);
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
      disableAttributes1KZ1743( ) ;
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

   public void confirm_1KZ0( )
   {
      beforeValidate1KZ1743( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1KZ1743( ) ;
         }
         else
         {
            checkExtendedTable1KZ1743( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1KZ1743( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1743 = Gx_mode ;
         confirm_1KZ1744( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1743 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1743 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1KZ0( ) ;
      }
   }

   public void confirm_1KZ1744( )
   {
      nGXsfl_30_idx = 0 ;
      while ( nGXsfl_30_idx < nRC_GXsfl_30 )
      {
         readRow1KZ1744( ) ;
         if ( ( nRcdExists_1744 != 0 ) || ( nIsMod_1744 != 0 ) )
         {
            getKey1KZ1744( ) ;
            if ( ( nRcdExists_1744 == 0 ) && ( nRcdDeleted_1744 == 0 ) )
            {
               if ( RcdFound1744 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1KZ1744( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1KZ1744( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1KZ1744( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "VXALMUBI_" + sGXsfl_30_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtVxAlmUbi_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1744 != 0 )
               {
                  if ( nRcdDeleted_1744 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1KZ1744( ) ;
                     load1KZ1744( ) ;
                     beforeValidate1KZ1744( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1KZ1744( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1744 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1KZ1744( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1KZ1744( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1KZ1744( ) ;
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
                  if ( nRcdDeleted_1744 == 0 )
                  {
                     GXCCtl = "VXALMUBI_" + sGXsfl_30_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtVxAlmUbi_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1744_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1744, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxAlmUbi_Internalname, GXutil.rtrim( A12249VxAlmUbi)) ;
         httpContext.changePostValue( "ZT_"+"Z12249VxAlmUbi_"+sGXsfl_30_idx, GXutil.rtrim( Z12249VxAlmUbi)) ;
         httpContext.changePostValue( "nRcdDeleted_1744_"+sGXsfl_30_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1744, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1744_"+sGXsfl_30_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1744, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1744_"+sGXsfl_30_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1744, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1744 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1744_"+sGXsfl_30_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1744_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXALMUBI_"+sGXsfl_30_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxAlmUbi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1KZ0( )
   {
   }

   public void zm1KZ1743( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12669VxAlmDsc = T01KZ5_A12669VxAlmDsc[0] ;
         }
         else
         {
            Z12669VxAlmDsc = A12669VxAlmDsc ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z12248VxAlmCod = A12248VxAlmCod ;
         Z12669VxAlmDsc = A12669VxAlmDsc ;
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

   public void load1KZ1743( )
   {
      /* Using cursor T01KZ6 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1743 = (short)(1) ;
         A12669VxAlmDsc = T01KZ6_A12669VxAlmDsc[0] ;
         n12669VxAlmDsc = T01KZ6_n12669VxAlmDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12669VxAlmDsc", A12669VxAlmDsc);
         zm1KZ1743( -1) ;
      }
      pr_default.close(4);
      onLoadActions1KZ1743( ) ;
   }

   public void onLoadActions1KZ1743( )
   {
   }

   public void checkExtendedTable1KZ1743( )
   {
      nIsDirty_1743 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1KZ1743( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1KZ1743( )
   {
      /* Using cursor T01KZ7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1743 = (short)(1) ;
      }
      else
      {
         RcdFound1743 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01KZ5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1KZ1743( 1) ;
         RcdFound1743 = (short)(1) ;
         A12248VxAlmCod = T01KZ5_A12248VxAlmCod[0] ;
         n12248VxAlmCod = T01KZ5_n12248VxAlmCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12248VxAlmCod", A12248VxAlmCod);
         A12669VxAlmDsc = T01KZ5_A12669VxAlmDsc[0] ;
         n12669VxAlmDsc = T01KZ5_n12669VxAlmDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12669VxAlmDsc", A12669VxAlmDsc);
         Z12248VxAlmCod = A12248VxAlmCod ;
         sMode1743 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1KZ1743( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1743 = (short)(0) ;
            initializeNonKey1KZ1743( ) ;
         }
         Gx_mode = sMode1743 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1743 = (short)(0) ;
         initializeNonKey1KZ1743( ) ;
         sMode1743 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1743 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1KZ1743( ) ;
      if ( RcdFound1743 == 0 )
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
      RcdFound1743 = (short)(0) ;
      /* Using cursor T01KZ8 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01KZ8_A12248VxAlmCod[0], A12248VxAlmCod) < 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01KZ8_A12248VxAlmCod[0], A12248VxAlmCod) > 0 ) ) )
         {
            A12248VxAlmCod = T01KZ8_A12248VxAlmCod[0] ;
            n12248VxAlmCod = T01KZ8_n12248VxAlmCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12248VxAlmCod", A12248VxAlmCod);
            RcdFound1743 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1743 = (short)(0) ;
      /* Using cursor T01KZ9 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01KZ9_A12248VxAlmCod[0], A12248VxAlmCod) > 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01KZ9_A12248VxAlmCod[0], A12248VxAlmCod) < 0 ) ) )
         {
            A12248VxAlmCod = T01KZ9_A12248VxAlmCod[0] ;
            n12248VxAlmCod = T01KZ9_n12248VxAlmCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12248VxAlmCod", A12248VxAlmCod);
            RcdFound1743 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1KZ1743( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtVxAlmCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1KZ1743( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1743 == 1 )
         {
            if ( GXutil.strcmp(A12248VxAlmCod, Z12248VxAlmCod) != 0 )
            {
               A12248VxAlmCod = Z12248VxAlmCod ;
               n12248VxAlmCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12248VxAlmCod", A12248VxAlmCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "VXALMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxAlmCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtVxAlmCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1KZ1743( ) ;
               GX_FocusControl = edtVxAlmCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A12248VxAlmCod, Z12248VxAlmCod) != 0 )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtVxAlmCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1KZ1743( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VXALMCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtVxAlmCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtVxAlmCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1KZ1743( ) ;
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
      if ( GXutil.strcmp(A12248VxAlmCod, Z12248VxAlmCod) != 0 )
      {
         A12248VxAlmCod = Z12248VxAlmCod ;
         n12248VxAlmCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12248VxAlmCod", A12248VxAlmCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "VXALMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxAlmCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtVxAlmCod_Internalname ;
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
      getKey1KZ1743( ) ;
      if ( RcdFound1743 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "VXALMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxAlmCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A12248VxAlmCod, Z12248VxAlmCod) != 0 )
         {
            A12248VxAlmCod = Z12248VxAlmCod ;
            n12248VxAlmCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12248VxAlmCod", A12248VxAlmCod);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "VXALMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxAlmCod_Internalname ;
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
         if ( GXutil.strcmp(A12248VxAlmCod, Z12248VxAlmCod) != 0 )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VXALMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxAlmCod_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxalmacen");
      GX_FocusControl = edtVxAlmDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1KZ0( ) ;
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
      if ( RcdFound1743 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "VXALMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxAlmCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtVxAlmDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1KZ1743( ) ;
      if ( RcdFound1743 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxAlmDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1KZ1743( ) ;
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
      if ( RcdFound1743 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxAlmDsc_Internalname ;
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
      if ( RcdFound1743 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxAlmDsc_Internalname ;
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
      scanStart1KZ1743( ) ;
      if ( RcdFound1743 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1743 != 0 )
         {
            scanNext1KZ1743( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxAlmDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1KZ1743( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1KZ1743( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KZ4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXALMACEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z12669VxAlmDsc, T01KZ4_A12669VxAlmDsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z12669VxAlmDsc, T01KZ4_A12669VxAlmDsc[0]) != 0 )
            {
               GXutil.writeLogln("tvxalmacen:[seudo value changed for attri]"+"VxAlmDsc");
               GXutil.writeLogRaw("Old: ",Z12669VxAlmDsc);
               GXutil.writeLogRaw("Current: ",T01KZ4_A12669VxAlmDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"VTXALMACEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KZ1743( )
   {
      beforeValidate1KZ1743( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KZ1743( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KZ1743( 0) ;
         checkOptimisticConcurrency1KZ1743( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KZ1743( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KZ1743( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KZ10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod, Boolean.valueOf(n12669VxAlmDsc), A12669VxAlmDsc});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXALMACEN");
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
                        processLevel1KZ1743( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1KZ0( ) ;
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
            load1KZ1743( ) ;
         }
         endLevel1KZ1743( ) ;
      }
      closeExtendedTableCursors1KZ1743( ) ;
   }

   public void update1KZ1743( )
   {
      beforeValidate1KZ1743( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KZ1743( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KZ1743( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KZ1743( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1KZ1743( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KZ11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n12669VxAlmDsc), A12669VxAlmDsc, Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXALMACEN");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXALMACEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1KZ1743( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1KZ1743( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1KZ0( ) ;
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
         endLevel1KZ1743( ) ;
      }
      closeExtendedTableCursors1KZ1743( ) ;
   }

   public void deferredUpdate1KZ1743( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1KZ1743( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KZ1743( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KZ1743( ) ;
         afterConfirm1KZ1743( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KZ1743( ) ;
            if ( AnyError == 0 )
            {
               scanStart1KZ1744( ) ;
               while ( RcdFound1744 != 0 )
               {
                  getByPrimaryKey1KZ1744( ) ;
                  delete1KZ1744( ) ;
                  scanNext1KZ1744( ) ;
               }
               scanEnd1KZ1744( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KZ12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXALMACEN");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1743 == 0 )
                        {
                           initAll1KZ1743( ) ;
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
                        resetCaption1KZ0( ) ;
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
      sMode1743 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KZ1743( ) ;
      Gx_mode = sMode1743 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KZ1743( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01KZ13 */
         pr_default.execute(11, new Object[] {Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Vertex - Rollos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
      }
   }

   public void processNestedLevel1KZ1744( )
   {
      nGXsfl_30_idx = 0 ;
      while ( nGXsfl_30_idx < nRC_GXsfl_30 )
      {
         readRow1KZ1744( ) ;
         if ( ( nRcdExists_1744 != 0 ) || ( nIsMod_1744 != 0 ) )
         {
            standaloneNotModal1KZ1744( ) ;
            getKey1KZ1744( ) ;
            if ( ( nRcdExists_1744 == 0 ) && ( nRcdDeleted_1744 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1KZ1744( ) ;
            }
            else
            {
               if ( RcdFound1744 != 0 )
               {
                  if ( ( nRcdDeleted_1744 != 0 ) && ( nRcdExists_1744 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1KZ1744( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1744 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1KZ1744( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1744 == 0 )
                  {
                     GXCCtl = "VXALMUBI_" + sGXsfl_30_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtVxAlmUbi_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1744_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1744, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxAlmUbi_Internalname, GXutil.rtrim( A12249VxAlmUbi)) ;
         httpContext.changePostValue( "ZT_"+"Z12249VxAlmUbi_"+sGXsfl_30_idx, GXutil.rtrim( Z12249VxAlmUbi)) ;
         httpContext.changePostValue( "nRcdDeleted_1744_"+sGXsfl_30_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1744, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1744_"+sGXsfl_30_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1744, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1744_"+sGXsfl_30_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1744, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1744 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1744_"+sGXsfl_30_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1744_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXALMUBI_"+sGXsfl_30_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxAlmUbi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1KZ1744( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1744 = (short)(0) ;
      nIsMod_1744 = (short)(0) ;
      nRcdDeleted_1744 = (short)(0) ;
   }

   public void processLevel1KZ1743( )
   {
      /* Save parent mode. */
      sMode1743 = Gx_mode ;
      processNestedLevel1KZ1744( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1743 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1KZ1743( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1KZ1743( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tvxalmacen");
         if ( AnyError == 0 )
         {
            confirmValues1KZ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxalmacen");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1KZ1743( )
   {
      /* Using cursor T01KZ14 */
      pr_default.execute(12);
      RcdFound1743 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1743 = (short)(1) ;
         A12248VxAlmCod = T01KZ14_A12248VxAlmCod[0] ;
         n12248VxAlmCod = T01KZ14_n12248VxAlmCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12248VxAlmCod", A12248VxAlmCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KZ1743( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound1743 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1743 = (short)(1) ;
         A12248VxAlmCod = T01KZ14_A12248VxAlmCod[0] ;
         n12248VxAlmCod = T01KZ14_n12248VxAlmCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12248VxAlmCod", A12248VxAlmCod);
      }
   }

   public void scanEnd1KZ1743( )
   {
      pr_default.close(12);
   }

   public void afterConfirm1KZ1743( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KZ1743( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KZ1743( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KZ1743( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KZ1743( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KZ1743( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KZ1743( )
   {
      edtVxAlmCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxAlmCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxAlmCod_Enabled), 5, 0), true);
      edtVxAlmDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxAlmDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxAlmDsc_Enabled), 5, 0), true);
   }

   public void zm1KZ1744( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -2 )
      {
         Z12248VxAlmCod = A12248VxAlmCod ;
         Z12249VxAlmUbi = A12249VxAlmUbi ;
      }
   }

   public void standaloneNotModal1KZ1744( )
   {
   }

   public void standaloneModal1KZ1744( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtVxAlmUbi_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtVxAlmUbi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxAlmUbi_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      }
      else
      {
         edtVxAlmUbi_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtVxAlmUbi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxAlmUbi_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      }
   }

   public void load1KZ1744( )
   {
      /* Using cursor T01KZ15 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod, Boolean.valueOf(n12249VxAlmUbi), A12249VxAlmUbi});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1744 = (short)(1) ;
         zm1KZ1744( -2) ;
      }
      pr_default.close(13);
      onLoadActions1KZ1744( ) ;
   }

   public void onLoadActions1KZ1744( )
   {
   }

   public void checkExtendedTable1KZ1744( )
   {
      nIsDirty_1744 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1KZ1744( ) ;
   }

   public void closeExtendedTableCursors1KZ1744( )
   {
   }

   public void enableDisable1KZ1744( )
   {
   }

   public void getKey1KZ1744( )
   {
      /* Using cursor T01KZ16 */
      pr_default.execute(14, new Object[] {Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod, Boolean.valueOf(n12249VxAlmUbi), A12249VxAlmUbi});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1744 = (short)(1) ;
      }
      else
      {
         RcdFound1744 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey1KZ1744( )
   {
      /* Using cursor T01KZ3 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod, Boolean.valueOf(n12249VxAlmUbi), A12249VxAlmUbi});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1KZ1744( 2) ;
         RcdFound1744 = (short)(1) ;
         initializeNonKey1KZ1744( ) ;
         A12249VxAlmUbi = T01KZ3_A12249VxAlmUbi[0] ;
         n12249VxAlmUbi = T01KZ3_n12249VxAlmUbi[0] ;
         Z12248VxAlmCod = A12248VxAlmCod ;
         Z12249VxAlmUbi = A12249VxAlmUbi ;
         sMode1744 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1KZ1744( ) ;
         load1KZ1744( ) ;
         Gx_mode = sMode1744 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1744 = (short)(0) ;
         initializeNonKey1KZ1744( ) ;
         sMode1744 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1KZ1744( ) ;
         Gx_mode = sMode1744 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1KZ1744( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1KZ1744( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KZ2 */
         pr_default.execute(0, new Object[] {Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod, Boolean.valueOf(n12249VxAlmUbi), A12249VxAlmUbi});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXALMUBI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"VTXALMUBI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KZ1744( )
   {
      beforeValidate1KZ1744( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KZ1744( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KZ1744( 0) ;
         checkOptimisticConcurrency1KZ1744( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KZ1744( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KZ1744( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KZ17 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod, Boolean.valueOf(n12249VxAlmUbi), A12249VxAlmUbi});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXALMUBI");
                  if ( (pr_default.getStatus(15) == 1) )
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
            load1KZ1744( ) ;
         }
         endLevel1KZ1744( ) ;
      }
      closeExtendedTableCursors1KZ1744( ) ;
   }

   public void update1KZ1744( )
   {
      beforeValidate1KZ1744( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KZ1744( ) ;
      }
      if ( ( nIsMod_1744 != 0 ) || ( nIsDirty_1744 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1KZ1744( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1KZ1744( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1KZ1744( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table VTXALMUBI */
                     deferredUpdate1KZ1744( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1KZ1744( ) ;
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
            endLevel1KZ1744( ) ;
         }
      }
      closeExtendedTableCursors1KZ1744( ) ;
   }

   public void deferredUpdate1KZ1744( )
   {
   }

   public void delete1KZ1744( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1KZ1744( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KZ1744( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KZ1744( ) ;
         afterConfirm1KZ1744( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KZ1744( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01KZ18 */
               pr_default.execute(16, new Object[] {Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod, Boolean.valueOf(n12249VxAlmUbi), A12249VxAlmUbi});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXALMUBI");
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
      sMode1744 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KZ1744( ) ;
      Gx_mode = sMode1744 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KZ1744( )
   {
      standaloneModal1KZ1744( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01KZ19 */
         pr_default.execute(17, new Object[] {Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod, Boolean.valueOf(n12249VxAlmUbi), A12249VxAlmUbi});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Vertex - Rollos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
      }
   }

   public void endLevel1KZ1744( )
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

   public void scanStart1KZ1744( )
   {
      /* Scan By routine */
      /* Using cursor T01KZ20 */
      pr_default.execute(18, new Object[] {Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod});
      RcdFound1744 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1744 = (short)(1) ;
         A12249VxAlmUbi = T01KZ20_A12249VxAlmUbi[0] ;
         n12249VxAlmUbi = T01KZ20_n12249VxAlmUbi[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KZ1744( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1744 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1744 = (short)(1) ;
         A12249VxAlmUbi = T01KZ20_A12249VxAlmUbi[0] ;
         n12249VxAlmUbi = T01KZ20_n12249VxAlmUbi[0] ;
      }
   }

   public void scanEnd1KZ1744( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1KZ1744( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KZ1744( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KZ1744( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KZ1744( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KZ1744( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KZ1744( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KZ1744( )
   {
      edtVxAlmUbi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxAlmUbi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxAlmUbi_Enabled), 5, 0), !bGXsfl_30_Refreshing);
   }

   public void send_integrity_lvl_hashes1KZ1744( )
   {
   }

   public void send_integrity_lvl_hashes1KZ1743( )
   {
   }

   public void subsflControlProps_301744( )
   {
      edtavnRcdDeleted_1744_Internalname = "vNRCDDELETED_1744_"+sGXsfl_30_idx ;
      edtVxAlmUbi_Internalname = "VXALMUBI_"+sGXsfl_30_idx ;
   }

   public void subsflControlProps_fel_301744( )
   {
      edtavnRcdDeleted_1744_Internalname = "vNRCDDELETED_1744_"+sGXsfl_30_fel_idx ;
      edtVxAlmUbi_Internalname = "VXALMUBI_"+sGXsfl_30_fel_idx ;
   }

   public void addRow1KZ1744( )
   {
      nGXsfl_30_idx = (int)(nGXsfl_30_idx+1) ;
      sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_301744( ) ;
      sendRow1KZ1744( ) ;
   }

   public void sendRow1KZ1744( )
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
         if ( ((int)((nGXsfl_30_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1744_" + sGXsfl_30_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_30_idx + "',30)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1744_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1744, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1744_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1744), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1744), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1744_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1744_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1744_" + sGXsfl_30_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_30_idx + "',30)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVxAlmUbi_Internalname,GXutil.rtrim( A12249VxAlmUbi),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVxAlmUbi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVxAlmUbi_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1KZ1744( ) ;
      GXCCtl = "Z12249VxAlmUbi_" + sGXsfl_30_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12249VxAlmUbi));
      GXCCtl = "nRcdDeleted_1744_" + sGXsfl_30_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1744, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1744_" + sGXsfl_30_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1744, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1744_" + sGXsfl_30_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1744, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1744_"+sGXsfl_30_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1744_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXALMUBI_"+sGXsfl_30_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxAlmUbi_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1KZ1744( )
   {
      nGXsfl_30_idx = (int)(nGXsfl_30_idx+1) ;
      sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_301744( ) ;
      edtavnRcdDeleted_1744_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1744_"+sGXsfl_30_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVxAlmUbi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXALMUBI_"+sGXsfl_30_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1744_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1744_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1744");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1744_Internalname ;
         wbErr = true ;
         nRcdDeleted_1744 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1744 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1744_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A12249VxAlmUbi = httpContext.cgiGet( edtVxAlmUbi_Internalname) ;
      n12249VxAlmUbi = false ;
      GXCCtl = "Z12249VxAlmUbi_" + sGXsfl_30_idx ;
      Z12249VxAlmUbi = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1744_" + sGXsfl_30_idx ;
      nRcdDeleted_1744 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1744_" + sGXsfl_30_idx ;
      nRcdExists_1744 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1744_" + sGXsfl_30_idx ;
      nIsMod_1744 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtVxAlmUbi_Enabled = edtVxAlmUbi_Enabled ;
   }

   public void confirmValues1KZ0( )
   {
      nGXsfl_30_idx = 0 ;
      sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_301744( ) ;
      while ( nGXsfl_30_idx < nRC_GXsfl_30 )
      {
         nGXsfl_30_idx = (int)(nGXsfl_30_idx+1) ;
         sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_301744( ) ;
         httpContext.changePostValue( "Z12249VxAlmUbi_"+sGXsfl_30_idx, httpContext.cgiGet( "ZT_"+"Z12249VxAlmUbi_"+sGXsfl_30_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12249VxAlmUbi_"+sGXsfl_30_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tvxalmacen", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z12248VxAlmCod", GXutil.rtrim( Z12248VxAlmCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12669VxAlmDsc", GXutil.rtrim( Z12669VxAlmDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_30", GXutil.ltrim( localUtil.ntoc( nGXsfl_30_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tvxalmacen", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TVxAlmacen" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Estructura ALMACEN  en VERTEX", "") ;
   }

   public void initializeNonKey1KZ1743( )
   {
      A12669VxAlmDsc = "" ;
      n12669VxAlmDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12669VxAlmDsc", A12669VxAlmDsc);
      Z12669VxAlmDsc = "" ;
   }

   public void initAll1KZ1743( )
   {
      A12248VxAlmCod = "" ;
      n12248VxAlmCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12248VxAlmCod", A12248VxAlmCod);
      initializeNonKey1KZ1743( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1KZ1744( )
   {
   }

   public void initAll1KZ1744( )
   {
      A12249VxAlmUbi = "" ;
      n12249VxAlmUbi = false ;
      initializeNonKey1KZ1744( ) ;
   }

   public void standaloneModalInsert1KZ1744( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20261251955085", true, true);
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
      httpContext.AddJavascriptSource("tvxalmacen.js", "?20261251955085", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1744( )
   {
      edtVxAlmUbi_Enabled = defedtVxAlmUbi_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxAlmUbi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxAlmUbi_Enabled), 5, 0), !bGXsfl_30_Refreshing);
   }

   public void startgridcontrol30( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1744, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1744_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12249VxAlmUbi));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVxAlmUbi_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtVxAlmCod_Internalname = "VXALMCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtVxAlmDsc_Internalname = "VXALMDSC" ;
      edtavnRcdDeleted_1744_Internalname = "vNRCDDELETED_1744" ;
      edtVxAlmUbi_Internalname = "VXALMUBI" ;
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
      Form.setCaption( httpContext.getMessage( "Estructura ALMACEN  en VERTEX", "") );
      edtVxAlmUbi_Jsonclick = "" ;
      edtavnRcdDeleted_1744_Jsonclick = "" ;
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
      edtVxAlmUbi_Enabled = 1 ;
      edtavnRcdDeleted_1744_Enabled = 1 ;
      edtVxAlmDsc_Jsonclick = "" ;
      edtVxAlmDsc_Backcolor = (int)(0xFFFFFF) ;
      edtVxAlmDsc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtVxAlmCod_Jsonclick = "" ;
      edtVxAlmCod_Backcolor = (int)(0xFFFFFF) ;
      edtVxAlmCod_Enabled = 1 ;
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
      subsflControlProps_301744( ) ;
      while ( nGXsfl_30_idx <= nRC_GXsfl_30 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1KZ1744( ) ;
         standaloneModal1KZ1744( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1KZ1744( ) ;
         nGXsfl_30_idx = (int)(nGXsfl_30_idx+1) ;
         sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_301744( ) ;
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
      GX_FocusControl = edtVxAlmDsc_Internalname ;
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

   public void valid_Vxalmcod( )
   {
      n12248VxAlmCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12669VxAlmDsc", GXutil.rtrim( A12669VxAlmDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12248VxAlmCod", GXutil.rtrim( Z12248VxAlmCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12669VxAlmDsc", GXutil.rtrim( Z12669VxAlmDsc));
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
      setEventMetadata("VALID_VXALMCOD","{handler:'valid_Vxalmcod',iparms:[{av:'A12248VxAlmCod',fld:'VXALMCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_VXALMCOD",",oparms:[{av:'A12669VxAlmDsc',fld:'VXALMDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z12248VxAlmCod'},{av:'Z12669VxAlmDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_VXALMUBI","{handler:'valid_Vxalmubi',iparms:[]");
      setEventMetadata("VALID_VXALMUBI",",oparms:[]}");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z12248VxAlmCod = "" ;
      Z12669VxAlmDsc = "" ;
      Z12249VxAlmUbi = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      A12248VxAlmCod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      A12669VxAlmDsc = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1744 = "" ;
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
      sMode1743 = "" ;
      GXCCtl = "" ;
      A12249VxAlmUbi = "" ;
      T01KZ6_A12248VxAlmCod = new String[] {""} ;
      T01KZ6_n12248VxAlmCod = new boolean[] {false} ;
      T01KZ6_A12669VxAlmDsc = new String[] {""} ;
      T01KZ6_n12669VxAlmDsc = new boolean[] {false} ;
      T01KZ7_A12248VxAlmCod = new String[] {""} ;
      T01KZ7_n12248VxAlmCod = new boolean[] {false} ;
      T01KZ5_A12248VxAlmCod = new String[] {""} ;
      T01KZ5_n12248VxAlmCod = new boolean[] {false} ;
      T01KZ5_A12669VxAlmDsc = new String[] {""} ;
      T01KZ5_n12669VxAlmDsc = new boolean[] {false} ;
      T01KZ8_A12248VxAlmCod = new String[] {""} ;
      T01KZ8_n12248VxAlmCod = new boolean[] {false} ;
      T01KZ9_A12248VxAlmCod = new String[] {""} ;
      T01KZ9_n12248VxAlmCod = new boolean[] {false} ;
      T01KZ4_A12248VxAlmCod = new String[] {""} ;
      T01KZ4_n12248VxAlmCod = new boolean[] {false} ;
      T01KZ4_A12669VxAlmDsc = new String[] {""} ;
      T01KZ4_n12669VxAlmDsc = new boolean[] {false} ;
      T01KZ13_A6224VxLotId = new int[1] ;
      T01KZ14_A12248VxAlmCod = new String[] {""} ;
      T01KZ14_n12248VxAlmCod = new boolean[] {false} ;
      T01KZ15_A12248VxAlmCod = new String[] {""} ;
      T01KZ15_n12248VxAlmCod = new boolean[] {false} ;
      T01KZ15_A12249VxAlmUbi = new String[] {""} ;
      T01KZ15_n12249VxAlmUbi = new boolean[] {false} ;
      T01KZ16_A12248VxAlmCod = new String[] {""} ;
      T01KZ16_n12248VxAlmCod = new boolean[] {false} ;
      T01KZ16_A12249VxAlmUbi = new String[] {""} ;
      T01KZ16_n12249VxAlmUbi = new boolean[] {false} ;
      T01KZ3_A12248VxAlmCod = new String[] {""} ;
      T01KZ3_n12248VxAlmCod = new boolean[] {false} ;
      T01KZ3_A12249VxAlmUbi = new String[] {""} ;
      T01KZ3_n12249VxAlmUbi = new boolean[] {false} ;
      T01KZ2_A12248VxAlmCod = new String[] {""} ;
      T01KZ2_n12248VxAlmCod = new boolean[] {false} ;
      T01KZ2_A12249VxAlmUbi = new String[] {""} ;
      T01KZ2_n12249VxAlmUbi = new boolean[] {false} ;
      T01KZ19_A6224VxLotId = new int[1] ;
      T01KZ20_A12248VxAlmCod = new String[] {""} ;
      T01KZ20_n12248VxAlmCod = new boolean[] {false} ;
      T01KZ20_A12249VxAlmUbi = new String[] {""} ;
      T01KZ20_n12249VxAlmUbi = new boolean[] {false} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ12248VxAlmCod = "" ;
      ZZ12669VxAlmDsc = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tvxalmacen__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tvxalmacen__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tvxalmacen__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tvxalmacen__default(),
         new Object[] {
             new Object[] {
            T01KZ2_A12248VxAlmCod, T01KZ2_A12249VxAlmUbi
            }
            , new Object[] {
            T01KZ3_A12248VxAlmCod, T01KZ3_A12249VxAlmUbi
            }
            , new Object[] {
            T01KZ4_A12248VxAlmCod, T01KZ4_A12669VxAlmDsc, T01KZ4_n12669VxAlmDsc
            }
            , new Object[] {
            T01KZ5_A12248VxAlmCod, T01KZ5_A12669VxAlmDsc, T01KZ5_n12669VxAlmDsc
            }
            , new Object[] {
            T01KZ6_A12248VxAlmCod, T01KZ6_A12669VxAlmDsc, T01KZ6_n12669VxAlmDsc
            }
            , new Object[] {
            T01KZ7_A12248VxAlmCod
            }
            , new Object[] {
            T01KZ8_A12248VxAlmCod
            }
            , new Object[] {
            T01KZ9_A12248VxAlmCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KZ13_A6224VxLotId
            }
            , new Object[] {
            T01KZ14_A12248VxAlmCod
            }
            , new Object[] {
            T01KZ15_A12248VxAlmCod, T01KZ15_A12249VxAlmUbi
            }
            , new Object[] {
            T01KZ16_A12248VxAlmCod, T01KZ16_A12249VxAlmUbi
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KZ19_A6224VxLotId
            }
            , new Object[] {
            T01KZ20_A12248VxAlmCod, T01KZ20_A12249VxAlmUbi
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
   private short nRcdDeleted_1744 ;
   private short nRcdExists_1744 ;
   private short nIsMod_1744 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1744 ;
   private short RcdFound1744 ;
   private short nBlankRcdUsr1744 ;
   private short RcdFound1743 ;
   private short nIsDirty_1743 ;
   private short nIsDirty_1744 ;
   private int nRC_GXsfl_30 ;
   private int nGXsfl_30_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtVxAlmCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtVxAlmDsc_Enabled ;
   private int edtavnRcdDeleted_1744_Enabled ;
   private int edtVxAlmUbi_Enabled ;
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
   private int defedtVxAlmUbi_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtVxAlmDsc_Backcolor ;
   private int edtVxAlmCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z12248VxAlmCod ;
   private String Z12669VxAlmDsc ;
   private String Z12249VxAlmUbi ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtVxAlmCod_Internalname ;
   private String sGXsfl_30_idx="0001" ;
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
   private String A12248VxAlmCod ;
   private String edtVxAlmCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtVxAlmDsc_Internalname ;
   private String A12669VxAlmDsc ;
   private String edtVxAlmDsc_Jsonclick ;
   private String sMode1744 ;
   private String edtavnRcdDeleted_1744_Internalname ;
   private String edtVxAlmUbi_Internalname ;
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
   private String sMode1743 ;
   private String GXCCtl ;
   private String A12249VxAlmUbi ;
   private String sGXsfl_30_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1744_Jsonclick ;
   private String edtVxAlmUbi_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ12248VxAlmCod ;
   private String ZZ12669VxAlmDsc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_30_Refreshing=false ;
   private boolean n12248VxAlmCod ;
   private boolean n12669VxAlmDsc ;
   private boolean n12249VxAlmUbi ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01KZ6_A12248VxAlmCod ;
   private boolean[] T01KZ6_n12248VxAlmCod ;
   private String[] T01KZ6_A12669VxAlmDsc ;
   private boolean[] T01KZ6_n12669VxAlmDsc ;
   private String[] T01KZ7_A12248VxAlmCod ;
   private boolean[] T01KZ7_n12248VxAlmCod ;
   private String[] T01KZ5_A12248VxAlmCod ;
   private boolean[] T01KZ5_n12248VxAlmCod ;
   private String[] T01KZ5_A12669VxAlmDsc ;
   private boolean[] T01KZ5_n12669VxAlmDsc ;
   private String[] T01KZ8_A12248VxAlmCod ;
   private boolean[] T01KZ8_n12248VxAlmCod ;
   private String[] T01KZ9_A12248VxAlmCod ;
   private boolean[] T01KZ9_n12248VxAlmCod ;
   private String[] T01KZ4_A12248VxAlmCod ;
   private boolean[] T01KZ4_n12248VxAlmCod ;
   private String[] T01KZ4_A12669VxAlmDsc ;
   private boolean[] T01KZ4_n12669VxAlmDsc ;
   private int[] T01KZ13_A6224VxLotId ;
   private String[] T01KZ14_A12248VxAlmCod ;
   private boolean[] T01KZ14_n12248VxAlmCod ;
   private String[] T01KZ15_A12248VxAlmCod ;
   private boolean[] T01KZ15_n12248VxAlmCod ;
   private String[] T01KZ15_A12249VxAlmUbi ;
   private boolean[] T01KZ15_n12249VxAlmUbi ;
   private String[] T01KZ16_A12248VxAlmCod ;
   private boolean[] T01KZ16_n12248VxAlmCod ;
   private String[] T01KZ16_A12249VxAlmUbi ;
   private boolean[] T01KZ16_n12249VxAlmUbi ;
   private String[] T01KZ3_A12248VxAlmCod ;
   private boolean[] T01KZ3_n12248VxAlmCod ;
   private String[] T01KZ3_A12249VxAlmUbi ;
   private boolean[] T01KZ3_n12249VxAlmUbi ;
   private String[] T01KZ2_A12248VxAlmCod ;
   private boolean[] T01KZ2_n12248VxAlmCod ;
   private String[] T01KZ2_A12249VxAlmUbi ;
   private boolean[] T01KZ2_n12249VxAlmUbi ;
   private int[] T01KZ19_A6224VxLotId ;
   private String[] T01KZ20_A12248VxAlmCod ;
   private boolean[] T01KZ20_n12248VxAlmCod ;
   private String[] T01KZ20_A12249VxAlmUbi ;
   private boolean[] T01KZ20_n12249VxAlmUbi ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tvxalmacen__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxalmacen__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxalmacen__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxalmacen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01KZ2", "SELECT AlmCod AS VxAlmCod, AlmUbi AS VxAlmUbi FROM VTXALMUBI WHERE AlmCod = ? AND AlmUbi = ?  FOR UPDATE OF AlmCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KZ3", "SELECT AlmCod AS VxAlmCod, AlmUbi AS VxAlmUbi FROM VTXALMUBI WHERE AlmCod = ? AND AlmUbi = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KZ4", "SELECT AlmCod AS VxAlmCod, AlmDsc FROM VTXALMACEN WHERE AlmCod = ?  FOR UPDATE OF AlmDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KZ5", "SELECT AlmCod AS VxAlmCod, AlmDsc FROM VTXALMACEN WHERE AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KZ6", "SELECT /*+ FIRST_ROWS(100) */ TM1.AlmCod AS VxAlmCod, TM1.AlmDsc FROM VTXALMACEN TM1 WHERE TM1.AlmCod = ? ORDER BY TM1.AlmCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KZ7", "SELECT /*+ FIRST_ROWS(1) */ AlmCod AS VxAlmCod FROM VTXALMACEN WHERE AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KZ8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ AlmCod AS VxAlmCod FROM VTXALMACEN WHERE ( AlmCod > ?) ORDER BY AlmCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KZ9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ AlmCod AS VxAlmCod FROM VTXALMACEN WHERE ( AlmCod < ?) ORDER BY AlmCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01KZ10", "INSERT INTO VTXALMACEN(AlmCod, AlmDsc) VALUES(?, ?)", GX_NOMASK, "VTXALMACEN")
         ,new UpdateCursor("T01KZ11", "UPDATE VTXALMACEN SET AlmDsc=?  WHERE AlmCod = ?", GX_NOMASK, "VTXALMACEN")
         ,new UpdateCursor("T01KZ12", "DELETE FROM VTXALMACEN  WHERE AlmCod = ?", GX_NOMASK, "VTXALMACEN")
         ,new ForEachCursor("T01KZ13", "SELECT * FROM (SELECT STeLotId FROM VTXSTKTE WHERE AlmCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KZ14", "SELECT /*+ FIRST_ROWS(100) */ AlmCod AS VxAlmCod FROM VTXALMACEN ORDER BY AlmCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KZ15", "SELECT AlmCod AS VxAlmCod, AlmUbi AS VxAlmUbi FROM VTXALMUBI WHERE AlmCod = ? and AlmUbi = ? ORDER BY AlmCod, AlmUbi ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KZ16", "SELECT AlmCod AS VxAlmCod, AlmUbi AS VxAlmUbi FROM VTXALMUBI WHERE AlmCod = ? AND AlmUbi = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01KZ17", "INSERT INTO VTXALMUBI(AlmCod, AlmUbi) VALUES(?, ?)", GX_NOMASK, "VTXALMUBI")
         ,new UpdateCursor("T01KZ18", "DELETE FROM VTXALMUBI  WHERE AlmCod = ? AND AlmUbi = ?", GX_NOMASK, "VTXALMUBI")
         ,new ForEachCursor("T01KZ19", "SELECT * FROM (SELECT STeLotId FROM VTXSTKTE WHERE AlmCod = ? AND AlmUbi = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KZ20", "SELECT AlmCod AS VxAlmCod, AlmUbi AS VxAlmUbi FROM VTXALMUBI WHERE AlmCod = ? ORDER BY AlmCod, AlmUbi ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 10);
               }
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 10);
               }
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 20);
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 20);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 4);
               }
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 10);
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 10);
               }
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 10);
               }
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 10);
               }
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 10);
               }
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               return;
      }
   }

}

