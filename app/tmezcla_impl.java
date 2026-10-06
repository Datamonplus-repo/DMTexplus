package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmezcla_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
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
         gxload_5( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A5234MezCod = httpContext.GetPar( "MezCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A5234MezCod", A5234MezCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A252CliCod, A5234MezCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         n65ArtCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A252CliCod, A65ArtCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A966PartCod = httpContext.GetPar( "PartCod") ;
         n966PartCod = false ;
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod, A966PartCod, A252CliCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "COMPOSICION DE MEZCLAS", ""), (short)(0)) ;
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

   public tmezcla_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmezcla_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmezcla_impl.class ));
   }

   public tmezcla_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCLA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCLA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCLA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCLA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMEZCLA.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZCLA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEZCLA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZCLA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEZCLA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo de Mezcla", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZCLA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMezCod_Internalname, GXutil.rtrim( A5234MezCod), GXutil.rtrim( localUtil.format( A5234MezCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMezCod_Jsonclick, 0, "", "", "", "", "", 1, edtMezCod_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEZCLA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCLA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZCLA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEZCLA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZCLA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEZCLA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Ultimo Numero Mezcla", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZCLA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMezULin_Internalname, GXutil.ltrim( localUtil.ntoc( A5235MezULin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMezULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5235MezULin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A5235MezULin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMezULin_Jsonclick, 0, "", "", "", "", "", 1, edtMezULin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEZCLA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Total Porcentaje Mezcla (Form.", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZCLA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMezPorT_Internalname, GXutil.ltrim( localUtil.ntoc( A5236MezPorT, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMezPorT_Enabled!=0) ? localUtil.format( A5236MezPorT, "ZZ9.99") : localUtil.format( A5236MezPorT, "ZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMezPorT_Jsonclick, 0, "", "", "", "", "", 1, edtMezPorT_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEZCLA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Kgs necesarios Materia Mezcla", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZCLA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMezKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A5237MezKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMezKgs_Enabled!=0) ? localUtil.format( A5237MezKgs, "ZZZZZ9.99") : localUtil.format( A5237MezKgs, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMezKgs_Jsonclick, 0, "", "", "", "", "", 1, edtMezKgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEZCLA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Numero Partida Mezcla", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZCLA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMezPda_Internalname, GXutil.rtrim( A5238MezPda), GXutil.rtrim( localUtil.format( A5238MezPda, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMezPda_Jsonclick, 0, "", "", "", "", "", 1, edtMezPda_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMEZCLA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Fecha Partida Mezcla", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZCLA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMezFecPda_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMezFecPda_Internalname, localUtil.format(A5239MezFecPda, "99/99/99"), localUtil.format( A5239MezFecPda, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMezFecPda_Jsonclick, 0, "", "", "", "", "", 1, edtMezFecPda_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEZCLA.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMezFecPda_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMezFecPda_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMEZCLA.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Fecha Entrega Cli. Mezclas", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZCLA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMezFecEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMezFecEnt_Internalname, localUtil.format(A5308MezFecEnt, "99/99/99"), localUtil.format( A5308MezFecEnt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMezFecEnt_Jsonclick, 0, "", "", "", "", "", 1, edtMezFecEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEZCLA.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMezFecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMezFecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMEZCLA.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Porcentaje Total Mezcla HSS", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMEZCLA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMezPorTot_Internalname, GXutil.ltrim( localUtil.ntoc( A5309MezPorTot, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMezPorTot_Enabled!=0) ? localUtil.format( A5309MezPorTot, "ZZ9.99") : localUtil.format( A5309MezPorTot, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMezPorTot_Jsonclick, 0, "", "", "", "", "", 1, edtMezPorTot_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMEZCLA.htm");
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
         nBlankRcdCount1580 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1580 = (short)(1) ;
            scanStart1FP1580( ) ;
            while ( RcdFound1580 != 0 )
            {
               init_level_properties1580( ) ;
               getByPrimaryKey1FP1580( ) ;
               addRow1FP1580( ) ;
               scanNext1FP1580( ) ;
            }
            scanEnd1FP1580( ) ;
            nBlankRcdCount1580 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B5236MezPorT = A5236MezPorT ;
         n5236MezPorT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
         standaloneNotModal1FP1580( ) ;
         standaloneModal1FP1580( ) ;
         sMode1580 = Gx_mode ;
         while ( nGXsfl_80_idx < nRC_GXsfl_80 )
         {
            bGXsfl_80_Refreshing = true ;
            readRow1FP1580( ) ;
            edtavnRcdDeleted_1580_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1580_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1580_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1580_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtMezLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MEZLIN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMezLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtMezPor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MEZPOR_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMezPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezPor_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtArtCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTCOD_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtArtDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTDSC_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtMezArtDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MEZARTDSC_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMezArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezArtDsc_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtPartCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARTCOD_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPartCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPartCod_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtMezColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MEZCOLNOM_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMezColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezColNom_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtMezColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MEZCOLNUM_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMezColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezColNum_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtMezColTCo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MEZCOLTCO_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMezColTCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezColTCo_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtMezKgsArt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MEZKGSART_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMezKgsArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezKgsArt_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtMezHdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MEZHDR_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMezHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezHdr_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtMezReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MEZREO_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMezReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezReo_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtMezPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MEZPAR_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMezPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezPar_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtMezObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MEZOBS_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMezObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezObs_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            if ( ( nRcdExists_1580 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1FP1580( ) ;
            }
            sendRow1FP1580( ) ;
            bGXsfl_80_Refreshing = false ;
         }
         Gx_mode = sMode1580 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A5236MezPorT = B5236MezPorT ;
         n5236MezPorT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1580 = (short)(5) ;
         nRcdExists_1580 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1FP1580( ) ;
            while ( RcdFound1580 != 0 )
            {
               sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_801580( ) ;
               init_level_properties1580( ) ;
               standaloneNotModal1FP1580( ) ;
               getByPrimaryKey1FP1580( ) ;
               standaloneModal1FP1580( ) ;
               addRow1FP1580( ) ;
               scanNext1FP1580( ) ;
            }
            scanEnd1FP1580( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1580 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_801580( ) ;
      initAll1FP1580( ) ;
      init_level_properties1580( ) ;
      B5236MezPorT = A5236MezPorT ;
      n5236MezPorT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
      nRcdExists_1580 = (short)(0) ;
      nIsMod_1580 = (short)(0) ;
      nRcdDeleted_1580 = (short)(0) ;
      nBlankRcdCount1580 = (short)(nBlankRcdUsr1580+nBlankRcdCount1580) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1580 > 0 )
      {
         standaloneNotModal1FP1580( ) ;
         standaloneModal1FP1580( ) ;
         addRow1FP1580( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMezLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1580 = (short)(nBlankRcdCount1580-1) ;
      }
      Gx_mode = sMode1580 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A5236MezPorT = B5236MezPorT ;
      n5236MezPorT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCLA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCLA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCLA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMEZCLA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TMEZCLA.htm");
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
         Z5234MezCod = httpContext.cgiGet( "Z5234MezCod") ;
         Z5235MezULin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5235MezULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5237MezKgs = localUtil.ctond( httpContext.cgiGet( "Z5237MezKgs")) ;
         Z5238MezPda = httpContext.cgiGet( "Z5238MezPda") ;
         Z5239MezFecPda = localUtil.ctod( httpContext.cgiGet( "Z5239MezFecPda"), 0) ;
         Z5308MezFecEnt = localUtil.ctod( httpContext.cgiGet( "Z5308MezFecEnt"), 0) ;
         Z5309MezPorTot = localUtil.ctond( httpContext.cgiGet( "Z5309MezPorTot")) ;
         O5236MezPorT = localUtil.ctond( httpContext.cgiGet( "O5236MezPorT")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_80 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_80"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         else
         {
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         A5234MezCod = httpContext.cgiGet( edtMezCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5234MezCod", A5234MezCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMezULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMezULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MEZULIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMezULin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5235MezULin = (byte)(0) ;
            n5235MezULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5235MezULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5235MezULin), 2, 0));
         }
         else
         {
            A5235MezULin = (byte)(localUtil.ctol( httpContext.cgiGet( edtMezULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5235MezULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5235MezULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5235MezULin), 2, 0));
         }
         A5236MezPorT = localUtil.ctond( httpContext.cgiGet( edtMezPorT_Internalname)) ;
         n5236MezPorT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMezKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMezKgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MEZKGS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMezKgs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5237MezKgs = DecimalUtil.ZERO ;
            n5237MezKgs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5237MezKgs", GXutil.ltrimstr( A5237MezKgs, 9, 2));
         }
         else
         {
            A5237MezKgs = localUtil.ctond( httpContext.cgiGet( edtMezKgs_Internalname)) ;
            n5237MezKgs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5237MezKgs", GXutil.ltrimstr( A5237MezKgs, 9, 2));
         }
         A5238MezPda = httpContext.cgiGet( edtMezPda_Internalname) ;
         n5238MezPda = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5238MezPda", A5238MezPda);
         if ( localUtil.vcdate( httpContext.cgiGet( edtMezFecPda_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "MEZFECPDA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMezFecPda_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5239MezFecPda = GXutil.nullDate() ;
            n5239MezFecPda = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5239MezFecPda", localUtil.format(A5239MezFecPda, "99/99/99"));
         }
         else
         {
            A5239MezFecPda = localUtil.ctod( httpContext.cgiGet( edtMezFecPda_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n5239MezFecPda = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5239MezFecPda", localUtil.format(A5239MezFecPda, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtMezFecEnt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "MEZFECENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMezFecEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5308MezFecEnt = GXutil.nullDate() ;
            n5308MezFecEnt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5308MezFecEnt", localUtil.format(A5308MezFecEnt, "99/99/99"));
         }
         else
         {
            A5308MezFecEnt = localUtil.ctod( httpContext.cgiGet( edtMezFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n5308MezFecEnt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5308MezFecEnt", localUtil.format(A5308MezFecEnt, "99/99/99"));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMezPorTot_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMezPorTot_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MEZPORTOT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMezPorTot_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5309MezPorTot = DecimalUtil.ZERO ;
            n5309MezPorTot = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5309MezPorTot", GXutil.ltrimstr( A5309MezPorTot, 6, 2));
         }
         else
         {
            A5309MezPorTot = localUtil.ctond( httpContext.cgiGet( edtMezPorTot_Internalname)) ;
            n5309MezPorTot = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5309MezPorTot", GXutil.ltrimstr( A5309MezPorTot, 6, 2));
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
            A5234MezCod = httpContext.GetPar( "MezCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A5234MezCod", A5234MezCod);
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
            initAll1FP1579( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1580_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1580_Enabled), 5, 0), !bGXsfl_80_Refreshing);
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
      disableAttributes1FP1579( ) ;
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

   public void confirm_1FP0( )
   {
      beforeValidate1FP1579( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1FP1579( ) ;
         }
         else
         {
            checkExtendedTable1FP1579( ) ;
            if ( AnyError == 0 )
            {
               zm1FP1579( 4) ;
               zm1FP1579( 5) ;
               zm1FP1579( 6) ;
            }
            closeExtendedTableCursors1FP1579( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1579 = Gx_mode ;
         confirm_1FP1580( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1579 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1579 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1FP0( ) ;
      }
   }

   public void confirm_1FP1580( )
   {
      s5236MezPorT = O5236MezPorT ;
      n5236MezPorT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow1FP1580( ) ;
         if ( ( nRcdExists_1580 != 0 ) || ( nIsMod_1580 != 0 ) )
         {
            getKey1FP1580( ) ;
            if ( ( nRcdExists_1580 == 0 ) && ( nRcdDeleted_1580 == 0 ) )
            {
               if ( RcdFound1580 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1FP1580( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1FP1580( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1FP1580( 8) ;
                        zm1FP1580( 9) ;
                     }
                     closeExtendedTableCursors1FP1580( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O5236MezPorT = A5236MezPorT ;
                     n5236MezPorT = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
                  }
               }
               else
               {
                  GXCCtl = "MEZLIN_" + sGXsfl_80_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMezLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1580 != 0 )
               {
                  if ( nRcdDeleted_1580 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1FP1580( ) ;
                     load1FP1580( ) ;
                     beforeValidate1FP1580( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1FP1580( ) ;
                        O5236MezPorT = A5236MezPorT ;
                        n5236MezPorT = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1580 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1FP1580( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1FP1580( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1FP1580( 8) ;
                              zm1FP1580( 9) ;
                           }
                           closeExtendedTableCursors1FP1580( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O5236MezPorT = A5236MezPorT ;
                           n5236MezPorT = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1580 == 0 )
                  {
                     GXCCtl = "MEZLIN_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMezLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1580_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1580, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMezLin_Internalname, GXutil.ltrim( localUtil.ntoc( A5240MezLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMezPor_Internalname, GXutil.ltrim( localUtil.ntoc( A5241MezPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtArtCod_Internalname, GXutil.rtrim( A65ArtCod)) ;
         httpContext.changePostValue( edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc)) ;
         httpContext.changePostValue( edtMezArtDsc_Internalname, GXutil.rtrim( A5242MezArtDsc)) ;
         httpContext.changePostValue( edtPartCod_Internalname, GXutil.rtrim( A966PartCod)) ;
         httpContext.changePostValue( edtMezColNom_Internalname, GXutil.rtrim( A5243MezColNom)) ;
         httpContext.changePostValue( edtMezColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A5244MezColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMezColTCo_Internalname, GXutil.ltrim( localUtil.ntoc( A5245MezColTCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMezKgsArt_Internalname, GXutil.ltrim( localUtil.ntoc( A5246MezKgsArt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMezHdr_Internalname, GXutil.ltrim( localUtil.ntoc( A5247MezHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMezReo_Internalname, GXutil.ltrim( localUtil.ntoc( A5248MezReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMezPar_Internalname, GXutil.rtrim( A5249MezPar)) ;
         httpContext.changePostValue( edtMezObs_Internalname, GXutil.rtrim( A5833MezObs)) ;
         httpContext.changePostValue( "ZT_"+"Z5240MezLin_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z5240MezLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5241MezPor_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z5241MezPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5242MezArtDsc_"+sGXsfl_80_idx, GXutil.rtrim( Z5242MezArtDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z5243MezColNom_"+sGXsfl_80_idx, GXutil.rtrim( Z5243MezColNom)) ;
         httpContext.changePostValue( "ZT_"+"Z5244MezColNum_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z5244MezColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5245MezColTCo_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z5245MezColTCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5247MezHdr_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z5247MezHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5248MezReo_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z5248MezReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5249MezPar_"+sGXsfl_80_idx, GXutil.rtrim( Z5249MezPar)) ;
         httpContext.changePostValue( "ZT_"+"Z5833MezObs_"+sGXsfl_80_idx, GXutil.rtrim( Z5833MezObs)) ;
         httpContext.changePostValue( "ZT_"+"Z65ArtCod_"+sGXsfl_80_idx, GXutil.rtrim( Z65ArtCod)) ;
         httpContext.changePostValue( "ZT_"+"Z966PartCod_"+sGXsfl_80_idx, GXutil.rtrim( Z966PartCod)) ;
         httpContext.changePostValue( "T5241MezPor_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O5241MezPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1580_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1580, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1580_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1580, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1580_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1580, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1580 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1580_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1580_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MEZLIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MEZPOR_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezPor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTCOD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTDSC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MEZARTDSC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezArtDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARTCOD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPartCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MEZCOLNOM_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MEZCOLNUM_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MEZCOLTCO_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezColTCo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MEZKGSART_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezKgsArt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MEZHDR_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezHdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MEZREO_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MEZPAR_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MEZOBS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O5236MezPorT = s5236MezPorT ;
      n5236MezPorT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1FP0( )
   {
   }

   public void zm1FP1579( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5235MezULin = T01FP7_A5235MezULin[0] ;
            Z5237MezKgs = T01FP7_A5237MezKgs[0] ;
            Z5238MezPda = T01FP7_A5238MezPda[0] ;
            Z5239MezFecPda = T01FP7_A5239MezFecPda[0] ;
            Z5308MezFecEnt = T01FP7_A5308MezFecEnt[0] ;
            Z5309MezPorTot = T01FP7_A5309MezPorTot[0] ;
         }
         else
         {
            Z5235MezULin = A5235MezULin ;
            Z5237MezKgs = A5237MezKgs ;
            Z5238MezPda = A5238MezPda ;
            Z5239MezFecPda = A5239MezFecPda ;
            Z5308MezFecEnt = A5308MezFecEnt ;
            Z5309MezPorTot = A5309MezPorTot ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z5234MezCod = A5234MezCod ;
         Z5235MezULin = A5235MezULin ;
         Z5237MezKgs = A5237MezKgs ;
         Z5238MezPda = A5238MezPda ;
         Z5239MezFecPda = A5239MezFecPda ;
         Z5308MezFecEnt = A5308MezFecEnt ;
         Z5309MezPorTot = A5309MezPorTot ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z5236MezPorT = A5236MezPorT ;
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

   public void load1FP1579( )
   {
      /* Using cursor T01FP13 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5234MezCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1579 = (short)(1) ;
         A407EmprNom = T01FP13_A407EmprNom[0] ;
         n407EmprNom = T01FP13_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01FP13_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A5235MezULin = T01FP13_A5235MezULin[0] ;
         n5235MezULin = T01FP13_n5235MezULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5235MezULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5235MezULin), 2, 0));
         A5237MezKgs = T01FP13_A5237MezKgs[0] ;
         n5237MezKgs = T01FP13_n5237MezKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5237MezKgs", GXutil.ltrimstr( A5237MezKgs, 9, 2));
         A5238MezPda = T01FP13_A5238MezPda[0] ;
         n5238MezPda = T01FP13_n5238MezPda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5238MezPda", A5238MezPda);
         A5239MezFecPda = T01FP13_A5239MezFecPda[0] ;
         n5239MezFecPda = T01FP13_n5239MezFecPda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5239MezFecPda", localUtil.format(A5239MezFecPda, "99/99/99"));
         A5308MezFecEnt = T01FP13_A5308MezFecEnt[0] ;
         n5308MezFecEnt = T01FP13_n5308MezFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5308MezFecEnt", localUtil.format(A5308MezFecEnt, "99/99/99"));
         A5309MezPorTot = T01FP13_A5309MezPorTot[0] ;
         n5309MezPorTot = T01FP13_n5309MezPorTot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5309MezPorTot", GXutil.ltrimstr( A5309MezPorTot, 6, 2));
         A5236MezPorT = T01FP13_A5236MezPorT[0] ;
         n5236MezPorT = T01FP13_n5236MezPorT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
         zm1FP1579( -3) ;
      }
      pr_default.close(9);
      onLoadActions1FP1579( ) ;
   }

   public void onLoadActions1FP1579( )
   {
      O5236MezPorT = A5236MezPorT ;
      n5236MezPorT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
   }

   public void checkExtendedTable1FP1579( )
   {
      nIsDirty_1579 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01FP8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01FP8_A407EmprNom[0] ;
      n407EmprNom = T01FP8_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
      /* Using cursor T01FP9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01FP9_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(7);
      /* Using cursor T01FP11 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5234MezCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A5236MezPorT = T01FP11_A5236MezPorT[0] ;
         n5236MezPorT = T01FP11_n5236MezPorT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
      }
      else
      {
         nIsDirty_1579 = (short)(1) ;
         A5236MezPorT = DecimalUtil.doubleToDec(0) ;
         n5236MezPorT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
      }
      pr_default.close(8);
   }

   public void closeExtendedTableCursors1FP1579( )
   {
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_4( String A396EmprCod )
   {
      /* Using cursor T01FP14 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01FP14_A407EmprNom[0] ;
      n407EmprNom = T01FP14_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_5( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01FP15 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01FP15_A279CliNom[0] ;
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

   public void gxload_6( String A396EmprCod ,
                         int A252CliCod ,
                         String A5234MezCod )
   {
      /* Using cursor T01FP17 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5234MezCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         A5236MezPorT = T01FP17_A5236MezPorT[0] ;
         n5236MezPorT = T01FP17_n5236MezPorT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
      }
      else
      {
         A5236MezPorT = DecimalUtil.doubleToDec(0) ;
         n5236MezPorT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5236MezPorT, (byte)(6), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void getKey1FP1579( )
   {
      /* Using cursor T01FP18 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5234MezCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1579 = (short)(1) ;
      }
      else
      {
         RcdFound1579 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01FP7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5234MezCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zm1FP1579( 3) ;
         RcdFound1579 = (short)(1) ;
         A5234MezCod = T01FP7_A5234MezCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5234MezCod", A5234MezCod);
         A5235MezULin = T01FP7_A5235MezULin[0] ;
         n5235MezULin = T01FP7_n5235MezULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5235MezULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5235MezULin), 2, 0));
         A5237MezKgs = T01FP7_A5237MezKgs[0] ;
         n5237MezKgs = T01FP7_n5237MezKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5237MezKgs", GXutil.ltrimstr( A5237MezKgs, 9, 2));
         A5238MezPda = T01FP7_A5238MezPda[0] ;
         n5238MezPda = T01FP7_n5238MezPda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5238MezPda", A5238MezPda);
         A5239MezFecPda = T01FP7_A5239MezFecPda[0] ;
         n5239MezFecPda = T01FP7_n5239MezFecPda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5239MezFecPda", localUtil.format(A5239MezFecPda, "99/99/99"));
         A5308MezFecEnt = T01FP7_A5308MezFecEnt[0] ;
         n5308MezFecEnt = T01FP7_n5308MezFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5308MezFecEnt", localUtil.format(A5308MezFecEnt, "99/99/99"));
         A5309MezPorTot = T01FP7_A5309MezPorTot[0] ;
         n5309MezPorTot = T01FP7_n5309MezPorTot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5309MezPorTot", GXutil.ltrimstr( A5309MezPorTot, 6, 2));
         A396EmprCod = T01FP7_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01FP7_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z5234MezCod = A5234MezCod ;
         sMode1579 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1FP1579( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1579 = (short)(0) ;
            initializeNonKey1FP1579( ) ;
         }
         Gx_mode = sMode1579 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1579 = (short)(0) ;
         initializeNonKey1FP1579( ) ;
         sMode1579 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1579 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1FP1579( ) ;
      if ( RcdFound1579 == 0 )
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
      RcdFound1579 = (short)(0) ;
      /* Using cursor T01FP19 */
      pr_default.execute(14, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, A5234MezCod});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T01FP19_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01FP19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FP19_A252CliCod[0] < A252CliCod ) || ( T01FP19_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FP19_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01FP19_A5234MezCod[0], A5234MezCod) < 0 ) ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T01FP19_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01FP19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FP19_A252CliCod[0] > A252CliCod ) || ( T01FP19_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FP19_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01FP19_A5234MezCod[0], A5234MezCod) > 0 ) ) )
         {
            A396EmprCod = T01FP19_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01FP19_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A5234MezCod = T01FP19_A5234MezCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5234MezCod", A5234MezCod);
            RcdFound1579 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void move_previous( )
   {
      RcdFound1579 = (short)(0) ;
      /* Using cursor T01FP20 */
      pr_default.execute(15, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, A5234MezCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T01FP20_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01FP20_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FP20_A252CliCod[0] > A252CliCod ) || ( T01FP20_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FP20_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01FP20_A5234MezCod[0], A5234MezCod) > 0 ) ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T01FP20_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01FP20_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FP20_A252CliCod[0] < A252CliCod ) || ( T01FP20_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FP20_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01FP20_A5234MezCod[0], A5234MezCod) < 0 ) ) )
         {
            A396EmprCod = T01FP20_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01FP20_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A5234MezCod = T01FP20_A5234MezCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5234MezCod", A5234MezCod);
            RcdFound1579 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1FP1579( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A5236MezPorT = O5236MezPorT ;
         n5236MezPorT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1FP1579( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1579 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A5234MezCod, Z5234MezCod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A5234MezCod = Z5234MezCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A5234MezCod", A5234MezCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A5236MezPorT = O5236MezPorT ;
               n5236MezPorT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
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
               A5236MezPorT = O5236MezPorT ;
               n5236MezPorT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
               update1FP1579( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A5234MezCod, Z5234MezCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A5236MezPorT = O5236MezPorT ;
               n5236MezPorT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1FP1579( ) ;
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
                  A5236MezPorT = O5236MezPorT ;
                  n5236MezPorT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1FP1579( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A5234MezCod, Z5234MezCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A5234MezCod = Z5234MezCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A5234MezCod", A5234MezCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A5236MezPorT = O5236MezPorT ;
         n5236MezPorT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
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
      getKey1FP1579( ) ;
      if ( RcdFound1579 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A5234MezCod, Z5234MezCod) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = Z252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A5234MezCod = Z5234MezCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A5234MezCod", A5234MezCod);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A5234MezCod, Z5234MezCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmezcla");
      GX_FocusControl = edtMezULin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1FP0( ) ;
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
      if ( RcdFound1579 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMezULin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1FP1579( ) ;
      if ( RcdFound1579 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMezULin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FP1579( ) ;
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
      if ( RcdFound1579 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMezULin_Internalname ;
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
      if ( RcdFound1579 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMezULin_Internalname ;
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
      scanStart1FP1579( ) ;
      if ( RcdFound1579 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1579 != 0 )
         {
            scanNext1FP1579( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMezULin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FP1579( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1FP1579( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FP6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5234MezCod});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEZCLA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || ( Z5235MezULin != T01FP6_A5235MezULin[0] ) || ( DecimalUtil.compareTo(Z5237MezKgs, T01FP6_A5237MezKgs[0]) != 0 ) || ( GXutil.strcmp(Z5238MezPda, T01FP6_A5238MezPda[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z5239MezFecPda), GXutil.resetTime(T01FP6_A5239MezFecPda[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z5308MezFecEnt), GXutil.resetTime(T01FP6_A5308MezFecEnt[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z5309MezPorTot, T01FP6_A5309MezPorTot[0]) != 0 ) )
         {
            if ( Z5235MezULin != T01FP6_A5235MezULin[0] )
            {
               GXutil.writeLogln("tmezcla:[seudo value changed for attri]"+"MezULin");
               GXutil.writeLogRaw("Old: ",Z5235MezULin);
               GXutil.writeLogRaw("Current: ",T01FP6_A5235MezULin[0]);
            }
            if ( DecimalUtil.compareTo(Z5237MezKgs, T01FP6_A5237MezKgs[0]) != 0 )
            {
               GXutil.writeLogln("tmezcla:[seudo value changed for attri]"+"MezKgs");
               GXutil.writeLogRaw("Old: ",Z5237MezKgs);
               GXutil.writeLogRaw("Current: ",T01FP6_A5237MezKgs[0]);
            }
            if ( GXutil.strcmp(Z5238MezPda, T01FP6_A5238MezPda[0]) != 0 )
            {
               GXutil.writeLogln("tmezcla:[seudo value changed for attri]"+"MezPda");
               GXutil.writeLogRaw("Old: ",Z5238MezPda);
               GXutil.writeLogRaw("Current: ",T01FP6_A5238MezPda[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5239MezFecPda), GXutil.resetTime(T01FP6_A5239MezFecPda[0])) ) )
            {
               GXutil.writeLogln("tmezcla:[seudo value changed for attri]"+"MezFecPda");
               GXutil.writeLogRaw("Old: ",Z5239MezFecPda);
               GXutil.writeLogRaw("Current: ",T01FP6_A5239MezFecPda[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5308MezFecEnt), GXutil.resetTime(T01FP6_A5308MezFecEnt[0])) ) )
            {
               GXutil.writeLogln("tmezcla:[seudo value changed for attri]"+"MezFecEnt");
               GXutil.writeLogRaw("Old: ",Z5308MezFecEnt);
               GXutil.writeLogRaw("Current: ",T01FP6_A5308MezFecEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z5309MezPorTot, T01FP6_A5309MezPorTot[0]) != 0 )
            {
               GXutil.writeLogln("tmezcla:[seudo value changed for attri]"+"MezPorTot");
               GXutil.writeLogRaw("Old: ",Z5309MezPorTot);
               GXutil.writeLogRaw("Current: ",T01FP6_A5309MezPorTot[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMEZCLA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FP1579( )
   {
      beforeValidate1FP1579( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FP1579( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FP1579( 0) ;
         checkOptimisticConcurrency1FP1579( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FP1579( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FP1579( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FP21 */
                  pr_default.execute(16, new Object[] {A5234MezCod, Boolean.valueOf(n5235MezULin), Byte.valueOf(A5235MezULin), Boolean.valueOf(n5237MezKgs), A5237MezKgs, Boolean.valueOf(n5238MezPda), A5238MezPda, Boolean.valueOf(n5239MezFecPda), A5239MezFecPda, Boolean.valueOf(n5308MezFecEnt), A5308MezFecEnt, Boolean.valueOf(n5309MezPorTot), A5309MezPorTot, A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZCLA");
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
                        processLevel1FP1579( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1FP0( ) ;
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
            load1FP1579( ) ;
         }
         endLevel1FP1579( ) ;
      }
      closeExtendedTableCursors1FP1579( ) ;
   }

   public void update1FP1579( )
   {
      beforeValidate1FP1579( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FP1579( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FP1579( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FP1579( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1FP1579( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FP22 */
                  pr_default.execute(17, new Object[] {Boolean.valueOf(n5235MezULin), Byte.valueOf(A5235MezULin), Boolean.valueOf(n5237MezKgs), A5237MezKgs, Boolean.valueOf(n5238MezPda), A5238MezPda, Boolean.valueOf(n5239MezFecPda), A5239MezFecPda, Boolean.valueOf(n5308MezFecEnt), A5308MezFecEnt, Boolean.valueOf(n5309MezPorTot), A5309MezPorTot, A396EmprCod, Integer.valueOf(A252CliCod), A5234MezCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZCLA");
                  if ( (pr_default.getStatus(17) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEZCLA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1FP1579( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1FP1579( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1FP0( ) ;
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
         endLevel1FP1579( ) ;
      }
      closeExtendedTableCursors1FP1579( ) ;
   }

   public void deferredUpdate1FP1579( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FP1579( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FP1579( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FP1579( ) ;
         afterConfirm1FP1579( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FP1579( ) ;
            if ( AnyError == 0 )
            {
               A5236MezPorT = O5236MezPorT ;
               n5236MezPorT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
               scanStart1FP1580( ) ;
               while ( RcdFound1580 != 0 )
               {
                  getByPrimaryKey1FP1580( ) ;
                  delete1FP1580( ) ;
                  scanNext1FP1580( ) ;
                  O5236MezPorT = A5236MezPorT ;
                  n5236MezPorT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
               }
               scanEnd1FP1580( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FP23 */
                  pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5234MezCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEZCLA");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1579 == 0 )
                        {
                           initAll1FP1579( ) ;
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
                        resetCaption1FP0( ) ;
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
      sMode1579 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FP1579( ) ;
      Gx_mode = sMode1579 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FP1579( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01FP24 */
         pr_default.execute(19, new Object[] {A396EmprCod});
         A407EmprNom = T01FP24_A407EmprNom[0] ;
         n407EmprNom = T01FP24_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(19);
         /* Using cursor T01FP25 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01FP25_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(20);
         /* Using cursor T01FP27 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5234MezCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            A5236MezPorT = T01FP27_A5236MezPorT[0] ;
            n5236MezPorT = T01FP27_n5236MezPorT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
         }
         else
         {
            A5236MezPorT = DecimalUtil.doubleToDec(0) ;
            n5236MezPorT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
         }
         pr_default.close(21);
      }
   }

   public void processNestedLevel1FP1580( )
   {
      s5236MezPorT = O5236MezPorT ;
      n5236MezPorT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow1FP1580( ) ;
         if ( ( nRcdExists_1580 != 0 ) || ( nIsMod_1580 != 0 ) )
         {
            standaloneNotModal1FP1580( ) ;
            getKey1FP1580( ) ;
            if ( ( nRcdExists_1580 == 0 ) && ( nRcdDeleted_1580 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1FP1580( ) ;
            }
            else
            {
               if ( RcdFound1580 != 0 )
               {
                  if ( ( nRcdDeleted_1580 != 0 ) && ( nRcdExists_1580 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1FP1580( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1580 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1FP1580( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1580 == 0 )
                  {
                     GXCCtl = "MEZLIN_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMezLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O5236MezPorT = A5236MezPorT ;
            n5236MezPorT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1580_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1580, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMezLin_Internalname, GXutil.ltrim( localUtil.ntoc( A5240MezLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMezPor_Internalname, GXutil.ltrim( localUtil.ntoc( A5241MezPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtArtCod_Internalname, GXutil.rtrim( A65ArtCod)) ;
         httpContext.changePostValue( edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc)) ;
         httpContext.changePostValue( edtMezArtDsc_Internalname, GXutil.rtrim( A5242MezArtDsc)) ;
         httpContext.changePostValue( edtPartCod_Internalname, GXutil.rtrim( A966PartCod)) ;
         httpContext.changePostValue( edtMezColNom_Internalname, GXutil.rtrim( A5243MezColNom)) ;
         httpContext.changePostValue( edtMezColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A5244MezColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMezColTCo_Internalname, GXutil.ltrim( localUtil.ntoc( A5245MezColTCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMezKgsArt_Internalname, GXutil.ltrim( localUtil.ntoc( A5246MezKgsArt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMezHdr_Internalname, GXutil.ltrim( localUtil.ntoc( A5247MezHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMezReo_Internalname, GXutil.ltrim( localUtil.ntoc( A5248MezReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMezPar_Internalname, GXutil.rtrim( A5249MezPar)) ;
         httpContext.changePostValue( edtMezObs_Internalname, GXutil.rtrim( A5833MezObs)) ;
         httpContext.changePostValue( "ZT_"+"Z5240MezLin_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z5240MezLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5241MezPor_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z5241MezPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5242MezArtDsc_"+sGXsfl_80_idx, GXutil.rtrim( Z5242MezArtDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z5243MezColNom_"+sGXsfl_80_idx, GXutil.rtrim( Z5243MezColNom)) ;
         httpContext.changePostValue( "ZT_"+"Z5244MezColNum_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z5244MezColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5245MezColTCo_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z5245MezColTCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5247MezHdr_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z5247MezHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5248MezReo_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z5248MezReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5249MezPar_"+sGXsfl_80_idx, GXutil.rtrim( Z5249MezPar)) ;
         httpContext.changePostValue( "ZT_"+"Z5833MezObs_"+sGXsfl_80_idx, GXutil.rtrim( Z5833MezObs)) ;
         httpContext.changePostValue( "ZT_"+"Z65ArtCod_"+sGXsfl_80_idx, GXutil.rtrim( Z65ArtCod)) ;
         httpContext.changePostValue( "ZT_"+"Z966PartCod_"+sGXsfl_80_idx, GXutil.rtrim( Z966PartCod)) ;
         httpContext.changePostValue( "T5241MezPor_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( O5241MezPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1580_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1580, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1580_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1580, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1580_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1580, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1580 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1580_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1580_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MEZLIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MEZPOR_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezPor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTCOD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTDSC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MEZARTDSC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezArtDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARTCOD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPartCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MEZCOLNOM_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezColNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MEZCOLNUM_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezColNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MEZCOLTCO_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezColTCo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MEZKGSART_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezKgsArt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MEZHDR_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezHdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MEZREO_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MEZPAR_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MEZOBS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1FP1580( ) ;
      if ( AnyError != 0 )
      {
         O5236MezPorT = s5236MezPorT ;
         n5236MezPorT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
      }
      nRcdExists_1580 = (short)(0) ;
      nIsMod_1580 = (short)(0) ;
      nRcdDeleted_1580 = (short)(0) ;
   }

   public void processLevel1FP1579( )
   {
      /* Save parent mode. */
      sMode1579 = Gx_mode ;
      processNestedLevel1FP1580( ) ;
      if ( AnyError != 0 )
      {
         O5236MezPorT = s5236MezPorT ;
         n5236MezPorT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1579 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1FP1579( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1FP1579( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmezcla");
         if ( AnyError == 0 )
         {
            confirmValues1FP0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmezcla");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1FP1579( )
   {
      /* Using cursor T01FP28 */
      pr_default.execute(22);
      RcdFound1579 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1579 = (short)(1) ;
         A396EmprCod = T01FP28_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01FP28_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A5234MezCod = T01FP28_A5234MezCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5234MezCod", A5234MezCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FP1579( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1579 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1579 = (short)(1) ;
         A396EmprCod = T01FP28_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01FP28_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A5234MezCod = T01FP28_A5234MezCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5234MezCod", A5234MezCod);
      }
   }

   public void scanEnd1FP1579( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1FP1579( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FP1579( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FP1579( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FP1579( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FP1579( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FP1579( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FP1579( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtMezCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMezCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtMezULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMezULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezULin_Enabled), 5, 0), true);
      edtMezPorT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMezPorT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezPorT_Enabled), 5, 0), true);
      edtMezKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMezKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezKgs_Enabled), 5, 0), true);
      edtMezPda_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMezPda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezPda_Enabled), 5, 0), true);
      edtMezFecPda_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMezFecPda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezFecPda_Enabled), 5, 0), true);
      edtMezFecEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMezFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezFecEnt_Enabled), 5, 0), true);
      edtMezPorTot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMezPorTot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezPorTot_Enabled), 5, 0), true);
   }

   public void zm1FP1580( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5241MezPor = T01FP3_A5241MezPor[0] ;
            Z5242MezArtDsc = T01FP3_A5242MezArtDsc[0] ;
            Z5243MezColNom = T01FP3_A5243MezColNom[0] ;
            Z5244MezColNum = T01FP3_A5244MezColNum[0] ;
            Z5245MezColTCo = T01FP3_A5245MezColTCo[0] ;
            Z5247MezHdr = T01FP3_A5247MezHdr[0] ;
            Z5248MezReo = T01FP3_A5248MezReo[0] ;
            Z5249MezPar = T01FP3_A5249MezPar[0] ;
            Z5833MezObs = T01FP3_A5833MezObs[0] ;
            Z65ArtCod = T01FP3_A65ArtCod[0] ;
            Z966PartCod = T01FP3_A966PartCod[0] ;
         }
         else
         {
            Z5241MezPor = A5241MezPor ;
            Z5242MezArtDsc = A5242MezArtDsc ;
            Z5243MezColNom = A5243MezColNom ;
            Z5244MezColNum = A5244MezColNum ;
            Z5245MezColTCo = A5245MezColTCo ;
            Z5247MezHdr = A5247MezHdr ;
            Z5248MezReo = A5248MezReo ;
            Z5249MezPar = A5249MezPar ;
            Z5833MezObs = A5833MezObs ;
            Z65ArtCod = A65ArtCod ;
            Z966PartCod = A966PartCod ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z5234MezCod = A5234MezCod ;
         Z5240MezLin = A5240MezLin ;
         Z5241MezPor = A5241MezPor ;
         Z5242MezArtDsc = A5242MezArtDsc ;
         Z5243MezColNom = A5243MezColNom ;
         Z5244MezColNum = A5244MezColNum ;
         Z5245MezColTCo = A5245MezColTCo ;
         Z5247MezHdr = A5247MezHdr ;
         Z5248MezReo = A5248MezReo ;
         Z5249MezPar = A5249MezPar ;
         Z5833MezObs = A5833MezObs ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z966PartCod = A966PartCod ;
         Z69ArtDsc = A69ArtDsc ;
      }
   }

   public void standaloneNotModal1FP1580( )
   {
   }

   public void standaloneModal1FP1580( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMezLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMezLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      else
      {
         edtMezLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMezLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
   }

   public void load1FP1580( )
   {
      /* Using cursor T01FP29 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5234MezCod, Byte.valueOf(A5240MezLin)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1580 = (short)(1) ;
         A5241MezPor = T01FP29_A5241MezPor[0] ;
         n5241MezPor = T01FP29_n5241MezPor[0] ;
         A69ArtDsc = T01FP29_A69ArtDsc[0] ;
         n69ArtDsc = T01FP29_n69ArtDsc[0] ;
         A5242MezArtDsc = T01FP29_A5242MezArtDsc[0] ;
         n5242MezArtDsc = T01FP29_n5242MezArtDsc[0] ;
         A5243MezColNom = T01FP29_A5243MezColNom[0] ;
         n5243MezColNom = T01FP29_n5243MezColNom[0] ;
         A5244MezColNum = T01FP29_A5244MezColNum[0] ;
         n5244MezColNum = T01FP29_n5244MezColNum[0] ;
         A5245MezColTCo = T01FP29_A5245MezColTCo[0] ;
         n5245MezColTCo = T01FP29_n5245MezColTCo[0] ;
         A5247MezHdr = T01FP29_A5247MezHdr[0] ;
         n5247MezHdr = T01FP29_n5247MezHdr[0] ;
         A5248MezReo = T01FP29_A5248MezReo[0] ;
         n5248MezReo = T01FP29_n5248MezReo[0] ;
         A5249MezPar = T01FP29_A5249MezPar[0] ;
         n5249MezPar = T01FP29_n5249MezPar[0] ;
         A5833MezObs = T01FP29_A5833MezObs[0] ;
         n5833MezObs = T01FP29_n5833MezObs[0] ;
         A65ArtCod = T01FP29_A65ArtCod[0] ;
         n65ArtCod = T01FP29_n65ArtCod[0] ;
         A966PartCod = T01FP29_A966PartCod[0] ;
         n966PartCod = T01FP29_n966PartCod[0] ;
         zm1FP1580( -7) ;
      }
      pr_default.close(23);
      onLoadActions1FP1580( ) ;
   }

   public void onLoadActions1FP1580( )
   {
      A5246MezKgsArt = GXutil.roundDecimal( (A5237MezKgs.multiply(A5241MezPor).divide(A5309MezPorTot, 18, java.math.RoundingMode.DOWN)), 2) ;
      if ( isIns( )  )
      {
         A5236MezPorT = O5236MezPorT.add(A5241MezPor) ;
         n5236MezPorT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A5236MezPorT = O5236MezPorT.add(A5241MezPor).subtract(O5241MezPor) ;
            n5236MezPorT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A5236MezPorT = O5236MezPorT.subtract(O5241MezPor) ;
               n5236MezPorT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
            }
         }
      }
   }

   public void checkExtendedTable1FP1580( )
   {
      nIsDirty_1580 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1FP1580( ) ;
      /* Using cursor T01FP4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "ARTCOD_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01FP4_A69ArtDsc[0] ;
      n69ArtDsc = T01FP4_n69ArtDsc[0] ;
      pr_default.close(2);
      /* Using cursor T01FP5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPARTI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPartCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
      nIsDirty_1580 = (short)(1) ;
      A5246MezKgsArt = GXutil.roundDecimal( (A5237MezKgs.multiply(A5241MezPor).divide(A5309MezPorTot, 18, java.math.RoundingMode.DOWN)), 2) ;
      if ( isIns( )  )
      {
         nIsDirty_1580 = (short)(1) ;
         A5236MezPorT = O5236MezPorT.add(A5241MezPor) ;
         n5236MezPorT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1580 = (short)(1) ;
            A5236MezPorT = O5236MezPorT.add(A5241MezPor).subtract(O5241MezPor) ;
            n5236MezPorT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1580 = (short)(1) ;
               A5236MezPorT = O5236MezPorT.subtract(O5241MezPor) ;
               n5236MezPorT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
            }
         }
      }
   }

   public void closeExtendedTableCursors1FP1580( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable1FP1580( )
   {
   }

   public void gxload_8( String A396EmprCod ,
                         int A252CliCod ,
                         String A65ArtCod )
   {
      /* Using cursor T01FP30 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         GXCCtl = "ARTCOD_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01FP30_A69ArtDsc[0] ;
      n69ArtDsc = T01FP30_n69ArtDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A69ArtDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(24) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(24);
   }

   public void gxload_9( String A396EmprCod ,
                         String A966PartCod ,
                         int A252CliCod )
   {
      /* Using cursor T01FP31 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPARTI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPartCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(25) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(25);
   }

   public void getKey1FP1580( )
   {
      /* Using cursor T01FP32 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5234MezCod, Byte.valueOf(A5240MezLin)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1580 = (short)(1) ;
      }
      else
      {
         RcdFound1580 = (short)(0) ;
      }
      pr_default.close(26);
   }

   public void getByPrimaryKey1FP1580( )
   {
      /* Using cursor T01FP3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5234MezCod, Byte.valueOf(A5240MezLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1FP1580( 7) ;
         RcdFound1580 = (short)(1) ;
         initializeNonKey1FP1580( ) ;
         A5240MezLin = T01FP3_A5240MezLin[0] ;
         A5241MezPor = T01FP3_A5241MezPor[0] ;
         n5241MezPor = T01FP3_n5241MezPor[0] ;
         A5242MezArtDsc = T01FP3_A5242MezArtDsc[0] ;
         n5242MezArtDsc = T01FP3_n5242MezArtDsc[0] ;
         A5243MezColNom = T01FP3_A5243MezColNom[0] ;
         n5243MezColNom = T01FP3_n5243MezColNom[0] ;
         A5244MezColNum = T01FP3_A5244MezColNum[0] ;
         n5244MezColNum = T01FP3_n5244MezColNum[0] ;
         A5245MezColTCo = T01FP3_A5245MezColTCo[0] ;
         n5245MezColTCo = T01FP3_n5245MezColTCo[0] ;
         A5247MezHdr = T01FP3_A5247MezHdr[0] ;
         n5247MezHdr = T01FP3_n5247MezHdr[0] ;
         A5248MezReo = T01FP3_A5248MezReo[0] ;
         n5248MezReo = T01FP3_n5248MezReo[0] ;
         A5249MezPar = T01FP3_A5249MezPar[0] ;
         n5249MezPar = T01FP3_n5249MezPar[0] ;
         A5833MezObs = T01FP3_A5833MezObs[0] ;
         n5833MezObs = T01FP3_n5833MezObs[0] ;
         A65ArtCod = T01FP3_A65ArtCod[0] ;
         n65ArtCod = T01FP3_n65ArtCod[0] ;
         A966PartCod = T01FP3_A966PartCod[0] ;
         n966PartCod = T01FP3_n966PartCod[0] ;
         O5241MezPor = A5241MezPor ;
         n5241MezPor = false ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z5234MezCod = A5234MezCod ;
         Z5240MezLin = A5240MezLin ;
         sMode1580 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FP1580( ) ;
         load1FP1580( ) ;
         Gx_mode = sMode1580 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1580 = (short)(0) ;
         initializeNonKey1FP1580( ) ;
         sMode1580 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FP1580( ) ;
         Gx_mode = sMode1580 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1FP1580( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1FP1580( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FP2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5234MezCod, Byte.valueOf(A5240MezLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMZCLA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z5241MezPor, T01FP2_A5241MezPor[0]) != 0 ) || ( GXutil.strcmp(Z5242MezArtDsc, T01FP2_A5242MezArtDsc[0]) != 0 ) || ( GXutil.strcmp(Z5243MezColNom, T01FP2_A5243MezColNom[0]) != 0 ) || ( Z5244MezColNum != T01FP2_A5244MezColNum[0] ) || ( Z5245MezColTCo != T01FP2_A5245MezColTCo[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5247MezHdr != T01FP2_A5247MezHdr[0] ) || ( Z5248MezReo != T01FP2_A5248MezReo[0] ) || ( GXutil.strcmp(Z5249MezPar, T01FP2_A5249MezPar[0]) != 0 ) || ( GXutil.strcmp(Z5833MezObs, T01FP2_A5833MezObs[0]) != 0 ) || ( GXutil.strcmp(Z65ArtCod, T01FP2_A65ArtCod[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z966PartCod, T01FP2_A966PartCod[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z5241MezPor, T01FP2_A5241MezPor[0]) != 0 )
            {
               GXutil.writeLogln("tmezcla:[seudo value changed for attri]"+"MezPor");
               GXutil.writeLogRaw("Old: ",Z5241MezPor);
               GXutil.writeLogRaw("Current: ",T01FP2_A5241MezPor[0]);
            }
            if ( GXutil.strcmp(Z5242MezArtDsc, T01FP2_A5242MezArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("tmezcla:[seudo value changed for attri]"+"MezArtDsc");
               GXutil.writeLogRaw("Old: ",Z5242MezArtDsc);
               GXutil.writeLogRaw("Current: ",T01FP2_A5242MezArtDsc[0]);
            }
            if ( GXutil.strcmp(Z5243MezColNom, T01FP2_A5243MezColNom[0]) != 0 )
            {
               GXutil.writeLogln("tmezcla:[seudo value changed for attri]"+"MezColNom");
               GXutil.writeLogRaw("Old: ",Z5243MezColNom);
               GXutil.writeLogRaw("Current: ",T01FP2_A5243MezColNom[0]);
            }
            if ( Z5244MezColNum != T01FP2_A5244MezColNum[0] )
            {
               GXutil.writeLogln("tmezcla:[seudo value changed for attri]"+"MezColNum");
               GXutil.writeLogRaw("Old: ",Z5244MezColNum);
               GXutil.writeLogRaw("Current: ",T01FP2_A5244MezColNum[0]);
            }
            if ( Z5245MezColTCo != T01FP2_A5245MezColTCo[0] )
            {
               GXutil.writeLogln("tmezcla:[seudo value changed for attri]"+"MezColTCo");
               GXutil.writeLogRaw("Old: ",Z5245MezColTCo);
               GXutil.writeLogRaw("Current: ",T01FP2_A5245MezColTCo[0]);
            }
            if ( Z5247MezHdr != T01FP2_A5247MezHdr[0] )
            {
               GXutil.writeLogln("tmezcla:[seudo value changed for attri]"+"MezHdr");
               GXutil.writeLogRaw("Old: ",Z5247MezHdr);
               GXutil.writeLogRaw("Current: ",T01FP2_A5247MezHdr[0]);
            }
            if ( Z5248MezReo != T01FP2_A5248MezReo[0] )
            {
               GXutil.writeLogln("tmezcla:[seudo value changed for attri]"+"MezReo");
               GXutil.writeLogRaw("Old: ",Z5248MezReo);
               GXutil.writeLogRaw("Current: ",T01FP2_A5248MezReo[0]);
            }
            if ( GXutil.strcmp(Z5249MezPar, T01FP2_A5249MezPar[0]) != 0 )
            {
               GXutil.writeLogln("tmezcla:[seudo value changed for attri]"+"MezPar");
               GXutil.writeLogRaw("Old: ",Z5249MezPar);
               GXutil.writeLogRaw("Current: ",T01FP2_A5249MezPar[0]);
            }
            if ( GXutil.strcmp(Z5833MezObs, T01FP2_A5833MezObs[0]) != 0 )
            {
               GXutil.writeLogln("tmezcla:[seudo value changed for attri]"+"MezObs");
               GXutil.writeLogRaw("Old: ",Z5833MezObs);
               GXutil.writeLogRaw("Current: ",T01FP2_A5833MezObs[0]);
            }
            if ( GXutil.strcmp(Z65ArtCod, T01FP2_A65ArtCod[0]) != 0 )
            {
               GXutil.writeLogln("tmezcla:[seudo value changed for attri]"+"ArtCod");
               GXutil.writeLogRaw("Old: ",Z65ArtCod);
               GXutil.writeLogRaw("Current: ",T01FP2_A65ArtCod[0]);
            }
            if ( GXutil.strcmp(Z966PartCod, T01FP2_A966PartCod[0]) != 0 )
            {
               GXutil.writeLogln("tmezcla:[seudo value changed for attri]"+"PartCod");
               GXutil.writeLogRaw("Old: ",Z966PartCod);
               GXutil.writeLogRaw("Current: ",T01FP2_A966PartCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLMZCLA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FP1580( )
   {
      beforeValidate1FP1580( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FP1580( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FP1580( 0) ;
         checkOptimisticConcurrency1FP1580( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FP1580( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FP1580( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FP33 */
                  pr_default.execute(27, new Object[] {A5234MezCod, Byte.valueOf(A5240MezLin), Boolean.valueOf(n5241MezPor), A5241MezPor, Boolean.valueOf(n5242MezArtDsc), A5242MezArtDsc, Boolean.valueOf(n5243MezColNom), A5243MezColNom, Boolean.valueOf(n5244MezColNum), Integer.valueOf(A5244MezColNum), Boolean.valueOf(n5245MezColTCo), Byte.valueOf(A5245MezColTCo), Boolean.valueOf(n5247MezHdr), Integer.valueOf(A5247MezHdr), Boolean.valueOf(n5248MezReo), Byte.valueOf(A5248MezReo), Boolean.valueOf(n5249MezPar), A5249MezPar, Boolean.valueOf(n5833MezObs), A5833MezObs, A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n966PartCod), A966PartCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMZCLA");
                  if ( (pr_default.getStatus(27) == 1) )
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
            load1FP1580( ) ;
         }
         endLevel1FP1580( ) ;
      }
      closeExtendedTableCursors1FP1580( ) ;
   }

   public void update1FP1580( )
   {
      beforeValidate1FP1580( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FP1580( ) ;
      }
      if ( ( nIsMod_1580 != 0 ) || ( nIsDirty_1580 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1FP1580( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1FP1580( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1FP1580( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01FP34 */
                     pr_default.execute(28, new Object[] {Boolean.valueOf(n5241MezPor), A5241MezPor, Boolean.valueOf(n5242MezArtDsc), A5242MezArtDsc, Boolean.valueOf(n5243MezColNom), A5243MezColNom, Boolean.valueOf(n5244MezColNum), Integer.valueOf(A5244MezColNum), Boolean.valueOf(n5245MezColTCo), Byte.valueOf(A5245MezColTCo), Boolean.valueOf(n5247MezHdr), Integer.valueOf(A5247MezHdr), Boolean.valueOf(n5248MezReo), Byte.valueOf(A5248MezReo), Boolean.valueOf(n5249MezPar), A5249MezPar, Boolean.valueOf(n5833MezObs), A5833MezObs, Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n966PartCod), A966PartCod, A396EmprCod, Integer.valueOf(A252CliCod), A5234MezCod, Byte.valueOf(A5240MezLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMZCLA");
                     if ( (pr_default.getStatus(28) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMZCLA"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1FP1580( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1FP1580( ) ;
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
            endLevel1FP1580( ) ;
         }
      }
      closeExtendedTableCursors1FP1580( ) ;
   }

   public void deferredUpdate1FP1580( )
   {
   }

   public void delete1FP1580( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FP1580( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FP1580( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FP1580( ) ;
         afterConfirm1FP1580( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FP1580( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01FP35 */
               pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5234MezCod, Byte.valueOf(A5240MezLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMZCLA");
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
      sMode1580 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FP1580( ) ;
      Gx_mode = sMode1580 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FP1580( )
   {
      standaloneModal1FP1580( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A5246MezKgsArt = GXutil.roundDecimal( (A5237MezKgs.multiply(A5241MezPor).divide(A5309MezPorTot, 18, java.math.RoundingMode.DOWN)), 2) ;
         if ( isIns( )  )
         {
            A5236MezPorT = O5236MezPorT.add(A5241MezPor) ;
            n5236MezPorT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A5236MezPorT = O5236MezPorT.add(A5241MezPor).subtract(O5241MezPor) ;
               n5236MezPorT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A5236MezPorT = O5236MezPorT.subtract(O5241MezPor) ;
                  n5236MezPorT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
               }
            }
         }
         /* Using cursor T01FP36 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         A69ArtDsc = T01FP36_A69ArtDsc[0] ;
         n69ArtDsc = T01FP36_n69ArtDsc[0] ;
         pr_default.close(30);
      }
   }

   public void endLevel1FP1580( )
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

   public void scanStart1FP1580( )
   {
      /* Scan By routine */
      /* Using cursor T01FP37 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5234MezCod});
      RcdFound1580 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1580 = (short)(1) ;
         A5240MezLin = T01FP37_A5240MezLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FP1580( )
   {
      /* Scan next routine */
      pr_default.readNext(31);
      RcdFound1580 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1580 = (short)(1) ;
         A5240MezLin = T01FP37_A5240MezLin[0] ;
      }
   }

   public void scanEnd1FP1580( )
   {
      pr_default.close(31);
   }

   public void afterConfirm1FP1580( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FP1580( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FP1580( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FP1580( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FP1580( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FP1580( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FP1580( )
   {
      edtMezLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMezLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtMezPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMezPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezPor_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtMezArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMezArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezArtDsc_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtPartCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPartCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPartCod_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtMezColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMezColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezColNom_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtMezColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMezColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezColNum_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtMezColTCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMezColTCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezColTCo_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtMezKgsArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMezKgsArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezKgsArt_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtMezHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMezHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezHdr_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtMezReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMezReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezReo_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtMezPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMezPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezPar_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtMezObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMezObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezObs_Enabled), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void send_integrity_lvl_hashes1FP1580( )
   {
   }

   public void send_integrity_lvl_hashes1FP1579( )
   {
   }

   public void subsflControlProps_801580( )
   {
      edtavnRcdDeleted_1580_Internalname = "vNRCDDELETED_1580_"+sGXsfl_80_idx ;
      edtMezLin_Internalname = "MEZLIN_"+sGXsfl_80_idx ;
      edtMezPor_Internalname = "MEZPOR_"+sGXsfl_80_idx ;
      edtArtCod_Internalname = "ARTCOD_"+sGXsfl_80_idx ;
      edtArtDsc_Internalname = "ARTDSC_"+sGXsfl_80_idx ;
      edtMezArtDsc_Internalname = "MEZARTDSC_"+sGXsfl_80_idx ;
      edtPartCod_Internalname = "PARTCOD_"+sGXsfl_80_idx ;
      edtMezColNom_Internalname = "MEZCOLNOM_"+sGXsfl_80_idx ;
      edtMezColNum_Internalname = "MEZCOLNUM_"+sGXsfl_80_idx ;
      edtMezColTCo_Internalname = "MEZCOLTCO_"+sGXsfl_80_idx ;
      edtMezKgsArt_Internalname = "MEZKGSART_"+sGXsfl_80_idx ;
      edtMezHdr_Internalname = "MEZHDR_"+sGXsfl_80_idx ;
      edtMezReo_Internalname = "MEZREO_"+sGXsfl_80_idx ;
      edtMezPar_Internalname = "MEZPAR_"+sGXsfl_80_idx ;
      edtMezObs_Internalname = "MEZOBS_"+sGXsfl_80_idx ;
   }

   public void subsflControlProps_fel_801580( )
   {
      edtavnRcdDeleted_1580_Internalname = "vNRCDDELETED_1580_"+sGXsfl_80_fel_idx ;
      edtMezLin_Internalname = "MEZLIN_"+sGXsfl_80_fel_idx ;
      edtMezPor_Internalname = "MEZPOR_"+sGXsfl_80_fel_idx ;
      edtArtCod_Internalname = "ARTCOD_"+sGXsfl_80_fel_idx ;
      edtArtDsc_Internalname = "ARTDSC_"+sGXsfl_80_fel_idx ;
      edtMezArtDsc_Internalname = "MEZARTDSC_"+sGXsfl_80_fel_idx ;
      edtPartCod_Internalname = "PARTCOD_"+sGXsfl_80_fel_idx ;
      edtMezColNom_Internalname = "MEZCOLNOM_"+sGXsfl_80_fel_idx ;
      edtMezColNum_Internalname = "MEZCOLNUM_"+sGXsfl_80_fel_idx ;
      edtMezColTCo_Internalname = "MEZCOLTCO_"+sGXsfl_80_fel_idx ;
      edtMezKgsArt_Internalname = "MEZKGSART_"+sGXsfl_80_fel_idx ;
      edtMezHdr_Internalname = "MEZHDR_"+sGXsfl_80_fel_idx ;
      edtMezReo_Internalname = "MEZREO_"+sGXsfl_80_fel_idx ;
      edtMezPar_Internalname = "MEZPAR_"+sGXsfl_80_fel_idx ;
      edtMezObs_Internalname = "MEZOBS_"+sGXsfl_80_fel_idx ;
   }

   public void addRow1FP1580( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801580( ) ;
      sendRow1FP1580( ) ;
   }

   public void sendRow1FP1580( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1580_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1580_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1580, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1580_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1580), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1580), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1580_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1580_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1580_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMezLin_Internalname,GXutil.ltrim( localUtil.ntoc( A5240MezLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5240MezLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMezLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMezLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1580_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMezPor_Internalname,GXutil.ltrim( localUtil.ntoc( A5241MezPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMezPor_Enabled!=0) ? localUtil.format( A5241MezPor, "ZZ9.99") : localUtil.format( A5241MezPor, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMezPor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMezPor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1580_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtCod_Internalname,GXutil.rtrim( A65ArtCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtArtCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtDsc_Internalname,GXutil.rtrim( A69ArtDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtArtDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1580_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMezArtDsc_Internalname,GXutil.rtrim( A5242MezArtDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMezArtDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMezArtDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1580_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPartCod_Internalname,GXutil.rtrim( A966PartCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPartCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPartCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1580_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMezColNom_Internalname,GXutil.rtrim( A5243MezColNom),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMezColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMezColNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1580_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMezColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A5244MezColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMezColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5244MezColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5244MezColNum), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMezColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMezColNum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1580_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMezColTCo_Internalname,GXutil.ltrim( localUtil.ntoc( A5245MezColTCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMezColTCo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5245MezColTCo), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A5245MezColTCo), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,90);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMezColTCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMezColTCo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMezKgsArt_Internalname,GXutil.ltrim( localUtil.ntoc( A5246MezKgsArt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMezKgsArt_Enabled!=0) ? localUtil.format( A5246MezKgsArt, "ZZZZZ9.99") : localUtil.format( A5246MezKgsArt, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMezKgsArt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMezKgsArt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1580_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 92,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMezHdr_Internalname,GXutil.ltrim( localUtil.ntoc( A5247MezHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMezHdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5247MezHdr), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5247MezHdr), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,92);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMezHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMezHdr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1580_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMezReo_Internalname,GXutil.ltrim( localUtil.ntoc( A5248MezReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMezReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5248MezReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A5248MezReo), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMezReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMezReo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1580_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMezPar_Internalname,GXutil.rtrim( A5249MezPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMezPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMezPar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1580_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMezObs_Internalname,GXutil.rtrim( A5833MezObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,95);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMezObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMezObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1FP1580( ) ;
      GXCCtl = "Z5240MezLin_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5240MezLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5241MezPor_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5241MezPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5242MezArtDsc_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5242MezArtDsc));
      GXCCtl = "Z5243MezColNom_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5243MezColNom));
      GXCCtl = "Z5244MezColNum_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5244MezColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5245MezColTCo_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5245MezColTCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5247MezHdr_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5247MezHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5248MezReo_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5248MezReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5249MezPar_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5249MezPar));
      GXCCtl = "Z5833MezObs_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5833MezObs));
      GXCCtl = "Z65ArtCod_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z65ArtCod));
      GXCCtl = "Z966PartCod_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z966PartCod));
      GXCCtl = "O5241MezPor_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O5241MezPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1580_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1580, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1580_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1580, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1580_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1580, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1580_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1580_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MEZLIN_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MEZPOR_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezPor_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTCOD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTDSC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MEZARTDSC_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezArtDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARTCOD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPartCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MEZCOLNOM_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MEZCOLNUM_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MEZCOLTCO_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezColTCo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MEZKGSART_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezKgsArt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MEZHDR_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezHdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MEZREO_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MEZPAR_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MEZOBS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMezObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1FP1580( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801580( ) ;
      edtavnRcdDeleted_1580_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1580_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMezLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MEZLIN_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMezPor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MEZPOR_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtArtCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTCOD_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtArtDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTDSC_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMezArtDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MEZARTDSC_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPartCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARTCOD_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMezColNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MEZCOLNOM_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMezColNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MEZCOLNUM_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMezColTCo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MEZCOLTCO_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMezKgsArt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MEZKGSART_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMezHdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MEZHDR_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMezReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MEZREO_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMezPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MEZPAR_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMezObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MEZOBS_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1580_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1580_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1580");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1580_Internalname ;
         wbErr = true ;
         nRcdDeleted_1580 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1580 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1580_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMezLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMezLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "MEZLIN_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMezLin_Internalname ;
         wbErr = true ;
         A5240MezLin = (byte)(0) ;
      }
      else
      {
         A5240MezLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtMezLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMezPor_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMezPor_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "MEZPOR_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMezPor_Internalname ;
         wbErr = true ;
         A5241MezPor = DecimalUtil.ZERO ;
         n5241MezPor = false ;
      }
      else
      {
         A5241MezPor = localUtil.ctond( httpContext.cgiGet( edtMezPor_Internalname)) ;
         n5241MezPor = false ;
      }
      A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
      n65ArtCod = false ;
      A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
      n69ArtDsc = false ;
      A5242MezArtDsc = httpContext.cgiGet( edtMezArtDsc_Internalname) ;
      n5242MezArtDsc = false ;
      A966PartCod = httpContext.cgiGet( edtPartCod_Internalname) ;
      n966PartCod = false ;
      A5243MezColNom = httpContext.cgiGet( edtMezColNom_Internalname) ;
      n5243MezColNom = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMezColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMezColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "MEZCOLNUM_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMezColNum_Internalname ;
         wbErr = true ;
         A5244MezColNum = 0 ;
         n5244MezColNum = false ;
      }
      else
      {
         A5244MezColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtMezColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5244MezColNum = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMezColTCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMezColTCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "MEZCOLTCO_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMezColTCo_Internalname ;
         wbErr = true ;
         A5245MezColTCo = (byte)(0) ;
         n5245MezColTCo = false ;
      }
      else
      {
         A5245MezColTCo = (byte)(localUtil.ctol( httpContext.cgiGet( edtMezColTCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5245MezColTCo = false ;
      }
      A5246MezKgsArt = localUtil.ctond( httpContext.cgiGet( edtMezKgsArt_Internalname)) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMezHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMezHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "MEZHDR_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMezHdr_Internalname ;
         wbErr = true ;
         A5247MezHdr = 0 ;
         n5247MezHdr = false ;
      }
      else
      {
         A5247MezHdr = (int)(localUtil.ctol( httpContext.cgiGet( edtMezHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5247MezHdr = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMezReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMezReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "MEZREO_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMezReo_Internalname ;
         wbErr = true ;
         A5248MezReo = (byte)(0) ;
         n5248MezReo = false ;
      }
      else
      {
         A5248MezReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtMezReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5248MezReo = false ;
      }
      A5249MezPar = httpContext.cgiGet( edtMezPar_Internalname) ;
      n5249MezPar = false ;
      A5833MezObs = httpContext.cgiGet( edtMezObs_Internalname) ;
      n5833MezObs = false ;
      GXCCtl = "Z5240MezLin_" + sGXsfl_80_idx ;
      Z5240MezLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5241MezPor_" + sGXsfl_80_idx ;
      Z5241MezPor = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5242MezArtDsc_" + sGXsfl_80_idx ;
      Z5242MezArtDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5243MezColNom_" + sGXsfl_80_idx ;
      Z5243MezColNom = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5244MezColNum_" + sGXsfl_80_idx ;
      Z5244MezColNum = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5245MezColTCo_" + sGXsfl_80_idx ;
      Z5245MezColTCo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5247MezHdr_" + sGXsfl_80_idx ;
      Z5247MezHdr = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5248MezReo_" + sGXsfl_80_idx ;
      Z5248MezReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5249MezPar_" + sGXsfl_80_idx ;
      Z5249MezPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5833MezObs_" + sGXsfl_80_idx ;
      Z5833MezObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z65ArtCod_" + sGXsfl_80_idx ;
      Z65ArtCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z966PartCod_" + sGXsfl_80_idx ;
      Z966PartCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O5241MezPor_" + sGXsfl_80_idx ;
      O5241MezPor = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1580_" + sGXsfl_80_idx ;
      nRcdDeleted_1580 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1580_" + sGXsfl_80_idx ;
      nRcdExists_1580 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1580_" + sGXsfl_80_idx ;
      nIsMod_1580 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMezLin_Enabled = edtMezLin_Enabled ;
   }

   public void confirmValues1FP0( )
   {
      nGXsfl_80_idx = 0 ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801580( ) ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_801580( ) ;
         httpContext.changePostValue( "Z5240MezLin_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z5240MezLin_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5240MezLin_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z5241MezPor_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z5241MezPor_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5241MezPor_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z5242MezArtDsc_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z5242MezArtDsc_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5242MezArtDsc_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z5243MezColNom_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z5243MezColNom_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5243MezColNom_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z5244MezColNum_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z5244MezColNum_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5244MezColNum_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z5245MezColTCo_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z5245MezColTCo_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5245MezColTCo_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z5247MezHdr_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z5247MezHdr_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5247MezHdr_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z5248MezReo_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z5248MezReo_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5248MezReo_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z5249MezPar_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z5249MezPar_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5249MezPar_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z5833MezObs_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z5833MezObs_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5833MezObs_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z65ArtCod_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z65ArtCod_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z65ArtCod_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z966PartCod_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z966PartCod_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z966PartCod_"+sGXsfl_80_idx) ;
      }
      httpContext.changePostValue( "O5241MezPor", httpContext.cgiGet( "T5241MezPor")) ;
      httpContext.deletePostValue( "T5241MezPor") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tmezcla", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z5234MezCod", GXutil.rtrim( Z5234MezCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5235MezULin", GXutil.ltrim( localUtil.ntoc( Z5235MezULin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5237MezKgs", GXutil.ltrim( localUtil.ntoc( Z5237MezKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5238MezPda", GXutil.rtrim( Z5238MezPda));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5239MezFecPda", localUtil.dtoc( Z5239MezFecPda, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5308MezFecEnt", localUtil.dtoc( Z5308MezFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5309MezPorTot", GXutil.ltrim( localUtil.ntoc( Z5309MezPorTot, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O5236MezPorT", GXutil.ltrim( localUtil.ntoc( O5236MezPorT, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_80", GXutil.ltrim( localUtil.ntoc( nGXsfl_80_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tmezcla", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TMEZCLA" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "COMPOSICION DE MEZCLAS", "") ;
   }

   public void initializeNonKey1FP1579( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A5235MezULin = (byte)(0) ;
      n5235MezULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5235MezULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5235MezULin), 2, 0));
      A5236MezPorT = DecimalUtil.ZERO ;
      n5236MezPorT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
      A5237MezKgs = DecimalUtil.ZERO ;
      n5237MezKgs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5237MezKgs", GXutil.ltrimstr( A5237MezKgs, 9, 2));
      A5238MezPda = "" ;
      n5238MezPda = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5238MezPda", A5238MezPda);
      A5239MezFecPda = GXutil.nullDate() ;
      n5239MezFecPda = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5239MezFecPda", localUtil.format(A5239MezFecPda, "99/99/99"));
      A5308MezFecEnt = GXutil.nullDate() ;
      n5308MezFecEnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5308MezFecEnt", localUtil.format(A5308MezFecEnt, "99/99/99"));
      A5309MezPorTot = DecimalUtil.ZERO ;
      n5309MezPorTot = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5309MezPorTot", GXutil.ltrimstr( A5309MezPorTot, 6, 2));
      O5236MezPorT = A5236MezPorT ;
      n5236MezPorT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
      Z5235MezULin = (byte)(0) ;
      Z5237MezKgs = DecimalUtil.ZERO ;
      Z5238MezPda = "" ;
      Z5239MezFecPda = GXutil.nullDate() ;
      Z5308MezFecEnt = GXutil.nullDate() ;
      Z5309MezPorTot = DecimalUtil.ZERO ;
   }

   public void initAll1FP1579( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A5234MezCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5234MezCod", A5234MezCod);
      initializeNonKey1FP1579( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1FP1580( )
   {
      A5246MezKgsArt = DecimalUtil.ZERO ;
      A5241MezPor = DecimalUtil.ZERO ;
      n5241MezPor = false ;
      A65ArtCod = "" ;
      n65ArtCod = false ;
      A69ArtDsc = "" ;
      n69ArtDsc = false ;
      A5242MezArtDsc = "" ;
      n5242MezArtDsc = false ;
      A966PartCod = "" ;
      n966PartCod = false ;
      A5243MezColNom = "" ;
      n5243MezColNom = false ;
      A5244MezColNum = 0 ;
      n5244MezColNum = false ;
      A5245MezColTCo = (byte)(0) ;
      n5245MezColTCo = false ;
      A5247MezHdr = 0 ;
      n5247MezHdr = false ;
      A5248MezReo = (byte)(0) ;
      n5248MezReo = false ;
      A5249MezPar = "" ;
      n5249MezPar = false ;
      A5833MezObs = "" ;
      n5833MezObs = false ;
      O5241MezPor = A5241MezPor ;
      n5241MezPor = false ;
      Z5241MezPor = DecimalUtil.ZERO ;
      Z5242MezArtDsc = "" ;
      Z5243MezColNom = "" ;
      Z5244MezColNum = 0 ;
      Z5245MezColTCo = (byte)(0) ;
      Z5247MezHdr = 0 ;
      Z5248MezReo = (byte)(0) ;
      Z5249MezPar = "" ;
      Z5833MezObs = "" ;
      Z65ArtCod = "" ;
      Z966PartCod = "" ;
   }

   public void initAll1FP1580( )
   {
      A5240MezLin = (byte)(0) ;
      initializeNonKey1FP1580( ) ;
   }

   public void standaloneModalInsert1FP1580( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241573029", true, true);
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
      httpContext.AddJavascriptSource("tmezcla.js", "?20268241573029", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1580( )
   {
      edtMezLin_Enabled = defedtMezLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMezLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMezLin_Enabled), 5, 0), !bGXsfl_80_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1580, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1580_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5240MezLin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMezLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5241MezPor, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMezPor_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A65ArtCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtArtCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A69ArtDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtArtDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5242MezArtDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMezArtDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A966PartCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPartCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5243MezColNom));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMezColNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5244MezColNum, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMezColNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5245MezColTCo, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMezColTCo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5246MezKgsArt, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMezKgsArt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5247MezHdr, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMezHdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5248MezReo, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMezReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5249MezPar));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMezPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5833MezObs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMezObs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtMezCod_Internalname = "MEZCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtMezULin_Internalname = "MEZULIN" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtMezPorT_Internalname = "MEZPORT" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtMezKgs_Internalname = "MEZKGS" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtMezPda_Internalname = "MEZPDA" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtMezFecPda_Internalname = "MEZFECPDA" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtMezFecEnt_Internalname = "MEZFECENT" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtMezPorTot_Internalname = "MEZPORTOT" ;
      edtavnRcdDeleted_1580_Internalname = "vNRCDDELETED_1580" ;
      edtMezLin_Internalname = "MEZLIN" ;
      edtMezPor_Internalname = "MEZPOR" ;
      edtArtCod_Internalname = "ARTCOD" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      edtMezArtDsc_Internalname = "MEZARTDSC" ;
      edtPartCod_Internalname = "PARTCOD" ;
      edtMezColNom_Internalname = "MEZCOLNOM" ;
      edtMezColNum_Internalname = "MEZCOLNUM" ;
      edtMezColTCo_Internalname = "MEZCOLTCO" ;
      edtMezKgsArt_Internalname = "MEZKGSART" ;
      edtMezHdr_Internalname = "MEZHDR" ;
      edtMezReo_Internalname = "MEZREO" ;
      edtMezPar_Internalname = "MEZPAR" ;
      edtMezObs_Internalname = "MEZOBS" ;
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
      Form.setCaption( httpContext.getMessage( "COMPOSICION DE MEZCLAS", "") );
      edtMezObs_Jsonclick = "" ;
      edtMezPar_Jsonclick = "" ;
      edtMezReo_Jsonclick = "" ;
      edtMezHdr_Jsonclick = "" ;
      edtMezKgsArt_Jsonclick = "" ;
      edtMezColTCo_Jsonclick = "" ;
      edtMezColNum_Jsonclick = "" ;
      edtMezColNom_Jsonclick = "" ;
      edtPartCod_Jsonclick = "" ;
      edtMezArtDsc_Jsonclick = "" ;
      edtArtDsc_Jsonclick = "" ;
      edtArtCod_Jsonclick = "" ;
      edtMezPor_Jsonclick = "" ;
      edtMezLin_Jsonclick = "" ;
      edtavnRcdDeleted_1580_Jsonclick = "" ;
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
      edtMezObs_Enabled = 1 ;
      edtMezPar_Enabled = 1 ;
      edtMezReo_Enabled = 1 ;
      edtMezHdr_Enabled = 1 ;
      edtMezKgsArt_Enabled = 0 ;
      edtMezColTCo_Enabled = 1 ;
      edtMezColNum_Enabled = 1 ;
      edtMezColNom_Enabled = 1 ;
      edtPartCod_Enabled = 1 ;
      edtMezArtDsc_Enabled = 1 ;
      edtArtDsc_Enabled = 0 ;
      edtArtCod_Enabled = 1 ;
      edtMezPor_Enabled = 1 ;
      edtMezLin_Enabled = 1 ;
      edtavnRcdDeleted_1580_Enabled = 1 ;
      edtMezPorTot_Jsonclick = "" ;
      edtMezPorTot_Backcolor = (int)(0xFFFFFF) ;
      edtMezPorTot_Enabled = 1 ;
      edtMezFecEnt_Jsonclick = "" ;
      edtMezFecEnt_Backcolor = (int)(0xFFFFFF) ;
      edtMezFecEnt_Enabled = 1 ;
      edtMezFecPda_Jsonclick = "" ;
      edtMezFecPda_Backcolor = (int)(0xFFFFFF) ;
      edtMezFecPda_Enabled = 1 ;
      edtMezPda_Jsonclick = "" ;
      edtMezPda_Backcolor = (int)(0xFFFFFF) ;
      edtMezPda_Enabled = 1 ;
      edtMezKgs_Jsonclick = "" ;
      edtMezKgs_Backcolor = (int)(0xFFFFFF) ;
      edtMezKgs_Enabled = 1 ;
      edtMezPorT_Jsonclick = "" ;
      edtMezPorT_Backcolor = (int)(0xFFFFFF) ;
      edtMezPorT_Enabled = 0 ;
      edtMezULin_Jsonclick = "" ;
      edtMezULin_Backcolor = (int)(0xFFFFFF) ;
      edtMezULin_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMezCod_Jsonclick = "" ;
      edtMezCod_Backcolor = (int)(0xFFFFFF) ;
      edtMezCod_Enabled = 1 ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_801580( ) ;
      while ( nGXsfl_80_idx <= nRC_GXsfl_80 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1FP1580( ) ;
         standaloneModal1FP1580( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1FP1580( ) ;
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_801580( ) ;
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
      /* Using cursor T01FP24 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01FP24_A407EmprNom[0] ;
      n407EmprNom = T01FP24_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(19);
      /* Using cursor T01FP25 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01FP25_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(20);
      /* Using cursor T01FP27 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5234MezCod});
      if ( (pr_default.getStatus(21) != 101) )
      {
         A5236MezPorT = T01FP27_A5236MezPorT[0] ;
         n5236MezPorT = T01FP27_n5236MezPorT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
      }
      else
      {
         A5236MezPorT = DecimalUtil.doubleToDec(0) ;
         n5236MezPorT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrimstr( A5236MezPorT, 6, 2));
      }
      pr_default.close(21);
      GX_FocusControl = edtMezULin_Internalname ;
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
      /* Using cursor T01FP24 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01FP24_A407EmprNom[0] ;
      n407EmprNom = T01FP24_n407EmprNom[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Clicod( )
   {
      /* Using cursor T01FP25 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T01FP25_A279CliNom[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Mezcod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01FP27 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5234MezCod});
      if ( (pr_default.getStatus(21) != 101) )
      {
         A5236MezPorT = T01FP27_A5236MezPorT[0] ;
         n5236MezPorT = T01FP27_n5236MezPorT[0] ;
      }
      else
      {
         A5236MezPorT = DecimalUtil.doubleToDec(0) ;
         n5236MezPorT = false ;
      }
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5235MezULin", GXutil.ltrim( localUtil.ntoc( A5235MezULin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5237MezKgs", GXutil.ltrim( localUtil.ntoc( A5237MezKgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5238MezPda", GXutil.rtrim( A5238MezPda));
      httpContext.ajax_rsp_assign_attri("", false, "A5239MezFecPda", localUtil.format(A5239MezFecPda, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A5308MezFecEnt", localUtil.format(A5308MezFecEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A5309MezPorTot", GXutil.ltrim( localUtil.ntoc( A5309MezPorTot, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A5236MezPorT", GXutil.ltrim( localUtil.ntoc( A5236MezPorT, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5234MezCod", GXutil.rtrim( Z5234MezCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5235MezULin", GXutil.ltrim( localUtil.ntoc( Z5235MezULin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5237MezKgs", GXutil.ltrim( localUtil.ntoc( Z5237MezKgs, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5238MezPda", GXutil.rtrim( Z5238MezPda));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5239MezFecPda", localUtil.format(Z5239MezFecPda, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5308MezFecEnt", localUtil.format(Z5308MezFecEnt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5309MezPorTot", GXutil.ltrim( localUtil.ntoc( Z5309MezPorTot, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5236MezPorT", GXutil.ltrim( localUtil.ntoc( Z5236MezPorT, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O5236MezPorT", GXutil.ltrim( localUtil.ntoc( O5236MezPorT, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Artcod( )
   {
      n65ArtCod = false ;
      n69ArtDsc = false ;
      /* Using cursor T01FP36 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtCod_Internalname ;
      }
      A69ArtDsc = T01FP36_A69ArtDsc[0] ;
      n69ArtDsc = T01FP36_n69ArtDsc[0] ;
      pr_default.close(30);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
   }

   public void valid_Partcod( )
   {
      n966PartCod = false ;
      /* Using cursor T01FP38 */
      pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPARTI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPartCod_Internalname ;
      }
      pr_default.close(32);
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_MEZCOD","{handler:'valid_Mezcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A5234MezCod',fld:'MEZCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MEZCOD",",oparms:[{av:'A5235MezULin',fld:'MEZULIN',pic:'Z9'},{av:'A5237MezKgs',fld:'MEZKGS',pic:'ZZZZZ9.99'},{av:'A5238MezPda',fld:'MEZPDA',pic:''},{av:'A5239MezFecPda',fld:'MEZFECPDA',pic:''},{av:'A5308MezFecEnt',fld:'MEZFECENT',pic:''},{av:'A5309MezPorTot',fld:'MEZPORTOT',pic:'ZZ9.99'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A5236MezPorT',fld:'MEZPORT',pic:'ZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z5234MezCod'},{av:'Z5235MezULin'},{av:'Z5237MezKgs'},{av:'Z5238MezPda'},{av:'Z5239MezFecPda'},{av:'Z5308MezFecEnt'},{av:'Z5309MezPorTot'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z5236MezPorT'},{av:'O5236MezPorT'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MEZKGS","{handler:'valid_Mezkgs',iparms:[]");
      setEventMetadata("VALID_MEZKGS",",oparms:[]}");
      setEventMetadata("VALID_MEZPORTOT","{handler:'valid_Mezportot',iparms:[]");
      setEventMetadata("VALID_MEZPORTOT",",oparms:[]}");
      setEventMetadata("VALID_MEZLIN","{handler:'valid_Mezlin',iparms:[]");
      setEventMetadata("VALID_MEZLIN",",oparms:[]}");
      setEventMetadata("VALID_MEZPOR","{handler:'valid_Mezpor',iparms:[]");
      setEventMetadata("VALID_MEZPOR",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''}]");
      setEventMetadata("VALID_ARTCOD",",oparms:[{av:'A69ArtDsc',fld:'ARTDSC',pic:''}]}");
      setEventMetadata("VALID_PARTCOD","{handler:'valid_Partcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A966PartCod',fld:'PARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_PARTCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Mezobs',iparms:[]");
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
      pr_default.close(20);
      pr_default.close(19);
      pr_default.close(21);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z5234MezCod = "" ;
      Z5237MezKgs = DecimalUtil.ZERO ;
      Z5238MezPda = "" ;
      Z5239MezFecPda = GXutil.nullDate() ;
      Z5308MezFecEnt = GXutil.nullDate() ;
      Z5309MezPorTot = DecimalUtil.ZERO ;
      O5236MezPorT = DecimalUtil.ZERO ;
      Z5241MezPor = DecimalUtil.ZERO ;
      Z5242MezArtDsc = "" ;
      Z5243MezColNom = "" ;
      Z5249MezPar = "" ;
      Z5833MezObs = "" ;
      Z65ArtCod = "" ;
      Z966PartCod = "" ;
      O5241MezPor = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A5234MezCod = "" ;
      A65ArtCod = "" ;
      A966PartCod = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A5236MezPorT = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      A5237MezKgs = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A5238MezPda = "" ;
      lblTextblock10_Jsonclick = "" ;
      A5239MezFecPda = GXutil.nullDate() ;
      lblTextblock11_Jsonclick = "" ;
      A5308MezFecEnt = GXutil.nullDate() ;
      lblTextblock12_Jsonclick = "" ;
      A5309MezPorTot = DecimalUtil.ZERO ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B5236MezPorT = DecimalUtil.ZERO ;
      sMode1580 = "" ;
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
      sMode1579 = "" ;
      s5236MezPorT = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A5241MezPor = DecimalUtil.ZERO ;
      A69ArtDsc = "" ;
      A5242MezArtDsc = "" ;
      A5243MezColNom = "" ;
      A5246MezKgsArt = DecimalUtil.ZERO ;
      A5249MezPar = "" ;
      A5833MezObs = "" ;
      T5241MezPor = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z5236MezPorT = DecimalUtil.ZERO ;
      T01FP13_A5234MezCod = new String[] {""} ;
      T01FP13_A407EmprNom = new String[] {""} ;
      T01FP13_n407EmprNom = new boolean[] {false} ;
      T01FP13_A279CliNom = new String[] {""} ;
      T01FP13_A5235MezULin = new byte[1] ;
      T01FP13_n5235MezULin = new boolean[] {false} ;
      T01FP13_A5237MezKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FP13_n5237MezKgs = new boolean[] {false} ;
      T01FP13_A5238MezPda = new String[] {""} ;
      T01FP13_n5238MezPda = new boolean[] {false} ;
      T01FP13_A5239MezFecPda = new java.util.Date[] {GXutil.nullDate()} ;
      T01FP13_n5239MezFecPda = new boolean[] {false} ;
      T01FP13_A5308MezFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01FP13_n5308MezFecEnt = new boolean[] {false} ;
      T01FP13_A5309MezPorTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FP13_n5309MezPorTot = new boolean[] {false} ;
      T01FP13_A396EmprCod = new String[] {""} ;
      T01FP13_A252CliCod = new int[1] ;
      T01FP13_A5236MezPorT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FP13_n5236MezPorT = new boolean[] {false} ;
      T01FP8_A407EmprNom = new String[] {""} ;
      T01FP8_n407EmprNom = new boolean[] {false} ;
      T01FP9_A279CliNom = new String[] {""} ;
      T01FP11_A5236MezPorT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FP11_n5236MezPorT = new boolean[] {false} ;
      T01FP14_A407EmprNom = new String[] {""} ;
      T01FP14_n407EmprNom = new boolean[] {false} ;
      T01FP15_A279CliNom = new String[] {""} ;
      T01FP17_A5236MezPorT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FP17_n5236MezPorT = new boolean[] {false} ;
      T01FP18_A396EmprCod = new String[] {""} ;
      T01FP18_A252CliCod = new int[1] ;
      T01FP18_A5234MezCod = new String[] {""} ;
      T01FP7_A5234MezCod = new String[] {""} ;
      T01FP7_A5235MezULin = new byte[1] ;
      T01FP7_n5235MezULin = new boolean[] {false} ;
      T01FP7_A5237MezKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FP7_n5237MezKgs = new boolean[] {false} ;
      T01FP7_A5238MezPda = new String[] {""} ;
      T01FP7_n5238MezPda = new boolean[] {false} ;
      T01FP7_A5239MezFecPda = new java.util.Date[] {GXutil.nullDate()} ;
      T01FP7_n5239MezFecPda = new boolean[] {false} ;
      T01FP7_A5308MezFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01FP7_n5308MezFecEnt = new boolean[] {false} ;
      T01FP7_A5309MezPorTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FP7_n5309MezPorTot = new boolean[] {false} ;
      T01FP7_A396EmprCod = new String[] {""} ;
      T01FP7_A252CliCod = new int[1] ;
      T01FP19_A396EmprCod = new String[] {""} ;
      T01FP19_A252CliCod = new int[1] ;
      T01FP19_A5234MezCod = new String[] {""} ;
      T01FP20_A396EmprCod = new String[] {""} ;
      T01FP20_A252CliCod = new int[1] ;
      T01FP20_A5234MezCod = new String[] {""} ;
      T01FP6_A5234MezCod = new String[] {""} ;
      T01FP6_A5235MezULin = new byte[1] ;
      T01FP6_n5235MezULin = new boolean[] {false} ;
      T01FP6_A5237MezKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FP6_n5237MezKgs = new boolean[] {false} ;
      T01FP6_A5238MezPda = new String[] {""} ;
      T01FP6_n5238MezPda = new boolean[] {false} ;
      T01FP6_A5239MezFecPda = new java.util.Date[] {GXutil.nullDate()} ;
      T01FP6_n5239MezFecPda = new boolean[] {false} ;
      T01FP6_A5308MezFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01FP6_n5308MezFecEnt = new boolean[] {false} ;
      T01FP6_A5309MezPorTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FP6_n5309MezPorTot = new boolean[] {false} ;
      T01FP6_A396EmprCod = new String[] {""} ;
      T01FP6_A252CliCod = new int[1] ;
      T01FP24_A407EmprNom = new String[] {""} ;
      T01FP24_n407EmprNom = new boolean[] {false} ;
      T01FP25_A279CliNom = new String[] {""} ;
      T01FP27_A5236MezPorT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FP27_n5236MezPorT = new boolean[] {false} ;
      T01FP28_A396EmprCod = new String[] {""} ;
      T01FP28_A252CliCod = new int[1] ;
      T01FP28_A5234MezCod = new String[] {""} ;
      Z69ArtDsc = "" ;
      T01FP29_A5234MezCod = new String[] {""} ;
      T01FP29_A5240MezLin = new byte[1] ;
      T01FP29_A5241MezPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FP29_n5241MezPor = new boolean[] {false} ;
      T01FP29_A69ArtDsc = new String[] {""} ;
      T01FP29_n69ArtDsc = new boolean[] {false} ;
      T01FP29_A5242MezArtDsc = new String[] {""} ;
      T01FP29_n5242MezArtDsc = new boolean[] {false} ;
      T01FP29_A5243MezColNom = new String[] {""} ;
      T01FP29_n5243MezColNom = new boolean[] {false} ;
      T01FP29_A5244MezColNum = new int[1] ;
      T01FP29_n5244MezColNum = new boolean[] {false} ;
      T01FP29_A5245MezColTCo = new byte[1] ;
      T01FP29_n5245MezColTCo = new boolean[] {false} ;
      T01FP29_A5247MezHdr = new int[1] ;
      T01FP29_n5247MezHdr = new boolean[] {false} ;
      T01FP29_A5248MezReo = new byte[1] ;
      T01FP29_n5248MezReo = new boolean[] {false} ;
      T01FP29_A5249MezPar = new String[] {""} ;
      T01FP29_n5249MezPar = new boolean[] {false} ;
      T01FP29_A5833MezObs = new String[] {""} ;
      T01FP29_n5833MezObs = new boolean[] {false} ;
      T01FP29_A396EmprCod = new String[] {""} ;
      T01FP29_A252CliCod = new int[1] ;
      T01FP29_A65ArtCod = new String[] {""} ;
      T01FP29_n65ArtCod = new boolean[] {false} ;
      T01FP29_A966PartCod = new String[] {""} ;
      T01FP29_n966PartCod = new boolean[] {false} ;
      T01FP4_A69ArtDsc = new String[] {""} ;
      T01FP4_n69ArtDsc = new boolean[] {false} ;
      T01FP5_A396EmprCod = new String[] {""} ;
      T01FP30_A69ArtDsc = new String[] {""} ;
      T01FP30_n69ArtDsc = new boolean[] {false} ;
      T01FP31_A396EmprCod = new String[] {""} ;
      T01FP32_A396EmprCod = new String[] {""} ;
      T01FP32_A252CliCod = new int[1] ;
      T01FP32_A5234MezCod = new String[] {""} ;
      T01FP32_A5240MezLin = new byte[1] ;
      T01FP3_A5234MezCod = new String[] {""} ;
      T01FP3_A5240MezLin = new byte[1] ;
      T01FP3_A5241MezPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FP3_n5241MezPor = new boolean[] {false} ;
      T01FP3_A5242MezArtDsc = new String[] {""} ;
      T01FP3_n5242MezArtDsc = new boolean[] {false} ;
      T01FP3_A5243MezColNom = new String[] {""} ;
      T01FP3_n5243MezColNom = new boolean[] {false} ;
      T01FP3_A5244MezColNum = new int[1] ;
      T01FP3_n5244MezColNum = new boolean[] {false} ;
      T01FP3_A5245MezColTCo = new byte[1] ;
      T01FP3_n5245MezColTCo = new boolean[] {false} ;
      T01FP3_A5247MezHdr = new int[1] ;
      T01FP3_n5247MezHdr = new boolean[] {false} ;
      T01FP3_A5248MezReo = new byte[1] ;
      T01FP3_n5248MezReo = new boolean[] {false} ;
      T01FP3_A5249MezPar = new String[] {""} ;
      T01FP3_n5249MezPar = new boolean[] {false} ;
      T01FP3_A5833MezObs = new String[] {""} ;
      T01FP3_n5833MezObs = new boolean[] {false} ;
      T01FP3_A396EmprCod = new String[] {""} ;
      T01FP3_A252CliCod = new int[1] ;
      T01FP3_A65ArtCod = new String[] {""} ;
      T01FP3_n65ArtCod = new boolean[] {false} ;
      T01FP3_A966PartCod = new String[] {""} ;
      T01FP3_n966PartCod = new boolean[] {false} ;
      T01FP2_A5234MezCod = new String[] {""} ;
      T01FP2_A5240MezLin = new byte[1] ;
      T01FP2_A5241MezPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FP2_n5241MezPor = new boolean[] {false} ;
      T01FP2_A5242MezArtDsc = new String[] {""} ;
      T01FP2_n5242MezArtDsc = new boolean[] {false} ;
      T01FP2_A5243MezColNom = new String[] {""} ;
      T01FP2_n5243MezColNom = new boolean[] {false} ;
      T01FP2_A5244MezColNum = new int[1] ;
      T01FP2_n5244MezColNum = new boolean[] {false} ;
      T01FP2_A5245MezColTCo = new byte[1] ;
      T01FP2_n5245MezColTCo = new boolean[] {false} ;
      T01FP2_A5247MezHdr = new int[1] ;
      T01FP2_n5247MezHdr = new boolean[] {false} ;
      T01FP2_A5248MezReo = new byte[1] ;
      T01FP2_n5248MezReo = new boolean[] {false} ;
      T01FP2_A5249MezPar = new String[] {""} ;
      T01FP2_n5249MezPar = new boolean[] {false} ;
      T01FP2_A5833MezObs = new String[] {""} ;
      T01FP2_n5833MezObs = new boolean[] {false} ;
      T01FP2_A396EmprCod = new String[] {""} ;
      T01FP2_A252CliCod = new int[1] ;
      T01FP2_A65ArtCod = new String[] {""} ;
      T01FP2_n65ArtCod = new boolean[] {false} ;
      T01FP2_A966PartCod = new String[] {""} ;
      T01FP2_n966PartCod = new boolean[] {false} ;
      T01FP36_A69ArtDsc = new String[] {""} ;
      T01FP36_n69ArtDsc = new boolean[] {false} ;
      T01FP37_A396EmprCod = new String[] {""} ;
      T01FP37_A252CliCod = new int[1] ;
      T01FP37_A5234MezCod = new String[] {""} ;
      T01FP37_A5240MezLin = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ5234MezCod = "" ;
      ZZ5237MezKgs = DecimalUtil.ZERO ;
      ZZ5238MezPda = "" ;
      ZZ5239MezFecPda = GXutil.nullDate() ;
      ZZ5308MezFecEnt = GXutil.nullDate() ;
      ZZ5309MezPorTot = DecimalUtil.ZERO ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ5236MezPorT = DecimalUtil.ZERO ;
      ZO5236MezPorT = DecimalUtil.ZERO ;
      T01FP38_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tmezcla__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmezcla__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmezcla__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmezcla__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmezcla__default(),
         new Object[] {
             new Object[] {
            T01FP2_A5234MezCod, T01FP2_A5240MezLin, T01FP2_A5241MezPor, T01FP2_n5241MezPor, T01FP2_A5242MezArtDsc, T01FP2_n5242MezArtDsc, T01FP2_A5243MezColNom, T01FP2_n5243MezColNom, T01FP2_A5244MezColNum, T01FP2_n5244MezColNum,
            T01FP2_A5245MezColTCo, T01FP2_n5245MezColTCo, T01FP2_A5247MezHdr, T01FP2_n5247MezHdr, T01FP2_A5248MezReo, T01FP2_n5248MezReo, T01FP2_A5249MezPar, T01FP2_n5249MezPar, T01FP2_A5833MezObs, T01FP2_n5833MezObs,
            T01FP2_A396EmprCod, T01FP2_A252CliCod, T01FP2_A65ArtCod, T01FP2_n65ArtCod, T01FP2_A966PartCod, T01FP2_n966PartCod
            }
            , new Object[] {
            T01FP3_A5234MezCod, T01FP3_A5240MezLin, T01FP3_A5241MezPor, T01FP3_n5241MezPor, T01FP3_A5242MezArtDsc, T01FP3_n5242MezArtDsc, T01FP3_A5243MezColNom, T01FP3_n5243MezColNom, T01FP3_A5244MezColNum, T01FP3_n5244MezColNum,
            T01FP3_A5245MezColTCo, T01FP3_n5245MezColTCo, T01FP3_A5247MezHdr, T01FP3_n5247MezHdr, T01FP3_A5248MezReo, T01FP3_n5248MezReo, T01FP3_A5249MezPar, T01FP3_n5249MezPar, T01FP3_A5833MezObs, T01FP3_n5833MezObs,
            T01FP3_A396EmprCod, T01FP3_A252CliCod, T01FP3_A65ArtCod, T01FP3_n65ArtCod, T01FP3_A966PartCod, T01FP3_n966PartCod
            }
            , new Object[] {
            T01FP4_A69ArtDsc, T01FP4_n69ArtDsc
            }
            , new Object[] {
            T01FP5_A396EmprCod
            }
            , new Object[] {
            T01FP6_A5234MezCod, T01FP6_A5235MezULin, T01FP6_n5235MezULin, T01FP6_A5237MezKgs, T01FP6_n5237MezKgs, T01FP6_A5238MezPda, T01FP6_n5238MezPda, T01FP6_A5239MezFecPda, T01FP6_n5239MezFecPda, T01FP6_A5308MezFecEnt,
            T01FP6_n5308MezFecEnt, T01FP6_A5309MezPorTot, T01FP6_n5309MezPorTot, T01FP6_A396EmprCod, T01FP6_A252CliCod
            }
            , new Object[] {
            T01FP7_A5234MezCod, T01FP7_A5235MezULin, T01FP7_n5235MezULin, T01FP7_A5237MezKgs, T01FP7_n5237MezKgs, T01FP7_A5238MezPda, T01FP7_n5238MezPda, T01FP7_A5239MezFecPda, T01FP7_n5239MezFecPda, T01FP7_A5308MezFecEnt,
            T01FP7_n5308MezFecEnt, T01FP7_A5309MezPorTot, T01FP7_n5309MezPorTot, T01FP7_A396EmprCod, T01FP7_A252CliCod
            }
            , new Object[] {
            T01FP8_A407EmprNom, T01FP8_n407EmprNom
            }
            , new Object[] {
            T01FP9_A279CliNom
            }
            , new Object[] {
            T01FP11_A5236MezPorT, T01FP11_n5236MezPorT
            }
            , new Object[] {
            T01FP13_A5234MezCod, T01FP13_A407EmprNom, T01FP13_n407EmprNom, T01FP13_A279CliNom, T01FP13_A5235MezULin, T01FP13_n5235MezULin, T01FP13_A5237MezKgs, T01FP13_n5237MezKgs, T01FP13_A5238MezPda, T01FP13_n5238MezPda,
            T01FP13_A5239MezFecPda, T01FP13_n5239MezFecPda, T01FP13_A5308MezFecEnt, T01FP13_n5308MezFecEnt, T01FP13_A5309MezPorTot, T01FP13_n5309MezPorTot, T01FP13_A396EmprCod, T01FP13_A252CliCod, T01FP13_A5236MezPorT, T01FP13_n5236MezPorT
            }
            , new Object[] {
            T01FP14_A407EmprNom, T01FP14_n407EmprNom
            }
            , new Object[] {
            T01FP15_A279CliNom
            }
            , new Object[] {
            T01FP17_A5236MezPorT, T01FP17_n5236MezPorT
            }
            , new Object[] {
            T01FP18_A396EmprCod, T01FP18_A252CliCod, T01FP18_A5234MezCod
            }
            , new Object[] {
            T01FP19_A396EmprCod, T01FP19_A252CliCod, T01FP19_A5234MezCod
            }
            , new Object[] {
            T01FP20_A396EmprCod, T01FP20_A252CliCod, T01FP20_A5234MezCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FP24_A407EmprNom, T01FP24_n407EmprNom
            }
            , new Object[] {
            T01FP25_A279CliNom
            }
            , new Object[] {
            T01FP27_A5236MezPorT, T01FP27_n5236MezPorT
            }
            , new Object[] {
            T01FP28_A396EmprCod, T01FP28_A252CliCod, T01FP28_A5234MezCod
            }
            , new Object[] {
            T01FP29_A5234MezCod, T01FP29_A5240MezLin, T01FP29_A5241MezPor, T01FP29_n5241MezPor, T01FP29_A69ArtDsc, T01FP29_n69ArtDsc, T01FP29_A5242MezArtDsc, T01FP29_n5242MezArtDsc, T01FP29_A5243MezColNom, T01FP29_n5243MezColNom,
            T01FP29_A5244MezColNum, T01FP29_n5244MezColNum, T01FP29_A5245MezColTCo, T01FP29_n5245MezColTCo, T01FP29_A5247MezHdr, T01FP29_n5247MezHdr, T01FP29_A5248MezReo, T01FP29_n5248MezReo, T01FP29_A5249MezPar, T01FP29_n5249MezPar,
            T01FP29_A5833MezObs, T01FP29_n5833MezObs, T01FP29_A396EmprCod, T01FP29_A252CliCod, T01FP29_A65ArtCod, T01FP29_n65ArtCod, T01FP29_A966PartCod, T01FP29_n966PartCod
            }
            , new Object[] {
            T01FP30_A69ArtDsc, T01FP30_n69ArtDsc
            }
            , new Object[] {
            T01FP31_A396EmprCod
            }
            , new Object[] {
            T01FP32_A396EmprCod, T01FP32_A252CliCod, T01FP32_A5234MezCod, T01FP32_A5240MezLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FP36_A69ArtDsc, T01FP36_n69ArtDsc
            }
            , new Object[] {
            T01FP37_A396EmprCod, T01FP37_A252CliCod, T01FP37_A5234MezCod, T01FP37_A5240MezLin
            }
            , new Object[] {
            T01FP38_A396EmprCod
            }
         }
      );
   }

   private byte Z5235MezULin ;
   private byte Z5240MezLin ;
   private byte Z5245MezColTCo ;
   private byte Z5248MezReo ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A5235MezULin ;
   private byte A5240MezLin ;
   private byte A5245MezColTCo ;
   private byte A5248MezReo ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ5235MezULin ;
   private short nRcdDeleted_1580 ;
   private short nRcdExists_1580 ;
   private short nIsMod_1580 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1580 ;
   private short RcdFound1580 ;
   private short nBlankRcdUsr1580 ;
   private short RcdFound1579 ;
   private short nIsDirty_1579 ;
   private short nIsDirty_1580 ;
   private int Z252CliCod ;
   private int nRC_GXsfl_80 ;
   private int nGXsfl_80_idx=1 ;
   private int Z5244MezColNum ;
   private int Z5247MezHdr ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtMezCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtMezULin_Enabled ;
   private int edtMezPorT_Enabled ;
   private int edtMezKgs_Enabled ;
   private int edtMezPda_Enabled ;
   private int edtMezFecPda_Enabled ;
   private int edtMezFecEnt_Enabled ;
   private int edtMezPorTot_Enabled ;
   private int edtavnRcdDeleted_1580_Enabled ;
   private int edtMezLin_Enabled ;
   private int edtMezPor_Enabled ;
   private int edtArtCod_Enabled ;
   private int edtArtDsc_Enabled ;
   private int edtMezArtDsc_Enabled ;
   private int edtPartCod_Enabled ;
   private int edtMezColNom_Enabled ;
   private int edtMezColNum_Enabled ;
   private int edtMezColTCo_Enabled ;
   private int edtMezKgsArt_Enabled ;
   private int edtMezHdr_Enabled ;
   private int edtMezReo_Enabled ;
   private int edtMezPar_Enabled ;
   private int edtMezObs_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A5244MezColNum ;
   private int A5247MezHdr ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtMezLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMezPorTot_Backcolor ;
   private int edtMezFecEnt_Backcolor ;
   private int edtMezFecPda_Backcolor ;
   private int edtMezPda_Backcolor ;
   private int edtMezKgs_Backcolor ;
   private int edtMezPorT_Backcolor ;
   private int edtMezULin_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtMezCod_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z5237MezKgs ;
   private java.math.BigDecimal Z5309MezPorTot ;
   private java.math.BigDecimal O5236MezPorT ;
   private java.math.BigDecimal Z5241MezPor ;
   private java.math.BigDecimal O5241MezPor ;
   private java.math.BigDecimal A5236MezPorT ;
   private java.math.BigDecimal A5237MezKgs ;
   private java.math.BigDecimal A5309MezPorTot ;
   private java.math.BigDecimal B5236MezPorT ;
   private java.math.BigDecimal s5236MezPorT ;
   private java.math.BigDecimal A5241MezPor ;
   private java.math.BigDecimal A5246MezKgsArt ;
   private java.math.BigDecimal T5241MezPor ;
   private java.math.BigDecimal Z5236MezPorT ;
   private java.math.BigDecimal ZZ5237MezKgs ;
   private java.math.BigDecimal ZZ5309MezPorTot ;
   private java.math.BigDecimal ZZ5236MezPorT ;
   private java.math.BigDecimal ZO5236MezPorT ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z5234MezCod ;
   private String Z5238MezPda ;
   private String Z5242MezArtDsc ;
   private String Z5243MezColNom ;
   private String Z5249MezPar ;
   private String Z5833MezObs ;
   private String Z65ArtCod ;
   private String Z966PartCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A5234MezCod ;
   private String A65ArtCod ;
   private String A966PartCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
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
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtMezCod_Internalname ;
   private String edtMezCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtMezULin_Internalname ;
   private String edtMezULin_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtMezPorT_Internalname ;
   private String edtMezPorT_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtMezKgs_Internalname ;
   private String edtMezKgs_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtMezPda_Internalname ;
   private String A5238MezPda ;
   private String edtMezPda_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtMezFecPda_Internalname ;
   private String edtMezFecPda_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtMezFecEnt_Internalname ;
   private String edtMezFecEnt_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtMezPorTot_Internalname ;
   private String edtMezPorTot_Jsonclick ;
   private String sMode1580 ;
   private String edtavnRcdDeleted_1580_Internalname ;
   private String edtMezLin_Internalname ;
   private String edtMezPor_Internalname ;
   private String edtArtCod_Internalname ;
   private String edtArtDsc_Internalname ;
   private String edtMezArtDsc_Internalname ;
   private String edtPartCod_Internalname ;
   private String edtMezColNom_Internalname ;
   private String edtMezColNum_Internalname ;
   private String edtMezColTCo_Internalname ;
   private String edtMezKgsArt_Internalname ;
   private String edtMezHdr_Internalname ;
   private String edtMezReo_Internalname ;
   private String edtMezPar_Internalname ;
   private String edtMezObs_Internalname ;
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
   private String sMode1579 ;
   private String GXCCtl ;
   private String A69ArtDsc ;
   private String A5242MezArtDsc ;
   private String A5243MezColNom ;
   private String A5249MezPar ;
   private String A5833MezObs ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z69ArtDsc ;
   private String sGXsfl_80_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1580_Jsonclick ;
   private String edtMezLin_Jsonclick ;
   private String edtMezPor_Jsonclick ;
   private String edtArtCod_Jsonclick ;
   private String edtArtDsc_Jsonclick ;
   private String edtMezArtDsc_Jsonclick ;
   private String edtPartCod_Jsonclick ;
   private String edtMezColNom_Jsonclick ;
   private String edtMezColNum_Jsonclick ;
   private String edtMezColTCo_Jsonclick ;
   private String edtMezKgsArt_Jsonclick ;
   private String edtMezHdr_Jsonclick ;
   private String edtMezReo_Jsonclick ;
   private String edtMezPar_Jsonclick ;
   private String edtMezObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ5234MezCod ;
   private String ZZ5238MezPda ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private java.util.Date Z5239MezFecPda ;
   private java.util.Date Z5308MezFecEnt ;
   private java.util.Date A5239MezFecPda ;
   private java.util.Date A5308MezFecEnt ;
   private java.util.Date ZZ5239MezFecPda ;
   private java.util.Date ZZ5308MezFecEnt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n65ArtCod ;
   private boolean n966PartCod ;
   private boolean wbErr ;
   private boolean n5236MezPorT ;
   private boolean bGXsfl_80_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n5235MezULin ;
   private boolean n5237MezKgs ;
   private boolean n5238MezPda ;
   private boolean n5239MezFecPda ;
   private boolean n5308MezFecEnt ;
   private boolean n5309MezPorTot ;
   private boolean Gx_longc ;
   private boolean n5241MezPor ;
   private boolean n69ArtDsc ;
   private boolean n5242MezArtDsc ;
   private boolean n5243MezColNom ;
   private boolean n5244MezColNum ;
   private boolean n5245MezColTCo ;
   private boolean n5247MezHdr ;
   private boolean n5248MezReo ;
   private boolean n5249MezPar ;
   private boolean n5833MezObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01FP13_A5234MezCod ;
   private String[] T01FP13_A407EmprNom ;
   private boolean[] T01FP13_n407EmprNom ;
   private String[] T01FP13_A279CliNom ;
   private byte[] T01FP13_A5235MezULin ;
   private boolean[] T01FP13_n5235MezULin ;
   private java.math.BigDecimal[] T01FP13_A5237MezKgs ;
   private boolean[] T01FP13_n5237MezKgs ;
   private String[] T01FP13_A5238MezPda ;
   private boolean[] T01FP13_n5238MezPda ;
   private java.util.Date[] T01FP13_A5239MezFecPda ;
   private boolean[] T01FP13_n5239MezFecPda ;
   private java.util.Date[] T01FP13_A5308MezFecEnt ;
   private boolean[] T01FP13_n5308MezFecEnt ;
   private java.math.BigDecimal[] T01FP13_A5309MezPorTot ;
   private boolean[] T01FP13_n5309MezPorTot ;
   private String[] T01FP13_A396EmprCod ;
   private int[] T01FP13_A252CliCod ;
   private java.math.BigDecimal[] T01FP13_A5236MezPorT ;
   private boolean[] T01FP13_n5236MezPorT ;
   private String[] T01FP8_A407EmprNom ;
   private boolean[] T01FP8_n407EmprNom ;
   private String[] T01FP9_A279CliNom ;
   private java.math.BigDecimal[] T01FP11_A5236MezPorT ;
   private boolean[] T01FP11_n5236MezPorT ;
   private String[] T01FP14_A407EmprNom ;
   private boolean[] T01FP14_n407EmprNom ;
   private String[] T01FP15_A279CliNom ;
   private java.math.BigDecimal[] T01FP17_A5236MezPorT ;
   private boolean[] T01FP17_n5236MezPorT ;
   private String[] T01FP18_A396EmprCod ;
   private int[] T01FP18_A252CliCod ;
   private String[] T01FP18_A5234MezCod ;
   private String[] T01FP7_A5234MezCod ;
   private byte[] T01FP7_A5235MezULin ;
   private boolean[] T01FP7_n5235MezULin ;
   private java.math.BigDecimal[] T01FP7_A5237MezKgs ;
   private boolean[] T01FP7_n5237MezKgs ;
   private String[] T01FP7_A5238MezPda ;
   private boolean[] T01FP7_n5238MezPda ;
   private java.util.Date[] T01FP7_A5239MezFecPda ;
   private boolean[] T01FP7_n5239MezFecPda ;
   private java.util.Date[] T01FP7_A5308MezFecEnt ;
   private boolean[] T01FP7_n5308MezFecEnt ;
   private java.math.BigDecimal[] T01FP7_A5309MezPorTot ;
   private boolean[] T01FP7_n5309MezPorTot ;
   private String[] T01FP7_A396EmprCod ;
   private int[] T01FP7_A252CliCod ;
   private String[] T01FP19_A396EmprCod ;
   private int[] T01FP19_A252CliCod ;
   private String[] T01FP19_A5234MezCod ;
   private String[] T01FP20_A396EmprCod ;
   private int[] T01FP20_A252CliCod ;
   private String[] T01FP20_A5234MezCod ;
   private String[] T01FP6_A5234MezCod ;
   private byte[] T01FP6_A5235MezULin ;
   private boolean[] T01FP6_n5235MezULin ;
   private java.math.BigDecimal[] T01FP6_A5237MezKgs ;
   private boolean[] T01FP6_n5237MezKgs ;
   private String[] T01FP6_A5238MezPda ;
   private boolean[] T01FP6_n5238MezPda ;
   private java.util.Date[] T01FP6_A5239MezFecPda ;
   private boolean[] T01FP6_n5239MezFecPda ;
   private java.util.Date[] T01FP6_A5308MezFecEnt ;
   private boolean[] T01FP6_n5308MezFecEnt ;
   private java.math.BigDecimal[] T01FP6_A5309MezPorTot ;
   private boolean[] T01FP6_n5309MezPorTot ;
   private String[] T01FP6_A396EmprCod ;
   private int[] T01FP6_A252CliCod ;
   private String[] T01FP24_A407EmprNom ;
   private boolean[] T01FP24_n407EmprNom ;
   private String[] T01FP25_A279CliNom ;
   private java.math.BigDecimal[] T01FP27_A5236MezPorT ;
   private boolean[] T01FP27_n5236MezPorT ;
   private String[] T01FP28_A396EmprCod ;
   private int[] T01FP28_A252CliCod ;
   private String[] T01FP28_A5234MezCod ;
   private String[] T01FP29_A5234MezCod ;
   private byte[] T01FP29_A5240MezLin ;
   private java.math.BigDecimal[] T01FP29_A5241MezPor ;
   private boolean[] T01FP29_n5241MezPor ;
   private String[] T01FP29_A69ArtDsc ;
   private boolean[] T01FP29_n69ArtDsc ;
   private String[] T01FP29_A5242MezArtDsc ;
   private boolean[] T01FP29_n5242MezArtDsc ;
   private String[] T01FP29_A5243MezColNom ;
   private boolean[] T01FP29_n5243MezColNom ;
   private int[] T01FP29_A5244MezColNum ;
   private boolean[] T01FP29_n5244MezColNum ;
   private byte[] T01FP29_A5245MezColTCo ;
   private boolean[] T01FP29_n5245MezColTCo ;
   private int[] T01FP29_A5247MezHdr ;
   private boolean[] T01FP29_n5247MezHdr ;
   private byte[] T01FP29_A5248MezReo ;
   private boolean[] T01FP29_n5248MezReo ;
   private String[] T01FP29_A5249MezPar ;
   private boolean[] T01FP29_n5249MezPar ;
   private String[] T01FP29_A5833MezObs ;
   private boolean[] T01FP29_n5833MezObs ;
   private String[] T01FP29_A396EmprCod ;
   private int[] T01FP29_A252CliCod ;
   private String[] T01FP29_A65ArtCod ;
   private boolean[] T01FP29_n65ArtCod ;
   private String[] T01FP29_A966PartCod ;
   private boolean[] T01FP29_n966PartCod ;
   private String[] T01FP4_A69ArtDsc ;
   private boolean[] T01FP4_n69ArtDsc ;
   private String[] T01FP5_A396EmprCod ;
   private String[] T01FP30_A69ArtDsc ;
   private boolean[] T01FP30_n69ArtDsc ;
   private String[] T01FP31_A396EmprCod ;
   private String[] T01FP32_A396EmprCod ;
   private int[] T01FP32_A252CliCod ;
   private String[] T01FP32_A5234MezCod ;
   private byte[] T01FP32_A5240MezLin ;
   private String[] T01FP3_A5234MezCod ;
   private byte[] T01FP3_A5240MezLin ;
   private java.math.BigDecimal[] T01FP3_A5241MezPor ;
   private boolean[] T01FP3_n5241MezPor ;
   private String[] T01FP3_A5242MezArtDsc ;
   private boolean[] T01FP3_n5242MezArtDsc ;
   private String[] T01FP3_A5243MezColNom ;
   private boolean[] T01FP3_n5243MezColNom ;
   private int[] T01FP3_A5244MezColNum ;
   private boolean[] T01FP3_n5244MezColNum ;
   private byte[] T01FP3_A5245MezColTCo ;
   private boolean[] T01FP3_n5245MezColTCo ;
   private int[] T01FP3_A5247MezHdr ;
   private boolean[] T01FP3_n5247MezHdr ;
   private byte[] T01FP3_A5248MezReo ;
   private boolean[] T01FP3_n5248MezReo ;
   private String[] T01FP3_A5249MezPar ;
   private boolean[] T01FP3_n5249MezPar ;
   private String[] T01FP3_A5833MezObs ;
   private boolean[] T01FP3_n5833MezObs ;
   private String[] T01FP3_A396EmprCod ;
   private int[] T01FP3_A252CliCod ;
   private String[] T01FP3_A65ArtCod ;
   private boolean[] T01FP3_n65ArtCod ;
   private String[] T01FP3_A966PartCod ;
   private boolean[] T01FP3_n966PartCod ;
   private String[] T01FP2_A5234MezCod ;
   private byte[] T01FP2_A5240MezLin ;
   private java.math.BigDecimal[] T01FP2_A5241MezPor ;
   private boolean[] T01FP2_n5241MezPor ;
   private String[] T01FP2_A5242MezArtDsc ;
   private boolean[] T01FP2_n5242MezArtDsc ;
   private String[] T01FP2_A5243MezColNom ;
   private boolean[] T01FP2_n5243MezColNom ;
   private int[] T01FP2_A5244MezColNum ;
   private boolean[] T01FP2_n5244MezColNum ;
   private byte[] T01FP2_A5245MezColTCo ;
   private boolean[] T01FP2_n5245MezColTCo ;
   private int[] T01FP2_A5247MezHdr ;
   private boolean[] T01FP2_n5247MezHdr ;
   private byte[] T01FP2_A5248MezReo ;
   private boolean[] T01FP2_n5248MezReo ;
   private String[] T01FP2_A5249MezPar ;
   private boolean[] T01FP2_n5249MezPar ;
   private String[] T01FP2_A5833MezObs ;
   private boolean[] T01FP2_n5833MezObs ;
   private String[] T01FP2_A396EmprCod ;
   private int[] T01FP2_A252CliCod ;
   private String[] T01FP2_A65ArtCod ;
   private boolean[] T01FP2_n65ArtCod ;
   private String[] T01FP2_A966PartCod ;
   private boolean[] T01FP2_n966PartCod ;
   private String[] T01FP36_A69ArtDsc ;
   private boolean[] T01FP36_n69ArtDsc ;
   private String[] T01FP37_A396EmprCod ;
   private int[] T01FP37_A252CliCod ;
   private String[] T01FP37_A5234MezCod ;
   private byte[] T01FP37_A5240MezLin ;
   private String[] T01FP38_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmezcla__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmezcla__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmezcla__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmezcla__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmezcla__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01FP2", "SELECT MezCod, MezLin, MezPor, MezArtDsc, MezColNom, MezColNum, MezColTCo, MezHdr, MezReo, MezPar, MezObs, EmprCod, CliCod, ArtCod, PartCod FROM TXPLMZCLA WHERE EmprCod = ? AND CliCod = ? AND MezCod = ? AND MezLin = ?  FOR UPDATE OF MezPor, MezArtDsc, MezColNom, MezColNum, MezColTCo, MezHdr, MezReo, MezPar, MezObs, ArtCod, PartCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FP3", "SELECT MezCod, MezLin, MezPor, MezArtDsc, MezColNom, MezColNum, MezColTCo, MezHdr, MezReo, MezPar, MezObs, EmprCod, CliCod, ArtCod, PartCod FROM TXPLMZCLA WHERE EmprCod = ? AND CliCod = ? AND MezCod = ? AND MezLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FP4", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FP5", "SELECT EmprCod FROM TXPCPARTI WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FP6", "SELECT MezCod, MezULin, MezKgs, MezPda, MezFecPda, MezFecEnt, MezPorTot, EmprCod, CliCod FROM TXPMEZCLA WHERE EmprCod = ? AND CliCod = ? AND MezCod = ?  FOR UPDATE OF MezULin, MezKgs, MezPda, MezFecPda, MezFecEnt, MezPorTot NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FP7", "SELECT MezCod, MezULin, MezKgs, MezPda, MezFecPda, MezFecEnt, MezPorTot, EmprCod, CliCod FROM TXPMEZCLA WHERE EmprCod = ? AND CliCod = ? AND MezCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FP8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FP9", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FP11", "SELECT COALESCE( T1.MezPorT, 0) AS MezPorT FROM (SELECT SUM(MezPor) AS MezPorT, EmprCod, CliCod, MezCod FROM TXPLMZCLA GROUP BY EmprCod, CliCod, MezCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.MezCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FP13", "SELECT /*+ FIRST_ROWS(100) */ TM1.MezCod, T2.EmprNom, T3.CliNom, TM1.MezULin, TM1.MezKgs, TM1.MezPda, TM1.MezFecPda, TM1.MezFecEnt, TM1.MezPorTot, TM1.EmprCod, TM1.CliCod, COALESCE( T4.MezPorT, 0) AS MezPorT FROM (((TXPMEZCLA TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN (SELECT SUM(MezPor) AS MezPorT, EmprCod, CliCod, MezCod FROM TXPLMZCLA GROUP BY EmprCod, CliCod, MezCod ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.MezCod = TM1.MezCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.MezCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.MezCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FP14", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FP15", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FP17", "SELECT COALESCE( T1.MezPorT, 0) AS MezPorT FROM (SELECT SUM(MezPor) AS MezPorT, EmprCod, CliCod, MezCod FROM TXPLMZCLA GROUP BY EmprCod, CliCod, MezCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.MezCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FP18", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, MezCod FROM TXPMEZCLA WHERE EmprCod = ? AND CliCod = ? AND MezCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FP19", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, MezCod FROM TXPMEZCLA WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ? or CliCod = ? and EmprCod = ? and MezCod > ?) ORDER BY EmprCod, CliCod, MezCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FP20", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, MezCod FROM TXPMEZCLA WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ? or CliCod = ? and EmprCod = ? and MezCod < ?) ORDER BY EmprCod DESC, CliCod DESC, MezCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FP21", "INSERT INTO TXPMEZCLA(MezCod, MezULin, MezKgs, MezPda, MezFecPda, MezFecEnt, MezPorTot, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMEZCLA")
         ,new UpdateCursor("T01FP22", "UPDATE TXPMEZCLA SET MezULin=?, MezKgs=?, MezPda=?, MezFecPda=?, MezFecEnt=?, MezPorTot=?  WHERE EmprCod = ? AND CliCod = ? AND MezCod = ?", GX_NOMASK, "TXPMEZCLA")
         ,new UpdateCursor("T01FP23", "DELETE FROM TXPMEZCLA  WHERE EmprCod = ? AND CliCod = ? AND MezCod = ?", GX_NOMASK, "TXPMEZCLA")
         ,new ForEachCursor("T01FP24", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FP25", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FP27", "SELECT COALESCE( T1.MezPorT, 0) AS MezPorT FROM (SELECT SUM(MezPor) AS MezPorT, EmprCod, CliCod, MezCod FROM TXPLMZCLA GROUP BY EmprCod, CliCod, MezCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.MezCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FP28", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, MezCod FROM TXPMEZCLA ORDER BY EmprCod, CliCod, MezCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FP29", "SELECT T1.MezCod, T1.MezLin, T1.MezPor, T2.ArtDsc, T1.MezArtDsc, T1.MezColNom, T1.MezColNum, T1.MezColTCo, T1.MezHdr, T1.MezReo, T1.MezPar, T1.MezObs, T1.EmprCod, T1.CliCod, T1.ArtCod, T1.PartCod FROM (TXPLMZCLA T1 LEFT JOIN TXPARTICU T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ArtCod = T1.ArtCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.MezCod = ? and T1.MezLin = ? ORDER BY T1.EmprCod, T1.CliCod, T1.MezCod, T1.MezLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FP30", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FP31", "SELECT EmprCod FROM TXPCPARTI WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FP32", "SELECT EmprCod, CliCod, MezCod, MezLin FROM TXPLMZCLA WHERE EmprCod = ? AND CliCod = ? AND MezCod = ? AND MezLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01FP33", "INSERT INTO TXPLMZCLA(MezCod, MezLin, MezPor, MezArtDsc, MezColNom, MezColNum, MezColTCo, MezHdr, MezReo, MezPar, MezObs, EmprCod, CliCod, ArtCod, PartCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLMZCLA")
         ,new UpdateCursor("T01FP34", "UPDATE TXPLMZCLA SET MezPor=?, MezArtDsc=?, MezColNom=?, MezColNum=?, MezColTCo=?, MezHdr=?, MezReo=?, MezPar=?, MezObs=?, ArtCod=?, PartCod=?  WHERE EmprCod = ? AND CliCod = ? AND MezCod = ? AND MezLin = ?", GX_NOMASK, "TXPLMZCLA")
         ,new UpdateCursor("T01FP35", "DELETE FROM TXPLMZCLA  WHERE EmprCod = ? AND CliCod = ? AND MezCod = ? AND MezLin = ?", GX_NOMASK, "TXPLMZCLA")
         ,new ForEachCursor("T01FP36", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FP37", "SELECT EmprCod, CliCod, MezCod, MezLin FROM TXPLMZCLA WHERE EmprCod = ? and CliCod = ? and MezCod = ? ORDER BY EmprCod, CliCod, MezCod, MezLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FP38", "SELECT EmprCod FROM TXPCPARTI WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 13);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 3);
               ((int[]) buf[21])[0] = rslt.getInt(13);
               ((String[]) buf[22])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 13);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 3);
               ((int[]) buf[21])[0] = rslt.getInt(13);
               ((String[]) buf[22])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((int[]) buf[14])[0] = rslt.getInt(9);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((int[]) buf[14])[0] = rslt.getInt(9);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 3);
               ((int[]) buf[17])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 12 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 21 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 3);
               ((int[]) buf[23])[0] = rslt.getInt(14);
               ((String[]) buf[24])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 32 :
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
               stmt.setString(3, (String)parms[2], 20);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 16);
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
                  stmt.setString(2, (String)parms[2], 16);
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 20);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 20);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 20);
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
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[8]);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[10]);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[12], 2);
               }
               stmt.setString(8, (String)parms[13], 3);
               stmt.setInt(9, ((Number) parms[14]).intValue());
               return;
            case 17 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 8);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setInt(8, ((Number) parms[13]).intValue());
               stmt.setString(9, (String)parms[14], 20);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 16);
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
                  stmt.setString(2, (String)parms[2], 16);
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 26);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 13);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[19], 30);
               }
               stmt.setString(12, (String)parms[20], 3);
               stmt.setInt(13, ((Number) parms[21]).intValue());
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[23], 16);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[25], 16);
               }
               return;
            case 28 :
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
                  stmt.setString(3, (String)parms[5], 13);
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 30);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 16);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 16);
               }
               stmt.setString(12, (String)parms[22], 3);
               stmt.setInt(13, ((Number) parms[23]).intValue());
               stmt.setString(14, (String)parms[24], 20);
               stmt.setByte(15, ((Number) parms[25]).byteValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 16);
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}

