package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thpreie_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
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
         gxload_3( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A252CliCod, A65ArtCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A831TipColCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A583IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A583IntCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         A583IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A252CliCod, A65ArtCod, A831TipColCod, A583IntCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ESCALADOS", ""), (short)(0)) ;
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
      nRC_GXsfl_80 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_80"))) ;
      nGXsfl_80_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_80_idx"))) ;
      sGXsfl_80_idx = httpContext.GetPar( "sGXsfl_80_idx") ;
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

   public thpreie_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thpreie_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thpreie_impl.class ));
   }

   public thpreie_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREIe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREIe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREIe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREIe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THPREIe.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREIe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPREIe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREIe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPREIe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREIe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THPREIe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREIe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPREIe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREIe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPREIe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion Articulo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREIe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPREIe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Código Tipo Colorante", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREIe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipColCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THPREIe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Código Intensidad", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREIe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIntCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntCod_Jsonclick, 0, "", "", "", "", "", 1, edtIntCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THPREIe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descripción Tipo Colorante", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREIe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColDsc_Internalname, GXutil.rtrim( A832TipColDsc), GXutil.rtrim( localUtil.format( A832TipColDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColDsc_Jsonclick, 0, "", "", "", "", "", 1, edtTipColDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPREIe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Descripción Intensidad", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREIe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntDsc_Internalname, GXutil.rtrim( A584IntDsc), GXutil.rtrim( localUtil.format( A584IntDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntDsc_Jsonclick, 0, "", "", "", "", "", 1, edtIntDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THPREIe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Dia Modificacion", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREIe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtH_DiaI_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_DiaI_Internalname, localUtil.format(A11092H_DiaI, "99/99/99"), localUtil.format( A11092H_DiaI, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_DiaI_Jsonclick, 0, "", "", "", "", "", 1, edtH_DiaI_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THPREIe.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtH_DiaI_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtH_DiaI_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THPREIe.htm");
      httpContext.writeTextNL( "</div>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREIe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Ultima Linea escalados", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THPREIe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_UltLe_Internalname, GXutil.ltrim( localUtil.ntoc( A11186H_UltLe, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtH_UltLe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11186H_UltLe), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11186H_UltLe), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_UltLe_Jsonclick, 0, "", "", "", "", "", 1, edtH_UltLe_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THPREIe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol80( ) ;
      nGXsfl_80_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1488 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1488 = (short)(1) ;
            scanStart1AV1488( ) ;
            while ( RcdFound1488 != 0 )
            {
               init_level_properties1488( ) ;
               getByPrimaryKey1AV1488( ) ;
               addRow1AV1488( ) ;
               scanNext1AV1488( ) ;
            }
            scanEnd1AV1488( ) ;
            nBlankRcdCount1488 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1AV1488( ) ;
         standaloneModal1AV1488( ) ;
         sMode1488 = Gx_mode ;
         while ( nGXsfl_80_idx < nRC_GXsfl_80 )
         {
            bGXsfl_80_Refreshing = true ;
            readRow1AV1488( ) ;
            edtavnRcdDeleted_1488_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1488_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1488_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1488_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtH_linIe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_LINIE_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_linIe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_linIe_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtH_unde_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_UNDE_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_unde_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_unde_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtH_line_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_LINE_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_line_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_line_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtH_vi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_VI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_vi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_vi_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtH_vf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_VF_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_vf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_vf_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtH_pke_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_PKE_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_pke_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_pke_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtH_pme_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_PME_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_pme_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_pme_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtH_tp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_TP_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_tp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_tp_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            if ( ( nRcdExists_1488 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1AV1488( ) ;
            }
            sendRow1AV1488( ) ;
            bGXsfl_80_Refreshing = false ;
         }
         Gx_mode = sMode1488 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1488 = (short)(5) ;
         nRcdExists_1488 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1AV1488( ) ;
            while ( RcdFound1488 != 0 )
            {
               sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_801488( ) ;
               init_level_properties1488( ) ;
               standaloneNotModal1AV1488( ) ;
               getByPrimaryKey1AV1488( ) ;
               standaloneModal1AV1488( ) ;
               addRow1AV1488( ) ;
               scanNext1AV1488( ) ;
            }
            scanEnd1AV1488( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1488 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_801488( ) ;
      initAll1AV1488( ) ;
      init_level_properties1488( ) ;
      nRcdExists_1488 = (short)(0) ;
      nIsMod_1488 = (short)(0) ;
      nRcdDeleted_1488 = (short)(0) ;
      nBlankRcdCount1488 = (short)(nBlankRcdUsr1488+nBlankRcdCount1488) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1488 > 0 )
      {
         standaloneNotModal1AV1488( ) ;
         standaloneModal1AV1488( ) ;
         addRow1AV1488( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtH_linIe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1488 = (short)(nBlankRcdCount1488-1) ;
      }
      Gx_mode = sMode1488 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREIe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREIe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREIe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THPREIe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THPREIe.htm");
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
      e111AV2 ();
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
            Z831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z831TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z583IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z583IntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11092H_DiaI = localUtil.ctod( httpContext.cgiGet( "Z11092H_DiaI"), 0) ;
            Z11186H_UltLe = (int)(localUtil.ctol( httpContext.cgiGet( "Z11186H_UltLe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_80 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_80"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
            n69ArtDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPCOLCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipColCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A831TipColCod = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            }
            else
            {
               A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "INTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtIntCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A583IntCod = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
            }
            else
            {
               A583IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
            }
            A832TipColDsc = httpContext.cgiGet( edtTipColDsc_Internalname) ;
            n832TipColDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
            A584IntDsc = httpContext.cgiGet( edtIntDsc_Internalname) ;
            n584IntDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
            if ( localUtil.vcdate( httpContext.cgiGet( edtH_DiaI_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "H_DIAI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtH_DiaI_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11092H_DiaI = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A11092H_DiaI", localUtil.format(A11092H_DiaI, "99/99/99"));
            }
            else
            {
               A11092H_DiaI = localUtil.ctod( httpContext.cgiGet( edtH_DiaI_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11092H_DiaI", localUtil.format(A11092H_DiaI, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtH_UltLe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtH_UltLe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "H_ULTLE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtH_UltLe_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11186H_UltLe = 0 ;
               n11186H_UltLe = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11186H_UltLe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11186H_UltLe), 8, 0));
            }
            else
            {
               A11186H_UltLe = (int)(localUtil.ctol( httpContext.cgiGet( edtH_UltLe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11186H_UltLe = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11186H_UltLe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11186H_UltLe), 8, 0));
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
               A583IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
               A11092H_DiaI = localUtil.parseDateParm( httpContext.GetPar( "H_DiaI")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11092H_DiaI", localUtil.format(A11092H_DiaI, "99/99/99"));
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
                        e111AV2 ();
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
            initAll1AV1481( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1488_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1488_Enabled), 5, 0), !bGXsfl_80_Refreshing);
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
      disableAttributes1AV1481( ) ;
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

   public void confirm_1AV0( )
   {
      beforeValidate1AV1481( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1AV1481( ) ;
         }
         else
         {
            checkExtendedTable1AV1481( ) ;
            if ( AnyError == 0 )
            {
               zm1AV1481( 2) ;
               zm1AV1481( 3) ;
               zm1AV1481( 4) ;
               zm1AV1481( 5) ;
               zm1AV1481( 6) ;
               zm1AV1481( 7) ;
            }
            closeExtendedTableCursors1AV1481( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1481 = Gx_mode ;
         confirm_1AV1488( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1481 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1481 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1AV0( ) ;
      }
   }

   public void confirm_1AV1488( )
   {
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow1AV1488( ) ;
         if ( ( nRcdExists_1488 != 0 ) || ( nIsMod_1488 != 0 ) )
         {
            getKey1AV1488( ) ;
            if ( ( nRcdExists_1488 == 0 ) && ( nRcdDeleted_1488 == 0 ) )
            {
               if ( RcdFound1488 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1AV1488( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1AV1488( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1AV1488( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "H_LINIE_" + sGXsfl_80_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtH_linIe_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1488 != 0 )
               {
                  if ( nRcdDeleted_1488 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1AV1488( ) ;
                     load1AV1488( ) ;
                     beforeValidate1AV1488( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1AV1488( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1488 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1AV1488( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1AV1488( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1AV1488( ) ;
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
                  if ( nRcdDeleted_1488 == 0 )
                  {
                     GXCCtl = "H_LINIE_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtH_linIe_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1488_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1488, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_linIe_Internalname, GXutil.ltrim( localUtil.ntoc( A11187H_linIe, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_unde_Internalname, GXutil.rtrim( A11188H_unde)) ;
         httpContext.changePostValue( edtH_line_Internalname, GXutil.ltrim( localUtil.ntoc( A11189H_line, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_vi_Internalname, GXutil.ltrim( localUtil.ntoc( A11190H_vi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_vf_Internalname, GXutil.ltrim( localUtil.ntoc( A11191H_vf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_pke_Internalname, GXutil.ltrim( localUtil.ntoc( A11192H_pke, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_pme_Internalname, GXutil.ltrim( localUtil.ntoc( A11193H_pme, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_tp_Internalname, GXutil.rtrim( A11194H_tp)) ;
         httpContext.changePostValue( "ZT_"+"Z11187H_linIe_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z11187H_linIe, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11188H_unde_"+sGXsfl_80_idx, GXutil.rtrim( Z11188H_unde)) ;
         httpContext.changePostValue( "ZT_"+"Z11189H_line_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z11189H_line, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11190H_vi_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z11190H_vi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11191H_vf_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z11191H_vf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11192H_pke_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z11192H_pke, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11193H_pme_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z11193H_pme, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11194H_tp_"+sGXsfl_80_idx, GXutil.rtrim( Z11194H_tp)) ;
         httpContext.changePostValue( "nRcdDeleted_1488_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1488, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1488_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1488, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1488_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1488, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1488 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1488_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1488_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_LINIE_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_linIe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_UNDE_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_unde_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_LINE_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_line_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_VI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_vi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_VF_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_vf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_PKE_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_pke_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_PME_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_pme_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_TP_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_tp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1AV0( )
   {
   }

   public void e111AV2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      thpreie_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      thpreie_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      thpreie_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      thpreie_impl.this.A396EmprCod = GXv_char2[0] ;
      thpreie_impl.this.AV11EmprNom = GXv_char3[0] ;
      thpreie_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1AV1481( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11186H_UltLe = T01AV5_A11186H_UltLe[0] ;
         }
         else
         {
            Z11186H_UltLe = A11186H_UltLe ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z11092H_DiaI = A11092H_DiaI ;
         Z11186H_UltLe = A11186H_UltLe ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z583IntCod = A583IntCod ;
         Z831TipColCod = A831TipColCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z69ArtDsc = A69ArtDsc ;
         Z832TipColDsc = A832TipColDsc ;
         Z584IntDsc = A584IntDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "THPREIe" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01AV6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01AV6_A407EmprNom[0] ;
      n407EmprNom = T01AV6_n407EmprNom[0] ;
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

   public void load1AV1481( )
   {
      /* Using cursor T01AV12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1481 = (short)(1) ;
         A407EmprNom = T01AV12_A407EmprNom[0] ;
         n407EmprNom = T01AV12_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01AV12_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A69ArtDsc = T01AV12_A69ArtDsc[0] ;
         n69ArtDsc = T01AV12_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A832TipColDsc = T01AV12_A832TipColDsc[0] ;
         n832TipColDsc = T01AV12_n832TipColDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
         A584IntDsc = T01AV12_A584IntDsc[0] ;
         n584IntDsc = T01AV12_n584IntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
         A11186H_UltLe = T01AV12_A11186H_UltLe[0] ;
         n11186H_UltLe = T01AV12_n11186H_UltLe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11186H_UltLe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11186H_UltLe), 8, 0));
         zm1AV1481( -1) ;
      }
      pr_default.close(10);
      onLoadActions1AV1481( ) ;
   }

   public void onLoadActions1AV1481( )
   {
   }

   public void checkExtendedTable1AV1481( )
   {
      nIsDirty_1481 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01AV7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01AV7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
      /* Using cursor T01AV8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01AV8_A69ArtDsc[0] ;
      n69ArtDsc = T01AV8_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(6);
      /* Using cursor T01AV10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipColCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A832TipColDsc = T01AV10_A832TipColDsc[0] ;
      n832TipColDsc = T01AV10_n832TipColDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      pr_default.close(8);
      /* Using cursor T01AV9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A584IntDsc = T01AV9_A584IntDsc[0] ;
      n584IntDsc = T01AV9_n584IntDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
      pr_default.close(7);
      /* Using cursor T01AV11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRETIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(9);
   }

   public void closeExtendedTableCursors1AV1481( )
   {
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(9);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01AV13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01AV13_A279CliNom[0] ;
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

   public void gxload_4( String A396EmprCod ,
                         int A252CliCod ,
                         String A65ArtCod )
   {
      /* Using cursor T01AV14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01AV14_A69ArtDsc[0] ;
      n69ArtDsc = T01AV14_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A69ArtDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_6( String A396EmprCod ,
                         byte A831TipColCod )
   {
      /* Using cursor T01AV15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipColCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A832TipColDsc = T01AV15_A832TipColDsc[0] ;
      n832TipColDsc = T01AV15_n832TipColDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A832TipColDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_5( String A396EmprCod ,
                         byte A583IntCod )
   {
      /* Using cursor T01AV16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A584IntDsc = T01AV16_A584IntDsc[0] ;
      n584IntDsc = T01AV16_n584IntDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A584IntDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_7( String A396EmprCod ,
                         int A252CliCod ,
                         String A65ArtCod ,
                         byte A831TipColCod ,
                         byte A583IntCod )
   {
      /* Using cursor T01AV17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRETIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void getKey1AV1481( )
   {
      /* Using cursor T01AV18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1481 = (short)(1) ;
      }
      else
      {
         RcdFound1481 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01AV5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01AV5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1AV1481( 1) ;
         RcdFound1481 = (short)(1) ;
         A11092H_DiaI = T01AV5_A11092H_DiaI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11092H_DiaI", localUtil.format(A11092H_DiaI, "99/99/99"));
         A11186H_UltLe = T01AV5_A11186H_UltLe[0] ;
         n11186H_UltLe = T01AV5_n11186H_UltLe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11186H_UltLe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11186H_UltLe), 8, 0));
         A252CliCod = T01AV5_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01AV5_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A583IntCod = T01AV5_A583IntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         A831TipColCod = T01AV5_A831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z831TipColCod = A831TipColCod ;
         Z583IntCod = A583IntCod ;
         Z11092H_DiaI = A11092H_DiaI ;
         sMode1481 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1AV1481( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1481 = (short)(0) ;
            initializeNonKey1AV1481( ) ;
         }
         Gx_mode = sMode1481 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1481 = (short)(0) ;
         initializeNonKey1AV1481( ) ;
         sMode1481 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1481 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1AV1481( ) ;
      if ( RcdFound1481 == 0 )
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
      RcdFound1481 = (short)(0) ;
      /* Using cursor T01AV19 */
      pr_default.execute(17, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), Byte.valueOf(A831TipColCod), Byte.valueOf(A831TipColCod), A65ArtCod, Integer.valueOf(A252CliCod), Byte.valueOf(A583IntCod), Byte.valueOf(A583IntCod), Byte.valueOf(A831TipColCod), A65ArtCod, Integer.valueOf(A252CliCod), A11092H_DiaI, A396EmprCod});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( T01AV19_A252CliCod[0] < A252CliCod ) || ( T01AV19_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AV19_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01AV19_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AV19_A252CliCod[0] == A252CliCod ) && ( T01AV19_A831TipColCod[0] < A831TipColCod ) || ( T01AV19_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01AV19_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AV19_A252CliCod[0] == A252CliCod ) && ( T01AV19_A583IntCod[0] < A583IntCod ) || ( T01AV19_A583IntCod[0] == A583IntCod ) && ( T01AV19_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01AV19_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AV19_A252CliCod[0] == A252CliCod ) && GXutil.resetTime(T01AV19_A11092H_DiaI[0]).before( GXutil.resetTime( A11092H_DiaI )) ) && ( GXutil.strcmp(T01AV19_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( T01AV19_A252CliCod[0] > A252CliCod ) || ( T01AV19_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AV19_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01AV19_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AV19_A252CliCod[0] == A252CliCod ) && ( T01AV19_A831TipColCod[0] > A831TipColCod ) || ( T01AV19_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01AV19_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AV19_A252CliCod[0] == A252CliCod ) && ( T01AV19_A583IntCod[0] > A583IntCod ) || ( T01AV19_A583IntCod[0] == A583IntCod ) && ( T01AV19_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01AV19_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AV19_A252CliCod[0] == A252CliCod ) && GXutil.resetTime(T01AV19_A11092H_DiaI[0]).after( GXutil.resetTime( A11092H_DiaI )) ) && ( GXutil.strcmp(T01AV19_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01AV19_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01AV19_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A831TipColCod = T01AV19_A831TipColCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            A583IntCod = T01AV19_A583IntCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
            A11092H_DiaI = T01AV19_A11092H_DiaI[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11092H_DiaI", localUtil.format(A11092H_DiaI, "99/99/99"));
            RcdFound1481 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void move_previous( )
   {
      RcdFound1481 = (short)(0) ;
      /* Using cursor T01AV20 */
      pr_default.execute(18, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), Byte.valueOf(A831TipColCod), Byte.valueOf(A831TipColCod), A65ArtCod, Integer.valueOf(A252CliCod), Byte.valueOf(A583IntCod), Byte.valueOf(A583IntCod), Byte.valueOf(A831TipColCod), A65ArtCod, Integer.valueOf(A252CliCod), A11092H_DiaI, A396EmprCod});
      if ( (pr_default.getStatus(18) != 101) )
      {
         while ( (pr_default.getStatus(18) != 101) && ( ( T01AV20_A252CliCod[0] > A252CliCod ) || ( T01AV20_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AV20_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01AV20_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AV20_A252CliCod[0] == A252CliCod ) && ( T01AV20_A831TipColCod[0] > A831TipColCod ) || ( T01AV20_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01AV20_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AV20_A252CliCod[0] == A252CliCod ) && ( T01AV20_A583IntCod[0] > A583IntCod ) || ( T01AV20_A583IntCod[0] == A583IntCod ) && ( T01AV20_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01AV20_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AV20_A252CliCod[0] == A252CliCod ) && GXutil.resetTime(T01AV20_A11092H_DiaI[0]).after( GXutil.resetTime( A11092H_DiaI )) ) && ( GXutil.strcmp(T01AV20_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(18);
         }
         if ( (pr_default.getStatus(18) != 101) && ( ( T01AV20_A252CliCod[0] < A252CliCod ) || ( T01AV20_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AV20_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01AV20_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AV20_A252CliCod[0] == A252CliCod ) && ( T01AV20_A831TipColCod[0] < A831TipColCod ) || ( T01AV20_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01AV20_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AV20_A252CliCod[0] == A252CliCod ) && ( T01AV20_A583IntCod[0] < A583IntCod ) || ( T01AV20_A583IntCod[0] == A583IntCod ) && ( T01AV20_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01AV20_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01AV20_A252CliCod[0] == A252CliCod ) && GXutil.resetTime(T01AV20_A11092H_DiaI[0]).before( GXutil.resetTime( A11092H_DiaI )) ) && ( GXutil.strcmp(T01AV20_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01AV20_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01AV20_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A831TipColCod = T01AV20_A831TipColCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            A583IntCod = T01AV20_A583IntCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
            A11092H_DiaI = T01AV20_A11092H_DiaI[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11092H_DiaI", localUtil.format(A11092H_DiaI, "99/99/99"));
            RcdFound1481 = (short)(1) ;
         }
      }
      pr_default.close(18);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1AV1481( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1AV1481( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1481 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A831TipColCod != Z831TipColCod ) || ( A583IntCod != Z583IntCod ) || !( GXutil.dateCompare(GXutil.resetTime(A11092H_DiaI), GXutil.resetTime(Z11092H_DiaI)) ) )
            {
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = Z65ArtCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A831TipColCod = Z831TipColCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
               A583IntCod = Z583IntCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
               A11092H_DiaI = Z11092H_DiaI ;
               httpContext.ajax_rsp_assign_attri("", false, "A11092H_DiaI", localUtil.format(A11092H_DiaI, "99/99/99"));
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
               update1AV1481( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A831TipColCod != Z831TipColCod ) || ( A583IntCod != Z583IntCod ) || !( GXutil.dateCompare(GXutil.resetTime(A11092H_DiaI), GXutil.resetTime(Z11092H_DiaI)) ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1AV1481( ) ;
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
                  insert1AV1481( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A831TipColCod != Z831TipColCod ) || ( A583IntCod != Z583IntCod ) || !( GXutil.dateCompare(GXutil.resetTime(A11092H_DiaI), GXutil.resetTime(Z11092H_DiaI)) ) )
      {
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = Z65ArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A831TipColCod = Z831TipColCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         A583IntCod = Z583IntCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         A11092H_DiaI = Z11092H_DiaI ;
         httpContext.ajax_rsp_assign_attri("", false, "A11092H_DiaI", localUtil.format(A11092H_DiaI, "99/99/99"));
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
      getKey1AV1481( ) ;
      if ( RcdFound1481 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A831TipColCod != Z831TipColCod ) || ( A583IntCod != Z583IntCod ) || !( GXutil.dateCompare(GXutil.resetTime(A11092H_DiaI), GXutil.resetTime(Z11092H_DiaI)) ) )
         {
            A252CliCod = Z252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = Z65ArtCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A831TipColCod = Z831TipColCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            A583IntCod = Z583IntCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
            A11092H_DiaI = Z11092H_DiaI ;
            httpContext.ajax_rsp_assign_attri("", false, "A11092H_DiaI", localUtil.format(A11092H_DiaI, "99/99/99"));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( A831TipColCod != Z831TipColCod ) || ( A583IntCod != Z583IntCod ) || !( GXutil.dateCompare(GXutil.resetTime(A11092H_DiaI), GXutil.resetTime(Z11092H_DiaI)) ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thpreie");
      GX_FocusControl = edtH_UltLe_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1AV0( ) ;
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
      if ( RcdFound1481 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtH_UltLe_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1AV1481( ) ;
      if ( RcdFound1481 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtH_UltLe_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1AV1481( ) ;
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
      if ( RcdFound1481 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtH_UltLe_Internalname ;
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
      if ( RcdFound1481 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtH_UltLe_Internalname ;
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
      scanStart1AV1481( ) ;
      if ( RcdFound1481 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1481 != 0 )
         {
            scanNext1AV1481( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtH_UltLe_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1AV1481( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1AV1481( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AV4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHPREIT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z11186H_UltLe != T01AV4_A11186H_UltLe[0] ) )
         {
            if ( Z11186H_UltLe != T01AV4_A11186H_UltLe[0] )
            {
               GXutil.writeLogln("thpreie:[seudo value changed for attri]"+"H_UltLe");
               GXutil.writeLogRaw("Old: ",Z11186H_UltLe);
               GXutil.writeLogRaw("Current: ",T01AV4_A11186H_UltLe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHPREIT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AV1481( )
   {
      beforeValidate1AV1481( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AV1481( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AV1481( 0) ;
         checkOptimisticConcurrency1AV1481( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AV1481( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AV1481( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AV21 */
                  pr_default.execute(19, new Object[] {A11092H_DiaI, Boolean.valueOf(n11186H_UltLe), Integer.valueOf(A11186H_UltLe), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A583IntCod), Byte.valueOf(A831TipColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREIT");
                  if ( (pr_default.getStatus(19) == 1) )
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
                        processLevel1AV1481( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1AV0( ) ;
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
            load1AV1481( ) ;
         }
         endLevel1AV1481( ) ;
      }
      closeExtendedTableCursors1AV1481( ) ;
   }

   public void update1AV1481( )
   {
      beforeValidate1AV1481( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AV1481( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AV1481( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AV1481( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1AV1481( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AV22 */
                  pr_default.execute(20, new Object[] {Boolean.valueOf(n11186H_UltLe), Integer.valueOf(A11186H_UltLe), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREIT");
                  if ( (pr_default.getStatus(20) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHPREIT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1AV1481( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1AV1481( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1AV0( ) ;
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
         endLevel1AV1481( ) ;
      }
      closeExtendedTableCursors1AV1481( ) ;
   }

   public void deferredUpdate1AV1481( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AV1481( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AV1481( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AV1481( ) ;
         afterConfirm1AV1481( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AV1481( ) ;
            if ( AnyError == 0 )
            {
               scanStart1AV1488( ) ;
               while ( RcdFound1488 != 0 )
               {
                  getByPrimaryKey1AV1488( ) ;
                  delete1AV1488( ) ;
                  scanNext1AV1488( ) ;
               }
               scanEnd1AV1488( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AV23 */
                  pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREIT");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1481 == 0 )
                        {
                           initAll1AV1481( ) ;
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
                        resetCaption1AV0( ) ;
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
      sMode1481 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1AV1481( ) ;
      Gx_mode = sMode1481 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AV1481( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01AV24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01AV24_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(22);
         /* Using cursor T01AV25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         A69ArtDsc = T01AV25_A69ArtDsc[0] ;
         n69ArtDsc = T01AV25_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         pr_default.close(23);
         /* Using cursor T01AV26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Byte.valueOf(A831TipColCod)});
         A832TipColDsc = T01AV26_A832TipColDsc[0] ;
         n832TipColDsc = T01AV26_n832TipColDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
         pr_default.close(24);
         /* Using cursor T01AV27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
         A584IntDsc = T01AV27_A584IntDsc[0] ;
         n584IntDsc = T01AV27_n584IntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
         pr_default.close(25);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01AV28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
      }
   }

   public void processNestedLevel1AV1488( )
   {
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow1AV1488( ) ;
         if ( ( nRcdExists_1488 != 0 ) || ( nIsMod_1488 != 0 ) )
         {
            standaloneNotModal1AV1488( ) ;
            getKey1AV1488( ) ;
            if ( ( nRcdExists_1488 == 0 ) && ( nRcdDeleted_1488 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1AV1488( ) ;
            }
            else
            {
               if ( RcdFound1488 != 0 )
               {
                  if ( ( nRcdDeleted_1488 != 0 ) && ( nRcdExists_1488 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1AV1488( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1488 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1AV1488( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1488 == 0 )
                  {
                     GXCCtl = "H_LINIE_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtH_linIe_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1488_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1488, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_linIe_Internalname, GXutil.ltrim( localUtil.ntoc( A11187H_linIe, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_unde_Internalname, GXutil.rtrim( A11188H_unde)) ;
         httpContext.changePostValue( edtH_line_Internalname, GXutil.ltrim( localUtil.ntoc( A11189H_line, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_vi_Internalname, GXutil.ltrim( localUtil.ntoc( A11190H_vi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_vf_Internalname, GXutil.ltrim( localUtil.ntoc( A11191H_vf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_pke_Internalname, GXutil.ltrim( localUtil.ntoc( A11192H_pke, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_pme_Internalname, GXutil.ltrim( localUtil.ntoc( A11193H_pme, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_tp_Internalname, GXutil.rtrim( A11194H_tp)) ;
         httpContext.changePostValue( "ZT_"+"Z11187H_linIe_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z11187H_linIe, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11188H_unde_"+sGXsfl_80_idx, GXutil.rtrim( Z11188H_unde)) ;
         httpContext.changePostValue( "ZT_"+"Z11189H_line_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z11189H_line, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11190H_vi_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z11190H_vi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11191H_vf_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z11191H_vf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11192H_pke_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z11192H_pke, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11193H_pme_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z11193H_pme, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11194H_tp_"+sGXsfl_80_idx, GXutil.rtrim( Z11194H_tp)) ;
         httpContext.changePostValue( "nRcdDeleted_1488_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1488, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1488_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1488, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1488_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1488, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1488 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1488_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1488_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_LINIE_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_linIe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_UNDE_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_unde_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_LINE_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_line_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_VI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_vi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_VF_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_vf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_PKE_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_pke_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_PME_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_pme_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_TP_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_tp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1AV1488( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1488 = (short)(0) ;
      nIsMod_1488 = (short)(0) ;
      nRcdDeleted_1488 = (short)(0) ;
   }

   public void processLevel1AV1481( )
   {
      /* Save parent mode. */
      sMode1481 = Gx_mode ;
      processNestedLevel1AV1488( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1481 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1AV1481( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1AV1481( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thpreie");
         if ( AnyError == 0 )
         {
            confirmValues1AV0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thpreie");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1AV1481( )
   {
      /* Scan By routine */
      /* Using cursor T01AV29 */
      pr_default.execute(27, new Object[] {A396EmprCod});
      RcdFound1481 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1481 = (short)(1) ;
         A252CliCod = T01AV29_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01AV29_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A831TipColCod = T01AV29_A831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         A583IntCod = T01AV29_A583IntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         A11092H_DiaI = T01AV29_A11092H_DiaI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11092H_DiaI", localUtil.format(A11092H_DiaI, "99/99/99"));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AV1481( )
   {
      /* Scan next routine */
      pr_default.readNext(27);
      RcdFound1481 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1481 = (short)(1) ;
         A252CliCod = T01AV29_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01AV29_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A831TipColCod = T01AV29_A831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         A583IntCod = T01AV29_A583IntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         A11092H_DiaI = T01AV29_A11092H_DiaI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11092H_DiaI", localUtil.format(A11092H_DiaI, "99/99/99"));
      }
   }

   public void scanEnd1AV1481( )
   {
      pr_default.close(27);
   }

   public void afterConfirm1AV1481( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1AV1481( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AV1481( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AV1481( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AV1481( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AV1481( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AV1481( )
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
      edtTipColCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Enabled), 5, 0), true);
      edtIntCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Enabled), 5, 0), true);
      edtTipColDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColDsc_Enabled), 5, 0), true);
      edtIntDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDsc_Enabled), 5, 0), true);
      edtH_DiaI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_DiaI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_DiaI_Enabled), 5, 0), true);
      edtH_UltLe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_UltLe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_UltLe_Enabled), 5, 0), true);
   }

   public void zm1AV1488( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11190H_vi = T01AV3_A11190H_vi[0] ;
            Z11191H_vf = T01AV3_A11191H_vf[0] ;
            Z11192H_pke = T01AV3_A11192H_pke[0] ;
            Z11193H_pme = T01AV3_A11193H_pme[0] ;
            Z11194H_tp = T01AV3_A11194H_tp[0] ;
         }
         else
         {
            Z11190H_vi = A11190H_vi ;
            Z11191H_vf = A11191H_vf ;
            Z11192H_pke = A11192H_pke ;
            Z11193H_pme = A11193H_pme ;
            Z11194H_tp = A11194H_tp ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z831TipColCod = A831TipColCod ;
         Z11092H_DiaI = A11092H_DiaI ;
         Z11187H_linIe = A11187H_linIe ;
         Z11188H_unde = A11188H_unde ;
         Z11189H_line = A11189H_line ;
         Z11190H_vi = A11190H_vi ;
         Z11191H_vf = A11191H_vf ;
         Z11192H_pke = A11192H_pke ;
         Z11193H_pme = A11193H_pme ;
         Z11194H_tp = A11194H_tp ;
         Z396EmprCod = A396EmprCod ;
         Z583IntCod = A583IntCod ;
      }
   }

   public void standaloneNotModal1AV1488( )
   {
   }

   public void standaloneModal1AV1488( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtH_linIe_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtH_linIe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_linIe_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      else
      {
         edtH_linIe_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtH_linIe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_linIe_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtH_unde_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtH_unde_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_unde_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      else
      {
         edtH_unde_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtH_unde_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_unde_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtH_line_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtH_line_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_line_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      else
      {
         edtH_line_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtH_line_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_line_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
   }

   public void load1AV1488( )
   {
      /* Using cursor T01AV30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI, Integer.valueOf(A11187H_linIe), A11188H_unde, Short.valueOf(A11189H_line)});
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1488 = (short)(1) ;
         A11190H_vi = T01AV30_A11190H_vi[0] ;
         n11190H_vi = T01AV30_n11190H_vi[0] ;
         A11191H_vf = T01AV30_A11191H_vf[0] ;
         n11191H_vf = T01AV30_n11191H_vf[0] ;
         A11192H_pke = T01AV30_A11192H_pke[0] ;
         n11192H_pke = T01AV30_n11192H_pke[0] ;
         A11193H_pme = T01AV30_A11193H_pme[0] ;
         n11193H_pme = T01AV30_n11193H_pme[0] ;
         A11194H_tp = T01AV30_A11194H_tp[0] ;
         n11194H_tp = T01AV30_n11194H_tp[0] ;
         zm1AV1488( -8) ;
      }
      pr_default.close(28);
      onLoadActions1AV1488( ) ;
   }

   public void onLoadActions1AV1488( )
   {
   }

   public void checkExtendedTable1AV1488( )
   {
      nIsDirty_1488 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1AV1488( ) ;
   }

   public void closeExtendedTableCursors1AV1488( )
   {
   }

   public void enableDisable1AV1488( )
   {
   }

   public void getKey1AV1488( )
   {
      /* Using cursor T01AV31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI, Integer.valueOf(A11187H_linIe), A11188H_unde, Short.valueOf(A11189H_line)});
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1488 = (short)(1) ;
      }
      else
      {
         RcdFound1488 = (short)(0) ;
      }
      pr_default.close(29);
   }

   public void getByPrimaryKey1AV1488( )
   {
      /* Using cursor T01AV3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI, Integer.valueOf(A11187H_linIe), A11188H_unde, Short.valueOf(A11189H_line)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01AV3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1AV1488( 8) ;
         RcdFound1488 = (short)(1) ;
         initializeNonKey1AV1488( ) ;
         A11187H_linIe = T01AV3_A11187H_linIe[0] ;
         A11188H_unde = T01AV3_A11188H_unde[0] ;
         A11189H_line = T01AV3_A11189H_line[0] ;
         A11190H_vi = T01AV3_A11190H_vi[0] ;
         n11190H_vi = T01AV3_n11190H_vi[0] ;
         A11191H_vf = T01AV3_A11191H_vf[0] ;
         n11191H_vf = T01AV3_n11191H_vf[0] ;
         A11192H_pke = T01AV3_A11192H_pke[0] ;
         n11192H_pke = T01AV3_n11192H_pke[0] ;
         A11193H_pme = T01AV3_A11193H_pme[0] ;
         n11193H_pme = T01AV3_n11193H_pme[0] ;
         A11194H_tp = T01AV3_A11194H_tp[0] ;
         n11194H_tp = T01AV3_n11194H_tp[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z831TipColCod = A831TipColCod ;
         Z583IntCod = A583IntCod ;
         Z11092H_DiaI = A11092H_DiaI ;
         Z11187H_linIe = A11187H_linIe ;
         Z11188H_unde = A11188H_unde ;
         Z11189H_line = A11189H_line ;
         sMode1488 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1AV1488( ) ;
         load1AV1488( ) ;
         Gx_mode = sMode1488 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1488 = (short)(0) ;
         initializeNonKey1AV1488( ) ;
         sMode1488 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1AV1488( ) ;
         Gx_mode = sMode1488 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1AV1488( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1AV1488( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AV2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI, Integer.valueOf(A11187H_linIe), A11188H_unde, Short.valueOf(A11189H_line)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHPREIe"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11190H_vi, T01AV2_A11190H_vi[0]) != 0 ) || ( DecimalUtil.compareTo(Z11191H_vf, T01AV2_A11191H_vf[0]) != 0 ) || ( DecimalUtil.compareTo(Z11192H_pke, T01AV2_A11192H_pke[0]) != 0 ) || ( DecimalUtil.compareTo(Z11193H_pme, T01AV2_A11193H_pme[0]) != 0 ) || ( GXutil.strcmp(Z11194H_tp, T01AV2_A11194H_tp[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z11190H_vi, T01AV2_A11190H_vi[0]) != 0 )
            {
               GXutil.writeLogln("thpreie:[seudo value changed for attri]"+"H_vi");
               GXutil.writeLogRaw("Old: ",Z11190H_vi);
               GXutil.writeLogRaw("Current: ",T01AV2_A11190H_vi[0]);
            }
            if ( DecimalUtil.compareTo(Z11191H_vf, T01AV2_A11191H_vf[0]) != 0 )
            {
               GXutil.writeLogln("thpreie:[seudo value changed for attri]"+"H_vf");
               GXutil.writeLogRaw("Old: ",Z11191H_vf);
               GXutil.writeLogRaw("Current: ",T01AV2_A11191H_vf[0]);
            }
            if ( DecimalUtil.compareTo(Z11192H_pke, T01AV2_A11192H_pke[0]) != 0 )
            {
               GXutil.writeLogln("thpreie:[seudo value changed for attri]"+"H_pke");
               GXutil.writeLogRaw("Old: ",Z11192H_pke);
               GXutil.writeLogRaw("Current: ",T01AV2_A11192H_pke[0]);
            }
            if ( DecimalUtil.compareTo(Z11193H_pme, T01AV2_A11193H_pme[0]) != 0 )
            {
               GXutil.writeLogln("thpreie:[seudo value changed for attri]"+"H_pme");
               GXutil.writeLogRaw("Old: ",Z11193H_pme);
               GXutil.writeLogRaw("Current: ",T01AV2_A11193H_pme[0]);
            }
            if ( GXutil.strcmp(Z11194H_tp, T01AV2_A11194H_tp[0]) != 0 )
            {
               GXutil.writeLogln("thpreie:[seudo value changed for attri]"+"H_tp");
               GXutil.writeLogRaw("Old: ",Z11194H_tp);
               GXutil.writeLogRaw("Current: ",T01AV2_A11194H_tp[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHPREIe"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AV1488( )
   {
      beforeValidate1AV1488( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AV1488( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AV1488( 0) ;
         checkOptimisticConcurrency1AV1488( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AV1488( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AV1488( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AV32 */
                  pr_default.execute(30, new Object[] {Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), A11092H_DiaI, Integer.valueOf(A11187H_linIe), A11188H_unde, Short.valueOf(A11189H_line), Boolean.valueOf(n11190H_vi), A11190H_vi, Boolean.valueOf(n11191H_vf), A11191H_vf, Boolean.valueOf(n11192H_pke), A11192H_pke, Boolean.valueOf(n11193H_pme), A11193H_pme, Boolean.valueOf(n11194H_tp), A11194H_tp, A396EmprCod, Byte.valueOf(A583IntCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREIe");
                  if ( (pr_default.getStatus(30) == 1) )
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
            load1AV1488( ) ;
         }
         endLevel1AV1488( ) ;
      }
      closeExtendedTableCursors1AV1488( ) ;
   }

   public void update1AV1488( )
   {
      beforeValidate1AV1488( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AV1488( ) ;
      }
      if ( ( nIsMod_1488 != 0 ) || ( nIsDirty_1488 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1AV1488( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1AV1488( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1AV1488( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01AV33 */
                     pr_default.execute(31, new Object[] {Boolean.valueOf(n11190H_vi), A11190H_vi, Boolean.valueOf(n11191H_vf), A11191H_vf, Boolean.valueOf(n11192H_pke), A11192H_pke, Boolean.valueOf(n11193H_pme), A11193H_pme, Boolean.valueOf(n11194H_tp), A11194H_tp, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI, Integer.valueOf(A11187H_linIe), A11188H_unde, Short.valueOf(A11189H_line)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREIe");
                     if ( (pr_default.getStatus(31) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHPREIe"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1AV1488( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1AV1488( ) ;
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
            endLevel1AV1488( ) ;
         }
      }
      closeExtendedTableCursors1AV1488( ) ;
   }

   public void deferredUpdate1AV1488( )
   {
   }

   public void delete1AV1488( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AV1488( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AV1488( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AV1488( ) ;
         afterConfirm1AV1488( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AV1488( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01AV34 */
               pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI, Integer.valueOf(A11187H_linIe), A11188H_unde, Short.valueOf(A11189H_line)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHPREIe");
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
      sMode1488 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1AV1488( ) ;
      Gx_mode = sMode1488 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AV1488( )
   {
      standaloneModal1AV1488( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1AV1488( )
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

   public void scanStart1AV1488( )
   {
      /* Scan By routine */
      /* Using cursor T01AV35 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), A11092H_DiaI});
      RcdFound1488 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound1488 = (short)(1) ;
         A11187H_linIe = T01AV35_A11187H_linIe[0] ;
         A11188H_unde = T01AV35_A11188H_unde[0] ;
         A11189H_line = T01AV35_A11189H_line[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AV1488( )
   {
      /* Scan next routine */
      pr_default.readNext(33);
      RcdFound1488 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound1488 = (short)(1) ;
         A11187H_linIe = T01AV35_A11187H_linIe[0] ;
         A11188H_unde = T01AV35_A11188H_unde[0] ;
         A11189H_line = T01AV35_A11189H_line[0] ;
      }
   }

   public void scanEnd1AV1488( )
   {
      pr_default.close(33);
   }

   public void afterConfirm1AV1488( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1AV1488( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AV1488( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AV1488( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AV1488( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AV1488( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AV1488( )
   {
      edtH_linIe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_linIe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_linIe_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtH_unde_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_unde_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_unde_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtH_line_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_line_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_line_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtH_vi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_vi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_vi_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtH_vf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_vf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_vf_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtH_pke_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_pke_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_pke_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtH_pme_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_pme_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_pme_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtH_tp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_tp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_tp_Enabled), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void send_integrity_lvl_hashes1AV1488( )
   {
   }

   public void send_integrity_lvl_hashes1AV1481( )
   {
   }

   public void subsflControlProps_801488( )
   {
      edtavnRcdDeleted_1488_Internalname = "vNRCDDELETED_1488_"+sGXsfl_80_idx ;
      edtH_linIe_Internalname = "H_LINIE_"+sGXsfl_80_idx ;
      edtH_unde_Internalname = "H_UNDE_"+sGXsfl_80_idx ;
      edtH_line_Internalname = "H_LINE_"+sGXsfl_80_idx ;
      edtH_vi_Internalname = "H_VI_"+sGXsfl_80_idx ;
      edtH_vf_Internalname = "H_VF_"+sGXsfl_80_idx ;
      edtH_pke_Internalname = "H_PKE_"+sGXsfl_80_idx ;
      edtH_pme_Internalname = "H_PME_"+sGXsfl_80_idx ;
      edtH_tp_Internalname = "H_TP_"+sGXsfl_80_idx ;
   }

   public void subsflControlProps_fel_801488( )
   {
      edtavnRcdDeleted_1488_Internalname = "vNRCDDELETED_1488_"+sGXsfl_80_fel_idx ;
      edtH_linIe_Internalname = "H_LINIE_"+sGXsfl_80_fel_idx ;
      edtH_unde_Internalname = "H_UNDE_"+sGXsfl_80_fel_idx ;
      edtH_line_Internalname = "H_LINE_"+sGXsfl_80_fel_idx ;
      edtH_vi_Internalname = "H_VI_"+sGXsfl_80_fel_idx ;
      edtH_vf_Internalname = "H_VF_"+sGXsfl_80_fel_idx ;
      edtH_pke_Internalname = "H_PKE_"+sGXsfl_80_fel_idx ;
      edtH_pme_Internalname = "H_PME_"+sGXsfl_80_fel_idx ;
      edtH_tp_Internalname = "H_TP_"+sGXsfl_80_fel_idx ;
   }

   public void addRow1AV1488( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801488( ) ;
      sendRow1AV1488( ) ;
   }

   public void sendRow1AV1488( )
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
         if ( ((int)((nGXsfl_80_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1488_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1488_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1488, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1488_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1488), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1488), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1488_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1488_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1488_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_linIe_Internalname,GXutil.ltrim( localUtil.ntoc( A11187H_linIe, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11187H_linIe), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_linIe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_linIe_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1488_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_unde_Internalname,GXutil.rtrim( A11188H_unde),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_unde_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_unde_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1488_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_line_Internalname,GXutil.ltrim( localUtil.ntoc( A11189H_line, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11189H_line), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_line_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_line_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1488_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_vi_Internalname,GXutil.ltrim( localUtil.ntoc( A11190H_vi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtH_vi_Enabled!=0) ? localUtil.format( A11190H_vi, "ZZZZZ9.99") : localUtil.format( A11190H_vi, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_vi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_vi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1488_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_vf_Internalname,GXutil.ltrim( localUtil.ntoc( A11191H_vf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtH_vf_Enabled!=0) ? localUtil.format( A11191H_vf, "ZZZZZ9.99") : localUtil.format( A11191H_vf, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_vf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_vf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1488_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_pke_Internalname,GXutil.ltrim( localUtil.ntoc( A11192H_pke, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtH_pke_Enabled!=0) ? localUtil.format( A11192H_pke, "ZZZZZZ9.99999") : localUtil.format( A11192H_pke, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_pke_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_pke_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1488_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_pme_Internalname,GXutil.ltrim( localUtil.ntoc( A11193H_pme, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtH_pme_Enabled!=0) ? localUtil.format( A11193H_pme, "ZZZZZZ9.99999") : localUtil.format( A11193H_pme, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_pme_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_pme_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1488_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_tp_Internalname,GXutil.rtrim( A11194H_tp),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_tp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_tp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1AV1488( ) ;
      GXCCtl = "Z11187H_linIe_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11187H_linIe, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11188H_unde_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11188H_unde));
      GXCCtl = "Z11189H_line_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11189H_line, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11190H_vi_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11190H_vi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11191H_vf_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11191H_vf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11192H_pke_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11192H_pke, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11193H_pme_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11193H_pme, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11194H_tp_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11194H_tp));
      GXCCtl = "nRcdDeleted_1488_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1488, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1488_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1488, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1488_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1488, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1488_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1488_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_LINIE_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_linIe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_UNDE_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_unde_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_LINE_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_line_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_VI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_vi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_VF_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_vf_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_PKE_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_pke_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_PME_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_pme_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_TP_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_tp_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1AV1488( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801488( ) ;
      edtavnRcdDeleted_1488_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1488_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_linIe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_LINIE_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_unde_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_UNDE_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_line_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_LINE_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_vi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_VI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_vf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_VF_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_pke_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_PKE_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_pme_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_PME_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_tp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_TP_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1488_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1488_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1488");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1488_Internalname ;
         wbErr = true ;
         nRcdDeleted_1488 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1488 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1488_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtH_linIe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtH_linIe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "H_LINIE_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtH_linIe_Internalname ;
         wbErr = true ;
         A11187H_linIe = 0 ;
      }
      else
      {
         A11187H_linIe = (int)(localUtil.ctol( httpContext.cgiGet( edtH_linIe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A11188H_unde = httpContext.cgiGet( edtH_unde_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtH_line_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtH_line_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "H_LINE_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtH_line_Internalname ;
         wbErr = true ;
         A11189H_line = (short)(0) ;
      }
      else
      {
         A11189H_line = (short)(localUtil.ctol( httpContext.cgiGet( edtH_line_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtH_vi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtH_vi_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "H_VI_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtH_vi_Internalname ;
         wbErr = true ;
         A11190H_vi = DecimalUtil.ZERO ;
         n11190H_vi = false ;
      }
      else
      {
         A11190H_vi = localUtil.ctond( httpContext.cgiGet( edtH_vi_Internalname)) ;
         n11190H_vi = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtH_vf_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtH_vf_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "H_VF_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtH_vf_Internalname ;
         wbErr = true ;
         A11191H_vf = DecimalUtil.ZERO ;
         n11191H_vf = false ;
      }
      else
      {
         A11191H_vf = localUtil.ctond( httpContext.cgiGet( edtH_vf_Internalname)) ;
         n11191H_vf = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtH_pke_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtH_pke_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "H_PKE_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtH_pke_Internalname ;
         wbErr = true ;
         A11192H_pke = DecimalUtil.ZERO ;
         n11192H_pke = false ;
      }
      else
      {
         A11192H_pke = localUtil.ctond( httpContext.cgiGet( edtH_pke_Internalname)) ;
         n11192H_pke = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtH_pme_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtH_pme_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "H_PME_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtH_pme_Internalname ;
         wbErr = true ;
         A11193H_pme = DecimalUtil.ZERO ;
         n11193H_pme = false ;
      }
      else
      {
         A11193H_pme = localUtil.ctond( httpContext.cgiGet( edtH_pme_Internalname)) ;
         n11193H_pme = false ;
      }
      A11194H_tp = httpContext.cgiGet( edtH_tp_Internalname) ;
      n11194H_tp = false ;
      GXCCtl = "Z11187H_linIe_" + sGXsfl_80_idx ;
      Z11187H_linIe = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11188H_unde_" + sGXsfl_80_idx ;
      Z11188H_unde = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11189H_line_" + sGXsfl_80_idx ;
      Z11189H_line = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11190H_vi_" + sGXsfl_80_idx ;
      Z11190H_vi = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11191H_vf_" + sGXsfl_80_idx ;
      Z11191H_vf = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11192H_pke_" + sGXsfl_80_idx ;
      Z11192H_pke = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11193H_pme_" + sGXsfl_80_idx ;
      Z11193H_pme = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11194H_tp_" + sGXsfl_80_idx ;
      Z11194H_tp = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1488_" + sGXsfl_80_idx ;
      nRcdDeleted_1488 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1488_" + sGXsfl_80_idx ;
      nRcdExists_1488 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1488_" + sGXsfl_80_idx ;
      nIsMod_1488 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtH_line_Enabled = edtH_line_Enabled ;
      defedtH_unde_Enabled = edtH_unde_Enabled ;
      defedtH_linIe_Enabled = edtH_linIe_Enabled ;
   }

   public void confirmValues1AV0( )
   {
      nGXsfl_80_idx = 0 ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801488( ) ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_801488( ) ;
         httpContext.changePostValue( "Z11187H_linIe_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z11187H_linIe_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11187H_linIe_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z11188H_unde_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z11188H_unde_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11188H_unde_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z11189H_line_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z11189H_line_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11189H_line_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z11190H_vi_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z11190H_vi_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11190H_vi_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z11191H_vf_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z11191H_vf_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11191H_vf_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z11192H_pke_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z11192H_pke_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11192H_pke_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z11193H_pme_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z11193H_pme_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11193H_pme_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z11194H_tp_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z11194H_tp_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11194H_tp_"+sGXsfl_80_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thpreie", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z583IntCod", GXutil.ltrim( localUtil.ntoc( Z583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11092H_DiaI", localUtil.dtoc( Z11092H_DiaI, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11186H_UltLe", GXutil.ltrim( localUtil.ntoc( Z11186H_UltLe, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_80", GXutil.ltrim( localUtil.ntoc( nGXsfl_80_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.thpreie", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "THPREIe" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ESCALADOS", "") ;
   }

   public void initializeNonKey1AV1481( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A69ArtDsc = "" ;
      n69ArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      A832TipColDsc = "" ;
      n832TipColDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      A584IntDsc = "" ;
      n584IntDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
      A11186H_UltLe = 0 ;
      n11186H_UltLe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11186H_UltLe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11186H_UltLe), 8, 0));
      Z11186H_UltLe = 0 ;
   }

   public void initAll1AV1481( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A65ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      A831TipColCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      A583IntCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
      A11092H_DiaI = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A11092H_DiaI", localUtil.format(A11092H_DiaI, "99/99/99"));
      initializeNonKey1AV1481( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1AV1488( )
   {
      A11190H_vi = DecimalUtil.ZERO ;
      n11190H_vi = false ;
      A11191H_vf = DecimalUtil.ZERO ;
      n11191H_vf = false ;
      A11192H_pke = DecimalUtil.ZERO ;
      n11192H_pke = false ;
      A11193H_pme = DecimalUtil.ZERO ;
      n11193H_pme = false ;
      A11194H_tp = "" ;
      n11194H_tp = false ;
      Z11190H_vi = DecimalUtil.ZERO ;
      Z11191H_vf = DecimalUtil.ZERO ;
      Z11192H_pke = DecimalUtil.ZERO ;
      Z11193H_pme = DecimalUtil.ZERO ;
      Z11194H_tp = "" ;
   }

   public void initAll1AV1488( )
   {
      A11187H_linIe = 0 ;
      A11188H_unde = "" ;
      A11189H_line = (short)(0) ;
      initializeNonKey1AV1488( ) ;
   }

   public void standaloneModalInsert1AV1488( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241563344", true, true);
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
      httpContext.AddJavascriptSource("thpreie.js", "?20268241563344", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1488( )
   {
      edtH_line_Enabled = defedtH_line_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_line_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_line_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtH_unde_Enabled = defedtH_unde_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_unde_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_unde_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtH_linIe_Enabled = defedtH_linIe_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_linIe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_linIe_Enabled), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void startgridcontrol80( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1488, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1488_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11187H_linIe, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_linIe_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11188H_unde));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_unde_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11189H_line, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_line_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11190H_vi, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_vi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11191H_vf, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_vf_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11192H_pke, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_pke_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11193H_pme, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_pme_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11194H_tp));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_tp_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtArtCod_Internalname = "ARTCOD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtIntCod_Internalname = "INTCOD" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtTipColDsc_Internalname = "TIPCOLDSC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtIntDsc_Internalname = "INTDSC" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtH_DiaI_Internalname = "H_DIAI" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtH_UltLe_Internalname = "H_ULTLE" ;
      edtavnRcdDeleted_1488_Internalname = "vNRCDDELETED_1488" ;
      edtH_linIe_Internalname = "H_LINIE" ;
      edtH_unde_Internalname = "H_UNDE" ;
      edtH_line_Internalname = "H_LINE" ;
      edtH_vi_Internalname = "H_VI" ;
      edtH_vf_Internalname = "H_VF" ;
      edtH_pke_Internalname = "H_PKE" ;
      edtH_pme_Internalname = "H_PME" ;
      edtH_tp_Internalname = "H_TP" ;
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
      Form.setCaption( httpContext.getMessage( "ESCALADOS", "") );
      edtH_tp_Jsonclick = "" ;
      edtH_pme_Jsonclick = "" ;
      edtH_pke_Jsonclick = "" ;
      edtH_vf_Jsonclick = "" ;
      edtH_vi_Jsonclick = "" ;
      edtH_line_Jsonclick = "" ;
      edtH_unde_Jsonclick = "" ;
      edtH_linIe_Jsonclick = "" ;
      edtavnRcdDeleted_1488_Jsonclick = "" ;
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
      edtH_tp_Enabled = 1 ;
      edtH_pme_Enabled = 1 ;
      edtH_pke_Enabled = 1 ;
      edtH_vf_Enabled = 1 ;
      edtH_vi_Enabled = 1 ;
      edtH_line_Enabled = 1 ;
      edtH_unde_Enabled = 1 ;
      edtH_linIe_Enabled = 1 ;
      edtavnRcdDeleted_1488_Enabled = 1 ;
      edtH_UltLe_Jsonclick = "" ;
      edtH_UltLe_Backcolor = (int)(0xFFFFFF) ;
      edtH_UltLe_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtH_DiaI_Jsonclick = "" ;
      edtH_DiaI_Backcolor = (int)(0xFFFFFF) ;
      edtH_DiaI_Enabled = 1 ;
      edtIntDsc_Jsonclick = "" ;
      edtIntDsc_Backcolor = (int)(0xFFFFFF) ;
      edtIntDsc_Enabled = 0 ;
      edtTipColDsc_Jsonclick = "" ;
      edtTipColDsc_Backcolor = (int)(0xFFFFFF) ;
      edtTipColDsc_Enabled = 0 ;
      edtIntCod_Jsonclick = "" ;
      edtIntCod_Backcolor = (int)(0xFFFFFF) ;
      edtIntCod_Enabled = 1 ;
      edtTipColCod_Jsonclick = "" ;
      edtTipColCod_Backcolor = (int)(0xFFFFFF) ;
      edtTipColCod_Enabled = 1 ;
      edtArtDsc_Jsonclick = "" ;
      edtArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtArtDsc_Enabled = 0 ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_801488( ) ;
      while ( nGXsfl_80_idx <= nRC_GXsfl_80 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1AV1488( ) ;
         standaloneModal1AV1488( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1AV1488( ) ;
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_801488( ) ;
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
      /* Using cursor T01AV36 */
      pr_default.execute(34, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(34) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01AV36_A407EmprNom[0] ;
      n407EmprNom = T01AV36_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(34);
      /* Using cursor T01AV24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01AV24_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(22);
      /* Using cursor T01AV25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01AV25_A69ArtDsc[0] ;
      n69ArtDsc = T01AV25_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(23);
      /* Using cursor T01AV26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipColCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A832TipColDsc = T01AV26_A832TipColDsc[0] ;
      n832TipColDsc = T01AV26_n832TipColDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      pr_default.close(24);
      /* Using cursor T01AV27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A584IntDsc = T01AV27_A584IntDsc[0] ;
      n584IntDsc = T01AV27_n584IntDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
      pr_default.close(25);
      /* Using cursor T01AV37 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRETIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(35);
      GX_FocusControl = edtH_UltLe_Internalname ;
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
      /* Using cursor T01AV24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01AV24_A279CliNom[0] ;
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Artcod( )
   {
      n69ArtDsc = false ;
      /* Using cursor T01AV25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A69ArtDsc = T01AV25_A69ArtDsc[0] ;
      n69ArtDsc = T01AV25_n69ArtDsc[0] ;
      pr_default.close(23);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
   }

   public void valid_Tipcolcod( )
   {
      n832TipColDsc = false ;
      /* Using cursor T01AV26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipColCod_Internalname ;
      }
      A832TipColDsc = T01AV26_A832TipColDsc[0] ;
      n832TipColDsc = T01AV26_n832TipColDsc[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", GXutil.rtrim( A832TipColDsc));
   }

   public void valid_Intcod( )
   {
      n584IntDsc = false ;
      /* Using cursor T01AV27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCod_Internalname ;
      }
      A584IntDsc = T01AV27_A584IntDsc[0] ;
      n584IntDsc = T01AV27_n584IntDsc[0] ;
      pr_default.close(25);
      /* Using cursor T01AV37 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRETIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      pr_default.close(35);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", GXutil.rtrim( A584IntDsc));
   }

   public void valid_H_diai( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11186H_UltLe", GXutil.ltrim( localUtil.ntoc( A11186H_UltLe, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", GXutil.rtrim( A832TipColDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", GXutil.rtrim( A584IntDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z583IntCod", GXutil.ltrim( localUtil.ntoc( Z583IntCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11092H_DiaI", localUtil.format(Z11092H_DiaI, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11186H_UltLe", GXutil.ltrim( localUtil.ntoc( Z11186H_UltLe, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z832TipColDsc", GXutil.rtrim( Z832TipColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z584IntDsc", GXutil.rtrim( Z584IntDsc));
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
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''}]");
      setEventMetadata("VALID_ARTCOD",",oparms:[{av:'A69ArtDsc',fld:'ARTDSC',pic:''}]}");
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A832TipColDsc',fld:'TIPCOLDSC',pic:''}]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[{av:'A832TipColDsc',fld:'TIPCOLDSC',pic:''}]}");
      setEventMetadata("VALID_INTCOD","{handler:'valid_Intcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A584IntDsc',fld:'INTDSC',pic:''}]");
      setEventMetadata("VALID_INTCOD",",oparms:[{av:'A584IntDsc',fld:'INTDSC',pic:''}]}");
      setEventMetadata("VALID_H_DIAI","{handler:'valid_H_diai',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'A11092H_DiaI',fld:'H_DIAI',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_H_DIAI",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A11186H_UltLe',fld:'H_ULTLE',pic:'ZZZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A832TipColDsc',fld:'TIPCOLDSC',pic:''},{av:'A584IntDsc',fld:'INTDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z831TipColCod'},{av:'Z583IntCod'},{av:'Z11092H_DiaI'},{av:'Z407EmprNom'},{av:'Z11186H_UltLe'},{av:'Z279CliNom'},{av:'Z69ArtDsc'},{av:'Z832TipColDsc'},{av:'Z584IntDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_H_LINIE","{handler:'valid_H_linie',iparms:[]");
      setEventMetadata("VALID_H_LINIE",",oparms:[]}");
      setEventMetadata("VALID_H_UNDE","{handler:'valid_H_unde',iparms:[]");
      setEventMetadata("VALID_H_UNDE",",oparms:[]}");
      setEventMetadata("VALID_H_LINE","{handler:'valid_H_line',iparms:[]");
      setEventMetadata("VALID_H_LINE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_H_tp',iparms:[]");
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
      pr_default.close(23);
      pr_default.close(22);
      pr_default.close(34);
      pr_default.close(25);
      pr_default.close(35);
      pr_default.close(24);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z11092H_DiaI = GXutil.nullDate() ;
      Z11188H_unde = "" ;
      Z11190H_vi = DecimalUtil.ZERO ;
      Z11191H_vf = DecimalUtil.ZERO ;
      Z11192H_pke = DecimalUtil.ZERO ;
      Z11193H_pme = DecimalUtil.ZERO ;
      Z11194H_tp = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
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
      lblTextblock6_Jsonclick = "" ;
      A69ArtDsc = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A832TipColDsc = "" ;
      lblTextblock10_Jsonclick = "" ;
      A584IntDsc = "" ;
      lblTextblock11_Jsonclick = "" ;
      A11092H_DiaI = GXutil.nullDate() ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1488 = "" ;
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
      sMode1481 = "" ;
      GXCCtl = "" ;
      A11188H_unde = "" ;
      A11190H_vi = DecimalUtil.ZERO ;
      A11191H_vf = DecimalUtil.ZERO ;
      A11192H_pke = DecimalUtil.ZERO ;
      A11193H_pme = DecimalUtil.ZERO ;
      A11194H_tp = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z69ArtDsc = "" ;
      Z832TipColDsc = "" ;
      Z584IntDsc = "" ;
      T01AV6_A407EmprNom = new String[] {""} ;
      T01AV6_n407EmprNom = new boolean[] {false} ;
      T01AV12_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AV12_A407EmprNom = new String[] {""} ;
      T01AV12_n407EmprNom = new boolean[] {false} ;
      T01AV12_A279CliNom = new String[] {""} ;
      T01AV12_A69ArtDsc = new String[] {""} ;
      T01AV12_n69ArtDsc = new boolean[] {false} ;
      T01AV12_A832TipColDsc = new String[] {""} ;
      T01AV12_n832TipColDsc = new boolean[] {false} ;
      T01AV12_A584IntDsc = new String[] {""} ;
      T01AV12_n584IntDsc = new boolean[] {false} ;
      T01AV12_A11186H_UltLe = new int[1] ;
      T01AV12_n11186H_UltLe = new boolean[] {false} ;
      T01AV12_A396EmprCod = new String[] {""} ;
      T01AV12_A252CliCod = new int[1] ;
      T01AV12_A65ArtCod = new String[] {""} ;
      T01AV12_A583IntCod = new byte[1] ;
      T01AV12_A831TipColCod = new byte[1] ;
      T01AV7_A279CliNom = new String[] {""} ;
      T01AV8_A69ArtDsc = new String[] {""} ;
      T01AV8_n69ArtDsc = new boolean[] {false} ;
      T01AV10_A832TipColDsc = new String[] {""} ;
      T01AV10_n832TipColDsc = new boolean[] {false} ;
      T01AV9_A584IntDsc = new String[] {""} ;
      T01AV9_n584IntDsc = new boolean[] {false} ;
      T01AV11_A396EmprCod = new String[] {""} ;
      T01AV13_A279CliNom = new String[] {""} ;
      T01AV14_A69ArtDsc = new String[] {""} ;
      T01AV14_n69ArtDsc = new boolean[] {false} ;
      T01AV15_A832TipColDsc = new String[] {""} ;
      T01AV15_n832TipColDsc = new boolean[] {false} ;
      T01AV16_A584IntDsc = new String[] {""} ;
      T01AV16_n584IntDsc = new boolean[] {false} ;
      T01AV17_A396EmprCod = new String[] {""} ;
      T01AV18_A396EmprCod = new String[] {""} ;
      T01AV18_A252CliCod = new int[1] ;
      T01AV18_A65ArtCod = new String[] {""} ;
      T01AV18_A831TipColCod = new byte[1] ;
      T01AV18_A583IntCod = new byte[1] ;
      T01AV18_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AV5_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AV5_A11186H_UltLe = new int[1] ;
      T01AV5_n11186H_UltLe = new boolean[] {false} ;
      T01AV5_A396EmprCod = new String[] {""} ;
      T01AV5_A252CliCod = new int[1] ;
      T01AV5_A65ArtCod = new String[] {""} ;
      T01AV5_A583IntCod = new byte[1] ;
      T01AV5_A831TipColCod = new byte[1] ;
      T01AV19_A396EmprCod = new String[] {""} ;
      T01AV19_A252CliCod = new int[1] ;
      T01AV19_A65ArtCod = new String[] {""} ;
      T01AV19_A831TipColCod = new byte[1] ;
      T01AV19_A583IntCod = new byte[1] ;
      T01AV19_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AV20_A396EmprCod = new String[] {""} ;
      T01AV20_A252CliCod = new int[1] ;
      T01AV20_A65ArtCod = new String[] {""} ;
      T01AV20_A831TipColCod = new byte[1] ;
      T01AV20_A583IntCod = new byte[1] ;
      T01AV20_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AV4_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AV4_A11186H_UltLe = new int[1] ;
      T01AV4_n11186H_UltLe = new boolean[] {false} ;
      T01AV4_A396EmprCod = new String[] {""} ;
      T01AV4_A252CliCod = new int[1] ;
      T01AV4_A65ArtCod = new String[] {""} ;
      T01AV4_A583IntCod = new byte[1] ;
      T01AV4_A831TipColCod = new byte[1] ;
      T01AV24_A279CliNom = new String[] {""} ;
      T01AV25_A69ArtDsc = new String[] {""} ;
      T01AV25_n69ArtDsc = new boolean[] {false} ;
      T01AV26_A832TipColDsc = new String[] {""} ;
      T01AV26_n832TipColDsc = new boolean[] {false} ;
      T01AV27_A584IntDsc = new String[] {""} ;
      T01AV27_n584IntDsc = new boolean[] {false} ;
      T01AV28_A396EmprCod = new String[] {""} ;
      T01AV28_A252CliCod = new int[1] ;
      T01AV28_A65ArtCod = new String[] {""} ;
      T01AV28_A831TipColCod = new byte[1] ;
      T01AV28_A583IntCod = new byte[1] ;
      T01AV28_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AV28_A11094H_linI = new int[1] ;
      T01AV29_A396EmprCod = new String[] {""} ;
      T01AV29_A252CliCod = new int[1] ;
      T01AV29_A65ArtCod = new String[] {""} ;
      T01AV29_A831TipColCod = new byte[1] ;
      T01AV29_A583IntCod = new byte[1] ;
      T01AV29_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AV30_A252CliCod = new int[1] ;
      T01AV30_A65ArtCod = new String[] {""} ;
      T01AV30_A831TipColCod = new byte[1] ;
      T01AV30_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AV30_A11187H_linIe = new int[1] ;
      T01AV30_A11188H_unde = new String[] {""} ;
      T01AV30_A11189H_line = new short[1] ;
      T01AV30_A11190H_vi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AV30_n11190H_vi = new boolean[] {false} ;
      T01AV30_A11191H_vf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AV30_n11191H_vf = new boolean[] {false} ;
      T01AV30_A11192H_pke = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AV30_n11192H_pke = new boolean[] {false} ;
      T01AV30_A11193H_pme = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AV30_n11193H_pme = new boolean[] {false} ;
      T01AV30_A11194H_tp = new String[] {""} ;
      T01AV30_n11194H_tp = new boolean[] {false} ;
      T01AV30_A396EmprCod = new String[] {""} ;
      T01AV30_A583IntCod = new byte[1] ;
      T01AV31_A396EmprCod = new String[] {""} ;
      T01AV31_A252CliCod = new int[1] ;
      T01AV31_A65ArtCod = new String[] {""} ;
      T01AV31_A831TipColCod = new byte[1] ;
      T01AV31_A583IntCod = new byte[1] ;
      T01AV31_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AV31_A11187H_linIe = new int[1] ;
      T01AV31_A11188H_unde = new String[] {""} ;
      T01AV31_A11189H_line = new short[1] ;
      T01AV3_A252CliCod = new int[1] ;
      T01AV3_A65ArtCod = new String[] {""} ;
      T01AV3_A831TipColCod = new byte[1] ;
      T01AV3_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AV3_A11187H_linIe = new int[1] ;
      T01AV3_A11188H_unde = new String[] {""} ;
      T01AV3_A11189H_line = new short[1] ;
      T01AV3_A11190H_vi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AV3_n11190H_vi = new boolean[] {false} ;
      T01AV3_A11191H_vf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AV3_n11191H_vf = new boolean[] {false} ;
      T01AV3_A11192H_pke = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AV3_n11192H_pke = new boolean[] {false} ;
      T01AV3_A11193H_pme = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AV3_n11193H_pme = new boolean[] {false} ;
      T01AV3_A11194H_tp = new String[] {""} ;
      T01AV3_n11194H_tp = new boolean[] {false} ;
      T01AV3_A396EmprCod = new String[] {""} ;
      T01AV3_A583IntCod = new byte[1] ;
      T01AV2_A252CliCod = new int[1] ;
      T01AV2_A65ArtCod = new String[] {""} ;
      T01AV2_A831TipColCod = new byte[1] ;
      T01AV2_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AV2_A11187H_linIe = new int[1] ;
      T01AV2_A11188H_unde = new String[] {""} ;
      T01AV2_A11189H_line = new short[1] ;
      T01AV2_A11190H_vi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AV2_n11190H_vi = new boolean[] {false} ;
      T01AV2_A11191H_vf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AV2_n11191H_vf = new boolean[] {false} ;
      T01AV2_A11192H_pke = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AV2_n11192H_pke = new boolean[] {false} ;
      T01AV2_A11193H_pme = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AV2_n11193H_pme = new boolean[] {false} ;
      T01AV2_A11194H_tp = new String[] {""} ;
      T01AV2_n11194H_tp = new boolean[] {false} ;
      T01AV2_A396EmprCod = new String[] {""} ;
      T01AV2_A583IntCod = new byte[1] ;
      T01AV35_A396EmprCod = new String[] {""} ;
      T01AV35_A252CliCod = new int[1] ;
      T01AV35_A65ArtCod = new String[] {""} ;
      T01AV35_A831TipColCod = new byte[1] ;
      T01AV35_A583IntCod = new byte[1] ;
      T01AV35_A11092H_DiaI = new java.util.Date[] {GXutil.nullDate()} ;
      T01AV35_A11187H_linIe = new int[1] ;
      T01AV35_A11188H_unde = new String[] {""} ;
      T01AV35_A11189H_line = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01AV36_A407EmprNom = new String[] {""} ;
      T01AV36_n407EmprNom = new boolean[] {false} ;
      T01AV37_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ11092H_DiaI = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ69ArtDsc = "" ;
      ZZ832TipColDsc = "" ;
      ZZ584IntDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.thpreie__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thpreie__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thpreie__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thpreie__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thpreie__default(),
         new Object[] {
             new Object[] {
            T01AV2_A252CliCod, T01AV2_A65ArtCod, T01AV2_A831TipColCod, T01AV2_A11092H_DiaI, T01AV2_A11187H_linIe, T01AV2_A11188H_unde, T01AV2_A11189H_line, T01AV2_A11190H_vi, T01AV2_n11190H_vi, T01AV2_A11191H_vf,
            T01AV2_n11191H_vf, T01AV2_A11192H_pke, T01AV2_n11192H_pke, T01AV2_A11193H_pme, T01AV2_n11193H_pme, T01AV2_A11194H_tp, T01AV2_n11194H_tp, T01AV2_A396EmprCod, T01AV2_A583IntCod
            }
            , new Object[] {
            T01AV3_A252CliCod, T01AV3_A65ArtCod, T01AV3_A831TipColCod, T01AV3_A11092H_DiaI, T01AV3_A11187H_linIe, T01AV3_A11188H_unde, T01AV3_A11189H_line, T01AV3_A11190H_vi, T01AV3_n11190H_vi, T01AV3_A11191H_vf,
            T01AV3_n11191H_vf, T01AV3_A11192H_pke, T01AV3_n11192H_pke, T01AV3_A11193H_pme, T01AV3_n11193H_pme, T01AV3_A11194H_tp, T01AV3_n11194H_tp, T01AV3_A396EmprCod, T01AV3_A583IntCod
            }
            , new Object[] {
            T01AV4_A11092H_DiaI, T01AV4_A11186H_UltLe, T01AV4_n11186H_UltLe, T01AV4_A396EmprCod, T01AV4_A252CliCod, T01AV4_A65ArtCod, T01AV4_A583IntCod, T01AV4_A831TipColCod
            }
            , new Object[] {
            T01AV5_A11092H_DiaI, T01AV5_A11186H_UltLe, T01AV5_n11186H_UltLe, T01AV5_A396EmprCod, T01AV5_A252CliCod, T01AV5_A65ArtCod, T01AV5_A583IntCod, T01AV5_A831TipColCod
            }
            , new Object[] {
            T01AV6_A407EmprNom, T01AV6_n407EmprNom
            }
            , new Object[] {
            T01AV7_A279CliNom
            }
            , new Object[] {
            T01AV8_A69ArtDsc, T01AV8_n69ArtDsc
            }
            , new Object[] {
            T01AV9_A584IntDsc, T01AV9_n584IntDsc
            }
            , new Object[] {
            T01AV10_A832TipColDsc, T01AV10_n832TipColDsc
            }
            , new Object[] {
            T01AV11_A396EmprCod
            }
            , new Object[] {
            T01AV12_A11092H_DiaI, T01AV12_A407EmprNom, T01AV12_n407EmprNom, T01AV12_A279CliNom, T01AV12_A69ArtDsc, T01AV12_n69ArtDsc, T01AV12_A832TipColDsc, T01AV12_n832TipColDsc, T01AV12_A584IntDsc, T01AV12_n584IntDsc,
            T01AV12_A11186H_UltLe, T01AV12_n11186H_UltLe, T01AV12_A396EmprCod, T01AV12_A252CliCod, T01AV12_A65ArtCod, T01AV12_A583IntCod, T01AV12_A831TipColCod
            }
            , new Object[] {
            T01AV13_A279CliNom
            }
            , new Object[] {
            T01AV14_A69ArtDsc, T01AV14_n69ArtDsc
            }
            , new Object[] {
            T01AV15_A832TipColDsc, T01AV15_n832TipColDsc
            }
            , new Object[] {
            T01AV16_A584IntDsc, T01AV16_n584IntDsc
            }
            , new Object[] {
            T01AV17_A396EmprCod
            }
            , new Object[] {
            T01AV18_A396EmprCod, T01AV18_A252CliCod, T01AV18_A65ArtCod, T01AV18_A831TipColCod, T01AV18_A583IntCod, T01AV18_A11092H_DiaI
            }
            , new Object[] {
            T01AV19_A396EmprCod, T01AV19_A252CliCod, T01AV19_A65ArtCod, T01AV19_A831TipColCod, T01AV19_A583IntCod, T01AV19_A11092H_DiaI
            }
            , new Object[] {
            T01AV20_A396EmprCod, T01AV20_A252CliCod, T01AV20_A65ArtCod, T01AV20_A831TipColCod, T01AV20_A583IntCod, T01AV20_A11092H_DiaI
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AV24_A279CliNom
            }
            , new Object[] {
            T01AV25_A69ArtDsc, T01AV25_n69ArtDsc
            }
            , new Object[] {
            T01AV26_A832TipColDsc, T01AV26_n832TipColDsc
            }
            , new Object[] {
            T01AV27_A584IntDsc, T01AV27_n584IntDsc
            }
            , new Object[] {
            T01AV28_A396EmprCod, T01AV28_A252CliCod, T01AV28_A65ArtCod, T01AV28_A831TipColCod, T01AV28_A583IntCod, T01AV28_A11092H_DiaI, T01AV28_A11094H_linI
            }
            , new Object[] {
            T01AV29_A396EmprCod, T01AV29_A252CliCod, T01AV29_A65ArtCod, T01AV29_A831TipColCod, T01AV29_A583IntCod, T01AV29_A11092H_DiaI
            }
            , new Object[] {
            T01AV30_A252CliCod, T01AV30_A65ArtCod, T01AV30_A831TipColCod, T01AV30_A11092H_DiaI, T01AV30_A11187H_linIe, T01AV30_A11188H_unde, T01AV30_A11189H_line, T01AV30_A11190H_vi, T01AV30_n11190H_vi, T01AV30_A11191H_vf,
            T01AV30_n11191H_vf, T01AV30_A11192H_pke, T01AV30_n11192H_pke, T01AV30_A11193H_pme, T01AV30_n11193H_pme, T01AV30_A11194H_tp, T01AV30_n11194H_tp, T01AV30_A396EmprCod, T01AV30_A583IntCod
            }
            , new Object[] {
            T01AV31_A396EmprCod, T01AV31_A252CliCod, T01AV31_A65ArtCod, T01AV31_A831TipColCod, T01AV31_A583IntCod, T01AV31_A11092H_DiaI, T01AV31_A11187H_linIe, T01AV31_A11188H_unde, T01AV31_A11189H_line
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AV35_A396EmprCod, T01AV35_A252CliCod, T01AV35_A65ArtCod, T01AV35_A831TipColCod, T01AV35_A583IntCod, T01AV35_A11092H_DiaI, T01AV35_A11187H_linIe, T01AV35_A11188H_unde, T01AV35_A11189H_line
            }
            , new Object[] {
            T01AV36_A407EmprNom, T01AV36_n407EmprNom
            }
            , new Object[] {
            T01AV37_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "THPREIe" ;
   }

   private byte Z831TipColCod ;
   private byte Z583IntCod ;
   private byte GxWebError ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ831TipColCod ;
   private byte ZZ583IntCod ;
   private short Z11189H_line ;
   private short nRcdDeleted_1488 ;
   private short nRcdExists_1488 ;
   private short nIsMod_1488 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1488 ;
   private short RcdFound1488 ;
   private short nBlankRcdUsr1488 ;
   private short A11189H_line ;
   private short RcdFound1481 ;
   private short nIsDirty_1481 ;
   private short nIsDirty_1488 ;
   private int Z252CliCod ;
   private int Z11186H_UltLe ;
   private int nRC_GXsfl_80 ;
   private int nGXsfl_80_idx=1 ;
   private int Z11187H_linIe ;
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
   private int edtArtDsc_Enabled ;
   private int edtTipColCod_Enabled ;
   private int edtIntCod_Enabled ;
   private int edtTipColDsc_Enabled ;
   private int edtIntDsc_Enabled ;
   private int edtH_DiaI_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int A11186H_UltLe ;
   private int edtH_UltLe_Enabled ;
   private int edtavnRcdDeleted_1488_Enabled ;
   private int edtH_linIe_Enabled ;
   private int edtH_unde_Enabled ;
   private int edtH_line_Enabled ;
   private int edtH_vi_Enabled ;
   private int edtH_vf_Enabled ;
   private int edtH_pke_Enabled ;
   private int edtH_pme_Enabled ;
   private int edtH_tp_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A11187H_linIe ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtH_line_Enabled ;
   private int defedtH_unde_Enabled ;
   private int defedtH_linIe_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtH_UltLe_Backcolor ;
   private int edtH_DiaI_Backcolor ;
   private int edtIntDsc_Backcolor ;
   private int edtTipColDsc_Backcolor ;
   private int edtIntCod_Backcolor ;
   private int edtTipColCod_Backcolor ;
   private int edtArtDsc_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ11186H_UltLe ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z11190H_vi ;
   private java.math.BigDecimal Z11191H_vf ;
   private java.math.BigDecimal Z11192H_pke ;
   private java.math.BigDecimal Z11193H_pme ;
   private java.math.BigDecimal A11190H_vi ;
   private java.math.BigDecimal A11191H_vf ;
   private java.math.BigDecimal A11192H_pke ;
   private java.math.BigDecimal A11193H_pme ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z11188H_unde ;
   private String Z11194H_tp ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
   private String sGXsfl_80_idx="0001" ;
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
   private String edtCliCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtArtDsc_Internalname ;
   private String A69ArtDsc ;
   private String edtArtDsc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtTipColCod_Internalname ;
   private String edtTipColCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtIntCod_Internalname ;
   private String edtIntCod_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtTipColDsc_Internalname ;
   private String A832TipColDsc ;
   private String edtTipColDsc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtIntDsc_Internalname ;
   private String A584IntDsc ;
   private String edtIntDsc_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtH_DiaI_Internalname ;
   private String edtH_DiaI_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtH_UltLe_Internalname ;
   private String edtH_UltLe_Jsonclick ;
   private String sMode1488 ;
   private String edtavnRcdDeleted_1488_Internalname ;
   private String edtH_linIe_Internalname ;
   private String edtH_unde_Internalname ;
   private String edtH_line_Internalname ;
   private String edtH_vi_Internalname ;
   private String edtH_vf_Internalname ;
   private String edtH_pke_Internalname ;
   private String edtH_pme_Internalname ;
   private String edtH_tp_Internalname ;
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
   private String sMode1481 ;
   private String GXCCtl ;
   private String A11188H_unde ;
   private String A11194H_tp ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z69ArtDsc ;
   private String Z832TipColDsc ;
   private String Z584IntDsc ;
   private String sGXsfl_80_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1488_Jsonclick ;
   private String edtH_linIe_Jsonclick ;
   private String edtH_unde_Jsonclick ;
   private String edtH_line_Jsonclick ;
   private String edtH_vi_Jsonclick ;
   private String edtH_vf_Jsonclick ;
   private String edtH_pke_Jsonclick ;
   private String edtH_pme_Jsonclick ;
   private String edtH_tp_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ69ArtDsc ;
   private String ZZ832TipColDsc ;
   private String ZZ584IntDsc ;
   private java.util.Date Z11092H_DiaI ;
   private java.util.Date A11092H_DiaI ;
   private java.util.Date ZZ11092H_DiaI ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_80_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n69ArtDsc ;
   private boolean n832TipColDsc ;
   private boolean n584IntDsc ;
   private boolean n11186H_UltLe ;
   private boolean returnInSub ;
   private boolean n11190H_vi ;
   private boolean n11191H_vf ;
   private boolean n11192H_pke ;
   private boolean n11193H_pme ;
   private boolean n11194H_tp ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01AV6_A407EmprNom ;
   private boolean[] T01AV6_n407EmprNom ;
   private java.util.Date[] T01AV12_A11092H_DiaI ;
   private String[] T01AV12_A407EmprNom ;
   private boolean[] T01AV12_n407EmprNom ;
   private String[] T01AV12_A279CliNom ;
   private String[] T01AV12_A69ArtDsc ;
   private boolean[] T01AV12_n69ArtDsc ;
   private String[] T01AV12_A832TipColDsc ;
   private boolean[] T01AV12_n832TipColDsc ;
   private String[] T01AV12_A584IntDsc ;
   private boolean[] T01AV12_n584IntDsc ;
   private int[] T01AV12_A11186H_UltLe ;
   private boolean[] T01AV12_n11186H_UltLe ;
   private String[] T01AV12_A396EmprCod ;
   private int[] T01AV12_A252CliCod ;
   private String[] T01AV12_A65ArtCod ;
   private byte[] T01AV12_A583IntCod ;
   private byte[] T01AV12_A831TipColCod ;
   private String[] T01AV7_A279CliNom ;
   private String[] T01AV8_A69ArtDsc ;
   private boolean[] T01AV8_n69ArtDsc ;
   private String[] T01AV10_A832TipColDsc ;
   private boolean[] T01AV10_n832TipColDsc ;
   private String[] T01AV9_A584IntDsc ;
   private boolean[] T01AV9_n584IntDsc ;
   private String[] T01AV11_A396EmprCod ;
   private String[] T01AV13_A279CliNom ;
   private String[] T01AV14_A69ArtDsc ;
   private boolean[] T01AV14_n69ArtDsc ;
   private String[] T01AV15_A832TipColDsc ;
   private boolean[] T01AV15_n832TipColDsc ;
   private String[] T01AV16_A584IntDsc ;
   private boolean[] T01AV16_n584IntDsc ;
   private String[] T01AV17_A396EmprCod ;
   private String[] T01AV18_A396EmprCod ;
   private int[] T01AV18_A252CliCod ;
   private String[] T01AV18_A65ArtCod ;
   private byte[] T01AV18_A831TipColCod ;
   private byte[] T01AV18_A583IntCod ;
   private java.util.Date[] T01AV18_A11092H_DiaI ;
   private java.util.Date[] T01AV5_A11092H_DiaI ;
   private int[] T01AV5_A11186H_UltLe ;
   private boolean[] T01AV5_n11186H_UltLe ;
   private String[] T01AV5_A396EmprCod ;
   private int[] T01AV5_A252CliCod ;
   private String[] T01AV5_A65ArtCod ;
   private byte[] T01AV5_A583IntCod ;
   private byte[] T01AV5_A831TipColCod ;
   private String[] T01AV19_A396EmprCod ;
   private int[] T01AV19_A252CliCod ;
   private String[] T01AV19_A65ArtCod ;
   private byte[] T01AV19_A831TipColCod ;
   private byte[] T01AV19_A583IntCod ;
   private java.util.Date[] T01AV19_A11092H_DiaI ;
   private String[] T01AV20_A396EmprCod ;
   private int[] T01AV20_A252CliCod ;
   private String[] T01AV20_A65ArtCod ;
   private byte[] T01AV20_A831TipColCod ;
   private byte[] T01AV20_A583IntCod ;
   private java.util.Date[] T01AV20_A11092H_DiaI ;
   private java.util.Date[] T01AV4_A11092H_DiaI ;
   private int[] T01AV4_A11186H_UltLe ;
   private boolean[] T01AV4_n11186H_UltLe ;
   private String[] T01AV4_A396EmprCod ;
   private int[] T01AV4_A252CliCod ;
   private String[] T01AV4_A65ArtCod ;
   private byte[] T01AV4_A583IntCod ;
   private byte[] T01AV4_A831TipColCod ;
   private String[] T01AV24_A279CliNom ;
   private String[] T01AV25_A69ArtDsc ;
   private boolean[] T01AV25_n69ArtDsc ;
   private String[] T01AV26_A832TipColDsc ;
   private boolean[] T01AV26_n832TipColDsc ;
   private String[] T01AV27_A584IntDsc ;
   private boolean[] T01AV27_n584IntDsc ;
   private String[] T01AV28_A396EmprCod ;
   private int[] T01AV28_A252CliCod ;
   private String[] T01AV28_A65ArtCod ;
   private byte[] T01AV28_A831TipColCod ;
   private byte[] T01AV28_A583IntCod ;
   private java.util.Date[] T01AV28_A11092H_DiaI ;
   private int[] T01AV28_A11094H_linI ;
   private String[] T01AV29_A396EmprCod ;
   private int[] T01AV29_A252CliCod ;
   private String[] T01AV29_A65ArtCod ;
   private byte[] T01AV29_A831TipColCod ;
   private byte[] T01AV29_A583IntCod ;
   private java.util.Date[] T01AV29_A11092H_DiaI ;
   private int[] T01AV30_A252CliCod ;
   private String[] T01AV30_A65ArtCod ;
   private byte[] T01AV30_A831TipColCod ;
   private java.util.Date[] T01AV30_A11092H_DiaI ;
   private int[] T01AV30_A11187H_linIe ;
   private String[] T01AV30_A11188H_unde ;
   private short[] T01AV30_A11189H_line ;
   private java.math.BigDecimal[] T01AV30_A11190H_vi ;
   private boolean[] T01AV30_n11190H_vi ;
   private java.math.BigDecimal[] T01AV30_A11191H_vf ;
   private boolean[] T01AV30_n11191H_vf ;
   private java.math.BigDecimal[] T01AV30_A11192H_pke ;
   private boolean[] T01AV30_n11192H_pke ;
   private java.math.BigDecimal[] T01AV30_A11193H_pme ;
   private boolean[] T01AV30_n11193H_pme ;
   private String[] T01AV30_A11194H_tp ;
   private boolean[] T01AV30_n11194H_tp ;
   private String[] T01AV30_A396EmprCod ;
   private byte[] T01AV30_A583IntCod ;
   private String[] T01AV31_A396EmprCod ;
   private int[] T01AV31_A252CliCod ;
   private String[] T01AV31_A65ArtCod ;
   private byte[] T01AV31_A831TipColCod ;
   private byte[] T01AV31_A583IntCod ;
   private java.util.Date[] T01AV31_A11092H_DiaI ;
   private int[] T01AV31_A11187H_linIe ;
   private String[] T01AV31_A11188H_unde ;
   private short[] T01AV31_A11189H_line ;
   private int[] T01AV3_A252CliCod ;
   private String[] T01AV3_A65ArtCod ;
   private byte[] T01AV3_A831TipColCod ;
   private java.util.Date[] T01AV3_A11092H_DiaI ;
   private int[] T01AV3_A11187H_linIe ;
   private String[] T01AV3_A11188H_unde ;
   private short[] T01AV3_A11189H_line ;
   private java.math.BigDecimal[] T01AV3_A11190H_vi ;
   private boolean[] T01AV3_n11190H_vi ;
   private java.math.BigDecimal[] T01AV3_A11191H_vf ;
   private boolean[] T01AV3_n11191H_vf ;
   private java.math.BigDecimal[] T01AV3_A11192H_pke ;
   private boolean[] T01AV3_n11192H_pke ;
   private java.math.BigDecimal[] T01AV3_A11193H_pme ;
   private boolean[] T01AV3_n11193H_pme ;
   private String[] T01AV3_A11194H_tp ;
   private boolean[] T01AV3_n11194H_tp ;
   private String[] T01AV3_A396EmprCod ;
   private byte[] T01AV3_A583IntCod ;
   private int[] T01AV2_A252CliCod ;
   private String[] T01AV2_A65ArtCod ;
   private byte[] T01AV2_A831TipColCod ;
   private java.util.Date[] T01AV2_A11092H_DiaI ;
   private int[] T01AV2_A11187H_linIe ;
   private String[] T01AV2_A11188H_unde ;
   private short[] T01AV2_A11189H_line ;
   private java.math.BigDecimal[] T01AV2_A11190H_vi ;
   private boolean[] T01AV2_n11190H_vi ;
   private java.math.BigDecimal[] T01AV2_A11191H_vf ;
   private boolean[] T01AV2_n11191H_vf ;
   private java.math.BigDecimal[] T01AV2_A11192H_pke ;
   private boolean[] T01AV2_n11192H_pke ;
   private java.math.BigDecimal[] T01AV2_A11193H_pme ;
   private boolean[] T01AV2_n11193H_pme ;
   private String[] T01AV2_A11194H_tp ;
   private boolean[] T01AV2_n11194H_tp ;
   private String[] T01AV2_A396EmprCod ;
   private byte[] T01AV2_A583IntCod ;
   private String[] T01AV35_A396EmprCod ;
   private int[] T01AV35_A252CliCod ;
   private String[] T01AV35_A65ArtCod ;
   private byte[] T01AV35_A831TipColCod ;
   private byte[] T01AV35_A583IntCod ;
   private java.util.Date[] T01AV35_A11092H_DiaI ;
   private int[] T01AV35_A11187H_linIe ;
   private String[] T01AV35_A11188H_unde ;
   private short[] T01AV35_A11189H_line ;
   private String[] T01AV36_A407EmprNom ;
   private boolean[] T01AV36_n407EmprNom ;
   private String[] T01AV37_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thpreie__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thpreie__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thpreie__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thpreie__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thpreie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01AV2", "SELECT CliCod, ArtCod, TipColCod, H_DiaI, H_linIe, H_unde, H_line, H_vi, H_vf, H_pke, H_pme, H_tp, EmprCod, IntCod FROM TXPHPREIe WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? AND H_DiaI = ? AND H_linIe = ? AND H_unde = ? AND H_line = ?  FOR UPDATE OF H_vi, H_vf, H_pke, H_pme, H_tp NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV3", "SELECT CliCod, ArtCod, TipColCod, H_DiaI, H_linIe, H_unde, H_line, H_vi, H_vf, H_pke, H_pme, H_tp, EmprCod, IntCod FROM TXPHPREIe WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? AND H_DiaI = ? AND H_linIe = ? AND H_unde = ? AND H_line = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV4", "SELECT H_DiaI, H_UltLe, EmprCod, CliCod, ArtCod, IntCod, TipColCod FROM TXPHPREIT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? AND H_DiaI = ?  FOR UPDATE OF H_UltLe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV5", "SELECT H_DiaI, H_UltLe, EmprCod, CliCod, ArtCod, IntCod, TipColCod FROM TXPHPREIT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? AND H_DiaI = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV8", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV9", "SELECT IntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV10", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV11", "SELECT EmprCod FROM TXPPRETIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV12", "SELECT /*+ FIRST_ROWS(100) */ TM1.H_DiaI, T2.EmprNom, T3.CliNom, T4.ArtDsc, T5.TipColDsc, T6.IntDsc, TM1.H_UltLe, TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.IntCod, TM1.TipColCod FROM (((((TXPHPREIT TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ArtCod = TM1.ArtCod) INNER JOIN TXPTIPCOL T5 ON T5.EmprCod = TM1.EmprCod AND T5.TipColCod = TM1.TipColCod) INNER JOIN TXPINTENS T6 ON T6.EmprCod = TM1.EmprCod AND T6.IntCod = TM1.IntCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.TipColCod = ? and TM1.IntCod = ? and TM1.H_DiaI = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.TipColCod, TM1.IntCod, TM1.H_DiaI ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV13", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV14", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV15", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV16", "SELECT IntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV17", "SELECT EmprCod FROM TXPPRETIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV18", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI FROM TXPHPREIT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? AND H_DiaI = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV19", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI FROM TXPHPREIT WHERE ( CliCod > ? or CliCod = ? and ArtCod > ? or ArtCod = ? and CliCod = ? and TipColCod > ? or TipColCod = ? and ArtCod = ? and CliCod = ? and IntCod > ? or IntCod = ? and TipColCod = ? and ArtCod = ? and CliCod = ? and H_DiaI > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AV20", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI FROM TXPHPREIT WHERE ( CliCod < ? or CliCod = ? and ArtCod < ? or ArtCod = ? and CliCod = ? and TipColCod < ? or TipColCod = ? and ArtCod = ? and CliCod = ? and IntCod < ? or IntCod = ? and TipColCod = ? and ArtCod = ? and CliCod = ? and H_DiaI < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, TipColCod DESC, IntCod DESC, H_DiaI DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01AV21", "INSERT INTO TXPHPREIT(H_DiaI, H_UltLe, EmprCod, CliCod, ArtCod, IntCod, TipColCod, H_UltLi) VALUES(?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPHPREIT")
         ,new UpdateCursor("T01AV22", "UPDATE TXPHPREIT SET H_UltLe=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? AND H_DiaI = ?", GX_NOMASK, "TXPHPREIT")
         ,new UpdateCursor("T01AV23", "DELETE FROM TXPHPREIT  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? AND H_DiaI = ?", GX_NOMASK, "TXPHPREIT")
         ,new ForEachCursor("T01AV24", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV25", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV26", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV27", "SELECT IntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV28", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI, H_linI FROM TXPHPREI1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? AND H_DiaI = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AV29", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI FROM TXPHPREIT WHERE EmprCod = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV30", "SELECT CliCod, ArtCod, TipColCod, H_DiaI, H_linIe, H_unde, H_line, H_vi, H_vf, H_pke, H_pme, H_tp, EmprCod, IntCod FROM TXPHPREIe WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? and IntCod = ? and H_DiaI = ? and H_linIe = ? and H_unde = ? and H_line = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI, H_linIe, H_unde, H_line ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV31", "SELECT EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI, H_linIe, H_unde, H_line FROM TXPHPREIe WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? AND H_DiaI = ? AND H_linIe = ? AND H_unde = ? AND H_line = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01AV32", "INSERT INTO TXPHPREIe(CliCod, ArtCod, TipColCod, H_DiaI, H_linIe, H_unde, H_line, H_vi, H_vf, H_pke, H_pme, H_tp, EmprCod, IntCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHPREIe")
         ,new UpdateCursor("T01AV33", "UPDATE TXPHPREIe SET H_vi=?, H_vf=?, H_pke=?, H_pme=?, H_tp=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? AND H_DiaI = ? AND H_linIe = ? AND H_unde = ? AND H_line = ?", GX_NOMASK, "TXPHPREIe")
         ,new UpdateCursor("T01AV34", "DELETE FROM TXPHPREIe  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? AND H_DiaI = ? AND H_linIe = ? AND H_unde = ? AND H_line = ?", GX_NOMASK, "TXPHPREIe")
         ,new ForEachCursor("T01AV35", "SELECT EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI, H_linIe, H_unde, H_line FROM TXPHPREIe WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? and IntCod = ? and H_DiaI = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod, H_DiaI, H_linIe, H_unde, H_line ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV36", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AV37", "SELECT EmprCod FROM TXPPRETIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND TipColCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 3);
               ((byte[]) buf[18])[0] = rslt.getByte(14);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 3);
               ((byte[]) buf[18])[0] = rslt.getByte(14);
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 10 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 3);
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((String[]) buf[14])[0] = rslt.getString(10, 16);
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((byte[]) buf[16])[0] = rslt.getByte(12);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               return;
            case 28 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 3);
               ((byte[]) buf[18])[0] = rslt.getByte(14);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 35 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 16);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setString(13, (String)parms[12], 16);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setDate(15, (java.util.Date)parms[14]);
               stmt.setString(16, (String)parms[15], 3);
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 16);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setString(13, (String)parms[12], 16);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setDate(15, (java.util.Date)parms[14]);
               stmt.setString(16, (String)parms[15], 3);
               return;
            case 19 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setString(5, (String)parms[5], 16);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               return;
            case 20 :
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
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setDate(7, (java.util.Date)parms[7]);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
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
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 5);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[14], 5);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[16], 1);
               }
               stmt.setString(13, (String)parms[17], 3);
               stmt.setByte(14, ((Number) parms[18]).byteValue());
               return;
            case 31 :
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
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 5);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 5);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setString(8, (String)parms[12], 16);
               stmt.setByte(9, ((Number) parms[13]).byteValue());
               stmt.setByte(10, ((Number) parms[14]).byteValue());
               stmt.setDate(11, (java.util.Date)parms[15]);
               stmt.setInt(12, ((Number) parms[16]).intValue());
               stmt.setString(13, (String)parms[17], 1);
               stmt.setShort(14, ((Number) parms[18]).shortValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

