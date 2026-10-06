package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tnordis_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13213DisNormID = httpContext.GetPar( "DisNormID") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A13213DisNormID) ;
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
            A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Normas", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtDisDest_Internalname ;
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

   public tnordis_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tnordis_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tnordis_impl.class ));
   }

   public tnordis_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNORDIS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNORDIS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNORDIS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNORDIS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TNORDIS.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNORDIS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNORDIS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNORDIS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNORDIS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNORDIS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TNORDIS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNORDIS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Contextura para JPF", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TNORDIS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisDest_Internalname, GXutil.rtrim( A8886DisDest), GXutil.rtrim( localUtil.format( A8886DisDest, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisDest_Jsonclick, 0, "", "", "", "", "", 1, edtDisDest_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TNORDIS.htm");
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
         nBlankRcdCount1812 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1812 = (short)(1) ;
            scanStart1O21812( ) ;
            while ( RcdFound1812 != 0 )
            {
               init_level_properties1812( ) ;
               getByPrimaryKey1O21812( ) ;
               addRow1O21812( ) ;
               scanNext1O21812( ) ;
            }
            scanEnd1O21812( ) ;
            nBlankRcdCount1812 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1O21812( ) ;
         standaloneModal1O21812( ) ;
         sMode1812 = Gx_mode ;
         while ( nGXsfl_40_idx < nRC_GXsfl_40 )
         {
            bGXsfl_40_Refreshing = true ;
            readRow1O21812( ) ;
            edtavnRcdDeleted_1812_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1812_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1812_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1812_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtDisNormID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISNORMID_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisNormID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNormID_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtDisNormDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISNORMDSC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisNormDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNormDsc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            if ( ( nRcdExists_1812 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1O21812( ) ;
            }
            sendRow1O21812( ) ;
            bGXsfl_40_Refreshing = false ;
         }
         Gx_mode = sMode1812 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1812 = (short)(5) ;
         nRcdExists_1812 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1O21812( ) ;
            while ( RcdFound1812 != 0 )
            {
               sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_401812( ) ;
               init_level_properties1812( ) ;
               standaloneNotModal1O21812( ) ;
               getByPrimaryKey1O21812( ) ;
               standaloneModal1O21812( ) ;
               addRow1O21812( ) ;
               scanNext1O21812( ) ;
            }
            scanEnd1O21812( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1812 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_401812( ) ;
      initAll1O21812( ) ;
      init_level_properties1812( ) ;
      nRcdExists_1812 = (short)(0) ;
      nIsMod_1812 = (short)(0) ;
      nRcdDeleted_1812 = (short)(0) ;
      nBlankRcdCount1812 = (short)(nBlankRcdUsr1812+nBlankRcdCount1812) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1812 > 0 )
      {
         standaloneNotModal1O21812( ) ;
         standaloneModal1O21812( ) ;
         addRow1O21812( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDisNormID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1812 = (short)(nBlankRcdCount1812-1) ;
      }
      Gx_mode = sMode1812 ;
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNORDIS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNORDIS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNORDIS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TNORDIS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TNORDIS.htm");
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
      e111O22 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8886DisDest = httpContext.cgiGet( "Z8886DisDest") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A8886DisDest = httpContext.cgiGet( edtDisDest_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8886DisDest", A8886DisDest);
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
               A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
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
                        e111O22 ();
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
            initAll1O234( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1812_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1812_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      disableAttributes1O234( ) ;
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

   public void confirm_1O20( )
   {
      beforeValidate1O234( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1O234( ) ;
         }
         else
         {
            checkExtendedTable1O234( ) ;
            if ( AnyError == 0 )
            {
               zm1O234( 2) ;
            }
            closeExtendedTableCursors1O234( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode34 = Gx_mode ;
         confirm_1O21812( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode34 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1O20( ) ;
      }
   }

   public void confirm_1O21812( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1O21812( ) ;
         if ( ( nRcdExists_1812 != 0 ) || ( nIsMod_1812 != 0 ) )
         {
            getKey1O21812( ) ;
            if ( ( nRcdExists_1812 == 0 ) && ( nRcdDeleted_1812 == 0 ) )
            {
               if ( RcdFound1812 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1O21812( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1O21812( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1O21812( 4) ;
                     }
                     closeExtendedTableCursors1O21812( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "DISNORMID_" + sGXsfl_40_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDisNormID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1812 != 0 )
               {
                  if ( nRcdDeleted_1812 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1O21812( ) ;
                     load1O21812( ) ;
                     beforeValidate1O21812( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1O21812( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1812 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1O21812( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1O21812( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1O21812( 4) ;
                           }
                           closeExtendedTableCursors1O21812( ) ;
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
                  if ( nRcdDeleted_1812 == 0 )
                  {
                     GXCCtl = "DISNORMID_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisNormID_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1812_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1812, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisNormID_Internalname, GXutil.rtrim( A13213DisNormID)) ;
         httpContext.changePostValue( edtDisNormDsc_Internalname, GXutil.rtrim( A13216DisNormDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z13213DisNormID_"+sGXsfl_40_idx, GXutil.rtrim( Z13213DisNormID)) ;
         httpContext.changePostValue( "nRcdDeleted_1812_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1812, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1812_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1812, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1812_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1812, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1812 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1812_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1812_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISNORMID_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisNormID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISNORMDSC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisNormDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1O20( )
   {
   }

   public void e111O22( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tnordis_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV34Pgmname, (byte)(99), GXv_char2) ;
      tnordis_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tnordis_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tnordis_impl.this.A396EmprCod = GXv_char2[0] ;
      tnordis_impl.this.AV11EmprNom = GXv_char3[0] ;
      tnordis_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1O234( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8886DisDest = T01O26_A8886DisDest[0] ;
         }
         else
         {
            Z8886DisDest = A8886DisDest ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z361DisCod = A361DisCod ;
         Z8886DisDest = A8886DisDest ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV34Pgmname = "TNORDIS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      /* Using cursor T01O27 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01O27_A407EmprNom[0] ;
      n407EmprNom = T01O27_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
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

   public void load1O234( )
   {
      /* Using cursor T01O28 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A407EmprNom = T01O28_A407EmprNom[0] ;
         n407EmprNom = T01O28_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A8886DisDest = T01O28_A8886DisDest[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8886DisDest", A8886DisDest);
         zm1O234( -1) ;
      }
      pr_default.close(6);
      onLoadActions1O234( ) ;
   }

   public void onLoadActions1O234( )
   {
   }

   public void checkExtendedTable1O234( )
   {
      nIsDirty_34 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1O234( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1O234( )
   {
      /* Using cursor T01O29 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      else
      {
         RcdFound34 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01O26 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(4) != 101) && ( T01O26_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01O26_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1O234( 1) ;
         RcdFound34 = (short)(1) ;
         A8886DisDest = T01O26_A8886DisDest[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8886DisDest", A8886DisDest);
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1O234( ) ;
         if ( AnyError == 1 )
         {
            RcdFound34 = (short)(0) ;
            initializeNonKey1O234( ) ;
         }
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound34 = (short)(0) ;
         initializeNonKey1O234( ) ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1O234( ) ;
      if ( RcdFound34 == 0 )
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
      RcdFound34 = (short)(0) ;
      /* Using cursor T01O210 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01O210_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01O210_A361DisCod[0] == A361DisCod ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01O210_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01O210_A361DisCod[0] == A361DisCod ) )
         {
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound34 = (short)(0) ;
      /* Using cursor T01O211 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01O211_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01O211_A361DisCod[0] == A361DisCod ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01O211_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01O211_A361DisCod[0] == A361DisCod ) )
         {
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1O234( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtDisDest_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1O234( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound34 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
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
               GX_FocusControl = edtDisDest_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1O234( ) ;
               GX_FocusControl = edtDisDest_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtDisDest_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1O234( ) ;
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
                  GX_FocusControl = edtDisDest_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1O234( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
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
         GX_FocusControl = edtDisDest_Internalname ;
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
      getKey1O234( ) ;
      if ( RcdFound34 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tnordis");
      GX_FocusControl = edtDisDest_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1O20( ) ;
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
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtDisDest_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1O234( ) ;
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDisDest_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1O234( ) ;
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
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDisDest_Internalname ;
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
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDisDest_Internalname ;
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
      scanStart1O234( ) ;
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound34 != 0 )
         {
            scanNext1O234( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDisDest_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1O234( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1O234( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01O25 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z8886DisDest, T01O25_A8886DisDest[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z8886DisDest, T01O25_A8886DisDest[0]) != 0 )
            {
               GXutil.writeLogln("tnordis:[seudo value changed for attri]"+"DisDest");
               GXutil.writeLogRaw("Old: ",Z8886DisDest);
               GXutil.writeLogRaw("Current: ",T01O25_A8886DisDest[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISPOS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1O234( )
   {
      beforeValidate1O234( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1O234( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1O234( 0) ;
         checkOptimisticConcurrency1O234( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1O234( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1O234( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01O212 */
                  pr_default.execute(10, new Object[] {Integer.valueOf(A361DisCod), A8886DisDest, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
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
                        processLevel1O234( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1O20( ) ;
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
            load1O234( ) ;
         }
         endLevel1O234( ) ;
      }
      closeExtendedTableCursors1O234( ) ;
   }

   public void update1O234( )
   {
      beforeValidate1O234( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1O234( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1O234( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1O234( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1O234( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01O213 */
                  pr_default.execute(11, new Object[] {A8886DisDest, A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1O234( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int5[0] = A361DisCod ;
                     new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int5) ;
                     tnordis_impl.this.A396EmprCod = GXv_char4[0] ;
                     tnordis_impl.this.A361DisCod = GXv_int5[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1O234( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1O20( ) ;
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
         endLevel1O234( ) ;
      }
      closeExtendedTableCursors1O234( ) ;
   }

   public void deferredUpdate1O234( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1O234( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1O234( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1O234( ) ;
         afterConfirm1O234( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1O234( ) ;
            if ( AnyError == 0 )
            {
               scanStart1O21812( ) ;
               while ( RcdFound1812 != 0 )
               {
                  getByPrimaryKey1O21812( ) ;
                  delete1O21812( ) ;
                  scanNext1O21812( ) ;
               }
               scanEnd1O21812( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01O214 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound34 == 0 )
                        {
                           initAll1O234( ) ;
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
                        resetCaption1O20( ) ;
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
      sMode34 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1O234( ) ;
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1O234( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01O215 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Accesorios Tinte", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01O216 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01O217 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01O218 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01O219 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISACC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01O220 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01O221 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISREF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01O222 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSERV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01O223 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01O224 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISDEF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01O225 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
      }
   }

   public void processNestedLevel1O21812( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1O21812( ) ;
         if ( ( nRcdExists_1812 != 0 ) || ( nIsMod_1812 != 0 ) )
         {
            standaloneNotModal1O21812( ) ;
            getKey1O21812( ) ;
            if ( ( nRcdExists_1812 == 0 ) && ( nRcdDeleted_1812 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1O21812( ) ;
            }
            else
            {
               if ( RcdFound1812 != 0 )
               {
                  if ( ( nRcdDeleted_1812 != 0 ) && ( nRcdExists_1812 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1O21812( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1812 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1O21812( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1812 == 0 )
                  {
                     GXCCtl = "DISNORMID_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisNormID_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1812_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1812, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisNormID_Internalname, GXutil.rtrim( A13213DisNormID)) ;
         httpContext.changePostValue( edtDisNormDsc_Internalname, GXutil.rtrim( A13216DisNormDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z13213DisNormID_"+sGXsfl_40_idx, GXutil.rtrim( Z13213DisNormID)) ;
         httpContext.changePostValue( "nRcdDeleted_1812_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1812, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1812_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1812, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1812_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1812, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1812 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1812_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1812_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISNORMID_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisNormID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISNORMDSC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisNormDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1O21812( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1812 = (short)(0) ;
      nIsMod_1812 = (short)(0) ;
      nRcdDeleted_1812 = (short)(0) ;
   }

   public void processLevel1O234( )
   {
      /* Save parent mode. */
      sMode34 = Gx_mode ;
      processNestedLevel1O21812( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1O234( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1O234( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tnordis");
         if ( AnyError == 0 )
         {
            confirmValues1O20( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tnordis");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1O234( )
   {
      /* Scan By routine */
      /* Using cursor T01O226 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1O234( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
   }

   public void scanEnd1O234( )
   {
      pr_default.close(24);
   }

   public void afterConfirm1O234( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1O234( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1O234( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1O234( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1O234( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1O234( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1O234( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtDisDest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDest_Enabled), 5, 0), true);
   }

   public void zm1O21812( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -3 )
      {
         Z361DisCod = A361DisCod ;
         Z396EmprCod = A396EmprCod ;
         Z13213DisNormID = A13213DisNormID ;
         Z13216DisNormDsc = A13216DisNormDsc ;
      }
   }

   public void standaloneNotModal1O21812( )
   {
   }

   public void standaloneModal1O21812( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisNormID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisNormID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNormID_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtDisNormID_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisNormID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNormID_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
   }

   public void load1O21812( )
   {
      /* Using cursor T01O227 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A13213DisNormID});
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1812 = (short)(1) ;
         A13216DisNormDsc = T01O227_A13216DisNormDsc[0] ;
         n13216DisNormDsc = T01O227_n13216DisNormDsc[0] ;
         zm1O21812( -3) ;
      }
      pr_default.close(25);
      onLoadActions1O21812( ) ;
   }

   public void onLoadActions1O21812( )
   {
   }

   public void checkExtendedTable1O21812( )
   {
      nIsDirty_1812 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1O21812( ) ;
      /* Using cursor T01O24 */
      pr_default.execute(2, new Object[] {A396EmprCod, A13213DisNormID});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "DISNORMID_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Normativas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisNormID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13216DisNormDsc = T01O24_A13216DisNormDsc[0] ;
      n13216DisNormDsc = T01O24_n13216DisNormDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1O21812( )
   {
      pr_default.close(2);
   }

   public void enableDisable1O21812( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         String A13213DisNormID )
   {
      /* Using cursor T01O228 */
      pr_default.execute(26, new Object[] {A396EmprCod, A13213DisNormID});
      if ( (pr_default.getStatus(26) == 101) )
      {
         GXCCtl = "DISNORMID_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Normativas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisNormID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13216DisNormDsc = T01O228_A13216DisNormDsc[0] ;
      n13216DisNormDsc = T01O228_n13216DisNormDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13216DisNormDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(26) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(26);
   }

   public void getKey1O21812( )
   {
      /* Using cursor T01O229 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A13213DisNormID});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1812 = (short)(1) ;
      }
      else
      {
         RcdFound1812 = (short)(0) ;
      }
      pr_default.close(27);
   }

   public void getByPrimaryKey1O21812( )
   {
      /* Using cursor T01O23 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A13213DisNormID});
      if ( (pr_default.getStatus(1) != 101) && ( T01O23_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01O23_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1O21812( 3) ;
         RcdFound1812 = (short)(1) ;
         initializeNonKey1O21812( ) ;
         A13213DisNormID = T01O23_A13213DisNormID[0] ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z13213DisNormID = A13213DisNormID ;
         sMode1812 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1O21812( ) ;
         load1O21812( ) ;
         Gx_mode = sMode1812 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1812 = (short)(0) ;
         initializeNonKey1O21812( ) ;
         sMode1812 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1O21812( ) ;
         Gx_mode = sMode1812 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1O21812( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1O21812( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01O22 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A13213DisNormID});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISNOR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISNOR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1O21812( )
   {
      beforeValidate1O21812( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1O21812( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1O21812( 0) ;
         checkOptimisticConcurrency1O21812( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1O21812( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1O21812( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01O230 */
                  pr_default.execute(28, new Object[] {Integer.valueOf(A361DisCod), A396EmprCod, A13213DisNormID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISNOR");
                  if ( (pr_default.getStatus(28) == 1) )
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
            load1O21812( ) ;
         }
         endLevel1O21812( ) ;
      }
      closeExtendedTableCursors1O21812( ) ;
   }

   public void update1O21812( )
   {
      beforeValidate1O21812( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1O21812( ) ;
      }
      if ( ( nIsMod_1812 != 0 ) || ( nIsDirty_1812 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1O21812( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1O21812( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1O21812( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPDISNOR */
                     deferredUpdate1O21812( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int5[0] = A361DisCod ;
                        new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int5) ;
                        tnordis_impl.this.A396EmprCod = GXv_char4[0] ;
                        tnordis_impl.this.A361DisCod = GXv_int5[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1O21812( ) ;
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
            endLevel1O21812( ) ;
         }
      }
      closeExtendedTableCursors1O21812( ) ;
   }

   public void deferredUpdate1O21812( )
   {
   }

   public void delete1O21812( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1O21812( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1O21812( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1O21812( ) ;
         afterConfirm1O21812( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1O21812( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01O231 */
               pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A13213DisNormID});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISNOR");
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
      sMode1812 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1O21812( ) ;
      Gx_mode = sMode1812 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1O21812( )
   {
      standaloneModal1O21812( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01O232 */
         pr_default.execute(30, new Object[] {A396EmprCod, A13213DisNormID});
         A13216DisNormDsc = T01O232_A13216DisNormDsc[0] ;
         n13216DisNormDsc = T01O232_n13216DisNormDsc[0] ;
         pr_default.close(30);
      }
   }

   public void endLevel1O21812( )
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

   public void scanStart1O21812( )
   {
      /* Scan By routine */
      /* Using cursor T01O233 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound1812 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1812 = (short)(1) ;
         A13213DisNormID = T01O233_A13213DisNormID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1O21812( )
   {
      /* Scan next routine */
      pr_default.readNext(31);
      RcdFound1812 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1812 = (short)(1) ;
         A13213DisNormID = T01O233_A13213DisNormID[0] ;
      }
   }

   public void scanEnd1O21812( )
   {
      pr_default.close(31);
   }

   public void afterConfirm1O21812( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1O21812( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1O21812( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1O21812( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1O21812( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1O21812( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1O21812( )
   {
      edtDisNormID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNormID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNormID_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtDisNormDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNormDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNormDsc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void send_integrity_lvl_hashes1O21812( )
   {
   }

   public void send_integrity_lvl_hashes1O234( )
   {
   }

   public void subsflControlProps_401812( )
   {
      edtavnRcdDeleted_1812_Internalname = "vNRCDDELETED_1812_"+sGXsfl_40_idx ;
      edtDisNormID_Internalname = "DISNORMID_"+sGXsfl_40_idx ;
      edtDisNormDsc_Internalname = "DISNORMDSC_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_401812( )
   {
      edtavnRcdDeleted_1812_Internalname = "vNRCDDELETED_1812_"+sGXsfl_40_fel_idx ;
      edtDisNormID_Internalname = "DISNORMID_"+sGXsfl_40_fel_idx ;
      edtDisNormDsc_Internalname = "DISNORMDSC_"+sGXsfl_40_fel_idx ;
   }

   public void addRow1O21812( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401812( ) ;
      sendRow1O21812( ) ;
   }

   public void sendRow1O21812( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1812_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1812_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1812, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1812_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1812), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1812), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1812_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1812_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1812_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNormID_Internalname,GXutil.rtrim( A13213DisNormID),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisNormID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisNormID_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNormDsc_Internalname,GXutil.rtrim( A13216DisNormDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisNormDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisNormDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1O21812( ) ;
      GXCCtl = "Z13213DisNormID_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13213DisNormID));
      GXCCtl = "nRcdDeleted_1812_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1812, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1812_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1812, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1812_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1812, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1812_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1812_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISNORMID_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisNormID_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISNORMDSC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisNormDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1O21812( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401812( ) ;
      edtavnRcdDeleted_1812_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1812_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisNormID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISNORMID_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisNormDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISNORMDSC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1812_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1812_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1812");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1812_Internalname ;
         wbErr = true ;
         nRcdDeleted_1812 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1812 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1812_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A13213DisNormID = httpContext.cgiGet( edtDisNormID_Internalname) ;
      A13216DisNormDsc = httpContext.cgiGet( edtDisNormDsc_Internalname) ;
      n13216DisNormDsc = false ;
      GXCCtl = "Z13213DisNormID_" + sGXsfl_40_idx ;
      Z13213DisNormID = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1812_" + sGXsfl_40_idx ;
      nRcdDeleted_1812 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1812_" + sGXsfl_40_idx ;
      nRcdExists_1812 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1812_" + sGXsfl_40_idx ;
      nIsMod_1812 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDisNormID_Enabled = edtDisNormID_Enabled ;
   }

   public void confirmValues1O20( )
   {
      nGXsfl_40_idx = 0 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401812( ) ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401812( ) ;
         httpContext.changePostValue( "Z13213DisNormID_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z13213DisNormID_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13213DisNormID_"+sGXsfl_40_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tnordis", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"EmprCod","DisCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8886DisDest", GXutil.rtrim( Z8886DisDest));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nGXsfl_40_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV34Pgmname));
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
      return formatLink("app.tnordis", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"EmprCod","DisCod"})  ;
   }

   public String getPgmname( )
   {
      return "TNORDIS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Normas", "") ;
   }

   public void initializeNonKey1O234( )
   {
      A8886DisDest = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8886DisDest", A8886DisDest);
      Z8886DisDest = "" ;
   }

   public void initAll1O234( )
   {
      initializeNonKey1O234( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1O21812( )
   {
      A13216DisNormDsc = "" ;
      n13216DisNormDsc = false ;
   }

   public void initAll1O21812( )
   {
      A13213DisNormID = "" ;
      initializeNonKey1O21812( ) ;
   }

   public void standaloneModalInsert1O21812( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415103856", true, true);
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
      httpContext.AddJavascriptSource("tnordis.js", "?202682415103856", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1812( )
   {
      edtDisNormID_Enabled = defedtDisNormID_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNormID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNormID_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1812, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1812_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13213DisNormID));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisNormID_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13216DisNormDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisNormDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtDisCod_Internalname = "DISCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtDisDest_Internalname = "DISDEST" ;
      edtavnRcdDeleted_1812_Internalname = "vNRCDDELETED_1812" ;
      edtDisNormID_Internalname = "DISNORMID" ;
      edtDisNormDsc_Internalname = "DISNORMDSC" ;
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
      Form.setCaption( httpContext.getMessage( "Normas", "") );
      edtDisNormDsc_Jsonclick = "" ;
      edtDisNormID_Jsonclick = "" ;
      edtavnRcdDeleted_1812_Jsonclick = "" ;
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
      edtDisNormDsc_Enabled = 0 ;
      edtDisNormID_Enabled = 1 ;
      edtavnRcdDeleted_1812_Enabled = 1 ;
      edtDisDest_Jsonclick = "" ;
      edtDisDest_Backcolor = (int)(0xFFFFFF) ;
      edtDisDest_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Backcolor = (int)(0xFFFFFF) ;
      edtDisCod_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
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
      subsflControlProps_401812( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1O21812( ) ;
         standaloneModal1O21812( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1O21812( ) ;
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401812( ) ;
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
      /* Using cursor T01O234 */
      pr_default.execute(32, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01O234_A407EmprNom[0] ;
      n407EmprNom = T01O234_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(32);
      GX_FocusControl = edtDisDest_Internalname ;
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

   public void valid_Discod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A8886DisDest", GXutil.rtrim( A8886DisDest));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8886DisDest", GXutil.rtrim( Z8886DisDest));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Disnormid( )
   {
      n13216DisNormDsc = false ;
      /* Using cursor T01O232 */
      pr_default.execute(30, new Object[] {A396EmprCod, A13213DisNormID});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Normativas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISNORMID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisNormID_Internalname ;
      }
      A13216DisNormDsc = T01O232_A13216DisNormDsc[0] ;
      n13216DisNormDsc = T01O232_n13216DisNormDsc[0] ;
      pr_default.close(30);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13216DisNormDsc", GXutil.rtrim( A13216DisNormDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_DISCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A8886DisDest',fld:'DISDEST',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z361DisCod'},{av:'Z407EmprNom'},{av:'Z8886DisDest'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_DISNORMID","{handler:'valid_Disnormid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13213DisNormID',fld:'DISNORMID',pic:''},{av:'A13216DisNormDsc',fld:'DISNORMDSC',pic:''}]");
      setEventMetadata("VALID_DISNORMID",",oparms:[{av:'A13216DisNormDsc',fld:'DISNORMDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Disnormdsc',iparms:[]");
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
      pr_default.close(30);
      pr_default.close(32);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z8886DisDest = "" ;
      Z13213DisNormID = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A13213DisNormID = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A8886DisDest = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1812 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV34Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode34 = "" ;
      GXCCtl = "" ;
      A13216DisNormDsc = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      T01O27_A407EmprNom = new String[] {""} ;
      T01O27_n407EmprNom = new boolean[] {false} ;
      T01O28_A361DisCod = new int[1] ;
      T01O28_A407EmprNom = new String[] {""} ;
      T01O28_n407EmprNom = new boolean[] {false} ;
      T01O28_A8886DisDest = new String[] {""} ;
      T01O28_A396EmprCod = new String[] {""} ;
      T01O29_A396EmprCod = new String[] {""} ;
      T01O29_A361DisCod = new int[1] ;
      T01O26_A361DisCod = new int[1] ;
      T01O26_A8886DisDest = new String[] {""} ;
      T01O26_A396EmprCod = new String[] {""} ;
      T01O210_A396EmprCod = new String[] {""} ;
      T01O210_A361DisCod = new int[1] ;
      T01O211_A396EmprCod = new String[] {""} ;
      T01O211_A361DisCod = new int[1] ;
      T01O25_A361DisCod = new int[1] ;
      T01O25_A8886DisDest = new String[] {""} ;
      T01O25_A396EmprCod = new String[] {""} ;
      T01O215_A396EmprCod = new String[] {""} ;
      T01O215_A361DisCod = new int[1] ;
      T01O215_A13376DisTraID = new String[] {""} ;
      T01O216_A396EmprCod = new String[] {""} ;
      T01O216_A361DisCod = new int[1] ;
      T01O216_A13081DisDGLin = new byte[1] ;
      T01O216_A13082DisDGDibCl = new String[] {""} ;
      T01O216_A13083DisDGDibIn = new int[1] ;
      T01O216_A13084DisDGComb = new String[] {""} ;
      T01O216_A13085DisDGFondo = new String[] {""} ;
      T01O217_A396EmprCod = new String[] {""} ;
      T01O217_A361DisCod = new int[1] ;
      T01O217_A7068DisNotLin = new byte[1] ;
      T01O218_A396EmprCod = new String[] {""} ;
      T01O218_A361DisCod = new int[1] ;
      T01O218_A10197ProEspCod = new String[] {""} ;
      T01O219_A396EmprCod = new String[] {""} ;
      T01O219_A361DisCod = new int[1] ;
      T01O219_A4594AccCod = new short[1] ;
      T01O220_A396EmprCod = new String[] {""} ;
      T01O220_A361DisCod = new int[1] ;
      T01O220_A2524DisComLin = new byte[1] ;
      T01O220_A1056DisComCod = new String[] {""} ;
      T01O220_A1032FonCod = new String[] {""} ;
      T01O221_A396EmprCod = new String[] {""} ;
      T01O221_A361DisCod = new int[1] ;
      T01O221_A3398DisRefBarC = new int[1] ;
      T01O221_A3399DisRefBCRe = new byte[1] ;
      T01O221_A3400DisRefBCPa = new String[] {""} ;
      T01O221_A3607DisRefBPie = new String[] {""} ;
      T01O222_A396EmprCod = new String[] {""} ;
      T01O222_A361DisCod = new int[1] ;
      T01O222_A376DisObsLin = new byte[1] ;
      T01O223_A396EmprCod = new String[] {""} ;
      T01O223_A361DisCod = new int[1] ;
      T01O223_A758ProCod = new String[] {""} ;
      T01O224_A396EmprCod = new String[] {""} ;
      T01O224_A361DisCod = new int[1] ;
      T01O224_A833TipDefCod = new short[1] ;
      T01O225_A396EmprCod = new String[] {""} ;
      T01O225_A361DisCod = new int[1] ;
      T01O225_A44AlbRecCod = new int[1] ;
      T01O226_A396EmprCod = new String[] {""} ;
      T01O226_A361DisCod = new int[1] ;
      Z13216DisNormDsc = "" ;
      T01O227_A361DisCod = new int[1] ;
      T01O227_A13216DisNormDsc = new String[] {""} ;
      T01O227_n13216DisNormDsc = new boolean[] {false} ;
      T01O227_A396EmprCod = new String[] {""} ;
      T01O227_A13213DisNormID = new String[] {""} ;
      T01O24_A13216DisNormDsc = new String[] {""} ;
      T01O24_n13216DisNormDsc = new boolean[] {false} ;
      T01O228_A13216DisNormDsc = new String[] {""} ;
      T01O228_n13216DisNormDsc = new boolean[] {false} ;
      T01O229_A396EmprCod = new String[] {""} ;
      T01O229_A361DisCod = new int[1] ;
      T01O229_A13213DisNormID = new String[] {""} ;
      T01O23_A361DisCod = new int[1] ;
      T01O23_A396EmprCod = new String[] {""} ;
      T01O23_A13213DisNormID = new String[] {""} ;
      T01O22_A361DisCod = new int[1] ;
      T01O22_A396EmprCod = new String[] {""} ;
      T01O22_A13213DisNormID = new String[] {""} ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      T01O232_A13216DisNormDsc = new String[] {""} ;
      T01O232_n13216DisNormDsc = new boolean[] {false} ;
      T01O233_A396EmprCod = new String[] {""} ;
      T01O233_A361DisCod = new int[1] ;
      T01O233_A13213DisNormID = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01O234_A407EmprNom = new String[] {""} ;
      T01O234_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ8886DisDest = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tnordis__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tnordis__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tnordis__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tnordis__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tnordis__default(),
         new Object[] {
             new Object[] {
            T01O22_A361DisCod, T01O22_A396EmprCod, T01O22_A13213DisNormID
            }
            , new Object[] {
            T01O23_A361DisCod, T01O23_A396EmprCod, T01O23_A13213DisNormID
            }
            , new Object[] {
            T01O24_A13216DisNormDsc, T01O24_n13216DisNormDsc
            }
            , new Object[] {
            T01O25_A361DisCod, T01O25_A8886DisDest, T01O25_A396EmprCod
            }
            , new Object[] {
            T01O26_A361DisCod, T01O26_A8886DisDest, T01O26_A396EmprCod
            }
            , new Object[] {
            T01O27_A407EmprNom, T01O27_n407EmprNom
            }
            , new Object[] {
            T01O28_A361DisCod, T01O28_A407EmprNom, T01O28_n407EmprNom, T01O28_A8886DisDest, T01O28_A396EmprCod
            }
            , new Object[] {
            T01O29_A396EmprCod, T01O29_A361DisCod
            }
            , new Object[] {
            T01O210_A396EmprCod, T01O210_A361DisCod
            }
            , new Object[] {
            T01O211_A396EmprCod, T01O211_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01O215_A396EmprCod, T01O215_A361DisCod, T01O215_A13376DisTraID
            }
            , new Object[] {
            T01O216_A396EmprCod, T01O216_A361DisCod, T01O216_A13081DisDGLin, T01O216_A13082DisDGDibCl, T01O216_A13083DisDGDibIn, T01O216_A13084DisDGComb, T01O216_A13085DisDGFondo
            }
            , new Object[] {
            T01O217_A396EmprCod, T01O217_A361DisCod, T01O217_A7068DisNotLin
            }
            , new Object[] {
            T01O218_A396EmprCod, T01O218_A361DisCod, T01O218_A10197ProEspCod
            }
            , new Object[] {
            T01O219_A396EmprCod, T01O219_A361DisCod, T01O219_A4594AccCod
            }
            , new Object[] {
            T01O220_A396EmprCod, T01O220_A361DisCod, T01O220_A2524DisComLin, T01O220_A1056DisComCod, T01O220_A1032FonCod
            }
            , new Object[] {
            T01O221_A396EmprCod, T01O221_A361DisCod, T01O221_A3398DisRefBarC, T01O221_A3399DisRefBCRe, T01O221_A3400DisRefBCPa, T01O221_A3607DisRefBPie
            }
            , new Object[] {
            T01O222_A396EmprCod, T01O222_A361DisCod, T01O222_A376DisObsLin
            }
            , new Object[] {
            T01O223_A396EmprCod, T01O223_A361DisCod, T01O223_A758ProCod
            }
            , new Object[] {
            T01O224_A396EmprCod, T01O224_A361DisCod, T01O224_A833TipDefCod
            }
            , new Object[] {
            T01O225_A396EmprCod, T01O225_A361DisCod, T01O225_A44AlbRecCod
            }
            , new Object[] {
            T01O226_A396EmprCod, T01O226_A361DisCod
            }
            , new Object[] {
            T01O227_A361DisCod, T01O227_A13216DisNormDsc, T01O227_n13216DisNormDsc, T01O227_A396EmprCod, T01O227_A13213DisNormID
            }
            , new Object[] {
            T01O228_A13216DisNormDsc, T01O228_n13216DisNormDsc
            }
            , new Object[] {
            T01O229_A396EmprCod, T01O229_A361DisCod, T01O229_A13213DisNormID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01O232_A13216DisNormDsc, T01O232_n13216DisNormDsc
            }
            , new Object[] {
            T01O233_A396EmprCod, T01O233_A361DisCod, T01O233_A13213DisNormID
            }
            , new Object[] {
            T01O234_A407EmprNom, T01O234_n407EmprNom
            }
         }
      );
      Z361DisCod = 0 ;
      A361DisCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV34Pgmname = "TNORDIS" ;
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
   private short nRcdDeleted_1812 ;
   private short nRcdExists_1812 ;
   private short nIsMod_1812 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1812 ;
   private short RcdFound1812 ;
   private short nBlankRcdUsr1812 ;
   private short RcdFound34 ;
   private short nIsDirty_34 ;
   private short nIsDirty_1812 ;
   private int wcpOA361DisCod ;
   private int Z361DisCod ;
   private int nRC_GXsfl_40 ;
   private int nGXsfl_40_idx=1 ;
   private int A361DisCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtDisCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtDisDest_Enabled ;
   private int edtavnRcdDeleted_1812_Enabled ;
   private int edtDisNormID_Enabled ;
   private int edtDisNormDsc_Enabled ;
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
   private int GXv_int5[] ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtDisNormID_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtDisDest_Backcolor ;
   private int edtDisCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ361DisCod ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String Z8886DisDest ;
   private String Z13213DisNormID ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A13213DisNormID ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDisDest_Internalname ;
   private String sGXsfl_40_idx="0001" ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String A8886DisDest ;
   private String edtDisDest_Jsonclick ;
   private String sMode1812 ;
   private String edtavnRcdDeleted_1812_Internalname ;
   private String edtDisNormID_Internalname ;
   private String edtDisNormDsc_Internalname ;
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
   private String AV34Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode34 ;
   private String GXCCtl ;
   private String A13216DisNormDsc ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z13216DisNormDsc ;
   private String GXv_char4[] ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1812_Jsonclick ;
   private String edtDisNormID_Jsonclick ;
   private String edtDisNormDsc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ8886DisDest ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n13216DisNormDsc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01O27_A407EmprNom ;
   private boolean[] T01O27_n407EmprNom ;
   private int[] T01O28_A361DisCod ;
   private String[] T01O28_A407EmprNom ;
   private boolean[] T01O28_n407EmprNom ;
   private String[] T01O28_A8886DisDest ;
   private String[] T01O28_A396EmprCod ;
   private String[] T01O29_A396EmprCod ;
   private int[] T01O29_A361DisCod ;
   private int[] T01O26_A361DisCod ;
   private String[] T01O26_A8886DisDest ;
   private String[] T01O26_A396EmprCod ;
   private String[] T01O210_A396EmprCod ;
   private int[] T01O210_A361DisCod ;
   private String[] T01O211_A396EmprCod ;
   private int[] T01O211_A361DisCod ;
   private int[] T01O25_A361DisCod ;
   private String[] T01O25_A8886DisDest ;
   private String[] T01O25_A396EmprCod ;
   private String[] T01O215_A396EmprCod ;
   private int[] T01O215_A361DisCod ;
   private String[] T01O215_A13376DisTraID ;
   private String[] T01O216_A396EmprCod ;
   private int[] T01O216_A361DisCod ;
   private byte[] T01O216_A13081DisDGLin ;
   private String[] T01O216_A13082DisDGDibCl ;
   private int[] T01O216_A13083DisDGDibIn ;
   private String[] T01O216_A13084DisDGComb ;
   private String[] T01O216_A13085DisDGFondo ;
   private String[] T01O217_A396EmprCod ;
   private int[] T01O217_A361DisCod ;
   private byte[] T01O217_A7068DisNotLin ;
   private String[] T01O218_A396EmprCod ;
   private int[] T01O218_A361DisCod ;
   private String[] T01O218_A10197ProEspCod ;
   private String[] T01O219_A396EmprCod ;
   private int[] T01O219_A361DisCod ;
   private short[] T01O219_A4594AccCod ;
   private String[] T01O220_A396EmprCod ;
   private int[] T01O220_A361DisCod ;
   private byte[] T01O220_A2524DisComLin ;
   private String[] T01O220_A1056DisComCod ;
   private String[] T01O220_A1032FonCod ;
   private String[] T01O221_A396EmprCod ;
   private int[] T01O221_A361DisCod ;
   private int[] T01O221_A3398DisRefBarC ;
   private byte[] T01O221_A3399DisRefBCRe ;
   private String[] T01O221_A3400DisRefBCPa ;
   private String[] T01O221_A3607DisRefBPie ;
   private String[] T01O222_A396EmprCod ;
   private int[] T01O222_A361DisCod ;
   private byte[] T01O222_A376DisObsLin ;
   private String[] T01O223_A396EmprCod ;
   private int[] T01O223_A361DisCod ;
   private String[] T01O223_A758ProCod ;
   private String[] T01O224_A396EmprCod ;
   private int[] T01O224_A361DisCod ;
   private short[] T01O224_A833TipDefCod ;
   private String[] T01O225_A396EmprCod ;
   private int[] T01O225_A361DisCod ;
   private int[] T01O225_A44AlbRecCod ;
   private String[] T01O226_A396EmprCod ;
   private int[] T01O226_A361DisCod ;
   private int[] T01O227_A361DisCod ;
   private String[] T01O227_A13216DisNormDsc ;
   private boolean[] T01O227_n13216DisNormDsc ;
   private String[] T01O227_A396EmprCod ;
   private String[] T01O227_A13213DisNormID ;
   private String[] T01O24_A13216DisNormDsc ;
   private boolean[] T01O24_n13216DisNormDsc ;
   private String[] T01O228_A13216DisNormDsc ;
   private boolean[] T01O228_n13216DisNormDsc ;
   private String[] T01O229_A396EmprCod ;
   private int[] T01O229_A361DisCod ;
   private String[] T01O229_A13213DisNormID ;
   private int[] T01O23_A361DisCod ;
   private String[] T01O23_A396EmprCod ;
   private String[] T01O23_A13213DisNormID ;
   private int[] T01O22_A361DisCod ;
   private String[] T01O22_A396EmprCod ;
   private String[] T01O22_A13213DisNormID ;
   private String[] T01O232_A13216DisNormDsc ;
   private boolean[] T01O232_n13216DisNormDsc ;
   private String[] T01O233_A396EmprCod ;
   private int[] T01O233_A361DisCod ;
   private String[] T01O233_A13213DisNormID ;
   private String[] T01O234_A407EmprNom ;
   private boolean[] T01O234_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tnordis__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tnordis__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tnordis__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tnordis__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tnordis__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01O22", "SELECT DisCod, EmprCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisCod = ? AND DisNormID = ?  FOR UPDATE OF DisCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O23", "SELECT DisCod, EmprCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisCod = ? AND DisNormID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O24", "SELECT NormaDsc AS DisNormDsc FROM TXPNORMAS WHERE EmprCod = ? AND NormaID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O25", "SELECT DisCod, DisDest, EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ?  FOR UPDATE OF DisDest NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O26", "SELECT DisCod, DisDest, EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O27", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O28", "SELECT /*+ FIRST_ROWS(1) */ TM1.DisCod, T2.EmprNom, TM1.DisDest, TM1.EmprCod FROM (TXPDISPOS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.DisCod = ? ORDER BY TM1.EmprCod, TM1.DisCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O29", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O210", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O211", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod DESC, DisCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01O212", "INSERT INTO TXPDISPOS(DisCod, DisDest, EmprCod, DisDes, DisArtCod, DisNumPie, DisNumUni, DisUniMed, DisArtPes, PriCod, DisCliNum, DisFecCli, DisFec, DisFecEnt, DisColNom, DisColNum, DisTipCol, DisArtDsc, DisEnt, DisObsULin, DisArtMat, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtOpe, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtPu1, DisArtUr2, DisArtPu2, DisArtUr3, DisArtPu3, DisArtAnh, DisEst, DisPreKgm, DisPreMtr, DisPieLan, DisKgmLan, DisMtrLan, DisNMtr, DisNMez, DisNumTen, MaqCodDis, PartCod, CliCod, TipConCod, DisNomCli, DisNumCli, DisEncCom, DisEncAnh, DisGraCru, DisArtAn1, DisArtAcb, DisArtAc2, DisLoc, DisPart, DisGraAca, DisRdoN, DisRdoA, DisRes, DisTipDis, DisNumBas, DisCliDes, DisManCod, DisOpeAnt, DisCodTex, DisNumTex1, DisNumTex2, DisNumLot, DisKgsLot, DisMtrLot, DisPla, DisPle2, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisFac, DisManCod1, DisManCod2, DisNumTon, DisFecLan, RetCod, DisArtMer, EmpesCod, DibCli, DibInt, DisNumCol, DisObs, DisComULin, DisEnv, DisTin, DisNPzas, DisNPzasL, DisUsrCod, DisPelAnh, DisCruMts, DisCruKgs, DisCruEnr, DisLotMts, DisLotKgs, DisAcaBak, DisAcaAnh, DisAcaMar, DisMdlCod, DisTam, DisHorEnt, DisHorReg, DisDishCod, DisNroCor, DisEncCli, DibColDib, DisTipEst, DisGraCob, DisCom, DisEstTip, DisAcc, DisTipCor, DisObsGrm, DisObsAnc, DisAntp, DisAntpT, DisVolMaq, DisRbMaq, DisDto, DisFacSep, DisFacGra, DisOrdSep, DisOrdGra, DisDesCol, DisGraTam, DisRec, DisMaqEst, DisExp, DisFEnt, DisFchT, DisItem1, DisItem2, DisItem3, DisItem4, DisItem5, DisItem6, Cod_Idtx, DisFecPed, DisLotPza, DisLotMaq, DisAcaFor, DibColCol, DisDibCoCN, DibColColN, DisDibCoDN, DisUltNot, DisParCod, DisParReo, DisParPar, DisMemo1, DisMemo2, MarcaId, DisOrdComp, DisCnoEncO, Nxt_modelo, CpteId, Nxt_statio, DesaID, DptoID, Nxt_artcli, RevenID, DisPriorid, DisTpEstam, DisProdID, DisOEKOTEX, DisLineaID, DisCanalID, DisLinPrd, DisDGUltli, DisRGB, DisRdto4, DisTallUlt, DisIdtx2, DisArtDsc2, DisPrePz) VALUES(?, ?, ?, ' ', ' ', 0, 0, ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0)", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T01O213", "UPDATE TXPDISPOS SET DisDest=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T01O214", "DELETE FROM TXPDISPOS  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new ForEachCursor("T01O215", "SELECT * FROM (SELECT EmprCod, DisCod, DisTraID FROM TXPDISATI WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O216", "SELECT * FROM (SELECT EmprCod, DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo FROM TXPDIGCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O217", "SELECT * FROM (SELECT EmprCod, DisCod, DisNotLin FROM TXPDISNOT WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O218", "SELECT * FROM (SELECT EmprCod, DisCod, ProEspCod FROM TXPDisPE WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O219", "SELECT * FROM (SELECT EmprCod, DisCod, AccCod FROM TXPDISACC WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O220", "SELECT * FROM (SELECT EmprCod, DisCod, DisComLin, DisComCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O221", "SELECT * FROM (SELECT EmprCod, DisCod, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie FROM TXPDISREF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O222", "SELECT * FROM (SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O223", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O224", "SELECT * FROM (SELECT EmprCod, DisCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O225", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O226", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O227", "SELECT T1.DisCod, T2.NormaDsc AS DisNormDsc, T1.EmprCod, T1.DisNormID AS DisNormID FROM (TXPDISNOR T1 INNER JOIN TXPNORMAS T2 ON T2.EmprCod = T1.EmprCod AND T2.NormaID = T1.DisNormID) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.DisNormID = ? ORDER BY T1.EmprCod, T1.DisCod, T1.DisNormID ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O228", "SELECT NormaDsc AS DisNormDsc FROM TXPNORMAS WHERE EmprCod = ? AND NormaID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O229", "SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisCod = ? AND DisNormID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01O230", "INSERT INTO TXPDISNOR(DisCod, EmprCod, DisNormID, DisNormSt, DisNormNC) VALUES(?, ?, ?, ' ', ' ')", GX_NOMASK, "TXPDISNOR")
         ,new UpdateCursor("T01O231", "DELETE FROM TXPDISNOR  WHERE EmprCod = ? AND DisCod = ? AND DisNormID = ?", GX_NOMASK, "TXPDISNOR")
         ,new ForEachCursor("T01O232", "SELECT NormaDsc AS DisNormDsc FROM TXPNORMAS WHERE EmprCod = ? AND NormaID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O233", "SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisNormID ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O234", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 5);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 25 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
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
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 32 :
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
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 30);
               stmt.setString(3, (String)parms[2], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 28 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
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
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

