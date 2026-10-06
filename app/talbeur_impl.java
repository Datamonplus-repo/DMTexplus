package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talbeur_impl extends GXDataArea
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
         GX_FocusControl = edtXAlbRecCod_Internalname ;
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
      nRC_GXsfl_175 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_175"))) ;
      nGXsfl_175_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_175_idx"))) ;
      sGXsfl_175_idx = httpContext.GetPar( "sGXsfl_175_idx") ;
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

   public talbeur_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public talbeur_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talbeur_impl.class ));
   }

   public talbeur_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBEUR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBEUR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBEUR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBEUR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TALBEUR.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "XAlbRecCod", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3435XAlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXAlbRecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3435XAlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3435XAlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAlbRecCod_Jsonclick, 0, "", "", "", "", "", 1, edtXAlbRecCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBEUR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "XCliCod", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3436XCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3436XCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3436XCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtXCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "XAlbRef", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAlbRef_Internalname, GXutil.rtrim( A3437XAlbRef), GXutil.rtrim( localUtil.format( A3437XAlbRef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAlbRef_Jsonclick, 0, "", "", "", "", "", 1, edtXAlbRef_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "XTrnCod", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3438XTrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXTrnCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3438XTrnCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3438XTrnCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXTrnCod_Jsonclick, 0, "", "", "", "", "", 1, edtXTrnCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "XAlbREnt", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAlbREnt_Internalname, GXutil.rtrim( A3439XAlbREnt), GXutil.rtrim( localUtil.format( A3439XAlbREnt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAlbREnt_Jsonclick, 0, "", "", "", "", "", 1, edtXAlbREnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "XAlbRPieEnt", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAlbRPieEn_Internalname, GXutil.ltrim( localUtil.ntoc( A3440XAlbRPieEn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXAlbRPieEn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3440XAlbRPieEn), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3440XAlbRPieEn), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAlbRPieEn_Jsonclick, 0, "", "", "", "", "", 1, edtXAlbRPieEn_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "XAlbRUni", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAlbRUni_Internalname, GXutil.rtrim( A3441XAlbRUni), GXutil.rtrim( localUtil.format( A3441XAlbRUni, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAlbRUni_Jsonclick, 0, "", "", "", "", "", 1, edtXAlbRUni_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "XAlbRLoc", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAlbRLoc_Internalname, GXutil.rtrim( A3442XAlbRLoc), GXutil.rtrim( localUtil.format( A3442XAlbRLoc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAlbRLoc_Jsonclick, 0, "", "", "", "", "", 1, edtXAlbRLoc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "XAlbRFen", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtXAlbRFen_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAlbRFen_Internalname, localUtil.format(A3443XAlbRFen, "99/99/99"), localUtil.format( A3443XAlbRFen, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAlbRFen_Jsonclick, 0, "", "", "", "", "", 1, edtXAlbRFen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBEUR.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtXAlbRFen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtXAlbRFen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBEUR.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "XAlbRUniEnt", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAlbRUniEn_Internalname, GXutil.ltrim( localUtil.ntoc( A3444XAlbRUniEn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXAlbRUniEn_Enabled!=0) ? localUtil.format( A3444XAlbRUniEn, "ZZZZZ9.99") : localUtil.format( A3444XAlbRUniEn, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAlbRUniEn_Jsonclick, 0, "", "", "", "", "", 1, edtXAlbRUniEn_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "XAlbRReo", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAlbRReo_Internalname, GXutil.rtrim( A3445XAlbRReo), GXutil.rtrim( localUtil.format( A3445XAlbRReo, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAlbRReo_Jsonclick, 0, "", "", "", "", "", 1, edtXAlbRReo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "XAlbRPieUti", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAlbRPieUt_Internalname, GXutil.ltrim( localUtil.ntoc( A3446XAlbRPieUt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXAlbRPieUt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3446XAlbRPieUt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3446XAlbRPieUt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAlbRPieUt_Jsonclick, 0, "", "", "", "", "", 1, edtXAlbRPieUt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "XAlbRPieReb", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAlbRPieRe_Internalname, GXutil.ltrim( localUtil.ntoc( A3447XAlbRPieRe, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXAlbRPieRe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3447XAlbRPieRe), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3447XAlbRPieRe), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAlbRPieRe_Jsonclick, 0, "", "", "", "", "", 1, edtXAlbRPieRe_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "XAlbRUniUti", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAlbRUniUt_Internalname, GXutil.ltrim( localUtil.ntoc( A3448XAlbRUniUt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXAlbRUniUt_Enabled!=0) ? localUtil.format( A3448XAlbRUniUt, "ZZZZZ9.99") : localUtil.format( A3448XAlbRUniUt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAlbRUniUt_Jsonclick, 0, "", "", "", "", "", 1, edtXAlbRUniUt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "XAlbRUniReb", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAlbRUniRe_Internalname, GXutil.ltrim( localUtil.ntoc( A3449XAlbRUniRe, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXAlbRUniRe_Enabled!=0) ? localUtil.format( A3449XAlbRUniRe, "ZZZZZ9.99") : localUtil.format( A3449XAlbRUniRe, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAlbRUniRe_Jsonclick, 0, "", "", "", "", "", 1, edtXAlbRUniRe_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "XAlbRFecUlt", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtXAlbRFecUl_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAlbRFecUl_Internalname, localUtil.format(A3450XAlbRFecUl, "99/99/99"), localUtil.format( A3450XAlbRFecUl, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAlbRFecUl_Jsonclick, 0, "", "", "", "", "", 1, edtXAlbRFecUl_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBEUR.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtXAlbRFecUl_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtXAlbRFecUl_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBEUR.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "XAlbREst", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAlbREst_Internalname, GXutil.ltrim( localUtil.ntoc( A3451XAlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXAlbREst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3451XAlbREst), "9") : localUtil.format( DecimalUtil.doubleToDec(A3451XAlbREst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAlbREst_Jsonclick, 0, "", "", "", "", "", 1, edtXAlbREst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "XTipEntCod", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXTipEntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3452XTipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXTipEntCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3452XTipEntCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3452XTipEntCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXTipEntCod_Jsonclick, 0, "", "", "", "", "", 1, edtXTipEntCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "XAlbNumEti", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAlbNumEti_Internalname, GXutil.ltrim( localUtil.ntoc( A3453XAlbNumEti, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXAlbNumEti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3453XAlbNumEti), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3453XAlbNumEti), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAlbNumEti_Jsonclick, 0, "", "", "", "", "", 1, edtXAlbNumEti_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "XAlbRDes", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAlbRDes_Internalname, GXutil.rtrim( A3454XAlbRDes), GXutil.rtrim( localUtil.format( A3454XAlbRDes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAlbRDes_Jsonclick, 0, "", "", "", "", "", 1, edtXAlbRDes_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "XProceCod", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXProceCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3455XProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXProceCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3455XProceCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3455XProceCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXProceCod_Jsonclick, 0, "", "", "", "", "", 1, edtXProceCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "XAlbRULin", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAlbRULin_Internalname, GXutil.ltrim( localUtil.ntoc( A3456XAlbRULin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXAlbRULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3456XAlbRULin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3456XAlbRULin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAlbRULin_Jsonclick, 0, "", "", "", "", "", 1, edtXAlbRULin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "XHisEmpUL", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXHisEmpUL_Internalname, GXutil.ltrim( localUtil.ntoc( A3457XHisEmpUL, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXHisEmpUL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3457XHisEmpUL), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3457XHisEmpUL), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXHisEmpUL_Jsonclick, 0, "", "", "", "", "", 1, edtXHisEmpUL_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "XAlbRDisC", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAlbRDisC_Internalname, GXutil.rtrim( A3458XAlbRDisC), GXutil.rtrim( localUtil.format( A3458XAlbRDisC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAlbRDisC_Jsonclick, 0, "", "", "", "", "", 1, edtXAlbRDisC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "XAlbRImp", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAlbRImp_Internalname, GXutil.rtrim( A3459XAlbRImp), GXutil.rtrim( localUtil.format( A3459XAlbRImp, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAlbRImp_Jsonclick, 0, "", "", "", "", "", 1, edtXAlbRImp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "XRutina", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXRutina_Internalname, GXutil.rtrim( A3460XRutina), GXutil.rtrim( localUtil.format( A3460XRutina, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXRutina_Jsonclick, 0, "", "", "", "", "", 1, edtXRutina_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "XAlbRefDsc", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAlbRefDsc_Internalname, GXutil.rtrim( A3828XAlbRefDsc), GXutil.rtrim( localUtil.format( A3828XAlbRefDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAlbRefDsc_Jsonclick, 0, "", "", "", "", "", 1, edtXAlbRefDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Composicion Ref.Serie/AlbRec", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAlbRefCom_Internalname, GXutil.rtrim( A8050XAlbRefCom), GXutil.rtrim( localUtil.format( A8050XAlbRefCom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAlbRefCom_Jsonclick, 0, "", "", "", "", "", 1, edtXAlbRefCom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Prioridad 0,1,2", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXprioritat_Internalname, GXutil.ltrim( localUtil.ntoc( A11729Xprioritat, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXprioritat_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11729Xprioritat), "9") : localUtil.format( DecimalUtil.doubleToDec(A11729Xprioritat), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXprioritat_Jsonclick, 0, "", "", "", "", "", 1, edtXprioritat_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBEUR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol175( ) ;
      nGXsfl_175_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1576 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1576 = (short)(1) ;
            scanStart1FM1576( ) ;
            while ( RcdFound1576 != 0 )
            {
               init_level_properties1576( ) ;
               getByPrimaryKey1FM1576( ) ;
               addRow1FM1576( ) ;
               scanNext1FM1576( ) ;
            }
            scanEnd1FM1576( ) ;
            nBlankRcdCount1576 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1FM1576( ) ;
         standaloneModal1FM1576( ) ;
         sMode1576 = Gx_mode ;
         while ( nGXsfl_175_idx < nRC_GXsfl_175 )
         {
            bGXsfl_175_Refreshing = true ;
            readRow1FM1576( ) ;
            edtavnRcdDeleted_1576_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1576_"+sGXsfl_175_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1576_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1576_Enabled), 5, 0), !bGXsfl_175_Refreshing);
            edtXAlbRecPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XALBRECPIE_"+sGXsfl_175_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRecPie_Enabled), 5, 0), !bGXsfl_175_Refreshing);
            edtXAlbRecAnh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XALBRECANH_"+sGXsfl_175_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAlbRecAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRecAnh_Enabled), 5, 0), !bGXsfl_175_Refreshing);
            edtXAlbRecMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XALBRECMTR_"+sGXsfl_175_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAlbRecMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRecMtr_Enabled), 5, 0), !bGXsfl_175_Refreshing);
            edtXAlbRecKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XALBRECKGM_"+sGXsfl_175_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAlbRecKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRecKgm_Enabled), 5, 0), !bGXsfl_175_Refreshing);
            edtXAlbRecMtU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XALBRECMTU_"+sGXsfl_175_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAlbRecMtU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRecMtU_Enabled), 5, 0), !bGXsfl_175_Refreshing);
            edtXAlbRecKgU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XALBRECKGU_"+sGXsfl_175_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAlbRecKgU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRecKgU_Enabled), 5, 0), !bGXsfl_175_Refreshing);
            edtXAlbRecCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XALBRECCOL_"+sGXsfl_175_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAlbRecCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRecCol_Enabled), 5, 0), !bGXsfl_175_Refreshing);
            edtXAlbRecPza_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XALBRECPZA_"+sGXsfl_175_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAlbRecPza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRecPza_Enabled), 5, 0), !bGXsfl_175_Refreshing);
            edtXqualitat_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XQUALITAT_"+sGXsfl_175_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXqualitat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXqualitat_Enabled), 5, 0), !bGXsfl_175_Refreshing);
            edtXteler_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XTELER_"+sGXsfl_175_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXteler_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXteler_Enabled), 5, 0), !bGXsfl_175_Refreshing);
            if ( ( nRcdExists_1576 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1FM1576( ) ;
            }
            sendRow1FM1576( ) ;
            bGXsfl_175_Refreshing = false ;
         }
         Gx_mode = sMode1576 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1576 = (short)(5) ;
         nRcdExists_1576 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1FM1576( ) ;
            while ( RcdFound1576 != 0 )
            {
               sGXsfl_175_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_175_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1751576( ) ;
               init_level_properties1576( ) ;
               standaloneNotModal1FM1576( ) ;
               getByPrimaryKey1FM1576( ) ;
               standaloneModal1FM1576( ) ;
               addRow1FM1576( ) ;
               scanNext1FM1576( ) ;
            }
            scanEnd1FM1576( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1576 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_175_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_175_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_1751576( ) ;
      initAll1FM1576( ) ;
      init_level_properties1576( ) ;
      nRcdExists_1576 = (short)(0) ;
      nIsMod_1576 = (short)(0) ;
      nRcdDeleted_1576 = (short)(0) ;
      nBlankRcdCount1576 = (short)(nBlankRcdUsr1576+nBlankRcdCount1576) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1576 > 0 )
      {
         standaloneNotModal1FM1576( ) ;
         standaloneModal1FM1576( ) ;
         addRow1FM1576( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtXAlbRecPie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1576 = (short)(nBlankRcdCount1576-1) ;
      }
      Gx_mode = sMode1576 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBEUR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 190,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBEUR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBEUR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 192,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBEUR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 193,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TALBEUR.htm");
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
      e111FM2 ();
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
            Z3436XCliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z3436XCliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3437XAlbRef = httpContext.cgiGet( "Z3437XAlbRef") ;
            Z3438XTrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z3438XTrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3439XAlbREnt = httpContext.cgiGet( "Z3439XAlbREnt") ;
            Z3440XAlbRPieEn = (short)(localUtil.ctol( httpContext.cgiGet( "Z3440XAlbRPieEn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3441XAlbRUni = httpContext.cgiGet( "Z3441XAlbRUni") ;
            Z3442XAlbRLoc = httpContext.cgiGet( "Z3442XAlbRLoc") ;
            Z3443XAlbRFen = localUtil.ctod( httpContext.cgiGet( "Z3443XAlbRFen"), 0) ;
            Z3444XAlbRUniEn = localUtil.ctond( httpContext.cgiGet( "Z3444XAlbRUniEn")) ;
            Z3445XAlbRReo = httpContext.cgiGet( "Z3445XAlbRReo") ;
            Z3446XAlbRPieUt = (short)(localUtil.ctol( httpContext.cgiGet( "Z3446XAlbRPieUt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3447XAlbRPieRe = (short)(localUtil.ctol( httpContext.cgiGet( "Z3447XAlbRPieRe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3448XAlbRUniUt = localUtil.ctond( httpContext.cgiGet( "Z3448XAlbRUniUt")) ;
            Z3449XAlbRUniRe = localUtil.ctond( httpContext.cgiGet( "Z3449XAlbRUniRe")) ;
            Z3450XAlbRFecUl = localUtil.ctod( httpContext.cgiGet( "Z3450XAlbRFecUl"), 0) ;
            Z3451XAlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3451XAlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3452XTipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z3452XTipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3453XAlbNumEti = (short)(localUtil.ctol( httpContext.cgiGet( "Z3453XAlbNumEti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3454XAlbRDes = httpContext.cgiGet( "Z3454XAlbRDes") ;
            Z3455XProceCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z3455XProceCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3456XAlbRULin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3456XAlbRULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3457XHisEmpUL = (short)(localUtil.ctol( httpContext.cgiGet( "Z3457XHisEmpUL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3458XAlbRDisC = httpContext.cgiGet( "Z3458XAlbRDisC") ;
            Z3459XAlbRImp = httpContext.cgiGet( "Z3459XAlbRImp") ;
            Z3460XRutina = httpContext.cgiGet( "Z3460XRutina") ;
            Z3828XAlbRefDsc = httpContext.cgiGet( "Z3828XAlbRefDsc") ;
            Z8050XAlbRefCom = httpContext.cgiGet( "Z8050XAlbRefCom") ;
            Z11729Xprioritat = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11729Xprioritat"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_175 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_175"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XALBRECCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3435XAlbRecCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A3435XAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3435XAlbRecCod), 8, 0));
            }
            else
            {
               A3435XAlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtXAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3435XAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3435XAlbRecCod), 8, 0));
            }
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XCLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3436XCliCod = 0 ;
               n3436XCliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3436XCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3436XCliCod), 6, 0));
            }
            else
            {
               A3436XCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtXCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3436XCliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3436XCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3436XCliCod), 6, 0));
            }
            A3437XAlbRef = httpContext.cgiGet( edtXAlbRef_Internalname) ;
            n3437XAlbRef = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3437XAlbRef", A3437XAlbRef);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XTRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3438XTrnCod = (short)(0) ;
               n3438XTrnCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3438XTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3438XTrnCod), 4, 0));
            }
            else
            {
               A3438XTrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtXTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3438XTrnCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3438XTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3438XTrnCod), 4, 0));
            }
            A3439XAlbREnt = httpContext.cgiGet( edtXAlbREnt_Internalname) ;
            n3439XAlbREnt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3439XAlbREnt", A3439XAlbREnt);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXAlbRPieEn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXAlbRPieEn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XALBRPIEEN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXAlbRPieEn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3440XAlbRPieEn = (short)(0) ;
               n3440XAlbRPieEn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3440XAlbRPieEn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3440XAlbRPieEn), 4, 0));
            }
            else
            {
               A3440XAlbRPieEn = (short)(localUtil.ctol( httpContext.cgiGet( edtXAlbRPieEn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3440XAlbRPieEn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3440XAlbRPieEn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3440XAlbRPieEn), 4, 0));
            }
            A3441XAlbRUni = GXutil.upper( httpContext.cgiGet( edtXAlbRUni_Internalname)) ;
            n3441XAlbRUni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3441XAlbRUni", A3441XAlbRUni);
            A3442XAlbRLoc = httpContext.cgiGet( edtXAlbRLoc_Internalname) ;
            n3442XAlbRLoc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3442XAlbRLoc", A3442XAlbRLoc);
            if ( localUtil.vcdate( httpContext.cgiGet( edtXAlbRFen_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "XALBRFEN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXAlbRFen_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3443XAlbRFen = GXutil.nullDate() ;
               n3443XAlbRFen = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3443XAlbRFen", localUtil.format(A3443XAlbRFen, "99/99/99"));
            }
            else
            {
               A3443XAlbRFen = localUtil.ctod( httpContext.cgiGet( edtXAlbRFen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n3443XAlbRFen = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3443XAlbRFen", localUtil.format(A3443XAlbRFen, "99/99/99"));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXAlbRUniEn_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXAlbRUniEn_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XALBRUNIEN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXAlbRUniEn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3444XAlbRUniEn = DecimalUtil.ZERO ;
               n3444XAlbRUniEn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3444XAlbRUniEn", GXutil.ltrimstr( A3444XAlbRUniEn, 9, 2));
            }
            else
            {
               A3444XAlbRUniEn = localUtil.ctond( httpContext.cgiGet( edtXAlbRUniEn_Internalname)) ;
               n3444XAlbRUniEn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3444XAlbRUniEn", GXutil.ltrimstr( A3444XAlbRUniEn, 9, 2));
            }
            A3445XAlbRReo = GXutil.upper( httpContext.cgiGet( edtXAlbRReo_Internalname)) ;
            n3445XAlbRReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3445XAlbRReo", A3445XAlbRReo);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXAlbRPieUt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXAlbRPieUt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XALBRPIEUT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXAlbRPieUt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3446XAlbRPieUt = (short)(0) ;
               n3446XAlbRPieUt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3446XAlbRPieUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3446XAlbRPieUt), 4, 0));
            }
            else
            {
               A3446XAlbRPieUt = (short)(localUtil.ctol( httpContext.cgiGet( edtXAlbRPieUt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3446XAlbRPieUt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3446XAlbRPieUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3446XAlbRPieUt), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXAlbRPieRe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXAlbRPieRe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XALBRPIERE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXAlbRPieRe_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3447XAlbRPieRe = (short)(0) ;
               n3447XAlbRPieRe = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3447XAlbRPieRe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3447XAlbRPieRe), 4, 0));
            }
            else
            {
               A3447XAlbRPieRe = (short)(localUtil.ctol( httpContext.cgiGet( edtXAlbRPieRe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3447XAlbRPieRe = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3447XAlbRPieRe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3447XAlbRPieRe), 4, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXAlbRUniUt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXAlbRUniUt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XALBRUNIUT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXAlbRUniUt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3448XAlbRUniUt = DecimalUtil.ZERO ;
               n3448XAlbRUniUt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3448XAlbRUniUt", GXutil.ltrimstr( A3448XAlbRUniUt, 9, 2));
            }
            else
            {
               A3448XAlbRUniUt = localUtil.ctond( httpContext.cgiGet( edtXAlbRUniUt_Internalname)) ;
               n3448XAlbRUniUt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3448XAlbRUniUt", GXutil.ltrimstr( A3448XAlbRUniUt, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXAlbRUniRe_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXAlbRUniRe_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XALBRUNIRE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXAlbRUniRe_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3449XAlbRUniRe = DecimalUtil.ZERO ;
               n3449XAlbRUniRe = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3449XAlbRUniRe", GXutil.ltrimstr( A3449XAlbRUniRe, 9, 2));
            }
            else
            {
               A3449XAlbRUniRe = localUtil.ctond( httpContext.cgiGet( edtXAlbRUniRe_Internalname)) ;
               n3449XAlbRUniRe = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3449XAlbRUniRe", GXutil.ltrimstr( A3449XAlbRUniRe, 9, 2));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtXAlbRFecUl_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "XALBRFECUL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXAlbRFecUl_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3450XAlbRFecUl = GXutil.nullDate() ;
               n3450XAlbRFecUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3450XAlbRFecUl", localUtil.format(A3450XAlbRFecUl, "99/99/99"));
            }
            else
            {
               A3450XAlbRFecUl = localUtil.ctod( httpContext.cgiGet( edtXAlbRFecUl_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n3450XAlbRFecUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3450XAlbRFecUl", localUtil.format(A3450XAlbRFecUl, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXAlbREst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXAlbREst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XALBREST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXAlbREst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3451XAlbREst = (byte)(0) ;
               n3451XAlbREst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3451XAlbREst", GXutil.str( A3451XAlbREst, 1, 0));
            }
            else
            {
               A3451XAlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( edtXAlbREst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3451XAlbREst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3451XAlbREst", GXutil.str( A3451XAlbREst, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXTipEntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXTipEntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XTIPENTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXTipEntCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3452XTipEntCod = (short)(0) ;
               n3452XTipEntCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3452XTipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3452XTipEntCod), 4, 0));
            }
            else
            {
               A3452XTipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( edtXTipEntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3452XTipEntCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3452XTipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3452XTipEntCod), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXAlbNumEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXAlbNumEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XALBNUMETI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXAlbNumEti_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3453XAlbNumEti = (short)(0) ;
               n3453XAlbNumEti = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3453XAlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3453XAlbNumEti), 4, 0));
            }
            else
            {
               A3453XAlbNumEti = (short)(localUtil.ctol( httpContext.cgiGet( edtXAlbNumEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3453XAlbNumEti = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3453XAlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3453XAlbNumEti), 4, 0));
            }
            A3454XAlbRDes = httpContext.cgiGet( edtXAlbRDes_Internalname) ;
            n3454XAlbRDes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3454XAlbRDes", A3454XAlbRDes);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XPROCECOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXProceCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3455XProceCod = (short)(0) ;
               n3455XProceCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3455XProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3455XProceCod), 4, 0));
            }
            else
            {
               A3455XProceCod = (short)(localUtil.ctol( httpContext.cgiGet( edtXProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3455XProceCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3455XProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3455XProceCod), 4, 0));
            }
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXHisEmpUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXHisEmpUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XHISEMPUL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXHisEmpUL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3457XHisEmpUL = (short)(0) ;
               n3457XHisEmpUL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3457XHisEmpUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3457XHisEmpUL), 3, 0));
            }
            else
            {
               A3457XHisEmpUL = (short)(localUtil.ctol( httpContext.cgiGet( edtXHisEmpUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3457XHisEmpUL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3457XHisEmpUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3457XHisEmpUL), 3, 0));
            }
            A3458XAlbRDisC = httpContext.cgiGet( edtXAlbRDisC_Internalname) ;
            n3458XAlbRDisC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3458XAlbRDisC", A3458XAlbRDisC);
            A3459XAlbRImp = GXutil.upper( httpContext.cgiGet( edtXAlbRImp_Internalname)) ;
            n3459XAlbRImp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3459XAlbRImp", A3459XAlbRImp);
            A3460XRutina = httpContext.cgiGet( edtXRutina_Internalname) ;
            n3460XRutina = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3460XRutina", A3460XRutina);
            A3828XAlbRefDsc = httpContext.cgiGet( edtXAlbRefDsc_Internalname) ;
            n3828XAlbRefDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3828XAlbRefDsc", A3828XAlbRefDsc);
            A8050XAlbRefCom = httpContext.cgiGet( edtXAlbRefCom_Internalname) ;
            n8050XAlbRefCom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8050XAlbRefCom", A8050XAlbRefCom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXprioritat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXprioritat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XPRIORITAT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXprioritat_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11729Xprioritat = (byte)(0) ;
               n11729Xprioritat = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11729Xprioritat", GXutil.str( A11729Xprioritat, 1, 0));
            }
            else
            {
               A11729Xprioritat = (byte)(localUtil.ctol( httpContext.cgiGet( edtXprioritat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11729Xprioritat = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11729Xprioritat", GXutil.str( A11729Xprioritat, 1, 0));
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
                        e111FM2 ();
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
            initAll1FM493( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1576_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1576_Enabled), 5, 0), !bGXsfl_175_Refreshing);
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
      disableAttributes1FM493( ) ;
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

   public void confirm_1FM0( )
   {
      beforeValidate1FM493( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1FM493( ) ;
         }
         else
         {
            checkExtendedTable1FM493( ) ;
            if ( AnyError == 0 )
            {
               zm1FM493( 7) ;
            }
            closeExtendedTableCursors1FM493( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode493 = Gx_mode ;
         confirm_1FM1576( ) ;
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
         confirmValues1FM0( ) ;
      }
   }

   public void confirm_1FM1576( )
   {
      nGXsfl_175_idx = 0 ;
      while ( nGXsfl_175_idx < nRC_GXsfl_175 )
      {
         readRow1FM1576( ) ;
         if ( ( nRcdExists_1576 != 0 ) || ( nIsMod_1576 != 0 ) )
         {
            getKey1FM1576( ) ;
            if ( ( nRcdExists_1576 == 0 ) && ( nRcdDeleted_1576 == 0 ) )
            {
               if ( RcdFound1576 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1FM1576( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1FM1576( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1FM1576( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "XALBRECPIE_" + sGXsfl_175_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtXAlbRecPie_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1576 != 0 )
               {
                  if ( nRcdDeleted_1576 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1FM1576( ) ;
                     load1FM1576( ) ;
                     beforeValidate1FM1576( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1FM1576( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1576 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1FM1576( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1FM1576( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1FM1576( ) ;
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
                  if ( nRcdDeleted_1576 == 0 )
                  {
                     GXCCtl = "XALBRECPIE_" + sGXsfl_175_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtXAlbRecPie_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1576_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1576, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAlbRecPie_Internalname, GXutil.rtrim( A3461XAlbRecPie)) ;
         httpContext.changePostValue( edtXAlbRecAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A3462XAlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAlbRecMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A3463XAlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAlbRecKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A3464XAlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAlbRecMtU_Internalname, GXutil.ltrim( localUtil.ntoc( A3465XAlbRecMtU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAlbRecKgU_Internalname, GXutil.ltrim( localUtil.ntoc( A3466XAlbRecKgU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAlbRecCol_Internalname, GXutil.ltrim( localUtil.ntoc( A3728XAlbRecCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAlbRecPza_Internalname, GXutil.rtrim( A3729XAlbRecPza)) ;
         httpContext.changePostValue( edtXqualitat_Internalname, GXutil.rtrim( A11730Xqualitat)) ;
         httpContext.changePostValue( edtXteler_Internalname, GXutil.rtrim( A11731Xteler)) ;
         httpContext.changePostValue( "ZT_"+"Z3461XAlbRecPie_"+sGXsfl_175_idx, GXutil.rtrim( Z3461XAlbRecPie)) ;
         httpContext.changePostValue( "ZT_"+"Z3462XAlbRecAnh_"+sGXsfl_175_idx, GXutil.ltrim( localUtil.ntoc( Z3462XAlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3463XAlbRecMtr_"+sGXsfl_175_idx, GXutil.ltrim( localUtil.ntoc( Z3463XAlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3464XAlbRecKgm_"+sGXsfl_175_idx, GXutil.ltrim( localUtil.ntoc( Z3464XAlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3465XAlbRecMtU_"+sGXsfl_175_idx, GXutil.ltrim( localUtil.ntoc( Z3465XAlbRecMtU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3466XAlbRecKgU_"+sGXsfl_175_idx, GXutil.ltrim( localUtil.ntoc( Z3466XAlbRecKgU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3728XAlbRecCol_"+sGXsfl_175_idx, GXutil.ltrim( localUtil.ntoc( Z3728XAlbRecCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3729XAlbRecPza_"+sGXsfl_175_idx, GXutil.rtrim( Z3729XAlbRecPza)) ;
         httpContext.changePostValue( "ZT_"+"Z11730Xqualitat_"+sGXsfl_175_idx, GXutil.rtrim( Z11730Xqualitat)) ;
         httpContext.changePostValue( "ZT_"+"Z11731Xteler_"+sGXsfl_175_idx, GXutil.rtrim( Z11731Xteler)) ;
         httpContext.changePostValue( "nRcdDeleted_1576_"+sGXsfl_175_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1576, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1576_"+sGXsfl_175_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1576, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1576_"+sGXsfl_175_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1576, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1576 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1576_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1576_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XALBRECPIE_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XALBRECANH_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecAnh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XALBRECMTR_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XALBRECKGM_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XALBRECMTU_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecMtU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XALBRECKGU_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecKgU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XALBRECCOL_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XALBRECPZA_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecPza_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XQUALITAT_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXqualitat_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XTELER_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXteler_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1FM0( )
   {
   }

   public void e111FM2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV38Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Station", AV38Station);
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV16EmprNom ;
      GXv_char3[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV38Station, GXv_char1, GXv_char2, GXv_char3) ;
      talbeur_impl.this.A396EmprCod = GXv_char1[0] ;
      talbeur_impl.this.AV16EmprNom = GXv_char2[0] ;
      talbeur_impl.this.AV17UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char4 = AV19Lit0 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV19Lit0 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit0", AV19Lit0);
      GXt_char4 = AV39LitFe ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV39LitFe = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39LitFe", AV39LitFe);
      GXt_char4 = AV20Lit1 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1576_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV20Lit1 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit1", AV20Lit1);
      GXt_char4 = AV21Lit2 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1266_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV21Lit2 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit2", AV21Lit2);
      GXt_char4 = AV22Lit3 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV22Lit3 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit3", AV22Lit3);
      GXt_char4 = AV23Lit4 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN235_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV23Lit4 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit4", AV23Lit4);
      GXt_char4 = AV24Lit5 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1577_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV24Lit5 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit5", AV24Lit5);
      GXt_char4 = AV25Lit6 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN435_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV25Lit6 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit6", AV25Lit6);
      GXt_char4 = AV26Lit7 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1578_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV26Lit7 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lit7", AV26Lit7);
      GXt_char4 = AV27Lit8 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV27Lit8 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Lit8", AV27Lit8);
      GXt_char4 = AV28Lit9 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN325_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV28Lit9 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit9", AV28Lit9);
      GXt_char4 = AV29Lit10 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1579_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV29Lit10 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Lit10", AV29Lit10);
      GXt_char4 = AV30Lit11 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1431_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV30Lit11 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Lit11", AV30Lit11);
      GXt_char4 = AV31Lit12 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1580_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV31Lit12 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Lit12", AV31Lit12);
      GXt_char4 = AV32Lit13 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1217_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV32Lit13 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Lit13", AV32Lit13);
      GXt_char4 = AV33Lit14 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN531_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV33Lit14 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Lit14", AV33Lit14);
      GXt_char4 = AV34Lit15 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1581_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV34Lit15 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Lit15", AV34Lit15);
      GXt_char4 = AV35Lit16 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1582_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV35Lit16 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Lit16", AV35Lit16);
      GXt_char4 = AV36Lit17 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1583_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV36Lit17 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Lit17", AV36Lit17);
      GXt_char4 = AV37Lit18 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1584_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV37Lit18 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Lit18", AV37Lit18);
      GXt_char4 = AV40lit19 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT145_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV40lit19 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40lit19", AV40lit19);
      GXt_char4 = AV41lit20 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT146_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV41lit20 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41lit20", AV41lit20);
      GXt_char4 = AV42lit21 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1588_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV42lit21 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42lit21", AV42lit21);
      GXt_char4 = AV44lit23 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT156_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV44lit23 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44lit23", AV44lit23);
      GXt_char4 = AV45Lit24 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1325_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV45Lit24 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Lit24", AV45Lit24);
      GXt_char4 = AV48Lit25 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT546_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV48Lit25 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Lit25", AV48Lit25);
      GXt_char4 = AV49Lit26 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1156_", ""), (byte)(99), GXv_char3) ;
      talbeur_impl.this.GXt_char4 = GXv_char3[0] ;
      AV49Lit26 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Lit26", AV49Lit26);
   }

   public void zm1FM493( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3436XCliCod = T01FM5_A3436XCliCod[0] ;
            Z3437XAlbRef = T01FM5_A3437XAlbRef[0] ;
            Z3438XTrnCod = T01FM5_A3438XTrnCod[0] ;
            Z3439XAlbREnt = T01FM5_A3439XAlbREnt[0] ;
            Z3440XAlbRPieEn = T01FM5_A3440XAlbRPieEn[0] ;
            Z3441XAlbRUni = T01FM5_A3441XAlbRUni[0] ;
            Z3442XAlbRLoc = T01FM5_A3442XAlbRLoc[0] ;
            Z3443XAlbRFen = T01FM5_A3443XAlbRFen[0] ;
            Z3444XAlbRUniEn = T01FM5_A3444XAlbRUniEn[0] ;
            Z3445XAlbRReo = T01FM5_A3445XAlbRReo[0] ;
            Z3446XAlbRPieUt = T01FM5_A3446XAlbRPieUt[0] ;
            Z3447XAlbRPieRe = T01FM5_A3447XAlbRPieRe[0] ;
            Z3448XAlbRUniUt = T01FM5_A3448XAlbRUniUt[0] ;
            Z3449XAlbRUniRe = T01FM5_A3449XAlbRUniRe[0] ;
            Z3450XAlbRFecUl = T01FM5_A3450XAlbRFecUl[0] ;
            Z3451XAlbREst = T01FM5_A3451XAlbREst[0] ;
            Z3452XTipEntCod = T01FM5_A3452XTipEntCod[0] ;
            Z3453XAlbNumEti = T01FM5_A3453XAlbNumEti[0] ;
            Z3454XAlbRDes = T01FM5_A3454XAlbRDes[0] ;
            Z3455XProceCod = T01FM5_A3455XProceCod[0] ;
            Z3456XAlbRULin = T01FM5_A3456XAlbRULin[0] ;
            Z3457XHisEmpUL = T01FM5_A3457XHisEmpUL[0] ;
            Z3458XAlbRDisC = T01FM5_A3458XAlbRDisC[0] ;
            Z3459XAlbRImp = T01FM5_A3459XAlbRImp[0] ;
            Z3460XRutina = T01FM5_A3460XRutina[0] ;
            Z3828XAlbRefDsc = T01FM5_A3828XAlbRefDsc[0] ;
            Z8050XAlbRefCom = T01FM5_A8050XAlbRefCom[0] ;
            Z11729Xprioritat = T01FM5_A11729Xprioritat[0] ;
         }
         else
         {
            Z3436XCliCod = A3436XCliCod ;
            Z3437XAlbRef = A3437XAlbRef ;
            Z3438XTrnCod = A3438XTrnCod ;
            Z3439XAlbREnt = A3439XAlbREnt ;
            Z3440XAlbRPieEn = A3440XAlbRPieEn ;
            Z3441XAlbRUni = A3441XAlbRUni ;
            Z3442XAlbRLoc = A3442XAlbRLoc ;
            Z3443XAlbRFen = A3443XAlbRFen ;
            Z3444XAlbRUniEn = A3444XAlbRUniEn ;
            Z3445XAlbRReo = A3445XAlbRReo ;
            Z3446XAlbRPieUt = A3446XAlbRPieUt ;
            Z3447XAlbRPieRe = A3447XAlbRPieRe ;
            Z3448XAlbRUniUt = A3448XAlbRUniUt ;
            Z3449XAlbRUniRe = A3449XAlbRUniRe ;
            Z3450XAlbRFecUl = A3450XAlbRFecUl ;
            Z3451XAlbREst = A3451XAlbREst ;
            Z3452XTipEntCod = A3452XTipEntCod ;
            Z3453XAlbNumEti = A3453XAlbNumEti ;
            Z3454XAlbRDes = A3454XAlbRDes ;
            Z3455XProceCod = A3455XProceCod ;
            Z3456XAlbRULin = A3456XAlbRULin ;
            Z3457XHisEmpUL = A3457XHisEmpUL ;
            Z3458XAlbRDisC = A3458XAlbRDisC ;
            Z3459XAlbRImp = A3459XAlbRImp ;
            Z3460XRutina = A3460XRutina ;
            Z3828XAlbRefDsc = A3828XAlbRefDsc ;
            Z8050XAlbRefCom = A8050XAlbRefCom ;
            Z11729Xprioritat = A11729Xprioritat ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z3435XAlbRecCod = A3435XAlbRecCod ;
         Z3436XCliCod = A3436XCliCod ;
         Z3437XAlbRef = A3437XAlbRef ;
         Z3438XTrnCod = A3438XTrnCod ;
         Z3439XAlbREnt = A3439XAlbREnt ;
         Z3440XAlbRPieEn = A3440XAlbRPieEn ;
         Z3441XAlbRUni = A3441XAlbRUni ;
         Z3442XAlbRLoc = A3442XAlbRLoc ;
         Z3443XAlbRFen = A3443XAlbRFen ;
         Z3444XAlbRUniEn = A3444XAlbRUniEn ;
         Z3445XAlbRReo = A3445XAlbRReo ;
         Z3446XAlbRPieUt = A3446XAlbRPieUt ;
         Z3447XAlbRPieRe = A3447XAlbRPieRe ;
         Z3448XAlbRUniUt = A3448XAlbRUniUt ;
         Z3449XAlbRUniRe = A3449XAlbRUniRe ;
         Z3450XAlbRFecUl = A3450XAlbRFecUl ;
         Z3451XAlbREst = A3451XAlbREst ;
         Z3452XTipEntCod = A3452XTipEntCod ;
         Z3453XAlbNumEti = A3453XAlbNumEti ;
         Z3454XAlbRDes = A3454XAlbRDes ;
         Z3455XProceCod = A3455XProceCod ;
         Z3456XAlbRULin = A3456XAlbRULin ;
         Z3457XHisEmpUL = A3457XHisEmpUL ;
         Z3458XAlbRDisC = A3458XAlbRDisC ;
         Z3459XAlbRImp = A3459XAlbRImp ;
         Z3460XRutina = A3460XRutina ;
         Z3828XAlbRefDsc = A3828XAlbRefDsc ;
         Z8050XAlbRefCom = A8050XAlbRefCom ;
         Z11729Xprioritat = A11729Xprioritat ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T01FM6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FM6_A407EmprNom[0] ;
      n407EmprNom = T01FM6_n407EmprNom[0] ;
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

   public void load1FM493( )
   {
      /* Using cursor T01FM7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound493 = (short)(1) ;
         A407EmprNom = T01FM7_A407EmprNom[0] ;
         n407EmprNom = T01FM7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A3436XCliCod = T01FM7_A3436XCliCod[0] ;
         n3436XCliCod = T01FM7_n3436XCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3436XCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3436XCliCod), 6, 0));
         A3437XAlbRef = T01FM7_A3437XAlbRef[0] ;
         n3437XAlbRef = T01FM7_n3437XAlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3437XAlbRef", A3437XAlbRef);
         A3438XTrnCod = T01FM7_A3438XTrnCod[0] ;
         n3438XTrnCod = T01FM7_n3438XTrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3438XTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3438XTrnCod), 4, 0));
         A3439XAlbREnt = T01FM7_A3439XAlbREnt[0] ;
         n3439XAlbREnt = T01FM7_n3439XAlbREnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3439XAlbREnt", A3439XAlbREnt);
         A3440XAlbRPieEn = T01FM7_A3440XAlbRPieEn[0] ;
         n3440XAlbRPieEn = T01FM7_n3440XAlbRPieEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3440XAlbRPieEn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3440XAlbRPieEn), 4, 0));
         A3441XAlbRUni = T01FM7_A3441XAlbRUni[0] ;
         n3441XAlbRUni = T01FM7_n3441XAlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3441XAlbRUni", A3441XAlbRUni);
         A3442XAlbRLoc = T01FM7_A3442XAlbRLoc[0] ;
         n3442XAlbRLoc = T01FM7_n3442XAlbRLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3442XAlbRLoc", A3442XAlbRLoc);
         A3443XAlbRFen = T01FM7_A3443XAlbRFen[0] ;
         n3443XAlbRFen = T01FM7_n3443XAlbRFen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3443XAlbRFen", localUtil.format(A3443XAlbRFen, "99/99/99"));
         A3444XAlbRUniEn = T01FM7_A3444XAlbRUniEn[0] ;
         n3444XAlbRUniEn = T01FM7_n3444XAlbRUniEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3444XAlbRUniEn", GXutil.ltrimstr( A3444XAlbRUniEn, 9, 2));
         A3445XAlbRReo = T01FM7_A3445XAlbRReo[0] ;
         n3445XAlbRReo = T01FM7_n3445XAlbRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3445XAlbRReo", A3445XAlbRReo);
         A3446XAlbRPieUt = T01FM7_A3446XAlbRPieUt[0] ;
         n3446XAlbRPieUt = T01FM7_n3446XAlbRPieUt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3446XAlbRPieUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3446XAlbRPieUt), 4, 0));
         A3447XAlbRPieRe = T01FM7_A3447XAlbRPieRe[0] ;
         n3447XAlbRPieRe = T01FM7_n3447XAlbRPieRe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3447XAlbRPieRe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3447XAlbRPieRe), 4, 0));
         A3448XAlbRUniUt = T01FM7_A3448XAlbRUniUt[0] ;
         n3448XAlbRUniUt = T01FM7_n3448XAlbRUniUt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3448XAlbRUniUt", GXutil.ltrimstr( A3448XAlbRUniUt, 9, 2));
         A3449XAlbRUniRe = T01FM7_A3449XAlbRUniRe[0] ;
         n3449XAlbRUniRe = T01FM7_n3449XAlbRUniRe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3449XAlbRUniRe", GXutil.ltrimstr( A3449XAlbRUniRe, 9, 2));
         A3450XAlbRFecUl = T01FM7_A3450XAlbRFecUl[0] ;
         n3450XAlbRFecUl = T01FM7_n3450XAlbRFecUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3450XAlbRFecUl", localUtil.format(A3450XAlbRFecUl, "99/99/99"));
         A3451XAlbREst = T01FM7_A3451XAlbREst[0] ;
         n3451XAlbREst = T01FM7_n3451XAlbREst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3451XAlbREst", GXutil.str( A3451XAlbREst, 1, 0));
         A3452XTipEntCod = T01FM7_A3452XTipEntCod[0] ;
         n3452XTipEntCod = T01FM7_n3452XTipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3452XTipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3452XTipEntCod), 4, 0));
         A3453XAlbNumEti = T01FM7_A3453XAlbNumEti[0] ;
         n3453XAlbNumEti = T01FM7_n3453XAlbNumEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3453XAlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3453XAlbNumEti), 4, 0));
         A3454XAlbRDes = T01FM7_A3454XAlbRDes[0] ;
         n3454XAlbRDes = T01FM7_n3454XAlbRDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3454XAlbRDes", A3454XAlbRDes);
         A3455XProceCod = T01FM7_A3455XProceCod[0] ;
         n3455XProceCod = T01FM7_n3455XProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3455XProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3455XProceCod), 4, 0));
         A3456XAlbRULin = T01FM7_A3456XAlbRULin[0] ;
         n3456XAlbRULin = T01FM7_n3456XAlbRULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3456XAlbRULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3456XAlbRULin), 2, 0));
         A3457XHisEmpUL = T01FM7_A3457XHisEmpUL[0] ;
         n3457XHisEmpUL = T01FM7_n3457XHisEmpUL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3457XHisEmpUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3457XHisEmpUL), 3, 0));
         A3458XAlbRDisC = T01FM7_A3458XAlbRDisC[0] ;
         n3458XAlbRDisC = T01FM7_n3458XAlbRDisC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3458XAlbRDisC", A3458XAlbRDisC);
         A3459XAlbRImp = T01FM7_A3459XAlbRImp[0] ;
         n3459XAlbRImp = T01FM7_n3459XAlbRImp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3459XAlbRImp", A3459XAlbRImp);
         A3460XRutina = T01FM7_A3460XRutina[0] ;
         n3460XRutina = T01FM7_n3460XRutina[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3460XRutina", A3460XRutina);
         A3828XAlbRefDsc = T01FM7_A3828XAlbRefDsc[0] ;
         n3828XAlbRefDsc = T01FM7_n3828XAlbRefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3828XAlbRefDsc", A3828XAlbRefDsc);
         A8050XAlbRefCom = T01FM7_A8050XAlbRefCom[0] ;
         n8050XAlbRefCom = T01FM7_n8050XAlbRefCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8050XAlbRefCom", A8050XAlbRefCom);
         A11729Xprioritat = T01FM7_A11729Xprioritat[0] ;
         n11729Xprioritat = T01FM7_n11729Xprioritat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11729Xprioritat", GXutil.str( A11729Xprioritat, 1, 0));
         zm1FM493( -6) ;
      }
      pr_default.close(5);
      onLoadActions1FM493( ) ;
   }

   public void onLoadActions1FM493( )
   {
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
   }

   public void checkExtendedTable1FM493( )
   {
      nIsDirty_493 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
      if ( ! ( ( GXutil.strcmp(A3441XAlbRUni, "K") == 0 ) || ( GXutil.strcmp(A3441XAlbRUni, "M") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "XAlbRUni", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "XALBRUNI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAlbRUni_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A3445XAlbRReo, "SI") == 0 ) || ( GXutil.strcmp(A3445XAlbRReo, "NO") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "XAlbRReo", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "XALBRREO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAlbRReo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( A3451XAlbREst == 0 ) || ( A3451XAlbREst == 1 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "XAlbREst", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "XALBREST");
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAlbREst_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A3459XAlbRImp, "S") == 0 ) || ( GXutil.strcmp(A3459XAlbRImp, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "XAlbRImp", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "XALBRIMP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAlbRImp_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1FM493( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1FM493( )
   {
      /* Using cursor T01FM8 */
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
      /* Using cursor T01FM5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01FM5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1FM493( 6) ;
         RcdFound493 = (short)(1) ;
         A3435XAlbRecCod = T01FM5_A3435XAlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3435XAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3435XAlbRecCod), 8, 0));
         A3436XCliCod = T01FM5_A3436XCliCod[0] ;
         n3436XCliCod = T01FM5_n3436XCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3436XCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3436XCliCod), 6, 0));
         A3437XAlbRef = T01FM5_A3437XAlbRef[0] ;
         n3437XAlbRef = T01FM5_n3437XAlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3437XAlbRef", A3437XAlbRef);
         A3438XTrnCod = T01FM5_A3438XTrnCod[0] ;
         n3438XTrnCod = T01FM5_n3438XTrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3438XTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3438XTrnCod), 4, 0));
         A3439XAlbREnt = T01FM5_A3439XAlbREnt[0] ;
         n3439XAlbREnt = T01FM5_n3439XAlbREnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3439XAlbREnt", A3439XAlbREnt);
         A3440XAlbRPieEn = T01FM5_A3440XAlbRPieEn[0] ;
         n3440XAlbRPieEn = T01FM5_n3440XAlbRPieEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3440XAlbRPieEn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3440XAlbRPieEn), 4, 0));
         A3441XAlbRUni = T01FM5_A3441XAlbRUni[0] ;
         n3441XAlbRUni = T01FM5_n3441XAlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3441XAlbRUni", A3441XAlbRUni);
         A3442XAlbRLoc = T01FM5_A3442XAlbRLoc[0] ;
         n3442XAlbRLoc = T01FM5_n3442XAlbRLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3442XAlbRLoc", A3442XAlbRLoc);
         A3443XAlbRFen = T01FM5_A3443XAlbRFen[0] ;
         n3443XAlbRFen = T01FM5_n3443XAlbRFen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3443XAlbRFen", localUtil.format(A3443XAlbRFen, "99/99/99"));
         A3444XAlbRUniEn = T01FM5_A3444XAlbRUniEn[0] ;
         n3444XAlbRUniEn = T01FM5_n3444XAlbRUniEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3444XAlbRUniEn", GXutil.ltrimstr( A3444XAlbRUniEn, 9, 2));
         A3445XAlbRReo = T01FM5_A3445XAlbRReo[0] ;
         n3445XAlbRReo = T01FM5_n3445XAlbRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3445XAlbRReo", A3445XAlbRReo);
         A3446XAlbRPieUt = T01FM5_A3446XAlbRPieUt[0] ;
         n3446XAlbRPieUt = T01FM5_n3446XAlbRPieUt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3446XAlbRPieUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3446XAlbRPieUt), 4, 0));
         A3447XAlbRPieRe = T01FM5_A3447XAlbRPieRe[0] ;
         n3447XAlbRPieRe = T01FM5_n3447XAlbRPieRe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3447XAlbRPieRe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3447XAlbRPieRe), 4, 0));
         A3448XAlbRUniUt = T01FM5_A3448XAlbRUniUt[0] ;
         n3448XAlbRUniUt = T01FM5_n3448XAlbRUniUt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3448XAlbRUniUt", GXutil.ltrimstr( A3448XAlbRUniUt, 9, 2));
         A3449XAlbRUniRe = T01FM5_A3449XAlbRUniRe[0] ;
         n3449XAlbRUniRe = T01FM5_n3449XAlbRUniRe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3449XAlbRUniRe", GXutil.ltrimstr( A3449XAlbRUniRe, 9, 2));
         A3450XAlbRFecUl = T01FM5_A3450XAlbRFecUl[0] ;
         n3450XAlbRFecUl = T01FM5_n3450XAlbRFecUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3450XAlbRFecUl", localUtil.format(A3450XAlbRFecUl, "99/99/99"));
         A3451XAlbREst = T01FM5_A3451XAlbREst[0] ;
         n3451XAlbREst = T01FM5_n3451XAlbREst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3451XAlbREst", GXutil.str( A3451XAlbREst, 1, 0));
         A3452XTipEntCod = T01FM5_A3452XTipEntCod[0] ;
         n3452XTipEntCod = T01FM5_n3452XTipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3452XTipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3452XTipEntCod), 4, 0));
         A3453XAlbNumEti = T01FM5_A3453XAlbNumEti[0] ;
         n3453XAlbNumEti = T01FM5_n3453XAlbNumEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3453XAlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3453XAlbNumEti), 4, 0));
         A3454XAlbRDes = T01FM5_A3454XAlbRDes[0] ;
         n3454XAlbRDes = T01FM5_n3454XAlbRDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3454XAlbRDes", A3454XAlbRDes);
         A3455XProceCod = T01FM5_A3455XProceCod[0] ;
         n3455XProceCod = T01FM5_n3455XProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3455XProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3455XProceCod), 4, 0));
         A3456XAlbRULin = T01FM5_A3456XAlbRULin[0] ;
         n3456XAlbRULin = T01FM5_n3456XAlbRULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3456XAlbRULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3456XAlbRULin), 2, 0));
         A3457XHisEmpUL = T01FM5_A3457XHisEmpUL[0] ;
         n3457XHisEmpUL = T01FM5_n3457XHisEmpUL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3457XHisEmpUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3457XHisEmpUL), 3, 0));
         A3458XAlbRDisC = T01FM5_A3458XAlbRDisC[0] ;
         n3458XAlbRDisC = T01FM5_n3458XAlbRDisC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3458XAlbRDisC", A3458XAlbRDisC);
         A3459XAlbRImp = T01FM5_A3459XAlbRImp[0] ;
         n3459XAlbRImp = T01FM5_n3459XAlbRImp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3459XAlbRImp", A3459XAlbRImp);
         A3460XRutina = T01FM5_A3460XRutina[0] ;
         n3460XRutina = T01FM5_n3460XRutina[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3460XRutina", A3460XRutina);
         A3828XAlbRefDsc = T01FM5_A3828XAlbRefDsc[0] ;
         n3828XAlbRefDsc = T01FM5_n3828XAlbRefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3828XAlbRefDsc", A3828XAlbRefDsc);
         A8050XAlbRefCom = T01FM5_A8050XAlbRefCom[0] ;
         n8050XAlbRefCom = T01FM5_n8050XAlbRefCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8050XAlbRefCom", A8050XAlbRefCom);
         A11729Xprioritat = T01FM5_A11729Xprioritat[0] ;
         n11729Xprioritat = T01FM5_n11729Xprioritat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11729Xprioritat", GXutil.str( A11729Xprioritat, 1, 0));
         Z396EmprCod = A396EmprCod ;
         Z3435XAlbRecCod = A3435XAlbRecCod ;
         sMode493 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1FM493( ) ;
         if ( AnyError == 1 )
         {
            RcdFound493 = (short)(0) ;
            initializeNonKey1FM493( ) ;
         }
         Gx_mode = sMode493 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound493 = (short)(0) ;
         initializeNonKey1FM493( ) ;
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
      getKey1FM493( ) ;
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
      /* Using cursor T01FM9 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A3435XAlbRecCod), A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T01FM9_A3435XAlbRecCod[0] < A3435XAlbRecCod ) ) && ( GXutil.strcmp(T01FM9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T01FM9_A3435XAlbRecCod[0] > A3435XAlbRecCod ) ) && ( GXutil.strcmp(T01FM9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A3435XAlbRecCod = T01FM9_A3435XAlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3435XAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3435XAlbRecCod), 8, 0));
            RcdFound493 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound493 = (short)(0) ;
      /* Using cursor T01FM10 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A3435XAlbRecCod), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T01FM10_A3435XAlbRecCod[0] > A3435XAlbRecCod ) ) && ( GXutil.strcmp(T01FM10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T01FM10_A3435XAlbRecCod[0] < A3435XAlbRecCod ) ) && ( GXutil.strcmp(T01FM10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A3435XAlbRecCod = T01FM10_A3435XAlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3435XAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3435XAlbRecCod), 8, 0));
            RcdFound493 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1FM493( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtXAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1FM493( ) ;
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
               A3435XAlbRecCod = Z3435XAlbRecCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A3435XAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3435XAlbRecCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtXAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1FM493( ) ;
               GX_FocusControl = edtXAlbRecCod_Internalname ;
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
               GX_FocusControl = edtXAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1FM493( ) ;
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
                  GX_FocusControl = edtXAlbRecCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1FM493( ) ;
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
         A3435XAlbRecCod = Z3435XAlbRecCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A3435XAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3435XAlbRecCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtXAlbRecCod_Internalname ;
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
      getKey1FM493( ) ;
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
            A3435XAlbRecCod = Z3435XAlbRecCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A3435XAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3435XAlbRecCod), 8, 0));
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "talbeur");
      GX_FocusControl = edtXCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1FM0( ) ;
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
      GX_FocusControl = edtXCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1FM493( ) ;
      if ( RcdFound493 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FM493( ) ;
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
      GX_FocusControl = edtXCliCod_Internalname ;
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
      GX_FocusControl = edtXCliCod_Internalname ;
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
      scanStart1FM493( ) ;
      if ( RcdFound493 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound493 != 0 )
         {
            scanNext1FM493( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtXCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FM493( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1FM493( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FM4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBEUR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( Z3436XCliCod != T01FM4_A3436XCliCod[0] ) || ( GXutil.strcmp(Z3437XAlbRef, T01FM4_A3437XAlbRef[0]) != 0 ) || ( Z3438XTrnCod != T01FM4_A3438XTrnCod[0] ) || ( GXutil.strcmp(Z3439XAlbREnt, T01FM4_A3439XAlbREnt[0]) != 0 ) || ( Z3440XAlbRPieEn != T01FM4_A3440XAlbRPieEn[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3441XAlbRUni, T01FM4_A3441XAlbRUni[0]) != 0 ) || ( GXutil.strcmp(Z3442XAlbRLoc, T01FM4_A3442XAlbRLoc[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z3443XAlbRFen), GXutil.resetTime(T01FM4_A3443XAlbRFen[0])) ) || ( DecimalUtil.compareTo(Z3444XAlbRUniEn, T01FM4_A3444XAlbRUniEn[0]) != 0 ) || ( GXutil.strcmp(Z3445XAlbRReo, T01FM4_A3445XAlbRReo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3446XAlbRPieUt != T01FM4_A3446XAlbRPieUt[0] ) || ( Z3447XAlbRPieRe != T01FM4_A3447XAlbRPieRe[0] ) || ( DecimalUtil.compareTo(Z3448XAlbRUniUt, T01FM4_A3448XAlbRUniUt[0]) != 0 ) || ( DecimalUtil.compareTo(Z3449XAlbRUniRe, T01FM4_A3449XAlbRUniRe[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z3450XAlbRFecUl), GXutil.resetTime(T01FM4_A3450XAlbRFecUl[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3451XAlbREst != T01FM4_A3451XAlbREst[0] ) || ( Z3452XTipEntCod != T01FM4_A3452XTipEntCod[0] ) || ( Z3453XAlbNumEti != T01FM4_A3453XAlbNumEti[0] ) || ( GXutil.strcmp(Z3454XAlbRDes, T01FM4_A3454XAlbRDes[0]) != 0 ) || ( Z3455XProceCod != T01FM4_A3455XProceCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3456XAlbRULin != T01FM4_A3456XAlbRULin[0] ) || ( Z3457XHisEmpUL != T01FM4_A3457XHisEmpUL[0] ) || ( GXutil.strcmp(Z3458XAlbRDisC, T01FM4_A3458XAlbRDisC[0]) != 0 ) || ( GXutil.strcmp(Z3459XAlbRImp, T01FM4_A3459XAlbRImp[0]) != 0 ) || ( GXutil.strcmp(Z3460XRutina, T01FM4_A3460XRutina[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3828XAlbRefDsc, T01FM4_A3828XAlbRefDsc[0]) != 0 ) || ( GXutil.strcmp(Z8050XAlbRefCom, T01FM4_A8050XAlbRefCom[0]) != 0 ) || ( Z11729Xprioritat != T01FM4_A11729Xprioritat[0] ) )
         {
            if ( Z3436XCliCod != T01FM4_A3436XCliCod[0] )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XCliCod");
               GXutil.writeLogRaw("Old: ",Z3436XCliCod);
               GXutil.writeLogRaw("Current: ",T01FM4_A3436XCliCod[0]);
            }
            if ( GXutil.strcmp(Z3437XAlbRef, T01FM4_A3437XAlbRef[0]) != 0 )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRef");
               GXutil.writeLogRaw("Old: ",Z3437XAlbRef);
               GXutil.writeLogRaw("Current: ",T01FM4_A3437XAlbRef[0]);
            }
            if ( Z3438XTrnCod != T01FM4_A3438XTrnCod[0] )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XTrnCod");
               GXutil.writeLogRaw("Old: ",Z3438XTrnCod);
               GXutil.writeLogRaw("Current: ",T01FM4_A3438XTrnCod[0]);
            }
            if ( GXutil.strcmp(Z3439XAlbREnt, T01FM4_A3439XAlbREnt[0]) != 0 )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbREnt");
               GXutil.writeLogRaw("Old: ",Z3439XAlbREnt);
               GXutil.writeLogRaw("Current: ",T01FM4_A3439XAlbREnt[0]);
            }
            if ( Z3440XAlbRPieEn != T01FM4_A3440XAlbRPieEn[0] )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRPieEn");
               GXutil.writeLogRaw("Old: ",Z3440XAlbRPieEn);
               GXutil.writeLogRaw("Current: ",T01FM4_A3440XAlbRPieEn[0]);
            }
            if ( GXutil.strcmp(Z3441XAlbRUni, T01FM4_A3441XAlbRUni[0]) != 0 )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRUni");
               GXutil.writeLogRaw("Old: ",Z3441XAlbRUni);
               GXutil.writeLogRaw("Current: ",T01FM4_A3441XAlbRUni[0]);
            }
            if ( GXutil.strcmp(Z3442XAlbRLoc, T01FM4_A3442XAlbRLoc[0]) != 0 )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRLoc");
               GXutil.writeLogRaw("Old: ",Z3442XAlbRLoc);
               GXutil.writeLogRaw("Current: ",T01FM4_A3442XAlbRLoc[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3443XAlbRFen), GXutil.resetTime(T01FM4_A3443XAlbRFen[0])) ) )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRFen");
               GXutil.writeLogRaw("Old: ",Z3443XAlbRFen);
               GXutil.writeLogRaw("Current: ",T01FM4_A3443XAlbRFen[0]);
            }
            if ( DecimalUtil.compareTo(Z3444XAlbRUniEn, T01FM4_A3444XAlbRUniEn[0]) != 0 )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRUniEn");
               GXutil.writeLogRaw("Old: ",Z3444XAlbRUniEn);
               GXutil.writeLogRaw("Current: ",T01FM4_A3444XAlbRUniEn[0]);
            }
            if ( GXutil.strcmp(Z3445XAlbRReo, T01FM4_A3445XAlbRReo[0]) != 0 )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRReo");
               GXutil.writeLogRaw("Old: ",Z3445XAlbRReo);
               GXutil.writeLogRaw("Current: ",T01FM4_A3445XAlbRReo[0]);
            }
            if ( Z3446XAlbRPieUt != T01FM4_A3446XAlbRPieUt[0] )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRPieUt");
               GXutil.writeLogRaw("Old: ",Z3446XAlbRPieUt);
               GXutil.writeLogRaw("Current: ",T01FM4_A3446XAlbRPieUt[0]);
            }
            if ( Z3447XAlbRPieRe != T01FM4_A3447XAlbRPieRe[0] )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRPieRe");
               GXutil.writeLogRaw("Old: ",Z3447XAlbRPieRe);
               GXutil.writeLogRaw("Current: ",T01FM4_A3447XAlbRPieRe[0]);
            }
            if ( DecimalUtil.compareTo(Z3448XAlbRUniUt, T01FM4_A3448XAlbRUniUt[0]) != 0 )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRUniUt");
               GXutil.writeLogRaw("Old: ",Z3448XAlbRUniUt);
               GXutil.writeLogRaw("Current: ",T01FM4_A3448XAlbRUniUt[0]);
            }
            if ( DecimalUtil.compareTo(Z3449XAlbRUniRe, T01FM4_A3449XAlbRUniRe[0]) != 0 )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRUniRe");
               GXutil.writeLogRaw("Old: ",Z3449XAlbRUniRe);
               GXutil.writeLogRaw("Current: ",T01FM4_A3449XAlbRUniRe[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3450XAlbRFecUl), GXutil.resetTime(T01FM4_A3450XAlbRFecUl[0])) ) )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRFecUl");
               GXutil.writeLogRaw("Old: ",Z3450XAlbRFecUl);
               GXutil.writeLogRaw("Current: ",T01FM4_A3450XAlbRFecUl[0]);
            }
            if ( Z3451XAlbREst != T01FM4_A3451XAlbREst[0] )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbREst");
               GXutil.writeLogRaw("Old: ",Z3451XAlbREst);
               GXutil.writeLogRaw("Current: ",T01FM4_A3451XAlbREst[0]);
            }
            if ( Z3452XTipEntCod != T01FM4_A3452XTipEntCod[0] )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XTipEntCod");
               GXutil.writeLogRaw("Old: ",Z3452XTipEntCod);
               GXutil.writeLogRaw("Current: ",T01FM4_A3452XTipEntCod[0]);
            }
            if ( Z3453XAlbNumEti != T01FM4_A3453XAlbNumEti[0] )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbNumEti");
               GXutil.writeLogRaw("Old: ",Z3453XAlbNumEti);
               GXutil.writeLogRaw("Current: ",T01FM4_A3453XAlbNumEti[0]);
            }
            if ( GXutil.strcmp(Z3454XAlbRDes, T01FM4_A3454XAlbRDes[0]) != 0 )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRDes");
               GXutil.writeLogRaw("Old: ",Z3454XAlbRDes);
               GXutil.writeLogRaw("Current: ",T01FM4_A3454XAlbRDes[0]);
            }
            if ( Z3455XProceCod != T01FM4_A3455XProceCod[0] )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XProceCod");
               GXutil.writeLogRaw("Old: ",Z3455XProceCod);
               GXutil.writeLogRaw("Current: ",T01FM4_A3455XProceCod[0]);
            }
            if ( Z3456XAlbRULin != T01FM4_A3456XAlbRULin[0] )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRULin");
               GXutil.writeLogRaw("Old: ",Z3456XAlbRULin);
               GXutil.writeLogRaw("Current: ",T01FM4_A3456XAlbRULin[0]);
            }
            if ( Z3457XHisEmpUL != T01FM4_A3457XHisEmpUL[0] )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XHisEmpUL");
               GXutil.writeLogRaw("Old: ",Z3457XHisEmpUL);
               GXutil.writeLogRaw("Current: ",T01FM4_A3457XHisEmpUL[0]);
            }
            if ( GXutil.strcmp(Z3458XAlbRDisC, T01FM4_A3458XAlbRDisC[0]) != 0 )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRDisC");
               GXutil.writeLogRaw("Old: ",Z3458XAlbRDisC);
               GXutil.writeLogRaw("Current: ",T01FM4_A3458XAlbRDisC[0]);
            }
            if ( GXutil.strcmp(Z3459XAlbRImp, T01FM4_A3459XAlbRImp[0]) != 0 )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRImp");
               GXutil.writeLogRaw("Old: ",Z3459XAlbRImp);
               GXutil.writeLogRaw("Current: ",T01FM4_A3459XAlbRImp[0]);
            }
            if ( GXutil.strcmp(Z3460XRutina, T01FM4_A3460XRutina[0]) != 0 )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XRutina");
               GXutil.writeLogRaw("Old: ",Z3460XRutina);
               GXutil.writeLogRaw("Current: ",T01FM4_A3460XRutina[0]);
            }
            if ( GXutil.strcmp(Z3828XAlbRefDsc, T01FM4_A3828XAlbRefDsc[0]) != 0 )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRefDsc");
               GXutil.writeLogRaw("Old: ",Z3828XAlbRefDsc);
               GXutil.writeLogRaw("Current: ",T01FM4_A3828XAlbRefDsc[0]);
            }
            if ( GXutil.strcmp(Z8050XAlbRefCom, T01FM4_A8050XAlbRefCom[0]) != 0 )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRefCom");
               GXutil.writeLogRaw("Old: ",Z8050XAlbRefCom);
               GXutil.writeLogRaw("Current: ",T01FM4_A8050XAlbRefCom[0]);
            }
            if ( Z11729Xprioritat != T01FM4_A11729Xprioritat[0] )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"Xprioritat");
               GXutil.writeLogRaw("Old: ",Z11729Xprioritat);
               GXutil.writeLogRaw("Current: ",T01FM4_A11729Xprioritat[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBEUR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FM493( )
   {
      beforeValidate1FM493( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FM493( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FM493( 0) ;
         checkOptimisticConcurrency1FM493( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FM493( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FM493( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FM11 */
                  pr_default.execute(9, new Object[] {Integer.valueOf(A3435XAlbRecCod), Boolean.valueOf(n3436XCliCod), Integer.valueOf(A3436XCliCod), Boolean.valueOf(n3437XAlbRef), A3437XAlbRef, Boolean.valueOf(n3438XTrnCod), Short.valueOf(A3438XTrnCod), Boolean.valueOf(n3439XAlbREnt), A3439XAlbREnt, Boolean.valueOf(n3440XAlbRPieEn), Short.valueOf(A3440XAlbRPieEn), Boolean.valueOf(n3441XAlbRUni), A3441XAlbRUni, Boolean.valueOf(n3442XAlbRLoc), A3442XAlbRLoc, Boolean.valueOf(n3443XAlbRFen), A3443XAlbRFen, Boolean.valueOf(n3444XAlbRUniEn), A3444XAlbRUniEn, Boolean.valueOf(n3445XAlbRReo), A3445XAlbRReo, Boolean.valueOf(n3446XAlbRPieUt), Short.valueOf(A3446XAlbRPieUt), Boolean.valueOf(n3447XAlbRPieRe), Short.valueOf(A3447XAlbRPieRe), Boolean.valueOf(n3448XAlbRUniUt), A3448XAlbRUniUt, Boolean.valueOf(n3449XAlbRUniRe), A3449XAlbRUniRe, Boolean.valueOf(n3450XAlbRFecUl), A3450XAlbRFecUl, Boolean.valueOf(n3451XAlbREst), Byte.valueOf(A3451XAlbREst), Boolean.valueOf(n3452XTipEntCod), Short.valueOf(A3452XTipEntCod), Boolean.valueOf(n3453XAlbNumEti), Short.valueOf(A3453XAlbNumEti), Boolean.valueOf(n3454XAlbRDes), A3454XAlbRDes, Boolean.valueOf(n3455XProceCod), Short.valueOf(A3455XProceCod), Boolean.valueOf(n3456XAlbRULin), Byte.valueOf(A3456XAlbRULin), Boolean.valueOf(n3457XHisEmpUL), Short.valueOf(A3457XHisEmpUL), Boolean.valueOf(n3458XAlbRDisC), A3458XAlbRDisC, Boolean.valueOf(n3459XAlbRImp), A3459XAlbRImp, Boolean.valueOf(n3460XRutina), A3460XRutina, Boolean.valueOf(n3828XAlbRefDsc), A3828XAlbRefDsc, Boolean.valueOf(n8050XAlbRefCom), A8050XAlbRefCom, Boolean.valueOf(n11729Xprioritat), Byte.valueOf(A11729Xprioritat), A396EmprCod});
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
                        processLevel1FM493( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1FM0( ) ;
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
            load1FM493( ) ;
         }
         endLevel1FM493( ) ;
      }
      closeExtendedTableCursors1FM493( ) ;
   }

   public void update1FM493( )
   {
      beforeValidate1FM493( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FM493( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FM493( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FM493( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1FM493( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FM12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n3436XCliCod), Integer.valueOf(A3436XCliCod), Boolean.valueOf(n3437XAlbRef), A3437XAlbRef, Boolean.valueOf(n3438XTrnCod), Short.valueOf(A3438XTrnCod), Boolean.valueOf(n3439XAlbREnt), A3439XAlbREnt, Boolean.valueOf(n3440XAlbRPieEn), Short.valueOf(A3440XAlbRPieEn), Boolean.valueOf(n3441XAlbRUni), A3441XAlbRUni, Boolean.valueOf(n3442XAlbRLoc), A3442XAlbRLoc, Boolean.valueOf(n3443XAlbRFen), A3443XAlbRFen, Boolean.valueOf(n3444XAlbRUniEn), A3444XAlbRUniEn, Boolean.valueOf(n3445XAlbRReo), A3445XAlbRReo, Boolean.valueOf(n3446XAlbRPieUt), Short.valueOf(A3446XAlbRPieUt), Boolean.valueOf(n3447XAlbRPieRe), Short.valueOf(A3447XAlbRPieRe), Boolean.valueOf(n3448XAlbRUniUt), A3448XAlbRUniUt, Boolean.valueOf(n3449XAlbRUniRe), A3449XAlbRUniRe, Boolean.valueOf(n3450XAlbRFecUl), A3450XAlbRFecUl, Boolean.valueOf(n3451XAlbREst), Byte.valueOf(A3451XAlbREst), Boolean.valueOf(n3452XTipEntCod), Short.valueOf(A3452XTipEntCod), Boolean.valueOf(n3453XAlbNumEti), Short.valueOf(A3453XAlbNumEti), Boolean.valueOf(n3454XAlbRDes), A3454XAlbRDes, Boolean.valueOf(n3455XProceCod), Short.valueOf(A3455XProceCod), Boolean.valueOf(n3456XAlbRULin), Byte.valueOf(A3456XAlbRULin), Boolean.valueOf(n3457XHisEmpUL), Short.valueOf(A3457XHisEmpUL), Boolean.valueOf(n3458XAlbRDisC), A3458XAlbRDisC, Boolean.valueOf(n3459XAlbRImp), A3459XAlbRImp, Boolean.valueOf(n3460XRutina), A3460XRutina, Boolean.valueOf(n3828XAlbRefDsc), A3828XAlbRefDsc, Boolean.valueOf(n8050XAlbRefCom), A8050XAlbRefCom, Boolean.valueOf(n11729Xprioritat), Byte.valueOf(A11729Xprioritat), A396EmprCod, Integer.valueOf(A3435XAlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEUR");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBEUR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1FM493( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1FM493( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1FM0( ) ;
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
         endLevel1FM493( ) ;
      }
      closeExtendedTableCursors1FM493( ) ;
   }

   public void deferredUpdate1FM493( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FM493( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FM493( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FM493( ) ;
         afterConfirm1FM493( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FM493( ) ;
            if ( AnyError == 0 )
            {
               scanStart1FM1576( ) ;
               while ( RcdFound1576 != 0 )
               {
                  getByPrimaryKey1FM1576( ) ;
                  delete1FM1576( ) ;
                  scanNext1FM1576( ) ;
               }
               scanEnd1FM1576( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FM13 */
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
                           initAll1FM493( ) ;
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
                        resetCaption1FM0( ) ;
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
      endLevel1FM493( ) ;
      Gx_mode = sMode493 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FM493( )
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
      if ( AnyError == 0 )
      {
         /* Using cursor T01FM14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBEOB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T01FM15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBVPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void processNestedLevel1FM1576( )
   {
      nGXsfl_175_idx = 0 ;
      while ( nGXsfl_175_idx < nRC_GXsfl_175 )
      {
         readRow1FM1576( ) ;
         if ( ( nRcdExists_1576 != 0 ) || ( nIsMod_1576 != 0 ) )
         {
            standaloneNotModal1FM1576( ) ;
            getKey1FM1576( ) ;
            if ( ( nRcdExists_1576 == 0 ) && ( nRcdDeleted_1576 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1FM1576( ) ;
            }
            else
            {
               if ( RcdFound1576 != 0 )
               {
                  if ( ( nRcdDeleted_1576 != 0 ) && ( nRcdExists_1576 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1FM1576( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1576 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1FM1576( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1576 == 0 )
                  {
                     GXCCtl = "XALBRECPIE_" + sGXsfl_175_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtXAlbRecPie_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1576_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1576, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAlbRecPie_Internalname, GXutil.rtrim( A3461XAlbRecPie)) ;
         httpContext.changePostValue( edtXAlbRecAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A3462XAlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAlbRecMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A3463XAlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAlbRecKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A3464XAlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAlbRecMtU_Internalname, GXutil.ltrim( localUtil.ntoc( A3465XAlbRecMtU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAlbRecKgU_Internalname, GXutil.ltrim( localUtil.ntoc( A3466XAlbRecKgU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAlbRecCol_Internalname, GXutil.ltrim( localUtil.ntoc( A3728XAlbRecCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAlbRecPza_Internalname, GXutil.rtrim( A3729XAlbRecPza)) ;
         httpContext.changePostValue( edtXqualitat_Internalname, GXutil.rtrim( A11730Xqualitat)) ;
         httpContext.changePostValue( edtXteler_Internalname, GXutil.rtrim( A11731Xteler)) ;
         httpContext.changePostValue( "ZT_"+"Z3461XAlbRecPie_"+sGXsfl_175_idx, GXutil.rtrim( Z3461XAlbRecPie)) ;
         httpContext.changePostValue( "ZT_"+"Z3462XAlbRecAnh_"+sGXsfl_175_idx, GXutil.ltrim( localUtil.ntoc( Z3462XAlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3463XAlbRecMtr_"+sGXsfl_175_idx, GXutil.ltrim( localUtil.ntoc( Z3463XAlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3464XAlbRecKgm_"+sGXsfl_175_idx, GXutil.ltrim( localUtil.ntoc( Z3464XAlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3465XAlbRecMtU_"+sGXsfl_175_idx, GXutil.ltrim( localUtil.ntoc( Z3465XAlbRecMtU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3466XAlbRecKgU_"+sGXsfl_175_idx, GXutil.ltrim( localUtil.ntoc( Z3466XAlbRecKgU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3728XAlbRecCol_"+sGXsfl_175_idx, GXutil.ltrim( localUtil.ntoc( Z3728XAlbRecCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3729XAlbRecPza_"+sGXsfl_175_idx, GXutil.rtrim( Z3729XAlbRecPza)) ;
         httpContext.changePostValue( "ZT_"+"Z11730Xqualitat_"+sGXsfl_175_idx, GXutil.rtrim( Z11730Xqualitat)) ;
         httpContext.changePostValue( "ZT_"+"Z11731Xteler_"+sGXsfl_175_idx, GXutil.rtrim( Z11731Xteler)) ;
         httpContext.changePostValue( "nRcdDeleted_1576_"+sGXsfl_175_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1576, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1576_"+sGXsfl_175_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1576, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1576_"+sGXsfl_175_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1576, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1576 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1576_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1576_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XALBRECPIE_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XALBRECANH_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecAnh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XALBRECMTR_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XALBRECKGM_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XALBRECMTU_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecMtU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XALBRECKGU_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecKgU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XALBRECCOL_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XALBRECPZA_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecPza_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XQUALITAT_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXqualitat_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XTELER_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXteler_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1FM1576( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1576 = (short)(0) ;
      nIsMod_1576 = (short)(0) ;
      nRcdDeleted_1576 = (short)(0) ;
   }

   public void processLevel1FM493( )
   {
      /* Save parent mode. */
      sMode493 = Gx_mode ;
      processNestedLevel1FM1576( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode493 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1FM493( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1FM493( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "talbeur");
         if ( AnyError == 0 )
         {
            confirmValues1FM0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "talbeur");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1FM493( )
   {
      /* Scan By routine */
      /* Using cursor T01FM16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      RcdFound493 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound493 = (short)(1) ;
         A3435XAlbRecCod = T01FM16_A3435XAlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3435XAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3435XAlbRecCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FM493( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound493 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound493 = (short)(1) ;
         A3435XAlbRecCod = T01FM16_A3435XAlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3435XAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3435XAlbRecCod), 8, 0));
      }
   }

   public void scanEnd1FM493( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1FM493( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FM493( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FM493( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FM493( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FM493( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FM493( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FM493( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtXAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRecCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtXCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXCliCod_Enabled), 5, 0), true);
      edtXAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRef_Enabled), 5, 0), true);
      edtXTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXTrnCod_Enabled), 5, 0), true);
      edtXAlbREnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbREnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbREnt_Enabled), 5, 0), true);
      edtXAlbRPieEn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRPieEn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRPieEn_Enabled), 5, 0), true);
      edtXAlbRUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRUni_Enabled), 5, 0), true);
      edtXAlbRLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRLoc_Enabled), 5, 0), true);
      edtXAlbRFen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRFen_Enabled), 5, 0), true);
      edtXAlbRUniEn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRUniEn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRUniEn_Enabled), 5, 0), true);
      edtXAlbRReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRReo_Enabled), 5, 0), true);
      edtXAlbRPieUt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRPieUt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRPieUt_Enabled), 5, 0), true);
      edtXAlbRPieRe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRPieRe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRPieRe_Enabled), 5, 0), true);
      edtXAlbRUniUt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRUniUt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRUniUt_Enabled), 5, 0), true);
      edtXAlbRUniRe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRUniRe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRUniRe_Enabled), 5, 0), true);
      edtXAlbRFecUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRFecUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRFecUl_Enabled), 5, 0), true);
      edtXAlbREst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbREst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbREst_Enabled), 5, 0), true);
      edtXTipEntCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXTipEntCod_Enabled), 5, 0), true);
      edtXAlbNumEti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbNumEti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbNumEti_Enabled), 5, 0), true);
      edtXAlbRDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRDes_Enabled), 5, 0), true);
      edtXProceCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXProceCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXProceCod_Enabled), 5, 0), true);
      edtXAlbRULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRULin_Enabled), 5, 0), true);
      edtXHisEmpUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXHisEmpUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXHisEmpUL_Enabled), 5, 0), true);
      edtXAlbRDisC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRDisC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRDisC_Enabled), 5, 0), true);
      edtXAlbRImp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRImp_Enabled), 5, 0), true);
      edtXRutina_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXRutina_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXRutina_Enabled), 5, 0), true);
      edtXAlbRefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRefDsc_Enabled), 5, 0), true);
      edtXAlbRefCom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRefCom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRefCom_Enabled), 5, 0), true);
      edtXprioritat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXprioritat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXprioritat_Enabled), 5, 0), true);
   }

   public void zm1FM1576( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3462XAlbRecAnh = T01FM3_A3462XAlbRecAnh[0] ;
            Z3463XAlbRecMtr = T01FM3_A3463XAlbRecMtr[0] ;
            Z3464XAlbRecKgm = T01FM3_A3464XAlbRecKgm[0] ;
            Z3465XAlbRecMtU = T01FM3_A3465XAlbRecMtU[0] ;
            Z3466XAlbRecKgU = T01FM3_A3466XAlbRecKgU[0] ;
            Z3728XAlbRecCol = T01FM3_A3728XAlbRecCol[0] ;
            Z3729XAlbRecPza = T01FM3_A3729XAlbRecPza[0] ;
            Z11730Xqualitat = T01FM3_A11730Xqualitat[0] ;
            Z11731Xteler = T01FM3_A11731Xteler[0] ;
         }
         else
         {
            Z3462XAlbRecAnh = A3462XAlbRecAnh ;
            Z3463XAlbRecMtr = A3463XAlbRecMtr ;
            Z3464XAlbRecKgm = A3464XAlbRecKgm ;
            Z3465XAlbRecMtU = A3465XAlbRecMtU ;
            Z3466XAlbRecKgU = A3466XAlbRecKgU ;
            Z3728XAlbRecCol = A3728XAlbRecCol ;
            Z3729XAlbRecPza = A3729XAlbRecPza ;
            Z11730Xqualitat = A11730Xqualitat ;
            Z11731Xteler = A11731Xteler ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z396EmprCod = A396EmprCod ;
         Z3435XAlbRecCod = A3435XAlbRecCod ;
         Z3461XAlbRecPie = A3461XAlbRecPie ;
         Z3462XAlbRecAnh = A3462XAlbRecAnh ;
         Z3463XAlbRecMtr = A3463XAlbRecMtr ;
         Z3464XAlbRecKgm = A3464XAlbRecKgm ;
         Z3465XAlbRecMtU = A3465XAlbRecMtU ;
         Z3466XAlbRecKgU = A3466XAlbRecKgU ;
         Z3728XAlbRecCol = A3728XAlbRecCol ;
         Z3729XAlbRecPza = A3729XAlbRecPza ;
         Z11730Xqualitat = A11730Xqualitat ;
         Z11731Xteler = A11731Xteler ;
      }
   }

   public void standaloneNotModal1FM1576( )
   {
   }

   public void standaloneModal1FM1576( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtXAlbRecPie_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtXAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRecPie_Enabled), 5, 0), !bGXsfl_175_Refreshing);
      }
      else
      {
         edtXAlbRecPie_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtXAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRecPie_Enabled), 5, 0), !bGXsfl_175_Refreshing);
      }
   }

   public void load1FM1576( )
   {
      /* Using cursor T01FM17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod), A3461XAlbRecPie});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1576 = (short)(1) ;
         A3462XAlbRecAnh = T01FM17_A3462XAlbRecAnh[0] ;
         n3462XAlbRecAnh = T01FM17_n3462XAlbRecAnh[0] ;
         A3463XAlbRecMtr = T01FM17_A3463XAlbRecMtr[0] ;
         n3463XAlbRecMtr = T01FM17_n3463XAlbRecMtr[0] ;
         A3464XAlbRecKgm = T01FM17_A3464XAlbRecKgm[0] ;
         n3464XAlbRecKgm = T01FM17_n3464XAlbRecKgm[0] ;
         A3465XAlbRecMtU = T01FM17_A3465XAlbRecMtU[0] ;
         n3465XAlbRecMtU = T01FM17_n3465XAlbRecMtU[0] ;
         A3466XAlbRecKgU = T01FM17_A3466XAlbRecKgU[0] ;
         n3466XAlbRecKgU = T01FM17_n3466XAlbRecKgU[0] ;
         A3728XAlbRecCol = T01FM17_A3728XAlbRecCol[0] ;
         n3728XAlbRecCol = T01FM17_n3728XAlbRecCol[0] ;
         A3729XAlbRecPza = T01FM17_A3729XAlbRecPza[0] ;
         n3729XAlbRecPza = T01FM17_n3729XAlbRecPza[0] ;
         A11730Xqualitat = T01FM17_A11730Xqualitat[0] ;
         n11730Xqualitat = T01FM17_n11730Xqualitat[0] ;
         A11731Xteler = T01FM17_A11731Xteler[0] ;
         n11731Xteler = T01FM17_n11731Xteler[0] ;
         zm1FM1576( -8) ;
      }
      pr_default.close(15);
      onLoadActions1FM1576( ) ;
   }

   public void onLoadActions1FM1576( )
   {
   }

   public void checkExtendedTable1FM1576( )
   {
      nIsDirty_1576 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1FM1576( ) ;
   }

   public void closeExtendedTableCursors1FM1576( )
   {
   }

   public void enableDisable1FM1576( )
   {
   }

   public void getKey1FM1576( )
   {
      /* Using cursor T01FM18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod), A3461XAlbRecPie});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1576 = (short)(1) ;
      }
      else
      {
         RcdFound1576 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey1FM1576( )
   {
      /* Using cursor T01FM3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod), A3461XAlbRecPie});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01FM3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1FM1576( 8) ;
         RcdFound1576 = (short)(1) ;
         initializeNonKey1FM1576( ) ;
         A3461XAlbRecPie = T01FM3_A3461XAlbRecPie[0] ;
         A3462XAlbRecAnh = T01FM3_A3462XAlbRecAnh[0] ;
         n3462XAlbRecAnh = T01FM3_n3462XAlbRecAnh[0] ;
         A3463XAlbRecMtr = T01FM3_A3463XAlbRecMtr[0] ;
         n3463XAlbRecMtr = T01FM3_n3463XAlbRecMtr[0] ;
         A3464XAlbRecKgm = T01FM3_A3464XAlbRecKgm[0] ;
         n3464XAlbRecKgm = T01FM3_n3464XAlbRecKgm[0] ;
         A3465XAlbRecMtU = T01FM3_A3465XAlbRecMtU[0] ;
         n3465XAlbRecMtU = T01FM3_n3465XAlbRecMtU[0] ;
         A3466XAlbRecKgU = T01FM3_A3466XAlbRecKgU[0] ;
         n3466XAlbRecKgU = T01FM3_n3466XAlbRecKgU[0] ;
         A3728XAlbRecCol = T01FM3_A3728XAlbRecCol[0] ;
         n3728XAlbRecCol = T01FM3_n3728XAlbRecCol[0] ;
         A3729XAlbRecPza = T01FM3_A3729XAlbRecPza[0] ;
         n3729XAlbRecPza = T01FM3_n3729XAlbRecPza[0] ;
         A11730Xqualitat = T01FM3_A11730Xqualitat[0] ;
         n11730Xqualitat = T01FM3_n11730Xqualitat[0] ;
         A11731Xteler = T01FM3_A11731Xteler[0] ;
         n11731Xteler = T01FM3_n11731Xteler[0] ;
         Z396EmprCod = A396EmprCod ;
         Z3435XAlbRecCod = A3435XAlbRecCod ;
         Z3461XAlbRecPie = A3461XAlbRecPie ;
         sMode1576 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FM1576( ) ;
         load1FM1576( ) ;
         Gx_mode = sMode1576 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1576 = (short)(0) ;
         initializeNonKey1FM1576( ) ;
         sMode1576 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FM1576( ) ;
         Gx_mode = sMode1576 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1FM1576( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1FM1576( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FM2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod), A3461XAlbRecPie});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBEUD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z3462XAlbRecAnh != T01FM2_A3462XAlbRecAnh[0] ) || ( DecimalUtil.compareTo(Z3463XAlbRecMtr, T01FM2_A3463XAlbRecMtr[0]) != 0 ) || ( DecimalUtil.compareTo(Z3464XAlbRecKgm, T01FM2_A3464XAlbRecKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z3465XAlbRecMtU, T01FM2_A3465XAlbRecMtU[0]) != 0 ) || ( DecimalUtil.compareTo(Z3466XAlbRecKgU, T01FM2_A3466XAlbRecKgU[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3728XAlbRecCol != T01FM2_A3728XAlbRecCol[0] ) || ( GXutil.strcmp(Z3729XAlbRecPza, T01FM2_A3729XAlbRecPza[0]) != 0 ) || ( GXutil.strcmp(Z11730Xqualitat, T01FM2_A11730Xqualitat[0]) != 0 ) || ( GXutil.strcmp(Z11731Xteler, T01FM2_A11731Xteler[0]) != 0 ) )
         {
            if ( Z3462XAlbRecAnh != T01FM2_A3462XAlbRecAnh[0] )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRecAnh");
               GXutil.writeLogRaw("Old: ",Z3462XAlbRecAnh);
               GXutil.writeLogRaw("Current: ",T01FM2_A3462XAlbRecAnh[0]);
            }
            if ( DecimalUtil.compareTo(Z3463XAlbRecMtr, T01FM2_A3463XAlbRecMtr[0]) != 0 )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRecMtr");
               GXutil.writeLogRaw("Old: ",Z3463XAlbRecMtr);
               GXutil.writeLogRaw("Current: ",T01FM2_A3463XAlbRecMtr[0]);
            }
            if ( DecimalUtil.compareTo(Z3464XAlbRecKgm, T01FM2_A3464XAlbRecKgm[0]) != 0 )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRecKgm");
               GXutil.writeLogRaw("Old: ",Z3464XAlbRecKgm);
               GXutil.writeLogRaw("Current: ",T01FM2_A3464XAlbRecKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z3465XAlbRecMtU, T01FM2_A3465XAlbRecMtU[0]) != 0 )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRecMtU");
               GXutil.writeLogRaw("Old: ",Z3465XAlbRecMtU);
               GXutil.writeLogRaw("Current: ",T01FM2_A3465XAlbRecMtU[0]);
            }
            if ( DecimalUtil.compareTo(Z3466XAlbRecKgU, T01FM2_A3466XAlbRecKgU[0]) != 0 )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRecKgU");
               GXutil.writeLogRaw("Old: ",Z3466XAlbRecKgU);
               GXutil.writeLogRaw("Current: ",T01FM2_A3466XAlbRecKgU[0]);
            }
            if ( Z3728XAlbRecCol != T01FM2_A3728XAlbRecCol[0] )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRecCol");
               GXutil.writeLogRaw("Old: ",Z3728XAlbRecCol);
               GXutil.writeLogRaw("Current: ",T01FM2_A3728XAlbRecCol[0]);
            }
            if ( GXutil.strcmp(Z3729XAlbRecPza, T01FM2_A3729XAlbRecPza[0]) != 0 )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"XAlbRecPza");
               GXutil.writeLogRaw("Old: ",Z3729XAlbRecPza);
               GXutil.writeLogRaw("Current: ",T01FM2_A3729XAlbRecPza[0]);
            }
            if ( GXutil.strcmp(Z11730Xqualitat, T01FM2_A11730Xqualitat[0]) != 0 )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"Xqualitat");
               GXutil.writeLogRaw("Old: ",Z11730Xqualitat);
               GXutil.writeLogRaw("Current: ",T01FM2_A11730Xqualitat[0]);
            }
            if ( GXutil.strcmp(Z11731Xteler, T01FM2_A11731Xteler[0]) != 0 )
            {
               GXutil.writeLogln("talbeur:[seudo value changed for attri]"+"Xteler");
               GXutil.writeLogRaw("Old: ",Z11731Xteler);
               GXutil.writeLogRaw("Current: ",T01FM2_A11731Xteler[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBEUD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FM1576( )
   {
      beforeValidate1FM1576( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FM1576( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FM1576( 0) ;
         checkOptimisticConcurrency1FM1576( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FM1576( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FM1576( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FM19 */
                  pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod), A3461XAlbRecPie, Boolean.valueOf(n3462XAlbRecAnh), Short.valueOf(A3462XAlbRecAnh), Boolean.valueOf(n3463XAlbRecMtr), A3463XAlbRecMtr, Boolean.valueOf(n3464XAlbRecKgm), A3464XAlbRecKgm, Boolean.valueOf(n3465XAlbRecMtU), A3465XAlbRecMtU, Boolean.valueOf(n3466XAlbRecKgU), A3466XAlbRecKgU, Boolean.valueOf(n3728XAlbRecCol), Short.valueOf(A3728XAlbRecCol), Boolean.valueOf(n3729XAlbRecPza), A3729XAlbRecPza, Boolean.valueOf(n11730Xqualitat), A11730Xqualitat, Boolean.valueOf(n11731Xteler), A11731Xteler});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEUD");
                  if ( (pr_default.getStatus(17) == 1) )
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
            load1FM1576( ) ;
         }
         endLevel1FM1576( ) ;
      }
      closeExtendedTableCursors1FM1576( ) ;
   }

   public void update1FM1576( )
   {
      beforeValidate1FM1576( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FM1576( ) ;
      }
      if ( ( nIsMod_1576 != 0 ) || ( nIsDirty_1576 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1FM1576( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1FM1576( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1FM1576( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01FM20 */
                     pr_default.execute(18, new Object[] {Boolean.valueOf(n3462XAlbRecAnh), Short.valueOf(A3462XAlbRecAnh), Boolean.valueOf(n3463XAlbRecMtr), A3463XAlbRecMtr, Boolean.valueOf(n3464XAlbRecKgm), A3464XAlbRecKgm, Boolean.valueOf(n3465XAlbRecMtU), A3465XAlbRecMtU, Boolean.valueOf(n3466XAlbRecKgU), A3466XAlbRecKgU, Boolean.valueOf(n3728XAlbRecCol), Short.valueOf(A3728XAlbRecCol), Boolean.valueOf(n3729XAlbRecPza), A3729XAlbRecPza, Boolean.valueOf(n11730Xqualitat), A11730Xqualitat, Boolean.valueOf(n11731Xteler), A11731Xteler, A396EmprCod, Integer.valueOf(A3435XAlbRecCod), A3461XAlbRecPie});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEUD");
                     if ( (pr_default.getStatus(18) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBEUD"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1FM1576( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1FM1576( ) ;
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
            endLevel1FM1576( ) ;
         }
      }
      closeExtendedTableCursors1FM1576( ) ;
   }

   public void deferredUpdate1FM1576( )
   {
   }

   public void delete1FM1576( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FM1576( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FM1576( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FM1576( ) ;
         afterConfirm1FM1576( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FM1576( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01FM21 */
               pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod), A3461XAlbRecPie});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEUD");
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
      sMode1576 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FM1576( ) ;
      Gx_mode = sMode1576 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FM1576( )
   {
      standaloneModal1FM1576( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1FM1576( )
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

   public void scanStart1FM1576( )
   {
      /* Scan By routine */
      /* Using cursor T01FM22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A3435XAlbRecCod)});
      RcdFound1576 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1576 = (short)(1) ;
         A3461XAlbRecPie = T01FM22_A3461XAlbRecPie[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FM1576( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound1576 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1576 = (short)(1) ;
         A3461XAlbRecPie = T01FM22_A3461XAlbRecPie[0] ;
      }
   }

   public void scanEnd1FM1576( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1FM1576( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FM1576( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FM1576( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FM1576( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FM1576( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FM1576( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FM1576( )
   {
      edtXAlbRecPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRecPie_Enabled), 5, 0), !bGXsfl_175_Refreshing);
      edtXAlbRecAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRecAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRecAnh_Enabled), 5, 0), !bGXsfl_175_Refreshing);
      edtXAlbRecMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRecMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRecMtr_Enabled), 5, 0), !bGXsfl_175_Refreshing);
      edtXAlbRecKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRecKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRecKgm_Enabled), 5, 0), !bGXsfl_175_Refreshing);
      edtXAlbRecMtU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRecMtU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRecMtU_Enabled), 5, 0), !bGXsfl_175_Refreshing);
      edtXAlbRecKgU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRecKgU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRecKgU_Enabled), 5, 0), !bGXsfl_175_Refreshing);
      edtXAlbRecCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRecCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRecCol_Enabled), 5, 0), !bGXsfl_175_Refreshing);
      edtXAlbRecPza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRecPza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRecPza_Enabled), 5, 0), !bGXsfl_175_Refreshing);
      edtXqualitat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXqualitat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXqualitat_Enabled), 5, 0), !bGXsfl_175_Refreshing);
      edtXteler_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXteler_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXteler_Enabled), 5, 0), !bGXsfl_175_Refreshing);
   }

   public void send_integrity_lvl_hashes1FM1576( )
   {
   }

   public void send_integrity_lvl_hashes1FM493( )
   {
   }

   public void subsflControlProps_1751576( )
   {
      edtavnRcdDeleted_1576_Internalname = "vNRCDDELETED_1576_"+sGXsfl_175_idx ;
      edtXAlbRecPie_Internalname = "XALBRECPIE_"+sGXsfl_175_idx ;
      edtXAlbRecAnh_Internalname = "XALBRECANH_"+sGXsfl_175_idx ;
      edtXAlbRecMtr_Internalname = "XALBRECMTR_"+sGXsfl_175_idx ;
      edtXAlbRecKgm_Internalname = "XALBRECKGM_"+sGXsfl_175_idx ;
      edtXAlbRecMtU_Internalname = "XALBRECMTU_"+sGXsfl_175_idx ;
      edtXAlbRecKgU_Internalname = "XALBRECKGU_"+sGXsfl_175_idx ;
      edtXAlbRecCol_Internalname = "XALBRECCOL_"+sGXsfl_175_idx ;
      edtXAlbRecPza_Internalname = "XALBRECPZA_"+sGXsfl_175_idx ;
      edtXqualitat_Internalname = "XQUALITAT_"+sGXsfl_175_idx ;
      edtXteler_Internalname = "XTELER_"+sGXsfl_175_idx ;
   }

   public void subsflControlProps_fel_1751576( )
   {
      edtavnRcdDeleted_1576_Internalname = "vNRCDDELETED_1576_"+sGXsfl_175_fel_idx ;
      edtXAlbRecPie_Internalname = "XALBRECPIE_"+sGXsfl_175_fel_idx ;
      edtXAlbRecAnh_Internalname = "XALBRECANH_"+sGXsfl_175_fel_idx ;
      edtXAlbRecMtr_Internalname = "XALBRECMTR_"+sGXsfl_175_fel_idx ;
      edtXAlbRecKgm_Internalname = "XALBRECKGM_"+sGXsfl_175_fel_idx ;
      edtXAlbRecMtU_Internalname = "XALBRECMTU_"+sGXsfl_175_fel_idx ;
      edtXAlbRecKgU_Internalname = "XALBRECKGU_"+sGXsfl_175_fel_idx ;
      edtXAlbRecCol_Internalname = "XALBRECCOL_"+sGXsfl_175_fel_idx ;
      edtXAlbRecPza_Internalname = "XALBRECPZA_"+sGXsfl_175_fel_idx ;
      edtXqualitat_Internalname = "XQUALITAT_"+sGXsfl_175_fel_idx ;
      edtXteler_Internalname = "XTELER_"+sGXsfl_175_fel_idx ;
   }

   public void addRow1FM1576( )
   {
      nGXsfl_175_idx = (int)(nGXsfl_175_idx+1) ;
      sGXsfl_175_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_175_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1751576( ) ;
      sendRow1FM1576( ) ;
   }

   public void sendRow1FM1576( )
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
         if ( ((int)((nGXsfl_175_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1576_" + sGXsfl_175_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 176,'',false,'" + sGXsfl_175_idx + "',175)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1576_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1576, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1576_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1576), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1576), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,176);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1576_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1576_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(175),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1576_" + sGXsfl_175_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 177,'',false,'" + sGXsfl_175_idx + "',175)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAlbRecPie_Internalname,GXutil.rtrim( A3461XAlbRecPie),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,177);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAlbRecPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAlbRecPie_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(175),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1576_" + sGXsfl_175_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 178,'',false,'" + sGXsfl_175_idx + "',175)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAlbRecAnh_Internalname,GXutil.ltrim( localUtil.ntoc( A3462XAlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAlbRecAnh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3462XAlbRecAnh), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3462XAlbRecAnh), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,178);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAlbRecAnh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAlbRecAnh_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(175),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1576_" + sGXsfl_175_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 179,'',false,'" + sGXsfl_175_idx + "',175)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAlbRecMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A3463XAlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAlbRecMtr_Enabled!=0) ? localUtil.format( A3463XAlbRecMtr, "ZZZZZ9.99") : localUtil.format( A3463XAlbRecMtr, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,179);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAlbRecMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAlbRecMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(175),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1576_" + sGXsfl_175_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 180,'',false,'" + sGXsfl_175_idx + "',175)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAlbRecKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A3464XAlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAlbRecKgm_Enabled!=0) ? localUtil.format( A3464XAlbRecKgm, "ZZZZZ9.99") : localUtil.format( A3464XAlbRecKgm, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,180);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAlbRecKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAlbRecKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(175),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1576_" + sGXsfl_175_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 181,'',false,'" + sGXsfl_175_idx + "',175)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAlbRecMtU_Internalname,GXutil.ltrim( localUtil.ntoc( A3465XAlbRecMtU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAlbRecMtU_Enabled!=0) ? localUtil.format( A3465XAlbRecMtU, "ZZZZZ9.99") : localUtil.format( A3465XAlbRecMtU, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,181);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAlbRecMtU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAlbRecMtU_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(175),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1576_" + sGXsfl_175_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 182,'',false,'" + sGXsfl_175_idx + "',175)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAlbRecKgU_Internalname,GXutil.ltrim( localUtil.ntoc( A3466XAlbRecKgU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAlbRecKgU_Enabled!=0) ? localUtil.format( A3466XAlbRecKgU, "ZZZZZ9.99") : localUtil.format( A3466XAlbRecKgU, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,182);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAlbRecKgU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAlbRecKgU_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(175),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1576_" + sGXsfl_175_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 183,'',false,'" + sGXsfl_175_idx + "',175)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAlbRecCol_Internalname,GXutil.ltrim( localUtil.ntoc( A3728XAlbRecCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAlbRecCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3728XAlbRecCol), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3728XAlbRecCol), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,183);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAlbRecCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAlbRecCol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(175),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1576_" + sGXsfl_175_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 184,'',false,'" + sGXsfl_175_idx + "',175)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAlbRecPza_Internalname,GXutil.rtrim( A3729XAlbRecPza),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,184);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAlbRecPza_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAlbRecPza_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(175),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1576_" + sGXsfl_175_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 185,'',false,'" + sGXsfl_175_idx + "',175)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXqualitat_Internalname,GXutil.rtrim( A11730Xqualitat),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,185);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXqualitat_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXqualitat_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(175),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1576_" + sGXsfl_175_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 186,'',false,'" + sGXsfl_175_idx + "',175)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXteler_Internalname,GXutil.rtrim( A11731Xteler),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,186);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXteler_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXteler_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(175),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1FM1576( ) ;
      GXCCtl = "Z3461XAlbRecPie_" + sGXsfl_175_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3461XAlbRecPie));
      GXCCtl = "Z3462XAlbRecAnh_" + sGXsfl_175_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3462XAlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3463XAlbRecMtr_" + sGXsfl_175_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3463XAlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3464XAlbRecKgm_" + sGXsfl_175_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3464XAlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3465XAlbRecMtU_" + sGXsfl_175_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3465XAlbRecMtU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3466XAlbRecKgU_" + sGXsfl_175_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3466XAlbRecKgU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3728XAlbRecCol_" + sGXsfl_175_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3728XAlbRecCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3729XAlbRecPza_" + sGXsfl_175_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3729XAlbRecPza));
      GXCCtl = "Z11730Xqualitat_" + sGXsfl_175_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11730Xqualitat));
      GXCCtl = "Z11731Xteler_" + sGXsfl_175_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11731Xteler));
      GXCCtl = "nRcdDeleted_1576_" + sGXsfl_175_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1576, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1576_" + sGXsfl_175_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1576, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1576_" + sGXsfl_175_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1576, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1576_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1576_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XALBRECPIE_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XALBRECANH_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecAnh_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XALBRECMTR_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XALBRECKGM_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XALBRECMTU_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecMtU_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XALBRECKGU_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecKgU_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XALBRECCOL_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XALBRECPZA_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecPza_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XQUALITAT_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXqualitat_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XTELER_"+sGXsfl_175_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXteler_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1FM1576( )
   {
      nGXsfl_175_idx = (int)(nGXsfl_175_idx+1) ;
      sGXsfl_175_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_175_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1751576( ) ;
      edtavnRcdDeleted_1576_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1576_"+sGXsfl_175_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAlbRecPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XALBRECPIE_"+sGXsfl_175_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAlbRecAnh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XALBRECANH_"+sGXsfl_175_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAlbRecMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XALBRECMTR_"+sGXsfl_175_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAlbRecKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XALBRECKGM_"+sGXsfl_175_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAlbRecMtU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XALBRECMTU_"+sGXsfl_175_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAlbRecKgU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XALBRECKGU_"+sGXsfl_175_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAlbRecCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XALBRECCOL_"+sGXsfl_175_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAlbRecPza_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XALBRECPZA_"+sGXsfl_175_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXqualitat_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XQUALITAT_"+sGXsfl_175_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXteler_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XTELER_"+sGXsfl_175_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1576_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1576_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1576");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1576_Internalname ;
         wbErr = true ;
         nRcdDeleted_1576 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1576 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1576_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A3461XAlbRecPie = httpContext.cgiGet( edtXAlbRecPie_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXAlbRecAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXAlbRecAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "XALBRECANH_" + sGXsfl_175_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAlbRecAnh_Internalname ;
         wbErr = true ;
         A3462XAlbRecAnh = (short)(0) ;
         n3462XAlbRecAnh = false ;
      }
      else
      {
         A3462XAlbRecAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtXAlbRecAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3462XAlbRecAnh = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXAlbRecMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXAlbRecMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "XALBRECMTR_" + sGXsfl_175_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAlbRecMtr_Internalname ;
         wbErr = true ;
         A3463XAlbRecMtr = DecimalUtil.ZERO ;
         n3463XAlbRecMtr = false ;
      }
      else
      {
         A3463XAlbRecMtr = localUtil.ctond( httpContext.cgiGet( edtXAlbRecMtr_Internalname)) ;
         n3463XAlbRecMtr = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXAlbRecKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXAlbRecKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "XALBRECKGM_" + sGXsfl_175_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAlbRecKgm_Internalname ;
         wbErr = true ;
         A3464XAlbRecKgm = DecimalUtil.ZERO ;
         n3464XAlbRecKgm = false ;
      }
      else
      {
         A3464XAlbRecKgm = localUtil.ctond( httpContext.cgiGet( edtXAlbRecKgm_Internalname)) ;
         n3464XAlbRecKgm = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXAlbRecMtU_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXAlbRecMtU_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "XALBRECMTU_" + sGXsfl_175_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAlbRecMtU_Internalname ;
         wbErr = true ;
         A3465XAlbRecMtU = DecimalUtil.ZERO ;
         n3465XAlbRecMtU = false ;
      }
      else
      {
         A3465XAlbRecMtU = localUtil.ctond( httpContext.cgiGet( edtXAlbRecMtU_Internalname)) ;
         n3465XAlbRecMtU = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXAlbRecKgU_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXAlbRecKgU_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "XALBRECKGU_" + sGXsfl_175_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAlbRecKgU_Internalname ;
         wbErr = true ;
         A3466XAlbRecKgU = DecimalUtil.ZERO ;
         n3466XAlbRecKgU = false ;
      }
      else
      {
         A3466XAlbRecKgU = localUtil.ctond( httpContext.cgiGet( edtXAlbRecKgU_Internalname)) ;
         n3466XAlbRecKgU = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXAlbRecCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXAlbRecCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "XALBRECCOL_" + sGXsfl_175_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAlbRecCol_Internalname ;
         wbErr = true ;
         A3728XAlbRecCol = (short)(0) ;
         n3728XAlbRecCol = false ;
      }
      else
      {
         A3728XAlbRecCol = (short)(localUtil.ctol( httpContext.cgiGet( edtXAlbRecCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3728XAlbRecCol = false ;
      }
      A3729XAlbRecPza = httpContext.cgiGet( edtXAlbRecPza_Internalname) ;
      n3729XAlbRecPza = false ;
      A11730Xqualitat = httpContext.cgiGet( edtXqualitat_Internalname) ;
      n11730Xqualitat = false ;
      A11731Xteler = httpContext.cgiGet( edtXteler_Internalname) ;
      n11731Xteler = false ;
      GXCCtl = "Z3461XAlbRecPie_" + sGXsfl_175_idx ;
      Z3461XAlbRecPie = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3462XAlbRecAnh_" + sGXsfl_175_idx ;
      Z3462XAlbRecAnh = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3463XAlbRecMtr_" + sGXsfl_175_idx ;
      Z3463XAlbRecMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3464XAlbRecKgm_" + sGXsfl_175_idx ;
      Z3464XAlbRecKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3465XAlbRecMtU_" + sGXsfl_175_idx ;
      Z3465XAlbRecMtU = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3466XAlbRecKgU_" + sGXsfl_175_idx ;
      Z3466XAlbRecKgU = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3728XAlbRecCol_" + sGXsfl_175_idx ;
      Z3728XAlbRecCol = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3729XAlbRecPza_" + sGXsfl_175_idx ;
      Z3729XAlbRecPza = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11730Xqualitat_" + sGXsfl_175_idx ;
      Z11730Xqualitat = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11731Xteler_" + sGXsfl_175_idx ;
      Z11731Xteler = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1576_" + sGXsfl_175_idx ;
      nRcdDeleted_1576 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1576_" + sGXsfl_175_idx ;
      nRcdExists_1576 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1576_" + sGXsfl_175_idx ;
      nIsMod_1576 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtXAlbRecPie_Enabled = edtXAlbRecPie_Enabled ;
   }

   public void confirmValues1FM0( )
   {
      nGXsfl_175_idx = 0 ;
      sGXsfl_175_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_175_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1751576( ) ;
      while ( nGXsfl_175_idx < nRC_GXsfl_175 )
      {
         nGXsfl_175_idx = (int)(nGXsfl_175_idx+1) ;
         sGXsfl_175_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_175_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1751576( ) ;
         httpContext.changePostValue( "Z3461XAlbRecPie_"+sGXsfl_175_idx, httpContext.cgiGet( "ZT_"+"Z3461XAlbRecPie_"+sGXsfl_175_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3461XAlbRecPie_"+sGXsfl_175_idx) ;
         httpContext.changePostValue( "Z3462XAlbRecAnh_"+sGXsfl_175_idx, httpContext.cgiGet( "ZT_"+"Z3462XAlbRecAnh_"+sGXsfl_175_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3462XAlbRecAnh_"+sGXsfl_175_idx) ;
         httpContext.changePostValue( "Z3463XAlbRecMtr_"+sGXsfl_175_idx, httpContext.cgiGet( "ZT_"+"Z3463XAlbRecMtr_"+sGXsfl_175_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3463XAlbRecMtr_"+sGXsfl_175_idx) ;
         httpContext.changePostValue( "Z3464XAlbRecKgm_"+sGXsfl_175_idx, httpContext.cgiGet( "ZT_"+"Z3464XAlbRecKgm_"+sGXsfl_175_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3464XAlbRecKgm_"+sGXsfl_175_idx) ;
         httpContext.changePostValue( "Z3465XAlbRecMtU_"+sGXsfl_175_idx, httpContext.cgiGet( "ZT_"+"Z3465XAlbRecMtU_"+sGXsfl_175_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3465XAlbRecMtU_"+sGXsfl_175_idx) ;
         httpContext.changePostValue( "Z3466XAlbRecKgU_"+sGXsfl_175_idx, httpContext.cgiGet( "ZT_"+"Z3466XAlbRecKgU_"+sGXsfl_175_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3466XAlbRecKgU_"+sGXsfl_175_idx) ;
         httpContext.changePostValue( "Z3728XAlbRecCol_"+sGXsfl_175_idx, httpContext.cgiGet( "ZT_"+"Z3728XAlbRecCol_"+sGXsfl_175_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3728XAlbRecCol_"+sGXsfl_175_idx) ;
         httpContext.changePostValue( "Z3729XAlbRecPza_"+sGXsfl_175_idx, httpContext.cgiGet( "ZT_"+"Z3729XAlbRecPza_"+sGXsfl_175_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3729XAlbRecPza_"+sGXsfl_175_idx) ;
         httpContext.changePostValue( "Z11730Xqualitat_"+sGXsfl_175_idx, httpContext.cgiGet( "ZT_"+"Z11730Xqualitat_"+sGXsfl_175_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11730Xqualitat_"+sGXsfl_175_idx) ;
         httpContext.changePostValue( "Z11731Xteler_"+sGXsfl_175_idx, httpContext.cgiGet( "ZT_"+"Z11731Xteler_"+sGXsfl_175_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11731Xteler_"+sGXsfl_175_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.talbeur", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z3436XCliCod", GXutil.ltrim( localUtil.ntoc( Z3436XCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3437XAlbRef", GXutil.rtrim( Z3437XAlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3438XTrnCod", GXutil.ltrim( localUtil.ntoc( Z3438XTrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3439XAlbREnt", GXutil.rtrim( Z3439XAlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3440XAlbRPieEn", GXutil.ltrim( localUtil.ntoc( Z3440XAlbRPieEn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3441XAlbRUni", GXutil.rtrim( Z3441XAlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3442XAlbRLoc", GXutil.rtrim( Z3442XAlbRLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3443XAlbRFen", localUtil.dtoc( Z3443XAlbRFen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3444XAlbRUniEn", GXutil.ltrim( localUtil.ntoc( Z3444XAlbRUniEn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3445XAlbRReo", GXutil.rtrim( Z3445XAlbRReo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3446XAlbRPieUt", GXutil.ltrim( localUtil.ntoc( Z3446XAlbRPieUt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3447XAlbRPieRe", GXutil.ltrim( localUtil.ntoc( Z3447XAlbRPieRe, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3448XAlbRUniUt", GXutil.ltrim( localUtil.ntoc( Z3448XAlbRUniUt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3449XAlbRUniRe", GXutil.ltrim( localUtil.ntoc( Z3449XAlbRUniRe, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3450XAlbRFecUl", localUtil.dtoc( Z3450XAlbRFecUl, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3451XAlbREst", GXutil.ltrim( localUtil.ntoc( Z3451XAlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3452XTipEntCod", GXutil.ltrim( localUtil.ntoc( Z3452XTipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3453XAlbNumEti", GXutil.ltrim( localUtil.ntoc( Z3453XAlbNumEti, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3454XAlbRDes", GXutil.rtrim( Z3454XAlbRDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3455XProceCod", GXutil.ltrim( localUtil.ntoc( Z3455XProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3456XAlbRULin", GXutil.ltrim( localUtil.ntoc( Z3456XAlbRULin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3457XHisEmpUL", GXutil.ltrim( localUtil.ntoc( Z3457XHisEmpUL, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3458XAlbRDisC", GXutil.rtrim( Z3458XAlbRDisC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3459XAlbRImp", GXutil.rtrim( Z3459XAlbRImp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3460XRutina", GXutil.rtrim( Z3460XRutina));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3828XAlbRefDsc", GXutil.rtrim( Z3828XAlbRefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8050XAlbRefCom", GXutil.rtrim( Z8050XAlbRefCom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11729Xprioritat", GXutil.ltrim( localUtil.ntoc( Z11729Xprioritat, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_175", GXutil.ltrim( localUtil.ntoc( nGXsfl_175_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.talbeur", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TALBEUR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TRASPASO ALBARANES ENTRADA", "") ;
   }

   public void initializeNonKey1FM493( )
   {
      A3436XCliCod = 0 ;
      n3436XCliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3436XCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3436XCliCod), 6, 0));
      A3437XAlbRef = "" ;
      n3437XAlbRef = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3437XAlbRef", A3437XAlbRef);
      A3438XTrnCod = (short)(0) ;
      n3438XTrnCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3438XTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3438XTrnCod), 4, 0));
      A3439XAlbREnt = "" ;
      n3439XAlbREnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3439XAlbREnt", A3439XAlbREnt);
      A3440XAlbRPieEn = (short)(0) ;
      n3440XAlbRPieEn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3440XAlbRPieEn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3440XAlbRPieEn), 4, 0));
      A3441XAlbRUni = "" ;
      n3441XAlbRUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3441XAlbRUni", A3441XAlbRUni);
      A3442XAlbRLoc = "" ;
      n3442XAlbRLoc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3442XAlbRLoc", A3442XAlbRLoc);
      A3443XAlbRFen = GXutil.nullDate() ;
      n3443XAlbRFen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3443XAlbRFen", localUtil.format(A3443XAlbRFen, "99/99/99"));
      A3444XAlbRUniEn = DecimalUtil.ZERO ;
      n3444XAlbRUniEn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3444XAlbRUniEn", GXutil.ltrimstr( A3444XAlbRUniEn, 9, 2));
      A3445XAlbRReo = "" ;
      n3445XAlbRReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3445XAlbRReo", A3445XAlbRReo);
      A3446XAlbRPieUt = (short)(0) ;
      n3446XAlbRPieUt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3446XAlbRPieUt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3446XAlbRPieUt), 4, 0));
      A3447XAlbRPieRe = (short)(0) ;
      n3447XAlbRPieRe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3447XAlbRPieRe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3447XAlbRPieRe), 4, 0));
      A3448XAlbRUniUt = DecimalUtil.ZERO ;
      n3448XAlbRUniUt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3448XAlbRUniUt", GXutil.ltrimstr( A3448XAlbRUniUt, 9, 2));
      A3449XAlbRUniRe = DecimalUtil.ZERO ;
      n3449XAlbRUniRe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3449XAlbRUniRe", GXutil.ltrimstr( A3449XAlbRUniRe, 9, 2));
      A3450XAlbRFecUl = GXutil.nullDate() ;
      n3450XAlbRFecUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3450XAlbRFecUl", localUtil.format(A3450XAlbRFecUl, "99/99/99"));
      A3451XAlbREst = (byte)(0) ;
      n3451XAlbREst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3451XAlbREst", GXutil.str( A3451XAlbREst, 1, 0));
      A3452XTipEntCod = (short)(0) ;
      n3452XTipEntCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3452XTipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3452XTipEntCod), 4, 0));
      A3453XAlbNumEti = (short)(0) ;
      n3453XAlbNumEti = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3453XAlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3453XAlbNumEti), 4, 0));
      A3454XAlbRDes = "" ;
      n3454XAlbRDes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3454XAlbRDes", A3454XAlbRDes);
      A3455XProceCod = (short)(0) ;
      n3455XProceCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3455XProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3455XProceCod), 4, 0));
      A3456XAlbRULin = (byte)(0) ;
      n3456XAlbRULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3456XAlbRULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3456XAlbRULin), 2, 0));
      A3457XHisEmpUL = (short)(0) ;
      n3457XHisEmpUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3457XHisEmpUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3457XHisEmpUL), 3, 0));
      A3458XAlbRDisC = "" ;
      n3458XAlbRDisC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3458XAlbRDisC", A3458XAlbRDisC);
      A3459XAlbRImp = "" ;
      n3459XAlbRImp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3459XAlbRImp", A3459XAlbRImp);
      A3460XRutina = "" ;
      n3460XRutina = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3460XRutina", A3460XRutina);
      A3828XAlbRefDsc = "" ;
      n3828XAlbRefDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3828XAlbRefDsc", A3828XAlbRefDsc);
      A8050XAlbRefCom = "" ;
      n8050XAlbRefCom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8050XAlbRefCom", A8050XAlbRefCom);
      A11729Xprioritat = (byte)(0) ;
      n11729Xprioritat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11729Xprioritat", GXutil.str( A11729Xprioritat, 1, 0));
      Z3436XCliCod = 0 ;
      Z3437XAlbRef = "" ;
      Z3438XTrnCod = (short)(0) ;
      Z3439XAlbREnt = "" ;
      Z3440XAlbRPieEn = (short)(0) ;
      Z3441XAlbRUni = "" ;
      Z3442XAlbRLoc = "" ;
      Z3443XAlbRFen = GXutil.nullDate() ;
      Z3444XAlbRUniEn = DecimalUtil.ZERO ;
      Z3445XAlbRReo = "" ;
      Z3446XAlbRPieUt = (short)(0) ;
      Z3447XAlbRPieRe = (short)(0) ;
      Z3448XAlbRUniUt = DecimalUtil.ZERO ;
      Z3449XAlbRUniRe = DecimalUtil.ZERO ;
      Z3450XAlbRFecUl = GXutil.nullDate() ;
      Z3451XAlbREst = (byte)(0) ;
      Z3452XTipEntCod = (short)(0) ;
      Z3453XAlbNumEti = (short)(0) ;
      Z3454XAlbRDes = "" ;
      Z3455XProceCod = (short)(0) ;
      Z3456XAlbRULin = (byte)(0) ;
      Z3457XHisEmpUL = (short)(0) ;
      Z3458XAlbRDisC = "" ;
      Z3459XAlbRImp = "" ;
      Z3460XRutina = "" ;
      Z3828XAlbRefDsc = "" ;
      Z8050XAlbRefCom = "" ;
      Z11729Xprioritat = (byte)(0) ;
   }

   public void initAll1FM493( )
   {
      A3435XAlbRecCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3435XAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3435XAlbRecCod), 8, 0));
      initializeNonKey1FM493( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1FM1576( )
   {
      A3462XAlbRecAnh = (short)(0) ;
      n3462XAlbRecAnh = false ;
      A3463XAlbRecMtr = DecimalUtil.ZERO ;
      n3463XAlbRecMtr = false ;
      A3464XAlbRecKgm = DecimalUtil.ZERO ;
      n3464XAlbRecKgm = false ;
      A3465XAlbRecMtU = DecimalUtil.ZERO ;
      n3465XAlbRecMtU = false ;
      A3466XAlbRecKgU = DecimalUtil.ZERO ;
      n3466XAlbRecKgU = false ;
      A3728XAlbRecCol = (short)(0) ;
      n3728XAlbRecCol = false ;
      A3729XAlbRecPza = "" ;
      n3729XAlbRecPza = false ;
      A11730Xqualitat = "" ;
      n11730Xqualitat = false ;
      A11731Xteler = "" ;
      n11731Xteler = false ;
      Z3462XAlbRecAnh = (short)(0) ;
      Z3463XAlbRecMtr = DecimalUtil.ZERO ;
      Z3464XAlbRecKgm = DecimalUtil.ZERO ;
      Z3465XAlbRecMtU = DecimalUtil.ZERO ;
      Z3466XAlbRecKgU = DecimalUtil.ZERO ;
      Z3728XAlbRecCol = (short)(0) ;
      Z3729XAlbRecPza = "" ;
      Z11730Xqualitat = "" ;
      Z11731Xteler = "" ;
   }

   public void initAll1FM1576( )
   {
      A3461XAlbRecPie = "" ;
      initializeNonKey1FM1576( ) ;
   }

   public void standaloneModalInsert1FM1576( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824157248", true, true);
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
      httpContext.AddJavascriptSource("talbeur.js", "?2026824157248", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1576( )
   {
      edtXAlbRecPie_Enabled = defedtXAlbRecPie_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAlbRecPie_Enabled), 5, 0), !bGXsfl_175_Refreshing);
   }

   public void startgridcontrol175( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1576, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1576_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3461XAlbRecPie));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3462XAlbRecAnh, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecAnh_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3463XAlbRecMtr, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3464XAlbRecKgm, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3465XAlbRecMtU, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecMtU_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3466XAlbRecKgU, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecKgU_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3728XAlbRecCol, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3729XAlbRecPza));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAlbRecPza_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11730Xqualitat));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXqualitat_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11731Xteler));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXteler_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtXCliCod_Internalname = "XCLICOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtXAlbRef_Internalname = "XALBREF" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtXTrnCod_Internalname = "XTRNCOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtXAlbREnt_Internalname = "XALBRENT" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtXAlbRPieEn_Internalname = "XALBRPIEEN" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtXAlbRUni_Internalname = "XALBRUNI" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtXAlbRLoc_Internalname = "XALBRLOC" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtXAlbRFen_Internalname = "XALBRFEN" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtXAlbRUniEn_Internalname = "XALBRUNIEN" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtXAlbRReo_Internalname = "XALBRREO" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtXAlbRPieUt_Internalname = "XALBRPIEUT" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtXAlbRPieRe_Internalname = "XALBRPIERE" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtXAlbRUniUt_Internalname = "XALBRUNIUT" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtXAlbRUniRe_Internalname = "XALBRUNIRE" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtXAlbRFecUl_Internalname = "XALBRFECUL" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtXAlbREst_Internalname = "XALBREST" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtXTipEntCod_Internalname = "XTIPENTCOD" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtXAlbNumEti_Internalname = "XALBNUMETI" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtXAlbRDes_Internalname = "XALBRDES" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtXProceCod_Internalname = "XPROCECOD" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtXAlbRULin_Internalname = "XALBRULIN" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtXHisEmpUL_Internalname = "XHISEMPUL" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtXAlbRDisC_Internalname = "XALBRDISC" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtXAlbRImp_Internalname = "XALBRIMP" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtXRutina_Internalname = "XRUTINA" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtXAlbRefDsc_Internalname = "XALBREFDSC" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtXAlbRefCom_Internalname = "XALBREFCOM" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtXprioritat_Internalname = "XPRIORITAT" ;
      edtavnRcdDeleted_1576_Internalname = "vNRCDDELETED_1576" ;
      edtXAlbRecPie_Internalname = "XALBRECPIE" ;
      edtXAlbRecAnh_Internalname = "XALBRECANH" ;
      edtXAlbRecMtr_Internalname = "XALBRECMTR" ;
      edtXAlbRecKgm_Internalname = "XALBRECKGM" ;
      edtXAlbRecMtU_Internalname = "XALBRECMTU" ;
      edtXAlbRecKgU_Internalname = "XALBRECKGU" ;
      edtXAlbRecCol_Internalname = "XALBRECCOL" ;
      edtXAlbRecPza_Internalname = "XALBRECPZA" ;
      edtXqualitat_Internalname = "XQUALITAT" ;
      edtXteler_Internalname = "XTELER" ;
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
      edtXteler_Jsonclick = "" ;
      edtXqualitat_Jsonclick = "" ;
      edtXAlbRecPza_Jsonclick = "" ;
      edtXAlbRecCol_Jsonclick = "" ;
      edtXAlbRecKgU_Jsonclick = "" ;
      edtXAlbRecMtU_Jsonclick = "" ;
      edtXAlbRecKgm_Jsonclick = "" ;
      edtXAlbRecMtr_Jsonclick = "" ;
      edtXAlbRecAnh_Jsonclick = "" ;
      edtXAlbRecPie_Jsonclick = "" ;
      edtavnRcdDeleted_1576_Jsonclick = "" ;
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
      edtXteler_Enabled = 1 ;
      edtXqualitat_Enabled = 1 ;
      edtXAlbRecPza_Enabled = 1 ;
      edtXAlbRecCol_Enabled = 1 ;
      edtXAlbRecKgU_Enabled = 1 ;
      edtXAlbRecMtU_Enabled = 1 ;
      edtXAlbRecKgm_Enabled = 1 ;
      edtXAlbRecMtr_Enabled = 1 ;
      edtXAlbRecAnh_Enabled = 1 ;
      edtXAlbRecPie_Enabled = 1 ;
      edtavnRcdDeleted_1576_Enabled = 1 ;
      edtXprioritat_Jsonclick = "" ;
      edtXprioritat_Backcolor = (int)(0xFFFFFF) ;
      edtXprioritat_Enabled = 1 ;
      edtXAlbRefCom_Jsonclick = "" ;
      edtXAlbRefCom_Backcolor = (int)(0xFFFFFF) ;
      edtXAlbRefCom_Enabled = 1 ;
      edtXAlbRefDsc_Jsonclick = "" ;
      edtXAlbRefDsc_Backcolor = (int)(0xFFFFFF) ;
      edtXAlbRefDsc_Enabled = 1 ;
      edtXRutina_Jsonclick = "" ;
      edtXRutina_Backcolor = (int)(0xFFFFFF) ;
      edtXRutina_Enabled = 1 ;
      edtXAlbRImp_Jsonclick = "" ;
      edtXAlbRImp_Backcolor = (int)(0xFFFFFF) ;
      edtXAlbRImp_Enabled = 1 ;
      edtXAlbRDisC_Jsonclick = "" ;
      edtXAlbRDisC_Backcolor = (int)(0xFFFFFF) ;
      edtXAlbRDisC_Enabled = 1 ;
      edtXHisEmpUL_Jsonclick = "" ;
      edtXHisEmpUL_Backcolor = (int)(0xFFFFFF) ;
      edtXHisEmpUL_Enabled = 1 ;
      edtXAlbRULin_Jsonclick = "" ;
      edtXAlbRULin_Backcolor = (int)(0xFFFFFF) ;
      edtXAlbRULin_Enabled = 1 ;
      edtXProceCod_Jsonclick = "" ;
      edtXProceCod_Backcolor = (int)(0xFFFFFF) ;
      edtXProceCod_Enabled = 1 ;
      edtXAlbRDes_Jsonclick = "" ;
      edtXAlbRDes_Backcolor = (int)(0xFFFFFF) ;
      edtXAlbRDes_Enabled = 1 ;
      edtXAlbNumEti_Jsonclick = "" ;
      edtXAlbNumEti_Backcolor = (int)(0xFFFFFF) ;
      edtXAlbNumEti_Enabled = 1 ;
      edtXTipEntCod_Jsonclick = "" ;
      edtXTipEntCod_Backcolor = (int)(0xFFFFFF) ;
      edtXTipEntCod_Enabled = 1 ;
      edtXAlbREst_Jsonclick = "" ;
      edtXAlbREst_Backcolor = (int)(0xFFFFFF) ;
      edtXAlbREst_Enabled = 1 ;
      edtXAlbRFecUl_Jsonclick = "" ;
      edtXAlbRFecUl_Backcolor = (int)(0xFFFFFF) ;
      edtXAlbRFecUl_Enabled = 1 ;
      edtXAlbRUniRe_Jsonclick = "" ;
      edtXAlbRUniRe_Backcolor = (int)(0xFFFFFF) ;
      edtXAlbRUniRe_Enabled = 1 ;
      edtXAlbRUniUt_Jsonclick = "" ;
      edtXAlbRUniUt_Backcolor = (int)(0xFFFFFF) ;
      edtXAlbRUniUt_Enabled = 1 ;
      edtXAlbRPieRe_Jsonclick = "" ;
      edtXAlbRPieRe_Backcolor = (int)(0xFFFFFF) ;
      edtXAlbRPieRe_Enabled = 1 ;
      edtXAlbRPieUt_Jsonclick = "" ;
      edtXAlbRPieUt_Backcolor = (int)(0xFFFFFF) ;
      edtXAlbRPieUt_Enabled = 1 ;
      edtXAlbRReo_Jsonclick = "" ;
      edtXAlbRReo_Backcolor = (int)(0xFFFFFF) ;
      edtXAlbRReo_Enabled = 1 ;
      edtXAlbRUniEn_Jsonclick = "" ;
      edtXAlbRUniEn_Backcolor = (int)(0xFFFFFF) ;
      edtXAlbRUniEn_Enabled = 1 ;
      edtXAlbRFen_Jsonclick = "" ;
      edtXAlbRFen_Backcolor = (int)(0xFFFFFF) ;
      edtXAlbRFen_Enabled = 1 ;
      edtXAlbRLoc_Jsonclick = "" ;
      edtXAlbRLoc_Backcolor = (int)(0xFFFFFF) ;
      edtXAlbRLoc_Enabled = 1 ;
      edtXAlbRUni_Jsonclick = "" ;
      edtXAlbRUni_Backcolor = (int)(0xFFFFFF) ;
      edtXAlbRUni_Enabled = 1 ;
      edtXAlbRPieEn_Jsonclick = "" ;
      edtXAlbRPieEn_Backcolor = (int)(0xFFFFFF) ;
      edtXAlbRPieEn_Enabled = 1 ;
      edtXAlbREnt_Jsonclick = "" ;
      edtXAlbREnt_Backcolor = (int)(0xFFFFFF) ;
      edtXAlbREnt_Enabled = 1 ;
      edtXTrnCod_Jsonclick = "" ;
      edtXTrnCod_Backcolor = (int)(0xFFFFFF) ;
      edtXTrnCod_Enabled = 1 ;
      edtXAlbRef_Jsonclick = "" ;
      edtXAlbRef_Backcolor = (int)(0xFFFFFF) ;
      edtXAlbRef_Enabled = 1 ;
      edtXCliCod_Jsonclick = "" ;
      edtXCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtXCliCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtXAlbRecCod_Jsonclick = "" ;
      edtXAlbRecCod_Backcolor = (int)(0xFFFFFF) ;
      edtXAlbRecCod_Enabled = 1 ;
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
      subsflControlProps_1751576( ) ;
      while ( nGXsfl_175_idx <= nRC_GXsfl_175 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1FM1576( ) ;
         standaloneModal1FM1576( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1FM1576( ) ;
         nGXsfl_175_idx = (int)(nGXsfl_175_idx+1) ;
         sGXsfl_175_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_175_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1751576( ) ;
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
      /* Using cursor T01FM23 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FM23_A407EmprNom[0] ;
      n407EmprNom = T01FM23_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(21);
      GX_FocusControl = edtXCliCod_Internalname ;
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
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3436XCliCod", GXutil.ltrim( localUtil.ntoc( A3436XCliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3437XAlbRef", GXutil.rtrim( A3437XAlbRef));
      httpContext.ajax_rsp_assign_attri("", false, "A3438XTrnCod", GXutil.ltrim( localUtil.ntoc( A3438XTrnCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3439XAlbREnt", GXutil.rtrim( A3439XAlbREnt));
      httpContext.ajax_rsp_assign_attri("", false, "A3440XAlbRPieEn", GXutil.ltrim( localUtil.ntoc( A3440XAlbRPieEn, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3441XAlbRUni", GXutil.rtrim( A3441XAlbRUni));
      httpContext.ajax_rsp_assign_attri("", false, "A3442XAlbRLoc", GXutil.rtrim( A3442XAlbRLoc));
      httpContext.ajax_rsp_assign_attri("", false, "A3443XAlbRFen", localUtil.format(A3443XAlbRFen, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A3444XAlbRUniEn", GXutil.ltrim( localUtil.ntoc( A3444XAlbRUniEn, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3445XAlbRReo", GXutil.rtrim( A3445XAlbRReo));
      httpContext.ajax_rsp_assign_attri("", false, "A3446XAlbRPieUt", GXutil.ltrim( localUtil.ntoc( A3446XAlbRPieUt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3447XAlbRPieRe", GXutil.ltrim( localUtil.ntoc( A3447XAlbRPieRe, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3448XAlbRUniUt", GXutil.ltrim( localUtil.ntoc( A3448XAlbRUniUt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3449XAlbRUniRe", GXutil.ltrim( localUtil.ntoc( A3449XAlbRUniRe, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3450XAlbRFecUl", localUtil.format(A3450XAlbRFecUl, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A3451XAlbREst", GXutil.ltrim( localUtil.ntoc( A3451XAlbREst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3452XTipEntCod", GXutil.ltrim( localUtil.ntoc( A3452XTipEntCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3453XAlbNumEti", GXutil.ltrim( localUtil.ntoc( A3453XAlbNumEti, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3454XAlbRDes", GXutil.rtrim( A3454XAlbRDes));
      httpContext.ajax_rsp_assign_attri("", false, "A3455XProceCod", GXutil.ltrim( localUtil.ntoc( A3455XProceCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3456XAlbRULin", GXutil.ltrim( localUtil.ntoc( A3456XAlbRULin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3457XHisEmpUL", GXutil.ltrim( localUtil.ntoc( A3457XHisEmpUL, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3458XAlbRDisC", GXutil.rtrim( A3458XAlbRDisC));
      httpContext.ajax_rsp_assign_attri("", false, "A3459XAlbRImp", GXutil.rtrim( A3459XAlbRImp));
      httpContext.ajax_rsp_assign_attri("", false, "A3460XRutina", GXutil.rtrim( A3460XRutina));
      httpContext.ajax_rsp_assign_attri("", false, "A3828XAlbRefDsc", GXutil.rtrim( A3828XAlbRefDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A8050XAlbRefCom", GXutil.rtrim( A8050XAlbRefCom));
      httpContext.ajax_rsp_assign_attri("", false, "A11729Xprioritat", GXutil.ltrim( localUtil.ntoc( A11729Xprioritat, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", GXutil.rtrim( AV17UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3435XAlbRecCod", GXutil.ltrim( localUtil.ntoc( Z3435XAlbRecCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3436XCliCod", GXutil.ltrim( localUtil.ntoc( Z3436XCliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3437XAlbRef", GXutil.rtrim( Z3437XAlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3438XTrnCod", GXutil.ltrim( localUtil.ntoc( Z3438XTrnCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3439XAlbREnt", GXutil.rtrim( Z3439XAlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3440XAlbRPieEn", GXutil.ltrim( localUtil.ntoc( Z3440XAlbRPieEn, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3441XAlbRUni", GXutil.rtrim( Z3441XAlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3442XAlbRLoc", GXutil.rtrim( Z3442XAlbRLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3443XAlbRFen", localUtil.format(Z3443XAlbRFen, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3444XAlbRUniEn", GXutil.ltrim( localUtil.ntoc( Z3444XAlbRUniEn, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3445XAlbRReo", GXutil.rtrim( Z3445XAlbRReo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3446XAlbRPieUt", GXutil.ltrim( localUtil.ntoc( Z3446XAlbRPieUt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3447XAlbRPieRe", GXutil.ltrim( localUtil.ntoc( Z3447XAlbRPieRe, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3448XAlbRUniUt", GXutil.ltrim( localUtil.ntoc( Z3448XAlbRUniUt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3449XAlbRUniRe", GXutil.ltrim( localUtil.ntoc( Z3449XAlbRUniRe, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3450XAlbRFecUl", localUtil.format(Z3450XAlbRFecUl, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3451XAlbREst", GXutil.ltrim( localUtil.ntoc( Z3451XAlbREst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3452XTipEntCod", GXutil.ltrim( localUtil.ntoc( Z3452XTipEntCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3453XAlbNumEti", GXutil.ltrim( localUtil.ntoc( Z3453XAlbNumEti, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3454XAlbRDes", GXutil.rtrim( Z3454XAlbRDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3455XProceCod", GXutil.ltrim( localUtil.ntoc( Z3455XProceCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3456XAlbRULin", GXutil.ltrim( localUtil.ntoc( Z3456XAlbRULin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3457XHisEmpUL", GXutil.ltrim( localUtil.ntoc( Z3457XHisEmpUL, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3458XAlbRDisC", GXutil.rtrim( Z3458XAlbRDisC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3459XAlbRImp", GXutil.rtrim( Z3459XAlbRImp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3460XRutina", GXutil.rtrim( Z3460XRutina));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3828XAlbRefDsc", GXutil.rtrim( Z3828XAlbRefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8050XAlbRefCom", GXutil.rtrim( Z8050XAlbRefCom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11729Xprioritat", GXutil.ltrim( localUtil.ntoc( Z11729Xprioritat, (byte)(1), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_XALBRECCOD","{handler:'valid_Xalbreccod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3435XAlbRecCod',fld:'XALBRECCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("VALID_XALBRECCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3436XCliCod',fld:'XCLICOD',pic:'ZZZZZ9'},{av:'A3437XAlbRef',fld:'XALBREF',pic:''},{av:'A3438XTrnCod',fld:'XTRNCOD',pic:'ZZZ9'},{av:'A3439XAlbREnt',fld:'XALBRENT',pic:''},{av:'A3440XAlbRPieEn',fld:'XALBRPIEEN',pic:'ZZZ9'},{av:'A3441XAlbRUni',fld:'XALBRUNI',pic:'@!'},{av:'A3442XAlbRLoc',fld:'XALBRLOC',pic:''},{av:'A3443XAlbRFen',fld:'XALBRFEN',pic:''},{av:'A3444XAlbRUniEn',fld:'XALBRUNIEN',pic:'ZZZZZ9.99'},{av:'A3445XAlbRReo',fld:'XALBRREO',pic:'@!'},{av:'A3446XAlbRPieUt',fld:'XALBRPIEUT',pic:'ZZZ9'},{av:'A3447XAlbRPieRe',fld:'XALBRPIERE',pic:'ZZZ9'},{av:'A3448XAlbRUniUt',fld:'XALBRUNIUT',pic:'ZZZZZ9.99'},{av:'A3449XAlbRUniRe',fld:'XALBRUNIRE',pic:'ZZZZZ9.99'},{av:'A3450XAlbRFecUl',fld:'XALBRFECUL',pic:''},{av:'A3451XAlbREst',fld:'XALBREST',pic:'9'},{av:'A3452XTipEntCod',fld:'XTIPENTCOD',pic:'ZZZ9'},{av:'A3453XAlbNumEti',fld:'XALBNUMETI',pic:'ZZZ9'},{av:'A3454XAlbRDes',fld:'XALBRDES',pic:''},{av:'A3455XProceCod',fld:'XPROCECOD',pic:'ZZZ9'},{av:'A3456XAlbRULin',fld:'XALBRULIN',pic:'Z9'},{av:'A3457XHisEmpUL',fld:'XHISEMPUL',pic:'ZZ9'},{av:'A3458XAlbRDisC',fld:'XALBRDISC',pic:''},{av:'A3459XAlbRImp',fld:'XALBRIMP',pic:'@!'},{av:'A3460XRutina',fld:'XRUTINA',pic:''},{av:'A3828XAlbRefDsc',fld:'XALBREFDSC',pic:''},{av:'A8050XAlbRefCom',fld:'XALBREFCOM',pic:''},{av:'A11729Xprioritat',fld:'XPRIORITAT',pic:'9'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z3435XAlbRecCod'},{av:'Z407EmprNom'},{av:'Z3436XCliCod'},{av:'Z3437XAlbRef'},{av:'Z3438XTrnCod'},{av:'Z3439XAlbREnt'},{av:'Z3440XAlbRPieEn'},{av:'Z3441XAlbRUni'},{av:'Z3442XAlbRLoc'},{av:'Z3443XAlbRFen'},{av:'Z3444XAlbRUniEn'},{av:'Z3445XAlbRReo'},{av:'Z3446XAlbRPieUt'},{av:'Z3447XAlbRPieRe'},{av:'Z3448XAlbRUniUt'},{av:'Z3449XAlbRUniRe'},{av:'Z3450XAlbRFecUl'},{av:'Z3451XAlbREst'},{av:'Z3452XTipEntCod'},{av:'Z3453XAlbNumEti'},{av:'Z3454XAlbRDes'},{av:'Z3455XProceCod'},{av:'Z3456XAlbRULin'},{av:'Z3457XHisEmpUL'},{av:'Z3458XAlbRDisC'},{av:'Z3459XAlbRImp'},{av:'Z3460XRutina'},{av:'Z3828XAlbRefDsc'},{av:'Z8050XAlbRefCom'},{av:'Z11729Xprioritat'},{av:'ZV17UsurCod'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_XALBRUNI","{handler:'valid_Xalbruni',iparms:[]");
      setEventMetadata("VALID_XALBRUNI",",oparms:[]}");
      setEventMetadata("VALID_XALBRREO","{handler:'valid_Xalbrreo',iparms:[]");
      setEventMetadata("VALID_XALBRREO",",oparms:[]}");
      setEventMetadata("VALID_XALBREST","{handler:'valid_Xalbrest',iparms:[]");
      setEventMetadata("VALID_XALBREST",",oparms:[]}");
      setEventMetadata("VALID_XALBRIMP","{handler:'valid_Xalbrimp',iparms:[]");
      setEventMetadata("VALID_XALBRIMP",",oparms:[]}");
      setEventMetadata("VALID_XALBRECPIE","{handler:'valid_Xalbrecpie',iparms:[]");
      setEventMetadata("VALID_XALBRECPIE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Xteler',iparms:[]");
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
      pr_default.close(21);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z3437XAlbRef = "" ;
      Z3439XAlbREnt = "" ;
      Z3441XAlbRUni = "" ;
      Z3442XAlbRLoc = "" ;
      Z3443XAlbRFen = GXutil.nullDate() ;
      Z3444XAlbRUniEn = DecimalUtil.ZERO ;
      Z3445XAlbRReo = "" ;
      Z3448XAlbRUniUt = DecimalUtil.ZERO ;
      Z3449XAlbRUniRe = DecimalUtil.ZERO ;
      Z3450XAlbRFecUl = GXutil.nullDate() ;
      Z3454XAlbRDes = "" ;
      Z3458XAlbRDisC = "" ;
      Z3459XAlbRImp = "" ;
      Z3460XRutina = "" ;
      Z3828XAlbRefDsc = "" ;
      Z8050XAlbRefCom = "" ;
      Z3461XAlbRecPie = "" ;
      Z3463XAlbRecMtr = DecimalUtil.ZERO ;
      Z3464XAlbRecKgm = DecimalUtil.ZERO ;
      Z3465XAlbRecMtU = DecimalUtil.ZERO ;
      Z3466XAlbRecKgU = DecimalUtil.ZERO ;
      Z3729XAlbRecPza = "" ;
      Z11730Xqualitat = "" ;
      Z11731Xteler = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A3437XAlbRef = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A3439XAlbREnt = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A3441XAlbRUni = "" ;
      lblTextblock10_Jsonclick = "" ;
      A3442XAlbRLoc = "" ;
      lblTextblock11_Jsonclick = "" ;
      A3443XAlbRFen = GXutil.nullDate() ;
      lblTextblock12_Jsonclick = "" ;
      A3444XAlbRUniEn = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      A3445XAlbRReo = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      A3448XAlbRUniUt = DecimalUtil.ZERO ;
      lblTextblock17_Jsonclick = "" ;
      A3449XAlbRUniRe = DecimalUtil.ZERO ;
      lblTextblock18_Jsonclick = "" ;
      A3450XAlbRFecUl = GXutil.nullDate() ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      A3454XAlbRDes = "" ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      A3458XAlbRDisC = "" ;
      lblTextblock27_Jsonclick = "" ;
      A3459XAlbRImp = "" ;
      lblTextblock28_Jsonclick = "" ;
      A3460XRutina = "" ;
      lblTextblock29_Jsonclick = "" ;
      A3828XAlbRefDsc = "" ;
      lblTextblock30_Jsonclick = "" ;
      A8050XAlbRefCom = "" ;
      lblTextblock31_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1576 = "" ;
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
      sMode493 = "" ;
      GXCCtl = "" ;
      A3461XAlbRecPie = "" ;
      A3463XAlbRecMtr = DecimalUtil.ZERO ;
      A3464XAlbRecKgm = DecimalUtil.ZERO ;
      A3465XAlbRecMtU = DecimalUtil.ZERO ;
      A3466XAlbRecKgU = DecimalUtil.ZERO ;
      A3729XAlbRecPza = "" ;
      A11730Xqualitat = "" ;
      A11731Xteler = "" ;
      AV38Station = "" ;
      GXv_char1 = new String[1] ;
      AV16EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV19Lit0 = "" ;
      AV39LitFe = "" ;
      AV20Lit1 = "" ;
      AV21Lit2 = "" ;
      AV22Lit3 = "" ;
      AV23Lit4 = "" ;
      AV24Lit5 = "" ;
      AV25Lit6 = "" ;
      AV26Lit7 = "" ;
      AV27Lit8 = "" ;
      AV28Lit9 = "" ;
      AV29Lit10 = "" ;
      AV30Lit11 = "" ;
      AV31Lit12 = "" ;
      AV32Lit13 = "" ;
      AV33Lit14 = "" ;
      AV34Lit15 = "" ;
      AV35Lit16 = "" ;
      AV36Lit17 = "" ;
      AV37Lit18 = "" ;
      AV40lit19 = "" ;
      AV41lit20 = "" ;
      AV42lit21 = "" ;
      AV44lit23 = "" ;
      AV45Lit24 = "" ;
      AV48Lit25 = "" ;
      AV49Lit26 = "" ;
      GXt_char4 = "" ;
      GXv_char3 = new String[1] ;
      Z407EmprNom = "" ;
      T01FM6_A407EmprNom = new String[] {""} ;
      T01FM6_n407EmprNom = new boolean[] {false} ;
      T01FM7_A3435XAlbRecCod = new int[1] ;
      T01FM7_A407EmprNom = new String[] {""} ;
      T01FM7_n407EmprNom = new boolean[] {false} ;
      T01FM7_A3436XCliCod = new int[1] ;
      T01FM7_n3436XCliCod = new boolean[] {false} ;
      T01FM7_A3437XAlbRef = new String[] {""} ;
      T01FM7_n3437XAlbRef = new boolean[] {false} ;
      T01FM7_A3438XTrnCod = new short[1] ;
      T01FM7_n3438XTrnCod = new boolean[] {false} ;
      T01FM7_A3439XAlbREnt = new String[] {""} ;
      T01FM7_n3439XAlbREnt = new boolean[] {false} ;
      T01FM7_A3440XAlbRPieEn = new short[1] ;
      T01FM7_n3440XAlbRPieEn = new boolean[] {false} ;
      T01FM7_A3441XAlbRUni = new String[] {""} ;
      T01FM7_n3441XAlbRUni = new boolean[] {false} ;
      T01FM7_A3442XAlbRLoc = new String[] {""} ;
      T01FM7_n3442XAlbRLoc = new boolean[] {false} ;
      T01FM7_A3443XAlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T01FM7_n3443XAlbRFen = new boolean[] {false} ;
      T01FM7_A3444XAlbRUniEn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FM7_n3444XAlbRUniEn = new boolean[] {false} ;
      T01FM7_A3445XAlbRReo = new String[] {""} ;
      T01FM7_n3445XAlbRReo = new boolean[] {false} ;
      T01FM7_A3446XAlbRPieUt = new short[1] ;
      T01FM7_n3446XAlbRPieUt = new boolean[] {false} ;
      T01FM7_A3447XAlbRPieRe = new short[1] ;
      T01FM7_n3447XAlbRPieRe = new boolean[] {false} ;
      T01FM7_A3448XAlbRUniUt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FM7_n3448XAlbRUniUt = new boolean[] {false} ;
      T01FM7_A3449XAlbRUniRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FM7_n3449XAlbRUniRe = new boolean[] {false} ;
      T01FM7_A3450XAlbRFecUl = new java.util.Date[] {GXutil.nullDate()} ;
      T01FM7_n3450XAlbRFecUl = new boolean[] {false} ;
      T01FM7_A3451XAlbREst = new byte[1] ;
      T01FM7_n3451XAlbREst = new boolean[] {false} ;
      T01FM7_A3452XTipEntCod = new short[1] ;
      T01FM7_n3452XTipEntCod = new boolean[] {false} ;
      T01FM7_A3453XAlbNumEti = new short[1] ;
      T01FM7_n3453XAlbNumEti = new boolean[] {false} ;
      T01FM7_A3454XAlbRDes = new String[] {""} ;
      T01FM7_n3454XAlbRDes = new boolean[] {false} ;
      T01FM7_A3455XProceCod = new short[1] ;
      T01FM7_n3455XProceCod = new boolean[] {false} ;
      T01FM7_A3456XAlbRULin = new byte[1] ;
      T01FM7_n3456XAlbRULin = new boolean[] {false} ;
      T01FM7_A3457XHisEmpUL = new short[1] ;
      T01FM7_n3457XHisEmpUL = new boolean[] {false} ;
      T01FM7_A3458XAlbRDisC = new String[] {""} ;
      T01FM7_n3458XAlbRDisC = new boolean[] {false} ;
      T01FM7_A3459XAlbRImp = new String[] {""} ;
      T01FM7_n3459XAlbRImp = new boolean[] {false} ;
      T01FM7_A3460XRutina = new String[] {""} ;
      T01FM7_n3460XRutina = new boolean[] {false} ;
      T01FM7_A3828XAlbRefDsc = new String[] {""} ;
      T01FM7_n3828XAlbRefDsc = new boolean[] {false} ;
      T01FM7_A8050XAlbRefCom = new String[] {""} ;
      T01FM7_n8050XAlbRefCom = new boolean[] {false} ;
      T01FM7_A11729Xprioritat = new byte[1] ;
      T01FM7_n11729Xprioritat = new boolean[] {false} ;
      T01FM7_A396EmprCod = new String[] {""} ;
      T01FM8_A396EmprCod = new String[] {""} ;
      T01FM8_A3435XAlbRecCod = new int[1] ;
      T01FM5_A3435XAlbRecCod = new int[1] ;
      T01FM5_A3436XCliCod = new int[1] ;
      T01FM5_n3436XCliCod = new boolean[] {false} ;
      T01FM5_A3437XAlbRef = new String[] {""} ;
      T01FM5_n3437XAlbRef = new boolean[] {false} ;
      T01FM5_A3438XTrnCod = new short[1] ;
      T01FM5_n3438XTrnCod = new boolean[] {false} ;
      T01FM5_A3439XAlbREnt = new String[] {""} ;
      T01FM5_n3439XAlbREnt = new boolean[] {false} ;
      T01FM5_A3440XAlbRPieEn = new short[1] ;
      T01FM5_n3440XAlbRPieEn = new boolean[] {false} ;
      T01FM5_A3441XAlbRUni = new String[] {""} ;
      T01FM5_n3441XAlbRUni = new boolean[] {false} ;
      T01FM5_A3442XAlbRLoc = new String[] {""} ;
      T01FM5_n3442XAlbRLoc = new boolean[] {false} ;
      T01FM5_A3443XAlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T01FM5_n3443XAlbRFen = new boolean[] {false} ;
      T01FM5_A3444XAlbRUniEn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FM5_n3444XAlbRUniEn = new boolean[] {false} ;
      T01FM5_A3445XAlbRReo = new String[] {""} ;
      T01FM5_n3445XAlbRReo = new boolean[] {false} ;
      T01FM5_A3446XAlbRPieUt = new short[1] ;
      T01FM5_n3446XAlbRPieUt = new boolean[] {false} ;
      T01FM5_A3447XAlbRPieRe = new short[1] ;
      T01FM5_n3447XAlbRPieRe = new boolean[] {false} ;
      T01FM5_A3448XAlbRUniUt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FM5_n3448XAlbRUniUt = new boolean[] {false} ;
      T01FM5_A3449XAlbRUniRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FM5_n3449XAlbRUniRe = new boolean[] {false} ;
      T01FM5_A3450XAlbRFecUl = new java.util.Date[] {GXutil.nullDate()} ;
      T01FM5_n3450XAlbRFecUl = new boolean[] {false} ;
      T01FM5_A3451XAlbREst = new byte[1] ;
      T01FM5_n3451XAlbREst = new boolean[] {false} ;
      T01FM5_A3452XTipEntCod = new short[1] ;
      T01FM5_n3452XTipEntCod = new boolean[] {false} ;
      T01FM5_A3453XAlbNumEti = new short[1] ;
      T01FM5_n3453XAlbNumEti = new boolean[] {false} ;
      T01FM5_A3454XAlbRDes = new String[] {""} ;
      T01FM5_n3454XAlbRDes = new boolean[] {false} ;
      T01FM5_A3455XProceCod = new short[1] ;
      T01FM5_n3455XProceCod = new boolean[] {false} ;
      T01FM5_A3456XAlbRULin = new byte[1] ;
      T01FM5_n3456XAlbRULin = new boolean[] {false} ;
      T01FM5_A3457XHisEmpUL = new short[1] ;
      T01FM5_n3457XHisEmpUL = new boolean[] {false} ;
      T01FM5_A3458XAlbRDisC = new String[] {""} ;
      T01FM5_n3458XAlbRDisC = new boolean[] {false} ;
      T01FM5_A3459XAlbRImp = new String[] {""} ;
      T01FM5_n3459XAlbRImp = new boolean[] {false} ;
      T01FM5_A3460XRutina = new String[] {""} ;
      T01FM5_n3460XRutina = new boolean[] {false} ;
      T01FM5_A3828XAlbRefDsc = new String[] {""} ;
      T01FM5_n3828XAlbRefDsc = new boolean[] {false} ;
      T01FM5_A8050XAlbRefCom = new String[] {""} ;
      T01FM5_n8050XAlbRefCom = new boolean[] {false} ;
      T01FM5_A11729Xprioritat = new byte[1] ;
      T01FM5_n11729Xprioritat = new boolean[] {false} ;
      T01FM5_A396EmprCod = new String[] {""} ;
      T01FM9_A396EmprCod = new String[] {""} ;
      T01FM9_A3435XAlbRecCod = new int[1] ;
      T01FM10_A396EmprCod = new String[] {""} ;
      T01FM10_A3435XAlbRecCod = new int[1] ;
      T01FM4_A3435XAlbRecCod = new int[1] ;
      T01FM4_A3436XCliCod = new int[1] ;
      T01FM4_n3436XCliCod = new boolean[] {false} ;
      T01FM4_A3437XAlbRef = new String[] {""} ;
      T01FM4_n3437XAlbRef = new boolean[] {false} ;
      T01FM4_A3438XTrnCod = new short[1] ;
      T01FM4_n3438XTrnCod = new boolean[] {false} ;
      T01FM4_A3439XAlbREnt = new String[] {""} ;
      T01FM4_n3439XAlbREnt = new boolean[] {false} ;
      T01FM4_A3440XAlbRPieEn = new short[1] ;
      T01FM4_n3440XAlbRPieEn = new boolean[] {false} ;
      T01FM4_A3441XAlbRUni = new String[] {""} ;
      T01FM4_n3441XAlbRUni = new boolean[] {false} ;
      T01FM4_A3442XAlbRLoc = new String[] {""} ;
      T01FM4_n3442XAlbRLoc = new boolean[] {false} ;
      T01FM4_A3443XAlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T01FM4_n3443XAlbRFen = new boolean[] {false} ;
      T01FM4_A3444XAlbRUniEn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FM4_n3444XAlbRUniEn = new boolean[] {false} ;
      T01FM4_A3445XAlbRReo = new String[] {""} ;
      T01FM4_n3445XAlbRReo = new boolean[] {false} ;
      T01FM4_A3446XAlbRPieUt = new short[1] ;
      T01FM4_n3446XAlbRPieUt = new boolean[] {false} ;
      T01FM4_A3447XAlbRPieRe = new short[1] ;
      T01FM4_n3447XAlbRPieRe = new boolean[] {false} ;
      T01FM4_A3448XAlbRUniUt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FM4_n3448XAlbRUniUt = new boolean[] {false} ;
      T01FM4_A3449XAlbRUniRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FM4_n3449XAlbRUniRe = new boolean[] {false} ;
      T01FM4_A3450XAlbRFecUl = new java.util.Date[] {GXutil.nullDate()} ;
      T01FM4_n3450XAlbRFecUl = new boolean[] {false} ;
      T01FM4_A3451XAlbREst = new byte[1] ;
      T01FM4_n3451XAlbREst = new boolean[] {false} ;
      T01FM4_A3452XTipEntCod = new short[1] ;
      T01FM4_n3452XTipEntCod = new boolean[] {false} ;
      T01FM4_A3453XAlbNumEti = new short[1] ;
      T01FM4_n3453XAlbNumEti = new boolean[] {false} ;
      T01FM4_A3454XAlbRDes = new String[] {""} ;
      T01FM4_n3454XAlbRDes = new boolean[] {false} ;
      T01FM4_A3455XProceCod = new short[1] ;
      T01FM4_n3455XProceCod = new boolean[] {false} ;
      T01FM4_A3456XAlbRULin = new byte[1] ;
      T01FM4_n3456XAlbRULin = new boolean[] {false} ;
      T01FM4_A3457XHisEmpUL = new short[1] ;
      T01FM4_n3457XHisEmpUL = new boolean[] {false} ;
      T01FM4_A3458XAlbRDisC = new String[] {""} ;
      T01FM4_n3458XAlbRDisC = new boolean[] {false} ;
      T01FM4_A3459XAlbRImp = new String[] {""} ;
      T01FM4_n3459XAlbRImp = new boolean[] {false} ;
      T01FM4_A3460XRutina = new String[] {""} ;
      T01FM4_n3460XRutina = new boolean[] {false} ;
      T01FM4_A3828XAlbRefDsc = new String[] {""} ;
      T01FM4_n3828XAlbRefDsc = new boolean[] {false} ;
      T01FM4_A8050XAlbRefCom = new String[] {""} ;
      T01FM4_n8050XAlbRefCom = new boolean[] {false} ;
      T01FM4_A11729Xprioritat = new byte[1] ;
      T01FM4_n11729Xprioritat = new boolean[] {false} ;
      T01FM4_A396EmprCod = new String[] {""} ;
      T01FM14_A396EmprCod = new String[] {""} ;
      T01FM14_A3435XAlbRecCod = new int[1] ;
      T01FM14_A3467XAlbRLin = new byte[1] ;
      T01FM15_A396EmprCod = new String[] {""} ;
      T01FM15_A3435XAlbRecCod = new int[1] ;
      T01FM15_A5619XProCodAlb = new String[] {""} ;
      T01FM15_A5620XProFasLin = new byte[1] ;
      T01FM16_A396EmprCod = new String[] {""} ;
      T01FM16_A3435XAlbRecCod = new int[1] ;
      T01FM17_A396EmprCod = new String[] {""} ;
      T01FM17_A3435XAlbRecCod = new int[1] ;
      T01FM17_A3461XAlbRecPie = new String[] {""} ;
      T01FM17_A3462XAlbRecAnh = new short[1] ;
      T01FM17_n3462XAlbRecAnh = new boolean[] {false} ;
      T01FM17_A3463XAlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FM17_n3463XAlbRecMtr = new boolean[] {false} ;
      T01FM17_A3464XAlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FM17_n3464XAlbRecKgm = new boolean[] {false} ;
      T01FM17_A3465XAlbRecMtU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FM17_n3465XAlbRecMtU = new boolean[] {false} ;
      T01FM17_A3466XAlbRecKgU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FM17_n3466XAlbRecKgU = new boolean[] {false} ;
      T01FM17_A3728XAlbRecCol = new short[1] ;
      T01FM17_n3728XAlbRecCol = new boolean[] {false} ;
      T01FM17_A3729XAlbRecPza = new String[] {""} ;
      T01FM17_n3729XAlbRecPza = new boolean[] {false} ;
      T01FM17_A11730Xqualitat = new String[] {""} ;
      T01FM17_n11730Xqualitat = new boolean[] {false} ;
      T01FM17_A11731Xteler = new String[] {""} ;
      T01FM17_n11731Xteler = new boolean[] {false} ;
      T01FM18_A396EmprCod = new String[] {""} ;
      T01FM18_A3435XAlbRecCod = new int[1] ;
      T01FM18_A3461XAlbRecPie = new String[] {""} ;
      T01FM3_A396EmprCod = new String[] {""} ;
      T01FM3_A3435XAlbRecCod = new int[1] ;
      T01FM3_A3461XAlbRecPie = new String[] {""} ;
      T01FM3_A3462XAlbRecAnh = new short[1] ;
      T01FM3_n3462XAlbRecAnh = new boolean[] {false} ;
      T01FM3_A3463XAlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FM3_n3463XAlbRecMtr = new boolean[] {false} ;
      T01FM3_A3464XAlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FM3_n3464XAlbRecKgm = new boolean[] {false} ;
      T01FM3_A3465XAlbRecMtU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FM3_n3465XAlbRecMtU = new boolean[] {false} ;
      T01FM3_A3466XAlbRecKgU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FM3_n3466XAlbRecKgU = new boolean[] {false} ;
      T01FM3_A3728XAlbRecCol = new short[1] ;
      T01FM3_n3728XAlbRecCol = new boolean[] {false} ;
      T01FM3_A3729XAlbRecPza = new String[] {""} ;
      T01FM3_n3729XAlbRecPza = new boolean[] {false} ;
      T01FM3_A11730Xqualitat = new String[] {""} ;
      T01FM3_n11730Xqualitat = new boolean[] {false} ;
      T01FM3_A11731Xteler = new String[] {""} ;
      T01FM3_n11731Xteler = new boolean[] {false} ;
      T01FM2_A396EmprCod = new String[] {""} ;
      T01FM2_A3435XAlbRecCod = new int[1] ;
      T01FM2_A3461XAlbRecPie = new String[] {""} ;
      T01FM2_A3462XAlbRecAnh = new short[1] ;
      T01FM2_n3462XAlbRecAnh = new boolean[] {false} ;
      T01FM2_A3463XAlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FM2_n3463XAlbRecMtr = new boolean[] {false} ;
      T01FM2_A3464XAlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FM2_n3464XAlbRecKgm = new boolean[] {false} ;
      T01FM2_A3465XAlbRecMtU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FM2_n3465XAlbRecMtU = new boolean[] {false} ;
      T01FM2_A3466XAlbRecKgU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FM2_n3466XAlbRecKgU = new boolean[] {false} ;
      T01FM2_A3728XAlbRecCol = new short[1] ;
      T01FM2_n3728XAlbRecCol = new boolean[] {false} ;
      T01FM2_A3729XAlbRecPza = new String[] {""} ;
      T01FM2_n3729XAlbRecPza = new boolean[] {false} ;
      T01FM2_A11730Xqualitat = new String[] {""} ;
      T01FM2_n11730Xqualitat = new boolean[] {false} ;
      T01FM2_A11731Xteler = new String[] {""} ;
      T01FM2_n11731Xteler = new boolean[] {false} ;
      T01FM22_A396EmprCod = new String[] {""} ;
      T01FM22_A3435XAlbRecCod = new int[1] ;
      T01FM22_A3461XAlbRecPie = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01FM23_A407EmprNom = new String[] {""} ;
      T01FM23_n407EmprNom = new boolean[] {false} ;
      ZV17UsurCod = "" ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ3437XAlbRef = "" ;
      ZZ3439XAlbREnt = "" ;
      ZZ3441XAlbRUni = "" ;
      ZZ3442XAlbRLoc = "" ;
      ZZ3443XAlbRFen = GXutil.nullDate() ;
      ZZ3444XAlbRUniEn = DecimalUtil.ZERO ;
      ZZ3445XAlbRReo = "" ;
      ZZ3448XAlbRUniUt = DecimalUtil.ZERO ;
      ZZ3449XAlbRUniRe = DecimalUtil.ZERO ;
      ZZ3450XAlbRFecUl = GXutil.nullDate() ;
      ZZ3454XAlbRDes = "" ;
      ZZ3458XAlbRDisC = "" ;
      ZZ3459XAlbRImp = "" ;
      ZZ3460XRutina = "" ;
      ZZ3828XAlbRefDsc = "" ;
      ZZ8050XAlbRefCom = "" ;
      ZZV17UsurCod = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.talbeur__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.talbeur__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.talbeur__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.talbeur__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbeur__default(),
         new Object[] {
             new Object[] {
            T01FM2_A396EmprCod, T01FM2_A3435XAlbRecCod, T01FM2_A3461XAlbRecPie, T01FM2_A3462XAlbRecAnh, T01FM2_n3462XAlbRecAnh, T01FM2_A3463XAlbRecMtr, T01FM2_n3463XAlbRecMtr, T01FM2_A3464XAlbRecKgm, T01FM2_n3464XAlbRecKgm, T01FM2_A3465XAlbRecMtU,
            T01FM2_n3465XAlbRecMtU, T01FM2_A3466XAlbRecKgU, T01FM2_n3466XAlbRecKgU, T01FM2_A3728XAlbRecCol, T01FM2_n3728XAlbRecCol, T01FM2_A3729XAlbRecPza, T01FM2_n3729XAlbRecPza, T01FM2_A11730Xqualitat, T01FM2_n11730Xqualitat, T01FM2_A11731Xteler,
            T01FM2_n11731Xteler
            }
            , new Object[] {
            T01FM3_A396EmprCod, T01FM3_A3435XAlbRecCod, T01FM3_A3461XAlbRecPie, T01FM3_A3462XAlbRecAnh, T01FM3_n3462XAlbRecAnh, T01FM3_A3463XAlbRecMtr, T01FM3_n3463XAlbRecMtr, T01FM3_A3464XAlbRecKgm, T01FM3_n3464XAlbRecKgm, T01FM3_A3465XAlbRecMtU,
            T01FM3_n3465XAlbRecMtU, T01FM3_A3466XAlbRecKgU, T01FM3_n3466XAlbRecKgU, T01FM3_A3728XAlbRecCol, T01FM3_n3728XAlbRecCol, T01FM3_A3729XAlbRecPza, T01FM3_n3729XAlbRecPza, T01FM3_A11730Xqualitat, T01FM3_n11730Xqualitat, T01FM3_A11731Xteler,
            T01FM3_n11731Xteler
            }
            , new Object[] {
            T01FM4_A3435XAlbRecCod, T01FM4_A3436XCliCod, T01FM4_n3436XCliCod, T01FM4_A3437XAlbRef, T01FM4_n3437XAlbRef, T01FM4_A3438XTrnCod, T01FM4_n3438XTrnCod, T01FM4_A3439XAlbREnt, T01FM4_n3439XAlbREnt, T01FM4_A3440XAlbRPieEn,
            T01FM4_n3440XAlbRPieEn, T01FM4_A3441XAlbRUni, T01FM4_n3441XAlbRUni, T01FM4_A3442XAlbRLoc, T01FM4_n3442XAlbRLoc, T01FM4_A3443XAlbRFen, T01FM4_n3443XAlbRFen, T01FM4_A3444XAlbRUniEn, T01FM4_n3444XAlbRUniEn, T01FM4_A3445XAlbRReo,
            T01FM4_n3445XAlbRReo, T01FM4_A3446XAlbRPieUt, T01FM4_n3446XAlbRPieUt, T01FM4_A3447XAlbRPieRe, T01FM4_n3447XAlbRPieRe, T01FM4_A3448XAlbRUniUt, T01FM4_n3448XAlbRUniUt, T01FM4_A3449XAlbRUniRe, T01FM4_n3449XAlbRUniRe, T01FM4_A3450XAlbRFecUl,
            T01FM4_n3450XAlbRFecUl, T01FM4_A3451XAlbREst, T01FM4_n3451XAlbREst, T01FM4_A3452XTipEntCod, T01FM4_n3452XTipEntCod, T01FM4_A3453XAlbNumEti, T01FM4_n3453XAlbNumEti, T01FM4_A3454XAlbRDes, T01FM4_n3454XAlbRDes, T01FM4_A3455XProceCod,
            T01FM4_n3455XProceCod, T01FM4_A3456XAlbRULin, T01FM4_n3456XAlbRULin, T01FM4_A3457XHisEmpUL, T01FM4_n3457XHisEmpUL, T01FM4_A3458XAlbRDisC, T01FM4_n3458XAlbRDisC, T01FM4_A3459XAlbRImp, T01FM4_n3459XAlbRImp, T01FM4_A3460XRutina,
            T01FM4_n3460XRutina, T01FM4_A3828XAlbRefDsc, T01FM4_n3828XAlbRefDsc, T01FM4_A8050XAlbRefCom, T01FM4_n8050XAlbRefCom, T01FM4_A11729Xprioritat, T01FM4_n11729Xprioritat, T01FM4_A396EmprCod
            }
            , new Object[] {
            T01FM5_A3435XAlbRecCod, T01FM5_A3436XCliCod, T01FM5_n3436XCliCod, T01FM5_A3437XAlbRef, T01FM5_n3437XAlbRef, T01FM5_A3438XTrnCod, T01FM5_n3438XTrnCod, T01FM5_A3439XAlbREnt, T01FM5_n3439XAlbREnt, T01FM5_A3440XAlbRPieEn,
            T01FM5_n3440XAlbRPieEn, T01FM5_A3441XAlbRUni, T01FM5_n3441XAlbRUni, T01FM5_A3442XAlbRLoc, T01FM5_n3442XAlbRLoc, T01FM5_A3443XAlbRFen, T01FM5_n3443XAlbRFen, T01FM5_A3444XAlbRUniEn, T01FM5_n3444XAlbRUniEn, T01FM5_A3445XAlbRReo,
            T01FM5_n3445XAlbRReo, T01FM5_A3446XAlbRPieUt, T01FM5_n3446XAlbRPieUt, T01FM5_A3447XAlbRPieRe, T01FM5_n3447XAlbRPieRe, T01FM5_A3448XAlbRUniUt, T01FM5_n3448XAlbRUniUt, T01FM5_A3449XAlbRUniRe, T01FM5_n3449XAlbRUniRe, T01FM5_A3450XAlbRFecUl,
            T01FM5_n3450XAlbRFecUl, T01FM5_A3451XAlbREst, T01FM5_n3451XAlbREst, T01FM5_A3452XTipEntCod, T01FM5_n3452XTipEntCod, T01FM5_A3453XAlbNumEti, T01FM5_n3453XAlbNumEti, T01FM5_A3454XAlbRDes, T01FM5_n3454XAlbRDes, T01FM5_A3455XProceCod,
            T01FM5_n3455XProceCod, T01FM5_A3456XAlbRULin, T01FM5_n3456XAlbRULin, T01FM5_A3457XHisEmpUL, T01FM5_n3457XHisEmpUL, T01FM5_A3458XAlbRDisC, T01FM5_n3458XAlbRDisC, T01FM5_A3459XAlbRImp, T01FM5_n3459XAlbRImp, T01FM5_A3460XRutina,
            T01FM5_n3460XRutina, T01FM5_A3828XAlbRefDsc, T01FM5_n3828XAlbRefDsc, T01FM5_A8050XAlbRefCom, T01FM5_n8050XAlbRefCom, T01FM5_A11729Xprioritat, T01FM5_n11729Xprioritat, T01FM5_A396EmprCod
            }
            , new Object[] {
            T01FM6_A407EmprNom, T01FM6_n407EmprNom
            }
            , new Object[] {
            T01FM7_A3435XAlbRecCod, T01FM7_A407EmprNom, T01FM7_n407EmprNom, T01FM7_A3436XCliCod, T01FM7_n3436XCliCod, T01FM7_A3437XAlbRef, T01FM7_n3437XAlbRef, T01FM7_A3438XTrnCod, T01FM7_n3438XTrnCod, T01FM7_A3439XAlbREnt,
            T01FM7_n3439XAlbREnt, T01FM7_A3440XAlbRPieEn, T01FM7_n3440XAlbRPieEn, T01FM7_A3441XAlbRUni, T01FM7_n3441XAlbRUni, T01FM7_A3442XAlbRLoc, T01FM7_n3442XAlbRLoc, T01FM7_A3443XAlbRFen, T01FM7_n3443XAlbRFen, T01FM7_A3444XAlbRUniEn,
            T01FM7_n3444XAlbRUniEn, T01FM7_A3445XAlbRReo, T01FM7_n3445XAlbRReo, T01FM7_A3446XAlbRPieUt, T01FM7_n3446XAlbRPieUt, T01FM7_A3447XAlbRPieRe, T01FM7_n3447XAlbRPieRe, T01FM7_A3448XAlbRUniUt, T01FM7_n3448XAlbRUniUt, T01FM7_A3449XAlbRUniRe,
            T01FM7_n3449XAlbRUniRe, T01FM7_A3450XAlbRFecUl, T01FM7_n3450XAlbRFecUl, T01FM7_A3451XAlbREst, T01FM7_n3451XAlbREst, T01FM7_A3452XTipEntCod, T01FM7_n3452XTipEntCod, T01FM7_A3453XAlbNumEti, T01FM7_n3453XAlbNumEti, T01FM7_A3454XAlbRDes,
            T01FM7_n3454XAlbRDes, T01FM7_A3455XProceCod, T01FM7_n3455XProceCod, T01FM7_A3456XAlbRULin, T01FM7_n3456XAlbRULin, T01FM7_A3457XHisEmpUL, T01FM7_n3457XHisEmpUL, T01FM7_A3458XAlbRDisC, T01FM7_n3458XAlbRDisC, T01FM7_A3459XAlbRImp,
            T01FM7_n3459XAlbRImp, T01FM7_A3460XRutina, T01FM7_n3460XRutina, T01FM7_A3828XAlbRefDsc, T01FM7_n3828XAlbRefDsc, T01FM7_A8050XAlbRefCom, T01FM7_n8050XAlbRefCom, T01FM7_A11729Xprioritat, T01FM7_n11729Xprioritat, T01FM7_A396EmprCod
            }
            , new Object[] {
            T01FM8_A396EmprCod, T01FM8_A3435XAlbRecCod
            }
            , new Object[] {
            T01FM9_A396EmprCod, T01FM9_A3435XAlbRecCod
            }
            , new Object[] {
            T01FM10_A396EmprCod, T01FM10_A3435XAlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FM14_A396EmprCod, T01FM14_A3435XAlbRecCod, T01FM14_A3467XAlbRLin
            }
            , new Object[] {
            T01FM15_A396EmprCod, T01FM15_A3435XAlbRecCod, T01FM15_A5619XProCodAlb, T01FM15_A5620XProFasLin
            }
            , new Object[] {
            T01FM16_A396EmprCod, T01FM16_A3435XAlbRecCod
            }
            , new Object[] {
            T01FM17_A396EmprCod, T01FM17_A3435XAlbRecCod, T01FM17_A3461XAlbRecPie, T01FM17_A3462XAlbRecAnh, T01FM17_n3462XAlbRecAnh, T01FM17_A3463XAlbRecMtr, T01FM17_n3463XAlbRecMtr, T01FM17_A3464XAlbRecKgm, T01FM17_n3464XAlbRecKgm, T01FM17_A3465XAlbRecMtU,
            T01FM17_n3465XAlbRecMtU, T01FM17_A3466XAlbRecKgU, T01FM17_n3466XAlbRecKgU, T01FM17_A3728XAlbRecCol, T01FM17_n3728XAlbRecCol, T01FM17_A3729XAlbRecPza, T01FM17_n3729XAlbRecPza, T01FM17_A11730Xqualitat, T01FM17_n11730Xqualitat, T01FM17_A11731Xteler,
            T01FM17_n11731Xteler
            }
            , new Object[] {
            T01FM18_A396EmprCod, T01FM18_A3435XAlbRecCod, T01FM18_A3461XAlbRecPie
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FM22_A396EmprCod, T01FM22_A3435XAlbRecCod, T01FM22_A3461XAlbRecPie
            }
            , new Object[] {
            T01FM23_A407EmprNom, T01FM23_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z3451XAlbREst ;
   private byte Z3456XAlbRULin ;
   private byte Z11729Xprioritat ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A3451XAlbREst ;
   private byte A3456XAlbRULin ;
   private byte A11729Xprioritat ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ3451XAlbREst ;
   private byte ZZ3456XAlbRULin ;
   private byte ZZ11729Xprioritat ;
   private short Z3438XTrnCod ;
   private short Z3440XAlbRPieEn ;
   private short Z3446XAlbRPieUt ;
   private short Z3447XAlbRPieRe ;
   private short Z3452XTipEntCod ;
   private short Z3453XAlbNumEti ;
   private short Z3455XProceCod ;
   private short Z3457XHisEmpUL ;
   private short Z3462XAlbRecAnh ;
   private short Z3728XAlbRecCol ;
   private short nRcdDeleted_1576 ;
   private short nRcdExists_1576 ;
   private short nIsMod_1576 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A3438XTrnCod ;
   private short A3440XAlbRPieEn ;
   private short A3446XAlbRPieUt ;
   private short A3447XAlbRPieRe ;
   private short A3452XTipEntCod ;
   private short A3453XAlbNumEti ;
   private short A3455XProceCod ;
   private short A3457XHisEmpUL ;
   private short nBlankRcdCount1576 ;
   private short RcdFound1576 ;
   private short nBlankRcdUsr1576 ;
   private short A3462XAlbRecAnh ;
   private short A3728XAlbRecCol ;
   private short RcdFound493 ;
   private short nIsDirty_493 ;
   private short nIsDirty_1576 ;
   private short ZZ3438XTrnCod ;
   private short ZZ3440XAlbRPieEn ;
   private short ZZ3446XAlbRPieUt ;
   private short ZZ3447XAlbRPieRe ;
   private short ZZ3452XTipEntCod ;
   private short ZZ3453XAlbNumEti ;
   private short ZZ3455XProceCod ;
   private short ZZ3457XHisEmpUL ;
   private int Z3435XAlbRecCod ;
   private int Z3436XCliCod ;
   private int nRC_GXsfl_175 ;
   private int nGXsfl_175_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int A3435XAlbRecCod ;
   private int edtXAlbRecCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A3436XCliCod ;
   private int edtXCliCod_Enabled ;
   private int edtXAlbRef_Enabled ;
   private int edtXTrnCod_Enabled ;
   private int edtXAlbREnt_Enabled ;
   private int edtXAlbRPieEn_Enabled ;
   private int edtXAlbRUni_Enabled ;
   private int edtXAlbRLoc_Enabled ;
   private int edtXAlbRFen_Enabled ;
   private int edtXAlbRUniEn_Enabled ;
   private int edtXAlbRReo_Enabled ;
   private int edtXAlbRPieUt_Enabled ;
   private int edtXAlbRPieRe_Enabled ;
   private int edtXAlbRUniUt_Enabled ;
   private int edtXAlbRUniRe_Enabled ;
   private int edtXAlbRFecUl_Enabled ;
   private int edtXAlbREst_Enabled ;
   private int edtXTipEntCod_Enabled ;
   private int edtXAlbNumEti_Enabled ;
   private int edtXAlbRDes_Enabled ;
   private int edtXProceCod_Enabled ;
   private int edtXAlbRULin_Enabled ;
   private int edtXHisEmpUL_Enabled ;
   private int edtXAlbRDisC_Enabled ;
   private int edtXAlbRImp_Enabled ;
   private int edtXRutina_Enabled ;
   private int edtXAlbRefDsc_Enabled ;
   private int edtXAlbRefCom_Enabled ;
   private int edtXprioritat_Enabled ;
   private int edtavnRcdDeleted_1576_Enabled ;
   private int edtXAlbRecPie_Enabled ;
   private int edtXAlbRecAnh_Enabled ;
   private int edtXAlbRecMtr_Enabled ;
   private int edtXAlbRecKgm_Enabled ;
   private int edtXAlbRecMtU_Enabled ;
   private int edtXAlbRecKgU_Enabled ;
   private int edtXAlbRecCol_Enabled ;
   private int edtXAlbRecPza_Enabled ;
   private int edtXqualitat_Enabled ;
   private int edtXteler_Enabled ;
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
   private int defedtXAlbRecPie_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtXprioritat_Backcolor ;
   private int edtXAlbRefCom_Backcolor ;
   private int edtXAlbRefDsc_Backcolor ;
   private int edtXRutina_Backcolor ;
   private int edtXAlbRImp_Backcolor ;
   private int edtXAlbRDisC_Backcolor ;
   private int edtXHisEmpUL_Backcolor ;
   private int edtXAlbRULin_Backcolor ;
   private int edtXProceCod_Backcolor ;
   private int edtXAlbRDes_Backcolor ;
   private int edtXAlbNumEti_Backcolor ;
   private int edtXTipEntCod_Backcolor ;
   private int edtXAlbREst_Backcolor ;
   private int edtXAlbRFecUl_Backcolor ;
   private int edtXAlbRUniRe_Backcolor ;
   private int edtXAlbRUniUt_Backcolor ;
   private int edtXAlbRPieRe_Backcolor ;
   private int edtXAlbRPieUt_Backcolor ;
   private int edtXAlbRReo_Backcolor ;
   private int edtXAlbRUniEn_Backcolor ;
   private int edtXAlbRFen_Backcolor ;
   private int edtXAlbRLoc_Backcolor ;
   private int edtXAlbRUni_Backcolor ;
   private int edtXAlbRPieEn_Backcolor ;
   private int edtXAlbREnt_Backcolor ;
   private int edtXTrnCod_Backcolor ;
   private int edtXAlbRef_Backcolor ;
   private int edtXCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtXAlbRecCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ3435XAlbRecCod ;
   private int ZZ3436XCliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z3444XAlbRUniEn ;
   private java.math.BigDecimal Z3448XAlbRUniUt ;
   private java.math.BigDecimal Z3449XAlbRUniRe ;
   private java.math.BigDecimal Z3463XAlbRecMtr ;
   private java.math.BigDecimal Z3464XAlbRecKgm ;
   private java.math.BigDecimal Z3465XAlbRecMtU ;
   private java.math.BigDecimal Z3466XAlbRecKgU ;
   private java.math.BigDecimal A3444XAlbRUniEn ;
   private java.math.BigDecimal A3448XAlbRUniUt ;
   private java.math.BigDecimal A3449XAlbRUniRe ;
   private java.math.BigDecimal A3463XAlbRecMtr ;
   private java.math.BigDecimal A3464XAlbRecKgm ;
   private java.math.BigDecimal A3465XAlbRecMtU ;
   private java.math.BigDecimal A3466XAlbRecKgU ;
   private java.math.BigDecimal ZZ3444XAlbRUniEn ;
   private java.math.BigDecimal ZZ3448XAlbRUniUt ;
   private java.math.BigDecimal ZZ3449XAlbRUniRe ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z3437XAlbRef ;
   private String Z3439XAlbREnt ;
   private String Z3441XAlbRUni ;
   private String Z3442XAlbRLoc ;
   private String Z3445XAlbRReo ;
   private String Z3454XAlbRDes ;
   private String Z3458XAlbRDisC ;
   private String Z3459XAlbRImp ;
   private String Z3460XRutina ;
   private String Z3828XAlbRefDsc ;
   private String Z8050XAlbRefCom ;
   private String Z3461XAlbRecPie ;
   private String Z3729XAlbRecPza ;
   private String Z11730Xqualitat ;
   private String Z11731Xteler ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtXAlbRecCod_Internalname ;
   private String sGXsfl_175_idx="0001" ;
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
   private String edtXAlbRecCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtXCliCod_Internalname ;
   private String edtXCliCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtXAlbRef_Internalname ;
   private String A3437XAlbRef ;
   private String edtXAlbRef_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtXTrnCod_Internalname ;
   private String edtXTrnCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtXAlbREnt_Internalname ;
   private String A3439XAlbREnt ;
   private String edtXAlbREnt_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtXAlbRPieEn_Internalname ;
   private String edtXAlbRPieEn_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtXAlbRUni_Internalname ;
   private String A3441XAlbRUni ;
   private String edtXAlbRUni_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtXAlbRLoc_Internalname ;
   private String A3442XAlbRLoc ;
   private String edtXAlbRLoc_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtXAlbRFen_Internalname ;
   private String edtXAlbRFen_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtXAlbRUniEn_Internalname ;
   private String edtXAlbRUniEn_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtXAlbRReo_Internalname ;
   private String A3445XAlbRReo ;
   private String edtXAlbRReo_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtXAlbRPieUt_Internalname ;
   private String edtXAlbRPieUt_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtXAlbRPieRe_Internalname ;
   private String edtXAlbRPieRe_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtXAlbRUniUt_Internalname ;
   private String edtXAlbRUniUt_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtXAlbRUniRe_Internalname ;
   private String edtXAlbRUniRe_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtXAlbRFecUl_Internalname ;
   private String edtXAlbRFecUl_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtXAlbREst_Internalname ;
   private String edtXAlbREst_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtXTipEntCod_Internalname ;
   private String edtXTipEntCod_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtXAlbNumEti_Internalname ;
   private String edtXAlbNumEti_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtXAlbRDes_Internalname ;
   private String A3454XAlbRDes ;
   private String edtXAlbRDes_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtXProceCod_Internalname ;
   private String edtXProceCod_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtXAlbRULin_Internalname ;
   private String edtXAlbRULin_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtXHisEmpUL_Internalname ;
   private String edtXHisEmpUL_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtXAlbRDisC_Internalname ;
   private String A3458XAlbRDisC ;
   private String edtXAlbRDisC_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtXAlbRImp_Internalname ;
   private String A3459XAlbRImp ;
   private String edtXAlbRImp_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtXRutina_Internalname ;
   private String A3460XRutina ;
   private String edtXRutina_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtXAlbRefDsc_Internalname ;
   private String A3828XAlbRefDsc ;
   private String edtXAlbRefDsc_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtXAlbRefCom_Internalname ;
   private String A8050XAlbRefCom ;
   private String edtXAlbRefCom_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtXprioritat_Internalname ;
   private String edtXprioritat_Jsonclick ;
   private String sMode1576 ;
   private String edtavnRcdDeleted_1576_Internalname ;
   private String edtXAlbRecPie_Internalname ;
   private String edtXAlbRecAnh_Internalname ;
   private String edtXAlbRecMtr_Internalname ;
   private String edtXAlbRecKgm_Internalname ;
   private String edtXAlbRecMtU_Internalname ;
   private String edtXAlbRecKgU_Internalname ;
   private String edtXAlbRecCol_Internalname ;
   private String edtXAlbRecPza_Internalname ;
   private String edtXqualitat_Internalname ;
   private String edtXteler_Internalname ;
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
   private String sMode493 ;
   private String GXCCtl ;
   private String A3461XAlbRecPie ;
   private String A3729XAlbRecPza ;
   private String A11730Xqualitat ;
   private String A11731Xteler ;
   private String AV38Station ;
   private String GXv_char1[] ;
   private String AV16EmprNom ;
   private String GXv_char2[] ;
   private String AV19Lit0 ;
   private String AV39LitFe ;
   private String AV20Lit1 ;
   private String AV21Lit2 ;
   private String AV22Lit3 ;
   private String AV23Lit4 ;
   private String AV24Lit5 ;
   private String AV25Lit6 ;
   private String AV26Lit7 ;
   private String AV27Lit8 ;
   private String AV28Lit9 ;
   private String AV29Lit10 ;
   private String AV30Lit11 ;
   private String AV31Lit12 ;
   private String AV32Lit13 ;
   private String AV33Lit14 ;
   private String AV34Lit15 ;
   private String AV35Lit16 ;
   private String AV36Lit17 ;
   private String AV37Lit18 ;
   private String AV40lit19 ;
   private String AV41lit20 ;
   private String AV42lit21 ;
   private String AV44lit23 ;
   private String AV45Lit24 ;
   private String AV48Lit25 ;
   private String AV49Lit26 ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String Z407EmprNom ;
   private String sGXsfl_175_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1576_Jsonclick ;
   private String edtXAlbRecPie_Jsonclick ;
   private String edtXAlbRecAnh_Jsonclick ;
   private String edtXAlbRecMtr_Jsonclick ;
   private String edtXAlbRecKgm_Jsonclick ;
   private String edtXAlbRecMtU_Jsonclick ;
   private String edtXAlbRecKgU_Jsonclick ;
   private String edtXAlbRecCol_Jsonclick ;
   private String edtXAlbRecPza_Jsonclick ;
   private String edtXqualitat_Jsonclick ;
   private String edtXteler_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZV17UsurCod ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ3437XAlbRef ;
   private String ZZ3439XAlbREnt ;
   private String ZZ3441XAlbRUni ;
   private String ZZ3442XAlbRLoc ;
   private String ZZ3445XAlbRReo ;
   private String ZZ3454XAlbRDes ;
   private String ZZ3458XAlbRDisC ;
   private String ZZ3459XAlbRImp ;
   private String ZZ3460XRutina ;
   private String ZZ3828XAlbRefDsc ;
   private String ZZ8050XAlbRefCom ;
   private String ZZV17UsurCod ;
   private java.util.Date Z3443XAlbRFen ;
   private java.util.Date Z3450XAlbRFecUl ;
   private java.util.Date A3443XAlbRFen ;
   private java.util.Date A3450XAlbRFecUl ;
   private java.util.Date ZZ3443XAlbRFen ;
   private java.util.Date ZZ3450XAlbRFecUl ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_175_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n3436XCliCod ;
   private boolean n3437XAlbRef ;
   private boolean n3438XTrnCod ;
   private boolean n3439XAlbREnt ;
   private boolean n3440XAlbRPieEn ;
   private boolean n3441XAlbRUni ;
   private boolean n3442XAlbRLoc ;
   private boolean n3443XAlbRFen ;
   private boolean n3444XAlbRUniEn ;
   private boolean n3445XAlbRReo ;
   private boolean n3446XAlbRPieUt ;
   private boolean n3447XAlbRPieRe ;
   private boolean n3448XAlbRUniUt ;
   private boolean n3449XAlbRUniRe ;
   private boolean n3450XAlbRFecUl ;
   private boolean n3451XAlbREst ;
   private boolean n3452XTipEntCod ;
   private boolean n3453XAlbNumEti ;
   private boolean n3454XAlbRDes ;
   private boolean n3455XProceCod ;
   private boolean n3456XAlbRULin ;
   private boolean n3457XHisEmpUL ;
   private boolean n3458XAlbRDisC ;
   private boolean n3459XAlbRImp ;
   private boolean n3460XRutina ;
   private boolean n3828XAlbRefDsc ;
   private boolean n8050XAlbRefCom ;
   private boolean n11729Xprioritat ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n3462XAlbRecAnh ;
   private boolean n3463XAlbRecMtr ;
   private boolean n3464XAlbRecKgm ;
   private boolean n3465XAlbRecMtU ;
   private boolean n3466XAlbRecKgU ;
   private boolean n3728XAlbRecCol ;
   private boolean n3729XAlbRecPza ;
   private boolean n11730Xqualitat ;
   private boolean n11731Xteler ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01FM6_A407EmprNom ;
   private boolean[] T01FM6_n407EmprNom ;
   private int[] T01FM7_A3435XAlbRecCod ;
   private String[] T01FM7_A407EmprNom ;
   private boolean[] T01FM7_n407EmprNom ;
   private int[] T01FM7_A3436XCliCod ;
   private boolean[] T01FM7_n3436XCliCod ;
   private String[] T01FM7_A3437XAlbRef ;
   private boolean[] T01FM7_n3437XAlbRef ;
   private short[] T01FM7_A3438XTrnCod ;
   private boolean[] T01FM7_n3438XTrnCod ;
   private String[] T01FM7_A3439XAlbREnt ;
   private boolean[] T01FM7_n3439XAlbREnt ;
   private short[] T01FM7_A3440XAlbRPieEn ;
   private boolean[] T01FM7_n3440XAlbRPieEn ;
   private String[] T01FM7_A3441XAlbRUni ;
   private boolean[] T01FM7_n3441XAlbRUni ;
   private String[] T01FM7_A3442XAlbRLoc ;
   private boolean[] T01FM7_n3442XAlbRLoc ;
   private java.util.Date[] T01FM7_A3443XAlbRFen ;
   private boolean[] T01FM7_n3443XAlbRFen ;
   private java.math.BigDecimal[] T01FM7_A3444XAlbRUniEn ;
   private boolean[] T01FM7_n3444XAlbRUniEn ;
   private String[] T01FM7_A3445XAlbRReo ;
   private boolean[] T01FM7_n3445XAlbRReo ;
   private short[] T01FM7_A3446XAlbRPieUt ;
   private boolean[] T01FM7_n3446XAlbRPieUt ;
   private short[] T01FM7_A3447XAlbRPieRe ;
   private boolean[] T01FM7_n3447XAlbRPieRe ;
   private java.math.BigDecimal[] T01FM7_A3448XAlbRUniUt ;
   private boolean[] T01FM7_n3448XAlbRUniUt ;
   private java.math.BigDecimal[] T01FM7_A3449XAlbRUniRe ;
   private boolean[] T01FM7_n3449XAlbRUniRe ;
   private java.util.Date[] T01FM7_A3450XAlbRFecUl ;
   private boolean[] T01FM7_n3450XAlbRFecUl ;
   private byte[] T01FM7_A3451XAlbREst ;
   private boolean[] T01FM7_n3451XAlbREst ;
   private short[] T01FM7_A3452XTipEntCod ;
   private boolean[] T01FM7_n3452XTipEntCod ;
   private short[] T01FM7_A3453XAlbNumEti ;
   private boolean[] T01FM7_n3453XAlbNumEti ;
   private String[] T01FM7_A3454XAlbRDes ;
   private boolean[] T01FM7_n3454XAlbRDes ;
   private short[] T01FM7_A3455XProceCod ;
   private boolean[] T01FM7_n3455XProceCod ;
   private byte[] T01FM7_A3456XAlbRULin ;
   private boolean[] T01FM7_n3456XAlbRULin ;
   private short[] T01FM7_A3457XHisEmpUL ;
   private boolean[] T01FM7_n3457XHisEmpUL ;
   private String[] T01FM7_A3458XAlbRDisC ;
   private boolean[] T01FM7_n3458XAlbRDisC ;
   private String[] T01FM7_A3459XAlbRImp ;
   private boolean[] T01FM7_n3459XAlbRImp ;
   private String[] T01FM7_A3460XRutina ;
   private boolean[] T01FM7_n3460XRutina ;
   private String[] T01FM7_A3828XAlbRefDsc ;
   private boolean[] T01FM7_n3828XAlbRefDsc ;
   private String[] T01FM7_A8050XAlbRefCom ;
   private boolean[] T01FM7_n8050XAlbRefCom ;
   private byte[] T01FM7_A11729Xprioritat ;
   private boolean[] T01FM7_n11729Xprioritat ;
   private String[] T01FM7_A396EmprCod ;
   private String[] T01FM8_A396EmprCod ;
   private int[] T01FM8_A3435XAlbRecCod ;
   private int[] T01FM5_A3435XAlbRecCod ;
   private int[] T01FM5_A3436XCliCod ;
   private boolean[] T01FM5_n3436XCliCod ;
   private String[] T01FM5_A3437XAlbRef ;
   private boolean[] T01FM5_n3437XAlbRef ;
   private short[] T01FM5_A3438XTrnCod ;
   private boolean[] T01FM5_n3438XTrnCod ;
   private String[] T01FM5_A3439XAlbREnt ;
   private boolean[] T01FM5_n3439XAlbREnt ;
   private short[] T01FM5_A3440XAlbRPieEn ;
   private boolean[] T01FM5_n3440XAlbRPieEn ;
   private String[] T01FM5_A3441XAlbRUni ;
   private boolean[] T01FM5_n3441XAlbRUni ;
   private String[] T01FM5_A3442XAlbRLoc ;
   private boolean[] T01FM5_n3442XAlbRLoc ;
   private java.util.Date[] T01FM5_A3443XAlbRFen ;
   private boolean[] T01FM5_n3443XAlbRFen ;
   private java.math.BigDecimal[] T01FM5_A3444XAlbRUniEn ;
   private boolean[] T01FM5_n3444XAlbRUniEn ;
   private String[] T01FM5_A3445XAlbRReo ;
   private boolean[] T01FM5_n3445XAlbRReo ;
   private short[] T01FM5_A3446XAlbRPieUt ;
   private boolean[] T01FM5_n3446XAlbRPieUt ;
   private short[] T01FM5_A3447XAlbRPieRe ;
   private boolean[] T01FM5_n3447XAlbRPieRe ;
   private java.math.BigDecimal[] T01FM5_A3448XAlbRUniUt ;
   private boolean[] T01FM5_n3448XAlbRUniUt ;
   private java.math.BigDecimal[] T01FM5_A3449XAlbRUniRe ;
   private boolean[] T01FM5_n3449XAlbRUniRe ;
   private java.util.Date[] T01FM5_A3450XAlbRFecUl ;
   private boolean[] T01FM5_n3450XAlbRFecUl ;
   private byte[] T01FM5_A3451XAlbREst ;
   private boolean[] T01FM5_n3451XAlbREst ;
   private short[] T01FM5_A3452XTipEntCod ;
   private boolean[] T01FM5_n3452XTipEntCod ;
   private short[] T01FM5_A3453XAlbNumEti ;
   private boolean[] T01FM5_n3453XAlbNumEti ;
   private String[] T01FM5_A3454XAlbRDes ;
   private boolean[] T01FM5_n3454XAlbRDes ;
   private short[] T01FM5_A3455XProceCod ;
   private boolean[] T01FM5_n3455XProceCod ;
   private byte[] T01FM5_A3456XAlbRULin ;
   private boolean[] T01FM5_n3456XAlbRULin ;
   private short[] T01FM5_A3457XHisEmpUL ;
   private boolean[] T01FM5_n3457XHisEmpUL ;
   private String[] T01FM5_A3458XAlbRDisC ;
   private boolean[] T01FM5_n3458XAlbRDisC ;
   private String[] T01FM5_A3459XAlbRImp ;
   private boolean[] T01FM5_n3459XAlbRImp ;
   private String[] T01FM5_A3460XRutina ;
   private boolean[] T01FM5_n3460XRutina ;
   private String[] T01FM5_A3828XAlbRefDsc ;
   private boolean[] T01FM5_n3828XAlbRefDsc ;
   private String[] T01FM5_A8050XAlbRefCom ;
   private boolean[] T01FM5_n8050XAlbRefCom ;
   private byte[] T01FM5_A11729Xprioritat ;
   private boolean[] T01FM5_n11729Xprioritat ;
   private String[] T01FM5_A396EmprCod ;
   private String[] T01FM9_A396EmprCod ;
   private int[] T01FM9_A3435XAlbRecCod ;
   private String[] T01FM10_A396EmprCod ;
   private int[] T01FM10_A3435XAlbRecCod ;
   private int[] T01FM4_A3435XAlbRecCod ;
   private int[] T01FM4_A3436XCliCod ;
   private boolean[] T01FM4_n3436XCliCod ;
   private String[] T01FM4_A3437XAlbRef ;
   private boolean[] T01FM4_n3437XAlbRef ;
   private short[] T01FM4_A3438XTrnCod ;
   private boolean[] T01FM4_n3438XTrnCod ;
   private String[] T01FM4_A3439XAlbREnt ;
   private boolean[] T01FM4_n3439XAlbREnt ;
   private short[] T01FM4_A3440XAlbRPieEn ;
   private boolean[] T01FM4_n3440XAlbRPieEn ;
   private String[] T01FM4_A3441XAlbRUni ;
   private boolean[] T01FM4_n3441XAlbRUni ;
   private String[] T01FM4_A3442XAlbRLoc ;
   private boolean[] T01FM4_n3442XAlbRLoc ;
   private java.util.Date[] T01FM4_A3443XAlbRFen ;
   private boolean[] T01FM4_n3443XAlbRFen ;
   private java.math.BigDecimal[] T01FM4_A3444XAlbRUniEn ;
   private boolean[] T01FM4_n3444XAlbRUniEn ;
   private String[] T01FM4_A3445XAlbRReo ;
   private boolean[] T01FM4_n3445XAlbRReo ;
   private short[] T01FM4_A3446XAlbRPieUt ;
   private boolean[] T01FM4_n3446XAlbRPieUt ;
   private short[] T01FM4_A3447XAlbRPieRe ;
   private boolean[] T01FM4_n3447XAlbRPieRe ;
   private java.math.BigDecimal[] T01FM4_A3448XAlbRUniUt ;
   private boolean[] T01FM4_n3448XAlbRUniUt ;
   private java.math.BigDecimal[] T01FM4_A3449XAlbRUniRe ;
   private boolean[] T01FM4_n3449XAlbRUniRe ;
   private java.util.Date[] T01FM4_A3450XAlbRFecUl ;
   private boolean[] T01FM4_n3450XAlbRFecUl ;
   private byte[] T01FM4_A3451XAlbREst ;
   private boolean[] T01FM4_n3451XAlbREst ;
   private short[] T01FM4_A3452XTipEntCod ;
   private boolean[] T01FM4_n3452XTipEntCod ;
   private short[] T01FM4_A3453XAlbNumEti ;
   private boolean[] T01FM4_n3453XAlbNumEti ;
   private String[] T01FM4_A3454XAlbRDes ;
   private boolean[] T01FM4_n3454XAlbRDes ;
   private short[] T01FM4_A3455XProceCod ;
   private boolean[] T01FM4_n3455XProceCod ;
   private byte[] T01FM4_A3456XAlbRULin ;
   private boolean[] T01FM4_n3456XAlbRULin ;
   private short[] T01FM4_A3457XHisEmpUL ;
   private boolean[] T01FM4_n3457XHisEmpUL ;
   private String[] T01FM4_A3458XAlbRDisC ;
   private boolean[] T01FM4_n3458XAlbRDisC ;
   private String[] T01FM4_A3459XAlbRImp ;
   private boolean[] T01FM4_n3459XAlbRImp ;
   private String[] T01FM4_A3460XRutina ;
   private boolean[] T01FM4_n3460XRutina ;
   private String[] T01FM4_A3828XAlbRefDsc ;
   private boolean[] T01FM4_n3828XAlbRefDsc ;
   private String[] T01FM4_A8050XAlbRefCom ;
   private boolean[] T01FM4_n8050XAlbRefCom ;
   private byte[] T01FM4_A11729Xprioritat ;
   private boolean[] T01FM4_n11729Xprioritat ;
   private String[] T01FM4_A396EmprCod ;
   private String[] T01FM14_A396EmprCod ;
   private int[] T01FM14_A3435XAlbRecCod ;
   private byte[] T01FM14_A3467XAlbRLin ;
   private String[] T01FM15_A396EmprCod ;
   private int[] T01FM15_A3435XAlbRecCod ;
   private String[] T01FM15_A5619XProCodAlb ;
   private byte[] T01FM15_A5620XProFasLin ;
   private String[] T01FM16_A396EmprCod ;
   private int[] T01FM16_A3435XAlbRecCod ;
   private String[] T01FM17_A396EmprCod ;
   private int[] T01FM17_A3435XAlbRecCod ;
   private String[] T01FM17_A3461XAlbRecPie ;
   private short[] T01FM17_A3462XAlbRecAnh ;
   private boolean[] T01FM17_n3462XAlbRecAnh ;
   private java.math.BigDecimal[] T01FM17_A3463XAlbRecMtr ;
   private boolean[] T01FM17_n3463XAlbRecMtr ;
   private java.math.BigDecimal[] T01FM17_A3464XAlbRecKgm ;
   private boolean[] T01FM17_n3464XAlbRecKgm ;
   private java.math.BigDecimal[] T01FM17_A3465XAlbRecMtU ;
   private boolean[] T01FM17_n3465XAlbRecMtU ;
   private java.math.BigDecimal[] T01FM17_A3466XAlbRecKgU ;
   private boolean[] T01FM17_n3466XAlbRecKgU ;
   private short[] T01FM17_A3728XAlbRecCol ;
   private boolean[] T01FM17_n3728XAlbRecCol ;
   private String[] T01FM17_A3729XAlbRecPza ;
   private boolean[] T01FM17_n3729XAlbRecPza ;
   private String[] T01FM17_A11730Xqualitat ;
   private boolean[] T01FM17_n11730Xqualitat ;
   private String[] T01FM17_A11731Xteler ;
   private boolean[] T01FM17_n11731Xteler ;
   private String[] T01FM18_A396EmprCod ;
   private int[] T01FM18_A3435XAlbRecCod ;
   private String[] T01FM18_A3461XAlbRecPie ;
   private String[] T01FM3_A396EmprCod ;
   private int[] T01FM3_A3435XAlbRecCod ;
   private String[] T01FM3_A3461XAlbRecPie ;
   private short[] T01FM3_A3462XAlbRecAnh ;
   private boolean[] T01FM3_n3462XAlbRecAnh ;
   private java.math.BigDecimal[] T01FM3_A3463XAlbRecMtr ;
   private boolean[] T01FM3_n3463XAlbRecMtr ;
   private java.math.BigDecimal[] T01FM3_A3464XAlbRecKgm ;
   private boolean[] T01FM3_n3464XAlbRecKgm ;
   private java.math.BigDecimal[] T01FM3_A3465XAlbRecMtU ;
   private boolean[] T01FM3_n3465XAlbRecMtU ;
   private java.math.BigDecimal[] T01FM3_A3466XAlbRecKgU ;
   private boolean[] T01FM3_n3466XAlbRecKgU ;
   private short[] T01FM3_A3728XAlbRecCol ;
   private boolean[] T01FM3_n3728XAlbRecCol ;
   private String[] T01FM3_A3729XAlbRecPza ;
   private boolean[] T01FM3_n3729XAlbRecPza ;
   private String[] T01FM3_A11730Xqualitat ;
   private boolean[] T01FM3_n11730Xqualitat ;
   private String[] T01FM3_A11731Xteler ;
   private boolean[] T01FM3_n11731Xteler ;
   private String[] T01FM2_A396EmprCod ;
   private int[] T01FM2_A3435XAlbRecCod ;
   private String[] T01FM2_A3461XAlbRecPie ;
   private short[] T01FM2_A3462XAlbRecAnh ;
   private boolean[] T01FM2_n3462XAlbRecAnh ;
   private java.math.BigDecimal[] T01FM2_A3463XAlbRecMtr ;
   private boolean[] T01FM2_n3463XAlbRecMtr ;
   private java.math.BigDecimal[] T01FM2_A3464XAlbRecKgm ;
   private boolean[] T01FM2_n3464XAlbRecKgm ;
   private java.math.BigDecimal[] T01FM2_A3465XAlbRecMtU ;
   private boolean[] T01FM2_n3465XAlbRecMtU ;
   private java.math.BigDecimal[] T01FM2_A3466XAlbRecKgU ;
   private boolean[] T01FM2_n3466XAlbRecKgU ;
   private short[] T01FM2_A3728XAlbRecCol ;
   private boolean[] T01FM2_n3728XAlbRecCol ;
   private String[] T01FM2_A3729XAlbRecPza ;
   private boolean[] T01FM2_n3729XAlbRecPza ;
   private String[] T01FM2_A11730Xqualitat ;
   private boolean[] T01FM2_n11730Xqualitat ;
   private String[] T01FM2_A11731Xteler ;
   private boolean[] T01FM2_n11731Xteler ;
   private String[] T01FM22_A396EmprCod ;
   private int[] T01FM22_A3435XAlbRecCod ;
   private String[] T01FM22_A3461XAlbRecPie ;
   private String[] T01FM23_A407EmprNom ;
   private boolean[] T01FM23_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class talbeur__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbeur__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbeur__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbeur__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbeur__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01FM2", "SELECT EmprCod, XAlbRecCod, XAlbRecPie, XAlbRecAnh, XAlbRecMtr, XAlbRecKgm, XAlbRecMtU, XAlbRecKgU, XAlbRecCol, XAlbRecPza, Xqualitat, Xteler FROM TXPALBEUD WHERE EmprCod = ? AND XAlbRecCod = ? AND XAlbRecPie = ?  FOR UPDATE OF XAlbRecAnh, XAlbRecMtr, XAlbRecKgm, XAlbRecMtU, XAlbRecKgU, XAlbRecCol, XAlbRecPza, Xqualitat, Xteler NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FM3", "SELECT EmprCod, XAlbRecCod, XAlbRecPie, XAlbRecAnh, XAlbRecMtr, XAlbRecKgm, XAlbRecMtU, XAlbRecKgU, XAlbRecCol, XAlbRecPza, Xqualitat, Xteler FROM TXPALBEUD WHERE EmprCod = ? AND XAlbRecCod = ? AND XAlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FM4", "SELECT XAlbRecCod, XCliCod, XAlbRef, XTrnCod, XAlbREnt, XAlbRPieEn, XAlbRUni, XAlbRLoc, XAlbRFen, XAlbRUniEn, XAlbRReo, XAlbRPieUt, XAlbRPieRe, XAlbRUniUt, XAlbRUniRe, XAlbRFecUl, XAlbREst, XTipEntCod, XAlbNumEti, XAlbRDes, XProceCod, XAlbRULin, XHisEmpUL, XAlbRDisC, XAlbRImp, XRutina, XAlbRefDsc, XAlbRefCom, Xprioritat, EmprCod FROM TXPALBEUR WHERE EmprCod = ? AND XAlbRecCod = ?  FOR UPDATE OF XCliCod, XAlbRef, XTrnCod, XAlbREnt, XAlbRPieEn, XAlbRUni, XAlbRLoc, XAlbRFen, XAlbRUniEn, XAlbRReo, XAlbRPieUt, XAlbRPieRe, XAlbRUniUt, XAlbRUniRe, XAlbRFecUl, XAlbREst, XTipEntCod, XAlbNumEti, XAlbRDes, XProceCod, XAlbRULin, XHisEmpUL, XAlbRDisC, XAlbRImp, XRutina, XAlbRefDsc, XAlbRefCom, Xprioritat NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FM5", "SELECT XAlbRecCod, XCliCod, XAlbRef, XTrnCod, XAlbREnt, XAlbRPieEn, XAlbRUni, XAlbRLoc, XAlbRFen, XAlbRUniEn, XAlbRReo, XAlbRPieUt, XAlbRPieRe, XAlbRUniUt, XAlbRUniRe, XAlbRFecUl, XAlbREst, XTipEntCod, XAlbNumEti, XAlbRDes, XProceCod, XAlbRULin, XHisEmpUL, XAlbRDisC, XAlbRImp, XRutina, XAlbRefDsc, XAlbRefCom, Xprioritat, EmprCod FROM TXPALBEUR WHERE EmprCod = ? AND XAlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FM6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FM7", "SELECT /*+ FIRST_ROWS(100) */ TM1.XAlbRecCod, T2.EmprNom, TM1.XCliCod, TM1.XAlbRef, TM1.XTrnCod, TM1.XAlbREnt, TM1.XAlbRPieEn, TM1.XAlbRUni, TM1.XAlbRLoc, TM1.XAlbRFen, TM1.XAlbRUniEn, TM1.XAlbRReo, TM1.XAlbRPieUt, TM1.XAlbRPieRe, TM1.XAlbRUniUt, TM1.XAlbRUniRe, TM1.XAlbRFecUl, TM1.XAlbREst, TM1.XTipEntCod, TM1.XAlbNumEti, TM1.XAlbRDes, TM1.XProceCod, TM1.XAlbRULin, TM1.XHisEmpUL, TM1.XAlbRDisC, TM1.XAlbRImp, TM1.XRutina, TM1.XAlbRefDsc, TM1.XAlbRefCom, TM1.Xprioritat, TM1.EmprCod FROM (TXPALBEUR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.XAlbRecCod = ? ORDER BY TM1.EmprCod, TM1.XAlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FM8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, XAlbRecCod FROM TXPALBEUR WHERE EmprCod = ? AND XAlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FM9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, XAlbRecCod FROM TXPALBEUR WHERE ( XAlbRecCod > ?) and EmprCod = ? ORDER BY EmprCod, XAlbRecCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FM10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, XAlbRecCod FROM TXPALBEUR WHERE ( XAlbRecCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, XAlbRecCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FM11", "INSERT INTO TXPALBEUR(XAlbRecCod, XCliCod, XAlbRef, XTrnCod, XAlbREnt, XAlbRPieEn, XAlbRUni, XAlbRLoc, XAlbRFen, XAlbRUniEn, XAlbRReo, XAlbRPieUt, XAlbRPieRe, XAlbRUniUt, XAlbRUniRe, XAlbRFecUl, XAlbREst, XTipEntCod, XAlbNumEti, XAlbRDes, XProceCod, XAlbRULin, XHisEmpUL, XAlbRDisC, XAlbRImp, XRutina, XAlbRefDsc, XAlbRefCom, Xprioritat, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPALBEUR")
         ,new UpdateCursor("T01FM12", "UPDATE TXPALBEUR SET XCliCod=?, XAlbRef=?, XTrnCod=?, XAlbREnt=?, XAlbRPieEn=?, XAlbRUni=?, XAlbRLoc=?, XAlbRFen=?, XAlbRUniEn=?, XAlbRReo=?, XAlbRPieUt=?, XAlbRPieRe=?, XAlbRUniUt=?, XAlbRUniRe=?, XAlbRFecUl=?, XAlbREst=?, XTipEntCod=?, XAlbNumEti=?, XAlbRDes=?, XProceCod=?, XAlbRULin=?, XHisEmpUL=?, XAlbRDisC=?, XAlbRImp=?, XRutina=?, XAlbRefDsc=?, XAlbRefCom=?, Xprioritat=?  WHERE EmprCod = ? AND XAlbRecCod = ?", GX_NOMASK, "TXPALBEUR")
         ,new UpdateCursor("T01FM13", "DELETE FROM TXPALBEUR  WHERE EmprCod = ? AND XAlbRecCod = ?", GX_NOMASK, "TXPALBEUR")
         ,new ForEachCursor("T01FM14", "SELECT * FROM (SELECT EmprCod, XAlbRecCod, XAlbRLin FROM TXPALBEOB WHERE EmprCod = ? AND XAlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FM15", "SELECT * FROM (SELECT EmprCod, XAlbRecCod, XProCodAlb, XProFasLin FROM TXPALBVPR WHERE EmprCod = ? AND XAlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FM16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, XAlbRecCod FROM TXPALBEUR WHERE EmprCod = ? ORDER BY EmprCod, XAlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FM17", "SELECT EmprCod, XAlbRecCod, XAlbRecPie, XAlbRecAnh, XAlbRecMtr, XAlbRecKgm, XAlbRecMtU, XAlbRecKgU, XAlbRecCol, XAlbRecPza, Xqualitat, Xteler FROM TXPALBEUD WHERE EmprCod = ? and XAlbRecCod = ? and XAlbRecPie = ? ORDER BY EmprCod, XAlbRecCod, XAlbRecPie ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FM18", "SELECT EmprCod, XAlbRecCod, XAlbRecPie FROM TXPALBEUD WHERE EmprCod = ? AND XAlbRecCod = ? AND XAlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01FM19", "INSERT INTO TXPALBEUD(EmprCod, XAlbRecCod, XAlbRecPie, XAlbRecAnh, XAlbRecMtr, XAlbRecKgm, XAlbRecMtU, XAlbRecKgU, XAlbRecCol, XAlbRecPza, Xqualitat, Xteler) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPALBEUD")
         ,new UpdateCursor("T01FM20", "UPDATE TXPALBEUD SET XAlbRecAnh=?, XAlbRecMtr=?, XAlbRecKgm=?, XAlbRecMtU=?, XAlbRecKgU=?, XAlbRecCol=?, XAlbRecPza=?, Xqualitat=?, Xteler=?  WHERE EmprCod = ? AND XAlbRecCod = ? AND XAlbRecPie = ?", GX_NOMASK, "TXPALBEUD")
         ,new UpdateCursor("T01FM21", "DELETE FROM TXPALBEUD  WHERE EmprCod = ? AND XAlbRecCod = ? AND XAlbRecPie = ?", GX_NOMASK, "TXPALBEUD")
         ,new ForEachCursor("T01FM22", "SELECT EmprCod, XAlbRecCod, XAlbRecPie FROM TXPALBEUD WHERE EmprCod = ? and XAlbRecCod = ? ORDER BY EmprCod, XAlbRecCod, XAlbRecPie ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FM23", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((byte[]) buf[41])[0] = rslt.getByte(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 8);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 26);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 30);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((byte[]) buf[55])[0] = rslt.getByte(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((byte[]) buf[41])[0] = rslt.getByte(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 8);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 26);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 30);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((byte[]) buf[55])[0] = rslt.getByte(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 20);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((byte[]) buf[43])[0] = rslt.getByte(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((short[]) buf[45])[0] = rslt.getShort(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 8);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 26);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(29, 30);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((byte[]) buf[57])[0] = rslt.getByte(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 3);
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 21 :
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
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
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
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 8);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 10);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[16]);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[22]).shortValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DATE );
               }
               else
               {
                  stmt.setDate(16, (java.util.Date)parms[30]);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[32]).byteValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[34]).shortValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[36]).shortValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[38], 20);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[40]).shortValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(22, ((Number) parms[42]).byteValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[44]).shortValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[46], 8);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[48], 1);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[50], 1);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[52], 26);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[54], 30);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(29, ((Number) parms[56]).byteValue());
               }
               stmt.setString(30, (String)parms[57], 3);
               return;
            case 10 :
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
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 8);
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
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 10);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[15]);
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
                  stmt.setString(10, (String)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DATE );
               }
               else
               {
                  stmt.setDate(15, (java.util.Date)parms[29]);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[31]).byteValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[33]).shortValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[35]).shortValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 20);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[39]).shortValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[41]).byteValue());
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
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 8);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 1);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[49], 1);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[51], 26);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[53], 30);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(28, ((Number) parms[55]).byteValue());
               }
               stmt.setString(29, (String)parms[56], 3);
               stmt.setInt(30, ((Number) parms[57]).intValue());
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
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[16], 15);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[20], 10);
               }
               return;
            case 18 :
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
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
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
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 15);
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
                  stmt.setString(9, (String)parms[17], 10);
               }
               stmt.setString(10, (String)parms[18], 3);
               stmt.setInt(11, ((Number) parms[19]).intValue());
               stmt.setString(12, (String)parms[20], 9);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

