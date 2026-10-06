package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thishra_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "AGRUPACIONES ACABADOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtHreBarCod_Internalname ;
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
      nRC_GXsfl_55 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_55"))) ;
      nGXsfl_55_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_55_idx"))) ;
      sGXsfl_55_idx = httpContext.GetPar( "sGXsfl_55_idx") ;
      edtHreAcCod_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcCod_Internalname, "Title", edtHreAcCod_Title, !bGXsfl_55_Refreshing);
      edtHreAcReo_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcReo_Internalname, "Title", edtHreAcReo_Title, !bGXsfl_55_Refreshing);
      edtHreAcPar_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcPar_Internalname, "Title", edtHreAcPar_Title, !bGXsfl_55_Refreshing);
      edtHreAcCli_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcCli_Internalname, "Title", edtHreAcCli_Title, !bGXsfl_55_Refreshing);
      edtHreAcSer_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcSer_Internalname, "Title", edtHreAcSer_Title, !bGXsfl_55_Refreshing);
      edtHreAcCol_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcCol_Internalname, "Title", edtHreAcCol_Title, !bGXsfl_55_Refreshing);
      edtHreAcNumC_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcNumC_Internalname, "Title", edtHreAcNumC_Title, !bGXsfl_55_Refreshing);
      edtHreAcKgm_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcKgm_Internalname, "Title", edtHreAcKgm_Title, !bGXsfl_55_Refreshing);
      edtHreAcMtr_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcMtr_Internalname, "Title", edtHreAcMtr_Title, !bGXsfl_55_Refreshing);
      edtHreAcPie_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcPie_Internalname, "Title", edtHreAcPie_Title, !bGXsfl_55_Refreshing);
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

   public thishra_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thishra_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thishra_impl.class ));
   }

   public thishra_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISHRA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISHRA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISHRA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISHRA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THISHRA.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISHRA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISHRA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "HreBarCod", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISHRA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISHRA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado His.Receta", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISHRA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarReo_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISHRA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Hist.Receta", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISHRA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarPar_Internalname, GXutil.rtrim( A4494HreBarPar), GXutil.rtrim( localUtil.format( A4494HreBarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarPar_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISHRA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Num.Cierres receta Hist.Receta", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISHRA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreNumCie_Internalname, GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreNumCie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreNumCie_Jsonclick, 0, "", "", "", "", "", 1, edtHreNumCie_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISHRA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISHRA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISHRA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISHRA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Maquina Hdr. Hist.Receta", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISHRA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreMaqHdr_Internalname, GXutil.rtrim( A4496HreMaqHdr), GXutil.rtrim( localUtil.format( A4496HreMaqHdr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreMaqHdr_Jsonclick, 0, "", "", "", "", "", 1, edtHreMaqHdr_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISHRA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol55( ) ;
      nGXsfl_55_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1327 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1327 = (short)(1) ;
            scanStart1611327( ) ;
            while ( RcdFound1327 != 0 )
            {
               init_level_properties1327( ) ;
               getByPrimaryKey1611327( ) ;
               addRow1611327( ) ;
               scanNext1611327( ) ;
            }
            scanEnd1611327( ) ;
            nBlankRcdCount1327 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1611327( ) ;
         standaloneModal1611327( ) ;
         sMode1327 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow1611327( ) ;
            edtavnRcdDeleted_1327_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1327_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1327_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1327_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHreAcCod_Title = httpContext.cgiGet( "HREACCOD_"+sGXsfl_55_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAcCod_Internalname, "Title", edtHreAcCod_Title, !bGXsfl_55_Refreshing);
            edtHreAcCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACCOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAcCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHreAcReo_Title = httpContext.cgiGet( "HREACREO_"+sGXsfl_55_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAcReo_Internalname, "Title", edtHreAcReo_Title, !bGXsfl_55_Refreshing);
            edtHreAcReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACREO_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAcReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcReo_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHreAcPar_Title = httpContext.cgiGet( "HREACPAR_"+sGXsfl_55_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAcPar_Internalname, "Title", edtHreAcPar_Title, !bGXsfl_55_Refreshing);
            edtHreAcPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACPAR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAcPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcPar_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHreAcKgm_Title = httpContext.cgiGet( "HREACKGM_"+sGXsfl_55_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAcKgm_Internalname, "Title", edtHreAcKgm_Title, !bGXsfl_55_Refreshing);
            edtHreAcKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACKGM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAcKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcKgm_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHreAcMtr_Title = httpContext.cgiGet( "HREACMTR_"+sGXsfl_55_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAcMtr_Internalname, "Title", edtHreAcMtr_Title, !bGXsfl_55_Refreshing);
            edtHreAcMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACMTR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAcMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcMtr_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHreAcPie_Title = httpContext.cgiGet( "HREACPIE_"+sGXsfl_55_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAcPie_Internalname, "Title", edtHreAcPie_Title, !bGXsfl_55_Refreshing);
            edtHreAcPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACPIE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAcPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcPie_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHreAcCli_Title = httpContext.cgiGet( "HREACCLI_"+sGXsfl_55_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAcCli_Internalname, "Title", edtHreAcCli_Title, !bGXsfl_55_Refreshing);
            edtHreAcCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACCLI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAcCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcCli_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHreAcSer_Title = httpContext.cgiGet( "HREACSER_"+sGXsfl_55_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAcSer_Internalname, "Title", edtHreAcSer_Title, !bGXsfl_55_Refreshing);
            edtHreAcSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACSER_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAcSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcSer_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHreAcDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACDSC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAcDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcDsc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHreAcCol_Title = httpContext.cgiGet( "HREACCOL_"+sGXsfl_55_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAcCol_Internalname, "Title", edtHreAcCol_Title, !bGXsfl_55_Refreshing);
            edtHreAcCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACCOL_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAcCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcCol_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtHreAcNumC_Title = httpContext.cgiGet( "HREACNUMC_"+sGXsfl_55_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAcNumC_Internalname, "Title", edtHreAcNumC_Title, !bGXsfl_55_Refreshing);
            edtHreAcNumC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACNUMC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAcNumC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcNumC_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_1327 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1611327( ) ;
            }
            sendRow1611327( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode1327 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1327 = (short)(5) ;
         nRcdExists_1327 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1611327( ) ;
            while ( RcdFound1327 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_551327( ) ;
               init_level_properties1327( ) ;
               standaloneNotModal1611327( ) ;
               getByPrimaryKey1611327( ) ;
               standaloneModal1611327( ) ;
               addRow1611327( ) ;
               scanNext1611327( ) ;
            }
            scanEnd1611327( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1327 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_551327( ) ;
      initAll1611327( ) ;
      init_level_properties1327( ) ;
      nRcdExists_1327 = (short)(0) ;
      nIsMod_1327 = (short)(0) ;
      nRcdDeleted_1327 = (short)(0) ;
      nBlankRcdCount1327 = (short)(nBlankRcdUsr1327+nBlankRcdCount1327) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1327 > 0 )
      {
         standaloneNotModal1611327( ) ;
         standaloneModal1611327( ) ;
         addRow1611327( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtHreAcCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1327 = (short)(nBlankRcdCount1327-1) ;
      }
      Gx_mode = sMode1327 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISHRA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISHRA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISHRA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISHRA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THISHRA.htm");
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
      e111612 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z4492HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4492HreBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4493HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4493HreBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4494HreBarPar = httpContext.cgiGet( "Z4494HreBarPar") ;
            Z4495HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4495HreNumCie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4496HreMaqHdr = httpContext.cgiGet( "Z4496HreMaqHdr") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREBARCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4492HreBarCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            }
            else
            {
               A4492HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHreBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREBARREO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreBarReo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4493HreBarReo = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            }
            else
            {
               A4493HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            }
            A4494HreBarPar = httpContext.cgiGet( edtHreBarPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreNumCie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreNumCie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRENUMCIE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreNumCie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4495HreNumCie = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            }
            else
            {
               A4495HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreNumCie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            }
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A4496HreMaqHdr = httpContext.cgiGet( edtHreMaqHdr_Internalname) ;
            n4496HreMaqHdr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4496HreMaqHdr", A4496HreMaqHdr);
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
               A4492HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
               A4493HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
               A4494HreBarPar = httpContext.GetPar( "HreBarPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
               A4495HreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumCie"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
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
                        e111612 ();
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
            initAll161675( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1327_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1327_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      disableAttributes161675( ) ;
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

   public void confirm_1610( )
   {
      beforeValidate161675( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls161675( ) ;
         }
         else
         {
            checkExtendedTable161675( ) ;
            if ( AnyError == 0 )
            {
               zm161675( 8) ;
            }
            closeExtendedTableCursors161675( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode675 = Gx_mode ;
         confirm_1611327( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode675 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode675 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1610( ) ;
      }
   }

   public void confirm_1611327( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1611327( ) ;
         if ( ( nRcdExists_1327 != 0 ) || ( nIsMod_1327 != 0 ) )
         {
            getKey1611327( ) ;
            if ( ( nRcdExists_1327 == 0 ) && ( nRcdDeleted_1327 == 0 ) )
            {
               if ( RcdFound1327 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1611327( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1611327( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1611327( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "HREACCOD_" + sGXsfl_55_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtHreAcCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1327 != 0 )
               {
                  if ( nRcdDeleted_1327 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1611327( ) ;
                     load1611327( ) ;
                     beforeValidate1611327( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1611327( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1327 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1611327( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1611327( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1611327( ) ;
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
                  if ( nRcdDeleted_1327 == 0 )
                  {
                     GXCCtl = "HREACCOD_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHreAcCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1327_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1327, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreAcCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9985HreAcCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreAcReo_Internalname, GXutil.ltrim( localUtil.ntoc( A9986HreAcReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreAcPar_Internalname, GXutil.rtrim( A9987HreAcPar)) ;
         httpContext.changePostValue( edtHreAcKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A9988HreAcKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreAcMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A9989HreAcMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreAcPie_Internalname, GXutil.ltrim( localUtil.ntoc( A9990HreAcPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreAcCli_Internalname, GXutil.ltrim( localUtil.ntoc( A9991HreAcCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreAcSer_Internalname, GXutil.rtrim( A9992HreAcSer)) ;
         httpContext.changePostValue( edtHreAcDsc_Internalname, GXutil.rtrim( A9993HreAcDsc)) ;
         httpContext.changePostValue( edtHreAcCol_Internalname, GXutil.rtrim( A9994HreAcCol)) ;
         httpContext.changePostValue( edtHreAcNumC_Internalname, GXutil.ltrim( localUtil.ntoc( A9995HreAcNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9985HreAcCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9985HreAcCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9986HreAcReo_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9986HreAcReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9987HreAcPar_"+sGXsfl_55_idx, GXutil.rtrim( Z9987HreAcPar)) ;
         httpContext.changePostValue( "ZT_"+"Z9988HreAcKgm_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9988HreAcKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9989HreAcMtr_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9989HreAcMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9990HreAcPie_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9990HreAcPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9991HreAcCli_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9991HreAcCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9992HreAcSer_"+sGXsfl_55_idx, GXutil.rtrim( Z9992HreAcSer)) ;
         httpContext.changePostValue( "ZT_"+"Z9993HreAcDsc_"+sGXsfl_55_idx, GXutil.rtrim( Z9993HreAcDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z9994HreAcCol_"+sGXsfl_55_idx, GXutil.rtrim( Z9994HreAcCol)) ;
         httpContext.changePostValue( "ZT_"+"Z9995HreAcNumC_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9995HreAcNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1327_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1327, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1327_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1327, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1327_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1327, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1327 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1327_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1327_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACCOD_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcCod_Title)) ;
            httpContext.changePostValue( "HREACCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACREO_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcReo_Title)) ;
            httpContext.changePostValue( "HREACREO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACPAR_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcPar_Title)) ;
            httpContext.changePostValue( "HREACPAR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACKGM_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcKgm_Title)) ;
            httpContext.changePostValue( "HREACKGM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACMTR_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcMtr_Title)) ;
            httpContext.changePostValue( "HREACMTR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACPIE_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcPie_Title)) ;
            httpContext.changePostValue( "HREACPIE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACCLI_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcCli_Title)) ;
            httpContext.changePostValue( "HREACCLI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACSER_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcSer_Title)) ;
            httpContext.changePostValue( "HREACSER_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACDSC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACCOL_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcCol_Title)) ;
            httpContext.changePostValue( "HREACCOL_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACNUMC_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcNumC_Title)) ;
            httpContext.changePostValue( "HREACNUMC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcNumC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1610( )
   {
   }

   public void e111612( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV20Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      thishra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit0", AV20Lit0);
      GXt_char1 = AV36LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      thishra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV36LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36LitFe", AV36LitFe);
      GXt_char1 = AV21Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1093_", ""), (byte)(99), GXv_char2) ;
      thishra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit1", AV21Lit1);
      GXt_char1 = AV22Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN273_", ""), (byte)(99), GXv_char2) ;
      thishra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit2", AV22Lit2);
      GXt_char1 = AV23Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN506_", ""), (byte)(99), GXv_char2) ;
      thishra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit3", AV23Lit3);
      GXt_char1 = AV24Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN438_", ""), (byte)(99), GXv_char2) ;
      thishra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit4", AV24Lit4);
      GXt_char1 = AV25Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN116_", ""), (byte)(99), GXv_char2) ;
      thishra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit5", AV25Lit5);
      AV26Lit6 = httpContext.getMessage( "Num.Cierre", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lit6", AV26Lit6);
      GXt_char1 = AV27Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char2) ;
      thishra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Lit7", AV27Lit7);
      GXt_char1 = AV30Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1147_", ""), (byte)(99), GXv_char2) ;
      thishra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV30Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Lit10", AV30Lit10);
      GXt_char1 = AV37Lit11 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      thishra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV37Lit11 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Lit11", AV37Lit11);
      GXt_char1 = AV38Lit12 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
      thishra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV38Lit12 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Lit12", AV38Lit12);
      GXt_char1 = AV39Lit13 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
      thishra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV39Lit13 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Lit13", AV39Lit13);
      GXt_char1 = AV40Lit14 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN244_", ""), (byte)(99), GXv_char2) ;
      thishra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV40Lit14 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Lit14", AV40Lit14);
      GXt_char1 = AV41Lit15 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
      thishra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV41Lit15 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Lit15", AV41Lit15);
      GXt_char1 = AV42Lit16 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN146_", ""), (byte)(99), GXv_char2) ;
      thishra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV42Lit16 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Lit16", AV42Lit16);
      GXt_char1 = AV43Lit17 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1059_", ""), (byte)(99), GXv_char2) ;
      thishra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV43Lit17 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Lit17", AV43Lit17);
      GXt_char1 = AV44Lit18 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1162_", ""), (byte)(99), GXv_char2) ;
      thishra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV44Lit18 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Lit18", AV44Lit18);
      GXt_char1 = AV31msg0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG245_", ""), (byte)(99), GXv_char2) ;
      thishra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31msg0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31msg0", AV31msg0);
      GXt_char1 = AV32msg1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG232_", ""), (byte)(99), GXv_char2) ;
      thishra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32msg1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32msg1", AV32msg1);
      GXt_char1 = AV33msg2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG229_", ""), (byte)(99), GXv_char2) ;
      thishra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV33msg2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33msg2", AV33msg2);
      GXt_char1 = AV34msg3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG088_", ""), (byte)(99), GXv_char2) ;
      thishra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV34msg3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34msg3", AV34msg3);
      GXt_char1 = AV35msg4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG245_", ""), (byte)(99), GXv_char2) ;
      thishra_impl.this.GXt_char1 = GXv_char2[0] ;
      AV35msg4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35msg4", AV35msg4);
      AV19Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Station", AV19Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char2, GXv_char3, GXv_char4) ;
      thishra_impl.this.A396EmprCod = GXv_char2[0] ;
      thishra_impl.this.AV16EmprNom = GXv_char3[0] ;
      thishra_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      edtHreAcCod_Title = AV27Lit7 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcCod_Internalname, "Title", edtHreAcCod_Title, !bGXsfl_55_Refreshing);
      edtHreAcReo_Title = httpContext.getMessage( "R", "") ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcReo_Internalname, "Title", edtHreAcReo_Title, !bGXsfl_55_Refreshing);
      edtHreAcPar_Title = httpContext.getMessage( "P", "") ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcPar_Internalname, "Title", edtHreAcPar_Title, !bGXsfl_55_Refreshing);
      edtHreAcCli_Title = AV37Lit11 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcCli_Internalname, "Title", edtHreAcCli_Title, !bGXsfl_55_Refreshing);
      edtHreAcSer_Title = AV38Lit12 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcSer_Internalname, "Title", edtHreAcSer_Title, !bGXsfl_55_Refreshing);
      edtHreAcCol_Title = AV39Lit13 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcCol_Internalname, "Title", edtHreAcCol_Title, !bGXsfl_55_Refreshing);
      edtHreAcNumC_Title = AV40Lit14 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcNumC_Internalname, "Title", edtHreAcNumC_Title, !bGXsfl_55_Refreshing);
      edtHreAcKgm_Title = AV41Lit15 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcKgm_Internalname, "Title", edtHreAcKgm_Title, !bGXsfl_55_Refreshing);
      edtHreAcMtr_Title = AV42Lit16 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcMtr_Internalname, "Title", edtHreAcMtr_Title, !bGXsfl_55_Refreshing);
      edtHreAcPie_Title = AV43Lit17 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcPie_Internalname, "Title", edtHreAcPie_Title, !bGXsfl_55_Refreshing);
   }

   public void zm161675( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4496HreMaqHdr = T01615_A4496HreMaqHdr[0] ;
         }
         else
         {
            Z4496HreMaqHdr = A4496HreMaqHdr ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z4496HreMaqHdr = A4496HreMaqHdr ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T01616 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01616_A407EmprNom[0] ;
      n407EmprNom = T01616_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  || isUpd( )  || isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR. No se permite modificar", ""), 1, "");
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         if ( 1 < 0 )
         {
            AV17UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         }
      }
   }

   public void load161675( )
   {
      /* Using cursor T01617 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound675 = (short)(1) ;
         A407EmprNom = T01617_A407EmprNom[0] ;
         n407EmprNom = T01617_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4496HreMaqHdr = T01617_A4496HreMaqHdr[0] ;
         n4496HreMaqHdr = T01617_n4496HreMaqHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4496HreMaqHdr", A4496HreMaqHdr);
         zm161675( -7) ;
      }
      pr_default.close(5);
      onLoadActions161675( ) ;
   }

   public void onLoadActions161675( )
   {
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
   }

   public void checkExtendedTable161675( )
   {
      nIsDirty_675 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
   }

   public void closeExtendedTableCursors161675( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey161675( )
   {
      /* Using cursor T01618 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound675 = (short)(1) ;
      }
      else
      {
         RcdFound675 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01615 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01615_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm161675( 7) ;
         RcdFound675 = (short)(1) ;
         A4492HreBarCod = T01615_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T01615_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T01615_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T01615_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         A4496HreMaqHdr = T01615_A4496HreMaqHdr[0] ;
         n4496HreMaqHdr = T01615_n4496HreMaqHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4496HreMaqHdr", A4496HreMaqHdr);
         Z396EmprCod = A396EmprCod ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         sMode675 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load161675( ) ;
         if ( AnyError == 1 )
         {
            RcdFound675 = (short)(0) ;
            initializeNonKey161675( ) ;
         }
         Gx_mode = sMode675 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound675 = (short)(0) ;
         initializeNonKey161675( ) ;
         sMode675 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode675 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey161675( ) ;
      if ( RcdFound675 == 0 )
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
      RcdFound675 = (short)(0) ;
      /* Using cursor T01619 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A4492HreBarCod), Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A4494HreBarPar, A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4495HreNumCie), A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T01619_A4492HreBarCod[0] < A4492HreBarCod ) || ( T01619_A4492HreBarCod[0] == A4492HreBarCod ) && ( T01619_A4493HreBarReo[0] < A4493HreBarReo ) || ( T01619_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01619_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01619_A4494HreBarPar[0], A4494HreBarPar) < 0 ) || ( GXutil.strcmp(T01619_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01619_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01619_A4492HreBarCod[0] == A4492HreBarCod ) && ( T01619_A4495HreNumCie[0] < A4495HreNumCie ) ) && ( GXutil.strcmp(T01619_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T01619_A4492HreBarCod[0] > A4492HreBarCod ) || ( T01619_A4492HreBarCod[0] == A4492HreBarCod ) && ( T01619_A4493HreBarReo[0] > A4493HreBarReo ) || ( T01619_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01619_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T01619_A4494HreBarPar[0], A4494HreBarPar) > 0 ) || ( GXutil.strcmp(T01619_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01619_A4493HreBarReo[0] == A4493HreBarReo ) && ( T01619_A4492HreBarCod[0] == A4492HreBarCod ) && ( T01619_A4495HreNumCie[0] > A4495HreNumCie ) ) && ( GXutil.strcmp(T01619_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A4492HreBarCod = T01619_A4492HreBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = T01619_A4493HreBarReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = T01619_A4494HreBarPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = T01619_A4495HreNumCie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            RcdFound675 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound675 = (short)(0) ;
      /* Using cursor T016110 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A4492HreBarCod), Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A4494HreBarPar, A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4495HreNumCie), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T016110_A4492HreBarCod[0] > A4492HreBarCod ) || ( T016110_A4492HreBarCod[0] == A4492HreBarCod ) && ( T016110_A4493HreBarReo[0] > A4493HreBarReo ) || ( T016110_A4493HreBarReo[0] == A4493HreBarReo ) && ( T016110_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T016110_A4494HreBarPar[0], A4494HreBarPar) > 0 ) || ( GXutil.strcmp(T016110_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T016110_A4493HreBarReo[0] == A4493HreBarReo ) && ( T016110_A4492HreBarCod[0] == A4492HreBarCod ) && ( T016110_A4495HreNumCie[0] > A4495HreNumCie ) ) && ( GXutil.strcmp(T016110_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T016110_A4492HreBarCod[0] < A4492HreBarCod ) || ( T016110_A4492HreBarCod[0] == A4492HreBarCod ) && ( T016110_A4493HreBarReo[0] < A4493HreBarReo ) || ( T016110_A4493HreBarReo[0] == A4493HreBarReo ) && ( T016110_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T016110_A4494HreBarPar[0], A4494HreBarPar) < 0 ) || ( GXutil.strcmp(T016110_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T016110_A4493HreBarReo[0] == A4493HreBarReo ) && ( T016110_A4492HreBarCod[0] == A4492HreBarCod ) && ( T016110_A4495HreNumCie[0] < A4495HreNumCie ) ) && ( GXutil.strcmp(T016110_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A4492HreBarCod = T016110_A4492HreBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = T016110_A4493HreBarReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = T016110_A4494HreBarPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = T016110_A4495HreNumCie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            RcdFound675 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey161675( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtHreBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert161675( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound675 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) )
            {
               A4492HreBarCod = Z4492HreBarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
               A4493HreBarReo = Z4493HreBarReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
               A4494HreBarPar = Z4494HreBarPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
               A4495HreNumCie = Z4495HreNumCie ;
               httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtHreBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update161675( ) ;
               GX_FocusControl = edtHreBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtHreBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert161675( ) ;
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
                  GX_FocusControl = edtHreBarCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert161675( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) )
      {
         A4492HreBarCod = Z4492HreBarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = Z4493HreBarReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = Z4494HreBarPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = Z4495HreNumCie ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtHreBarCod_Internalname ;
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
      getKey161675( ) ;
      if ( RcdFound675 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) )
         {
            A4492HreBarCod = Z4492HreBarCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = Z4493HreBarReo ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = Z4494HreBarPar ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = Z4495HreNumCie ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thishra");
      GX_FocusControl = edtHreMaqHdr_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1610( ) ;
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
      if ( RcdFound675 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtHreMaqHdr_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart161675( ) ;
      if ( RcdFound675 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHreMaqHdr_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd161675( ) ;
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
      if ( RcdFound675 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHreMaqHdr_Internalname ;
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
      if ( RcdFound675 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHreMaqHdr_Internalname ;
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
      scanStart161675( ) ;
      if ( RcdFound675 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound675 != 0 )
         {
            scanNext161675( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHreMaqHdr_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd161675( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency161675( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01614 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISREH"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z4496HreMaqHdr, T01614_A4496HreMaqHdr[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4496HreMaqHdr, T01614_A4496HreMaqHdr[0]) != 0 )
            {
               GXutil.writeLogln("thishra:[seudo value changed for attri]"+"HreMaqHdr");
               GXutil.writeLogRaw("Old: ",Z4496HreMaqHdr);
               GXutil.writeLogRaw("Current: ",T01614_A4496HreMaqHdr[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHISREH"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert161675( )
   {
      beforeValidate161675( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable161675( ) ;
      }
      if ( AnyError == 0 )
      {
         zm161675( 0) ;
         checkOptimisticConcurrency161675( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm161675( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert161675( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016111 */
                  pr_default.execute(9, new Object[] {Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Boolean.valueOf(n4496HreMaqHdr), A4496HreMaqHdr, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREH");
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
                        processLevel161675( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1610( ) ;
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
            load161675( ) ;
         }
         endLevel161675( ) ;
      }
      closeExtendedTableCursors161675( ) ;
   }

   public void update161675( )
   {
      beforeValidate161675( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable161675( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency161675( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm161675( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate161675( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016112 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n4496HreMaqHdr), A4496HreMaqHdr, A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREH");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISREH"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate161675( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel161675( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1610( ) ;
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
         endLevel161675( ) ;
      }
      closeExtendedTableCursors161675( ) ;
   }

   public void deferredUpdate161675( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate161675( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency161675( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls161675( ) ;
         afterConfirm161675( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete161675( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T016113 */
               pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREH");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound675 == 0 )
                     {
                        initAll161675( ) ;
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
                     resetCaption1610( ) ;
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
      sMode675 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel161675( ) ;
      Gx_mode = sMode675 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls161675( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( 1 < 0 )
         {
            AV17UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         }
      }
   }

   public void processNestedLevel1611327( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1611327( ) ;
         if ( ( nRcdExists_1327 != 0 ) || ( nIsMod_1327 != 0 ) )
         {
            standaloneNotModal1611327( ) ;
            getKey1611327( ) ;
            if ( ( nRcdExists_1327 == 0 ) && ( nRcdDeleted_1327 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1611327( ) ;
            }
            else
            {
               if ( RcdFound1327 != 0 )
               {
                  if ( ( nRcdDeleted_1327 != 0 ) && ( nRcdExists_1327 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1611327( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1327 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1611327( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1327 == 0 )
                  {
                     GXCCtl = "HREACCOD_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHreAcCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1327_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1327, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreAcCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9985HreAcCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreAcReo_Internalname, GXutil.ltrim( localUtil.ntoc( A9986HreAcReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreAcPar_Internalname, GXutil.rtrim( A9987HreAcPar)) ;
         httpContext.changePostValue( edtHreAcKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A9988HreAcKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreAcMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A9989HreAcMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreAcPie_Internalname, GXutil.ltrim( localUtil.ntoc( A9990HreAcPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreAcCli_Internalname, GXutil.ltrim( localUtil.ntoc( A9991HreAcCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreAcSer_Internalname, GXutil.rtrim( A9992HreAcSer)) ;
         httpContext.changePostValue( edtHreAcDsc_Internalname, GXutil.rtrim( A9993HreAcDsc)) ;
         httpContext.changePostValue( edtHreAcCol_Internalname, GXutil.rtrim( A9994HreAcCol)) ;
         httpContext.changePostValue( edtHreAcNumC_Internalname, GXutil.ltrim( localUtil.ntoc( A9995HreAcNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9985HreAcCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9985HreAcCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9986HreAcReo_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9986HreAcReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9987HreAcPar_"+sGXsfl_55_idx, GXutil.rtrim( Z9987HreAcPar)) ;
         httpContext.changePostValue( "ZT_"+"Z9988HreAcKgm_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9988HreAcKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9989HreAcMtr_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9989HreAcMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9990HreAcPie_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9990HreAcPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9991HreAcCli_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9991HreAcCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9992HreAcSer_"+sGXsfl_55_idx, GXutil.rtrim( Z9992HreAcSer)) ;
         httpContext.changePostValue( "ZT_"+"Z9993HreAcDsc_"+sGXsfl_55_idx, GXutil.rtrim( Z9993HreAcDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z9994HreAcCol_"+sGXsfl_55_idx, GXutil.rtrim( Z9994HreAcCol)) ;
         httpContext.changePostValue( "ZT_"+"Z9995HreAcNumC_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z9995HreAcNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1327_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1327, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1327_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1327, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1327_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1327, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1327 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1327_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1327_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACCOD_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcCod_Title)) ;
            httpContext.changePostValue( "HREACCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACREO_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcReo_Title)) ;
            httpContext.changePostValue( "HREACREO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACPAR_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcPar_Title)) ;
            httpContext.changePostValue( "HREACPAR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACKGM_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcKgm_Title)) ;
            httpContext.changePostValue( "HREACKGM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACMTR_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcMtr_Title)) ;
            httpContext.changePostValue( "HREACMTR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACPIE_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcPie_Title)) ;
            httpContext.changePostValue( "HREACPIE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACCLI_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcCli_Title)) ;
            httpContext.changePostValue( "HREACCLI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACSER_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcSer_Title)) ;
            httpContext.changePostValue( "HREACSER_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACDSC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACCOL_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcCol_Title)) ;
            httpContext.changePostValue( "HREACCOL_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACNUMC_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcNumC_Title)) ;
            httpContext.changePostValue( "HREACNUMC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcNumC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1611327( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1327 = (short)(0) ;
      nIsMod_1327 = (short)(0) ;
      nRcdDeleted_1327 = (short)(0) ;
   }

   public void processLevel161675( )
   {
      /* Save parent mode. */
      sMode675 = Gx_mode ;
      processNestedLevel1611327( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode675 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel161675( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete161675( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thishra");
         if ( AnyError == 0 )
         {
            confirmValues1610( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thishra");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart161675( )
   {
      /* Scan By routine */
      /* Using cursor T016114 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      RcdFound675 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound675 = (short)(1) ;
         A4492HreBarCod = T016114_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T016114_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T016114_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T016114_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext161675( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound675 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound675 = (short)(1) ;
         A4492HreBarCod = T016114_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T016114_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T016114_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T016114_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
      }
   }

   public void scanEnd161675( )
   {
      pr_default.close(12);
   }

   public void afterConfirm161675( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert161675( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate161675( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete161675( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete161675( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate161675( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes161675( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtHreBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarCod_Enabled), 5, 0), true);
      edtHreBarReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarReo_Enabled), 5, 0), true);
      edtHreBarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarPar_Enabled), 5, 0), true);
      edtHreNumCie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNumCie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumCie_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtHreMaqHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreMaqHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreMaqHdr_Enabled), 5, 0), true);
   }

   public void zm1611327( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9988HreAcKgm = T01613_A9988HreAcKgm[0] ;
            Z9989HreAcMtr = T01613_A9989HreAcMtr[0] ;
            Z9990HreAcPie = T01613_A9990HreAcPie[0] ;
            Z9991HreAcCli = T01613_A9991HreAcCli[0] ;
            Z9992HreAcSer = T01613_A9992HreAcSer[0] ;
            Z9993HreAcDsc = T01613_A9993HreAcDsc[0] ;
            Z9994HreAcCol = T01613_A9994HreAcCol[0] ;
            Z9995HreAcNumC = T01613_A9995HreAcNumC[0] ;
         }
         else
         {
            Z9988HreAcKgm = A9988HreAcKgm ;
            Z9989HreAcMtr = A9989HreAcMtr ;
            Z9990HreAcPie = A9990HreAcPie ;
            Z9991HreAcCli = A9991HreAcCli ;
            Z9992HreAcSer = A9992HreAcSer ;
            Z9993HreAcDsc = A9993HreAcDsc ;
            Z9994HreAcCol = A9994HreAcCol ;
            Z9995HreAcNumC = A9995HreAcNumC ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z9985HreAcCod = A9985HreAcCod ;
         Z9986HreAcReo = A9986HreAcReo ;
         Z9987HreAcPar = A9987HreAcPar ;
         Z9988HreAcKgm = A9988HreAcKgm ;
         Z9989HreAcMtr = A9989HreAcMtr ;
         Z9990HreAcPie = A9990HreAcPie ;
         Z9991HreAcCli = A9991HreAcCli ;
         Z9992HreAcSer = A9992HreAcSer ;
         Z9993HreAcDsc = A9993HreAcDsc ;
         Z9994HreAcCol = A9994HreAcCol ;
         Z9995HreAcNumC = A9995HreAcNumC ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1611327( )
   {
      edtHreAcCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcCli_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHreAcSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcSer_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHreAcCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcCol_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHreAcNumC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcNumC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcNumC_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void standaloneModal1611327( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHreAcCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHreAcCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtHreAcCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHreAcCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHreAcReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHreAcReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcReo_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtHreAcReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHreAcReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcReo_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHreAcPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHreAcPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcPar_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtHreAcPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHreAcPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcPar_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
   }

   public void load1611327( )
   {
      /* Using cursor T016115 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A9985HreAcCod), Byte.valueOf(A9986HreAcReo), A9987HreAcPar});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1327 = (short)(1) ;
         A9988HreAcKgm = T016115_A9988HreAcKgm[0] ;
         n9988HreAcKgm = T016115_n9988HreAcKgm[0] ;
         A9989HreAcMtr = T016115_A9989HreAcMtr[0] ;
         n9989HreAcMtr = T016115_n9989HreAcMtr[0] ;
         A9990HreAcPie = T016115_A9990HreAcPie[0] ;
         n9990HreAcPie = T016115_n9990HreAcPie[0] ;
         A9991HreAcCli = T016115_A9991HreAcCli[0] ;
         n9991HreAcCli = T016115_n9991HreAcCli[0] ;
         A9992HreAcSer = T016115_A9992HreAcSer[0] ;
         n9992HreAcSer = T016115_n9992HreAcSer[0] ;
         A9993HreAcDsc = T016115_A9993HreAcDsc[0] ;
         n9993HreAcDsc = T016115_n9993HreAcDsc[0] ;
         A9994HreAcCol = T016115_A9994HreAcCol[0] ;
         n9994HreAcCol = T016115_n9994HreAcCol[0] ;
         A9995HreAcNumC = T016115_A9995HreAcNumC[0] ;
         n9995HreAcNumC = T016115_n9995HreAcNumC[0] ;
         zm1611327( -9) ;
      }
      pr_default.close(13);
      onLoadActions1611327( ) ;
   }

   public void onLoadActions1611327( )
   {
   }

   public void checkExtendedTable1611327( )
   {
      nIsDirty_1327 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1611327( ) ;
   }

   public void closeExtendedTableCursors1611327( )
   {
   }

   public void enableDisable1611327( )
   {
   }

   public void getKey1611327( )
   {
      /* Using cursor T016116 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A9985HreAcCod), Byte.valueOf(A9986HreAcReo), A9987HreAcPar});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1327 = (short)(1) ;
      }
      else
      {
         RcdFound1327 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey1611327( )
   {
      /* Using cursor T01613 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A9985HreAcCod), Byte.valueOf(A9986HreAcReo), A9987HreAcPar});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01613_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1611327( 9) ;
         RcdFound1327 = (short)(1) ;
         initializeNonKey1611327( ) ;
         A9985HreAcCod = T01613_A9985HreAcCod[0] ;
         A9986HreAcReo = T01613_A9986HreAcReo[0] ;
         A9987HreAcPar = T01613_A9987HreAcPar[0] ;
         A9988HreAcKgm = T01613_A9988HreAcKgm[0] ;
         n9988HreAcKgm = T01613_n9988HreAcKgm[0] ;
         A9989HreAcMtr = T01613_A9989HreAcMtr[0] ;
         n9989HreAcMtr = T01613_n9989HreAcMtr[0] ;
         A9990HreAcPie = T01613_A9990HreAcPie[0] ;
         n9990HreAcPie = T01613_n9990HreAcPie[0] ;
         A9991HreAcCli = T01613_A9991HreAcCli[0] ;
         n9991HreAcCli = T01613_n9991HreAcCli[0] ;
         A9992HreAcSer = T01613_A9992HreAcSer[0] ;
         n9992HreAcSer = T01613_n9992HreAcSer[0] ;
         A9993HreAcDsc = T01613_A9993HreAcDsc[0] ;
         n9993HreAcDsc = T01613_n9993HreAcDsc[0] ;
         A9994HreAcCol = T01613_A9994HreAcCol[0] ;
         n9994HreAcCol = T01613_n9994HreAcCol[0] ;
         A9995HreAcNumC = T01613_A9995HreAcNumC[0] ;
         n9995HreAcNumC = T01613_n9995HreAcNumC[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z9985HreAcCod = A9985HreAcCod ;
         Z9986HreAcReo = A9986HreAcReo ;
         Z9987HreAcPar = A9987HreAcPar ;
         sMode1327 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1611327( ) ;
         load1611327( ) ;
         Gx_mode = sMode1327 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1327 = (short)(0) ;
         initializeNonKey1611327( ) ;
         sMode1327 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1611327( ) ;
         Gx_mode = sMode1327 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1611327( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1611327( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01612 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A9985HreAcCod), Byte.valueOf(A9986HreAcReo), A9987HreAcPar});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISHRA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z9988HreAcKgm, T01612_A9988HreAcKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z9989HreAcMtr, T01612_A9989HreAcMtr[0]) != 0 ) || ( Z9990HreAcPie != T01612_A9990HreAcPie[0] ) || ( Z9991HreAcCli != T01612_A9991HreAcCli[0] ) || ( GXutil.strcmp(Z9992HreAcSer, T01612_A9992HreAcSer[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z9993HreAcDsc, T01612_A9993HreAcDsc[0]) != 0 ) || ( GXutil.strcmp(Z9994HreAcCol, T01612_A9994HreAcCol[0]) != 0 ) || ( Z9995HreAcNumC != T01612_A9995HreAcNumC[0] ) )
         {
            if ( DecimalUtil.compareTo(Z9988HreAcKgm, T01612_A9988HreAcKgm[0]) != 0 )
            {
               GXutil.writeLogln("thishra:[seudo value changed for attri]"+"HreAcKgm");
               GXutil.writeLogRaw("Old: ",Z9988HreAcKgm);
               GXutil.writeLogRaw("Current: ",T01612_A9988HreAcKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z9989HreAcMtr, T01612_A9989HreAcMtr[0]) != 0 )
            {
               GXutil.writeLogln("thishra:[seudo value changed for attri]"+"HreAcMtr");
               GXutil.writeLogRaw("Old: ",Z9989HreAcMtr);
               GXutil.writeLogRaw("Current: ",T01612_A9989HreAcMtr[0]);
            }
            if ( Z9990HreAcPie != T01612_A9990HreAcPie[0] )
            {
               GXutil.writeLogln("thishra:[seudo value changed for attri]"+"HreAcPie");
               GXutil.writeLogRaw("Old: ",Z9990HreAcPie);
               GXutil.writeLogRaw("Current: ",T01612_A9990HreAcPie[0]);
            }
            if ( Z9991HreAcCli != T01612_A9991HreAcCli[0] )
            {
               GXutil.writeLogln("thishra:[seudo value changed for attri]"+"HreAcCli");
               GXutil.writeLogRaw("Old: ",Z9991HreAcCli);
               GXutil.writeLogRaw("Current: ",T01612_A9991HreAcCli[0]);
            }
            if ( GXutil.strcmp(Z9992HreAcSer, T01612_A9992HreAcSer[0]) != 0 )
            {
               GXutil.writeLogln("thishra:[seudo value changed for attri]"+"HreAcSer");
               GXutil.writeLogRaw("Old: ",Z9992HreAcSer);
               GXutil.writeLogRaw("Current: ",T01612_A9992HreAcSer[0]);
            }
            if ( GXutil.strcmp(Z9993HreAcDsc, T01612_A9993HreAcDsc[0]) != 0 )
            {
               GXutil.writeLogln("thishra:[seudo value changed for attri]"+"HreAcDsc");
               GXutil.writeLogRaw("Old: ",Z9993HreAcDsc);
               GXutil.writeLogRaw("Current: ",T01612_A9993HreAcDsc[0]);
            }
            if ( GXutil.strcmp(Z9994HreAcCol, T01612_A9994HreAcCol[0]) != 0 )
            {
               GXutil.writeLogln("thishra:[seudo value changed for attri]"+"HreAcCol");
               GXutil.writeLogRaw("Old: ",Z9994HreAcCol);
               GXutil.writeLogRaw("Current: ",T01612_A9994HreAcCol[0]);
            }
            if ( Z9995HreAcNumC != T01612_A9995HreAcNumC[0] )
            {
               GXutil.writeLogln("thishra:[seudo value changed for attri]"+"HreAcNumC");
               GXutil.writeLogRaw("Old: ",Z9995HreAcNumC);
               GXutil.writeLogRaw("Current: ",T01612_A9995HreAcNumC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHISHRA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1611327( )
   {
      beforeValidate1611327( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1611327( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1611327( 0) ;
         checkOptimisticConcurrency1611327( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1611327( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1611327( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016117 */
                  pr_default.execute(15, new Object[] {Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A9985HreAcCod), Byte.valueOf(A9986HreAcReo), A9987HreAcPar, Boolean.valueOf(n9988HreAcKgm), A9988HreAcKgm, Boolean.valueOf(n9989HreAcMtr), A9989HreAcMtr, Boolean.valueOf(n9990HreAcPie), Integer.valueOf(A9990HreAcPie), Boolean.valueOf(n9991HreAcCli), Integer.valueOf(A9991HreAcCli), Boolean.valueOf(n9992HreAcSer), A9992HreAcSer, Boolean.valueOf(n9993HreAcDsc), A9993HreAcDsc, Boolean.valueOf(n9994HreAcCol), A9994HreAcCol, Boolean.valueOf(n9995HreAcNumC), Integer.valueOf(A9995HreAcNumC), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISHRA");
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
            load1611327( ) ;
         }
         endLevel1611327( ) ;
      }
      closeExtendedTableCursors1611327( ) ;
   }

   public void update1611327( )
   {
      beforeValidate1611327( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1611327( ) ;
      }
      if ( ( nIsMod_1327 != 0 ) || ( nIsDirty_1327 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1611327( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1611327( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1611327( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T016118 */
                     pr_default.execute(16, new Object[] {Boolean.valueOf(n9988HreAcKgm), A9988HreAcKgm, Boolean.valueOf(n9989HreAcMtr), A9989HreAcMtr, Boolean.valueOf(n9990HreAcPie), Integer.valueOf(A9990HreAcPie), Boolean.valueOf(n9991HreAcCli), Integer.valueOf(A9991HreAcCli), Boolean.valueOf(n9992HreAcSer), A9992HreAcSer, Boolean.valueOf(n9993HreAcDsc), A9993HreAcDsc, Boolean.valueOf(n9994HreAcCol), A9994HreAcCol, Boolean.valueOf(n9995HreAcNumC), Integer.valueOf(A9995HreAcNumC), A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A9985HreAcCod), Byte.valueOf(A9986HreAcReo), A9987HreAcPar});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISHRA");
                     if ( (pr_default.getStatus(16) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISHRA"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1611327( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1611327( ) ;
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
            endLevel1611327( ) ;
         }
      }
      closeExtendedTableCursors1611327( ) ;
   }

   public void deferredUpdate1611327( )
   {
   }

   public void delete1611327( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1611327( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1611327( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1611327( ) ;
         afterConfirm1611327( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1611327( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T016119 */
               pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A9985HreAcCod), Byte.valueOf(A9986HreAcReo), A9987HreAcPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISHRA");
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
      sMode1327 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1611327( ) ;
      Gx_mode = sMode1327 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1611327( )
   {
      standaloneModal1611327( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1611327( )
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

   public void scanStart1611327( )
   {
      /* Scan By routine */
      /* Using cursor T016120 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      RcdFound1327 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1327 = (short)(1) ;
         A9985HreAcCod = T016120_A9985HreAcCod[0] ;
         A9986HreAcReo = T016120_A9986HreAcReo[0] ;
         A9987HreAcPar = T016120_A9987HreAcPar[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1611327( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1327 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1327 = (short)(1) ;
         A9985HreAcCod = T016120_A9985HreAcCod[0] ;
         A9986HreAcReo = T016120_A9986HreAcReo[0] ;
         A9987HreAcPar = T016120_A9987HreAcPar[0] ;
      }
   }

   public void scanEnd1611327( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1611327( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1611327( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1611327( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1611327( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1611327( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1611327( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1611327( )
   {
      edtHreAcCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHreAcReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcReo_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHreAcPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcPar_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHreAcKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcKgm_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHreAcMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcMtr_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHreAcPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcPie_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHreAcCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcCli_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHreAcSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcSer_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHreAcDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcDsc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHreAcCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcCol_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHreAcNumC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcNumC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcNumC_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashes1611327( )
   {
   }

   public void send_integrity_lvl_hashes161675( )
   {
   }

   public void subsflControlProps_551327( )
   {
      edtavnRcdDeleted_1327_Internalname = "vNRCDDELETED_1327_"+sGXsfl_55_idx ;
      edtHreAcCod_Internalname = "HREACCOD_"+sGXsfl_55_idx ;
      edtHreAcReo_Internalname = "HREACREO_"+sGXsfl_55_idx ;
      edtHreAcPar_Internalname = "HREACPAR_"+sGXsfl_55_idx ;
      edtHreAcKgm_Internalname = "HREACKGM_"+sGXsfl_55_idx ;
      edtHreAcMtr_Internalname = "HREACMTR_"+sGXsfl_55_idx ;
      edtHreAcPie_Internalname = "HREACPIE_"+sGXsfl_55_idx ;
      edtHreAcCli_Internalname = "HREACCLI_"+sGXsfl_55_idx ;
      edtHreAcSer_Internalname = "HREACSER_"+sGXsfl_55_idx ;
      edtHreAcDsc_Internalname = "HREACDSC_"+sGXsfl_55_idx ;
      edtHreAcCol_Internalname = "HREACCOL_"+sGXsfl_55_idx ;
      edtHreAcNumC_Internalname = "HREACNUMC_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_551327( )
   {
      edtavnRcdDeleted_1327_Internalname = "vNRCDDELETED_1327_"+sGXsfl_55_fel_idx ;
      edtHreAcCod_Internalname = "HREACCOD_"+sGXsfl_55_fel_idx ;
      edtHreAcReo_Internalname = "HREACREO_"+sGXsfl_55_fel_idx ;
      edtHreAcPar_Internalname = "HREACPAR_"+sGXsfl_55_fel_idx ;
      edtHreAcKgm_Internalname = "HREACKGM_"+sGXsfl_55_fel_idx ;
      edtHreAcMtr_Internalname = "HREACMTR_"+sGXsfl_55_fel_idx ;
      edtHreAcPie_Internalname = "HREACPIE_"+sGXsfl_55_fel_idx ;
      edtHreAcCli_Internalname = "HREACCLI_"+sGXsfl_55_fel_idx ;
      edtHreAcSer_Internalname = "HREACSER_"+sGXsfl_55_fel_idx ;
      edtHreAcDsc_Internalname = "HREACDSC_"+sGXsfl_55_fel_idx ;
      edtHreAcCol_Internalname = "HREACCOL_"+sGXsfl_55_fel_idx ;
      edtHreAcNumC_Internalname = "HREACNUMC_"+sGXsfl_55_fel_idx ;
   }

   public void addRow1611327( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551327( ) ;
      sendRow1611327( ) ;
   }

   public void sendRow1611327( )
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
         if ( ((int)((nGXsfl_55_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1327_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1327_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1327, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1327_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1327), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1327), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1327_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1327_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1327_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9985HreAcCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9985HreAcCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreAcCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1327_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcReo_Internalname,GXutil.ltrim( localUtil.ntoc( A9986HreAcReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9986HreAcReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreAcReo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1327_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcPar_Internalname,GXutil.rtrim( A9987HreAcPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreAcPar_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1327_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A9988HreAcKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreAcKgm_Enabled!=0) ? localUtil.format( A9988HreAcKgm, "ZZZZZ9.99") : localUtil.format( A9988HreAcKgm, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreAcKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1327_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A9989HreAcMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreAcMtr_Enabled!=0) ? localUtil.format( A9989HreAcMtr, "ZZZZZ9.99") : localUtil.format( A9989HreAcMtr, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreAcMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1327_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcPie_Internalname,GXutil.ltrim( localUtil.ntoc( A9990HreAcPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreAcPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9990HreAcPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9990HreAcPie), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreAcPie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcCli_Internalname,GXutil.ltrim( localUtil.ntoc( A9991HreAcCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreAcCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9991HreAcCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9991HreAcCli), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreAcCli_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcSer_Internalname,GXutil.rtrim( A9992HreAcSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreAcSer_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1327_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcDsc_Internalname,GXutil.rtrim( A9993HreAcDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreAcDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcCol_Internalname,GXutil.rtrim( A9994HreAcCol),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreAcCol_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcNumC_Internalname,GXutil.ltrim( localUtil.ntoc( A9995HreAcNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreAcNumC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9995HreAcNumC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9995HreAcNumC), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcNumC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreAcNumC_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1611327( ) ;
      GXCCtl = "Z9985HreAcCod_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9985HreAcCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9986HreAcReo_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9986HreAcReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9987HreAcPar_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9987HreAcPar));
      GXCCtl = "Z9988HreAcKgm_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9988HreAcKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9989HreAcMtr_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9989HreAcMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9990HreAcPie_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9990HreAcPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9991HreAcCli_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9991HreAcCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9992HreAcSer_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9992HreAcSer));
      GXCCtl = "Z9993HreAcDsc_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9993HreAcDsc));
      GXCCtl = "Z9994HreAcCol_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9994HreAcCol));
      GXCCtl = "Z9995HreAcNumC_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9995HreAcNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1327_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1327, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1327_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1327, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1327_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1327, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1327_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1327_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREACCOD_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcCod_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "HREACCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREACREO_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcReo_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "HREACREO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREACPAR_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcPar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "HREACPAR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREACKGM_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcKgm_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "HREACKGM_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREACMTR_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcMtr_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "HREACMTR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREACPIE_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcPie_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "HREACPIE_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREACCLI_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcCli_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "HREACCLI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREACSER_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcSer_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "HREACSER_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREACDSC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREACCOL_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcCol_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "HREACCOL_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREACNUMC_"+sGXsfl_55_idx+"Title", GXutil.rtrim( edtHreAcNumC_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "HREACNUMC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcNumC_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1611327( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551327( ) ;
      edtavnRcdDeleted_1327_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1327_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreAcCod_Title = httpContext.cgiGet( "HREACCOD_"+sGXsfl_55_idx+"Title") ;
      edtHreAcCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACCOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreAcReo_Title = httpContext.cgiGet( "HREACREO_"+sGXsfl_55_idx+"Title") ;
      edtHreAcReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACREO_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreAcPar_Title = httpContext.cgiGet( "HREACPAR_"+sGXsfl_55_idx+"Title") ;
      edtHreAcPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACPAR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreAcKgm_Title = httpContext.cgiGet( "HREACKGM_"+sGXsfl_55_idx+"Title") ;
      edtHreAcKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACKGM_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreAcMtr_Title = httpContext.cgiGet( "HREACMTR_"+sGXsfl_55_idx+"Title") ;
      edtHreAcMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACMTR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreAcPie_Title = httpContext.cgiGet( "HREACPIE_"+sGXsfl_55_idx+"Title") ;
      edtHreAcPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACPIE_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreAcCli_Title = httpContext.cgiGet( "HREACCLI_"+sGXsfl_55_idx+"Title") ;
      edtHreAcCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACCLI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreAcSer_Title = httpContext.cgiGet( "HREACSER_"+sGXsfl_55_idx+"Title") ;
      edtHreAcSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACSER_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreAcDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACDSC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreAcCol_Title = httpContext.cgiGet( "HREACCOL_"+sGXsfl_55_idx+"Title") ;
      edtHreAcCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACCOL_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreAcNumC_Title = httpContext.cgiGet( "HREACNUMC_"+sGXsfl_55_idx+"Title") ;
      edtHreAcNumC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACNUMC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1327_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1327_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1327");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1327_Internalname ;
         wbErr = true ;
         nRcdDeleted_1327 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1327 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1327_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreAcCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreAcCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "HREACCOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreAcCod_Internalname ;
         wbErr = true ;
         A9985HreAcCod = 0 ;
      }
      else
      {
         A9985HreAcCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAcCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreAcReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreAcReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "HREACREO_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreAcReo_Internalname ;
         wbErr = true ;
         A9986HreAcReo = (byte)(0) ;
      }
      else
      {
         A9986HreAcReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreAcReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A9987HreAcPar = httpContext.cgiGet( edtHreAcPar_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreAcKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreAcKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "HREACKGM_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreAcKgm_Internalname ;
         wbErr = true ;
         A9988HreAcKgm = DecimalUtil.ZERO ;
         n9988HreAcKgm = false ;
      }
      else
      {
         A9988HreAcKgm = localUtil.ctond( httpContext.cgiGet( edtHreAcKgm_Internalname)) ;
         n9988HreAcKgm = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreAcMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreAcMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "HREACMTR_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreAcMtr_Internalname ;
         wbErr = true ;
         A9989HreAcMtr = DecimalUtil.ZERO ;
         n9989HreAcMtr = false ;
      }
      else
      {
         A9989HreAcMtr = localUtil.ctond( httpContext.cgiGet( edtHreAcMtr_Internalname)) ;
         n9989HreAcMtr = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreAcPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreAcPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "HREACPIE_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreAcPie_Internalname ;
         wbErr = true ;
         A9990HreAcPie = 0 ;
         n9990HreAcPie = false ;
      }
      else
      {
         A9990HreAcPie = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAcPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9990HreAcPie = false ;
      }
      A9991HreAcCli = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAcCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n9991HreAcCli = false ;
      A9992HreAcSer = httpContext.cgiGet( edtHreAcSer_Internalname) ;
      n9992HreAcSer = false ;
      A9993HreAcDsc = httpContext.cgiGet( edtHreAcDsc_Internalname) ;
      n9993HreAcDsc = false ;
      A9994HreAcCol = httpContext.cgiGet( edtHreAcCol_Internalname) ;
      n9994HreAcCol = false ;
      A9995HreAcNumC = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAcNumC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n9995HreAcNumC = false ;
      GXCCtl = "Z9985HreAcCod_" + sGXsfl_55_idx ;
      Z9985HreAcCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9986HreAcReo_" + sGXsfl_55_idx ;
      Z9986HreAcReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9987HreAcPar_" + sGXsfl_55_idx ;
      Z9987HreAcPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9988HreAcKgm_" + sGXsfl_55_idx ;
      Z9988HreAcKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9989HreAcMtr_" + sGXsfl_55_idx ;
      Z9989HreAcMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9990HreAcPie_" + sGXsfl_55_idx ;
      Z9990HreAcPie = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9991HreAcCli_" + sGXsfl_55_idx ;
      Z9991HreAcCli = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9992HreAcSer_" + sGXsfl_55_idx ;
      Z9992HreAcSer = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9993HreAcDsc_" + sGXsfl_55_idx ;
      Z9993HreAcDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9994HreAcCol_" + sGXsfl_55_idx ;
      Z9994HreAcCol = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9995HreAcNumC_" + sGXsfl_55_idx ;
      Z9995HreAcNumC = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1327_" + sGXsfl_55_idx ;
      nRcdDeleted_1327 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1327_" + sGXsfl_55_idx ;
      nRcdExists_1327 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1327_" + sGXsfl_55_idx ;
      nIsMod_1327 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtHreAcNumC_Enabled = edtHreAcNumC_Enabled ;
      defedtHreAcCol_Enabled = edtHreAcCol_Enabled ;
      defedtHreAcSer_Enabled = edtHreAcSer_Enabled ;
      defedtHreAcCli_Enabled = edtHreAcCli_Enabled ;
      defedtHreAcPar_Enabled = edtHreAcPar_Enabled ;
      defedtHreAcReo_Enabled = edtHreAcReo_Enabled ;
      defedtHreAcCod_Enabled = edtHreAcCod_Enabled ;
   }

   public void confirmValues1610( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551327( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551327( ) ;
         httpContext.changePostValue( "Z9985HreAcCod_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9985HreAcCod_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9985HreAcCod_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z9986HreAcReo_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9986HreAcReo_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9986HreAcReo_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z9987HreAcPar_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9987HreAcPar_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9987HreAcPar_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z9988HreAcKgm_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9988HreAcKgm_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9988HreAcKgm_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z9989HreAcMtr_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9989HreAcMtr_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9989HreAcMtr_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z9990HreAcPie_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9990HreAcPie_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9990HreAcPie_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z9991HreAcCli_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9991HreAcCli_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9991HreAcCli_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z9992HreAcSer_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9992HreAcSer_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9992HreAcSer_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z9993HreAcDsc_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9993HreAcDsc_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9993HreAcDsc_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z9994HreAcCol_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9994HreAcCol_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9994HreAcCol_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z9995HreAcNumC_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z9995HreAcNumC_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9995HreAcNumC_"+sGXsfl_55_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thishra", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4492HreBarCod", GXutil.ltrim( localUtil.ntoc( Z4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4493HreBarReo", GXutil.ltrim( localUtil.ntoc( Z4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4494HreBarPar", GXutil.rtrim( Z4494HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4495HreNumCie", GXutil.ltrim( localUtil.ntoc( Z4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4496HreMaqHdr", GXutil.rtrim( Z4496HreMaqHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
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
      return formatLink("app.thishra", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "THISHRA" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "AGRUPACIONES ACABADOS", "") ;
   }

   public void initializeNonKey161675( )
   {
      A4496HreMaqHdr = "" ;
      n4496HreMaqHdr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4496HreMaqHdr", A4496HreMaqHdr);
      Z4496HreMaqHdr = "" ;
   }

   public void initAll161675( )
   {
      A4492HreBarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
      A4493HreBarReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
      A4494HreBarPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
      A4495HreNumCie = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
      initializeNonKey161675( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1611327( )
   {
      A9988HreAcKgm = DecimalUtil.ZERO ;
      n9988HreAcKgm = false ;
      A9989HreAcMtr = DecimalUtil.ZERO ;
      n9989HreAcMtr = false ;
      A9990HreAcPie = 0 ;
      n9990HreAcPie = false ;
      A9991HreAcCli = 0 ;
      n9991HreAcCli = false ;
      A9992HreAcSer = "" ;
      n9992HreAcSer = false ;
      A9993HreAcDsc = "" ;
      n9993HreAcDsc = false ;
      A9994HreAcCol = "" ;
      n9994HreAcCol = false ;
      A9995HreAcNumC = 0 ;
      n9995HreAcNumC = false ;
      Z9988HreAcKgm = DecimalUtil.ZERO ;
      Z9989HreAcMtr = DecimalUtil.ZERO ;
      Z9990HreAcPie = 0 ;
      Z9991HreAcCli = 0 ;
      Z9992HreAcSer = "" ;
      Z9993HreAcDsc = "" ;
      Z9994HreAcCol = "" ;
      Z9995HreAcNumC = 0 ;
   }

   public void initAll1611327( )
   {
      A9985HreAcCod = 0 ;
      A9986HreAcReo = (byte)(0) ;
      A9987HreAcPar = "" ;
      initializeNonKey1611327( ) ;
   }

   public void standaloneModalInsert1611327( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241544296", true, true);
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
      httpContext.AddJavascriptSource("thishra.js", "?20268241544297", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1327( )
   {
      edtHreAcNumC_Enabled = defedtHreAcNumC_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcNumC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcNumC_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHreAcCol_Enabled = defedtHreAcCol_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcCol_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHreAcSer_Enabled = defedtHreAcSer_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcSer_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHreAcCli_Enabled = defedtHreAcCli_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcCli_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHreAcPar_Enabled = defedtHreAcPar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcPar_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHreAcReo_Enabled = defedtHreAcReo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcReo_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtHreAcCod_Enabled = defedtHreAcCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void startgridcontrol55( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1327, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1327_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9985HreAcCod, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtHreAcCod_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9986HreAcReo, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtHreAcReo_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9987HreAcPar));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtHreAcPar_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9988HreAcKgm, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtHreAcKgm_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9989HreAcMtr, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtHreAcMtr_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9990HreAcPie, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtHreAcPie_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9991HreAcCli, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtHreAcCli_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9992HreAcSer));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtHreAcSer_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9993HreAcDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9994HreAcCol));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtHreAcCol_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9995HreAcNumC, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtHreAcNumC_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcNumC_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtHreBarCod_Internalname = "HREBARCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtHreBarReo_Internalname = "HREBARREO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtHreBarPar_Internalname = "HREBARPAR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtHreNumCie_Internalname = "HRENUMCIE" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtHreMaqHdr_Internalname = "HREMAQHDR" ;
      edtavnRcdDeleted_1327_Internalname = "vNRCDDELETED_1327" ;
      edtHreAcCod_Internalname = "HREACCOD" ;
      edtHreAcReo_Internalname = "HREACREO" ;
      edtHreAcPar_Internalname = "HREACPAR" ;
      edtHreAcKgm_Internalname = "HREACKGM" ;
      edtHreAcMtr_Internalname = "HREACMTR" ;
      edtHreAcPie_Internalname = "HREACPIE" ;
      edtHreAcCli_Internalname = "HREACCLI" ;
      edtHreAcSer_Internalname = "HREACSER" ;
      edtHreAcDsc_Internalname = "HREACDSC" ;
      edtHreAcCol_Internalname = "HREACCOL" ;
      edtHreAcNumC_Internalname = "HREACNUMC" ;
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
      Form.setCaption( httpContext.getMessage( "AGRUPACIONES ACABADOS", "") );
      edtHreAcNumC_Jsonclick = "" ;
      edtHreAcCol_Jsonclick = "" ;
      edtHreAcDsc_Jsonclick = "" ;
      edtHreAcSer_Jsonclick = "" ;
      edtHreAcCli_Jsonclick = "" ;
      edtHreAcPie_Jsonclick = "" ;
      edtHreAcMtr_Jsonclick = "" ;
      edtHreAcKgm_Jsonclick = "" ;
      edtHreAcPar_Jsonclick = "" ;
      edtHreAcReo_Jsonclick = "" ;
      edtHreAcCod_Jsonclick = "" ;
      edtavnRcdDeleted_1327_Jsonclick = "" ;
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
      edtHreAcNumC_Enabled = 0 ;
      edtHreAcCol_Enabled = 0 ;
      edtHreAcDsc_Enabled = 1 ;
      edtHreAcSer_Enabled = 0 ;
      edtHreAcCli_Enabled = 0 ;
      edtHreAcPie_Enabled = 1 ;
      edtHreAcMtr_Enabled = 1 ;
      edtHreAcKgm_Enabled = 1 ;
      edtHreAcPar_Enabled = 1 ;
      edtHreAcReo_Enabled = 1 ;
      edtHreAcCod_Enabled = 1 ;
      edtavnRcdDeleted_1327_Enabled = 1 ;
      edtHreMaqHdr_Jsonclick = "" ;
      edtHreMaqHdr_Backcolor = (int)(0xFFFFFF) ;
      edtHreMaqHdr_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtHreNumCie_Jsonclick = "" ;
      edtHreNumCie_Backcolor = (int)(0xFFFFFF) ;
      edtHreNumCie_Enabled = 1 ;
      edtHreBarPar_Jsonclick = "" ;
      edtHreBarPar_Backcolor = (int)(0xFFFFFF) ;
      edtHreBarPar_Enabled = 1 ;
      edtHreBarReo_Jsonclick = "" ;
      edtHreBarReo_Backcolor = (int)(0xFFFFFF) ;
      edtHreBarReo_Enabled = 1 ;
      edtHreBarCod_Jsonclick = "" ;
      edtHreBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtHreBarCod_Enabled = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Backcolor = (int)(0xFFFFFF) ;
      edtEmprCod_Enabled = 0 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
      edtHreAcPie_Title = httpContext.getMessage( "Pzs", "") ;
      edtHreAcMtr_Title = httpContext.getMessage( "Mts", "") ;
      edtHreAcKgm_Title = httpContext.getMessage( "Kgs", "") ;
      edtHreAcNumC_Title = httpContext.getMessage( "Numero", "") ;
      edtHreAcCol_Title = httpContext.getMessage( "Color", "") ;
      edtHreAcSer_Title = httpContext.getMessage( "Articulo", "") ;
      edtHreAcCli_Title = httpContext.getMessage( "Cliente", "") ;
      edtHreAcPar_Title = httpContext.getMessage( "P", "") ;
      edtHreAcReo_Title = httpContext.getMessage( "R", "") ;
      edtHreAcCod_Title = httpContext.getMessage( "Hdr", "") ;
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
      subsflControlProps_551327( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1611327( ) ;
         standaloneModal1611327( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1611327( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551327( ) ;
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
      /* Using cursor T016121 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016121_A407EmprNom[0] ;
      n407EmprNom = T016121_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(19);
      GX_FocusControl = edtHreMaqHdr_Internalname ;
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

   public void valid_Hrenumcie( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4496HreMaqHdr", GXutil.rtrim( A4496HreMaqHdr));
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", GXutil.rtrim( AV17UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4492HreBarCod", GXutil.ltrim( localUtil.ntoc( Z4492HreBarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4493HreBarReo", GXutil.ltrim( localUtil.ntoc( Z4493HreBarReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4494HreBarPar", GXutil.rtrim( Z4494HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4495HreNumCie", GXutil.ltrim( localUtil.ntoc( Z4495HreNumCie, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4496HreMaqHdr", GXutil.rtrim( Z4496HreMaqHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV17UsurCod", GXutil.rtrim( ZV17UsurCod));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_HREBARCOD","{handler:'valid_Hrebarcod',iparms:[]");
      setEventMetadata("VALID_HREBARCOD",",oparms:[]}");
      setEventMetadata("VALID_HREBARREO","{handler:'valid_Hrebarreo',iparms:[]");
      setEventMetadata("VALID_HREBARREO",",oparms:[]}");
      setEventMetadata("VALID_HREBARPAR","{handler:'valid_Hrebarpar',iparms:[]");
      setEventMetadata("VALID_HREBARPAR",",oparms:[]}");
      setEventMetadata("VALID_HRENUMCIE","{handler:'valid_Hrenumcie',iparms:[{av:'edtHreAcPie_Title',ctrl:'HREACPIE',prop:'Title'},{av:'edtHreAcMtr_Title',ctrl:'HREACMTR',prop:'Title'},{av:'edtHreAcKgm_Title',ctrl:'HREACKGM',prop:'Title'},{av:'edtHreAcNumC_Title',ctrl:'HREACNUMC',prop:'Title'},{av:'edtHreAcCol_Title',ctrl:'HREACCOL',prop:'Title'},{av:'edtHreAcSer_Title',ctrl:'HREACSER',prop:'Title'},{av:'edtHreAcCli_Title',ctrl:'HREACCLI',prop:'Title'},{av:'edtHreAcPar_Title',ctrl:'HREACPAR',prop:'Title'},{av:'edtHreAcReo_Title',ctrl:'HREACREO',prop:'Title'},{av:'edtHreAcCod_Title',ctrl:'HREACCOD',prop:'Title'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("VALID_HRENUMCIE",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4496HreMaqHdr',fld:'HREMAQHDR',pic:''},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4492HreBarCod'},{av:'Z4493HreBarReo'},{av:'Z4494HreBarPar'},{av:'Z4495HreNumCie'},{av:'Z407EmprNom'},{av:'Z4496HreMaqHdr'},{av:'ZV17UsurCod'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_HREACCOD","{handler:'valid_Hreaccod',iparms:[]");
      setEventMetadata("VALID_HREACCOD",",oparms:[]}");
      setEventMetadata("VALID_HREACREO","{handler:'valid_Hreacreo',iparms:[]");
      setEventMetadata("VALID_HREACREO",",oparms:[]}");
      setEventMetadata("VALID_HREACPAR","{handler:'valid_Hreacpar',iparms:[]");
      setEventMetadata("VALID_HREACPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Hreacnumc',iparms:[]");
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
      pr_default.close(19);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z4494HreBarPar = "" ;
      Z4496HreMaqHdr = "" ;
      Z9987HreAcPar = "" ;
      Z9988HreAcKgm = DecimalUtil.ZERO ;
      Z9989HreAcMtr = DecimalUtil.ZERO ;
      Z9992HreAcSer = "" ;
      Z9993HreAcDsc = "" ;
      Z9994HreAcCol = "" ;
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
      A396EmprCod = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A4494HreBarPar = "" ;
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock7_Jsonclick = "" ;
      A4496HreMaqHdr = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1327 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV17UsurCod = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode675 = "" ;
      GXCCtl = "" ;
      A9987HreAcPar = "" ;
      A9988HreAcKgm = DecimalUtil.ZERO ;
      A9989HreAcMtr = DecimalUtil.ZERO ;
      A9992HreAcSer = "" ;
      A9993HreAcDsc = "" ;
      A9994HreAcCol = "" ;
      AV20Lit0 = "" ;
      AV36LitFe = "" ;
      AV21Lit1 = "" ;
      AV22Lit2 = "" ;
      AV23Lit3 = "" ;
      AV24Lit4 = "" ;
      AV25Lit5 = "" ;
      AV26Lit6 = "" ;
      AV27Lit7 = "" ;
      AV30Lit10 = "" ;
      AV37Lit11 = "" ;
      AV38Lit12 = "" ;
      AV39Lit13 = "" ;
      AV40Lit14 = "" ;
      AV41Lit15 = "" ;
      AV42Lit16 = "" ;
      AV43Lit17 = "" ;
      AV44Lit18 = "" ;
      AV31msg0 = "" ;
      AV32msg1 = "" ;
      AV33msg2 = "" ;
      AV34msg3 = "" ;
      AV35msg4 = "" ;
      GXt_char1 = "" ;
      AV19Station = "" ;
      GXv_char2 = new String[1] ;
      AV16EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      T01616_A407EmprNom = new String[] {""} ;
      T01616_n407EmprNom = new boolean[] {false} ;
      T01617_A4492HreBarCod = new int[1] ;
      T01617_A4493HreBarReo = new byte[1] ;
      T01617_A4494HreBarPar = new String[] {""} ;
      T01617_A4495HreNumCie = new byte[1] ;
      T01617_A407EmprNom = new String[] {""} ;
      T01617_n407EmprNom = new boolean[] {false} ;
      T01617_A4496HreMaqHdr = new String[] {""} ;
      T01617_n4496HreMaqHdr = new boolean[] {false} ;
      T01617_A396EmprCod = new String[] {""} ;
      T01618_A396EmprCod = new String[] {""} ;
      T01618_A4492HreBarCod = new int[1] ;
      T01618_A4493HreBarReo = new byte[1] ;
      T01618_A4494HreBarPar = new String[] {""} ;
      T01618_A4495HreNumCie = new byte[1] ;
      T01615_A4492HreBarCod = new int[1] ;
      T01615_A4493HreBarReo = new byte[1] ;
      T01615_A4494HreBarPar = new String[] {""} ;
      T01615_A4495HreNumCie = new byte[1] ;
      T01615_A4496HreMaqHdr = new String[] {""} ;
      T01615_n4496HreMaqHdr = new boolean[] {false} ;
      T01615_A396EmprCod = new String[] {""} ;
      T01619_A396EmprCod = new String[] {""} ;
      T01619_A4492HreBarCod = new int[1] ;
      T01619_A4493HreBarReo = new byte[1] ;
      T01619_A4494HreBarPar = new String[] {""} ;
      T01619_A4495HreNumCie = new byte[1] ;
      T016110_A396EmprCod = new String[] {""} ;
      T016110_A4492HreBarCod = new int[1] ;
      T016110_A4493HreBarReo = new byte[1] ;
      T016110_A4494HreBarPar = new String[] {""} ;
      T016110_A4495HreNumCie = new byte[1] ;
      T01614_A4492HreBarCod = new int[1] ;
      T01614_A4493HreBarReo = new byte[1] ;
      T01614_A4494HreBarPar = new String[] {""} ;
      T01614_A4495HreNumCie = new byte[1] ;
      T01614_A4496HreMaqHdr = new String[] {""} ;
      T01614_n4496HreMaqHdr = new boolean[] {false} ;
      T01614_A396EmprCod = new String[] {""} ;
      T016114_A396EmprCod = new String[] {""} ;
      T016114_A4492HreBarCod = new int[1] ;
      T016114_A4493HreBarReo = new byte[1] ;
      T016114_A4494HreBarPar = new String[] {""} ;
      T016114_A4495HreNumCie = new byte[1] ;
      T016115_A4492HreBarCod = new int[1] ;
      T016115_A4493HreBarReo = new byte[1] ;
      T016115_A4494HreBarPar = new String[] {""} ;
      T016115_A4495HreNumCie = new byte[1] ;
      T016115_A9985HreAcCod = new int[1] ;
      T016115_A9986HreAcReo = new byte[1] ;
      T016115_A9987HreAcPar = new String[] {""} ;
      T016115_A9988HreAcKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016115_n9988HreAcKgm = new boolean[] {false} ;
      T016115_A9989HreAcMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016115_n9989HreAcMtr = new boolean[] {false} ;
      T016115_A9990HreAcPie = new int[1] ;
      T016115_n9990HreAcPie = new boolean[] {false} ;
      T016115_A9991HreAcCli = new int[1] ;
      T016115_n9991HreAcCli = new boolean[] {false} ;
      T016115_A9992HreAcSer = new String[] {""} ;
      T016115_n9992HreAcSer = new boolean[] {false} ;
      T016115_A9993HreAcDsc = new String[] {""} ;
      T016115_n9993HreAcDsc = new boolean[] {false} ;
      T016115_A9994HreAcCol = new String[] {""} ;
      T016115_n9994HreAcCol = new boolean[] {false} ;
      T016115_A9995HreAcNumC = new int[1] ;
      T016115_n9995HreAcNumC = new boolean[] {false} ;
      T016115_A396EmprCod = new String[] {""} ;
      T016116_A396EmprCod = new String[] {""} ;
      T016116_A4492HreBarCod = new int[1] ;
      T016116_A4493HreBarReo = new byte[1] ;
      T016116_A4494HreBarPar = new String[] {""} ;
      T016116_A4495HreNumCie = new byte[1] ;
      T016116_A9985HreAcCod = new int[1] ;
      T016116_A9986HreAcReo = new byte[1] ;
      T016116_A9987HreAcPar = new String[] {""} ;
      T01613_A4492HreBarCod = new int[1] ;
      T01613_A4493HreBarReo = new byte[1] ;
      T01613_A4494HreBarPar = new String[] {""} ;
      T01613_A4495HreNumCie = new byte[1] ;
      T01613_A9985HreAcCod = new int[1] ;
      T01613_A9986HreAcReo = new byte[1] ;
      T01613_A9987HreAcPar = new String[] {""} ;
      T01613_A9988HreAcKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01613_n9988HreAcKgm = new boolean[] {false} ;
      T01613_A9989HreAcMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01613_n9989HreAcMtr = new boolean[] {false} ;
      T01613_A9990HreAcPie = new int[1] ;
      T01613_n9990HreAcPie = new boolean[] {false} ;
      T01613_A9991HreAcCli = new int[1] ;
      T01613_n9991HreAcCli = new boolean[] {false} ;
      T01613_A9992HreAcSer = new String[] {""} ;
      T01613_n9992HreAcSer = new boolean[] {false} ;
      T01613_A9993HreAcDsc = new String[] {""} ;
      T01613_n9993HreAcDsc = new boolean[] {false} ;
      T01613_A9994HreAcCol = new String[] {""} ;
      T01613_n9994HreAcCol = new boolean[] {false} ;
      T01613_A9995HreAcNumC = new int[1] ;
      T01613_n9995HreAcNumC = new boolean[] {false} ;
      T01613_A396EmprCod = new String[] {""} ;
      T01612_A4492HreBarCod = new int[1] ;
      T01612_A4493HreBarReo = new byte[1] ;
      T01612_A4494HreBarPar = new String[] {""} ;
      T01612_A4495HreNumCie = new byte[1] ;
      T01612_A9985HreAcCod = new int[1] ;
      T01612_A9986HreAcReo = new byte[1] ;
      T01612_A9987HreAcPar = new String[] {""} ;
      T01612_A9988HreAcKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01612_n9988HreAcKgm = new boolean[] {false} ;
      T01612_A9989HreAcMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01612_n9989HreAcMtr = new boolean[] {false} ;
      T01612_A9990HreAcPie = new int[1] ;
      T01612_n9990HreAcPie = new boolean[] {false} ;
      T01612_A9991HreAcCli = new int[1] ;
      T01612_n9991HreAcCli = new boolean[] {false} ;
      T01612_A9992HreAcSer = new String[] {""} ;
      T01612_n9992HreAcSer = new boolean[] {false} ;
      T01612_A9993HreAcDsc = new String[] {""} ;
      T01612_n9993HreAcDsc = new boolean[] {false} ;
      T01612_A9994HreAcCol = new String[] {""} ;
      T01612_n9994HreAcCol = new boolean[] {false} ;
      T01612_A9995HreAcNumC = new int[1] ;
      T01612_n9995HreAcNumC = new boolean[] {false} ;
      T01612_A396EmprCod = new String[] {""} ;
      T016120_A396EmprCod = new String[] {""} ;
      T016120_A4492HreBarCod = new int[1] ;
      T016120_A4493HreBarReo = new byte[1] ;
      T016120_A4494HreBarPar = new String[] {""} ;
      T016120_A4495HreNumCie = new byte[1] ;
      T016120_A9985HreAcCod = new int[1] ;
      T016120_A9986HreAcReo = new byte[1] ;
      T016120_A9987HreAcPar = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T016121_A407EmprNom = new String[] {""} ;
      T016121_n407EmprNom = new boolean[] {false} ;
      ZV17UsurCod = "" ;
      ZZ396EmprCod = "" ;
      ZZ4494HreBarPar = "" ;
      ZZ407EmprNom = "" ;
      ZZ4496HreMaqHdr = "" ;
      ZZV17UsurCod = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.thishra__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thishra__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thishra__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thishra__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thishra__default(),
         new Object[] {
             new Object[] {
            T01612_A4492HreBarCod, T01612_A4493HreBarReo, T01612_A4494HreBarPar, T01612_A4495HreNumCie, T01612_A9985HreAcCod, T01612_A9986HreAcReo, T01612_A9987HreAcPar, T01612_A9988HreAcKgm, T01612_n9988HreAcKgm, T01612_A9989HreAcMtr,
            T01612_n9989HreAcMtr, T01612_A9990HreAcPie, T01612_n9990HreAcPie, T01612_A9991HreAcCli, T01612_n9991HreAcCli, T01612_A9992HreAcSer, T01612_n9992HreAcSer, T01612_A9993HreAcDsc, T01612_n9993HreAcDsc, T01612_A9994HreAcCol,
            T01612_n9994HreAcCol, T01612_A9995HreAcNumC, T01612_n9995HreAcNumC, T01612_A396EmprCod
            }
            , new Object[] {
            T01613_A4492HreBarCod, T01613_A4493HreBarReo, T01613_A4494HreBarPar, T01613_A4495HreNumCie, T01613_A9985HreAcCod, T01613_A9986HreAcReo, T01613_A9987HreAcPar, T01613_A9988HreAcKgm, T01613_n9988HreAcKgm, T01613_A9989HreAcMtr,
            T01613_n9989HreAcMtr, T01613_A9990HreAcPie, T01613_n9990HreAcPie, T01613_A9991HreAcCli, T01613_n9991HreAcCli, T01613_A9992HreAcSer, T01613_n9992HreAcSer, T01613_A9993HreAcDsc, T01613_n9993HreAcDsc, T01613_A9994HreAcCol,
            T01613_n9994HreAcCol, T01613_A9995HreAcNumC, T01613_n9995HreAcNumC, T01613_A396EmprCod
            }
            , new Object[] {
            T01614_A4492HreBarCod, T01614_A4493HreBarReo, T01614_A4494HreBarPar, T01614_A4495HreNumCie, T01614_A4496HreMaqHdr, T01614_n4496HreMaqHdr, T01614_A396EmprCod
            }
            , new Object[] {
            T01615_A4492HreBarCod, T01615_A4493HreBarReo, T01615_A4494HreBarPar, T01615_A4495HreNumCie, T01615_A4496HreMaqHdr, T01615_n4496HreMaqHdr, T01615_A396EmprCod
            }
            , new Object[] {
            T01616_A407EmprNom, T01616_n407EmprNom
            }
            , new Object[] {
            T01617_A4492HreBarCod, T01617_A4493HreBarReo, T01617_A4494HreBarPar, T01617_A4495HreNumCie, T01617_A407EmprNom, T01617_n407EmprNom, T01617_A4496HreMaqHdr, T01617_n4496HreMaqHdr, T01617_A396EmprCod
            }
            , new Object[] {
            T01618_A396EmprCod, T01618_A4492HreBarCod, T01618_A4493HreBarReo, T01618_A4494HreBarPar, T01618_A4495HreNumCie
            }
            , new Object[] {
            T01619_A396EmprCod, T01619_A4492HreBarCod, T01619_A4493HreBarReo, T01619_A4494HreBarPar, T01619_A4495HreNumCie
            }
            , new Object[] {
            T016110_A396EmprCod, T016110_A4492HreBarCod, T016110_A4493HreBarReo, T016110_A4494HreBarPar, T016110_A4495HreNumCie
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016114_A396EmprCod, T016114_A4492HreBarCod, T016114_A4493HreBarReo, T016114_A4494HreBarPar, T016114_A4495HreNumCie
            }
            , new Object[] {
            T016115_A4492HreBarCod, T016115_A4493HreBarReo, T016115_A4494HreBarPar, T016115_A4495HreNumCie, T016115_A9985HreAcCod, T016115_A9986HreAcReo, T016115_A9987HreAcPar, T016115_A9988HreAcKgm, T016115_n9988HreAcKgm, T016115_A9989HreAcMtr,
            T016115_n9989HreAcMtr, T016115_A9990HreAcPie, T016115_n9990HreAcPie, T016115_A9991HreAcCli, T016115_n9991HreAcCli, T016115_A9992HreAcSer, T016115_n9992HreAcSer, T016115_A9993HreAcDsc, T016115_n9993HreAcDsc, T016115_A9994HreAcCol,
            T016115_n9994HreAcCol, T016115_A9995HreAcNumC, T016115_n9995HreAcNumC, T016115_A396EmprCod
            }
            , new Object[] {
            T016116_A396EmprCod, T016116_A4492HreBarCod, T016116_A4493HreBarReo, T016116_A4494HreBarPar, T016116_A4495HreNumCie, T016116_A9985HreAcCod, T016116_A9986HreAcReo, T016116_A9987HreAcPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016120_A396EmprCod, T016120_A4492HreBarCod, T016120_A4493HreBarReo, T016120_A4494HreBarPar, T016120_A4495HreNumCie, T016120_A9985HreAcCod, T016120_A9986HreAcReo, T016120_A9987HreAcPar
            }
            , new Object[] {
            T016121_A407EmprNom, T016121_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z4493HreBarReo ;
   private byte Z4495HreNumCie ;
   private byte Z9986HreAcReo ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A9986HreAcReo ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ4493HreBarReo ;
   private byte ZZ4495HreNumCie ;
   private short nRcdDeleted_1327 ;
   private short nRcdExists_1327 ;
   private short nIsMod_1327 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1327 ;
   private short RcdFound1327 ;
   private short nBlankRcdUsr1327 ;
   private short RcdFound675 ;
   private short nIsDirty_675 ;
   private short nIsDirty_1327 ;
   private int Z4492HreBarCod ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int Z9985HreAcCod ;
   private int Z9990HreAcPie ;
   private int Z9991HreAcCli ;
   private int Z9995HreAcNumC ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int A4492HreBarCod ;
   private int edtHreBarCod_Enabled ;
   private int edtHreBarReo_Enabled ;
   private int edtHreBarPar_Enabled ;
   private int edtHreNumCie_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtHreMaqHdr_Enabled ;
   private int edtavnRcdDeleted_1327_Enabled ;
   private int edtHreAcCod_Enabled ;
   private int edtHreAcReo_Enabled ;
   private int edtHreAcPar_Enabled ;
   private int edtHreAcKgm_Enabled ;
   private int edtHreAcMtr_Enabled ;
   private int edtHreAcPie_Enabled ;
   private int edtHreAcCli_Enabled ;
   private int edtHreAcSer_Enabled ;
   private int edtHreAcDsc_Enabled ;
   private int edtHreAcCol_Enabled ;
   private int edtHreAcNumC_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A9985HreAcCod ;
   private int A9990HreAcPie ;
   private int A9991HreAcCli ;
   private int A9995HreAcNumC ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtHreAcNumC_Enabled ;
   private int defedtHreAcCol_Enabled ;
   private int defedtHreAcSer_Enabled ;
   private int defedtHreAcCli_Enabled ;
   private int defedtHreAcPar_Enabled ;
   private int defedtHreAcReo_Enabled ;
   private int defedtHreAcCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtHreMaqHdr_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtHreNumCie_Backcolor ;
   private int edtHreBarPar_Backcolor ;
   private int edtHreBarReo_Backcolor ;
   private int edtHreBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ4492HreBarCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z9988HreAcKgm ;
   private java.math.BigDecimal Z9989HreAcMtr ;
   private java.math.BigDecimal A9988HreAcKgm ;
   private java.math.BigDecimal A9989HreAcMtr ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z4494HreBarPar ;
   private String Z4496HreMaqHdr ;
   private String Z9987HreAcPar ;
   private String Z9992HreAcSer ;
   private String Z9993HreAcDsc ;
   private String Z9994HreAcCol ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtHreBarCod_Internalname ;
   private String sGXsfl_55_idx="0001" ;
   private String edtHreAcCod_Title ;
   private String edtHreAcCod_Internalname ;
   private String edtHreAcReo_Title ;
   private String edtHreAcReo_Internalname ;
   private String edtHreAcPar_Title ;
   private String edtHreAcPar_Internalname ;
   private String edtHreAcCli_Title ;
   private String edtHreAcCli_Internalname ;
   private String edtHreAcSer_Title ;
   private String edtHreAcSer_Internalname ;
   private String edtHreAcCol_Title ;
   private String edtHreAcCol_Internalname ;
   private String edtHreAcNumC_Title ;
   private String edtHreAcNumC_Internalname ;
   private String edtHreAcKgm_Title ;
   private String edtHreAcKgm_Internalname ;
   private String edtHreAcMtr_Title ;
   private String edtHreAcMtr_Internalname ;
   private String edtHreAcPie_Title ;
   private String edtHreAcPie_Internalname ;
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
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtHreBarCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtHreBarReo_Internalname ;
   private String edtHreBarReo_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtHreBarPar_Internalname ;
   private String A4494HreBarPar ;
   private String edtHreBarPar_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtHreNumCie_Internalname ;
   private String edtHreNumCie_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtHreMaqHdr_Internalname ;
   private String A4496HreMaqHdr ;
   private String edtHreMaqHdr_Jsonclick ;
   private String sMode1327 ;
   private String edtavnRcdDeleted_1327_Internalname ;
   private String edtHreAcDsc_Internalname ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode675 ;
   private String GXCCtl ;
   private String A9987HreAcPar ;
   private String A9992HreAcSer ;
   private String A9993HreAcDsc ;
   private String A9994HreAcCol ;
   private String AV20Lit0 ;
   private String AV36LitFe ;
   private String AV21Lit1 ;
   private String AV22Lit2 ;
   private String AV23Lit3 ;
   private String AV24Lit4 ;
   private String AV25Lit5 ;
   private String AV26Lit6 ;
   private String AV27Lit7 ;
   private String AV30Lit10 ;
   private String AV37Lit11 ;
   private String AV38Lit12 ;
   private String AV39Lit13 ;
   private String AV40Lit14 ;
   private String AV41Lit15 ;
   private String AV42Lit16 ;
   private String AV43Lit17 ;
   private String AV44Lit18 ;
   private String AV31msg0 ;
   private String AV32msg1 ;
   private String AV33msg2 ;
   private String AV34msg3 ;
   private String AV35msg4 ;
   private String GXt_char1 ;
   private String AV19Station ;
   private String GXv_char2[] ;
   private String AV16EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1327_Jsonclick ;
   private String edtHreAcCod_Jsonclick ;
   private String edtHreAcReo_Jsonclick ;
   private String edtHreAcPar_Jsonclick ;
   private String edtHreAcKgm_Jsonclick ;
   private String edtHreAcMtr_Jsonclick ;
   private String edtHreAcPie_Jsonclick ;
   private String edtHreAcCli_Jsonclick ;
   private String edtHreAcSer_Jsonclick ;
   private String edtHreAcDsc_Jsonclick ;
   private String edtHreAcCol_Jsonclick ;
   private String edtHreAcNumC_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZV17UsurCod ;
   private String ZZ396EmprCod ;
   private String ZZ4494HreBarPar ;
   private String ZZ407EmprNom ;
   private String ZZ4496HreMaqHdr ;
   private String ZZV17UsurCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n4496HreMaqHdr ;
   private boolean returnInSub ;
   private boolean n9988HreAcKgm ;
   private boolean n9989HreAcMtr ;
   private boolean n9990HreAcPie ;
   private boolean n9991HreAcCli ;
   private boolean n9992HreAcSer ;
   private boolean n9993HreAcDsc ;
   private boolean n9994HreAcCol ;
   private boolean n9995HreAcNumC ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01616_A407EmprNom ;
   private boolean[] T01616_n407EmprNom ;
   private int[] T01617_A4492HreBarCod ;
   private byte[] T01617_A4493HreBarReo ;
   private String[] T01617_A4494HreBarPar ;
   private byte[] T01617_A4495HreNumCie ;
   private String[] T01617_A407EmprNom ;
   private boolean[] T01617_n407EmprNom ;
   private String[] T01617_A4496HreMaqHdr ;
   private boolean[] T01617_n4496HreMaqHdr ;
   private String[] T01617_A396EmprCod ;
   private String[] T01618_A396EmprCod ;
   private int[] T01618_A4492HreBarCod ;
   private byte[] T01618_A4493HreBarReo ;
   private String[] T01618_A4494HreBarPar ;
   private byte[] T01618_A4495HreNumCie ;
   private int[] T01615_A4492HreBarCod ;
   private byte[] T01615_A4493HreBarReo ;
   private String[] T01615_A4494HreBarPar ;
   private byte[] T01615_A4495HreNumCie ;
   private String[] T01615_A4496HreMaqHdr ;
   private boolean[] T01615_n4496HreMaqHdr ;
   private String[] T01615_A396EmprCod ;
   private String[] T01619_A396EmprCod ;
   private int[] T01619_A4492HreBarCod ;
   private byte[] T01619_A4493HreBarReo ;
   private String[] T01619_A4494HreBarPar ;
   private byte[] T01619_A4495HreNumCie ;
   private String[] T016110_A396EmprCod ;
   private int[] T016110_A4492HreBarCod ;
   private byte[] T016110_A4493HreBarReo ;
   private String[] T016110_A4494HreBarPar ;
   private byte[] T016110_A4495HreNumCie ;
   private int[] T01614_A4492HreBarCod ;
   private byte[] T01614_A4493HreBarReo ;
   private String[] T01614_A4494HreBarPar ;
   private byte[] T01614_A4495HreNumCie ;
   private String[] T01614_A4496HreMaqHdr ;
   private boolean[] T01614_n4496HreMaqHdr ;
   private String[] T01614_A396EmprCod ;
   private String[] T016114_A396EmprCod ;
   private int[] T016114_A4492HreBarCod ;
   private byte[] T016114_A4493HreBarReo ;
   private String[] T016114_A4494HreBarPar ;
   private byte[] T016114_A4495HreNumCie ;
   private int[] T016115_A4492HreBarCod ;
   private byte[] T016115_A4493HreBarReo ;
   private String[] T016115_A4494HreBarPar ;
   private byte[] T016115_A4495HreNumCie ;
   private int[] T016115_A9985HreAcCod ;
   private byte[] T016115_A9986HreAcReo ;
   private String[] T016115_A9987HreAcPar ;
   private java.math.BigDecimal[] T016115_A9988HreAcKgm ;
   private boolean[] T016115_n9988HreAcKgm ;
   private java.math.BigDecimal[] T016115_A9989HreAcMtr ;
   private boolean[] T016115_n9989HreAcMtr ;
   private int[] T016115_A9990HreAcPie ;
   private boolean[] T016115_n9990HreAcPie ;
   private int[] T016115_A9991HreAcCli ;
   private boolean[] T016115_n9991HreAcCli ;
   private String[] T016115_A9992HreAcSer ;
   private boolean[] T016115_n9992HreAcSer ;
   private String[] T016115_A9993HreAcDsc ;
   private boolean[] T016115_n9993HreAcDsc ;
   private String[] T016115_A9994HreAcCol ;
   private boolean[] T016115_n9994HreAcCol ;
   private int[] T016115_A9995HreAcNumC ;
   private boolean[] T016115_n9995HreAcNumC ;
   private String[] T016115_A396EmprCod ;
   private String[] T016116_A396EmprCod ;
   private int[] T016116_A4492HreBarCod ;
   private byte[] T016116_A4493HreBarReo ;
   private String[] T016116_A4494HreBarPar ;
   private byte[] T016116_A4495HreNumCie ;
   private int[] T016116_A9985HreAcCod ;
   private byte[] T016116_A9986HreAcReo ;
   private String[] T016116_A9987HreAcPar ;
   private int[] T01613_A4492HreBarCod ;
   private byte[] T01613_A4493HreBarReo ;
   private String[] T01613_A4494HreBarPar ;
   private byte[] T01613_A4495HreNumCie ;
   private int[] T01613_A9985HreAcCod ;
   private byte[] T01613_A9986HreAcReo ;
   private String[] T01613_A9987HreAcPar ;
   private java.math.BigDecimal[] T01613_A9988HreAcKgm ;
   private boolean[] T01613_n9988HreAcKgm ;
   private java.math.BigDecimal[] T01613_A9989HreAcMtr ;
   private boolean[] T01613_n9989HreAcMtr ;
   private int[] T01613_A9990HreAcPie ;
   private boolean[] T01613_n9990HreAcPie ;
   private int[] T01613_A9991HreAcCli ;
   private boolean[] T01613_n9991HreAcCli ;
   private String[] T01613_A9992HreAcSer ;
   private boolean[] T01613_n9992HreAcSer ;
   private String[] T01613_A9993HreAcDsc ;
   private boolean[] T01613_n9993HreAcDsc ;
   private String[] T01613_A9994HreAcCol ;
   private boolean[] T01613_n9994HreAcCol ;
   private int[] T01613_A9995HreAcNumC ;
   private boolean[] T01613_n9995HreAcNumC ;
   private String[] T01613_A396EmprCod ;
   private int[] T01612_A4492HreBarCod ;
   private byte[] T01612_A4493HreBarReo ;
   private String[] T01612_A4494HreBarPar ;
   private byte[] T01612_A4495HreNumCie ;
   private int[] T01612_A9985HreAcCod ;
   private byte[] T01612_A9986HreAcReo ;
   private String[] T01612_A9987HreAcPar ;
   private java.math.BigDecimal[] T01612_A9988HreAcKgm ;
   private boolean[] T01612_n9988HreAcKgm ;
   private java.math.BigDecimal[] T01612_A9989HreAcMtr ;
   private boolean[] T01612_n9989HreAcMtr ;
   private int[] T01612_A9990HreAcPie ;
   private boolean[] T01612_n9990HreAcPie ;
   private int[] T01612_A9991HreAcCli ;
   private boolean[] T01612_n9991HreAcCli ;
   private String[] T01612_A9992HreAcSer ;
   private boolean[] T01612_n9992HreAcSer ;
   private String[] T01612_A9993HreAcDsc ;
   private boolean[] T01612_n9993HreAcDsc ;
   private String[] T01612_A9994HreAcCol ;
   private boolean[] T01612_n9994HreAcCol ;
   private int[] T01612_A9995HreAcNumC ;
   private boolean[] T01612_n9995HreAcNumC ;
   private String[] T01612_A396EmprCod ;
   private String[] T016120_A396EmprCod ;
   private int[] T016120_A4492HreBarCod ;
   private byte[] T016120_A4493HreBarReo ;
   private String[] T016120_A4494HreBarPar ;
   private byte[] T016120_A4495HreNumCie ;
   private int[] T016120_A9985HreAcCod ;
   private byte[] T016120_A9986HreAcReo ;
   private String[] T016120_A9987HreAcPar ;
   private String[] T016121_A407EmprNom ;
   private boolean[] T016121_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thishra__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thishra__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thishra__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thishra__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thishra__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01612", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar, HreAcKgm, HreAcMtr, HreAcPie, HreAcCli, HreAcSer, HreAcDsc, HreAcCol, HreAcNumC, EmprCod FROM TXPHISHRA WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreAcCod = ? AND HreAcReo = ? AND HreAcPar = ?  FOR UPDATE OF HreAcKgm, HreAcMtr, HreAcPie, HreAcCli, HreAcSer, HreAcDsc, HreAcCol, HreAcNumC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01613", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar, HreAcKgm, HreAcMtr, HreAcPie, HreAcCli, HreAcSer, HreAcDsc, HreAcCol, HreAcNumC, EmprCod FROM TXPHISHRA WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreAcCod = ? AND HreAcReo = ? AND HreAcPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01614", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreMaqHdr, EmprCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ?  FOR UPDATE OF HreMaqHdr NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01615", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreMaqHdr, EmprCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01616", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01617", "SELECT /*+ FIRST_ROWS(100) */ TM1.HreBarCod, TM1.HreBarReo, TM1.HreBarPar, TM1.HreNumCie, T2.EmprNom, TM1.HreMaqHdr, TM1.EmprCod FROM (TXPHISREH TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.HreBarCod = ? and TM1.HreBarReo = ? and TM1.HreBarPar = ? and TM1.HreNumCie = ? ORDER BY TM1.EmprCod, TM1.HreBarCod, TM1.HreBarReo, TM1.HreBarPar, TM1.HreNumCie ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01618", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01619", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREH WHERE ( HreBarCod > ? or HreBarCod = ? and HreBarReo > ? or HreBarReo = ? and HreBarCod = ? and HreBarPar > ? or HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and HreNumCie > ?) and EmprCod = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016110", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREH WHERE ( HreBarCod < ? or HreBarCod = ? and HreBarReo < ? or HreBarReo = ? and HreBarCod = ? and HreBarPar < ? or HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and HreNumCie < ?) and EmprCod = ? ORDER BY EmprCod DESC, HreBarCod DESC, HreBarReo DESC, HreBarPar DESC, HreNumCie DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T016111", "INSERT INTO TXPHISREH(HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreMaqHdr, EmprCod, HreDisCli, CliCod, HreBarSer, HreBarDsc, HreTipArt, HreTipArtD, HreColNom, HreColNum, HreColNomC, HreColNumC, HreTipCol, HreTipColN, HreFecGen, HreFecCli, HreFecTin, HreFecFpr, HreBarMat, HreBarKgm, HreBarMtr, HreBarPie, HrePartCod, HreBarNMtr, HreBarNMez, HreNumTen, HreIntCod, HreIntDsc, HreNumTon, HreTotKgm, HreTotMtr, HreTotPie, HreNumColF, HreFamCodT, HreHilasa, HreEnsayo, HreOpa, HreOpn, HreLtsSR, HreLtsRs, HreAcaQm, HreRacab, HreFecAcb, HreAbs, HreLtsRc, HreHdrLts, HreFabs, HreDispCli, HreMacCod, HreNInter, HreCencId, HreCenDsc, HreComp1, HreComp2, HreUser, HreDiaHora, HreCdn2, HreCtw) VALUES(?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', 0, ' ', ' ', 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, 0, 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ')", GX_NOMASK, "TXPHISREH")
         ,new UpdateCursor("T016112", "UPDATE TXPHISREH SET HreMaqHdr=?  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ?", GX_NOMASK, "TXPHISREH")
         ,new UpdateCursor("T016113", "DELETE FROM TXPHISREH  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ?", GX_NOMASK, "TXPHISREH")
         ,new ForEachCursor("T016114", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREH WHERE EmprCod = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016115", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar, HreAcKgm, HreAcMtr, HreAcPie, HreAcCli, HreAcSer, HreAcDsc, HreAcCol, HreAcNumC, EmprCod FROM TXPHISHRA WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreAcCod = ? and HreAcReo = ? and HreAcPar = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016116", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar FROM TXPHISHRA WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreAcCod = ? AND HreAcReo = ? AND HreAcPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T016117", "INSERT INTO TXPHISHRA(HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar, HreAcKgm, HreAcMtr, HreAcPie, HreAcCli, HreAcSer, HreAcDsc, HreAcCol, HreAcNumC, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHISHRA")
         ,new UpdateCursor("T016118", "UPDATE TXPHISHRA SET HreAcKgm=?, HreAcMtr=?, HreAcPie=?, HreAcCli=?, HreAcSer=?, HreAcDsc=?, HreAcCol=?, HreAcNumC=?  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreAcCod = ? AND HreAcReo = ? AND HreAcPar = ?", GX_NOMASK, "TXPHISHRA")
         ,new UpdateCursor("T016119", "DELETE FROM TXPHISHRA  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreAcCod = ? AND HreAcReo = ? AND HreAcPar = ?", GX_NOMASK, "TXPHISHRA")
         ,new ForEachCursor("T016120", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar FROM TXPHISHRA WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016121", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 26);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(16, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 26);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(16, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 26);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(16, 3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 19 :
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
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 6);
               }
               stmt.setString(6, (String)parms[6], 3);
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
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 15 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[12]).intValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[14]).intValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[16], 16);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[18], 26);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[20], 13);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[22]).intValue());
               }
               stmt.setString(16, (String)parms[23], 3);
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 16);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 26);
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
               stmt.setString(9, (String)parms[16], 3);
               stmt.setInt(10, ((Number) parms[17]).intValue());
               stmt.setByte(11, ((Number) parms[18]).byteValue());
               stmt.setString(12, (String)parms[19], 1);
               stmt.setByte(13, ((Number) parms[20]).byteValue());
               stmt.setInt(14, ((Number) parms[21]).intValue());
               stmt.setByte(15, ((Number) parms[22]).byteValue());
               stmt.setString(16, (String)parms[23], 1);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

