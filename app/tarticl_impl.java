package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tarticl_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetFirstPar( "CliCod") ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action17") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         n65ArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_17_LP10( A396EmprCod, A252CliCod, A65ArtCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_21") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A829TipArtCod = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_21( A396EmprCod, A829TipArtCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
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
         gxload_22( A396EmprCod, A4295ClasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
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
         gxload_20( A396EmprCod, A252CliCod) ;
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
         gxfirstwebparm = httpContext.GetFirstPar( "CliCod") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "CliCod") ;
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
         AV65CliCod = (int)(GXutil.lval( gxfirstwebparm)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65CliCod), 6, 0));
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV66ArtCod = httpContext.GetPar( "ArtCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66ArtCod", AV66ArtCod);
            AV67Mode2 = httpContext.GetPar( "Mode2") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67Mode2", AV67Mode2);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "FICHA TECNICA ARTICULO", ""), (short)(0)) ;
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

   public tarticl_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tarticl_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tarticl_impl.class ));
   }

   public tarticl_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkArtCorOri = UIFactory.getCheckbox(this);
      chkArtEncOri = UIFactory.getCheckbox(this);
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
      A66ArtCorOri = ((GXutil.strcmp(GXutil.rtrim( A66ArtCorOri), "S")==0) ? "S" : "N") ;
      n66ArtCorOri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A66ArtCorOri", A66ArtCorOri);
      A70ArtEncOri = ((GXutil.strcmp(GXutil.rtrim( A70ArtEncOri), "S")==0) ? "S" : "N") ;
      n70ArtEncOri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A70ArtEncOri", A70ArtEncOri);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTICl.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTICl.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTICl.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTICl.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TARTICl.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Materia", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtMat_Internalname, GXutil.rtrim( A87ArtMat), GXutil.rtrim( localUtil.format( A87ArtMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtMat_Jsonclick, 0, "", "", "", "", "", 1, edtArtMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Código Tipo Artículo", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipArtCod_Internalname, GXutil.ltrim( localUtil.ntoc( A829TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipArtCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A829TipArtCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A829TipArtCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipArtCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Descripción Tipo Articulo", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipArtDsc_Internalname, GXutil.rtrim( A830TipArtDsc), GXutil.rtrim( localUtil.format( A830TipArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtTipArtDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descripcion Articulo", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Peso metro lineal", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtPml_Internalname, GXutil.ltrim( localUtil.ntoc( A1148ArtPml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtPml_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1148ArtPml), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1148ArtPml), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtPml_Jsonclick, 0, "", "", "", "", "", 1, edtArtPml_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Gramaje Crudo", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtGraCru_Internalname, GXutil.ltrim( localUtil.ntoc( A78ArtGraCru, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtGraCru_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A78ArtGraCru), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A78ArtGraCru), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtGraCru_Jsonclick, 0, "", "", "", "", "", 1, edtArtGraCru_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Ancho Crudo", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCruMin_Internalname, GXutil.ltrim( localUtil.ntoc( A68ArtCruMin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtCruMin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A68ArtCruMin), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A68ArtCruMin), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCruMin_Jsonclick, 0, "", "", "", "", "", 1, edtArtCruMin_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Ancho Crudo Maximo", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCruMax_Internalname, GXutil.ltrim( localUtil.ntoc( A67ArtCruMax, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtCruMax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A67ArtCruMax), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A67ArtCruMax), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCruMax_Jsonclick, 0, "", "", "", "", "", 1, edtArtCruMax_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Ancho Acabado", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtAcaMin_Internalname, GXutil.ltrim( localUtil.ntoc( A63ArtAcaMin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtAcaMin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A63ArtAcaMin), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A63ArtAcaMin), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtAcaMin_Jsonclick, 0, "", "", "", "", "", 1, edtArtAcaMin_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Ancho Acabado Maximo", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtAcaMax_Internalname, GXutil.ltrim( localUtil.ntoc( A62ArtAcaMax, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtAcaMax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A62ArtAcaMax), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A62ArtAcaMax), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtAcaMax_Jsonclick, 0, "", "", "", "", "", 1, edtArtAcaMax_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Rendimiento", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtRen_Internalname, GXutil.ltrim( localUtil.ntoc( A95ArtRen, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtRen_Enabled!=0) ? localUtil.format( A95ArtRen, "ZZ9.99") : localUtil.format( A95ArtRen, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtRen_Jsonclick, 0, "", "", "", "", "", 1, edtArtRen_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Tipo Plegado", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtTipPle_Internalname, GXutil.rtrim( A101ArtTipPle), GXutil.rtrim( localUtil.format( A101ArtTipPle, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTipPle_Jsonclick, 0, "", "", "", "", "", 1, edtArtTipPle_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Tipo Largos", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtTipLar_Internalname, GXutil.rtrim( A100ArtTipLar), GXutil.rtrim( localUtil.format( A100ArtTipLar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTipLar_Jsonclick, 0, "", "", "", "", "", 1, edtArtTipLar_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Cortar Orillos", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkArtCorOri.getInternalname(), A66ArtCorOri, "", "", 1, chkArtCorOri.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(111, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,111);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Encolar Orillos", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkArtEncOri.getInternalname(), A70ArtEncOri, "", "", 1, chkArtEncOri.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(116, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,116);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Suavizado", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtSua_Internalname, GXutil.rtrim( A96ArtSua), GXutil.rtrim( localUtil.format( A96ArtSua, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtSua_Jsonclick, 0, "", "", "", "", "", 1, edtArtSua_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Acabado Quimico", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtAcaQui_Internalname, GXutil.rtrim( A64ArtAcaQui), GXutil.rtrim( localUtil.format( A64ArtAcaQui, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtAcaQui_Jsonclick, 0, "", "", "", "", "", 1, edtArtAcaQui_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Etiquetas", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtEti_Internalname, GXutil.rtrim( A73ArtEti), GXutil.rtrim( localUtil.format( A73ArtEti, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtEti_Jsonclick, 0, "", "", "", "", "", 1, edtArtEti_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Etiqueta", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliEti_Internalname, GXutil.rtrim( A272CliEti), GXutil.rtrim( localUtil.format( A272CliEti, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliEti_Jsonclick, 0, "", "", "", "", "", 1, edtCliEti_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Urgencia", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliUrg_Internalname, GXutil.ltrim( localUtil.ntoc( A306CliUrg, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliUrg_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A306CliUrg), "9") : localUtil.format( DecimalUtil.doubleToDec(A306CliUrg), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliUrg_Jsonclick, 0, "", "", "", "", "", 1, edtCliUrg_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Urgencia", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtUrg_Internalname, GXutil.ltrim( localUtil.ntoc( A117ArtUrg, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtUrg_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A117ArtUrg), "9") : localUtil.format( DecimalUtil.doubleToDec(A117ArtUrg), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUrg_Jsonclick, 0, "", "", "", "", "", 1, edtArtUrg_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "% Merma", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtMer_Internalname, GXutil.ltrim( localUtil.ntoc( A88ArtMer, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtMer_Enabled!=0) ? localUtil.format( A88ArtMer, "Z9.99") : localUtil.format( A88ArtMer, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtMer_Jsonclick, 0, "", "", "", "", "", 1, edtArtMer_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Trama1", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtTra1_Internalname, GXutil.rtrim( A105ArtTra1), GXutil.rtrim( localUtil.format( A105ArtTra1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTra1_Jsonclick, 0, "", "", "", "", "", 1, edtArtTra1_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Trama2", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtTra2_Internalname, GXutil.rtrim( A106ArtTra2), GXutil.rtrim( localUtil.format( A106ArtTra2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTra2_Jsonclick, 0, "", "", "", "", "", 1, edtArtTra2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Trama3", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtTra3_Internalname, GXutil.rtrim( A107ArtTra3), GXutil.rtrim( localUtil.format( A107ArtTra3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTra3_Jsonclick, 0, "", "", "", "", "", 1, edtArtTra3_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "% Trama1", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtTraP1_Internalname, GXutil.ltrim( localUtil.ntoc( A108ArtTraP1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtTraP1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A108ArtTraP1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A108ArtTraP1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTraP1_Jsonclick, 0, "", "", "", "", "", 1, edtArtTraP1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "%Trama2", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtTraP2_Internalname, GXutil.ltrim( localUtil.ntoc( A109ArtTraP2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtTraP2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A109ArtTraP2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A109ArtTraP2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTraP2_Jsonclick, 0, "", "", "", "", "", 1, edtArtTraP2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "% Trama3", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtTraP3_Internalname, GXutil.ltrim( localUtil.ntoc( A110ArtTraP3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtTraP3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A110ArtTraP3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A110ArtTraP3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtTraP3_Jsonclick, 0, "", "", "", "", "", 1, edtArtTraP3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Urdido1", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtUrd1_Internalname, GXutil.rtrim( A111ArtUrd1), GXutil.rtrim( localUtil.format( A111ArtUrd1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUrd1_Jsonclick, 0, "", "", "", "", "", 1, edtArtUrd1_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Urdido2", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtUrd2_Internalname, GXutil.rtrim( A112ArtUrd2), GXutil.rtrim( localUtil.format( A112ArtUrd2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUrd2_Jsonclick, 0, "", "", "", "", "", 1, edtArtUrd2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Urdido3", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtUrd3_Internalname, GXutil.rtrim( A113ArtUrd3), GXutil.rtrim( localUtil.format( A113ArtUrd3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUrd3_Jsonclick, 0, "", "", "", "", "", 1, edtArtUrd3_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "% Urdido1", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtUrdP1_Internalname, GXutil.ltrim( localUtil.ntoc( A114ArtUrdP1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtUrdP1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A114ArtUrdP1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A114ArtUrdP1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUrdP1_Jsonclick, 0, "", "", "", "", "", 1, edtArtUrdP1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "% Urdido2", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtUrdP2_Internalname, GXutil.ltrim( localUtil.ntoc( A115ArtUrdP2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtUrdP2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A115ArtUrdP2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A115ArtUrdP2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,206);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUrdP2_Jsonclick, 0, "", "", "", "", "", 1, edtArtUrdP2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "% Urdido3", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtUrdP3_Internalname, GXutil.ltrim( localUtil.ntoc( A116ArtUrdP3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtUrdP3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A116ArtUrdP3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A116ArtUrdP3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,211);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUrdP3_Jsonclick, 0, "", "", "", "", "", 1, edtArtUrdP3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "Precio Kgm.", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A92ArtPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtPreKgm_Enabled!=0) ? localUtil.format( A92ArtPreKgm, "ZZZZZZ9.999") : localUtil.format( A92ArtPreKgm, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,216);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtPreKgm_Jsonclick, 0, "", "", "", "", "", 1, edtArtPreKgm_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, httpContext.getMessage( "Precio Metro", ""), "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A93ArtPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtPreMtr_Enabled!=0) ? localUtil.format( A93ArtPreMtr, "ZZZZZZ9.999") : localUtil.format( A93ArtPreMtr, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,221);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtPreMtr_Jsonclick, 0, "", "", "", "", "", 1, edtArtPreMtr_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, httpContext.getMessage( "Precio Definitivo", ""), "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 226,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtPreDef_Internalname, GXutil.rtrim( A91ArtPreDef), GXutil.rtrim( localUtil.format( A91ArtPreDef, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,226);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtPreDef_Jsonclick, 0, "", "", "", "", "", 1, edtArtPreDef_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, httpContext.getMessage( "Encogimiento: Comprimido", ""), "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtEncCom_Internalname, GXutil.ltrim( localUtil.ntoc( A1229ArtEncCom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtEncCom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1229ArtEncCom), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1229ArtEncCom), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,231);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtEncCom_Jsonclick, 0, "", "", "", "", "", 1, edtArtEncCom_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, httpContext.getMessage( "Encogimiento: Ancho", ""), "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 236,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtEncAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A1230ArtEncAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtEncAnh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1230ArtEncAnh), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1230ArtEncAnh), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,236);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtEncAnh_Jsonclick, 0, "", "", "", "", "", 1, edtArtEncAnh_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, httpContext.getMessage( "Gramaje Acabado", ""), "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtGraAca_Internalname, GXutil.ltrim( localUtil.ntoc( A1903ArtGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtGraAca_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1903ArtGraAca), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1903ArtGraAca), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,241);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtGraAca_Jsonclick, 0, "", "", "", "", "", 1, edtArtGraAca_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, httpContext.getMessage( "Rdto en Acabado", ""), "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 246,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtRdoA_Internalname, GXutil.ltrim( localUtil.ntoc( A1905ArtRdoA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtRdoA_Enabled!=0) ? localUtil.format( A1905ArtRdoA, "ZZ9.99") : localUtil.format( A1905ArtRdoA, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,246);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtRdoA_Jsonclick, 0, "", "", "", "", "", 1, edtArtRdoA_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, httpContext.getMessage( "Rdto en Neto", ""), "", "", lblTextblock47_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 251,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtRdoN_Internalname, GXutil.ltrim( localUtil.ntoc( A1904ArtRdoN, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtRdoN_Enabled!=0) ? localUtil.format( A1904ArtRdoN, "ZZ9.99") : localUtil.format( A1904ArtRdoN, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,251);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtRdoN_Jsonclick, 0, "", "", "", "", "", 1, edtArtRdoN_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock48_Internalname, httpContext.getMessage( "Factor Absorcion Serie", ""), "", "", lblTextblock48_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 256,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtFacAbs_Internalname, GXutil.ltrim( localUtil.ntoc( A2791ArtFacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtFacAbs_Enabled!=0) ? localUtil.format( A2791ArtFacAbs, "ZZ9.99") : localUtil.format( A2791ArtFacAbs, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,256);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtFacAbs_Jsonclick, 0, "", "", "", "", "", 1, edtArtFacAbs_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock49_Internalname, httpContext.getMessage( "Plegado", ""), "", "", lblTextblock49_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 261,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtPle2_Internalname, GXutil.rtrim( A2834ArtPle2), GXutil.rtrim( localUtil.format( A2834ArtPle2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,261);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtPle2_Jsonclick, 0, "", "", "", "", "", 1, edtArtPle2_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock50_Internalname, httpContext.getMessage( "Numero de Cortes", ""), "", "", lblTextblock50_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 266,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtNumCor_Internalname, GXutil.ltrim( localUtil.ntoc( A3121ArtNumCor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtNumCor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3121ArtNumCor), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3121ArtNumCor), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,266);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtNumCor_Jsonclick, 0, "", "", "", "", "", 1, edtArtNumCor_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock51_Internalname, httpContext.getMessage( "Ancho Salida 1", ""), "", "", lblTextblock51_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 271,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtAncSal1_Internalname, GXutil.ltrim( localUtil.ntoc( A3122ArtAncSal1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtAncSal1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3122ArtAncSal1), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3122ArtAncSal1), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,271);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtAncSal1_Jsonclick, 0, "", "", "", "", "", 1, edtArtAncSal1_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock52_Internalname, httpContext.getMessage( "Ancho Salida 2", ""), "", "", lblTextblock52_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 276,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtAncSal2_Internalname, GXutil.ltrim( localUtil.ntoc( A3123ArtAncSal2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtAncSal2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3123ArtAncSal2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3123ArtAncSal2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,276);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtAncSal2_Jsonclick, 0, "", "", "", "", "", 1, edtArtAncSal2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock53_Internalname, httpContext.getMessage( "Ancho Salida 3", ""), "", "", lblTextblock53_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 281,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtAncSal3_Internalname, GXutil.ltrim( localUtil.ntoc( A3124ArtAncSal3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtAncSal3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3124ArtAncSal3), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3124ArtAncSal3), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,281);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtAncSal3_Jsonclick, 0, "", "", "", "", "", 1, edtArtAncSal3_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock54_Internalname, httpContext.getMessage( "Gramaje Acabado", ""), "", "", lblTextblock54_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 286,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtGraAca2_Internalname, GXutil.ltrim( localUtil.ntoc( A3125ArtGraAca2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtGraAca2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3125ArtGraAca2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3125ArtGraAca2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,286);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtGraAca2_Jsonclick, 0, "", "", "", "", "", 1, edtArtGraAca2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock55_Internalname, httpContext.getMessage( "Gramaje Crudo 2", ""), "", "", lblTextblock55_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 291,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtGraCru2_Internalname, GXutil.ltrim( localUtil.ntoc( A3126ArtGraCru2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtGraCru2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3126ArtGraCru2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3126ArtGraCru2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,291);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtGraCru2_Jsonclick, 0, "", "", "", "", "", 1, edtArtGraCru2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock56_Internalname, httpContext.getMessage( "Tipo Clasificacion", ""), "", "", lblTextblock56_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 296,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtClasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4295ClasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtClasCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4295ClasCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4295ClasCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,296);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClasCod_Jsonclick, 0, "", "", "", "", "", 1, edtClasCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock57_Internalname, httpContext.getMessage( "Peso Medio por Pieza", ""), "", "", lblTextblock57_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 301,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtPmPPza_Internalname, GXutil.ltrim( localUtil.ntoc( A4297ArtPmPPza, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtPmPPza_Enabled!=0) ? localUtil.format( A4297ArtPmPPza, "ZZZZZ9.99") : localUtil.format( A4297ArtPmPPza, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,301);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtPmPPza_Jsonclick, 0, "", "", "", "", "", 1, edtArtPmPPza_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock58_Internalname, httpContext.getMessage( "Relacion de Baño", ""), "", "", lblTextblock58_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 306,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtRb_Internalname, GXutil.ltrim( localUtil.ntoc( A4607ArtRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtRb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4607ArtRb), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4607ArtRb), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,306);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtRb_Jsonclick, 0, "", "", "", "", "", 1, edtArtRb_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock59_Internalname, httpContext.getMessage( "Clasificacion", ""), "", "", lblTextblock59_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipArtClas_Internalname, GXutil.rtrim( A4608TipArtClas), GXutil.rtrim( localUtil.format( A4608TipArtClas, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipArtClas_Jsonclick, 0, "", "", "", "", "", 1, edtTipArtClas_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock60_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock60_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtClasDsc_Internalname, GXutil.rtrim( A4296ClasDsc), GXutil.rtrim( localUtil.format( A4296ClasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClasDsc_Jsonclick, 0, "", "", "", "", "", 1, edtClasDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock61_Internalname, httpContext.getMessage( "ArtFacTor", ""), "", "", lblTextblock61_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 321,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtFacTor_Internalname, GXutil.ltrim( localUtil.ntoc( A6660ArtFacTor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArtFacTor_Enabled!=0) ? localUtil.format( A6660ArtFacTor, "ZZ9.99") : localUtil.format( A6660ArtFacTor, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,321);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtFacTor_Jsonclick, 0, "", "", "", "", "", 1, edtArtFacTor_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock62_Internalname, httpContext.getMessage( "Codigo Serie Comercial", ""), "", "", lblTextblock62_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 326,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtComer_Internalname, GXutil.rtrim( A5741ArtComer), GXutil.rtrim( localUtil.format( A5741ArtComer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,326);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtComer_Jsonclick, 0, "", "", "", "", "", 1, edtArtComer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock63_Internalname, httpContext.getMessage( "Número Métrico", ""), "", "", lblTextblock63_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 331,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtNMtr_Internalname, GXutil.rtrim( A967ArtNMtr), GXutil.rtrim( localUtil.format( A967ArtNMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,331);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtNMtr_Jsonclick, 0, "", "", "", "", "", 1, edtArtNMtr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock64_Internalname, httpContext.getMessage( "Usuario creo/modif. serie", ""), "", "", lblTextblock64_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 336,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtUsrCod_Internalname, GXutil.rtrim( A4353ArtUsrCod), GXutil.rtrim( localUtil.format( A4353ArtUsrCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,336);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtUsrCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtUsrCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock65_Internalname, httpContext.getMessage( "Fecha Modificación", ""), "", "", lblTextblock65_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 341,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtArtFecMod_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtFecMod_Internalname, localUtil.format(A4354ArtFecMod, "99/99/9999"), localUtil.format( A4354ArtFecMod, "99/99/9999"), TempTags+" onchange=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,341);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtFecMod_Jsonclick, 0, "", "", "", "", "", 1, edtArtFecMod_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtArtFecMod_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtArtFecMod_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TARTICl.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock66_Internalname, httpContext.getMessage( "Fecha Creacion", ""), "", "", lblTextblock66_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTICl.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 346,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtArtFecCre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtFecCre_Internalname, localUtil.format(A3683ArtFecCre, "99/99/99"), localUtil.format( A3683ArtFecCre, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,346);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtFecCre_Jsonclick, 0, "", "", "", "", "", 1, edtArtFecCre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTICl.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtArtFecCre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtArtFecCre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TARTICl.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 349,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTICl.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 350,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTICl.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 351,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTICl.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 352,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTICl.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 353,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TARTICl.htm");
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
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
         Z69ArtDsc = httpContext.cgiGet( "Z69ArtDsc") ;
         Z87ArtMat = httpContext.cgiGet( "Z87ArtMat") ;
         Z1148ArtPml = (short)(localUtil.ctol( httpContext.cgiGet( "Z1148ArtPml"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z78ArtGraCru = (short)(localUtil.ctol( httpContext.cgiGet( "Z78ArtGraCru"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z68ArtCruMin = (short)(localUtil.ctol( httpContext.cgiGet( "Z68ArtCruMin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z67ArtCruMax = (short)(localUtil.ctol( httpContext.cgiGet( "Z67ArtCruMax"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z63ArtAcaMin = (short)(localUtil.ctol( httpContext.cgiGet( "Z63ArtAcaMin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z62ArtAcaMax = (short)(localUtil.ctol( httpContext.cgiGet( "Z62ArtAcaMax"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z95ArtRen = localUtil.ctond( httpContext.cgiGet( "Z95ArtRen")) ;
         Z101ArtTipPle = httpContext.cgiGet( "Z101ArtTipPle") ;
         Z100ArtTipLar = httpContext.cgiGet( "Z100ArtTipLar") ;
         Z66ArtCorOri = httpContext.cgiGet( "Z66ArtCorOri") ;
         Z70ArtEncOri = httpContext.cgiGet( "Z70ArtEncOri") ;
         Z96ArtSua = httpContext.cgiGet( "Z96ArtSua") ;
         Z64ArtAcaQui = httpContext.cgiGet( "Z64ArtAcaQui") ;
         Z73ArtEti = httpContext.cgiGet( "Z73ArtEti") ;
         Z117ArtUrg = (byte)(localUtil.ctol( httpContext.cgiGet( "Z117ArtUrg"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z88ArtMer = localUtil.ctond( httpContext.cgiGet( "Z88ArtMer")) ;
         Z105ArtTra1 = httpContext.cgiGet( "Z105ArtTra1") ;
         Z106ArtTra2 = httpContext.cgiGet( "Z106ArtTra2") ;
         Z107ArtTra3 = httpContext.cgiGet( "Z107ArtTra3") ;
         Z108ArtTraP1 = (short)(localUtil.ctol( httpContext.cgiGet( "Z108ArtTraP1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z109ArtTraP2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z109ArtTraP2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z110ArtTraP3 = (short)(localUtil.ctol( httpContext.cgiGet( "Z110ArtTraP3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z111ArtUrd1 = httpContext.cgiGet( "Z111ArtUrd1") ;
         Z112ArtUrd2 = httpContext.cgiGet( "Z112ArtUrd2") ;
         Z113ArtUrd3 = httpContext.cgiGet( "Z113ArtUrd3") ;
         Z114ArtUrdP1 = (short)(localUtil.ctol( httpContext.cgiGet( "Z114ArtUrdP1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z115ArtUrdP2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z115ArtUrdP2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z116ArtUrdP3 = (short)(localUtil.ctol( httpContext.cgiGet( "Z116ArtUrdP3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z92ArtPreKgm = localUtil.ctond( httpContext.cgiGet( "Z92ArtPreKgm")) ;
         Z93ArtPreMtr = localUtil.ctond( httpContext.cgiGet( "Z93ArtPreMtr")) ;
         Z91ArtPreDef = httpContext.cgiGet( "Z91ArtPreDef") ;
         Z1229ArtEncCom = (short)(localUtil.ctol( httpContext.cgiGet( "Z1229ArtEncCom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1230ArtEncAnh = (short)(localUtil.ctol( httpContext.cgiGet( "Z1230ArtEncAnh"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1903ArtGraAca = (short)(localUtil.ctol( httpContext.cgiGet( "Z1903ArtGraAca"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1905ArtRdoA = localUtil.ctond( httpContext.cgiGet( "Z1905ArtRdoA")) ;
         Z1904ArtRdoN = localUtil.ctond( httpContext.cgiGet( "Z1904ArtRdoN")) ;
         Z2791ArtFacAbs = localUtil.ctond( httpContext.cgiGet( "Z2791ArtFacAbs")) ;
         Z2834ArtPle2 = httpContext.cgiGet( "Z2834ArtPle2") ;
         Z3121ArtNumCor = (short)(localUtil.ctol( httpContext.cgiGet( "Z3121ArtNumCor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3122ArtAncSal1 = (short)(localUtil.ctol( httpContext.cgiGet( "Z3122ArtAncSal1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3123ArtAncSal2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z3123ArtAncSal2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3124ArtAncSal3 = (short)(localUtil.ctol( httpContext.cgiGet( "Z3124ArtAncSal3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3125ArtGraAca2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z3125ArtGraAca2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3126ArtGraCru2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z3126ArtGraCru2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4297ArtPmPPza = localUtil.ctond( httpContext.cgiGet( "Z4297ArtPmPPza")) ;
         Z4607ArtRb = (short)(localUtil.ctol( httpContext.cgiGet( "Z4607ArtRb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6660ArtFacTor = localUtil.ctond( httpContext.cgiGet( "Z6660ArtFacTor")) ;
         Z5741ArtComer = httpContext.cgiGet( "Z5741ArtComer") ;
         Z967ArtNMtr = httpContext.cgiGet( "Z967ArtNMtr") ;
         Z4353ArtUsrCod = httpContext.cgiGet( "Z4353ArtUsrCod") ;
         Z4354ArtFecMod = localUtil.ctod( httpContext.cgiGet( "Z4354ArtFecMod"), 0) ;
         Z3683ArtFecCre = localUtil.ctod( httpContext.cgiGet( "Z3683ArtFecCre"), 0) ;
         Z829TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z829TipArtCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4295ClasCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z4295ClasCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         AV59Modo = httpContext.cgiGet( "MODO") ;
         AV65CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV67Mode2 = httpContext.cgiGet( "vMODE2") ;
         AV66ArtCod = httpContext.cgiGet( "vARTCOD") ;
         AV59Modo = httpContext.cgiGet( "vMODO") ;
         Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_date = localUtil.ctod( httpContext.cgiGet( "vTODAY"), 0) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
         A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
         n65ArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A87ArtMat = httpContext.cgiGet( edtArtMat_Internalname) ;
         n87ArtMat = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A87ArtMat", A87ArtMat);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipArtCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipArtCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPARTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipArtCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A829TipArtCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
         }
         else
         {
            A829TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipArtCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
         }
         A830TipArtDsc = httpContext.cgiGet( edtTipArtDsc_Internalname) ;
         n830TipArtDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A830TipArtDsc", A830TipArtDsc);
         A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
         n69ArtDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTPML");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtPml_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1148ArtPml = (short)(0) ;
            n1148ArtPml = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1148ArtPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1148ArtPml), 4, 0));
         }
         else
         {
            A1148ArtPml = (short)(localUtil.ctol( httpContext.cgiGet( edtArtPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1148ArtPml = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1148ArtPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1148ArtPml), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtGraCru_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtGraCru_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTGRACRU");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtGraCru_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A78ArtGraCru = (short)(0) ;
            n78ArtGraCru = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A78ArtGraCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A78ArtGraCru), 4, 0));
         }
         else
         {
            A78ArtGraCru = (short)(localUtil.ctol( httpContext.cgiGet( edtArtGraCru_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n78ArtGraCru = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A78ArtGraCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A78ArtGraCru), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtCruMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtCruMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTCRUMIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtCruMin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A68ArtCruMin = (short)(0) ;
            n68ArtCruMin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A68ArtCruMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A68ArtCruMin), 3, 0));
         }
         else
         {
            A68ArtCruMin = (short)(localUtil.ctol( httpContext.cgiGet( edtArtCruMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n68ArtCruMin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A68ArtCruMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A68ArtCruMin), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtCruMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtCruMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTCRUMAX");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtCruMax_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A67ArtCruMax = (short)(0) ;
            n67ArtCruMax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A67ArtCruMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A67ArtCruMax), 3, 0));
         }
         else
         {
            A67ArtCruMax = (short)(localUtil.ctol( httpContext.cgiGet( edtArtCruMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n67ArtCruMax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A67ArtCruMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A67ArtCruMax), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtAcaMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtAcaMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTACAMIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtAcaMin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A63ArtAcaMin = (short)(0) ;
            n63ArtAcaMin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A63ArtAcaMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A63ArtAcaMin), 3, 0));
         }
         else
         {
            A63ArtAcaMin = (short)(localUtil.ctol( httpContext.cgiGet( edtArtAcaMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n63ArtAcaMin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A63ArtAcaMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A63ArtAcaMin), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtAcaMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtAcaMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTACAMAX");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtAcaMax_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A62ArtAcaMax = (short)(0) ;
            n62ArtAcaMax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A62ArtAcaMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A62ArtAcaMax), 3, 0));
         }
         else
         {
            A62ArtAcaMax = (short)(localUtil.ctol( httpContext.cgiGet( edtArtAcaMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n62ArtAcaMax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A62ArtAcaMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A62ArtAcaMax), 3, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtArtRen_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtArtRen_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTREN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtRen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A95ArtRen = DecimalUtil.ZERO ;
            n95ArtRen = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A95ArtRen", GXutil.ltrimstr( A95ArtRen, 6, 2));
         }
         else
         {
            A95ArtRen = localUtil.ctond( httpContext.cgiGet( edtArtRen_Internalname)) ;
            n95ArtRen = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A95ArtRen", GXutil.ltrimstr( A95ArtRen, 6, 2));
         }
         A101ArtTipPle = httpContext.cgiGet( edtArtTipPle_Internalname) ;
         n101ArtTipPle = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A101ArtTipPle", A101ArtTipPle);
         A100ArtTipLar = httpContext.cgiGet( edtArtTipLar_Internalname) ;
         n100ArtTipLar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A100ArtTipLar", A100ArtTipLar);
         A66ArtCorOri = ((GXutil.strcmp(httpContext.cgiGet( chkArtCorOri.getInternalname()), "S")==0) ? "S" : "N") ;
         n66ArtCorOri = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A66ArtCorOri", A66ArtCorOri);
         A70ArtEncOri = ((GXutil.strcmp(httpContext.cgiGet( chkArtEncOri.getInternalname()), "S")==0) ? "S" : "N") ;
         n70ArtEncOri = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A70ArtEncOri", A70ArtEncOri);
         A96ArtSua = httpContext.cgiGet( edtArtSua_Internalname) ;
         n96ArtSua = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A96ArtSua", A96ArtSua);
         A64ArtAcaQui = httpContext.cgiGet( edtArtAcaQui_Internalname) ;
         n64ArtAcaQui = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A64ArtAcaQui", A64ArtAcaQui);
         A73ArtEti = GXutil.upper( httpContext.cgiGet( edtArtEti_Internalname)) ;
         n73ArtEti = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A73ArtEti", A73ArtEti);
         A272CliEti = GXutil.upper( httpContext.cgiGet( edtCliEti_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A272CliEti", A272CliEti);
         A306CliUrg = (byte)(localUtil.ctol( httpContext.cgiGet( edtCliUrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A306CliUrg", GXutil.str( A306CliUrg, 1, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtUrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtUrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTURG");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtUrg_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A117ArtUrg = (byte)(0) ;
            n117ArtUrg = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A117ArtUrg", GXutil.str( A117ArtUrg, 1, 0));
         }
         else
         {
            A117ArtUrg = (byte)(localUtil.ctol( httpContext.cgiGet( edtArtUrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n117ArtUrg = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A117ArtUrg", GXutil.str( A117ArtUrg, 1, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtArtMer_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtArtMer_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTMER");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtMer_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A88ArtMer = DecimalUtil.ZERO ;
            n88ArtMer = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A88ArtMer", GXutil.ltrimstr( A88ArtMer, 5, 2));
         }
         else
         {
            A88ArtMer = localUtil.ctond( httpContext.cgiGet( edtArtMer_Internalname)) ;
            n88ArtMer = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A88ArtMer", GXutil.ltrimstr( A88ArtMer, 5, 2));
         }
         A105ArtTra1 = httpContext.cgiGet( edtArtTra1_Internalname) ;
         n105ArtTra1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A105ArtTra1", A105ArtTra1);
         A106ArtTra2 = httpContext.cgiGet( edtArtTra2_Internalname) ;
         n106ArtTra2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A106ArtTra2", A106ArtTra2);
         A107ArtTra3 = httpContext.cgiGet( edtArtTra3_Internalname) ;
         n107ArtTra3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A107ArtTra3", A107ArtTra3);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtTraP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtTraP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTTRAP1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtTraP1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A108ArtTraP1 = (short)(0) ;
            n108ArtTraP1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A108ArtTraP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A108ArtTraP1), 3, 0));
         }
         else
         {
            A108ArtTraP1 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtTraP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n108ArtTraP1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A108ArtTraP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A108ArtTraP1), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtTraP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtTraP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTTRAP2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtTraP2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A109ArtTraP2 = (short)(0) ;
            n109ArtTraP2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A109ArtTraP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A109ArtTraP2), 3, 0));
         }
         else
         {
            A109ArtTraP2 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtTraP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n109ArtTraP2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A109ArtTraP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A109ArtTraP2), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtTraP3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtTraP3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTTRAP3");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtTraP3_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A110ArtTraP3 = (short)(0) ;
            n110ArtTraP3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A110ArtTraP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A110ArtTraP3), 3, 0));
         }
         else
         {
            A110ArtTraP3 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtTraP3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n110ArtTraP3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A110ArtTraP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A110ArtTraP3), 3, 0));
         }
         A111ArtUrd1 = httpContext.cgiGet( edtArtUrd1_Internalname) ;
         n111ArtUrd1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A111ArtUrd1", A111ArtUrd1);
         A112ArtUrd2 = httpContext.cgiGet( edtArtUrd2_Internalname) ;
         n112ArtUrd2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A112ArtUrd2", A112ArtUrd2);
         A113ArtUrd3 = httpContext.cgiGet( edtArtUrd3_Internalname) ;
         n113ArtUrd3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A113ArtUrd3", A113ArtUrd3);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtUrdP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtUrdP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTURDP1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtUrdP1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A114ArtUrdP1 = (short)(0) ;
            n114ArtUrdP1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A114ArtUrdP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A114ArtUrdP1), 3, 0));
         }
         else
         {
            A114ArtUrdP1 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtUrdP1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n114ArtUrdP1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A114ArtUrdP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A114ArtUrdP1), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtUrdP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtUrdP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTURDP2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtUrdP2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A115ArtUrdP2 = (short)(0) ;
            n115ArtUrdP2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A115ArtUrdP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A115ArtUrdP2), 3, 0));
         }
         else
         {
            A115ArtUrdP2 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtUrdP2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n115ArtUrdP2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A115ArtUrdP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A115ArtUrdP2), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtUrdP3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtUrdP3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTURDP3");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtUrdP3_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A116ArtUrdP3 = (short)(0) ;
            n116ArtUrdP3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A116ArtUrdP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A116ArtUrdP3), 3, 0));
         }
         else
         {
            A116ArtUrdP3 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtUrdP3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n116ArtUrdP3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A116ArtUrdP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A116ArtUrdP3), 3, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtArtPreKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtArtPreKgm_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTPREKGM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtPreKgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A92ArtPreKgm = DecimalUtil.ZERO ;
            n92ArtPreKgm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A92ArtPreKgm", GXutil.ltrimstr( A92ArtPreKgm, 13, 5));
         }
         else
         {
            A92ArtPreKgm = localUtil.ctond( httpContext.cgiGet( edtArtPreKgm_Internalname)) ;
            n92ArtPreKgm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A92ArtPreKgm", GXutil.ltrimstr( A92ArtPreKgm, 13, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtArtPreMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtArtPreMtr_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTPREMTR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtPreMtr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A93ArtPreMtr = DecimalUtil.ZERO ;
            n93ArtPreMtr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A93ArtPreMtr", GXutil.ltrimstr( A93ArtPreMtr, 13, 5));
         }
         else
         {
            A93ArtPreMtr = localUtil.ctond( httpContext.cgiGet( edtArtPreMtr_Internalname)) ;
            n93ArtPreMtr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A93ArtPreMtr", GXutil.ltrimstr( A93ArtPreMtr, 13, 5));
         }
         A91ArtPreDef = GXutil.upper( httpContext.cgiGet( edtArtPreDef_Internalname)) ;
         n91ArtPreDef = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A91ArtPreDef", A91ArtPreDef);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtEncCom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtEncCom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTENCCOM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtEncCom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1229ArtEncCom = (short)(0) ;
            n1229ArtEncCom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1229ArtEncCom", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1229ArtEncCom), 4, 0));
         }
         else
         {
            A1229ArtEncCom = (short)(localUtil.ctol( httpContext.cgiGet( edtArtEncCom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1229ArtEncCom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1229ArtEncCom", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1229ArtEncCom), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtEncAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtEncAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTENCANH");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtEncAnh_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1230ArtEncAnh = (short)(0) ;
            n1230ArtEncAnh = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1230ArtEncAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1230ArtEncAnh), 4, 0));
         }
         else
         {
            A1230ArtEncAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtArtEncAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1230ArtEncAnh = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1230ArtEncAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1230ArtEncAnh), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtGraAca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtGraAca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTGRAACA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtGraAca_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1903ArtGraAca = (short)(0) ;
            n1903ArtGraAca = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1903ArtGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1903ArtGraAca), 4, 0));
         }
         else
         {
            A1903ArtGraAca = (short)(localUtil.ctol( httpContext.cgiGet( edtArtGraAca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1903ArtGraAca = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1903ArtGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1903ArtGraAca), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtArtRdoA_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtArtRdoA_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTRDOA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtRdoA_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1905ArtRdoA = DecimalUtil.ZERO ;
            n1905ArtRdoA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1905ArtRdoA", GXutil.ltrimstr( A1905ArtRdoA, 6, 2));
         }
         else
         {
            A1905ArtRdoA = localUtil.ctond( httpContext.cgiGet( edtArtRdoA_Internalname)) ;
            n1905ArtRdoA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1905ArtRdoA", GXutil.ltrimstr( A1905ArtRdoA, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtArtRdoN_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtArtRdoN_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTRDON");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtRdoN_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1904ArtRdoN = DecimalUtil.ZERO ;
            n1904ArtRdoN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1904ArtRdoN", GXutil.ltrimstr( A1904ArtRdoN, 6, 2));
         }
         else
         {
            A1904ArtRdoN = localUtil.ctond( httpContext.cgiGet( edtArtRdoN_Internalname)) ;
            n1904ArtRdoN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1904ArtRdoN", GXutil.ltrimstr( A1904ArtRdoN, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtArtFacAbs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtArtFacAbs_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTFACABS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtFacAbs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2791ArtFacAbs = DecimalUtil.ZERO ;
            n2791ArtFacAbs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2791ArtFacAbs", GXutil.ltrimstr( A2791ArtFacAbs, 6, 2));
         }
         else
         {
            A2791ArtFacAbs = localUtil.ctond( httpContext.cgiGet( edtArtFacAbs_Internalname)) ;
            n2791ArtFacAbs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2791ArtFacAbs", GXutil.ltrimstr( A2791ArtFacAbs, 6, 2));
         }
         A2834ArtPle2 = httpContext.cgiGet( edtArtPle2_Internalname) ;
         n2834ArtPle2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2834ArtPle2", A2834ArtPle2);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtNumCor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtNumCor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTNUMCOR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtNumCor_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3121ArtNumCor = (short)(0) ;
            n3121ArtNumCor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3121ArtNumCor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3121ArtNumCor), 4, 0));
         }
         else
         {
            A3121ArtNumCor = (short)(localUtil.ctol( httpContext.cgiGet( edtArtNumCor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3121ArtNumCor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3121ArtNumCor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3121ArtNumCor), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtAncSal1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtAncSal1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTANCSAL1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtAncSal1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3122ArtAncSal1 = (short)(0) ;
            n3122ArtAncSal1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3122ArtAncSal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3122ArtAncSal1), 4, 0));
         }
         else
         {
            A3122ArtAncSal1 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtAncSal1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3122ArtAncSal1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3122ArtAncSal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3122ArtAncSal1), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtAncSal2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtAncSal2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTANCSAL2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtAncSal2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3123ArtAncSal2 = (short)(0) ;
            n3123ArtAncSal2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3123ArtAncSal2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3123ArtAncSal2), 4, 0));
         }
         else
         {
            A3123ArtAncSal2 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtAncSal2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3123ArtAncSal2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3123ArtAncSal2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3123ArtAncSal2), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtAncSal3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtAncSal3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTANCSAL3");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtAncSal3_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3124ArtAncSal3 = (short)(0) ;
            n3124ArtAncSal3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3124ArtAncSal3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3124ArtAncSal3), 4, 0));
         }
         else
         {
            A3124ArtAncSal3 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtAncSal3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3124ArtAncSal3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3124ArtAncSal3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3124ArtAncSal3), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtGraAca2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtGraAca2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTGRAACA2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtGraAca2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3125ArtGraAca2 = (short)(0) ;
            n3125ArtGraAca2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3125ArtGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3125ArtGraAca2), 4, 0));
         }
         else
         {
            A3125ArtGraAca2 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtGraAca2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3125ArtGraAca2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3125ArtGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3125ArtGraAca2), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtGraCru2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtGraCru2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTGRACRU2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtGraCru2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3126ArtGraCru2 = (short)(0) ;
            n3126ArtGraCru2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3126ArtGraCru2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3126ArtGraCru2), 4, 0));
         }
         else
         {
            A3126ArtGraCru2 = (short)(localUtil.ctol( httpContext.cgiGet( edtArtGraCru2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3126ArtGraCru2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3126ArtGraCru2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3126ArtGraCru2), 4, 0));
         }
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
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtArtPmPPza_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtArtPmPPza_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTPMPPZA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtPmPPza_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4297ArtPmPPza = DecimalUtil.ZERO ;
            n4297ArtPmPPza = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4297ArtPmPPza", GXutil.ltrimstr( A4297ArtPmPPza, 9, 2));
         }
         else
         {
            A4297ArtPmPPza = localUtil.ctond( httpContext.cgiGet( edtArtPmPPza_Internalname)) ;
            n4297ArtPmPPza = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4297ArtPmPPza", GXutil.ltrimstr( A4297ArtPmPPza, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtArtRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtArtRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTRB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtRb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4607ArtRb = (short)(0) ;
            n4607ArtRb = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4607ArtRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4607ArtRb), 4, 0));
         }
         else
         {
            A4607ArtRb = (short)(localUtil.ctol( httpContext.cgiGet( edtArtRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4607ArtRb = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4607ArtRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4607ArtRb), 4, 0));
         }
         A4608TipArtClas = httpContext.cgiGet( edtTipArtClas_Internalname) ;
         n4608TipArtClas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4608TipArtClas", A4608TipArtClas);
         A4296ClasDsc = httpContext.cgiGet( edtClasDsc_Internalname) ;
         n4296ClasDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4296ClasDsc", A4296ClasDsc);
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtArtFacTor_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtArtFacTor_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ARTFACTOR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtFacTor_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6660ArtFacTor = DecimalUtil.ZERO ;
            n6660ArtFacTor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6660ArtFacTor", GXutil.ltrimstr( A6660ArtFacTor, 6, 2));
         }
         else
         {
            A6660ArtFacTor = localUtil.ctond( httpContext.cgiGet( edtArtFacTor_Internalname)) ;
            n6660ArtFacTor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6660ArtFacTor", GXutil.ltrimstr( A6660ArtFacTor, 6, 2));
         }
         A5741ArtComer = httpContext.cgiGet( edtArtComer_Internalname) ;
         n5741ArtComer = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5741ArtComer", A5741ArtComer);
         A967ArtNMtr = httpContext.cgiGet( edtArtNMtr_Internalname) ;
         n967ArtNMtr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A967ArtNMtr", A967ArtNMtr);
         A4353ArtUsrCod = httpContext.cgiGet( edtArtUsrCod_Internalname) ;
         n4353ArtUsrCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4353ArtUsrCod", A4353ArtUsrCod);
         if ( localUtil.vcdate( httpContext.cgiGet( edtArtFecMod_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ARTFECMOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtFecMod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4354ArtFecMod = GXutil.nullDate() ;
            n4354ArtFecMod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4354ArtFecMod", localUtil.format(A4354ArtFecMod, "99/99/9999"));
         }
         else
         {
            A4354ArtFecMod = localUtil.ctod( httpContext.cgiGet( edtArtFecMod_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n4354ArtFecMod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4354ArtFecMod", localUtil.format(A4354ArtFecMod, "99/99/9999"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtArtFecCre_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ARTFECCRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArtFecCre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3683ArtFecCre = GXutil.nullDate() ;
            n3683ArtFecCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3683ArtFecCre", localUtil.format(A3683ArtFecCre, "99/99/99"));
         }
         else
         {
            A3683ArtFecCre = localUtil.ctod( httpContext.cgiGet( edtArtFecCre_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n3683ArtFecCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3683ArtFecCre", localUtil.format(A3683ArtFecCre, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TARTICl");
         forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV59Modo, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tarticl:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = httpContext.GetPar( "ArtCod") ;
            n65ArtCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            getEqualNoModal( ) ;
            if ( ( isUpd( )  || isDlt( )  ) && ( GXutil.strcmp(AV67Mode2, httpContext.getMessage( httpContext.getMessage( "INS", ""), "")) != 0 ) )
            {
               A252CliCod = AV65CliCod ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            if ( ( isUpd( )  || isDlt( )  ) && ( GXutil.strcmp(AV67Mode2, httpContext.getMessage( httpContext.getMessage( "INS", ""), "")) != 0 ) )
            {
               A65ArtCod = AV66ArtCod ;
               n65ArtCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            }
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
            initAllLP10( ) ;
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
      disableAttributesLP10( ) ;
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

   public void confirm_LP0( )
   {
      beforeValidateLP10( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsLP10( ) ;
         }
         else
         {
            checkExtendedTableLP10( ) ;
            if ( AnyError == 0 )
            {
               zmLP10( 19) ;
               zmLP10( 20) ;
               zmLP10( 21) ;
               zmLP10( 22) ;
            }
            closeExtendedTableCursorsLP10( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValuesLP0( ) ;
      }
   }

   public void resetCaptionLP0( )
   {
   }

   public void zmLP10( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z69ArtDsc = T00LP3_A69ArtDsc[0] ;
            Z87ArtMat = T00LP3_A87ArtMat[0] ;
            Z1148ArtPml = T00LP3_A1148ArtPml[0] ;
            Z78ArtGraCru = T00LP3_A78ArtGraCru[0] ;
            Z68ArtCruMin = T00LP3_A68ArtCruMin[0] ;
            Z67ArtCruMax = T00LP3_A67ArtCruMax[0] ;
            Z63ArtAcaMin = T00LP3_A63ArtAcaMin[0] ;
            Z62ArtAcaMax = T00LP3_A62ArtAcaMax[0] ;
            Z95ArtRen = T00LP3_A95ArtRen[0] ;
            Z101ArtTipPle = T00LP3_A101ArtTipPle[0] ;
            Z100ArtTipLar = T00LP3_A100ArtTipLar[0] ;
            Z66ArtCorOri = T00LP3_A66ArtCorOri[0] ;
            Z70ArtEncOri = T00LP3_A70ArtEncOri[0] ;
            Z96ArtSua = T00LP3_A96ArtSua[0] ;
            Z64ArtAcaQui = T00LP3_A64ArtAcaQui[0] ;
            Z73ArtEti = T00LP3_A73ArtEti[0] ;
            Z117ArtUrg = T00LP3_A117ArtUrg[0] ;
            Z88ArtMer = T00LP3_A88ArtMer[0] ;
            Z105ArtTra1 = T00LP3_A105ArtTra1[0] ;
            Z106ArtTra2 = T00LP3_A106ArtTra2[0] ;
            Z107ArtTra3 = T00LP3_A107ArtTra3[0] ;
            Z108ArtTraP1 = T00LP3_A108ArtTraP1[0] ;
            Z109ArtTraP2 = T00LP3_A109ArtTraP2[0] ;
            Z110ArtTraP3 = T00LP3_A110ArtTraP3[0] ;
            Z111ArtUrd1 = T00LP3_A111ArtUrd1[0] ;
            Z112ArtUrd2 = T00LP3_A112ArtUrd2[0] ;
            Z113ArtUrd3 = T00LP3_A113ArtUrd3[0] ;
            Z114ArtUrdP1 = T00LP3_A114ArtUrdP1[0] ;
            Z115ArtUrdP2 = T00LP3_A115ArtUrdP2[0] ;
            Z116ArtUrdP3 = T00LP3_A116ArtUrdP3[0] ;
            Z92ArtPreKgm = T00LP3_A92ArtPreKgm[0] ;
            Z93ArtPreMtr = T00LP3_A93ArtPreMtr[0] ;
            Z91ArtPreDef = T00LP3_A91ArtPreDef[0] ;
            Z1229ArtEncCom = T00LP3_A1229ArtEncCom[0] ;
            Z1230ArtEncAnh = T00LP3_A1230ArtEncAnh[0] ;
            Z1903ArtGraAca = T00LP3_A1903ArtGraAca[0] ;
            Z1905ArtRdoA = T00LP3_A1905ArtRdoA[0] ;
            Z1904ArtRdoN = T00LP3_A1904ArtRdoN[0] ;
            Z2791ArtFacAbs = T00LP3_A2791ArtFacAbs[0] ;
            Z2834ArtPle2 = T00LP3_A2834ArtPle2[0] ;
            Z3121ArtNumCor = T00LP3_A3121ArtNumCor[0] ;
            Z3122ArtAncSal1 = T00LP3_A3122ArtAncSal1[0] ;
            Z3123ArtAncSal2 = T00LP3_A3123ArtAncSal2[0] ;
            Z3124ArtAncSal3 = T00LP3_A3124ArtAncSal3[0] ;
            Z3125ArtGraAca2 = T00LP3_A3125ArtGraAca2[0] ;
            Z3126ArtGraCru2 = T00LP3_A3126ArtGraCru2[0] ;
            Z4297ArtPmPPza = T00LP3_A4297ArtPmPPza[0] ;
            Z4607ArtRb = T00LP3_A4607ArtRb[0] ;
            Z6660ArtFacTor = T00LP3_A6660ArtFacTor[0] ;
            Z5741ArtComer = T00LP3_A5741ArtComer[0] ;
            Z967ArtNMtr = T00LP3_A967ArtNMtr[0] ;
            Z4353ArtUsrCod = T00LP3_A4353ArtUsrCod[0] ;
            Z4354ArtFecMod = T00LP3_A4354ArtFecMod[0] ;
            Z3683ArtFecCre = T00LP3_A3683ArtFecCre[0] ;
            Z829TipArtCod = T00LP3_A829TipArtCod[0] ;
            Z4295ClasCod = T00LP3_A4295ClasCod[0] ;
         }
         else
         {
            Z69ArtDsc = A69ArtDsc ;
            Z87ArtMat = A87ArtMat ;
            Z1148ArtPml = A1148ArtPml ;
            Z78ArtGraCru = A78ArtGraCru ;
            Z68ArtCruMin = A68ArtCruMin ;
            Z67ArtCruMax = A67ArtCruMax ;
            Z63ArtAcaMin = A63ArtAcaMin ;
            Z62ArtAcaMax = A62ArtAcaMax ;
            Z95ArtRen = A95ArtRen ;
            Z101ArtTipPle = A101ArtTipPle ;
            Z100ArtTipLar = A100ArtTipLar ;
            Z66ArtCorOri = A66ArtCorOri ;
            Z70ArtEncOri = A70ArtEncOri ;
            Z96ArtSua = A96ArtSua ;
            Z64ArtAcaQui = A64ArtAcaQui ;
            Z73ArtEti = A73ArtEti ;
            Z117ArtUrg = A117ArtUrg ;
            Z88ArtMer = A88ArtMer ;
            Z105ArtTra1 = A105ArtTra1 ;
            Z106ArtTra2 = A106ArtTra2 ;
            Z107ArtTra3 = A107ArtTra3 ;
            Z108ArtTraP1 = A108ArtTraP1 ;
            Z109ArtTraP2 = A109ArtTraP2 ;
            Z110ArtTraP3 = A110ArtTraP3 ;
            Z111ArtUrd1 = A111ArtUrd1 ;
            Z112ArtUrd2 = A112ArtUrd2 ;
            Z113ArtUrd3 = A113ArtUrd3 ;
            Z114ArtUrdP1 = A114ArtUrdP1 ;
            Z115ArtUrdP2 = A115ArtUrdP2 ;
            Z116ArtUrdP3 = A116ArtUrdP3 ;
            Z92ArtPreKgm = A92ArtPreKgm ;
            Z93ArtPreMtr = A93ArtPreMtr ;
            Z91ArtPreDef = A91ArtPreDef ;
            Z1229ArtEncCom = A1229ArtEncCom ;
            Z1230ArtEncAnh = A1230ArtEncAnh ;
            Z1903ArtGraAca = A1903ArtGraAca ;
            Z1905ArtRdoA = A1905ArtRdoA ;
            Z1904ArtRdoN = A1904ArtRdoN ;
            Z2791ArtFacAbs = A2791ArtFacAbs ;
            Z2834ArtPle2 = A2834ArtPle2 ;
            Z3121ArtNumCor = A3121ArtNumCor ;
            Z3122ArtAncSal1 = A3122ArtAncSal1 ;
            Z3123ArtAncSal2 = A3123ArtAncSal2 ;
            Z3124ArtAncSal3 = A3124ArtAncSal3 ;
            Z3125ArtGraAca2 = A3125ArtGraAca2 ;
            Z3126ArtGraCru2 = A3126ArtGraCru2 ;
            Z4297ArtPmPPza = A4297ArtPmPPza ;
            Z4607ArtRb = A4607ArtRb ;
            Z6660ArtFacTor = A6660ArtFacTor ;
            Z5741ArtComer = A5741ArtComer ;
            Z967ArtNMtr = A967ArtNMtr ;
            Z4353ArtUsrCod = A4353ArtUsrCod ;
            Z4354ArtFecMod = A4354ArtFecMod ;
            Z3683ArtFecCre = A3683ArtFecCre ;
            Z829TipArtCod = A829TipArtCod ;
            Z4295ClasCod = A4295ClasCod ;
         }
      }
      if ( GX_JID == -18 )
      {
         Z65ArtCod = A65ArtCod ;
         Z69ArtDsc = A69ArtDsc ;
         Z87ArtMat = A87ArtMat ;
         Z1148ArtPml = A1148ArtPml ;
         Z78ArtGraCru = A78ArtGraCru ;
         Z68ArtCruMin = A68ArtCruMin ;
         Z67ArtCruMax = A67ArtCruMax ;
         Z63ArtAcaMin = A63ArtAcaMin ;
         Z62ArtAcaMax = A62ArtAcaMax ;
         Z95ArtRen = A95ArtRen ;
         Z101ArtTipPle = A101ArtTipPle ;
         Z100ArtTipLar = A100ArtTipLar ;
         Z66ArtCorOri = A66ArtCorOri ;
         Z70ArtEncOri = A70ArtEncOri ;
         Z96ArtSua = A96ArtSua ;
         Z64ArtAcaQui = A64ArtAcaQui ;
         Z73ArtEti = A73ArtEti ;
         Z117ArtUrg = A117ArtUrg ;
         Z88ArtMer = A88ArtMer ;
         Z105ArtTra1 = A105ArtTra1 ;
         Z106ArtTra2 = A106ArtTra2 ;
         Z107ArtTra3 = A107ArtTra3 ;
         Z108ArtTraP1 = A108ArtTraP1 ;
         Z109ArtTraP2 = A109ArtTraP2 ;
         Z110ArtTraP3 = A110ArtTraP3 ;
         Z111ArtUrd1 = A111ArtUrd1 ;
         Z112ArtUrd2 = A112ArtUrd2 ;
         Z113ArtUrd3 = A113ArtUrd3 ;
         Z114ArtUrdP1 = A114ArtUrdP1 ;
         Z115ArtUrdP2 = A115ArtUrdP2 ;
         Z116ArtUrdP3 = A116ArtUrdP3 ;
         Z92ArtPreKgm = A92ArtPreKgm ;
         Z93ArtPreMtr = A93ArtPreMtr ;
         Z91ArtPreDef = A91ArtPreDef ;
         Z1229ArtEncCom = A1229ArtEncCom ;
         Z1230ArtEncAnh = A1230ArtEncAnh ;
         Z1903ArtGraAca = A1903ArtGraAca ;
         Z1905ArtRdoA = A1905ArtRdoA ;
         Z1904ArtRdoN = A1904ArtRdoN ;
         Z2791ArtFacAbs = A2791ArtFacAbs ;
         Z2834ArtPle2 = A2834ArtPle2 ;
         Z3121ArtNumCor = A3121ArtNumCor ;
         Z3122ArtAncSal1 = A3122ArtAncSal1 ;
         Z3123ArtAncSal2 = A3123ArtAncSal2 ;
         Z3124ArtAncSal3 = A3124ArtAncSal3 ;
         Z3125ArtGraAca2 = A3125ArtGraAca2 ;
         Z3126ArtGraCru2 = A3126ArtGraCru2 ;
         Z4297ArtPmPPza = A4297ArtPmPPza ;
         Z4607ArtRb = A4607ArtRb ;
         Z6660ArtFacTor = A6660ArtFacTor ;
         Z5741ArtComer = A5741ArtComer ;
         Z967ArtNMtr = A967ArtNMtr ;
         Z4353ArtUsrCod = A4353ArtUsrCod ;
         Z4354ArtFecMod = A4354ArtFecMod ;
         Z3683ArtFecCre = A3683ArtFecCre ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z829TipArtCod = A829TipArtCod ;
         Z4295ClasCod = A4295ClasCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z272CliEti = A272CliEti ;
         Z306CliUrg = A306CliUrg ;
         Z830TipArtDsc = A830TipArtDsc ;
         Z4608TipArtClas = A4608TipArtClas ;
         Z4296ClasDsc = A4296ClasDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
   }

   public void standaloneModal( )
   {
      if ( isIns( )  )
      {
         AV59Modo = httpContext.getMessage( httpContext.getMessage( "INS", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59Modo", AV59Modo);
      }
      else
      {
         if ( isUpd( )  )
         {
            AV59Modo = httpContext.getMessage( httpContext.getMessage( "UPD", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59Modo", AV59Modo);
         }
         else
         {
            if ( isDlt( )  )
            {
               AV59Modo = httpContext.getMessage( httpContext.getMessage( "DEL", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV59Modo", AV59Modo);
            }
         }
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
      if ( ( isUpd( )  || isDlt( )  ) && ( GXutil.strcmp(AV67Mode2, httpContext.getMessage( httpContext.getMessage( "INS", ""), "")) != 0 ) )
      {
         A65ArtCod = AV66ArtCod ;
         n65ArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
      if ( ( isUpd( )  || isDlt( )  ) && ( GXutil.strcmp(AV67Mode2, httpContext.getMessage( httpContext.getMessage( "INS", ""), "")) != 0 ) )
      {
         A252CliCod = AV65CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A66ArtCorOri)==0) && ( Gx_BScreen == 0 ) )
      {
         A66ArtCorOri = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n66ArtCorOri = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A66ArtCorOri", A66ArtCorOri);
      }
      if ( isIns( )  && (GXutil.strcmp("", A70ArtEncOri)==0) && ( Gx_BScreen == 0 ) )
      {
         A70ArtEncOri = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n70ArtEncOri = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A70ArtEncOri", A70ArtEncOri);
      }
      if ( isIns( )  && (GXutil.strcmp("", A5741ArtComer)==0) && ( Gx_BScreen == 0 ) )
      {
         A5741ArtComer = "*" ;
         n5741ArtComer = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5741ArtComer", A5741ArtComer);
      }
      if ( isIns( )  && (GXutil.strcmp("", A967ArtNMtr)==0) && ( Gx_BScreen == 0 ) )
      {
         A967ArtNMtr = "*" ;
         n967ArtNMtr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A967ArtNMtr", A967ArtNMtr);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A3683ArtFecCre)) && ( Gx_BScreen == 0 ) )
      {
         A3683ArtFecCre = Gx_date ;
         n3683ArtFecCre = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3683ArtFecCre", localUtil.format(A3683ArtFecCre, "99/99/99"));
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
      }
   }

   public void loadLP10( )
   {
      /* Using cursor T00LP8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A69ArtDsc = T00LP8_A69ArtDsc[0] ;
         n69ArtDsc = T00LP8_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A279CliNom = T00LP8_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A407EmprNom = T00LP8_A407EmprNom[0] ;
         n407EmprNom = T00LP8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A87ArtMat = T00LP8_A87ArtMat[0] ;
         n87ArtMat = T00LP8_n87ArtMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A87ArtMat", A87ArtMat);
         A830TipArtDsc = T00LP8_A830TipArtDsc[0] ;
         n830TipArtDsc = T00LP8_n830TipArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A830TipArtDsc", A830TipArtDsc);
         A1148ArtPml = T00LP8_A1148ArtPml[0] ;
         n1148ArtPml = T00LP8_n1148ArtPml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1148ArtPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1148ArtPml), 4, 0));
         A78ArtGraCru = T00LP8_A78ArtGraCru[0] ;
         n78ArtGraCru = T00LP8_n78ArtGraCru[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A78ArtGraCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A78ArtGraCru), 4, 0));
         A68ArtCruMin = T00LP8_A68ArtCruMin[0] ;
         n68ArtCruMin = T00LP8_n68ArtCruMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A68ArtCruMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A68ArtCruMin), 3, 0));
         A67ArtCruMax = T00LP8_A67ArtCruMax[0] ;
         n67ArtCruMax = T00LP8_n67ArtCruMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A67ArtCruMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A67ArtCruMax), 3, 0));
         A63ArtAcaMin = T00LP8_A63ArtAcaMin[0] ;
         n63ArtAcaMin = T00LP8_n63ArtAcaMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63ArtAcaMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A63ArtAcaMin), 3, 0));
         A62ArtAcaMax = T00LP8_A62ArtAcaMax[0] ;
         n62ArtAcaMax = T00LP8_n62ArtAcaMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A62ArtAcaMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A62ArtAcaMax), 3, 0));
         A95ArtRen = T00LP8_A95ArtRen[0] ;
         n95ArtRen = T00LP8_n95ArtRen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A95ArtRen", GXutil.ltrimstr( A95ArtRen, 6, 2));
         A101ArtTipPle = T00LP8_A101ArtTipPle[0] ;
         n101ArtTipPle = T00LP8_n101ArtTipPle[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A101ArtTipPle", A101ArtTipPle);
         A100ArtTipLar = T00LP8_A100ArtTipLar[0] ;
         n100ArtTipLar = T00LP8_n100ArtTipLar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A100ArtTipLar", A100ArtTipLar);
         A66ArtCorOri = T00LP8_A66ArtCorOri[0] ;
         n66ArtCorOri = T00LP8_n66ArtCorOri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66ArtCorOri", A66ArtCorOri);
         A70ArtEncOri = T00LP8_A70ArtEncOri[0] ;
         n70ArtEncOri = T00LP8_n70ArtEncOri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A70ArtEncOri", A70ArtEncOri);
         A96ArtSua = T00LP8_A96ArtSua[0] ;
         n96ArtSua = T00LP8_n96ArtSua[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A96ArtSua", A96ArtSua);
         A64ArtAcaQui = T00LP8_A64ArtAcaQui[0] ;
         n64ArtAcaQui = T00LP8_n64ArtAcaQui[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A64ArtAcaQui", A64ArtAcaQui);
         A73ArtEti = T00LP8_A73ArtEti[0] ;
         n73ArtEti = T00LP8_n73ArtEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A73ArtEti", A73ArtEti);
         A272CliEti = T00LP8_A272CliEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A272CliEti", A272CliEti);
         A306CliUrg = T00LP8_A306CliUrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A306CliUrg", GXutil.str( A306CliUrg, 1, 0));
         A117ArtUrg = T00LP8_A117ArtUrg[0] ;
         n117ArtUrg = T00LP8_n117ArtUrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A117ArtUrg", GXutil.str( A117ArtUrg, 1, 0));
         A88ArtMer = T00LP8_A88ArtMer[0] ;
         n88ArtMer = T00LP8_n88ArtMer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A88ArtMer", GXutil.ltrimstr( A88ArtMer, 5, 2));
         A105ArtTra1 = T00LP8_A105ArtTra1[0] ;
         n105ArtTra1 = T00LP8_n105ArtTra1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A105ArtTra1", A105ArtTra1);
         A106ArtTra2 = T00LP8_A106ArtTra2[0] ;
         n106ArtTra2 = T00LP8_n106ArtTra2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A106ArtTra2", A106ArtTra2);
         A107ArtTra3 = T00LP8_A107ArtTra3[0] ;
         n107ArtTra3 = T00LP8_n107ArtTra3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A107ArtTra3", A107ArtTra3);
         A108ArtTraP1 = T00LP8_A108ArtTraP1[0] ;
         n108ArtTraP1 = T00LP8_n108ArtTraP1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A108ArtTraP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A108ArtTraP1), 3, 0));
         A109ArtTraP2 = T00LP8_A109ArtTraP2[0] ;
         n109ArtTraP2 = T00LP8_n109ArtTraP2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A109ArtTraP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A109ArtTraP2), 3, 0));
         A110ArtTraP3 = T00LP8_A110ArtTraP3[0] ;
         n110ArtTraP3 = T00LP8_n110ArtTraP3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A110ArtTraP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A110ArtTraP3), 3, 0));
         A111ArtUrd1 = T00LP8_A111ArtUrd1[0] ;
         n111ArtUrd1 = T00LP8_n111ArtUrd1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A111ArtUrd1", A111ArtUrd1);
         A112ArtUrd2 = T00LP8_A112ArtUrd2[0] ;
         n112ArtUrd2 = T00LP8_n112ArtUrd2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A112ArtUrd2", A112ArtUrd2);
         A113ArtUrd3 = T00LP8_A113ArtUrd3[0] ;
         n113ArtUrd3 = T00LP8_n113ArtUrd3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A113ArtUrd3", A113ArtUrd3);
         A114ArtUrdP1 = T00LP8_A114ArtUrdP1[0] ;
         n114ArtUrdP1 = T00LP8_n114ArtUrdP1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A114ArtUrdP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A114ArtUrdP1), 3, 0));
         A115ArtUrdP2 = T00LP8_A115ArtUrdP2[0] ;
         n115ArtUrdP2 = T00LP8_n115ArtUrdP2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A115ArtUrdP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A115ArtUrdP2), 3, 0));
         A116ArtUrdP3 = T00LP8_A116ArtUrdP3[0] ;
         n116ArtUrdP3 = T00LP8_n116ArtUrdP3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A116ArtUrdP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A116ArtUrdP3), 3, 0));
         A92ArtPreKgm = T00LP8_A92ArtPreKgm[0] ;
         n92ArtPreKgm = T00LP8_n92ArtPreKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A92ArtPreKgm", GXutil.ltrimstr( A92ArtPreKgm, 13, 5));
         A93ArtPreMtr = T00LP8_A93ArtPreMtr[0] ;
         n93ArtPreMtr = T00LP8_n93ArtPreMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A93ArtPreMtr", GXutil.ltrimstr( A93ArtPreMtr, 13, 5));
         A91ArtPreDef = T00LP8_A91ArtPreDef[0] ;
         n91ArtPreDef = T00LP8_n91ArtPreDef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A91ArtPreDef", A91ArtPreDef);
         A1229ArtEncCom = T00LP8_A1229ArtEncCom[0] ;
         n1229ArtEncCom = T00LP8_n1229ArtEncCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1229ArtEncCom", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1229ArtEncCom), 4, 0));
         A1230ArtEncAnh = T00LP8_A1230ArtEncAnh[0] ;
         n1230ArtEncAnh = T00LP8_n1230ArtEncAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1230ArtEncAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1230ArtEncAnh), 4, 0));
         A1903ArtGraAca = T00LP8_A1903ArtGraAca[0] ;
         n1903ArtGraAca = T00LP8_n1903ArtGraAca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1903ArtGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1903ArtGraAca), 4, 0));
         A1905ArtRdoA = T00LP8_A1905ArtRdoA[0] ;
         n1905ArtRdoA = T00LP8_n1905ArtRdoA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1905ArtRdoA", GXutil.ltrimstr( A1905ArtRdoA, 6, 2));
         A1904ArtRdoN = T00LP8_A1904ArtRdoN[0] ;
         n1904ArtRdoN = T00LP8_n1904ArtRdoN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1904ArtRdoN", GXutil.ltrimstr( A1904ArtRdoN, 6, 2));
         A2791ArtFacAbs = T00LP8_A2791ArtFacAbs[0] ;
         n2791ArtFacAbs = T00LP8_n2791ArtFacAbs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2791ArtFacAbs", GXutil.ltrimstr( A2791ArtFacAbs, 6, 2));
         A2834ArtPle2 = T00LP8_A2834ArtPle2[0] ;
         n2834ArtPle2 = T00LP8_n2834ArtPle2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2834ArtPle2", A2834ArtPle2);
         A3121ArtNumCor = T00LP8_A3121ArtNumCor[0] ;
         n3121ArtNumCor = T00LP8_n3121ArtNumCor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3121ArtNumCor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3121ArtNumCor), 4, 0));
         A3122ArtAncSal1 = T00LP8_A3122ArtAncSal1[0] ;
         n3122ArtAncSal1 = T00LP8_n3122ArtAncSal1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3122ArtAncSal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3122ArtAncSal1), 4, 0));
         A3123ArtAncSal2 = T00LP8_A3123ArtAncSal2[0] ;
         n3123ArtAncSal2 = T00LP8_n3123ArtAncSal2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3123ArtAncSal2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3123ArtAncSal2), 4, 0));
         A3124ArtAncSal3 = T00LP8_A3124ArtAncSal3[0] ;
         n3124ArtAncSal3 = T00LP8_n3124ArtAncSal3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3124ArtAncSal3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3124ArtAncSal3), 4, 0));
         A3125ArtGraAca2 = T00LP8_A3125ArtGraAca2[0] ;
         n3125ArtGraAca2 = T00LP8_n3125ArtGraAca2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3125ArtGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3125ArtGraAca2), 4, 0));
         A3126ArtGraCru2 = T00LP8_A3126ArtGraCru2[0] ;
         n3126ArtGraCru2 = T00LP8_n3126ArtGraCru2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3126ArtGraCru2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3126ArtGraCru2), 4, 0));
         A4297ArtPmPPza = T00LP8_A4297ArtPmPPza[0] ;
         n4297ArtPmPPza = T00LP8_n4297ArtPmPPza[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4297ArtPmPPza", GXutil.ltrimstr( A4297ArtPmPPza, 9, 2));
         A4607ArtRb = T00LP8_A4607ArtRb[0] ;
         n4607ArtRb = T00LP8_n4607ArtRb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4607ArtRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4607ArtRb), 4, 0));
         A4608TipArtClas = T00LP8_A4608TipArtClas[0] ;
         n4608TipArtClas = T00LP8_n4608TipArtClas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4608TipArtClas", A4608TipArtClas);
         A4296ClasDsc = T00LP8_A4296ClasDsc[0] ;
         n4296ClasDsc = T00LP8_n4296ClasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4296ClasDsc", A4296ClasDsc);
         A6660ArtFacTor = T00LP8_A6660ArtFacTor[0] ;
         n6660ArtFacTor = T00LP8_n6660ArtFacTor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6660ArtFacTor", GXutil.ltrimstr( A6660ArtFacTor, 6, 2));
         A5741ArtComer = T00LP8_A5741ArtComer[0] ;
         n5741ArtComer = T00LP8_n5741ArtComer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5741ArtComer", A5741ArtComer);
         A967ArtNMtr = T00LP8_A967ArtNMtr[0] ;
         n967ArtNMtr = T00LP8_n967ArtNMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A967ArtNMtr", A967ArtNMtr);
         A4353ArtUsrCod = T00LP8_A4353ArtUsrCod[0] ;
         n4353ArtUsrCod = T00LP8_n4353ArtUsrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4353ArtUsrCod", A4353ArtUsrCod);
         A4354ArtFecMod = T00LP8_A4354ArtFecMod[0] ;
         n4354ArtFecMod = T00LP8_n4354ArtFecMod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4354ArtFecMod", localUtil.format(A4354ArtFecMod, "99/99/9999"));
         A3683ArtFecCre = T00LP8_A3683ArtFecCre[0] ;
         n3683ArtFecCre = T00LP8_n3683ArtFecCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3683ArtFecCre", localUtil.format(A3683ArtFecCre, "99/99/99"));
         A829TipArtCod = T00LP8_A829TipArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
         A4295ClasCod = T00LP8_A4295ClasCod[0] ;
         n4295ClasCod = T00LP8_n4295ClasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
         zmLP10( -18) ;
      }
      pr_default.close(6);
      onLoadActionsLP10( ) ;
   }

   public void onLoadActionsLP10( )
   {
      if ( ( A4295ClasCod > 0 ) && true /* After */ && isIns( )  )
      {
         A69ArtDsc = A4296ClasDsc ;
         n69ArtDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      }
      if ( isIns( )  && (0==A117ArtUrg) && ( Gx_BScreen == 0 ) )
      {
         A117ArtUrg = A306CliUrg ;
         n117ArtUrg = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A117ArtUrg", GXutil.str( A117ArtUrg, 1, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A73ArtEti)==0) && ( Gx_BScreen == 0 ) )
      {
         A73ArtEti = A272CliEti ;
         n73ArtEti = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A73ArtEti", A73ArtEti);
      }
   }

   public void checkExtendedTableLP10( )
   {
      nIsDirty_10 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T00LP4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00LP4_A407EmprNom[0] ;
      n407EmprNom = T00LP4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T00LP6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A829TipArtCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPART", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A830TipArtDsc = T00LP6_A830TipArtDsc[0] ;
      n830TipArtDsc = T00LP6_n830TipArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A830TipArtDsc", A830TipArtDsc);
      A4608TipArtClas = T00LP6_A4608TipArtClas[0] ;
      n4608TipArtClas = T00LP6_n4608TipArtClas[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4608TipArtClas", A4608TipArtClas);
      pr_default.close(4);
      /* Using cursor T00LP7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A4295ClasCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLAPEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLASCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A4296ClasDsc = T00LP7_A4296ClasDsc[0] ;
      n4296ClasDsc = T00LP7_n4296ClasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4296ClasDsc", A4296ClasDsc);
      pr_default.close(5);
      /* Using cursor T00LP5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T00LP5_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A272CliEti = T00LP5_A272CliEti[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A272CliEti", A272CliEti);
      A306CliUrg = T00LP5_A306CliUrg[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A306CliUrg", GXutil.str( A306CliUrg, 1, 0));
      pr_default.close(3);
      if ( ! ( ( GXutil.strcmp(A66ArtCorOri, "S") == 0 ) || ( GXutil.strcmp(A66ArtCorOri, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Cortar Orillos", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ARTCORORI");
         AnyError = (short)(1) ;
         GX_FocusControl = chkArtCorOri.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A70ArtEncOri, "S") == 0 ) || ( GXutil.strcmp(A70ArtEncOri, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Encolar Orillos", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ARTENCORI");
         AnyError = (short)(1) ;
         GX_FocusControl = chkArtEncOri.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A4295ClasCod > 0 ) && true /* After */ && isIns( )  )
      {
         nIsDirty_10 = (short)(1) ;
         A69ArtDsc = A4296ClasDsc ;
         n69ArtDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      }
      if ( isIns( )  && (0==A117ArtUrg) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_10 = (short)(1) ;
         A117ArtUrg = A306CliUrg ;
         n117ArtUrg = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A117ArtUrg", GXutil.str( A117ArtUrg, 1, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A73ArtEti)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_10 = (short)(1) ;
         A73ArtEti = A272CliEti ;
         n73ArtEti = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A73ArtEti", A73ArtEti);
      }
      if ( ! ( ( GXutil.strcmp(A73ArtEti, "S") == 0 ) || ( GXutil.strcmp(A73ArtEti, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Etiquetas", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ARTETI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtEti_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( ( A117ArtUrg >= 0 ) && ( A117ArtUrg <= 9 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Urgencia", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ARTURG");
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtUrg_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsLP10( )
   {
      pr_default.close(2);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_19( String A396EmprCod )
   {
      /* Using cursor T00LP9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00LP9_A407EmprNom[0] ;
      n407EmprNom = T00LP9_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_21( String A396EmprCod ,
                          short A829TipArtCod )
   {
      /* Using cursor T00LP10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Short.valueOf(A829TipArtCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPART", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A830TipArtDsc = T00LP10_A830TipArtDsc[0] ;
      n830TipArtDsc = T00LP10_n830TipArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A830TipArtDsc", A830TipArtDsc);
      A4608TipArtClas = T00LP10_A4608TipArtClas[0] ;
      n4608TipArtClas = T00LP10_n4608TipArtClas[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4608TipArtClas", A4608TipArtClas);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A830TipArtDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4608TipArtClas))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_22( String A396EmprCod ,
                          short A4295ClasCod )
   {
      /* Using cursor T00LP11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A4295ClasCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLAPEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLASCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A4296ClasDsc = T00LP11_A4296ClasDsc[0] ;
      n4296ClasDsc = T00LP11_n4296ClasDsc[0] ;
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

   public void gxload_20( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T00LP12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T00LP12_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A272CliEti = T00LP12_A272CliEti[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A272CliEti", A272CliEti);
      A306CliUrg = T00LP12_A306CliUrg[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A306CliUrg", GXutil.str( A306CliUrg, 1, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A272CliEti))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A306CliUrg, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKeyLP10( )
   {
      /* Using cursor T00LP13 */
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
      /* Using cursor T00LP3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmLP10( 18) ;
         RcdFound10 = (short)(1) ;
         A65ArtCod = T00LP3_A65ArtCod[0] ;
         n65ArtCod = T00LP3_n65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A69ArtDsc = T00LP3_A69ArtDsc[0] ;
         n69ArtDsc = T00LP3_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A87ArtMat = T00LP3_A87ArtMat[0] ;
         n87ArtMat = T00LP3_n87ArtMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A87ArtMat", A87ArtMat);
         A1148ArtPml = T00LP3_A1148ArtPml[0] ;
         n1148ArtPml = T00LP3_n1148ArtPml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1148ArtPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1148ArtPml), 4, 0));
         A78ArtGraCru = T00LP3_A78ArtGraCru[0] ;
         n78ArtGraCru = T00LP3_n78ArtGraCru[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A78ArtGraCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A78ArtGraCru), 4, 0));
         A68ArtCruMin = T00LP3_A68ArtCruMin[0] ;
         n68ArtCruMin = T00LP3_n68ArtCruMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A68ArtCruMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A68ArtCruMin), 3, 0));
         A67ArtCruMax = T00LP3_A67ArtCruMax[0] ;
         n67ArtCruMax = T00LP3_n67ArtCruMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A67ArtCruMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A67ArtCruMax), 3, 0));
         A63ArtAcaMin = T00LP3_A63ArtAcaMin[0] ;
         n63ArtAcaMin = T00LP3_n63ArtAcaMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63ArtAcaMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A63ArtAcaMin), 3, 0));
         A62ArtAcaMax = T00LP3_A62ArtAcaMax[0] ;
         n62ArtAcaMax = T00LP3_n62ArtAcaMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A62ArtAcaMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A62ArtAcaMax), 3, 0));
         A95ArtRen = T00LP3_A95ArtRen[0] ;
         n95ArtRen = T00LP3_n95ArtRen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A95ArtRen", GXutil.ltrimstr( A95ArtRen, 6, 2));
         A101ArtTipPle = T00LP3_A101ArtTipPle[0] ;
         n101ArtTipPle = T00LP3_n101ArtTipPle[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A101ArtTipPle", A101ArtTipPle);
         A100ArtTipLar = T00LP3_A100ArtTipLar[0] ;
         n100ArtTipLar = T00LP3_n100ArtTipLar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A100ArtTipLar", A100ArtTipLar);
         A66ArtCorOri = T00LP3_A66ArtCorOri[0] ;
         n66ArtCorOri = T00LP3_n66ArtCorOri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A66ArtCorOri", A66ArtCorOri);
         A70ArtEncOri = T00LP3_A70ArtEncOri[0] ;
         n70ArtEncOri = T00LP3_n70ArtEncOri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A70ArtEncOri", A70ArtEncOri);
         A96ArtSua = T00LP3_A96ArtSua[0] ;
         n96ArtSua = T00LP3_n96ArtSua[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A96ArtSua", A96ArtSua);
         A64ArtAcaQui = T00LP3_A64ArtAcaQui[0] ;
         n64ArtAcaQui = T00LP3_n64ArtAcaQui[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A64ArtAcaQui", A64ArtAcaQui);
         A73ArtEti = T00LP3_A73ArtEti[0] ;
         n73ArtEti = T00LP3_n73ArtEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A73ArtEti", A73ArtEti);
         A117ArtUrg = T00LP3_A117ArtUrg[0] ;
         n117ArtUrg = T00LP3_n117ArtUrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A117ArtUrg", GXutil.str( A117ArtUrg, 1, 0));
         A88ArtMer = T00LP3_A88ArtMer[0] ;
         n88ArtMer = T00LP3_n88ArtMer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A88ArtMer", GXutil.ltrimstr( A88ArtMer, 5, 2));
         A105ArtTra1 = T00LP3_A105ArtTra1[0] ;
         n105ArtTra1 = T00LP3_n105ArtTra1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A105ArtTra1", A105ArtTra1);
         A106ArtTra2 = T00LP3_A106ArtTra2[0] ;
         n106ArtTra2 = T00LP3_n106ArtTra2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A106ArtTra2", A106ArtTra2);
         A107ArtTra3 = T00LP3_A107ArtTra3[0] ;
         n107ArtTra3 = T00LP3_n107ArtTra3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A107ArtTra3", A107ArtTra3);
         A108ArtTraP1 = T00LP3_A108ArtTraP1[0] ;
         n108ArtTraP1 = T00LP3_n108ArtTraP1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A108ArtTraP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A108ArtTraP1), 3, 0));
         A109ArtTraP2 = T00LP3_A109ArtTraP2[0] ;
         n109ArtTraP2 = T00LP3_n109ArtTraP2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A109ArtTraP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A109ArtTraP2), 3, 0));
         A110ArtTraP3 = T00LP3_A110ArtTraP3[0] ;
         n110ArtTraP3 = T00LP3_n110ArtTraP3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A110ArtTraP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A110ArtTraP3), 3, 0));
         A111ArtUrd1 = T00LP3_A111ArtUrd1[0] ;
         n111ArtUrd1 = T00LP3_n111ArtUrd1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A111ArtUrd1", A111ArtUrd1);
         A112ArtUrd2 = T00LP3_A112ArtUrd2[0] ;
         n112ArtUrd2 = T00LP3_n112ArtUrd2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A112ArtUrd2", A112ArtUrd2);
         A113ArtUrd3 = T00LP3_A113ArtUrd3[0] ;
         n113ArtUrd3 = T00LP3_n113ArtUrd3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A113ArtUrd3", A113ArtUrd3);
         A114ArtUrdP1 = T00LP3_A114ArtUrdP1[0] ;
         n114ArtUrdP1 = T00LP3_n114ArtUrdP1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A114ArtUrdP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A114ArtUrdP1), 3, 0));
         A115ArtUrdP2 = T00LP3_A115ArtUrdP2[0] ;
         n115ArtUrdP2 = T00LP3_n115ArtUrdP2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A115ArtUrdP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A115ArtUrdP2), 3, 0));
         A116ArtUrdP3 = T00LP3_A116ArtUrdP3[0] ;
         n116ArtUrdP3 = T00LP3_n116ArtUrdP3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A116ArtUrdP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A116ArtUrdP3), 3, 0));
         A92ArtPreKgm = T00LP3_A92ArtPreKgm[0] ;
         n92ArtPreKgm = T00LP3_n92ArtPreKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A92ArtPreKgm", GXutil.ltrimstr( A92ArtPreKgm, 13, 5));
         A93ArtPreMtr = T00LP3_A93ArtPreMtr[0] ;
         n93ArtPreMtr = T00LP3_n93ArtPreMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A93ArtPreMtr", GXutil.ltrimstr( A93ArtPreMtr, 13, 5));
         A91ArtPreDef = T00LP3_A91ArtPreDef[0] ;
         n91ArtPreDef = T00LP3_n91ArtPreDef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A91ArtPreDef", A91ArtPreDef);
         A1229ArtEncCom = T00LP3_A1229ArtEncCom[0] ;
         n1229ArtEncCom = T00LP3_n1229ArtEncCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1229ArtEncCom", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1229ArtEncCom), 4, 0));
         A1230ArtEncAnh = T00LP3_A1230ArtEncAnh[0] ;
         n1230ArtEncAnh = T00LP3_n1230ArtEncAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1230ArtEncAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1230ArtEncAnh), 4, 0));
         A1903ArtGraAca = T00LP3_A1903ArtGraAca[0] ;
         n1903ArtGraAca = T00LP3_n1903ArtGraAca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1903ArtGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1903ArtGraAca), 4, 0));
         A1905ArtRdoA = T00LP3_A1905ArtRdoA[0] ;
         n1905ArtRdoA = T00LP3_n1905ArtRdoA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1905ArtRdoA", GXutil.ltrimstr( A1905ArtRdoA, 6, 2));
         A1904ArtRdoN = T00LP3_A1904ArtRdoN[0] ;
         n1904ArtRdoN = T00LP3_n1904ArtRdoN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1904ArtRdoN", GXutil.ltrimstr( A1904ArtRdoN, 6, 2));
         A2791ArtFacAbs = T00LP3_A2791ArtFacAbs[0] ;
         n2791ArtFacAbs = T00LP3_n2791ArtFacAbs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2791ArtFacAbs", GXutil.ltrimstr( A2791ArtFacAbs, 6, 2));
         A2834ArtPle2 = T00LP3_A2834ArtPle2[0] ;
         n2834ArtPle2 = T00LP3_n2834ArtPle2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2834ArtPle2", A2834ArtPle2);
         A3121ArtNumCor = T00LP3_A3121ArtNumCor[0] ;
         n3121ArtNumCor = T00LP3_n3121ArtNumCor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3121ArtNumCor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3121ArtNumCor), 4, 0));
         A3122ArtAncSal1 = T00LP3_A3122ArtAncSal1[0] ;
         n3122ArtAncSal1 = T00LP3_n3122ArtAncSal1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3122ArtAncSal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3122ArtAncSal1), 4, 0));
         A3123ArtAncSal2 = T00LP3_A3123ArtAncSal2[0] ;
         n3123ArtAncSal2 = T00LP3_n3123ArtAncSal2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3123ArtAncSal2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3123ArtAncSal2), 4, 0));
         A3124ArtAncSal3 = T00LP3_A3124ArtAncSal3[0] ;
         n3124ArtAncSal3 = T00LP3_n3124ArtAncSal3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3124ArtAncSal3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3124ArtAncSal3), 4, 0));
         A3125ArtGraAca2 = T00LP3_A3125ArtGraAca2[0] ;
         n3125ArtGraAca2 = T00LP3_n3125ArtGraAca2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3125ArtGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3125ArtGraAca2), 4, 0));
         A3126ArtGraCru2 = T00LP3_A3126ArtGraCru2[0] ;
         n3126ArtGraCru2 = T00LP3_n3126ArtGraCru2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3126ArtGraCru2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3126ArtGraCru2), 4, 0));
         A4297ArtPmPPza = T00LP3_A4297ArtPmPPza[0] ;
         n4297ArtPmPPza = T00LP3_n4297ArtPmPPza[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4297ArtPmPPza", GXutil.ltrimstr( A4297ArtPmPPza, 9, 2));
         A4607ArtRb = T00LP3_A4607ArtRb[0] ;
         n4607ArtRb = T00LP3_n4607ArtRb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4607ArtRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4607ArtRb), 4, 0));
         A6660ArtFacTor = T00LP3_A6660ArtFacTor[0] ;
         n6660ArtFacTor = T00LP3_n6660ArtFacTor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6660ArtFacTor", GXutil.ltrimstr( A6660ArtFacTor, 6, 2));
         A5741ArtComer = T00LP3_A5741ArtComer[0] ;
         n5741ArtComer = T00LP3_n5741ArtComer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5741ArtComer", A5741ArtComer);
         A967ArtNMtr = T00LP3_A967ArtNMtr[0] ;
         n967ArtNMtr = T00LP3_n967ArtNMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A967ArtNMtr", A967ArtNMtr);
         A4353ArtUsrCod = T00LP3_A4353ArtUsrCod[0] ;
         n4353ArtUsrCod = T00LP3_n4353ArtUsrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4353ArtUsrCod", A4353ArtUsrCod);
         A4354ArtFecMod = T00LP3_A4354ArtFecMod[0] ;
         n4354ArtFecMod = T00LP3_n4354ArtFecMod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4354ArtFecMod", localUtil.format(A4354ArtFecMod, "99/99/9999"));
         A3683ArtFecCre = T00LP3_A3683ArtFecCre[0] ;
         n3683ArtFecCre = T00LP3_n3683ArtFecCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3683ArtFecCre", localUtil.format(A3683ArtFecCre, "99/99/99"));
         A396EmprCod = T00LP3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T00LP3_A252CliCod[0] ;
         n252CliCod = T00LP3_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A829TipArtCod = T00LP3_A829TipArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
         A4295ClasCod = T00LP3_A4295ClasCod[0] ;
         n4295ClasCod = T00LP3_n4295ClasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadLP10( ) ;
         if ( AnyError == 1 )
         {
            RcdFound10 = (short)(0) ;
            initializeNonKeyLP10( ) ;
         }
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound10 = (short)(0) ;
         initializeNonKeyLP10( ) ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKeyLP10( ) ;
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
      /* Using cursor T00LP14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T00LP14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00LP14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00LP14_A252CliCod[0] < A252CliCod ) || ( T00LP14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00LP14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00LP14_A65ArtCod[0], A65ArtCod) < 0 ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T00LP14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00LP14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00LP14_A252CliCod[0] > A252CliCod ) || ( T00LP14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00LP14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00LP14_A65ArtCod[0], A65ArtCod) > 0 ) ) )
         {
            A396EmprCod = T00LP14_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T00LP14_A252CliCod[0] ;
            n252CliCod = T00LP14_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T00LP14_A65ArtCod[0] ;
            n65ArtCod = T00LP14_n65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound10 = (short)(0) ;
      /* Using cursor T00LP15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T00LP15_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00LP15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00LP15_A252CliCod[0] > A252CliCod ) || ( T00LP15_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00LP15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00LP15_A65ArtCod[0], A65ArtCod) > 0 ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T00LP15_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00LP15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00LP15_A252CliCod[0] < A252CliCod ) || ( T00LP15_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00LP15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00LP15_A65ArtCod[0], A65ArtCod) < 0 ) ) )
         {
            A396EmprCod = T00LP15_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T00LP15_A252CliCod[0] ;
            n252CliCod = T00LP15_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T00LP15_A65ArtCod[0] ;
            n65ArtCod = T00LP15_n65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyLP10( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertLP10( ) ;
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
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateLP10( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
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
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertLP10( ) ;
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
                  insertLP10( ) ;
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
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
      getKeyLP10( ) ;
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
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tarticl");
      GX_FocusControl = edtArtMat_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_LP0( ) ;
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
      GX_FocusControl = edtArtMat_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartLP10( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArtMat_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndLP10( ) ;
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
      GX_FocusControl = edtArtMat_Internalname ;
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
      GX_FocusControl = edtArtMat_Internalname ;
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
      scanStartLP10( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound10 != 0 )
         {
            scanNextLP10( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtArtMat_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndLP10( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyLP10( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00LP2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTICU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z69ArtDsc, T00LP2_A69ArtDsc[0]) != 0 ) || ( GXutil.strcmp(Z87ArtMat, T00LP2_A87ArtMat[0]) != 0 ) || ( Z1148ArtPml != T00LP2_A1148ArtPml[0] ) || ( Z78ArtGraCru != T00LP2_A78ArtGraCru[0] ) || ( Z68ArtCruMin != T00LP2_A68ArtCruMin[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z67ArtCruMax != T00LP2_A67ArtCruMax[0] ) || ( Z63ArtAcaMin != T00LP2_A63ArtAcaMin[0] ) || ( Z62ArtAcaMax != T00LP2_A62ArtAcaMax[0] ) || ( DecimalUtil.compareTo(Z95ArtRen, T00LP2_A95ArtRen[0]) != 0 ) || ( GXutil.strcmp(Z101ArtTipPle, T00LP2_A101ArtTipPle[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z100ArtTipLar, T00LP2_A100ArtTipLar[0]) != 0 ) || ( GXutil.strcmp(Z66ArtCorOri, T00LP2_A66ArtCorOri[0]) != 0 ) || ( GXutil.strcmp(Z70ArtEncOri, T00LP2_A70ArtEncOri[0]) != 0 ) || ( GXutil.strcmp(Z96ArtSua, T00LP2_A96ArtSua[0]) != 0 ) || ( GXutil.strcmp(Z64ArtAcaQui, T00LP2_A64ArtAcaQui[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z73ArtEti, T00LP2_A73ArtEti[0]) != 0 ) || ( Z117ArtUrg != T00LP2_A117ArtUrg[0] ) || ( DecimalUtil.compareTo(Z88ArtMer, T00LP2_A88ArtMer[0]) != 0 ) || ( GXutil.strcmp(Z105ArtTra1, T00LP2_A105ArtTra1[0]) != 0 ) || ( GXutil.strcmp(Z106ArtTra2, T00LP2_A106ArtTra2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z107ArtTra3, T00LP2_A107ArtTra3[0]) != 0 ) || ( Z108ArtTraP1 != T00LP2_A108ArtTraP1[0] ) || ( Z109ArtTraP2 != T00LP2_A109ArtTraP2[0] ) || ( Z110ArtTraP3 != T00LP2_A110ArtTraP3[0] ) || ( GXutil.strcmp(Z111ArtUrd1, T00LP2_A111ArtUrd1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z112ArtUrd2, T00LP2_A112ArtUrd2[0]) != 0 ) || ( GXutil.strcmp(Z113ArtUrd3, T00LP2_A113ArtUrd3[0]) != 0 ) || ( Z114ArtUrdP1 != T00LP2_A114ArtUrdP1[0] ) || ( Z115ArtUrdP2 != T00LP2_A115ArtUrdP2[0] ) || ( Z116ArtUrdP3 != T00LP2_A116ArtUrdP3[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z92ArtPreKgm, T00LP2_A92ArtPreKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z93ArtPreMtr, T00LP2_A93ArtPreMtr[0]) != 0 ) || ( GXutil.strcmp(Z91ArtPreDef, T00LP2_A91ArtPreDef[0]) != 0 ) || ( Z1229ArtEncCom != T00LP2_A1229ArtEncCom[0] ) || ( Z1230ArtEncAnh != T00LP2_A1230ArtEncAnh[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1903ArtGraAca != T00LP2_A1903ArtGraAca[0] ) || ( DecimalUtil.compareTo(Z1905ArtRdoA, T00LP2_A1905ArtRdoA[0]) != 0 ) || ( DecimalUtil.compareTo(Z1904ArtRdoN, T00LP2_A1904ArtRdoN[0]) != 0 ) || ( DecimalUtil.compareTo(Z2791ArtFacAbs, T00LP2_A2791ArtFacAbs[0]) != 0 ) || ( GXutil.strcmp(Z2834ArtPle2, T00LP2_A2834ArtPle2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3121ArtNumCor != T00LP2_A3121ArtNumCor[0] ) || ( Z3122ArtAncSal1 != T00LP2_A3122ArtAncSal1[0] ) || ( Z3123ArtAncSal2 != T00LP2_A3123ArtAncSal2[0] ) || ( Z3124ArtAncSal3 != T00LP2_A3124ArtAncSal3[0] ) || ( Z3125ArtGraAca2 != T00LP2_A3125ArtGraAca2[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3126ArtGraCru2 != T00LP2_A3126ArtGraCru2[0] ) || ( DecimalUtil.compareTo(Z4297ArtPmPPza, T00LP2_A4297ArtPmPPza[0]) != 0 ) || ( Z4607ArtRb != T00LP2_A4607ArtRb[0] ) || ( DecimalUtil.compareTo(Z6660ArtFacTor, T00LP2_A6660ArtFacTor[0]) != 0 ) || ( GXutil.strcmp(Z5741ArtComer, T00LP2_A5741ArtComer[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z967ArtNMtr, T00LP2_A967ArtNMtr[0]) != 0 ) || ( GXutil.strcmp(Z4353ArtUsrCod, T00LP2_A4353ArtUsrCod[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z4354ArtFecMod), GXutil.resetTime(T00LP2_A4354ArtFecMod[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z3683ArtFecCre), GXutil.resetTime(T00LP2_A3683ArtFecCre[0])) ) || ( Z829TipArtCod != T00LP2_A829TipArtCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4295ClasCod != T00LP2_A4295ClasCod[0] ) )
         {
            if ( GXutil.strcmp(Z69ArtDsc, T00LP2_A69ArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtDsc");
               GXutil.writeLogRaw("Old: ",Z69ArtDsc);
               GXutil.writeLogRaw("Current: ",T00LP2_A69ArtDsc[0]);
            }
            if ( GXutil.strcmp(Z87ArtMat, T00LP2_A87ArtMat[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtMat");
               GXutil.writeLogRaw("Old: ",Z87ArtMat);
               GXutil.writeLogRaw("Current: ",T00LP2_A87ArtMat[0]);
            }
            if ( Z1148ArtPml != T00LP2_A1148ArtPml[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtPml");
               GXutil.writeLogRaw("Old: ",Z1148ArtPml);
               GXutil.writeLogRaw("Current: ",T00LP2_A1148ArtPml[0]);
            }
            if ( Z78ArtGraCru != T00LP2_A78ArtGraCru[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtGraCru");
               GXutil.writeLogRaw("Old: ",Z78ArtGraCru);
               GXutil.writeLogRaw("Current: ",T00LP2_A78ArtGraCru[0]);
            }
            if ( Z68ArtCruMin != T00LP2_A68ArtCruMin[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtCruMin");
               GXutil.writeLogRaw("Old: ",Z68ArtCruMin);
               GXutil.writeLogRaw("Current: ",T00LP2_A68ArtCruMin[0]);
            }
            if ( Z67ArtCruMax != T00LP2_A67ArtCruMax[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtCruMax");
               GXutil.writeLogRaw("Old: ",Z67ArtCruMax);
               GXutil.writeLogRaw("Current: ",T00LP2_A67ArtCruMax[0]);
            }
            if ( Z63ArtAcaMin != T00LP2_A63ArtAcaMin[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtAcaMin");
               GXutil.writeLogRaw("Old: ",Z63ArtAcaMin);
               GXutil.writeLogRaw("Current: ",T00LP2_A63ArtAcaMin[0]);
            }
            if ( Z62ArtAcaMax != T00LP2_A62ArtAcaMax[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtAcaMax");
               GXutil.writeLogRaw("Old: ",Z62ArtAcaMax);
               GXutil.writeLogRaw("Current: ",T00LP2_A62ArtAcaMax[0]);
            }
            if ( DecimalUtil.compareTo(Z95ArtRen, T00LP2_A95ArtRen[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtRen");
               GXutil.writeLogRaw("Old: ",Z95ArtRen);
               GXutil.writeLogRaw("Current: ",T00LP2_A95ArtRen[0]);
            }
            if ( GXutil.strcmp(Z101ArtTipPle, T00LP2_A101ArtTipPle[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtTipPle");
               GXutil.writeLogRaw("Old: ",Z101ArtTipPle);
               GXutil.writeLogRaw("Current: ",T00LP2_A101ArtTipPle[0]);
            }
            if ( GXutil.strcmp(Z100ArtTipLar, T00LP2_A100ArtTipLar[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtTipLar");
               GXutil.writeLogRaw("Old: ",Z100ArtTipLar);
               GXutil.writeLogRaw("Current: ",T00LP2_A100ArtTipLar[0]);
            }
            if ( GXutil.strcmp(Z66ArtCorOri, T00LP2_A66ArtCorOri[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtCorOri");
               GXutil.writeLogRaw("Old: ",Z66ArtCorOri);
               GXutil.writeLogRaw("Current: ",T00LP2_A66ArtCorOri[0]);
            }
            if ( GXutil.strcmp(Z70ArtEncOri, T00LP2_A70ArtEncOri[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtEncOri");
               GXutil.writeLogRaw("Old: ",Z70ArtEncOri);
               GXutil.writeLogRaw("Current: ",T00LP2_A70ArtEncOri[0]);
            }
            if ( GXutil.strcmp(Z96ArtSua, T00LP2_A96ArtSua[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtSua");
               GXutil.writeLogRaw("Old: ",Z96ArtSua);
               GXutil.writeLogRaw("Current: ",T00LP2_A96ArtSua[0]);
            }
            if ( GXutil.strcmp(Z64ArtAcaQui, T00LP2_A64ArtAcaQui[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtAcaQui");
               GXutil.writeLogRaw("Old: ",Z64ArtAcaQui);
               GXutil.writeLogRaw("Current: ",T00LP2_A64ArtAcaQui[0]);
            }
            if ( GXutil.strcmp(Z73ArtEti, T00LP2_A73ArtEti[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtEti");
               GXutil.writeLogRaw("Old: ",Z73ArtEti);
               GXutil.writeLogRaw("Current: ",T00LP2_A73ArtEti[0]);
            }
            if ( Z117ArtUrg != T00LP2_A117ArtUrg[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtUrg");
               GXutil.writeLogRaw("Old: ",Z117ArtUrg);
               GXutil.writeLogRaw("Current: ",T00LP2_A117ArtUrg[0]);
            }
            if ( DecimalUtil.compareTo(Z88ArtMer, T00LP2_A88ArtMer[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtMer");
               GXutil.writeLogRaw("Old: ",Z88ArtMer);
               GXutil.writeLogRaw("Current: ",T00LP2_A88ArtMer[0]);
            }
            if ( GXutil.strcmp(Z105ArtTra1, T00LP2_A105ArtTra1[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtTra1");
               GXutil.writeLogRaw("Old: ",Z105ArtTra1);
               GXutil.writeLogRaw("Current: ",T00LP2_A105ArtTra1[0]);
            }
            if ( GXutil.strcmp(Z106ArtTra2, T00LP2_A106ArtTra2[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtTra2");
               GXutil.writeLogRaw("Old: ",Z106ArtTra2);
               GXutil.writeLogRaw("Current: ",T00LP2_A106ArtTra2[0]);
            }
            if ( GXutil.strcmp(Z107ArtTra3, T00LP2_A107ArtTra3[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtTra3");
               GXutil.writeLogRaw("Old: ",Z107ArtTra3);
               GXutil.writeLogRaw("Current: ",T00LP2_A107ArtTra3[0]);
            }
            if ( Z108ArtTraP1 != T00LP2_A108ArtTraP1[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtTraP1");
               GXutil.writeLogRaw("Old: ",Z108ArtTraP1);
               GXutil.writeLogRaw("Current: ",T00LP2_A108ArtTraP1[0]);
            }
            if ( Z109ArtTraP2 != T00LP2_A109ArtTraP2[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtTraP2");
               GXutil.writeLogRaw("Old: ",Z109ArtTraP2);
               GXutil.writeLogRaw("Current: ",T00LP2_A109ArtTraP2[0]);
            }
            if ( Z110ArtTraP3 != T00LP2_A110ArtTraP3[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtTraP3");
               GXutil.writeLogRaw("Old: ",Z110ArtTraP3);
               GXutil.writeLogRaw("Current: ",T00LP2_A110ArtTraP3[0]);
            }
            if ( GXutil.strcmp(Z111ArtUrd1, T00LP2_A111ArtUrd1[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtUrd1");
               GXutil.writeLogRaw("Old: ",Z111ArtUrd1);
               GXutil.writeLogRaw("Current: ",T00LP2_A111ArtUrd1[0]);
            }
            if ( GXutil.strcmp(Z112ArtUrd2, T00LP2_A112ArtUrd2[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtUrd2");
               GXutil.writeLogRaw("Old: ",Z112ArtUrd2);
               GXutil.writeLogRaw("Current: ",T00LP2_A112ArtUrd2[0]);
            }
            if ( GXutil.strcmp(Z113ArtUrd3, T00LP2_A113ArtUrd3[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtUrd3");
               GXutil.writeLogRaw("Old: ",Z113ArtUrd3);
               GXutil.writeLogRaw("Current: ",T00LP2_A113ArtUrd3[0]);
            }
            if ( Z114ArtUrdP1 != T00LP2_A114ArtUrdP1[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtUrdP1");
               GXutil.writeLogRaw("Old: ",Z114ArtUrdP1);
               GXutil.writeLogRaw("Current: ",T00LP2_A114ArtUrdP1[0]);
            }
            if ( Z115ArtUrdP2 != T00LP2_A115ArtUrdP2[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtUrdP2");
               GXutil.writeLogRaw("Old: ",Z115ArtUrdP2);
               GXutil.writeLogRaw("Current: ",T00LP2_A115ArtUrdP2[0]);
            }
            if ( Z116ArtUrdP3 != T00LP2_A116ArtUrdP3[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtUrdP3");
               GXutil.writeLogRaw("Old: ",Z116ArtUrdP3);
               GXutil.writeLogRaw("Current: ",T00LP2_A116ArtUrdP3[0]);
            }
            if ( DecimalUtil.compareTo(Z92ArtPreKgm, T00LP2_A92ArtPreKgm[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtPreKgm");
               GXutil.writeLogRaw("Old: ",Z92ArtPreKgm);
               GXutil.writeLogRaw("Current: ",T00LP2_A92ArtPreKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z93ArtPreMtr, T00LP2_A93ArtPreMtr[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtPreMtr");
               GXutil.writeLogRaw("Old: ",Z93ArtPreMtr);
               GXutil.writeLogRaw("Current: ",T00LP2_A93ArtPreMtr[0]);
            }
            if ( GXutil.strcmp(Z91ArtPreDef, T00LP2_A91ArtPreDef[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtPreDef");
               GXutil.writeLogRaw("Old: ",Z91ArtPreDef);
               GXutil.writeLogRaw("Current: ",T00LP2_A91ArtPreDef[0]);
            }
            if ( Z1229ArtEncCom != T00LP2_A1229ArtEncCom[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtEncCom");
               GXutil.writeLogRaw("Old: ",Z1229ArtEncCom);
               GXutil.writeLogRaw("Current: ",T00LP2_A1229ArtEncCom[0]);
            }
            if ( Z1230ArtEncAnh != T00LP2_A1230ArtEncAnh[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtEncAnh");
               GXutil.writeLogRaw("Old: ",Z1230ArtEncAnh);
               GXutil.writeLogRaw("Current: ",T00LP2_A1230ArtEncAnh[0]);
            }
            if ( Z1903ArtGraAca != T00LP2_A1903ArtGraAca[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtGraAca");
               GXutil.writeLogRaw("Old: ",Z1903ArtGraAca);
               GXutil.writeLogRaw("Current: ",T00LP2_A1903ArtGraAca[0]);
            }
            if ( DecimalUtil.compareTo(Z1905ArtRdoA, T00LP2_A1905ArtRdoA[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtRdoA");
               GXutil.writeLogRaw("Old: ",Z1905ArtRdoA);
               GXutil.writeLogRaw("Current: ",T00LP2_A1905ArtRdoA[0]);
            }
            if ( DecimalUtil.compareTo(Z1904ArtRdoN, T00LP2_A1904ArtRdoN[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtRdoN");
               GXutil.writeLogRaw("Old: ",Z1904ArtRdoN);
               GXutil.writeLogRaw("Current: ",T00LP2_A1904ArtRdoN[0]);
            }
            if ( DecimalUtil.compareTo(Z2791ArtFacAbs, T00LP2_A2791ArtFacAbs[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtFacAbs");
               GXutil.writeLogRaw("Old: ",Z2791ArtFacAbs);
               GXutil.writeLogRaw("Current: ",T00LP2_A2791ArtFacAbs[0]);
            }
            if ( GXutil.strcmp(Z2834ArtPle2, T00LP2_A2834ArtPle2[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtPle2");
               GXutil.writeLogRaw("Old: ",Z2834ArtPle2);
               GXutil.writeLogRaw("Current: ",T00LP2_A2834ArtPle2[0]);
            }
            if ( Z3121ArtNumCor != T00LP2_A3121ArtNumCor[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtNumCor");
               GXutil.writeLogRaw("Old: ",Z3121ArtNumCor);
               GXutil.writeLogRaw("Current: ",T00LP2_A3121ArtNumCor[0]);
            }
            if ( Z3122ArtAncSal1 != T00LP2_A3122ArtAncSal1[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtAncSal1");
               GXutil.writeLogRaw("Old: ",Z3122ArtAncSal1);
               GXutil.writeLogRaw("Current: ",T00LP2_A3122ArtAncSal1[0]);
            }
            if ( Z3123ArtAncSal2 != T00LP2_A3123ArtAncSal2[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtAncSal2");
               GXutil.writeLogRaw("Old: ",Z3123ArtAncSal2);
               GXutil.writeLogRaw("Current: ",T00LP2_A3123ArtAncSal2[0]);
            }
            if ( Z3124ArtAncSal3 != T00LP2_A3124ArtAncSal3[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtAncSal3");
               GXutil.writeLogRaw("Old: ",Z3124ArtAncSal3);
               GXutil.writeLogRaw("Current: ",T00LP2_A3124ArtAncSal3[0]);
            }
            if ( Z3125ArtGraAca2 != T00LP2_A3125ArtGraAca2[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtGraAca2");
               GXutil.writeLogRaw("Old: ",Z3125ArtGraAca2);
               GXutil.writeLogRaw("Current: ",T00LP2_A3125ArtGraAca2[0]);
            }
            if ( Z3126ArtGraCru2 != T00LP2_A3126ArtGraCru2[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtGraCru2");
               GXutil.writeLogRaw("Old: ",Z3126ArtGraCru2);
               GXutil.writeLogRaw("Current: ",T00LP2_A3126ArtGraCru2[0]);
            }
            if ( DecimalUtil.compareTo(Z4297ArtPmPPza, T00LP2_A4297ArtPmPPza[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtPmPPza");
               GXutil.writeLogRaw("Old: ",Z4297ArtPmPPza);
               GXutil.writeLogRaw("Current: ",T00LP2_A4297ArtPmPPza[0]);
            }
            if ( Z4607ArtRb != T00LP2_A4607ArtRb[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtRb");
               GXutil.writeLogRaw("Old: ",Z4607ArtRb);
               GXutil.writeLogRaw("Current: ",T00LP2_A4607ArtRb[0]);
            }
            if ( DecimalUtil.compareTo(Z6660ArtFacTor, T00LP2_A6660ArtFacTor[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtFacTor");
               GXutil.writeLogRaw("Old: ",Z6660ArtFacTor);
               GXutil.writeLogRaw("Current: ",T00LP2_A6660ArtFacTor[0]);
            }
            if ( GXutil.strcmp(Z5741ArtComer, T00LP2_A5741ArtComer[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtComer");
               GXutil.writeLogRaw("Old: ",Z5741ArtComer);
               GXutil.writeLogRaw("Current: ",T00LP2_A5741ArtComer[0]);
            }
            if ( GXutil.strcmp(Z967ArtNMtr, T00LP2_A967ArtNMtr[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtNMtr");
               GXutil.writeLogRaw("Old: ",Z967ArtNMtr);
               GXutil.writeLogRaw("Current: ",T00LP2_A967ArtNMtr[0]);
            }
            if ( GXutil.strcmp(Z4353ArtUsrCod, T00LP2_A4353ArtUsrCod[0]) != 0 )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtUsrCod");
               GXutil.writeLogRaw("Old: ",Z4353ArtUsrCod);
               GXutil.writeLogRaw("Current: ",T00LP2_A4353ArtUsrCod[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4354ArtFecMod), GXutil.resetTime(T00LP2_A4354ArtFecMod[0])) ) )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtFecMod");
               GXutil.writeLogRaw("Old: ",Z4354ArtFecMod);
               GXutil.writeLogRaw("Current: ",T00LP2_A4354ArtFecMod[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3683ArtFecCre), GXutil.resetTime(T00LP2_A3683ArtFecCre[0])) ) )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ArtFecCre");
               GXutil.writeLogRaw("Old: ",Z3683ArtFecCre);
               GXutil.writeLogRaw("Current: ",T00LP2_A3683ArtFecCre[0]);
            }
            if ( Z829TipArtCod != T00LP2_A829TipArtCod[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"TipArtCod");
               GXutil.writeLogRaw("Old: ",Z829TipArtCod);
               GXutil.writeLogRaw("Current: ",T00LP2_A829TipArtCod[0]);
            }
            if ( Z4295ClasCod != T00LP2_A4295ClasCod[0] )
            {
               GXutil.writeLogln("tarticl:[seudo value changed for attri]"+"ClasCod");
               GXutil.writeLogRaw("Old: ",Z4295ClasCod);
               GXutil.writeLogRaw("Current: ",T00LP2_A4295ClasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPARTICU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertLP10( )
   {
      beforeValidateLP10( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableLP10( ) ;
      }
      if ( AnyError == 0 )
      {
         zmLP10( 0) ;
         checkOptimisticConcurrencyLP10( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmLP10( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertLP10( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00LP16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n69ArtDsc), A69ArtDsc, Boolean.valueOf(n87ArtMat), A87ArtMat, Boolean.valueOf(n1148ArtPml), Short.valueOf(A1148ArtPml), Boolean.valueOf(n78ArtGraCru), Short.valueOf(A78ArtGraCru), Boolean.valueOf(n68ArtCruMin), Short.valueOf(A68ArtCruMin), Boolean.valueOf(n67ArtCruMax), Short.valueOf(A67ArtCruMax), Boolean.valueOf(n63ArtAcaMin), Short.valueOf(A63ArtAcaMin), Boolean.valueOf(n62ArtAcaMax), Short.valueOf(A62ArtAcaMax), Boolean.valueOf(n95ArtRen), A95ArtRen, Boolean.valueOf(n101ArtTipPle), A101ArtTipPle, Boolean.valueOf(n100ArtTipLar), A100ArtTipLar, Boolean.valueOf(n66ArtCorOri), A66ArtCorOri, Boolean.valueOf(n70ArtEncOri), A70ArtEncOri, Boolean.valueOf(n96ArtSua), A96ArtSua, Boolean.valueOf(n64ArtAcaQui), A64ArtAcaQui, Boolean.valueOf(n73ArtEti), A73ArtEti, Boolean.valueOf(n117ArtUrg), Byte.valueOf(A117ArtUrg), Boolean.valueOf(n88ArtMer), A88ArtMer, Boolean.valueOf(n105ArtTra1), A105ArtTra1, Boolean.valueOf(n106ArtTra2), A106ArtTra2, Boolean.valueOf(n107ArtTra3), A107ArtTra3, Boolean.valueOf(n108ArtTraP1), Short.valueOf(A108ArtTraP1), Boolean.valueOf(n109ArtTraP2), Short.valueOf(A109ArtTraP2), Boolean.valueOf(n110ArtTraP3), Short.valueOf(A110ArtTraP3), Boolean.valueOf(n111ArtUrd1), A111ArtUrd1, Boolean.valueOf(n112ArtUrd2), A112ArtUrd2, Boolean.valueOf(n113ArtUrd3), A113ArtUrd3, Boolean.valueOf(n114ArtUrdP1), Short.valueOf(A114ArtUrdP1), Boolean.valueOf(n115ArtUrdP2), Short.valueOf(A115ArtUrdP2), Boolean.valueOf(n116ArtUrdP3), Short.valueOf(A116ArtUrdP3), Boolean.valueOf(n92ArtPreKgm), A92ArtPreKgm, Boolean.valueOf(n93ArtPreMtr), A93ArtPreMtr, Boolean.valueOf(n91ArtPreDef), A91ArtPreDef, Boolean.valueOf(n1229ArtEncCom), Short.valueOf(A1229ArtEncCom), Boolean.valueOf(n1230ArtEncAnh), Short.valueOf(A1230ArtEncAnh), Boolean.valueOf(n1903ArtGraAca), Short.valueOf(A1903ArtGraAca), Boolean.valueOf(n1905ArtRdoA), A1905ArtRdoA, Boolean.valueOf(n1904ArtRdoN), A1904ArtRdoN, Boolean.valueOf(n2791ArtFacAbs), A2791ArtFacAbs, Boolean.valueOf(n2834ArtPle2), A2834ArtPle2, Boolean.valueOf(n3121ArtNumCor), Short.valueOf(A3121ArtNumCor), Boolean.valueOf(n3122ArtAncSal1), Short.valueOf(A3122ArtAncSal1), Boolean.valueOf(n3123ArtAncSal2), Short.valueOf(A3123ArtAncSal2), Boolean.valueOf(n3124ArtAncSal3), Short.valueOf(A3124ArtAncSal3), Boolean.valueOf(n3125ArtGraAca2), Short.valueOf(A3125ArtGraAca2), Boolean.valueOf(n3126ArtGraCru2), Short.valueOf(A3126ArtGraCru2), Boolean.valueOf(n4297ArtPmPPza), A4297ArtPmPPza, Boolean.valueOf(n4607ArtRb), Short.valueOf(A4607ArtRb), Boolean.valueOf(n6660ArtFacTor), A6660ArtFacTor, Boolean.valueOf(n5741ArtComer), A5741ArtComer, Boolean.valueOf(n967ArtNMtr), A967ArtNMtr, Boolean.valueOf(n4353ArtUsrCod), A4353ArtUsrCod, Boolean.valueOf(n4354ArtFecMod), A4354ArtFecMod, Boolean.valueOf(n3683ArtFecCre), A3683ArtFecCre, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A829TipArtCod), Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
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
                        GXv_int2[0] = A252CliCod ;
                        GXv_char3[0] = A65ArtCod ;
                        new app.ppartico(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3) ;
                        tarticl_impl.this.A396EmprCod = GXv_char1[0] ;
                        tarticl_impl.this.A252CliCod = GXv_int2[0] ;
                        tarticl_impl.this.A65ArtCod = GXv_char3[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaptionLP0( ) ;
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
            loadLP10( ) ;
         }
         endLevelLP10( ) ;
      }
      closeExtendedTableCursorsLP10( ) ;
   }

   public void updateLP10( )
   {
      beforeValidateLP10( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableLP10( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyLP10( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmLP10( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateLP10( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00LP17 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n69ArtDsc), A69ArtDsc, Boolean.valueOf(n87ArtMat), A87ArtMat, Boolean.valueOf(n1148ArtPml), Short.valueOf(A1148ArtPml), Boolean.valueOf(n78ArtGraCru), Short.valueOf(A78ArtGraCru), Boolean.valueOf(n68ArtCruMin), Short.valueOf(A68ArtCruMin), Boolean.valueOf(n67ArtCruMax), Short.valueOf(A67ArtCruMax), Boolean.valueOf(n63ArtAcaMin), Short.valueOf(A63ArtAcaMin), Boolean.valueOf(n62ArtAcaMax), Short.valueOf(A62ArtAcaMax), Boolean.valueOf(n95ArtRen), A95ArtRen, Boolean.valueOf(n101ArtTipPle), A101ArtTipPle, Boolean.valueOf(n100ArtTipLar), A100ArtTipLar, Boolean.valueOf(n66ArtCorOri), A66ArtCorOri, Boolean.valueOf(n70ArtEncOri), A70ArtEncOri, Boolean.valueOf(n96ArtSua), A96ArtSua, Boolean.valueOf(n64ArtAcaQui), A64ArtAcaQui, Boolean.valueOf(n73ArtEti), A73ArtEti, Boolean.valueOf(n117ArtUrg), Byte.valueOf(A117ArtUrg), Boolean.valueOf(n88ArtMer), A88ArtMer, Boolean.valueOf(n105ArtTra1), A105ArtTra1, Boolean.valueOf(n106ArtTra2), A106ArtTra2, Boolean.valueOf(n107ArtTra3), A107ArtTra3, Boolean.valueOf(n108ArtTraP1), Short.valueOf(A108ArtTraP1), Boolean.valueOf(n109ArtTraP2), Short.valueOf(A109ArtTraP2), Boolean.valueOf(n110ArtTraP3), Short.valueOf(A110ArtTraP3), Boolean.valueOf(n111ArtUrd1), A111ArtUrd1, Boolean.valueOf(n112ArtUrd2), A112ArtUrd2, Boolean.valueOf(n113ArtUrd3), A113ArtUrd3, Boolean.valueOf(n114ArtUrdP1), Short.valueOf(A114ArtUrdP1), Boolean.valueOf(n115ArtUrdP2), Short.valueOf(A115ArtUrdP2), Boolean.valueOf(n116ArtUrdP3), Short.valueOf(A116ArtUrdP3), Boolean.valueOf(n92ArtPreKgm), A92ArtPreKgm, Boolean.valueOf(n93ArtPreMtr), A93ArtPreMtr, Boolean.valueOf(n91ArtPreDef), A91ArtPreDef, Boolean.valueOf(n1229ArtEncCom), Short.valueOf(A1229ArtEncCom), Boolean.valueOf(n1230ArtEncAnh), Short.valueOf(A1230ArtEncAnh), Boolean.valueOf(n1903ArtGraAca), Short.valueOf(A1903ArtGraAca), Boolean.valueOf(n1905ArtRdoA), A1905ArtRdoA, Boolean.valueOf(n1904ArtRdoN), A1904ArtRdoN, Boolean.valueOf(n2791ArtFacAbs), A2791ArtFacAbs, Boolean.valueOf(n2834ArtPle2), A2834ArtPle2, Boolean.valueOf(n3121ArtNumCor), Short.valueOf(A3121ArtNumCor), Boolean.valueOf(n3122ArtAncSal1), Short.valueOf(A3122ArtAncSal1), Boolean.valueOf(n3123ArtAncSal2), Short.valueOf(A3123ArtAncSal2), Boolean.valueOf(n3124ArtAncSal3), Short.valueOf(A3124ArtAncSal3), Boolean.valueOf(n3125ArtGraAca2), Short.valueOf(A3125ArtGraAca2), Boolean.valueOf(n3126ArtGraCru2), Short.valueOf(A3126ArtGraCru2), Boolean.valueOf(n4297ArtPmPPza), A4297ArtPmPPza, Boolean.valueOf(n4607ArtRb), Short.valueOf(A4607ArtRb), Boolean.valueOf(n6660ArtFacTor), A6660ArtFacTor, Boolean.valueOf(n5741ArtComer), A5741ArtComer, Boolean.valueOf(n967ArtNMtr), A967ArtNMtr, Boolean.valueOf(n4353ArtUsrCod), A4353ArtUsrCod, Boolean.valueOf(n4354ArtFecMod), A4354ArtFecMod, Boolean.valueOf(n3683ArtFecCre), A3683ArtFecCre, Short.valueOf(A829TipArtCod), Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTICU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateLP10( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char3[0] = A396EmprCod ;
                     GXv_int2[0] = A252CliCod ;
                     GXv_char1[0] = A65ArtCod ;
                     new app.txparticuupdateredundancy(remoteHandle, context).execute( GXv_char3, GXv_int2, GXv_char1) ;
                     tarticl_impl.this.A396EmprCod = GXv_char3[0] ;
                     tarticl_impl.this.A252CliCod = GXv_int2[0] ;
                     tarticl_impl.this.A65ArtCod = GXv_char1[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaptionLP0( ) ;
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
         endLevelLP10( ) ;
      }
      closeExtendedTableCursorsLP10( ) ;
   }

   public void deferredUpdateLP10( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateLP10( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyLP10( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsLP10( ) ;
         afterConfirmLP10( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteLP10( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00LP18 */
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
                        initAllLP10( ) ;
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
                     resetCaptionLP0( ) ;
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
      endLevelLP10( ) ;
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsLP10( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00LP19 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         A407EmprNom = T00LP19_A407EmprNom[0] ;
         n407EmprNom = T00LP19_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(17);
         /* Using cursor T00LP20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T00LP20_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A272CliEti = T00LP20_A272CliEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A272CliEti", A272CliEti);
         A306CliUrg = T00LP20_A306CliUrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A306CliUrg", GXutil.str( A306CliUrg, 1, 0));
         pr_default.close(18);
         /* Using cursor T00LP21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Short.valueOf(A829TipArtCod)});
         A830TipArtDsc = T00LP21_A830TipArtDsc[0] ;
         n830TipArtDsc = T00LP21_n830TipArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A830TipArtDsc", A830TipArtDsc);
         A4608TipArtClas = T00LP21_A4608TipArtClas[0] ;
         n4608TipArtClas = T00LP21_n4608TipArtClas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4608TipArtClas", A4608TipArtClas);
         pr_default.close(19);
         /* Using cursor T00LP22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
         A4296ClasDsc = T00LP22_A4296ClasDsc[0] ;
         n4296ClasDsc = T00LP22_n4296ClasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4296ClasDsc", A4296ClasDsc);
         pr_default.close(20);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00LP23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Familia Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00LP24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T00LP25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T00LP26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Consumos Lab. JBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T00LP27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MEZCLAS CLIENTE MATERIAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T00LP28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS COMPOSICION MEZCLAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T00LP29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "recest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T00LP30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T00LP31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPEDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T00LP32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCARC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T00LP33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO PRECIOS ARTICULO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T00LP34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INCREMENTO PRECIO INTENSIDAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T00LP35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECIO GLOBA COLOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T00LP36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TR02JL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T00LP37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLATFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T00LP38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTMQT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T00LP39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PVPNITp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T00LP40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEJART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T00LP41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TNART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T00LP42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTTEJ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T00LP43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARTINa", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T00LP44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTMAT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T00LP45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T00LP46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ESTAD.CLIENTE/ART/T.ART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T00LP47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Modelos de Confección", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T00LP48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "WebEmp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T00LP49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ACATEXGB.WEBDIS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T00LP50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSerie", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T00LP51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRECO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T00LP52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINPRE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T00LP53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PedPro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T00LP54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T00LP55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T00LP56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANBRL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T00LP57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECAP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T00LP58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARSER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T00LP59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cod Calidad por Articulo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T00LP60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTINT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T00LP61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T00LP62 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T00LP63 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPREPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T00LP64 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T00LP65 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRETCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T00LP66 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
      }
   }

   public void endLevelLP10( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteLP10( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tarticl");
         if ( AnyError == 0 )
         {
            confirmValuesLP0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tarticl");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartLP10( )
   {
      /* Scan By routine */
      /* Using cursor T00LP67 */
      pr_default.execute(65);
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(65) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A396EmprCod = T00LP67_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T00LP67_A252CliCod[0] ;
         n252CliCod = T00LP67_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T00LP67_A65ArtCod[0] ;
         n65ArtCod = T00LP67_n65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNextLP10( )
   {
      /* Scan next routine */
      pr_default.readNext(65);
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(65) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A396EmprCod = T00LP67_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T00LP67_A252CliCod[0] ;
         n252CliCod = T00LP67_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T00LP67_A65ArtCod[0] ;
         n65ArtCod = T00LP67_n65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
   }

   public void scanEndLP10( )
   {
      pr_default.close(65);
   }

   public void afterConfirmLP10( )
   {
      /* After Confirm Rules */
      if ( (IsModified == 1) && true /* After */ )
      {
         A4354ArtFecMod = Gx_date ;
         n4354ArtFecMod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4354ArtFecMod", localUtil.format(A4354ArtFecMod, "99/99/9999"));
      }
   }

   public void beforeInsertLP10( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateLP10( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteLP10( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteLP10( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateLP10( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesLP10( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtArtMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtMat_Enabled), 5, 0), true);
      edtTipArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtCod_Enabled), 5, 0), true);
      edtTipArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtDsc_Enabled), 5, 0), true);
      edtArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), true);
      edtArtPml_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtPml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtPml_Enabled), 5, 0), true);
      edtArtGraCru_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtGraCru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtGraCru_Enabled), 5, 0), true);
      edtArtCruMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCruMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCruMin_Enabled), 5, 0), true);
      edtArtCruMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCruMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCruMax_Enabled), 5, 0), true);
      edtArtAcaMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtAcaMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtAcaMin_Enabled), 5, 0), true);
      edtArtAcaMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtAcaMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtAcaMax_Enabled), 5, 0), true);
      edtArtRen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtRen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtRen_Enabled), 5, 0), true);
      edtArtTipPle_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtTipPle_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtTipPle_Enabled), 5, 0), true);
      edtArtTipLar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtTipLar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtTipLar_Enabled), 5, 0), true);
      chkArtCorOri.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkArtCorOri.getInternalname(), "Enabled", GXutil.ltrimstr( chkArtCorOri.getEnabled(), 5, 0), true);
      chkArtEncOri.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkArtEncOri.getInternalname(), "Enabled", GXutil.ltrimstr( chkArtEncOri.getEnabled(), 5, 0), true);
      edtArtSua_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtSua_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtSua_Enabled), 5, 0), true);
      edtArtAcaQui_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtAcaQui_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtAcaQui_Enabled), 5, 0), true);
      edtArtEti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtEti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtEti_Enabled), 5, 0), true);
      edtCliEti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEti_Enabled), 5, 0), true);
      edtCliUrg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliUrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliUrg_Enabled), 5, 0), true);
      edtArtUrg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtUrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtUrg_Enabled), 5, 0), true);
      edtArtMer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtMer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtMer_Enabled), 5, 0), true);
      edtArtTra1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtTra1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtTra1_Enabled), 5, 0), true);
      edtArtTra2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtTra2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtTra2_Enabled), 5, 0), true);
      edtArtTra3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtTra3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtTra3_Enabled), 5, 0), true);
      edtArtTraP1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtTraP1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtTraP1_Enabled), 5, 0), true);
      edtArtTraP2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtTraP2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtTraP2_Enabled), 5, 0), true);
      edtArtTraP3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtTraP3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtTraP3_Enabled), 5, 0), true);
      edtArtUrd1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtUrd1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtUrd1_Enabled), 5, 0), true);
      edtArtUrd2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtUrd2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtUrd2_Enabled), 5, 0), true);
      edtArtUrd3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtUrd3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtUrd3_Enabled), 5, 0), true);
      edtArtUrdP1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtUrdP1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtUrdP1_Enabled), 5, 0), true);
      edtArtUrdP2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtUrdP2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtUrdP2_Enabled), 5, 0), true);
      edtArtUrdP3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtUrdP3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtUrdP3_Enabled), 5, 0), true);
      edtArtPreKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtPreKgm_Enabled), 5, 0), true);
      edtArtPreMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtPreMtr_Enabled), 5, 0), true);
      edtArtPreDef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtPreDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtPreDef_Enabled), 5, 0), true);
      edtArtEncCom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtEncCom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtEncCom_Enabled), 5, 0), true);
      edtArtEncAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtEncAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtEncAnh_Enabled), 5, 0), true);
      edtArtGraAca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtGraAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtGraAca_Enabled), 5, 0), true);
      edtArtRdoA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtRdoA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtRdoA_Enabled), 5, 0), true);
      edtArtRdoN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtRdoN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtRdoN_Enabled), 5, 0), true);
      edtArtFacAbs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtFacAbs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtFacAbs_Enabled), 5, 0), true);
      edtArtPle2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtPle2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtPle2_Enabled), 5, 0), true);
      edtArtNumCor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtNumCor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtNumCor_Enabled), 5, 0), true);
      edtArtAncSal1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtAncSal1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtAncSal1_Enabled), 5, 0), true);
      edtArtAncSal2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtAncSal2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtAncSal2_Enabled), 5, 0), true);
      edtArtAncSal3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtAncSal3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtAncSal3_Enabled), 5, 0), true);
      edtArtGraAca2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtGraAca2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtGraAca2_Enabled), 5, 0), true);
      edtArtGraCru2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtGraCru2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtGraCru2_Enabled), 5, 0), true);
      edtClasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClasCod_Enabled), 5, 0), true);
      edtArtPmPPza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtPmPPza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtPmPPza_Enabled), 5, 0), true);
      edtArtRb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtRb_Enabled), 5, 0), true);
      edtTipArtClas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtClas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtClas_Enabled), 5, 0), true);
      edtClasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClasDsc_Enabled), 5, 0), true);
      edtArtFacTor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtFacTor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtFacTor_Enabled), 5, 0), true);
      edtArtComer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtComer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtComer_Enabled), 5, 0), true);
      edtArtNMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtNMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtNMtr_Enabled), 5, 0), true);
      edtArtUsrCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtUsrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtUsrCod_Enabled), 5, 0), true);
      edtArtFecMod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtFecMod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtFecMod_Enabled), 5, 0), true);
      edtArtFecCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtFecCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtFecCre_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashesLP10( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValuesLP0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tarticl", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV65CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV66ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV67Mode2))}, new String[] {"CliCod","ArtCod","Mode2"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TARTICl");
      forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV59Modo, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tarticl:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z87ArtMat", GXutil.rtrim( Z87ArtMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1148ArtPml", GXutil.ltrim( localUtil.ntoc( Z1148ArtPml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z78ArtGraCru", GXutil.ltrim( localUtil.ntoc( Z78ArtGraCru, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z68ArtCruMin", GXutil.ltrim( localUtil.ntoc( Z68ArtCruMin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z67ArtCruMax", GXutil.ltrim( localUtil.ntoc( Z67ArtCruMax, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z63ArtAcaMin", GXutil.ltrim( localUtil.ntoc( Z63ArtAcaMin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z62ArtAcaMax", GXutil.ltrim( localUtil.ntoc( Z62ArtAcaMax, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z95ArtRen", GXutil.ltrim( localUtil.ntoc( Z95ArtRen, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z101ArtTipPle", GXutil.rtrim( Z101ArtTipPle));
      app.GxWebStd.gx_hidden_field( httpContext, "Z100ArtTipLar", GXutil.rtrim( Z100ArtTipLar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z66ArtCorOri", GXutil.rtrim( Z66ArtCorOri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z70ArtEncOri", GXutil.rtrim( Z70ArtEncOri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z96ArtSua", GXutil.rtrim( Z96ArtSua));
      app.GxWebStd.gx_hidden_field( httpContext, "Z64ArtAcaQui", GXutil.rtrim( Z64ArtAcaQui));
      app.GxWebStd.gx_hidden_field( httpContext, "Z73ArtEti", GXutil.rtrim( Z73ArtEti));
      app.GxWebStd.gx_hidden_field( httpContext, "Z117ArtUrg", GXutil.ltrim( localUtil.ntoc( Z117ArtUrg, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z88ArtMer", GXutil.ltrim( localUtil.ntoc( Z88ArtMer, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z105ArtTra1", GXutil.rtrim( Z105ArtTra1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z106ArtTra2", GXutil.rtrim( Z106ArtTra2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z107ArtTra3", GXutil.rtrim( Z107ArtTra3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z108ArtTraP1", GXutil.ltrim( localUtil.ntoc( Z108ArtTraP1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z109ArtTraP2", GXutil.ltrim( localUtil.ntoc( Z109ArtTraP2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z110ArtTraP3", GXutil.ltrim( localUtil.ntoc( Z110ArtTraP3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z111ArtUrd1", GXutil.rtrim( Z111ArtUrd1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z112ArtUrd2", GXutil.rtrim( Z112ArtUrd2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z113ArtUrd3", GXutil.rtrim( Z113ArtUrd3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z114ArtUrdP1", GXutil.ltrim( localUtil.ntoc( Z114ArtUrdP1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z115ArtUrdP2", GXutil.ltrim( localUtil.ntoc( Z115ArtUrdP2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z116ArtUrdP3", GXutil.ltrim( localUtil.ntoc( Z116ArtUrdP3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z92ArtPreKgm", GXutil.ltrim( localUtil.ntoc( Z92ArtPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z93ArtPreMtr", GXutil.ltrim( localUtil.ntoc( Z93ArtPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z91ArtPreDef", GXutil.rtrim( Z91ArtPreDef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1229ArtEncCom", GXutil.ltrim( localUtil.ntoc( Z1229ArtEncCom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1230ArtEncAnh", GXutil.ltrim( localUtil.ntoc( Z1230ArtEncAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1903ArtGraAca", GXutil.ltrim( localUtil.ntoc( Z1903ArtGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1905ArtRdoA", GXutil.ltrim( localUtil.ntoc( Z1905ArtRdoA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1904ArtRdoN", GXutil.ltrim( localUtil.ntoc( Z1904ArtRdoN, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2791ArtFacAbs", GXutil.ltrim( localUtil.ntoc( Z2791ArtFacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2834ArtPle2", GXutil.rtrim( Z2834ArtPle2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3121ArtNumCor", GXutil.ltrim( localUtil.ntoc( Z3121ArtNumCor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3122ArtAncSal1", GXutil.ltrim( localUtil.ntoc( Z3122ArtAncSal1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3123ArtAncSal2", GXutil.ltrim( localUtil.ntoc( Z3123ArtAncSal2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3124ArtAncSal3", GXutil.ltrim( localUtil.ntoc( Z3124ArtAncSal3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3125ArtGraAca2", GXutil.ltrim( localUtil.ntoc( Z3125ArtGraAca2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3126ArtGraCru2", GXutil.ltrim( localUtil.ntoc( Z3126ArtGraCru2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4297ArtPmPPza", GXutil.ltrim( localUtil.ntoc( Z4297ArtPmPPza, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4607ArtRb", GXutil.ltrim( localUtil.ntoc( Z4607ArtRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6660ArtFacTor", GXutil.ltrim( localUtil.ntoc( Z6660ArtFacTor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5741ArtComer", GXutil.rtrim( Z5741ArtComer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z967ArtNMtr", GXutil.rtrim( Z967ArtNMtr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4353ArtUsrCod", GXutil.rtrim( Z4353ArtUsrCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4354ArtFecMod", localUtil.dtoc( Z4354ArtFecMod, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3683ArtFecCre", localUtil.dtoc( Z3683ArtFecCre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z829TipArtCod", GXutil.ltrim( localUtil.ntoc( Z829TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4295ClasCod", GXutil.ltrim( localUtil.ntoc( Z4295ClasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "MODO", GXutil.rtrim( AV59Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV65CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE2", GXutil.rtrim( AV67Mode2));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTCOD", GXutil.rtrim( AV66ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODO", GXutil.rtrim( AV59Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
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
      return formatLink("app.tarticl", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV65CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV66ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV67Mode2))}, new String[] {"CliCod","ArtCod","Mode2"})  ;
   }

   public String getPgmname( )
   {
      return "TARTICl" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "FICHA TECNICA ARTICULO", "") ;
   }

   public void initializeNonKeyLP10( )
   {
      AV59Modo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Modo", AV59Modo);
      A69ArtDsc = "" ;
      n69ArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A87ArtMat = "" ;
      n87ArtMat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A87ArtMat", A87ArtMat);
      A829TipArtCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A829TipArtCod), 4, 0));
      A830TipArtDsc = "" ;
      n830TipArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A830TipArtDsc", A830TipArtDsc);
      A1148ArtPml = (short)(0) ;
      n1148ArtPml = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1148ArtPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1148ArtPml), 4, 0));
      A78ArtGraCru = (short)(0) ;
      n78ArtGraCru = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A78ArtGraCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A78ArtGraCru), 4, 0));
      A68ArtCruMin = (short)(0) ;
      n68ArtCruMin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A68ArtCruMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A68ArtCruMin), 3, 0));
      A67ArtCruMax = (short)(0) ;
      n67ArtCruMax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A67ArtCruMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A67ArtCruMax), 3, 0));
      A63ArtAcaMin = (short)(0) ;
      n63ArtAcaMin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A63ArtAcaMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A63ArtAcaMin), 3, 0));
      A62ArtAcaMax = (short)(0) ;
      n62ArtAcaMax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A62ArtAcaMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A62ArtAcaMax), 3, 0));
      A95ArtRen = DecimalUtil.ZERO ;
      n95ArtRen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A95ArtRen", GXutil.ltrimstr( A95ArtRen, 6, 2));
      A101ArtTipPle = "" ;
      n101ArtTipPle = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A101ArtTipPle", A101ArtTipPle);
      A100ArtTipLar = "" ;
      n100ArtTipLar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A100ArtTipLar", A100ArtTipLar);
      A96ArtSua = "" ;
      n96ArtSua = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A96ArtSua", A96ArtSua);
      A64ArtAcaQui = "" ;
      n64ArtAcaQui = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A64ArtAcaQui", A64ArtAcaQui);
      A272CliEti = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A272CliEti", A272CliEti);
      A306CliUrg = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A306CliUrg", GXutil.str( A306CliUrg, 1, 0));
      A88ArtMer = DecimalUtil.ZERO ;
      n88ArtMer = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A88ArtMer", GXutil.ltrimstr( A88ArtMer, 5, 2));
      A105ArtTra1 = "" ;
      n105ArtTra1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A105ArtTra1", A105ArtTra1);
      A106ArtTra2 = "" ;
      n106ArtTra2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A106ArtTra2", A106ArtTra2);
      A107ArtTra3 = "" ;
      n107ArtTra3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A107ArtTra3", A107ArtTra3);
      A108ArtTraP1 = (short)(0) ;
      n108ArtTraP1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A108ArtTraP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A108ArtTraP1), 3, 0));
      A109ArtTraP2 = (short)(0) ;
      n109ArtTraP2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A109ArtTraP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A109ArtTraP2), 3, 0));
      A110ArtTraP3 = (short)(0) ;
      n110ArtTraP3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A110ArtTraP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A110ArtTraP3), 3, 0));
      A111ArtUrd1 = "" ;
      n111ArtUrd1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A111ArtUrd1", A111ArtUrd1);
      A112ArtUrd2 = "" ;
      n112ArtUrd2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A112ArtUrd2", A112ArtUrd2);
      A113ArtUrd3 = "" ;
      n113ArtUrd3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A113ArtUrd3", A113ArtUrd3);
      A114ArtUrdP1 = (short)(0) ;
      n114ArtUrdP1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A114ArtUrdP1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A114ArtUrdP1), 3, 0));
      A115ArtUrdP2 = (short)(0) ;
      n115ArtUrdP2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A115ArtUrdP2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A115ArtUrdP2), 3, 0));
      A116ArtUrdP3 = (short)(0) ;
      n116ArtUrdP3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A116ArtUrdP3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A116ArtUrdP3), 3, 0));
      A92ArtPreKgm = DecimalUtil.ZERO ;
      n92ArtPreKgm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A92ArtPreKgm", GXutil.ltrimstr( A92ArtPreKgm, 13, 5));
      A93ArtPreMtr = DecimalUtil.ZERO ;
      n93ArtPreMtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A93ArtPreMtr", GXutil.ltrimstr( A93ArtPreMtr, 13, 5));
      A91ArtPreDef = "" ;
      n91ArtPreDef = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A91ArtPreDef", A91ArtPreDef);
      A1229ArtEncCom = (short)(0) ;
      n1229ArtEncCom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1229ArtEncCom", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1229ArtEncCom), 4, 0));
      A1230ArtEncAnh = (short)(0) ;
      n1230ArtEncAnh = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1230ArtEncAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1230ArtEncAnh), 4, 0));
      A1903ArtGraAca = (short)(0) ;
      n1903ArtGraAca = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1903ArtGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1903ArtGraAca), 4, 0));
      A1905ArtRdoA = DecimalUtil.ZERO ;
      n1905ArtRdoA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1905ArtRdoA", GXutil.ltrimstr( A1905ArtRdoA, 6, 2));
      A1904ArtRdoN = DecimalUtil.ZERO ;
      n1904ArtRdoN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1904ArtRdoN", GXutil.ltrimstr( A1904ArtRdoN, 6, 2));
      A2791ArtFacAbs = DecimalUtil.ZERO ;
      n2791ArtFacAbs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2791ArtFacAbs", GXutil.ltrimstr( A2791ArtFacAbs, 6, 2));
      A2834ArtPle2 = "" ;
      n2834ArtPle2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2834ArtPle2", A2834ArtPle2);
      A3121ArtNumCor = (short)(0) ;
      n3121ArtNumCor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3121ArtNumCor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3121ArtNumCor), 4, 0));
      A3122ArtAncSal1 = (short)(0) ;
      n3122ArtAncSal1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3122ArtAncSal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3122ArtAncSal1), 4, 0));
      A3123ArtAncSal2 = (short)(0) ;
      n3123ArtAncSal2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3123ArtAncSal2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3123ArtAncSal2), 4, 0));
      A3124ArtAncSal3 = (short)(0) ;
      n3124ArtAncSal3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3124ArtAncSal3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3124ArtAncSal3), 4, 0));
      A3125ArtGraAca2 = (short)(0) ;
      n3125ArtGraAca2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3125ArtGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3125ArtGraAca2), 4, 0));
      A3126ArtGraCru2 = (short)(0) ;
      n3126ArtGraCru2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3126ArtGraCru2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3126ArtGraCru2), 4, 0));
      A4295ClasCod = (short)(0) ;
      n4295ClasCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
      A4297ArtPmPPza = DecimalUtil.ZERO ;
      n4297ArtPmPPza = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4297ArtPmPPza", GXutil.ltrimstr( A4297ArtPmPPza, 9, 2));
      A4607ArtRb = (short)(0) ;
      n4607ArtRb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4607ArtRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4607ArtRb), 4, 0));
      A4608TipArtClas = "" ;
      n4608TipArtClas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4608TipArtClas", A4608TipArtClas);
      A4296ClasDsc = "" ;
      n4296ClasDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4296ClasDsc", A4296ClasDsc);
      A6660ArtFacTor = DecimalUtil.ZERO ;
      n6660ArtFacTor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6660ArtFacTor", GXutil.ltrimstr( A6660ArtFacTor, 6, 2));
      A4353ArtUsrCod = "" ;
      n4353ArtUsrCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4353ArtUsrCod", A4353ArtUsrCod);
      A4354ArtFecMod = GXutil.nullDate() ;
      n4354ArtFecMod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4354ArtFecMod", localUtil.format(A4354ArtFecMod, "99/99/9999"));
      A66ArtCorOri = httpContext.getMessage( "N", "") ;
      n66ArtCorOri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A66ArtCorOri", A66ArtCorOri);
      A70ArtEncOri = httpContext.getMessage( "N", "") ;
      n70ArtEncOri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A70ArtEncOri", A70ArtEncOri);
      A73ArtEti = "" ;
      n73ArtEti = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A73ArtEti", A73ArtEti);
      A117ArtUrg = (byte)(0) ;
      n117ArtUrg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A117ArtUrg", GXutil.str( A117ArtUrg, 1, 0));
      A5741ArtComer = "*" ;
      n5741ArtComer = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5741ArtComer", A5741ArtComer);
      A967ArtNMtr = "*" ;
      n967ArtNMtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A967ArtNMtr", A967ArtNMtr);
      A3683ArtFecCre = Gx_date ;
      n3683ArtFecCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3683ArtFecCre", localUtil.format(A3683ArtFecCre, "99/99/99"));
      Z69ArtDsc = "" ;
      Z87ArtMat = "" ;
      Z1148ArtPml = (short)(0) ;
      Z78ArtGraCru = (short)(0) ;
      Z68ArtCruMin = (short)(0) ;
      Z67ArtCruMax = (short)(0) ;
      Z63ArtAcaMin = (short)(0) ;
      Z62ArtAcaMax = (short)(0) ;
      Z95ArtRen = DecimalUtil.ZERO ;
      Z101ArtTipPle = "" ;
      Z100ArtTipLar = "" ;
      Z66ArtCorOri = "" ;
      Z70ArtEncOri = "" ;
      Z96ArtSua = "" ;
      Z64ArtAcaQui = "" ;
      Z73ArtEti = "" ;
      Z117ArtUrg = (byte)(0) ;
      Z88ArtMer = DecimalUtil.ZERO ;
      Z105ArtTra1 = "" ;
      Z106ArtTra2 = "" ;
      Z107ArtTra3 = "" ;
      Z108ArtTraP1 = (short)(0) ;
      Z109ArtTraP2 = (short)(0) ;
      Z110ArtTraP3 = (short)(0) ;
      Z111ArtUrd1 = "" ;
      Z112ArtUrd2 = "" ;
      Z113ArtUrd3 = "" ;
      Z114ArtUrdP1 = (short)(0) ;
      Z115ArtUrdP2 = (short)(0) ;
      Z116ArtUrdP3 = (short)(0) ;
      Z92ArtPreKgm = DecimalUtil.ZERO ;
      Z93ArtPreMtr = DecimalUtil.ZERO ;
      Z91ArtPreDef = "" ;
      Z1229ArtEncCom = (short)(0) ;
      Z1230ArtEncAnh = (short)(0) ;
      Z1903ArtGraAca = (short)(0) ;
      Z1905ArtRdoA = DecimalUtil.ZERO ;
      Z1904ArtRdoN = DecimalUtil.ZERO ;
      Z2791ArtFacAbs = DecimalUtil.ZERO ;
      Z2834ArtPle2 = "" ;
      Z3121ArtNumCor = (short)(0) ;
      Z3122ArtAncSal1 = (short)(0) ;
      Z3123ArtAncSal2 = (short)(0) ;
      Z3124ArtAncSal3 = (short)(0) ;
      Z3125ArtGraAca2 = (short)(0) ;
      Z3126ArtGraCru2 = (short)(0) ;
      Z4297ArtPmPPza = DecimalUtil.ZERO ;
      Z4607ArtRb = (short)(0) ;
      Z6660ArtFacTor = DecimalUtil.ZERO ;
      Z5741ArtComer = "" ;
      Z967ArtNMtr = "" ;
      Z4353ArtUsrCod = "" ;
      Z4354ArtFecMod = GXutil.nullDate() ;
      Z3683ArtFecCre = GXutil.nullDate() ;
      Z829TipArtCod = (short)(0) ;
      Z4295ClasCod = (short)(0) ;
   }

   public void initAllLP10( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A65ArtCod = "" ;
      n65ArtCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      initializeNonKeyLP10( ) ;
   }

   public void standaloneModalInsert( )
   {
      AV59Modo = iV59Modo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Modo", AV59Modo);
      A66ArtCorOri = i66ArtCorOri ;
      n66ArtCorOri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A66ArtCorOri", A66ArtCorOri);
      A70ArtEncOri = i70ArtEncOri ;
      n70ArtEncOri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A70ArtEncOri", A70ArtEncOri);
      A5741ArtComer = i5741ArtComer ;
      n5741ArtComer = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5741ArtComer", A5741ArtComer);
      A967ArtNMtr = i967ArtNMtr ;
      n967ArtNMtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A967ArtNMtr", A967ArtNMtr);
      A3683ArtFecCre = i3683ArtFecCre ;
      n3683ArtFecCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3683ArtFecCre", localUtil.format(A3683ArtFecCre, "99/99/99"));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241563267", true, true);
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
      httpContext.AddJavascriptSource("tarticl.js", "?20268241563268", false, true);
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtArtCod_Internalname = "ARTCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtArtMat_Internalname = "ARTMAT" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtTipArtCod_Internalname = "TIPARTCOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtTipArtDsc_Internalname = "TIPARTDSC" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtArtPml_Internalname = "ARTPML" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtArtGraCru_Internalname = "ARTGRACRU" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtArtCruMin_Internalname = "ARTCRUMIN" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtArtCruMax_Internalname = "ARTCRUMAX" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtArtAcaMin_Internalname = "ARTACAMIN" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtArtAcaMax_Internalname = "ARTACAMAX" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtArtRen_Internalname = "ARTREN" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtArtTipPle_Internalname = "ARTTIPPLE" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtArtTipLar_Internalname = "ARTTIPLAR" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      chkArtCorOri.setInternalname( "ARTCORORI" );
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      chkArtEncOri.setInternalname( "ARTENCORI" );
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtArtSua_Internalname = "ARTSUA" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtArtAcaQui_Internalname = "ARTACAQUI" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtArtEti_Internalname = "ARTETI" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtCliEti_Internalname = "CLIETI" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtCliUrg_Internalname = "CLIURG" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtArtUrg_Internalname = "ARTURG" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtArtMer_Internalname = "ARTMER" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtArtTra1_Internalname = "ARTTRA1" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtArtTra2_Internalname = "ARTTRA2" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtArtTra3_Internalname = "ARTTRA3" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtArtTraP1_Internalname = "ARTTRAP1" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtArtTraP2_Internalname = "ARTTRAP2" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtArtTraP3_Internalname = "ARTTRAP3" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtArtUrd1_Internalname = "ARTURD1" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtArtUrd2_Internalname = "ARTURD2" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtArtUrd3_Internalname = "ARTURD3" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtArtUrdP1_Internalname = "ARTURDP1" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtArtUrdP2_Internalname = "ARTURDP2" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtArtUrdP3_Internalname = "ARTURDP3" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtArtPreKgm_Internalname = "ARTPREKGM" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      edtArtPreMtr_Internalname = "ARTPREMTR" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      edtArtPreDef_Internalname = "ARTPREDEF" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      edtArtEncCom_Internalname = "ARTENCCOM" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      edtArtEncAnh_Internalname = "ARTENCANH" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      edtArtGraAca_Internalname = "ARTGRAACA" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      edtArtRdoA_Internalname = "ARTRDOA" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      edtArtRdoN_Internalname = "ARTRDON" ;
      lblTextblock48_Internalname = "TEXTBLOCK48" ;
      edtArtFacAbs_Internalname = "ARTFACABS" ;
      lblTextblock49_Internalname = "TEXTBLOCK49" ;
      edtArtPle2_Internalname = "ARTPLE2" ;
      lblTextblock50_Internalname = "TEXTBLOCK50" ;
      edtArtNumCor_Internalname = "ARTNUMCOR" ;
      lblTextblock51_Internalname = "TEXTBLOCK51" ;
      edtArtAncSal1_Internalname = "ARTANCSAL1" ;
      lblTextblock52_Internalname = "TEXTBLOCK52" ;
      edtArtAncSal2_Internalname = "ARTANCSAL2" ;
      lblTextblock53_Internalname = "TEXTBLOCK53" ;
      edtArtAncSal3_Internalname = "ARTANCSAL3" ;
      lblTextblock54_Internalname = "TEXTBLOCK54" ;
      edtArtGraAca2_Internalname = "ARTGRAACA2" ;
      lblTextblock55_Internalname = "TEXTBLOCK55" ;
      edtArtGraCru2_Internalname = "ARTGRACRU2" ;
      lblTextblock56_Internalname = "TEXTBLOCK56" ;
      edtClasCod_Internalname = "CLASCOD" ;
      lblTextblock57_Internalname = "TEXTBLOCK57" ;
      edtArtPmPPza_Internalname = "ARTPMPPZA" ;
      lblTextblock58_Internalname = "TEXTBLOCK58" ;
      edtArtRb_Internalname = "ARTRB" ;
      lblTextblock59_Internalname = "TEXTBLOCK59" ;
      edtTipArtClas_Internalname = "TIPARTCLAS" ;
      lblTextblock60_Internalname = "TEXTBLOCK60" ;
      edtClasDsc_Internalname = "CLASDSC" ;
      lblTextblock61_Internalname = "TEXTBLOCK61" ;
      edtArtFacTor_Internalname = "ARTFACTOR" ;
      lblTextblock62_Internalname = "TEXTBLOCK62" ;
      edtArtComer_Internalname = "ARTCOMER" ;
      lblTextblock63_Internalname = "TEXTBLOCK63" ;
      edtArtNMtr_Internalname = "ARTNMTR" ;
      lblTextblock64_Internalname = "TEXTBLOCK64" ;
      edtArtUsrCod_Internalname = "ARTUSRCOD" ;
      lblTextblock65_Internalname = "TEXTBLOCK65" ;
      edtArtFecMod_Internalname = "ARTFECMOD" ;
      lblTextblock66_Internalname = "TEXTBLOCK66" ;
      edtArtFecCre_Internalname = "ARTFECCRE" ;
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
      Form.setCaption( httpContext.getMessage( "FICHA TECNICA ARTICULO", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtArtFecCre_Jsonclick = "" ;
      edtArtFecCre_Backcolor = (int)(0xFFFFFF) ;
      edtArtFecCre_Enabled = 1 ;
      edtArtFecMod_Jsonclick = "" ;
      edtArtFecMod_Backcolor = (int)(0xFFFFFF) ;
      edtArtFecMod_Enabled = 1 ;
      edtArtUsrCod_Jsonclick = "" ;
      edtArtUsrCod_Backcolor = (int)(0xFFFFFF) ;
      edtArtUsrCod_Enabled = 1 ;
      edtArtNMtr_Jsonclick = "" ;
      edtArtNMtr_Backcolor = (int)(0xFFFFFF) ;
      edtArtNMtr_Enabled = 1 ;
      edtArtComer_Jsonclick = "" ;
      edtArtComer_Backcolor = (int)(0xFFFFFF) ;
      edtArtComer_Enabled = 1 ;
      edtArtFacTor_Jsonclick = "" ;
      edtArtFacTor_Backcolor = (int)(0xFFFFFF) ;
      edtArtFacTor_Enabled = 1 ;
      edtClasDsc_Jsonclick = "" ;
      edtClasDsc_Backcolor = (int)(0xFFFFFF) ;
      edtClasDsc_Enabled = 0 ;
      edtTipArtClas_Jsonclick = "" ;
      edtTipArtClas_Backcolor = (int)(0xFFFFFF) ;
      edtTipArtClas_Enabled = 0 ;
      edtArtRb_Jsonclick = "" ;
      edtArtRb_Backcolor = (int)(0xFFFFFF) ;
      edtArtRb_Enabled = 1 ;
      edtArtPmPPza_Jsonclick = "" ;
      edtArtPmPPza_Backcolor = (int)(0xFFFFFF) ;
      edtArtPmPPza_Enabled = 1 ;
      edtClasCod_Jsonclick = "" ;
      edtClasCod_Backcolor = (int)(0xFFFFFF) ;
      edtClasCod_Enabled = 1 ;
      edtArtGraCru2_Jsonclick = "" ;
      edtArtGraCru2_Backcolor = (int)(0xFFFFFF) ;
      edtArtGraCru2_Enabled = 1 ;
      edtArtGraAca2_Jsonclick = "" ;
      edtArtGraAca2_Backcolor = (int)(0xFFFFFF) ;
      edtArtGraAca2_Enabled = 1 ;
      edtArtAncSal3_Jsonclick = "" ;
      edtArtAncSal3_Backcolor = (int)(0xFFFFFF) ;
      edtArtAncSal3_Enabled = 1 ;
      edtArtAncSal2_Jsonclick = "" ;
      edtArtAncSal2_Backcolor = (int)(0xFFFFFF) ;
      edtArtAncSal2_Enabled = 1 ;
      edtArtAncSal1_Jsonclick = "" ;
      edtArtAncSal1_Backcolor = (int)(0xFFFFFF) ;
      edtArtAncSal1_Enabled = 1 ;
      edtArtNumCor_Jsonclick = "" ;
      edtArtNumCor_Backcolor = (int)(0xFFFFFF) ;
      edtArtNumCor_Enabled = 1 ;
      edtArtPle2_Jsonclick = "" ;
      edtArtPle2_Backcolor = (int)(0xFFFFFF) ;
      edtArtPle2_Enabled = 1 ;
      edtArtFacAbs_Jsonclick = "" ;
      edtArtFacAbs_Backcolor = (int)(0xFFFFFF) ;
      edtArtFacAbs_Enabled = 1 ;
      edtArtRdoN_Jsonclick = "" ;
      edtArtRdoN_Backcolor = (int)(0xFFFFFF) ;
      edtArtRdoN_Enabled = 1 ;
      edtArtRdoA_Jsonclick = "" ;
      edtArtRdoA_Backcolor = (int)(0xFFFFFF) ;
      edtArtRdoA_Enabled = 1 ;
      edtArtGraAca_Jsonclick = "" ;
      edtArtGraAca_Backcolor = (int)(0xFFFFFF) ;
      edtArtGraAca_Enabled = 1 ;
      edtArtEncAnh_Jsonclick = "" ;
      edtArtEncAnh_Backcolor = (int)(0xFFFFFF) ;
      edtArtEncAnh_Enabled = 1 ;
      edtArtEncCom_Jsonclick = "" ;
      edtArtEncCom_Backcolor = (int)(0xFFFFFF) ;
      edtArtEncCom_Enabled = 1 ;
      edtArtPreDef_Jsonclick = "" ;
      edtArtPreDef_Backcolor = (int)(0xFFFFFF) ;
      edtArtPreDef_Enabled = 1 ;
      edtArtPreMtr_Jsonclick = "" ;
      edtArtPreMtr_Backcolor = (int)(0xFFFFFF) ;
      edtArtPreMtr_Enabled = 1 ;
      edtArtPreKgm_Jsonclick = "" ;
      edtArtPreKgm_Backcolor = (int)(0xFFFFFF) ;
      edtArtPreKgm_Enabled = 1 ;
      edtArtUrdP3_Jsonclick = "" ;
      edtArtUrdP3_Backcolor = (int)(0xFFFFFF) ;
      edtArtUrdP3_Enabled = 1 ;
      edtArtUrdP2_Jsonclick = "" ;
      edtArtUrdP2_Backcolor = (int)(0xFFFFFF) ;
      edtArtUrdP2_Enabled = 1 ;
      edtArtUrdP1_Jsonclick = "" ;
      edtArtUrdP1_Backcolor = (int)(0xFFFFFF) ;
      edtArtUrdP1_Enabled = 1 ;
      edtArtUrd3_Jsonclick = "" ;
      edtArtUrd3_Backcolor = (int)(0xFFFFFF) ;
      edtArtUrd3_Enabled = 1 ;
      edtArtUrd2_Jsonclick = "" ;
      edtArtUrd2_Backcolor = (int)(0xFFFFFF) ;
      edtArtUrd2_Enabled = 1 ;
      edtArtUrd1_Jsonclick = "" ;
      edtArtUrd1_Backcolor = (int)(0xFFFFFF) ;
      edtArtUrd1_Enabled = 1 ;
      edtArtTraP3_Jsonclick = "" ;
      edtArtTraP3_Backcolor = (int)(0xFFFFFF) ;
      edtArtTraP3_Enabled = 1 ;
      edtArtTraP2_Jsonclick = "" ;
      edtArtTraP2_Backcolor = (int)(0xFFFFFF) ;
      edtArtTraP2_Enabled = 1 ;
      edtArtTraP1_Jsonclick = "" ;
      edtArtTraP1_Backcolor = (int)(0xFFFFFF) ;
      edtArtTraP1_Enabled = 1 ;
      edtArtTra3_Jsonclick = "" ;
      edtArtTra3_Backcolor = (int)(0xFFFFFF) ;
      edtArtTra3_Enabled = 1 ;
      edtArtTra2_Jsonclick = "" ;
      edtArtTra2_Backcolor = (int)(0xFFFFFF) ;
      edtArtTra2_Enabled = 1 ;
      edtArtTra1_Jsonclick = "" ;
      edtArtTra1_Backcolor = (int)(0xFFFFFF) ;
      edtArtTra1_Enabled = 1 ;
      edtArtMer_Jsonclick = "" ;
      edtArtMer_Backcolor = (int)(0xFFFFFF) ;
      edtArtMer_Enabled = 1 ;
      edtArtUrg_Jsonclick = "" ;
      edtArtUrg_Backcolor = (int)(0xFFFFFF) ;
      edtArtUrg_Enabled = 1 ;
      edtCliUrg_Jsonclick = "" ;
      edtCliUrg_Backcolor = (int)(0xFFFFFF) ;
      edtCliUrg_Enabled = 0 ;
      edtCliEti_Jsonclick = "" ;
      edtCliEti_Backcolor = (int)(0xFFFFFF) ;
      edtCliEti_Enabled = 0 ;
      edtArtEti_Jsonclick = "" ;
      edtArtEti_Backcolor = (int)(0xFFFFFF) ;
      edtArtEti_Enabled = 1 ;
      edtArtAcaQui_Jsonclick = "" ;
      edtArtAcaQui_Backcolor = (int)(0xFFFFFF) ;
      edtArtAcaQui_Enabled = 1 ;
      edtArtSua_Jsonclick = "" ;
      edtArtSua_Backcolor = (int)(0xFFFFFF) ;
      edtArtSua_Enabled = 1 ;
      chkArtEncOri.setIBackground( (int)(0xFFFFFF) );
      chkArtEncOri.setEnabled( 1 );
      chkArtCorOri.setIBackground( (int)(0xFFFFFF) );
      chkArtCorOri.setEnabled( 1 );
      edtArtTipLar_Jsonclick = "" ;
      edtArtTipLar_Backcolor = (int)(0xFFFFFF) ;
      edtArtTipLar_Enabled = 1 ;
      edtArtTipPle_Jsonclick = "" ;
      edtArtTipPle_Backcolor = (int)(0xFFFFFF) ;
      edtArtTipPle_Enabled = 1 ;
      edtArtRen_Jsonclick = "" ;
      edtArtRen_Backcolor = (int)(0xFFFFFF) ;
      edtArtRen_Enabled = 1 ;
      edtArtAcaMax_Jsonclick = "" ;
      edtArtAcaMax_Backcolor = (int)(0xFFFFFF) ;
      edtArtAcaMax_Enabled = 1 ;
      edtArtAcaMin_Jsonclick = "" ;
      edtArtAcaMin_Backcolor = (int)(0xFFFFFF) ;
      edtArtAcaMin_Enabled = 1 ;
      edtArtCruMax_Jsonclick = "" ;
      edtArtCruMax_Backcolor = (int)(0xFFFFFF) ;
      edtArtCruMax_Enabled = 1 ;
      edtArtCruMin_Jsonclick = "" ;
      edtArtCruMin_Backcolor = (int)(0xFFFFFF) ;
      edtArtCruMin_Enabled = 1 ;
      edtArtGraCru_Jsonclick = "" ;
      edtArtGraCru_Backcolor = (int)(0xFFFFFF) ;
      edtArtGraCru_Enabled = 1 ;
      edtArtPml_Jsonclick = "" ;
      edtArtPml_Backcolor = (int)(0xFFFFFF) ;
      edtArtPml_Enabled = 1 ;
      edtArtDsc_Jsonclick = "" ;
      edtArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtArtDsc_Enabled = 1 ;
      edtTipArtDsc_Jsonclick = "" ;
      edtTipArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtTipArtDsc_Enabled = 0 ;
      edtTipArtCod_Jsonclick = "" ;
      edtTipArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtTipArtCod_Enabled = 1 ;
      edtArtMat_Jsonclick = "" ;
      edtArtMat_Backcolor = (int)(0xFFFFFF) ;
      edtArtMat_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtArtCod_Enabled = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
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

   public void xc_17_LP10( String A396EmprCod ,
                           int A252CliCod ,
                           String A65ArtCod )
   {
      if ( true /* After */ )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int2[0] = A252CliCod ;
         GXv_char1[0] = A65ArtCod ;
         new app.ppartico(remoteHandle, context).execute( GXv_char3, GXv_int2, GXv_char1) ;
         A396EmprCod = GXv_char3[0] ;
         A252CliCod = GXv_int2[0] ;
         A65ArtCod = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A65ArtCod))+"\"") ;
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
      chkArtCorOri.setName( "ARTCORORI" );
      chkArtCorOri.setWebtags( "" );
      chkArtCorOri.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkArtCorOri.getInternalname(), "TitleCaption", chkArtCorOri.getCaption(), true);
      chkArtCorOri.setCheckedValue( "N" );
      if ( isIns( ) && (GXutil.strcmp("", A66ArtCorOri)==0) )
      {
         A66ArtCorOri = httpContext.getMessage( "N", "") ;
         n66ArtCorOri = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A66ArtCorOri", A66ArtCorOri);
      }
      chkArtEncOri.setName( "ARTENCORI" );
      chkArtEncOri.setWebtags( "" );
      chkArtEncOri.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkArtEncOri.getInternalname(), "TitleCaption", chkArtEncOri.getCaption(), true);
      chkArtEncOri.setCheckedValue( "N" );
      if ( isIns( ) && (GXutil.strcmp("", A70ArtEncOri)==0) )
      {
         A70ArtEncOri = httpContext.getMessage( "N", "") ;
         n70ArtEncOri = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A70ArtEncOri", A70ArtEncOri);
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T00LP19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00LP19_A407EmprNom[0] ;
      n407EmprNom = T00LP19_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(17);
      /* Using cursor T00LP20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T00LP20_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A272CliEti = T00LP20_A272CliEti[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A272CliEti", A272CliEti);
      A306CliUrg = T00LP20_A306CliUrg[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A306CliUrg", GXutil.str( A306CliUrg, 1, 0));
      pr_default.close(18);
      GX_FocusControl = edtArtMat_Internalname ;
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
      n407EmprNom = false ;
      /* Using cursor T00LP19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T00LP19_A407EmprNom[0] ;
      n407EmprNom = T00LP19_n407EmprNom[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      n73ArtEti = false ;
      n117ArtUrg = false ;
      /* Using cursor T00LP20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T00LP20_A279CliNom[0] ;
      A272CliEti = T00LP20_A272CliEti[0] ;
      A306CliUrg = T00LP20_A306CliUrg[0] ;
      pr_default.close(18);
      if ( isIns( )  && (GXutil.strcmp("", A73ArtEti)==0) && ( Gx_BScreen == 0 ) )
      {
         A73ArtEti = A272CliEti ;
         n73ArtEti = false ;
      }
      if ( isIns( )  && (0==A117ArtUrg) && ( Gx_BScreen == 0 ) )
      {
         A117ArtUrg = A306CliUrg ;
         n117ArtUrg = false ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A272CliEti", GXutil.rtrim( A272CliEti));
      httpContext.ajax_rsp_assign_attri("", false, "A306CliUrg", GXutil.ltrim( localUtil.ntoc( A306CliUrg, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A73ArtEti", GXutil.rtrim( A73ArtEti));
      httpContext.ajax_rsp_assign_attri("", false, "A117ArtUrg", GXutil.ltrim( localUtil.ntoc( A117ArtUrg, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Artcod( )
   {
      n252CliCod = false ;
      n65ArtCod = false ;
      n66ArtCorOri = false ;
      n70ArtEncOri = false ;
      n5741ArtComer = false ;
      n967ArtNMtr = false ;
      n3683ArtFecCre = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      A66ArtCorOri = ((GXutil.strcmp(GXutil.rtrim( A66ArtCorOri), "S")==0) ? "S" : "N") ;
      n66ArtCorOri = false ;
      A70ArtEncOri = ((GXutil.strcmp(GXutil.rtrim( A70ArtEncOri), "S")==0) ? "S" : "N") ;
      n70ArtEncOri = false ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A87ArtMat", GXutil.rtrim( A87ArtMat));
      httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrim( localUtil.ntoc( A829TipArtCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1148ArtPml", GXutil.ltrim( localUtil.ntoc( A1148ArtPml, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A78ArtGraCru", GXutil.ltrim( localUtil.ntoc( A78ArtGraCru, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A68ArtCruMin", GXutil.ltrim( localUtil.ntoc( A68ArtCruMin, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A67ArtCruMax", GXutil.ltrim( localUtil.ntoc( A67ArtCruMax, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A63ArtAcaMin", GXutil.ltrim( localUtil.ntoc( A63ArtAcaMin, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A62ArtAcaMax", GXutil.ltrim( localUtil.ntoc( A62ArtAcaMax, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A95ArtRen", GXutil.ltrim( localUtil.ntoc( A95ArtRen, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A101ArtTipPle", GXutil.rtrim( A101ArtTipPle));
      httpContext.ajax_rsp_assign_attri("", false, "A100ArtTipLar", GXutil.rtrim( A100ArtTipLar));
      httpContext.ajax_rsp_assign_attri("", false, "A66ArtCorOri", GXutil.rtrim( A66ArtCorOri));
      httpContext.ajax_rsp_assign_attri("", false, "A70ArtEncOri", GXutil.rtrim( A70ArtEncOri));
      httpContext.ajax_rsp_assign_attri("", false, "A96ArtSua", GXutil.rtrim( A96ArtSua));
      httpContext.ajax_rsp_assign_attri("", false, "A64ArtAcaQui", GXutil.rtrim( A64ArtAcaQui));
      httpContext.ajax_rsp_assign_attri("", false, "A88ArtMer", GXutil.ltrim( localUtil.ntoc( A88ArtMer, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A105ArtTra1", GXutil.rtrim( A105ArtTra1));
      httpContext.ajax_rsp_assign_attri("", false, "A106ArtTra2", GXutil.rtrim( A106ArtTra2));
      httpContext.ajax_rsp_assign_attri("", false, "A107ArtTra3", GXutil.rtrim( A107ArtTra3));
      httpContext.ajax_rsp_assign_attri("", false, "A108ArtTraP1", GXutil.ltrim( localUtil.ntoc( A108ArtTraP1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A109ArtTraP2", GXutil.ltrim( localUtil.ntoc( A109ArtTraP2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A110ArtTraP3", GXutil.ltrim( localUtil.ntoc( A110ArtTraP3, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A111ArtUrd1", GXutil.rtrim( A111ArtUrd1));
      httpContext.ajax_rsp_assign_attri("", false, "A112ArtUrd2", GXutil.rtrim( A112ArtUrd2));
      httpContext.ajax_rsp_assign_attri("", false, "A113ArtUrd3", GXutil.rtrim( A113ArtUrd3));
      httpContext.ajax_rsp_assign_attri("", false, "A114ArtUrdP1", GXutil.ltrim( localUtil.ntoc( A114ArtUrdP1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A115ArtUrdP2", GXutil.ltrim( localUtil.ntoc( A115ArtUrdP2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A116ArtUrdP3", GXutil.ltrim( localUtil.ntoc( A116ArtUrdP3, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A92ArtPreKgm", GXutil.ltrim( localUtil.ntoc( A92ArtPreKgm, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A93ArtPreMtr", GXutil.ltrim( localUtil.ntoc( A93ArtPreMtr, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A91ArtPreDef", GXutil.rtrim( A91ArtPreDef));
      httpContext.ajax_rsp_assign_attri("", false, "A1229ArtEncCom", GXutil.ltrim( localUtil.ntoc( A1229ArtEncCom, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1230ArtEncAnh", GXutil.ltrim( localUtil.ntoc( A1230ArtEncAnh, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1903ArtGraAca", GXutil.ltrim( localUtil.ntoc( A1903ArtGraAca, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1905ArtRdoA", GXutil.ltrim( localUtil.ntoc( A1905ArtRdoA, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1904ArtRdoN", GXutil.ltrim( localUtil.ntoc( A1904ArtRdoN, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2791ArtFacAbs", GXutil.ltrim( localUtil.ntoc( A2791ArtFacAbs, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2834ArtPle2", GXutil.rtrim( A2834ArtPle2));
      httpContext.ajax_rsp_assign_attri("", false, "A3121ArtNumCor", GXutil.ltrim( localUtil.ntoc( A3121ArtNumCor, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3122ArtAncSal1", GXutil.ltrim( localUtil.ntoc( A3122ArtAncSal1, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3123ArtAncSal2", GXutil.ltrim( localUtil.ntoc( A3123ArtAncSal2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3124ArtAncSal3", GXutil.ltrim( localUtil.ntoc( A3124ArtAncSal3, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3125ArtGraAca2", GXutil.ltrim( localUtil.ntoc( A3125ArtGraAca2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3126ArtGraCru2", GXutil.ltrim( localUtil.ntoc( A3126ArtGraCru2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrim( localUtil.ntoc( A4295ClasCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4297ArtPmPPza", GXutil.ltrim( localUtil.ntoc( A4297ArtPmPPza, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4607ArtRb", GXutil.ltrim( localUtil.ntoc( A4607ArtRb, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6660ArtFacTor", GXutil.ltrim( localUtil.ntoc( A6660ArtFacTor, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5741ArtComer", GXutil.rtrim( A5741ArtComer));
      httpContext.ajax_rsp_assign_attri("", false, "A967ArtNMtr", GXutil.rtrim( A967ArtNMtr));
      httpContext.ajax_rsp_assign_attri("", false, "A4353ArtUsrCod", GXutil.rtrim( A4353ArtUsrCod));
      httpContext.ajax_rsp_assign_attri("", false, "A4354ArtFecMod", localUtil.format(A4354ArtFecMod, "99/99/9999"));
      httpContext.ajax_rsp_assign_attri("", false, "A3683ArtFecCre", localUtil.format(A3683ArtFecCre, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A830TipArtDsc", GXutil.rtrim( A830TipArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4608TipArtClas", GXutil.rtrim( A4608TipArtClas));
      httpContext.ajax_rsp_assign_attri("", false, "A4296ClasDsc", GXutil.rtrim( A4296ClasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A272CliEti", GXutil.rtrim( A272CliEti));
      httpContext.ajax_rsp_assign_attri("", false, "A306CliUrg", GXutil.ltrim( localUtil.ntoc( A306CliUrg, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A117ArtUrg", GXutil.ltrim( localUtil.ntoc( A117ArtUrg, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A73ArtEti", GXutil.rtrim( A73ArtEti));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z87ArtMat", GXutil.rtrim( Z87ArtMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z829TipArtCod", GXutil.ltrim( localUtil.ntoc( Z829TipArtCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1148ArtPml", GXutil.ltrim( localUtil.ntoc( Z1148ArtPml, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z78ArtGraCru", GXutil.ltrim( localUtil.ntoc( Z78ArtGraCru, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z68ArtCruMin", GXutil.ltrim( localUtil.ntoc( Z68ArtCruMin, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z67ArtCruMax", GXutil.ltrim( localUtil.ntoc( Z67ArtCruMax, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z63ArtAcaMin", GXutil.ltrim( localUtil.ntoc( Z63ArtAcaMin, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z62ArtAcaMax", GXutil.ltrim( localUtil.ntoc( Z62ArtAcaMax, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z95ArtRen", GXutil.ltrim( localUtil.ntoc( Z95ArtRen, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z101ArtTipPle", GXutil.rtrim( Z101ArtTipPle));
      app.GxWebStd.gx_hidden_field( httpContext, "Z100ArtTipLar", GXutil.rtrim( Z100ArtTipLar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z66ArtCorOri", GXutil.rtrim( Z66ArtCorOri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z70ArtEncOri", GXutil.rtrim( Z70ArtEncOri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z96ArtSua", GXutil.rtrim( Z96ArtSua));
      app.GxWebStd.gx_hidden_field( httpContext, "Z64ArtAcaQui", GXutil.rtrim( Z64ArtAcaQui));
      app.GxWebStd.gx_hidden_field( httpContext, "Z88ArtMer", GXutil.ltrim( localUtil.ntoc( Z88ArtMer, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z105ArtTra1", GXutil.rtrim( Z105ArtTra1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z106ArtTra2", GXutil.rtrim( Z106ArtTra2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z107ArtTra3", GXutil.rtrim( Z107ArtTra3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z108ArtTraP1", GXutil.ltrim( localUtil.ntoc( Z108ArtTraP1, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z109ArtTraP2", GXutil.ltrim( localUtil.ntoc( Z109ArtTraP2, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z110ArtTraP3", GXutil.ltrim( localUtil.ntoc( Z110ArtTraP3, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z111ArtUrd1", GXutil.rtrim( Z111ArtUrd1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z112ArtUrd2", GXutil.rtrim( Z112ArtUrd2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z113ArtUrd3", GXutil.rtrim( Z113ArtUrd3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z114ArtUrdP1", GXutil.ltrim( localUtil.ntoc( Z114ArtUrdP1, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z115ArtUrdP2", GXutil.ltrim( localUtil.ntoc( Z115ArtUrdP2, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z116ArtUrdP3", GXutil.ltrim( localUtil.ntoc( Z116ArtUrdP3, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z92ArtPreKgm", GXutil.ltrim( localUtil.ntoc( Z92ArtPreKgm, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z93ArtPreMtr", GXutil.ltrim( localUtil.ntoc( Z93ArtPreMtr, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z91ArtPreDef", GXutil.rtrim( Z91ArtPreDef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1229ArtEncCom", GXutil.ltrim( localUtil.ntoc( Z1229ArtEncCom, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1230ArtEncAnh", GXutil.ltrim( localUtil.ntoc( Z1230ArtEncAnh, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1903ArtGraAca", GXutil.ltrim( localUtil.ntoc( Z1903ArtGraAca, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1905ArtRdoA", GXutil.ltrim( localUtil.ntoc( Z1905ArtRdoA, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1904ArtRdoN", GXutil.ltrim( localUtil.ntoc( Z1904ArtRdoN, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2791ArtFacAbs", GXutil.ltrim( localUtil.ntoc( Z2791ArtFacAbs, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2834ArtPle2", GXutil.rtrim( Z2834ArtPle2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3121ArtNumCor", GXutil.ltrim( localUtil.ntoc( Z3121ArtNumCor, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3122ArtAncSal1", GXutil.ltrim( localUtil.ntoc( Z3122ArtAncSal1, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3123ArtAncSal2", GXutil.ltrim( localUtil.ntoc( Z3123ArtAncSal2, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3124ArtAncSal3", GXutil.ltrim( localUtil.ntoc( Z3124ArtAncSal3, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3125ArtGraAca2", GXutil.ltrim( localUtil.ntoc( Z3125ArtGraAca2, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3126ArtGraCru2", GXutil.ltrim( localUtil.ntoc( Z3126ArtGraCru2, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4295ClasCod", GXutil.ltrim( localUtil.ntoc( Z4295ClasCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4297ArtPmPPza", GXutil.ltrim( localUtil.ntoc( Z4297ArtPmPPza, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4607ArtRb", GXutil.ltrim( localUtil.ntoc( Z4607ArtRb, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6660ArtFacTor", GXutil.ltrim( localUtil.ntoc( Z6660ArtFacTor, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5741ArtComer", GXutil.rtrim( Z5741ArtComer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z967ArtNMtr", GXutil.rtrim( Z967ArtNMtr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4353ArtUsrCod", GXutil.rtrim( Z4353ArtUsrCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4354ArtFecMod", localUtil.format(Z4354ArtFecMod, "99/99/9999"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3683ArtFecCre", localUtil.format(Z3683ArtFecCre, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z830TipArtDsc", GXutil.rtrim( Z830TipArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4608TipArtClas", GXutil.rtrim( Z4608TipArtClas));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4296ClasDsc", GXutil.rtrim( Z4296ClasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z272CliEti", GXutil.rtrim( Z272CliEti));
      app.GxWebStd.gx_hidden_field( httpContext, "Z306CliUrg", GXutil.ltrim( localUtil.ntoc( Z306CliUrg, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z117ArtUrg", GXutil.ltrim( localUtil.ntoc( Z117ArtUrg, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z73ArtEti", GXutil.rtrim( Z73ArtEti));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Tipartcod( )
   {
      n830TipArtDsc = false ;
      n4608TipArtClas = false ;
      /* Using cursor T00LP21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Short.valueOf(A829TipArtCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPART", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A830TipArtDsc = T00LP21_A830TipArtDsc[0] ;
      n830TipArtDsc = T00LP21_n830TipArtDsc[0] ;
      A4608TipArtClas = T00LP21_A4608TipArtClas[0] ;
      n4608TipArtClas = T00LP21_n4608TipArtClas[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A830TipArtDsc", GXutil.rtrim( A830TipArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4608TipArtClas", GXutil.rtrim( A4608TipArtClas));
   }

   public void valid_Clascod( )
   {
      n4295ClasCod = false ;
      n4296ClasDsc = false ;
      n69ArtDsc = false ;
      /* Using cursor T00LP22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A4295ClasCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLAPEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLASCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A4296ClasDsc = T00LP22_A4296ClasDsc[0] ;
      n4296ClasDsc = T00LP22_n4296ClasDsc[0] ;
      pr_default.close(20);
      if ( ( A4295ClasCod > 0 ) && true /* After */ && isIns( )  )
      {
         A69ArtDsc = A4296ClasDsc ;
         n69ArtDsc = false ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4296ClasDsc", GXutil.rtrim( A4296ClasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'AV65CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV66ArtCod',fld:'vARTCOD',pic:''},{av:'AV67Mode2',fld:'vMODE2',pic:''},{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV59Modo',fld:'vMODO',pic:''},{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A272CliEti',fld:'CLIETI',pic:'@!'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A306CliUrg',fld:'CLIURG',pic:'9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A73ArtEti',fld:'ARTETI',pic:'@!'},{av:'A117ArtUrg',fld:'ARTURG',pic:'9'},{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A272CliEti',fld:'CLIETI',pic:'@!'},{av:'A306CliUrg',fld:'CLIURG',pic:'9'},{av:'A73ArtEti',fld:'ARTETI',pic:'@!'},{av:'A117ArtUrg',fld:'ARTURG',pic:'9'},{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'AV66ArtCod',fld:'vARTCOD',pic:''},{av:'AV67Mode2',fld:'vMODE2',pic:''},{av:'AV65CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_date',fld:'vTODAY',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV59Modo',fld:'vMODO',pic:''},{av:'A5741ArtComer',fld:'ARTCOMER',pic:''},{av:'A967ArtNMtr',fld:'ARTNMTR',pic:''},{av:'A3683ArtFecCre',fld:'ARTFECCRE',pic:''},{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTCOD",",oparms:[{av:'A87ArtMat',fld:'ARTMAT',pic:''},{av:'A829TipArtCod',fld:'TIPARTCOD',pic:'ZZZ9'},{av:'A1148ArtPml',fld:'ARTPML',pic:'ZZZ9'},{av:'A78ArtGraCru',fld:'ARTGRACRU',pic:'ZZZ9'},{av:'A68ArtCruMin',fld:'ARTCRUMIN',pic:'ZZ9'},{av:'A67ArtCruMax',fld:'ARTCRUMAX',pic:'ZZ9'},{av:'A63ArtAcaMin',fld:'ARTACAMIN',pic:'ZZ9'},{av:'A62ArtAcaMax',fld:'ARTACAMAX',pic:'ZZ9'},{av:'A95ArtRen',fld:'ARTREN',pic:'ZZ9.99'},{av:'A101ArtTipPle',fld:'ARTTIPPLE',pic:''},{av:'A100ArtTipLar',fld:'ARTTIPLAR',pic:''},{av:'A96ArtSua',fld:'ARTSUA',pic:''},{av:'A64ArtAcaQui',fld:'ARTACAQUI',pic:''},{av:'A88ArtMer',fld:'ARTMER',pic:'Z9.99'},{av:'A105ArtTra1',fld:'ARTTRA1',pic:''},{av:'A106ArtTra2',fld:'ARTTRA2',pic:''},{av:'A107ArtTra3',fld:'ARTTRA3',pic:''},{av:'A108ArtTraP1',fld:'ARTTRAP1',pic:'ZZ9'},{av:'A109ArtTraP2',fld:'ARTTRAP2',pic:'ZZ9'},{av:'A110ArtTraP3',fld:'ARTTRAP3',pic:'ZZ9'},{av:'A111ArtUrd1',fld:'ARTURD1',pic:''},{av:'A112ArtUrd2',fld:'ARTURD2',pic:''},{av:'A113ArtUrd3',fld:'ARTURD3',pic:''},{av:'A114ArtUrdP1',fld:'ARTURDP1',pic:'ZZ9'},{av:'A115ArtUrdP2',fld:'ARTURDP2',pic:'ZZ9'},{av:'A116ArtUrdP3',fld:'ARTURDP3',pic:'ZZ9'},{av:'A92ArtPreKgm',fld:'ARTPREKGM',pic:'ZZZZZZ9.999'},{av:'A93ArtPreMtr',fld:'ARTPREMTR',pic:'ZZZZZZ9.999'},{av:'A91ArtPreDef',fld:'ARTPREDEF',pic:'@!'},{av:'A1229ArtEncCom',fld:'ARTENCCOM',pic:'ZZZ9'},{av:'A1230ArtEncAnh',fld:'ARTENCANH',pic:'ZZZ9'},{av:'A1903ArtGraAca',fld:'ARTGRAACA',pic:'ZZZ9'},{av:'A1905ArtRdoA',fld:'ARTRDOA',pic:'ZZ9.99'},{av:'A1904ArtRdoN',fld:'ARTRDON',pic:'ZZ9.99'},{av:'A2791ArtFacAbs',fld:'ARTFACABS',pic:'ZZ9.99'},{av:'A2834ArtPle2',fld:'ARTPLE2',pic:''},{av:'A3121ArtNumCor',fld:'ARTNUMCOR',pic:'ZZZ9'},{av:'A3122ArtAncSal1',fld:'ARTANCSAL1',pic:'ZZZ9'},{av:'A3123ArtAncSal2',fld:'ARTANCSAL2',pic:'ZZZ9'},{av:'A3124ArtAncSal3',fld:'ARTANCSAL3',pic:'ZZZ9'},{av:'A3125ArtGraAca2',fld:'ARTGRAACA2',pic:'ZZZ9'},{av:'A3126ArtGraCru2',fld:'ARTGRACRU2',pic:'ZZZ9'},{av:'A4295ClasCod',fld:'CLASCOD',pic:'ZZZ9'},{av:'A4297ArtPmPPza',fld:'ARTPMPPZA',pic:'ZZZZZ9.99'},{av:'A4607ArtRb',fld:'ARTRB',pic:'ZZZ9'},{av:'A6660ArtFacTor',fld:'ARTFACTOR',pic:'ZZ9.99'},{av:'A5741ArtComer',fld:'ARTCOMER',pic:''},{av:'A967ArtNMtr',fld:'ARTNMTR',pic:''},{av:'A4353ArtUsrCod',fld:'ARTUSRCOD',pic:''},{av:'A4354ArtFecMod',fld:'ARTFECMOD',pic:''},{av:'A3683ArtFecCre',fld:'ARTFECCRE',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A830TipArtDsc',fld:'TIPARTDSC',pic:''},{av:'A4608TipArtClas',fld:'TIPARTCLAS',pic:''},{av:'A4296ClasDsc',fld:'CLASDSC',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A272CliEti',fld:'CLIETI',pic:'@!'},{av:'A306CliUrg',fld:'CLIURG',pic:'9'},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A117ArtUrg',fld:'ARTURG',pic:'9'},{av:'A73ArtEti',fld:'ARTETI',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z87ArtMat'},{av:'Z829TipArtCod'},{av:'Z1148ArtPml'},{av:'Z78ArtGraCru'},{av:'Z68ArtCruMin'},{av:'Z67ArtCruMax'},{av:'Z63ArtAcaMin'},{av:'Z62ArtAcaMax'},{av:'Z95ArtRen'},{av:'Z101ArtTipPle'},{av:'Z100ArtTipLar'},{av:'Z66ArtCorOri'},{av:'Z70ArtEncOri'},{av:'Z96ArtSua'},{av:'Z64ArtAcaQui'},{av:'Z88ArtMer'},{av:'Z105ArtTra1'},{av:'Z106ArtTra2'},{av:'Z107ArtTra3'},{av:'Z108ArtTraP1'},{av:'Z109ArtTraP2'},{av:'Z110ArtTraP3'},{av:'Z111ArtUrd1'},{av:'Z112ArtUrd2'},{av:'Z113ArtUrd3'},{av:'Z114ArtUrdP1'},{av:'Z115ArtUrdP2'},{av:'Z116ArtUrdP3'},{av:'Z92ArtPreKgm'},{av:'Z93ArtPreMtr'},{av:'Z91ArtPreDef'},{av:'Z1229ArtEncCom'},{av:'Z1230ArtEncAnh'},{av:'Z1903ArtGraAca'},{av:'Z1905ArtRdoA'},{av:'Z1904ArtRdoN'},{av:'Z2791ArtFacAbs'},{av:'Z2834ArtPle2'},{av:'Z3121ArtNumCor'},{av:'Z3122ArtAncSal1'},{av:'Z3123ArtAncSal2'},{av:'Z3124ArtAncSal3'},{av:'Z3125ArtGraAca2'},{av:'Z3126ArtGraCru2'},{av:'Z4295ClasCod'},{av:'Z4297ArtPmPPza'},{av:'Z4607ArtRb'},{av:'Z6660ArtFacTor'},{av:'Z5741ArtComer'},{av:'Z967ArtNMtr'},{av:'Z4353ArtUsrCod'},{av:'Z4354ArtFecMod'},{av:'Z3683ArtFecCre'},{av:'Z407EmprNom'},{av:'Z830TipArtDsc'},{av:'Z4608TipArtClas'},{av:'Z4296ClasDsc'},{av:'Z279CliNom'},{av:'Z272CliEti'},{av:'Z306CliUrg'},{av:'Z69ArtDsc'},{av:'Z117ArtUrg'},{av:'Z73ArtEti'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'},{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTMAT","{handler:'valid_Artmat',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTMAT",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_TIPARTCOD","{handler:'valid_Tipartcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A829TipArtCod',fld:'TIPARTCOD',pic:'ZZZ9'},{av:'A830TipArtDsc',fld:'TIPARTDSC',pic:''},{av:'A4608TipArtClas',fld:'TIPARTCLAS',pic:''},{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_TIPARTCOD",",oparms:[{av:'A830TipArtDsc',fld:'TIPARTDSC',pic:''},{av:'A4608TipArtClas',fld:'TIPARTCLAS',pic:''},{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTDSC","{handler:'valid_Artdsc',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTDSC",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTPML","{handler:'valid_Artpml',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTPML",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTGRACRU","{handler:'valid_Artgracru',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTGRACRU",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTCRUMIN","{handler:'valid_Artcrumin',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTCRUMIN",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTCRUMAX","{handler:'valid_Artcrumax',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTCRUMAX",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTACAMIN","{handler:'valid_Artacamin',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTACAMIN",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTACAMAX","{handler:'valid_Artacamax',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTACAMAX",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTREN","{handler:'valid_Artren',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTREN",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTTIPPLE","{handler:'valid_Arttipple',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTTIPPLE",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTTIPLAR","{handler:'valid_Arttiplar',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTTIPLAR",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTCORORI","{handler:'valid_Artcorori',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTCORORI",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTENCORI","{handler:'valid_Artencori',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTENCORI",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTSUA","{handler:'valid_Artsua',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTSUA",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTACAQUI","{handler:'valid_Artacaqui',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTACAQUI",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTETI","{handler:'valid_Arteti',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTETI",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_CLIETI","{handler:'valid_Clieti',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_CLIETI",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_CLIURG","{handler:'valid_Cliurg',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_CLIURG",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTURG","{handler:'valid_Arturg',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTURG",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTMER","{handler:'valid_Artmer',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTMER",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTTRA1","{handler:'valid_Arttra1',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTTRA1",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTTRA2","{handler:'valid_Arttra2',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTTRA2",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTTRA3","{handler:'valid_Arttra3',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTTRA3",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTTRAP1","{handler:'valid_Arttrap1',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTTRAP1",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTTRAP2","{handler:'valid_Arttrap2',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTTRAP2",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTTRAP3","{handler:'valid_Arttrap3',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTTRAP3",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTURD1","{handler:'valid_Arturd1',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTURD1",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTURD2","{handler:'valid_Arturd2',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTURD2",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTURD3","{handler:'valid_Arturd3',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTURD3",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTURDP1","{handler:'valid_Arturdp1',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTURDP1",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTURDP2","{handler:'valid_Arturdp2',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTURDP2",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTURDP3","{handler:'valid_Arturdp3',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTURDP3",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTPREKGM","{handler:'valid_Artprekgm',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTPREKGM",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTPREMTR","{handler:'valid_Artpremtr',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTPREMTR",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTPREDEF","{handler:'valid_Artpredef',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTPREDEF",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTENCCOM","{handler:'valid_Artenccom',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTENCCOM",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTENCANH","{handler:'valid_Artencanh',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTENCANH",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTGRAACA","{handler:'valid_Artgraaca',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTGRAACA",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTRDOA","{handler:'valid_Artrdoa',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTRDOA",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTRDON","{handler:'valid_Artrdon',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTRDON",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTFACABS","{handler:'valid_Artfacabs',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTFACABS",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTPLE2","{handler:'valid_Artple2',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTPLE2",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTNUMCOR","{handler:'valid_Artnumcor',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTNUMCOR",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTANCSAL1","{handler:'valid_Artancsal1',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTANCSAL1",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTANCSAL2","{handler:'valid_Artancsal2',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTANCSAL2",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTANCSAL3","{handler:'valid_Artancsal3',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTANCSAL3",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTGRAACA2","{handler:'valid_Artgraaca2',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTGRAACA2",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTGRACRU2","{handler:'valid_Artgracru2',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTGRACRU2",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_CLASCOD","{handler:'valid_Clascod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4295ClasCod',fld:'CLASCOD',pic:'ZZZ9'},{av:'A4296ClasDsc',fld:'CLASDSC',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_CLASCOD",",oparms:[{av:'A4296ClasDsc',fld:'CLASDSC',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTPMPPZA","{handler:'valid_Artpmppza',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTPMPPZA",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTRB","{handler:'valid_Artrb',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTRB",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTFACTOR","{handler:'valid_Artfactor',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTFACTOR",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTCOMER","{handler:'valid_Artcomer',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTCOMER",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTNMTR","{handler:'valid_Artnmtr',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTNMTR",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTUSRCOD","{handler:'valid_Artusrcod',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTUSRCOD",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTFECMOD","{handler:'valid_Artfecmod',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTFECMOD",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
      setEventMetadata("VALID_ARTFECCRE","{handler:'valid_Artfeccre',iparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]");
      setEventMetadata("VALID_ARTFECCRE",",oparms:[{av:'A66ArtCorOri',fld:'ARTCORORI',pic:'@!'},{av:'A70ArtEncOri',fld:'ARTENCORI',pic:'@!'}]}");
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
      pr_default.close(18);
      pr_default.close(17);
      pr_default.close(19);
      pr_default.close(20);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOAV66ArtCod = "" ;
      wcpOAV67Mode2 = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z69ArtDsc = "" ;
      Z87ArtMat = "" ;
      Z95ArtRen = DecimalUtil.ZERO ;
      Z101ArtTipPle = "" ;
      Z100ArtTipLar = "" ;
      Z66ArtCorOri = "" ;
      Z70ArtEncOri = "" ;
      Z96ArtSua = "" ;
      Z64ArtAcaQui = "" ;
      Z73ArtEti = "" ;
      Z88ArtMer = DecimalUtil.ZERO ;
      Z105ArtTra1 = "" ;
      Z106ArtTra2 = "" ;
      Z107ArtTra3 = "" ;
      Z111ArtUrd1 = "" ;
      Z112ArtUrd2 = "" ;
      Z113ArtUrd3 = "" ;
      Z92ArtPreKgm = DecimalUtil.ZERO ;
      Z93ArtPreMtr = DecimalUtil.ZERO ;
      Z91ArtPreDef = "" ;
      Z1905ArtRdoA = DecimalUtil.ZERO ;
      Z1904ArtRdoN = DecimalUtil.ZERO ;
      Z2791ArtFacAbs = DecimalUtil.ZERO ;
      Z2834ArtPle2 = "" ;
      Z4297ArtPmPPza = DecimalUtil.ZERO ;
      Z6660ArtFacTor = DecimalUtil.ZERO ;
      Z5741ArtComer = "" ;
      Z967ArtNMtr = "" ;
      Z4353ArtUsrCod = "" ;
      Z4354ArtFecMod = GXutil.nullDate() ;
      Z3683ArtFecCre = GXutil.nullDate() ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      AV66ArtCod = "" ;
      AV67Mode2 = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A66ArtCorOri = "" ;
      A70ArtEncOri = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      A87ArtMat = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A830TipArtDsc = "" ;
      lblTextblock9_Jsonclick = "" ;
      A69ArtDsc = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      A95ArtRen = DecimalUtil.ZERO ;
      lblTextblock17_Jsonclick = "" ;
      A101ArtTipPle = "" ;
      lblTextblock18_Jsonclick = "" ;
      A100ArtTipLar = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      A96ArtSua = "" ;
      lblTextblock22_Jsonclick = "" ;
      A64ArtAcaQui = "" ;
      lblTextblock23_Jsonclick = "" ;
      A73ArtEti = "" ;
      lblTextblock24_Jsonclick = "" ;
      A272CliEti = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      lblTextblock27_Jsonclick = "" ;
      A88ArtMer = DecimalUtil.ZERO ;
      lblTextblock28_Jsonclick = "" ;
      A105ArtTra1 = "" ;
      lblTextblock29_Jsonclick = "" ;
      A106ArtTra2 = "" ;
      lblTextblock30_Jsonclick = "" ;
      A107ArtTra3 = "" ;
      lblTextblock31_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      A111ArtUrd1 = "" ;
      lblTextblock35_Jsonclick = "" ;
      A112ArtUrd2 = "" ;
      lblTextblock36_Jsonclick = "" ;
      A113ArtUrd3 = "" ;
      lblTextblock37_Jsonclick = "" ;
      lblTextblock38_Jsonclick = "" ;
      lblTextblock39_Jsonclick = "" ;
      lblTextblock40_Jsonclick = "" ;
      A92ArtPreKgm = DecimalUtil.ZERO ;
      lblTextblock41_Jsonclick = "" ;
      A93ArtPreMtr = DecimalUtil.ZERO ;
      lblTextblock42_Jsonclick = "" ;
      A91ArtPreDef = "" ;
      lblTextblock43_Jsonclick = "" ;
      lblTextblock44_Jsonclick = "" ;
      lblTextblock45_Jsonclick = "" ;
      lblTextblock46_Jsonclick = "" ;
      A1905ArtRdoA = DecimalUtil.ZERO ;
      lblTextblock47_Jsonclick = "" ;
      A1904ArtRdoN = DecimalUtil.ZERO ;
      lblTextblock48_Jsonclick = "" ;
      A2791ArtFacAbs = DecimalUtil.ZERO ;
      lblTextblock49_Jsonclick = "" ;
      A2834ArtPle2 = "" ;
      lblTextblock50_Jsonclick = "" ;
      lblTextblock51_Jsonclick = "" ;
      lblTextblock52_Jsonclick = "" ;
      lblTextblock53_Jsonclick = "" ;
      lblTextblock54_Jsonclick = "" ;
      lblTextblock55_Jsonclick = "" ;
      lblTextblock56_Jsonclick = "" ;
      lblTextblock57_Jsonclick = "" ;
      A4297ArtPmPPza = DecimalUtil.ZERO ;
      lblTextblock58_Jsonclick = "" ;
      lblTextblock59_Jsonclick = "" ;
      A4608TipArtClas = "" ;
      lblTextblock60_Jsonclick = "" ;
      A4296ClasDsc = "" ;
      lblTextblock61_Jsonclick = "" ;
      A6660ArtFacTor = DecimalUtil.ZERO ;
      lblTextblock62_Jsonclick = "" ;
      A5741ArtComer = "" ;
      lblTextblock63_Jsonclick = "" ;
      A967ArtNMtr = "" ;
      lblTextblock64_Jsonclick = "" ;
      A4353ArtUsrCod = "" ;
      lblTextblock65_Jsonclick = "" ;
      A4354ArtFecMod = GXutil.nullDate() ;
      lblTextblock66_Jsonclick = "" ;
      A3683ArtFecCre = GXutil.nullDate() ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV59Modo = "" ;
      Gx_date = GXutil.nullDate() ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z272CliEti = "" ;
      Z830TipArtDsc = "" ;
      Z4608TipArtClas = "" ;
      Z4296ClasDsc = "" ;
      T00LP8_A65ArtCod = new String[] {""} ;
      T00LP8_n65ArtCod = new boolean[] {false} ;
      T00LP8_A69ArtDsc = new String[] {""} ;
      T00LP8_n69ArtDsc = new boolean[] {false} ;
      T00LP8_A279CliNom = new String[] {""} ;
      T00LP8_A407EmprNom = new String[] {""} ;
      T00LP8_n407EmprNom = new boolean[] {false} ;
      T00LP8_A87ArtMat = new String[] {""} ;
      T00LP8_n87ArtMat = new boolean[] {false} ;
      T00LP8_A830TipArtDsc = new String[] {""} ;
      T00LP8_n830TipArtDsc = new boolean[] {false} ;
      T00LP8_A1148ArtPml = new short[1] ;
      T00LP8_n1148ArtPml = new boolean[] {false} ;
      T00LP8_A78ArtGraCru = new short[1] ;
      T00LP8_n78ArtGraCru = new boolean[] {false} ;
      T00LP8_A68ArtCruMin = new short[1] ;
      T00LP8_n68ArtCruMin = new boolean[] {false} ;
      T00LP8_A67ArtCruMax = new short[1] ;
      T00LP8_n67ArtCruMax = new boolean[] {false} ;
      T00LP8_A63ArtAcaMin = new short[1] ;
      T00LP8_n63ArtAcaMin = new boolean[] {false} ;
      T00LP8_A62ArtAcaMax = new short[1] ;
      T00LP8_n62ArtAcaMax = new boolean[] {false} ;
      T00LP8_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP8_n95ArtRen = new boolean[] {false} ;
      T00LP8_A101ArtTipPle = new String[] {""} ;
      T00LP8_n101ArtTipPle = new boolean[] {false} ;
      T00LP8_A100ArtTipLar = new String[] {""} ;
      T00LP8_n100ArtTipLar = new boolean[] {false} ;
      T00LP8_A66ArtCorOri = new String[] {""} ;
      T00LP8_n66ArtCorOri = new boolean[] {false} ;
      T00LP8_A70ArtEncOri = new String[] {""} ;
      T00LP8_n70ArtEncOri = new boolean[] {false} ;
      T00LP8_A96ArtSua = new String[] {""} ;
      T00LP8_n96ArtSua = new boolean[] {false} ;
      T00LP8_A64ArtAcaQui = new String[] {""} ;
      T00LP8_n64ArtAcaQui = new boolean[] {false} ;
      T00LP8_A73ArtEti = new String[] {""} ;
      T00LP8_n73ArtEti = new boolean[] {false} ;
      T00LP8_A272CliEti = new String[] {""} ;
      T00LP8_A306CliUrg = new byte[1] ;
      T00LP8_A117ArtUrg = new byte[1] ;
      T00LP8_n117ArtUrg = new boolean[] {false} ;
      T00LP8_A88ArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP8_n88ArtMer = new boolean[] {false} ;
      T00LP8_A105ArtTra1 = new String[] {""} ;
      T00LP8_n105ArtTra1 = new boolean[] {false} ;
      T00LP8_A106ArtTra2 = new String[] {""} ;
      T00LP8_n106ArtTra2 = new boolean[] {false} ;
      T00LP8_A107ArtTra3 = new String[] {""} ;
      T00LP8_n107ArtTra3 = new boolean[] {false} ;
      T00LP8_A108ArtTraP1 = new short[1] ;
      T00LP8_n108ArtTraP1 = new boolean[] {false} ;
      T00LP8_A109ArtTraP2 = new short[1] ;
      T00LP8_n109ArtTraP2 = new boolean[] {false} ;
      T00LP8_A110ArtTraP3 = new short[1] ;
      T00LP8_n110ArtTraP3 = new boolean[] {false} ;
      T00LP8_A111ArtUrd1 = new String[] {""} ;
      T00LP8_n111ArtUrd1 = new boolean[] {false} ;
      T00LP8_A112ArtUrd2 = new String[] {""} ;
      T00LP8_n112ArtUrd2 = new boolean[] {false} ;
      T00LP8_A113ArtUrd3 = new String[] {""} ;
      T00LP8_n113ArtUrd3 = new boolean[] {false} ;
      T00LP8_A114ArtUrdP1 = new short[1] ;
      T00LP8_n114ArtUrdP1 = new boolean[] {false} ;
      T00LP8_A115ArtUrdP2 = new short[1] ;
      T00LP8_n115ArtUrdP2 = new boolean[] {false} ;
      T00LP8_A116ArtUrdP3 = new short[1] ;
      T00LP8_n116ArtUrdP3 = new boolean[] {false} ;
      T00LP8_A92ArtPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP8_n92ArtPreKgm = new boolean[] {false} ;
      T00LP8_A93ArtPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP8_n93ArtPreMtr = new boolean[] {false} ;
      T00LP8_A91ArtPreDef = new String[] {""} ;
      T00LP8_n91ArtPreDef = new boolean[] {false} ;
      T00LP8_A1229ArtEncCom = new short[1] ;
      T00LP8_n1229ArtEncCom = new boolean[] {false} ;
      T00LP8_A1230ArtEncAnh = new short[1] ;
      T00LP8_n1230ArtEncAnh = new boolean[] {false} ;
      T00LP8_A1903ArtGraAca = new short[1] ;
      T00LP8_n1903ArtGraAca = new boolean[] {false} ;
      T00LP8_A1905ArtRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP8_n1905ArtRdoA = new boolean[] {false} ;
      T00LP8_A1904ArtRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP8_n1904ArtRdoN = new boolean[] {false} ;
      T00LP8_A2791ArtFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP8_n2791ArtFacAbs = new boolean[] {false} ;
      T00LP8_A2834ArtPle2 = new String[] {""} ;
      T00LP8_n2834ArtPle2 = new boolean[] {false} ;
      T00LP8_A3121ArtNumCor = new short[1] ;
      T00LP8_n3121ArtNumCor = new boolean[] {false} ;
      T00LP8_A3122ArtAncSal1 = new short[1] ;
      T00LP8_n3122ArtAncSal1 = new boolean[] {false} ;
      T00LP8_A3123ArtAncSal2 = new short[1] ;
      T00LP8_n3123ArtAncSal2 = new boolean[] {false} ;
      T00LP8_A3124ArtAncSal3 = new short[1] ;
      T00LP8_n3124ArtAncSal3 = new boolean[] {false} ;
      T00LP8_A3125ArtGraAca2 = new short[1] ;
      T00LP8_n3125ArtGraAca2 = new boolean[] {false} ;
      T00LP8_A3126ArtGraCru2 = new short[1] ;
      T00LP8_n3126ArtGraCru2 = new boolean[] {false} ;
      T00LP8_A4297ArtPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP8_n4297ArtPmPPza = new boolean[] {false} ;
      T00LP8_A4607ArtRb = new short[1] ;
      T00LP8_n4607ArtRb = new boolean[] {false} ;
      T00LP8_A4608TipArtClas = new String[] {""} ;
      T00LP8_n4608TipArtClas = new boolean[] {false} ;
      T00LP8_A4296ClasDsc = new String[] {""} ;
      T00LP8_n4296ClasDsc = new boolean[] {false} ;
      T00LP8_A6660ArtFacTor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP8_n6660ArtFacTor = new boolean[] {false} ;
      T00LP8_A5741ArtComer = new String[] {""} ;
      T00LP8_n5741ArtComer = new boolean[] {false} ;
      T00LP8_A967ArtNMtr = new String[] {""} ;
      T00LP8_n967ArtNMtr = new boolean[] {false} ;
      T00LP8_A4353ArtUsrCod = new String[] {""} ;
      T00LP8_n4353ArtUsrCod = new boolean[] {false} ;
      T00LP8_A4354ArtFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      T00LP8_n4354ArtFecMod = new boolean[] {false} ;
      T00LP8_A3683ArtFecCre = new java.util.Date[] {GXutil.nullDate()} ;
      T00LP8_n3683ArtFecCre = new boolean[] {false} ;
      T00LP8_A396EmprCod = new String[] {""} ;
      T00LP8_A252CliCod = new int[1] ;
      T00LP8_n252CliCod = new boolean[] {false} ;
      T00LP8_A829TipArtCod = new short[1] ;
      T00LP8_A4295ClasCod = new short[1] ;
      T00LP8_n4295ClasCod = new boolean[] {false} ;
      T00LP4_A407EmprNom = new String[] {""} ;
      T00LP4_n407EmprNom = new boolean[] {false} ;
      T00LP6_A830TipArtDsc = new String[] {""} ;
      T00LP6_n830TipArtDsc = new boolean[] {false} ;
      T00LP6_A4608TipArtClas = new String[] {""} ;
      T00LP6_n4608TipArtClas = new boolean[] {false} ;
      T00LP7_A4296ClasDsc = new String[] {""} ;
      T00LP7_n4296ClasDsc = new boolean[] {false} ;
      T00LP5_A279CliNom = new String[] {""} ;
      T00LP5_A272CliEti = new String[] {""} ;
      T00LP5_A306CliUrg = new byte[1] ;
      T00LP9_A407EmprNom = new String[] {""} ;
      T00LP9_n407EmprNom = new boolean[] {false} ;
      T00LP10_A830TipArtDsc = new String[] {""} ;
      T00LP10_n830TipArtDsc = new boolean[] {false} ;
      T00LP10_A4608TipArtClas = new String[] {""} ;
      T00LP10_n4608TipArtClas = new boolean[] {false} ;
      T00LP11_A4296ClasDsc = new String[] {""} ;
      T00LP11_n4296ClasDsc = new boolean[] {false} ;
      T00LP12_A279CliNom = new String[] {""} ;
      T00LP12_A272CliEti = new String[] {""} ;
      T00LP12_A306CliUrg = new byte[1] ;
      T00LP13_A396EmprCod = new String[] {""} ;
      T00LP13_A252CliCod = new int[1] ;
      T00LP13_n252CliCod = new boolean[] {false} ;
      T00LP13_A65ArtCod = new String[] {""} ;
      T00LP13_n65ArtCod = new boolean[] {false} ;
      T00LP3_A65ArtCod = new String[] {""} ;
      T00LP3_n65ArtCod = new boolean[] {false} ;
      T00LP3_A69ArtDsc = new String[] {""} ;
      T00LP3_n69ArtDsc = new boolean[] {false} ;
      T00LP3_A87ArtMat = new String[] {""} ;
      T00LP3_n87ArtMat = new boolean[] {false} ;
      T00LP3_A1148ArtPml = new short[1] ;
      T00LP3_n1148ArtPml = new boolean[] {false} ;
      T00LP3_A78ArtGraCru = new short[1] ;
      T00LP3_n78ArtGraCru = new boolean[] {false} ;
      T00LP3_A68ArtCruMin = new short[1] ;
      T00LP3_n68ArtCruMin = new boolean[] {false} ;
      T00LP3_A67ArtCruMax = new short[1] ;
      T00LP3_n67ArtCruMax = new boolean[] {false} ;
      T00LP3_A63ArtAcaMin = new short[1] ;
      T00LP3_n63ArtAcaMin = new boolean[] {false} ;
      T00LP3_A62ArtAcaMax = new short[1] ;
      T00LP3_n62ArtAcaMax = new boolean[] {false} ;
      T00LP3_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP3_n95ArtRen = new boolean[] {false} ;
      T00LP3_A101ArtTipPle = new String[] {""} ;
      T00LP3_n101ArtTipPle = new boolean[] {false} ;
      T00LP3_A100ArtTipLar = new String[] {""} ;
      T00LP3_n100ArtTipLar = new boolean[] {false} ;
      T00LP3_A66ArtCorOri = new String[] {""} ;
      T00LP3_n66ArtCorOri = new boolean[] {false} ;
      T00LP3_A70ArtEncOri = new String[] {""} ;
      T00LP3_n70ArtEncOri = new boolean[] {false} ;
      T00LP3_A96ArtSua = new String[] {""} ;
      T00LP3_n96ArtSua = new boolean[] {false} ;
      T00LP3_A64ArtAcaQui = new String[] {""} ;
      T00LP3_n64ArtAcaQui = new boolean[] {false} ;
      T00LP3_A73ArtEti = new String[] {""} ;
      T00LP3_n73ArtEti = new boolean[] {false} ;
      T00LP3_A117ArtUrg = new byte[1] ;
      T00LP3_n117ArtUrg = new boolean[] {false} ;
      T00LP3_A88ArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP3_n88ArtMer = new boolean[] {false} ;
      T00LP3_A105ArtTra1 = new String[] {""} ;
      T00LP3_n105ArtTra1 = new boolean[] {false} ;
      T00LP3_A106ArtTra2 = new String[] {""} ;
      T00LP3_n106ArtTra2 = new boolean[] {false} ;
      T00LP3_A107ArtTra3 = new String[] {""} ;
      T00LP3_n107ArtTra3 = new boolean[] {false} ;
      T00LP3_A108ArtTraP1 = new short[1] ;
      T00LP3_n108ArtTraP1 = new boolean[] {false} ;
      T00LP3_A109ArtTraP2 = new short[1] ;
      T00LP3_n109ArtTraP2 = new boolean[] {false} ;
      T00LP3_A110ArtTraP3 = new short[1] ;
      T00LP3_n110ArtTraP3 = new boolean[] {false} ;
      T00LP3_A111ArtUrd1 = new String[] {""} ;
      T00LP3_n111ArtUrd1 = new boolean[] {false} ;
      T00LP3_A112ArtUrd2 = new String[] {""} ;
      T00LP3_n112ArtUrd2 = new boolean[] {false} ;
      T00LP3_A113ArtUrd3 = new String[] {""} ;
      T00LP3_n113ArtUrd3 = new boolean[] {false} ;
      T00LP3_A114ArtUrdP1 = new short[1] ;
      T00LP3_n114ArtUrdP1 = new boolean[] {false} ;
      T00LP3_A115ArtUrdP2 = new short[1] ;
      T00LP3_n115ArtUrdP2 = new boolean[] {false} ;
      T00LP3_A116ArtUrdP3 = new short[1] ;
      T00LP3_n116ArtUrdP3 = new boolean[] {false} ;
      T00LP3_A92ArtPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP3_n92ArtPreKgm = new boolean[] {false} ;
      T00LP3_A93ArtPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP3_n93ArtPreMtr = new boolean[] {false} ;
      T00LP3_A91ArtPreDef = new String[] {""} ;
      T00LP3_n91ArtPreDef = new boolean[] {false} ;
      T00LP3_A1229ArtEncCom = new short[1] ;
      T00LP3_n1229ArtEncCom = new boolean[] {false} ;
      T00LP3_A1230ArtEncAnh = new short[1] ;
      T00LP3_n1230ArtEncAnh = new boolean[] {false} ;
      T00LP3_A1903ArtGraAca = new short[1] ;
      T00LP3_n1903ArtGraAca = new boolean[] {false} ;
      T00LP3_A1905ArtRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP3_n1905ArtRdoA = new boolean[] {false} ;
      T00LP3_A1904ArtRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP3_n1904ArtRdoN = new boolean[] {false} ;
      T00LP3_A2791ArtFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP3_n2791ArtFacAbs = new boolean[] {false} ;
      T00LP3_A2834ArtPle2 = new String[] {""} ;
      T00LP3_n2834ArtPle2 = new boolean[] {false} ;
      T00LP3_A3121ArtNumCor = new short[1] ;
      T00LP3_n3121ArtNumCor = new boolean[] {false} ;
      T00LP3_A3122ArtAncSal1 = new short[1] ;
      T00LP3_n3122ArtAncSal1 = new boolean[] {false} ;
      T00LP3_A3123ArtAncSal2 = new short[1] ;
      T00LP3_n3123ArtAncSal2 = new boolean[] {false} ;
      T00LP3_A3124ArtAncSal3 = new short[1] ;
      T00LP3_n3124ArtAncSal3 = new boolean[] {false} ;
      T00LP3_A3125ArtGraAca2 = new short[1] ;
      T00LP3_n3125ArtGraAca2 = new boolean[] {false} ;
      T00LP3_A3126ArtGraCru2 = new short[1] ;
      T00LP3_n3126ArtGraCru2 = new boolean[] {false} ;
      T00LP3_A4297ArtPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP3_n4297ArtPmPPza = new boolean[] {false} ;
      T00LP3_A4607ArtRb = new short[1] ;
      T00LP3_n4607ArtRb = new boolean[] {false} ;
      T00LP3_A6660ArtFacTor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP3_n6660ArtFacTor = new boolean[] {false} ;
      T00LP3_A5741ArtComer = new String[] {""} ;
      T00LP3_n5741ArtComer = new boolean[] {false} ;
      T00LP3_A967ArtNMtr = new String[] {""} ;
      T00LP3_n967ArtNMtr = new boolean[] {false} ;
      T00LP3_A4353ArtUsrCod = new String[] {""} ;
      T00LP3_n4353ArtUsrCod = new boolean[] {false} ;
      T00LP3_A4354ArtFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      T00LP3_n4354ArtFecMod = new boolean[] {false} ;
      T00LP3_A3683ArtFecCre = new java.util.Date[] {GXutil.nullDate()} ;
      T00LP3_n3683ArtFecCre = new boolean[] {false} ;
      T00LP3_A396EmprCod = new String[] {""} ;
      T00LP3_A252CliCod = new int[1] ;
      T00LP3_n252CliCod = new boolean[] {false} ;
      T00LP3_A829TipArtCod = new short[1] ;
      T00LP3_A4295ClasCod = new short[1] ;
      T00LP3_n4295ClasCod = new boolean[] {false} ;
      sMode10 = "" ;
      T00LP14_A396EmprCod = new String[] {""} ;
      T00LP14_A252CliCod = new int[1] ;
      T00LP14_n252CliCod = new boolean[] {false} ;
      T00LP14_A65ArtCod = new String[] {""} ;
      T00LP14_n65ArtCod = new boolean[] {false} ;
      T00LP15_A396EmprCod = new String[] {""} ;
      T00LP15_A252CliCod = new int[1] ;
      T00LP15_n252CliCod = new boolean[] {false} ;
      T00LP15_A65ArtCod = new String[] {""} ;
      T00LP15_n65ArtCod = new boolean[] {false} ;
      T00LP2_A65ArtCod = new String[] {""} ;
      T00LP2_n65ArtCod = new boolean[] {false} ;
      T00LP2_A69ArtDsc = new String[] {""} ;
      T00LP2_n69ArtDsc = new boolean[] {false} ;
      T00LP2_A87ArtMat = new String[] {""} ;
      T00LP2_n87ArtMat = new boolean[] {false} ;
      T00LP2_A1148ArtPml = new short[1] ;
      T00LP2_n1148ArtPml = new boolean[] {false} ;
      T00LP2_A78ArtGraCru = new short[1] ;
      T00LP2_n78ArtGraCru = new boolean[] {false} ;
      T00LP2_A68ArtCruMin = new short[1] ;
      T00LP2_n68ArtCruMin = new boolean[] {false} ;
      T00LP2_A67ArtCruMax = new short[1] ;
      T00LP2_n67ArtCruMax = new boolean[] {false} ;
      T00LP2_A63ArtAcaMin = new short[1] ;
      T00LP2_n63ArtAcaMin = new boolean[] {false} ;
      T00LP2_A62ArtAcaMax = new short[1] ;
      T00LP2_n62ArtAcaMax = new boolean[] {false} ;
      T00LP2_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP2_n95ArtRen = new boolean[] {false} ;
      T00LP2_A101ArtTipPle = new String[] {""} ;
      T00LP2_n101ArtTipPle = new boolean[] {false} ;
      T00LP2_A100ArtTipLar = new String[] {""} ;
      T00LP2_n100ArtTipLar = new boolean[] {false} ;
      T00LP2_A66ArtCorOri = new String[] {""} ;
      T00LP2_n66ArtCorOri = new boolean[] {false} ;
      T00LP2_A70ArtEncOri = new String[] {""} ;
      T00LP2_n70ArtEncOri = new boolean[] {false} ;
      T00LP2_A96ArtSua = new String[] {""} ;
      T00LP2_n96ArtSua = new boolean[] {false} ;
      T00LP2_A64ArtAcaQui = new String[] {""} ;
      T00LP2_n64ArtAcaQui = new boolean[] {false} ;
      T00LP2_A73ArtEti = new String[] {""} ;
      T00LP2_n73ArtEti = new boolean[] {false} ;
      T00LP2_A117ArtUrg = new byte[1] ;
      T00LP2_n117ArtUrg = new boolean[] {false} ;
      T00LP2_A88ArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP2_n88ArtMer = new boolean[] {false} ;
      T00LP2_A105ArtTra1 = new String[] {""} ;
      T00LP2_n105ArtTra1 = new boolean[] {false} ;
      T00LP2_A106ArtTra2 = new String[] {""} ;
      T00LP2_n106ArtTra2 = new boolean[] {false} ;
      T00LP2_A107ArtTra3 = new String[] {""} ;
      T00LP2_n107ArtTra3 = new boolean[] {false} ;
      T00LP2_A108ArtTraP1 = new short[1] ;
      T00LP2_n108ArtTraP1 = new boolean[] {false} ;
      T00LP2_A109ArtTraP2 = new short[1] ;
      T00LP2_n109ArtTraP2 = new boolean[] {false} ;
      T00LP2_A110ArtTraP3 = new short[1] ;
      T00LP2_n110ArtTraP3 = new boolean[] {false} ;
      T00LP2_A111ArtUrd1 = new String[] {""} ;
      T00LP2_n111ArtUrd1 = new boolean[] {false} ;
      T00LP2_A112ArtUrd2 = new String[] {""} ;
      T00LP2_n112ArtUrd2 = new boolean[] {false} ;
      T00LP2_A113ArtUrd3 = new String[] {""} ;
      T00LP2_n113ArtUrd3 = new boolean[] {false} ;
      T00LP2_A114ArtUrdP1 = new short[1] ;
      T00LP2_n114ArtUrdP1 = new boolean[] {false} ;
      T00LP2_A115ArtUrdP2 = new short[1] ;
      T00LP2_n115ArtUrdP2 = new boolean[] {false} ;
      T00LP2_A116ArtUrdP3 = new short[1] ;
      T00LP2_n116ArtUrdP3 = new boolean[] {false} ;
      T00LP2_A92ArtPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP2_n92ArtPreKgm = new boolean[] {false} ;
      T00LP2_A93ArtPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP2_n93ArtPreMtr = new boolean[] {false} ;
      T00LP2_A91ArtPreDef = new String[] {""} ;
      T00LP2_n91ArtPreDef = new boolean[] {false} ;
      T00LP2_A1229ArtEncCom = new short[1] ;
      T00LP2_n1229ArtEncCom = new boolean[] {false} ;
      T00LP2_A1230ArtEncAnh = new short[1] ;
      T00LP2_n1230ArtEncAnh = new boolean[] {false} ;
      T00LP2_A1903ArtGraAca = new short[1] ;
      T00LP2_n1903ArtGraAca = new boolean[] {false} ;
      T00LP2_A1905ArtRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP2_n1905ArtRdoA = new boolean[] {false} ;
      T00LP2_A1904ArtRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP2_n1904ArtRdoN = new boolean[] {false} ;
      T00LP2_A2791ArtFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP2_n2791ArtFacAbs = new boolean[] {false} ;
      T00LP2_A2834ArtPle2 = new String[] {""} ;
      T00LP2_n2834ArtPle2 = new boolean[] {false} ;
      T00LP2_A3121ArtNumCor = new short[1] ;
      T00LP2_n3121ArtNumCor = new boolean[] {false} ;
      T00LP2_A3122ArtAncSal1 = new short[1] ;
      T00LP2_n3122ArtAncSal1 = new boolean[] {false} ;
      T00LP2_A3123ArtAncSal2 = new short[1] ;
      T00LP2_n3123ArtAncSal2 = new boolean[] {false} ;
      T00LP2_A3124ArtAncSal3 = new short[1] ;
      T00LP2_n3124ArtAncSal3 = new boolean[] {false} ;
      T00LP2_A3125ArtGraAca2 = new short[1] ;
      T00LP2_n3125ArtGraAca2 = new boolean[] {false} ;
      T00LP2_A3126ArtGraCru2 = new short[1] ;
      T00LP2_n3126ArtGraCru2 = new boolean[] {false} ;
      T00LP2_A4297ArtPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP2_n4297ArtPmPPza = new boolean[] {false} ;
      T00LP2_A4607ArtRb = new short[1] ;
      T00LP2_n4607ArtRb = new boolean[] {false} ;
      T00LP2_A6660ArtFacTor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP2_n6660ArtFacTor = new boolean[] {false} ;
      T00LP2_A5741ArtComer = new String[] {""} ;
      T00LP2_n5741ArtComer = new boolean[] {false} ;
      T00LP2_A967ArtNMtr = new String[] {""} ;
      T00LP2_n967ArtNMtr = new boolean[] {false} ;
      T00LP2_A4353ArtUsrCod = new String[] {""} ;
      T00LP2_n4353ArtUsrCod = new boolean[] {false} ;
      T00LP2_A4354ArtFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      T00LP2_n4354ArtFecMod = new boolean[] {false} ;
      T00LP2_A3683ArtFecCre = new java.util.Date[] {GXutil.nullDate()} ;
      T00LP2_n3683ArtFecCre = new boolean[] {false} ;
      T00LP2_A396EmprCod = new String[] {""} ;
      T00LP2_A252CliCod = new int[1] ;
      T00LP2_n252CliCod = new boolean[] {false} ;
      T00LP2_A829TipArtCod = new short[1] ;
      T00LP2_A4295ClasCod = new short[1] ;
      T00LP2_n4295ClasCod = new boolean[] {false} ;
      T00LP19_A407EmprNom = new String[] {""} ;
      T00LP19_n407EmprNom = new boolean[] {false} ;
      T00LP20_A279CliNom = new String[] {""} ;
      T00LP20_A272CliEti = new String[] {""} ;
      T00LP20_A306CliUrg = new byte[1] ;
      T00LP21_A830TipArtDsc = new String[] {""} ;
      T00LP21_n830TipArtDsc = new boolean[] {false} ;
      T00LP21_A4608TipArtClas = new String[] {""} ;
      T00LP21_n4608TipArtClas = new boolean[] {false} ;
      T00LP22_A4296ClasDsc = new String[] {""} ;
      T00LP22_n4296ClasDsc = new boolean[] {false} ;
      T00LP23_A396EmprCod = new String[] {""} ;
      T00LP23_A252CliCod = new int[1] ;
      T00LP23_n252CliCod = new boolean[] {false} ;
      T00LP23_A65ArtCod = new String[] {""} ;
      T00LP23_n65ArtCod = new boolean[] {false} ;
      T00LP23_A499GrpFamCod = new byte[1] ;
      T00LP24_A396EmprCod = new String[] {""} ;
      T00LP24_A252CliCod = new int[1] ;
      T00LP24_n252CliCod = new boolean[] {false} ;
      T00LP24_A12814ARTConID = new String[] {""} ;
      T00LP24_A65ArtCod = new String[] {""} ;
      T00LP24_n65ArtCod = new boolean[] {false} ;
      T00LP25_A396EmprCod = new String[] {""} ;
      T00LP25_A252CliCod = new int[1] ;
      T00LP25_n252CliCod = new boolean[] {false} ;
      T00LP25_A65ArtCod = new String[] {""} ;
      T00LP25_n65ArtCod = new boolean[] {false} ;
      T00LP25_A12363SocInt = new byte[1] ;
      T00LP26_A396EmprCod = new String[] {""} ;
      T00LP26_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T00LP26_A5728JBCLLin = new short[1] ;
      T00LP27_A396EmprCod = new String[] {""} ;
      T00LP27_A252CliCod = new int[1] ;
      T00LP27_n252CliCod = new boolean[] {false} ;
      T00LP27_A5809MMezCod = new String[] {""} ;
      T00LP27_A65ArtCod = new String[] {""} ;
      T00LP27_n65ArtCod = new boolean[] {false} ;
      T00LP28_A396EmprCod = new String[] {""} ;
      T00LP28_A252CliCod = new int[1] ;
      T00LP28_n252CliCod = new boolean[] {false} ;
      T00LP28_A5234MezCod = new String[] {""} ;
      T00LP28_A5240MezLin = new byte[1] ;
      T00LP29_A396EmprCod = new String[] {""} ;
      T00LP29_A252CliCod = new int[1] ;
      T00LP29_n252CliCod = new boolean[] {false} ;
      T00LP29_A65ArtCod = new String[] {""} ;
      T00LP29_n65ArtCod = new boolean[] {false} ;
      T00LP29_A4116estreclim = new int[1] ;
      T00LP30_A396EmprCod = new String[] {""} ;
      T00LP30_A252CliCod = new int[1] ;
      T00LP30_n252CliCod = new boolean[] {false} ;
      T00LP30_A65ArtCod = new String[] {""} ;
      T00LP30_n65ArtCod = new boolean[] {false} ;
      T00LP30_A4061EstNomCol = new String[] {""} ;
      T00LP31_A396EmprCod = new String[] {""} ;
      T00LP31_A9705ErpNped = new String[] {""} ;
      T00LP31_A8652ErpLin = new short[1] ;
      T00LP32_A396EmprCod = new String[] {""} ;
      T00LP32_A252CliCod = new int[1] ;
      T00LP32_n252CliCod = new boolean[] {false} ;
      T00LP32_A65ArtCod = new String[] {""} ;
      T00LP32_n65ArtCod = new boolean[] {false} ;
      T00LP32_A7266CAAqP = new String[] {""} ;
      T00LP33_A396EmprCod = new String[] {""} ;
      T00LP33_A252CliCod = new int[1] ;
      T00LP33_n252CliCod = new boolean[] {false} ;
      T00LP33_A65ArtCod = new String[] {""} ;
      T00LP33_n65ArtCod = new boolean[] {false} ;
      T00LP33_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T00LP34_A396EmprCod = new String[] {""} ;
      T00LP34_A252CliCod = new int[1] ;
      T00LP34_n252CliCod = new boolean[] {false} ;
      T00LP34_A65ArtCod = new String[] {""} ;
      T00LP34_n65ArtCod = new boolean[] {false} ;
      T00LP34_A10972Int_cod = new byte[1] ;
      T00LP35_A396EmprCod = new String[] {""} ;
      T00LP35_A252CliCod = new int[1] ;
      T00LP35_n252CliCod = new boolean[] {false} ;
      T00LP35_A65ArtCod = new String[] {""} ;
      T00LP35_n65ArtCod = new boolean[] {false} ;
      T00LP35_A10577Pg_Procod = new String[] {""} ;
      T00LP36_A396EmprCod = new String[] {""} ;
      T00LP36_A252CliCod = new int[1] ;
      T00LP36_n252CliCod = new boolean[] {false} ;
      T00LP36_A65ArtCod = new String[] {""} ;
      T00LP36_n65ArtCod = new boolean[] {false} ;
      T00LP36_A10272Hz_cod = new String[] {""} ;
      T00LP37_A396EmprCod = new String[] {""} ;
      T00LP37_A252CliCod = new int[1] ;
      T00LP37_n252CliCod = new boolean[] {false} ;
      T00LP37_A65ArtCod = new String[] {""} ;
      T00LP37_n65ArtCod = new boolean[] {false} ;
      T00LP37_A10041ArtSH = new String[] {""} ;
      T00LP38_A396EmprCod = new String[] {""} ;
      T00LP38_A252CliCod = new int[1] ;
      T00LP38_n252CliCod = new boolean[] {false} ;
      T00LP38_A65ArtCod = new String[] {""} ;
      T00LP38_n65ArtCod = new boolean[] {false} ;
      T00LP38_A8427TipoCt = new String[] {""} ;
      T00LP38_A8428CapMxMq = new int[1] ;
      T00LP39_A396EmprCod = new String[] {""} ;
      T00LP39_A252CliCod = new int[1] ;
      T00LP39_n252CliCod = new boolean[] {false} ;
      T00LP39_A65ArtCod = new String[] {""} ;
      T00LP39_n65ArtCod = new boolean[] {false} ;
      T00LP39_A8342CodPred = new short[1] ;
      T00LP40_A396EmprCod = new String[] {""} ;
      T00LP40_A252CliCod = new int[1] ;
      T00LP40_n252CliCod = new boolean[] {false} ;
      T00LP40_A65ArtCod = new String[] {""} ;
      T00LP40_n65ArtCod = new boolean[] {false} ;
      T00LP40_A8089ArtcodTj = new String[] {""} ;
      T00LP41_A396EmprCod = new String[] {""} ;
      T00LP41_A252CliCod = new int[1] ;
      T00LP41_n252CliCod = new boolean[] {false} ;
      T00LP41_A65ArtCod = new String[] {""} ;
      T00LP41_n65ArtCod = new boolean[] {false} ;
      T00LP41_A7956Mq_CodM = new String[] {""} ;
      T00LP42_A396EmprCod = new String[] {""} ;
      T00LP42_A252CliCod = new int[1] ;
      T00LP42_n252CliCod = new boolean[] {false} ;
      T00LP42_A65ArtCod = new String[] {""} ;
      T00LP42_n65ArtCod = new boolean[] {false} ;
      T00LP42_A7949Par_Art = new short[1] ;
      T00LP43_A396EmprCod = new String[] {""} ;
      T00LP43_A252CliCod = new int[1] ;
      T00LP43_n252CliCod = new boolean[] {false} ;
      T00LP43_A65ArtCod = new String[] {""} ;
      T00LP43_n65ArtCod = new boolean[] {false} ;
      T00LP43_A7135Lin_fast = new short[1] ;
      T00LP44_A396EmprCod = new String[] {""} ;
      T00LP44_A252CliCod = new int[1] ;
      T00LP44_n252CliCod = new boolean[] {false} ;
      T00LP44_A65ArtCod = new String[] {""} ;
      T00LP44_n65ArtCod = new boolean[] {false} ;
      T00LP44_A6954Mat_lin = new short[1] ;
      T00LP45_A396EmprCod = new String[] {""} ;
      T00LP45_A602MaqCod = new String[] {""} ;
      T00LP45_A6078MaqCliCod = new int[1] ;
      T00LP45_A6079MaqArtCod = new String[] {""} ;
      T00LP46_A396EmprCod = new String[] {""} ;
      T00LP46_A252CliCod = new int[1] ;
      T00LP46_n252CliCod = new boolean[] {false} ;
      T00LP46_A65ArtCod = new String[] {""} ;
      T00LP46_n65ArtCod = new boolean[] {false} ;
      T00LP46_A5382EstCatAny = new short[1] ;
      T00LP46_A5383EstCatSer = new String[] {""} ;
      T00LP46_A5384EstCatTip = new short[1] ;
      T00LP47_A396EmprCod = new String[] {""} ;
      T00LP47_A252CliCod = new int[1] ;
      T00LP47_n252CliCod = new boolean[] {false} ;
      T00LP47_A65ArtCod = new String[] {""} ;
      T00LP47_n65ArtCod = new boolean[] {false} ;
      T00LP47_A4658MdlCod = new String[] {""} ;
      T00LP48_A396EmprCod = new String[] {""} ;
      T00LP48_A252CliCod = new int[1] ;
      T00LP48_n252CliCod = new boolean[] {false} ;
      T00LP48_A4175WebEmpCod = new String[] {""} ;
      T00LP49_A396EmprCod = new String[] {""} ;
      T00LP49_A252CliCod = new int[1] ;
      T00LP49_n252CliCod = new boolean[] {false} ;
      T00LP49_A4079WEBDISCOD = new String[] {""} ;
      T00LP50_A396EmprCod = new String[] {""} ;
      T00LP50_A252CliCod = new int[1] ;
      T00LP50_n252CliCod = new boolean[] {false} ;
      T00LP50_A65ArtCod = new String[] {""} ;
      T00LP50_n65ArtCod = new boolean[] {false} ;
      T00LP50_A4058CCFColNom = new String[] {""} ;
      T00LP50_A4059CCFColNum = new int[1] ;
      T00LP51_A396EmprCod = new String[] {""} ;
      T00LP51_A252CliCod = new int[1] ;
      T00LP51_n252CliCod = new boolean[] {false} ;
      T00LP51_A65ArtCod = new String[] {""} ;
      T00LP51_n65ArtCod = new boolean[] {false} ;
      T00LP51_A1177Dibujo = new String[] {""} ;
      T00LP51_A1790DibIntCod = new int[1] ;
      T00LP52_A396EmprCod = new String[] {""} ;
      T00LP52_A252CliCod = new int[1] ;
      T00LP52_n252CliCod = new boolean[] {false} ;
      T00LP52_A65ArtCod = new String[] {""} ;
      T00LP52_n65ArtCod = new boolean[] {false} ;
      T00LP52_A1080LinPre = new byte[1] ;
      T00LP53_A396EmprCod = new String[] {""} ;
      T00LP53_A3814PePCod = new long[1] ;
      T00LP54_A396EmprCod = new String[] {""} ;
      T00LP54_A3413OpeManCod = new byte[1] ;
      T00LP54_A3430PreManNMt = new String[] {""} ;
      T00LP54_A252CliCod = new int[1] ;
      T00LP54_n252CliCod = new boolean[] {false} ;
      T00LP54_A65ArtCod = new String[] {""} ;
      T00LP54_n65ArtCod = new boolean[] {false} ;
      T00LP55_A396EmprCod = new String[] {""} ;
      T00LP55_A3415ParManNum = new int[1] ;
      T00LP56_A396EmprCod = new String[] {""} ;
      T00LP56_A3331LanBroCod = new byte[1] ;
      T00LP56_A3333LanBroLin = new short[1] ;
      T00LP57_A396EmprCod = new String[] {""} ;
      T00LP57_A252CliCod = new int[1] ;
      T00LP57_n252CliCod = new boolean[] {false} ;
      T00LP57_A65ArtCod = new String[] {""} ;
      T00LP57_n65ArtCod = new boolean[] {false} ;
      T00LP57_A3319ArtCapKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00LP58_A396EmprCod = new String[] {""} ;
      T00LP58_A252CliCod = new int[1] ;
      T00LP58_n252CliCod = new boolean[] {false} ;
      T00LP58_A65ArtCod = new String[] {""} ;
      T00LP58_n65ArtCod = new boolean[] {false} ;
      T00LP58_A3288CCalCod = new String[] {""} ;
      T00LP59_A396EmprCod = new String[] {""} ;
      T00LP59_A252CliCod = new int[1] ;
      T00LP59_n252CliCod = new boolean[] {false} ;
      T00LP59_A65ArtCod = new String[] {""} ;
      T00LP59_n65ArtCod = new boolean[] {false} ;
      T00LP59_A3033CCCod = new String[] {""} ;
      T00LP60_A396EmprCod = new String[] {""} ;
      T00LP60_A252CliCod = new int[1] ;
      T00LP60_n252CliCod = new boolean[] {false} ;
      T00LP60_A65ArtCod = new String[] {""} ;
      T00LP60_n65ArtCod = new boolean[] {false} ;
      T00LP60_A2937RecIntCod = new byte[1] ;
      T00LP61_A396EmprCod = new String[] {""} ;
      T00LP61_A252CliCod = new int[1] ;
      T00LP61_n252CliCod = new boolean[] {false} ;
      T00LP61_A65ArtCod = new String[] {""} ;
      T00LP61_n65ArtCod = new boolean[] {false} ;
      T00LP61_A2931Limite2 = new short[1] ;
      T00LP62_A396EmprCod = new String[] {""} ;
      T00LP62_A252CliCod = new int[1] ;
      T00LP62_n252CliCod = new boolean[] {false} ;
      T00LP62_A65ArtCod = new String[] {""} ;
      T00LP62_n65ArtCod = new boolean[] {false} ;
      T00LP62_A71ArtEstAny = new short[1] ;
      T00LP62_A2756ArtEstSer = new String[] {""} ;
      T00LP63_A396EmprCod = new String[] {""} ;
      T00LP63_A252CliCod = new int[1] ;
      T00LP63_n252CliCod = new boolean[] {false} ;
      T00LP63_A1504CliProCod = new String[] {""} ;
      T00LP63_A65ArtCod = new String[] {""} ;
      T00LP63_n65ArtCod = new boolean[] {false} ;
      T00LP64_A396EmprCod = new String[] {""} ;
      T00LP64_A252CliCod = new int[1] ;
      T00LP64_n252CliCod = new boolean[] {false} ;
      T00LP64_A65ArtCod = new String[] {""} ;
      T00LP64_n65ArtCod = new boolean[] {false} ;
      T00LP64_A598LinRec = new byte[1] ;
      T00LP65_A396EmprCod = new String[] {""} ;
      T00LP65_A252CliCod = new int[1] ;
      T00LP65_n252CliCod = new boolean[] {false} ;
      T00LP65_A65ArtCod = new String[] {""} ;
      T00LP65_n65ArtCod = new boolean[] {false} ;
      T00LP65_A831TipColCod = new byte[1] ;
      T00LP66_A396EmprCod = new String[] {""} ;
      T00LP66_A252CliCod = new int[1] ;
      T00LP66_n252CliCod = new boolean[] {false} ;
      T00LP66_A65ArtCod = new String[] {""} ;
      T00LP66_n65ArtCod = new boolean[] {false} ;
      T00LP66_A758ProCod = new String[] {""} ;
      T00LP67_A396EmprCod = new String[] {""} ;
      T00LP67_A252CliCod = new int[1] ;
      T00LP67_n252CliCod = new boolean[] {false} ;
      T00LP67_A65ArtCod = new String[] {""} ;
      T00LP67_n65ArtCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      iV59Modo = "" ;
      i66ArtCorOri = "" ;
      i70ArtEncOri = "" ;
      i5741ArtComer = "" ;
      i967ArtNMtr = "" ;
      i3683ArtFecCre = GXutil.nullDate() ;
      GXv_char3 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char1 = new String[1] ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ87ArtMat = "" ;
      ZZ95ArtRen = DecimalUtil.ZERO ;
      ZZ101ArtTipPle = "" ;
      ZZ100ArtTipLar = "" ;
      ZZ66ArtCorOri = "" ;
      ZZ70ArtEncOri = "" ;
      ZZ96ArtSua = "" ;
      ZZ64ArtAcaQui = "" ;
      ZZ88ArtMer = DecimalUtil.ZERO ;
      ZZ105ArtTra1 = "" ;
      ZZ106ArtTra2 = "" ;
      ZZ107ArtTra3 = "" ;
      ZZ111ArtUrd1 = "" ;
      ZZ112ArtUrd2 = "" ;
      ZZ113ArtUrd3 = "" ;
      ZZ92ArtPreKgm = DecimalUtil.ZERO ;
      ZZ93ArtPreMtr = DecimalUtil.ZERO ;
      ZZ91ArtPreDef = "" ;
      ZZ1905ArtRdoA = DecimalUtil.ZERO ;
      ZZ1904ArtRdoN = DecimalUtil.ZERO ;
      ZZ2791ArtFacAbs = DecimalUtil.ZERO ;
      ZZ2834ArtPle2 = "" ;
      ZZ4297ArtPmPPza = DecimalUtil.ZERO ;
      ZZ6660ArtFacTor = DecimalUtil.ZERO ;
      ZZ5741ArtComer = "" ;
      ZZ967ArtNMtr = "" ;
      ZZ4353ArtUsrCod = "" ;
      ZZ4354ArtFecMod = GXutil.nullDate() ;
      ZZ3683ArtFecCre = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      ZZ830TipArtDsc = "" ;
      ZZ4608TipArtClas = "" ;
      ZZ4296ClasDsc = "" ;
      ZZ279CliNom = "" ;
      ZZ272CliEti = "" ;
      ZZ69ArtDsc = "" ;
      ZZ73ArtEti = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tarticl__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tarticl__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tarticl__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tarticl__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tarticl__default(),
         new Object[] {
             new Object[] {
            T00LP2_A65ArtCod, T00LP2_A69ArtDsc, T00LP2_n69ArtDsc, T00LP2_A87ArtMat, T00LP2_n87ArtMat, T00LP2_A1148ArtPml, T00LP2_n1148ArtPml, T00LP2_A78ArtGraCru, T00LP2_n78ArtGraCru, T00LP2_A68ArtCruMin,
            T00LP2_n68ArtCruMin, T00LP2_A67ArtCruMax, T00LP2_n67ArtCruMax, T00LP2_A63ArtAcaMin, T00LP2_n63ArtAcaMin, T00LP2_A62ArtAcaMax, T00LP2_n62ArtAcaMax, T00LP2_A95ArtRen, T00LP2_n95ArtRen, T00LP2_A101ArtTipPle,
            T00LP2_n101ArtTipPle, T00LP2_A100ArtTipLar, T00LP2_n100ArtTipLar, T00LP2_A66ArtCorOri, T00LP2_n66ArtCorOri, T00LP2_A70ArtEncOri, T00LP2_n70ArtEncOri, T00LP2_A96ArtSua, T00LP2_n96ArtSua, T00LP2_A64ArtAcaQui,
            T00LP2_n64ArtAcaQui, T00LP2_A73ArtEti, T00LP2_n73ArtEti, T00LP2_A117ArtUrg, T00LP2_n117ArtUrg, T00LP2_A88ArtMer, T00LP2_n88ArtMer, T00LP2_A105ArtTra1, T00LP2_n105ArtTra1, T00LP2_A106ArtTra2,
            T00LP2_n106ArtTra2, T00LP2_A107ArtTra3, T00LP2_n107ArtTra3, T00LP2_A108ArtTraP1, T00LP2_n108ArtTraP1, T00LP2_A109ArtTraP2, T00LP2_n109ArtTraP2, T00LP2_A110ArtTraP3, T00LP2_n110ArtTraP3, T00LP2_A111ArtUrd1,
            T00LP2_n111ArtUrd1, T00LP2_A112ArtUrd2, T00LP2_n112ArtUrd2, T00LP2_A113ArtUrd3, T00LP2_n113ArtUrd3, T00LP2_A114ArtUrdP1, T00LP2_n114ArtUrdP1, T00LP2_A115ArtUrdP2, T00LP2_n115ArtUrdP2, T00LP2_A116ArtUrdP3,
            T00LP2_n116ArtUrdP3, T00LP2_A92ArtPreKgm, T00LP2_n92ArtPreKgm, T00LP2_A93ArtPreMtr, T00LP2_n93ArtPreMtr, T00LP2_A91ArtPreDef, T00LP2_n91ArtPreDef, T00LP2_A1229ArtEncCom, T00LP2_n1229ArtEncCom, T00LP2_A1230ArtEncAnh,
            T00LP2_n1230ArtEncAnh, T00LP2_A1903ArtGraAca, T00LP2_n1903ArtGraAca, T00LP2_A1905ArtRdoA, T00LP2_n1905ArtRdoA, T00LP2_A1904ArtRdoN, T00LP2_n1904ArtRdoN, T00LP2_A2791ArtFacAbs, T00LP2_n2791ArtFacAbs, T00LP2_A2834ArtPle2,
            T00LP2_n2834ArtPle2, T00LP2_A3121ArtNumCor, T00LP2_n3121ArtNumCor, T00LP2_A3122ArtAncSal1, T00LP2_n3122ArtAncSal1, T00LP2_A3123ArtAncSal2, T00LP2_n3123ArtAncSal2, T00LP2_A3124ArtAncSal3, T00LP2_n3124ArtAncSal3, T00LP2_A3125ArtGraAca2,
            T00LP2_n3125ArtGraAca2, T00LP2_A3126ArtGraCru2, T00LP2_n3126ArtGraCru2, T00LP2_A4297ArtPmPPza, T00LP2_n4297ArtPmPPza, T00LP2_A4607ArtRb, T00LP2_n4607ArtRb, T00LP2_A6660ArtFacTor, T00LP2_n6660ArtFacTor, T00LP2_A5741ArtComer,
            T00LP2_n5741ArtComer, T00LP2_A967ArtNMtr, T00LP2_n967ArtNMtr, T00LP2_A4353ArtUsrCod, T00LP2_n4353ArtUsrCod, T00LP2_A4354ArtFecMod, T00LP2_n4354ArtFecMod, T00LP2_A3683ArtFecCre, T00LP2_n3683ArtFecCre, T00LP2_A396EmprCod,
            T00LP2_A252CliCod, T00LP2_A829TipArtCod, T00LP2_A4295ClasCod, T00LP2_n4295ClasCod
            }
            , new Object[] {
            T00LP3_A65ArtCod, T00LP3_A69ArtDsc, T00LP3_n69ArtDsc, T00LP3_A87ArtMat, T00LP3_n87ArtMat, T00LP3_A1148ArtPml, T00LP3_n1148ArtPml, T00LP3_A78ArtGraCru, T00LP3_n78ArtGraCru, T00LP3_A68ArtCruMin,
            T00LP3_n68ArtCruMin, T00LP3_A67ArtCruMax, T00LP3_n67ArtCruMax, T00LP3_A63ArtAcaMin, T00LP3_n63ArtAcaMin, T00LP3_A62ArtAcaMax, T00LP3_n62ArtAcaMax, T00LP3_A95ArtRen, T00LP3_n95ArtRen, T00LP3_A101ArtTipPle,
            T00LP3_n101ArtTipPle, T00LP3_A100ArtTipLar, T00LP3_n100ArtTipLar, T00LP3_A66ArtCorOri, T00LP3_n66ArtCorOri, T00LP3_A70ArtEncOri, T00LP3_n70ArtEncOri, T00LP3_A96ArtSua, T00LP3_n96ArtSua, T00LP3_A64ArtAcaQui,
            T00LP3_n64ArtAcaQui, T00LP3_A73ArtEti, T00LP3_n73ArtEti, T00LP3_A117ArtUrg, T00LP3_n117ArtUrg, T00LP3_A88ArtMer, T00LP3_n88ArtMer, T00LP3_A105ArtTra1, T00LP3_n105ArtTra1, T00LP3_A106ArtTra2,
            T00LP3_n106ArtTra2, T00LP3_A107ArtTra3, T00LP3_n107ArtTra3, T00LP3_A108ArtTraP1, T00LP3_n108ArtTraP1, T00LP3_A109ArtTraP2, T00LP3_n109ArtTraP2, T00LP3_A110ArtTraP3, T00LP3_n110ArtTraP3, T00LP3_A111ArtUrd1,
            T00LP3_n111ArtUrd1, T00LP3_A112ArtUrd2, T00LP3_n112ArtUrd2, T00LP3_A113ArtUrd3, T00LP3_n113ArtUrd3, T00LP3_A114ArtUrdP1, T00LP3_n114ArtUrdP1, T00LP3_A115ArtUrdP2, T00LP3_n115ArtUrdP2, T00LP3_A116ArtUrdP3,
            T00LP3_n116ArtUrdP3, T00LP3_A92ArtPreKgm, T00LP3_n92ArtPreKgm, T00LP3_A93ArtPreMtr, T00LP3_n93ArtPreMtr, T00LP3_A91ArtPreDef, T00LP3_n91ArtPreDef, T00LP3_A1229ArtEncCom, T00LP3_n1229ArtEncCom, T00LP3_A1230ArtEncAnh,
            T00LP3_n1230ArtEncAnh, T00LP3_A1903ArtGraAca, T00LP3_n1903ArtGraAca, T00LP3_A1905ArtRdoA, T00LP3_n1905ArtRdoA, T00LP3_A1904ArtRdoN, T00LP3_n1904ArtRdoN, T00LP3_A2791ArtFacAbs, T00LP3_n2791ArtFacAbs, T00LP3_A2834ArtPle2,
            T00LP3_n2834ArtPle2, T00LP3_A3121ArtNumCor, T00LP3_n3121ArtNumCor, T00LP3_A3122ArtAncSal1, T00LP3_n3122ArtAncSal1, T00LP3_A3123ArtAncSal2, T00LP3_n3123ArtAncSal2, T00LP3_A3124ArtAncSal3, T00LP3_n3124ArtAncSal3, T00LP3_A3125ArtGraAca2,
            T00LP3_n3125ArtGraAca2, T00LP3_A3126ArtGraCru2, T00LP3_n3126ArtGraCru2, T00LP3_A4297ArtPmPPza, T00LP3_n4297ArtPmPPza, T00LP3_A4607ArtRb, T00LP3_n4607ArtRb, T00LP3_A6660ArtFacTor, T00LP3_n6660ArtFacTor, T00LP3_A5741ArtComer,
            T00LP3_n5741ArtComer, T00LP3_A967ArtNMtr, T00LP3_n967ArtNMtr, T00LP3_A4353ArtUsrCod, T00LP3_n4353ArtUsrCod, T00LP3_A4354ArtFecMod, T00LP3_n4354ArtFecMod, T00LP3_A3683ArtFecCre, T00LP3_n3683ArtFecCre, T00LP3_A396EmprCod,
            T00LP3_A252CliCod, T00LP3_A829TipArtCod, T00LP3_A4295ClasCod, T00LP3_n4295ClasCod
            }
            , new Object[] {
            T00LP4_A407EmprNom, T00LP4_n407EmprNom
            }
            , new Object[] {
            T00LP5_A279CliNom, T00LP5_A272CliEti, T00LP5_A306CliUrg
            }
            , new Object[] {
            T00LP6_A830TipArtDsc, T00LP6_n830TipArtDsc, T00LP6_A4608TipArtClas, T00LP6_n4608TipArtClas
            }
            , new Object[] {
            T00LP7_A4296ClasDsc, T00LP7_n4296ClasDsc
            }
            , new Object[] {
            T00LP8_A65ArtCod, T00LP8_A69ArtDsc, T00LP8_n69ArtDsc, T00LP8_A279CliNom, T00LP8_A407EmprNom, T00LP8_n407EmprNom, T00LP8_A87ArtMat, T00LP8_n87ArtMat, T00LP8_A830TipArtDsc, T00LP8_n830TipArtDsc,
            T00LP8_A1148ArtPml, T00LP8_n1148ArtPml, T00LP8_A78ArtGraCru, T00LP8_n78ArtGraCru, T00LP8_A68ArtCruMin, T00LP8_n68ArtCruMin, T00LP8_A67ArtCruMax, T00LP8_n67ArtCruMax, T00LP8_A63ArtAcaMin, T00LP8_n63ArtAcaMin,
            T00LP8_A62ArtAcaMax, T00LP8_n62ArtAcaMax, T00LP8_A95ArtRen, T00LP8_n95ArtRen, T00LP8_A101ArtTipPle, T00LP8_n101ArtTipPle, T00LP8_A100ArtTipLar, T00LP8_n100ArtTipLar, T00LP8_A66ArtCorOri, T00LP8_n66ArtCorOri,
            T00LP8_A70ArtEncOri, T00LP8_n70ArtEncOri, T00LP8_A96ArtSua, T00LP8_n96ArtSua, T00LP8_A64ArtAcaQui, T00LP8_n64ArtAcaQui, T00LP8_A73ArtEti, T00LP8_n73ArtEti, T00LP8_A272CliEti, T00LP8_A306CliUrg,
            T00LP8_A117ArtUrg, T00LP8_n117ArtUrg, T00LP8_A88ArtMer, T00LP8_n88ArtMer, T00LP8_A105ArtTra1, T00LP8_n105ArtTra1, T00LP8_A106ArtTra2, T00LP8_n106ArtTra2, T00LP8_A107ArtTra3, T00LP8_n107ArtTra3,
            T00LP8_A108ArtTraP1, T00LP8_n108ArtTraP1, T00LP8_A109ArtTraP2, T00LP8_n109ArtTraP2, T00LP8_A110ArtTraP3, T00LP8_n110ArtTraP3, T00LP8_A111ArtUrd1, T00LP8_n111ArtUrd1, T00LP8_A112ArtUrd2, T00LP8_n112ArtUrd2,
            T00LP8_A113ArtUrd3, T00LP8_n113ArtUrd3, T00LP8_A114ArtUrdP1, T00LP8_n114ArtUrdP1, T00LP8_A115ArtUrdP2, T00LP8_n115ArtUrdP2, T00LP8_A116ArtUrdP3, T00LP8_n116ArtUrdP3, T00LP8_A92ArtPreKgm, T00LP8_n92ArtPreKgm,
            T00LP8_A93ArtPreMtr, T00LP8_n93ArtPreMtr, T00LP8_A91ArtPreDef, T00LP8_n91ArtPreDef, T00LP8_A1229ArtEncCom, T00LP8_n1229ArtEncCom, T00LP8_A1230ArtEncAnh, T00LP8_n1230ArtEncAnh, T00LP8_A1903ArtGraAca, T00LP8_n1903ArtGraAca,
            T00LP8_A1905ArtRdoA, T00LP8_n1905ArtRdoA, T00LP8_A1904ArtRdoN, T00LP8_n1904ArtRdoN, T00LP8_A2791ArtFacAbs, T00LP8_n2791ArtFacAbs, T00LP8_A2834ArtPle2, T00LP8_n2834ArtPle2, T00LP8_A3121ArtNumCor, T00LP8_n3121ArtNumCor,
            T00LP8_A3122ArtAncSal1, T00LP8_n3122ArtAncSal1, T00LP8_A3123ArtAncSal2, T00LP8_n3123ArtAncSal2, T00LP8_A3124ArtAncSal3, T00LP8_n3124ArtAncSal3, T00LP8_A3125ArtGraAca2, T00LP8_n3125ArtGraAca2, T00LP8_A3126ArtGraCru2, T00LP8_n3126ArtGraCru2,
            T00LP8_A4297ArtPmPPza, T00LP8_n4297ArtPmPPza, T00LP8_A4607ArtRb, T00LP8_n4607ArtRb, T00LP8_A4608TipArtClas, T00LP8_n4608TipArtClas, T00LP8_A4296ClasDsc, T00LP8_n4296ClasDsc, T00LP8_A6660ArtFacTor, T00LP8_n6660ArtFacTor,
            T00LP8_A5741ArtComer, T00LP8_n5741ArtComer, T00LP8_A967ArtNMtr, T00LP8_n967ArtNMtr, T00LP8_A4353ArtUsrCod, T00LP8_n4353ArtUsrCod, T00LP8_A4354ArtFecMod, T00LP8_n4354ArtFecMod, T00LP8_A3683ArtFecCre, T00LP8_n3683ArtFecCre,
            T00LP8_A396EmprCod, T00LP8_A252CliCod, T00LP8_A829TipArtCod, T00LP8_A4295ClasCod, T00LP8_n4295ClasCod
            }
            , new Object[] {
            T00LP9_A407EmprNom, T00LP9_n407EmprNom
            }
            , new Object[] {
            T00LP10_A830TipArtDsc, T00LP10_n830TipArtDsc, T00LP10_A4608TipArtClas, T00LP10_n4608TipArtClas
            }
            , new Object[] {
            T00LP11_A4296ClasDsc, T00LP11_n4296ClasDsc
            }
            , new Object[] {
            T00LP12_A279CliNom, T00LP12_A272CliEti, T00LP12_A306CliUrg
            }
            , new Object[] {
            T00LP13_A396EmprCod, T00LP13_A252CliCod, T00LP13_A65ArtCod
            }
            , new Object[] {
            T00LP14_A396EmprCod, T00LP14_A252CliCod, T00LP14_A65ArtCod
            }
            , new Object[] {
            T00LP15_A396EmprCod, T00LP15_A252CliCod, T00LP15_A65ArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00LP19_A407EmprNom, T00LP19_n407EmprNom
            }
            , new Object[] {
            T00LP20_A279CliNom, T00LP20_A272CliEti, T00LP20_A306CliUrg
            }
            , new Object[] {
            T00LP21_A830TipArtDsc, T00LP21_n830TipArtDsc, T00LP21_A4608TipArtClas, T00LP21_n4608TipArtClas
            }
            , new Object[] {
            T00LP22_A4296ClasDsc, T00LP22_n4296ClasDsc
            }
            , new Object[] {
            T00LP23_A396EmprCod, T00LP23_A252CliCod, T00LP23_A65ArtCod, T00LP23_A499GrpFamCod
            }
            , new Object[] {
            T00LP24_A396EmprCod, T00LP24_A252CliCod, T00LP24_A12814ARTConID, T00LP24_A65ArtCod
            }
            , new Object[] {
            T00LP25_A396EmprCod, T00LP25_A252CliCod, T00LP25_A65ArtCod, T00LP25_A12363SocInt
            }
            , new Object[] {
            T00LP26_A396EmprCod, T00LP26_A4929Inc_Dia, T00LP26_A5728JBCLLin
            }
            , new Object[] {
            T00LP27_A396EmprCod, T00LP27_A252CliCod, T00LP27_A5809MMezCod, T00LP27_A65ArtCod
            }
            , new Object[] {
            T00LP28_A396EmprCod, T00LP28_A252CliCod, T00LP28_A5234MezCod, T00LP28_A5240MezLin
            }
            , new Object[] {
            T00LP29_A396EmprCod, T00LP29_A252CliCod, T00LP29_A65ArtCod, T00LP29_A4116estreclim
            }
            , new Object[] {
            T00LP30_A396EmprCod, T00LP30_A252CliCod, T00LP30_A65ArtCod, T00LP30_A4061EstNomCol
            }
            , new Object[] {
            T00LP31_A396EmprCod, T00LP31_A9705ErpNped, T00LP31_A8652ErpLin
            }
            , new Object[] {
            T00LP32_A396EmprCod, T00LP32_A252CliCod, T00LP32_A65ArtCod, T00LP32_A7266CAAqP
            }
            , new Object[] {
            T00LP33_A396EmprCod, T00LP33_A252CliCod, T00LP33_A65ArtCod, T00LP33_A11084H_DiaA
            }
            , new Object[] {
            T00LP34_A396EmprCod, T00LP34_A252CliCod, T00LP34_A65ArtCod, T00LP34_A10972Int_cod
            }
            , new Object[] {
            T00LP35_A396EmprCod, T00LP35_A252CliCod, T00LP35_A65ArtCod, T00LP35_A10577Pg_Procod
            }
            , new Object[] {
            T00LP36_A396EmprCod, T00LP36_A252CliCod, T00LP36_A65ArtCod, T00LP36_A10272Hz_cod
            }
            , new Object[] {
            T00LP37_A396EmprCod, T00LP37_A252CliCod, T00LP37_A65ArtCod, T00LP37_A10041ArtSH
            }
            , new Object[] {
            T00LP38_A396EmprCod, T00LP38_A252CliCod, T00LP38_A65ArtCod, T00LP38_A8427TipoCt, T00LP38_A8428CapMxMq
            }
            , new Object[] {
            T00LP39_A396EmprCod, T00LP39_A252CliCod, T00LP39_A65ArtCod, T00LP39_A8342CodPred
            }
            , new Object[] {
            T00LP40_A396EmprCod, T00LP40_A252CliCod, T00LP40_A65ArtCod, T00LP40_A8089ArtcodTj
            }
            , new Object[] {
            T00LP41_A396EmprCod, T00LP41_A252CliCod, T00LP41_A65ArtCod, T00LP41_A7956Mq_CodM
            }
            , new Object[] {
            T00LP42_A396EmprCod, T00LP42_A252CliCod, T00LP42_A65ArtCod, T00LP42_A7949Par_Art
            }
            , new Object[] {
            T00LP43_A396EmprCod, T00LP43_A252CliCod, T00LP43_A65ArtCod, T00LP43_A7135Lin_fast
            }
            , new Object[] {
            T00LP44_A396EmprCod, T00LP44_A252CliCod, T00LP44_A65ArtCod, T00LP44_A6954Mat_lin
            }
            , new Object[] {
            T00LP45_A396EmprCod, T00LP45_A602MaqCod, T00LP45_A6078MaqCliCod, T00LP45_A6079MaqArtCod
            }
            , new Object[] {
            T00LP46_A396EmprCod, T00LP46_A252CliCod, T00LP46_A65ArtCod, T00LP46_A5382EstCatAny, T00LP46_A5383EstCatSer, T00LP46_A5384EstCatTip
            }
            , new Object[] {
            T00LP47_A396EmprCod, T00LP47_A252CliCod, T00LP47_A65ArtCod, T00LP47_A4658MdlCod
            }
            , new Object[] {
            T00LP48_A396EmprCod, T00LP48_A252CliCod, T00LP48_A4175WebEmpCod
            }
            , new Object[] {
            T00LP49_A396EmprCod, T00LP49_A252CliCod, T00LP49_A4079WEBDISCOD
            }
            , new Object[] {
            T00LP50_A396EmprCod, T00LP50_A252CliCod, T00LP50_A65ArtCod, T00LP50_A4058CCFColNom, T00LP50_A4059CCFColNum
            }
            , new Object[] {
            T00LP51_A396EmprCod, T00LP51_A252CliCod, T00LP51_A65ArtCod, T00LP51_A1177Dibujo, T00LP51_A1790DibIntCod
            }
            , new Object[] {
            T00LP52_A396EmprCod, T00LP52_A252CliCod, T00LP52_A65ArtCod, T00LP52_A1080LinPre
            }
            , new Object[] {
            T00LP53_A396EmprCod, T00LP53_A3814PePCod
            }
            , new Object[] {
            T00LP54_A396EmprCod, T00LP54_A3413OpeManCod, T00LP54_A3430PreManNMt, T00LP54_A252CliCod, T00LP54_A65ArtCod
            }
            , new Object[] {
            T00LP55_A396EmprCod, T00LP55_A3415ParManNum
            }
            , new Object[] {
            T00LP56_A396EmprCod, T00LP56_A3331LanBroCod, T00LP56_A3333LanBroLin
            }
            , new Object[] {
            T00LP57_A396EmprCod, T00LP57_A252CliCod, T00LP57_A65ArtCod, T00LP57_A3319ArtCapKgs
            }
            , new Object[] {
            T00LP58_A396EmprCod, T00LP58_A252CliCod, T00LP58_A65ArtCod, T00LP58_A3288CCalCod
            }
            , new Object[] {
            T00LP59_A396EmprCod, T00LP59_A252CliCod, T00LP59_A65ArtCod, T00LP59_A3033CCCod
            }
            , new Object[] {
            T00LP60_A396EmprCod, T00LP60_A252CliCod, T00LP60_A65ArtCod, T00LP60_A2937RecIntCod
            }
            , new Object[] {
            T00LP61_A396EmprCod, T00LP61_A252CliCod, T00LP61_A65ArtCod, T00LP61_A2931Limite2
            }
            , new Object[] {
            T00LP62_A396EmprCod, T00LP62_A252CliCod, T00LP62_A65ArtCod, T00LP62_A71ArtEstAny, T00LP62_A2756ArtEstSer
            }
            , new Object[] {
            T00LP63_A396EmprCod, T00LP63_A252CliCod, T00LP63_A1504CliProCod, T00LP63_A65ArtCod
            }
            , new Object[] {
            T00LP64_A396EmprCod, T00LP64_A252CliCod, T00LP64_A65ArtCod, T00LP64_A598LinRec
            }
            , new Object[] {
            T00LP65_A396EmprCod, T00LP65_A252CliCod, T00LP65_A65ArtCod, T00LP65_A831TipColCod
            }
            , new Object[] {
            T00LP66_A396EmprCod, T00LP66_A252CliCod, T00LP66_A65ArtCod, T00LP66_A758ProCod
            }
            , new Object[] {
            T00LP67_A396EmprCod, T00LP67_A252CliCod, T00LP67_A65ArtCod
            }
         }
      );
      Z3683ArtFecCre = GXutil.nullDate() ;
      n3683ArtFecCre = false ;
      A3683ArtFecCre = GXutil.nullDate() ;
      n3683ArtFecCre = false ;
      i3683ArtFecCre = GXutil.nullDate() ;
      n3683ArtFecCre = false ;
      Gx_date = GXutil.today( ) ;
      Z967ArtNMtr = "*" ;
      n967ArtNMtr = false ;
      A967ArtNMtr = "*" ;
      n967ArtNMtr = false ;
      i967ArtNMtr = "*" ;
      n967ArtNMtr = false ;
      Z5741ArtComer = "*" ;
      n5741ArtComer = false ;
      A5741ArtComer = "*" ;
      n5741ArtComer = false ;
      i5741ArtComer = "*" ;
      n5741ArtComer = false ;
      Z70ArtEncOri = httpContext.getMessage( "N", "") ;
      n70ArtEncOri = false ;
      A70ArtEncOri = httpContext.getMessage( "N", "") ;
      n70ArtEncOri = false ;
      i70ArtEncOri = httpContext.getMessage( "N", "") ;
      n70ArtEncOri = false ;
      Z66ArtCorOri = httpContext.getMessage( "N", "") ;
      n66ArtCorOri = false ;
      A66ArtCorOri = httpContext.getMessage( "N", "") ;
      n66ArtCorOri = false ;
      i66ArtCorOri = httpContext.getMessage( "N", "") ;
      n66ArtCorOri = false ;
      Z73ArtEti = "" ;
      n73ArtEti = false ;
      A73ArtEti = "" ;
      n73ArtEti = false ;
      Z117ArtUrg = (byte)(0) ;
      n117ArtUrg = false ;
      A117ArtUrg = (byte)(0) ;
      n117ArtUrg = false ;
   }

   private byte Z117ArtUrg ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A306CliUrg ;
   private byte A117ArtUrg ;
   private byte Gx_BScreen ;
   private byte Z306CliUrg ;
   private byte gxajaxcallmode ;
   private byte ZZ306CliUrg ;
   private byte ZZ117ArtUrg ;
   private short Z1148ArtPml ;
   private short Z78ArtGraCru ;
   private short Z68ArtCruMin ;
   private short Z67ArtCruMax ;
   private short Z63ArtAcaMin ;
   private short Z62ArtAcaMax ;
   private short Z108ArtTraP1 ;
   private short Z109ArtTraP2 ;
   private short Z110ArtTraP3 ;
   private short Z114ArtUrdP1 ;
   private short Z115ArtUrdP2 ;
   private short Z116ArtUrdP3 ;
   private short Z1229ArtEncCom ;
   private short Z1230ArtEncAnh ;
   private short Z1903ArtGraAca ;
   private short Z3121ArtNumCor ;
   private short Z3122ArtAncSal1 ;
   private short Z3123ArtAncSal2 ;
   private short Z3124ArtAncSal3 ;
   private short Z3125ArtGraAca2 ;
   private short Z3126ArtGraCru2 ;
   private short Z4607ArtRb ;
   private short Z829TipArtCod ;
   private short Z4295ClasCod ;
   private short A829TipArtCod ;
   private short A4295ClasCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1148ArtPml ;
   private short A78ArtGraCru ;
   private short A68ArtCruMin ;
   private short A67ArtCruMax ;
   private short A63ArtAcaMin ;
   private short A62ArtAcaMax ;
   private short A108ArtTraP1 ;
   private short A109ArtTraP2 ;
   private short A110ArtTraP3 ;
   private short A114ArtUrdP1 ;
   private short A115ArtUrdP2 ;
   private short A116ArtUrdP3 ;
   private short A1229ArtEncCom ;
   private short A1230ArtEncAnh ;
   private short A1903ArtGraAca ;
   private short A3121ArtNumCor ;
   private short A3122ArtAncSal1 ;
   private short A3123ArtAncSal2 ;
   private short A3124ArtAncSal3 ;
   private short A3125ArtGraAca2 ;
   private short A3126ArtGraCru2 ;
   private short A4607ArtRb ;
   private short RcdFound10 ;
   private short nIsDirty_10 ;
   private short ZZ829TipArtCod ;
   private short ZZ1148ArtPml ;
   private short ZZ78ArtGraCru ;
   private short ZZ68ArtCruMin ;
   private short ZZ67ArtCruMax ;
   private short ZZ63ArtAcaMin ;
   private short ZZ62ArtAcaMax ;
   private short ZZ108ArtTraP1 ;
   private short ZZ109ArtTraP2 ;
   private short ZZ110ArtTraP3 ;
   private short ZZ114ArtUrdP1 ;
   private short ZZ115ArtUrdP2 ;
   private short ZZ116ArtUrdP3 ;
   private short ZZ1229ArtEncCom ;
   private short ZZ1230ArtEncAnh ;
   private short ZZ1903ArtGraAca ;
   private short ZZ3121ArtNumCor ;
   private short ZZ3122ArtAncSal1 ;
   private short ZZ3123ArtAncSal2 ;
   private short ZZ3124ArtAncSal3 ;
   private short ZZ3125ArtGraAca2 ;
   private short ZZ3126ArtGraCru2 ;
   private short ZZ4295ClasCod ;
   private short ZZ4607ArtRb ;
   private int wcpOAV65CliCod ;
   private int Z252CliCod ;
   private int A252CliCod ;
   private int AV65CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtArtCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtArtMat_Enabled ;
   private int edtTipArtCod_Enabled ;
   private int edtTipArtDsc_Enabled ;
   private int edtArtDsc_Enabled ;
   private int edtArtPml_Enabled ;
   private int edtArtGraCru_Enabled ;
   private int edtArtCruMin_Enabled ;
   private int edtArtCruMax_Enabled ;
   private int edtArtAcaMin_Enabled ;
   private int edtArtAcaMax_Enabled ;
   private int edtArtRen_Enabled ;
   private int edtArtTipPle_Enabled ;
   private int edtArtTipLar_Enabled ;
   private int edtArtSua_Enabled ;
   private int edtArtAcaQui_Enabled ;
   private int edtArtEti_Enabled ;
   private int edtCliEti_Enabled ;
   private int edtCliUrg_Enabled ;
   private int edtArtUrg_Enabled ;
   private int edtArtMer_Enabled ;
   private int edtArtTra1_Enabled ;
   private int edtArtTra2_Enabled ;
   private int edtArtTra3_Enabled ;
   private int edtArtTraP1_Enabled ;
   private int edtArtTraP2_Enabled ;
   private int edtArtTraP3_Enabled ;
   private int edtArtUrd1_Enabled ;
   private int edtArtUrd2_Enabled ;
   private int edtArtUrd3_Enabled ;
   private int edtArtUrdP1_Enabled ;
   private int edtArtUrdP2_Enabled ;
   private int edtArtUrdP3_Enabled ;
   private int edtArtPreKgm_Enabled ;
   private int edtArtPreMtr_Enabled ;
   private int edtArtPreDef_Enabled ;
   private int edtArtEncCom_Enabled ;
   private int edtArtEncAnh_Enabled ;
   private int edtArtGraAca_Enabled ;
   private int edtArtRdoA_Enabled ;
   private int edtArtRdoN_Enabled ;
   private int edtArtFacAbs_Enabled ;
   private int edtArtPle2_Enabled ;
   private int edtArtNumCor_Enabled ;
   private int edtArtAncSal1_Enabled ;
   private int edtArtAncSal2_Enabled ;
   private int edtArtAncSal3_Enabled ;
   private int edtArtGraAca2_Enabled ;
   private int edtArtGraCru2_Enabled ;
   private int edtClasCod_Enabled ;
   private int edtArtPmPPza_Enabled ;
   private int edtArtRb_Enabled ;
   private int edtTipArtClas_Enabled ;
   private int edtClasDsc_Enabled ;
   private int edtArtFacTor_Enabled ;
   private int edtArtComer_Enabled ;
   private int edtArtNMtr_Enabled ;
   private int edtArtUsrCod_Enabled ;
   private int edtArtFecMod_Enabled ;
   private int edtArtFecCre_Enabled ;
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
   private int edtArtFecCre_Backcolor ;
   private int edtArtFecMod_Backcolor ;
   private int edtArtUsrCod_Backcolor ;
   private int edtArtNMtr_Backcolor ;
   private int edtArtComer_Backcolor ;
   private int edtArtFacTor_Backcolor ;
   private int edtClasDsc_Backcolor ;
   private int edtTipArtClas_Backcolor ;
   private int edtArtRb_Backcolor ;
   private int edtArtPmPPza_Backcolor ;
   private int edtClasCod_Backcolor ;
   private int edtArtGraCru2_Backcolor ;
   private int edtArtGraAca2_Backcolor ;
   private int edtArtAncSal3_Backcolor ;
   private int edtArtAncSal2_Backcolor ;
   private int edtArtAncSal1_Backcolor ;
   private int edtArtNumCor_Backcolor ;
   private int edtArtPle2_Backcolor ;
   private int edtArtFacAbs_Backcolor ;
   private int edtArtRdoN_Backcolor ;
   private int edtArtRdoA_Backcolor ;
   private int edtArtGraAca_Backcolor ;
   private int edtArtEncAnh_Backcolor ;
   private int edtArtEncCom_Backcolor ;
   private int edtArtPreDef_Backcolor ;
   private int edtArtPreMtr_Backcolor ;
   private int edtArtPreKgm_Backcolor ;
   private int edtArtUrdP3_Backcolor ;
   private int edtArtUrdP2_Backcolor ;
   private int edtArtUrdP1_Backcolor ;
   private int edtArtUrd3_Backcolor ;
   private int edtArtUrd2_Backcolor ;
   private int edtArtUrd1_Backcolor ;
   private int edtArtTraP3_Backcolor ;
   private int edtArtTraP2_Backcolor ;
   private int edtArtTraP1_Backcolor ;
   private int edtArtTra3_Backcolor ;
   private int edtArtTra2_Backcolor ;
   private int edtArtTra1_Backcolor ;
   private int edtArtMer_Backcolor ;
   private int edtArtUrg_Backcolor ;
   private int edtCliUrg_Backcolor ;
   private int edtCliEti_Backcolor ;
   private int edtArtEti_Backcolor ;
   private int edtArtAcaQui_Backcolor ;
   private int edtArtSua_Backcolor ;
   private int edtArtTipLar_Backcolor ;
   private int edtArtTipPle_Backcolor ;
   private int edtArtRen_Backcolor ;
   private int edtArtAcaMax_Backcolor ;
   private int edtArtAcaMin_Backcolor ;
   private int edtArtCruMax_Backcolor ;
   private int edtArtCruMin_Backcolor ;
   private int edtArtGraCru_Backcolor ;
   private int edtArtPml_Backcolor ;
   private int edtArtDsc_Backcolor ;
   private int edtTipArtDsc_Backcolor ;
   private int edtTipArtCod_Backcolor ;
   private int edtArtMat_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int2[] ;
   private int ZZ252CliCod ;
   private java.math.BigDecimal Z95ArtRen ;
   private java.math.BigDecimal Z88ArtMer ;
   private java.math.BigDecimal Z92ArtPreKgm ;
   private java.math.BigDecimal Z93ArtPreMtr ;
   private java.math.BigDecimal Z1905ArtRdoA ;
   private java.math.BigDecimal Z1904ArtRdoN ;
   private java.math.BigDecimal Z2791ArtFacAbs ;
   private java.math.BigDecimal Z4297ArtPmPPza ;
   private java.math.BigDecimal Z6660ArtFacTor ;
   private java.math.BigDecimal A95ArtRen ;
   private java.math.BigDecimal A88ArtMer ;
   private java.math.BigDecimal A92ArtPreKgm ;
   private java.math.BigDecimal A93ArtPreMtr ;
   private java.math.BigDecimal A1905ArtRdoA ;
   private java.math.BigDecimal A1904ArtRdoN ;
   private java.math.BigDecimal A2791ArtFacAbs ;
   private java.math.BigDecimal A4297ArtPmPPza ;
   private java.math.BigDecimal A6660ArtFacTor ;
   private java.math.BigDecimal ZZ95ArtRen ;
   private java.math.BigDecimal ZZ88ArtMer ;
   private java.math.BigDecimal ZZ92ArtPreKgm ;
   private java.math.BigDecimal ZZ93ArtPreMtr ;
   private java.math.BigDecimal ZZ1905ArtRdoA ;
   private java.math.BigDecimal ZZ1904ArtRdoN ;
   private java.math.BigDecimal ZZ2791ArtFacAbs ;
   private java.math.BigDecimal ZZ4297ArtPmPPza ;
   private java.math.BigDecimal ZZ6660ArtFacTor ;
   private String sPrefix ;
   private String wcpOAV66ArtCod ;
   private String wcpOAV67Mode2 ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z69ArtDsc ;
   private String Z87ArtMat ;
   private String Z101ArtTipPle ;
   private String Z100ArtTipLar ;
   private String Z66ArtCorOri ;
   private String Z70ArtEncOri ;
   private String Z96ArtSua ;
   private String Z64ArtAcaQui ;
   private String Z73ArtEti ;
   private String Z105ArtTra1 ;
   private String Z106ArtTra2 ;
   private String Z107ArtTra3 ;
   private String Z111ArtUrd1 ;
   private String Z112ArtUrd2 ;
   private String Z113ArtUrd3 ;
   private String Z91ArtPreDef ;
   private String Z2834ArtPle2 ;
   private String Z5741ArtComer ;
   private String Z967ArtNMtr ;
   private String Z4353ArtUsrCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV66ArtCod ;
   private String AV67Mode2 ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String A66ArtCorOri ;
   private String A70ArtEncOri ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtArtMat_Internalname ;
   private String A87ArtMat ;
   private String edtArtMat_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtTipArtCod_Internalname ;
   private String edtTipArtCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtTipArtDsc_Internalname ;
   private String A830TipArtDsc ;
   private String edtTipArtDsc_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtArtDsc_Internalname ;
   private String A69ArtDsc ;
   private String edtArtDsc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtArtPml_Internalname ;
   private String edtArtPml_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtArtGraCru_Internalname ;
   private String edtArtGraCru_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtArtCruMin_Internalname ;
   private String edtArtCruMin_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtArtCruMax_Internalname ;
   private String edtArtCruMax_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtArtAcaMin_Internalname ;
   private String edtArtAcaMin_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtArtAcaMax_Internalname ;
   private String edtArtAcaMax_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtArtRen_Internalname ;
   private String edtArtRen_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtArtTipPle_Internalname ;
   private String A101ArtTipPle ;
   private String edtArtTipPle_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtArtTipLar_Internalname ;
   private String A100ArtTipLar ;
   private String edtArtTipLar_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtArtSua_Internalname ;
   private String A96ArtSua ;
   private String edtArtSua_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtArtAcaQui_Internalname ;
   private String A64ArtAcaQui ;
   private String edtArtAcaQui_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtArtEti_Internalname ;
   private String A73ArtEti ;
   private String edtArtEti_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtCliEti_Internalname ;
   private String A272CliEti ;
   private String edtCliEti_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtCliUrg_Internalname ;
   private String edtCliUrg_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtArtUrg_Internalname ;
   private String edtArtUrg_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtArtMer_Internalname ;
   private String edtArtMer_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtArtTra1_Internalname ;
   private String A105ArtTra1 ;
   private String edtArtTra1_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtArtTra2_Internalname ;
   private String A106ArtTra2 ;
   private String edtArtTra2_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtArtTra3_Internalname ;
   private String A107ArtTra3 ;
   private String edtArtTra3_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtArtTraP1_Internalname ;
   private String edtArtTraP1_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtArtTraP2_Internalname ;
   private String edtArtTraP2_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtArtTraP3_Internalname ;
   private String edtArtTraP3_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtArtUrd1_Internalname ;
   private String A111ArtUrd1 ;
   private String edtArtUrd1_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtArtUrd2_Internalname ;
   private String A112ArtUrd2 ;
   private String edtArtUrd2_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtArtUrd3_Internalname ;
   private String A113ArtUrd3 ;
   private String edtArtUrd3_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtArtUrdP1_Internalname ;
   private String edtArtUrdP1_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtArtUrdP2_Internalname ;
   private String edtArtUrdP2_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String edtArtUrdP3_Internalname ;
   private String edtArtUrdP3_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtArtPreKgm_Internalname ;
   private String edtArtPreKgm_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String edtArtPreMtr_Internalname ;
   private String edtArtPreMtr_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String edtArtPreDef_Internalname ;
   private String A91ArtPreDef ;
   private String edtArtPreDef_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String edtArtEncCom_Internalname ;
   private String edtArtEncCom_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String edtArtEncAnh_Internalname ;
   private String edtArtEncAnh_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String edtArtGraAca_Internalname ;
   private String edtArtGraAca_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String edtArtRdoA_Internalname ;
   private String edtArtRdoA_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String edtArtRdoN_Internalname ;
   private String edtArtRdoN_Jsonclick ;
   private String lblTextblock48_Internalname ;
   private String lblTextblock48_Jsonclick ;
   private String edtArtFacAbs_Internalname ;
   private String edtArtFacAbs_Jsonclick ;
   private String lblTextblock49_Internalname ;
   private String lblTextblock49_Jsonclick ;
   private String edtArtPle2_Internalname ;
   private String A2834ArtPle2 ;
   private String edtArtPle2_Jsonclick ;
   private String lblTextblock50_Internalname ;
   private String lblTextblock50_Jsonclick ;
   private String edtArtNumCor_Internalname ;
   private String edtArtNumCor_Jsonclick ;
   private String lblTextblock51_Internalname ;
   private String lblTextblock51_Jsonclick ;
   private String edtArtAncSal1_Internalname ;
   private String edtArtAncSal1_Jsonclick ;
   private String lblTextblock52_Internalname ;
   private String lblTextblock52_Jsonclick ;
   private String edtArtAncSal2_Internalname ;
   private String edtArtAncSal2_Jsonclick ;
   private String lblTextblock53_Internalname ;
   private String lblTextblock53_Jsonclick ;
   private String edtArtAncSal3_Internalname ;
   private String edtArtAncSal3_Jsonclick ;
   private String lblTextblock54_Internalname ;
   private String lblTextblock54_Jsonclick ;
   private String edtArtGraAca2_Internalname ;
   private String edtArtGraAca2_Jsonclick ;
   private String lblTextblock55_Internalname ;
   private String lblTextblock55_Jsonclick ;
   private String edtArtGraCru2_Internalname ;
   private String edtArtGraCru2_Jsonclick ;
   private String lblTextblock56_Internalname ;
   private String lblTextblock56_Jsonclick ;
   private String edtClasCod_Internalname ;
   private String edtClasCod_Jsonclick ;
   private String lblTextblock57_Internalname ;
   private String lblTextblock57_Jsonclick ;
   private String edtArtPmPPza_Internalname ;
   private String edtArtPmPPza_Jsonclick ;
   private String lblTextblock58_Internalname ;
   private String lblTextblock58_Jsonclick ;
   private String edtArtRb_Internalname ;
   private String edtArtRb_Jsonclick ;
   private String lblTextblock59_Internalname ;
   private String lblTextblock59_Jsonclick ;
   private String edtTipArtClas_Internalname ;
   private String A4608TipArtClas ;
   private String edtTipArtClas_Jsonclick ;
   private String lblTextblock60_Internalname ;
   private String lblTextblock60_Jsonclick ;
   private String edtClasDsc_Internalname ;
   private String A4296ClasDsc ;
   private String edtClasDsc_Jsonclick ;
   private String lblTextblock61_Internalname ;
   private String lblTextblock61_Jsonclick ;
   private String edtArtFacTor_Internalname ;
   private String edtArtFacTor_Jsonclick ;
   private String lblTextblock62_Internalname ;
   private String lblTextblock62_Jsonclick ;
   private String edtArtComer_Internalname ;
   private String A5741ArtComer ;
   private String edtArtComer_Jsonclick ;
   private String lblTextblock63_Internalname ;
   private String lblTextblock63_Jsonclick ;
   private String edtArtNMtr_Internalname ;
   private String A967ArtNMtr ;
   private String edtArtNMtr_Jsonclick ;
   private String lblTextblock64_Internalname ;
   private String lblTextblock64_Jsonclick ;
   private String edtArtUsrCod_Internalname ;
   private String A4353ArtUsrCod ;
   private String edtArtUsrCod_Jsonclick ;
   private String lblTextblock65_Internalname ;
   private String lblTextblock65_Jsonclick ;
   private String edtArtFecMod_Internalname ;
   private String edtArtFecMod_Jsonclick ;
   private String lblTextblock66_Internalname ;
   private String lblTextblock66_Jsonclick ;
   private String edtArtFecCre_Internalname ;
   private String edtArtFecCre_Jsonclick ;
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
   private String AV59Modo ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z272CliEti ;
   private String Z830TipArtDsc ;
   private String Z4608TipArtClas ;
   private String Z4296ClasDsc ;
   private String sMode10 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String iV59Modo ;
   private String i66ArtCorOri ;
   private String i70ArtEncOri ;
   private String i5741ArtComer ;
   private String i967ArtNMtr ;
   private String GXv_char3[] ;
   private String GXv_char1[] ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ87ArtMat ;
   private String ZZ101ArtTipPle ;
   private String ZZ100ArtTipLar ;
   private String ZZ66ArtCorOri ;
   private String ZZ70ArtEncOri ;
   private String ZZ96ArtSua ;
   private String ZZ64ArtAcaQui ;
   private String ZZ105ArtTra1 ;
   private String ZZ106ArtTra2 ;
   private String ZZ107ArtTra3 ;
   private String ZZ111ArtUrd1 ;
   private String ZZ112ArtUrd2 ;
   private String ZZ113ArtUrd3 ;
   private String ZZ91ArtPreDef ;
   private String ZZ2834ArtPle2 ;
   private String ZZ5741ArtComer ;
   private String ZZ967ArtNMtr ;
   private String ZZ4353ArtUsrCod ;
   private String ZZ407EmprNom ;
   private String ZZ830TipArtDsc ;
   private String ZZ4608TipArtClas ;
   private String ZZ4296ClasDsc ;
   private String ZZ279CliNom ;
   private String ZZ272CliEti ;
   private String ZZ69ArtDsc ;
   private String ZZ73ArtEti ;
   private java.util.Date Z4354ArtFecMod ;
   private java.util.Date Z3683ArtFecCre ;
   private java.util.Date A4354ArtFecMod ;
   private java.util.Date A3683ArtFecCre ;
   private java.util.Date Gx_date ;
   private java.util.Date i3683ArtFecCre ;
   private java.util.Date ZZ4354ArtFecMod ;
   private java.util.Date ZZ3683ArtFecCre ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean n65ArtCod ;
   private boolean n4295ClasCod ;
   private boolean wbErr ;
   private boolean n66ArtCorOri ;
   private boolean n70ArtEncOri ;
   private boolean n407EmprNom ;
   private boolean n87ArtMat ;
   private boolean n830TipArtDsc ;
   private boolean n69ArtDsc ;
   private boolean n1148ArtPml ;
   private boolean n78ArtGraCru ;
   private boolean n68ArtCruMin ;
   private boolean n67ArtCruMax ;
   private boolean n63ArtAcaMin ;
   private boolean n62ArtAcaMax ;
   private boolean n95ArtRen ;
   private boolean n101ArtTipPle ;
   private boolean n100ArtTipLar ;
   private boolean n96ArtSua ;
   private boolean n64ArtAcaQui ;
   private boolean n73ArtEti ;
   private boolean n117ArtUrg ;
   private boolean n88ArtMer ;
   private boolean n105ArtTra1 ;
   private boolean n106ArtTra2 ;
   private boolean n107ArtTra3 ;
   private boolean n108ArtTraP1 ;
   private boolean n109ArtTraP2 ;
   private boolean n110ArtTraP3 ;
   private boolean n111ArtUrd1 ;
   private boolean n112ArtUrd2 ;
   private boolean n113ArtUrd3 ;
   private boolean n114ArtUrdP1 ;
   private boolean n115ArtUrdP2 ;
   private boolean n116ArtUrdP3 ;
   private boolean n92ArtPreKgm ;
   private boolean n93ArtPreMtr ;
   private boolean n91ArtPreDef ;
   private boolean n1229ArtEncCom ;
   private boolean n1230ArtEncAnh ;
   private boolean n1903ArtGraAca ;
   private boolean n1905ArtRdoA ;
   private boolean n1904ArtRdoN ;
   private boolean n2791ArtFacAbs ;
   private boolean n2834ArtPle2 ;
   private boolean n3121ArtNumCor ;
   private boolean n3122ArtAncSal1 ;
   private boolean n3123ArtAncSal2 ;
   private boolean n3124ArtAncSal3 ;
   private boolean n3125ArtGraAca2 ;
   private boolean n3126ArtGraCru2 ;
   private boolean n4297ArtPmPPza ;
   private boolean n4607ArtRb ;
   private boolean n4608TipArtClas ;
   private boolean n4296ClasDsc ;
   private boolean n6660ArtFacTor ;
   private boolean n5741ArtComer ;
   private boolean n967ArtNMtr ;
   private boolean n4353ArtUsrCod ;
   private boolean n4354ArtFecMod ;
   private boolean n3683ArtFecCre ;
   private boolean Gx_longc ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkArtCorOri ;
   private ICheckbox chkArtEncOri ;
   private IDataStoreProvider pr_default ;
   private String[] T00LP8_A65ArtCod ;
   private boolean[] T00LP8_n65ArtCod ;
   private String[] T00LP8_A69ArtDsc ;
   private boolean[] T00LP8_n69ArtDsc ;
   private String[] T00LP8_A279CliNom ;
   private String[] T00LP8_A407EmprNom ;
   private boolean[] T00LP8_n407EmprNom ;
   private String[] T00LP8_A87ArtMat ;
   private boolean[] T00LP8_n87ArtMat ;
   private String[] T00LP8_A830TipArtDsc ;
   private boolean[] T00LP8_n830TipArtDsc ;
   private short[] T00LP8_A1148ArtPml ;
   private boolean[] T00LP8_n1148ArtPml ;
   private short[] T00LP8_A78ArtGraCru ;
   private boolean[] T00LP8_n78ArtGraCru ;
   private short[] T00LP8_A68ArtCruMin ;
   private boolean[] T00LP8_n68ArtCruMin ;
   private short[] T00LP8_A67ArtCruMax ;
   private boolean[] T00LP8_n67ArtCruMax ;
   private short[] T00LP8_A63ArtAcaMin ;
   private boolean[] T00LP8_n63ArtAcaMin ;
   private short[] T00LP8_A62ArtAcaMax ;
   private boolean[] T00LP8_n62ArtAcaMax ;
   private java.math.BigDecimal[] T00LP8_A95ArtRen ;
   private boolean[] T00LP8_n95ArtRen ;
   private String[] T00LP8_A101ArtTipPle ;
   private boolean[] T00LP8_n101ArtTipPle ;
   private String[] T00LP8_A100ArtTipLar ;
   private boolean[] T00LP8_n100ArtTipLar ;
   private String[] T00LP8_A66ArtCorOri ;
   private boolean[] T00LP8_n66ArtCorOri ;
   private String[] T00LP8_A70ArtEncOri ;
   private boolean[] T00LP8_n70ArtEncOri ;
   private String[] T00LP8_A96ArtSua ;
   private boolean[] T00LP8_n96ArtSua ;
   private String[] T00LP8_A64ArtAcaQui ;
   private boolean[] T00LP8_n64ArtAcaQui ;
   private String[] T00LP8_A73ArtEti ;
   private boolean[] T00LP8_n73ArtEti ;
   private String[] T00LP8_A272CliEti ;
   private byte[] T00LP8_A306CliUrg ;
   private byte[] T00LP8_A117ArtUrg ;
   private boolean[] T00LP8_n117ArtUrg ;
   private java.math.BigDecimal[] T00LP8_A88ArtMer ;
   private boolean[] T00LP8_n88ArtMer ;
   private String[] T00LP8_A105ArtTra1 ;
   private boolean[] T00LP8_n105ArtTra1 ;
   private String[] T00LP8_A106ArtTra2 ;
   private boolean[] T00LP8_n106ArtTra2 ;
   private String[] T00LP8_A107ArtTra3 ;
   private boolean[] T00LP8_n107ArtTra3 ;
   private short[] T00LP8_A108ArtTraP1 ;
   private boolean[] T00LP8_n108ArtTraP1 ;
   private short[] T00LP8_A109ArtTraP2 ;
   private boolean[] T00LP8_n109ArtTraP2 ;
   private short[] T00LP8_A110ArtTraP3 ;
   private boolean[] T00LP8_n110ArtTraP3 ;
   private String[] T00LP8_A111ArtUrd1 ;
   private boolean[] T00LP8_n111ArtUrd1 ;
   private String[] T00LP8_A112ArtUrd2 ;
   private boolean[] T00LP8_n112ArtUrd2 ;
   private String[] T00LP8_A113ArtUrd3 ;
   private boolean[] T00LP8_n113ArtUrd3 ;
   private short[] T00LP8_A114ArtUrdP1 ;
   private boolean[] T00LP8_n114ArtUrdP1 ;
   private short[] T00LP8_A115ArtUrdP2 ;
   private boolean[] T00LP8_n115ArtUrdP2 ;
   private short[] T00LP8_A116ArtUrdP3 ;
   private boolean[] T00LP8_n116ArtUrdP3 ;
   private java.math.BigDecimal[] T00LP8_A92ArtPreKgm ;
   private boolean[] T00LP8_n92ArtPreKgm ;
   private java.math.BigDecimal[] T00LP8_A93ArtPreMtr ;
   private boolean[] T00LP8_n93ArtPreMtr ;
   private String[] T00LP8_A91ArtPreDef ;
   private boolean[] T00LP8_n91ArtPreDef ;
   private short[] T00LP8_A1229ArtEncCom ;
   private boolean[] T00LP8_n1229ArtEncCom ;
   private short[] T00LP8_A1230ArtEncAnh ;
   private boolean[] T00LP8_n1230ArtEncAnh ;
   private short[] T00LP8_A1903ArtGraAca ;
   private boolean[] T00LP8_n1903ArtGraAca ;
   private java.math.BigDecimal[] T00LP8_A1905ArtRdoA ;
   private boolean[] T00LP8_n1905ArtRdoA ;
   private java.math.BigDecimal[] T00LP8_A1904ArtRdoN ;
   private boolean[] T00LP8_n1904ArtRdoN ;
   private java.math.BigDecimal[] T00LP8_A2791ArtFacAbs ;
   private boolean[] T00LP8_n2791ArtFacAbs ;
   private String[] T00LP8_A2834ArtPle2 ;
   private boolean[] T00LP8_n2834ArtPle2 ;
   private short[] T00LP8_A3121ArtNumCor ;
   private boolean[] T00LP8_n3121ArtNumCor ;
   private short[] T00LP8_A3122ArtAncSal1 ;
   private boolean[] T00LP8_n3122ArtAncSal1 ;
   private short[] T00LP8_A3123ArtAncSal2 ;
   private boolean[] T00LP8_n3123ArtAncSal2 ;
   private short[] T00LP8_A3124ArtAncSal3 ;
   private boolean[] T00LP8_n3124ArtAncSal3 ;
   private short[] T00LP8_A3125ArtGraAca2 ;
   private boolean[] T00LP8_n3125ArtGraAca2 ;
   private short[] T00LP8_A3126ArtGraCru2 ;
   private boolean[] T00LP8_n3126ArtGraCru2 ;
   private java.math.BigDecimal[] T00LP8_A4297ArtPmPPza ;
   private boolean[] T00LP8_n4297ArtPmPPza ;
   private short[] T00LP8_A4607ArtRb ;
   private boolean[] T00LP8_n4607ArtRb ;
   private String[] T00LP8_A4608TipArtClas ;
   private boolean[] T00LP8_n4608TipArtClas ;
   private String[] T00LP8_A4296ClasDsc ;
   private boolean[] T00LP8_n4296ClasDsc ;
   private java.math.BigDecimal[] T00LP8_A6660ArtFacTor ;
   private boolean[] T00LP8_n6660ArtFacTor ;
   private String[] T00LP8_A5741ArtComer ;
   private boolean[] T00LP8_n5741ArtComer ;
   private String[] T00LP8_A967ArtNMtr ;
   private boolean[] T00LP8_n967ArtNMtr ;
   private String[] T00LP8_A4353ArtUsrCod ;
   private boolean[] T00LP8_n4353ArtUsrCod ;
   private java.util.Date[] T00LP8_A4354ArtFecMod ;
   private boolean[] T00LP8_n4354ArtFecMod ;
   private java.util.Date[] T00LP8_A3683ArtFecCre ;
   private boolean[] T00LP8_n3683ArtFecCre ;
   private String[] T00LP8_A396EmprCod ;
   private int[] T00LP8_A252CliCod ;
   private boolean[] T00LP8_n252CliCod ;
   private short[] T00LP8_A829TipArtCod ;
   private short[] T00LP8_A4295ClasCod ;
   private boolean[] T00LP8_n4295ClasCod ;
   private String[] T00LP4_A407EmprNom ;
   private boolean[] T00LP4_n407EmprNom ;
   private String[] T00LP6_A830TipArtDsc ;
   private boolean[] T00LP6_n830TipArtDsc ;
   private String[] T00LP6_A4608TipArtClas ;
   private boolean[] T00LP6_n4608TipArtClas ;
   private String[] T00LP7_A4296ClasDsc ;
   private boolean[] T00LP7_n4296ClasDsc ;
   private String[] T00LP5_A279CliNom ;
   private String[] T00LP5_A272CliEti ;
   private byte[] T00LP5_A306CliUrg ;
   private String[] T00LP9_A407EmprNom ;
   private boolean[] T00LP9_n407EmprNom ;
   private String[] T00LP10_A830TipArtDsc ;
   private boolean[] T00LP10_n830TipArtDsc ;
   private String[] T00LP10_A4608TipArtClas ;
   private boolean[] T00LP10_n4608TipArtClas ;
   private String[] T00LP11_A4296ClasDsc ;
   private boolean[] T00LP11_n4296ClasDsc ;
   private String[] T00LP12_A279CliNom ;
   private String[] T00LP12_A272CliEti ;
   private byte[] T00LP12_A306CliUrg ;
   private String[] T00LP13_A396EmprCod ;
   private int[] T00LP13_A252CliCod ;
   private boolean[] T00LP13_n252CliCod ;
   private String[] T00LP13_A65ArtCod ;
   private boolean[] T00LP13_n65ArtCod ;
   private String[] T00LP3_A65ArtCod ;
   private boolean[] T00LP3_n65ArtCod ;
   private String[] T00LP3_A69ArtDsc ;
   private boolean[] T00LP3_n69ArtDsc ;
   private String[] T00LP3_A87ArtMat ;
   private boolean[] T00LP3_n87ArtMat ;
   private short[] T00LP3_A1148ArtPml ;
   private boolean[] T00LP3_n1148ArtPml ;
   private short[] T00LP3_A78ArtGraCru ;
   private boolean[] T00LP3_n78ArtGraCru ;
   private short[] T00LP3_A68ArtCruMin ;
   private boolean[] T00LP3_n68ArtCruMin ;
   private short[] T00LP3_A67ArtCruMax ;
   private boolean[] T00LP3_n67ArtCruMax ;
   private short[] T00LP3_A63ArtAcaMin ;
   private boolean[] T00LP3_n63ArtAcaMin ;
   private short[] T00LP3_A62ArtAcaMax ;
   private boolean[] T00LP3_n62ArtAcaMax ;
   private java.math.BigDecimal[] T00LP3_A95ArtRen ;
   private boolean[] T00LP3_n95ArtRen ;
   private String[] T00LP3_A101ArtTipPle ;
   private boolean[] T00LP3_n101ArtTipPle ;
   private String[] T00LP3_A100ArtTipLar ;
   private boolean[] T00LP3_n100ArtTipLar ;
   private String[] T00LP3_A66ArtCorOri ;
   private boolean[] T00LP3_n66ArtCorOri ;
   private String[] T00LP3_A70ArtEncOri ;
   private boolean[] T00LP3_n70ArtEncOri ;
   private String[] T00LP3_A96ArtSua ;
   private boolean[] T00LP3_n96ArtSua ;
   private String[] T00LP3_A64ArtAcaQui ;
   private boolean[] T00LP3_n64ArtAcaQui ;
   private String[] T00LP3_A73ArtEti ;
   private boolean[] T00LP3_n73ArtEti ;
   private byte[] T00LP3_A117ArtUrg ;
   private boolean[] T00LP3_n117ArtUrg ;
   private java.math.BigDecimal[] T00LP3_A88ArtMer ;
   private boolean[] T00LP3_n88ArtMer ;
   private String[] T00LP3_A105ArtTra1 ;
   private boolean[] T00LP3_n105ArtTra1 ;
   private String[] T00LP3_A106ArtTra2 ;
   private boolean[] T00LP3_n106ArtTra2 ;
   private String[] T00LP3_A107ArtTra3 ;
   private boolean[] T00LP3_n107ArtTra3 ;
   private short[] T00LP3_A108ArtTraP1 ;
   private boolean[] T00LP3_n108ArtTraP1 ;
   private short[] T00LP3_A109ArtTraP2 ;
   private boolean[] T00LP3_n109ArtTraP2 ;
   private short[] T00LP3_A110ArtTraP3 ;
   private boolean[] T00LP3_n110ArtTraP3 ;
   private String[] T00LP3_A111ArtUrd1 ;
   private boolean[] T00LP3_n111ArtUrd1 ;
   private String[] T00LP3_A112ArtUrd2 ;
   private boolean[] T00LP3_n112ArtUrd2 ;
   private String[] T00LP3_A113ArtUrd3 ;
   private boolean[] T00LP3_n113ArtUrd3 ;
   private short[] T00LP3_A114ArtUrdP1 ;
   private boolean[] T00LP3_n114ArtUrdP1 ;
   private short[] T00LP3_A115ArtUrdP2 ;
   private boolean[] T00LP3_n115ArtUrdP2 ;
   private short[] T00LP3_A116ArtUrdP3 ;
   private boolean[] T00LP3_n116ArtUrdP3 ;
   private java.math.BigDecimal[] T00LP3_A92ArtPreKgm ;
   private boolean[] T00LP3_n92ArtPreKgm ;
   private java.math.BigDecimal[] T00LP3_A93ArtPreMtr ;
   private boolean[] T00LP3_n93ArtPreMtr ;
   private String[] T00LP3_A91ArtPreDef ;
   private boolean[] T00LP3_n91ArtPreDef ;
   private short[] T00LP3_A1229ArtEncCom ;
   private boolean[] T00LP3_n1229ArtEncCom ;
   private short[] T00LP3_A1230ArtEncAnh ;
   private boolean[] T00LP3_n1230ArtEncAnh ;
   private short[] T00LP3_A1903ArtGraAca ;
   private boolean[] T00LP3_n1903ArtGraAca ;
   private java.math.BigDecimal[] T00LP3_A1905ArtRdoA ;
   private boolean[] T00LP3_n1905ArtRdoA ;
   private java.math.BigDecimal[] T00LP3_A1904ArtRdoN ;
   private boolean[] T00LP3_n1904ArtRdoN ;
   private java.math.BigDecimal[] T00LP3_A2791ArtFacAbs ;
   private boolean[] T00LP3_n2791ArtFacAbs ;
   private String[] T00LP3_A2834ArtPle2 ;
   private boolean[] T00LP3_n2834ArtPle2 ;
   private short[] T00LP3_A3121ArtNumCor ;
   private boolean[] T00LP3_n3121ArtNumCor ;
   private short[] T00LP3_A3122ArtAncSal1 ;
   private boolean[] T00LP3_n3122ArtAncSal1 ;
   private short[] T00LP3_A3123ArtAncSal2 ;
   private boolean[] T00LP3_n3123ArtAncSal2 ;
   private short[] T00LP3_A3124ArtAncSal3 ;
   private boolean[] T00LP3_n3124ArtAncSal3 ;
   private short[] T00LP3_A3125ArtGraAca2 ;
   private boolean[] T00LP3_n3125ArtGraAca2 ;
   private short[] T00LP3_A3126ArtGraCru2 ;
   private boolean[] T00LP3_n3126ArtGraCru2 ;
   private java.math.BigDecimal[] T00LP3_A4297ArtPmPPza ;
   private boolean[] T00LP3_n4297ArtPmPPza ;
   private short[] T00LP3_A4607ArtRb ;
   private boolean[] T00LP3_n4607ArtRb ;
   private java.math.BigDecimal[] T00LP3_A6660ArtFacTor ;
   private boolean[] T00LP3_n6660ArtFacTor ;
   private String[] T00LP3_A5741ArtComer ;
   private boolean[] T00LP3_n5741ArtComer ;
   private String[] T00LP3_A967ArtNMtr ;
   private boolean[] T00LP3_n967ArtNMtr ;
   private String[] T00LP3_A4353ArtUsrCod ;
   private boolean[] T00LP3_n4353ArtUsrCod ;
   private java.util.Date[] T00LP3_A4354ArtFecMod ;
   private boolean[] T00LP3_n4354ArtFecMod ;
   private java.util.Date[] T00LP3_A3683ArtFecCre ;
   private boolean[] T00LP3_n3683ArtFecCre ;
   private String[] T00LP3_A396EmprCod ;
   private int[] T00LP3_A252CliCod ;
   private boolean[] T00LP3_n252CliCod ;
   private short[] T00LP3_A829TipArtCod ;
   private short[] T00LP3_A4295ClasCod ;
   private boolean[] T00LP3_n4295ClasCod ;
   private String[] T00LP14_A396EmprCod ;
   private int[] T00LP14_A252CliCod ;
   private boolean[] T00LP14_n252CliCod ;
   private String[] T00LP14_A65ArtCod ;
   private boolean[] T00LP14_n65ArtCod ;
   private String[] T00LP15_A396EmprCod ;
   private int[] T00LP15_A252CliCod ;
   private boolean[] T00LP15_n252CliCod ;
   private String[] T00LP15_A65ArtCod ;
   private boolean[] T00LP15_n65ArtCod ;
   private String[] T00LP2_A65ArtCod ;
   private boolean[] T00LP2_n65ArtCod ;
   private String[] T00LP2_A69ArtDsc ;
   private boolean[] T00LP2_n69ArtDsc ;
   private String[] T00LP2_A87ArtMat ;
   private boolean[] T00LP2_n87ArtMat ;
   private short[] T00LP2_A1148ArtPml ;
   private boolean[] T00LP2_n1148ArtPml ;
   private short[] T00LP2_A78ArtGraCru ;
   private boolean[] T00LP2_n78ArtGraCru ;
   private short[] T00LP2_A68ArtCruMin ;
   private boolean[] T00LP2_n68ArtCruMin ;
   private short[] T00LP2_A67ArtCruMax ;
   private boolean[] T00LP2_n67ArtCruMax ;
   private short[] T00LP2_A63ArtAcaMin ;
   private boolean[] T00LP2_n63ArtAcaMin ;
   private short[] T00LP2_A62ArtAcaMax ;
   private boolean[] T00LP2_n62ArtAcaMax ;
   private java.math.BigDecimal[] T00LP2_A95ArtRen ;
   private boolean[] T00LP2_n95ArtRen ;
   private String[] T00LP2_A101ArtTipPle ;
   private boolean[] T00LP2_n101ArtTipPle ;
   private String[] T00LP2_A100ArtTipLar ;
   private boolean[] T00LP2_n100ArtTipLar ;
   private String[] T00LP2_A66ArtCorOri ;
   private boolean[] T00LP2_n66ArtCorOri ;
   private String[] T00LP2_A70ArtEncOri ;
   private boolean[] T00LP2_n70ArtEncOri ;
   private String[] T00LP2_A96ArtSua ;
   private boolean[] T00LP2_n96ArtSua ;
   private String[] T00LP2_A64ArtAcaQui ;
   private boolean[] T00LP2_n64ArtAcaQui ;
   private String[] T00LP2_A73ArtEti ;
   private boolean[] T00LP2_n73ArtEti ;
   private byte[] T00LP2_A117ArtUrg ;
   private boolean[] T00LP2_n117ArtUrg ;
   private java.math.BigDecimal[] T00LP2_A88ArtMer ;
   private boolean[] T00LP2_n88ArtMer ;
   private String[] T00LP2_A105ArtTra1 ;
   private boolean[] T00LP2_n105ArtTra1 ;
   private String[] T00LP2_A106ArtTra2 ;
   private boolean[] T00LP2_n106ArtTra2 ;
   private String[] T00LP2_A107ArtTra3 ;
   private boolean[] T00LP2_n107ArtTra3 ;
   private short[] T00LP2_A108ArtTraP1 ;
   private boolean[] T00LP2_n108ArtTraP1 ;
   private short[] T00LP2_A109ArtTraP2 ;
   private boolean[] T00LP2_n109ArtTraP2 ;
   private short[] T00LP2_A110ArtTraP3 ;
   private boolean[] T00LP2_n110ArtTraP3 ;
   private String[] T00LP2_A111ArtUrd1 ;
   private boolean[] T00LP2_n111ArtUrd1 ;
   private String[] T00LP2_A112ArtUrd2 ;
   private boolean[] T00LP2_n112ArtUrd2 ;
   private String[] T00LP2_A113ArtUrd3 ;
   private boolean[] T00LP2_n113ArtUrd3 ;
   private short[] T00LP2_A114ArtUrdP1 ;
   private boolean[] T00LP2_n114ArtUrdP1 ;
   private short[] T00LP2_A115ArtUrdP2 ;
   private boolean[] T00LP2_n115ArtUrdP2 ;
   private short[] T00LP2_A116ArtUrdP3 ;
   private boolean[] T00LP2_n116ArtUrdP3 ;
   private java.math.BigDecimal[] T00LP2_A92ArtPreKgm ;
   private boolean[] T00LP2_n92ArtPreKgm ;
   private java.math.BigDecimal[] T00LP2_A93ArtPreMtr ;
   private boolean[] T00LP2_n93ArtPreMtr ;
   private String[] T00LP2_A91ArtPreDef ;
   private boolean[] T00LP2_n91ArtPreDef ;
   private short[] T00LP2_A1229ArtEncCom ;
   private boolean[] T00LP2_n1229ArtEncCom ;
   private short[] T00LP2_A1230ArtEncAnh ;
   private boolean[] T00LP2_n1230ArtEncAnh ;
   private short[] T00LP2_A1903ArtGraAca ;
   private boolean[] T00LP2_n1903ArtGraAca ;
   private java.math.BigDecimal[] T00LP2_A1905ArtRdoA ;
   private boolean[] T00LP2_n1905ArtRdoA ;
   private java.math.BigDecimal[] T00LP2_A1904ArtRdoN ;
   private boolean[] T00LP2_n1904ArtRdoN ;
   private java.math.BigDecimal[] T00LP2_A2791ArtFacAbs ;
   private boolean[] T00LP2_n2791ArtFacAbs ;
   private String[] T00LP2_A2834ArtPle2 ;
   private boolean[] T00LP2_n2834ArtPle2 ;
   private short[] T00LP2_A3121ArtNumCor ;
   private boolean[] T00LP2_n3121ArtNumCor ;
   private short[] T00LP2_A3122ArtAncSal1 ;
   private boolean[] T00LP2_n3122ArtAncSal1 ;
   private short[] T00LP2_A3123ArtAncSal2 ;
   private boolean[] T00LP2_n3123ArtAncSal2 ;
   private short[] T00LP2_A3124ArtAncSal3 ;
   private boolean[] T00LP2_n3124ArtAncSal3 ;
   private short[] T00LP2_A3125ArtGraAca2 ;
   private boolean[] T00LP2_n3125ArtGraAca2 ;
   private short[] T00LP2_A3126ArtGraCru2 ;
   private boolean[] T00LP2_n3126ArtGraCru2 ;
   private java.math.BigDecimal[] T00LP2_A4297ArtPmPPza ;
   private boolean[] T00LP2_n4297ArtPmPPza ;
   private short[] T00LP2_A4607ArtRb ;
   private boolean[] T00LP2_n4607ArtRb ;
   private java.math.BigDecimal[] T00LP2_A6660ArtFacTor ;
   private boolean[] T00LP2_n6660ArtFacTor ;
   private String[] T00LP2_A5741ArtComer ;
   private boolean[] T00LP2_n5741ArtComer ;
   private String[] T00LP2_A967ArtNMtr ;
   private boolean[] T00LP2_n967ArtNMtr ;
   private String[] T00LP2_A4353ArtUsrCod ;
   private boolean[] T00LP2_n4353ArtUsrCod ;
   private java.util.Date[] T00LP2_A4354ArtFecMod ;
   private boolean[] T00LP2_n4354ArtFecMod ;
   private java.util.Date[] T00LP2_A3683ArtFecCre ;
   private boolean[] T00LP2_n3683ArtFecCre ;
   private String[] T00LP2_A396EmprCod ;
   private int[] T00LP2_A252CliCod ;
   private boolean[] T00LP2_n252CliCod ;
   private short[] T00LP2_A829TipArtCod ;
   private short[] T00LP2_A4295ClasCod ;
   private boolean[] T00LP2_n4295ClasCod ;
   private String[] T00LP19_A407EmprNom ;
   private boolean[] T00LP19_n407EmprNom ;
   private String[] T00LP20_A279CliNom ;
   private String[] T00LP20_A272CliEti ;
   private byte[] T00LP20_A306CliUrg ;
   private String[] T00LP21_A830TipArtDsc ;
   private boolean[] T00LP21_n830TipArtDsc ;
   private String[] T00LP21_A4608TipArtClas ;
   private boolean[] T00LP21_n4608TipArtClas ;
   private String[] T00LP22_A4296ClasDsc ;
   private boolean[] T00LP22_n4296ClasDsc ;
   private String[] T00LP23_A396EmprCod ;
   private int[] T00LP23_A252CliCod ;
   private boolean[] T00LP23_n252CliCod ;
   private String[] T00LP23_A65ArtCod ;
   private boolean[] T00LP23_n65ArtCod ;
   private byte[] T00LP23_A499GrpFamCod ;
   private String[] T00LP24_A396EmprCod ;
   private int[] T00LP24_A252CliCod ;
   private boolean[] T00LP24_n252CliCod ;
   private String[] T00LP24_A12814ARTConID ;
   private String[] T00LP24_A65ArtCod ;
   private boolean[] T00LP24_n65ArtCod ;
   private String[] T00LP25_A396EmprCod ;
   private int[] T00LP25_A252CliCod ;
   private boolean[] T00LP25_n252CliCod ;
   private String[] T00LP25_A65ArtCod ;
   private boolean[] T00LP25_n65ArtCod ;
   private byte[] T00LP25_A12363SocInt ;
   private String[] T00LP26_A396EmprCod ;
   private java.util.Date[] T00LP26_A4929Inc_Dia ;
   private short[] T00LP26_A5728JBCLLin ;
   private String[] T00LP27_A396EmprCod ;
   private int[] T00LP27_A252CliCod ;
   private boolean[] T00LP27_n252CliCod ;
   private String[] T00LP27_A5809MMezCod ;
   private String[] T00LP27_A65ArtCod ;
   private boolean[] T00LP27_n65ArtCod ;
   private String[] T00LP28_A396EmprCod ;
   private int[] T00LP28_A252CliCod ;
   private boolean[] T00LP28_n252CliCod ;
   private String[] T00LP28_A5234MezCod ;
   private byte[] T00LP28_A5240MezLin ;
   private String[] T00LP29_A396EmprCod ;
   private int[] T00LP29_A252CliCod ;
   private boolean[] T00LP29_n252CliCod ;
   private String[] T00LP29_A65ArtCod ;
   private boolean[] T00LP29_n65ArtCod ;
   private int[] T00LP29_A4116estreclim ;
   private String[] T00LP30_A396EmprCod ;
   private int[] T00LP30_A252CliCod ;
   private boolean[] T00LP30_n252CliCod ;
   private String[] T00LP30_A65ArtCod ;
   private boolean[] T00LP30_n65ArtCod ;
   private String[] T00LP30_A4061EstNomCol ;
   private String[] T00LP31_A396EmprCod ;
   private String[] T00LP31_A9705ErpNped ;
   private short[] T00LP31_A8652ErpLin ;
   private String[] T00LP32_A396EmprCod ;
   private int[] T00LP32_A252CliCod ;
   private boolean[] T00LP32_n252CliCod ;
   private String[] T00LP32_A65ArtCod ;
   private boolean[] T00LP32_n65ArtCod ;
   private String[] T00LP32_A7266CAAqP ;
   private String[] T00LP33_A396EmprCod ;
   private int[] T00LP33_A252CliCod ;
   private boolean[] T00LP33_n252CliCod ;
   private String[] T00LP33_A65ArtCod ;
   private boolean[] T00LP33_n65ArtCod ;
   private java.util.Date[] T00LP33_A11084H_DiaA ;
   private String[] T00LP34_A396EmprCod ;
   private int[] T00LP34_A252CliCod ;
   private boolean[] T00LP34_n252CliCod ;
   private String[] T00LP34_A65ArtCod ;
   private boolean[] T00LP34_n65ArtCod ;
   private byte[] T00LP34_A10972Int_cod ;
   private String[] T00LP35_A396EmprCod ;
   private int[] T00LP35_A252CliCod ;
   private boolean[] T00LP35_n252CliCod ;
   private String[] T00LP35_A65ArtCod ;
   private boolean[] T00LP35_n65ArtCod ;
   private String[] T00LP35_A10577Pg_Procod ;
   private String[] T00LP36_A396EmprCod ;
   private int[] T00LP36_A252CliCod ;
   private boolean[] T00LP36_n252CliCod ;
   private String[] T00LP36_A65ArtCod ;
   private boolean[] T00LP36_n65ArtCod ;
   private String[] T00LP36_A10272Hz_cod ;
   private String[] T00LP37_A396EmprCod ;
   private int[] T00LP37_A252CliCod ;
   private boolean[] T00LP37_n252CliCod ;
   private String[] T00LP37_A65ArtCod ;
   private boolean[] T00LP37_n65ArtCod ;
   private String[] T00LP37_A10041ArtSH ;
   private String[] T00LP38_A396EmprCod ;
   private int[] T00LP38_A252CliCod ;
   private boolean[] T00LP38_n252CliCod ;
   private String[] T00LP38_A65ArtCod ;
   private boolean[] T00LP38_n65ArtCod ;
   private String[] T00LP38_A8427TipoCt ;
   private int[] T00LP38_A8428CapMxMq ;
   private String[] T00LP39_A396EmprCod ;
   private int[] T00LP39_A252CliCod ;
   private boolean[] T00LP39_n252CliCod ;
   private String[] T00LP39_A65ArtCod ;
   private boolean[] T00LP39_n65ArtCod ;
   private short[] T00LP39_A8342CodPred ;
   private String[] T00LP40_A396EmprCod ;
   private int[] T00LP40_A252CliCod ;
   private boolean[] T00LP40_n252CliCod ;
   private String[] T00LP40_A65ArtCod ;
   private boolean[] T00LP40_n65ArtCod ;
   private String[] T00LP40_A8089ArtcodTj ;
   private String[] T00LP41_A396EmprCod ;
   private int[] T00LP41_A252CliCod ;
   private boolean[] T00LP41_n252CliCod ;
   private String[] T00LP41_A65ArtCod ;
   private boolean[] T00LP41_n65ArtCod ;
   private String[] T00LP41_A7956Mq_CodM ;
   private String[] T00LP42_A396EmprCod ;
   private int[] T00LP42_A252CliCod ;
   private boolean[] T00LP42_n252CliCod ;
   private String[] T00LP42_A65ArtCod ;
   private boolean[] T00LP42_n65ArtCod ;
   private short[] T00LP42_A7949Par_Art ;
   private String[] T00LP43_A396EmprCod ;
   private int[] T00LP43_A252CliCod ;
   private boolean[] T00LP43_n252CliCod ;
   private String[] T00LP43_A65ArtCod ;
   private boolean[] T00LP43_n65ArtCod ;
   private short[] T00LP43_A7135Lin_fast ;
   private String[] T00LP44_A396EmprCod ;
   private int[] T00LP44_A252CliCod ;
   private boolean[] T00LP44_n252CliCod ;
   private String[] T00LP44_A65ArtCod ;
   private boolean[] T00LP44_n65ArtCod ;
   private short[] T00LP44_A6954Mat_lin ;
   private String[] T00LP45_A396EmprCod ;
   private String[] T00LP45_A602MaqCod ;
   private int[] T00LP45_A6078MaqCliCod ;
   private String[] T00LP45_A6079MaqArtCod ;
   private String[] T00LP46_A396EmprCod ;
   private int[] T00LP46_A252CliCod ;
   private boolean[] T00LP46_n252CliCod ;
   private String[] T00LP46_A65ArtCod ;
   private boolean[] T00LP46_n65ArtCod ;
   private short[] T00LP46_A5382EstCatAny ;
   private String[] T00LP46_A5383EstCatSer ;
   private short[] T00LP46_A5384EstCatTip ;
   private String[] T00LP47_A396EmprCod ;
   private int[] T00LP47_A252CliCod ;
   private boolean[] T00LP47_n252CliCod ;
   private String[] T00LP47_A65ArtCod ;
   private boolean[] T00LP47_n65ArtCod ;
   private String[] T00LP47_A4658MdlCod ;
   private String[] T00LP48_A396EmprCod ;
   private int[] T00LP48_A252CliCod ;
   private boolean[] T00LP48_n252CliCod ;
   private String[] T00LP48_A4175WebEmpCod ;
   private String[] T00LP49_A396EmprCod ;
   private int[] T00LP49_A252CliCod ;
   private boolean[] T00LP49_n252CliCod ;
   private String[] T00LP49_A4079WEBDISCOD ;
   private String[] T00LP50_A396EmprCod ;
   private int[] T00LP50_A252CliCod ;
   private boolean[] T00LP50_n252CliCod ;
   private String[] T00LP50_A65ArtCod ;
   private boolean[] T00LP50_n65ArtCod ;
   private String[] T00LP50_A4058CCFColNom ;
   private int[] T00LP50_A4059CCFColNum ;
   private String[] T00LP51_A396EmprCod ;
   private int[] T00LP51_A252CliCod ;
   private boolean[] T00LP51_n252CliCod ;
   private String[] T00LP51_A65ArtCod ;
   private boolean[] T00LP51_n65ArtCod ;
   private String[] T00LP51_A1177Dibujo ;
   private int[] T00LP51_A1790DibIntCod ;
   private String[] T00LP52_A396EmprCod ;
   private int[] T00LP52_A252CliCod ;
   private boolean[] T00LP52_n252CliCod ;
   private String[] T00LP52_A65ArtCod ;
   private boolean[] T00LP52_n65ArtCod ;
   private byte[] T00LP52_A1080LinPre ;
   private String[] T00LP53_A396EmprCod ;
   private long[] T00LP53_A3814PePCod ;
   private String[] T00LP54_A396EmprCod ;
   private byte[] T00LP54_A3413OpeManCod ;
   private String[] T00LP54_A3430PreManNMt ;
   private int[] T00LP54_A252CliCod ;
   private boolean[] T00LP54_n252CliCod ;
   private String[] T00LP54_A65ArtCod ;
   private boolean[] T00LP54_n65ArtCod ;
   private String[] T00LP55_A396EmprCod ;
   private int[] T00LP55_A3415ParManNum ;
   private String[] T00LP56_A396EmprCod ;
   private byte[] T00LP56_A3331LanBroCod ;
   private short[] T00LP56_A3333LanBroLin ;
   private String[] T00LP57_A396EmprCod ;
   private int[] T00LP57_A252CliCod ;
   private boolean[] T00LP57_n252CliCod ;
   private String[] T00LP57_A65ArtCod ;
   private boolean[] T00LP57_n65ArtCod ;
   private java.math.BigDecimal[] T00LP57_A3319ArtCapKgs ;
   private String[] T00LP58_A396EmprCod ;
   private int[] T00LP58_A252CliCod ;
   private boolean[] T00LP58_n252CliCod ;
   private String[] T00LP58_A65ArtCod ;
   private boolean[] T00LP58_n65ArtCod ;
   private String[] T00LP58_A3288CCalCod ;
   private String[] T00LP59_A396EmprCod ;
   private int[] T00LP59_A252CliCod ;
   private boolean[] T00LP59_n252CliCod ;
   private String[] T00LP59_A65ArtCod ;
   private boolean[] T00LP59_n65ArtCod ;
   private String[] T00LP59_A3033CCCod ;
   private String[] T00LP60_A396EmprCod ;
   private int[] T00LP60_A252CliCod ;
   private boolean[] T00LP60_n252CliCod ;
   private String[] T00LP60_A65ArtCod ;
   private boolean[] T00LP60_n65ArtCod ;
   private byte[] T00LP60_A2937RecIntCod ;
   private String[] T00LP61_A396EmprCod ;
   private int[] T00LP61_A252CliCod ;
   private boolean[] T00LP61_n252CliCod ;
   private String[] T00LP61_A65ArtCod ;
   private boolean[] T00LP61_n65ArtCod ;
   private short[] T00LP61_A2931Limite2 ;
   private String[] T00LP62_A396EmprCod ;
   private int[] T00LP62_A252CliCod ;
   private boolean[] T00LP62_n252CliCod ;
   private String[] T00LP62_A65ArtCod ;
   private boolean[] T00LP62_n65ArtCod ;
   private short[] T00LP62_A71ArtEstAny ;
   private String[] T00LP62_A2756ArtEstSer ;
   private String[] T00LP63_A396EmprCod ;
   private int[] T00LP63_A252CliCod ;
   private boolean[] T00LP63_n252CliCod ;
   private String[] T00LP63_A1504CliProCod ;
   private String[] T00LP63_A65ArtCod ;
   private boolean[] T00LP63_n65ArtCod ;
   private String[] T00LP64_A396EmprCod ;
   private int[] T00LP64_A252CliCod ;
   private boolean[] T00LP64_n252CliCod ;
   private String[] T00LP64_A65ArtCod ;
   private boolean[] T00LP64_n65ArtCod ;
   private byte[] T00LP64_A598LinRec ;
   private String[] T00LP65_A396EmprCod ;
   private int[] T00LP65_A252CliCod ;
   private boolean[] T00LP65_n252CliCod ;
   private String[] T00LP65_A65ArtCod ;
   private boolean[] T00LP65_n65ArtCod ;
   private byte[] T00LP65_A831TipColCod ;
   private String[] T00LP66_A396EmprCod ;
   private int[] T00LP66_A252CliCod ;
   private boolean[] T00LP66_n252CliCod ;
   private String[] T00LP66_A65ArtCod ;
   private boolean[] T00LP66_n65ArtCod ;
   private String[] T00LP66_A758ProCod ;
   private String[] T00LP67_A396EmprCod ;
   private int[] T00LP67_A252CliCod ;
   private boolean[] T00LP67_n252CliCod ;
   private String[] T00LP67_A65ArtCod ;
   private boolean[] T00LP67_n65ArtCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tarticl__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tarticl__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tarticl__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tarticl__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tarticl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00LP2", "SELECT ArtCod, ArtDsc, ArtMat, ArtPml, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtCorOri, ArtEncOri, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtPreKgm, ArtPreMtr, ArtPreDef, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoA, ArtRdoN, ArtFacAbs, ArtPle2, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtPmPPza, ArtRb, ArtFacTor, ArtComer, ArtNMtr, ArtUsrCod, ArtFecMod, ArtFecCre, EmprCod, CliCod, TipArtCod, ClasCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?  FOR UPDATE OF ArtDsc, ArtMat, ArtPml, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtCorOri, ArtEncOri, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtPreKgm, ArtPreMtr, ArtPreDef, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoA, ArtRdoN, ArtFacAbs, ArtPle2, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtPmPPza, ArtRb, ArtFacTor, ArtComer, ArtNMtr, ArtUsrCod, ArtFecMod, ArtFecCre, TipArtCod, ClasCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LP3", "SELECT ArtCod, ArtDsc, ArtMat, ArtPml, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtCorOri, ArtEncOri, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtPreKgm, ArtPreMtr, ArtPreDef, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoA, ArtRdoN, ArtFacAbs, ArtPle2, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtPmPPza, ArtRb, ArtFacTor, ArtComer, ArtNMtr, ArtUsrCod, ArtFecMod, ArtFecCre, EmprCod, CliCod, TipArtCod, ClasCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LP4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LP5", "SELECT CliNom, CliEti, CliUrg FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LP6", "SELECT TipArtDsc, TipArtClas FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LP7", "SELECT ClasDsc FROM TXPCLAPEN WHERE EmprCod = ? AND ClasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LP8", "SELECT /*+ FIRST_ROWS(100) */ TM1.ArtCod, TM1.ArtDsc, T3.CliNom, T2.EmprNom, TM1.ArtMat, T4.TipArtDsc, TM1.ArtPml, TM1.ArtGraCru, TM1.ArtCruMin, TM1.ArtCruMax, TM1.ArtAcaMin, TM1.ArtAcaMax, TM1.ArtRen, TM1.ArtTipPle, TM1.ArtTipLar, TM1.ArtCorOri, TM1.ArtEncOri, TM1.ArtSua, TM1.ArtAcaQui, TM1.ArtEti, T3.CliEti, T3.CliUrg, TM1.ArtUrg, TM1.ArtMer, TM1.ArtTra1, TM1.ArtTra2, TM1.ArtTra3, TM1.ArtTraP1, TM1.ArtTraP2, TM1.ArtTraP3, TM1.ArtUrd1, TM1.ArtUrd2, TM1.ArtUrd3, TM1.ArtUrdP1, TM1.ArtUrdP2, TM1.ArtUrdP3, TM1.ArtPreKgm, TM1.ArtPreMtr, TM1.ArtPreDef, TM1.ArtEncCom, TM1.ArtEncAnh, TM1.ArtGraAca, TM1.ArtRdoA, TM1.ArtRdoN, TM1.ArtFacAbs, TM1.ArtPle2, TM1.ArtNumCor, TM1.ArtAncSal1, TM1.ArtAncSal2, TM1.ArtAncSal3, TM1.ArtGraAca2, TM1.ArtGraCru2, TM1.ArtPmPPza, TM1.ArtRb, T4.TipArtClas, T5.ClasDsc, TM1.ArtFacTor, TM1.ArtComer, TM1.ArtNMtr, TM1.ArtUsrCod, TM1.ArtFecMod, TM1.ArtFecCre, TM1.EmprCod, TM1.CliCod, TM1.TipArtCod, TM1.ClasCod FROM ((((TXPARTICU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPTIPART T4 ON T4.EmprCod = TM1.EmprCod AND T4.TipArtCod = TM1.TipArtCod) LEFT JOIN TXPCLAPEN T5 ON T5.EmprCod = TM1.EmprCod AND T5.ClasCod = TM1.ClasCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LP9", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LP10", "SELECT TipArtDsc, TipArtClas FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LP11", "SELECT ClasDsc FROM TXPCLAPEN WHERE EmprCod = ? AND ClasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LP12", "SELECT CliNom, CliEti, CliUrg FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LP13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LP14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ? or CliCod = ? and EmprCod = ? and ArtCod > ?) ORDER BY EmprCod, CliCod, ArtCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ? or CliCod = ? and EmprCod = ? and ArtCod < ?) ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00LP16", "INSERT INTO TXPARTICU(ArtCod, ArtDsc, ArtMat, ArtPml, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtCorOri, ArtEncOri, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtPreKgm, ArtPreMtr, ArtPreDef, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoA, ArtRdoN, ArtFacAbs, ArtPle2, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtPmPPza, ArtRb, ArtFacTor, ArtComer, ArtNMtr, ArtUsrCod, ArtFecMod, ArtFecCre, EmprCod, CliCod, TipArtCod, ClasCod, ArtObs, ArtObsFac, ULinRec, ArtNumTex1, ArtNumTex2, NumTexCod, ArtCosBase, ArtObsLon, ArtPreCap, ArtAnu, ArtPrMEst, ULinPre, ArtPreUlAc, ArtPreUsrM, ArtPelAnh, ArtAcaAnh, ArtAcaMar, ArtAcaBak, ArtLotMaq, ArtCruMts, ArtCruKgs, ArtCruEnr, ArtLotPza, ArtLotMts, ArtLotKgs, ArtAcaFor, ArtValMtr, ArtCodExt, ClaTubCod, ClaBolCod, ArtRdoCru1, ArtRdoCru2, ArtLu, Mat_UltL, Mat_Maq, UltLinFT, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtCla, CapKgs1, CapKgs2, CapKgs3, CapKgs4, CapKgs5, CapKgs6, CapKgs7, CapKgs8, CapKgs9, CapKgs10, ArtFabsH, ArtFabsT, ArtNProg, ArtVbd, ArtVbn, ArtAb, ArtObsGrm, ArtObsAnc, ArtCdb, ArtGalga, ArtPlatina, ArtPgd, ArtTh, Art_Cd, CapUsuM, CapFecM, Mat_UsuM, Mat_FecM, CapUsuA, CapFecA, ArtHilos, ArtPasad, ArtAncC, ArtGrm2C, ArtRdoC, ArtPreObs, ArtFacUti, ArtPreEst, ArtDefEst, ArtNumTip, ArtPreUnd, Mat_ObsG, ArtMT, ArtTRabs, ArtKgMn, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, ArtEncAnc, ArtObsOtra, ArtRdto4, Artdsc2, ArtgrComp, ArtKgspp, ArtPrepp, ArtActivo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, ' ')", GX_NOMASK, "TXPARTICU")
         ,new UpdateCursor("T00LP17", "UPDATE TXPARTICU SET ArtDsc=?, ArtMat=?, ArtPml=?, ArtGraCru=?, ArtCruMin=?, ArtCruMax=?, ArtAcaMin=?, ArtAcaMax=?, ArtRen=?, ArtTipPle=?, ArtTipLar=?, ArtCorOri=?, ArtEncOri=?, ArtSua=?, ArtAcaQui=?, ArtEti=?, ArtUrg=?, ArtMer=?, ArtTra1=?, ArtTra2=?, ArtTra3=?, ArtTraP1=?, ArtTraP2=?, ArtTraP3=?, ArtUrd1=?, ArtUrd2=?, ArtUrd3=?, ArtUrdP1=?, ArtUrdP2=?, ArtUrdP3=?, ArtPreKgm=?, ArtPreMtr=?, ArtPreDef=?, ArtEncCom=?, ArtEncAnh=?, ArtGraAca=?, ArtRdoA=?, ArtRdoN=?, ArtFacAbs=?, ArtPle2=?, ArtNumCor=?, ArtAncSal1=?, ArtAncSal2=?, ArtAncSal3=?, ArtGraAca2=?, ArtGraCru2=?, ArtPmPPza=?, ArtRb=?, ArtFacTor=?, ArtComer=?, ArtNMtr=?, ArtUsrCod=?, ArtFecMod=?, ArtFecCre=?, TipArtCod=?, ClasCod=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK, "TXPARTICU")
         ,new UpdateCursor("T00LP18", "DELETE FROM TXPARTICU  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK, "TXPARTICU")
         ,new ForEachCursor("T00LP19", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LP20", "SELECT CliNom, CliEti, CliUrg FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LP21", "SELECT TipArtDsc, TipArtClas FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LP22", "SELECT ClasDsc FROM TXPCLAPEN WHERE EmprCod = ? AND ClasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00LP23", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, GrpFamCod FROM TXPEstTa0 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP24", "SELECT * FROM (SELECT EmprCod, CliCod, ARTConID, ArtCod FROM TXPARTCo1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP25", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, SocInt FROM TXPSOCRAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP26", "SELECT * FROM (SELECT EmprCod, Inc_Dia, JBCLLin FROM TXPJBConL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP27", "SELECT * FROM (SELECT EmprCod, CliCod, MMezCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP28", "SELECT * FROM (SELECT EmprCod, CliCod, MezCod, MezLin FROM TXPLMZCLA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP29", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, estreclim FROM TXPrecest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP30", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP31", "SELECT * FROM (SELECT EmprCod, ErpNped, ErpLin FROM TXPCPEDCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP32", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CAAqP FROM TXPPCARC WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP33", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, H_DiaA FROM TXPHPREAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP34", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Int_cod FROM TXPINCINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP35", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Pg_Procod FROM TXPPGCOLO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP36", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Hz_cod FROM TXPTR02JL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP37", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtSH FROM TXPCLATFA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP38", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipoCt, CapMxMq FROM TXPARTMQT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP39", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CodPred FROM TXPPVPNIT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP40", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtcodTj FROM TXPTEJART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP41", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mq_CodM FROM TXPTNART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP42", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Par_Art FROM TXPARTTEJ WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP43", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Lin_fast FROM TXPPARTIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP44", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mat_lin FROM TXPARTMAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP45", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCliCod = ? AND MaqArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP46", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip FROM TXPESTCAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP47", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod FROM TXPModels WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP48", "SELECT * FROM (SELECT EmprCod, CliCod, WebEmpCod FROM TXPWEBEMP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP49", "SELECT * FROM (SELECT EmprCod, CliCod, WEBDISCOD FROM TXPWebDis WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP50", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum FROM TXPCCSeri WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP51", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Dibujo, DibIntCod FROM TXPCPRECO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP52", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinPre FROM TXPLINPRE WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP53", "SELECT * FROM (SELECT EmprCod, PePCod FROM TXPPedPro WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP54", "SELECT * FROM (SELECT EmprCod, OpeManCod, PreManNMt, CliCod, ArtCod FROM TXPPREMAN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP55", "SELECT * FROM (SELECT EmprCod, ParManNum FROM TXPPARMAN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP56", "SELECT * FROM (SELECT EmprCod, LanBroCod, LanBroLin FROM TXPLANBRL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP57", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtCapKgs FROM TXPPRECAP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP58", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCalCod FROM TXPPARSER WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP59", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCCod FROM TXPCCArt WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP60", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, RecIntCod FROM TXPARTINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP61", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Limite2 FROM TXPRECARB WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP62", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer FROM TXPCESART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP63", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP64", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinRec FROM TXPRECARG WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP65", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipColCod FROM TXPPRETCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP66", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00LP67", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod FROM TXPARTICU ORDER BY EmprCod, CliCod, ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 4);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 4);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 4);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((short[]) buf[45])[0] = rslt.getShort(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((short[]) buf[47])[0] = rslt.getShort(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 4);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 4);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 4);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(32,5);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(33,5);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((short[]) buf[67])[0] = rslt.getShort(35);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((short[]) buf[69])[0] = rslt.getShort(36);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((short[]) buf[71])[0] = rslt.getShort(37);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[73])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[75])[0] = rslt.getBigDecimal(39,2);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[77])[0] = rslt.getBigDecimal(40,2);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(41, 30);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((short[]) buf[81])[0] = rslt.getShort(42);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((short[]) buf[83])[0] = rslt.getShort(43);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((short[]) buf[85])[0] = rslt.getShort(44);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((short[]) buf[87])[0] = rslt.getShort(45);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((short[]) buf[89])[0] = rslt.getShort(46);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((short[]) buf[91])[0] = rslt.getShort(47);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[93])[0] = rslt.getBigDecimal(48,2);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((short[]) buf[95])[0] = rslt.getShort(49);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[97])[0] = rslt.getBigDecimal(50,2);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((String[]) buf[99])[0] = rslt.getString(51, 16);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getString(52, 10);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getString(53, 8);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[105])[0] = rslt.getGXDate(54);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[107])[0] = rslt.getGXDate(55);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((String[]) buf[109])[0] = rslt.getString(56, 3);
               ((int[]) buf[110])[0] = rslt.getInt(57);
               ((short[]) buf[111])[0] = rslt.getShort(58);
               ((short[]) buf[112])[0] = rslt.getShort(59);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 4);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 4);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 4);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((short[]) buf[45])[0] = rslt.getShort(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((short[]) buf[47])[0] = rslt.getShort(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 4);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 4);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 4);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(32,5);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(33,5);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((short[]) buf[67])[0] = rslt.getShort(35);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((short[]) buf[69])[0] = rslt.getShort(36);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((short[]) buf[71])[0] = rslt.getShort(37);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[73])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[75])[0] = rslt.getBigDecimal(39,2);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[77])[0] = rslt.getBigDecimal(40,2);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(41, 30);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((short[]) buf[81])[0] = rslt.getShort(42);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((short[]) buf[83])[0] = rslt.getShort(43);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((short[]) buf[85])[0] = rslt.getShort(44);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((short[]) buf[87])[0] = rslt.getShort(45);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((short[]) buf[89])[0] = rslt.getShort(46);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((short[]) buf[91])[0] = rslt.getShort(47);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[93])[0] = rslt.getBigDecimal(48,2);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((short[]) buf[95])[0] = rslt.getShort(49);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[97])[0] = rslt.getBigDecimal(50,2);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((String[]) buf[99])[0] = rslt.getString(51, 16);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getString(52, 10);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getString(53, 8);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[105])[0] = rslt.getGXDate(54);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[107])[0] = rslt.getGXDate(55);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((String[]) buf[109])[0] = rslt.getString(56, 3);
               ((int[]) buf[110])[0] = rslt.getInt(57);
               ((short[]) buf[111])[0] = rslt.getShort(58);
               ((short[]) buf[112])[0] = rslt.getShort(59);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 10);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 6);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(19, 6);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((byte[]) buf[39])[0] = rslt.getByte(22);
               ((byte[]) buf[40])[0] = rslt.getByte(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(25, 4);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(26, 4);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(27, 4);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((short[]) buf[50])[0] = rslt.getShort(28);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((short[]) buf[52])[0] = rslt.getShort(29);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((short[]) buf[54])[0] = rslt.getShort(30);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(31, 4);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(32, 4);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(33, 4);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((short[]) buf[62])[0] = rslt.getShort(34);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((short[]) buf[64])[0] = rslt.getShort(35);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((short[]) buf[66])[0] = rslt.getShort(36);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[68])[0] = rslt.getBigDecimal(37,5);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[70])[0] = rslt.getBigDecimal(38,5);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(39, 1);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((short[]) buf[74])[0] = rslt.getShort(40);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((short[]) buf[76])[0] = rslt.getShort(41);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((short[]) buf[78])[0] = rslt.getShort(42);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[80])[0] = rslt.getBigDecimal(43,2);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[82])[0] = rslt.getBigDecimal(44,2);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[84])[0] = rslt.getBigDecimal(45,2);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getString(46, 30);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((short[]) buf[88])[0] = rslt.getShort(47);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((short[]) buf[90])[0] = rslt.getShort(48);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((short[]) buf[92])[0] = rslt.getShort(49);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((short[]) buf[94])[0] = rslt.getShort(50);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((short[]) buf[96])[0] = rslt.getShort(51);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((short[]) buf[98])[0] = rslt.getShort(52);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[100])[0] = rslt.getBigDecimal(53,2);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((short[]) buf[102])[0] = rslt.getShort(54);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getString(55, 4);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getString(56, 40);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[108])[0] = rslt.getBigDecimal(57,2);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getString(58, 16);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((String[]) buf[112])[0] = rslt.getString(59, 10);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((String[]) buf[114])[0] = rslt.getString(60, 8);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[116])[0] = rslt.getGXDate(61);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[118])[0] = rslt.getGXDate(62);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((String[]) buf[120])[0] = rslt.getString(63, 3);
               ((int[]) buf[121])[0] = rslt.getInt(64);
               ((short[]) buf[122])[0] = rslt.getShort(65);
               ((short[]) buf[123])[0] = rslt.getShort(66);
               ((boolean[]) buf[124])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               stmt.setString(5, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 16);
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               stmt.setString(5, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 16);
               }
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 16);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 10);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 10);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 1);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 6);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 6);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(18, ((Number) parms[35]).byteValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 4);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 4);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 4);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[45]).shortValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(24, ((Number) parms[47]).shortValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(25, ((Number) parms[49]).shortValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[51], 4);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[53], 4);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[55], 4);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[57]).shortValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[59]).shortValue());
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[61]).shortValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[63], 5);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(33, (java.math.BigDecimal)parms[65], 5);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[67], 1);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(35, ((Number) parms[69]).shortValue());
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(36, ((Number) parms[71]).shortValue());
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(37, ((Number) parms[73]).shortValue());
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(38, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(39, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(40, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[81], 30);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(42, ((Number) parms[83]).shortValue());
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(43, ((Number) parms[85]).shortValue());
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(44, ((Number) parms[87]).shortValue());
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(45, ((Number) parms[89]).shortValue());
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(46, ((Number) parms[91]).shortValue());
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(47, ((Number) parms[93]).shortValue());
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(48, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(49, ((Number) parms[97]).shortValue());
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(50, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(51, (String)parms[101], 16);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[103], 10);
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(53, (String)parms[105], 8);
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.DATE );
               }
               else
               {
                  stmt.setDate(54, (java.util.Date)parms[107]);
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.DATE );
               }
               else
               {
                  stmt.setDate(55, (java.util.Date)parms[109]);
               }
               stmt.setString(56, (String)parms[110], 3);
               if ( ((Boolean) parms[111]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(57, ((Number) parms[112]).intValue());
               }
               stmt.setShort(58, ((Number) parms[113]).shortValue());
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(59, ((Number) parms[115]).shortValue());
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
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 10);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 10);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 6);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 6);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 1);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[33]).byteValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 4);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 4);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 4);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[43]).shortValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[45]).shortValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(24, ((Number) parms[47]).shortValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[49], 4);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[51], 4);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[53], 4);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(28, ((Number) parms[55]).shortValue());
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[57]).shortValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[59]).shortValue());
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(31, (java.math.BigDecimal)parms[61], 5);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[63], 5);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[65], 1);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(34, ((Number) parms[67]).shortValue());
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(35, ((Number) parms[69]).shortValue());
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(36, ((Number) parms[71]).shortValue());
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(37, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(38, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(39, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[79], 30);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(41, ((Number) parms[81]).shortValue());
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(42, ((Number) parms[83]).shortValue());
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(43, ((Number) parms[85]).shortValue());
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(44, ((Number) parms[87]).shortValue());
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(45, ((Number) parms[89]).shortValue());
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(46, ((Number) parms[91]).shortValue());
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(47, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(48, ((Number) parms[95]).shortValue());
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(49, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[99], 16);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(51, (String)parms[101], 10);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[103], 8);
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.DATE );
               }
               else
               {
                  stmt.setDate(53, (java.util.Date)parms[105]);
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.DATE );
               }
               else
               {
                  stmt.setDate(54, (java.util.Date)parms[107]);
               }
               stmt.setShort(55, ((Number) parms[108]).shortValue());
               if ( ((Boolean) parms[109]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(56, ((Number) parms[110]).shortValue());
               }
               stmt.setString(57, (String)parms[111], 3);
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(58, ((Number) parms[113]).intValue());
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(59, (String)parms[115], 16);
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
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 20 :
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
               return;
            case 64 :
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
   }

}

