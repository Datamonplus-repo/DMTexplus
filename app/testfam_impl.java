package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class testfam_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action5") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_5_1N11801( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A499GrpFamCod = (byte)(GXutil.lval( httpContext.GetPar( "GrpFamCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A499GrpFamCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
      {
         gxnrgrid2_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tarifa Estampacion, Familia Productos", ""), (short)(0)) ;
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

   public void gxnrgrid2_newrow_invoke( )
   {
      nRC_GXsfl_72 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_72"))) ;
      nGXsfl_72_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_72_idx"))) ;
      sGXsfl_72_idx = httpContext.GetPar( "sGXsfl_72_idx") ;
      A13167NumCilUlt = (short)(GXutil.lval( httpContext.GetPar( "NumCilUlt"))) ;
      n13167NumCilUlt = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid2_newrow( ) ;
      /* End function gxnrGrid2_newrow_invoke */
   }

   public testfam_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public testfam_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( testfam_impl.class ));
   }

   public testfam_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEstFam.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEstFam.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEstFam.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEstFam.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TEstFam.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEstFam.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEstFam.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEstFam.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEstFam.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEstFam.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEstFam.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEstFam.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEstFam.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEstFam.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEstFam.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEstFam.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion Articulo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEstFam.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEstFam.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol50( ) ;
      /* Save parent mode. */
      sMode1800 = Gx_mode ;
      nGXsfl_50_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1800 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1800 = (short)(1) ;
            scanStart1N11800( ) ;
            while ( RcdFound1800 != 0 )
            {
               init_level_properties1800( ) ;
               getByPrimaryKey1N11800( ) ;
               addRow1N11800( ) ;
               scanNext1N11800( ) ;
            }
            scanEnd1N11800( ) ;
            nBlankRcdCount1800 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1N11800( ) ;
         standaloneModal1N11800( ) ;
         sMode1800 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRow1N11800( ) ;
            edtGrpFamCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GRPFAMCOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGrpFamCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpFamCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtGrpFamDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GRPFAMDSC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGrpFamDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpFamDsc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtNumCilUlt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NUMCILULT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtNumCilUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumCilUlt_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_1800 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1N11800( ) ;
            }
            sendRow1N11800( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode1800 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1800 = (short)(5) ;
         nRcdExists_1800 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1N11800( ) ;
            while ( RcdFound1800 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_501800( ) ;
               init_level_properties1800( ) ;
               standaloneNotModal1N11800( ) ;
               getByPrimaryKey1N11800( ) ;
               standaloneModal1N11800( ) ;
               addRow1N11800( ) ;
               scanNext1N11800( ) ;
            }
            scanEnd1N11800( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1800 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_501800( ) ;
      initAll1N11800( ) ;
      init_level_properties1800( ) ;
      nRcdExists_1800 = (short)(0) ;
      nIsMod_1800 = (short)(0) ;
      nRcdDeleted_1800 = (short)(0) ;
      nBlankRcdCount1800 = (short)(nBlankRcdUsr1800+nBlankRcdCount1800) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1800 > 0 )
      {
         standaloneNotModal1N11800( ) ;
         standaloneModal1N11800( ) ;
         addRow1N11800( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtGrpFamCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1800 = (short)(nBlankRcdCount1800-1) ;
      }
      Gx_mode = sMode1800 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode1800 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEstFam.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEstFam.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEstFam.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEstFam.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TEstFam.htm");
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
      e111N12 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
            Z69ArtDsc = httpContext.cgiGet( "Z69ArtDsc") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            n65ArtCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
            n69ArtDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            /* Check if conditions changed and reset current page numbers */
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = httpContext.GetPar( "ArtCod") ;
               n65ArtCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
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
                        e111N12 ();
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
            initAll1N110( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1801_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1801_Enabled), 5, 0), !bGXsfl_72_Refreshing);
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
      disableAttributes1N110( ) ;
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

   public void confirm_1N10( )
   {
      beforeValidate1N110( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1N110( ) ;
         }
         else
         {
            checkExtendedTable1N110( ) ;
            if ( AnyError == 0 )
            {
               zm1N110( 7) ;
               zm1N110( 8) ;
            }
            closeExtendedTableCursors1N110( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode10 = Gx_mode ;
         confirm_1N11800( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode10 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1N10( ) ;
      }
   }

   public void confirm_1N11801( )
   {
      s13167NumCilUlt = O13167NumCilUlt ;
      n13167NumCilUlt = false ;
      nGXsfl_72_idx = 0 ;
      while ( nGXsfl_72_idx < nRC_GXsfl_72 )
      {
         readRow1N11801( ) ;
         if ( ( nRcdExists_1801 != 0 ) || ( nIsMod_1801 != 0 ) )
         {
            getKey1N11801( ) ;
            if ( ( nRcdExists_1801 == 0 ) && ( nRcdDeleted_1801 == 0 ) )
            {
               if ( RcdFound1801 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1N11801( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1N11801( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1N11801( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O13167NumCilUlt = A13167NumCilUlt ;
                     n13167NumCilUlt = false ;
                  }
               }
               else
               {
                  GXCCtl = "GRPFAMCOD_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtGrpFamCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1801 != 0 )
               {
                  if ( nRcdDeleted_1801 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1N11801( ) ;
                     load1N11801( ) ;
                     beforeValidate1N11801( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1N11801( ) ;
                        O13167NumCilUlt = A13167NumCilUlt ;
                        n13167NumCilUlt = false ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1801 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1N11801( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1N11801( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1N11801( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O13167NumCilUlt = A13167NumCilUlt ;
                           n13167NumCilUlt = false ;
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1801 == 0 )
                  {
                     GXCCtl = "GRPFAMCOD_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtGrpFamCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1801_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1801, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtNumCilLin_Internalname, GXutil.ltrim( localUtil.ntoc( A13168NumCilLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtNumCilMin_Internalname, GXutil.ltrim( localUtil.ntoc( A13169NumCilMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtNumCilMax_Internalname, GXutil.ltrim( localUtil.ntoc( A13170NumCilMax, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMtsLinUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A13175MtsLinUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13168NumCilLin_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( Z13168NumCilLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13169NumCilMin_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( Z13169NumCilMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13170NumCilMax_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( Z13170NumCilMax, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13175MtsLinUlt_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( Z13175MtsLinUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1801_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1801, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1801_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1801, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1801_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1801, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1801 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1801_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1801_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NUMCILLIN_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNumCilLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NUMCILMIN_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNumCilMin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NUMCILMAX_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNumCilMax_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MTSLINULT_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtsLinUlt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O13167NumCilUlt = s13167NumCilUlt ;
      n13167NumCilUlt = false ;
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1N11800( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1N11800( ) ;
         if ( ( nRcdExists_1800 != 0 ) || ( nIsMod_1800 != 0 ) )
         {
            getKey1N11800( ) ;
            if ( ( nRcdExists_1800 == 0 ) && ( nRcdDeleted_1800 == 0 ) )
            {
               if ( RcdFound1800 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1N11800( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1N11800( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1N11800( 10) ;
                     }
                     closeExtendedTableCursors1N11800( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode1800 = Gx_mode ;
                        confirm_1N11801( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode1800 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode1800 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "GRPFAMCOD_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtGrpFamCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1800 != 0 )
               {
                  if ( nRcdDeleted_1800 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1N11800( ) ;
                     load1N11800( ) ;
                     beforeValidate1N11800( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1N11800( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1800 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1N11800( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1N11800( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1N11800( 10) ;
                           }
                           closeExtendedTableCursors1N11800( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode1800 = Gx_mode ;
                              confirm_1N11801( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode1800 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode1800 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1800 == 0 )
                  {
                     GXCCtl = "GRPFAMCOD_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtGrpFamCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtGrpFamCod_Internalname, GXutil.ltrim( localUtil.ntoc( A499GrpFamCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGrpFamDsc_Internalname, GXutil.rtrim( A500GrpFamDsc)) ;
         httpContext.changePostValue( edtNumCilUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A13167NumCilUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z499GrpFamCod_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z499GrpFamCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13167NumCilUlt_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z13167NumCilUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T13167NumCilUlt_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( O13167NumCilUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_72_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_72, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1800_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1800, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1800_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1800, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1800_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1800, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1800 != 0 )
         {
            httpContext.changePostValue( "GRPFAMCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpFamCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GRPFAMDSC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpFamDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NUMCILULT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNumCilUlt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1N10( )
   {
   }

   public void e111N12( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      testfam_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV34Pgmname, (byte)(99), GXv_char2) ;
      testfam_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      testfam_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      testfam_impl.this.A396EmprCod = GXv_char2[0] ;
      testfam_impl.this.AV11EmprNom = GXv_char3[0] ;
      testfam_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1N110( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z69ArtDsc = T01N18_A69ArtDsc[0] ;
         }
         else
         {
            Z69ArtDsc = A69ArtDsc ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z65ArtCod = A65ArtCod ;
         Z69ArtDsc = A69ArtDsc ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV34Pgmname = "TEstFam" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      /* Using cursor T01N19 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01N19_A407EmprNom[0] ;
      n407EmprNom = T01N19_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(7);
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

   public void load1N110( )
   {
      /* Using cursor T01N111 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A407EmprNom = T01N111_A407EmprNom[0] ;
         n407EmprNom = T01N111_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01N111_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A69ArtDsc = T01N111_A69ArtDsc[0] ;
         n69ArtDsc = T01N111_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         zm1N110( -6) ;
      }
      pr_default.close(9);
      onLoadActions1N110( ) ;
   }

   public void onLoadActions1N110( )
   {
   }

   public void checkExtendedTable1N110( )
   {
      nIsDirty_10 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01N110 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01N110_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(8);
   }

   public void closeExtendedTableCursors1N110( )
   {
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_8( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01N112 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01N112_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey1N110( )
   {
      /* Using cursor T01N113 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
      else
      {
         RcdFound10 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01N18 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(T01N18_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1N110( 6) ;
         RcdFound10 = (short)(1) ;
         A65ArtCod = T01N18_A65ArtCod[0] ;
         n65ArtCod = T01N18_n65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A69ArtDsc = T01N18_A69ArtDsc[0] ;
         n69ArtDsc = T01N18_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A252CliCod = T01N18_A252CliCod[0] ;
         n252CliCod = T01N18_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1N110( ) ;
         if ( AnyError == 1 )
         {
            RcdFound10 = (short)(0) ;
            initializeNonKey1N110( ) ;
         }
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound10 = (short)(0) ;
         initializeNonKey1N110( ) ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey1N110( ) ;
      if ( RcdFound10 == 0 )
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
      RcdFound10 = (short)(0) ;
      /* Using cursor T01N114 */
      pr_default.execute(12, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A396EmprCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T01N114_A252CliCod[0] < A252CliCod ) || ( T01N114_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01N114_A65ArtCod[0], A65ArtCod) < 0 ) ) && ( GXutil.strcmp(T01N114_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T01N114_A252CliCod[0] > A252CliCod ) || ( T01N114_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01N114_A65ArtCod[0], A65ArtCod) > 0 ) ) && ( GXutil.strcmp(T01N114_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01N114_A252CliCod[0] ;
            n252CliCod = T01N114_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01N114_A65ArtCod[0] ;
            n65ArtCod = T01N114_n65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound10 = (short)(0) ;
      /* Using cursor T01N115 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A396EmprCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T01N115_A252CliCod[0] > A252CliCod ) || ( T01N115_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01N115_A65ArtCod[0], A65ArtCod) > 0 ) ) && ( GXutil.strcmp(T01N115_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T01N115_A252CliCod[0] < A252CliCod ) || ( T01N115_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01N115_A65ArtCod[0], A65ArtCod) < 0 ) ) && ( GXutil.strcmp(T01N115_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01N115_A252CliCod[0] ;
            n252CliCod = T01N115_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01N115_A65ArtCod[0] ;
            n65ArtCod = T01N115_n65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1N110( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1N110( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound10 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
            {
               A252CliCod = Z252CliCod ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = Z65ArtCod ;
               n65ArtCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
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
               update1N110( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1N110( ) ;
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
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1N110( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
      {
         A252CliCod = Z252CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = Z65ArtCod ;
         n65ArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
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
      getKey1N110( ) ;
      if ( RcdFound10 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
         {
            A252CliCod = Z252CliCod ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = Z65ArtCod ;
            n65ArtCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "testfam");
      GX_FocusControl = edtArtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1N10( ) ;
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
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtArtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1N110( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1N110( ) ;
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
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArtDsc_Internalname ;
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
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArtDsc_Internalname ;
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
      scanStart1N110( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound10 != 0 )
         {
            scanNext1N110( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1N110( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1N110( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01N17 */
         pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTICU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) || ( GXutil.strcmp(Z69ArtDsc, T01N17_A69ArtDsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z69ArtDsc, T01N17_A69ArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("testfam:[seudo value changed for attri]"+"ArtDsc");
               GXutil.writeLogRaw("Old: ",Z69ArtDsc);
               GXutil.writeLogRaw("Current: ",T01N17_A69ArtDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPARTICU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1N110( )
   {
      beforeValidate1N110( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N110( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1N110( 0) ;
         checkOptimisticConcurrency1N110( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1N110( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1N110( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01N116 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n69ArtDsc), A69ArtDsc, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
                  if ( (pr_default.getStatus(14) == 1) )
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
                        processLevel1N110( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1N10( ) ;
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
            load1N110( ) ;
         }
         endLevel1N110( ) ;
      }
      closeExtendedTableCursors1N110( ) ;
   }

   public void update1N110( )
   {
      beforeValidate1N110( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N110( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1N110( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1N110( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1N110( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01N117 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n69ArtDsc), A69ArtDsc, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTICU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1N110( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int5[0] = A252CliCod ;
                     GXv_char3[0] = A65ArtCod ;
                     new app.txparticuupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3) ;
                     testfam_impl.this.A396EmprCod = GXv_char4[0] ;
                     testfam_impl.this.A252CliCod = GXv_int5[0] ;
                     testfam_impl.this.A65ArtCod = GXv_char3[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1N110( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1N10( ) ;
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
         endLevel1N110( ) ;
      }
      closeExtendedTableCursors1N110( ) ;
   }

   public void deferredUpdate1N110( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1N110( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1N110( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1N110( ) ;
         afterConfirm1N110( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1N110( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01N118 */
               pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound10 == 0 )
                     {
                        initAll1N110( ) ;
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
                     resetCaption1N10( ) ;
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
      sMode10 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1N110( ) ;
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1N110( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01N119 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01N119_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(17);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01N120 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Familia Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01N121 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01N122 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01N123 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Consumos Lab. JBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01N124 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MEZCLAS CLIENTE MATERIAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01N125 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS COMPOSICION MEZCLAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01N126 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "recest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01N127 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01N128 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPEDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01N129 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCARC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01N130 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO PRECIOS ARTICULO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01N131 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INCREMENTO PRECIO INTENSIDAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01N132 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECIO GLOBA COLOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01N133 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TR02JL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01N134 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLATFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01N135 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTMQT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01N136 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PVPNITp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01N137 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEJART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01N138 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TNART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01N139 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTTEJ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01N140 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARTINa", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01N141 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTMAT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01N142 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01N143 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ESTAD.CLIENTE/ART/T.ART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01N144 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Modelos de Confección", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01N145 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "WebEmp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01N146 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ACATEXGB.WEBDIS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01N147 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSerie", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01N148 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRECO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01N149 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINPRE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01N150 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PedPro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01N151 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01N152 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01N153 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANBRL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01N154 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECAP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01N155 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARSER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01N156 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cod Calidad por Articulo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01N157 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTINT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01N158 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01N159 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01N160 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPREPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01N161 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01N162 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRETCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T01N163 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
      }
   }

   public void processNestedLevel1N11800( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1N11800( ) ;
         if ( ( nRcdExists_1800 != 0 ) || ( nIsMod_1800 != 0 ) )
         {
            standaloneNotModal1N11800( ) ;
            getKey1N11800( ) ;
            if ( ( nRcdExists_1800 == 0 ) && ( nRcdDeleted_1800 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1N11800( ) ;
            }
            else
            {
               if ( RcdFound1800 != 0 )
               {
                  if ( ( nRcdDeleted_1800 != 0 ) && ( nRcdExists_1800 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1N11800( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1800 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1N11800( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1800 == 0 )
                  {
                     GXCCtl = "GRPFAMCOD_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtGrpFamCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtGrpFamCod_Internalname, GXutil.ltrim( localUtil.ntoc( A499GrpFamCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGrpFamDsc_Internalname, GXutil.rtrim( A500GrpFamDsc)) ;
         httpContext.changePostValue( edtNumCilUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A13167NumCilUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z499GrpFamCod_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z499GrpFamCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13167NumCilUlt_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z13167NumCilUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T13167NumCilUlt_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( O13167NumCilUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_72_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_72, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1800_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1800, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1800_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1800, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1800_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1800, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1800 != 0 )
         {
            httpContext.changePostValue( "GRPFAMCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpFamCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GRPFAMDSC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpFamDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NUMCILULT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNumCilUlt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1N11800( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1800 = (short)(0) ;
      nIsMod_1800 = (short)(0) ;
      nRcdDeleted_1800 = (short)(0) ;
   }

   public void processLevel1N110( )
   {
      /* Save parent mode. */
      sMode10 = Gx_mode ;
      processNestedLevel1N11800( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1N110( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1N110( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "testfam");
         if ( AnyError == 0 )
         {
            confirmValues1N10( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "testfam");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1N110( )
   {
      /* Scan By routine */
      /* Using cursor T01N164 */
      pr_default.execute(62, new Object[] {A396EmprCod});
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(62) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A252CliCod = T01N164_A252CliCod[0] ;
         n252CliCod = T01N164_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01N164_A65ArtCod[0] ;
         n65ArtCod = T01N164_n65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1N110( )
   {
      /* Scan next routine */
      pr_default.readNext(62);
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(62) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A252CliCod = T01N164_A252CliCod[0] ;
         n252CliCod = T01N164_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01N164_A65ArtCod[0] ;
         n65ArtCod = T01N164_n65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
   }

   public void scanEnd1N110( )
   {
      pr_default.close(62);
   }

   public void afterConfirm1N110( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1N110( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1N110( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1N110( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1N110( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1N110( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1N110( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), true);
   }

   public void zm1N11800( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13167NumCilUlt = T01N15_A13167NumCilUlt[0] ;
         }
         else
         {
            Z13167NumCilUlt = A13167NumCilUlt ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z13167NumCilUlt = A13167NumCilUlt ;
         Z396EmprCod = A396EmprCod ;
         Z499GrpFamCod = A499GrpFamCod ;
         Z500GrpFamDsc = A500GrpFamDsc ;
      }
   }

   public void standaloneNotModal1N11800( )
   {
      edtNumCilUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNumCilUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumCilUlt_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void standaloneModal1N11800( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtGrpFamCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGrpFamCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpFamCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtGrpFamCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGrpFamCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpFamCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void load1N11800( )
   {
      /* Using cursor T01N165 */
      pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Byte.valueOf(A499GrpFamCod)});
      if ( (pr_default.getStatus(63) != 101) )
      {
         RcdFound1800 = (short)(1) ;
         A500GrpFamDsc = T01N165_A500GrpFamDsc[0] ;
         n500GrpFamDsc = T01N165_n500GrpFamDsc[0] ;
         A13167NumCilUlt = T01N165_A13167NumCilUlt[0] ;
         n13167NumCilUlt = T01N165_n13167NumCilUlt[0] ;
         zm1N11800( -9) ;
      }
      pr_default.close(63);
      onLoadActions1N11800( ) ;
   }

   public void onLoadActions1N11800( )
   {
   }

   public void checkExtendedTable1N11800( )
   {
      nIsDirty_1800 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1N11800( ) ;
      /* Using cursor T01N16 */
      pr_default.execute(4, new Object[] {A396EmprCod, Byte.valueOf(A499GrpFamCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         GXCCtl = "GRPFAMCOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRUFAM", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrpFamCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A500GrpFamDsc = T01N16_A500GrpFamDsc[0] ;
      n500GrpFamDsc = T01N16_n500GrpFamDsc[0] ;
      pr_default.close(4);
   }

   public void closeExtendedTableCursors1N11800( )
   {
      pr_default.close(4);
   }

   public void enableDisable1N11800( )
   {
   }

   public void gxload_10( String A396EmprCod ,
                          byte A499GrpFamCod )
   {
      /* Using cursor T01N166 */
      pr_default.execute(64, new Object[] {A396EmprCod, Byte.valueOf(A499GrpFamCod)});
      if ( (pr_default.getStatus(64) == 101) )
      {
         GXCCtl = "GRPFAMCOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRUFAM", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrpFamCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A500GrpFamDsc = T01N166_A500GrpFamDsc[0] ;
      n500GrpFamDsc = T01N166_n500GrpFamDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A500GrpFamDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(64) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(64);
   }

   public void getKey1N11800( )
   {
      /* Using cursor T01N167 */
      pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Byte.valueOf(A499GrpFamCod)});
      if ( (pr_default.getStatus(65) != 101) )
      {
         RcdFound1800 = (short)(1) ;
      }
      else
      {
         RcdFound1800 = (short)(0) ;
      }
      pr_default.close(65);
   }

   public void getByPrimaryKey1N11800( )
   {
      /* Using cursor T01N15 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Byte.valueOf(A499GrpFamCod)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01N15_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1N11800( 9) ;
         RcdFound1800 = (short)(1) ;
         initializeNonKey1N11800( ) ;
         A13167NumCilUlt = T01N15_A13167NumCilUlt[0] ;
         n13167NumCilUlt = T01N15_n13167NumCilUlt[0] ;
         A499GrpFamCod = T01N15_A499GrpFamCod[0] ;
         O13167NumCilUlt = A13167NumCilUlt ;
         n13167NumCilUlt = false ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z499GrpFamCod = A499GrpFamCod ;
         sMode1800 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1N11800( ) ;
         load1N11800( ) ;
         Gx_mode = sMode1800 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1800 = (short)(0) ;
         initializeNonKey1N11800( ) ;
         sMode1800 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1N11800( ) ;
         Gx_mode = sMode1800 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1N11800( ) ;
      }
      pr_default.close(3);
   }

   public void checkOptimisticConcurrency1N11800( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01N14 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Byte.valueOf(A499GrpFamCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEstTa0"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z13167NumCilUlt != T01N14_A13167NumCilUlt[0] ) )
         {
            if ( Z13167NumCilUlt != T01N14_A13167NumCilUlt[0] )
            {
               GXutil.writeLogln("testfam:[seudo value changed for attri]"+"NumCilUlt");
               GXutil.writeLogRaw("Old: ",Z13167NumCilUlt);
               GXutil.writeLogRaw("Current: ",T01N14_A13167NumCilUlt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPEstTa0"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1N11800( )
   {
      beforeValidate1N11800( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N11800( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1N11800( 0) ;
         checkOptimisticConcurrency1N11800( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1N11800( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1N11800( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01N168 */
                  pr_default.execute(66, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n13167NumCilUlt), Short.valueOf(A13167NumCilUlt), A396EmprCod, Byte.valueOf(A499GrpFamCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEstTa0");
                  if ( (pr_default.getStatus(66) == 1) )
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
                        processLevel1N11800( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
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
            load1N11800( ) ;
         }
         endLevel1N11800( ) ;
      }
      closeExtendedTableCursors1N11800( ) ;
   }

   public void update1N11800( )
   {
      beforeValidate1N11800( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N11800( ) ;
      }
      if ( ( nIsMod_1800 != 0 ) || ( nIsDirty_1800 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1N11800( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1N11800( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1N11800( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01N169 */
                     pr_default.execute(67, new Object[] {Boolean.valueOf(n13167NumCilUlt), Short.valueOf(A13167NumCilUlt), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Byte.valueOf(A499GrpFamCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEstTa0");
                     if ( (pr_default.getStatus(67) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEstTa0"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1N11800( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int5[0] = A252CliCod ;
                        GXv_char3[0] = A65ArtCod ;
                        new app.txparticuupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3) ;
                        testfam_impl.this.A396EmprCod = GXv_char4[0] ;
                        testfam_impl.this.A252CliCod = GXv_int5[0] ;
                        testfam_impl.this.A65ArtCod = GXv_char3[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel1N11800( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey1N11800( ) ;
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
            endLevel1N11800( ) ;
         }
      }
      closeExtendedTableCursors1N11800( ) ;
   }

   public void deferredUpdate1N11800( )
   {
   }

   public void delete1N11800( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1N11800( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1N11800( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1N11800( ) ;
         afterConfirm1N11800( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1N11800( ) ;
            if ( AnyError == 0 )
            {
               A13167NumCilUlt = O13167NumCilUlt ;
               n13167NumCilUlt = false ;
               scanStart1N11801( ) ;
               while ( RcdFound1801 != 0 )
               {
                  getByPrimaryKey1N11801( ) ;
                  delete1N11801( ) ;
                  scanNext1N11801( ) ;
                  O13167NumCilUlt = A13167NumCilUlt ;
                  n13167NumCilUlt = false ;
               }
               scanEnd1N11801( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01N170 */
                  pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Byte.valueOf(A499GrpFamCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEstTa0");
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
      }
      sMode1800 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1N11800( ) ;
      Gx_mode = sMode1800 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1N11800( )
   {
      standaloneModal1N11800( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01N171 */
         pr_default.execute(69, new Object[] {A396EmprCod, Byte.valueOf(A499GrpFamCod)});
         A500GrpFamDsc = T01N171_A500GrpFamDsc[0] ;
         n500GrpFamDsc = T01N171_n500GrpFamDsc[0] ;
         pr_default.close(69);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01N172 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Byte.valueOf(A499GrpFamCod)});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Intervalo de Metros", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
      }
   }

   public void processNestedLevel1N11801( )
   {
      s13167NumCilUlt = O13167NumCilUlt ;
      n13167NumCilUlt = false ;
      nGXsfl_72_idx = 0 ;
      while ( nGXsfl_72_idx < nRC_GXsfl_72 )
      {
         readRow1N11801( ) ;
         if ( ( nRcdExists_1801 != 0 ) || ( nIsMod_1801 != 0 ) )
         {
            standaloneNotModal1N11801( ) ;
            getKey1N11801( ) ;
            if ( ( nRcdExists_1801 == 0 ) && ( nRcdDeleted_1801 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1N11801( ) ;
            }
            else
            {
               if ( RcdFound1801 != 0 )
               {
                  if ( ( nRcdDeleted_1801 != 0 ) && ( nRcdExists_1801 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1N11801( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1801 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1N11801( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1801 == 0 )
                  {
                     GXCCtl = "GRPFAMCOD_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtGrpFamCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O13167NumCilUlt = A13167NumCilUlt ;
            n13167NumCilUlt = false ;
         }
         httpContext.changePostValue( edtavnRcdDeleted_1801_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1801, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtNumCilLin_Internalname, GXutil.ltrim( localUtil.ntoc( A13168NumCilLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtNumCilMin_Internalname, GXutil.ltrim( localUtil.ntoc( A13169NumCilMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtNumCilMax_Internalname, GXutil.ltrim( localUtil.ntoc( A13170NumCilMax, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMtsLinUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A13175MtsLinUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13168NumCilLin_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( Z13168NumCilLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13169NumCilMin_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( Z13169NumCilMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13170NumCilMax_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( Z13170NumCilMax, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13175MtsLinUlt_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( Z13175MtsLinUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1801_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1801, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1801_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1801, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1801_"+sGXsfl_72_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1801, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1801 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1801_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1801_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NUMCILLIN_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNumCilLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NUMCILMIN_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNumCilMin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NUMCILMAX_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNumCilMax_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MTSLINULT_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtsLinUlt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1N11801( ) ;
      if ( AnyError != 0 )
      {
         O13167NumCilUlt = s13167NumCilUlt ;
         n13167NumCilUlt = false ;
      }
      nRcdExists_1801 = (short)(0) ;
      nIsMod_1801 = (short)(0) ;
      nRcdDeleted_1801 = (short)(0) ;
   }

   public void processLevel1N11800( )
   {
      /* Save parent mode. */
      sMode1800 = Gx_mode ;
      processNestedLevel1N11801( ) ;
      if ( AnyError != 0 )
      {
         O13167NumCilUlt = s13167NumCilUlt ;
         n13167NumCilUlt = false ;
      }
      /* Restore parent mode. */
      Gx_mode = sMode1800 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01N173 */
      pr_default.execute(71, new Object[] {Boolean.valueOf(n13167NumCilUlt), Short.valueOf(A13167NumCilUlt), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Byte.valueOf(A499GrpFamCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEstTa0");
   }

   public void endLevel1N11800( )
   {
      pr_default.close(2);
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1N11800( )
   {
      /* Scan By routine */
      /* Using cursor T01N174 */
      pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      RcdFound1800 = (short)(0) ;
      if ( (pr_default.getStatus(72) != 101) )
      {
         RcdFound1800 = (short)(1) ;
         A499GrpFamCod = T01N174_A499GrpFamCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1N11800( )
   {
      /* Scan next routine */
      pr_default.readNext(72);
      RcdFound1800 = (short)(0) ;
      if ( (pr_default.getStatus(72) != 101) )
      {
         RcdFound1800 = (short)(1) ;
         A499GrpFamCod = T01N174_A499GrpFamCod[0] ;
      }
   }

   public void scanEnd1N11800( )
   {
      pr_default.close(72);
   }

   public void afterConfirm1N11800( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1N11800( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1N11800( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1N11800( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1N11800( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1N11800( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1N11800( )
   {
      edtGrpFamCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrpFamCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpFamCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtGrpFamDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrpFamDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpFamDsc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtNumCilUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNumCilUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumCilUlt_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void zm1N11801( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13169NumCilMin = T01N13_A13169NumCilMin[0] ;
            Z13170NumCilMax = T01N13_A13170NumCilMax[0] ;
            Z13175MtsLinUlt = T01N13_A13175MtsLinUlt[0] ;
         }
         else
         {
            Z13169NumCilMin = A13169NumCilMin ;
            Z13170NumCilMax = A13170NumCilMax ;
            Z13175MtsLinUlt = A13175MtsLinUlt ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z499GrpFamCod = A499GrpFamCod ;
         Z13168NumCilLin = A13168NumCilLin ;
         Z13169NumCilMin = A13169NumCilMin ;
         Z13170NumCilMax = A13170NumCilMax ;
         Z13175MtsLinUlt = A13175MtsLinUlt ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1N11801( )
   {
      edtNumCilUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNumCilUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumCilUlt_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void standaloneModal1N11801( )
   {
      if ( isIns( )  )
      {
         A13167NumCilUlt = (short)(O13167NumCilUlt+1) ;
         n13167NumCilUlt = false ;
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A13168NumCilLin = A13167NumCilUlt ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtNumCilLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtNumCilLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumCilLin_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      }
      else
      {
         edtNumCilLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtNumCilLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumCilLin_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      }
   }

   public void load1N11801( )
   {
      /* Using cursor T01N175 */
      pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin)});
      if ( (pr_default.getStatus(73) != 101) )
      {
         RcdFound1801 = (short)(1) ;
         A13169NumCilMin = T01N175_A13169NumCilMin[0] ;
         n13169NumCilMin = T01N175_n13169NumCilMin[0] ;
         A13170NumCilMax = T01N175_A13170NumCilMax[0] ;
         n13170NumCilMax = T01N175_n13170NumCilMax[0] ;
         A13175MtsLinUlt = T01N175_A13175MtsLinUlt[0] ;
         n13175MtsLinUlt = T01N175_n13175MtsLinUlt[0] ;
         zm1N11801( -11) ;
      }
      pr_default.close(73);
      onLoadActions1N11801( ) ;
   }

   public void onLoadActions1N11801( )
   {
   }

   public void checkExtendedTable1N11801( )
   {
      nIsDirty_1801 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1N11801( ) ;
   }

   public void closeExtendedTableCursors1N11801( )
   {
   }

   public void enableDisable1N11801( )
   {
   }

   public void getKey1N11801( )
   {
      /* Using cursor T01N176 */
      pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin)});
      if ( (pr_default.getStatus(74) != 101) )
      {
         RcdFound1801 = (short)(1) ;
      }
      else
      {
         RcdFound1801 = (short)(0) ;
      }
      pr_default.close(74);
   }

   public void getByPrimaryKey1N11801( )
   {
      /* Using cursor T01N13 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01N13_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1N11801( 11) ;
         RcdFound1801 = (short)(1) ;
         initializeNonKey1N11801( ) ;
         A13168NumCilLin = T01N13_A13168NumCilLin[0] ;
         A13169NumCilMin = T01N13_A13169NumCilMin[0] ;
         n13169NumCilMin = T01N13_n13169NumCilMin[0] ;
         A13170NumCilMax = T01N13_A13170NumCilMax[0] ;
         n13170NumCilMax = T01N13_n13170NumCilMax[0] ;
         A13175MtsLinUlt = T01N13_A13175MtsLinUlt[0] ;
         n13175MtsLinUlt = T01N13_n13175MtsLinUlt[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z499GrpFamCod = A499GrpFamCod ;
         Z13168NumCilLin = A13168NumCilLin ;
         sMode1801 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1N11801( ) ;
         load1N11801( ) ;
         Gx_mode = sMode1801 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1801 = (short)(0) ;
         initializeNonKey1N11801( ) ;
         sMode1801 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1N11801( ) ;
         Gx_mode = sMode1801 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1N11801( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1N11801( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01N12 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEstTa1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z13169NumCilMin != T01N12_A13169NumCilMin[0] ) || ( Z13170NumCilMax != T01N12_A13170NumCilMax[0] ) || ( Z13175MtsLinUlt != T01N12_A13175MtsLinUlt[0] ) )
         {
            if ( Z13169NumCilMin != T01N12_A13169NumCilMin[0] )
            {
               GXutil.writeLogln("testfam:[seudo value changed for attri]"+"NumCilMin");
               GXutil.writeLogRaw("Old: ",Z13169NumCilMin);
               GXutil.writeLogRaw("Current: ",T01N12_A13169NumCilMin[0]);
            }
            if ( Z13170NumCilMax != T01N12_A13170NumCilMax[0] )
            {
               GXutil.writeLogln("testfam:[seudo value changed for attri]"+"NumCilMax");
               GXutil.writeLogRaw("Old: ",Z13170NumCilMax);
               GXutil.writeLogRaw("Current: ",T01N12_A13170NumCilMax[0]);
            }
            if ( Z13175MtsLinUlt != T01N12_A13175MtsLinUlt[0] )
            {
               GXutil.writeLogln("testfam:[seudo value changed for attri]"+"MtsLinUlt");
               GXutil.writeLogRaw("Old: ",Z13175MtsLinUlt);
               GXutil.writeLogRaw("Current: ",T01N12_A13175MtsLinUlt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPEstTa1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1N11801( )
   {
      beforeValidate1N11801( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N11801( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1N11801( 0) ;
         checkOptimisticConcurrency1N11801( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1N11801( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1N11801( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01N177 */
                  pr_default.execute(75, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin), Boolean.valueOf(n13169NumCilMin), Short.valueOf(A13169NumCilMin), Boolean.valueOf(n13170NumCilMax), Short.valueOf(A13170NumCilMax), Boolean.valueOf(n13175MtsLinUlt), Short.valueOf(A13175MtsLinUlt), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEstTa1");
                  if ( (pr_default.getStatus(75) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ || true /* After */ )
                     {
                        httpContext.wjLoc = formatLink("app.testmts", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.ltrimstr(A499GrpFamCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(A13168NumCilLin,4,0))}, new String[] {"EmprCod","CliCod","ArtCod","GrpFamCod","NumCilLin"})  ;
                     }
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
            load1N11801( ) ;
         }
         endLevel1N11801( ) ;
      }
      closeExtendedTableCursors1N11801( ) ;
   }

   public void update1N11801( )
   {
      beforeValidate1N11801( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N11801( ) ;
      }
      if ( ( nIsMod_1801 != 0 ) || ( nIsDirty_1801 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1N11801( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1N11801( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1N11801( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01N178 */
                     pr_default.execute(76, new Object[] {Boolean.valueOf(n13169NumCilMin), Short.valueOf(A13169NumCilMin), Boolean.valueOf(n13170NumCilMax), Short.valueOf(A13170NumCilMax), Boolean.valueOf(n13175MtsLinUlt), Short.valueOf(A13175MtsLinUlt), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEstTa1");
                     if ( (pr_default.getStatus(76) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEstTa1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1N11801( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int5[0] = A252CliCod ;
                        GXv_char3[0] = A65ArtCod ;
                        new app.txparticuupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3) ;
                        testfam_impl.this.A396EmprCod = GXv_char4[0] ;
                        testfam_impl.this.A252CliCod = GXv_int5[0] ;
                        testfam_impl.this.A65ArtCod = GXv_char3[0] ;
                        /* Start of After( update) rules */
                        if ( true /* After */ || true /* After */ )
                        {
                           httpContext.wjLoc = formatLink("app.testmts", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.ltrimstr(A499GrpFamCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(A13168NumCilLin,4,0))}, new String[] {"EmprCod","CliCod","ArtCod","GrpFamCod","NumCilLin"})  ;
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1N11801( ) ;
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
            endLevel1N11801( ) ;
         }
      }
      closeExtendedTableCursors1N11801( ) ;
   }

   public void deferredUpdate1N11801( )
   {
   }

   public void delete1N11801( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1N11801( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1N11801( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1N11801( ) ;
         afterConfirm1N11801( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1N11801( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01N179 */
               pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEstTa1");
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
      sMode1801 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1N11801( ) ;
      Gx_mode = sMode1801 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1N11801( )
   {
      standaloneModal1N11801( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01N180 */
         pr_default.execute(78, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Byte.valueOf(A499GrpFamCod), Short.valueOf(A13168NumCilLin)});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Intervalo de Metros", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
      }
   }

   public void endLevel1N11801( )
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

   public void scanStart1N11801( )
   {
      /* Scan By routine */
      /* Using cursor T01N181 */
      pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Byte.valueOf(A499GrpFamCod)});
      RcdFound1801 = (short)(0) ;
      if ( (pr_default.getStatus(79) != 101) )
      {
         RcdFound1801 = (short)(1) ;
         A13168NumCilLin = T01N181_A13168NumCilLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1N11801( )
   {
      /* Scan next routine */
      pr_default.readNext(79);
      RcdFound1801 = (short)(0) ;
      if ( (pr_default.getStatus(79) != 101) )
      {
         RcdFound1801 = (short)(1) ;
         A13168NumCilLin = T01N181_A13168NumCilLin[0] ;
      }
   }

   public void scanEnd1N11801( )
   {
      pr_default.close(79);
   }

   public void afterConfirm1N11801( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1N11801( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1N11801( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1N11801( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1N11801( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1N11801( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1N11801( )
   {
      edtNumCilLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNumCilLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumCilLin_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtNumCilMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNumCilMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumCilMin_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtNumCilMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNumCilMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumCilMax_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtMtsLinUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtsLinUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtsLinUlt_Enabled), 5, 0), !bGXsfl_72_Refreshing);
   }

   public void send_integrity_lvl_hashes1N11801( )
   {
   }

   public void send_integrity_lvl_hashes1N11800( )
   {
   }

   public void send_integrity_lvl_hashes1N110( )
   {
   }

   public void subsflControlProps_501800( )
   {
      lblTextblock7_Internalname = "TEXTBLOCK7_"+sGXsfl_50_idx ;
      edtGrpFamCod_Internalname = "GRPFAMCOD_"+sGXsfl_50_idx ;
      lblTextblock8_Internalname = "TEXTBLOCK8_"+sGXsfl_50_idx ;
      edtGrpFamDsc_Internalname = "GRPFAMDSC_"+sGXsfl_50_idx ;
      lblTextblock9_Internalname = "TEXTBLOCK9_"+sGXsfl_50_idx ;
      edtNumCilUlt_Internalname = "NUMCILULT_"+sGXsfl_50_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_501800( )
   {
      lblTextblock7_Internalname = "TEXTBLOCK7_"+sGXsfl_50_fel_idx ;
      edtGrpFamCod_Internalname = "GRPFAMCOD_"+sGXsfl_50_fel_idx ;
      lblTextblock8_Internalname = "TEXTBLOCK8_"+sGXsfl_50_fel_idx ;
      edtGrpFamDsc_Internalname = "GRPFAMDSC_"+sGXsfl_50_fel_idx ;
      lblTextblock9_Internalname = "TEXTBLOCK9_"+sGXsfl_50_fel_idx ;
      edtNumCilUlt_Internalname = "NUMCILULT_"+sGXsfl_50_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_50_fel_idx ;
   }

   public void addRow1N11800( )
   {
      nRC_GXsfl_72 = 0 ;
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501800( ) ;
      sendRow1N11800( ) ;
   }

   public void sendRow1N11800( )
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
      /* Start of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_50_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_50_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_50_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock7_Internalname,httpContext.getMessage( "Codigo Familia", ""),"","",lblTextblock7_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1800_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGrpFamCod_Internalname,GXutil.ltrim( localUtil.ntoc( A499GrpFamCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A499GrpFamCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGrpFamCod_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtGrpFamCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(2),"chr",Integer.valueOf(1),"row",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock8_Internalname,httpContext.getMessage( "Descripcion Familia", ""),"","",lblTextblock8_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGrpFamDsc_Internalname,GXutil.rtrim( A500GrpFamDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGrpFamDsc_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtGrpFamDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(30),"chr",Integer.valueOf(1),"row",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock9_Internalname,httpContext.getMessage( "Ultimo Cilindro", ""),"","",lblTextblock9_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNumCilUlt_Internalname,GXutil.ltrim( localUtil.ntoc( A13167NumCilUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtNumCilUlt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13167NumCilUlt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13167NumCilUlt), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNumCilUlt_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtNumCilUlt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /*  Child Grid Control  */
      Grid1Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Grid2Container"});
      if ( isAjaxCallMode( ) )
      {
         Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Grid2Container.Clear();
      }
      startgridcontrol72( ) ;
      nGXsfl_72_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1801 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1801 = (short)(1) ;
            scanStart1N11801( ) ;
            while ( RcdFound1801 != 0 )
            {
               init_level_properties1801( ) ;
               getByPrimaryKey1N11801( ) ;
               addRow1N11801( ) ;
               scanNext1N11801( ) ;
            }
            scanEnd1N11801( ) ;
            nBlankRcdCount1801 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B13167NumCilUlt = A13167NumCilUlt ;
         n13167NumCilUlt = false ;
         standaloneNotModal1N11801( ) ;
         standaloneModal1N11801( ) ;
         sMode1801 = Gx_mode ;
         while ( nGXsfl_72_idx < nRC_GXsfl_72 )
         {
            bGXsfl_72_Refreshing = true ;
            readRow1N11801( ) ;
            edtavnRcdDeleted_1801_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1801_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1801_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1801_Enabled), 5, 0), !bGXsfl_72_Refreshing);
            edtNumCilLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NUMCILLIN_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtNumCilLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumCilLin_Enabled), 5, 0), !bGXsfl_72_Refreshing);
            edtNumCilMin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NUMCILMIN_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtNumCilMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumCilMin_Enabled), 5, 0), !bGXsfl_72_Refreshing);
            edtNumCilMax_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NUMCILMAX_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtNumCilMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumCilMax_Enabled), 5, 0), !bGXsfl_72_Refreshing);
            edtMtsLinUlt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MTSLINULT_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMtsLinUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtsLinUlt_Enabled), 5, 0), !bGXsfl_72_Refreshing);
            if ( ( nRcdExists_1801 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1N11801( ) ;
            }
            sendRow1N11801( ) ;
            bGXsfl_72_Refreshing = false ;
         }
         Gx_mode = sMode1801 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A13167NumCilUlt = B13167NumCilUlt ;
         n13167NumCilUlt = false ;
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1801 = (short)(5) ;
         nRcdExists_1801 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1N11801( ) ;
            while ( RcdFound1801 != 0 )
            {
               sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx+1), 4, 0), (short)(4), "0") + sGXsfl_50_idx ;
               subsflControlProps_721801( ) ;
               init_level_properties1801( ) ;
               standaloneNotModal1N11801( ) ;
               getByPrimaryKey1N11801( ) ;
               standaloneModal1N11801( ) ;
               addRow1N11801( ) ;
               scanNext1N11801( ) ;
            }
            scanEnd1N11801( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1801 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx+1), 4, 0), (short)(4), "0") + sGXsfl_50_idx ;
      subsflControlProps_721801( ) ;
      initAll1N11801( ) ;
      init_level_properties1801( ) ;
      B13167NumCilUlt = A13167NumCilUlt ;
      n13167NumCilUlt = false ;
      nRcdExists_1801 = (short)(0) ;
      nIsMod_1801 = (short)(0) ;
      nRcdDeleted_1801 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 50 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_50_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1801 = (short)(nBlankRcdUsr1801+nBlankRcdCount1801) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1801 > 0 )
      {
         standaloneNotModal1N11801( ) ;
         standaloneModal1N11801( ) ;
         addRow1N11801( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtNumCilLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1801 = (short)(nBlankRcdCount1801-1) ;
      }
      Gx_mode = sMode1801 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A13167NumCilUlt = B13167NumCilUlt ;
      n13167NumCilUlt = false ;
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_50_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_50_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_50_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1N11800( ) ;
      GXCCtl = "Z499GrpFamCod_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z499GrpFamCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13167NumCilUlt_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13167NumCilUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O13167NumCilUlt_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O13167NumCilUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_72_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_72_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1800_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1800, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1800_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1800, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1800_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1800, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vGXBSCREEN_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRPFAMCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpFamCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRPFAMDSC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpFamDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "NUMCILULT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNumCilUlt_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_50_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1N11800( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501800( ) ;
      edtGrpFamCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GRPFAMCOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGrpFamDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GRPFAMDSC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtNumCilUlt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NUMCILULT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGrpFamCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGrpFamCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "GRPFAMCOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrpFamCod_Internalname ;
         wbErr = true ;
         A499GrpFamCod = (byte)(0) ;
      }
      else
      {
         A499GrpFamCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtGrpFamCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A500GrpFamDsc = httpContext.cgiGet( edtGrpFamDsc_Internalname) ;
      n500GrpFamDsc = false ;
      A13167NumCilUlt = (short)(localUtil.ctol( httpContext.cgiGet( edtNumCilUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n13167NumCilUlt = false ;
      GXCCtl = "Z499GrpFamCod_" + sGXsfl_50_idx ;
      Z499GrpFamCod = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13167NumCilUlt_" + sGXsfl_50_idx ;
      Z13167NumCilUlt = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O13167NumCilUlt_" + sGXsfl_50_idx ;
      O13167NumCilUlt = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_72_" + sGXsfl_50_idx ;
      nRC_GXsfl_72 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1800_" + sGXsfl_50_idx ;
      nRcdDeleted_1800 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1800_" + sGXsfl_50_idx ;
      nRcdExists_1800 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1800_" + sGXsfl_50_idx ;
      nIsMod_1800 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "vGXBSCREEN_" + sGXsfl_50_idx ;
      Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_72_" + sGXsfl_50_idx ;
      nRC_GXsfl_72 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_721801( )
   {
      edtavnRcdDeleted_1801_Internalname = "vNRCDDELETED_1801_"+sGXsfl_72_idx ;
      edtNumCilLin_Internalname = "NUMCILLIN_"+sGXsfl_72_idx ;
      edtNumCilMin_Internalname = "NUMCILMIN_"+sGXsfl_72_idx ;
      edtNumCilMax_Internalname = "NUMCILMAX_"+sGXsfl_72_idx ;
      edtMtsLinUlt_Internalname = "MTSLINULT_"+sGXsfl_72_idx ;
   }

   public void subsflControlProps_fel_721801( )
   {
      edtavnRcdDeleted_1801_Internalname = "vNRCDDELETED_1801_"+sGXsfl_72_fel_idx ;
      edtNumCilLin_Internalname = "NUMCILLIN_"+sGXsfl_72_fel_idx ;
      edtNumCilMin_Internalname = "NUMCILMIN_"+sGXsfl_72_fel_idx ;
      edtNumCilMax_Internalname = "NUMCILMAX_"+sGXsfl_72_fel_idx ;
      edtMtsLinUlt_Internalname = "MTSLINULT_"+sGXsfl_72_fel_idx ;
   }

   public void addRow1N11801( )
   {
      nGXsfl_72_idx = (int)(nGXsfl_72_idx+1) ;
      sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") + sGXsfl_50_idx ;
      subsflControlProps_721801( ) ;
      sendRow1N11801( ) ;
   }

   public void sendRow1N11801( )
   {
      Grid2Row = GXWebRow.GetNew(context) ;
      if ( subGrid2_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         subGrid2_Backcolor = subGrid2_Allbackcolor ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Uniform" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
         subGrid2_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid2_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_72_idx) % (2))) == 0 )
         {
            subGrid2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Even" ;
            }
         }
         else
         {
            subGrid2_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1801_" + sGXsfl_72_idx + "',1);gx.fn.setControlValue('nIsMod_1800_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_72_idx + "',72)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1801_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1801, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1801_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1801), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1801), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1801_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1801_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1801_" + sGXsfl_72_idx + "',1);gx.fn.setControlValue('nIsMod_1800_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_72_idx + "',72)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNumCilLin_Internalname,GXutil.ltrim( localUtil.ntoc( A13168NumCilLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13168NumCilLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNumCilLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtNumCilLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1801_" + sGXsfl_72_idx + "',1);gx.fn.setControlValue('nIsMod_1800_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_72_idx + "',72)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNumCilMin_Internalname,GXutil.ltrim( localUtil.ntoc( A13169NumCilMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtNumCilMin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13169NumCilMin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13169NumCilMin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNumCilMin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtNumCilMin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1801_" + sGXsfl_72_idx + "',1);gx.fn.setControlValue('nIsMod_1800_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_72_idx + "',72)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNumCilMax_Internalname,GXutil.ltrim( localUtil.ntoc( A13170NumCilMax, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtNumCilMax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13170NumCilMax), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13170NumCilMax), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNumCilMax_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtNumCilMax_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1801_" + sGXsfl_72_idx + "',1);gx.fn.setControlValue('nIsMod_1800_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_72_idx + "',72)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMtsLinUlt_Internalname,GXutil.ltrim( localUtil.ntoc( A13175MtsLinUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMtsLinUlt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13175MtsLinUlt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13175MtsLinUlt), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMtsLinUlt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMtsLinUlt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes1N11801( ) ;
      GXCCtl = "Z13168NumCilLin_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13168NumCilLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13169NumCilMin_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13169NumCilMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13170NumCilMax_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13170NumCilMax, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13175MtsLinUlt_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13175MtsLinUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1801_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1801, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1801_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1801, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1801_" + sGXsfl_72_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1801, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1801_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1801_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "NUMCILLIN_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNumCilLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "NUMCILMIN_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNumCilMin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "NUMCILMAX_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNumCilMax_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MTSLINULT_"+sGXsfl_72_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMtsLinUlt_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow1N11801( )
   {
      nGXsfl_72_idx = (int)(nGXsfl_72_idx+1) ;
      sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") + sGXsfl_50_idx ;
      subsflControlProps_721801( ) ;
      edtavnRcdDeleted_1801_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1801_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtNumCilLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NUMCILLIN_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtNumCilMin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NUMCILMIN_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtNumCilMax_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NUMCILMAX_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMtsLinUlt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MTSLINULT_"+sGXsfl_72_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1801_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1801_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1801");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1801_Internalname ;
         wbErr = true ;
         nRcdDeleted_1801 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1801 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1801_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNumCilLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNumCilLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "NUMCILLIN_" + sGXsfl_72_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtNumCilLin_Internalname ;
         wbErr = true ;
         A13168NumCilLin = (short)(0) ;
      }
      else
      {
         A13168NumCilLin = (short)(localUtil.ctol( httpContext.cgiGet( edtNumCilLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNumCilMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNumCilMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "NUMCILMIN_" + sGXsfl_72_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtNumCilMin_Internalname ;
         wbErr = true ;
         A13169NumCilMin = (short)(0) ;
         n13169NumCilMin = false ;
      }
      else
      {
         A13169NumCilMin = (short)(localUtil.ctol( httpContext.cgiGet( edtNumCilMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13169NumCilMin = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNumCilMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNumCilMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "NUMCILMAX_" + sGXsfl_72_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtNumCilMax_Internalname ;
         wbErr = true ;
         A13170NumCilMax = (short)(0) ;
         n13170NumCilMax = false ;
      }
      else
      {
         A13170NumCilMax = (short)(localUtil.ctol( httpContext.cgiGet( edtNumCilMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13170NumCilMax = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMtsLinUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMtsLinUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "MTSLINULT_" + sGXsfl_72_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMtsLinUlt_Internalname ;
         wbErr = true ;
         A13175MtsLinUlt = (short)(0) ;
         n13175MtsLinUlt = false ;
      }
      else
      {
         A13175MtsLinUlt = (short)(localUtil.ctol( httpContext.cgiGet( edtMtsLinUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13175MtsLinUlt = false ;
      }
      GXCCtl = "Z13168NumCilLin_" + sGXsfl_72_idx ;
      Z13168NumCilLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13169NumCilMin_" + sGXsfl_72_idx ;
      Z13169NumCilMin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13170NumCilMax_" + sGXsfl_72_idx ;
      Z13170NumCilMax = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13175MtsLinUlt_" + sGXsfl_72_idx ;
      Z13175MtsLinUlt = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1801_" + sGXsfl_72_idx ;
      nRcdDeleted_1801 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1801_" + sGXsfl_72_idx ;
      nRcdExists_1801 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1801_" + sGXsfl_72_idx ;
      nIsMod_1801 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtNumCilLin_Enabled = edtNumCilLin_Enabled ;
      defedtNumCilUlt_Enabled = edtNumCilUlt_Enabled ;
      defedtGrpFamCod_Enabled = edtGrpFamCod_Enabled ;
   }

   public void confirmValues1N10( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501800( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501800( ) ;
         httpContext.changePostValue( "Z499GrpFamCod_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z499GrpFamCod_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z499GrpFamCod_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z13167NumCilUlt_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z13167NumCilUlt_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13167NumCilUlt_"+sGXsfl_50_idx) ;
      }
      nGXsfl_72_idx = 0 ;
      sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") + sGXsfl_50_idx ;
      subsflControlProps_721801( ) ;
      while ( nGXsfl_72_idx < nRC_GXsfl_72 )
      {
         nGXsfl_72_idx = (int)(nGXsfl_72_idx+1) ;
         sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") + sGXsfl_50_idx ;
         subsflControlProps_721801( ) ;
         httpContext.changePostValue( "Z13168NumCilLin_"+sGXsfl_72_idx, httpContext.cgiGet( "ZT_"+"Z13168NumCilLin_"+sGXsfl_72_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13168NumCilLin_"+sGXsfl_72_idx) ;
         httpContext.changePostValue( "Z13169NumCilMin_"+sGXsfl_72_idx, httpContext.cgiGet( "ZT_"+"Z13169NumCilMin_"+sGXsfl_72_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13169NumCilMin_"+sGXsfl_72_idx) ;
         httpContext.changePostValue( "Z13170NumCilMax_"+sGXsfl_72_idx, httpContext.cgiGet( "ZT_"+"Z13170NumCilMax_"+sGXsfl_72_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13170NumCilMax_"+sGXsfl_72_idx) ;
         httpContext.changePostValue( "Z13175MtsLinUlt_"+sGXsfl_72_idx, httpContext.cgiGet( "ZT_"+"Z13175MtsLinUlt_"+sGXsfl_72_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13175MtsLinUlt_"+sGXsfl_72_idx) ;
      }
      httpContext.changePostValue( "O13167NumCilUlt", httpContext.cgiGet( "T13167NumCilUlt")) ;
      httpContext.deletePostValue( "T13167NumCilUlt") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.testfam", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV34Pgmname));
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
      return formatLink("app.testfam", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TEstFam" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tarifa Estampacion, Familia Productos", "") ;
   }

   public void initializeNonKey1N110( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A69ArtDsc = "" ;
      n69ArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      Z69ArtDsc = "" ;
   }

   public void initAll1N110( )
   {
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A65ArtCod = "" ;
      n65ArtCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      initializeNonKey1N110( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1N11800( )
   {
      A500GrpFamDsc = "" ;
      n500GrpFamDsc = false ;
      A13167NumCilUlt = (short)(0) ;
      n13167NumCilUlt = false ;
      O13167NumCilUlt = A13167NumCilUlt ;
      n13167NumCilUlt = false ;
      Z13167NumCilUlt = (short)(0) ;
   }

   public void initAll1N11800( )
   {
      A499GrpFamCod = (byte)(0) ;
      initializeNonKey1N11800( ) ;
   }

   public void standaloneModalInsert1N11800( )
   {
   }

   public void initializeNonKey1N11801( )
   {
      A13169NumCilMin = (short)(0) ;
      n13169NumCilMin = false ;
      A13170NumCilMax = (short)(0) ;
      n13170NumCilMax = false ;
      A13175MtsLinUlt = (short)(0) ;
      n13175MtsLinUlt = false ;
      Z13169NumCilMin = (short)(0) ;
      Z13170NumCilMax = (short)(0) ;
      Z13175MtsLinUlt = (short)(0) ;
   }

   public void initAll1N11801( )
   {
      A13168NumCilLin = (short)(0) ;
      initializeNonKey1N11801( ) ;
   }

   public void standaloneModalInsert1N11801( )
   {
      A13167NumCilUlt = i13167NumCilUlt ;
      n13167NumCilUlt = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415101776", true, true);
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
      httpContext.AddJavascriptSource("testfam.js", "?202682415101776", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1800( )
   {
      edtNumCilUlt_Enabled = defedtNumCilUlt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtNumCilUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumCilUlt_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtGrpFamCod_Enabled = defedtGrpFamCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrpFamCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpFamCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void init_level_properties1801( )
   {
      edtNumCilLin_Enabled = defedtNumCilLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtNumCilLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumCilLin_Enabled), 5, 0), !bGXsfl_72_Refreshing);
   }

   public void startgridcontrol50( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock7_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A499GrpFamCod, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpFamCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock8_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A500GrpFamDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpFamDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock9_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13167NumCilUlt, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtNumCilUlt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol72( )
   {
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("Header", subGrid2_Header);
      Grid2Container.AddObjectProperty("Class", "");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1801, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1801_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13168NumCilLin, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtNumCilLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13169NumCilMin, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtNumCilMin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13170NumCilMax, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtNumCilMax_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13175MtsLinUlt, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMtsLinUlt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtArtCod_Internalname = "ARTCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtGrpFamCod_Internalname = "GRPFAMCOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtGrpFamDsc_Internalname = "GRPFAMDSC" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtNumCilUlt_Internalname = "NUMCILULT" ;
      edtavnRcdDeleted_1801_Internalname = "vNRCDDELETED_1801" ;
      edtNumCilLin_Internalname = "NUMCILLIN" ;
      edtNumCilMin_Internalname = "NUMCILMIN" ;
      edtNumCilMax_Internalname = "NUMCILMAX" ;
      edtMtsLinUlt_Internalname = "MTSLINULT" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
      subGrid2_Internalname = "GRID2" ;
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
      subGrid2_Allowcollapsing = (byte)(0) ;
      subGrid2_Allowselection = (byte)(0) ;
      subGrid2_Header = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      lblTextblock9_Caption = httpContext.getMessage( "Ultimo Cilindro", "") ;
      lblTextblock8_Caption = httpContext.getMessage( "Descripcion Familia", "") ;
      lblTextblock7_Caption = httpContext.getMessage( "Codigo Familia", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Tarifa Estampacion, Familia Productos", "") );
      edtMtsLinUlt_Jsonclick = "" ;
      edtNumCilMax_Jsonclick = "" ;
      edtNumCilMin_Jsonclick = "" ;
      edtNumCilLin_Jsonclick = "" ;
      edtavnRcdDeleted_1801_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtNumCilUlt_Jsonclick = "" ;
      edtGrpFamDsc_Jsonclick = "" ;
      edtGrpFamCod_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtMtsLinUlt_Enabled = 1 ;
      edtNumCilMax_Enabled = 1 ;
      edtNumCilMin_Enabled = 1 ;
      edtNumCilLin_Enabled = 1 ;
      edtavnRcdDeleted_1801_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtNumCilUlt_Enabled = 0 ;
      edtGrpFamDsc_Enabled = 0 ;
      edtGrpFamCod_Enabled = 1 ;
      edtArtDsc_Jsonclick = "" ;
      edtArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtArtDsc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtArtCod_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
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

   public void xc_5_1N11801( )
   {
      if ( true /* After */ || true /* After */ )
      {
         httpContext.wjLoc = formatLink("app.testmts", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.ltrimstr(A499GrpFamCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(A13168NumCilLin,4,0))}, new String[] {"EmprCod","CliCod","ArtCod","GrpFamCod","NumCilLin"})  ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_501800( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1N11800( ) ;
         standaloneModal1N11800( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1N11800( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501800( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_721801( ) ;
      while ( nGXsfl_72_idx <= nRC_GXsfl_72 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1N11800( ) ;
         standaloneModal1N11800( ) ;
         standaloneNotModal1N11801( ) ;
         standaloneModal1N11801( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1N11801( ) ;
         nGXsfl_72_idx = (int)(nGXsfl_72_idx+1) ;
         sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") + sGXsfl_50_idx ;
         subsflControlProps_721801( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid2Container)) ;
      /* End function gxnrGrid2_newrow */
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
      /* Using cursor T01N182 */
      pr_default.execute(80, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(80) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01N182_A407EmprNom[0] ;
      n407EmprNom = T01N182_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(80);
      /* Using cursor T01N119 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01N119_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(17);
      GX_FocusControl = edtArtDsc_Internalname ;
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

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      /* Using cursor T01N119 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01N119_A279CliNom[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Artcod( )
   {
      n252CliCod = false ;
      n65ArtCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Grpfamcod( )
   {
      n500GrpFamDsc = false ;
      /* Using cursor T01N171 */
      pr_default.execute(69, new Object[] {A396EmprCod, Byte.valueOf(A499GrpFamCod)});
      if ( (pr_default.getStatus(69) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRUFAM", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRPFAMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrpFamCod_Internalname ;
      }
      A500GrpFamDsc = T01N171_A500GrpFamDsc[0] ;
      n500GrpFamDsc = T01N171_n500GrpFamDsc[0] ;
      pr_default.close(69);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A500GrpFamDsc", GXutil.rtrim( A500GrpFamDsc));
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
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ARTCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z407EmprNom'},{av:'Z69ArtDsc'},{av:'Z279CliNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_GRPFAMCOD","{handler:'valid_Grpfamcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A499GrpFamCod',fld:'GRPFAMCOD',pic:'Z9'},{av:'A500GrpFamDsc',fld:'GRPFAMDSC',pic:''}]");
      setEventMetadata("VALID_GRPFAMCOD",",oparms:[{av:'A500GrpFamDsc',fld:'GRPFAMDSC',pic:''}]}");
      setEventMetadata("VALID_NUMCILULT","{handler:'valid_Numcilult',iparms:[]");
      setEventMetadata("VALID_NUMCILULT",",oparms:[]}");
      setEventMetadata("VALID_NUMCILLIN","{handler:'valid_Numcillin',iparms:[]");
      setEventMetadata("VALID_NUMCILLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Mtslinult',iparms:[]");
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
      pr_default.close(17);
      pr_default.close(80);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z69ArtDsc = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      A65ArtCod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A69ArtDsc = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1800 = "" ;
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
      sMode10 = "" ;
      GXCCtl = "" ;
      A500GrpFamDsc = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T01N19_A407EmprNom = new String[] {""} ;
      T01N19_n407EmprNom = new boolean[] {false} ;
      T01N111_A65ArtCod = new String[] {""} ;
      T01N111_n65ArtCod = new boolean[] {false} ;
      T01N111_A407EmprNom = new String[] {""} ;
      T01N111_n407EmprNom = new boolean[] {false} ;
      T01N111_A279CliNom = new String[] {""} ;
      T01N111_A69ArtDsc = new String[] {""} ;
      T01N111_n69ArtDsc = new boolean[] {false} ;
      T01N111_A396EmprCod = new String[] {""} ;
      T01N111_A252CliCod = new int[1] ;
      T01N111_n252CliCod = new boolean[] {false} ;
      T01N110_A279CliNom = new String[] {""} ;
      T01N112_A279CliNom = new String[] {""} ;
      T01N113_A396EmprCod = new String[] {""} ;
      T01N113_A252CliCod = new int[1] ;
      T01N113_n252CliCod = new boolean[] {false} ;
      T01N113_A65ArtCod = new String[] {""} ;
      T01N113_n65ArtCod = new boolean[] {false} ;
      T01N18_A65ArtCod = new String[] {""} ;
      T01N18_n65ArtCod = new boolean[] {false} ;
      T01N18_A69ArtDsc = new String[] {""} ;
      T01N18_n69ArtDsc = new boolean[] {false} ;
      T01N18_A396EmprCod = new String[] {""} ;
      T01N18_A252CliCod = new int[1] ;
      T01N18_n252CliCod = new boolean[] {false} ;
      T01N114_A396EmprCod = new String[] {""} ;
      T01N114_A252CliCod = new int[1] ;
      T01N114_n252CliCod = new boolean[] {false} ;
      T01N114_A65ArtCod = new String[] {""} ;
      T01N114_n65ArtCod = new boolean[] {false} ;
      T01N115_A396EmprCod = new String[] {""} ;
      T01N115_A252CliCod = new int[1] ;
      T01N115_n252CliCod = new boolean[] {false} ;
      T01N115_A65ArtCod = new String[] {""} ;
      T01N115_n65ArtCod = new boolean[] {false} ;
      T01N17_A65ArtCod = new String[] {""} ;
      T01N17_n65ArtCod = new boolean[] {false} ;
      T01N17_A69ArtDsc = new String[] {""} ;
      T01N17_n69ArtDsc = new boolean[] {false} ;
      T01N17_A396EmprCod = new String[] {""} ;
      T01N17_A252CliCod = new int[1] ;
      T01N17_n252CliCod = new boolean[] {false} ;
      T01N119_A279CliNom = new String[] {""} ;
      T01N120_A396EmprCod = new String[] {""} ;
      T01N120_A252CliCod = new int[1] ;
      T01N120_n252CliCod = new boolean[] {false} ;
      T01N120_A65ArtCod = new String[] {""} ;
      T01N120_n65ArtCod = new boolean[] {false} ;
      T01N120_A499GrpFamCod = new byte[1] ;
      T01N121_A396EmprCod = new String[] {""} ;
      T01N121_A252CliCod = new int[1] ;
      T01N121_n252CliCod = new boolean[] {false} ;
      T01N121_A12814ARTConID = new String[] {""} ;
      T01N121_A65ArtCod = new String[] {""} ;
      T01N121_n65ArtCod = new boolean[] {false} ;
      T01N122_A396EmprCod = new String[] {""} ;
      T01N122_A252CliCod = new int[1] ;
      T01N122_n252CliCod = new boolean[] {false} ;
      T01N122_A65ArtCod = new String[] {""} ;
      T01N122_n65ArtCod = new boolean[] {false} ;
      T01N122_A12363SocInt = new byte[1] ;
      T01N123_A396EmprCod = new String[] {""} ;
      T01N123_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01N123_A5728JBCLLin = new short[1] ;
      T01N124_A396EmprCod = new String[] {""} ;
      T01N124_A252CliCod = new int[1] ;
      T01N124_n252CliCod = new boolean[] {false} ;
      T01N124_A5809MMezCod = new String[] {""} ;
      T01N124_A65ArtCod = new String[] {""} ;
      T01N124_n65ArtCod = new boolean[] {false} ;
      T01N125_A396EmprCod = new String[] {""} ;
      T01N125_A252CliCod = new int[1] ;
      T01N125_n252CliCod = new boolean[] {false} ;
      T01N125_A5234MezCod = new String[] {""} ;
      T01N125_A5240MezLin = new byte[1] ;
      T01N126_A396EmprCod = new String[] {""} ;
      T01N126_A252CliCod = new int[1] ;
      T01N126_n252CliCod = new boolean[] {false} ;
      T01N126_A65ArtCod = new String[] {""} ;
      T01N126_n65ArtCod = new boolean[] {false} ;
      T01N126_A4116estreclim = new int[1] ;
      T01N127_A396EmprCod = new String[] {""} ;
      T01N127_A252CliCod = new int[1] ;
      T01N127_n252CliCod = new boolean[] {false} ;
      T01N127_A65ArtCod = new String[] {""} ;
      T01N127_n65ArtCod = new boolean[] {false} ;
      T01N127_A4061EstNomCol = new String[] {""} ;
      T01N128_A396EmprCod = new String[] {""} ;
      T01N128_A9705ErpNped = new String[] {""} ;
      T01N128_A8652ErpLin = new short[1] ;
      T01N129_A396EmprCod = new String[] {""} ;
      T01N129_A252CliCod = new int[1] ;
      T01N129_n252CliCod = new boolean[] {false} ;
      T01N129_A65ArtCod = new String[] {""} ;
      T01N129_n65ArtCod = new boolean[] {false} ;
      T01N129_A7266CAAqP = new String[] {""} ;
      T01N130_A396EmprCod = new String[] {""} ;
      T01N130_A252CliCod = new int[1] ;
      T01N130_n252CliCod = new boolean[] {false} ;
      T01N130_A65ArtCod = new String[] {""} ;
      T01N130_n65ArtCod = new boolean[] {false} ;
      T01N130_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T01N131_A396EmprCod = new String[] {""} ;
      T01N131_A252CliCod = new int[1] ;
      T01N131_n252CliCod = new boolean[] {false} ;
      T01N131_A65ArtCod = new String[] {""} ;
      T01N131_n65ArtCod = new boolean[] {false} ;
      T01N131_A10972Int_cod = new byte[1] ;
      T01N132_A396EmprCod = new String[] {""} ;
      T01N132_A252CliCod = new int[1] ;
      T01N132_n252CliCod = new boolean[] {false} ;
      T01N132_A65ArtCod = new String[] {""} ;
      T01N132_n65ArtCod = new boolean[] {false} ;
      T01N132_A10577Pg_Procod = new String[] {""} ;
      T01N133_A396EmprCod = new String[] {""} ;
      T01N133_A252CliCod = new int[1] ;
      T01N133_n252CliCod = new boolean[] {false} ;
      T01N133_A65ArtCod = new String[] {""} ;
      T01N133_n65ArtCod = new boolean[] {false} ;
      T01N133_A10272Hz_cod = new String[] {""} ;
      T01N134_A396EmprCod = new String[] {""} ;
      T01N134_A252CliCod = new int[1] ;
      T01N134_n252CliCod = new boolean[] {false} ;
      T01N134_A65ArtCod = new String[] {""} ;
      T01N134_n65ArtCod = new boolean[] {false} ;
      T01N134_A10041ArtSH = new String[] {""} ;
      T01N135_A396EmprCod = new String[] {""} ;
      T01N135_A252CliCod = new int[1] ;
      T01N135_n252CliCod = new boolean[] {false} ;
      T01N135_A65ArtCod = new String[] {""} ;
      T01N135_n65ArtCod = new boolean[] {false} ;
      T01N135_A8427TipoCt = new String[] {""} ;
      T01N135_A8428CapMxMq = new int[1] ;
      T01N136_A396EmprCod = new String[] {""} ;
      T01N136_A252CliCod = new int[1] ;
      T01N136_n252CliCod = new boolean[] {false} ;
      T01N136_A65ArtCod = new String[] {""} ;
      T01N136_n65ArtCod = new boolean[] {false} ;
      T01N136_A8342CodPred = new short[1] ;
      T01N137_A396EmprCod = new String[] {""} ;
      T01N137_A252CliCod = new int[1] ;
      T01N137_n252CliCod = new boolean[] {false} ;
      T01N137_A65ArtCod = new String[] {""} ;
      T01N137_n65ArtCod = new boolean[] {false} ;
      T01N137_A8089ArtcodTj = new String[] {""} ;
      T01N138_A396EmprCod = new String[] {""} ;
      T01N138_A252CliCod = new int[1] ;
      T01N138_n252CliCod = new boolean[] {false} ;
      T01N138_A65ArtCod = new String[] {""} ;
      T01N138_n65ArtCod = new boolean[] {false} ;
      T01N138_A7956Mq_CodM = new String[] {""} ;
      T01N139_A396EmprCod = new String[] {""} ;
      T01N139_A252CliCod = new int[1] ;
      T01N139_n252CliCod = new boolean[] {false} ;
      T01N139_A65ArtCod = new String[] {""} ;
      T01N139_n65ArtCod = new boolean[] {false} ;
      T01N139_A7949Par_Art = new short[1] ;
      T01N140_A396EmprCod = new String[] {""} ;
      T01N140_A252CliCod = new int[1] ;
      T01N140_n252CliCod = new boolean[] {false} ;
      T01N140_A65ArtCod = new String[] {""} ;
      T01N140_n65ArtCod = new boolean[] {false} ;
      T01N140_A7135Lin_fast = new short[1] ;
      T01N141_A396EmprCod = new String[] {""} ;
      T01N141_A252CliCod = new int[1] ;
      T01N141_n252CliCod = new boolean[] {false} ;
      T01N141_A65ArtCod = new String[] {""} ;
      T01N141_n65ArtCod = new boolean[] {false} ;
      T01N141_A6954Mat_lin = new short[1] ;
      T01N142_A396EmprCod = new String[] {""} ;
      T01N142_A602MaqCod = new String[] {""} ;
      T01N142_A6078MaqCliCod = new int[1] ;
      T01N142_A6079MaqArtCod = new String[] {""} ;
      T01N143_A396EmprCod = new String[] {""} ;
      T01N143_A252CliCod = new int[1] ;
      T01N143_n252CliCod = new boolean[] {false} ;
      T01N143_A65ArtCod = new String[] {""} ;
      T01N143_n65ArtCod = new boolean[] {false} ;
      T01N143_A5382EstCatAny = new short[1] ;
      T01N143_A5383EstCatSer = new String[] {""} ;
      T01N143_A5384EstCatTip = new short[1] ;
      T01N144_A396EmprCod = new String[] {""} ;
      T01N144_A252CliCod = new int[1] ;
      T01N144_n252CliCod = new boolean[] {false} ;
      T01N144_A65ArtCod = new String[] {""} ;
      T01N144_n65ArtCod = new boolean[] {false} ;
      T01N144_A4658MdlCod = new String[] {""} ;
      T01N145_A396EmprCod = new String[] {""} ;
      T01N145_A252CliCod = new int[1] ;
      T01N145_n252CliCod = new boolean[] {false} ;
      T01N145_A4175WebEmpCod = new String[] {""} ;
      T01N146_A396EmprCod = new String[] {""} ;
      T01N146_A252CliCod = new int[1] ;
      T01N146_n252CliCod = new boolean[] {false} ;
      T01N146_A4079WEBDISCOD = new String[] {""} ;
      T01N147_A396EmprCod = new String[] {""} ;
      T01N147_A252CliCod = new int[1] ;
      T01N147_n252CliCod = new boolean[] {false} ;
      T01N147_A65ArtCod = new String[] {""} ;
      T01N147_n65ArtCod = new boolean[] {false} ;
      T01N147_A4058CCFColNom = new String[] {""} ;
      T01N147_A4059CCFColNum = new int[1] ;
      T01N148_A396EmprCod = new String[] {""} ;
      T01N148_A252CliCod = new int[1] ;
      T01N148_n252CliCod = new boolean[] {false} ;
      T01N148_A65ArtCod = new String[] {""} ;
      T01N148_n65ArtCod = new boolean[] {false} ;
      T01N148_A1177Dibujo = new String[] {""} ;
      T01N148_A1790DibIntCod = new int[1] ;
      T01N149_A396EmprCod = new String[] {""} ;
      T01N149_A252CliCod = new int[1] ;
      T01N149_n252CliCod = new boolean[] {false} ;
      T01N149_A65ArtCod = new String[] {""} ;
      T01N149_n65ArtCod = new boolean[] {false} ;
      T01N149_A1080LinPre = new byte[1] ;
      T01N150_A396EmprCod = new String[] {""} ;
      T01N150_A3814PePCod = new long[1] ;
      T01N151_A396EmprCod = new String[] {""} ;
      T01N151_A3413OpeManCod = new byte[1] ;
      T01N151_A3430PreManNMt = new String[] {""} ;
      T01N151_A252CliCod = new int[1] ;
      T01N151_n252CliCod = new boolean[] {false} ;
      T01N151_A65ArtCod = new String[] {""} ;
      T01N151_n65ArtCod = new boolean[] {false} ;
      T01N152_A396EmprCod = new String[] {""} ;
      T01N152_A3415ParManNum = new int[1] ;
      T01N153_A396EmprCod = new String[] {""} ;
      T01N153_A3331LanBroCod = new byte[1] ;
      T01N153_A3333LanBroLin = new short[1] ;
      T01N154_A396EmprCod = new String[] {""} ;
      T01N154_A252CliCod = new int[1] ;
      T01N154_n252CliCod = new boolean[] {false} ;
      T01N154_A65ArtCod = new String[] {""} ;
      T01N154_n65ArtCod = new boolean[] {false} ;
      T01N154_A3319ArtCapKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01N155_A396EmprCod = new String[] {""} ;
      T01N155_A252CliCod = new int[1] ;
      T01N155_n252CliCod = new boolean[] {false} ;
      T01N155_A65ArtCod = new String[] {""} ;
      T01N155_n65ArtCod = new boolean[] {false} ;
      T01N155_A3288CCalCod = new String[] {""} ;
      T01N156_A396EmprCod = new String[] {""} ;
      T01N156_A252CliCod = new int[1] ;
      T01N156_n252CliCod = new boolean[] {false} ;
      T01N156_A65ArtCod = new String[] {""} ;
      T01N156_n65ArtCod = new boolean[] {false} ;
      T01N156_A3033CCCod = new String[] {""} ;
      T01N157_A396EmprCod = new String[] {""} ;
      T01N157_A252CliCod = new int[1] ;
      T01N157_n252CliCod = new boolean[] {false} ;
      T01N157_A65ArtCod = new String[] {""} ;
      T01N157_n65ArtCod = new boolean[] {false} ;
      T01N157_A2937RecIntCod = new byte[1] ;
      T01N158_A396EmprCod = new String[] {""} ;
      T01N158_A252CliCod = new int[1] ;
      T01N158_n252CliCod = new boolean[] {false} ;
      T01N158_A65ArtCod = new String[] {""} ;
      T01N158_n65ArtCod = new boolean[] {false} ;
      T01N158_A2931Limite2 = new short[1] ;
      T01N159_A396EmprCod = new String[] {""} ;
      T01N159_A252CliCod = new int[1] ;
      T01N159_n252CliCod = new boolean[] {false} ;
      T01N159_A65ArtCod = new String[] {""} ;
      T01N159_n65ArtCod = new boolean[] {false} ;
      T01N159_A71ArtEstAny = new short[1] ;
      T01N159_A2756ArtEstSer = new String[] {""} ;
      T01N160_A396EmprCod = new String[] {""} ;
      T01N160_A252CliCod = new int[1] ;
      T01N160_n252CliCod = new boolean[] {false} ;
      T01N160_A1504CliProCod = new String[] {""} ;
      T01N160_A65ArtCod = new String[] {""} ;
      T01N160_n65ArtCod = new boolean[] {false} ;
      T01N161_A396EmprCod = new String[] {""} ;
      T01N161_A252CliCod = new int[1] ;
      T01N161_n252CliCod = new boolean[] {false} ;
      T01N161_A65ArtCod = new String[] {""} ;
      T01N161_n65ArtCod = new boolean[] {false} ;
      T01N161_A598LinRec = new byte[1] ;
      T01N162_A396EmprCod = new String[] {""} ;
      T01N162_A252CliCod = new int[1] ;
      T01N162_n252CliCod = new boolean[] {false} ;
      T01N162_A65ArtCod = new String[] {""} ;
      T01N162_n65ArtCod = new boolean[] {false} ;
      T01N162_A831TipColCod = new byte[1] ;
      T01N163_A396EmprCod = new String[] {""} ;
      T01N163_A252CliCod = new int[1] ;
      T01N163_n252CliCod = new boolean[] {false} ;
      T01N163_A65ArtCod = new String[] {""} ;
      T01N163_n65ArtCod = new boolean[] {false} ;
      T01N163_A758ProCod = new String[] {""} ;
      T01N164_A396EmprCod = new String[] {""} ;
      T01N164_A252CliCod = new int[1] ;
      T01N164_n252CliCod = new boolean[] {false} ;
      T01N164_A65ArtCod = new String[] {""} ;
      T01N164_n65ArtCod = new boolean[] {false} ;
      Z500GrpFamDsc = "" ;
      T01N165_A252CliCod = new int[1] ;
      T01N165_n252CliCod = new boolean[] {false} ;
      T01N165_A65ArtCod = new String[] {""} ;
      T01N165_n65ArtCod = new boolean[] {false} ;
      T01N165_A500GrpFamDsc = new String[] {""} ;
      T01N165_n500GrpFamDsc = new boolean[] {false} ;
      T01N165_A13167NumCilUlt = new short[1] ;
      T01N165_n13167NumCilUlt = new boolean[] {false} ;
      T01N165_A396EmprCod = new String[] {""} ;
      T01N165_A499GrpFamCod = new byte[1] ;
      T01N16_A500GrpFamDsc = new String[] {""} ;
      T01N16_n500GrpFamDsc = new boolean[] {false} ;
      T01N166_A500GrpFamDsc = new String[] {""} ;
      T01N166_n500GrpFamDsc = new boolean[] {false} ;
      T01N167_A396EmprCod = new String[] {""} ;
      T01N167_A252CliCod = new int[1] ;
      T01N167_n252CliCod = new boolean[] {false} ;
      T01N167_A65ArtCod = new String[] {""} ;
      T01N167_n65ArtCod = new boolean[] {false} ;
      T01N167_A499GrpFamCod = new byte[1] ;
      T01N15_A252CliCod = new int[1] ;
      T01N15_n252CliCod = new boolean[] {false} ;
      T01N15_A65ArtCod = new String[] {""} ;
      T01N15_n65ArtCod = new boolean[] {false} ;
      T01N15_A13167NumCilUlt = new short[1] ;
      T01N15_n13167NumCilUlt = new boolean[] {false} ;
      T01N15_A396EmprCod = new String[] {""} ;
      T01N15_A499GrpFamCod = new byte[1] ;
      T01N14_A252CliCod = new int[1] ;
      T01N14_n252CliCod = new boolean[] {false} ;
      T01N14_A65ArtCod = new String[] {""} ;
      T01N14_n65ArtCod = new boolean[] {false} ;
      T01N14_A13167NumCilUlt = new short[1] ;
      T01N14_n13167NumCilUlt = new boolean[] {false} ;
      T01N14_A396EmprCod = new String[] {""} ;
      T01N14_A499GrpFamCod = new byte[1] ;
      T01N171_A500GrpFamDsc = new String[] {""} ;
      T01N171_n500GrpFamDsc = new boolean[] {false} ;
      T01N172_A396EmprCod = new String[] {""} ;
      T01N172_A252CliCod = new int[1] ;
      T01N172_n252CliCod = new boolean[] {false} ;
      T01N172_A65ArtCod = new String[] {""} ;
      T01N172_n65ArtCod = new boolean[] {false} ;
      T01N172_A499GrpFamCod = new byte[1] ;
      T01N172_A13168NumCilLin = new short[1] ;
      T01N172_A13171MtsLin = new short[1] ;
      T01N174_A396EmprCod = new String[] {""} ;
      T01N174_A252CliCod = new int[1] ;
      T01N174_n252CliCod = new boolean[] {false} ;
      T01N174_A65ArtCod = new String[] {""} ;
      T01N174_n65ArtCod = new boolean[] {false} ;
      T01N174_A499GrpFamCod = new byte[1] ;
      T01N175_A252CliCod = new int[1] ;
      T01N175_n252CliCod = new boolean[] {false} ;
      T01N175_A65ArtCod = new String[] {""} ;
      T01N175_n65ArtCod = new boolean[] {false} ;
      T01N175_A499GrpFamCod = new byte[1] ;
      T01N175_A13168NumCilLin = new short[1] ;
      T01N175_A13169NumCilMin = new short[1] ;
      T01N175_n13169NumCilMin = new boolean[] {false} ;
      T01N175_A13170NumCilMax = new short[1] ;
      T01N175_n13170NumCilMax = new boolean[] {false} ;
      T01N175_A13175MtsLinUlt = new short[1] ;
      T01N175_n13175MtsLinUlt = new boolean[] {false} ;
      T01N175_A396EmprCod = new String[] {""} ;
      T01N176_A396EmprCod = new String[] {""} ;
      T01N176_A252CliCod = new int[1] ;
      T01N176_n252CliCod = new boolean[] {false} ;
      T01N176_A65ArtCod = new String[] {""} ;
      T01N176_n65ArtCod = new boolean[] {false} ;
      T01N176_A499GrpFamCod = new byte[1] ;
      T01N176_A13168NumCilLin = new short[1] ;
      T01N13_A252CliCod = new int[1] ;
      T01N13_n252CliCod = new boolean[] {false} ;
      T01N13_A65ArtCod = new String[] {""} ;
      T01N13_n65ArtCod = new boolean[] {false} ;
      T01N13_A499GrpFamCod = new byte[1] ;
      T01N13_A13168NumCilLin = new short[1] ;
      T01N13_A13169NumCilMin = new short[1] ;
      T01N13_n13169NumCilMin = new boolean[] {false} ;
      T01N13_A13170NumCilMax = new short[1] ;
      T01N13_n13170NumCilMax = new boolean[] {false} ;
      T01N13_A13175MtsLinUlt = new short[1] ;
      T01N13_n13175MtsLinUlt = new boolean[] {false} ;
      T01N13_A396EmprCod = new String[] {""} ;
      sMode1801 = "" ;
      T01N12_A252CliCod = new int[1] ;
      T01N12_n252CliCod = new boolean[] {false} ;
      T01N12_A65ArtCod = new String[] {""} ;
      T01N12_n65ArtCod = new boolean[] {false} ;
      T01N12_A499GrpFamCod = new byte[1] ;
      T01N12_A13168NumCilLin = new short[1] ;
      T01N12_A13169NumCilMin = new short[1] ;
      T01N12_n13169NumCilMin = new boolean[] {false} ;
      T01N12_A13170NumCilMax = new short[1] ;
      T01N12_n13170NumCilMax = new boolean[] {false} ;
      T01N12_A13175MtsLinUlt = new short[1] ;
      T01N12_n13175MtsLinUlt = new boolean[] {false} ;
      T01N12_A396EmprCod = new String[] {""} ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char3 = new String[1] ;
      T01N180_A396EmprCod = new String[] {""} ;
      T01N180_A252CliCod = new int[1] ;
      T01N180_n252CliCod = new boolean[] {false} ;
      T01N180_A65ArtCod = new String[] {""} ;
      T01N180_n65ArtCod = new boolean[] {false} ;
      T01N180_A499GrpFamCod = new byte[1] ;
      T01N180_A13168NumCilLin = new short[1] ;
      T01N180_A13171MtsLin = new short[1] ;
      T01N181_A396EmprCod = new String[] {""} ;
      T01N181_A252CliCod = new int[1] ;
      T01N181_n252CliCod = new boolean[] {false} ;
      T01N181_A65ArtCod = new String[] {""} ;
      T01N181_n65ArtCod = new boolean[] {false} ;
      T01N181_A499GrpFamCod = new byte[1] ;
      T01N181_A13168NumCilLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock7_Jsonclick = "" ;
      ROClassString = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      T01N182_A407EmprNom = new String[] {""} ;
      T01N182_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ69ArtDsc = "" ;
      ZZ279CliNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.testfam__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.testfam__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.testfam__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.testfam__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.testfam__default(),
         new Object[] {
             new Object[] {
            T01N12_A252CliCod, T01N12_A65ArtCod, T01N12_A499GrpFamCod, T01N12_A13168NumCilLin, T01N12_A13169NumCilMin, T01N12_n13169NumCilMin, T01N12_A13170NumCilMax, T01N12_n13170NumCilMax, T01N12_A13175MtsLinUlt, T01N12_n13175MtsLinUlt,
            T01N12_A396EmprCod
            }
            , new Object[] {
            T01N13_A252CliCod, T01N13_A65ArtCod, T01N13_A499GrpFamCod, T01N13_A13168NumCilLin, T01N13_A13169NumCilMin, T01N13_n13169NumCilMin, T01N13_A13170NumCilMax, T01N13_n13170NumCilMax, T01N13_A13175MtsLinUlt, T01N13_n13175MtsLinUlt,
            T01N13_A396EmprCod
            }
            , new Object[] {
            T01N14_A252CliCod, T01N14_A65ArtCod, T01N14_A13167NumCilUlt, T01N14_n13167NumCilUlt, T01N14_A396EmprCod, T01N14_A499GrpFamCod
            }
            , new Object[] {
            T01N15_A252CliCod, T01N15_A65ArtCod, T01N15_A13167NumCilUlt, T01N15_n13167NumCilUlt, T01N15_A396EmprCod, T01N15_A499GrpFamCod
            }
            , new Object[] {
            T01N16_A500GrpFamDsc, T01N16_n500GrpFamDsc
            }
            , new Object[] {
            T01N17_A65ArtCod, T01N17_A69ArtDsc, T01N17_n69ArtDsc, T01N17_A396EmprCod, T01N17_A252CliCod
            }
            , new Object[] {
            T01N18_A65ArtCod, T01N18_A69ArtDsc, T01N18_n69ArtDsc, T01N18_A396EmprCod, T01N18_A252CliCod
            }
            , new Object[] {
            T01N19_A407EmprNom, T01N19_n407EmprNom
            }
            , new Object[] {
            T01N110_A279CliNom
            }
            , new Object[] {
            T01N111_A65ArtCod, T01N111_A407EmprNom, T01N111_n407EmprNom, T01N111_A279CliNom, T01N111_A69ArtDsc, T01N111_n69ArtDsc, T01N111_A396EmprCod, T01N111_A252CliCod
            }
            , new Object[] {
            T01N112_A279CliNom
            }
            , new Object[] {
            T01N113_A396EmprCod, T01N113_A252CliCod, T01N113_A65ArtCod
            }
            , new Object[] {
            T01N114_A396EmprCod, T01N114_A252CliCod, T01N114_A65ArtCod
            }
            , new Object[] {
            T01N115_A396EmprCod, T01N115_A252CliCod, T01N115_A65ArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01N119_A279CliNom
            }
            , new Object[] {
            T01N120_A396EmprCod, T01N120_A252CliCod, T01N120_A65ArtCod, T01N120_A499GrpFamCod
            }
            , new Object[] {
            T01N121_A396EmprCod, T01N121_A252CliCod, T01N121_A12814ARTConID, T01N121_A65ArtCod
            }
            , new Object[] {
            T01N122_A396EmprCod, T01N122_A252CliCod, T01N122_A65ArtCod, T01N122_A12363SocInt
            }
            , new Object[] {
            T01N123_A396EmprCod, T01N123_A4929Inc_Dia, T01N123_A5728JBCLLin
            }
            , new Object[] {
            T01N124_A396EmprCod, T01N124_A252CliCod, T01N124_A5809MMezCod, T01N124_A65ArtCod
            }
            , new Object[] {
            T01N125_A396EmprCod, T01N125_A252CliCod, T01N125_A5234MezCod, T01N125_A5240MezLin
            }
            , new Object[] {
            T01N126_A396EmprCod, T01N126_A252CliCod, T01N126_A65ArtCod, T01N126_A4116estreclim
            }
            , new Object[] {
            T01N127_A396EmprCod, T01N127_A252CliCod, T01N127_A65ArtCod, T01N127_A4061EstNomCol
            }
            , new Object[] {
            T01N128_A396EmprCod, T01N128_A9705ErpNped, T01N128_A8652ErpLin
            }
            , new Object[] {
            T01N129_A396EmprCod, T01N129_A252CliCod, T01N129_A65ArtCod, T01N129_A7266CAAqP
            }
            , new Object[] {
            T01N130_A396EmprCod, T01N130_A252CliCod, T01N130_A65ArtCod, T01N130_A11084H_DiaA
            }
            , new Object[] {
            T01N131_A396EmprCod, T01N131_A252CliCod, T01N131_A65ArtCod, T01N131_A10972Int_cod
            }
            , new Object[] {
            T01N132_A396EmprCod, T01N132_A252CliCod, T01N132_A65ArtCod, T01N132_A10577Pg_Procod
            }
            , new Object[] {
            T01N133_A396EmprCod, T01N133_A252CliCod, T01N133_A65ArtCod, T01N133_A10272Hz_cod
            }
            , new Object[] {
            T01N134_A396EmprCod, T01N134_A252CliCod, T01N134_A65ArtCod, T01N134_A10041ArtSH
            }
            , new Object[] {
            T01N135_A396EmprCod, T01N135_A252CliCod, T01N135_A65ArtCod, T01N135_A8427TipoCt, T01N135_A8428CapMxMq
            }
            , new Object[] {
            T01N136_A396EmprCod, T01N136_A252CliCod, T01N136_A65ArtCod, T01N136_A8342CodPred
            }
            , new Object[] {
            T01N137_A396EmprCod, T01N137_A252CliCod, T01N137_A65ArtCod, T01N137_A8089ArtcodTj
            }
            , new Object[] {
            T01N138_A396EmprCod, T01N138_A252CliCod, T01N138_A65ArtCod, T01N138_A7956Mq_CodM
            }
            , new Object[] {
            T01N139_A396EmprCod, T01N139_A252CliCod, T01N139_A65ArtCod, T01N139_A7949Par_Art
            }
            , new Object[] {
            T01N140_A396EmprCod, T01N140_A252CliCod, T01N140_A65ArtCod, T01N140_A7135Lin_fast
            }
            , new Object[] {
            T01N141_A396EmprCod, T01N141_A252CliCod, T01N141_A65ArtCod, T01N141_A6954Mat_lin
            }
            , new Object[] {
            T01N142_A396EmprCod, T01N142_A602MaqCod, T01N142_A6078MaqCliCod, T01N142_A6079MaqArtCod
            }
            , new Object[] {
            T01N143_A396EmprCod, T01N143_A252CliCod, T01N143_A65ArtCod, T01N143_A5382EstCatAny, T01N143_A5383EstCatSer, T01N143_A5384EstCatTip
            }
            , new Object[] {
            T01N144_A396EmprCod, T01N144_A252CliCod, T01N144_A65ArtCod, T01N144_A4658MdlCod
            }
            , new Object[] {
            T01N145_A396EmprCod, T01N145_A252CliCod, T01N145_A4175WebEmpCod
            }
            , new Object[] {
            T01N146_A396EmprCod, T01N146_A252CliCod, T01N146_A4079WEBDISCOD
            }
            , new Object[] {
            T01N147_A396EmprCod, T01N147_A252CliCod, T01N147_A65ArtCod, T01N147_A4058CCFColNom, T01N147_A4059CCFColNum
            }
            , new Object[] {
            T01N148_A396EmprCod, T01N148_A252CliCod, T01N148_A65ArtCod, T01N148_A1177Dibujo, T01N148_A1790DibIntCod
            }
            , new Object[] {
            T01N149_A396EmprCod, T01N149_A252CliCod, T01N149_A65ArtCod, T01N149_A1080LinPre
            }
            , new Object[] {
            T01N150_A396EmprCod, T01N150_A3814PePCod
            }
            , new Object[] {
            T01N151_A396EmprCod, T01N151_A3413OpeManCod, T01N151_A3430PreManNMt, T01N151_A252CliCod, T01N151_A65ArtCod
            }
            , new Object[] {
            T01N152_A396EmprCod, T01N152_A3415ParManNum
            }
            , new Object[] {
            T01N153_A396EmprCod, T01N153_A3331LanBroCod, T01N153_A3333LanBroLin
            }
            , new Object[] {
            T01N154_A396EmprCod, T01N154_A252CliCod, T01N154_A65ArtCod, T01N154_A3319ArtCapKgs
            }
            , new Object[] {
            T01N155_A396EmprCod, T01N155_A252CliCod, T01N155_A65ArtCod, T01N155_A3288CCalCod
            }
            , new Object[] {
            T01N156_A396EmprCod, T01N156_A252CliCod, T01N156_A65ArtCod, T01N156_A3033CCCod
            }
            , new Object[] {
            T01N157_A396EmprCod, T01N157_A252CliCod, T01N157_A65ArtCod, T01N157_A2937RecIntCod
            }
            , new Object[] {
            T01N158_A396EmprCod, T01N158_A252CliCod, T01N158_A65ArtCod, T01N158_A2931Limite2
            }
            , new Object[] {
            T01N159_A396EmprCod, T01N159_A252CliCod, T01N159_A65ArtCod, T01N159_A71ArtEstAny, T01N159_A2756ArtEstSer
            }
            , new Object[] {
            T01N160_A396EmprCod, T01N160_A252CliCod, T01N160_A1504CliProCod, T01N160_A65ArtCod
            }
            , new Object[] {
            T01N161_A396EmprCod, T01N161_A252CliCod, T01N161_A65ArtCod, T01N161_A598LinRec
            }
            , new Object[] {
            T01N162_A396EmprCod, T01N162_A252CliCod, T01N162_A65ArtCod, T01N162_A831TipColCod
            }
            , new Object[] {
            T01N163_A396EmprCod, T01N163_A252CliCod, T01N163_A65ArtCod, T01N163_A758ProCod
            }
            , new Object[] {
            T01N164_A396EmprCod, T01N164_A252CliCod, T01N164_A65ArtCod
            }
            , new Object[] {
            T01N165_A252CliCod, T01N165_A65ArtCod, T01N165_A500GrpFamDsc, T01N165_n500GrpFamDsc, T01N165_A13167NumCilUlt, T01N165_n13167NumCilUlt, T01N165_A396EmprCod, T01N165_A499GrpFamCod
            }
            , new Object[] {
            T01N166_A500GrpFamDsc, T01N166_n500GrpFamDsc
            }
            , new Object[] {
            T01N167_A396EmprCod, T01N167_A252CliCod, T01N167_A65ArtCod, T01N167_A499GrpFamCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01N171_A500GrpFamDsc, T01N171_n500GrpFamDsc
            }
            , new Object[] {
            T01N172_A396EmprCod, T01N172_A252CliCod, T01N172_A65ArtCod, T01N172_A499GrpFamCod, T01N172_A13168NumCilLin, T01N172_A13171MtsLin
            }
            , new Object[] {
            }
            , new Object[] {
            T01N174_A396EmprCod, T01N174_A252CliCod, T01N174_A65ArtCod, T01N174_A499GrpFamCod
            }
            , new Object[] {
            T01N175_A252CliCod, T01N175_A65ArtCod, T01N175_A499GrpFamCod, T01N175_A13168NumCilLin, T01N175_A13169NumCilMin, T01N175_n13169NumCilMin, T01N175_A13170NumCilMax, T01N175_n13170NumCilMax, T01N175_A13175MtsLinUlt, T01N175_n13175MtsLinUlt,
            T01N175_A396EmprCod
            }
            , new Object[] {
            T01N176_A396EmprCod, T01N176_A252CliCod, T01N176_A65ArtCod, T01N176_A499GrpFamCod, T01N176_A13168NumCilLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01N180_A396EmprCod, T01N180_A252CliCod, T01N180_A65ArtCod, T01N180_A499GrpFamCod, T01N180_A13168NumCilLin, T01N180_A13171MtsLin
            }
            , new Object[] {
            T01N181_A396EmprCod, T01N181_A252CliCod, T01N181_A65ArtCod, T01N181_A499GrpFamCod, T01N181_A13168NumCilLin
            }
            , new Object[] {
            T01N182_A407EmprNom, T01N182_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV34Pgmname = "TEstFam" ;
   }

   private byte Z499GrpFamCod ;
   private byte GxWebError ;
   private byte A499GrpFamCod ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private short Z13167NumCilUlt ;
   private short O13167NumCilUlt ;
   private short nRcdDeleted_1800 ;
   private short nRcdExists_1800 ;
   private short nIsMod_1800 ;
   private short Z13168NumCilLin ;
   private short Z13169NumCilMin ;
   private short Z13170NumCilMax ;
   private short Z13175MtsLinUlt ;
   private short nRcdDeleted_1801 ;
   private short nRcdExists_1801 ;
   private short nIsMod_1801 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A13167NumCilUlt ;
   private short nBlankRcdCount1800 ;
   private short RcdFound1800 ;
   private short nBlankRcdUsr1800 ;
   private short s13167NumCilUlt ;
   private short RcdFound1801 ;
   private short A13168NumCilLin ;
   private short A13169NumCilMin ;
   private short A13170NumCilMax ;
   private short A13175MtsLinUlt ;
   private short T13167NumCilUlt ;
   private short RcdFound10 ;
   private short nIsDirty_10 ;
   private short nIsDirty_1800 ;
   private short nIsDirty_1801 ;
   private short nBlankRcdCount1801 ;
   private short B13167NumCilUlt ;
   private short nBlankRcdUsr1801 ;
   private short i13167NumCilUlt ;
   private short subGrid1_Borderwidth ;
   private int Z252CliCod ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
   private int nRC_GXsfl_72 ;
   private int nGXsfl_72_idx=1 ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtArtCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtArtDsc_Enabled ;
   private int edtGrpFamCod_Enabled ;
   private int edtGrpFamDsc_Enabled ;
   private int edtNumCilUlt_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_1801_Enabled ;
   private int edtNumCilLin_Enabled ;
   private int edtNumCilMin_Enabled ;
   private int edtNumCilMax_Enabled ;
   private int edtMtsLinUlt_Enabled ;
   private int GX_JID ;
   private int GXv_int5[] ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtNumCilLin_Enabled ;
   private int defedtNumCilUlt_Enabled ;
   private int defedtGrpFamCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtArtDsc_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z69ArtDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
   private String sGXsfl_50_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_72_idx="0001" ;
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
   private String edtCliCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtArtCod_Internalname ;
   private String A65ArtCod ;
   private String edtArtCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtArtDsc_Internalname ;
   private String A69ArtDsc ;
   private String edtArtDsc_Jsonclick ;
   private String sMode1800 ;
   private String edtGrpFamCod_Internalname ;
   private String edtGrpFamDsc_Internalname ;
   private String edtNumCilUlt_Internalname ;
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
   private String edtavnRcdDeleted_1801_Internalname ;
   private String sMode10 ;
   private String GXCCtl ;
   private String edtNumCilLin_Internalname ;
   private String edtNumCilMin_Internalname ;
   private String edtNumCilMax_Internalname ;
   private String edtMtsLinUlt_Internalname ;
   private String A500GrpFamDsc ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z500GrpFamDsc ;
   private String sMode1801 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock9_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String ROClassString ;
   private String edtGrpFamCod_Jsonclick ;
   private String lblTextblock8_Jsonclick ;
   private String edtGrpFamDsc_Jsonclick ;
   private String lblTextblock9_Jsonclick ;
   private String edtNumCilUlt_Jsonclick ;
   private String sGXsfl_72_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_1801_Jsonclick ;
   private String edtNumCilLin_Jsonclick ;
   private String edtNumCilMin_Jsonclick ;
   private String edtNumCilMax_Jsonclick ;
   private String edtMtsLinUlt_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String lblTextblock7_Caption ;
   private String lblTextblock8_Caption ;
   private String lblTextblock9_Caption ;
   private String subGrid2_Header ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ407EmprNom ;
   private String ZZ69ArtDsc ;
   private String ZZ279CliNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean wbErr ;
   private boolean n13167NumCilUlt ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n65ArtCod ;
   private boolean n69ArtDsc ;
   private boolean bGXsfl_72_Refreshing=false ;
   private boolean returnInSub ;
   private boolean n500GrpFamDsc ;
   private boolean n13169NumCilMin ;
   private boolean n13170NumCilMax ;
   private boolean n13175MtsLinUlt ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01N19_A407EmprNom ;
   private boolean[] T01N19_n407EmprNom ;
   private String[] T01N111_A65ArtCod ;
   private boolean[] T01N111_n65ArtCod ;
   private String[] T01N111_A407EmprNom ;
   private boolean[] T01N111_n407EmprNom ;
   private String[] T01N111_A279CliNom ;
   private String[] T01N111_A69ArtDsc ;
   private boolean[] T01N111_n69ArtDsc ;
   private String[] T01N111_A396EmprCod ;
   private int[] T01N111_A252CliCod ;
   private boolean[] T01N111_n252CliCod ;
   private String[] T01N110_A279CliNom ;
   private String[] T01N112_A279CliNom ;
   private String[] T01N113_A396EmprCod ;
   private int[] T01N113_A252CliCod ;
   private boolean[] T01N113_n252CliCod ;
   private String[] T01N113_A65ArtCod ;
   private boolean[] T01N113_n65ArtCod ;
   private String[] T01N18_A65ArtCod ;
   private boolean[] T01N18_n65ArtCod ;
   private String[] T01N18_A69ArtDsc ;
   private boolean[] T01N18_n69ArtDsc ;
   private String[] T01N18_A396EmprCod ;
   private int[] T01N18_A252CliCod ;
   private boolean[] T01N18_n252CliCod ;
   private String[] T01N114_A396EmprCod ;
   private int[] T01N114_A252CliCod ;
   private boolean[] T01N114_n252CliCod ;
   private String[] T01N114_A65ArtCod ;
   private boolean[] T01N114_n65ArtCod ;
   private String[] T01N115_A396EmprCod ;
   private int[] T01N115_A252CliCod ;
   private boolean[] T01N115_n252CliCod ;
   private String[] T01N115_A65ArtCod ;
   private boolean[] T01N115_n65ArtCod ;
   private String[] T01N17_A65ArtCod ;
   private boolean[] T01N17_n65ArtCod ;
   private String[] T01N17_A69ArtDsc ;
   private boolean[] T01N17_n69ArtDsc ;
   private String[] T01N17_A396EmprCod ;
   private int[] T01N17_A252CliCod ;
   private boolean[] T01N17_n252CliCod ;
   private String[] T01N119_A279CliNom ;
   private String[] T01N120_A396EmprCod ;
   private int[] T01N120_A252CliCod ;
   private boolean[] T01N120_n252CliCod ;
   private String[] T01N120_A65ArtCod ;
   private boolean[] T01N120_n65ArtCod ;
   private byte[] T01N120_A499GrpFamCod ;
   private String[] T01N121_A396EmprCod ;
   private int[] T01N121_A252CliCod ;
   private boolean[] T01N121_n252CliCod ;
   private String[] T01N121_A12814ARTConID ;
   private String[] T01N121_A65ArtCod ;
   private boolean[] T01N121_n65ArtCod ;
   private String[] T01N122_A396EmprCod ;
   private int[] T01N122_A252CliCod ;
   private boolean[] T01N122_n252CliCod ;
   private String[] T01N122_A65ArtCod ;
   private boolean[] T01N122_n65ArtCod ;
   private byte[] T01N122_A12363SocInt ;
   private String[] T01N123_A396EmprCod ;
   private java.util.Date[] T01N123_A4929Inc_Dia ;
   private short[] T01N123_A5728JBCLLin ;
   private String[] T01N124_A396EmprCod ;
   private int[] T01N124_A252CliCod ;
   private boolean[] T01N124_n252CliCod ;
   private String[] T01N124_A5809MMezCod ;
   private String[] T01N124_A65ArtCod ;
   private boolean[] T01N124_n65ArtCod ;
   private String[] T01N125_A396EmprCod ;
   private int[] T01N125_A252CliCod ;
   private boolean[] T01N125_n252CliCod ;
   private String[] T01N125_A5234MezCod ;
   private byte[] T01N125_A5240MezLin ;
   private String[] T01N126_A396EmprCod ;
   private int[] T01N126_A252CliCod ;
   private boolean[] T01N126_n252CliCod ;
   private String[] T01N126_A65ArtCod ;
   private boolean[] T01N126_n65ArtCod ;
   private int[] T01N126_A4116estreclim ;
   private String[] T01N127_A396EmprCod ;
   private int[] T01N127_A252CliCod ;
   private boolean[] T01N127_n252CliCod ;
   private String[] T01N127_A65ArtCod ;
   private boolean[] T01N127_n65ArtCod ;
   private String[] T01N127_A4061EstNomCol ;
   private String[] T01N128_A396EmprCod ;
   private String[] T01N128_A9705ErpNped ;
   private short[] T01N128_A8652ErpLin ;
   private String[] T01N129_A396EmprCod ;
   private int[] T01N129_A252CliCod ;
   private boolean[] T01N129_n252CliCod ;
   private String[] T01N129_A65ArtCod ;
   private boolean[] T01N129_n65ArtCod ;
   private String[] T01N129_A7266CAAqP ;
   private String[] T01N130_A396EmprCod ;
   private int[] T01N130_A252CliCod ;
   private boolean[] T01N130_n252CliCod ;
   private String[] T01N130_A65ArtCod ;
   private boolean[] T01N130_n65ArtCod ;
   private java.util.Date[] T01N130_A11084H_DiaA ;
   private String[] T01N131_A396EmprCod ;
   private int[] T01N131_A252CliCod ;
   private boolean[] T01N131_n252CliCod ;
   private String[] T01N131_A65ArtCod ;
   private boolean[] T01N131_n65ArtCod ;
   private byte[] T01N131_A10972Int_cod ;
   private String[] T01N132_A396EmprCod ;
   private int[] T01N132_A252CliCod ;
   private boolean[] T01N132_n252CliCod ;
   private String[] T01N132_A65ArtCod ;
   private boolean[] T01N132_n65ArtCod ;
   private String[] T01N132_A10577Pg_Procod ;
   private String[] T01N133_A396EmprCod ;
   private int[] T01N133_A252CliCod ;
   private boolean[] T01N133_n252CliCod ;
   private String[] T01N133_A65ArtCod ;
   private boolean[] T01N133_n65ArtCod ;
   private String[] T01N133_A10272Hz_cod ;
   private String[] T01N134_A396EmprCod ;
   private int[] T01N134_A252CliCod ;
   private boolean[] T01N134_n252CliCod ;
   private String[] T01N134_A65ArtCod ;
   private boolean[] T01N134_n65ArtCod ;
   private String[] T01N134_A10041ArtSH ;
   private String[] T01N135_A396EmprCod ;
   private int[] T01N135_A252CliCod ;
   private boolean[] T01N135_n252CliCod ;
   private String[] T01N135_A65ArtCod ;
   private boolean[] T01N135_n65ArtCod ;
   private String[] T01N135_A8427TipoCt ;
   private int[] T01N135_A8428CapMxMq ;
   private String[] T01N136_A396EmprCod ;
   private int[] T01N136_A252CliCod ;
   private boolean[] T01N136_n252CliCod ;
   private String[] T01N136_A65ArtCod ;
   private boolean[] T01N136_n65ArtCod ;
   private short[] T01N136_A8342CodPred ;
   private String[] T01N137_A396EmprCod ;
   private int[] T01N137_A252CliCod ;
   private boolean[] T01N137_n252CliCod ;
   private String[] T01N137_A65ArtCod ;
   private boolean[] T01N137_n65ArtCod ;
   private String[] T01N137_A8089ArtcodTj ;
   private String[] T01N138_A396EmprCod ;
   private int[] T01N138_A252CliCod ;
   private boolean[] T01N138_n252CliCod ;
   private String[] T01N138_A65ArtCod ;
   private boolean[] T01N138_n65ArtCod ;
   private String[] T01N138_A7956Mq_CodM ;
   private String[] T01N139_A396EmprCod ;
   private int[] T01N139_A252CliCod ;
   private boolean[] T01N139_n252CliCod ;
   private String[] T01N139_A65ArtCod ;
   private boolean[] T01N139_n65ArtCod ;
   private short[] T01N139_A7949Par_Art ;
   private String[] T01N140_A396EmprCod ;
   private int[] T01N140_A252CliCod ;
   private boolean[] T01N140_n252CliCod ;
   private String[] T01N140_A65ArtCod ;
   private boolean[] T01N140_n65ArtCod ;
   private short[] T01N140_A7135Lin_fast ;
   private String[] T01N141_A396EmprCod ;
   private int[] T01N141_A252CliCod ;
   private boolean[] T01N141_n252CliCod ;
   private String[] T01N141_A65ArtCod ;
   private boolean[] T01N141_n65ArtCod ;
   private short[] T01N141_A6954Mat_lin ;
   private String[] T01N142_A396EmprCod ;
   private String[] T01N142_A602MaqCod ;
   private int[] T01N142_A6078MaqCliCod ;
   private String[] T01N142_A6079MaqArtCod ;
   private String[] T01N143_A396EmprCod ;
   private int[] T01N143_A252CliCod ;
   private boolean[] T01N143_n252CliCod ;
   private String[] T01N143_A65ArtCod ;
   private boolean[] T01N143_n65ArtCod ;
   private short[] T01N143_A5382EstCatAny ;
   private String[] T01N143_A5383EstCatSer ;
   private short[] T01N143_A5384EstCatTip ;
   private String[] T01N144_A396EmprCod ;
   private int[] T01N144_A252CliCod ;
   private boolean[] T01N144_n252CliCod ;
   private String[] T01N144_A65ArtCod ;
   private boolean[] T01N144_n65ArtCod ;
   private String[] T01N144_A4658MdlCod ;
   private String[] T01N145_A396EmprCod ;
   private int[] T01N145_A252CliCod ;
   private boolean[] T01N145_n252CliCod ;
   private String[] T01N145_A4175WebEmpCod ;
   private String[] T01N146_A396EmprCod ;
   private int[] T01N146_A252CliCod ;
   private boolean[] T01N146_n252CliCod ;
   private String[] T01N146_A4079WEBDISCOD ;
   private String[] T01N147_A396EmprCod ;
   private int[] T01N147_A252CliCod ;
   private boolean[] T01N147_n252CliCod ;
   private String[] T01N147_A65ArtCod ;
   private boolean[] T01N147_n65ArtCod ;
   private String[] T01N147_A4058CCFColNom ;
   private int[] T01N147_A4059CCFColNum ;
   private String[] T01N148_A396EmprCod ;
   private int[] T01N148_A252CliCod ;
   private boolean[] T01N148_n252CliCod ;
   private String[] T01N148_A65ArtCod ;
   private boolean[] T01N148_n65ArtCod ;
   private String[] T01N148_A1177Dibujo ;
   private int[] T01N148_A1790DibIntCod ;
   private String[] T01N149_A396EmprCod ;
   private int[] T01N149_A252CliCod ;
   private boolean[] T01N149_n252CliCod ;
   private String[] T01N149_A65ArtCod ;
   private boolean[] T01N149_n65ArtCod ;
   private byte[] T01N149_A1080LinPre ;
   private String[] T01N150_A396EmprCod ;
   private long[] T01N150_A3814PePCod ;
   private String[] T01N151_A396EmprCod ;
   private byte[] T01N151_A3413OpeManCod ;
   private String[] T01N151_A3430PreManNMt ;
   private int[] T01N151_A252CliCod ;
   private boolean[] T01N151_n252CliCod ;
   private String[] T01N151_A65ArtCod ;
   private boolean[] T01N151_n65ArtCod ;
   private String[] T01N152_A396EmprCod ;
   private int[] T01N152_A3415ParManNum ;
   private String[] T01N153_A396EmprCod ;
   private byte[] T01N153_A3331LanBroCod ;
   private short[] T01N153_A3333LanBroLin ;
   private String[] T01N154_A396EmprCod ;
   private int[] T01N154_A252CliCod ;
   private boolean[] T01N154_n252CliCod ;
   private String[] T01N154_A65ArtCod ;
   private boolean[] T01N154_n65ArtCod ;
   private java.math.BigDecimal[] T01N154_A3319ArtCapKgs ;
   private String[] T01N155_A396EmprCod ;
   private int[] T01N155_A252CliCod ;
   private boolean[] T01N155_n252CliCod ;
   private String[] T01N155_A65ArtCod ;
   private boolean[] T01N155_n65ArtCod ;
   private String[] T01N155_A3288CCalCod ;
   private String[] T01N156_A396EmprCod ;
   private int[] T01N156_A252CliCod ;
   private boolean[] T01N156_n252CliCod ;
   private String[] T01N156_A65ArtCod ;
   private boolean[] T01N156_n65ArtCod ;
   private String[] T01N156_A3033CCCod ;
   private String[] T01N157_A396EmprCod ;
   private int[] T01N157_A252CliCod ;
   private boolean[] T01N157_n252CliCod ;
   private String[] T01N157_A65ArtCod ;
   private boolean[] T01N157_n65ArtCod ;
   private byte[] T01N157_A2937RecIntCod ;
   private String[] T01N158_A396EmprCod ;
   private int[] T01N158_A252CliCod ;
   private boolean[] T01N158_n252CliCod ;
   private String[] T01N158_A65ArtCod ;
   private boolean[] T01N158_n65ArtCod ;
   private short[] T01N158_A2931Limite2 ;
   private String[] T01N159_A396EmprCod ;
   private int[] T01N159_A252CliCod ;
   private boolean[] T01N159_n252CliCod ;
   private String[] T01N159_A65ArtCod ;
   private boolean[] T01N159_n65ArtCod ;
   private short[] T01N159_A71ArtEstAny ;
   private String[] T01N159_A2756ArtEstSer ;
   private String[] T01N160_A396EmprCod ;
   private int[] T01N160_A252CliCod ;
   private boolean[] T01N160_n252CliCod ;
   private String[] T01N160_A1504CliProCod ;
   private String[] T01N160_A65ArtCod ;
   private boolean[] T01N160_n65ArtCod ;
   private String[] T01N161_A396EmprCod ;
   private int[] T01N161_A252CliCod ;
   private boolean[] T01N161_n252CliCod ;
   private String[] T01N161_A65ArtCod ;
   private boolean[] T01N161_n65ArtCod ;
   private byte[] T01N161_A598LinRec ;
   private String[] T01N162_A396EmprCod ;
   private int[] T01N162_A252CliCod ;
   private boolean[] T01N162_n252CliCod ;
   private String[] T01N162_A65ArtCod ;
   private boolean[] T01N162_n65ArtCod ;
   private byte[] T01N162_A831TipColCod ;
   private String[] T01N163_A396EmprCod ;
   private int[] T01N163_A252CliCod ;
   private boolean[] T01N163_n252CliCod ;
   private String[] T01N163_A65ArtCod ;
   private boolean[] T01N163_n65ArtCod ;
   private String[] T01N163_A758ProCod ;
   private String[] T01N164_A396EmprCod ;
   private int[] T01N164_A252CliCod ;
   private boolean[] T01N164_n252CliCod ;
   private String[] T01N164_A65ArtCod ;
   private boolean[] T01N164_n65ArtCod ;
   private int[] T01N165_A252CliCod ;
   private boolean[] T01N165_n252CliCod ;
   private String[] T01N165_A65ArtCod ;
   private boolean[] T01N165_n65ArtCod ;
   private String[] T01N165_A500GrpFamDsc ;
   private boolean[] T01N165_n500GrpFamDsc ;
   private short[] T01N165_A13167NumCilUlt ;
   private boolean[] T01N165_n13167NumCilUlt ;
   private String[] T01N165_A396EmprCod ;
   private byte[] T01N165_A499GrpFamCod ;
   private String[] T01N16_A500GrpFamDsc ;
   private boolean[] T01N16_n500GrpFamDsc ;
   private String[] T01N166_A500GrpFamDsc ;
   private boolean[] T01N166_n500GrpFamDsc ;
   private String[] T01N167_A396EmprCod ;
   private int[] T01N167_A252CliCod ;
   private boolean[] T01N167_n252CliCod ;
   private String[] T01N167_A65ArtCod ;
   private boolean[] T01N167_n65ArtCod ;
   private byte[] T01N167_A499GrpFamCod ;
   private int[] T01N15_A252CliCod ;
   private boolean[] T01N15_n252CliCod ;
   private String[] T01N15_A65ArtCod ;
   private boolean[] T01N15_n65ArtCod ;
   private short[] T01N15_A13167NumCilUlt ;
   private boolean[] T01N15_n13167NumCilUlt ;
   private String[] T01N15_A396EmprCod ;
   private byte[] T01N15_A499GrpFamCod ;
   private int[] T01N14_A252CliCod ;
   private boolean[] T01N14_n252CliCod ;
   private String[] T01N14_A65ArtCod ;
   private boolean[] T01N14_n65ArtCod ;
   private short[] T01N14_A13167NumCilUlt ;
   private boolean[] T01N14_n13167NumCilUlt ;
   private String[] T01N14_A396EmprCod ;
   private byte[] T01N14_A499GrpFamCod ;
   private String[] T01N171_A500GrpFamDsc ;
   private boolean[] T01N171_n500GrpFamDsc ;
   private String[] T01N172_A396EmprCod ;
   private int[] T01N172_A252CliCod ;
   private boolean[] T01N172_n252CliCod ;
   private String[] T01N172_A65ArtCod ;
   private boolean[] T01N172_n65ArtCod ;
   private byte[] T01N172_A499GrpFamCod ;
   private short[] T01N172_A13168NumCilLin ;
   private short[] T01N172_A13171MtsLin ;
   private String[] T01N174_A396EmprCod ;
   private int[] T01N174_A252CliCod ;
   private boolean[] T01N174_n252CliCod ;
   private String[] T01N174_A65ArtCod ;
   private boolean[] T01N174_n65ArtCod ;
   private byte[] T01N174_A499GrpFamCod ;
   private int[] T01N175_A252CliCod ;
   private boolean[] T01N175_n252CliCod ;
   private String[] T01N175_A65ArtCod ;
   private boolean[] T01N175_n65ArtCod ;
   private byte[] T01N175_A499GrpFamCod ;
   private short[] T01N175_A13168NumCilLin ;
   private short[] T01N175_A13169NumCilMin ;
   private boolean[] T01N175_n13169NumCilMin ;
   private short[] T01N175_A13170NumCilMax ;
   private boolean[] T01N175_n13170NumCilMax ;
   private short[] T01N175_A13175MtsLinUlt ;
   private boolean[] T01N175_n13175MtsLinUlt ;
   private String[] T01N175_A396EmprCod ;
   private String[] T01N176_A396EmprCod ;
   private int[] T01N176_A252CliCod ;
   private boolean[] T01N176_n252CliCod ;
   private String[] T01N176_A65ArtCod ;
   private boolean[] T01N176_n65ArtCod ;
   private byte[] T01N176_A499GrpFamCod ;
   private short[] T01N176_A13168NumCilLin ;
   private int[] T01N13_A252CliCod ;
   private boolean[] T01N13_n252CliCod ;
   private String[] T01N13_A65ArtCod ;
   private boolean[] T01N13_n65ArtCod ;
   private byte[] T01N13_A499GrpFamCod ;
   private short[] T01N13_A13168NumCilLin ;
   private short[] T01N13_A13169NumCilMin ;
   private boolean[] T01N13_n13169NumCilMin ;
   private short[] T01N13_A13170NumCilMax ;
   private boolean[] T01N13_n13170NumCilMax ;
   private short[] T01N13_A13175MtsLinUlt ;
   private boolean[] T01N13_n13175MtsLinUlt ;
   private String[] T01N13_A396EmprCod ;
   private int[] T01N12_A252CliCod ;
   private boolean[] T01N12_n252CliCod ;
   private String[] T01N12_A65ArtCod ;
   private boolean[] T01N12_n65ArtCod ;
   private byte[] T01N12_A499GrpFamCod ;
   private short[] T01N12_A13168NumCilLin ;
   private short[] T01N12_A13169NumCilMin ;
   private boolean[] T01N12_n13169NumCilMin ;
   private short[] T01N12_A13170NumCilMax ;
   private boolean[] T01N12_n13170NumCilMax ;
   private short[] T01N12_A13175MtsLinUlt ;
   private boolean[] T01N12_n13175MtsLinUlt ;
   private String[] T01N12_A396EmprCod ;
   private String[] T01N180_A396EmprCod ;
   private int[] T01N180_A252CliCod ;
   private boolean[] T01N180_n252CliCod ;
   private String[] T01N180_A65ArtCod ;
   private boolean[] T01N180_n65ArtCod ;
   private byte[] T01N180_A499GrpFamCod ;
   private short[] T01N180_A13168NumCilLin ;
   private short[] T01N180_A13171MtsLin ;
   private String[] T01N181_A396EmprCod ;
   private int[] T01N181_A252CliCod ;
   private boolean[] T01N181_n252CliCod ;
   private String[] T01N181_A65ArtCod ;
   private boolean[] T01N181_n65ArtCod ;
   private byte[] T01N181_A499GrpFamCod ;
   private short[] T01N181_A13168NumCilLin ;
   private String[] T01N182_A407EmprNom ;
   private boolean[] T01N182_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class testfam__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class testfam__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class testfam__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class testfam__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class testfam__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01N12", "SELECT CliCod, ArtCod, GrpFamCod, NumCilLin, NumCilMin, NumCilMax, MtsLinUlt, EmprCod FROM TXPEstTa1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ? AND NumCilLin = ?  FOR UPDATE OF NumCilMin, NumCilMax, MtsLinUlt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N13", "SELECT CliCod, ArtCod, GrpFamCod, NumCilLin, NumCilMin, NumCilMax, MtsLinUlt, EmprCod FROM TXPEstTa1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ? AND NumCilLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N14", "SELECT CliCod, ArtCod, NumCilUlt, EmprCod, GrpFamCod FROM TXPEstTa0 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ?  FOR UPDATE OF NumCilUlt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N15", "SELECT CliCod, ArtCod, NumCilUlt, EmprCod, GrpFamCod FROM TXPEstTa0 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N16", "SELECT GrpFamDsc FROM TXPGRUFAM WHERE EmprCod = ? AND GrpFamCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N17", "SELECT ArtCod, ArtDsc, EmprCod, CliCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?  FOR UPDATE OF ArtDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N18", "SELECT ArtCod, ArtDsc, EmprCod, CliCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N19", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N110", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N111", "SELECT /*+ FIRST_ROWS(100) */ TM1.ArtCod, T2.EmprNom, T3.CliNom, TM1.ArtDsc, TM1.EmprCod, TM1.CliCod FROM ((TXPARTICU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N112", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N113", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N114", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE ( CliCod > ? or CliCod = ? and ArtCod > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, ArtCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N115", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE ( CliCod < ? or CliCod = ? and ArtCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01N116", "INSERT INTO TXPARTICU(ArtCod, ArtDsc, EmprCod, CliCod, ArtMat, TipArtCod, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtCorOri, ArtEncOri, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtObs, ArtObsFac, ArtPreKgm, ArtPreMtr, ArtPreDef, ULinRec, ArtNMtr, ArtPml, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoN, ArtRdoA, ArtNumTex1, ArtNumTex2, NumTexCod, ArtFacAbs, ArtCosBase, ArtPle2, ArtObsLon, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtPreCap, ArtAnu, ArtFecCre, ArtPrMEst, ULinPre, ClasCod, ArtPmPPza, ArtUsrCod, ArtFecMod, ArtPreUlAc, ArtPreUsrM, ArtPelAnh, ArtAcaAnh, ArtAcaMar, ArtAcaBak, ArtLotMaq, ArtCruMts, ArtCruKgs, ArtCruEnr, ArtLotPza, ArtLotMts, ArtLotKgs, ArtAcaFor, ArtRb, ArtValMtr, ArtCodExt, ArtComer, ClaTubCod, ClaBolCod, ArtRdoCru1, ArtRdoCru2, ArtLu, ArtFacTor, Mat_UltL, Mat_Maq, UltLinFT, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtCla, CapKgs1, CapKgs2, CapKgs3, CapKgs4, CapKgs5, CapKgs6, CapKgs7, CapKgs8, CapKgs9, CapKgs10, ArtFabsH, ArtFabsT, ArtNProg, ArtVbd, ArtVbn, ArtAb, ArtObsGrm, ArtObsAnc, ArtCdb, ArtGalga, ArtPlatina, ArtPgd, ArtTh, Art_Cd, CapUsuM, CapFecM, Mat_UsuM, Mat_FecM, CapUsuA, CapFecA, ArtHilos, ArtPasad, ArtAncC, ArtGrm2C, ArtRdoC, ArtPreObs, ArtFacUti, ArtPreEst, ArtDefEst, ArtNumTip, ArtPreUnd, Mat_ObsG, ArtMT, ArtTRabs, ArtKgMn, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, ArtEncAnc, ArtObsOtra, ArtRdto4, Artdsc2, ArtgrComp, ArtKgspp, ArtPrepp, ArtActivo) VALUES(?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, ' ')", GX_NOMASK, "TXPARTICU")
         ,new UpdateCursor("T01N117", "UPDATE TXPARTICU SET ArtDsc=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK, "TXPARTICU")
         ,new UpdateCursor("T01N118", "DELETE FROM TXPARTICU  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK, "TXPARTICU")
         ,new ForEachCursor("T01N119", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N120", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, GrpFamCod FROM TXPEstTa0 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N121", "SELECT * FROM (SELECT EmprCod, CliCod, ARTConID, ArtCod FROM TXPARTCo1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N122", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, SocInt FROM TXPSOCRAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N123", "SELECT * FROM (SELECT EmprCod, Inc_Dia, JBCLLin FROM TXPJBConL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N124", "SELECT * FROM (SELECT EmprCod, CliCod, MMezCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N125", "SELECT * FROM (SELECT EmprCod, CliCod, MezCod, MezLin FROM TXPLMZCLA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N126", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, estreclim FROM TXPrecest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N127", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N128", "SELECT * FROM (SELECT EmprCod, ErpNped, ErpLin FROM TXPCPEDCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N129", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CAAqP FROM TXPPCARC WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N130", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, H_DiaA FROM TXPHPREAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N131", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Int_cod FROM TXPINCINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N132", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Pg_Procod FROM TXPPGCOLO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N133", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Hz_cod FROM TXPTR02JL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N134", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtSH FROM TXPCLATFA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N135", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipoCt, CapMxMq FROM TXPARTMQT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N136", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CodPred FROM TXPPVPNIT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N137", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtcodTj FROM TXPTEJART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N138", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mq_CodM FROM TXPTNART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N139", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Par_Art FROM TXPARTTEJ WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N140", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Lin_fast FROM TXPPARTIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N141", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mat_lin FROM TXPARTMAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N142", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCliCod = ? AND MaqArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N143", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip FROM TXPESTCAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N144", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod FROM TXPModels WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N145", "SELECT * FROM (SELECT EmprCod, CliCod, WebEmpCod FROM TXPWEBEMP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N146", "SELECT * FROM (SELECT EmprCod, CliCod, WEBDISCOD FROM TXPWebDis WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N147", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum FROM TXPCCSeri WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N148", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Dibujo, DibIntCod FROM TXPCPRECO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N149", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinPre FROM TXPLINPRE WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N150", "SELECT * FROM (SELECT EmprCod, PePCod FROM TXPPedPro WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N151", "SELECT * FROM (SELECT EmprCod, OpeManCod, PreManNMt, CliCod, ArtCod FROM TXPPREMAN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N152", "SELECT * FROM (SELECT EmprCod, ParManNum FROM TXPPARMAN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N153", "SELECT * FROM (SELECT EmprCod, LanBroCod, LanBroLin FROM TXPLANBRL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N154", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtCapKgs FROM TXPPRECAP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N155", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCalCod FROM TXPPARSER WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N156", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCCod FROM TXPCCArt WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N157", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, RecIntCod FROM TXPARTINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N158", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Limite2 FROM TXPRECARB WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N159", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer FROM TXPCESART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N160", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N161", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinRec FROM TXPRECARG WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N162", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipColCod FROM TXPPRETCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N163", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N164", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? ORDER BY EmprCod, CliCod, ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N165", "SELECT T1.CliCod, T1.ArtCod, T2.GrpFamDsc, T1.NumCilUlt, T1.EmprCod, T1.GrpFamCod FROM (TXPEstTa0 T1 INNER JOIN TXPGRUFAM T2 ON T2.EmprCod = T1.EmprCod AND T2.GrpFamCod = T1.GrpFamCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.GrpFamCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.GrpFamCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N166", "SELECT GrpFamDsc FROM TXPGRUFAM WHERE EmprCod = ? AND GrpFamCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N167", "SELECT EmprCod, CliCod, ArtCod, GrpFamCod FROM TXPEstTa0 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01N168", "INSERT INTO TXPEstTa0(CliCod, ArtCod, NumCilUlt, EmprCod, GrpFamCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPEstTa0")
         ,new UpdateCursor("T01N169", "UPDATE TXPEstTa0 SET NumCilUlt=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ?", GX_NOMASK, "TXPEstTa0")
         ,new UpdateCursor("T01N170", "DELETE FROM TXPEstTa0  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ?", GX_NOMASK, "TXPEstTa0")
         ,new ForEachCursor("T01N171", "SELECT GrpFamDsc FROM TXPGRUFAM WHERE EmprCod = ? AND GrpFamCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N172", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, GrpFamCod, NumCilLin, MtsLin FROM TXPEstTa2 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01N173", "UPDATE TXPEstTa0 SET NumCilUlt=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ?", GX_NOMASK, "TXPEstTa0")
         ,new ForEachCursor("T01N174", "SELECT EmprCod, CliCod, ArtCod, GrpFamCod FROM TXPEstTa0 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, GrpFamCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N175", "SELECT CliCod, ArtCod, GrpFamCod, NumCilLin, NumCilMin, NumCilMax, MtsLinUlt, EmprCod FROM TXPEstTa1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and GrpFamCod = ? and NumCilLin = ? ORDER BY EmprCod, CliCod, ArtCod, GrpFamCod, NumCilLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N176", "SELECT EmprCod, CliCod, ArtCod, GrpFamCod, NumCilLin FROM TXPEstTa1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ? AND NumCilLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01N177", "INSERT INTO TXPEstTa1(CliCod, ArtCod, GrpFamCod, NumCilLin, NumCilMin, NumCilMax, MtsLinUlt, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPEstTa1")
         ,new UpdateCursor("T01N178", "UPDATE TXPEstTa1 SET NumCilMin=?, NumCilMax=?, MtsLinUlt=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ? AND NumCilLin = ?", GX_NOMASK, "TXPEstTa1")
         ,new UpdateCursor("T01N179", "DELETE FROM TXPEstTa1  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ? AND NumCilLin = ?", GX_NOMASK, "TXPEstTa1")
         ,new ForEachCursor("T01N180", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, GrpFamCod, NumCilLin, MtsLin FROM TXPEstTa2 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND GrpFamCod = ? AND NumCilLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01N181", "SELECT EmprCod, CliCod, ArtCod, GrpFamCod, NumCilLin FROM TXPEstTa1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and GrpFamCod = ? ORDER BY EmprCod, CliCod, ArtCod, GrpFamCod, NumCilLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01N182", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 63 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 73 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 3);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 80 :
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setByte(4, ((Number) parms[5]).byteValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setByte(4, ((Number) parms[5]).byteValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setByte(4, ((Number) parms[5]).byteValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setByte(4, ((Number) parms[5]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 16);
               }
               stmt.setString(4, (String)parms[6], 3);
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 16);
               }
               stmt.setString(4, (String)parms[6], 3);
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 26);
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setByte(4, ((Number) parms[5]).byteValue());
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 65 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setByte(4, ((Number) parms[5]).byteValue());
               return;
            case 66 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 16);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setByte(5, ((Number) parms[7]).byteValue());
               return;
            case 67 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 16);
               }
               stmt.setByte(5, ((Number) parms[7]).byteValue());
               return;
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setByte(4, ((Number) parms[5]).byteValue());
               return;
            case 69 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 70 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setByte(4, ((Number) parms[5]).byteValue());
               return;
            case 71 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 16);
               }
               stmt.setByte(5, ((Number) parms[7]).byteValue());
               return;
            case 72 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 73 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setByte(4, ((Number) parms[5]).byteValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               return;
            case 74 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setByte(4, ((Number) parms[5]).byteValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               return;
            case 75 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 16);
               }
               stmt.setByte(3, ((Number) parms[4]).byteValue());
               stmt.setShort(4, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[11]).shortValue());
               }
               stmt.setString(8, (String)parms[12], 3);
               return;
            case 76 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 16);
               }
               stmt.setByte(7, ((Number) parms[11]).byteValue());
               stmt.setShort(8, ((Number) parms[12]).shortValue());
               return;
            case 77 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setByte(4, ((Number) parms[5]).byteValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               return;
            case 78 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setByte(4, ((Number) parms[5]).byteValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               return;
            case 79 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setByte(4, ((Number) parms[5]).byteValue());
               return;
            case 80 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

