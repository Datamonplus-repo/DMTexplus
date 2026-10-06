package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trepmat_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "RECEPCION TELA,MATERIALES", ""), (short)(0)) ;
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
      nRC_GXsfl_70 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_70"))) ;
      nGXsfl_70_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_70_idx"))) ;
      sGXsfl_70_idx = httpContext.GetPar( "sGXsfl_70_idx") ;
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

   public trepmat_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trepmat_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trepmat_impl.class ));
   }

   public trepmat_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREPMAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREPMAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREPMAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREPMAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TREPMAT.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREPMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREPMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREPMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREPMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "N Recepcion ID", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREPMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRecCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREPMAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREPMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Albaran Entrega", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREPMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbREnt_Internalname, GXutil.rtrim( A46AlbREnt), GXutil.rtrim( localUtil.format( A46AlbREnt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbREnt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbREnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREPMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "AlbREnt2", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREPMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbREnt2_Internalname, GXutil.rtrim( A5806AlbREnt2), GXutil.rtrim( localUtil.format( A5806AlbREnt2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbREnt2_Jsonclick, 0, "", "", "", "", "", 1, edtAlbREnt2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREPMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Piezas Entregadas", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREPMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieEnt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPieEnt_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREPMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Unidades Entrada", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREPMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniEnt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREPMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Referencia", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREPMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef), GXutil.rtrim( localUtil.format( A45AlbRef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRef_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRef_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREPMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descripcion Referencia", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREPMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRefDsc_Internalname, GXutil.rtrim( A3613AlbRefDsc), GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRefDsc_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRefDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREPMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREPMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMatC_ULin_Internalname, GXutil.ltrim( localUtil.ntoc( A7114MatC_ULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMatC_ULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7114MatC_ULin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7114MatC_ULin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMatC_ULin_Jsonclick, 0, "", "", "", "", "", 1, edtMatC_ULin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TREPMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol70( ) ;
      nGXsfl_70_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1008 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1008 = (short)(1) ;
            scanStartY31008( ) ;
            while ( RcdFound1008 != 0 )
            {
               init_level_properties1008( ) ;
               getByPrimaryKeyY31008( ) ;
               addRowY31008( ) ;
               scanNextY31008( ) ;
            }
            scanEndY31008( ) ;
            nBlankRcdCount1008 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalY31008( ) ;
         standaloneModalY31008( ) ;
         sMode1008 = Gx_mode ;
         while ( nGXsfl_70_idx < nRC_GXsfl_70 )
         {
            bGXsfl_70_Refreshing = true ;
            readRowY31008( ) ;
            edtavnRcdDeleted_1008_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1008_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1008_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1008_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtMatC_Lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_LIN_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMatC_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_Lin_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtMatC_Est_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_EST_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMatC_Est_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_Est_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtMatC_Mat_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_MAT_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMatC_Mat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_Mat_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtMatC_Tor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_TOR_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMatC_Tor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_Tor_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtMatC_Col_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_COL_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMatC_Col_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_Col_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtMatC_Prov_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_PROV_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMatC_Prov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_Prov_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtMatC_Lote_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_LOTE_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMatC_Lote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_Lote_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtMatC_Porc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_PORC_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMatC_Porc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_Porc_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtMatC_Lm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_LM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMatC_Lm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_Lm_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtMatC_Obs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_OBS_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMatC_Obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_Obs_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtMatC_MaqT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_MAQT_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMatC_MaqT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_MaqT_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtMatC_CliRm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_CLIRM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMatC_CliRm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_CliRm_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtMatC_TraIn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_TRAIN_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMatC_TraIn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_TraIn_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            if ( ( nRcdExists_1008 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalY31008( ) ;
            }
            sendRowY31008( ) ;
            bGXsfl_70_Refreshing = false ;
         }
         Gx_mode = sMode1008 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1008 = (short)(5) ;
         nRcdExists_1008 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartY31008( ) ;
            while ( RcdFound1008 != 0 )
            {
               sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_701008( ) ;
               init_level_properties1008( ) ;
               standaloneNotModalY31008( ) ;
               getByPrimaryKeyY31008( ) ;
               standaloneModalY31008( ) ;
               addRowY31008( ) ;
               scanNextY31008( ) ;
            }
            scanEndY31008( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1008 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_701008( ) ;
      initAllY31008( ) ;
      init_level_properties1008( ) ;
      nRcdExists_1008 = (short)(0) ;
      nIsMod_1008 = (short)(0) ;
      nRcdDeleted_1008 = (short)(0) ;
      nBlankRcdCount1008 = (short)(nBlankRcdUsr1008+nBlankRcdCount1008) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1008 > 0 )
      {
         standaloneNotModalY31008( ) ;
         standaloneModalY31008( ) ;
         addRowY31008( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMatC_Lin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1008 = (short)(nBlankRcdCount1008-1) ;
      }
      Gx_mode = sMode1008 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREPMAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREPMAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREPMAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREPMAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TREPMAT.htm");
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
         Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z46AlbREnt = httpContext.cgiGet( "Z46AlbREnt") ;
         Z5806AlbREnt2 = httpContext.cgiGet( "Z5806AlbREnt2") ;
         Z52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "Z52AlbRPieEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "Z58AlbRUniEnt")) ;
         Z45AlbRef = httpContext.cgiGet( "Z45AlbRef") ;
         Z3613AlbRefDsc = httpContext.cgiGet( "Z3613AlbRefDsc") ;
         Z7114MatC_ULin = (short)(localUtil.ctol( httpContext.cgiGet( "Z7114MatC_ULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_70 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_70"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRECCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRecCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A44AlbRecCod = 0 ;
            n44AlbRecCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         }
         else
         {
            A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n44AlbRecCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         }
         A46AlbREnt = httpContext.cgiGet( edtAlbREnt_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         A5806AlbREnt2 = httpContext.cgiGet( edtAlbREnt2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPIEENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRPieEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A52AlbRPieEnt = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         }
         else
         {
            A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUNIENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRUniEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A58AlbRUniEnt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
         else
         {
            A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
         A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMatC_ULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMatC_ULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MATC_ULIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMatC_ULin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7114MatC_ULin = (short)(0) ;
            n7114MatC_ULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7114MatC_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7114MatC_ULin), 4, 0));
         }
         else
         {
            A7114MatC_ULin = (short)(localUtil.ctol( httpContext.cgiGet( edtMatC_ULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7114MatC_ULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7114MatC_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7114MatC_ULin), 4, 0));
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
            A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
            n44AlbRecCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
            initAllY37( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1008_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1008_Enabled), 5, 0), !bGXsfl_70_Refreshing);
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
      disableAttributesY37( ) ;
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

   public void confirm_Y30( )
   {
      beforeValidateY37( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsY37( ) ;
         }
         else
         {
            checkExtendedTableY37( ) ;
            if ( AnyError == 0 )
            {
               zmY37( 2) ;
            }
            closeExtendedTableCursorsY37( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode7 = Gx_mode ;
         confirm_Y31008( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode7 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesY30( ) ;
      }
   }

   public void confirm_Y31008( )
   {
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRowY31008( ) ;
         if ( ( nRcdExists_1008 != 0 ) || ( nIsMod_1008 != 0 ) )
         {
            getKeyY31008( ) ;
            if ( ( nRcdExists_1008 == 0 ) && ( nRcdDeleted_1008 == 0 ) )
            {
               if ( RcdFound1008 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateY31008( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableY31008( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsY31008( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "MATC_LIN_" + sGXsfl_70_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMatC_Lin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1008 != 0 )
               {
                  if ( nRcdDeleted_1008 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyY31008( ) ;
                     loadY31008( ) ;
                     beforeValidateY31008( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsY31008( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1008 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateY31008( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableY31008( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsY31008( ) ;
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
                  if ( nRcdDeleted_1008 == 0 )
                  {
                     GXCCtl = "MATC_LIN_" + sGXsfl_70_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMatC_Lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1008_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1008, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMatC_Lin_Internalname, GXutil.ltrim( localUtil.ntoc( A7115MatC_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMatC_Est_Internalname, GXutil.rtrim( A7116MatC_Est)) ;
         httpContext.changePostValue( edtMatC_Mat_Internalname, GXutil.rtrim( A7117MatC_Mat)) ;
         httpContext.changePostValue( edtMatC_Tor_Internalname, GXutil.rtrim( A7118MatC_Tor)) ;
         httpContext.changePostValue( edtMatC_Col_Internalname, GXutil.rtrim( A7119MatC_Col)) ;
         httpContext.changePostValue( edtMatC_Prov_Internalname, GXutil.rtrim( A7120MatC_Prov)) ;
         httpContext.changePostValue( edtMatC_Lote_Internalname, GXutil.rtrim( A7121MatC_Lote)) ;
         httpContext.changePostValue( edtMatC_Porc_Internalname, GXutil.ltrim( localUtil.ntoc( A7122MatC_Porc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMatC_Lm_Internalname, GXutil.ltrim( localUtil.ntoc( A7123MatC_Lm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMatC_Obs_Internalname, A7124MatC_Obs) ;
         httpContext.changePostValue( edtMatC_MaqT_Internalname, GXutil.rtrim( A7125MatC_MaqT)) ;
         httpContext.changePostValue( edtMatC_CliRm_Internalname, GXutil.rtrim( A7126MatC_CliRm)) ;
         httpContext.changePostValue( edtMatC_TraIn_Internalname, GXutil.ltrim( localUtil.ntoc( A7127MatC_TraIn, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7115MatC_Lin_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z7115MatC_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7116MatC_Est_"+sGXsfl_70_idx, GXutil.rtrim( Z7116MatC_Est)) ;
         httpContext.changePostValue( "ZT_"+"Z7117MatC_Mat_"+sGXsfl_70_idx, GXutil.rtrim( Z7117MatC_Mat)) ;
         httpContext.changePostValue( "ZT_"+"Z7118MatC_Tor_"+sGXsfl_70_idx, GXutil.rtrim( Z7118MatC_Tor)) ;
         httpContext.changePostValue( "ZT_"+"Z7119MatC_Col_"+sGXsfl_70_idx, GXutil.rtrim( Z7119MatC_Col)) ;
         httpContext.changePostValue( "ZT_"+"Z7120MatC_Prov_"+sGXsfl_70_idx, GXutil.rtrim( Z7120MatC_Prov)) ;
         httpContext.changePostValue( "ZT_"+"Z7121MatC_Lote_"+sGXsfl_70_idx, GXutil.rtrim( Z7121MatC_Lote)) ;
         httpContext.changePostValue( "ZT_"+"Z7122MatC_Porc_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z7122MatC_Porc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7123MatC_Lm_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z7123MatC_Lm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7125MatC_MaqT_"+sGXsfl_70_idx, GXutil.rtrim( Z7125MatC_MaqT)) ;
         httpContext.changePostValue( "ZT_"+"Z7126MatC_CliRm_"+sGXsfl_70_idx, GXutil.rtrim( Z7126MatC_CliRm)) ;
         httpContext.changePostValue( "ZT_"+"Z7127MatC_TraIn_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z7127MatC_TraIn, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1008_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1008, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1008_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1008, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1008_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1008, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1008 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1008_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1008_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_LIN_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_EST_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Est_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_MAT_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Mat_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_TOR_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Tor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_COL_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Col_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_PROV_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Prov_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_LOTE_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Lote_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_PORC_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Porc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_LM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Lm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_OBS_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Obs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_MAQT_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_MaqT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_CLIRM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_CliRm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_TRAIN_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_TraIn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionY30( )
   {
   }

   public void zmY37( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z46AlbREnt = T00Y35_A46AlbREnt[0] ;
            Z5806AlbREnt2 = T00Y35_A5806AlbREnt2[0] ;
            Z52AlbRPieEnt = T00Y35_A52AlbRPieEnt[0] ;
            Z58AlbRUniEnt = T00Y35_A58AlbRUniEnt[0] ;
            Z45AlbRef = T00Y35_A45AlbRef[0] ;
            Z3613AlbRefDsc = T00Y35_A3613AlbRefDsc[0] ;
            Z7114MatC_ULin = T00Y35_A7114MatC_ULin[0] ;
         }
         else
         {
            Z46AlbREnt = A46AlbREnt ;
            Z5806AlbREnt2 = A5806AlbREnt2 ;
            Z52AlbRPieEnt = A52AlbRPieEnt ;
            Z58AlbRUniEnt = A58AlbRUniEnt ;
            Z45AlbRef = A45AlbRef ;
            Z3613AlbRefDsc = A3613AlbRefDsc ;
            Z7114MatC_ULin = A7114MatC_ULin ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z44AlbRecCod = A44AlbRecCod ;
         Z46AlbREnt = A46AlbREnt ;
         Z5806AlbREnt2 = A5806AlbREnt2 ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z45AlbRef = A45AlbRef ;
         Z3613AlbRefDsc = A3613AlbRefDsc ;
         Z7114MatC_ULin = A7114MatC_ULin ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
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

   public void loadY37( )
   {
      /* Using cursor T00Y37 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A407EmprNom = T00Y37_A407EmprNom[0] ;
         n407EmprNom = T00Y37_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A46AlbREnt = T00Y37_A46AlbREnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         A5806AlbREnt2 = T00Y37_A5806AlbREnt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
         A52AlbRPieEnt = T00Y37_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A58AlbRUniEnt = T00Y37_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A45AlbRef = T00Y37_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A3613AlbRefDsc = T00Y37_A3613AlbRefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         A7114MatC_ULin = T00Y37_A7114MatC_ULin[0] ;
         n7114MatC_ULin = T00Y37_n7114MatC_ULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7114MatC_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7114MatC_ULin), 4, 0));
         zmY37( -1) ;
      }
      pr_default.close(5);
      onLoadActionsY37( ) ;
   }

   public void onLoadActionsY37( )
   {
   }

   public void checkExtendedTableY37( )
   {
      nIsDirty_7 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00Y36 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00Y36_A407EmprNom[0] ;
      n407EmprNom = T00Y36_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
   }

   public void closeExtendedTableCursorsY37( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T00Y38 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00Y38_A407EmprNom[0] ;
      n407EmprNom = T00Y38_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKeyY37( )
   {
      /* Using cursor T00Y39 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound7 = (short)(1) ;
      }
      else
      {
         RcdFound7 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00Y35 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zmY37( 1) ;
         RcdFound7 = (short)(1) ;
         A44AlbRecCod = T00Y35_A44AlbRecCod[0] ;
         n44AlbRecCod = T00Y35_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A46AlbREnt = T00Y35_A46AlbREnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         A5806AlbREnt2 = T00Y35_A5806AlbREnt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
         A52AlbRPieEnt = T00Y35_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A58AlbRUniEnt = T00Y35_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A45AlbRef = T00Y35_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A3613AlbRefDsc = T00Y35_A3613AlbRefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         A7114MatC_ULin = T00Y35_A7114MatC_ULin[0] ;
         n7114MatC_ULin = T00Y35_n7114MatC_ULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7114MatC_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7114MatC_ULin), 4, 0));
         A396EmprCod = T00Y35_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadY37( ) ;
         if ( AnyError == 1 )
         {
            RcdFound7 = (short)(0) ;
            initializeNonKeyY37( ) ;
         }
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound7 = (short)(0) ;
         initializeNonKeyY37( ) ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyY37( ) ;
      if ( RcdFound7 == 0 )
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
      RcdFound7 = (short)(0) ;
      /* Using cursor T00Y310 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T00Y310_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00Y310_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00Y310_A44AlbRecCod[0] < A44AlbRecCod ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T00Y310_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00Y310_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00Y310_A44AlbRecCod[0] > A44AlbRecCod ) ) )
         {
            A396EmprCod = T00Y310_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A44AlbRecCod = T00Y310_A44AlbRecCod[0] ;
            n44AlbRecCod = T00Y310_n44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound7 = (short)(0) ;
      /* Using cursor T00Y311 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T00Y311_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00Y311_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00Y311_A44AlbRecCod[0] > A44AlbRecCod ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T00Y311_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00Y311_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00Y311_A44AlbRecCod[0] < A44AlbRecCod ) ) )
         {
            A396EmprCod = T00Y311_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A44AlbRecCod = T00Y311_A44AlbRecCod[0] ;
            n44AlbRecCod = T00Y311_n44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyY37( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertY37( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound7 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A44AlbRecCod = Z44AlbRecCod ;
               n44AlbRecCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
               updateY37( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertY37( ) ;
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
                  insertY37( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = Z44AlbRecCod ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
      getKeyY37( ) ;
      if ( RcdFound7 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A44AlbRecCod = Z44AlbRecCod ;
            n44AlbRecCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "trepmat");
      GX_FocusControl = edtAlbREnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_Y30( ) ;
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
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtAlbREnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartY37( ) ;
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbREnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndY37( ) ;
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
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbREnt_Internalname ;
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
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbREnt_Internalname ;
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
      scanStartY37( ) ;
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound7 != 0 )
         {
            scanNextY37( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbREnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndY37( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyY37( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00Y34 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z46AlbREnt, T00Y34_A46AlbREnt[0]) != 0 ) || ( GXutil.strcmp(Z5806AlbREnt2, T00Y34_A5806AlbREnt2[0]) != 0 ) || ( Z52AlbRPieEnt != T00Y34_A52AlbRPieEnt[0] ) || ( DecimalUtil.compareTo(Z58AlbRUniEnt, T00Y34_A58AlbRUniEnt[0]) != 0 ) || ( GXutil.strcmp(Z45AlbRef, T00Y34_A45AlbRef[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3613AlbRefDsc, T00Y34_A3613AlbRefDsc[0]) != 0 ) || ( Z7114MatC_ULin != T00Y34_A7114MatC_ULin[0] ) )
         {
            if ( GXutil.strcmp(Z46AlbREnt, T00Y34_A46AlbREnt[0]) != 0 )
            {
               GXutil.writeLogln("trepmat:[seudo value changed for attri]"+"AlbREnt");
               GXutil.writeLogRaw("Old: ",Z46AlbREnt);
               GXutil.writeLogRaw("Current: ",T00Y34_A46AlbREnt[0]);
            }
            if ( GXutil.strcmp(Z5806AlbREnt2, T00Y34_A5806AlbREnt2[0]) != 0 )
            {
               GXutil.writeLogln("trepmat:[seudo value changed for attri]"+"AlbREnt2");
               GXutil.writeLogRaw("Old: ",Z5806AlbREnt2);
               GXutil.writeLogRaw("Current: ",T00Y34_A5806AlbREnt2[0]);
            }
            if ( Z52AlbRPieEnt != T00Y34_A52AlbRPieEnt[0] )
            {
               GXutil.writeLogln("trepmat:[seudo value changed for attri]"+"AlbRPieEnt");
               GXutil.writeLogRaw("Old: ",Z52AlbRPieEnt);
               GXutil.writeLogRaw("Current: ",T00Y34_A52AlbRPieEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z58AlbRUniEnt, T00Y34_A58AlbRUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("trepmat:[seudo value changed for attri]"+"AlbRUniEnt");
               GXutil.writeLogRaw("Old: ",Z58AlbRUniEnt);
               GXutil.writeLogRaw("Current: ",T00Y34_A58AlbRUniEnt[0]);
            }
            if ( GXutil.strcmp(Z45AlbRef, T00Y34_A45AlbRef[0]) != 0 )
            {
               GXutil.writeLogln("trepmat:[seudo value changed for attri]"+"AlbRef");
               GXutil.writeLogRaw("Old: ",Z45AlbRef);
               GXutil.writeLogRaw("Current: ",T00Y34_A45AlbRef[0]);
            }
            if ( GXutil.strcmp(Z3613AlbRefDsc, T00Y34_A3613AlbRefDsc[0]) != 0 )
            {
               GXutil.writeLogln("trepmat:[seudo value changed for attri]"+"AlbRefDsc");
               GXutil.writeLogRaw("Old: ",Z3613AlbRefDsc);
               GXutil.writeLogRaw("Current: ",T00Y34_A3613AlbRefDsc[0]);
            }
            if ( Z7114MatC_ULin != T00Y34_A7114MatC_ULin[0] )
            {
               GXutil.writeLogln("trepmat:[seudo value changed for attri]"+"MatC_ULin");
               GXutil.writeLogRaw("Old: ",Z7114MatC_ULin);
               GXutil.writeLogRaw("Current: ",T00Y34_A7114MatC_ULin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertY37( )
   {
      beforeValidateY37( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableY37( ) ;
      }
      if ( AnyError == 0 )
      {
         zmY37( 0) ;
         checkOptimisticConcurrencyY37( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmY37( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertY37( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00Y312 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A46AlbREnt, A5806AlbREnt2, Integer.valueOf(A52AlbRPieEnt), A58AlbRUniEnt, A45AlbRef, A3613AlbRefDsc, Boolean.valueOf(n7114MatC_ULin), Short.valueOf(A7114MatC_ULin), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
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
                        processLevelY37( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionY30( ) ;
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
            loadY37( ) ;
         }
         endLevelY37( ) ;
      }
      closeExtendedTableCursorsY37( ) ;
   }

   public void updateY37( )
   {
      beforeValidateY37( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableY37( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyY37( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmY37( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateY37( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00Y313 */
                  pr_default.execute(11, new Object[] {A46AlbREnt, A5806AlbREnt2, Integer.valueOf(A52AlbRPieEnt), A58AlbRUniEnt, A45AlbRef, A3613AlbRefDsc, Boolean.valueOf(n7114MatC_ULin), Short.valueOf(A7114MatC_ULin), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateY37( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char1[0] = A396EmprCod ;
                     GXv_int2[0] = A44AlbRecCod ;
                     new app.txpalbrecupdateredundancy(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
                     trepmat_impl.this.A396EmprCod = GXv_char1[0] ;
                     trepmat_impl.this.A44AlbRecCod = GXv_int2[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelY37( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionY30( ) ;
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
         endLevelY37( ) ;
      }
      closeExtendedTableCursorsY37( ) ;
   }

   public void deferredUpdateY37( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateY37( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyY37( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsY37( ) ;
         afterConfirmY37( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteY37( ) ;
            if ( AnyError == 0 )
            {
               scanStartY31008( ) ;
               while ( RcdFound1008 != 0 )
               {
                  getByPrimaryKeyY31008( ) ;
                  deleteY31008( ) ;
                  scanNextY31008( ) ;
               }
               scanEndY31008( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00Y314 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound7 == 0 )
                        {
                           initAllY37( ) ;
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
                        resetCaptionY30( ) ;
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
      sMode7 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelY37( ) ;
      Gx_mode = sMode7 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsY37( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00Y315 */
         pr_default.execute(13, new Object[] {A396EmprCod});
         A407EmprNom = T00Y315_A407EmprNom[0] ;
         n407EmprNom = T00Y315_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(13);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00Y316 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Entradas Almacen Crudo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T00Y317 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T00Y318 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T00Y319 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPPZS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T00Y320 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPTAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T00Y321 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREPg", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T00Y322 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVEM1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T00Y323 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBRDF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00Y324 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBDET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T00Y325 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T00Y326 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBROB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T00Y327 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T00Y328 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVGEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T00Y329 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
      }
   }

   public void processNestedLevelY31008( )
   {
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRowY31008( ) ;
         if ( ( nRcdExists_1008 != 0 ) || ( nIsMod_1008 != 0 ) )
         {
            standaloneNotModalY31008( ) ;
            getKeyY31008( ) ;
            if ( ( nRcdExists_1008 == 0 ) && ( nRcdDeleted_1008 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertY31008( ) ;
            }
            else
            {
               if ( RcdFound1008 != 0 )
               {
                  if ( ( nRcdDeleted_1008 != 0 ) && ( nRcdExists_1008 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteY31008( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1008 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateY31008( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1008 == 0 )
                  {
                     GXCCtl = "MATC_LIN_" + sGXsfl_70_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMatC_Lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1008_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1008, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMatC_Lin_Internalname, GXutil.ltrim( localUtil.ntoc( A7115MatC_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMatC_Est_Internalname, GXutil.rtrim( A7116MatC_Est)) ;
         httpContext.changePostValue( edtMatC_Mat_Internalname, GXutil.rtrim( A7117MatC_Mat)) ;
         httpContext.changePostValue( edtMatC_Tor_Internalname, GXutil.rtrim( A7118MatC_Tor)) ;
         httpContext.changePostValue( edtMatC_Col_Internalname, GXutil.rtrim( A7119MatC_Col)) ;
         httpContext.changePostValue( edtMatC_Prov_Internalname, GXutil.rtrim( A7120MatC_Prov)) ;
         httpContext.changePostValue( edtMatC_Lote_Internalname, GXutil.rtrim( A7121MatC_Lote)) ;
         httpContext.changePostValue( edtMatC_Porc_Internalname, GXutil.ltrim( localUtil.ntoc( A7122MatC_Porc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMatC_Lm_Internalname, GXutil.ltrim( localUtil.ntoc( A7123MatC_Lm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMatC_Obs_Internalname, A7124MatC_Obs) ;
         httpContext.changePostValue( edtMatC_MaqT_Internalname, GXutil.rtrim( A7125MatC_MaqT)) ;
         httpContext.changePostValue( edtMatC_CliRm_Internalname, GXutil.rtrim( A7126MatC_CliRm)) ;
         httpContext.changePostValue( edtMatC_TraIn_Internalname, GXutil.ltrim( localUtil.ntoc( A7127MatC_TraIn, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7115MatC_Lin_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z7115MatC_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7116MatC_Est_"+sGXsfl_70_idx, GXutil.rtrim( Z7116MatC_Est)) ;
         httpContext.changePostValue( "ZT_"+"Z7117MatC_Mat_"+sGXsfl_70_idx, GXutil.rtrim( Z7117MatC_Mat)) ;
         httpContext.changePostValue( "ZT_"+"Z7118MatC_Tor_"+sGXsfl_70_idx, GXutil.rtrim( Z7118MatC_Tor)) ;
         httpContext.changePostValue( "ZT_"+"Z7119MatC_Col_"+sGXsfl_70_idx, GXutil.rtrim( Z7119MatC_Col)) ;
         httpContext.changePostValue( "ZT_"+"Z7120MatC_Prov_"+sGXsfl_70_idx, GXutil.rtrim( Z7120MatC_Prov)) ;
         httpContext.changePostValue( "ZT_"+"Z7121MatC_Lote_"+sGXsfl_70_idx, GXutil.rtrim( Z7121MatC_Lote)) ;
         httpContext.changePostValue( "ZT_"+"Z7122MatC_Porc_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z7122MatC_Porc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7123MatC_Lm_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z7123MatC_Lm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7125MatC_MaqT_"+sGXsfl_70_idx, GXutil.rtrim( Z7125MatC_MaqT)) ;
         httpContext.changePostValue( "ZT_"+"Z7126MatC_CliRm_"+sGXsfl_70_idx, GXutil.rtrim( Z7126MatC_CliRm)) ;
         httpContext.changePostValue( "ZT_"+"Z7127MatC_TraIn_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z7127MatC_TraIn, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1008_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1008, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1008_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1008, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1008_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1008, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1008 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1008_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1008_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_LIN_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_EST_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Est_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_MAT_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Mat_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_TOR_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Tor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_COL_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Col_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_PROV_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Prov_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_LOTE_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Lote_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_PORC_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Porc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_LM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Lm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_OBS_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Obs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_MAQT_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_MaqT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_CLIRM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_CliRm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MATC_TRAIN_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_TraIn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllY31008( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1008 = (short)(0) ;
      nIsMod_1008 = (short)(0) ;
      nRcdDeleted_1008 = (short)(0) ;
   }

   public void processLevelY37( )
   {
      /* Save parent mode. */
      sMode7 = Gx_mode ;
      processNestedLevelY31008( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode7 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelY37( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteY37( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "trepmat");
         if ( AnyError == 0 )
         {
            confirmValuesY30( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "trepmat");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartY37( )
   {
      /* Using cursor T00Y330 */
      pr_default.execute(28);
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A396EmprCod = T00Y330_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = T00Y330_A44AlbRecCod[0] ;
         n44AlbRecCod = T00Y330_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextY37( )
   {
      /* Scan next routine */
      pr_default.readNext(28);
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A396EmprCod = T00Y330_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = T00Y330_A44AlbRecCod[0] ;
         n44AlbRecCod = T00Y330_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
   }

   public void scanEndY37( )
   {
      pr_default.close(28);
   }

   public void afterConfirmY37( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertY37( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateY37( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteY37( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteY37( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateY37( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesY37( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtAlbREnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Enabled), 5, 0), true);
      edtAlbREnt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Enabled), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      edtAlbRefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Enabled), 5, 0), true);
      edtMatC_ULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMatC_ULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_ULin_Enabled), 5, 0), true);
   }

   public void zmY31008( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7116MatC_Est = T00Y33_A7116MatC_Est[0] ;
            Z7117MatC_Mat = T00Y33_A7117MatC_Mat[0] ;
            Z7118MatC_Tor = T00Y33_A7118MatC_Tor[0] ;
            Z7119MatC_Col = T00Y33_A7119MatC_Col[0] ;
            Z7120MatC_Prov = T00Y33_A7120MatC_Prov[0] ;
            Z7121MatC_Lote = T00Y33_A7121MatC_Lote[0] ;
            Z7122MatC_Porc = T00Y33_A7122MatC_Porc[0] ;
            Z7123MatC_Lm = T00Y33_A7123MatC_Lm[0] ;
            Z7125MatC_MaqT = T00Y33_A7125MatC_MaqT[0] ;
            Z7126MatC_CliRm = T00Y33_A7126MatC_CliRm[0] ;
            Z7127MatC_TraIn = T00Y33_A7127MatC_TraIn[0] ;
         }
         else
         {
            Z7116MatC_Est = A7116MatC_Est ;
            Z7117MatC_Mat = A7117MatC_Mat ;
            Z7118MatC_Tor = A7118MatC_Tor ;
            Z7119MatC_Col = A7119MatC_Col ;
            Z7120MatC_Prov = A7120MatC_Prov ;
            Z7121MatC_Lote = A7121MatC_Lote ;
            Z7122MatC_Porc = A7122MatC_Porc ;
            Z7123MatC_Lm = A7123MatC_Lm ;
            Z7125MatC_MaqT = A7125MatC_MaqT ;
            Z7126MatC_CliRm = A7126MatC_CliRm ;
            Z7127MatC_TraIn = A7127MatC_TraIn ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z44AlbRecCod = A44AlbRecCod ;
         Z7115MatC_Lin = A7115MatC_Lin ;
         Z7116MatC_Est = A7116MatC_Est ;
         Z7117MatC_Mat = A7117MatC_Mat ;
         Z7118MatC_Tor = A7118MatC_Tor ;
         Z7119MatC_Col = A7119MatC_Col ;
         Z7120MatC_Prov = A7120MatC_Prov ;
         Z7121MatC_Lote = A7121MatC_Lote ;
         Z7122MatC_Porc = A7122MatC_Porc ;
         Z7123MatC_Lm = A7123MatC_Lm ;
         Z7124MatC_Obs = A7124MatC_Obs ;
         Z7125MatC_MaqT = A7125MatC_MaqT ;
         Z7126MatC_CliRm = A7126MatC_CliRm ;
         Z7127MatC_TraIn = A7127MatC_TraIn ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalY31008( )
   {
   }

   public void standaloneModalY31008( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMatC_Lin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMatC_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_Lin_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      }
      else
      {
         edtMatC_Lin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMatC_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_Lin_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      }
   }

   public void loadY31008( )
   {
      /* Using cursor T00Y331 */
      pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Short.valueOf(A7115MatC_Lin)});
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1008 = (short)(1) ;
         A7124MatC_Obs = T00Y331_A7124MatC_Obs[0] ;
         n7124MatC_Obs = T00Y331_n7124MatC_Obs[0] ;
         A7116MatC_Est = T00Y331_A7116MatC_Est[0] ;
         n7116MatC_Est = T00Y331_n7116MatC_Est[0] ;
         A7117MatC_Mat = T00Y331_A7117MatC_Mat[0] ;
         n7117MatC_Mat = T00Y331_n7117MatC_Mat[0] ;
         A7118MatC_Tor = T00Y331_A7118MatC_Tor[0] ;
         n7118MatC_Tor = T00Y331_n7118MatC_Tor[0] ;
         A7119MatC_Col = T00Y331_A7119MatC_Col[0] ;
         n7119MatC_Col = T00Y331_n7119MatC_Col[0] ;
         A7120MatC_Prov = T00Y331_A7120MatC_Prov[0] ;
         n7120MatC_Prov = T00Y331_n7120MatC_Prov[0] ;
         A7121MatC_Lote = T00Y331_A7121MatC_Lote[0] ;
         n7121MatC_Lote = T00Y331_n7121MatC_Lote[0] ;
         A7122MatC_Porc = T00Y331_A7122MatC_Porc[0] ;
         n7122MatC_Porc = T00Y331_n7122MatC_Porc[0] ;
         A7123MatC_Lm = T00Y331_A7123MatC_Lm[0] ;
         n7123MatC_Lm = T00Y331_n7123MatC_Lm[0] ;
         A7125MatC_MaqT = T00Y331_A7125MatC_MaqT[0] ;
         n7125MatC_MaqT = T00Y331_n7125MatC_MaqT[0] ;
         A7126MatC_CliRm = T00Y331_A7126MatC_CliRm[0] ;
         n7126MatC_CliRm = T00Y331_n7126MatC_CliRm[0] ;
         A7127MatC_TraIn = T00Y331_A7127MatC_TraIn[0] ;
         n7127MatC_TraIn = T00Y331_n7127MatC_TraIn[0] ;
         zmY31008( -3) ;
      }
      pr_default.close(29);
      onLoadActionsY31008( ) ;
   }

   public void onLoadActionsY31008( )
   {
   }

   public void checkExtendedTableY31008( )
   {
      nIsDirty_1008 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalY31008( ) ;
   }

   public void closeExtendedTableCursorsY31008( )
   {
   }

   public void enableDisableY31008( )
   {
   }

   public void getKeyY31008( )
   {
      /* Using cursor T00Y332 */
      pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Short.valueOf(A7115MatC_Lin)});
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1008 = (short)(1) ;
      }
      else
      {
         RcdFound1008 = (short)(0) ;
      }
      pr_default.close(30);
   }

   public void getByPrimaryKeyY31008( )
   {
      /* Using cursor T00Y33 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Short.valueOf(A7115MatC_Lin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmY31008( 3) ;
         RcdFound1008 = (short)(1) ;
         initializeNonKeyY31008( ) ;
         A7124MatC_Obs = T00Y33_A7124MatC_Obs[0] ;
         n7124MatC_Obs = T00Y33_n7124MatC_Obs[0] ;
         A7115MatC_Lin = T00Y33_A7115MatC_Lin[0] ;
         A7116MatC_Est = T00Y33_A7116MatC_Est[0] ;
         n7116MatC_Est = T00Y33_n7116MatC_Est[0] ;
         A7117MatC_Mat = T00Y33_A7117MatC_Mat[0] ;
         n7117MatC_Mat = T00Y33_n7117MatC_Mat[0] ;
         A7118MatC_Tor = T00Y33_A7118MatC_Tor[0] ;
         n7118MatC_Tor = T00Y33_n7118MatC_Tor[0] ;
         A7119MatC_Col = T00Y33_A7119MatC_Col[0] ;
         n7119MatC_Col = T00Y33_n7119MatC_Col[0] ;
         A7120MatC_Prov = T00Y33_A7120MatC_Prov[0] ;
         n7120MatC_Prov = T00Y33_n7120MatC_Prov[0] ;
         A7121MatC_Lote = T00Y33_A7121MatC_Lote[0] ;
         n7121MatC_Lote = T00Y33_n7121MatC_Lote[0] ;
         A7122MatC_Porc = T00Y33_A7122MatC_Porc[0] ;
         n7122MatC_Porc = T00Y33_n7122MatC_Porc[0] ;
         A7123MatC_Lm = T00Y33_A7123MatC_Lm[0] ;
         n7123MatC_Lm = T00Y33_n7123MatC_Lm[0] ;
         A7125MatC_MaqT = T00Y33_A7125MatC_MaqT[0] ;
         n7125MatC_MaqT = T00Y33_n7125MatC_MaqT[0] ;
         A7126MatC_CliRm = T00Y33_A7126MatC_CliRm[0] ;
         n7126MatC_CliRm = T00Y33_n7126MatC_CliRm[0] ;
         A7127MatC_TraIn = T00Y33_A7127MatC_TraIn[0] ;
         n7127MatC_TraIn = T00Y33_n7127MatC_TraIn[0] ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z7115MatC_Lin = A7115MatC_Lin ;
         sMode1008 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalY31008( ) ;
         loadY31008( ) ;
         Gx_mode = sMode1008 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1008 = (short)(0) ;
         initializeNonKeyY31008( ) ;
         sMode1008 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalY31008( ) ;
         Gx_mode = sMode1008 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesY31008( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyY31008( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00Y32 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Short.valueOf(A7115MatC_Lin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPREPMAT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z7116MatC_Est, T00Y32_A7116MatC_Est[0]) != 0 ) || ( GXutil.strcmp(Z7117MatC_Mat, T00Y32_A7117MatC_Mat[0]) != 0 ) || ( GXutil.strcmp(Z7118MatC_Tor, T00Y32_A7118MatC_Tor[0]) != 0 ) || ( GXutil.strcmp(Z7119MatC_Col, T00Y32_A7119MatC_Col[0]) != 0 ) || ( GXutil.strcmp(Z7120MatC_Prov, T00Y32_A7120MatC_Prov[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7121MatC_Lote, T00Y32_A7121MatC_Lote[0]) != 0 ) || ( DecimalUtil.compareTo(Z7122MatC_Porc, T00Y32_A7122MatC_Porc[0]) != 0 ) || ( DecimalUtil.compareTo(Z7123MatC_Lm, T00Y32_A7123MatC_Lm[0]) != 0 ) || ( GXutil.strcmp(Z7125MatC_MaqT, T00Y32_A7125MatC_MaqT[0]) != 0 ) || ( GXutil.strcmp(Z7126MatC_CliRm, T00Y32_A7126MatC_CliRm[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z7127MatC_TraIn != T00Y32_A7127MatC_TraIn[0] ) )
         {
            if ( GXutil.strcmp(Z7116MatC_Est, T00Y32_A7116MatC_Est[0]) != 0 )
            {
               GXutil.writeLogln("trepmat:[seudo value changed for attri]"+"MatC_Est");
               GXutil.writeLogRaw("Old: ",Z7116MatC_Est);
               GXutil.writeLogRaw("Current: ",T00Y32_A7116MatC_Est[0]);
            }
            if ( GXutil.strcmp(Z7117MatC_Mat, T00Y32_A7117MatC_Mat[0]) != 0 )
            {
               GXutil.writeLogln("trepmat:[seudo value changed for attri]"+"MatC_Mat");
               GXutil.writeLogRaw("Old: ",Z7117MatC_Mat);
               GXutil.writeLogRaw("Current: ",T00Y32_A7117MatC_Mat[0]);
            }
            if ( GXutil.strcmp(Z7118MatC_Tor, T00Y32_A7118MatC_Tor[0]) != 0 )
            {
               GXutil.writeLogln("trepmat:[seudo value changed for attri]"+"MatC_Tor");
               GXutil.writeLogRaw("Old: ",Z7118MatC_Tor);
               GXutil.writeLogRaw("Current: ",T00Y32_A7118MatC_Tor[0]);
            }
            if ( GXutil.strcmp(Z7119MatC_Col, T00Y32_A7119MatC_Col[0]) != 0 )
            {
               GXutil.writeLogln("trepmat:[seudo value changed for attri]"+"MatC_Col");
               GXutil.writeLogRaw("Old: ",Z7119MatC_Col);
               GXutil.writeLogRaw("Current: ",T00Y32_A7119MatC_Col[0]);
            }
            if ( GXutil.strcmp(Z7120MatC_Prov, T00Y32_A7120MatC_Prov[0]) != 0 )
            {
               GXutil.writeLogln("trepmat:[seudo value changed for attri]"+"MatC_Prov");
               GXutil.writeLogRaw("Old: ",Z7120MatC_Prov);
               GXutil.writeLogRaw("Current: ",T00Y32_A7120MatC_Prov[0]);
            }
            if ( GXutil.strcmp(Z7121MatC_Lote, T00Y32_A7121MatC_Lote[0]) != 0 )
            {
               GXutil.writeLogln("trepmat:[seudo value changed for attri]"+"MatC_Lote");
               GXutil.writeLogRaw("Old: ",Z7121MatC_Lote);
               GXutil.writeLogRaw("Current: ",T00Y32_A7121MatC_Lote[0]);
            }
            if ( DecimalUtil.compareTo(Z7122MatC_Porc, T00Y32_A7122MatC_Porc[0]) != 0 )
            {
               GXutil.writeLogln("trepmat:[seudo value changed for attri]"+"MatC_Porc");
               GXutil.writeLogRaw("Old: ",Z7122MatC_Porc);
               GXutil.writeLogRaw("Current: ",T00Y32_A7122MatC_Porc[0]);
            }
            if ( DecimalUtil.compareTo(Z7123MatC_Lm, T00Y32_A7123MatC_Lm[0]) != 0 )
            {
               GXutil.writeLogln("trepmat:[seudo value changed for attri]"+"MatC_Lm");
               GXutil.writeLogRaw("Old: ",Z7123MatC_Lm);
               GXutil.writeLogRaw("Current: ",T00Y32_A7123MatC_Lm[0]);
            }
            if ( GXutil.strcmp(Z7125MatC_MaqT, T00Y32_A7125MatC_MaqT[0]) != 0 )
            {
               GXutil.writeLogln("trepmat:[seudo value changed for attri]"+"MatC_MaqT");
               GXutil.writeLogRaw("Old: ",Z7125MatC_MaqT);
               GXutil.writeLogRaw("Current: ",T00Y32_A7125MatC_MaqT[0]);
            }
            if ( GXutil.strcmp(Z7126MatC_CliRm, T00Y32_A7126MatC_CliRm[0]) != 0 )
            {
               GXutil.writeLogln("trepmat:[seudo value changed for attri]"+"MatC_CliRm");
               GXutil.writeLogRaw("Old: ",Z7126MatC_CliRm);
               GXutil.writeLogRaw("Current: ",T00Y32_A7126MatC_CliRm[0]);
            }
            if ( Z7127MatC_TraIn != T00Y32_A7127MatC_TraIn[0] )
            {
               GXutil.writeLogln("trepmat:[seudo value changed for attri]"+"MatC_TraIn");
               GXutil.writeLogRaw("Old: ",Z7127MatC_TraIn);
               GXutil.writeLogRaw("Current: ",T00Y32_A7127MatC_TraIn[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPREPMAT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertY31008( )
   {
      beforeValidateY31008( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableY31008( ) ;
      }
      if ( AnyError == 0 )
      {
         zmY31008( 0) ;
         checkOptimisticConcurrencyY31008( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmY31008( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertY31008( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00Y333 */
                  pr_default.execute(31, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Short.valueOf(A7115MatC_Lin), Boolean.valueOf(n7116MatC_Est), A7116MatC_Est, Boolean.valueOf(n7117MatC_Mat), A7117MatC_Mat, Boolean.valueOf(n7118MatC_Tor), A7118MatC_Tor, Boolean.valueOf(n7119MatC_Col), A7119MatC_Col, Boolean.valueOf(n7120MatC_Prov), A7120MatC_Prov, Boolean.valueOf(n7121MatC_Lote), A7121MatC_Lote, Boolean.valueOf(n7122MatC_Porc), A7122MatC_Porc, Boolean.valueOf(n7123MatC_Lm), A7123MatC_Lm, Boolean.valueOf(n7124MatC_Obs), A7124MatC_Obs, Boolean.valueOf(n7125MatC_MaqT), A7125MatC_MaqT, Boolean.valueOf(n7126MatC_CliRm), A7126MatC_CliRm, Boolean.valueOf(n7127MatC_TraIn), Long.valueOf(A7127MatC_TraIn), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREPMAT");
                  if ( (pr_default.getStatus(31) == 1) )
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
            loadY31008( ) ;
         }
         endLevelY31008( ) ;
      }
      closeExtendedTableCursorsY31008( ) ;
   }

   public void updateY31008( )
   {
      beforeValidateY31008( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableY31008( ) ;
      }
      if ( ( nIsMod_1008 != 0 ) || ( nIsDirty_1008 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyY31008( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmY31008( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateY31008( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00Y334 */
                     pr_default.execute(32, new Object[] {Boolean.valueOf(n7116MatC_Est), A7116MatC_Est, Boolean.valueOf(n7117MatC_Mat), A7117MatC_Mat, Boolean.valueOf(n7118MatC_Tor), A7118MatC_Tor, Boolean.valueOf(n7119MatC_Col), A7119MatC_Col, Boolean.valueOf(n7120MatC_Prov), A7120MatC_Prov, Boolean.valueOf(n7121MatC_Lote), A7121MatC_Lote, Boolean.valueOf(n7122MatC_Porc), A7122MatC_Porc, Boolean.valueOf(n7123MatC_Lm), A7123MatC_Lm, Boolean.valueOf(n7124MatC_Obs), A7124MatC_Obs, Boolean.valueOf(n7125MatC_MaqT), A7125MatC_MaqT, Boolean.valueOf(n7126MatC_CliRm), A7126MatC_CliRm, Boolean.valueOf(n7127MatC_TraIn), Long.valueOf(A7127MatC_TraIn), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Short.valueOf(A7115MatC_Lin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREPMAT");
                     if ( (pr_default.getStatus(32) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPREPMAT"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateY31008( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char1[0] = A396EmprCod ;
                        GXv_int2[0] = A44AlbRecCod ;
                        new app.txpalbrecupdateredundancy(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
                        trepmat_impl.this.A396EmprCod = GXv_char1[0] ;
                        trepmat_impl.this.A44AlbRecCod = GXv_int2[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyY31008( ) ;
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
            endLevelY31008( ) ;
         }
      }
      closeExtendedTableCursorsY31008( ) ;
   }

   public void deferredUpdateY31008( )
   {
   }

   public void deleteY31008( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateY31008( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyY31008( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsY31008( ) ;
         afterConfirmY31008( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteY31008( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00Y335 */
               pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Short.valueOf(A7115MatC_Lin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREPMAT");
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
      sMode1008 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelY31008( ) ;
      Gx_mode = sMode1008 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsY31008( )
   {
      standaloneModalY31008( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelY31008( )
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

   public void scanStartY31008( )
   {
      /* Scan By routine */
      /* Using cursor T00Y336 */
      pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      RcdFound1008 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound1008 = (short)(1) ;
         A7115MatC_Lin = T00Y336_A7115MatC_Lin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextY31008( )
   {
      /* Scan next routine */
      pr_default.readNext(34);
      RcdFound1008 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound1008 = (short)(1) ;
         A7115MatC_Lin = T00Y336_A7115MatC_Lin[0] ;
      }
   }

   public void scanEndY31008( )
   {
      pr_default.close(34);
   }

   public void afterConfirmY31008( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertY31008( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateY31008( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteY31008( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteY31008( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateY31008( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesY31008( )
   {
      edtMatC_Lin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMatC_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_Lin_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMatC_Est_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMatC_Est_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_Est_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMatC_Mat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMatC_Mat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_Mat_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMatC_Tor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMatC_Tor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_Tor_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMatC_Col_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMatC_Col_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_Col_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMatC_Prov_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMatC_Prov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_Prov_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMatC_Lote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMatC_Lote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_Lote_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMatC_Porc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMatC_Porc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_Porc_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMatC_Lm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMatC_Lm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_Lm_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMatC_Obs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMatC_Obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_Obs_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMatC_MaqT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMatC_MaqT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_MaqT_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMatC_CliRm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMatC_CliRm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_CliRm_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMatC_TraIn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMatC_TraIn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_TraIn_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void send_integrity_lvl_hashesY31008( )
   {
   }

   public void send_integrity_lvl_hashesY37( )
   {
   }

   public void subsflControlProps_701008( )
   {
      edtavnRcdDeleted_1008_Internalname = "vNRCDDELETED_1008_"+sGXsfl_70_idx ;
      edtMatC_Lin_Internalname = "MATC_LIN_"+sGXsfl_70_idx ;
      edtMatC_Est_Internalname = "MATC_EST_"+sGXsfl_70_idx ;
      edtMatC_Mat_Internalname = "MATC_MAT_"+sGXsfl_70_idx ;
      edtMatC_Tor_Internalname = "MATC_TOR_"+sGXsfl_70_idx ;
      edtMatC_Col_Internalname = "MATC_COL_"+sGXsfl_70_idx ;
      edtMatC_Prov_Internalname = "MATC_PROV_"+sGXsfl_70_idx ;
      edtMatC_Lote_Internalname = "MATC_LOTE_"+sGXsfl_70_idx ;
      edtMatC_Porc_Internalname = "MATC_PORC_"+sGXsfl_70_idx ;
      edtMatC_Lm_Internalname = "MATC_LM_"+sGXsfl_70_idx ;
      edtMatC_Obs_Internalname = "MATC_OBS_"+sGXsfl_70_idx ;
      edtMatC_MaqT_Internalname = "MATC_MAQT_"+sGXsfl_70_idx ;
      edtMatC_CliRm_Internalname = "MATC_CLIRM_"+sGXsfl_70_idx ;
      edtMatC_TraIn_Internalname = "MATC_TRAIN_"+sGXsfl_70_idx ;
   }

   public void subsflControlProps_fel_701008( )
   {
      edtavnRcdDeleted_1008_Internalname = "vNRCDDELETED_1008_"+sGXsfl_70_fel_idx ;
      edtMatC_Lin_Internalname = "MATC_LIN_"+sGXsfl_70_fel_idx ;
      edtMatC_Est_Internalname = "MATC_EST_"+sGXsfl_70_fel_idx ;
      edtMatC_Mat_Internalname = "MATC_MAT_"+sGXsfl_70_fel_idx ;
      edtMatC_Tor_Internalname = "MATC_TOR_"+sGXsfl_70_fel_idx ;
      edtMatC_Col_Internalname = "MATC_COL_"+sGXsfl_70_fel_idx ;
      edtMatC_Prov_Internalname = "MATC_PROV_"+sGXsfl_70_fel_idx ;
      edtMatC_Lote_Internalname = "MATC_LOTE_"+sGXsfl_70_fel_idx ;
      edtMatC_Porc_Internalname = "MATC_PORC_"+sGXsfl_70_fel_idx ;
      edtMatC_Lm_Internalname = "MATC_LM_"+sGXsfl_70_fel_idx ;
      edtMatC_Obs_Internalname = "MATC_OBS_"+sGXsfl_70_fel_idx ;
      edtMatC_MaqT_Internalname = "MATC_MAQT_"+sGXsfl_70_fel_idx ;
      edtMatC_CliRm_Internalname = "MATC_CLIRM_"+sGXsfl_70_fel_idx ;
      edtMatC_TraIn_Internalname = "MATC_TRAIN_"+sGXsfl_70_fel_idx ;
   }

   public void addRowY31008( )
   {
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701008( ) ;
      sendRowY31008( ) ;
   }

   public void sendRowY31008( )
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
         if ( ((int)((nGXsfl_70_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1008_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1008_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1008, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1008_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1008), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1008), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1008_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1008_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1008_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMatC_Lin_Internalname,GXutil.ltrim( localUtil.ntoc( A7115MatC_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7115MatC_Lin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMatC_Lin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMatC_Lin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1008_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMatC_Est_Internalname,GXutil.rtrim( A7116MatC_Est),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMatC_Est_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMatC_Est_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1008_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMatC_Mat_Internalname,GXutil.rtrim( A7117MatC_Mat),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMatC_Mat_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMatC_Mat_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1008_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMatC_Tor_Internalname,GXutil.rtrim( A7118MatC_Tor),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMatC_Tor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMatC_Tor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1008_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMatC_Col_Internalname,GXutil.rtrim( A7119MatC_Col),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMatC_Col_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMatC_Col_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1008_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMatC_Prov_Internalname,GXutil.rtrim( A7120MatC_Prov),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMatC_Prov_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMatC_Prov_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1008_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMatC_Lote_Internalname,GXutil.rtrim( A7121MatC_Lote),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMatC_Lote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMatC_Lote_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1008_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMatC_Porc_Internalname,GXutil.ltrim( localUtil.ntoc( A7122MatC_Porc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMatC_Porc_Enabled!=0) ? localUtil.format( A7122MatC_Porc, "ZZ9.99") : localUtil.format( A7122MatC_Porc, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,79);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMatC_Porc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMatC_Porc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1008_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMatC_Lm_Internalname,GXutil.ltrim( localUtil.ntoc( A7123MatC_Lm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMatC_Lm_Enabled!=0) ? localUtil.format( A7123MatC_Lm, "Z9.99") : localUtil.format( A7123MatC_Lm, "Z9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,80);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMatC_Lm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMatC_Lm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1008_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMatC_Obs_Internalname,A7124MatC_Obs,A7124MatC_Obs,TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMatC_Obs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMatC_Obs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(32768),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1008_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMatC_MaqT_Internalname,GXutil.rtrim( A7125MatC_MaqT),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMatC_MaqT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMatC_MaqT_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1008_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMatC_CliRm_Internalname,GXutil.rtrim( A7126MatC_CliRm),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMatC_CliRm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMatC_CliRm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1008_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMatC_TraIn_Internalname,GXutil.ltrim( localUtil.ntoc( A7127MatC_TraIn, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMatC_TraIn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7127MatC_TraIn), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7127MatC_TraIn), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMatC_TraIn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMatC_TraIn_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesY31008( ) ;
      GXCCtl = "Z7115MatC_Lin_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7115MatC_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7116MatC_Est_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7116MatC_Est));
      GXCCtl = "Z7117MatC_Mat_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7117MatC_Mat));
      GXCCtl = "Z7118MatC_Tor_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7118MatC_Tor));
      GXCCtl = "Z7119MatC_Col_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7119MatC_Col));
      GXCCtl = "Z7120MatC_Prov_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7120MatC_Prov));
      GXCCtl = "Z7121MatC_Lote_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7121MatC_Lote));
      GXCCtl = "Z7122MatC_Porc_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7122MatC_Porc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7123MatC_Lm_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7123MatC_Lm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7125MatC_MaqT_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7125MatC_MaqT));
      GXCCtl = "Z7126MatC_CliRm_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7126MatC_CliRm));
      GXCCtl = "Z7127MatC_TraIn_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7127MatC_TraIn, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1008_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1008, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1008_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1008, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1008_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1008, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1008_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1008_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MATC_LIN_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MATC_EST_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Est_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MATC_MAT_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Mat_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MATC_TOR_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Tor_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MATC_COL_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Col_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MATC_PROV_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Prov_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MATC_LOTE_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Lote_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MATC_PORC_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Porc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MATC_LM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Lm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MATC_OBS_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Obs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MATC_MAQT_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_MaqT_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MATC_CLIRM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_CliRm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MATC_TRAIN_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_TraIn_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowY31008( )
   {
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701008( ) ;
      edtavnRcdDeleted_1008_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1008_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMatC_Lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_LIN_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMatC_Est_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_EST_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMatC_Mat_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_MAT_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMatC_Tor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_TOR_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMatC_Col_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_COL_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMatC_Prov_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_PROV_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMatC_Lote_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_LOTE_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMatC_Porc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_PORC_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMatC_Lm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_LM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMatC_Obs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_OBS_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMatC_MaqT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_MAQT_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMatC_CliRm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_CLIRM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMatC_TraIn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MATC_TRAIN_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1008_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1008_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1008");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1008_Internalname ;
         wbErr = true ;
         nRcdDeleted_1008 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1008 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1008_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMatC_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMatC_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "MATC_LIN_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMatC_Lin_Internalname ;
         wbErr = true ;
         A7115MatC_Lin = (short)(0) ;
      }
      else
      {
         A7115MatC_Lin = (short)(localUtil.ctol( httpContext.cgiGet( edtMatC_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A7116MatC_Est = httpContext.cgiGet( edtMatC_Est_Internalname) ;
      n7116MatC_Est = false ;
      A7117MatC_Mat = httpContext.cgiGet( edtMatC_Mat_Internalname) ;
      n7117MatC_Mat = false ;
      A7118MatC_Tor = httpContext.cgiGet( edtMatC_Tor_Internalname) ;
      n7118MatC_Tor = false ;
      A7119MatC_Col = httpContext.cgiGet( edtMatC_Col_Internalname) ;
      n7119MatC_Col = false ;
      A7120MatC_Prov = httpContext.cgiGet( edtMatC_Prov_Internalname) ;
      n7120MatC_Prov = false ;
      A7121MatC_Lote = httpContext.cgiGet( edtMatC_Lote_Internalname) ;
      n7121MatC_Lote = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMatC_Porc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMatC_Porc_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "MATC_PORC_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMatC_Porc_Internalname ;
         wbErr = true ;
         A7122MatC_Porc = DecimalUtil.ZERO ;
         n7122MatC_Porc = false ;
      }
      else
      {
         A7122MatC_Porc = localUtil.ctond( httpContext.cgiGet( edtMatC_Porc_Internalname)) ;
         n7122MatC_Porc = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMatC_Lm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMatC_Lm_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
      {
         GXCCtl = "MATC_LM_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMatC_Lm_Internalname ;
         wbErr = true ;
         A7123MatC_Lm = DecimalUtil.ZERO ;
         n7123MatC_Lm = false ;
      }
      else
      {
         A7123MatC_Lm = localUtil.ctond( httpContext.cgiGet( edtMatC_Lm_Internalname)) ;
         n7123MatC_Lm = false ;
      }
      A7124MatC_Obs = httpContext.cgiGet( edtMatC_Obs_Internalname) ;
      n7124MatC_Obs = false ;
      A7125MatC_MaqT = httpContext.cgiGet( edtMatC_MaqT_Internalname) ;
      n7125MatC_MaqT = false ;
      A7126MatC_CliRm = httpContext.cgiGet( edtMatC_CliRm_Internalname) ;
      n7126MatC_CliRm = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMatC_TraIn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMatC_TraIn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
      {
         GXCCtl = "MATC_TRAIN_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMatC_TraIn_Internalname ;
         wbErr = true ;
         A7127MatC_TraIn = 0 ;
         n7127MatC_TraIn = false ;
      }
      else
      {
         A7127MatC_TraIn = localUtil.ctol( httpContext.cgiGet( edtMatC_TraIn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n7127MatC_TraIn = false ;
      }
      GXCCtl = "Z7115MatC_Lin_" + sGXsfl_70_idx ;
      Z7115MatC_Lin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7116MatC_Est_" + sGXsfl_70_idx ;
      Z7116MatC_Est = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7117MatC_Mat_" + sGXsfl_70_idx ;
      Z7117MatC_Mat = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7118MatC_Tor_" + sGXsfl_70_idx ;
      Z7118MatC_Tor = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7119MatC_Col_" + sGXsfl_70_idx ;
      Z7119MatC_Col = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7120MatC_Prov_" + sGXsfl_70_idx ;
      Z7120MatC_Prov = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7121MatC_Lote_" + sGXsfl_70_idx ;
      Z7121MatC_Lote = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7122MatC_Porc_" + sGXsfl_70_idx ;
      Z7122MatC_Porc = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7123MatC_Lm_" + sGXsfl_70_idx ;
      Z7123MatC_Lm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7125MatC_MaqT_" + sGXsfl_70_idx ;
      Z7125MatC_MaqT = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7126MatC_CliRm_" + sGXsfl_70_idx ;
      Z7126MatC_CliRm = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7127MatC_TraIn_" + sGXsfl_70_idx ;
      Z7127MatC_TraIn = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "nRcdDeleted_1008_" + sGXsfl_70_idx ;
      nRcdDeleted_1008 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1008_" + sGXsfl_70_idx ;
      nRcdExists_1008 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1008_" + sGXsfl_70_idx ;
      nIsMod_1008 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMatC_Lin_Enabled = edtMatC_Lin_Enabled ;
   }

   public void confirmValuesY30( )
   {
      nGXsfl_70_idx = 0 ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701008( ) ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_701008( ) ;
         httpContext.changePostValue( "Z7115MatC_Lin_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z7115MatC_Lin_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7115MatC_Lin_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z7116MatC_Est_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z7116MatC_Est_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7116MatC_Est_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z7117MatC_Mat_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z7117MatC_Mat_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7117MatC_Mat_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z7118MatC_Tor_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z7118MatC_Tor_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7118MatC_Tor_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z7119MatC_Col_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z7119MatC_Col_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7119MatC_Col_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z7120MatC_Prov_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z7120MatC_Prov_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7120MatC_Prov_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z7121MatC_Lote_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z7121MatC_Lote_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7121MatC_Lote_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z7122MatC_Porc_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z7122MatC_Porc_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7122MatC_Porc_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z7123MatC_Lm_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z7123MatC_Lm_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7123MatC_Lm_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z7125MatC_MaqT_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z7125MatC_MaqT_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7125MatC_MaqT_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z7126MatC_CliRm_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z7126MatC_CliRm_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7126MatC_CliRm_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z7127MatC_TraIn_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z7127MatC_TraIn_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7127MatC_TraIn_"+sGXsfl_70_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.trepmat", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z46AlbREnt", GXutil.rtrim( Z46AlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5806AlbREnt2", GXutil.rtrim( Z5806AlbREnt2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3613AlbRefDsc", GXutil.rtrim( Z3613AlbRefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7114MatC_ULin", GXutil.ltrim( localUtil.ntoc( Z7114MatC_ULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_70", GXutil.ltrim( localUtil.ntoc( nGXsfl_70_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.trepmat", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TREPMAT" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "RECEPCION TELA,MATERIALES", "") ;
   }

   public void initializeNonKeyY37( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A46AlbREnt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
      A5806AlbREnt2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
      A52AlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A45AlbRef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A3613AlbRefDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
      A7114MatC_ULin = (short)(0) ;
      n7114MatC_ULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7114MatC_ULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7114MatC_ULin), 4, 0));
      Z46AlbREnt = "" ;
      Z5806AlbREnt2 = "" ;
      Z52AlbRPieEnt = 0 ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z45AlbRef = "" ;
      Z3613AlbRefDsc = "" ;
      Z7114MatC_ULin = (short)(0) ;
   }

   public void initAllY37( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      initializeNonKeyY37( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyY31008( )
   {
      A7116MatC_Est = "" ;
      n7116MatC_Est = false ;
      A7117MatC_Mat = "" ;
      n7117MatC_Mat = false ;
      A7118MatC_Tor = "" ;
      n7118MatC_Tor = false ;
      A7119MatC_Col = "" ;
      n7119MatC_Col = false ;
      A7120MatC_Prov = "" ;
      n7120MatC_Prov = false ;
      A7121MatC_Lote = "" ;
      n7121MatC_Lote = false ;
      A7122MatC_Porc = DecimalUtil.ZERO ;
      n7122MatC_Porc = false ;
      A7123MatC_Lm = DecimalUtil.ZERO ;
      n7123MatC_Lm = false ;
      A7124MatC_Obs = "" ;
      n7124MatC_Obs = false ;
      A7125MatC_MaqT = "" ;
      n7125MatC_MaqT = false ;
      A7126MatC_CliRm = "" ;
      n7126MatC_CliRm = false ;
      A7127MatC_TraIn = 0 ;
      n7127MatC_TraIn = false ;
      Z7116MatC_Est = "" ;
      Z7117MatC_Mat = "" ;
      Z7118MatC_Tor = "" ;
      Z7119MatC_Col = "" ;
      Z7120MatC_Prov = "" ;
      Z7121MatC_Lote = "" ;
      Z7122MatC_Porc = DecimalUtil.ZERO ;
      Z7123MatC_Lm = DecimalUtil.ZERO ;
      Z7125MatC_MaqT = "" ;
      Z7126MatC_CliRm = "" ;
      Z7127MatC_TraIn = 0 ;
   }

   public void initAllY31008( )
   {
      A7115MatC_Lin = (short)(0) ;
      initializeNonKeyY31008( ) ;
   }

   public void standaloneModalInsertY31008( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241532160", true, true);
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
      httpContext.AddJavascriptSource("trepmat.js", "?20268241532160", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1008( )
   {
      edtMatC_Lin_Enabled = defedtMatC_Lin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMatC_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMatC_Lin_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void startgridcontrol70( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1008, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1008_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7115MatC_Lin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7116MatC_Est));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Est_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7117MatC_Mat));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Mat_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7118MatC_Tor));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Tor_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7119MatC_Col));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Col_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7120MatC_Prov));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Prov_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7121MatC_Lote));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Lote_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7122MatC_Porc, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Porc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7123MatC_Lm, (byte)(5), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Lm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A7124MatC_Obs);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_Obs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7125MatC_MaqT));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_MaqT_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7126MatC_CliRm));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_CliRm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7127MatC_TraIn, (byte)(10), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMatC_TraIn_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtAlbREnt_Internalname = "ALBRENT" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtAlbREnt2_Internalname = "ALBRENT2" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtAlbRef_Internalname = "ALBREF" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtAlbRefDsc_Internalname = "ALBREFDSC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtMatC_ULin_Internalname = "MATC_ULIN" ;
      edtavnRcdDeleted_1008_Internalname = "vNRCDDELETED_1008" ;
      edtMatC_Lin_Internalname = "MATC_LIN" ;
      edtMatC_Est_Internalname = "MATC_EST" ;
      edtMatC_Mat_Internalname = "MATC_MAT" ;
      edtMatC_Tor_Internalname = "MATC_TOR" ;
      edtMatC_Col_Internalname = "MATC_COL" ;
      edtMatC_Prov_Internalname = "MATC_PROV" ;
      edtMatC_Lote_Internalname = "MATC_LOTE" ;
      edtMatC_Porc_Internalname = "MATC_PORC" ;
      edtMatC_Lm_Internalname = "MATC_LM" ;
      edtMatC_Obs_Internalname = "MATC_OBS" ;
      edtMatC_MaqT_Internalname = "MATC_MAQT" ;
      edtMatC_CliRm_Internalname = "MATC_CLIRM" ;
      edtMatC_TraIn_Internalname = "MATC_TRAIN" ;
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
      Form.setCaption( httpContext.getMessage( "RECEPCION TELA,MATERIALES", "") );
      edtMatC_TraIn_Jsonclick = "" ;
      edtMatC_CliRm_Jsonclick = "" ;
      edtMatC_MaqT_Jsonclick = "" ;
      edtMatC_Obs_Jsonclick = "" ;
      edtMatC_Lm_Jsonclick = "" ;
      edtMatC_Porc_Jsonclick = "" ;
      edtMatC_Lote_Jsonclick = "" ;
      edtMatC_Prov_Jsonclick = "" ;
      edtMatC_Col_Jsonclick = "" ;
      edtMatC_Tor_Jsonclick = "" ;
      edtMatC_Mat_Jsonclick = "" ;
      edtMatC_Est_Jsonclick = "" ;
      edtMatC_Lin_Jsonclick = "" ;
      edtavnRcdDeleted_1008_Jsonclick = "" ;
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
      edtMatC_TraIn_Enabled = 1 ;
      edtMatC_CliRm_Enabled = 1 ;
      edtMatC_MaqT_Enabled = 1 ;
      edtMatC_Obs_Enabled = 1 ;
      edtMatC_Lm_Enabled = 1 ;
      edtMatC_Porc_Enabled = 1 ;
      edtMatC_Lote_Enabled = 1 ;
      edtMatC_Prov_Enabled = 1 ;
      edtMatC_Col_Enabled = 1 ;
      edtMatC_Tor_Enabled = 1 ;
      edtMatC_Mat_Enabled = 1 ;
      edtMatC_Est_Enabled = 1 ;
      edtMatC_Lin_Enabled = 1 ;
      edtavnRcdDeleted_1008_Enabled = 1 ;
      edtMatC_ULin_Jsonclick = "" ;
      edtMatC_ULin_Backcolor = (int)(0xFFFFFF) ;
      edtMatC_ULin_Enabled = 1 ;
      edtAlbRefDsc_Jsonclick = "" ;
      edtAlbRefDsc_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRefDsc_Enabled = 1 ;
      edtAlbRef_Jsonclick = "" ;
      edtAlbRef_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRef_Enabled = 1 ;
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRUniEnt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUniEnt_Enabled = 1 ;
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRPieEnt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRPieEnt_Enabled = 1 ;
      edtAlbREnt2_Jsonclick = "" ;
      edtAlbREnt2_Backcolor = (int)(0xFFFFFF) ;
      edtAlbREnt2_Enabled = 1 ;
      edtAlbREnt_Jsonclick = "" ;
      edtAlbREnt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbREnt_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRecCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
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
      subsflControlProps_701008( ) ;
      while ( nGXsfl_70_idx <= nRC_GXsfl_70 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalY31008( ) ;
         standaloneModalY31008( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowY31008( ) ;
         nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_701008( ) ;
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
      /* Using cursor T00Y315 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00Y315_A407EmprNom[0] ;
      n407EmprNom = T00Y315_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(13);
      GX_FocusControl = edtAlbREnt_Internalname ;
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
      /* Using cursor T00Y315 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T00Y315_A407EmprNom[0] ;
      n407EmprNom = T00Y315_n407EmprNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Albreccod( )
   {
      n44AlbRecCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", GXutil.rtrim( A46AlbREnt));
      httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", GXutil.rtrim( A5806AlbREnt2));
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", GXutil.rtrim( A3613AlbRefDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A7114MatC_ULin", GXutil.ltrim( localUtil.ntoc( A7114MatC_ULin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z46AlbREnt", GXutil.rtrim( Z46AlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5806AlbREnt2", GXutil.rtrim( Z5806AlbREnt2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3613AlbRefDsc", GXutil.rtrim( Z3613AlbRefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7114MatC_ULin", GXutil.ltrim( localUtil.ntoc( Z7114MatC_ULin, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'A46AlbREnt',fld:'ALBRENT',pic:''},{av:'A5806AlbREnt2',fld:'ALBRENT2',pic:''},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'A7114MatC_ULin',fld:'MATC_ULIN',pic:'ZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z44AlbRecCod'},{av:'Z46AlbREnt'},{av:'Z5806AlbREnt2'},{av:'Z52AlbRPieEnt'},{av:'Z58AlbRUniEnt'},{av:'Z45AlbRef'},{av:'Z3613AlbRefDsc'},{av:'Z7114MatC_ULin'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MATC_LIN","{handler:'valid_Matc_lin',iparms:[]");
      setEventMetadata("VALID_MATC_LIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Matc_train',iparms:[]");
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
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z46AlbREnt = "" ;
      Z5806AlbREnt2 = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z45AlbRef = "" ;
      Z3613AlbRefDsc = "" ;
      Z7116MatC_Est = "" ;
      Z7117MatC_Mat = "" ;
      Z7118MatC_Tor = "" ;
      Z7119MatC_Col = "" ;
      Z7120MatC_Prov = "" ;
      Z7121MatC_Lote = "" ;
      Z7122MatC_Porc = DecimalUtil.ZERO ;
      Z7123MatC_Lm = DecimalUtil.ZERO ;
      Z7125MatC_MaqT = "" ;
      Z7126MatC_CliRm = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A46AlbREnt = "" ;
      lblTextblock5_Jsonclick = "" ;
      A5806AlbREnt2 = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      A45AlbRef = "" ;
      lblTextblock9_Jsonclick = "" ;
      A3613AlbRefDsc = "" ;
      lblTextblock10_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1008 = "" ;
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
      sMode7 = "" ;
      GXCCtl = "" ;
      A7116MatC_Est = "" ;
      A7117MatC_Mat = "" ;
      A7118MatC_Tor = "" ;
      A7119MatC_Col = "" ;
      A7120MatC_Prov = "" ;
      A7121MatC_Lote = "" ;
      A7122MatC_Porc = DecimalUtil.ZERO ;
      A7123MatC_Lm = DecimalUtil.ZERO ;
      A7124MatC_Obs = "" ;
      A7125MatC_MaqT = "" ;
      A7126MatC_CliRm = "" ;
      Z407EmprNom = "" ;
      T00Y37_A44AlbRecCod = new int[1] ;
      T00Y37_n44AlbRecCod = new boolean[] {false} ;
      T00Y37_A407EmprNom = new String[] {""} ;
      T00Y37_n407EmprNom = new boolean[] {false} ;
      T00Y37_A46AlbREnt = new String[] {""} ;
      T00Y37_A5806AlbREnt2 = new String[] {""} ;
      T00Y37_A52AlbRPieEnt = new int[1] ;
      T00Y37_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00Y37_A45AlbRef = new String[] {""} ;
      T00Y37_A3613AlbRefDsc = new String[] {""} ;
      T00Y37_A7114MatC_ULin = new short[1] ;
      T00Y37_n7114MatC_ULin = new boolean[] {false} ;
      T00Y37_A396EmprCod = new String[] {""} ;
      T00Y36_A407EmprNom = new String[] {""} ;
      T00Y36_n407EmprNom = new boolean[] {false} ;
      T00Y38_A407EmprNom = new String[] {""} ;
      T00Y38_n407EmprNom = new boolean[] {false} ;
      T00Y39_A396EmprCod = new String[] {""} ;
      T00Y39_A44AlbRecCod = new int[1] ;
      T00Y39_n44AlbRecCod = new boolean[] {false} ;
      T00Y35_A44AlbRecCod = new int[1] ;
      T00Y35_n44AlbRecCod = new boolean[] {false} ;
      T00Y35_A46AlbREnt = new String[] {""} ;
      T00Y35_A5806AlbREnt2 = new String[] {""} ;
      T00Y35_A52AlbRPieEnt = new int[1] ;
      T00Y35_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00Y35_A45AlbRef = new String[] {""} ;
      T00Y35_A3613AlbRefDsc = new String[] {""} ;
      T00Y35_A7114MatC_ULin = new short[1] ;
      T00Y35_n7114MatC_ULin = new boolean[] {false} ;
      T00Y35_A396EmprCod = new String[] {""} ;
      T00Y310_A396EmprCod = new String[] {""} ;
      T00Y310_A44AlbRecCod = new int[1] ;
      T00Y310_n44AlbRecCod = new boolean[] {false} ;
      T00Y311_A396EmprCod = new String[] {""} ;
      T00Y311_A44AlbRecCod = new int[1] ;
      T00Y311_n44AlbRecCod = new boolean[] {false} ;
      T00Y34_A44AlbRecCod = new int[1] ;
      T00Y34_n44AlbRecCod = new boolean[] {false} ;
      T00Y34_A46AlbREnt = new String[] {""} ;
      T00Y34_A5806AlbREnt2 = new String[] {""} ;
      T00Y34_A52AlbRPieEnt = new int[1] ;
      T00Y34_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00Y34_A45AlbRef = new String[] {""} ;
      T00Y34_A3613AlbRefDsc = new String[] {""} ;
      T00Y34_A7114MatC_ULin = new short[1] ;
      T00Y34_n7114MatC_ULin = new boolean[] {false} ;
      T00Y34_A396EmprCod = new String[] {""} ;
      T00Y315_A407EmprNom = new String[] {""} ;
      T00Y315_n407EmprNom = new boolean[] {false} ;
      T00Y316_A396EmprCod = new String[] {""} ;
      T00Y316_A13026PedDGId = new int[1] ;
      T00Y316_A44AlbRecCod = new int[1] ;
      T00Y316_n44AlbRecCod = new boolean[] {false} ;
      T00Y317_A396EmprCod = new String[] {""} ;
      T00Y317_A11669DevCruId = new int[1] ;
      T00Y317_A44AlbRecCod = new int[1] ;
      T00Y317_n44AlbRecCod = new boolean[] {false} ;
      T00Y318_A396EmprCod = new String[] {""} ;
      T00Y318_A44AlbRecCod = new int[1] ;
      T00Y318_n44AlbRecCod = new boolean[] {false} ;
      T00Y318_A9743Emp_CUb = new String[] {""} ;
      T00Y318_A5860Emp_Anp = new short[1] ;
      T00Y319_A396EmprCod = new String[] {""} ;
      T00Y319_A44AlbRecCod = new int[1] ;
      T00Y319_n44AlbRecCod = new boolean[] {false} ;
      T00Y319_A7130MatC_Pz = new String[] {""} ;
      T00Y320_A396EmprCod = new String[] {""} ;
      T00Y320_A44AlbRecCod = new int[1] ;
      T00Y320_n44AlbRecCod = new boolean[] {false} ;
      T00Y320_A7132MatC_Talla = new String[] {""} ;
      T00Y321_A396EmprCod = new String[] {""} ;
      T00Y321_A30AlbProCod = new long[1] ;
      T00Y321_A129BarCod = new int[1] ;
      T00Y321_A132BarCodReo = new byte[1] ;
      T00Y321_A130BarCodPar = new String[] {""} ;
      T00Y321_A6622AlbHdRLn = new short[1] ;
      T00Y322_A396EmprCod = new String[] {""} ;
      T00Y322_A6235DevEmpCod = new int[1] ;
      T00Y322_A6243DevNumLin = new byte[1] ;
      T00Y323_A396EmprCod = new String[] {""} ;
      T00Y323_A44AlbRecCod = new int[1] ;
      T00Y323_n44AlbRecCod = new boolean[] {false} ;
      T00Y323_A4596AlbRDefCod = new short[1] ;
      T00Y324_A396EmprCod = new String[] {""} ;
      T00Y324_A44AlbRecCod = new int[1] ;
      T00Y324_n44AlbRecCod = new boolean[] {false} ;
      T00Y324_A2159AlbRecPie = new String[] {""} ;
      T00Y325_A396EmprCod = new String[] {""} ;
      T00Y325_A44AlbRecCod = new int[1] ;
      T00Y325_n44AlbRecCod = new boolean[] {false} ;
      T00Y325_A2165HisEmpLin = new short[1] ;
      T00Y326_A396EmprCod = new String[] {""} ;
      T00Y326_A44AlbRecCod = new int[1] ;
      T00Y326_n44AlbRecCod = new boolean[] {false} ;
      T00Y326_A1299AlbRLin = new byte[1] ;
      T00Y327_A396EmprCod = new String[] {""} ;
      T00Y327_A361DisCod = new int[1] ;
      T00Y327_A44AlbRecCod = new int[1] ;
      T00Y327_n44AlbRecCod = new boolean[] {false} ;
      T00Y328_A396EmprCod = new String[] {""} ;
      T00Y328_A323DevGenCod = new int[1] ;
      T00Y329_A396EmprCod = new String[] {""} ;
      T00Y329_A129BarCod = new int[1] ;
      T00Y329_A132BarCodReo = new byte[1] ;
      T00Y329_A130BarCodPar = new String[] {""} ;
      T00Y329_A200BarPieCod = new String[] {""} ;
      T00Y330_A396EmprCod = new String[] {""} ;
      T00Y330_A44AlbRecCod = new int[1] ;
      T00Y330_n44AlbRecCod = new boolean[] {false} ;
      Z7124MatC_Obs = "" ;
      T00Y331_A7124MatC_Obs = new String[] {""} ;
      T00Y331_n7124MatC_Obs = new boolean[] {false} ;
      T00Y331_A44AlbRecCod = new int[1] ;
      T00Y331_n44AlbRecCod = new boolean[] {false} ;
      T00Y331_A7115MatC_Lin = new short[1] ;
      T00Y331_A7116MatC_Est = new String[] {""} ;
      T00Y331_n7116MatC_Est = new boolean[] {false} ;
      T00Y331_A7117MatC_Mat = new String[] {""} ;
      T00Y331_n7117MatC_Mat = new boolean[] {false} ;
      T00Y331_A7118MatC_Tor = new String[] {""} ;
      T00Y331_n7118MatC_Tor = new boolean[] {false} ;
      T00Y331_A7119MatC_Col = new String[] {""} ;
      T00Y331_n7119MatC_Col = new boolean[] {false} ;
      T00Y331_A7120MatC_Prov = new String[] {""} ;
      T00Y331_n7120MatC_Prov = new boolean[] {false} ;
      T00Y331_A7121MatC_Lote = new String[] {""} ;
      T00Y331_n7121MatC_Lote = new boolean[] {false} ;
      T00Y331_A7122MatC_Porc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00Y331_n7122MatC_Porc = new boolean[] {false} ;
      T00Y331_A7123MatC_Lm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00Y331_n7123MatC_Lm = new boolean[] {false} ;
      T00Y331_A7125MatC_MaqT = new String[] {""} ;
      T00Y331_n7125MatC_MaqT = new boolean[] {false} ;
      T00Y331_A7126MatC_CliRm = new String[] {""} ;
      T00Y331_n7126MatC_CliRm = new boolean[] {false} ;
      T00Y331_A7127MatC_TraIn = new long[1] ;
      T00Y331_n7127MatC_TraIn = new boolean[] {false} ;
      T00Y331_A396EmprCod = new String[] {""} ;
      T00Y332_A396EmprCod = new String[] {""} ;
      T00Y332_A44AlbRecCod = new int[1] ;
      T00Y332_n44AlbRecCod = new boolean[] {false} ;
      T00Y332_A7115MatC_Lin = new short[1] ;
      T00Y33_A7124MatC_Obs = new String[] {""} ;
      T00Y33_n7124MatC_Obs = new boolean[] {false} ;
      T00Y33_A44AlbRecCod = new int[1] ;
      T00Y33_n44AlbRecCod = new boolean[] {false} ;
      T00Y33_A7115MatC_Lin = new short[1] ;
      T00Y33_A7116MatC_Est = new String[] {""} ;
      T00Y33_n7116MatC_Est = new boolean[] {false} ;
      T00Y33_A7117MatC_Mat = new String[] {""} ;
      T00Y33_n7117MatC_Mat = new boolean[] {false} ;
      T00Y33_A7118MatC_Tor = new String[] {""} ;
      T00Y33_n7118MatC_Tor = new boolean[] {false} ;
      T00Y33_A7119MatC_Col = new String[] {""} ;
      T00Y33_n7119MatC_Col = new boolean[] {false} ;
      T00Y33_A7120MatC_Prov = new String[] {""} ;
      T00Y33_n7120MatC_Prov = new boolean[] {false} ;
      T00Y33_A7121MatC_Lote = new String[] {""} ;
      T00Y33_n7121MatC_Lote = new boolean[] {false} ;
      T00Y33_A7122MatC_Porc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00Y33_n7122MatC_Porc = new boolean[] {false} ;
      T00Y33_A7123MatC_Lm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00Y33_n7123MatC_Lm = new boolean[] {false} ;
      T00Y33_A7125MatC_MaqT = new String[] {""} ;
      T00Y33_n7125MatC_MaqT = new boolean[] {false} ;
      T00Y33_A7126MatC_CliRm = new String[] {""} ;
      T00Y33_n7126MatC_CliRm = new boolean[] {false} ;
      T00Y33_A7127MatC_TraIn = new long[1] ;
      T00Y33_n7127MatC_TraIn = new boolean[] {false} ;
      T00Y33_A396EmprCod = new String[] {""} ;
      T00Y32_A7124MatC_Obs = new String[] {""} ;
      T00Y32_n7124MatC_Obs = new boolean[] {false} ;
      T00Y32_A44AlbRecCod = new int[1] ;
      T00Y32_n44AlbRecCod = new boolean[] {false} ;
      T00Y32_A7115MatC_Lin = new short[1] ;
      T00Y32_A7116MatC_Est = new String[] {""} ;
      T00Y32_n7116MatC_Est = new boolean[] {false} ;
      T00Y32_A7117MatC_Mat = new String[] {""} ;
      T00Y32_n7117MatC_Mat = new boolean[] {false} ;
      T00Y32_A7118MatC_Tor = new String[] {""} ;
      T00Y32_n7118MatC_Tor = new boolean[] {false} ;
      T00Y32_A7119MatC_Col = new String[] {""} ;
      T00Y32_n7119MatC_Col = new boolean[] {false} ;
      T00Y32_A7120MatC_Prov = new String[] {""} ;
      T00Y32_n7120MatC_Prov = new boolean[] {false} ;
      T00Y32_A7121MatC_Lote = new String[] {""} ;
      T00Y32_n7121MatC_Lote = new boolean[] {false} ;
      T00Y32_A7122MatC_Porc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00Y32_n7122MatC_Porc = new boolean[] {false} ;
      T00Y32_A7123MatC_Lm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00Y32_n7123MatC_Lm = new boolean[] {false} ;
      T00Y32_A7125MatC_MaqT = new String[] {""} ;
      T00Y32_n7125MatC_MaqT = new boolean[] {false} ;
      T00Y32_A7126MatC_CliRm = new String[] {""} ;
      T00Y32_n7126MatC_CliRm = new boolean[] {false} ;
      T00Y32_A7127MatC_TraIn = new long[1] ;
      T00Y32_n7127MatC_TraIn = new boolean[] {false} ;
      T00Y32_A396EmprCod = new String[] {""} ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      T00Y336_A396EmprCod = new String[] {""} ;
      T00Y336_A44AlbRecCod = new int[1] ;
      T00Y336_n44AlbRecCod = new boolean[] {false} ;
      T00Y336_A7115MatC_Lin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ46AlbREnt = "" ;
      ZZ5806AlbREnt2 = "" ;
      ZZ58AlbRUniEnt = DecimalUtil.ZERO ;
      ZZ45AlbRef = "" ;
      ZZ3613AlbRefDsc = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.trepmat__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.trepmat__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.trepmat__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.trepmat__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trepmat__default(),
         new Object[] {
             new Object[] {
            T00Y32_A7124MatC_Obs, T00Y32_n7124MatC_Obs, T00Y32_A44AlbRecCod, T00Y32_A7115MatC_Lin, T00Y32_A7116MatC_Est, T00Y32_n7116MatC_Est, T00Y32_A7117MatC_Mat, T00Y32_n7117MatC_Mat, T00Y32_A7118MatC_Tor, T00Y32_n7118MatC_Tor,
            T00Y32_A7119MatC_Col, T00Y32_n7119MatC_Col, T00Y32_A7120MatC_Prov, T00Y32_n7120MatC_Prov, T00Y32_A7121MatC_Lote, T00Y32_n7121MatC_Lote, T00Y32_A7122MatC_Porc, T00Y32_n7122MatC_Porc, T00Y32_A7123MatC_Lm, T00Y32_n7123MatC_Lm,
            T00Y32_A7125MatC_MaqT, T00Y32_n7125MatC_MaqT, T00Y32_A7126MatC_CliRm, T00Y32_n7126MatC_CliRm, T00Y32_A7127MatC_TraIn, T00Y32_n7127MatC_TraIn, T00Y32_A396EmprCod
            }
            , new Object[] {
            T00Y33_A7124MatC_Obs, T00Y33_n7124MatC_Obs, T00Y33_A44AlbRecCod, T00Y33_A7115MatC_Lin, T00Y33_A7116MatC_Est, T00Y33_n7116MatC_Est, T00Y33_A7117MatC_Mat, T00Y33_n7117MatC_Mat, T00Y33_A7118MatC_Tor, T00Y33_n7118MatC_Tor,
            T00Y33_A7119MatC_Col, T00Y33_n7119MatC_Col, T00Y33_A7120MatC_Prov, T00Y33_n7120MatC_Prov, T00Y33_A7121MatC_Lote, T00Y33_n7121MatC_Lote, T00Y33_A7122MatC_Porc, T00Y33_n7122MatC_Porc, T00Y33_A7123MatC_Lm, T00Y33_n7123MatC_Lm,
            T00Y33_A7125MatC_MaqT, T00Y33_n7125MatC_MaqT, T00Y33_A7126MatC_CliRm, T00Y33_n7126MatC_CliRm, T00Y33_A7127MatC_TraIn, T00Y33_n7127MatC_TraIn, T00Y33_A396EmprCod
            }
            , new Object[] {
            T00Y34_A44AlbRecCod, T00Y34_A46AlbREnt, T00Y34_A5806AlbREnt2, T00Y34_A52AlbRPieEnt, T00Y34_A58AlbRUniEnt, T00Y34_A45AlbRef, T00Y34_A3613AlbRefDsc, T00Y34_A7114MatC_ULin, T00Y34_n7114MatC_ULin, T00Y34_A396EmprCod
            }
            , new Object[] {
            T00Y35_A44AlbRecCod, T00Y35_A46AlbREnt, T00Y35_A5806AlbREnt2, T00Y35_A52AlbRPieEnt, T00Y35_A58AlbRUniEnt, T00Y35_A45AlbRef, T00Y35_A3613AlbRefDsc, T00Y35_A7114MatC_ULin, T00Y35_n7114MatC_ULin, T00Y35_A396EmprCod
            }
            , new Object[] {
            T00Y36_A407EmprNom, T00Y36_n407EmprNom
            }
            , new Object[] {
            T00Y37_A44AlbRecCod, T00Y37_A407EmprNom, T00Y37_n407EmprNom, T00Y37_A46AlbREnt, T00Y37_A5806AlbREnt2, T00Y37_A52AlbRPieEnt, T00Y37_A58AlbRUniEnt, T00Y37_A45AlbRef, T00Y37_A3613AlbRefDsc, T00Y37_A7114MatC_ULin,
            T00Y37_n7114MatC_ULin, T00Y37_A396EmprCod
            }
            , new Object[] {
            T00Y38_A407EmprNom, T00Y38_n407EmprNom
            }
            , new Object[] {
            T00Y39_A396EmprCod, T00Y39_A44AlbRecCod
            }
            , new Object[] {
            T00Y310_A396EmprCod, T00Y310_A44AlbRecCod
            }
            , new Object[] {
            T00Y311_A396EmprCod, T00Y311_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00Y315_A407EmprNom, T00Y315_n407EmprNom
            }
            , new Object[] {
            T00Y316_A396EmprCod, T00Y316_A13026PedDGId, T00Y316_A44AlbRecCod
            }
            , new Object[] {
            T00Y317_A396EmprCod, T00Y317_A11669DevCruId, T00Y317_A44AlbRecCod
            }
            , new Object[] {
            T00Y318_A396EmprCod, T00Y318_A44AlbRecCod, T00Y318_A9743Emp_CUb, T00Y318_A5860Emp_Anp
            }
            , new Object[] {
            T00Y319_A396EmprCod, T00Y319_A44AlbRecCod, T00Y319_A7130MatC_Pz
            }
            , new Object[] {
            T00Y320_A396EmprCod, T00Y320_A44AlbRecCod, T00Y320_A7132MatC_Talla
            }
            , new Object[] {
            T00Y321_A396EmprCod, T00Y321_A30AlbProCod, T00Y321_A129BarCod, T00Y321_A132BarCodReo, T00Y321_A130BarCodPar, T00Y321_A6622AlbHdRLn
            }
            , new Object[] {
            T00Y322_A396EmprCod, T00Y322_A6235DevEmpCod, T00Y322_A6243DevNumLin
            }
            , new Object[] {
            T00Y323_A396EmprCod, T00Y323_A44AlbRecCod, T00Y323_A4596AlbRDefCod
            }
            , new Object[] {
            T00Y324_A396EmprCod, T00Y324_A44AlbRecCod, T00Y324_A2159AlbRecPie
            }
            , new Object[] {
            T00Y325_A396EmprCod, T00Y325_A44AlbRecCod, T00Y325_A2165HisEmpLin
            }
            , new Object[] {
            T00Y326_A396EmprCod, T00Y326_A44AlbRecCod, T00Y326_A1299AlbRLin
            }
            , new Object[] {
            T00Y327_A396EmprCod, T00Y327_A361DisCod, T00Y327_A44AlbRecCod
            }
            , new Object[] {
            T00Y328_A396EmprCod, T00Y328_A323DevGenCod
            }
            , new Object[] {
            T00Y329_A396EmprCod, T00Y329_A129BarCod, T00Y329_A132BarCodReo, T00Y329_A130BarCodPar, T00Y329_A200BarPieCod
            }
            , new Object[] {
            T00Y330_A396EmprCod, T00Y330_A44AlbRecCod
            }
            , new Object[] {
            T00Y331_A7124MatC_Obs, T00Y331_n7124MatC_Obs, T00Y331_A44AlbRecCod, T00Y331_A7115MatC_Lin, T00Y331_A7116MatC_Est, T00Y331_n7116MatC_Est, T00Y331_A7117MatC_Mat, T00Y331_n7117MatC_Mat, T00Y331_A7118MatC_Tor, T00Y331_n7118MatC_Tor,
            T00Y331_A7119MatC_Col, T00Y331_n7119MatC_Col, T00Y331_A7120MatC_Prov, T00Y331_n7120MatC_Prov, T00Y331_A7121MatC_Lote, T00Y331_n7121MatC_Lote, T00Y331_A7122MatC_Porc, T00Y331_n7122MatC_Porc, T00Y331_A7123MatC_Lm, T00Y331_n7123MatC_Lm,
            T00Y331_A7125MatC_MaqT, T00Y331_n7125MatC_MaqT, T00Y331_A7126MatC_CliRm, T00Y331_n7126MatC_CliRm, T00Y331_A7127MatC_TraIn, T00Y331_n7127MatC_TraIn, T00Y331_A396EmprCod
            }
            , new Object[] {
            T00Y332_A396EmprCod, T00Y332_A44AlbRecCod, T00Y332_A7115MatC_Lin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00Y336_A396EmprCod, T00Y336_A44AlbRecCod, T00Y336_A7115MatC_Lin
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
   private short Z7114MatC_ULin ;
   private short Z7115MatC_Lin ;
   private short nRcdDeleted_1008 ;
   private short nRcdExists_1008 ;
   private short nIsMod_1008 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A7114MatC_ULin ;
   private short nBlankRcdCount1008 ;
   private short RcdFound1008 ;
   private short nBlankRcdUsr1008 ;
   private short A7115MatC_Lin ;
   private short RcdFound7 ;
   private short nIsDirty_7 ;
   private short nIsDirty_1008 ;
   private short ZZ7114MatC_ULin ;
   private int Z44AlbRecCod ;
   private int Z52AlbRPieEnt ;
   private int nRC_GXsfl_70 ;
   private int nGXsfl_70_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A44AlbRecCod ;
   private int edtAlbRecCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtAlbREnt_Enabled ;
   private int edtAlbREnt2_Enabled ;
   private int A52AlbRPieEnt ;
   private int edtAlbRPieEnt_Enabled ;
   private int edtAlbRUniEnt_Enabled ;
   private int edtAlbRef_Enabled ;
   private int edtAlbRefDsc_Enabled ;
   private int edtMatC_ULin_Enabled ;
   private int edtavnRcdDeleted_1008_Enabled ;
   private int edtMatC_Lin_Enabled ;
   private int edtMatC_Est_Enabled ;
   private int edtMatC_Mat_Enabled ;
   private int edtMatC_Tor_Enabled ;
   private int edtMatC_Col_Enabled ;
   private int edtMatC_Prov_Enabled ;
   private int edtMatC_Lote_Enabled ;
   private int edtMatC_Porc_Enabled ;
   private int edtMatC_Lm_Enabled ;
   private int edtMatC_Obs_Enabled ;
   private int edtMatC_MaqT_Enabled ;
   private int edtMatC_CliRm_Enabled ;
   private int edtMatC_TraIn_Enabled ;
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
   private int GXv_int2[] ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtMatC_Lin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMatC_ULin_Backcolor ;
   private int edtAlbRefDsc_Backcolor ;
   private int edtAlbRef_Backcolor ;
   private int edtAlbRUniEnt_Backcolor ;
   private int edtAlbRPieEnt_Backcolor ;
   private int edtAlbREnt2_Backcolor ;
   private int edtAlbREnt_Backcolor ;
   private int edtAlbRecCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ44AlbRecCod ;
   private int ZZ52AlbRPieEnt ;
   private long Z7127MatC_TraIn ;
   private long GRID1_nFirstRecordOnPage ;
   private long A7127MatC_TraIn ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal Z7122MatC_Porc ;
   private java.math.BigDecimal Z7123MatC_Lm ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A7122MatC_Porc ;
   private java.math.BigDecimal A7123MatC_Lm ;
   private java.math.BigDecimal ZZ58AlbRUniEnt ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z46AlbREnt ;
   private String Z5806AlbREnt2 ;
   private String Z45AlbRef ;
   private String Z3613AlbRefDsc ;
   private String Z7116MatC_Est ;
   private String Z7117MatC_Mat ;
   private String Z7118MatC_Tor ;
   private String Z7119MatC_Col ;
   private String Z7120MatC_Prov ;
   private String Z7121MatC_Lote ;
   private String Z7125MatC_MaqT ;
   private String Z7126MatC_CliRm ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_70_idx="0001" ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRecCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtAlbREnt_Internalname ;
   private String A46AlbREnt ;
   private String edtAlbREnt_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtAlbREnt2_Internalname ;
   private String A5806AlbREnt2 ;
   private String edtAlbREnt2_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtAlbRef_Internalname ;
   private String A45AlbRef ;
   private String edtAlbRef_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtAlbRefDsc_Internalname ;
   private String A3613AlbRefDsc ;
   private String edtAlbRefDsc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtMatC_ULin_Internalname ;
   private String edtMatC_ULin_Jsonclick ;
   private String sMode1008 ;
   private String edtavnRcdDeleted_1008_Internalname ;
   private String edtMatC_Lin_Internalname ;
   private String edtMatC_Est_Internalname ;
   private String edtMatC_Mat_Internalname ;
   private String edtMatC_Tor_Internalname ;
   private String edtMatC_Col_Internalname ;
   private String edtMatC_Prov_Internalname ;
   private String edtMatC_Lote_Internalname ;
   private String edtMatC_Porc_Internalname ;
   private String edtMatC_Lm_Internalname ;
   private String edtMatC_Obs_Internalname ;
   private String edtMatC_MaqT_Internalname ;
   private String edtMatC_CliRm_Internalname ;
   private String edtMatC_TraIn_Internalname ;
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
   private String sMode7 ;
   private String GXCCtl ;
   private String A7116MatC_Est ;
   private String A7117MatC_Mat ;
   private String A7118MatC_Tor ;
   private String A7119MatC_Col ;
   private String A7120MatC_Prov ;
   private String A7121MatC_Lote ;
   private String A7125MatC_MaqT ;
   private String A7126MatC_CliRm ;
   private String Z407EmprNom ;
   private String GXv_char1[] ;
   private String sGXsfl_70_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1008_Jsonclick ;
   private String edtMatC_Lin_Jsonclick ;
   private String edtMatC_Est_Jsonclick ;
   private String edtMatC_Mat_Jsonclick ;
   private String edtMatC_Tor_Jsonclick ;
   private String edtMatC_Col_Jsonclick ;
   private String edtMatC_Prov_Jsonclick ;
   private String edtMatC_Lote_Jsonclick ;
   private String edtMatC_Porc_Jsonclick ;
   private String edtMatC_Lm_Jsonclick ;
   private String edtMatC_Obs_Jsonclick ;
   private String edtMatC_MaqT_Jsonclick ;
   private String edtMatC_CliRm_Jsonclick ;
   private String edtMatC_TraIn_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ46AlbREnt ;
   private String ZZ5806AlbREnt2 ;
   private String ZZ45AlbRef ;
   private String ZZ3613AlbRefDsc ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_70_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n44AlbRecCod ;
   private boolean n7114MatC_ULin ;
   private boolean Gx_longc ;
   private boolean n7124MatC_Obs ;
   private boolean n7116MatC_Est ;
   private boolean n7117MatC_Mat ;
   private boolean n7118MatC_Tor ;
   private boolean n7119MatC_Col ;
   private boolean n7120MatC_Prov ;
   private boolean n7121MatC_Lote ;
   private boolean n7122MatC_Porc ;
   private boolean n7123MatC_Lm ;
   private boolean n7125MatC_MaqT ;
   private boolean n7126MatC_CliRm ;
   private boolean n7127MatC_TraIn ;
   private String A7124MatC_Obs ;
   private String Z7124MatC_Obs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private int[] T00Y37_A44AlbRecCod ;
   private boolean[] T00Y37_n44AlbRecCod ;
   private String[] T00Y37_A407EmprNom ;
   private boolean[] T00Y37_n407EmprNom ;
   private String[] T00Y37_A46AlbREnt ;
   private String[] T00Y37_A5806AlbREnt2 ;
   private int[] T00Y37_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T00Y37_A58AlbRUniEnt ;
   private String[] T00Y37_A45AlbRef ;
   private String[] T00Y37_A3613AlbRefDsc ;
   private short[] T00Y37_A7114MatC_ULin ;
   private boolean[] T00Y37_n7114MatC_ULin ;
   private String[] T00Y37_A396EmprCod ;
   private String[] T00Y36_A407EmprNom ;
   private boolean[] T00Y36_n407EmprNom ;
   private String[] T00Y38_A407EmprNom ;
   private boolean[] T00Y38_n407EmprNom ;
   private String[] T00Y39_A396EmprCod ;
   private int[] T00Y39_A44AlbRecCod ;
   private boolean[] T00Y39_n44AlbRecCod ;
   private int[] T00Y35_A44AlbRecCod ;
   private boolean[] T00Y35_n44AlbRecCod ;
   private String[] T00Y35_A46AlbREnt ;
   private String[] T00Y35_A5806AlbREnt2 ;
   private int[] T00Y35_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T00Y35_A58AlbRUniEnt ;
   private String[] T00Y35_A45AlbRef ;
   private String[] T00Y35_A3613AlbRefDsc ;
   private short[] T00Y35_A7114MatC_ULin ;
   private boolean[] T00Y35_n7114MatC_ULin ;
   private String[] T00Y35_A396EmprCod ;
   private String[] T00Y310_A396EmprCod ;
   private int[] T00Y310_A44AlbRecCod ;
   private boolean[] T00Y310_n44AlbRecCod ;
   private String[] T00Y311_A396EmprCod ;
   private int[] T00Y311_A44AlbRecCod ;
   private boolean[] T00Y311_n44AlbRecCod ;
   private int[] T00Y34_A44AlbRecCod ;
   private boolean[] T00Y34_n44AlbRecCod ;
   private String[] T00Y34_A46AlbREnt ;
   private String[] T00Y34_A5806AlbREnt2 ;
   private int[] T00Y34_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T00Y34_A58AlbRUniEnt ;
   private String[] T00Y34_A45AlbRef ;
   private String[] T00Y34_A3613AlbRefDsc ;
   private short[] T00Y34_A7114MatC_ULin ;
   private boolean[] T00Y34_n7114MatC_ULin ;
   private String[] T00Y34_A396EmprCod ;
   private String[] T00Y315_A407EmprNom ;
   private boolean[] T00Y315_n407EmprNom ;
   private String[] T00Y316_A396EmprCod ;
   private int[] T00Y316_A13026PedDGId ;
   private int[] T00Y316_A44AlbRecCod ;
   private boolean[] T00Y316_n44AlbRecCod ;
   private String[] T00Y317_A396EmprCod ;
   private int[] T00Y317_A11669DevCruId ;
   private int[] T00Y317_A44AlbRecCod ;
   private boolean[] T00Y317_n44AlbRecCod ;
   private String[] T00Y318_A396EmprCod ;
   private int[] T00Y318_A44AlbRecCod ;
   private boolean[] T00Y318_n44AlbRecCod ;
   private String[] T00Y318_A9743Emp_CUb ;
   private short[] T00Y318_A5860Emp_Anp ;
   private String[] T00Y319_A396EmprCod ;
   private int[] T00Y319_A44AlbRecCod ;
   private boolean[] T00Y319_n44AlbRecCod ;
   private String[] T00Y319_A7130MatC_Pz ;
   private String[] T00Y320_A396EmprCod ;
   private int[] T00Y320_A44AlbRecCod ;
   private boolean[] T00Y320_n44AlbRecCod ;
   private String[] T00Y320_A7132MatC_Talla ;
   private String[] T00Y321_A396EmprCod ;
   private long[] T00Y321_A30AlbProCod ;
   private int[] T00Y321_A129BarCod ;
   private byte[] T00Y321_A132BarCodReo ;
   private String[] T00Y321_A130BarCodPar ;
   private short[] T00Y321_A6622AlbHdRLn ;
   private String[] T00Y322_A396EmprCod ;
   private int[] T00Y322_A6235DevEmpCod ;
   private byte[] T00Y322_A6243DevNumLin ;
   private String[] T00Y323_A396EmprCod ;
   private int[] T00Y323_A44AlbRecCod ;
   private boolean[] T00Y323_n44AlbRecCod ;
   private short[] T00Y323_A4596AlbRDefCod ;
   private String[] T00Y324_A396EmprCod ;
   private int[] T00Y324_A44AlbRecCod ;
   private boolean[] T00Y324_n44AlbRecCod ;
   private String[] T00Y324_A2159AlbRecPie ;
   private String[] T00Y325_A396EmprCod ;
   private int[] T00Y325_A44AlbRecCod ;
   private boolean[] T00Y325_n44AlbRecCod ;
   private short[] T00Y325_A2165HisEmpLin ;
   private String[] T00Y326_A396EmprCod ;
   private int[] T00Y326_A44AlbRecCod ;
   private boolean[] T00Y326_n44AlbRecCod ;
   private byte[] T00Y326_A1299AlbRLin ;
   private String[] T00Y327_A396EmprCod ;
   private int[] T00Y327_A361DisCod ;
   private int[] T00Y327_A44AlbRecCod ;
   private boolean[] T00Y327_n44AlbRecCod ;
   private String[] T00Y328_A396EmprCod ;
   private int[] T00Y328_A323DevGenCod ;
   private String[] T00Y329_A396EmprCod ;
   private int[] T00Y329_A129BarCod ;
   private byte[] T00Y329_A132BarCodReo ;
   private String[] T00Y329_A130BarCodPar ;
   private String[] T00Y329_A200BarPieCod ;
   private String[] T00Y330_A396EmprCod ;
   private int[] T00Y330_A44AlbRecCod ;
   private boolean[] T00Y330_n44AlbRecCod ;
   private String[] T00Y331_A7124MatC_Obs ;
   private boolean[] T00Y331_n7124MatC_Obs ;
   private int[] T00Y331_A44AlbRecCod ;
   private boolean[] T00Y331_n44AlbRecCod ;
   private short[] T00Y331_A7115MatC_Lin ;
   private String[] T00Y331_A7116MatC_Est ;
   private boolean[] T00Y331_n7116MatC_Est ;
   private String[] T00Y331_A7117MatC_Mat ;
   private boolean[] T00Y331_n7117MatC_Mat ;
   private String[] T00Y331_A7118MatC_Tor ;
   private boolean[] T00Y331_n7118MatC_Tor ;
   private String[] T00Y331_A7119MatC_Col ;
   private boolean[] T00Y331_n7119MatC_Col ;
   private String[] T00Y331_A7120MatC_Prov ;
   private boolean[] T00Y331_n7120MatC_Prov ;
   private String[] T00Y331_A7121MatC_Lote ;
   private boolean[] T00Y331_n7121MatC_Lote ;
   private java.math.BigDecimal[] T00Y331_A7122MatC_Porc ;
   private boolean[] T00Y331_n7122MatC_Porc ;
   private java.math.BigDecimal[] T00Y331_A7123MatC_Lm ;
   private boolean[] T00Y331_n7123MatC_Lm ;
   private String[] T00Y331_A7125MatC_MaqT ;
   private boolean[] T00Y331_n7125MatC_MaqT ;
   private String[] T00Y331_A7126MatC_CliRm ;
   private boolean[] T00Y331_n7126MatC_CliRm ;
   private long[] T00Y331_A7127MatC_TraIn ;
   private boolean[] T00Y331_n7127MatC_TraIn ;
   private String[] T00Y331_A396EmprCod ;
   private String[] T00Y332_A396EmprCod ;
   private int[] T00Y332_A44AlbRecCod ;
   private boolean[] T00Y332_n44AlbRecCod ;
   private short[] T00Y332_A7115MatC_Lin ;
   private String[] T00Y33_A7124MatC_Obs ;
   private boolean[] T00Y33_n7124MatC_Obs ;
   private int[] T00Y33_A44AlbRecCod ;
   private boolean[] T00Y33_n44AlbRecCod ;
   private short[] T00Y33_A7115MatC_Lin ;
   private String[] T00Y33_A7116MatC_Est ;
   private boolean[] T00Y33_n7116MatC_Est ;
   private String[] T00Y33_A7117MatC_Mat ;
   private boolean[] T00Y33_n7117MatC_Mat ;
   private String[] T00Y33_A7118MatC_Tor ;
   private boolean[] T00Y33_n7118MatC_Tor ;
   private String[] T00Y33_A7119MatC_Col ;
   private boolean[] T00Y33_n7119MatC_Col ;
   private String[] T00Y33_A7120MatC_Prov ;
   private boolean[] T00Y33_n7120MatC_Prov ;
   private String[] T00Y33_A7121MatC_Lote ;
   private boolean[] T00Y33_n7121MatC_Lote ;
   private java.math.BigDecimal[] T00Y33_A7122MatC_Porc ;
   private boolean[] T00Y33_n7122MatC_Porc ;
   private java.math.BigDecimal[] T00Y33_A7123MatC_Lm ;
   private boolean[] T00Y33_n7123MatC_Lm ;
   private String[] T00Y33_A7125MatC_MaqT ;
   private boolean[] T00Y33_n7125MatC_MaqT ;
   private String[] T00Y33_A7126MatC_CliRm ;
   private boolean[] T00Y33_n7126MatC_CliRm ;
   private long[] T00Y33_A7127MatC_TraIn ;
   private boolean[] T00Y33_n7127MatC_TraIn ;
   private String[] T00Y33_A396EmprCod ;
   private String[] T00Y32_A7124MatC_Obs ;
   private boolean[] T00Y32_n7124MatC_Obs ;
   private int[] T00Y32_A44AlbRecCod ;
   private boolean[] T00Y32_n44AlbRecCod ;
   private short[] T00Y32_A7115MatC_Lin ;
   private String[] T00Y32_A7116MatC_Est ;
   private boolean[] T00Y32_n7116MatC_Est ;
   private String[] T00Y32_A7117MatC_Mat ;
   private boolean[] T00Y32_n7117MatC_Mat ;
   private String[] T00Y32_A7118MatC_Tor ;
   private boolean[] T00Y32_n7118MatC_Tor ;
   private String[] T00Y32_A7119MatC_Col ;
   private boolean[] T00Y32_n7119MatC_Col ;
   private String[] T00Y32_A7120MatC_Prov ;
   private boolean[] T00Y32_n7120MatC_Prov ;
   private String[] T00Y32_A7121MatC_Lote ;
   private boolean[] T00Y32_n7121MatC_Lote ;
   private java.math.BigDecimal[] T00Y32_A7122MatC_Porc ;
   private boolean[] T00Y32_n7122MatC_Porc ;
   private java.math.BigDecimal[] T00Y32_A7123MatC_Lm ;
   private boolean[] T00Y32_n7123MatC_Lm ;
   private String[] T00Y32_A7125MatC_MaqT ;
   private boolean[] T00Y32_n7125MatC_MaqT ;
   private String[] T00Y32_A7126MatC_CliRm ;
   private boolean[] T00Y32_n7126MatC_CliRm ;
   private long[] T00Y32_A7127MatC_TraIn ;
   private boolean[] T00Y32_n7127MatC_TraIn ;
   private String[] T00Y32_A396EmprCod ;
   private String[] T00Y336_A396EmprCod ;
   private int[] T00Y336_A44AlbRecCod ;
   private boolean[] T00Y336_n44AlbRecCod ;
   private short[] T00Y336_A7115MatC_Lin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class trepmat__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trepmat__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trepmat__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trepmat__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trepmat__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00Y32", "SELECT MatC_Obs, AlbRecCod, MatC_Lin, MatC_Est, MatC_Mat, MatC_Tor, MatC_Col, MatC_Prov, MatC_Lote, MatC_Porc, MatC_Lm, MatC_MaqT, MatC_CliRm, MatC_TraIn, EmprCod FROM TXPREPMAT WHERE EmprCod = ? AND AlbRecCod = ? AND MatC_Lin = ?  FOR UPDATE OF MatC_Est, MatC_Mat, MatC_Tor, MatC_Col, MatC_Prov, MatC_Lote, MatC_Porc, MatC_Lm, MatC_Obs, MatC_MaqT, MatC_CliRm, MatC_TraIn NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Y33", "SELECT MatC_Obs, AlbRecCod, MatC_Lin, MatC_Est, MatC_Mat, MatC_Tor, MatC_Col, MatC_Prov, MatC_Lote, MatC_Porc, MatC_Lm, MatC_MaqT, MatC_CliRm, MatC_TraIn, EmprCod FROM TXPREPMAT WHERE EmprCod = ? AND AlbRecCod = ? AND MatC_Lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Y34", "SELECT AlbRecCod, AlbREnt, AlbREnt2, AlbRPieEnt, AlbRUniEnt, AlbRef, AlbRefDsc, MatC_ULin, EmprCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbREnt, AlbREnt2, AlbRPieEnt, AlbRUniEnt, AlbRef, AlbRefDsc, MatC_ULin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Y35", "SELECT AlbRecCod, AlbREnt, AlbREnt2, AlbRPieEnt, AlbRUniEnt, AlbRef, AlbRefDsc, MatC_ULin, EmprCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Y36", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Y37", "SELECT /*+ FIRST_ROWS(100) */ TM1.AlbRecCod, T2.EmprNom, TM1.AlbREnt, TM1.AlbREnt2, TM1.AlbRPieEnt, TM1.AlbRUniEnt, TM1.AlbRef, TM1.AlbRefDsc, TM1.MatC_ULin, TM1.EmprCod FROM (TXPALBREC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.AlbRecCod = ? ORDER BY TM1.EmprCod, TM1.AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Y38", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Y39", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Y310", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE ( EmprCod > ? or EmprCod = ? and AlbRecCod > ?) ORDER BY EmprCod, AlbRecCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Y311", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE ( EmprCod < ? or EmprCod = ? and AlbRecCod < ?) ORDER BY EmprCod DESC, AlbRecCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00Y312", "INSERT INTO TXPALBREC(AlbRecCod, AlbREnt, AlbREnt2, AlbRPieEnt, AlbRUniEnt, AlbRef, AlbRefDsc, MatC_ULin, EmprCod, CliCod, TrnCod, AlbRUni, AlbRLoc, AlbRFen, AlbRReo, AlbRPieUti, AlbRPieReb, AlbRUniUti, AlbRUniReb, AlbRFecUlt, AlbREst, TipEntCod, AlbNumEti, AlbRDes, ProceCod, AlbRUlin, HisEmpULin, AlbRDisCli, AlbRImp, AlbPmPPza, AlbRTam, AlbRMdlCod, AlbRUniLot, AlbRPieLot, AlbRHEn, ClasCod, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRTartC, AlbRLote, AlbRTelar, AlbRLu, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlmCod, AlbRecSec, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, Bod_UltPz, Emp_Item1, AlbPdaC, AlbOStj, AlbStLot, AlbTurno, AlbUltP, Cod_mta, AlbOEKOTEX, AlbRPh, AlbRRLong, AlbRRTrans, AlbRLot2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ')", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("T00Y313", "UPDATE TXPALBREC SET AlbREnt=?, AlbREnt2=?, AlbRPieEnt=?, AlbRUniEnt=?, AlbRef=?, AlbRefDsc=?, MatC_ULin=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("T00Y314", "DELETE FROM TXPALBREC  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T00Y315", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Y316", "SELECT * FROM (SELECT EmprCod, PedDGId, AlbRecCod FROM TXPPEDDG3 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Y317", "SELECT * FROM (SELECT EmprCod, DevCruId, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Y318", "SELECT * FROM (SELECT EmprCod, AlbRecCod, Emp_CUb, Emp_Anp FROM TXPUBIIN WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Y319", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Pz FROM TXPREPPZS WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Y320", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Talla FROM TXPREPTAL WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Y321", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Y322", "SELECT * FROM (SELECT EmprCod, DevEmpCod, DevNumLin FROM TXPDEVEM1 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Y323", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRDefCod FROM TXPALBRDF WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Y324", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Y325", "SELECT * FROM (SELECT EmprCod, AlbRecCod, HisEmpLin FROM TXPHISEMP WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Y326", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRLin FROM TXPALBROB WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Y327", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Y328", "SELECT * FROM (SELECT EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Y329", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Y330", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbRecCod FROM TXPALBREC ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Y331", "SELECT MatC_Obs, AlbRecCod, MatC_Lin, MatC_Est, MatC_Mat, MatC_Tor, MatC_Col, MatC_Prov, MatC_Lote, MatC_Porc, MatC_Lm, MatC_MaqT, MatC_CliRm, MatC_TraIn, EmprCod FROM TXPREPMAT WHERE EmprCod = ? and AlbRecCod = ? and MatC_Lin = ? ORDER BY EmprCod, AlbRecCod, MatC_Lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Y332", "SELECT EmprCod, AlbRecCod, MatC_Lin FROM TXPREPMAT WHERE EmprCod = ? AND AlbRecCod = ? AND MatC_Lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00Y333", "INSERT INTO TXPREPMAT(AlbRecCod, MatC_Lin, MatC_Est, MatC_Mat, MatC_Tor, MatC_Col, MatC_Prov, MatC_Lote, MatC_Porc, MatC_Lm, MatC_Obs, MatC_MaqT, MatC_CliRm, MatC_TraIn, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPREPMAT")
         ,new UpdateCursor("T00Y334", "UPDATE TXPREPMAT SET MatC_Est=?, MatC_Mat=?, MatC_Tor=?, MatC_Col=?, MatC_Prov=?, MatC_Lote=?, MatC_Porc=?, MatC_Lm=?, MatC_Obs=?, MatC_MaqT=?, MatC_CliRm=?, MatC_TraIn=?  WHERE EmprCod = ? AND AlbRecCod = ? AND MatC_Lin = ?", GX_NOMASK, "TXPREPMAT")
         ,new UpdateCursor("T00Y335", "DELETE FROM TXPREPMAT  WHERE EmprCod = ? AND AlbRecCod = ? AND MatC_Lin = ?", GX_NOMASK, "TXPREPMAT")
         ,new ForEachCursor("T00Y336", "SELECT EmprCod, AlbRecCod, MatC_Lin FROM TXPREPMAT WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, MatC_Lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((long[]) buf[24])[0] = rslt.getLong(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((long[]) buf[24])[0] = rslt.getLong(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((long[]) buf[24])[0] = rslt.getLong(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 3);
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
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
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
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
            case 8 :
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
               return;
            case 9 :
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
               stmt.setString(2, (String)parms[2], 8);
               stmt.setString(3, (String)parms[3], 20);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(6, (String)parms[6], 16);
               stmt.setString(7, (String)parms[7], 26);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[9]).shortValue());
               }
               stmt.setString(9, (String)parms[10], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(5, (String)parms[4], 16);
               stmt.setString(6, (String)parms[5], 26);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[7]).shortValue());
               }
               stmt.setString(8, (String)parms[8], 3);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[10]).intValue());
               }
               return;
            case 12 :
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
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
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
            case 15 :
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 31 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 20);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 40);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 13);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 40);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 20);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[16], 2);
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
                  stmt.setNull( 11 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(11, (String)parms[20]);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 20);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 30);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(14, ((Number) parms[26]).longValue());
               }
               stmt.setString(15, (String)parms[27], 3);
               return;
            case 32 :
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
                  stmt.setString(2, (String)parms[3], 40);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 13);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 40);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 20);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(9, (String)parms[17]);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 20);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 30);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(12, ((Number) parms[23]).longValue());
               }
               stmt.setString(13, (String)parms[24], 3);
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[26]).intValue());
               }
               stmt.setShort(15, ((Number) parms[27]).shortValue());
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
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
               return;
      }
   }

}

