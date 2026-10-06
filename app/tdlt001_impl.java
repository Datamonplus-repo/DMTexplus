package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdlt001_impl extends GXDataArea
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
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A30AlbProCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
      {
         gxnrgrid2_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
      {
         gxnrgrid1_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid3") == 0 )
      {
         gxnrgrid3_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid4") == 0 )
      {
         gxnrgrid4_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla Hdrs Albaran", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAlbProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgrid2_newrow_invoke( )
   {
      nRC_GXsfl_186 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_186"))) ;
      nGXsfl_186_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_186_idx"))) ;
      sGXsfl_186_idx = httpContext.GetPar( "sGXsfl_186_idx") ;
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

   public void gxnrgrid1_newrow_invoke( )
   {
      nRC_GXsfl_170 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_170"))) ;
      nGXsfl_170_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_170_idx"))) ;
      sGXsfl_170_idx = httpContext.GetPar( "sGXsfl_170_idx") ;
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

   public void gxnrgrid3_newrow_invoke( )
   {
      nRC_GXsfl_213 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_213"))) ;
      nGXsfl_213_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_213_idx"))) ;
      sGXsfl_213_idx = httpContext.GetPar( "sGXsfl_213_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid3_newrow( ) ;
      /* End function gxnrGrid3_newrow_invoke */
   }

   public void gxnrgrid4_newrow_invoke( )
   {
      nRC_GXsfl_222 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_222"))) ;
      nGXsfl_222_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_222_idx"))) ;
      sGXsfl_222_idx = httpContext.GetPar( "sGXsfl_222_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid4_newrow( ) ;
      /* End function gxnrGrid4_newrow_invoke */
   }

   public tdlt001_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdlt001_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdlt001_impl.class ));
   }

   public tdlt001_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDLT001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDLT001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDLT001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDLT001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDLT001.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Numero Albaran Produccion", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "", "", "", "", "", 1, edtAlbProCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Hdr", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltHdr_Internalname, GXutil.ltrim( localUtil.ntoc( A12176DltHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDltHdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12176DltHdr), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12176DltHdr), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltHdr_Jsonclick, 0, "", "", "", "", "", 1, edtDltHdr_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "R", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltR_Internalname, GXutil.ltrim( localUtil.ntoc( A12177DltR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDltR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12177DltR), "9") : localUtil.format( DecimalUtil.doubleToDec(A12177DltR), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltR_Jsonclick, 0, "", "", "", "", "", 1, edtDltR_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "P", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltP_Internalname, GXutil.rtrim( A12178DltP), GXutil.rtrim( localUtil.format( A12178DltP, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltP_Jsonclick, 0, "", "", "", "", "", 1, edtDltP_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDLT001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Kilos", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A12145DltKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDltKgs_Enabled!=0) ? localUtil.format( A12145DltKgs, "ZZZZZ9.99") : localUtil.format( A12145DltKgs, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltKgs_Jsonclick, 0, "", "", "", "", "", 1, edtDltKgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Metros", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltMts_Internalname, GXutil.ltrim( localUtil.ntoc( A12146DltMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDltMts_Enabled!=0) ? localUtil.format( A12146DltMts, "ZZZZZ9.99") : localUtil.format( A12146DltMts, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltMts_Jsonclick, 0, "", "", "", "", "", 1, edtDltMts_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Piezas", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A12147DltPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDltPzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12147DltPzs), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12147DltPzs), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltPzs_Jsonclick, 0, "", "", "", "", "", 1, edtDltPzs_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Bultos", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltBultos_Internalname, GXutil.ltrim( localUtil.ntoc( A12148DltBultos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDltBultos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12148DltBultos), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12148DltBultos), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltBultos_Jsonclick, 0, "", "", "", "", "", 1, edtDltBultos_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Tubos", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltTubos_Internalname, GXutil.ltrim( localUtil.ntoc( A12149DltTubos, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDltTubos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12149DltTubos), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12149DltTubos), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltTubos_Jsonclick, 0, "", "", "", "", "", 1, edtDltTubos_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Articulo", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltArtCod_Internalname, GXutil.rtrim( A12150DltArtCod), GXutil.rtrim( localUtil.format( A12150DltArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtDltArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltArtDsc_Internalname, GXutil.rtrim( A12151DltArtDsc), GXutil.rtrim( localUtil.format( A12151DltArtDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtDltArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Color", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltColNom_Internalname, GXutil.rtrim( A12152DltColNom), GXutil.rtrim( localUtil.format( A12152DltColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltColNom_Jsonclick, 0, "", "", "", "", "", 1, edtDltColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Numero", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A12153DltColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDltColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12153DltColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12153DltColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltColNum_Jsonclick, 0, "", "", "", "", "", 1, edtDltColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Tc", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltTc_Internalname, GXutil.ltrim( localUtil.ntoc( A12154DltTc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDltTc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12154DltTc), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A12154DltTc), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltTc_Jsonclick, 0, "", "", "", "", "", 1, edtDltTc_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Color Cliente", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltColClNm_Internalname, GXutil.rtrim( A12155DltColClNm), GXutil.rtrim( localUtil.format( A12155DltColClNm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltColClNm_Jsonclick, 0, "", "", "", "", "", 1, edtDltColClNm_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Color NUmero Cliente", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltColClNr_Internalname, GXutil.ltrim( localUtil.ntoc( A12156DltColClNr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDltColClNr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12156DltColClNr), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12156DltColClNr), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltColClNr_Jsonclick, 0, "", "", "", "", "", 1, edtDltColClNr_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Grm2", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltGrm2_Internalname, GXutil.ltrim( localUtil.ntoc( A12157DltGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDltGrm2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12157DltGrm2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12157DltGrm2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltGrm2_Jsonclick, 0, "", "", "", "", "", 1, edtDltGrm2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Ancho", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A12158DltAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDltAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12158DltAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12158DltAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltAnc_Jsonclick, 0, "", "", "", "", "", 1, edtDltAnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltAlbObs_Internalname, GXutil.rtrim( A12159DltAlbObs), GXutil.rtrim( localUtil.format( A12159DltAlbObs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltAlbObs_Jsonclick, 0, "", "", "", "", "", 1, edtDltAlbObs_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Ultima Linea Txt", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltUltTxt_Internalname, GXutil.ltrim( localUtil.ntoc( A12160DltUltTxt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDltUltTxt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12160DltUltTxt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12160DltUltTxt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltUltTxt_Jsonclick, 0, "", "", "", "", "", 1, edtDltUltTxt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Ultima Linea Fase", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltUltFs_Internalname, GXutil.ltrim( localUtil.ntoc( A12161DltUltFs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDltUltFs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12161DltUltFs), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12161DltUltFs), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltUltFs_Jsonclick, 0, "", "", "", "", "", 1, edtDltUltFs_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Pedido Cliente", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltEncCli_Internalname, GXutil.rtrim( A12162DltEncCli), GXutil.rtrim( localUtil.format( A12162DltEncCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltEncCli_Jsonclick, 0, "", "", "", "", "", 1, edtDltEncCli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Precio Kg", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltPreKg_Internalname, GXutil.ltrim( localUtil.ntoc( A12163DltPreKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDltPreKg_Enabled!=0) ? localUtil.format( A12163DltPreKg, "ZZZZZZ9.99999") : localUtil.format( A12163DltPreKg, "ZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltPreKg_Jsonclick, 0, "", "", "", "", "", 1, edtDltPreKg_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Precio Mt", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltPreMt_Internalname, GXutil.ltrim( localUtil.ntoc( A12164DltPreMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDltPreMt_Enabled!=0) ? localUtil.format( A12164DltPreMt, "ZZZZZZ9.99999") : localUtil.format( A12164DltPreMt, "ZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltPreMt_Jsonclick, 0, "", "", "", "", "", 1, edtDltPreMt_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Kilos Tintados para Cliente", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltKgsCli_Internalname, GXutil.ltrim( localUtil.ntoc( A12186DltKgsCli, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDltKgsCli_Enabled!=0) ? localUtil.format( A12186DltKgsCli, "ZZZZZ9.99") : localUtil.format( A12186DltKgsCli, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltKgsCli_Jsonclick, 0, "", "", "", "", "", 1, edtDltKgsCli_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Codigo Tubo", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltTubo_Internalname, GXutil.ltrim( localUtil.ntoc( A12187DltTubo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDltTubo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12187DltTubo), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12187DltTubo), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltTubo_Jsonclick, 0, "", "", "", "", "", 1, edtDltTubo_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Desc Tubo", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltTuboN_Internalname, GXutil.rtrim( A12188DltTuboN), GXutil.rtrim( localUtil.format( A12188DltTuboN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltTuboN_Jsonclick, 0, "", "", "", "", "", 1, edtDltTuboN_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Modelo", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDltModCod_Internalname, GXutil.rtrim( A12287DltModCod), GXutil.rtrim( localUtil.format( A12287DltModCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDltModCod_Jsonclick, 0, "", "", "", "", "", 1, edtDltModCod_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDLT001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol170( ) ;
      nGXsfl_170_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1689 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1689 = (short)(1) ;
            scanStart1J91689( ) ;
            while ( RcdFound1689 != 0 )
            {
               init_level_properties1689( ) ;
               getByPrimaryKey1J91689( ) ;
               addRow1J91689( ) ;
               scanNext1J91689( ) ;
            }
            scanEnd1J91689( ) ;
            nBlankRcdCount1689 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1J91689( ) ;
         standaloneModal1J91689( ) ;
         sMode1689 = Gx_mode ;
         while ( nGXsfl_170_idx < nRC_GXsfl_170 )
         {
            bGXsfl_170_Refreshing = true ;
            readRow1J91689( ) ;
            edtavnRcdDeleted_1689_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1689_"+sGXsfl_170_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1689_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1689_Enabled), 5, 0), !bGXsfl_170_Refreshing);
            edtDltLinTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTLINTXT_"+sGXsfl_170_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltLinTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltLinTxt_Enabled), 5, 0), !bGXsfl_170_Refreshing);
            edtDltDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTDSC_"+sGXsfl_170_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltDsc_Enabled), 5, 0), !bGXsfl_170_Refreshing);
            edtDltRD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTRD_"+sGXsfl_170_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltRD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltRD_Enabled), 5, 0), !bGXsfl_170_Refreshing);
            edtDltPKg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTPKG_"+sGXsfl_170_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltPKg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltPKg_Enabled), 5, 0), !bGXsfl_170_Refreshing);
            edtDltKgsTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTKGSTXT_"+sGXsfl_170_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltKgsTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltKgsTxt_Enabled), 5, 0), !bGXsfl_170_Refreshing);
            edtDltPMt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTPMT_"+sGXsfl_170_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltPMt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltPMt_Enabled), 5, 0), !bGXsfl_170_Refreshing);
            edtDltMtsTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTMTSTXT_"+sGXsfl_170_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltMtsTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltMtsTxt_Enabled), 5, 0), !bGXsfl_170_Refreshing);
            edtDltImpTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTIMPTXT_"+sGXsfl_170_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltImpTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltImpTxt_Enabled), 5, 0), !bGXsfl_170_Refreshing);
            edtDltTipTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTTIPTXT_"+sGXsfl_170_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltTipTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltTipTxt_Enabled), 5, 0), !bGXsfl_170_Refreshing);
            edtDltCodTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTCODTXT_"+sGXsfl_170_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltCodTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltCodTxt_Enabled), 5, 0), !bGXsfl_170_Refreshing);
            edtDltPzsTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTPZSTXT_"+sGXsfl_170_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltPzsTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltPzsTxt_Enabled), 5, 0), !bGXsfl_170_Refreshing);
            if ( ( nRcdExists_1689 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1J91689( ) ;
            }
            sendRow1J91689( ) ;
            bGXsfl_170_Refreshing = false ;
         }
         Gx_mode = sMode1689 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1689 = (short)(5) ;
         nRcdExists_1689 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1J91689( ) ;
            while ( RcdFound1689 != 0 )
            {
               sGXsfl_170_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_170_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1701689( ) ;
               init_level_properties1689( ) ;
               standaloneNotModal1J91689( ) ;
               getByPrimaryKey1J91689( ) ;
               standaloneModal1J91689( ) ;
               addRow1J91689( ) ;
               scanNext1J91689( ) ;
            }
            scanEnd1J91689( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1689 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_170_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_170_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_1701689( ) ;
      initAll1J91689( ) ;
      init_level_properties1689( ) ;
      nRcdExists_1689 = (short)(0) ;
      nIsMod_1689 = (short)(0) ;
      nRcdDeleted_1689 = (short)(0) ;
      nBlankRcdCount1689 = (short)(nBlankRcdUsr1689+nBlankRcdCount1689) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1689 > 0 )
      {
         standaloneNotModal1J91689( ) ;
         standaloneModal1J91689( ) ;
         addRow1J91689( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDltLinTxt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1689 = (short)(nBlankRcdCount1689-1) ;
      }
      Gx_mode = sMode1689 ;
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
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol186( ) ;
      /* Save parent mode. */
      sMode1690 = Gx_mode ;
      nGXsfl_186_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1690 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1690 = (short)(1) ;
            scanStart1J91690( ) ;
            while ( RcdFound1690 != 0 )
            {
               init_level_properties1690( ) ;
               getByPrimaryKey1J91690( ) ;
               addRow1J91690( ) ;
               scanNext1J91690( ) ;
            }
            scanEnd1J91690( ) ;
            nBlankRcdCount1690 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1J91690( ) ;
         standaloneModal1J91690( ) ;
         sMode1690 = Gx_mode ;
         while ( nGXsfl_186_idx < nRC_GXsfl_186 )
         {
            bGXsfl_186_Refreshing = true ;
            readRow1J91690( ) ;
            edtDltNPieza_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTNPIEZA_"+sGXsfl_186_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltNPieza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltNPieza_Enabled), 5, 0), !bGXsfl_186_Refreshing);
            edtDltKgsPz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTKGSPZ_"+sGXsfl_186_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltKgsPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltKgsPz_Enabled), 5, 0), !bGXsfl_186_Refreshing);
            edtDltMtsPz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTMTSPZ_"+sGXsfl_186_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltMtsPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltMtsPz_Enabled), 5, 0), !bGXsfl_186_Refreshing);
            edtDltAncPz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTANCPZ_"+sGXsfl_186_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltAncPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltAncPz_Enabled), 5, 0), !bGXsfl_186_Refreshing);
            if ( ( nRcdExists_1690 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1J91690( ) ;
            }
            sendRow1J91690( ) ;
            bGXsfl_186_Refreshing = false ;
         }
         Gx_mode = sMode1690 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1690 = (short)(5) ;
         nRcdExists_1690 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1J91690( ) ;
            while ( RcdFound1690 != 0 )
            {
               sGXsfl_186_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_186_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1861690( ) ;
               init_level_properties1690( ) ;
               standaloneNotModal1J91690( ) ;
               getByPrimaryKey1J91690( ) ;
               standaloneModal1J91690( ) ;
               addRow1J91690( ) ;
               scanNext1J91690( ) ;
            }
            scanEnd1J91690( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1690 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_186_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_186_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_1861690( ) ;
      initAll1J91690( ) ;
      init_level_properties1690( ) ;
      nRcdExists_1690 = (short)(0) ;
      nIsMod_1690 = (short)(0) ;
      nRcdDeleted_1690 = (short)(0) ;
      nBlankRcdCount1690 = (short)(nBlankRcdUsr1690+nBlankRcdCount1690) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1690 > 0 )
      {
         standaloneNotModal1J91690( ) ;
         standaloneModal1J91690( ) ;
         addRow1J91690( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDltNPieza_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1690 = (short)(nBlankRcdCount1690-1) ;
      }
      Gx_mode = sMode1690 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode1690 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Grid2Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Grid2", Grid2Container, subGrid2_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData", Grid2Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V", Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V"+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol222( ) ;
      nGXsfl_222_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1692 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1692 = (short)(1) ;
            scanStart1J91692( ) ;
            while ( RcdFound1692 != 0 )
            {
               init_level_properties1692( ) ;
               getByPrimaryKey1J91692( ) ;
               addRow1J91692( ) ;
               scanNext1J91692( ) ;
            }
            scanEnd1J91692( ) ;
            nBlankRcdCount1692 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1J91692( ) ;
         standaloneModal1J91692( ) ;
         sMode1692 = Gx_mode ;
         while ( nGXsfl_222_idx < nRC_GXsfl_222 )
         {
            bGXsfl_222_Refreshing = true ;
            readRow1J91692( ) ;
            edtavnRcdDeleted_1692_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1692_"+sGXsfl_222_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1692_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1692_Enabled), 5, 0), !bGXsfl_222_Refreshing);
            edtDltLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTLIN_"+sGXsfl_222_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltLin_Enabled), 5, 0), !bGXsfl_222_Refreshing);
            edtDltFascod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTFASCOD_"+sGXsfl_222_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltFascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltFascod_Enabled), 5, 0), !bGXsfl_222_Refreshing);
            edtDltFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTFASDSC_"+sGXsfl_222_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltFasDsc_Enabled), 5, 0), !bGXsfl_222_Refreshing);
            edtDltKgsFs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTKGSFS_"+sGXsfl_222_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltKgsFs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltKgsFs_Enabled), 5, 0), !bGXsfl_222_Refreshing);
            edtDltMtsFs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTMTSFS_"+sGXsfl_222_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltMtsFs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltMtsFs_Enabled), 5, 0), !bGXsfl_222_Refreshing);
            edtDltPrKFs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTPRKFS_"+sGXsfl_222_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltPrKFs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltPrKFs_Enabled), 5, 0), !bGXsfl_222_Refreshing);
            edtDltPrMFs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTPRMFS_"+sGXsfl_222_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltPrMFs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltPrMFs_Enabled), 5, 0), !bGXsfl_222_Refreshing);
            edtDltPrKBFs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTPRKBFS_"+sGXsfl_222_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltPrKBFs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltPrKBFs_Enabled), 5, 0), !bGXsfl_222_Refreshing);
            edtDltPrMBFs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTPRMBFS_"+sGXsfl_222_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltPrMBFs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltPrMBFs_Enabled), 5, 0), !bGXsfl_222_Refreshing);
            if ( ( nRcdExists_1692 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1J91692( ) ;
            }
            sendRow1J91692( ) ;
            bGXsfl_222_Refreshing = false ;
         }
         Gx_mode = sMode1692 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1692 = (short)(5) ;
         nRcdExists_1692 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1J91692( ) ;
            while ( RcdFound1692 != 0 )
            {
               sGXsfl_222_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_222_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_2221692( ) ;
               init_level_properties1692( ) ;
               standaloneNotModal1J91692( ) ;
               getByPrimaryKey1J91692( ) ;
               standaloneModal1J91692( ) ;
               addRow1J91692( ) ;
               scanNext1J91692( ) ;
            }
            scanEnd1J91692( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1692 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_222_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_222_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_2221692( ) ;
      initAll1J91692( ) ;
      init_level_properties1692( ) ;
      nRcdExists_1692 = (short)(0) ;
      nIsMod_1692 = (short)(0) ;
      nRcdDeleted_1692 = (short)(0) ;
      nBlankRcdCount1692 = (short)(nBlankRcdUsr1692+nBlankRcdCount1692) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1692 > 0 )
      {
         standaloneNotModal1J91692( ) ;
         standaloneModal1J91692( ) ;
         addRow1J91692( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDltLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1692 = (short)(nBlankRcdCount1692-1) ;
      }
      Gx_mode = sMode1692 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Grid4Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Grid4", Grid4Container, subGrid4_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid4ContainerData", Grid4Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid4ContainerData"+"V", Grid4Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid4ContainerData"+"V"+"\" value='"+Grid4Container.GridValuesHidden()+"'/>") ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 235,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDLT001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 236,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDLT001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 237,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDLT001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 238,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDLT001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 239,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDLT001.htm");
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
      e111J92 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z30AlbProCod = localUtil.ctol( httpContext.cgiGet( "Z30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z12176DltHdr = (int)(localUtil.ctol( httpContext.cgiGet( "Z12176DltHdr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12177DltR = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12177DltR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12178DltP = httpContext.cgiGet( "Z12178DltP") ;
            Z12145DltKgs = localUtil.ctond( httpContext.cgiGet( "Z12145DltKgs")) ;
            Z12146DltMts = localUtil.ctond( httpContext.cgiGet( "Z12146DltMts")) ;
            Z12147DltPzs = (int)(localUtil.ctol( httpContext.cgiGet( "Z12147DltPzs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12148DltBultos = (short)(localUtil.ctol( httpContext.cgiGet( "Z12148DltBultos"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12149DltTubos = (int)(localUtil.ctol( httpContext.cgiGet( "Z12149DltTubos"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12150DltArtCod = httpContext.cgiGet( "Z12150DltArtCod") ;
            Z12151DltArtDsc = httpContext.cgiGet( "Z12151DltArtDsc") ;
            Z12152DltColNom = httpContext.cgiGet( "Z12152DltColNom") ;
            Z12153DltColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z12153DltColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12154DltTc = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12154DltTc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12155DltColClNm = httpContext.cgiGet( "Z12155DltColClNm") ;
            Z12156DltColClNr = (int)(localUtil.ctol( httpContext.cgiGet( "Z12156DltColClNr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12157DltGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z12157DltGrm2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12158DltAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z12158DltAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12159DltAlbObs = httpContext.cgiGet( "Z12159DltAlbObs") ;
            Z12160DltUltTxt = (short)(localUtil.ctol( httpContext.cgiGet( "Z12160DltUltTxt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12161DltUltFs = (short)(localUtil.ctol( httpContext.cgiGet( "Z12161DltUltFs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12162DltEncCli = httpContext.cgiGet( "Z12162DltEncCli") ;
            Z12163DltPreKg = localUtil.ctond( httpContext.cgiGet( "Z12163DltPreKg")) ;
            Z12164DltPreMt = localUtil.ctond( httpContext.cgiGet( "Z12164DltPreMt")) ;
            Z12186DltKgsCli = localUtil.ctond( httpContext.cgiGet( "Z12186DltKgsCli")) ;
            Z12187DltTubo = (short)(localUtil.ctol( httpContext.cgiGet( "Z12187DltTubo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12188DltTuboN = httpContext.cgiGet( "Z12188DltTuboN") ;
            Z12287DltModCod = httpContext.cgiGet( "Z12287DltModCod") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_170 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_170"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            nRC_GXsfl_186 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_186"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            nRC_GXsfl_222 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_222"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPROCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A30AlbProCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            }
            else
            {
               A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            }
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDltHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDltHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DLTHDR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDltHdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12176DltHdr = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A12176DltHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12176DltHdr), 8, 0));
            }
            else
            {
               A12176DltHdr = (int)(localUtil.ctol( httpContext.cgiGet( edtDltHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12176DltHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12176DltHdr), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDltR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDltR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DLTR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDltR_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12177DltR = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12177DltR", GXutil.str( A12177DltR, 1, 0));
            }
            else
            {
               A12177DltR = (byte)(localUtil.ctol( httpContext.cgiGet( edtDltR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12177DltR", GXutil.str( A12177DltR, 1, 0));
            }
            A12178DltP = httpContext.cgiGet( edtDltP_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12178DltP", A12178DltP);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDltKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltKgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DLTKGS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDltKgs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12145DltKgs = DecimalUtil.ZERO ;
               n12145DltKgs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12145DltKgs", GXutil.ltrimstr( A12145DltKgs, 9, 2));
            }
            else
            {
               A12145DltKgs = localUtil.ctond( httpContext.cgiGet( edtDltKgs_Internalname)) ;
               n12145DltKgs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12145DltKgs", GXutil.ltrimstr( A12145DltKgs, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDltMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltMts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DLTMTS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDltMts_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12146DltMts = DecimalUtil.ZERO ;
               n12146DltMts = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12146DltMts", GXutil.ltrimstr( A12146DltMts, 9, 2));
            }
            else
            {
               A12146DltMts = localUtil.ctond( httpContext.cgiGet( edtDltMts_Internalname)) ;
               n12146DltMts = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12146DltMts", GXutil.ltrimstr( A12146DltMts, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDltPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDltPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DLTPZS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDltPzs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12147DltPzs = 0 ;
               n12147DltPzs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12147DltPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12147DltPzs), 6, 0));
            }
            else
            {
               A12147DltPzs = (int)(localUtil.ctol( httpContext.cgiGet( edtDltPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12147DltPzs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12147DltPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12147DltPzs), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDltBultos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDltBultos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DLTBULTOS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDltBultos_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12148DltBultos = (short)(0) ;
               n12148DltBultos = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12148DltBultos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12148DltBultos), 4, 0));
            }
            else
            {
               A12148DltBultos = (short)(localUtil.ctol( httpContext.cgiGet( edtDltBultos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12148DltBultos = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12148DltBultos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12148DltBultos), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDltTubos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDltTubos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DLTTUBOS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDltTubos_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12149DltTubos = 0 ;
               n12149DltTubos = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12149DltTubos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12149DltTubos), 6, 0));
            }
            else
            {
               A12149DltTubos = (int)(localUtil.ctol( httpContext.cgiGet( edtDltTubos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12149DltTubos = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12149DltTubos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12149DltTubos), 6, 0));
            }
            A12150DltArtCod = httpContext.cgiGet( edtDltArtCod_Internalname) ;
            n12150DltArtCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12150DltArtCod", A12150DltArtCod);
            A12151DltArtDsc = httpContext.cgiGet( edtDltArtDsc_Internalname) ;
            n12151DltArtDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12151DltArtDsc", A12151DltArtDsc);
            A12152DltColNom = httpContext.cgiGet( edtDltColNom_Internalname) ;
            n12152DltColNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12152DltColNom", A12152DltColNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDltColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDltColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DLTCOLNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDltColNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12153DltColNum = 0 ;
               n12153DltColNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12153DltColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12153DltColNum), 6, 0));
            }
            else
            {
               A12153DltColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtDltColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12153DltColNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12153DltColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12153DltColNum), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDltTc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDltTc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DLTTC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDltTc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12154DltTc = (byte)(0) ;
               n12154DltTc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12154DltTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12154DltTc), 2, 0));
            }
            else
            {
               A12154DltTc = (byte)(localUtil.ctol( httpContext.cgiGet( edtDltTc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12154DltTc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12154DltTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12154DltTc), 2, 0));
            }
            A12155DltColClNm = httpContext.cgiGet( edtDltColClNm_Internalname) ;
            n12155DltColClNm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12155DltColClNm", A12155DltColClNm);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDltColClNr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDltColClNr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DLTCOLCLNR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDltColClNr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12156DltColClNr = 0 ;
               n12156DltColClNr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12156DltColClNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12156DltColClNr), 6, 0));
            }
            else
            {
               A12156DltColClNr = (int)(localUtil.ctol( httpContext.cgiGet( edtDltColClNr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12156DltColClNr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12156DltColClNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12156DltColClNr), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDltGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDltGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DLTGRM2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDltGrm2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12157DltGrm2 = (short)(0) ;
               n12157DltGrm2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12157DltGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12157DltGrm2), 4, 0));
            }
            else
            {
               A12157DltGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDltGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12157DltGrm2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12157DltGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12157DltGrm2), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDltAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDltAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DLTANC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDltAnc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12158DltAnc = (short)(0) ;
               n12158DltAnc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12158DltAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12158DltAnc), 4, 0));
            }
            else
            {
               A12158DltAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtDltAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12158DltAnc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12158DltAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12158DltAnc), 4, 0));
            }
            A12159DltAlbObs = httpContext.cgiGet( edtDltAlbObs_Internalname) ;
            n12159DltAlbObs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12159DltAlbObs", A12159DltAlbObs);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDltUltTxt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDltUltTxt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DLTULTTXT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDltUltTxt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12160DltUltTxt = (short)(0) ;
               n12160DltUltTxt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12160DltUltTxt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12160DltUltTxt), 4, 0));
            }
            else
            {
               A12160DltUltTxt = (short)(localUtil.ctol( httpContext.cgiGet( edtDltUltTxt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12160DltUltTxt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12160DltUltTxt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12160DltUltTxt), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDltUltFs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDltUltFs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DLTULTFS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDltUltFs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12161DltUltFs = (short)(0) ;
               n12161DltUltFs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12161DltUltFs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12161DltUltFs), 4, 0));
            }
            else
            {
               A12161DltUltFs = (short)(localUtil.ctol( httpContext.cgiGet( edtDltUltFs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12161DltUltFs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12161DltUltFs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12161DltUltFs), 4, 0));
            }
            A12162DltEncCli = httpContext.cgiGet( edtDltEncCli_Internalname) ;
            n12162DltEncCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12162DltEncCli", A12162DltEncCli);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDltPreKg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltPreKg_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DLTPREKG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDltPreKg_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12163DltPreKg = DecimalUtil.ZERO ;
               n12163DltPreKg = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12163DltPreKg", GXutil.ltrimstr( A12163DltPreKg, 13, 5));
            }
            else
            {
               A12163DltPreKg = localUtil.ctond( httpContext.cgiGet( edtDltPreKg_Internalname)) ;
               n12163DltPreKg = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12163DltPreKg", GXutil.ltrimstr( A12163DltPreKg, 13, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDltPreMt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltPreMt_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DLTPREMT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDltPreMt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12164DltPreMt = DecimalUtil.ZERO ;
               n12164DltPreMt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12164DltPreMt", GXutil.ltrimstr( A12164DltPreMt, 13, 5));
            }
            else
            {
               A12164DltPreMt = localUtil.ctond( httpContext.cgiGet( edtDltPreMt_Internalname)) ;
               n12164DltPreMt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12164DltPreMt", GXutil.ltrimstr( A12164DltPreMt, 13, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDltKgsCli_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltKgsCli_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DLTKGSCLI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDltKgsCli_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12186DltKgsCli = DecimalUtil.ZERO ;
               n12186DltKgsCli = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12186DltKgsCli", GXutil.ltrimstr( A12186DltKgsCli, 9, 2));
            }
            else
            {
               A12186DltKgsCli = localUtil.ctond( httpContext.cgiGet( edtDltKgsCli_Internalname)) ;
               n12186DltKgsCli = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12186DltKgsCli", GXutil.ltrimstr( A12186DltKgsCli, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDltTubo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDltTubo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DLTTUBO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDltTubo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12187DltTubo = (short)(0) ;
               n12187DltTubo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12187DltTubo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12187DltTubo), 4, 0));
            }
            else
            {
               A12187DltTubo = (short)(localUtil.ctol( httpContext.cgiGet( edtDltTubo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12187DltTubo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12187DltTubo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12187DltTubo), 4, 0));
            }
            A12188DltTuboN = httpContext.cgiGet( edtDltTuboN_Internalname) ;
            n12188DltTuboN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12188DltTuboN", A12188DltTuboN);
            A12287DltModCod = httpContext.cgiGet( edtDltModCod_Internalname) ;
            n12287DltModCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12287DltModCod", A12287DltModCod);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            /* Check if conditions changed and reset current page numbers */
            /* Check if conditions changed and reset current page numbers */
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
               A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               A12176DltHdr = (int)(GXutil.lval( httpContext.GetPar( "DltHdr"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12176DltHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12176DltHdr), 8, 0));
               A12177DltR = (byte)(GXutil.lval( httpContext.GetPar( "DltR"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12177DltR", GXutil.str( A12177DltR, 1, 0));
               A12178DltP = httpContext.GetPar( "DltP") ;
               httpContext.ajax_rsp_assign_attri("", false, "A12178DltP", A12178DltP);
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
                        e111J92 ();
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
            initAll1J91688( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1689_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1689_Enabled), 5, 0), !bGXsfl_170_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1691_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1691_Enabled), 5, 0), !bGXsfl_213_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1692_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1692_Enabled), 5, 0), !bGXsfl_222_Refreshing);
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
      disableAttributes1J91688( ) ;
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

   public void confirm_1J90( )
   {
      beforeValidate1J91688( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1J91688( ) ;
         }
         else
         {
            checkExtendedTable1J91688( ) ;
            if ( AnyError == 0 )
            {
               zm1J91688( 2) ;
               zm1J91688( 3) ;
            }
            closeExtendedTableCursors1J91688( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1688 = Gx_mode ;
         confirm_1J91689( ) ;
         if ( AnyError == 0 )
         {
            confirm_1J91690( ) ;
            if ( AnyError == 0 )
            {
               confirm_1J91692( ) ;
               if ( AnyError == 0 )
               {
                  /* Restore parent mode. */
                  Gx_mode = sMode1688 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  IsConfirmed = (short)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
               }
            }
         }
         /* Restore parent mode. */
         Gx_mode = sMode1688 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1J90( ) ;
      }
   }

   public void confirm_1J91692( )
   {
      nGXsfl_222_idx = 0 ;
      while ( nGXsfl_222_idx < nRC_GXsfl_222 )
      {
         readRow1J91692( ) ;
         if ( ( nRcdExists_1692 != 0 ) || ( nIsMod_1692 != 0 ) )
         {
            getKey1J91692( ) ;
            if ( ( nRcdExists_1692 == 0 ) && ( nRcdDeleted_1692 == 0 ) )
            {
               if ( RcdFound1692 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1J91692( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1J91692( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1J91692( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "DLTLIN_" + sGXsfl_222_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDltLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1692 != 0 )
               {
                  if ( nRcdDeleted_1692 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1J91692( ) ;
                     load1J91692( ) ;
                     beforeValidate1J91692( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1J91692( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1692 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1J91692( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1J91692( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1J91692( ) ;
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
                  if ( nRcdDeleted_1692 == 0 )
                  {
                     GXCCtl = "DLTLIN_" + sGXsfl_222_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDltLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1692_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1692, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltLin_Internalname, GXutil.ltrim( localUtil.ntoc( A12182DltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltFascod_Internalname, GXutil.rtrim( A12172DltFascod)) ;
         httpContext.changePostValue( edtDltFasDsc_Internalname, GXutil.rtrim( A12173DltFasDsc)) ;
         httpContext.changePostValue( edtDltKgsFs_Internalname, GXutil.ltrim( localUtil.ntoc( A12174DltKgsFs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltMtsFs_Internalname, GXutil.ltrim( localUtil.ntoc( A12175DltMtsFs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltPrKFs_Internalname, GXutil.ltrim( localUtil.ntoc( A12189DltPrKFs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltPrMFs_Internalname, GXutil.ltrim( localUtil.ntoc( A12190DltPrMFs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltPrKBFs_Internalname, GXutil.ltrim( localUtil.ntoc( A12191DltPrKBFs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltPrMBFs_Internalname, GXutil.ltrim( localUtil.ntoc( A12192DltPrMBFs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12182DltLin_"+sGXsfl_222_idx, GXutil.ltrim( localUtil.ntoc( Z12182DltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12172DltFascod_"+sGXsfl_222_idx, GXutil.rtrim( Z12172DltFascod)) ;
         httpContext.changePostValue( "ZT_"+"Z12173DltFasDsc_"+sGXsfl_222_idx, GXutil.rtrim( Z12173DltFasDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z12174DltKgsFs_"+sGXsfl_222_idx, GXutil.ltrim( localUtil.ntoc( Z12174DltKgsFs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12175DltMtsFs_"+sGXsfl_222_idx, GXutil.ltrim( localUtil.ntoc( Z12175DltMtsFs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12189DltPrKFs_"+sGXsfl_222_idx, GXutil.ltrim( localUtil.ntoc( Z12189DltPrKFs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12190DltPrMFs_"+sGXsfl_222_idx, GXutil.ltrim( localUtil.ntoc( Z12190DltPrMFs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12191DltPrKBFs_"+sGXsfl_222_idx, GXutil.ltrim( localUtil.ntoc( Z12191DltPrKBFs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12192DltPrMBFs_"+sGXsfl_222_idx, GXutil.ltrim( localUtil.ntoc( Z12192DltPrMBFs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1692_"+sGXsfl_222_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1692, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1692_"+sGXsfl_222_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1692, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1692_"+sGXsfl_222_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1692, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1692 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1692_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1692_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTLIN_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTFASCOD_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltFascod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTFASDSC_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTKGSFS_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltKgsFs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTMTSFS_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltMtsFs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTPRKFS_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPrKFs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTPRMFS_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPrMFs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTPRKBFS_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPrKBFs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTPRMBFS_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPrMBFs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1J91691( )
   {
      nGXsfl_213_idx = 0 ;
      while ( nGXsfl_213_idx < nRC_GXsfl_213 )
      {
         readRow1J91691( ) ;
         if ( ( nRcdExists_1691 != 0 ) || ( nIsMod_1691 != 0 ) )
         {
            getKey1J91691( ) ;
            if ( ( nRcdExists_1691 == 0 ) && ( nRcdDeleted_1691 == 0 ) )
            {
               if ( RcdFound1691 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1J91691( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1J91691( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1J91691( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "DLTNPIEZA_" + sGXsfl_186_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDltNPieza_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1691 != 0 )
               {
                  if ( nRcdDeleted_1691 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1J91691( ) ;
                     load1J91691( ) ;
                     beforeValidate1J91691( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1J91691( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1691 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1J91691( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1J91691( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1J91691( ) ;
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
                  if ( nRcdDeleted_1691 == 0 )
                  {
                     GXCCtl = "DLTNPIEZA_" + sGXsfl_186_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDltNPieza_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1691_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1691, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltNTrozo_Internalname, GXutil.ltrim( localUtil.ntoc( A12181DltNTrozo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltKgsTrz_Internalname, GXutil.ltrim( localUtil.ntoc( A12169DltKgsTrz, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltMtsTrz_Internalname, GXutil.ltrim( localUtil.ntoc( A12170DltMtsTrz, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltAncTrz_Internalname, GXutil.ltrim( localUtil.ntoc( A12171DltAncTrz, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12181DltNTrozo_"+sGXsfl_213_idx, GXutil.ltrim( localUtil.ntoc( Z12181DltNTrozo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12169DltKgsTrz_"+sGXsfl_213_idx, GXutil.ltrim( localUtil.ntoc( Z12169DltKgsTrz, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12170DltMtsTrz_"+sGXsfl_213_idx, GXutil.ltrim( localUtil.ntoc( Z12170DltMtsTrz, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12171DltAncTrz_"+sGXsfl_213_idx, GXutil.ltrim( localUtil.ntoc( Z12171DltAncTrz, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1691_"+sGXsfl_213_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1691, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1691_"+sGXsfl_213_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1691, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1691_"+sGXsfl_213_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1691, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1691 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1691_"+sGXsfl_213_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1691_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTNTROZO_"+sGXsfl_213_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltNTrozo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTKGSTRZ_"+sGXsfl_213_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltKgsTrz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTMTSTRZ_"+sGXsfl_213_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltMtsTrz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTANCTRZ_"+sGXsfl_213_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltAncTrz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1J91690( )
   {
      nGXsfl_186_idx = 0 ;
      while ( nGXsfl_186_idx < nRC_GXsfl_186 )
      {
         readRow1J91690( ) ;
         if ( ( nRcdExists_1690 != 0 ) || ( nIsMod_1690 != 0 ) )
         {
            getKey1J91690( ) ;
            if ( ( nRcdExists_1690 == 0 ) && ( nRcdDeleted_1690 == 0 ) )
            {
               if ( RcdFound1690 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1J91690( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1J91690( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1J91690( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode1690 = Gx_mode ;
                        confirm_1J91691( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode1690 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode1690 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "DLTNPIEZA_" + sGXsfl_186_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDltNPieza_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1690 != 0 )
               {
                  if ( nRcdDeleted_1690 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1J91690( ) ;
                     load1J91690( ) ;
                     beforeValidate1J91690( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1J91690( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1690 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1J91690( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1J91690( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1J91690( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode1690 = Gx_mode ;
                              confirm_1J91691( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode1690 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode1690 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1690 == 0 )
                  {
                     GXCCtl = "DLTNPIEZA_" + sGXsfl_186_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDltNPieza_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtDltNPieza_Internalname, GXutil.rtrim( A12180DltNPieza)) ;
         httpContext.changePostValue( edtDltKgsPz_Internalname, GXutil.ltrim( localUtil.ntoc( A12166DltKgsPz, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltMtsPz_Internalname, GXutil.ltrim( localUtil.ntoc( A12167DltMtsPz, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltAncPz_Internalname, GXutil.ltrim( localUtil.ntoc( A12168DltAncPz, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12180DltNPieza_"+sGXsfl_186_idx, GXutil.rtrim( Z12180DltNPieza)) ;
         httpContext.changePostValue( "ZT_"+"Z12166DltKgsPz_"+sGXsfl_186_idx, GXutil.ltrim( localUtil.ntoc( Z12166DltKgsPz, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12167DltMtsPz_"+sGXsfl_186_idx, GXutil.ltrim( localUtil.ntoc( Z12167DltMtsPz, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12168DltAncPz_"+sGXsfl_186_idx, GXutil.ltrim( localUtil.ntoc( Z12168DltAncPz, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_213_"+sGXsfl_186_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_213, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1690_"+sGXsfl_186_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1690, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1690_"+sGXsfl_186_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1690, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1690_"+sGXsfl_186_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1690, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1690 != 0 )
         {
            httpContext.changePostValue( "DLTNPIEZA_"+sGXsfl_186_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltNPieza_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTKGSPZ_"+sGXsfl_186_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltKgsPz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTMTSPZ_"+sGXsfl_186_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltMtsPz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTANCPZ_"+sGXsfl_186_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltAncPz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1J91689( )
   {
      nGXsfl_170_idx = 0 ;
      while ( nGXsfl_170_idx < nRC_GXsfl_170 )
      {
         readRow1J91689( ) ;
         if ( ( nRcdExists_1689 != 0 ) || ( nIsMod_1689 != 0 ) )
         {
            getKey1J91689( ) ;
            if ( ( nRcdExists_1689 == 0 ) && ( nRcdDeleted_1689 == 0 ) )
            {
               if ( RcdFound1689 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1J91689( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1J91689( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1J91689( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "DLTLINTXT_" + sGXsfl_170_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDltLinTxt_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1689 != 0 )
               {
                  if ( nRcdDeleted_1689 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1J91689( ) ;
                     load1J91689( ) ;
                     beforeValidate1J91689( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1J91689( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1689 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1J91689( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1J91689( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1J91689( ) ;
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
                  if ( nRcdDeleted_1689 == 0 )
                  {
                     GXCCtl = "DLTLINTXT_" + sGXsfl_170_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDltLinTxt_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1689_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1689, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltLinTxt_Internalname, GXutil.ltrim( localUtil.ntoc( A12179DltLinTxt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltDsc_Internalname, GXutil.rtrim( A12165DltDsc)) ;
         httpContext.changePostValue( edtDltRD_Internalname, GXutil.ltrim( localUtil.ntoc( A12288DltRD, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltPKg_Internalname, GXutil.ltrim( localUtil.ntoc( A12289DltPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltKgsTxt_Internalname, GXutil.ltrim( localUtil.ntoc( A12291DltKgsTxt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltPMt_Internalname, GXutil.ltrim( localUtil.ntoc( A12290DltPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltMtsTxt_Internalname, GXutil.ltrim( localUtil.ntoc( A12292DltMtsTxt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltImpTxt_Internalname, GXutil.ltrim( localUtil.ntoc( A12293DltImpTxt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltTipTxt_Internalname, GXutil.rtrim( A12294DltTipTxt)) ;
         httpContext.changePostValue( edtDltCodTxt_Internalname, GXutil.rtrim( A12295DltCodTxt)) ;
         httpContext.changePostValue( edtDltPzsTxt_Internalname, GXutil.ltrim( localUtil.ntoc( A12296DltPzsTxt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12179DltLinTxt_"+sGXsfl_170_idx, GXutil.ltrim( localUtil.ntoc( Z12179DltLinTxt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12165DltDsc_"+sGXsfl_170_idx, GXutil.rtrim( Z12165DltDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z12288DltRD_"+sGXsfl_170_idx, GXutil.ltrim( localUtil.ntoc( Z12288DltRD, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12289DltPKg_"+sGXsfl_170_idx, GXutil.ltrim( localUtil.ntoc( Z12289DltPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12291DltKgsTxt_"+sGXsfl_170_idx, GXutil.ltrim( localUtil.ntoc( Z12291DltKgsTxt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12290DltPMt_"+sGXsfl_170_idx, GXutil.ltrim( localUtil.ntoc( Z12290DltPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12292DltMtsTxt_"+sGXsfl_170_idx, GXutil.ltrim( localUtil.ntoc( Z12292DltMtsTxt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12293DltImpTxt_"+sGXsfl_170_idx, GXutil.ltrim( localUtil.ntoc( Z12293DltImpTxt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12294DltTipTxt_"+sGXsfl_170_idx, GXutil.rtrim( Z12294DltTipTxt)) ;
         httpContext.changePostValue( "ZT_"+"Z12295DltCodTxt_"+sGXsfl_170_idx, GXutil.rtrim( Z12295DltCodTxt)) ;
         httpContext.changePostValue( "ZT_"+"Z12296DltPzsTxt_"+sGXsfl_170_idx, GXutil.ltrim( localUtil.ntoc( Z12296DltPzsTxt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1689_"+sGXsfl_170_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1689, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1689_"+sGXsfl_170_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1689, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1689_"+sGXsfl_170_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1689, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1689 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1689_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1689_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTLINTXT_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltLinTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTDSC_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTRD_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltRD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTPKG_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPKg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTKGSTXT_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltKgsTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTPMT_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPMt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTMTSTXT_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltMtsTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTIMPTXT_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltImpTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTTIPTXT_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltTipTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTCODTXT_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltCodTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTPZSTXT_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPzsTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1J90( )
   {
   }

   public void e111J92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tdlt001_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tdlt001_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tdlt001_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdlt001_impl.this.A396EmprCod = GXv_char2[0] ;
      tdlt001_impl.this.AV11EmprNom = GXv_char3[0] ;
      tdlt001_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1J91688( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12145DltKgs = T01J911_A12145DltKgs[0] ;
            Z12146DltMts = T01J911_A12146DltMts[0] ;
            Z12147DltPzs = T01J911_A12147DltPzs[0] ;
            Z12148DltBultos = T01J911_A12148DltBultos[0] ;
            Z12149DltTubos = T01J911_A12149DltTubos[0] ;
            Z12150DltArtCod = T01J911_A12150DltArtCod[0] ;
            Z12151DltArtDsc = T01J911_A12151DltArtDsc[0] ;
            Z12152DltColNom = T01J911_A12152DltColNom[0] ;
            Z12153DltColNum = T01J911_A12153DltColNum[0] ;
            Z12154DltTc = T01J911_A12154DltTc[0] ;
            Z12155DltColClNm = T01J911_A12155DltColClNm[0] ;
            Z12156DltColClNr = T01J911_A12156DltColClNr[0] ;
            Z12157DltGrm2 = T01J911_A12157DltGrm2[0] ;
            Z12158DltAnc = T01J911_A12158DltAnc[0] ;
            Z12159DltAlbObs = T01J911_A12159DltAlbObs[0] ;
            Z12160DltUltTxt = T01J911_A12160DltUltTxt[0] ;
            Z12161DltUltFs = T01J911_A12161DltUltFs[0] ;
            Z12162DltEncCli = T01J911_A12162DltEncCli[0] ;
            Z12163DltPreKg = T01J911_A12163DltPreKg[0] ;
            Z12164DltPreMt = T01J911_A12164DltPreMt[0] ;
            Z12186DltKgsCli = T01J911_A12186DltKgsCli[0] ;
            Z12187DltTubo = T01J911_A12187DltTubo[0] ;
            Z12188DltTuboN = T01J911_A12188DltTuboN[0] ;
            Z12287DltModCod = T01J911_A12287DltModCod[0] ;
         }
         else
         {
            Z12145DltKgs = A12145DltKgs ;
            Z12146DltMts = A12146DltMts ;
            Z12147DltPzs = A12147DltPzs ;
            Z12148DltBultos = A12148DltBultos ;
            Z12149DltTubos = A12149DltTubos ;
            Z12150DltArtCod = A12150DltArtCod ;
            Z12151DltArtDsc = A12151DltArtDsc ;
            Z12152DltColNom = A12152DltColNom ;
            Z12153DltColNum = A12153DltColNum ;
            Z12154DltTc = A12154DltTc ;
            Z12155DltColClNm = A12155DltColClNm ;
            Z12156DltColClNr = A12156DltColClNr ;
            Z12157DltGrm2 = A12157DltGrm2 ;
            Z12158DltAnc = A12158DltAnc ;
            Z12159DltAlbObs = A12159DltAlbObs ;
            Z12160DltUltTxt = A12160DltUltTxt ;
            Z12161DltUltFs = A12161DltUltFs ;
            Z12162DltEncCli = A12162DltEncCli ;
            Z12163DltPreKg = A12163DltPreKg ;
            Z12164DltPreMt = A12164DltPreMt ;
            Z12186DltKgsCli = A12186DltKgsCli ;
            Z12187DltTubo = A12187DltTubo ;
            Z12188DltTuboN = A12188DltTuboN ;
            Z12287DltModCod = A12287DltModCod ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z12176DltHdr = A12176DltHdr ;
         Z12177DltR = A12177DltR ;
         Z12178DltP = A12178DltP ;
         Z12145DltKgs = A12145DltKgs ;
         Z12146DltMts = A12146DltMts ;
         Z12147DltPzs = A12147DltPzs ;
         Z12148DltBultos = A12148DltBultos ;
         Z12149DltTubos = A12149DltTubos ;
         Z12150DltArtCod = A12150DltArtCod ;
         Z12151DltArtDsc = A12151DltArtDsc ;
         Z12152DltColNom = A12152DltColNom ;
         Z12153DltColNum = A12153DltColNum ;
         Z12154DltTc = A12154DltTc ;
         Z12155DltColClNm = A12155DltColClNm ;
         Z12156DltColClNr = A12156DltColClNr ;
         Z12157DltGrm2 = A12157DltGrm2 ;
         Z12158DltAnc = A12158DltAnc ;
         Z12159DltAlbObs = A12159DltAlbObs ;
         Z12160DltUltTxt = A12160DltUltTxt ;
         Z12161DltUltFs = A12161DltUltFs ;
         Z12162DltEncCli = A12162DltEncCli ;
         Z12163DltPreKg = A12163DltPreKg ;
         Z12164DltPreMt = A12164DltPreMt ;
         Z12186DltKgsCli = A12186DltKgsCli ;
         Z12187DltTubo = A12187DltTubo ;
         Z12188DltTuboN = A12188DltTuboN ;
         Z12287DltModCod = A12287DltModCod ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TDLT001" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      /* Using cursor T01J912 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01J912_A407EmprNom[0] ;
      n407EmprNom = T01J912_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(10);
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

   public void load1J91688( )
   {
      /* Using cursor T01J914 */
      pr_default.execute(12, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1688 = (short)(1) ;
         A407EmprNom = T01J914_A407EmprNom[0] ;
         n407EmprNom = T01J914_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A12145DltKgs = T01J914_A12145DltKgs[0] ;
         n12145DltKgs = T01J914_n12145DltKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12145DltKgs", GXutil.ltrimstr( A12145DltKgs, 9, 2));
         A12146DltMts = T01J914_A12146DltMts[0] ;
         n12146DltMts = T01J914_n12146DltMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12146DltMts", GXutil.ltrimstr( A12146DltMts, 9, 2));
         A12147DltPzs = T01J914_A12147DltPzs[0] ;
         n12147DltPzs = T01J914_n12147DltPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12147DltPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12147DltPzs), 6, 0));
         A12148DltBultos = T01J914_A12148DltBultos[0] ;
         n12148DltBultos = T01J914_n12148DltBultos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12148DltBultos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12148DltBultos), 4, 0));
         A12149DltTubos = T01J914_A12149DltTubos[0] ;
         n12149DltTubos = T01J914_n12149DltTubos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12149DltTubos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12149DltTubos), 6, 0));
         A12150DltArtCod = T01J914_A12150DltArtCod[0] ;
         n12150DltArtCod = T01J914_n12150DltArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12150DltArtCod", A12150DltArtCod);
         A12151DltArtDsc = T01J914_A12151DltArtDsc[0] ;
         n12151DltArtDsc = T01J914_n12151DltArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12151DltArtDsc", A12151DltArtDsc);
         A12152DltColNom = T01J914_A12152DltColNom[0] ;
         n12152DltColNom = T01J914_n12152DltColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12152DltColNom", A12152DltColNom);
         A12153DltColNum = T01J914_A12153DltColNum[0] ;
         n12153DltColNum = T01J914_n12153DltColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12153DltColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12153DltColNum), 6, 0));
         A12154DltTc = T01J914_A12154DltTc[0] ;
         n12154DltTc = T01J914_n12154DltTc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12154DltTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12154DltTc), 2, 0));
         A12155DltColClNm = T01J914_A12155DltColClNm[0] ;
         n12155DltColClNm = T01J914_n12155DltColClNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12155DltColClNm", A12155DltColClNm);
         A12156DltColClNr = T01J914_A12156DltColClNr[0] ;
         n12156DltColClNr = T01J914_n12156DltColClNr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12156DltColClNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12156DltColClNr), 6, 0));
         A12157DltGrm2 = T01J914_A12157DltGrm2[0] ;
         n12157DltGrm2 = T01J914_n12157DltGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12157DltGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12157DltGrm2), 4, 0));
         A12158DltAnc = T01J914_A12158DltAnc[0] ;
         n12158DltAnc = T01J914_n12158DltAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12158DltAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12158DltAnc), 4, 0));
         A12159DltAlbObs = T01J914_A12159DltAlbObs[0] ;
         n12159DltAlbObs = T01J914_n12159DltAlbObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12159DltAlbObs", A12159DltAlbObs);
         A12160DltUltTxt = T01J914_A12160DltUltTxt[0] ;
         n12160DltUltTxt = T01J914_n12160DltUltTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12160DltUltTxt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12160DltUltTxt), 4, 0));
         A12161DltUltFs = T01J914_A12161DltUltFs[0] ;
         n12161DltUltFs = T01J914_n12161DltUltFs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12161DltUltFs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12161DltUltFs), 4, 0));
         A12162DltEncCli = T01J914_A12162DltEncCli[0] ;
         n12162DltEncCli = T01J914_n12162DltEncCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12162DltEncCli", A12162DltEncCli);
         A12163DltPreKg = T01J914_A12163DltPreKg[0] ;
         n12163DltPreKg = T01J914_n12163DltPreKg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12163DltPreKg", GXutil.ltrimstr( A12163DltPreKg, 13, 5));
         A12164DltPreMt = T01J914_A12164DltPreMt[0] ;
         n12164DltPreMt = T01J914_n12164DltPreMt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12164DltPreMt", GXutil.ltrimstr( A12164DltPreMt, 13, 5));
         A12186DltKgsCli = T01J914_A12186DltKgsCli[0] ;
         n12186DltKgsCli = T01J914_n12186DltKgsCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12186DltKgsCli", GXutil.ltrimstr( A12186DltKgsCli, 9, 2));
         A12187DltTubo = T01J914_A12187DltTubo[0] ;
         n12187DltTubo = T01J914_n12187DltTubo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12187DltTubo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12187DltTubo), 4, 0));
         A12188DltTuboN = T01J914_A12188DltTuboN[0] ;
         n12188DltTuboN = T01J914_n12188DltTuboN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12188DltTuboN", A12188DltTuboN);
         A12287DltModCod = T01J914_A12287DltModCod[0] ;
         n12287DltModCod = T01J914_n12287DltModCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12287DltModCod", A12287DltModCod);
         zm1J91688( -1) ;
      }
      pr_default.close(12);
      onLoadActions1J91688( ) ;
   }

   public void onLoadActions1J91688( )
   {
   }

   public void checkExtendedTable1J91688( )
   {
      nIsDirty_1688 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01J913 */
      pr_default.execute(11, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(11);
   }

   public void closeExtendedTableCursors1J91688( )
   {
      pr_default.close(11);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         long A30AlbProCod )
   {
      /* Using cursor T01J915 */
      pr_default.execute(13, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void getKey1J91688( )
   {
      /* Using cursor T01J916 */
      pr_default.execute(14, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1688 = (short)(1) ;
      }
      else
      {
         RcdFound1688 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01J911 */
      pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP});
      if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01J911_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1J91688( 1) ;
         RcdFound1688 = (short)(1) ;
         A12176DltHdr = T01J911_A12176DltHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12176DltHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12176DltHdr), 8, 0));
         A12177DltR = T01J911_A12177DltR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12177DltR", GXutil.str( A12177DltR, 1, 0));
         A12178DltP = T01J911_A12178DltP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12178DltP", A12178DltP);
         A12145DltKgs = T01J911_A12145DltKgs[0] ;
         n12145DltKgs = T01J911_n12145DltKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12145DltKgs", GXutil.ltrimstr( A12145DltKgs, 9, 2));
         A12146DltMts = T01J911_A12146DltMts[0] ;
         n12146DltMts = T01J911_n12146DltMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12146DltMts", GXutil.ltrimstr( A12146DltMts, 9, 2));
         A12147DltPzs = T01J911_A12147DltPzs[0] ;
         n12147DltPzs = T01J911_n12147DltPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12147DltPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12147DltPzs), 6, 0));
         A12148DltBultos = T01J911_A12148DltBultos[0] ;
         n12148DltBultos = T01J911_n12148DltBultos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12148DltBultos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12148DltBultos), 4, 0));
         A12149DltTubos = T01J911_A12149DltTubos[0] ;
         n12149DltTubos = T01J911_n12149DltTubos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12149DltTubos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12149DltTubos), 6, 0));
         A12150DltArtCod = T01J911_A12150DltArtCod[0] ;
         n12150DltArtCod = T01J911_n12150DltArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12150DltArtCod", A12150DltArtCod);
         A12151DltArtDsc = T01J911_A12151DltArtDsc[0] ;
         n12151DltArtDsc = T01J911_n12151DltArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12151DltArtDsc", A12151DltArtDsc);
         A12152DltColNom = T01J911_A12152DltColNom[0] ;
         n12152DltColNom = T01J911_n12152DltColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12152DltColNom", A12152DltColNom);
         A12153DltColNum = T01J911_A12153DltColNum[0] ;
         n12153DltColNum = T01J911_n12153DltColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12153DltColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12153DltColNum), 6, 0));
         A12154DltTc = T01J911_A12154DltTc[0] ;
         n12154DltTc = T01J911_n12154DltTc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12154DltTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12154DltTc), 2, 0));
         A12155DltColClNm = T01J911_A12155DltColClNm[0] ;
         n12155DltColClNm = T01J911_n12155DltColClNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12155DltColClNm", A12155DltColClNm);
         A12156DltColClNr = T01J911_A12156DltColClNr[0] ;
         n12156DltColClNr = T01J911_n12156DltColClNr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12156DltColClNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12156DltColClNr), 6, 0));
         A12157DltGrm2 = T01J911_A12157DltGrm2[0] ;
         n12157DltGrm2 = T01J911_n12157DltGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12157DltGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12157DltGrm2), 4, 0));
         A12158DltAnc = T01J911_A12158DltAnc[0] ;
         n12158DltAnc = T01J911_n12158DltAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12158DltAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12158DltAnc), 4, 0));
         A12159DltAlbObs = T01J911_A12159DltAlbObs[0] ;
         n12159DltAlbObs = T01J911_n12159DltAlbObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12159DltAlbObs", A12159DltAlbObs);
         A12160DltUltTxt = T01J911_A12160DltUltTxt[0] ;
         n12160DltUltTxt = T01J911_n12160DltUltTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12160DltUltTxt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12160DltUltTxt), 4, 0));
         A12161DltUltFs = T01J911_A12161DltUltFs[0] ;
         n12161DltUltFs = T01J911_n12161DltUltFs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12161DltUltFs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12161DltUltFs), 4, 0));
         A12162DltEncCli = T01J911_A12162DltEncCli[0] ;
         n12162DltEncCli = T01J911_n12162DltEncCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12162DltEncCli", A12162DltEncCli);
         A12163DltPreKg = T01J911_A12163DltPreKg[0] ;
         n12163DltPreKg = T01J911_n12163DltPreKg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12163DltPreKg", GXutil.ltrimstr( A12163DltPreKg, 13, 5));
         A12164DltPreMt = T01J911_A12164DltPreMt[0] ;
         n12164DltPreMt = T01J911_n12164DltPreMt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12164DltPreMt", GXutil.ltrimstr( A12164DltPreMt, 13, 5));
         A12186DltKgsCli = T01J911_A12186DltKgsCli[0] ;
         n12186DltKgsCli = T01J911_n12186DltKgsCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12186DltKgsCli", GXutil.ltrimstr( A12186DltKgsCli, 9, 2));
         A12187DltTubo = T01J911_A12187DltTubo[0] ;
         n12187DltTubo = T01J911_n12187DltTubo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12187DltTubo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12187DltTubo), 4, 0));
         A12188DltTuboN = T01J911_A12188DltTuboN[0] ;
         n12188DltTuboN = T01J911_n12188DltTuboN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12188DltTuboN", A12188DltTuboN);
         A12287DltModCod = T01J911_A12287DltModCod[0] ;
         n12287DltModCod = T01J911_n12287DltModCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12287DltModCod", A12287DltModCod);
         A30AlbProCod = T01J911_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z12176DltHdr = A12176DltHdr ;
         Z12177DltR = A12177DltR ;
         Z12178DltP = A12178DltP ;
         sMode1688 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1J91688( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1688 = (short)(0) ;
            initializeNonKey1J91688( ) ;
         }
         Gx_mode = sMode1688 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1688 = (short)(0) ;
         initializeNonKey1J91688( ) ;
         sMode1688 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1688 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(9);
   }

   public void getEqualNoModal( )
   {
      getKey1J91688( ) ;
      if ( RcdFound1688 == 0 )
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
      RcdFound1688 = (short)(0) ;
      /* Using cursor T01J917 */
      pr_default.execute(15, new Object[] {Long.valueOf(A30AlbProCod), Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Integer.valueOf(A12176DltHdr), Long.valueOf(A30AlbProCod), Byte.valueOf(A12177DltR), Byte.valueOf(A12177DltR), Integer.valueOf(A12176DltHdr), Long.valueOf(A30AlbProCod), A12178DltP, A396EmprCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( T01J917_A30AlbProCod[0] < A30AlbProCod ) || ( T01J917_A30AlbProCod[0] == A30AlbProCod ) && ( T01J917_A12176DltHdr[0] < A12176DltHdr ) || ( T01J917_A12176DltHdr[0] == A12176DltHdr ) && ( T01J917_A30AlbProCod[0] == A30AlbProCod ) && ( T01J917_A12177DltR[0] < A12177DltR ) || ( T01J917_A12177DltR[0] == A12177DltR ) && ( T01J917_A12176DltHdr[0] == A12176DltHdr ) && ( T01J917_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T01J917_A12178DltP[0], A12178DltP) < 0 ) ) && ( GXutil.strcmp(T01J917_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( T01J917_A30AlbProCod[0] > A30AlbProCod ) || ( T01J917_A30AlbProCod[0] == A30AlbProCod ) && ( T01J917_A12176DltHdr[0] > A12176DltHdr ) || ( T01J917_A12176DltHdr[0] == A12176DltHdr ) && ( T01J917_A30AlbProCod[0] == A30AlbProCod ) && ( T01J917_A12177DltR[0] > A12177DltR ) || ( T01J917_A12177DltR[0] == A12177DltR ) && ( T01J917_A12176DltHdr[0] == A12176DltHdr ) && ( T01J917_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T01J917_A12178DltP[0], A12178DltP) > 0 ) ) && ( GXutil.strcmp(T01J917_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A30AlbProCod = T01J917_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            A12176DltHdr = T01J917_A12176DltHdr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12176DltHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12176DltHdr), 8, 0));
            A12177DltR = T01J917_A12177DltR[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12177DltR", GXutil.str( A12177DltR, 1, 0));
            A12178DltP = T01J917_A12178DltP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12178DltP", A12178DltP);
            RcdFound1688 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void move_previous( )
   {
      RcdFound1688 = (short)(0) ;
      /* Using cursor T01J918 */
      pr_default.execute(16, new Object[] {Long.valueOf(A30AlbProCod), Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Integer.valueOf(A12176DltHdr), Long.valueOf(A30AlbProCod), Byte.valueOf(A12177DltR), Byte.valueOf(A12177DltR), Integer.valueOf(A12176DltHdr), Long.valueOf(A30AlbProCod), A12178DltP, A396EmprCod});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( T01J918_A30AlbProCod[0] > A30AlbProCod ) || ( T01J918_A30AlbProCod[0] == A30AlbProCod ) && ( T01J918_A12176DltHdr[0] > A12176DltHdr ) || ( T01J918_A12176DltHdr[0] == A12176DltHdr ) && ( T01J918_A30AlbProCod[0] == A30AlbProCod ) && ( T01J918_A12177DltR[0] > A12177DltR ) || ( T01J918_A12177DltR[0] == A12177DltR ) && ( T01J918_A12176DltHdr[0] == A12176DltHdr ) && ( T01J918_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T01J918_A12178DltP[0], A12178DltP) > 0 ) ) && ( GXutil.strcmp(T01J918_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( T01J918_A30AlbProCod[0] < A30AlbProCod ) || ( T01J918_A30AlbProCod[0] == A30AlbProCod ) && ( T01J918_A12176DltHdr[0] < A12176DltHdr ) || ( T01J918_A12176DltHdr[0] == A12176DltHdr ) && ( T01J918_A30AlbProCod[0] == A30AlbProCod ) && ( T01J918_A12177DltR[0] < A12177DltR ) || ( T01J918_A12177DltR[0] == A12177DltR ) && ( T01J918_A12176DltHdr[0] == A12176DltHdr ) && ( T01J918_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T01J918_A12178DltP[0], A12178DltP) < 0 ) ) && ( GXutil.strcmp(T01J918_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A30AlbProCod = T01J918_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            A12176DltHdr = T01J918_A12176DltHdr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12176DltHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12176DltHdr), 8, 0));
            A12177DltR = T01J918_A12177DltR[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12177DltR", GXutil.str( A12177DltR, 1, 0));
            A12178DltP = T01J918_A12178DltP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12178DltP", A12178DltP);
            RcdFound1688 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1J91688( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAlbProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1J91688( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1688 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A12176DltHdr != Z12176DltHdr ) || ( A12177DltR != Z12177DltR ) || ( GXutil.strcmp(A12178DltP, Z12178DltP) != 0 ) )
            {
               A30AlbProCod = Z30AlbProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               A12176DltHdr = Z12176DltHdr ;
               httpContext.ajax_rsp_assign_attri("", false, "A12176DltHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12176DltHdr), 8, 0));
               A12177DltR = Z12177DltR ;
               httpContext.ajax_rsp_assign_attri("", false, "A12177DltR", GXutil.str( A12177DltR, 1, 0));
               A12178DltP = Z12178DltP ;
               httpContext.ajax_rsp_assign_attri("", false, "A12178DltP", A12178DltP);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAlbProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1J91688( ) ;
               GX_FocusControl = edtAlbProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A12176DltHdr != Z12176DltHdr ) || ( A12177DltR != Z12177DltR ) || ( GXutil.strcmp(A12178DltP, Z12178DltP) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtAlbProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1J91688( ) ;
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
                  GX_FocusControl = edtAlbProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1J91688( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A12176DltHdr != Z12176DltHdr ) || ( A12177DltR != Z12177DltR ) || ( GXutil.strcmp(A12178DltP, Z12178DltP) != 0 ) )
      {
         A30AlbProCod = Z30AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A12176DltHdr = Z12176DltHdr ;
         httpContext.ajax_rsp_assign_attri("", false, "A12176DltHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12176DltHdr), 8, 0));
         A12177DltR = Z12177DltR ;
         httpContext.ajax_rsp_assign_attri("", false, "A12177DltR", GXutil.str( A12177DltR, 1, 0));
         A12178DltP = Z12178DltP ;
         httpContext.ajax_rsp_assign_attri("", false, "A12178DltP", A12178DltP);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAlbProCod_Internalname ;
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
      getKey1J91688( ) ;
      if ( RcdFound1688 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A12176DltHdr != Z12176DltHdr ) || ( A12177DltR != Z12177DltR ) || ( GXutil.strcmp(A12178DltP, Z12178DltP) != 0 ) )
         {
            A30AlbProCod = Z30AlbProCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            A12176DltHdr = Z12176DltHdr ;
            httpContext.ajax_rsp_assign_attri("", false, "A12176DltHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12176DltHdr), 8, 0));
            A12177DltR = Z12177DltR ;
            httpContext.ajax_rsp_assign_attri("", false, "A12177DltR", GXutil.str( A12177DltR, 1, 0));
            A12178DltP = Z12178DltP ;
            httpContext.ajax_rsp_assign_attri("", false, "A12178DltP", A12178DltP);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A12176DltHdr != Z12176DltHdr ) || ( A12177DltR != Z12177DltR ) || ( GXutil.strcmp(A12178DltP, Z12178DltP) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdlt001");
      GX_FocusControl = edtDltKgs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1J90( ) ;
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
      if ( RcdFound1688 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtDltKgs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1J91688( ) ;
      if ( RcdFound1688 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDltKgs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1J91688( ) ;
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
      if ( RcdFound1688 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDltKgs_Internalname ;
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
      if ( RcdFound1688 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDltKgs_Internalname ;
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
      scanStart1J91688( ) ;
      if ( RcdFound1688 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1688 != 0 )
         {
            scanNext1J91688( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDltKgs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1J91688( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1J91688( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01J910 */
         pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP});
         if ( (pr_default.getStatus(8) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDLT001"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(8) == 101) || ( DecimalUtil.compareTo(Z12145DltKgs, T01J910_A12145DltKgs[0]) != 0 ) || ( DecimalUtil.compareTo(Z12146DltMts, T01J910_A12146DltMts[0]) != 0 ) || ( Z12147DltPzs != T01J910_A12147DltPzs[0] ) || ( Z12148DltBultos != T01J910_A12148DltBultos[0] ) || ( Z12149DltTubos != T01J910_A12149DltTubos[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12150DltArtCod, T01J910_A12150DltArtCod[0]) != 0 ) || ( GXutil.strcmp(Z12151DltArtDsc, T01J910_A12151DltArtDsc[0]) != 0 ) || ( GXutil.strcmp(Z12152DltColNom, T01J910_A12152DltColNom[0]) != 0 ) || ( Z12153DltColNum != T01J910_A12153DltColNum[0] ) || ( Z12154DltTc != T01J910_A12154DltTc[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12155DltColClNm, T01J910_A12155DltColClNm[0]) != 0 ) || ( Z12156DltColClNr != T01J910_A12156DltColClNr[0] ) || ( Z12157DltGrm2 != T01J910_A12157DltGrm2[0] ) || ( Z12158DltAnc != T01J910_A12158DltAnc[0] ) || ( GXutil.strcmp(Z12159DltAlbObs, T01J910_A12159DltAlbObs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12160DltUltTxt != T01J910_A12160DltUltTxt[0] ) || ( Z12161DltUltFs != T01J910_A12161DltUltFs[0] ) || ( GXutil.strcmp(Z12162DltEncCli, T01J910_A12162DltEncCli[0]) != 0 ) || ( DecimalUtil.compareTo(Z12163DltPreKg, T01J910_A12163DltPreKg[0]) != 0 ) || ( DecimalUtil.compareTo(Z12164DltPreMt, T01J910_A12164DltPreMt[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z12186DltKgsCli, T01J910_A12186DltKgsCli[0]) != 0 ) || ( Z12187DltTubo != T01J910_A12187DltTubo[0] ) || ( GXutil.strcmp(Z12188DltTuboN, T01J910_A12188DltTuboN[0]) != 0 ) || ( GXutil.strcmp(Z12287DltModCod, T01J910_A12287DltModCod[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z12145DltKgs, T01J910_A12145DltKgs[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltKgs");
               GXutil.writeLogRaw("Old: ",Z12145DltKgs);
               GXutil.writeLogRaw("Current: ",T01J910_A12145DltKgs[0]);
            }
            if ( DecimalUtil.compareTo(Z12146DltMts, T01J910_A12146DltMts[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltMts");
               GXutil.writeLogRaw("Old: ",Z12146DltMts);
               GXutil.writeLogRaw("Current: ",T01J910_A12146DltMts[0]);
            }
            if ( Z12147DltPzs != T01J910_A12147DltPzs[0] )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltPzs");
               GXutil.writeLogRaw("Old: ",Z12147DltPzs);
               GXutil.writeLogRaw("Current: ",T01J910_A12147DltPzs[0]);
            }
            if ( Z12148DltBultos != T01J910_A12148DltBultos[0] )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltBultos");
               GXutil.writeLogRaw("Old: ",Z12148DltBultos);
               GXutil.writeLogRaw("Current: ",T01J910_A12148DltBultos[0]);
            }
            if ( Z12149DltTubos != T01J910_A12149DltTubos[0] )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltTubos");
               GXutil.writeLogRaw("Old: ",Z12149DltTubos);
               GXutil.writeLogRaw("Current: ",T01J910_A12149DltTubos[0]);
            }
            if ( GXutil.strcmp(Z12150DltArtCod, T01J910_A12150DltArtCod[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltArtCod");
               GXutil.writeLogRaw("Old: ",Z12150DltArtCod);
               GXutil.writeLogRaw("Current: ",T01J910_A12150DltArtCod[0]);
            }
            if ( GXutil.strcmp(Z12151DltArtDsc, T01J910_A12151DltArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltArtDsc");
               GXutil.writeLogRaw("Old: ",Z12151DltArtDsc);
               GXutil.writeLogRaw("Current: ",T01J910_A12151DltArtDsc[0]);
            }
            if ( GXutil.strcmp(Z12152DltColNom, T01J910_A12152DltColNom[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltColNom");
               GXutil.writeLogRaw("Old: ",Z12152DltColNom);
               GXutil.writeLogRaw("Current: ",T01J910_A12152DltColNom[0]);
            }
            if ( Z12153DltColNum != T01J910_A12153DltColNum[0] )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltColNum");
               GXutil.writeLogRaw("Old: ",Z12153DltColNum);
               GXutil.writeLogRaw("Current: ",T01J910_A12153DltColNum[0]);
            }
            if ( Z12154DltTc != T01J910_A12154DltTc[0] )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltTc");
               GXutil.writeLogRaw("Old: ",Z12154DltTc);
               GXutil.writeLogRaw("Current: ",T01J910_A12154DltTc[0]);
            }
            if ( GXutil.strcmp(Z12155DltColClNm, T01J910_A12155DltColClNm[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltColClNm");
               GXutil.writeLogRaw("Old: ",Z12155DltColClNm);
               GXutil.writeLogRaw("Current: ",T01J910_A12155DltColClNm[0]);
            }
            if ( Z12156DltColClNr != T01J910_A12156DltColClNr[0] )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltColClNr");
               GXutil.writeLogRaw("Old: ",Z12156DltColClNr);
               GXutil.writeLogRaw("Current: ",T01J910_A12156DltColClNr[0]);
            }
            if ( Z12157DltGrm2 != T01J910_A12157DltGrm2[0] )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltGrm2");
               GXutil.writeLogRaw("Old: ",Z12157DltGrm2);
               GXutil.writeLogRaw("Current: ",T01J910_A12157DltGrm2[0]);
            }
            if ( Z12158DltAnc != T01J910_A12158DltAnc[0] )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltAnc");
               GXutil.writeLogRaw("Old: ",Z12158DltAnc);
               GXutil.writeLogRaw("Current: ",T01J910_A12158DltAnc[0]);
            }
            if ( GXutil.strcmp(Z12159DltAlbObs, T01J910_A12159DltAlbObs[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltAlbObs");
               GXutil.writeLogRaw("Old: ",Z12159DltAlbObs);
               GXutil.writeLogRaw("Current: ",T01J910_A12159DltAlbObs[0]);
            }
            if ( Z12160DltUltTxt != T01J910_A12160DltUltTxt[0] )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltUltTxt");
               GXutil.writeLogRaw("Old: ",Z12160DltUltTxt);
               GXutil.writeLogRaw("Current: ",T01J910_A12160DltUltTxt[0]);
            }
            if ( Z12161DltUltFs != T01J910_A12161DltUltFs[0] )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltUltFs");
               GXutil.writeLogRaw("Old: ",Z12161DltUltFs);
               GXutil.writeLogRaw("Current: ",T01J910_A12161DltUltFs[0]);
            }
            if ( GXutil.strcmp(Z12162DltEncCli, T01J910_A12162DltEncCli[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltEncCli");
               GXutil.writeLogRaw("Old: ",Z12162DltEncCli);
               GXutil.writeLogRaw("Current: ",T01J910_A12162DltEncCli[0]);
            }
            if ( DecimalUtil.compareTo(Z12163DltPreKg, T01J910_A12163DltPreKg[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltPreKg");
               GXutil.writeLogRaw("Old: ",Z12163DltPreKg);
               GXutil.writeLogRaw("Current: ",T01J910_A12163DltPreKg[0]);
            }
            if ( DecimalUtil.compareTo(Z12164DltPreMt, T01J910_A12164DltPreMt[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltPreMt");
               GXutil.writeLogRaw("Old: ",Z12164DltPreMt);
               GXutil.writeLogRaw("Current: ",T01J910_A12164DltPreMt[0]);
            }
            if ( DecimalUtil.compareTo(Z12186DltKgsCli, T01J910_A12186DltKgsCli[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltKgsCli");
               GXutil.writeLogRaw("Old: ",Z12186DltKgsCli);
               GXutil.writeLogRaw("Current: ",T01J910_A12186DltKgsCli[0]);
            }
            if ( Z12187DltTubo != T01J910_A12187DltTubo[0] )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltTubo");
               GXutil.writeLogRaw("Old: ",Z12187DltTubo);
               GXutil.writeLogRaw("Current: ",T01J910_A12187DltTubo[0]);
            }
            if ( GXutil.strcmp(Z12188DltTuboN, T01J910_A12188DltTuboN[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltTuboN");
               GXutil.writeLogRaw("Old: ",Z12188DltTuboN);
               GXutil.writeLogRaw("Current: ",T01J910_A12188DltTuboN[0]);
            }
            if ( GXutil.strcmp(Z12287DltModCod, T01J910_A12287DltModCod[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltModCod");
               GXutil.writeLogRaw("Old: ",Z12287DltModCod);
               GXutil.writeLogRaw("Current: ",T01J910_A12287DltModCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDLT001"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1J91688( )
   {
      beforeValidate1J91688( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J91688( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1J91688( 0) ;
         checkOptimisticConcurrency1J91688( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J91688( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1J91688( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01J919 */
                  pr_default.execute(17, new Object[] {Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, Boolean.valueOf(n12145DltKgs), A12145DltKgs, Boolean.valueOf(n12146DltMts), A12146DltMts, Boolean.valueOf(n12147DltPzs), Integer.valueOf(A12147DltPzs), Boolean.valueOf(n12148DltBultos), Short.valueOf(A12148DltBultos), Boolean.valueOf(n12149DltTubos), Integer.valueOf(A12149DltTubos), Boolean.valueOf(n12150DltArtCod), A12150DltArtCod, Boolean.valueOf(n12151DltArtDsc), A12151DltArtDsc, Boolean.valueOf(n12152DltColNom), A12152DltColNom, Boolean.valueOf(n12153DltColNum), Integer.valueOf(A12153DltColNum), Boolean.valueOf(n12154DltTc), Byte.valueOf(A12154DltTc), Boolean.valueOf(n12155DltColClNm), A12155DltColClNm, Boolean.valueOf(n12156DltColClNr), Integer.valueOf(A12156DltColClNr), Boolean.valueOf(n12157DltGrm2), Short.valueOf(A12157DltGrm2), Boolean.valueOf(n12158DltAnc), Short.valueOf(A12158DltAnc), Boolean.valueOf(n12159DltAlbObs), A12159DltAlbObs, Boolean.valueOf(n12160DltUltTxt), Short.valueOf(A12160DltUltTxt), Boolean.valueOf(n12161DltUltFs), Short.valueOf(A12161DltUltFs), Boolean.valueOf(n12162DltEncCli), A12162DltEncCli, Boolean.valueOf(n12163DltPreKg), A12163DltPreKg, Boolean.valueOf(n12164DltPreMt), A12164DltPreMt, Boolean.valueOf(n12186DltKgsCli), A12186DltKgsCli, Boolean.valueOf(n12187DltTubo), Short.valueOf(A12187DltTubo), Boolean.valueOf(n12188DltTuboN), A12188DltTuboN, Boolean.valueOf(n12287DltModCod), A12287DltModCod, A396EmprCod, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDLT001");
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
                        processLevel1J91688( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1J90( ) ;
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
            load1J91688( ) ;
         }
         endLevel1J91688( ) ;
      }
      closeExtendedTableCursors1J91688( ) ;
   }

   public void update1J91688( )
   {
      beforeValidate1J91688( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J91688( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J91688( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J91688( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1J91688( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01J920 */
                  pr_default.execute(18, new Object[] {Boolean.valueOf(n12145DltKgs), A12145DltKgs, Boolean.valueOf(n12146DltMts), A12146DltMts, Boolean.valueOf(n12147DltPzs), Integer.valueOf(A12147DltPzs), Boolean.valueOf(n12148DltBultos), Short.valueOf(A12148DltBultos), Boolean.valueOf(n12149DltTubos), Integer.valueOf(A12149DltTubos), Boolean.valueOf(n12150DltArtCod), A12150DltArtCod, Boolean.valueOf(n12151DltArtDsc), A12151DltArtDsc, Boolean.valueOf(n12152DltColNom), A12152DltColNom, Boolean.valueOf(n12153DltColNum), Integer.valueOf(A12153DltColNum), Boolean.valueOf(n12154DltTc), Byte.valueOf(A12154DltTc), Boolean.valueOf(n12155DltColClNm), A12155DltColClNm, Boolean.valueOf(n12156DltColClNr), Integer.valueOf(A12156DltColClNr), Boolean.valueOf(n12157DltGrm2), Short.valueOf(A12157DltGrm2), Boolean.valueOf(n12158DltAnc), Short.valueOf(A12158DltAnc), Boolean.valueOf(n12159DltAlbObs), A12159DltAlbObs, Boolean.valueOf(n12160DltUltTxt), Short.valueOf(A12160DltUltTxt), Boolean.valueOf(n12161DltUltFs), Short.valueOf(A12161DltUltFs), Boolean.valueOf(n12162DltEncCli), A12162DltEncCli, Boolean.valueOf(n12163DltPreKg), A12163DltPreKg, Boolean.valueOf(n12164DltPreMt), A12164DltPreMt, Boolean.valueOf(n12186DltKgsCli), A12186DltKgsCli, Boolean.valueOf(n12187DltTubo), Short.valueOf(A12187DltTubo), Boolean.valueOf(n12188DltTuboN), A12188DltTuboN, Boolean.valueOf(n12287DltModCod), A12287DltModCod, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDLT001");
                  if ( (pr_default.getStatus(18) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDLT001"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1J91688( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1J91688( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1J90( ) ;
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
         endLevel1J91688( ) ;
      }
      closeExtendedTableCursors1J91688( ) ;
   }

   public void deferredUpdate1J91688( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1J91688( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J91688( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1J91688( ) ;
         afterConfirm1J91688( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1J91688( ) ;
            if ( AnyError == 0 )
            {
               scanStart1J91692( ) ;
               while ( RcdFound1692 != 0 )
               {
                  getByPrimaryKey1J91692( ) ;
                  delete1J91692( ) ;
                  scanNext1J91692( ) ;
               }
               scanEnd1J91692( ) ;
               scanStart1J91689( ) ;
               while ( RcdFound1689 != 0 )
               {
                  getByPrimaryKey1J91689( ) ;
                  delete1J91689( ) ;
                  scanNext1J91689( ) ;
               }
               scanEnd1J91689( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01J921 */
                  pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDLT001");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1688 == 0 )
                        {
                           initAll1J91688( ) ;
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
                        resetCaption1J90( ) ;
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
      sMode1688 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1J91688( ) ;
      Gx_mode = sMode1688 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1J91688( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01J922 */
         pr_default.execute(20, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla Piezas ALBARAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
      }
   }

   public void processNestedLevel1J91689( )
   {
      nGXsfl_170_idx = 0 ;
      while ( nGXsfl_170_idx < nRC_GXsfl_170 )
      {
         readRow1J91689( ) ;
         if ( ( nRcdExists_1689 != 0 ) || ( nIsMod_1689 != 0 ) )
         {
            standaloneNotModal1J91689( ) ;
            getKey1J91689( ) ;
            if ( ( nRcdExists_1689 == 0 ) && ( nRcdDeleted_1689 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1J91689( ) ;
            }
            else
            {
               if ( RcdFound1689 != 0 )
               {
                  if ( ( nRcdDeleted_1689 != 0 ) && ( nRcdExists_1689 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1J91689( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1689 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1J91689( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1689 == 0 )
                  {
                     GXCCtl = "DLTLINTXT_" + sGXsfl_170_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDltLinTxt_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1689_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1689, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltLinTxt_Internalname, GXutil.ltrim( localUtil.ntoc( A12179DltLinTxt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltDsc_Internalname, GXutil.rtrim( A12165DltDsc)) ;
         httpContext.changePostValue( edtDltRD_Internalname, GXutil.ltrim( localUtil.ntoc( A12288DltRD, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltPKg_Internalname, GXutil.ltrim( localUtil.ntoc( A12289DltPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltKgsTxt_Internalname, GXutil.ltrim( localUtil.ntoc( A12291DltKgsTxt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltPMt_Internalname, GXutil.ltrim( localUtil.ntoc( A12290DltPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltMtsTxt_Internalname, GXutil.ltrim( localUtil.ntoc( A12292DltMtsTxt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltImpTxt_Internalname, GXutil.ltrim( localUtil.ntoc( A12293DltImpTxt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltTipTxt_Internalname, GXutil.rtrim( A12294DltTipTxt)) ;
         httpContext.changePostValue( edtDltCodTxt_Internalname, GXutil.rtrim( A12295DltCodTxt)) ;
         httpContext.changePostValue( edtDltPzsTxt_Internalname, GXutil.ltrim( localUtil.ntoc( A12296DltPzsTxt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12179DltLinTxt_"+sGXsfl_170_idx, GXutil.ltrim( localUtil.ntoc( Z12179DltLinTxt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12165DltDsc_"+sGXsfl_170_idx, GXutil.rtrim( Z12165DltDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z12288DltRD_"+sGXsfl_170_idx, GXutil.ltrim( localUtil.ntoc( Z12288DltRD, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12289DltPKg_"+sGXsfl_170_idx, GXutil.ltrim( localUtil.ntoc( Z12289DltPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12291DltKgsTxt_"+sGXsfl_170_idx, GXutil.ltrim( localUtil.ntoc( Z12291DltKgsTxt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12290DltPMt_"+sGXsfl_170_idx, GXutil.ltrim( localUtil.ntoc( Z12290DltPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12292DltMtsTxt_"+sGXsfl_170_idx, GXutil.ltrim( localUtil.ntoc( Z12292DltMtsTxt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12293DltImpTxt_"+sGXsfl_170_idx, GXutil.ltrim( localUtil.ntoc( Z12293DltImpTxt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12294DltTipTxt_"+sGXsfl_170_idx, GXutil.rtrim( Z12294DltTipTxt)) ;
         httpContext.changePostValue( "ZT_"+"Z12295DltCodTxt_"+sGXsfl_170_idx, GXutil.rtrim( Z12295DltCodTxt)) ;
         httpContext.changePostValue( "ZT_"+"Z12296DltPzsTxt_"+sGXsfl_170_idx, GXutil.ltrim( localUtil.ntoc( Z12296DltPzsTxt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1689_"+sGXsfl_170_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1689, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1689_"+sGXsfl_170_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1689, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1689_"+sGXsfl_170_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1689, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1689 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1689_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1689_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTLINTXT_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltLinTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTDSC_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTRD_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltRD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTPKG_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPKg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTKGSTXT_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltKgsTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTPMT_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPMt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTMTSTXT_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltMtsTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTIMPTXT_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltImpTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTTIPTXT_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltTipTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTCODTXT_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltCodTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTPZSTXT_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPzsTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1J91689( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1689 = (short)(0) ;
      nIsMod_1689 = (short)(0) ;
      nRcdDeleted_1689 = (short)(0) ;
   }

   public void processNestedLevel1J91690( )
   {
      nGXsfl_186_idx = 0 ;
      while ( nGXsfl_186_idx < nRC_GXsfl_186 )
      {
         readRow1J91690( ) ;
         if ( ( nRcdExists_1690 != 0 ) || ( nIsMod_1690 != 0 ) )
         {
            standaloneNotModal1J91690( ) ;
            getKey1J91690( ) ;
            if ( ( nRcdExists_1690 == 0 ) && ( nRcdDeleted_1690 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1J91690( ) ;
            }
            else
            {
               if ( RcdFound1690 != 0 )
               {
                  if ( ( nRcdDeleted_1690 != 0 ) && ( nRcdExists_1690 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1J91690( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1690 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1J91690( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1690 == 0 )
                  {
                     GXCCtl = "DLTNPIEZA_" + sGXsfl_186_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDltNPieza_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtDltNPieza_Internalname, GXutil.rtrim( A12180DltNPieza)) ;
         httpContext.changePostValue( edtDltKgsPz_Internalname, GXutil.ltrim( localUtil.ntoc( A12166DltKgsPz, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltMtsPz_Internalname, GXutil.ltrim( localUtil.ntoc( A12167DltMtsPz, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltAncPz_Internalname, GXutil.ltrim( localUtil.ntoc( A12168DltAncPz, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12180DltNPieza_"+sGXsfl_186_idx, GXutil.rtrim( Z12180DltNPieza)) ;
         httpContext.changePostValue( "ZT_"+"Z12166DltKgsPz_"+sGXsfl_186_idx, GXutil.ltrim( localUtil.ntoc( Z12166DltKgsPz, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12167DltMtsPz_"+sGXsfl_186_idx, GXutil.ltrim( localUtil.ntoc( Z12167DltMtsPz, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12168DltAncPz_"+sGXsfl_186_idx, GXutil.ltrim( localUtil.ntoc( Z12168DltAncPz, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_213_"+sGXsfl_186_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_213, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1690_"+sGXsfl_186_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1690, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1690_"+sGXsfl_186_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1690, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1690_"+sGXsfl_186_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1690, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1690 != 0 )
         {
            httpContext.changePostValue( "DLTNPIEZA_"+sGXsfl_186_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltNPieza_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTKGSPZ_"+sGXsfl_186_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltKgsPz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTMTSPZ_"+sGXsfl_186_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltMtsPz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTANCPZ_"+sGXsfl_186_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltAncPz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1J91690( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1690 = (short)(0) ;
      nIsMod_1690 = (short)(0) ;
      nRcdDeleted_1690 = (short)(0) ;
   }

   public void processNestedLevel1J91692( )
   {
      nGXsfl_222_idx = 0 ;
      while ( nGXsfl_222_idx < nRC_GXsfl_222 )
      {
         readRow1J91692( ) ;
         if ( ( nRcdExists_1692 != 0 ) || ( nIsMod_1692 != 0 ) )
         {
            standaloneNotModal1J91692( ) ;
            getKey1J91692( ) ;
            if ( ( nRcdExists_1692 == 0 ) && ( nRcdDeleted_1692 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1J91692( ) ;
            }
            else
            {
               if ( RcdFound1692 != 0 )
               {
                  if ( ( nRcdDeleted_1692 != 0 ) && ( nRcdExists_1692 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1J91692( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1692 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1J91692( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1692 == 0 )
                  {
                     GXCCtl = "DLTLIN_" + sGXsfl_222_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDltLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1692_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1692, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltLin_Internalname, GXutil.ltrim( localUtil.ntoc( A12182DltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltFascod_Internalname, GXutil.rtrim( A12172DltFascod)) ;
         httpContext.changePostValue( edtDltFasDsc_Internalname, GXutil.rtrim( A12173DltFasDsc)) ;
         httpContext.changePostValue( edtDltKgsFs_Internalname, GXutil.ltrim( localUtil.ntoc( A12174DltKgsFs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltMtsFs_Internalname, GXutil.ltrim( localUtil.ntoc( A12175DltMtsFs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltPrKFs_Internalname, GXutil.ltrim( localUtil.ntoc( A12189DltPrKFs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltPrMFs_Internalname, GXutil.ltrim( localUtil.ntoc( A12190DltPrMFs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltPrKBFs_Internalname, GXutil.ltrim( localUtil.ntoc( A12191DltPrKBFs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltPrMBFs_Internalname, GXutil.ltrim( localUtil.ntoc( A12192DltPrMBFs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12182DltLin_"+sGXsfl_222_idx, GXutil.ltrim( localUtil.ntoc( Z12182DltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12172DltFascod_"+sGXsfl_222_idx, GXutil.rtrim( Z12172DltFascod)) ;
         httpContext.changePostValue( "ZT_"+"Z12173DltFasDsc_"+sGXsfl_222_idx, GXutil.rtrim( Z12173DltFasDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z12174DltKgsFs_"+sGXsfl_222_idx, GXutil.ltrim( localUtil.ntoc( Z12174DltKgsFs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12175DltMtsFs_"+sGXsfl_222_idx, GXutil.ltrim( localUtil.ntoc( Z12175DltMtsFs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12189DltPrKFs_"+sGXsfl_222_idx, GXutil.ltrim( localUtil.ntoc( Z12189DltPrKFs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12190DltPrMFs_"+sGXsfl_222_idx, GXutil.ltrim( localUtil.ntoc( Z12190DltPrMFs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12191DltPrKBFs_"+sGXsfl_222_idx, GXutil.ltrim( localUtil.ntoc( Z12191DltPrKBFs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12192DltPrMBFs_"+sGXsfl_222_idx, GXutil.ltrim( localUtil.ntoc( Z12192DltPrMBFs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1692_"+sGXsfl_222_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1692, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1692_"+sGXsfl_222_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1692, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1692_"+sGXsfl_222_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1692, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1692 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1692_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1692_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTLIN_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTFASCOD_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltFascod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTFASDSC_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTKGSFS_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltKgsFs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTMTSFS_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltMtsFs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTPRKFS_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPrKFs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTPRMFS_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPrMFs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTPRKBFS_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPrKBFs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTPRMBFS_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPrMBFs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1J91692( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1692 = (short)(0) ;
      nIsMod_1692 = (short)(0) ;
      nRcdDeleted_1692 = (short)(0) ;
   }

   public void processLevel1J91688( )
   {
      /* Save parent mode. */
      sMode1688 = Gx_mode ;
      processNestedLevel1J91689( ) ;
      processNestedLevel1J91690( ) ;
      processNestedLevel1J91692( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1688 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1J91688( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(8);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1J91688( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdlt001");
         if ( AnyError == 0 )
         {
            confirmValues1J90( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdlt001");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1J91688( )
   {
      /* Scan By routine */
      /* Using cursor T01J923 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      RcdFound1688 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1688 = (short)(1) ;
         A30AlbProCod = T01J923_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A12176DltHdr = T01J923_A12176DltHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12176DltHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12176DltHdr), 8, 0));
         A12177DltR = T01J923_A12177DltR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12177DltR", GXutil.str( A12177DltR, 1, 0));
         A12178DltP = T01J923_A12178DltP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12178DltP", A12178DltP);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1J91688( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound1688 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1688 = (short)(1) ;
         A30AlbProCod = T01J923_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A12176DltHdr = T01J923_A12176DltHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12176DltHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12176DltHdr), 8, 0));
         A12177DltR = T01J923_A12177DltR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12177DltR", GXutil.str( A12177DltR, 1, 0));
         A12178DltP = T01J923_A12178DltP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12178DltP", A12178DltP);
      }
   }

   public void scanEnd1J91688( )
   {
      pr_default.close(21);
   }

   public void afterConfirm1J91688( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1J91688( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1J91688( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1J91688( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1J91688( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1J91688( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1J91688( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtDltHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltHdr_Enabled), 5, 0), true);
      edtDltR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltR_Enabled), 5, 0), true);
      edtDltP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltP_Enabled), 5, 0), true);
      edtDltKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltKgs_Enabled), 5, 0), true);
      edtDltMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltMts_Enabled), 5, 0), true);
      edtDltPzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltPzs_Enabled), 5, 0), true);
      edtDltBultos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltBultos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltBultos_Enabled), 5, 0), true);
      edtDltTubos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltTubos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltTubos_Enabled), 5, 0), true);
      edtDltArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltArtCod_Enabled), 5, 0), true);
      edtDltArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltArtDsc_Enabled), 5, 0), true);
      edtDltColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltColNom_Enabled), 5, 0), true);
      edtDltColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltColNum_Enabled), 5, 0), true);
      edtDltTc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltTc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltTc_Enabled), 5, 0), true);
      edtDltColClNm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltColClNm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltColClNm_Enabled), 5, 0), true);
      edtDltColClNr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltColClNr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltColClNr_Enabled), 5, 0), true);
      edtDltGrm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltGrm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltGrm2_Enabled), 5, 0), true);
      edtDltAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltAnc_Enabled), 5, 0), true);
      edtDltAlbObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltAlbObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltAlbObs_Enabled), 5, 0), true);
      edtDltUltTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltUltTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltUltTxt_Enabled), 5, 0), true);
      edtDltUltFs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltUltFs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltUltFs_Enabled), 5, 0), true);
      edtDltEncCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltEncCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltEncCli_Enabled), 5, 0), true);
      edtDltPreKg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltPreKg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltPreKg_Enabled), 5, 0), true);
      edtDltPreMt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltPreMt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltPreMt_Enabled), 5, 0), true);
      edtDltKgsCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltKgsCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltKgsCli_Enabled), 5, 0), true);
      edtDltTubo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltTubo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltTubo_Enabled), 5, 0), true);
      edtDltTuboN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltTuboN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltTuboN_Enabled), 5, 0), true);
      edtDltModCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltModCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltModCod_Enabled), 5, 0), true);
   }

   public void zm1J91689( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12165DltDsc = T01J99_A12165DltDsc[0] ;
            Z12288DltRD = T01J99_A12288DltRD[0] ;
            Z12289DltPKg = T01J99_A12289DltPKg[0] ;
            Z12291DltKgsTxt = T01J99_A12291DltKgsTxt[0] ;
            Z12290DltPMt = T01J99_A12290DltPMt[0] ;
            Z12292DltMtsTxt = T01J99_A12292DltMtsTxt[0] ;
            Z12293DltImpTxt = T01J99_A12293DltImpTxt[0] ;
            Z12294DltTipTxt = T01J99_A12294DltTipTxt[0] ;
            Z12295DltCodTxt = T01J99_A12295DltCodTxt[0] ;
            Z12296DltPzsTxt = T01J99_A12296DltPzsTxt[0] ;
         }
         else
         {
            Z12165DltDsc = A12165DltDsc ;
            Z12288DltRD = A12288DltRD ;
            Z12289DltPKg = A12289DltPKg ;
            Z12291DltKgsTxt = A12291DltKgsTxt ;
            Z12290DltPMt = A12290DltPMt ;
            Z12292DltMtsTxt = A12292DltMtsTxt ;
            Z12293DltImpTxt = A12293DltImpTxt ;
            Z12294DltTipTxt = A12294DltTipTxt ;
            Z12295DltCodTxt = A12295DltCodTxt ;
            Z12296DltPzsTxt = A12296DltPzsTxt ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z12176DltHdr = A12176DltHdr ;
         Z12177DltR = A12177DltR ;
         Z12178DltP = A12178DltP ;
         Z12179DltLinTxt = A12179DltLinTxt ;
         Z12165DltDsc = A12165DltDsc ;
         Z12288DltRD = A12288DltRD ;
         Z12289DltPKg = A12289DltPKg ;
         Z12291DltKgsTxt = A12291DltKgsTxt ;
         Z12290DltPMt = A12290DltPMt ;
         Z12292DltMtsTxt = A12292DltMtsTxt ;
         Z12293DltImpTxt = A12293DltImpTxt ;
         Z12294DltTipTxt = A12294DltTipTxt ;
         Z12295DltCodTxt = A12295DltCodTxt ;
         Z12296DltPzsTxt = A12296DltPzsTxt ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1J91689( )
   {
   }

   public void standaloneModal1J91689( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDltLinTxt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDltLinTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltLinTxt_Enabled), 5, 0), !bGXsfl_170_Refreshing);
      }
      else
      {
         edtDltLinTxt_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDltLinTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltLinTxt_Enabled), 5, 0), !bGXsfl_170_Refreshing);
      }
   }

   public void load1J91689( )
   {
      /* Using cursor T01J924 */
      pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, Short.valueOf(A12179DltLinTxt)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1689 = (short)(1) ;
         A12165DltDsc = T01J924_A12165DltDsc[0] ;
         n12165DltDsc = T01J924_n12165DltDsc[0] ;
         A12288DltRD = T01J924_A12288DltRD[0] ;
         n12288DltRD = T01J924_n12288DltRD[0] ;
         A12289DltPKg = T01J924_A12289DltPKg[0] ;
         n12289DltPKg = T01J924_n12289DltPKg[0] ;
         A12291DltKgsTxt = T01J924_A12291DltKgsTxt[0] ;
         n12291DltKgsTxt = T01J924_n12291DltKgsTxt[0] ;
         A12290DltPMt = T01J924_A12290DltPMt[0] ;
         n12290DltPMt = T01J924_n12290DltPMt[0] ;
         A12292DltMtsTxt = T01J924_A12292DltMtsTxt[0] ;
         n12292DltMtsTxt = T01J924_n12292DltMtsTxt[0] ;
         A12293DltImpTxt = T01J924_A12293DltImpTxt[0] ;
         n12293DltImpTxt = T01J924_n12293DltImpTxt[0] ;
         A12294DltTipTxt = T01J924_A12294DltTipTxt[0] ;
         n12294DltTipTxt = T01J924_n12294DltTipTxt[0] ;
         A12295DltCodTxt = T01J924_A12295DltCodTxt[0] ;
         n12295DltCodTxt = T01J924_n12295DltCodTxt[0] ;
         A12296DltPzsTxt = T01J924_A12296DltPzsTxt[0] ;
         n12296DltPzsTxt = T01J924_n12296DltPzsTxt[0] ;
         zm1J91689( -4) ;
      }
      pr_default.close(22);
      onLoadActions1J91689( ) ;
   }

   public void onLoadActions1J91689( )
   {
   }

   public void checkExtendedTable1J91689( )
   {
      nIsDirty_1689 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1J91689( ) ;
   }

   public void closeExtendedTableCursors1J91689( )
   {
   }

   public void enableDisable1J91689( )
   {
   }

   public void getKey1J91689( )
   {
      /* Using cursor T01J925 */
      pr_default.execute(23, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, Short.valueOf(A12179DltLinTxt)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1689 = (short)(1) ;
      }
      else
      {
         RcdFound1689 = (short)(0) ;
      }
      pr_default.close(23);
   }

   public void getByPrimaryKey1J91689( )
   {
      /* Using cursor T01J99 */
      pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, Short.valueOf(A12179DltLinTxt)});
      if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01J99_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1J91689( 4) ;
         RcdFound1689 = (short)(1) ;
         initializeNonKey1J91689( ) ;
         A12179DltLinTxt = T01J99_A12179DltLinTxt[0] ;
         A12165DltDsc = T01J99_A12165DltDsc[0] ;
         n12165DltDsc = T01J99_n12165DltDsc[0] ;
         A12288DltRD = T01J99_A12288DltRD[0] ;
         n12288DltRD = T01J99_n12288DltRD[0] ;
         A12289DltPKg = T01J99_A12289DltPKg[0] ;
         n12289DltPKg = T01J99_n12289DltPKg[0] ;
         A12291DltKgsTxt = T01J99_A12291DltKgsTxt[0] ;
         n12291DltKgsTxt = T01J99_n12291DltKgsTxt[0] ;
         A12290DltPMt = T01J99_A12290DltPMt[0] ;
         n12290DltPMt = T01J99_n12290DltPMt[0] ;
         A12292DltMtsTxt = T01J99_A12292DltMtsTxt[0] ;
         n12292DltMtsTxt = T01J99_n12292DltMtsTxt[0] ;
         A12293DltImpTxt = T01J99_A12293DltImpTxt[0] ;
         n12293DltImpTxt = T01J99_n12293DltImpTxt[0] ;
         A12294DltTipTxt = T01J99_A12294DltTipTxt[0] ;
         n12294DltTipTxt = T01J99_n12294DltTipTxt[0] ;
         A12295DltCodTxt = T01J99_A12295DltCodTxt[0] ;
         n12295DltCodTxt = T01J99_n12295DltCodTxt[0] ;
         A12296DltPzsTxt = T01J99_A12296DltPzsTxt[0] ;
         n12296DltPzsTxt = T01J99_n12296DltPzsTxt[0] ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z12176DltHdr = A12176DltHdr ;
         Z12177DltR = A12177DltR ;
         Z12178DltP = A12178DltP ;
         Z12179DltLinTxt = A12179DltLinTxt ;
         sMode1689 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1J91689( ) ;
         load1J91689( ) ;
         Gx_mode = sMode1689 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1689 = (short)(0) ;
         initializeNonKey1J91689( ) ;
         sMode1689 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1J91689( ) ;
         Gx_mode = sMode1689 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1J91689( ) ;
      }
      pr_default.close(7);
   }

   public void checkOptimisticConcurrency1J91689( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01J98 */
         pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, Short.valueOf(A12179DltLinTxt)});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDLT006"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(6) == 101) || ( GXutil.strcmp(Z12165DltDsc, T01J98_A12165DltDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z12288DltRD, T01J98_A12288DltRD[0]) != 0 ) || ( DecimalUtil.compareTo(Z12289DltPKg, T01J98_A12289DltPKg[0]) != 0 ) || ( DecimalUtil.compareTo(Z12291DltKgsTxt, T01J98_A12291DltKgsTxt[0]) != 0 ) || ( DecimalUtil.compareTo(Z12290DltPMt, T01J98_A12290DltPMt[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z12292DltMtsTxt, T01J98_A12292DltMtsTxt[0]) != 0 ) || ( DecimalUtil.compareTo(Z12293DltImpTxt, T01J98_A12293DltImpTxt[0]) != 0 ) || ( GXutil.strcmp(Z12294DltTipTxt, T01J98_A12294DltTipTxt[0]) != 0 ) || ( GXutil.strcmp(Z12295DltCodTxt, T01J98_A12295DltCodTxt[0]) != 0 ) || ( Z12296DltPzsTxt != T01J98_A12296DltPzsTxt[0] ) )
         {
            if ( GXutil.strcmp(Z12165DltDsc, T01J98_A12165DltDsc[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltDsc");
               GXutil.writeLogRaw("Old: ",Z12165DltDsc);
               GXutil.writeLogRaw("Current: ",T01J98_A12165DltDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z12288DltRD, T01J98_A12288DltRD[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltRD");
               GXutil.writeLogRaw("Old: ",Z12288DltRD);
               GXutil.writeLogRaw("Current: ",T01J98_A12288DltRD[0]);
            }
            if ( DecimalUtil.compareTo(Z12289DltPKg, T01J98_A12289DltPKg[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltPKg");
               GXutil.writeLogRaw("Old: ",Z12289DltPKg);
               GXutil.writeLogRaw("Current: ",T01J98_A12289DltPKg[0]);
            }
            if ( DecimalUtil.compareTo(Z12291DltKgsTxt, T01J98_A12291DltKgsTxt[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltKgsTxt");
               GXutil.writeLogRaw("Old: ",Z12291DltKgsTxt);
               GXutil.writeLogRaw("Current: ",T01J98_A12291DltKgsTxt[0]);
            }
            if ( DecimalUtil.compareTo(Z12290DltPMt, T01J98_A12290DltPMt[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltPMt");
               GXutil.writeLogRaw("Old: ",Z12290DltPMt);
               GXutil.writeLogRaw("Current: ",T01J98_A12290DltPMt[0]);
            }
            if ( DecimalUtil.compareTo(Z12292DltMtsTxt, T01J98_A12292DltMtsTxt[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltMtsTxt");
               GXutil.writeLogRaw("Old: ",Z12292DltMtsTxt);
               GXutil.writeLogRaw("Current: ",T01J98_A12292DltMtsTxt[0]);
            }
            if ( DecimalUtil.compareTo(Z12293DltImpTxt, T01J98_A12293DltImpTxt[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltImpTxt");
               GXutil.writeLogRaw("Old: ",Z12293DltImpTxt);
               GXutil.writeLogRaw("Current: ",T01J98_A12293DltImpTxt[0]);
            }
            if ( GXutil.strcmp(Z12294DltTipTxt, T01J98_A12294DltTipTxt[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltTipTxt");
               GXutil.writeLogRaw("Old: ",Z12294DltTipTxt);
               GXutil.writeLogRaw("Current: ",T01J98_A12294DltTipTxt[0]);
            }
            if ( GXutil.strcmp(Z12295DltCodTxt, T01J98_A12295DltCodTxt[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltCodTxt");
               GXutil.writeLogRaw("Old: ",Z12295DltCodTxt);
               GXutil.writeLogRaw("Current: ",T01J98_A12295DltCodTxt[0]);
            }
            if ( Z12296DltPzsTxt != T01J98_A12296DltPzsTxt[0] )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltPzsTxt");
               GXutil.writeLogRaw("Old: ",Z12296DltPzsTxt);
               GXutil.writeLogRaw("Current: ",T01J98_A12296DltPzsTxt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDLT006"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1J91689( )
   {
      beforeValidate1J91689( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J91689( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1J91689( 0) ;
         checkOptimisticConcurrency1J91689( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J91689( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1J91689( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01J926 */
                  pr_default.execute(24, new Object[] {Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, Short.valueOf(A12179DltLinTxt), Boolean.valueOf(n12165DltDsc), A12165DltDsc, Boolean.valueOf(n12288DltRD), A12288DltRD, Boolean.valueOf(n12289DltPKg), A12289DltPKg, Boolean.valueOf(n12291DltKgsTxt), A12291DltKgsTxt, Boolean.valueOf(n12290DltPMt), A12290DltPMt, Boolean.valueOf(n12292DltMtsTxt), A12292DltMtsTxt, Boolean.valueOf(n12293DltImpTxt), A12293DltImpTxt, Boolean.valueOf(n12294DltTipTxt), A12294DltTipTxt, Boolean.valueOf(n12295DltCodTxt), A12295DltCodTxt, Boolean.valueOf(n12296DltPzsTxt), Integer.valueOf(A12296DltPzsTxt), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDLT006");
                  if ( (pr_default.getStatus(24) == 1) )
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
            load1J91689( ) ;
         }
         endLevel1J91689( ) ;
      }
      closeExtendedTableCursors1J91689( ) ;
   }

   public void update1J91689( )
   {
      beforeValidate1J91689( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J91689( ) ;
      }
      if ( ( nIsMod_1689 != 0 ) || ( nIsDirty_1689 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1J91689( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1J91689( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1J91689( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01J927 */
                     pr_default.execute(25, new Object[] {Boolean.valueOf(n12165DltDsc), A12165DltDsc, Boolean.valueOf(n12288DltRD), A12288DltRD, Boolean.valueOf(n12289DltPKg), A12289DltPKg, Boolean.valueOf(n12291DltKgsTxt), A12291DltKgsTxt, Boolean.valueOf(n12290DltPMt), A12290DltPMt, Boolean.valueOf(n12292DltMtsTxt), A12292DltMtsTxt, Boolean.valueOf(n12293DltImpTxt), A12293DltImpTxt, Boolean.valueOf(n12294DltTipTxt), A12294DltTipTxt, Boolean.valueOf(n12295DltCodTxt), A12295DltCodTxt, Boolean.valueOf(n12296DltPzsTxt), Integer.valueOf(A12296DltPzsTxt), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, Short.valueOf(A12179DltLinTxt)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDLT006");
                     if ( (pr_default.getStatus(25) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDLT006"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1J91689( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1J91689( ) ;
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
            endLevel1J91689( ) ;
         }
      }
      closeExtendedTableCursors1J91689( ) ;
   }

   public void deferredUpdate1J91689( )
   {
   }

   public void delete1J91689( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1J91689( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J91689( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1J91689( ) ;
         afterConfirm1J91689( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1J91689( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01J928 */
               pr_default.execute(26, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, Short.valueOf(A12179DltLinTxt)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDLT006");
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
      sMode1689 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1J91689( ) ;
      Gx_mode = sMode1689 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1J91689( )
   {
      standaloneModal1J91689( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1J91689( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(6);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1J91689( )
   {
      /* Scan By routine */
      /* Using cursor T01J929 */
      pr_default.execute(27, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP});
      RcdFound1689 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1689 = (short)(1) ;
         A12179DltLinTxt = T01J929_A12179DltLinTxt[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1J91689( )
   {
      /* Scan next routine */
      pr_default.readNext(27);
      RcdFound1689 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1689 = (short)(1) ;
         A12179DltLinTxt = T01J929_A12179DltLinTxt[0] ;
      }
   }

   public void scanEnd1J91689( )
   {
      pr_default.close(27);
   }

   public void afterConfirm1J91689( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1J91689( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1J91689( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1J91689( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1J91689( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1J91689( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1J91689( )
   {
      edtDltLinTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltLinTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltLinTxt_Enabled), 5, 0), !bGXsfl_170_Refreshing);
      edtDltDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltDsc_Enabled), 5, 0), !bGXsfl_170_Refreshing);
      edtDltRD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltRD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltRD_Enabled), 5, 0), !bGXsfl_170_Refreshing);
      edtDltPKg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltPKg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltPKg_Enabled), 5, 0), !bGXsfl_170_Refreshing);
      edtDltKgsTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltKgsTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltKgsTxt_Enabled), 5, 0), !bGXsfl_170_Refreshing);
      edtDltPMt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltPMt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltPMt_Enabled), 5, 0), !bGXsfl_170_Refreshing);
      edtDltMtsTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltMtsTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltMtsTxt_Enabled), 5, 0), !bGXsfl_170_Refreshing);
      edtDltImpTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltImpTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltImpTxt_Enabled), 5, 0), !bGXsfl_170_Refreshing);
      edtDltTipTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltTipTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltTipTxt_Enabled), 5, 0), !bGXsfl_170_Refreshing);
      edtDltCodTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltCodTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltCodTxt_Enabled), 5, 0), !bGXsfl_170_Refreshing);
      edtDltPzsTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltPzsTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltPzsTxt_Enabled), 5, 0), !bGXsfl_170_Refreshing);
   }

   public void send_integrity_lvl_hashes1J91689( )
   {
   }

   public void zm1J91690( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12166DltKgsPz = T01J97_A12166DltKgsPz[0] ;
            Z12167DltMtsPz = T01J97_A12167DltMtsPz[0] ;
            Z12168DltAncPz = T01J97_A12168DltAncPz[0] ;
         }
         else
         {
            Z12166DltKgsPz = A12166DltKgsPz ;
            Z12167DltMtsPz = A12167DltMtsPz ;
            Z12168DltAncPz = A12168DltAncPz ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z12176DltHdr = A12176DltHdr ;
         Z12177DltR = A12177DltR ;
         Z12178DltP = A12178DltP ;
         Z12180DltNPieza = A12180DltNPieza ;
         Z12166DltKgsPz = A12166DltKgsPz ;
         Z12167DltMtsPz = A12167DltMtsPz ;
         Z12168DltAncPz = A12168DltAncPz ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1J91690( )
   {
   }

   public void standaloneModal1J91690( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDltNPieza_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDltNPieza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltNPieza_Enabled), 5, 0), !bGXsfl_186_Refreshing);
      }
      else
      {
         edtDltNPieza_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDltNPieza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltNPieza_Enabled), 5, 0), !bGXsfl_186_Refreshing);
      }
   }

   public void load1J91690( )
   {
      /* Using cursor T01J930 */
      pr_default.execute(28, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, A12180DltNPieza});
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1690 = (short)(1) ;
         A12166DltKgsPz = T01J930_A12166DltKgsPz[0] ;
         n12166DltKgsPz = T01J930_n12166DltKgsPz[0] ;
         A12167DltMtsPz = T01J930_A12167DltMtsPz[0] ;
         n12167DltMtsPz = T01J930_n12167DltMtsPz[0] ;
         A12168DltAncPz = T01J930_A12168DltAncPz[0] ;
         n12168DltAncPz = T01J930_n12168DltAncPz[0] ;
         zm1J91690( -5) ;
      }
      pr_default.close(28);
      onLoadActions1J91690( ) ;
   }

   public void onLoadActions1J91690( )
   {
   }

   public void checkExtendedTable1J91690( )
   {
      nIsDirty_1690 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1J91690( ) ;
   }

   public void closeExtendedTableCursors1J91690( )
   {
   }

   public void enableDisable1J91690( )
   {
   }

   public void getKey1J91690( )
   {
      /* Using cursor T01J931 */
      pr_default.execute(29, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, A12180DltNPieza});
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1690 = (short)(1) ;
      }
      else
      {
         RcdFound1690 = (short)(0) ;
      }
      pr_default.close(29);
   }

   public void getByPrimaryKey1J91690( )
   {
      /* Using cursor T01J97 */
      pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, A12180DltNPieza});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T01J97_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1J91690( 5) ;
         RcdFound1690 = (short)(1) ;
         initializeNonKey1J91690( ) ;
         A12180DltNPieza = T01J97_A12180DltNPieza[0] ;
         A12166DltKgsPz = T01J97_A12166DltKgsPz[0] ;
         n12166DltKgsPz = T01J97_n12166DltKgsPz[0] ;
         A12167DltMtsPz = T01J97_A12167DltMtsPz[0] ;
         n12167DltMtsPz = T01J97_n12167DltMtsPz[0] ;
         A12168DltAncPz = T01J97_A12168DltAncPz[0] ;
         n12168DltAncPz = T01J97_n12168DltAncPz[0] ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z12176DltHdr = A12176DltHdr ;
         Z12177DltR = A12177DltR ;
         Z12178DltP = A12178DltP ;
         Z12180DltNPieza = A12180DltNPieza ;
         sMode1690 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1J91690( ) ;
         load1J91690( ) ;
         Gx_mode = sMode1690 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1690 = (short)(0) ;
         initializeNonKey1J91690( ) ;
         sMode1690 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1J91690( ) ;
         Gx_mode = sMode1690 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1J91690( ) ;
      }
      pr_default.close(5);
   }

   public void checkOptimisticConcurrency1J91690( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01J96 */
         pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, A12180DltNPieza});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDLT002"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( DecimalUtil.compareTo(Z12166DltKgsPz, T01J96_A12166DltKgsPz[0]) != 0 ) || ( DecimalUtil.compareTo(Z12167DltMtsPz, T01J96_A12167DltMtsPz[0]) != 0 ) || ( Z12168DltAncPz != T01J96_A12168DltAncPz[0] ) )
         {
            if ( DecimalUtil.compareTo(Z12166DltKgsPz, T01J96_A12166DltKgsPz[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltKgsPz");
               GXutil.writeLogRaw("Old: ",Z12166DltKgsPz);
               GXutil.writeLogRaw("Current: ",T01J96_A12166DltKgsPz[0]);
            }
            if ( DecimalUtil.compareTo(Z12167DltMtsPz, T01J96_A12167DltMtsPz[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltMtsPz");
               GXutil.writeLogRaw("Old: ",Z12167DltMtsPz);
               GXutil.writeLogRaw("Current: ",T01J96_A12167DltMtsPz[0]);
            }
            if ( Z12168DltAncPz != T01J96_A12168DltAncPz[0] )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltAncPz");
               GXutil.writeLogRaw("Old: ",Z12168DltAncPz);
               GXutil.writeLogRaw("Current: ",T01J96_A12168DltAncPz[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDLT002"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1J91690( )
   {
      beforeValidate1J91690( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J91690( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1J91690( 0) ;
         checkOptimisticConcurrency1J91690( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J91690( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1J91690( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01J932 */
                  pr_default.execute(30, new Object[] {Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, A12180DltNPieza, Boolean.valueOf(n12166DltKgsPz), A12166DltKgsPz, Boolean.valueOf(n12167DltMtsPz), A12167DltMtsPz, Boolean.valueOf(n12168DltAncPz), Short.valueOf(A12168DltAncPz), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDLT002");
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
                        processLevel1J91690( ) ;
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
            load1J91690( ) ;
         }
         endLevel1J91690( ) ;
      }
      closeExtendedTableCursors1J91690( ) ;
   }

   public void update1J91690( )
   {
      beforeValidate1J91690( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J91690( ) ;
      }
      if ( ( nIsMod_1690 != 0 ) || ( nIsDirty_1690 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1J91690( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1J91690( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1J91690( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01J933 */
                     pr_default.execute(31, new Object[] {Boolean.valueOf(n12166DltKgsPz), A12166DltKgsPz, Boolean.valueOf(n12167DltMtsPz), A12167DltMtsPz, Boolean.valueOf(n12168DltAncPz), Short.valueOf(A12168DltAncPz), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, A12180DltNPieza});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDLT002");
                     if ( (pr_default.getStatus(31) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDLT002"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1J91690( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel1J91690( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey1J91690( ) ;
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
            endLevel1J91690( ) ;
         }
      }
      closeExtendedTableCursors1J91690( ) ;
   }

   public void deferredUpdate1J91690( )
   {
   }

   public void delete1J91690( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1J91690( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J91690( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1J91690( ) ;
         afterConfirm1J91690( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1J91690( ) ;
            if ( AnyError == 0 )
            {
               scanStart1J91691( ) ;
               while ( RcdFound1691 != 0 )
               {
                  getByPrimaryKey1J91691( ) ;
                  delete1J91691( ) ;
                  scanNext1J91691( ) ;
               }
               scanEnd1J91691( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01J934 */
                  pr_default.execute(32, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, A12180DltNPieza});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDLT002");
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
      sMode1690 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1J91690( ) ;
      Gx_mode = sMode1690 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1J91690( )
   {
      standaloneModal1J91690( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1J91691( )
   {
      nGXsfl_213_idx = 0 ;
      while ( nGXsfl_213_idx < nRC_GXsfl_213 )
      {
         readRow1J91691( ) ;
         if ( ( nRcdExists_1691 != 0 ) || ( nIsMod_1691 != 0 ) )
         {
            standaloneNotModal1J91691( ) ;
            getKey1J91691( ) ;
            if ( ( nRcdExists_1691 == 0 ) && ( nRcdDeleted_1691 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1J91691( ) ;
            }
            else
            {
               if ( RcdFound1691 != 0 )
               {
                  if ( ( nRcdDeleted_1691 != 0 ) && ( nRcdExists_1691 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1J91691( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1691 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1J91691( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1691 == 0 )
                  {
                     GXCCtl = "DLTNPIEZA_" + sGXsfl_186_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDltNPieza_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1691_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1691, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltNTrozo_Internalname, GXutil.ltrim( localUtil.ntoc( A12181DltNTrozo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltKgsTrz_Internalname, GXutil.ltrim( localUtil.ntoc( A12169DltKgsTrz, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltMtsTrz_Internalname, GXutil.ltrim( localUtil.ntoc( A12170DltMtsTrz, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDltAncTrz_Internalname, GXutil.ltrim( localUtil.ntoc( A12171DltAncTrz, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12181DltNTrozo_"+sGXsfl_213_idx, GXutil.ltrim( localUtil.ntoc( Z12181DltNTrozo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12169DltKgsTrz_"+sGXsfl_213_idx, GXutil.ltrim( localUtil.ntoc( Z12169DltKgsTrz, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12170DltMtsTrz_"+sGXsfl_213_idx, GXutil.ltrim( localUtil.ntoc( Z12170DltMtsTrz, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12171DltAncTrz_"+sGXsfl_213_idx, GXutil.ltrim( localUtil.ntoc( Z12171DltAncTrz, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1691_"+sGXsfl_213_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1691, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1691_"+sGXsfl_213_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1691, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1691_"+sGXsfl_213_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1691, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1691 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1691_"+sGXsfl_213_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1691_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTNTROZO_"+sGXsfl_213_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltNTrozo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTKGSTRZ_"+sGXsfl_213_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltKgsTrz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTMTSTRZ_"+sGXsfl_213_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltMtsTrz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DLTANCTRZ_"+sGXsfl_213_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltAncTrz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1J91691( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1691 = (short)(0) ;
      nIsMod_1691 = (short)(0) ;
      nRcdDeleted_1691 = (short)(0) ;
   }

   public void processLevel1J91690( )
   {
      /* Save parent mode. */
      sMode1690 = Gx_mode ;
      processNestedLevel1J91691( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1690 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1J91690( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1J91690( )
   {
      /* Scan By routine */
      /* Using cursor T01J935 */
      pr_default.execute(33, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP});
      RcdFound1690 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound1690 = (short)(1) ;
         A12180DltNPieza = T01J935_A12180DltNPieza[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1J91690( )
   {
      /* Scan next routine */
      pr_default.readNext(33);
      RcdFound1690 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound1690 = (short)(1) ;
         A12180DltNPieza = T01J935_A12180DltNPieza[0] ;
      }
   }

   public void scanEnd1J91690( )
   {
      pr_default.close(33);
   }

   public void afterConfirm1J91690( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1J91690( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1J91690( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1J91690( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1J91690( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1J91690( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1J91690( )
   {
      edtDltNPieza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltNPieza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltNPieza_Enabled), 5, 0), !bGXsfl_186_Refreshing);
      edtDltKgsPz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltKgsPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltKgsPz_Enabled), 5, 0), !bGXsfl_186_Refreshing);
      edtDltMtsPz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltMtsPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltMtsPz_Enabled), 5, 0), !bGXsfl_186_Refreshing);
      edtDltAncPz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltAncPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltAncPz_Enabled), 5, 0), !bGXsfl_186_Refreshing);
   }

   public void zm1J91691( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12169DltKgsTrz = T01J95_A12169DltKgsTrz[0] ;
            Z12170DltMtsTrz = T01J95_A12170DltMtsTrz[0] ;
            Z12171DltAncTrz = T01J95_A12171DltAncTrz[0] ;
         }
         else
         {
            Z12169DltKgsTrz = A12169DltKgsTrz ;
            Z12170DltMtsTrz = A12170DltMtsTrz ;
            Z12171DltAncTrz = A12171DltAncTrz ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z12176DltHdr = A12176DltHdr ;
         Z12177DltR = A12177DltR ;
         Z12178DltP = A12178DltP ;
         Z12180DltNPieza = A12180DltNPieza ;
         Z12181DltNTrozo = A12181DltNTrozo ;
         Z12169DltKgsTrz = A12169DltKgsTrz ;
         Z12170DltMtsTrz = A12170DltMtsTrz ;
         Z12171DltAncTrz = A12171DltAncTrz ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1J91691( )
   {
   }

   public void standaloneModal1J91691( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDltNTrozo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDltNTrozo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltNTrozo_Enabled), 5, 0), !bGXsfl_213_Refreshing);
      }
      else
      {
         edtDltNTrozo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDltNTrozo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltNTrozo_Enabled), 5, 0), !bGXsfl_213_Refreshing);
      }
   }

   public void load1J91691( )
   {
      /* Using cursor T01J936 */
      pr_default.execute(34, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, A12180DltNPieza, Short.valueOf(A12181DltNTrozo)});
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound1691 = (short)(1) ;
         A12169DltKgsTrz = T01J936_A12169DltKgsTrz[0] ;
         n12169DltKgsTrz = T01J936_n12169DltKgsTrz[0] ;
         A12170DltMtsTrz = T01J936_A12170DltMtsTrz[0] ;
         n12170DltMtsTrz = T01J936_n12170DltMtsTrz[0] ;
         A12171DltAncTrz = T01J936_A12171DltAncTrz[0] ;
         n12171DltAncTrz = T01J936_n12171DltAncTrz[0] ;
         zm1J91691( -6) ;
      }
      pr_default.close(34);
      onLoadActions1J91691( ) ;
   }

   public void onLoadActions1J91691( )
   {
   }

   public void checkExtendedTable1J91691( )
   {
      nIsDirty_1691 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1J91691( ) ;
   }

   public void closeExtendedTableCursors1J91691( )
   {
   }

   public void enableDisable1J91691( )
   {
   }

   public void getKey1J91691( )
   {
      /* Using cursor T01J937 */
      pr_default.execute(35, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, A12180DltNPieza, Short.valueOf(A12181DltNTrozo)});
      if ( (pr_default.getStatus(35) != 101) )
      {
         RcdFound1691 = (short)(1) ;
      }
      else
      {
         RcdFound1691 = (short)(0) ;
      }
      pr_default.close(35);
   }

   public void getByPrimaryKey1J91691( )
   {
      /* Using cursor T01J95 */
      pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, A12180DltNPieza, Short.valueOf(A12181DltNTrozo)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01J95_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1J91691( 6) ;
         RcdFound1691 = (short)(1) ;
         initializeNonKey1J91691( ) ;
         A12181DltNTrozo = T01J95_A12181DltNTrozo[0] ;
         A12169DltKgsTrz = T01J95_A12169DltKgsTrz[0] ;
         n12169DltKgsTrz = T01J95_n12169DltKgsTrz[0] ;
         A12170DltMtsTrz = T01J95_A12170DltMtsTrz[0] ;
         n12170DltMtsTrz = T01J95_n12170DltMtsTrz[0] ;
         A12171DltAncTrz = T01J95_A12171DltAncTrz[0] ;
         n12171DltAncTrz = T01J95_n12171DltAncTrz[0] ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z12176DltHdr = A12176DltHdr ;
         Z12177DltR = A12177DltR ;
         Z12178DltP = A12178DltP ;
         Z12180DltNPieza = A12180DltNPieza ;
         Z12181DltNTrozo = A12181DltNTrozo ;
         sMode1691 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1J91691( ) ;
         load1J91691( ) ;
         Gx_mode = sMode1691 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1691 = (short)(0) ;
         initializeNonKey1J91691( ) ;
         sMode1691 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1J91691( ) ;
         Gx_mode = sMode1691 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1J91691( ) ;
      }
      pr_default.close(3);
   }

   public void checkOptimisticConcurrency1J91691( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01J94 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, A12180DltNPieza, Short.valueOf(A12181DltNTrozo)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDLT003"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( DecimalUtil.compareTo(Z12169DltKgsTrz, T01J94_A12169DltKgsTrz[0]) != 0 ) || ( DecimalUtil.compareTo(Z12170DltMtsTrz, T01J94_A12170DltMtsTrz[0]) != 0 ) || ( Z12171DltAncTrz != T01J94_A12171DltAncTrz[0] ) )
         {
            if ( DecimalUtil.compareTo(Z12169DltKgsTrz, T01J94_A12169DltKgsTrz[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltKgsTrz");
               GXutil.writeLogRaw("Old: ",Z12169DltKgsTrz);
               GXutil.writeLogRaw("Current: ",T01J94_A12169DltKgsTrz[0]);
            }
            if ( DecimalUtil.compareTo(Z12170DltMtsTrz, T01J94_A12170DltMtsTrz[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltMtsTrz");
               GXutil.writeLogRaw("Old: ",Z12170DltMtsTrz);
               GXutil.writeLogRaw("Current: ",T01J94_A12170DltMtsTrz[0]);
            }
            if ( Z12171DltAncTrz != T01J94_A12171DltAncTrz[0] )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltAncTrz");
               GXutil.writeLogRaw("Old: ",Z12171DltAncTrz);
               GXutil.writeLogRaw("Current: ",T01J94_A12171DltAncTrz[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDLT003"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1J91691( )
   {
      beforeValidate1J91691( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J91691( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1J91691( 0) ;
         checkOptimisticConcurrency1J91691( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J91691( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1J91691( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01J938 */
                  pr_default.execute(36, new Object[] {Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, A12180DltNPieza, Short.valueOf(A12181DltNTrozo), Boolean.valueOf(n12169DltKgsTrz), A12169DltKgsTrz, Boolean.valueOf(n12170DltMtsTrz), A12170DltMtsTrz, Boolean.valueOf(n12171DltAncTrz), Short.valueOf(A12171DltAncTrz), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDLT003");
                  if ( (pr_default.getStatus(36) == 1) )
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
            load1J91691( ) ;
         }
         endLevel1J91691( ) ;
      }
      closeExtendedTableCursors1J91691( ) ;
   }

   public void update1J91691( )
   {
      beforeValidate1J91691( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J91691( ) ;
      }
      if ( ( nIsMod_1691 != 0 ) || ( nIsDirty_1691 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1J91691( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1J91691( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1J91691( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01J939 */
                     pr_default.execute(37, new Object[] {Boolean.valueOf(n12169DltKgsTrz), A12169DltKgsTrz, Boolean.valueOf(n12170DltMtsTrz), A12170DltMtsTrz, Boolean.valueOf(n12171DltAncTrz), Short.valueOf(A12171DltAncTrz), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, A12180DltNPieza, Short.valueOf(A12181DltNTrozo)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDLT003");
                     if ( (pr_default.getStatus(37) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDLT003"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1J91691( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1J91691( ) ;
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
            endLevel1J91691( ) ;
         }
      }
      closeExtendedTableCursors1J91691( ) ;
   }

   public void deferredUpdate1J91691( )
   {
   }

   public void delete1J91691( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1J91691( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J91691( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1J91691( ) ;
         afterConfirm1J91691( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1J91691( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01J940 */
               pr_default.execute(38, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, A12180DltNPieza, Short.valueOf(A12181DltNTrozo)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDLT003");
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
      sMode1691 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1J91691( ) ;
      Gx_mode = sMode1691 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1J91691( )
   {
      standaloneModal1J91691( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1J91691( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1J91691( )
   {
      /* Scan By routine */
      /* Using cursor T01J941 */
      pr_default.execute(39, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, A12180DltNPieza});
      RcdFound1691 = (short)(0) ;
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound1691 = (short)(1) ;
         A12181DltNTrozo = T01J941_A12181DltNTrozo[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1J91691( )
   {
      /* Scan next routine */
      pr_default.readNext(39);
      RcdFound1691 = (short)(0) ;
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound1691 = (short)(1) ;
         A12181DltNTrozo = T01J941_A12181DltNTrozo[0] ;
      }
   }

   public void scanEnd1J91691( )
   {
      pr_default.close(39);
   }

   public void afterConfirm1J91691( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1J91691( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1J91691( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1J91691( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1J91691( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1J91691( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1J91691( )
   {
      edtDltNTrozo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltNTrozo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltNTrozo_Enabled), 5, 0), !bGXsfl_213_Refreshing);
      edtDltKgsTrz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltKgsTrz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltKgsTrz_Enabled), 5, 0), !bGXsfl_213_Refreshing);
      edtDltMtsTrz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltMtsTrz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltMtsTrz_Enabled), 5, 0), !bGXsfl_213_Refreshing);
      edtDltAncTrz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltAncTrz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltAncTrz_Enabled), 5, 0), !bGXsfl_213_Refreshing);
   }

   public void send_integrity_lvl_hashes1J91691( )
   {
   }

   public void send_integrity_lvl_hashes1J91690( )
   {
   }

   public void zm1J91692( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12172DltFascod = T01J93_A12172DltFascod[0] ;
            Z12173DltFasDsc = T01J93_A12173DltFasDsc[0] ;
            Z12174DltKgsFs = T01J93_A12174DltKgsFs[0] ;
            Z12175DltMtsFs = T01J93_A12175DltMtsFs[0] ;
            Z12189DltPrKFs = T01J93_A12189DltPrKFs[0] ;
            Z12190DltPrMFs = T01J93_A12190DltPrMFs[0] ;
            Z12191DltPrKBFs = T01J93_A12191DltPrKBFs[0] ;
            Z12192DltPrMBFs = T01J93_A12192DltPrMBFs[0] ;
         }
         else
         {
            Z12172DltFascod = A12172DltFascod ;
            Z12173DltFasDsc = A12173DltFasDsc ;
            Z12174DltKgsFs = A12174DltKgsFs ;
            Z12175DltMtsFs = A12175DltMtsFs ;
            Z12189DltPrKFs = A12189DltPrKFs ;
            Z12190DltPrMFs = A12190DltPrMFs ;
            Z12191DltPrKBFs = A12191DltPrKBFs ;
            Z12192DltPrMBFs = A12192DltPrMBFs ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z12176DltHdr = A12176DltHdr ;
         Z12177DltR = A12177DltR ;
         Z12178DltP = A12178DltP ;
         Z12182DltLin = A12182DltLin ;
         Z12172DltFascod = A12172DltFascod ;
         Z12173DltFasDsc = A12173DltFasDsc ;
         Z12174DltKgsFs = A12174DltKgsFs ;
         Z12175DltMtsFs = A12175DltMtsFs ;
         Z12189DltPrKFs = A12189DltPrKFs ;
         Z12190DltPrMFs = A12190DltPrMFs ;
         Z12191DltPrKBFs = A12191DltPrKBFs ;
         Z12192DltPrMBFs = A12192DltPrMBFs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1J91692( )
   {
   }

   public void standaloneModal1J91692( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDltLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltLin_Enabled), 5, 0), !bGXsfl_222_Refreshing);
      }
      else
      {
         edtDltLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltLin_Enabled), 5, 0), !bGXsfl_222_Refreshing);
      }
   }

   public void load1J91692( )
   {
      /* Using cursor T01J942 */
      pr_default.execute(40, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, Short.valueOf(A12182DltLin)});
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound1692 = (short)(1) ;
         A12172DltFascod = T01J942_A12172DltFascod[0] ;
         n12172DltFascod = T01J942_n12172DltFascod[0] ;
         A12173DltFasDsc = T01J942_A12173DltFasDsc[0] ;
         n12173DltFasDsc = T01J942_n12173DltFasDsc[0] ;
         A12174DltKgsFs = T01J942_A12174DltKgsFs[0] ;
         n12174DltKgsFs = T01J942_n12174DltKgsFs[0] ;
         A12175DltMtsFs = T01J942_A12175DltMtsFs[0] ;
         n12175DltMtsFs = T01J942_n12175DltMtsFs[0] ;
         A12189DltPrKFs = T01J942_A12189DltPrKFs[0] ;
         n12189DltPrKFs = T01J942_n12189DltPrKFs[0] ;
         A12190DltPrMFs = T01J942_A12190DltPrMFs[0] ;
         n12190DltPrMFs = T01J942_n12190DltPrMFs[0] ;
         A12191DltPrKBFs = T01J942_A12191DltPrKBFs[0] ;
         n12191DltPrKBFs = T01J942_n12191DltPrKBFs[0] ;
         A12192DltPrMBFs = T01J942_A12192DltPrMBFs[0] ;
         n12192DltPrMBFs = T01J942_n12192DltPrMBFs[0] ;
         zm1J91692( -7) ;
      }
      pr_default.close(40);
      onLoadActions1J91692( ) ;
   }

   public void onLoadActions1J91692( )
   {
   }

   public void checkExtendedTable1J91692( )
   {
      nIsDirty_1692 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1J91692( ) ;
   }

   public void closeExtendedTableCursors1J91692( )
   {
   }

   public void enableDisable1J91692( )
   {
   }

   public void getKey1J91692( )
   {
      /* Using cursor T01J943 */
      pr_default.execute(41, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, Short.valueOf(A12182DltLin)});
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound1692 = (short)(1) ;
      }
      else
      {
         RcdFound1692 = (short)(0) ;
      }
      pr_default.close(41);
   }

   public void getByPrimaryKey1J91692( )
   {
      /* Using cursor T01J93 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, Short.valueOf(A12182DltLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01J93_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1J91692( 7) ;
         RcdFound1692 = (short)(1) ;
         initializeNonKey1J91692( ) ;
         A12182DltLin = T01J93_A12182DltLin[0] ;
         A12172DltFascod = T01J93_A12172DltFascod[0] ;
         n12172DltFascod = T01J93_n12172DltFascod[0] ;
         A12173DltFasDsc = T01J93_A12173DltFasDsc[0] ;
         n12173DltFasDsc = T01J93_n12173DltFasDsc[0] ;
         A12174DltKgsFs = T01J93_A12174DltKgsFs[0] ;
         n12174DltKgsFs = T01J93_n12174DltKgsFs[0] ;
         A12175DltMtsFs = T01J93_A12175DltMtsFs[0] ;
         n12175DltMtsFs = T01J93_n12175DltMtsFs[0] ;
         A12189DltPrKFs = T01J93_A12189DltPrKFs[0] ;
         n12189DltPrKFs = T01J93_n12189DltPrKFs[0] ;
         A12190DltPrMFs = T01J93_A12190DltPrMFs[0] ;
         n12190DltPrMFs = T01J93_n12190DltPrMFs[0] ;
         A12191DltPrKBFs = T01J93_A12191DltPrKBFs[0] ;
         n12191DltPrKBFs = T01J93_n12191DltPrKBFs[0] ;
         A12192DltPrMBFs = T01J93_A12192DltPrMBFs[0] ;
         n12192DltPrMBFs = T01J93_n12192DltPrMBFs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z12176DltHdr = A12176DltHdr ;
         Z12177DltR = A12177DltR ;
         Z12178DltP = A12178DltP ;
         Z12182DltLin = A12182DltLin ;
         sMode1692 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1J91692( ) ;
         load1J91692( ) ;
         Gx_mode = sMode1692 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1692 = (short)(0) ;
         initializeNonKey1J91692( ) ;
         sMode1692 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1J91692( ) ;
         Gx_mode = sMode1692 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1J91692( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1J91692( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01J92 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, Short.valueOf(A12182DltLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDLT004"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z12172DltFascod, T01J92_A12172DltFascod[0]) != 0 ) || ( GXutil.strcmp(Z12173DltFasDsc, T01J92_A12173DltFasDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z12174DltKgsFs, T01J92_A12174DltKgsFs[0]) != 0 ) || ( DecimalUtil.compareTo(Z12175DltMtsFs, T01J92_A12175DltMtsFs[0]) != 0 ) || ( DecimalUtil.compareTo(Z12189DltPrKFs, T01J92_A12189DltPrKFs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z12190DltPrMFs, T01J92_A12190DltPrMFs[0]) != 0 ) || ( DecimalUtil.compareTo(Z12191DltPrKBFs, T01J92_A12191DltPrKBFs[0]) != 0 ) || ( DecimalUtil.compareTo(Z12192DltPrMBFs, T01J92_A12192DltPrMBFs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z12172DltFascod, T01J92_A12172DltFascod[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltFascod");
               GXutil.writeLogRaw("Old: ",Z12172DltFascod);
               GXutil.writeLogRaw("Current: ",T01J92_A12172DltFascod[0]);
            }
            if ( GXutil.strcmp(Z12173DltFasDsc, T01J92_A12173DltFasDsc[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltFasDsc");
               GXutil.writeLogRaw("Old: ",Z12173DltFasDsc);
               GXutil.writeLogRaw("Current: ",T01J92_A12173DltFasDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z12174DltKgsFs, T01J92_A12174DltKgsFs[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltKgsFs");
               GXutil.writeLogRaw("Old: ",Z12174DltKgsFs);
               GXutil.writeLogRaw("Current: ",T01J92_A12174DltKgsFs[0]);
            }
            if ( DecimalUtil.compareTo(Z12175DltMtsFs, T01J92_A12175DltMtsFs[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltMtsFs");
               GXutil.writeLogRaw("Old: ",Z12175DltMtsFs);
               GXutil.writeLogRaw("Current: ",T01J92_A12175DltMtsFs[0]);
            }
            if ( DecimalUtil.compareTo(Z12189DltPrKFs, T01J92_A12189DltPrKFs[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltPrKFs");
               GXutil.writeLogRaw("Old: ",Z12189DltPrKFs);
               GXutil.writeLogRaw("Current: ",T01J92_A12189DltPrKFs[0]);
            }
            if ( DecimalUtil.compareTo(Z12190DltPrMFs, T01J92_A12190DltPrMFs[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltPrMFs");
               GXutil.writeLogRaw("Old: ",Z12190DltPrMFs);
               GXutil.writeLogRaw("Current: ",T01J92_A12190DltPrMFs[0]);
            }
            if ( DecimalUtil.compareTo(Z12191DltPrKBFs, T01J92_A12191DltPrKBFs[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltPrKBFs");
               GXutil.writeLogRaw("Old: ",Z12191DltPrKBFs);
               GXutil.writeLogRaw("Current: ",T01J92_A12191DltPrKBFs[0]);
            }
            if ( DecimalUtil.compareTo(Z12192DltPrMBFs, T01J92_A12192DltPrMBFs[0]) != 0 )
            {
               GXutil.writeLogln("tdlt001:[seudo value changed for attri]"+"DltPrMBFs");
               GXutil.writeLogRaw("Old: ",Z12192DltPrMBFs);
               GXutil.writeLogRaw("Current: ",T01J92_A12192DltPrMBFs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDLT004"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1J91692( )
   {
      beforeValidate1J91692( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J91692( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1J91692( 0) ;
         checkOptimisticConcurrency1J91692( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J91692( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1J91692( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01J944 */
                  pr_default.execute(42, new Object[] {Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, Short.valueOf(A12182DltLin), Boolean.valueOf(n12172DltFascod), A12172DltFascod, Boolean.valueOf(n12173DltFasDsc), A12173DltFasDsc, Boolean.valueOf(n12174DltKgsFs), A12174DltKgsFs, Boolean.valueOf(n12175DltMtsFs), A12175DltMtsFs, Boolean.valueOf(n12189DltPrKFs), A12189DltPrKFs, Boolean.valueOf(n12190DltPrMFs), A12190DltPrMFs, Boolean.valueOf(n12191DltPrKBFs), A12191DltPrKBFs, Boolean.valueOf(n12192DltPrMBFs), A12192DltPrMBFs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDLT004");
                  if ( (pr_default.getStatus(42) == 1) )
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
            load1J91692( ) ;
         }
         endLevel1J91692( ) ;
      }
      closeExtendedTableCursors1J91692( ) ;
   }

   public void update1J91692( )
   {
      beforeValidate1J91692( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J91692( ) ;
      }
      if ( ( nIsMod_1692 != 0 ) || ( nIsDirty_1692 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1J91692( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1J91692( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1J91692( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01J945 */
                     pr_default.execute(43, new Object[] {Boolean.valueOf(n12172DltFascod), A12172DltFascod, Boolean.valueOf(n12173DltFasDsc), A12173DltFasDsc, Boolean.valueOf(n12174DltKgsFs), A12174DltKgsFs, Boolean.valueOf(n12175DltMtsFs), A12175DltMtsFs, Boolean.valueOf(n12189DltPrKFs), A12189DltPrKFs, Boolean.valueOf(n12190DltPrMFs), A12190DltPrMFs, Boolean.valueOf(n12191DltPrKBFs), A12191DltPrKBFs, Boolean.valueOf(n12192DltPrMBFs), A12192DltPrMBFs, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, Short.valueOf(A12182DltLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDLT004");
                     if ( (pr_default.getStatus(43) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDLT004"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1J91692( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1J91692( ) ;
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
            endLevel1J91692( ) ;
         }
      }
      closeExtendedTableCursors1J91692( ) ;
   }

   public void deferredUpdate1J91692( )
   {
   }

   public void delete1J91692( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1J91692( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J91692( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1J91692( ) ;
         afterConfirm1J91692( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1J91692( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01J946 */
               pr_default.execute(44, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, Short.valueOf(A12182DltLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDLT004");
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
      sMode1692 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1J91692( ) ;
      Gx_mode = sMode1692 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1J91692( )
   {
      standaloneModal1J91692( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1J91692( )
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

   public void scanStart1J91692( )
   {
      /* Scan By routine */
      /* Using cursor T01J947 */
      pr_default.execute(45, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP});
      RcdFound1692 = (short)(0) ;
      if ( (pr_default.getStatus(45) != 101) )
      {
         RcdFound1692 = (short)(1) ;
         A12182DltLin = T01J947_A12182DltLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1J91692( )
   {
      /* Scan next routine */
      pr_default.readNext(45);
      RcdFound1692 = (short)(0) ;
      if ( (pr_default.getStatus(45) != 101) )
      {
         RcdFound1692 = (short)(1) ;
         A12182DltLin = T01J947_A12182DltLin[0] ;
      }
   }

   public void scanEnd1J91692( )
   {
      pr_default.close(45);
   }

   public void afterConfirm1J91692( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1J91692( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1J91692( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1J91692( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1J91692( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1J91692( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1J91692( )
   {
      edtDltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltLin_Enabled), 5, 0), !bGXsfl_222_Refreshing);
      edtDltFascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltFascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltFascod_Enabled), 5, 0), !bGXsfl_222_Refreshing);
      edtDltFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltFasDsc_Enabled), 5, 0), !bGXsfl_222_Refreshing);
      edtDltKgsFs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltKgsFs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltKgsFs_Enabled), 5, 0), !bGXsfl_222_Refreshing);
      edtDltMtsFs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltMtsFs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltMtsFs_Enabled), 5, 0), !bGXsfl_222_Refreshing);
      edtDltPrKFs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltPrKFs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltPrKFs_Enabled), 5, 0), !bGXsfl_222_Refreshing);
      edtDltPrMFs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltPrMFs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltPrMFs_Enabled), 5, 0), !bGXsfl_222_Refreshing);
      edtDltPrKBFs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltPrKBFs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltPrKBFs_Enabled), 5, 0), !bGXsfl_222_Refreshing);
      edtDltPrMBFs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltPrMBFs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltPrMBFs_Enabled), 5, 0), !bGXsfl_222_Refreshing);
   }

   public void send_integrity_lvl_hashes1J91692( )
   {
   }

   public void send_integrity_lvl_hashes1J91688( )
   {
   }

   public void subsflControlProps_1701689( )
   {
      edtavnRcdDeleted_1689_Internalname = "vNRCDDELETED_1689_"+sGXsfl_170_idx ;
      edtDltLinTxt_Internalname = "DLTLINTXT_"+sGXsfl_170_idx ;
      edtDltDsc_Internalname = "DLTDSC_"+sGXsfl_170_idx ;
      edtDltRD_Internalname = "DLTRD_"+sGXsfl_170_idx ;
      edtDltPKg_Internalname = "DLTPKG_"+sGXsfl_170_idx ;
      edtDltKgsTxt_Internalname = "DLTKGSTXT_"+sGXsfl_170_idx ;
      edtDltPMt_Internalname = "DLTPMT_"+sGXsfl_170_idx ;
      edtDltMtsTxt_Internalname = "DLTMTSTXT_"+sGXsfl_170_idx ;
      edtDltImpTxt_Internalname = "DLTIMPTXT_"+sGXsfl_170_idx ;
      edtDltTipTxt_Internalname = "DLTTIPTXT_"+sGXsfl_170_idx ;
      edtDltCodTxt_Internalname = "DLTCODTXT_"+sGXsfl_170_idx ;
      edtDltPzsTxt_Internalname = "DLTPZSTXT_"+sGXsfl_170_idx ;
   }

   public void subsflControlProps_fel_1701689( )
   {
      edtavnRcdDeleted_1689_Internalname = "vNRCDDELETED_1689_"+sGXsfl_170_fel_idx ;
      edtDltLinTxt_Internalname = "DLTLINTXT_"+sGXsfl_170_fel_idx ;
      edtDltDsc_Internalname = "DLTDSC_"+sGXsfl_170_fel_idx ;
      edtDltRD_Internalname = "DLTRD_"+sGXsfl_170_fel_idx ;
      edtDltPKg_Internalname = "DLTPKG_"+sGXsfl_170_fel_idx ;
      edtDltKgsTxt_Internalname = "DLTKGSTXT_"+sGXsfl_170_fel_idx ;
      edtDltPMt_Internalname = "DLTPMT_"+sGXsfl_170_fel_idx ;
      edtDltMtsTxt_Internalname = "DLTMTSTXT_"+sGXsfl_170_fel_idx ;
      edtDltImpTxt_Internalname = "DLTIMPTXT_"+sGXsfl_170_fel_idx ;
      edtDltTipTxt_Internalname = "DLTTIPTXT_"+sGXsfl_170_fel_idx ;
      edtDltCodTxt_Internalname = "DLTCODTXT_"+sGXsfl_170_fel_idx ;
      edtDltPzsTxt_Internalname = "DLTPZSTXT_"+sGXsfl_170_fel_idx ;
   }

   public void addRow1J91689( )
   {
      nGXsfl_170_idx = (int)(nGXsfl_170_idx+1) ;
      sGXsfl_170_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_170_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1701689( ) ;
      sendRow1J91689( ) ;
   }

   public void sendRow1J91689( )
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
         if ( ((int)((nGXsfl_170_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1689_" + sGXsfl_170_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 171,'',false,'" + sGXsfl_170_idx + "',170)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1689_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1689, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1689_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1689), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1689), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,171);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1689_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1689_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(170),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1689_" + sGXsfl_170_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 172,'',false,'" + sGXsfl_170_idx + "',170)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltLinTxt_Internalname,GXutil.ltrim( localUtil.ntoc( A12179DltLinTxt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12179DltLinTxt), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,172);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltLinTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDltLinTxt_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(170),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1689_" + sGXsfl_170_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 173,'',false,'" + sGXsfl_170_idx + "',170)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltDsc_Internalname,GXutil.rtrim( A12165DltDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,173);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDltDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(170),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1689_" + sGXsfl_170_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 174,'',false,'" + sGXsfl_170_idx + "',170)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltRD_Internalname,GXutil.ltrim( localUtil.ntoc( A12288DltRD, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDltRD_Enabled!=0) ? localUtil.format( A12288DltRD, "ZZ9.99") : localUtil.format( A12288DltRD, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,174);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltRD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDltRD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(170),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1689_" + sGXsfl_170_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 175,'',false,'" + sGXsfl_170_idx + "',170)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltPKg_Internalname,GXutil.ltrim( localUtil.ntoc( A12289DltPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDltPKg_Enabled!=0) ? localUtil.format( A12289DltPKg, "ZZZZZZ9.99999") : localUtil.format( A12289DltPKg, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,175);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltPKg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDltPKg_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(170),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1689_" + sGXsfl_170_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 176,'',false,'" + sGXsfl_170_idx + "',170)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltKgsTxt_Internalname,GXutil.ltrim( localUtil.ntoc( A12291DltKgsTxt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDltKgsTxt_Enabled!=0) ? localUtil.format( A12291DltKgsTxt, "ZZZZZ9.99") : localUtil.format( A12291DltKgsTxt, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,176);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltKgsTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDltKgsTxt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(170),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1689_" + sGXsfl_170_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 177,'',false,'" + sGXsfl_170_idx + "',170)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltPMt_Internalname,GXutil.ltrim( localUtil.ntoc( A12290DltPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDltPMt_Enabled!=0) ? localUtil.format( A12290DltPMt, "ZZZZZZ9.99999") : localUtil.format( A12290DltPMt, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,177);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltPMt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDltPMt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(170),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1689_" + sGXsfl_170_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 178,'',false,'" + sGXsfl_170_idx + "',170)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltMtsTxt_Internalname,GXutil.ltrim( localUtil.ntoc( A12292DltMtsTxt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDltMtsTxt_Enabled!=0) ? localUtil.format( A12292DltMtsTxt, "ZZZZZ9.99") : localUtil.format( A12292DltMtsTxt, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,178);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltMtsTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDltMtsTxt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(170),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1689_" + sGXsfl_170_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 179,'',false,'" + sGXsfl_170_idx + "',170)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltImpTxt_Internalname,GXutil.ltrim( localUtil.ntoc( A12293DltImpTxt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDltImpTxt_Enabled!=0) ? localUtil.format( A12293DltImpTxt, "ZZZZZZ9.99") : localUtil.format( A12293DltImpTxt, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,179);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltImpTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDltImpTxt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(170),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1689_" + sGXsfl_170_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 180,'',false,'" + sGXsfl_170_idx + "',170)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltTipTxt_Internalname,GXutil.rtrim( A12294DltTipTxt),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,180);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltTipTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDltTipTxt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(170),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1689_" + sGXsfl_170_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 181,'',false,'" + sGXsfl_170_idx + "',170)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltCodTxt_Internalname,GXutil.rtrim( A12295DltCodTxt),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,181);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltCodTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDltCodTxt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(170),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1689_" + sGXsfl_170_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 182,'',false,'" + sGXsfl_170_idx + "',170)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltPzsTxt_Internalname,GXutil.ltrim( localUtil.ntoc( A12296DltPzsTxt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDltPzsTxt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12296DltPzsTxt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12296DltPzsTxt), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,182);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltPzsTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDltPzsTxt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(170),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1J91689( ) ;
      GXCCtl = "Z12179DltLinTxt_" + sGXsfl_170_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12179DltLinTxt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12165DltDsc_" + sGXsfl_170_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12165DltDsc));
      GXCCtl = "Z12288DltRD_" + sGXsfl_170_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12288DltRD, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12289DltPKg_" + sGXsfl_170_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12289DltPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12291DltKgsTxt_" + sGXsfl_170_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12291DltKgsTxt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12290DltPMt_" + sGXsfl_170_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12290DltPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12292DltMtsTxt_" + sGXsfl_170_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12292DltMtsTxt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12293DltImpTxt_" + sGXsfl_170_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12293DltImpTxt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12294DltTipTxt_" + sGXsfl_170_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12294DltTipTxt));
      GXCCtl = "Z12295DltCodTxt_" + sGXsfl_170_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12295DltCodTxt));
      GXCCtl = "Z12296DltPzsTxt_" + sGXsfl_170_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12296DltPzsTxt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1689_" + sGXsfl_170_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1689, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1689_" + sGXsfl_170_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1689, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1689_" + sGXsfl_170_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1689, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1689_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1689_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTLINTXT_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltLinTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTDSC_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTRD_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltRD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTPKG_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPKg_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTKGSTXT_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltKgsTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTPMT_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPMt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTMTSTXT_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltMtsTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTIMPTXT_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltImpTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTTIPTXT_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltTipTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTCODTXT_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltCodTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTPZSTXT_"+sGXsfl_170_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPzsTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1J91689( )
   {
      nGXsfl_170_idx = (int)(nGXsfl_170_idx+1) ;
      sGXsfl_170_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_170_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1701689( ) ;
      edtavnRcdDeleted_1689_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1689_"+sGXsfl_170_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltLinTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTLINTXT_"+sGXsfl_170_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTDSC_"+sGXsfl_170_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltRD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTRD_"+sGXsfl_170_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltPKg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTPKG_"+sGXsfl_170_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltKgsTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTKGSTXT_"+sGXsfl_170_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltPMt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTPMT_"+sGXsfl_170_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltMtsTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTMTSTXT_"+sGXsfl_170_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltImpTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTIMPTXT_"+sGXsfl_170_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltTipTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTTIPTXT_"+sGXsfl_170_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltCodTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTCODTXT_"+sGXsfl_170_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltPzsTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTPZSTXT_"+sGXsfl_170_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1689_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1689_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1689");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1689_Internalname ;
         wbErr = true ;
         nRcdDeleted_1689 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1689 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1689_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDltLinTxt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDltLinTxt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DLTLINTXT_" + sGXsfl_170_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDltLinTxt_Internalname ;
         wbErr = true ;
         A12179DltLinTxt = (short)(0) ;
      }
      else
      {
         A12179DltLinTxt = (short)(localUtil.ctol( httpContext.cgiGet( edtDltLinTxt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A12165DltDsc = httpContext.cgiGet( edtDltDsc_Internalname) ;
      n12165DltDsc = false ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltRD_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltRD_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "DLTRD_" + sGXsfl_170_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDltRD_Internalname ;
         wbErr = true ;
         A12288DltRD = DecimalUtil.ZERO ;
         n12288DltRD = false ;
      }
      else
      {
         A12288DltRD = localUtil.ctond( httpContext.cgiGet( edtDltRD_Internalname)) ;
         n12288DltRD = false ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltPKg_Internalname)), DecimalUtil.stringToDec("-999999.99999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltPKg_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "DLTPKG_" + sGXsfl_170_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDltPKg_Internalname ;
         wbErr = true ;
         A12289DltPKg = DecimalUtil.ZERO ;
         n12289DltPKg = false ;
      }
      else
      {
         A12289DltPKg = localUtil.ctond( httpContext.cgiGet( edtDltPKg_Internalname)) ;
         n12289DltPKg = false ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltKgsTxt_Internalname)), DecimalUtil.stringToDec("-99999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltKgsTxt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "DLTKGSTXT_" + sGXsfl_170_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDltKgsTxt_Internalname ;
         wbErr = true ;
         A12291DltKgsTxt = DecimalUtil.ZERO ;
         n12291DltKgsTxt = false ;
      }
      else
      {
         A12291DltKgsTxt = localUtil.ctond( httpContext.cgiGet( edtDltKgsTxt_Internalname)) ;
         n12291DltKgsTxt = false ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltPMt_Internalname)), DecimalUtil.stringToDec("-999999.99999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltPMt_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "DLTPMT_" + sGXsfl_170_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDltPMt_Internalname ;
         wbErr = true ;
         A12290DltPMt = DecimalUtil.ZERO ;
         n12290DltPMt = false ;
      }
      else
      {
         A12290DltPMt = localUtil.ctond( httpContext.cgiGet( edtDltPMt_Internalname)) ;
         n12290DltPMt = false ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltMtsTxt_Internalname)), DecimalUtil.stringToDec("-99999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltMtsTxt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "DLTMTSTXT_" + sGXsfl_170_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDltMtsTxt_Internalname ;
         wbErr = true ;
         A12292DltMtsTxt = DecimalUtil.ZERO ;
         n12292DltMtsTxt = false ;
      }
      else
      {
         A12292DltMtsTxt = localUtil.ctond( httpContext.cgiGet( edtDltMtsTxt_Internalname)) ;
         n12292DltMtsTxt = false ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltImpTxt_Internalname)), DecimalUtil.stringToDec("-999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltImpTxt_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "DLTIMPTXT_" + sGXsfl_170_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDltImpTxt_Internalname ;
         wbErr = true ;
         A12293DltImpTxt = DecimalUtil.ZERO ;
         n12293DltImpTxt = false ;
      }
      else
      {
         A12293DltImpTxt = localUtil.ctond( httpContext.cgiGet( edtDltImpTxt_Internalname)) ;
         n12293DltImpTxt = false ;
      }
      A12294DltTipTxt = httpContext.cgiGet( edtDltTipTxt_Internalname) ;
      n12294DltTipTxt = false ;
      A12295DltCodTxt = httpContext.cgiGet( edtDltCodTxt_Internalname) ;
      n12295DltCodTxt = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDltPzsTxt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDltPzsTxt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "DLTPZSTXT_" + sGXsfl_170_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDltPzsTxt_Internalname ;
         wbErr = true ;
         A12296DltPzsTxt = 0 ;
         n12296DltPzsTxt = false ;
      }
      else
      {
         A12296DltPzsTxt = (int)(localUtil.ctol( httpContext.cgiGet( edtDltPzsTxt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12296DltPzsTxt = false ;
      }
      GXCCtl = "Z12179DltLinTxt_" + sGXsfl_170_idx ;
      Z12179DltLinTxt = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12165DltDsc_" + sGXsfl_170_idx ;
      Z12165DltDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12288DltRD_" + sGXsfl_170_idx ;
      Z12288DltRD = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12289DltPKg_" + sGXsfl_170_idx ;
      Z12289DltPKg = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12291DltKgsTxt_" + sGXsfl_170_idx ;
      Z12291DltKgsTxt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12290DltPMt_" + sGXsfl_170_idx ;
      Z12290DltPMt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12292DltMtsTxt_" + sGXsfl_170_idx ;
      Z12292DltMtsTxt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12293DltImpTxt_" + sGXsfl_170_idx ;
      Z12293DltImpTxt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12294DltTipTxt_" + sGXsfl_170_idx ;
      Z12294DltTipTxt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12295DltCodTxt_" + sGXsfl_170_idx ;
      Z12295DltCodTxt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12296DltPzsTxt_" + sGXsfl_170_idx ;
      Z12296DltPzsTxt = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1689_" + sGXsfl_170_idx ;
      nRcdDeleted_1689 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1689_" + sGXsfl_170_idx ;
      nRcdExists_1689 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1689_" + sGXsfl_170_idx ;
      nIsMod_1689 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1861690( )
   {
      lblTextblock31_Internalname = "TEXTBLOCK31_"+sGXsfl_186_idx ;
      edtDltNPieza_Internalname = "DLTNPIEZA_"+sGXsfl_186_idx ;
      lblTextblock32_Internalname = "TEXTBLOCK32_"+sGXsfl_186_idx ;
      edtDltKgsPz_Internalname = "DLTKGSPZ_"+sGXsfl_186_idx ;
      lblTextblock33_Internalname = "TEXTBLOCK33_"+sGXsfl_186_idx ;
      edtDltMtsPz_Internalname = "DLTMTSPZ_"+sGXsfl_186_idx ;
      lblTextblock34_Internalname = "TEXTBLOCK34_"+sGXsfl_186_idx ;
      edtDltAncPz_Internalname = "DLTANCPZ_"+sGXsfl_186_idx ;
      subGrid3_Internalname = "GRID3_"+sGXsfl_186_idx ;
   }

   public void subsflControlProps_fel_1861690( )
   {
      lblTextblock31_Internalname = "TEXTBLOCK31_"+sGXsfl_186_fel_idx ;
      edtDltNPieza_Internalname = "DLTNPIEZA_"+sGXsfl_186_fel_idx ;
      lblTextblock32_Internalname = "TEXTBLOCK32_"+sGXsfl_186_fel_idx ;
      edtDltKgsPz_Internalname = "DLTKGSPZ_"+sGXsfl_186_fel_idx ;
      lblTextblock33_Internalname = "TEXTBLOCK33_"+sGXsfl_186_fel_idx ;
      edtDltMtsPz_Internalname = "DLTMTSPZ_"+sGXsfl_186_fel_idx ;
      lblTextblock34_Internalname = "TEXTBLOCK34_"+sGXsfl_186_fel_idx ;
      edtDltAncPz_Internalname = "DLTANCPZ_"+sGXsfl_186_fel_idx ;
      subGrid3_Internalname = "GRID3_"+sGXsfl_186_fel_idx ;
   }

   public void addRow1J91690( )
   {
      nRC_GXsfl_213 = 0 ;
      nGXsfl_186_idx = (int)(nGXsfl_186_idx+1) ;
      sGXsfl_186_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_186_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1861690( ) ;
      sendRow1J91690( ) ;
   }

   public void sendRow1J91690( )
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
         if ( ((int)((nGXsfl_186_idx) % (2))) == 0 )
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
      /* Start of Columns property logic. */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGrid2_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_186_idx+"\">") ;
      }
      if ( GRID2_IsPaging == 0 )
      {
         GXCCtl = "GRID3_nFirstRecordOnPage_" + sGXsfl_186_idx ;
         GRID3_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID3_nFirstRecordOnPage = 0 ;
      }
      Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid2_Linesclass,""});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid2Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_186_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid2Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock31_Internalname,httpContext.getMessage( "Pieza", ""),"","",lblTextblock31_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1690_" + sGXsfl_186_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 194,'',false,'" + sGXsfl_186_idx + "',186)\"" ;
      ROClassString = "" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltNPieza_Internalname,GXutil.rtrim( A12180DltNPieza),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,194);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltNPieza_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDltNPieza_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(9),"chr",Integer.valueOf(1),"row",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(186),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid2Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock32_Internalname,httpContext.getMessage( "Kilos", ""),"","",lblTextblock32_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1690_" + sGXsfl_186_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 199,'',false,'" + sGXsfl_186_idx + "',186)\"" ;
      ROClassString = "" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltKgsPz_Internalname,GXutil.ltrim( localUtil.ntoc( A12166DltKgsPz, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDltKgsPz_Enabled!=0) ? localUtil.format( A12166DltKgsPz, "ZZZZZ9.99") : localUtil.format( A12166DltKgsPz, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,199);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltKgsPz_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDltKgsPz_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(9),"chr",Integer.valueOf(1),"row",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(186),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid2Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock33_Internalname,httpContext.getMessage( "Metros", ""),"","",lblTextblock33_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1690_" + sGXsfl_186_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 204,'',false,'" + sGXsfl_186_idx + "',186)\"" ;
      ROClassString = "" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltMtsPz_Internalname,GXutil.ltrim( localUtil.ntoc( A12167DltMtsPz, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDltMtsPz_Enabled!=0) ? localUtil.format( A12167DltMtsPz, "ZZZZZ9.99") : localUtil.format( A12167DltMtsPz, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,204);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltMtsPz_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDltMtsPz_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(9),"chr",Integer.valueOf(1),"row",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(186),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid2Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock34_Internalname,httpContext.getMessage( "Ancho", ""),"","",lblTextblock34_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1690_" + sGXsfl_186_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 209,'',false,'" + sGXsfl_186_idx + "',186)\"" ;
      ROClassString = "" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltAncPz_Internalname,GXutil.ltrim( localUtil.ntoc( A12168DltAncPz, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDltAncPz_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12168DltAncPz), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12168DltAncPz), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,209);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltAncPz_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDltAncPz_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(186),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid2Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid2Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /*  Child Grid Control  */
      Grid2Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Grid3Container"});
      if ( isAjaxCallMode( ) )
      {
         Grid3Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Grid3Container.Clear();
      }
      startgridcontrol213( ) ;
      nGXsfl_213_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1691 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1691 = (short)(1) ;
            scanStart1J91691( ) ;
            while ( RcdFound1691 != 0 )
            {
               init_level_properties1691( ) ;
               getByPrimaryKey1J91691( ) ;
               addRow1J91691( ) ;
               scanNext1J91691( ) ;
            }
            scanEnd1J91691( ) ;
            nBlankRcdCount1691 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1J91691( ) ;
         standaloneModal1J91691( ) ;
         sMode1691 = Gx_mode ;
         while ( nGXsfl_213_idx < nRC_GXsfl_213 )
         {
            bGXsfl_213_Refreshing = true ;
            readRow1J91691( ) ;
            edtavnRcdDeleted_1691_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1691_"+sGXsfl_213_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1691_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1691_Enabled), 5, 0), !bGXsfl_213_Refreshing);
            edtDltNTrozo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTNTROZO_"+sGXsfl_213_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltNTrozo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltNTrozo_Enabled), 5, 0), !bGXsfl_213_Refreshing);
            edtDltKgsTrz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTKGSTRZ_"+sGXsfl_213_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltKgsTrz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltKgsTrz_Enabled), 5, 0), !bGXsfl_213_Refreshing);
            edtDltMtsTrz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTMTSTRZ_"+sGXsfl_213_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltMtsTrz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltMtsTrz_Enabled), 5, 0), !bGXsfl_213_Refreshing);
            edtDltAncTrz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTANCTRZ_"+sGXsfl_213_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDltAncTrz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltAncTrz_Enabled), 5, 0), !bGXsfl_213_Refreshing);
            if ( ( nRcdExists_1691 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1J91691( ) ;
            }
            sendRow1J91691( ) ;
            bGXsfl_213_Refreshing = false ;
         }
         Gx_mode = sMode1691 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1691 = (short)(5) ;
         nRcdExists_1691 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1J91691( ) ;
            while ( RcdFound1691 != 0 )
            {
               sGXsfl_213_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_213_idx+1), 4, 0), (short)(4), "0") + sGXsfl_186_idx ;
               subsflControlProps_2131691( ) ;
               init_level_properties1691( ) ;
               standaloneNotModal1J91691( ) ;
               getByPrimaryKey1J91691( ) ;
               standaloneModal1J91691( ) ;
               addRow1J91691( ) ;
               scanNext1J91691( ) ;
            }
            scanEnd1J91691( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1691 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_213_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_213_idx+1), 4, 0), (short)(4), "0") + sGXsfl_186_idx ;
      subsflControlProps_2131691( ) ;
      initAll1J91691( ) ;
      init_level_properties1691( ) ;
      nRcdExists_1691 = (short)(0) ;
      nIsMod_1691 = (short)(0) ;
      nRcdDeleted_1691 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 186 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_186_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1691 = (short)(nBlankRcdUsr1691+nBlankRcdCount1691) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1691 > 0 )
      {
         standaloneNotModal1J91691( ) ;
         standaloneModal1J91691( ) ;
         addRow1J91691( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDltNTrozo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1691 = (short)(nBlankRcdCount1691-1) ;
      }
      Gx_mode = sMode1691 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid3ContainerData"+"_"+sGXsfl_186_idx, Grid3Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid2Row.AddGrid("Grid3", Grid3Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid3ContainerData"+"V_"+sGXsfl_186_idx, Grid3Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid3ContainerData"+"V_"+sGXsfl_186_idx+"\" value='"+Grid3Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes1J91690( ) ;
      GXCCtl = "Z12180DltNPieza_" + sGXsfl_186_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12180DltNPieza));
      GXCCtl = "Z12166DltKgsPz_" + sGXsfl_186_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12166DltKgsPz, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12167DltMtsPz_" + sGXsfl_186_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12167DltMtsPz, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12168DltAncPz_" + sGXsfl_186_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12168DltAncPz, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_213_" + sGXsfl_186_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_213_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1690_" + sGXsfl_186_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1690, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1690_" + sGXsfl_186_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1690, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1690_" + sGXsfl_186_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1690, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTNPIEZA_"+sGXsfl_186_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltNPieza_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTKGSPZ_"+sGXsfl_186_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltKgsPz_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTMTSPZ_"+sGXsfl_186_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltMtsPz_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTANCPZ_"+sGXsfl_186_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltAncPz_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID3_nFirstRecordOnPage = 0 ;
      GRID3_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_186_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow1J91690( )
   {
      nGXsfl_186_idx = (int)(nGXsfl_186_idx+1) ;
      sGXsfl_186_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_186_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1861690( ) ;
      edtDltNPieza_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTNPIEZA_"+sGXsfl_186_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltKgsPz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTKGSPZ_"+sGXsfl_186_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltMtsPz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTMTSPZ_"+sGXsfl_186_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltAncPz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTANCPZ_"+sGXsfl_186_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A12180DltNPieza = httpContext.cgiGet( edtDltNPieza_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDltKgsPz_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltKgsPz_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "DLTKGSPZ_" + sGXsfl_186_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDltKgsPz_Internalname ;
         wbErr = true ;
         A12166DltKgsPz = DecimalUtil.ZERO ;
         n12166DltKgsPz = false ;
      }
      else
      {
         A12166DltKgsPz = localUtil.ctond( httpContext.cgiGet( edtDltKgsPz_Internalname)) ;
         n12166DltKgsPz = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDltMtsPz_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltMtsPz_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "DLTMTSPZ_" + sGXsfl_186_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDltMtsPz_Internalname ;
         wbErr = true ;
         A12167DltMtsPz = DecimalUtil.ZERO ;
         n12167DltMtsPz = false ;
      }
      else
      {
         A12167DltMtsPz = localUtil.ctond( httpContext.cgiGet( edtDltMtsPz_Internalname)) ;
         n12167DltMtsPz = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDltAncPz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDltAncPz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DLTANCPZ_" + sGXsfl_186_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDltAncPz_Internalname ;
         wbErr = true ;
         A12168DltAncPz = (short)(0) ;
         n12168DltAncPz = false ;
      }
      else
      {
         A12168DltAncPz = (short)(localUtil.ctol( httpContext.cgiGet( edtDltAncPz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12168DltAncPz = false ;
      }
      GXCCtl = "Z12180DltNPieza_" + sGXsfl_186_idx ;
      Z12180DltNPieza = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12166DltKgsPz_" + sGXsfl_186_idx ;
      Z12166DltKgsPz = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12167DltMtsPz_" + sGXsfl_186_idx ;
      Z12167DltMtsPz = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12168DltAncPz_" + sGXsfl_186_idx ;
      Z12168DltAncPz = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_213_" + sGXsfl_186_idx ;
      nRC_GXsfl_213 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1690_" + sGXsfl_186_idx ;
      nRcdDeleted_1690 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1690_" + sGXsfl_186_idx ;
      nRcdExists_1690 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1690_" + sGXsfl_186_idx ;
      nIsMod_1690 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_213_" + sGXsfl_186_idx ;
      nRC_GXsfl_213 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_2131691( )
   {
      edtavnRcdDeleted_1691_Internalname = "vNRCDDELETED_1691_"+sGXsfl_213_idx ;
      edtDltNTrozo_Internalname = "DLTNTROZO_"+sGXsfl_213_idx ;
      edtDltKgsTrz_Internalname = "DLTKGSTRZ_"+sGXsfl_213_idx ;
      edtDltMtsTrz_Internalname = "DLTMTSTRZ_"+sGXsfl_213_idx ;
      edtDltAncTrz_Internalname = "DLTANCTRZ_"+sGXsfl_213_idx ;
   }

   public void subsflControlProps_fel_2131691( )
   {
      edtavnRcdDeleted_1691_Internalname = "vNRCDDELETED_1691_"+sGXsfl_213_fel_idx ;
      edtDltNTrozo_Internalname = "DLTNTROZO_"+sGXsfl_213_fel_idx ;
      edtDltKgsTrz_Internalname = "DLTKGSTRZ_"+sGXsfl_213_fel_idx ;
      edtDltMtsTrz_Internalname = "DLTMTSTRZ_"+sGXsfl_213_fel_idx ;
      edtDltAncTrz_Internalname = "DLTANCTRZ_"+sGXsfl_213_fel_idx ;
   }

   public void addRow1J91691( )
   {
      nGXsfl_213_idx = (int)(nGXsfl_213_idx+1) ;
      sGXsfl_213_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_213_idx), 4, 0), (short)(4), "0") + sGXsfl_186_idx ;
      subsflControlProps_2131691( ) ;
      sendRow1J91691( ) ;
   }

   public void sendRow1J91691( )
   {
      Grid3Row = GXWebRow.GetNew(context) ;
      if ( subGrid3_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid3_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
         {
            subGrid3_Linesclass = subGrid3_Class+"Odd" ;
         }
      }
      else if ( subGrid3_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid3_Backstyle = (byte)(0) ;
         subGrid3_Backcolor = subGrid3_Allbackcolor ;
         if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
         {
            subGrid3_Linesclass = subGrid3_Class+"Uniform" ;
         }
      }
      else if ( subGrid3_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid3_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
         {
            subGrid3_Linesclass = subGrid3_Class+"Odd" ;
         }
         subGrid3_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid3_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid3_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_213_idx) % (2))) == 0 )
         {
            subGrid3_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
            {
               subGrid3_Linesclass = subGrid3_Class+"Even" ;
            }
         }
         else
         {
            subGrid3_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid3_Class, "") != 0 )
            {
               subGrid3_Linesclass = subGrid3_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1691_" + sGXsfl_213_idx + "',1);gx.fn.setControlValue('nIsMod_1690_" + sGXsfl_186_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 214,'',false,'" + sGXsfl_213_idx + "',213)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1691_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1691, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1691_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1691), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1691), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,214);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1691_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1691_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(213),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1691_" + sGXsfl_213_idx + "',1);gx.fn.setControlValue('nIsMod_1690_" + sGXsfl_186_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 215,'',false,'" + sGXsfl_213_idx + "',213)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltNTrozo_Internalname,GXutil.ltrim( localUtil.ntoc( A12181DltNTrozo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12181DltNTrozo), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,215);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltNTrozo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDltNTrozo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(213),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1691_" + sGXsfl_213_idx + "',1);gx.fn.setControlValue('nIsMod_1690_" + sGXsfl_186_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 216,'',false,'" + sGXsfl_213_idx + "',213)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltKgsTrz_Internalname,GXutil.ltrim( localUtil.ntoc( A12169DltKgsTrz, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDltKgsTrz_Enabled!=0) ? localUtil.format( A12169DltKgsTrz, "ZZZZZ9.99") : localUtil.format( A12169DltKgsTrz, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,216);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltKgsTrz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDltKgsTrz_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(213),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1691_" + sGXsfl_213_idx + "',1);gx.fn.setControlValue('nIsMod_1690_" + sGXsfl_186_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 217,'',false,'" + sGXsfl_213_idx + "',213)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltMtsTrz_Internalname,GXutil.ltrim( localUtil.ntoc( A12170DltMtsTrz, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDltMtsTrz_Enabled!=0) ? localUtil.format( A12170DltMtsTrz, "ZZZZZ9.99") : localUtil.format( A12170DltMtsTrz, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,217);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltMtsTrz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDltMtsTrz_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(213),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1691_" + sGXsfl_213_idx + "',1);gx.fn.setControlValue('nIsMod_1690_" + sGXsfl_186_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 218,'',false,'" + sGXsfl_213_idx + "',213)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltAncTrz_Internalname,GXutil.ltrim( localUtil.ntoc( A12171DltAncTrz, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDltAncTrz_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12171DltAncTrz), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12171DltAncTrz), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,218);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltAncTrz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDltAncTrz_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(213),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid3Row);
      send_integrity_lvl_hashes1J91691( ) ;
      GXCCtl = "Z12181DltNTrozo_" + sGXsfl_213_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12181DltNTrozo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12169DltKgsTrz_" + sGXsfl_213_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12169DltKgsTrz, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12170DltMtsTrz_" + sGXsfl_213_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12170DltMtsTrz, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12171DltAncTrz_" + sGXsfl_213_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12171DltAncTrz, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1691_" + sGXsfl_213_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1691, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1691_" + sGXsfl_213_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1691, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1691_" + sGXsfl_213_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1691, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1691_"+sGXsfl_213_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1691_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTNTROZO_"+sGXsfl_213_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltNTrozo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTKGSTRZ_"+sGXsfl_213_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltKgsTrz_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTMTSTRZ_"+sGXsfl_213_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltMtsTrz_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTANCTRZ_"+sGXsfl_213_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltAncTrz_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid3Container.AddRow(Grid3Row);
   }

   public void readRow1J91691( )
   {
      nGXsfl_213_idx = (int)(nGXsfl_213_idx+1) ;
      sGXsfl_213_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_213_idx), 4, 0), (short)(4), "0") + sGXsfl_186_idx ;
      subsflControlProps_2131691( ) ;
      edtavnRcdDeleted_1691_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1691_"+sGXsfl_213_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltNTrozo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTNTROZO_"+sGXsfl_213_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltKgsTrz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTKGSTRZ_"+sGXsfl_213_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltMtsTrz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTMTSTRZ_"+sGXsfl_213_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltAncTrz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTANCTRZ_"+sGXsfl_213_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1691_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1691_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1691");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1691_Internalname ;
         wbErr = true ;
         nRcdDeleted_1691 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1691 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1691_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDltNTrozo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDltNTrozo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DLTNTROZO_" + sGXsfl_213_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDltNTrozo_Internalname ;
         wbErr = true ;
         A12181DltNTrozo = (short)(0) ;
      }
      else
      {
         A12181DltNTrozo = (short)(localUtil.ctol( httpContext.cgiGet( edtDltNTrozo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDltKgsTrz_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltKgsTrz_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "DLTKGSTRZ_" + sGXsfl_213_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDltKgsTrz_Internalname ;
         wbErr = true ;
         A12169DltKgsTrz = DecimalUtil.ZERO ;
         n12169DltKgsTrz = false ;
      }
      else
      {
         A12169DltKgsTrz = localUtil.ctond( httpContext.cgiGet( edtDltKgsTrz_Internalname)) ;
         n12169DltKgsTrz = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDltMtsTrz_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltMtsTrz_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "DLTMTSTRZ_" + sGXsfl_213_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDltMtsTrz_Internalname ;
         wbErr = true ;
         A12170DltMtsTrz = DecimalUtil.ZERO ;
         n12170DltMtsTrz = false ;
      }
      else
      {
         A12170DltMtsTrz = localUtil.ctond( httpContext.cgiGet( edtDltMtsTrz_Internalname)) ;
         n12170DltMtsTrz = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDltAncTrz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDltAncTrz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DLTANCTRZ_" + sGXsfl_213_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDltAncTrz_Internalname ;
         wbErr = true ;
         A12171DltAncTrz = (short)(0) ;
         n12171DltAncTrz = false ;
      }
      else
      {
         A12171DltAncTrz = (short)(localUtil.ctol( httpContext.cgiGet( edtDltAncTrz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12171DltAncTrz = false ;
      }
      GXCCtl = "Z12181DltNTrozo_" + sGXsfl_213_idx ;
      Z12181DltNTrozo = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12169DltKgsTrz_" + sGXsfl_213_idx ;
      Z12169DltKgsTrz = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12170DltMtsTrz_" + sGXsfl_213_idx ;
      Z12170DltMtsTrz = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12171DltAncTrz_" + sGXsfl_213_idx ;
      Z12171DltAncTrz = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1691_" + sGXsfl_213_idx ;
      nRcdDeleted_1691 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1691_" + sGXsfl_213_idx ;
      nRcdExists_1691 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1691_" + sGXsfl_213_idx ;
      nIsMod_1691 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_2221692( )
   {
      edtavnRcdDeleted_1692_Internalname = "vNRCDDELETED_1692_"+sGXsfl_222_idx ;
      edtDltLin_Internalname = "DLTLIN_"+sGXsfl_222_idx ;
      edtDltFascod_Internalname = "DLTFASCOD_"+sGXsfl_222_idx ;
      edtDltFasDsc_Internalname = "DLTFASDSC_"+sGXsfl_222_idx ;
      edtDltKgsFs_Internalname = "DLTKGSFS_"+sGXsfl_222_idx ;
      edtDltMtsFs_Internalname = "DLTMTSFS_"+sGXsfl_222_idx ;
      edtDltPrKFs_Internalname = "DLTPRKFS_"+sGXsfl_222_idx ;
      edtDltPrMFs_Internalname = "DLTPRMFS_"+sGXsfl_222_idx ;
      edtDltPrKBFs_Internalname = "DLTPRKBFS_"+sGXsfl_222_idx ;
      edtDltPrMBFs_Internalname = "DLTPRMBFS_"+sGXsfl_222_idx ;
   }

   public void subsflControlProps_fel_2221692( )
   {
      edtavnRcdDeleted_1692_Internalname = "vNRCDDELETED_1692_"+sGXsfl_222_fel_idx ;
      edtDltLin_Internalname = "DLTLIN_"+sGXsfl_222_fel_idx ;
      edtDltFascod_Internalname = "DLTFASCOD_"+sGXsfl_222_fel_idx ;
      edtDltFasDsc_Internalname = "DLTFASDSC_"+sGXsfl_222_fel_idx ;
      edtDltKgsFs_Internalname = "DLTKGSFS_"+sGXsfl_222_fel_idx ;
      edtDltMtsFs_Internalname = "DLTMTSFS_"+sGXsfl_222_fel_idx ;
      edtDltPrKFs_Internalname = "DLTPRKFS_"+sGXsfl_222_fel_idx ;
      edtDltPrMFs_Internalname = "DLTPRMFS_"+sGXsfl_222_fel_idx ;
      edtDltPrKBFs_Internalname = "DLTPRKBFS_"+sGXsfl_222_fel_idx ;
      edtDltPrMBFs_Internalname = "DLTPRMBFS_"+sGXsfl_222_fel_idx ;
   }

   public void addRow1J91692( )
   {
      nGXsfl_222_idx = (int)(nGXsfl_222_idx+1) ;
      sGXsfl_222_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_222_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2221692( ) ;
      sendRow1J91692( ) ;
   }

   public void sendRow1J91692( )
   {
      Grid4Row = GXWebRow.GetNew(context) ;
      if ( subGrid4_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid4_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
         {
            subGrid4_Linesclass = subGrid4_Class+"Odd" ;
         }
      }
      else if ( subGrid4_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid4_Backstyle = (byte)(0) ;
         subGrid4_Backcolor = subGrid4_Allbackcolor ;
         if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
         {
            subGrid4_Linesclass = subGrid4_Class+"Uniform" ;
         }
      }
      else if ( subGrid4_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid4_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
         {
            subGrid4_Linesclass = subGrid4_Class+"Odd" ;
         }
         subGrid4_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid4_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid4_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_222_idx) % (2))) == 0 )
         {
            subGrid4_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
            {
               subGrid4_Linesclass = subGrid4_Class+"Even" ;
            }
         }
         else
         {
            subGrid4_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid4_Class, "") != 0 )
            {
               subGrid4_Linesclass = subGrid4_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1692_" + sGXsfl_222_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 223,'',false,'" + sGXsfl_222_idx + "',222)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1692_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1692, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1692_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1692), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1692), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,223);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1692_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1692_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(222),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1692_" + sGXsfl_222_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 224,'',false,'" + sGXsfl_222_idx + "',222)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltLin_Internalname,GXutil.ltrim( localUtil.ntoc( A12182DltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12182DltLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,224);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDltLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(222),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1692_" + sGXsfl_222_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 225,'',false,'" + sGXsfl_222_idx + "',222)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltFascod_Internalname,GXutil.rtrim( A12172DltFascod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,225);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltFascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDltFascod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(222),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1692_" + sGXsfl_222_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 226,'',false,'" + sGXsfl_222_idx + "',222)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltFasDsc_Internalname,GXutil.rtrim( A12173DltFasDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,226);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDltFasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(222),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1692_" + sGXsfl_222_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 227,'',false,'" + sGXsfl_222_idx + "',222)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltKgsFs_Internalname,GXutil.ltrim( localUtil.ntoc( A12174DltKgsFs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDltKgsFs_Enabled!=0) ? localUtil.format( A12174DltKgsFs, "ZZZZZ9.99") : localUtil.format( A12174DltKgsFs, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,227);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltKgsFs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDltKgsFs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(222),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1692_" + sGXsfl_222_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 228,'',false,'" + sGXsfl_222_idx + "',222)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltMtsFs_Internalname,GXutil.ltrim( localUtil.ntoc( A12175DltMtsFs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDltMtsFs_Enabled!=0) ? localUtil.format( A12175DltMtsFs, "ZZZZZ9.99") : localUtil.format( A12175DltMtsFs, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,228);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltMtsFs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDltMtsFs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(222),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1692_" + sGXsfl_222_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 229,'',false,'" + sGXsfl_222_idx + "',222)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltPrKFs_Internalname,GXutil.ltrim( localUtil.ntoc( A12189DltPrKFs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDltPrKFs_Enabled!=0) ? localUtil.format( A12189DltPrKFs, "ZZZZZZ9.99999") : localUtil.format( A12189DltPrKFs, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,229);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltPrKFs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDltPrKFs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(222),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1692_" + sGXsfl_222_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 230,'',false,'" + sGXsfl_222_idx + "',222)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltPrMFs_Internalname,GXutil.ltrim( localUtil.ntoc( A12190DltPrMFs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDltPrMFs_Enabled!=0) ? localUtil.format( A12190DltPrMFs, "ZZZZZZ9.99999") : localUtil.format( A12190DltPrMFs, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,230);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltPrMFs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDltPrMFs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(222),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1692_" + sGXsfl_222_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 231,'',false,'" + sGXsfl_222_idx + "',222)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltPrKBFs_Internalname,GXutil.ltrim( localUtil.ntoc( A12191DltPrKBFs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDltPrKBFs_Enabled!=0) ? localUtil.format( A12191DltPrKBFs, "ZZZZZZ9.99999") : localUtil.format( A12191DltPrKBFs, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,231);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltPrKBFs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDltPrKBFs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(222),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1692_" + sGXsfl_222_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 232,'',false,'" + sGXsfl_222_idx + "',222)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDltPrMBFs_Internalname,GXutil.ltrim( localUtil.ntoc( A12192DltPrMBFs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDltPrMBFs_Enabled!=0) ? localUtil.format( A12192DltPrMBFs, "ZZZZZZ9.99999") : localUtil.format( A12192DltPrMBFs, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,232);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDltPrMBFs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDltPrMBFs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(222),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid4Row);
      send_integrity_lvl_hashes1J91692( ) ;
      GXCCtl = "Z12182DltLin_" + sGXsfl_222_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12182DltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12172DltFascod_" + sGXsfl_222_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12172DltFascod));
      GXCCtl = "Z12173DltFasDsc_" + sGXsfl_222_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12173DltFasDsc));
      GXCCtl = "Z12174DltKgsFs_" + sGXsfl_222_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12174DltKgsFs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12175DltMtsFs_" + sGXsfl_222_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12175DltMtsFs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12189DltPrKFs_" + sGXsfl_222_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12189DltPrKFs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12190DltPrMFs_" + sGXsfl_222_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12190DltPrMFs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12191DltPrKBFs_" + sGXsfl_222_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12191DltPrKBFs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12192DltPrMBFs_" + sGXsfl_222_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12192DltPrMBFs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1692_" + sGXsfl_222_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1692, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1692_" + sGXsfl_222_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1692, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1692_" + sGXsfl_222_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1692, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1692_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1692_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTLIN_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTFASCOD_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltFascod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTFASDSC_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTKGSFS_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltKgsFs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTMTSFS_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltMtsFs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTPRKFS_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPrKFs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTPRMFS_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPrMFs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTPRKBFS_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPrKBFs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DLTPRMBFS_"+sGXsfl_222_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPrMBFs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid4Container.AddRow(Grid4Row);
   }

   public void readRow1J91692( )
   {
      nGXsfl_222_idx = (int)(nGXsfl_222_idx+1) ;
      sGXsfl_222_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_222_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2221692( ) ;
      edtavnRcdDeleted_1692_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1692_"+sGXsfl_222_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTLIN_"+sGXsfl_222_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltFascod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTFASCOD_"+sGXsfl_222_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTFASDSC_"+sGXsfl_222_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltKgsFs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTKGSFS_"+sGXsfl_222_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltMtsFs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTMTSFS_"+sGXsfl_222_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltPrKFs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTPRKFS_"+sGXsfl_222_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltPrMFs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTPRMFS_"+sGXsfl_222_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltPrKBFs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTPRKBFS_"+sGXsfl_222_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDltPrMBFs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DLTPRMBFS_"+sGXsfl_222_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1692_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1692_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1692");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1692_Internalname ;
         wbErr = true ;
         nRcdDeleted_1692 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1692 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1692_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DLTLIN_" + sGXsfl_222_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDltLin_Internalname ;
         wbErr = true ;
         A12182DltLin = (short)(0) ;
      }
      else
      {
         A12182DltLin = (short)(localUtil.ctol( httpContext.cgiGet( edtDltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A12172DltFascod = httpContext.cgiGet( edtDltFascod_Internalname) ;
      n12172DltFascod = false ;
      A12173DltFasDsc = httpContext.cgiGet( edtDltFasDsc_Internalname) ;
      n12173DltFasDsc = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDltKgsFs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltKgsFs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "DLTKGSFS_" + sGXsfl_222_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDltKgsFs_Internalname ;
         wbErr = true ;
         A12174DltKgsFs = DecimalUtil.ZERO ;
         n12174DltKgsFs = false ;
      }
      else
      {
         A12174DltKgsFs = localUtil.ctond( httpContext.cgiGet( edtDltKgsFs_Internalname)) ;
         n12174DltKgsFs = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDltMtsFs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltMtsFs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "DLTMTSFS_" + sGXsfl_222_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDltMtsFs_Internalname ;
         wbErr = true ;
         A12175DltMtsFs = DecimalUtil.ZERO ;
         n12175DltMtsFs = false ;
      }
      else
      {
         A12175DltMtsFs = localUtil.ctond( httpContext.cgiGet( edtDltMtsFs_Internalname)) ;
         n12175DltMtsFs = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDltPrKFs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltPrKFs_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "DLTPRKFS_" + sGXsfl_222_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDltPrKFs_Internalname ;
         wbErr = true ;
         A12189DltPrKFs = DecimalUtil.ZERO ;
         n12189DltPrKFs = false ;
      }
      else
      {
         A12189DltPrKFs = localUtil.ctond( httpContext.cgiGet( edtDltPrKFs_Internalname)) ;
         n12189DltPrKFs = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDltPrMFs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltPrMFs_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "DLTPRMFS_" + sGXsfl_222_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDltPrMFs_Internalname ;
         wbErr = true ;
         A12190DltPrMFs = DecimalUtil.ZERO ;
         n12190DltPrMFs = false ;
      }
      else
      {
         A12190DltPrMFs = localUtil.ctond( httpContext.cgiGet( edtDltPrMFs_Internalname)) ;
         n12190DltPrMFs = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDltPrKBFs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltPrKBFs_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "DLTPRKBFS_" + sGXsfl_222_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDltPrKBFs_Internalname ;
         wbErr = true ;
         A12191DltPrKBFs = DecimalUtil.ZERO ;
         n12191DltPrKBFs = false ;
      }
      else
      {
         A12191DltPrKBFs = localUtil.ctond( httpContext.cgiGet( edtDltPrKBFs_Internalname)) ;
         n12191DltPrKBFs = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDltPrMBFs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDltPrMBFs_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "DLTPRMBFS_" + sGXsfl_222_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDltPrMBFs_Internalname ;
         wbErr = true ;
         A12192DltPrMBFs = DecimalUtil.ZERO ;
         n12192DltPrMBFs = false ;
      }
      else
      {
         A12192DltPrMBFs = localUtil.ctond( httpContext.cgiGet( edtDltPrMBFs_Internalname)) ;
         n12192DltPrMBFs = false ;
      }
      GXCCtl = "Z12182DltLin_" + sGXsfl_222_idx ;
      Z12182DltLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12172DltFascod_" + sGXsfl_222_idx ;
      Z12172DltFascod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12173DltFasDsc_" + sGXsfl_222_idx ;
      Z12173DltFasDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12174DltKgsFs_" + sGXsfl_222_idx ;
      Z12174DltKgsFs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12175DltMtsFs_" + sGXsfl_222_idx ;
      Z12175DltMtsFs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12189DltPrKFs_" + sGXsfl_222_idx ;
      Z12189DltPrKFs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12190DltPrMFs_" + sGXsfl_222_idx ;
      Z12190DltPrMFs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12191DltPrKBFs_" + sGXsfl_222_idx ;
      Z12191DltPrKBFs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12192DltPrMBFs_" + sGXsfl_222_idx ;
      Z12192DltPrMBFs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1692_" + sGXsfl_222_idx ;
      nRcdDeleted_1692 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1692_" + sGXsfl_222_idx ;
      nRcdExists_1692 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1692_" + sGXsfl_222_idx ;
      nIsMod_1692 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDltNTrozo_Enabled = edtDltNTrozo_Enabled ;
      defedtDltLin_Enabled = edtDltLin_Enabled ;
      defedtDltNPieza_Enabled = edtDltNPieza_Enabled ;
      defedtDltLinTxt_Enabled = edtDltLinTxt_Enabled ;
   }

   public void confirmValues1J90( )
   {
      nGXsfl_186_idx = 0 ;
      sGXsfl_186_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_186_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1861690( ) ;
      while ( nGXsfl_186_idx < nRC_GXsfl_186 )
      {
         nGXsfl_186_idx = (int)(nGXsfl_186_idx+1) ;
         sGXsfl_186_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_186_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1861690( ) ;
         httpContext.changePostValue( "Z12180DltNPieza_"+sGXsfl_186_idx, httpContext.cgiGet( "ZT_"+"Z12180DltNPieza_"+sGXsfl_186_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12180DltNPieza_"+sGXsfl_186_idx) ;
         httpContext.changePostValue( "Z12166DltKgsPz_"+sGXsfl_186_idx, httpContext.cgiGet( "ZT_"+"Z12166DltKgsPz_"+sGXsfl_186_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12166DltKgsPz_"+sGXsfl_186_idx) ;
         httpContext.changePostValue( "Z12167DltMtsPz_"+sGXsfl_186_idx, httpContext.cgiGet( "ZT_"+"Z12167DltMtsPz_"+sGXsfl_186_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12167DltMtsPz_"+sGXsfl_186_idx) ;
         httpContext.changePostValue( "Z12168DltAncPz_"+sGXsfl_186_idx, httpContext.cgiGet( "ZT_"+"Z12168DltAncPz_"+sGXsfl_186_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12168DltAncPz_"+sGXsfl_186_idx) ;
      }
      nGXsfl_170_idx = 0 ;
      sGXsfl_170_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_170_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1701689( ) ;
      while ( nGXsfl_170_idx < nRC_GXsfl_170 )
      {
         nGXsfl_170_idx = (int)(nGXsfl_170_idx+1) ;
         sGXsfl_170_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_170_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1701689( ) ;
         httpContext.changePostValue( "Z12179DltLinTxt_"+sGXsfl_170_idx, httpContext.cgiGet( "ZT_"+"Z12179DltLinTxt_"+sGXsfl_170_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12179DltLinTxt_"+sGXsfl_170_idx) ;
         httpContext.changePostValue( "Z12165DltDsc_"+sGXsfl_170_idx, httpContext.cgiGet( "ZT_"+"Z12165DltDsc_"+sGXsfl_170_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12165DltDsc_"+sGXsfl_170_idx) ;
         httpContext.changePostValue( "Z12288DltRD_"+sGXsfl_170_idx, httpContext.cgiGet( "ZT_"+"Z12288DltRD_"+sGXsfl_170_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12288DltRD_"+sGXsfl_170_idx) ;
         httpContext.changePostValue( "Z12289DltPKg_"+sGXsfl_170_idx, httpContext.cgiGet( "ZT_"+"Z12289DltPKg_"+sGXsfl_170_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12289DltPKg_"+sGXsfl_170_idx) ;
         httpContext.changePostValue( "Z12291DltKgsTxt_"+sGXsfl_170_idx, httpContext.cgiGet( "ZT_"+"Z12291DltKgsTxt_"+sGXsfl_170_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12291DltKgsTxt_"+sGXsfl_170_idx) ;
         httpContext.changePostValue( "Z12290DltPMt_"+sGXsfl_170_idx, httpContext.cgiGet( "ZT_"+"Z12290DltPMt_"+sGXsfl_170_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12290DltPMt_"+sGXsfl_170_idx) ;
         httpContext.changePostValue( "Z12292DltMtsTxt_"+sGXsfl_170_idx, httpContext.cgiGet( "ZT_"+"Z12292DltMtsTxt_"+sGXsfl_170_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12292DltMtsTxt_"+sGXsfl_170_idx) ;
         httpContext.changePostValue( "Z12293DltImpTxt_"+sGXsfl_170_idx, httpContext.cgiGet( "ZT_"+"Z12293DltImpTxt_"+sGXsfl_170_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12293DltImpTxt_"+sGXsfl_170_idx) ;
         httpContext.changePostValue( "Z12294DltTipTxt_"+sGXsfl_170_idx, httpContext.cgiGet( "ZT_"+"Z12294DltTipTxt_"+sGXsfl_170_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12294DltTipTxt_"+sGXsfl_170_idx) ;
         httpContext.changePostValue( "Z12295DltCodTxt_"+sGXsfl_170_idx, httpContext.cgiGet( "ZT_"+"Z12295DltCodTxt_"+sGXsfl_170_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12295DltCodTxt_"+sGXsfl_170_idx) ;
         httpContext.changePostValue( "Z12296DltPzsTxt_"+sGXsfl_170_idx, httpContext.cgiGet( "ZT_"+"Z12296DltPzsTxt_"+sGXsfl_170_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12296DltPzsTxt_"+sGXsfl_170_idx) ;
      }
      nGXsfl_213_idx = 0 ;
      sGXsfl_213_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_213_idx), 4, 0), (short)(4), "0") + sGXsfl_186_idx ;
      subsflControlProps_2131691( ) ;
      while ( nGXsfl_213_idx < nRC_GXsfl_213 )
      {
         nGXsfl_213_idx = (int)(nGXsfl_213_idx+1) ;
         sGXsfl_213_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_213_idx), 4, 0), (short)(4), "0") + sGXsfl_186_idx ;
         subsflControlProps_2131691( ) ;
         httpContext.changePostValue( "Z12181DltNTrozo_"+sGXsfl_213_idx, httpContext.cgiGet( "ZT_"+"Z12181DltNTrozo_"+sGXsfl_213_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12181DltNTrozo_"+sGXsfl_213_idx) ;
         httpContext.changePostValue( "Z12169DltKgsTrz_"+sGXsfl_213_idx, httpContext.cgiGet( "ZT_"+"Z12169DltKgsTrz_"+sGXsfl_213_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12169DltKgsTrz_"+sGXsfl_213_idx) ;
         httpContext.changePostValue( "Z12170DltMtsTrz_"+sGXsfl_213_idx, httpContext.cgiGet( "ZT_"+"Z12170DltMtsTrz_"+sGXsfl_213_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12170DltMtsTrz_"+sGXsfl_213_idx) ;
         httpContext.changePostValue( "Z12171DltAncTrz_"+sGXsfl_213_idx, httpContext.cgiGet( "ZT_"+"Z12171DltAncTrz_"+sGXsfl_213_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12171DltAncTrz_"+sGXsfl_213_idx) ;
      }
      nGXsfl_222_idx = 0 ;
      sGXsfl_222_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_222_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2221692( ) ;
      while ( nGXsfl_222_idx < nRC_GXsfl_222 )
      {
         nGXsfl_222_idx = (int)(nGXsfl_222_idx+1) ;
         sGXsfl_222_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_222_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2221692( ) ;
         httpContext.changePostValue( "Z12182DltLin_"+sGXsfl_222_idx, httpContext.cgiGet( "ZT_"+"Z12182DltLin_"+sGXsfl_222_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12182DltLin_"+sGXsfl_222_idx) ;
         httpContext.changePostValue( "Z12172DltFascod_"+sGXsfl_222_idx, httpContext.cgiGet( "ZT_"+"Z12172DltFascod_"+sGXsfl_222_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12172DltFascod_"+sGXsfl_222_idx) ;
         httpContext.changePostValue( "Z12173DltFasDsc_"+sGXsfl_222_idx, httpContext.cgiGet( "ZT_"+"Z12173DltFasDsc_"+sGXsfl_222_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12173DltFasDsc_"+sGXsfl_222_idx) ;
         httpContext.changePostValue( "Z12174DltKgsFs_"+sGXsfl_222_idx, httpContext.cgiGet( "ZT_"+"Z12174DltKgsFs_"+sGXsfl_222_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12174DltKgsFs_"+sGXsfl_222_idx) ;
         httpContext.changePostValue( "Z12175DltMtsFs_"+sGXsfl_222_idx, httpContext.cgiGet( "ZT_"+"Z12175DltMtsFs_"+sGXsfl_222_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12175DltMtsFs_"+sGXsfl_222_idx) ;
         httpContext.changePostValue( "Z12189DltPrKFs_"+sGXsfl_222_idx, httpContext.cgiGet( "ZT_"+"Z12189DltPrKFs_"+sGXsfl_222_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12189DltPrKFs_"+sGXsfl_222_idx) ;
         httpContext.changePostValue( "Z12190DltPrMFs_"+sGXsfl_222_idx, httpContext.cgiGet( "ZT_"+"Z12190DltPrMFs_"+sGXsfl_222_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12190DltPrMFs_"+sGXsfl_222_idx) ;
         httpContext.changePostValue( "Z12191DltPrKBFs_"+sGXsfl_222_idx, httpContext.cgiGet( "ZT_"+"Z12191DltPrKBFs_"+sGXsfl_222_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12191DltPrKBFs_"+sGXsfl_222_idx) ;
         httpContext.changePostValue( "Z12192DltPrMBFs_"+sGXsfl_222_idx, httpContext.cgiGet( "ZT_"+"Z12192DltPrMBFs_"+sGXsfl_222_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12192DltPrMBFs_"+sGXsfl_222_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdlt001", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12176DltHdr", GXutil.ltrim( localUtil.ntoc( Z12176DltHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12177DltR", GXutil.ltrim( localUtil.ntoc( Z12177DltR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12178DltP", GXutil.rtrim( Z12178DltP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12145DltKgs", GXutil.ltrim( localUtil.ntoc( Z12145DltKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12146DltMts", GXutil.ltrim( localUtil.ntoc( Z12146DltMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12147DltPzs", GXutil.ltrim( localUtil.ntoc( Z12147DltPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12148DltBultos", GXutil.ltrim( localUtil.ntoc( Z12148DltBultos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12149DltTubos", GXutil.ltrim( localUtil.ntoc( Z12149DltTubos, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12150DltArtCod", GXutil.rtrim( Z12150DltArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12151DltArtDsc", GXutil.rtrim( Z12151DltArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12152DltColNom", GXutil.rtrim( Z12152DltColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12153DltColNum", GXutil.ltrim( localUtil.ntoc( Z12153DltColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12154DltTc", GXutil.ltrim( localUtil.ntoc( Z12154DltTc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12155DltColClNm", GXutil.rtrim( Z12155DltColClNm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12156DltColClNr", GXutil.ltrim( localUtil.ntoc( Z12156DltColClNr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12157DltGrm2", GXutil.ltrim( localUtil.ntoc( Z12157DltGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12158DltAnc", GXutil.ltrim( localUtil.ntoc( Z12158DltAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12159DltAlbObs", GXutil.rtrim( Z12159DltAlbObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12160DltUltTxt", GXutil.ltrim( localUtil.ntoc( Z12160DltUltTxt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12161DltUltFs", GXutil.ltrim( localUtil.ntoc( Z12161DltUltFs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12162DltEncCli", GXutil.rtrim( Z12162DltEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12163DltPreKg", GXutil.ltrim( localUtil.ntoc( Z12163DltPreKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12164DltPreMt", GXutil.ltrim( localUtil.ntoc( Z12164DltPreMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12186DltKgsCli", GXutil.ltrim( localUtil.ntoc( Z12186DltKgsCli, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12187DltTubo", GXutil.ltrim( localUtil.ntoc( Z12187DltTubo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12188DltTuboN", GXutil.rtrim( Z12188DltTuboN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12287DltModCod", GXutil.rtrim( Z12287DltModCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_170", GXutil.ltrim( localUtil.ntoc( nGXsfl_170_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_186", GXutil.ltrim( localUtil.ntoc( nGXsfl_186_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_222", GXutil.ltrim( localUtil.ntoc( nGXsfl_222_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
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
      return formatLink("app.tdlt001", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TDLT001" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla Hdrs Albaran", "") ;
   }

   public void initializeNonKey1J91688( )
   {
      A12145DltKgs = DecimalUtil.ZERO ;
      n12145DltKgs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12145DltKgs", GXutil.ltrimstr( A12145DltKgs, 9, 2));
      A12146DltMts = DecimalUtil.ZERO ;
      n12146DltMts = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12146DltMts", GXutil.ltrimstr( A12146DltMts, 9, 2));
      A12147DltPzs = 0 ;
      n12147DltPzs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12147DltPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12147DltPzs), 6, 0));
      A12148DltBultos = (short)(0) ;
      n12148DltBultos = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12148DltBultos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12148DltBultos), 4, 0));
      A12149DltTubos = 0 ;
      n12149DltTubos = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12149DltTubos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12149DltTubos), 6, 0));
      A12150DltArtCod = "" ;
      n12150DltArtCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12150DltArtCod", A12150DltArtCod);
      A12151DltArtDsc = "" ;
      n12151DltArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12151DltArtDsc", A12151DltArtDsc);
      A12152DltColNom = "" ;
      n12152DltColNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12152DltColNom", A12152DltColNom);
      A12153DltColNum = 0 ;
      n12153DltColNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12153DltColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12153DltColNum), 6, 0));
      A12154DltTc = (byte)(0) ;
      n12154DltTc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12154DltTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12154DltTc), 2, 0));
      A12155DltColClNm = "" ;
      n12155DltColClNm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12155DltColClNm", A12155DltColClNm);
      A12156DltColClNr = 0 ;
      n12156DltColClNr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12156DltColClNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12156DltColClNr), 6, 0));
      A12157DltGrm2 = (short)(0) ;
      n12157DltGrm2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12157DltGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12157DltGrm2), 4, 0));
      A12158DltAnc = (short)(0) ;
      n12158DltAnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12158DltAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12158DltAnc), 4, 0));
      A12159DltAlbObs = "" ;
      n12159DltAlbObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12159DltAlbObs", A12159DltAlbObs);
      A12160DltUltTxt = (short)(0) ;
      n12160DltUltTxt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12160DltUltTxt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12160DltUltTxt), 4, 0));
      A12161DltUltFs = (short)(0) ;
      n12161DltUltFs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12161DltUltFs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12161DltUltFs), 4, 0));
      A12162DltEncCli = "" ;
      n12162DltEncCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12162DltEncCli", A12162DltEncCli);
      A12163DltPreKg = DecimalUtil.ZERO ;
      n12163DltPreKg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12163DltPreKg", GXutil.ltrimstr( A12163DltPreKg, 13, 5));
      A12164DltPreMt = DecimalUtil.ZERO ;
      n12164DltPreMt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12164DltPreMt", GXutil.ltrimstr( A12164DltPreMt, 13, 5));
      A12186DltKgsCli = DecimalUtil.ZERO ;
      n12186DltKgsCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12186DltKgsCli", GXutil.ltrimstr( A12186DltKgsCli, 9, 2));
      A12187DltTubo = (short)(0) ;
      n12187DltTubo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12187DltTubo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12187DltTubo), 4, 0));
      A12188DltTuboN = "" ;
      n12188DltTuboN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12188DltTuboN", A12188DltTuboN);
      A12287DltModCod = "" ;
      n12287DltModCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12287DltModCod", A12287DltModCod);
      Z12145DltKgs = DecimalUtil.ZERO ;
      Z12146DltMts = DecimalUtil.ZERO ;
      Z12147DltPzs = 0 ;
      Z12148DltBultos = (short)(0) ;
      Z12149DltTubos = 0 ;
      Z12150DltArtCod = "" ;
      Z12151DltArtDsc = "" ;
      Z12152DltColNom = "" ;
      Z12153DltColNum = 0 ;
      Z12154DltTc = (byte)(0) ;
      Z12155DltColClNm = "" ;
      Z12156DltColClNr = 0 ;
      Z12157DltGrm2 = (short)(0) ;
      Z12158DltAnc = (short)(0) ;
      Z12159DltAlbObs = "" ;
      Z12160DltUltTxt = (short)(0) ;
      Z12161DltUltFs = (short)(0) ;
      Z12162DltEncCli = "" ;
      Z12163DltPreKg = DecimalUtil.ZERO ;
      Z12164DltPreMt = DecimalUtil.ZERO ;
      Z12186DltKgsCli = DecimalUtil.ZERO ;
      Z12187DltTubo = (short)(0) ;
      Z12188DltTuboN = "" ;
      Z12287DltModCod = "" ;
   }

   public void initAll1J91688( )
   {
      A30AlbProCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      A12176DltHdr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12176DltHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12176DltHdr), 8, 0));
      A12177DltR = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12177DltR", GXutil.str( A12177DltR, 1, 0));
      A12178DltP = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12178DltP", A12178DltP);
      initializeNonKey1J91688( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1J91689( )
   {
      A12165DltDsc = "" ;
      n12165DltDsc = false ;
      A12288DltRD = DecimalUtil.ZERO ;
      n12288DltRD = false ;
      A12289DltPKg = DecimalUtil.ZERO ;
      n12289DltPKg = false ;
      A12291DltKgsTxt = DecimalUtil.ZERO ;
      n12291DltKgsTxt = false ;
      A12290DltPMt = DecimalUtil.ZERO ;
      n12290DltPMt = false ;
      A12292DltMtsTxt = DecimalUtil.ZERO ;
      n12292DltMtsTxt = false ;
      A12293DltImpTxt = DecimalUtil.ZERO ;
      n12293DltImpTxt = false ;
      A12294DltTipTxt = "" ;
      n12294DltTipTxt = false ;
      A12295DltCodTxt = "" ;
      n12295DltCodTxt = false ;
      A12296DltPzsTxt = 0 ;
      n12296DltPzsTxt = false ;
      Z12165DltDsc = "" ;
      Z12288DltRD = DecimalUtil.ZERO ;
      Z12289DltPKg = DecimalUtil.ZERO ;
      Z12291DltKgsTxt = DecimalUtil.ZERO ;
      Z12290DltPMt = DecimalUtil.ZERO ;
      Z12292DltMtsTxt = DecimalUtil.ZERO ;
      Z12293DltImpTxt = DecimalUtil.ZERO ;
      Z12294DltTipTxt = "" ;
      Z12295DltCodTxt = "" ;
      Z12296DltPzsTxt = 0 ;
   }

   public void initAll1J91689( )
   {
      A12179DltLinTxt = (short)(0) ;
      initializeNonKey1J91689( ) ;
   }

   public void standaloneModalInsert1J91689( )
   {
   }

   public void initializeNonKey1J91690( )
   {
      A12166DltKgsPz = DecimalUtil.ZERO ;
      n12166DltKgsPz = false ;
      A12167DltMtsPz = DecimalUtil.ZERO ;
      n12167DltMtsPz = false ;
      A12168DltAncPz = (short)(0) ;
      n12168DltAncPz = false ;
      Z12166DltKgsPz = DecimalUtil.ZERO ;
      Z12167DltMtsPz = DecimalUtil.ZERO ;
      Z12168DltAncPz = (short)(0) ;
   }

   public void initAll1J91690( )
   {
      A12180DltNPieza = "" ;
      initializeNonKey1J91690( ) ;
   }

   public void standaloneModalInsert1J91690( )
   {
   }

   public void initializeNonKey1J91691( )
   {
      A12169DltKgsTrz = DecimalUtil.ZERO ;
      n12169DltKgsTrz = false ;
      A12170DltMtsTrz = DecimalUtil.ZERO ;
      n12170DltMtsTrz = false ;
      A12171DltAncTrz = (short)(0) ;
      n12171DltAncTrz = false ;
      Z12169DltKgsTrz = DecimalUtil.ZERO ;
      Z12170DltMtsTrz = DecimalUtil.ZERO ;
      Z12171DltAncTrz = (short)(0) ;
   }

   public void initAll1J91691( )
   {
      A12181DltNTrozo = (short)(0) ;
      initializeNonKey1J91691( ) ;
   }

   public void standaloneModalInsert1J91691( )
   {
   }

   public void initializeNonKey1J91692( )
   {
      A12172DltFascod = "" ;
      n12172DltFascod = false ;
      A12173DltFasDsc = "" ;
      n12173DltFasDsc = false ;
      A12174DltKgsFs = DecimalUtil.ZERO ;
      n12174DltKgsFs = false ;
      A12175DltMtsFs = DecimalUtil.ZERO ;
      n12175DltMtsFs = false ;
      A12189DltPrKFs = DecimalUtil.ZERO ;
      n12189DltPrKFs = false ;
      A12190DltPrMFs = DecimalUtil.ZERO ;
      n12190DltPrMFs = false ;
      A12191DltPrKBFs = DecimalUtil.ZERO ;
      n12191DltPrKBFs = false ;
      A12192DltPrMBFs = DecimalUtil.ZERO ;
      n12192DltPrMBFs = false ;
      Z12172DltFascod = "" ;
      Z12173DltFasDsc = "" ;
      Z12174DltKgsFs = DecimalUtil.ZERO ;
      Z12175DltMtsFs = DecimalUtil.ZERO ;
      Z12189DltPrKFs = DecimalUtil.ZERO ;
      Z12190DltPrMFs = DecimalUtil.ZERO ;
      Z12191DltPrKBFs = DecimalUtil.ZERO ;
      Z12192DltPrMBFs = DecimalUtil.ZERO ;
   }

   public void initAll1J91692( )
   {
      A12182DltLin = (short)(0) ;
      initializeNonKey1J91692( ) ;
   }

   public void standaloneModalInsert1J91692( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241584848", true, true);
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
      httpContext.AddJavascriptSource("tdlt001.js", "?20268241584848", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1689( )
   {
      edtDltLinTxt_Enabled = defedtDltLinTxt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltLinTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltLinTxt_Enabled), 5, 0), !bGXsfl_170_Refreshing);
   }

   public void init_level_properties1690( )
   {
      edtDltNPieza_Enabled = defedtDltNPieza_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltNPieza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltNPieza_Enabled), 5, 0), !bGXsfl_186_Refreshing);
   }

   public void init_level_properties1691( )
   {
      edtDltNTrozo_Enabled = defedtDltNTrozo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltNTrozo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltNTrozo_Enabled), 5, 0), !bGXsfl_213_Refreshing);
   }

   public void init_level_properties1692( )
   {
      edtDltLin_Enabled = defedtDltLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDltLin_Enabled), 5, 0), !bGXsfl_222_Refreshing);
   }

   public void startgridcontrol170( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1689, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1689_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12179DltLinTxt, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltLinTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12165DltDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12288DltRD, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltRD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12289DltPKg, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPKg_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12291DltKgsTxt, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltKgsTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12290DltPMt, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPMt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12292DltMtsTxt, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltMtsTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12293DltImpTxt, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltImpTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12294DltTipTxt));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltTipTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12295DltCodTxt));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltCodTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12296DltPzsTxt, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPzsTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol186( )
   {
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("Header", subGrid2_Header);
      Grid2Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Class", "FreeStyleGrid");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid2_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", lblTextblock31_Caption);
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A12180DltNPieza));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltNPieza_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", lblTextblock7_Caption);
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12166DltKgsPz, (byte)(9), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltKgsPz_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", lblTextblock8_Caption);
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12167DltMtsPz, (byte)(9), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltMtsPz_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", lblTextblock20_Caption);
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12168DltAncPz, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltAncPz_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol222( )
   {
      Grid4Container.AddObjectProperty("GridName", "Grid4");
      Grid4Container.AddObjectProperty("Header", subGrid4_Header);
      Grid4Container.AddObjectProperty("Class", "");
      Grid4Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid4_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("CmpContext", "");
      Grid4Container.AddObjectProperty("InMasterPage", "false");
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1692, (byte)(4), (byte)(0), ".", "")));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1692_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12182DltLin, (byte)(4), (byte)(0), ".", "")));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.rtrim( A12172DltFascod));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltFascod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.rtrim( A12173DltFasDsc));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12174DltKgsFs, (byte)(9), (byte)(2), ".", "")));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltKgsFs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12175DltMtsFs, (byte)(9), (byte)(2), ".", "")));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltMtsFs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12189DltPrKFs, (byte)(13), (byte)(5), ".", "")));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPrKFs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12190DltPrMFs, (byte)(13), (byte)(5), ".", "")));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPrMFs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12191DltPrKBFs, (byte)(13), (byte)(5), ".", "")));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPrKBFs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12192DltPrMBFs, (byte)(13), (byte)(5), ".", "")));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltPrMBFs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid4_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid4_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid4_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid4_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid4_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid4_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid4_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol213( )
   {
      Grid3Container.AddObjectProperty("GridName", "Grid3");
      Grid3Container.AddObjectProperty("Header", subGrid3_Header);
      Grid3Container.AddObjectProperty("Class", "");
      Grid3Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid3_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("CmpContext", "");
      Grid3Container.AddObjectProperty("InMasterPage", "false");
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1691, (byte)(4), (byte)(0), ".", "")));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1691_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12181DltNTrozo, (byte)(4), (byte)(0), ".", "")));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltNTrozo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12169DltKgsTrz, (byte)(9), (byte)(2), ".", "")));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltKgsTrz_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12170DltMtsTrz, (byte)(9), (byte)(2), ".", "")));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltMtsTrz_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12171DltAncTrz, (byte)(4), (byte)(0), ".", "")));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDltAncTrz_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid3_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid3_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid3_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid3_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtDltHdr_Internalname = "DLTHDR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtDltR_Internalname = "DLTR" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtDltP_Internalname = "DLTP" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtDltKgs_Internalname = "DLTKGS" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtDltMts_Internalname = "DLTMTS" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtDltPzs_Internalname = "DLTPZS" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtDltBultos_Internalname = "DLTBULTOS" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtDltTubos_Internalname = "DLTTUBOS" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtDltArtCod_Internalname = "DLTARTCOD" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtDltArtDsc_Internalname = "DLTARTDSC" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtDltColNom_Internalname = "DLTCOLNOM" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtDltColNum_Internalname = "DLTCOLNUM" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtDltTc_Internalname = "DLTTC" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtDltColClNm_Internalname = "DLTCOLCLNM" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtDltColClNr_Internalname = "DLTCOLCLNR" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtDltGrm2_Internalname = "DLTGRM2" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtDltAnc_Internalname = "DLTANC" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtDltAlbObs_Internalname = "DLTALBOBS" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtDltUltTxt_Internalname = "DLTULTTXT" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtDltUltFs_Internalname = "DLTULTFS" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtDltEncCli_Internalname = "DLTENCCLI" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtDltPreKg_Internalname = "DLTPREKG" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtDltPreMt_Internalname = "DLTPREMT" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtDltKgsCli_Internalname = "DLTKGSCLI" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtDltTubo_Internalname = "DLTTUBO" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtDltTuboN_Internalname = "DLTTUBON" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtDltModCod_Internalname = "DLTMODCOD" ;
      edtavnRcdDeleted_1689_Internalname = "vNRCDDELETED_1689" ;
      edtDltLinTxt_Internalname = "DLTLINTXT" ;
      edtDltDsc_Internalname = "DLTDSC" ;
      edtDltRD_Internalname = "DLTRD" ;
      edtDltPKg_Internalname = "DLTPKG" ;
      edtDltKgsTxt_Internalname = "DLTKGSTXT" ;
      edtDltPMt_Internalname = "DLTPMT" ;
      edtDltMtsTxt_Internalname = "DLTMTSTXT" ;
      edtDltImpTxt_Internalname = "DLTIMPTXT" ;
      edtDltTipTxt_Internalname = "DLTTIPTXT" ;
      edtDltCodTxt_Internalname = "DLTCODTXT" ;
      edtDltPzsTxt_Internalname = "DLTPZSTXT" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtDltNPieza_Internalname = "DLTNPIEZA" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtDltKgsPz_Internalname = "DLTKGSPZ" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtDltMtsPz_Internalname = "DLTMTSPZ" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtDltAncPz_Internalname = "DLTANCPZ" ;
      edtavnRcdDeleted_1691_Internalname = "vNRCDDELETED_1691" ;
      edtDltNTrozo_Internalname = "DLTNTROZO" ;
      edtDltKgsTrz_Internalname = "DLTKGSTRZ" ;
      edtDltMtsTrz_Internalname = "DLTMTSTRZ" ;
      edtDltAncTrz_Internalname = "DLTANCTRZ" ;
      tblTable3_Internalname = "TABLE3" ;
      edtavnRcdDeleted_1692_Internalname = "vNRCDDELETED_1692" ;
      edtDltLin_Internalname = "DLTLIN" ;
      edtDltFascod_Internalname = "DLTFASCOD" ;
      edtDltFasDsc_Internalname = "DLTFASDSC" ;
      edtDltKgsFs_Internalname = "DLTKGSFS" ;
      edtDltMtsFs_Internalname = "DLTMTSFS" ;
      edtDltPrKFs_Internalname = "DLTPRKFS" ;
      edtDltPrMFs_Internalname = "DLTPRMFS" ;
      edtDltPrKBFs_Internalname = "DLTPRKBFS" ;
      edtDltPrMBFs_Internalname = "DLTPRMBFS" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid2_Internalname = "GRID2" ;
      subGrid1_Internalname = "GRID1" ;
      subGrid3_Internalname = "GRID3" ;
      subGrid4_Internalname = "GRID4" ;
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
      subGrid3_Allowcollapsing = (byte)(0) ;
      subGrid3_Allowselection = (byte)(0) ;
      subGrid3_Header = "" ;
      subGrid4_Allowcollapsing = (byte)(0) ;
      subGrid4_Allowselection = (byte)(0) ;
      subGrid4_Header = "" ;
      subGrid2_Allowcollapsing = (byte)(0) ;
      lblTextblock20_Caption = httpContext.getMessage( "Ancho", "") ;
      lblTextblock8_Caption = httpContext.getMessage( "Metros", "") ;
      lblTextblock7_Caption = httpContext.getMessage( "Kilos", "") ;
      lblTextblock31_Caption = httpContext.getMessage( "Pieza", "") ;
      subGrid2_Borderwidth = (short)(1) ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      subGrid1_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Tabla Hdrs Albaran", "") );
      edtDltPrMBFs_Jsonclick = "" ;
      edtDltPrKBFs_Jsonclick = "" ;
      edtDltPrMFs_Jsonclick = "" ;
      edtDltPrKFs_Jsonclick = "" ;
      edtDltMtsFs_Jsonclick = "" ;
      edtDltKgsFs_Jsonclick = "" ;
      edtDltFasDsc_Jsonclick = "" ;
      edtDltFascod_Jsonclick = "" ;
      edtDltLin_Jsonclick = "" ;
      edtavnRcdDeleted_1692_Jsonclick = "" ;
      subGrid4_Class = "" ;
      subGrid4_Backcolorstyle = (byte)(2) ;
      edtDltAncTrz_Jsonclick = "" ;
      edtDltMtsTrz_Jsonclick = "" ;
      edtDltKgsTrz_Jsonclick = "" ;
      edtDltNTrozo_Jsonclick = "" ;
      edtavnRcdDeleted_1691_Jsonclick = "" ;
      subGrid3_Class = "" ;
      subGrid3_Backcolorstyle = (byte)(2) ;
      edtDltAncPz_Jsonclick = "" ;
      edtDltMtsPz_Jsonclick = "" ;
      edtDltKgsPz_Jsonclick = "" ;
      edtDltNPieza_Jsonclick = "" ;
      subGrid2_Class = "FreeStyleGrid" ;
      subGrid2_Backcolorstyle = (byte)(0) ;
      edtDltPzsTxt_Jsonclick = "" ;
      edtDltCodTxt_Jsonclick = "" ;
      edtDltTipTxt_Jsonclick = "" ;
      edtDltImpTxt_Jsonclick = "" ;
      edtDltMtsTxt_Jsonclick = "" ;
      edtDltPMt_Jsonclick = "" ;
      edtDltKgsTxt_Jsonclick = "" ;
      edtDltPKg_Jsonclick = "" ;
      edtDltRD_Jsonclick = "" ;
      edtDltDsc_Jsonclick = "" ;
      edtDltLinTxt_Jsonclick = "" ;
      edtavnRcdDeleted_1689_Jsonclick = "" ;
      subGrid1_Class = "" ;
      subGrid1_Backcolorstyle = (byte)(2) ;
      edtDltAncTrz_Enabled = 1 ;
      edtDltMtsTrz_Enabled = 1 ;
      edtDltKgsTrz_Enabled = 1 ;
      edtDltNTrozo_Enabled = 1 ;
      edtavnRcdDeleted_1691_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtDltPrMBFs_Enabled = 1 ;
      edtDltPrKBFs_Enabled = 1 ;
      edtDltPrMFs_Enabled = 1 ;
      edtDltPrKFs_Enabled = 1 ;
      edtDltMtsFs_Enabled = 1 ;
      edtDltKgsFs_Enabled = 1 ;
      edtDltFasDsc_Enabled = 1 ;
      edtDltFascod_Enabled = 1 ;
      edtDltLin_Enabled = 1 ;
      edtavnRcdDeleted_1692_Enabled = 1 ;
      edtDltAncPz_Enabled = 1 ;
      edtDltMtsPz_Enabled = 1 ;
      edtDltKgsPz_Enabled = 1 ;
      edtDltNPieza_Enabled = 1 ;
      edtDltPzsTxt_Enabled = 1 ;
      edtDltCodTxt_Enabled = 1 ;
      edtDltTipTxt_Enabled = 1 ;
      edtDltImpTxt_Enabled = 1 ;
      edtDltMtsTxt_Enabled = 1 ;
      edtDltPMt_Enabled = 1 ;
      edtDltKgsTxt_Enabled = 1 ;
      edtDltPKg_Enabled = 1 ;
      edtDltRD_Enabled = 1 ;
      edtDltDsc_Enabled = 1 ;
      edtDltLinTxt_Enabled = 1 ;
      edtavnRcdDeleted_1689_Enabled = 1 ;
      edtDltModCod_Jsonclick = "" ;
      edtDltModCod_Backcolor = (int)(0xFFFFFF) ;
      edtDltModCod_Enabled = 1 ;
      edtDltTuboN_Jsonclick = "" ;
      edtDltTuboN_Backcolor = (int)(0xFFFFFF) ;
      edtDltTuboN_Enabled = 1 ;
      edtDltTubo_Jsonclick = "" ;
      edtDltTubo_Backcolor = (int)(0xFFFFFF) ;
      edtDltTubo_Enabled = 1 ;
      edtDltKgsCli_Jsonclick = "" ;
      edtDltKgsCli_Backcolor = (int)(0xFFFFFF) ;
      edtDltKgsCli_Enabled = 1 ;
      edtDltPreMt_Jsonclick = "" ;
      edtDltPreMt_Backcolor = (int)(0xFFFFFF) ;
      edtDltPreMt_Enabled = 1 ;
      edtDltPreKg_Jsonclick = "" ;
      edtDltPreKg_Backcolor = (int)(0xFFFFFF) ;
      edtDltPreKg_Enabled = 1 ;
      edtDltEncCli_Jsonclick = "" ;
      edtDltEncCli_Backcolor = (int)(0xFFFFFF) ;
      edtDltEncCli_Enabled = 1 ;
      edtDltUltFs_Jsonclick = "" ;
      edtDltUltFs_Backcolor = (int)(0xFFFFFF) ;
      edtDltUltFs_Enabled = 1 ;
      edtDltUltTxt_Jsonclick = "" ;
      edtDltUltTxt_Backcolor = (int)(0xFFFFFF) ;
      edtDltUltTxt_Enabled = 1 ;
      edtDltAlbObs_Jsonclick = "" ;
      edtDltAlbObs_Backcolor = (int)(0xFFFFFF) ;
      edtDltAlbObs_Enabled = 1 ;
      edtDltAnc_Jsonclick = "" ;
      edtDltAnc_Backcolor = (int)(0xFFFFFF) ;
      edtDltAnc_Enabled = 1 ;
      edtDltGrm2_Jsonclick = "" ;
      edtDltGrm2_Backcolor = (int)(0xFFFFFF) ;
      edtDltGrm2_Enabled = 1 ;
      edtDltColClNr_Jsonclick = "" ;
      edtDltColClNr_Backcolor = (int)(0xFFFFFF) ;
      edtDltColClNr_Enabled = 1 ;
      edtDltColClNm_Jsonclick = "" ;
      edtDltColClNm_Backcolor = (int)(0xFFFFFF) ;
      edtDltColClNm_Enabled = 1 ;
      edtDltTc_Jsonclick = "" ;
      edtDltTc_Backcolor = (int)(0xFFFFFF) ;
      edtDltTc_Enabled = 1 ;
      edtDltColNum_Jsonclick = "" ;
      edtDltColNum_Backcolor = (int)(0xFFFFFF) ;
      edtDltColNum_Enabled = 1 ;
      edtDltColNom_Jsonclick = "" ;
      edtDltColNom_Backcolor = (int)(0xFFFFFF) ;
      edtDltColNom_Enabled = 1 ;
      edtDltArtDsc_Jsonclick = "" ;
      edtDltArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtDltArtDsc_Enabled = 1 ;
      edtDltArtCod_Jsonclick = "" ;
      edtDltArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtDltArtCod_Enabled = 1 ;
      edtDltTubos_Jsonclick = "" ;
      edtDltTubos_Backcolor = (int)(0xFFFFFF) ;
      edtDltTubos_Enabled = 1 ;
      edtDltBultos_Jsonclick = "" ;
      edtDltBultos_Backcolor = (int)(0xFFFFFF) ;
      edtDltBultos_Enabled = 1 ;
      edtDltPzs_Jsonclick = "" ;
      edtDltPzs_Backcolor = (int)(0xFFFFFF) ;
      edtDltPzs_Enabled = 1 ;
      edtDltMts_Jsonclick = "" ;
      edtDltMts_Backcolor = (int)(0xFFFFFF) ;
      edtDltMts_Enabled = 1 ;
      edtDltKgs_Jsonclick = "" ;
      edtDltKgs_Backcolor = (int)(0xFFFFFF) ;
      edtDltKgs_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtDltP_Jsonclick = "" ;
      edtDltP_Backcolor = (int)(0xFFFFFF) ;
      edtDltP_Enabled = 1 ;
      edtDltR_Jsonclick = "" ;
      edtDltR_Backcolor = (int)(0xFFFFFF) ;
      edtDltR_Enabled = 1 ;
      edtDltHdr_Jsonclick = "" ;
      edtDltHdr_Backcolor = (int)(0xFFFFFF) ;
      edtDltHdr_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Backcolor = (int)(0xFFFFFF) ;
      edtAlbProCod_Enabled = 1 ;
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
      subsflControlProps_1701689( ) ;
      while ( nGXsfl_170_idx <= nRC_GXsfl_170 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1J91689( ) ;
         standaloneModal1J91689( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1J91689( ) ;
         nGXsfl_170_idx = (int)(nGXsfl_170_idx+1) ;
         sGXsfl_170_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_170_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1701689( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1861690( ) ;
      while ( nGXsfl_186_idx <= nRC_GXsfl_186 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1J91690( ) ;
         standaloneModal1J91690( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1J91690( ) ;
         Grid2Row.AddGrid("Grid3", Grid3Container);
         nGXsfl_186_idx = (int)(nGXsfl_186_idx+1) ;
         sGXsfl_186_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_186_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1861690( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid2Container)) ;
      /* End function gxnrGrid2_newrow */
   }

   public void gxnrgrid3_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_2131691( ) ;
      while ( nGXsfl_213_idx <= nRC_GXsfl_213 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1J91690( ) ;
         standaloneModal1J91690( ) ;
         standaloneNotModal1J91691( ) ;
         standaloneModal1J91691( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1J91691( ) ;
         nGXsfl_213_idx = (int)(nGXsfl_213_idx+1) ;
         sGXsfl_213_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_213_idx), 4, 0), (short)(4), "0") + sGXsfl_186_idx ;
         subsflControlProps_2131691( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid3Container)) ;
      /* End function gxnrGrid3_newrow */
   }

   public void gxnrgrid4_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_2221692( ) ;
      while ( nGXsfl_222_idx <= nRC_GXsfl_222 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1J91692( ) ;
         standaloneModal1J91692( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1J91692( ) ;
         nGXsfl_222_idx = (int)(nGXsfl_222_idx+1) ;
         sGXsfl_222_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_222_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2221692( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid4Container)) ;
      /* End function gxnrGrid4_newrow */
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
      /* Using cursor T01J948 */
      pr_default.execute(46, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(46) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01J948_A407EmprNom[0] ;
      n407EmprNom = T01J948_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(46);
      /* Using cursor T01J949 */
      pr_default.execute(47, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(47) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(47);
      GX_FocusControl = edtDltKgs_Internalname ;
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

   public void valid_Albprocod( )
   {
      /* Using cursor T01J949 */
      pr_default.execute(47, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(47) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCod_Internalname ;
      }
      pr_default.close(47);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Dltp( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A12145DltKgs", GXutil.ltrim( localUtil.ntoc( A12145DltKgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12146DltMts", GXutil.ltrim( localUtil.ntoc( A12146DltMts, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12147DltPzs", GXutil.ltrim( localUtil.ntoc( A12147DltPzs, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12148DltBultos", GXutil.ltrim( localUtil.ntoc( A12148DltBultos, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12149DltTubos", GXutil.ltrim( localUtil.ntoc( A12149DltTubos, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12150DltArtCod", GXutil.rtrim( A12150DltArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A12151DltArtDsc", GXutil.rtrim( A12151DltArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A12152DltColNom", GXutil.rtrim( A12152DltColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A12153DltColNum", GXutil.ltrim( localUtil.ntoc( A12153DltColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12154DltTc", GXutil.ltrim( localUtil.ntoc( A12154DltTc, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12155DltColClNm", GXutil.rtrim( A12155DltColClNm));
      httpContext.ajax_rsp_assign_attri("", false, "A12156DltColClNr", GXutil.ltrim( localUtil.ntoc( A12156DltColClNr, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12157DltGrm2", GXutil.ltrim( localUtil.ntoc( A12157DltGrm2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12158DltAnc", GXutil.ltrim( localUtil.ntoc( A12158DltAnc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12159DltAlbObs", GXutil.rtrim( A12159DltAlbObs));
      httpContext.ajax_rsp_assign_attri("", false, "A12160DltUltTxt", GXutil.ltrim( localUtil.ntoc( A12160DltUltTxt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12161DltUltFs", GXutil.ltrim( localUtil.ntoc( A12161DltUltFs, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12162DltEncCli", GXutil.rtrim( A12162DltEncCli));
      httpContext.ajax_rsp_assign_attri("", false, "A12163DltPreKg", GXutil.ltrim( localUtil.ntoc( A12163DltPreKg, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12164DltPreMt", GXutil.ltrim( localUtil.ntoc( A12164DltPreMt, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12186DltKgsCli", GXutil.ltrim( localUtil.ntoc( A12186DltKgsCli, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12187DltTubo", GXutil.ltrim( localUtil.ntoc( A12187DltTubo, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12188DltTuboN", GXutil.rtrim( A12188DltTuboN));
      httpContext.ajax_rsp_assign_attri("", false, "A12287DltModCod", GXutil.rtrim( A12287DltModCod));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12176DltHdr", GXutil.ltrim( localUtil.ntoc( Z12176DltHdr, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12177DltR", GXutil.ltrim( localUtil.ntoc( Z12177DltR, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12178DltP", GXutil.rtrim( Z12178DltP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12145DltKgs", GXutil.ltrim( localUtil.ntoc( Z12145DltKgs, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12146DltMts", GXutil.ltrim( localUtil.ntoc( Z12146DltMts, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12147DltPzs", GXutil.ltrim( localUtil.ntoc( Z12147DltPzs, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12148DltBultos", GXutil.ltrim( localUtil.ntoc( Z12148DltBultos, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12149DltTubos", GXutil.ltrim( localUtil.ntoc( Z12149DltTubos, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12150DltArtCod", GXutil.rtrim( Z12150DltArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12151DltArtDsc", GXutil.rtrim( Z12151DltArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12152DltColNom", GXutil.rtrim( Z12152DltColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12153DltColNum", GXutil.ltrim( localUtil.ntoc( Z12153DltColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12154DltTc", GXutil.ltrim( localUtil.ntoc( Z12154DltTc, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12155DltColClNm", GXutil.rtrim( Z12155DltColClNm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12156DltColClNr", GXutil.ltrim( localUtil.ntoc( Z12156DltColClNr, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12157DltGrm2", GXutil.ltrim( localUtil.ntoc( Z12157DltGrm2, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12158DltAnc", GXutil.ltrim( localUtil.ntoc( Z12158DltAnc, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12159DltAlbObs", GXutil.rtrim( Z12159DltAlbObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12160DltUltTxt", GXutil.ltrim( localUtil.ntoc( Z12160DltUltTxt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12161DltUltFs", GXutil.ltrim( localUtil.ntoc( Z12161DltUltFs, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12162DltEncCli", GXutil.rtrim( Z12162DltEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12163DltPreKg", GXutil.ltrim( localUtil.ntoc( Z12163DltPreKg, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12164DltPreMt", GXutil.ltrim( localUtil.ntoc( Z12164DltPreMt, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12186DltKgsCli", GXutil.ltrim( localUtil.ntoc( Z12186DltKgsCli, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12187DltTubo", GXutil.ltrim( localUtil.ntoc( Z12187DltTubo, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12188DltTuboN", GXutil.rtrim( Z12188DltTuboN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12287DltModCod", GXutil.rtrim( Z12287DltModCod));
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
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_DLTHDR","{handler:'valid_Dlthdr',iparms:[]");
      setEventMetadata("VALID_DLTHDR",",oparms:[]}");
      setEventMetadata("VALID_DLTR","{handler:'valid_Dltr',iparms:[]");
      setEventMetadata("VALID_DLTR",",oparms:[]}");
      setEventMetadata("VALID_DLTP","{handler:'valid_Dltp',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A12176DltHdr',fld:'DLTHDR',pic:'ZZZZZZZ9'},{av:'A12177DltR',fld:'DLTR',pic:'9'},{av:'A12178DltP',fld:'DLTP',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_DLTP",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A12145DltKgs',fld:'DLTKGS',pic:'ZZZZZ9.99'},{av:'A12146DltMts',fld:'DLTMTS',pic:'ZZZZZ9.99'},{av:'A12147DltPzs',fld:'DLTPZS',pic:'ZZZZZ9'},{av:'A12148DltBultos',fld:'DLTBULTOS',pic:'ZZZ9'},{av:'A12149DltTubos',fld:'DLTTUBOS',pic:'ZZZZZ9'},{av:'A12150DltArtCod',fld:'DLTARTCOD',pic:''},{av:'A12151DltArtDsc',fld:'DLTARTDSC',pic:''},{av:'A12152DltColNom',fld:'DLTCOLNOM',pic:''},{av:'A12153DltColNum',fld:'DLTCOLNUM',pic:'ZZZZZ9'},{av:'A12154DltTc',fld:'DLTTC',pic:'Z9'},{av:'A12155DltColClNm',fld:'DLTCOLCLNM',pic:''},{av:'A12156DltColClNr',fld:'DLTCOLCLNR',pic:'ZZZZZ9'},{av:'A12157DltGrm2',fld:'DLTGRM2',pic:'ZZZ9'},{av:'A12158DltAnc',fld:'DLTANC',pic:'ZZZ9'},{av:'A12159DltAlbObs',fld:'DLTALBOBS',pic:''},{av:'A12160DltUltTxt',fld:'DLTULTTXT',pic:'ZZZ9'},{av:'A12161DltUltFs',fld:'DLTULTFS',pic:'ZZZ9'},{av:'A12162DltEncCli',fld:'DLTENCCLI',pic:''},{av:'A12163DltPreKg',fld:'DLTPREKG',pic:'ZZZZZZ9.99999'},{av:'A12164DltPreMt',fld:'DLTPREMT',pic:'ZZZZZZ9.99999'},{av:'A12186DltKgsCli',fld:'DLTKGSCLI',pic:'ZZZZZ9.99'},{av:'A12187DltTubo',fld:'DLTTUBO',pic:'ZZZ9'},{av:'A12188DltTuboN',fld:'DLTTUBON',pic:''},{av:'A12287DltModCod',fld:'DLTMODCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z30AlbProCod'},{av:'Z12176DltHdr'},{av:'Z12177DltR'},{av:'Z12178DltP'},{av:'Z407EmprNom'},{av:'Z12145DltKgs'},{av:'Z12146DltMts'},{av:'Z12147DltPzs'},{av:'Z12148DltBultos'},{av:'Z12149DltTubos'},{av:'Z12150DltArtCod'},{av:'Z12151DltArtDsc'},{av:'Z12152DltColNom'},{av:'Z12153DltColNum'},{av:'Z12154DltTc'},{av:'Z12155DltColClNm'},{av:'Z12156DltColClNr'},{av:'Z12157DltGrm2'},{av:'Z12158DltAnc'},{av:'Z12159DltAlbObs'},{av:'Z12160DltUltTxt'},{av:'Z12161DltUltFs'},{av:'Z12162DltEncCli'},{av:'Z12163DltPreKg'},{av:'Z12164DltPreMt'},{av:'Z12186DltKgsCli'},{av:'Z12187DltTubo'},{av:'Z12188DltTuboN'},{av:'Z12287DltModCod'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_DLTLINTXT","{handler:'valid_Dltlintxt',iparms:[]");
      setEventMetadata("VALID_DLTLINTXT",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Dltpzstxt',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_DLTNPIEZA","{handler:'valid_Dltnpieza',iparms:[]");
      setEventMetadata("VALID_DLTNPIEZA",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Dltancpz',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_DLTNTROZO","{handler:'valid_Dltntrozo',iparms:[]");
      setEventMetadata("VALID_DLTNTROZO",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Dltanctrz',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_DLTLIN","{handler:'valid_Dltlin',iparms:[]");
      setEventMetadata("VALID_DLTLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Dltprmbfs',iparms:[]");
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
      pr_default.close(46);
      pr_default.close(47);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z12178DltP = "" ;
      Z12145DltKgs = DecimalUtil.ZERO ;
      Z12146DltMts = DecimalUtil.ZERO ;
      Z12150DltArtCod = "" ;
      Z12151DltArtDsc = "" ;
      Z12152DltColNom = "" ;
      Z12155DltColClNm = "" ;
      Z12159DltAlbObs = "" ;
      Z12162DltEncCli = "" ;
      Z12163DltPreKg = DecimalUtil.ZERO ;
      Z12164DltPreMt = DecimalUtil.ZERO ;
      Z12186DltKgsCli = DecimalUtil.ZERO ;
      Z12188DltTuboN = "" ;
      Z12287DltModCod = "" ;
      Z12165DltDsc = "" ;
      Z12288DltRD = DecimalUtil.ZERO ;
      Z12289DltPKg = DecimalUtil.ZERO ;
      Z12291DltKgsTxt = DecimalUtil.ZERO ;
      Z12290DltPMt = DecimalUtil.ZERO ;
      Z12292DltMtsTxt = DecimalUtil.ZERO ;
      Z12293DltImpTxt = DecimalUtil.ZERO ;
      Z12294DltTipTxt = "" ;
      Z12295DltCodTxt = "" ;
      Z12180DltNPieza = "" ;
      Z12166DltKgsPz = DecimalUtil.ZERO ;
      Z12167DltMtsPz = DecimalUtil.ZERO ;
      Z12169DltKgsTrz = DecimalUtil.ZERO ;
      Z12170DltMtsTrz = DecimalUtil.ZERO ;
      Z12172DltFascod = "" ;
      Z12173DltFasDsc = "" ;
      Z12174DltKgsFs = DecimalUtil.ZERO ;
      Z12175DltMtsFs = DecimalUtil.ZERO ;
      Z12189DltPrKFs = DecimalUtil.ZERO ;
      Z12190DltPrMFs = DecimalUtil.ZERO ;
      Z12191DltPrKBFs = DecimalUtil.ZERO ;
      Z12192DltPrMBFs = DecimalUtil.ZERO ;
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
      lblTextblock3_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A12178DltP = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A12145DltKgs = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      A12146DltMts = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A12150DltArtCod = "" ;
      lblTextblock13_Jsonclick = "" ;
      A12151DltArtDsc = "" ;
      lblTextblock14_Jsonclick = "" ;
      A12152DltColNom = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      A12155DltColClNm = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      A12159DltAlbObs = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      A12162DltEncCli = "" ;
      lblTextblock25_Jsonclick = "" ;
      A12163DltPreKg = DecimalUtil.ZERO ;
      lblTextblock26_Jsonclick = "" ;
      A12164DltPreMt = DecimalUtil.ZERO ;
      lblTextblock27_Jsonclick = "" ;
      A12186DltKgsCli = DecimalUtil.ZERO ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      A12188DltTuboN = "" ;
      lblTextblock30_Jsonclick = "" ;
      A12287DltModCod = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1689 = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1690 = "" ;
      Grid4Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1692 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV33Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1688 = "" ;
      GXCCtl = "" ;
      A12172DltFascod = "" ;
      A12173DltFasDsc = "" ;
      A12174DltKgsFs = DecimalUtil.ZERO ;
      A12175DltMtsFs = DecimalUtil.ZERO ;
      A12189DltPrKFs = DecimalUtil.ZERO ;
      A12190DltPrMFs = DecimalUtil.ZERO ;
      A12191DltPrKBFs = DecimalUtil.ZERO ;
      A12192DltPrMBFs = DecimalUtil.ZERO ;
      A12169DltKgsTrz = DecimalUtil.ZERO ;
      A12170DltMtsTrz = DecimalUtil.ZERO ;
      A12180DltNPieza = "" ;
      A12166DltKgsPz = DecimalUtil.ZERO ;
      A12167DltMtsPz = DecimalUtil.ZERO ;
      A12165DltDsc = "" ;
      A12288DltRD = DecimalUtil.ZERO ;
      A12289DltPKg = DecimalUtil.ZERO ;
      A12291DltKgsTxt = DecimalUtil.ZERO ;
      A12290DltPMt = DecimalUtil.ZERO ;
      A12292DltMtsTxt = DecimalUtil.ZERO ;
      A12293DltImpTxt = DecimalUtil.ZERO ;
      A12294DltTipTxt = "" ;
      A12295DltCodTxt = "" ;
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
      T01J912_A407EmprNom = new String[] {""} ;
      T01J912_n407EmprNom = new boolean[] {false} ;
      T01J914_A12176DltHdr = new int[1] ;
      T01J914_A12177DltR = new byte[1] ;
      T01J914_A12178DltP = new String[] {""} ;
      T01J914_A407EmprNom = new String[] {""} ;
      T01J914_n407EmprNom = new boolean[] {false} ;
      T01J914_A12145DltKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J914_n12145DltKgs = new boolean[] {false} ;
      T01J914_A12146DltMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J914_n12146DltMts = new boolean[] {false} ;
      T01J914_A12147DltPzs = new int[1] ;
      T01J914_n12147DltPzs = new boolean[] {false} ;
      T01J914_A12148DltBultos = new short[1] ;
      T01J914_n12148DltBultos = new boolean[] {false} ;
      T01J914_A12149DltTubos = new int[1] ;
      T01J914_n12149DltTubos = new boolean[] {false} ;
      T01J914_A12150DltArtCod = new String[] {""} ;
      T01J914_n12150DltArtCod = new boolean[] {false} ;
      T01J914_A12151DltArtDsc = new String[] {""} ;
      T01J914_n12151DltArtDsc = new boolean[] {false} ;
      T01J914_A12152DltColNom = new String[] {""} ;
      T01J914_n12152DltColNom = new boolean[] {false} ;
      T01J914_A12153DltColNum = new int[1] ;
      T01J914_n12153DltColNum = new boolean[] {false} ;
      T01J914_A12154DltTc = new byte[1] ;
      T01J914_n12154DltTc = new boolean[] {false} ;
      T01J914_A12155DltColClNm = new String[] {""} ;
      T01J914_n12155DltColClNm = new boolean[] {false} ;
      T01J914_A12156DltColClNr = new int[1] ;
      T01J914_n12156DltColClNr = new boolean[] {false} ;
      T01J914_A12157DltGrm2 = new short[1] ;
      T01J914_n12157DltGrm2 = new boolean[] {false} ;
      T01J914_A12158DltAnc = new short[1] ;
      T01J914_n12158DltAnc = new boolean[] {false} ;
      T01J914_A12159DltAlbObs = new String[] {""} ;
      T01J914_n12159DltAlbObs = new boolean[] {false} ;
      T01J914_A12160DltUltTxt = new short[1] ;
      T01J914_n12160DltUltTxt = new boolean[] {false} ;
      T01J914_A12161DltUltFs = new short[1] ;
      T01J914_n12161DltUltFs = new boolean[] {false} ;
      T01J914_A12162DltEncCli = new String[] {""} ;
      T01J914_n12162DltEncCli = new boolean[] {false} ;
      T01J914_A12163DltPreKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J914_n12163DltPreKg = new boolean[] {false} ;
      T01J914_A12164DltPreMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J914_n12164DltPreMt = new boolean[] {false} ;
      T01J914_A12186DltKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J914_n12186DltKgsCli = new boolean[] {false} ;
      T01J914_A12187DltTubo = new short[1] ;
      T01J914_n12187DltTubo = new boolean[] {false} ;
      T01J914_A12188DltTuboN = new String[] {""} ;
      T01J914_n12188DltTuboN = new boolean[] {false} ;
      T01J914_A12287DltModCod = new String[] {""} ;
      T01J914_n12287DltModCod = new boolean[] {false} ;
      T01J914_A396EmprCod = new String[] {""} ;
      T01J914_A30AlbProCod = new long[1] ;
      T01J913_A396EmprCod = new String[] {""} ;
      T01J915_A396EmprCod = new String[] {""} ;
      T01J916_A396EmprCod = new String[] {""} ;
      T01J916_A30AlbProCod = new long[1] ;
      T01J916_A12176DltHdr = new int[1] ;
      T01J916_A12177DltR = new byte[1] ;
      T01J916_A12178DltP = new String[] {""} ;
      T01J911_A12176DltHdr = new int[1] ;
      T01J911_A12177DltR = new byte[1] ;
      T01J911_A12178DltP = new String[] {""} ;
      T01J911_A12145DltKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J911_n12145DltKgs = new boolean[] {false} ;
      T01J911_A12146DltMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J911_n12146DltMts = new boolean[] {false} ;
      T01J911_A12147DltPzs = new int[1] ;
      T01J911_n12147DltPzs = new boolean[] {false} ;
      T01J911_A12148DltBultos = new short[1] ;
      T01J911_n12148DltBultos = new boolean[] {false} ;
      T01J911_A12149DltTubos = new int[1] ;
      T01J911_n12149DltTubos = new boolean[] {false} ;
      T01J911_A12150DltArtCod = new String[] {""} ;
      T01J911_n12150DltArtCod = new boolean[] {false} ;
      T01J911_A12151DltArtDsc = new String[] {""} ;
      T01J911_n12151DltArtDsc = new boolean[] {false} ;
      T01J911_A12152DltColNom = new String[] {""} ;
      T01J911_n12152DltColNom = new boolean[] {false} ;
      T01J911_A12153DltColNum = new int[1] ;
      T01J911_n12153DltColNum = new boolean[] {false} ;
      T01J911_A12154DltTc = new byte[1] ;
      T01J911_n12154DltTc = new boolean[] {false} ;
      T01J911_A12155DltColClNm = new String[] {""} ;
      T01J911_n12155DltColClNm = new boolean[] {false} ;
      T01J911_A12156DltColClNr = new int[1] ;
      T01J911_n12156DltColClNr = new boolean[] {false} ;
      T01J911_A12157DltGrm2 = new short[1] ;
      T01J911_n12157DltGrm2 = new boolean[] {false} ;
      T01J911_A12158DltAnc = new short[1] ;
      T01J911_n12158DltAnc = new boolean[] {false} ;
      T01J911_A12159DltAlbObs = new String[] {""} ;
      T01J911_n12159DltAlbObs = new boolean[] {false} ;
      T01J911_A12160DltUltTxt = new short[1] ;
      T01J911_n12160DltUltTxt = new boolean[] {false} ;
      T01J911_A12161DltUltFs = new short[1] ;
      T01J911_n12161DltUltFs = new boolean[] {false} ;
      T01J911_A12162DltEncCli = new String[] {""} ;
      T01J911_n12162DltEncCli = new boolean[] {false} ;
      T01J911_A12163DltPreKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J911_n12163DltPreKg = new boolean[] {false} ;
      T01J911_A12164DltPreMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J911_n12164DltPreMt = new boolean[] {false} ;
      T01J911_A12186DltKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J911_n12186DltKgsCli = new boolean[] {false} ;
      T01J911_A12187DltTubo = new short[1] ;
      T01J911_n12187DltTubo = new boolean[] {false} ;
      T01J911_A12188DltTuboN = new String[] {""} ;
      T01J911_n12188DltTuboN = new boolean[] {false} ;
      T01J911_A12287DltModCod = new String[] {""} ;
      T01J911_n12287DltModCod = new boolean[] {false} ;
      T01J911_A396EmprCod = new String[] {""} ;
      T01J911_A30AlbProCod = new long[1] ;
      T01J917_A396EmprCod = new String[] {""} ;
      T01J917_A30AlbProCod = new long[1] ;
      T01J917_A12176DltHdr = new int[1] ;
      T01J917_A12177DltR = new byte[1] ;
      T01J917_A12178DltP = new String[] {""} ;
      T01J918_A396EmprCod = new String[] {""} ;
      T01J918_A30AlbProCod = new long[1] ;
      T01J918_A12176DltHdr = new int[1] ;
      T01J918_A12177DltR = new byte[1] ;
      T01J918_A12178DltP = new String[] {""} ;
      T01J910_A12176DltHdr = new int[1] ;
      T01J910_A12177DltR = new byte[1] ;
      T01J910_A12178DltP = new String[] {""} ;
      T01J910_A12145DltKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J910_n12145DltKgs = new boolean[] {false} ;
      T01J910_A12146DltMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J910_n12146DltMts = new boolean[] {false} ;
      T01J910_A12147DltPzs = new int[1] ;
      T01J910_n12147DltPzs = new boolean[] {false} ;
      T01J910_A12148DltBultos = new short[1] ;
      T01J910_n12148DltBultos = new boolean[] {false} ;
      T01J910_A12149DltTubos = new int[1] ;
      T01J910_n12149DltTubos = new boolean[] {false} ;
      T01J910_A12150DltArtCod = new String[] {""} ;
      T01J910_n12150DltArtCod = new boolean[] {false} ;
      T01J910_A12151DltArtDsc = new String[] {""} ;
      T01J910_n12151DltArtDsc = new boolean[] {false} ;
      T01J910_A12152DltColNom = new String[] {""} ;
      T01J910_n12152DltColNom = new boolean[] {false} ;
      T01J910_A12153DltColNum = new int[1] ;
      T01J910_n12153DltColNum = new boolean[] {false} ;
      T01J910_A12154DltTc = new byte[1] ;
      T01J910_n12154DltTc = new boolean[] {false} ;
      T01J910_A12155DltColClNm = new String[] {""} ;
      T01J910_n12155DltColClNm = new boolean[] {false} ;
      T01J910_A12156DltColClNr = new int[1] ;
      T01J910_n12156DltColClNr = new boolean[] {false} ;
      T01J910_A12157DltGrm2 = new short[1] ;
      T01J910_n12157DltGrm2 = new boolean[] {false} ;
      T01J910_A12158DltAnc = new short[1] ;
      T01J910_n12158DltAnc = new boolean[] {false} ;
      T01J910_A12159DltAlbObs = new String[] {""} ;
      T01J910_n12159DltAlbObs = new boolean[] {false} ;
      T01J910_A12160DltUltTxt = new short[1] ;
      T01J910_n12160DltUltTxt = new boolean[] {false} ;
      T01J910_A12161DltUltFs = new short[1] ;
      T01J910_n12161DltUltFs = new boolean[] {false} ;
      T01J910_A12162DltEncCli = new String[] {""} ;
      T01J910_n12162DltEncCli = new boolean[] {false} ;
      T01J910_A12163DltPreKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J910_n12163DltPreKg = new boolean[] {false} ;
      T01J910_A12164DltPreMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J910_n12164DltPreMt = new boolean[] {false} ;
      T01J910_A12186DltKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J910_n12186DltKgsCli = new boolean[] {false} ;
      T01J910_A12187DltTubo = new short[1] ;
      T01J910_n12187DltTubo = new boolean[] {false} ;
      T01J910_A12188DltTuboN = new String[] {""} ;
      T01J910_n12188DltTuboN = new boolean[] {false} ;
      T01J910_A12287DltModCod = new String[] {""} ;
      T01J910_n12287DltModCod = new boolean[] {false} ;
      T01J910_A396EmprCod = new String[] {""} ;
      T01J910_A30AlbProCod = new long[1] ;
      T01J922_A396EmprCod = new String[] {""} ;
      T01J922_A30AlbProCod = new long[1] ;
      T01J922_A12176DltHdr = new int[1] ;
      T01J922_A12177DltR = new byte[1] ;
      T01J922_A12178DltP = new String[] {""} ;
      T01J922_A12180DltNPieza = new String[] {""} ;
      T01J923_A396EmprCod = new String[] {""} ;
      T01J923_A30AlbProCod = new long[1] ;
      T01J923_A12176DltHdr = new int[1] ;
      T01J923_A12177DltR = new byte[1] ;
      T01J923_A12178DltP = new String[] {""} ;
      T01J924_A30AlbProCod = new long[1] ;
      T01J924_A12176DltHdr = new int[1] ;
      T01J924_A12177DltR = new byte[1] ;
      T01J924_A12178DltP = new String[] {""} ;
      T01J924_A12179DltLinTxt = new short[1] ;
      T01J924_A12165DltDsc = new String[] {""} ;
      T01J924_n12165DltDsc = new boolean[] {false} ;
      T01J924_A12288DltRD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J924_n12288DltRD = new boolean[] {false} ;
      T01J924_A12289DltPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J924_n12289DltPKg = new boolean[] {false} ;
      T01J924_A12291DltKgsTxt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J924_n12291DltKgsTxt = new boolean[] {false} ;
      T01J924_A12290DltPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J924_n12290DltPMt = new boolean[] {false} ;
      T01J924_A12292DltMtsTxt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J924_n12292DltMtsTxt = new boolean[] {false} ;
      T01J924_A12293DltImpTxt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J924_n12293DltImpTxt = new boolean[] {false} ;
      T01J924_A12294DltTipTxt = new String[] {""} ;
      T01J924_n12294DltTipTxt = new boolean[] {false} ;
      T01J924_A12295DltCodTxt = new String[] {""} ;
      T01J924_n12295DltCodTxt = new boolean[] {false} ;
      T01J924_A12296DltPzsTxt = new int[1] ;
      T01J924_n12296DltPzsTxt = new boolean[] {false} ;
      T01J924_A396EmprCod = new String[] {""} ;
      T01J925_A396EmprCod = new String[] {""} ;
      T01J925_A30AlbProCod = new long[1] ;
      T01J925_A12176DltHdr = new int[1] ;
      T01J925_A12177DltR = new byte[1] ;
      T01J925_A12178DltP = new String[] {""} ;
      T01J925_A12179DltLinTxt = new short[1] ;
      T01J99_A30AlbProCod = new long[1] ;
      T01J99_A12176DltHdr = new int[1] ;
      T01J99_A12177DltR = new byte[1] ;
      T01J99_A12178DltP = new String[] {""} ;
      T01J99_A12179DltLinTxt = new short[1] ;
      T01J99_A12165DltDsc = new String[] {""} ;
      T01J99_n12165DltDsc = new boolean[] {false} ;
      T01J99_A12288DltRD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J99_n12288DltRD = new boolean[] {false} ;
      T01J99_A12289DltPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J99_n12289DltPKg = new boolean[] {false} ;
      T01J99_A12291DltKgsTxt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J99_n12291DltKgsTxt = new boolean[] {false} ;
      T01J99_A12290DltPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J99_n12290DltPMt = new boolean[] {false} ;
      T01J99_A12292DltMtsTxt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J99_n12292DltMtsTxt = new boolean[] {false} ;
      T01J99_A12293DltImpTxt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J99_n12293DltImpTxt = new boolean[] {false} ;
      T01J99_A12294DltTipTxt = new String[] {""} ;
      T01J99_n12294DltTipTxt = new boolean[] {false} ;
      T01J99_A12295DltCodTxt = new String[] {""} ;
      T01J99_n12295DltCodTxt = new boolean[] {false} ;
      T01J99_A12296DltPzsTxt = new int[1] ;
      T01J99_n12296DltPzsTxt = new boolean[] {false} ;
      T01J99_A396EmprCod = new String[] {""} ;
      T01J98_A30AlbProCod = new long[1] ;
      T01J98_A12176DltHdr = new int[1] ;
      T01J98_A12177DltR = new byte[1] ;
      T01J98_A12178DltP = new String[] {""} ;
      T01J98_A12179DltLinTxt = new short[1] ;
      T01J98_A12165DltDsc = new String[] {""} ;
      T01J98_n12165DltDsc = new boolean[] {false} ;
      T01J98_A12288DltRD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J98_n12288DltRD = new boolean[] {false} ;
      T01J98_A12289DltPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J98_n12289DltPKg = new boolean[] {false} ;
      T01J98_A12291DltKgsTxt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J98_n12291DltKgsTxt = new boolean[] {false} ;
      T01J98_A12290DltPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J98_n12290DltPMt = new boolean[] {false} ;
      T01J98_A12292DltMtsTxt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J98_n12292DltMtsTxt = new boolean[] {false} ;
      T01J98_A12293DltImpTxt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J98_n12293DltImpTxt = new boolean[] {false} ;
      T01J98_A12294DltTipTxt = new String[] {""} ;
      T01J98_n12294DltTipTxt = new boolean[] {false} ;
      T01J98_A12295DltCodTxt = new String[] {""} ;
      T01J98_n12295DltCodTxt = new boolean[] {false} ;
      T01J98_A12296DltPzsTxt = new int[1] ;
      T01J98_n12296DltPzsTxt = new boolean[] {false} ;
      T01J98_A396EmprCod = new String[] {""} ;
      T01J929_A396EmprCod = new String[] {""} ;
      T01J929_A30AlbProCod = new long[1] ;
      T01J929_A12176DltHdr = new int[1] ;
      T01J929_A12177DltR = new byte[1] ;
      T01J929_A12178DltP = new String[] {""} ;
      T01J929_A12179DltLinTxt = new short[1] ;
      T01J930_A30AlbProCod = new long[1] ;
      T01J930_A12176DltHdr = new int[1] ;
      T01J930_A12177DltR = new byte[1] ;
      T01J930_A12178DltP = new String[] {""} ;
      T01J930_A12180DltNPieza = new String[] {""} ;
      T01J930_A12166DltKgsPz = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J930_n12166DltKgsPz = new boolean[] {false} ;
      T01J930_A12167DltMtsPz = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J930_n12167DltMtsPz = new boolean[] {false} ;
      T01J930_A12168DltAncPz = new short[1] ;
      T01J930_n12168DltAncPz = new boolean[] {false} ;
      T01J930_A396EmprCod = new String[] {""} ;
      T01J931_A396EmprCod = new String[] {""} ;
      T01J931_A30AlbProCod = new long[1] ;
      T01J931_A12176DltHdr = new int[1] ;
      T01J931_A12177DltR = new byte[1] ;
      T01J931_A12178DltP = new String[] {""} ;
      T01J931_A12180DltNPieza = new String[] {""} ;
      T01J97_A30AlbProCod = new long[1] ;
      T01J97_A12176DltHdr = new int[1] ;
      T01J97_A12177DltR = new byte[1] ;
      T01J97_A12178DltP = new String[] {""} ;
      T01J97_A12180DltNPieza = new String[] {""} ;
      T01J97_A12166DltKgsPz = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J97_n12166DltKgsPz = new boolean[] {false} ;
      T01J97_A12167DltMtsPz = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J97_n12167DltMtsPz = new boolean[] {false} ;
      T01J97_A12168DltAncPz = new short[1] ;
      T01J97_n12168DltAncPz = new boolean[] {false} ;
      T01J97_A396EmprCod = new String[] {""} ;
      T01J96_A30AlbProCod = new long[1] ;
      T01J96_A12176DltHdr = new int[1] ;
      T01J96_A12177DltR = new byte[1] ;
      T01J96_A12178DltP = new String[] {""} ;
      T01J96_A12180DltNPieza = new String[] {""} ;
      T01J96_A12166DltKgsPz = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J96_n12166DltKgsPz = new boolean[] {false} ;
      T01J96_A12167DltMtsPz = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J96_n12167DltMtsPz = new boolean[] {false} ;
      T01J96_A12168DltAncPz = new short[1] ;
      T01J96_n12168DltAncPz = new boolean[] {false} ;
      T01J96_A396EmprCod = new String[] {""} ;
      T01J935_A396EmprCod = new String[] {""} ;
      T01J935_A30AlbProCod = new long[1] ;
      T01J935_A12176DltHdr = new int[1] ;
      T01J935_A12177DltR = new byte[1] ;
      T01J935_A12178DltP = new String[] {""} ;
      T01J935_A12180DltNPieza = new String[] {""} ;
      T01J936_A30AlbProCod = new long[1] ;
      T01J936_A12176DltHdr = new int[1] ;
      T01J936_A12177DltR = new byte[1] ;
      T01J936_A12178DltP = new String[] {""} ;
      T01J936_A12180DltNPieza = new String[] {""} ;
      T01J936_A12181DltNTrozo = new short[1] ;
      T01J936_A12169DltKgsTrz = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J936_n12169DltKgsTrz = new boolean[] {false} ;
      T01J936_A12170DltMtsTrz = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J936_n12170DltMtsTrz = new boolean[] {false} ;
      T01J936_A12171DltAncTrz = new short[1] ;
      T01J936_n12171DltAncTrz = new boolean[] {false} ;
      T01J936_A396EmprCod = new String[] {""} ;
      T01J937_A396EmprCod = new String[] {""} ;
      T01J937_A30AlbProCod = new long[1] ;
      T01J937_A12176DltHdr = new int[1] ;
      T01J937_A12177DltR = new byte[1] ;
      T01J937_A12178DltP = new String[] {""} ;
      T01J937_A12180DltNPieza = new String[] {""} ;
      T01J937_A12181DltNTrozo = new short[1] ;
      T01J95_A30AlbProCod = new long[1] ;
      T01J95_A12176DltHdr = new int[1] ;
      T01J95_A12177DltR = new byte[1] ;
      T01J95_A12178DltP = new String[] {""} ;
      T01J95_A12180DltNPieza = new String[] {""} ;
      T01J95_A12181DltNTrozo = new short[1] ;
      T01J95_A12169DltKgsTrz = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J95_n12169DltKgsTrz = new boolean[] {false} ;
      T01J95_A12170DltMtsTrz = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J95_n12170DltMtsTrz = new boolean[] {false} ;
      T01J95_A12171DltAncTrz = new short[1] ;
      T01J95_n12171DltAncTrz = new boolean[] {false} ;
      T01J95_A396EmprCod = new String[] {""} ;
      sMode1691 = "" ;
      T01J94_A30AlbProCod = new long[1] ;
      T01J94_A12176DltHdr = new int[1] ;
      T01J94_A12177DltR = new byte[1] ;
      T01J94_A12178DltP = new String[] {""} ;
      T01J94_A12180DltNPieza = new String[] {""} ;
      T01J94_A12181DltNTrozo = new short[1] ;
      T01J94_A12169DltKgsTrz = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J94_n12169DltKgsTrz = new boolean[] {false} ;
      T01J94_A12170DltMtsTrz = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J94_n12170DltMtsTrz = new boolean[] {false} ;
      T01J94_A12171DltAncTrz = new short[1] ;
      T01J94_n12171DltAncTrz = new boolean[] {false} ;
      T01J94_A396EmprCod = new String[] {""} ;
      T01J941_A396EmprCod = new String[] {""} ;
      T01J941_A30AlbProCod = new long[1] ;
      T01J941_A12176DltHdr = new int[1] ;
      T01J941_A12177DltR = new byte[1] ;
      T01J941_A12178DltP = new String[] {""} ;
      T01J941_A12180DltNPieza = new String[] {""} ;
      T01J941_A12181DltNTrozo = new short[1] ;
      T01J942_A30AlbProCod = new long[1] ;
      T01J942_A12176DltHdr = new int[1] ;
      T01J942_A12177DltR = new byte[1] ;
      T01J942_A12178DltP = new String[] {""} ;
      T01J942_A12182DltLin = new short[1] ;
      T01J942_A12172DltFascod = new String[] {""} ;
      T01J942_n12172DltFascod = new boolean[] {false} ;
      T01J942_A12173DltFasDsc = new String[] {""} ;
      T01J942_n12173DltFasDsc = new boolean[] {false} ;
      T01J942_A12174DltKgsFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J942_n12174DltKgsFs = new boolean[] {false} ;
      T01J942_A12175DltMtsFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J942_n12175DltMtsFs = new boolean[] {false} ;
      T01J942_A12189DltPrKFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J942_n12189DltPrKFs = new boolean[] {false} ;
      T01J942_A12190DltPrMFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J942_n12190DltPrMFs = new boolean[] {false} ;
      T01J942_A12191DltPrKBFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J942_n12191DltPrKBFs = new boolean[] {false} ;
      T01J942_A12192DltPrMBFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J942_n12192DltPrMBFs = new boolean[] {false} ;
      T01J942_A396EmprCod = new String[] {""} ;
      T01J943_A396EmprCod = new String[] {""} ;
      T01J943_A30AlbProCod = new long[1] ;
      T01J943_A12176DltHdr = new int[1] ;
      T01J943_A12177DltR = new byte[1] ;
      T01J943_A12178DltP = new String[] {""} ;
      T01J943_A12182DltLin = new short[1] ;
      T01J93_A30AlbProCod = new long[1] ;
      T01J93_A12176DltHdr = new int[1] ;
      T01J93_A12177DltR = new byte[1] ;
      T01J93_A12178DltP = new String[] {""} ;
      T01J93_A12182DltLin = new short[1] ;
      T01J93_A12172DltFascod = new String[] {""} ;
      T01J93_n12172DltFascod = new boolean[] {false} ;
      T01J93_A12173DltFasDsc = new String[] {""} ;
      T01J93_n12173DltFasDsc = new boolean[] {false} ;
      T01J93_A12174DltKgsFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J93_n12174DltKgsFs = new boolean[] {false} ;
      T01J93_A12175DltMtsFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J93_n12175DltMtsFs = new boolean[] {false} ;
      T01J93_A12189DltPrKFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J93_n12189DltPrKFs = new boolean[] {false} ;
      T01J93_A12190DltPrMFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J93_n12190DltPrMFs = new boolean[] {false} ;
      T01J93_A12191DltPrKBFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J93_n12191DltPrKBFs = new boolean[] {false} ;
      T01J93_A12192DltPrMBFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J93_n12192DltPrMBFs = new boolean[] {false} ;
      T01J93_A396EmprCod = new String[] {""} ;
      T01J92_A30AlbProCod = new long[1] ;
      T01J92_A12176DltHdr = new int[1] ;
      T01J92_A12177DltR = new byte[1] ;
      T01J92_A12178DltP = new String[] {""} ;
      T01J92_A12182DltLin = new short[1] ;
      T01J92_A12172DltFascod = new String[] {""} ;
      T01J92_n12172DltFascod = new boolean[] {false} ;
      T01J92_A12173DltFasDsc = new String[] {""} ;
      T01J92_n12173DltFasDsc = new boolean[] {false} ;
      T01J92_A12174DltKgsFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J92_n12174DltKgsFs = new boolean[] {false} ;
      T01J92_A12175DltMtsFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J92_n12175DltMtsFs = new boolean[] {false} ;
      T01J92_A12189DltPrKFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J92_n12189DltPrKFs = new boolean[] {false} ;
      T01J92_A12190DltPrMFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J92_n12190DltPrMFs = new boolean[] {false} ;
      T01J92_A12191DltPrKBFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J92_n12191DltPrKBFs = new boolean[] {false} ;
      T01J92_A12192DltPrMBFs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01J92_n12192DltPrMBFs = new boolean[] {false} ;
      T01J92_A396EmprCod = new String[] {""} ;
      T01J947_A396EmprCod = new String[] {""} ;
      T01J947_A30AlbProCod = new long[1] ;
      T01J947_A12176DltHdr = new int[1] ;
      T01J947_A12177DltR = new byte[1] ;
      T01J947_A12178DltP = new String[] {""} ;
      T01J947_A12182DltLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      lblTextblock31_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      Grid3Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid3Row = new com.genexus.webpanels.GXWebRow();
      subGrid3_Linesclass = "" ;
      Grid4Row = new com.genexus.webpanels.GXWebRow();
      subGrid4_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      subGrid2_Header = "" ;
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      Grid4Column = new com.genexus.webpanels.GXWebColumn();
      Grid3Column = new com.genexus.webpanels.GXWebColumn();
      T01J948_A407EmprNom = new String[] {""} ;
      T01J948_n407EmprNom = new boolean[] {false} ;
      T01J949_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ12178DltP = "" ;
      ZZ407EmprNom = "" ;
      ZZ12145DltKgs = DecimalUtil.ZERO ;
      ZZ12146DltMts = DecimalUtil.ZERO ;
      ZZ12150DltArtCod = "" ;
      ZZ12151DltArtDsc = "" ;
      ZZ12152DltColNom = "" ;
      ZZ12155DltColClNm = "" ;
      ZZ12159DltAlbObs = "" ;
      ZZ12162DltEncCli = "" ;
      ZZ12163DltPreKg = DecimalUtil.ZERO ;
      ZZ12164DltPreMt = DecimalUtil.ZERO ;
      ZZ12186DltKgsCli = DecimalUtil.ZERO ;
      ZZ12188DltTuboN = "" ;
      ZZ12287DltModCod = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdlt001__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdlt001__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdlt001__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdlt001__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdlt001__default(),
         new Object[] {
             new Object[] {
            T01J92_A30AlbProCod, T01J92_A12176DltHdr, T01J92_A12177DltR, T01J92_A12178DltP, T01J92_A12182DltLin, T01J92_A12172DltFascod, T01J92_n12172DltFascod, T01J92_A12173DltFasDsc, T01J92_n12173DltFasDsc, T01J92_A12174DltKgsFs,
            T01J92_n12174DltKgsFs, T01J92_A12175DltMtsFs, T01J92_n12175DltMtsFs, T01J92_A12189DltPrKFs, T01J92_n12189DltPrKFs, T01J92_A12190DltPrMFs, T01J92_n12190DltPrMFs, T01J92_A12191DltPrKBFs, T01J92_n12191DltPrKBFs, T01J92_A12192DltPrMBFs,
            T01J92_n12192DltPrMBFs, T01J92_A396EmprCod
            }
            , new Object[] {
            T01J93_A30AlbProCod, T01J93_A12176DltHdr, T01J93_A12177DltR, T01J93_A12178DltP, T01J93_A12182DltLin, T01J93_A12172DltFascod, T01J93_n12172DltFascod, T01J93_A12173DltFasDsc, T01J93_n12173DltFasDsc, T01J93_A12174DltKgsFs,
            T01J93_n12174DltKgsFs, T01J93_A12175DltMtsFs, T01J93_n12175DltMtsFs, T01J93_A12189DltPrKFs, T01J93_n12189DltPrKFs, T01J93_A12190DltPrMFs, T01J93_n12190DltPrMFs, T01J93_A12191DltPrKBFs, T01J93_n12191DltPrKBFs, T01J93_A12192DltPrMBFs,
            T01J93_n12192DltPrMBFs, T01J93_A396EmprCod
            }
            , new Object[] {
            T01J94_A30AlbProCod, T01J94_A12176DltHdr, T01J94_A12177DltR, T01J94_A12178DltP, T01J94_A12180DltNPieza, T01J94_A12181DltNTrozo, T01J94_A12169DltKgsTrz, T01J94_n12169DltKgsTrz, T01J94_A12170DltMtsTrz, T01J94_n12170DltMtsTrz,
            T01J94_A12171DltAncTrz, T01J94_n12171DltAncTrz, T01J94_A396EmprCod
            }
            , new Object[] {
            T01J95_A30AlbProCod, T01J95_A12176DltHdr, T01J95_A12177DltR, T01J95_A12178DltP, T01J95_A12180DltNPieza, T01J95_A12181DltNTrozo, T01J95_A12169DltKgsTrz, T01J95_n12169DltKgsTrz, T01J95_A12170DltMtsTrz, T01J95_n12170DltMtsTrz,
            T01J95_A12171DltAncTrz, T01J95_n12171DltAncTrz, T01J95_A396EmprCod
            }
            , new Object[] {
            T01J96_A30AlbProCod, T01J96_A12176DltHdr, T01J96_A12177DltR, T01J96_A12178DltP, T01J96_A12180DltNPieza, T01J96_A12166DltKgsPz, T01J96_n12166DltKgsPz, T01J96_A12167DltMtsPz, T01J96_n12167DltMtsPz, T01J96_A12168DltAncPz,
            T01J96_n12168DltAncPz, T01J96_A396EmprCod
            }
            , new Object[] {
            T01J97_A30AlbProCod, T01J97_A12176DltHdr, T01J97_A12177DltR, T01J97_A12178DltP, T01J97_A12180DltNPieza, T01J97_A12166DltKgsPz, T01J97_n12166DltKgsPz, T01J97_A12167DltMtsPz, T01J97_n12167DltMtsPz, T01J97_A12168DltAncPz,
            T01J97_n12168DltAncPz, T01J97_A396EmprCod
            }
            , new Object[] {
            T01J98_A30AlbProCod, T01J98_A12176DltHdr, T01J98_A12177DltR, T01J98_A12178DltP, T01J98_A12179DltLinTxt, T01J98_A12165DltDsc, T01J98_n12165DltDsc, T01J98_A12288DltRD, T01J98_n12288DltRD, T01J98_A12289DltPKg,
            T01J98_n12289DltPKg, T01J98_A12291DltKgsTxt, T01J98_n12291DltKgsTxt, T01J98_A12290DltPMt, T01J98_n12290DltPMt, T01J98_A12292DltMtsTxt, T01J98_n12292DltMtsTxt, T01J98_A12293DltImpTxt, T01J98_n12293DltImpTxt, T01J98_A12294DltTipTxt,
            T01J98_n12294DltTipTxt, T01J98_A12295DltCodTxt, T01J98_n12295DltCodTxt, T01J98_A12296DltPzsTxt, T01J98_n12296DltPzsTxt, T01J98_A396EmprCod
            }
            , new Object[] {
            T01J99_A30AlbProCod, T01J99_A12176DltHdr, T01J99_A12177DltR, T01J99_A12178DltP, T01J99_A12179DltLinTxt, T01J99_A12165DltDsc, T01J99_n12165DltDsc, T01J99_A12288DltRD, T01J99_n12288DltRD, T01J99_A12289DltPKg,
            T01J99_n12289DltPKg, T01J99_A12291DltKgsTxt, T01J99_n12291DltKgsTxt, T01J99_A12290DltPMt, T01J99_n12290DltPMt, T01J99_A12292DltMtsTxt, T01J99_n12292DltMtsTxt, T01J99_A12293DltImpTxt, T01J99_n12293DltImpTxt, T01J99_A12294DltTipTxt,
            T01J99_n12294DltTipTxt, T01J99_A12295DltCodTxt, T01J99_n12295DltCodTxt, T01J99_A12296DltPzsTxt, T01J99_n12296DltPzsTxt, T01J99_A396EmprCod
            }
            , new Object[] {
            T01J910_A12176DltHdr, T01J910_A12177DltR, T01J910_A12178DltP, T01J910_A12145DltKgs, T01J910_n12145DltKgs, T01J910_A12146DltMts, T01J910_n12146DltMts, T01J910_A12147DltPzs, T01J910_n12147DltPzs, T01J910_A12148DltBultos,
            T01J910_n12148DltBultos, T01J910_A12149DltTubos, T01J910_n12149DltTubos, T01J910_A12150DltArtCod, T01J910_n12150DltArtCod, T01J910_A12151DltArtDsc, T01J910_n12151DltArtDsc, T01J910_A12152DltColNom, T01J910_n12152DltColNom, T01J910_A12153DltColNum,
            T01J910_n12153DltColNum, T01J910_A12154DltTc, T01J910_n12154DltTc, T01J910_A12155DltColClNm, T01J910_n12155DltColClNm, T01J910_A12156DltColClNr, T01J910_n12156DltColClNr, T01J910_A12157DltGrm2, T01J910_n12157DltGrm2, T01J910_A12158DltAnc,
            T01J910_n12158DltAnc, T01J910_A12159DltAlbObs, T01J910_n12159DltAlbObs, T01J910_A12160DltUltTxt, T01J910_n12160DltUltTxt, T01J910_A12161DltUltFs, T01J910_n12161DltUltFs, T01J910_A12162DltEncCli, T01J910_n12162DltEncCli, T01J910_A12163DltPreKg,
            T01J910_n12163DltPreKg, T01J910_A12164DltPreMt, T01J910_n12164DltPreMt, T01J910_A12186DltKgsCli, T01J910_n12186DltKgsCli, T01J910_A12187DltTubo, T01J910_n12187DltTubo, T01J910_A12188DltTuboN, T01J910_n12188DltTuboN, T01J910_A12287DltModCod,
            T01J910_n12287DltModCod, T01J910_A396EmprCod, T01J910_A30AlbProCod
            }
            , new Object[] {
            T01J911_A12176DltHdr, T01J911_A12177DltR, T01J911_A12178DltP, T01J911_A12145DltKgs, T01J911_n12145DltKgs, T01J911_A12146DltMts, T01J911_n12146DltMts, T01J911_A12147DltPzs, T01J911_n12147DltPzs, T01J911_A12148DltBultos,
            T01J911_n12148DltBultos, T01J911_A12149DltTubos, T01J911_n12149DltTubos, T01J911_A12150DltArtCod, T01J911_n12150DltArtCod, T01J911_A12151DltArtDsc, T01J911_n12151DltArtDsc, T01J911_A12152DltColNom, T01J911_n12152DltColNom, T01J911_A12153DltColNum,
            T01J911_n12153DltColNum, T01J911_A12154DltTc, T01J911_n12154DltTc, T01J911_A12155DltColClNm, T01J911_n12155DltColClNm, T01J911_A12156DltColClNr, T01J911_n12156DltColClNr, T01J911_A12157DltGrm2, T01J911_n12157DltGrm2, T01J911_A12158DltAnc,
            T01J911_n12158DltAnc, T01J911_A12159DltAlbObs, T01J911_n12159DltAlbObs, T01J911_A12160DltUltTxt, T01J911_n12160DltUltTxt, T01J911_A12161DltUltFs, T01J911_n12161DltUltFs, T01J911_A12162DltEncCli, T01J911_n12162DltEncCli, T01J911_A12163DltPreKg,
            T01J911_n12163DltPreKg, T01J911_A12164DltPreMt, T01J911_n12164DltPreMt, T01J911_A12186DltKgsCli, T01J911_n12186DltKgsCli, T01J911_A12187DltTubo, T01J911_n12187DltTubo, T01J911_A12188DltTuboN, T01J911_n12188DltTuboN, T01J911_A12287DltModCod,
            T01J911_n12287DltModCod, T01J911_A396EmprCod, T01J911_A30AlbProCod
            }
            , new Object[] {
            T01J912_A407EmprNom, T01J912_n407EmprNom
            }
            , new Object[] {
            T01J913_A396EmprCod
            }
            , new Object[] {
            T01J914_A12176DltHdr, T01J914_A12177DltR, T01J914_A12178DltP, T01J914_A407EmprNom, T01J914_n407EmprNom, T01J914_A12145DltKgs, T01J914_n12145DltKgs, T01J914_A12146DltMts, T01J914_n12146DltMts, T01J914_A12147DltPzs,
            T01J914_n12147DltPzs, T01J914_A12148DltBultos, T01J914_n12148DltBultos, T01J914_A12149DltTubos, T01J914_n12149DltTubos, T01J914_A12150DltArtCod, T01J914_n12150DltArtCod, T01J914_A12151DltArtDsc, T01J914_n12151DltArtDsc, T01J914_A12152DltColNom,
            T01J914_n12152DltColNom, T01J914_A12153DltColNum, T01J914_n12153DltColNum, T01J914_A12154DltTc, T01J914_n12154DltTc, T01J914_A12155DltColClNm, T01J914_n12155DltColClNm, T01J914_A12156DltColClNr, T01J914_n12156DltColClNr, T01J914_A12157DltGrm2,
            T01J914_n12157DltGrm2, T01J914_A12158DltAnc, T01J914_n12158DltAnc, T01J914_A12159DltAlbObs, T01J914_n12159DltAlbObs, T01J914_A12160DltUltTxt, T01J914_n12160DltUltTxt, T01J914_A12161DltUltFs, T01J914_n12161DltUltFs, T01J914_A12162DltEncCli,
            T01J914_n12162DltEncCli, T01J914_A12163DltPreKg, T01J914_n12163DltPreKg, T01J914_A12164DltPreMt, T01J914_n12164DltPreMt, T01J914_A12186DltKgsCli, T01J914_n12186DltKgsCli, T01J914_A12187DltTubo, T01J914_n12187DltTubo, T01J914_A12188DltTuboN,
            T01J914_n12188DltTuboN, T01J914_A12287DltModCod, T01J914_n12287DltModCod, T01J914_A396EmprCod, T01J914_A30AlbProCod
            }
            , new Object[] {
            T01J915_A396EmprCod
            }
            , new Object[] {
            T01J916_A396EmprCod, T01J916_A30AlbProCod, T01J916_A12176DltHdr, T01J916_A12177DltR, T01J916_A12178DltP
            }
            , new Object[] {
            T01J917_A396EmprCod, T01J917_A30AlbProCod, T01J917_A12176DltHdr, T01J917_A12177DltR, T01J917_A12178DltP
            }
            , new Object[] {
            T01J918_A396EmprCod, T01J918_A30AlbProCod, T01J918_A12176DltHdr, T01J918_A12177DltR, T01J918_A12178DltP
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01J922_A396EmprCod, T01J922_A30AlbProCod, T01J922_A12176DltHdr, T01J922_A12177DltR, T01J922_A12178DltP, T01J922_A12180DltNPieza
            }
            , new Object[] {
            T01J923_A396EmprCod, T01J923_A30AlbProCod, T01J923_A12176DltHdr, T01J923_A12177DltR, T01J923_A12178DltP
            }
            , new Object[] {
            T01J924_A30AlbProCod, T01J924_A12176DltHdr, T01J924_A12177DltR, T01J924_A12178DltP, T01J924_A12179DltLinTxt, T01J924_A12165DltDsc, T01J924_n12165DltDsc, T01J924_A12288DltRD, T01J924_n12288DltRD, T01J924_A12289DltPKg,
            T01J924_n12289DltPKg, T01J924_A12291DltKgsTxt, T01J924_n12291DltKgsTxt, T01J924_A12290DltPMt, T01J924_n12290DltPMt, T01J924_A12292DltMtsTxt, T01J924_n12292DltMtsTxt, T01J924_A12293DltImpTxt, T01J924_n12293DltImpTxt, T01J924_A12294DltTipTxt,
            T01J924_n12294DltTipTxt, T01J924_A12295DltCodTxt, T01J924_n12295DltCodTxt, T01J924_A12296DltPzsTxt, T01J924_n12296DltPzsTxt, T01J924_A396EmprCod
            }
            , new Object[] {
            T01J925_A396EmprCod, T01J925_A30AlbProCod, T01J925_A12176DltHdr, T01J925_A12177DltR, T01J925_A12178DltP, T01J925_A12179DltLinTxt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01J929_A396EmprCod, T01J929_A30AlbProCod, T01J929_A12176DltHdr, T01J929_A12177DltR, T01J929_A12178DltP, T01J929_A12179DltLinTxt
            }
            , new Object[] {
            T01J930_A30AlbProCod, T01J930_A12176DltHdr, T01J930_A12177DltR, T01J930_A12178DltP, T01J930_A12180DltNPieza, T01J930_A12166DltKgsPz, T01J930_n12166DltKgsPz, T01J930_A12167DltMtsPz, T01J930_n12167DltMtsPz, T01J930_A12168DltAncPz,
            T01J930_n12168DltAncPz, T01J930_A396EmprCod
            }
            , new Object[] {
            T01J931_A396EmprCod, T01J931_A30AlbProCod, T01J931_A12176DltHdr, T01J931_A12177DltR, T01J931_A12178DltP, T01J931_A12180DltNPieza
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01J935_A396EmprCod, T01J935_A30AlbProCod, T01J935_A12176DltHdr, T01J935_A12177DltR, T01J935_A12178DltP, T01J935_A12180DltNPieza
            }
            , new Object[] {
            T01J936_A30AlbProCod, T01J936_A12176DltHdr, T01J936_A12177DltR, T01J936_A12178DltP, T01J936_A12180DltNPieza, T01J936_A12181DltNTrozo, T01J936_A12169DltKgsTrz, T01J936_n12169DltKgsTrz, T01J936_A12170DltMtsTrz, T01J936_n12170DltMtsTrz,
            T01J936_A12171DltAncTrz, T01J936_n12171DltAncTrz, T01J936_A396EmprCod
            }
            , new Object[] {
            T01J937_A396EmprCod, T01J937_A30AlbProCod, T01J937_A12176DltHdr, T01J937_A12177DltR, T01J937_A12178DltP, T01J937_A12180DltNPieza, T01J937_A12181DltNTrozo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01J941_A396EmprCod, T01J941_A30AlbProCod, T01J941_A12176DltHdr, T01J941_A12177DltR, T01J941_A12178DltP, T01J941_A12180DltNPieza, T01J941_A12181DltNTrozo
            }
            , new Object[] {
            T01J942_A30AlbProCod, T01J942_A12176DltHdr, T01J942_A12177DltR, T01J942_A12178DltP, T01J942_A12182DltLin, T01J942_A12172DltFascod, T01J942_n12172DltFascod, T01J942_A12173DltFasDsc, T01J942_n12173DltFasDsc, T01J942_A12174DltKgsFs,
            T01J942_n12174DltKgsFs, T01J942_A12175DltMtsFs, T01J942_n12175DltMtsFs, T01J942_A12189DltPrKFs, T01J942_n12189DltPrKFs, T01J942_A12190DltPrMFs, T01J942_n12190DltPrMFs, T01J942_A12191DltPrKBFs, T01J942_n12191DltPrKBFs, T01J942_A12192DltPrMBFs,
            T01J942_n12192DltPrMBFs, T01J942_A396EmprCod
            }
            , new Object[] {
            T01J943_A396EmprCod, T01J943_A30AlbProCod, T01J943_A12176DltHdr, T01J943_A12177DltR, T01J943_A12178DltP, T01J943_A12182DltLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01J947_A396EmprCod, T01J947_A30AlbProCod, T01J947_A12176DltHdr, T01J947_A12177DltR, T01J947_A12178DltP, T01J947_A12182DltLin
            }
            , new Object[] {
            T01J948_A407EmprNom, T01J948_n407EmprNom
            }
            , new Object[] {
            T01J949_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TDLT001" ;
   }

   private byte Z12177DltR ;
   private byte Z12154DltTc ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A12177DltR ;
   private byte A12154DltTc ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Backstyle ;
   private byte subGrid3_Backcolorstyle ;
   private byte subGrid3_Backstyle ;
   private byte subGrid4_Backcolorstyle ;
   private byte subGrid4_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte subGrid4_Allowselection ;
   private byte subGrid4_Allowhovering ;
   private byte subGrid4_Allowcollapsing ;
   private byte subGrid4_Collapsed ;
   private byte subGrid3_Allowselection ;
   private byte subGrid3_Allowhovering ;
   private byte subGrid3_Allowcollapsing ;
   private byte subGrid3_Collapsed ;
   private byte ZZ12177DltR ;
   private byte ZZ12154DltTc ;
   private short Z12148DltBultos ;
   private short Z12157DltGrm2 ;
   private short Z12158DltAnc ;
   private short Z12160DltUltTxt ;
   private short Z12161DltUltFs ;
   private short Z12187DltTubo ;
   private short Z12179DltLinTxt ;
   private short nRcdDeleted_1689 ;
   private short nRcdExists_1689 ;
   private short nIsMod_1689 ;
   private short Z12168DltAncPz ;
   private short nRcdDeleted_1690 ;
   private short nRcdExists_1690 ;
   private short nIsMod_1690 ;
   private short Z12181DltNTrozo ;
   private short Z12171DltAncTrz ;
   private short nRcdDeleted_1691 ;
   private short nRcdExists_1691 ;
   private short nIsMod_1691 ;
   private short Z12182DltLin ;
   private short nRcdDeleted_1692 ;
   private short nRcdExists_1692 ;
   private short nIsMod_1692 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12148DltBultos ;
   private short A12157DltGrm2 ;
   private short A12158DltAnc ;
   private short A12160DltUltTxt ;
   private short A12161DltUltFs ;
   private short A12187DltTubo ;
   private short nBlankRcdCount1689 ;
   private short RcdFound1689 ;
   private short nBlankRcdUsr1689 ;
   private short nBlankRcdCount1690 ;
   private short RcdFound1690 ;
   private short nBlankRcdUsr1690 ;
   private short nBlankRcdCount1692 ;
   private short RcdFound1692 ;
   private short nBlankRcdUsr1692 ;
   private short A12182DltLin ;
   private short RcdFound1691 ;
   private short A12181DltNTrozo ;
   private short A12171DltAncTrz ;
   private short A12168DltAncPz ;
   private short A12179DltLinTxt ;
   private short RcdFound1688 ;
   private short nIsDirty_1688 ;
   private short nIsDirty_1689 ;
   private short nIsDirty_1690 ;
   private short nIsDirty_1691 ;
   private short nIsDirty_1692 ;
   private short nBlankRcdCount1691 ;
   private short nBlankRcdUsr1691 ;
   private short subGrid2_Borderwidth ;
   private short ZZ12148DltBultos ;
   private short ZZ12157DltGrm2 ;
   private short ZZ12158DltAnc ;
   private short ZZ12160DltUltTxt ;
   private short ZZ12161DltUltFs ;
   private short ZZ12187DltTubo ;
   private int Z12176DltHdr ;
   private int Z12147DltPzs ;
   private int Z12149DltTubos ;
   private int Z12153DltColNum ;
   private int Z12156DltColClNr ;
   private int nRC_GXsfl_170 ;
   private int nGXsfl_170_idx=1 ;
   private int nRC_GXsfl_186 ;
   private int nGXsfl_186_idx=1 ;
   private int nRC_GXsfl_222 ;
   private int nGXsfl_222_idx=1 ;
   private int Z12296DltPzsTxt ;
   private int nRC_GXsfl_213 ;
   private int nGXsfl_213_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtAlbProCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A12176DltHdr ;
   private int edtDltHdr_Enabled ;
   private int edtDltR_Enabled ;
   private int edtDltP_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtDltKgs_Enabled ;
   private int edtDltMts_Enabled ;
   private int A12147DltPzs ;
   private int edtDltPzs_Enabled ;
   private int edtDltBultos_Enabled ;
   private int A12149DltTubos ;
   private int edtDltTubos_Enabled ;
   private int edtDltArtCod_Enabled ;
   private int edtDltArtDsc_Enabled ;
   private int edtDltColNom_Enabled ;
   private int A12153DltColNum ;
   private int edtDltColNum_Enabled ;
   private int edtDltTc_Enabled ;
   private int edtDltColClNm_Enabled ;
   private int A12156DltColClNr ;
   private int edtDltColClNr_Enabled ;
   private int edtDltGrm2_Enabled ;
   private int edtDltAnc_Enabled ;
   private int edtDltAlbObs_Enabled ;
   private int edtDltUltTxt_Enabled ;
   private int edtDltUltFs_Enabled ;
   private int edtDltEncCli_Enabled ;
   private int edtDltPreKg_Enabled ;
   private int edtDltPreMt_Enabled ;
   private int edtDltKgsCli_Enabled ;
   private int edtDltTubo_Enabled ;
   private int edtDltTuboN_Enabled ;
   private int edtDltModCod_Enabled ;
   private int edtavnRcdDeleted_1689_Enabled ;
   private int edtDltLinTxt_Enabled ;
   private int edtDltDsc_Enabled ;
   private int edtDltRD_Enabled ;
   private int edtDltPKg_Enabled ;
   private int edtDltKgsTxt_Enabled ;
   private int edtDltPMt_Enabled ;
   private int edtDltMtsTxt_Enabled ;
   private int edtDltImpTxt_Enabled ;
   private int edtDltTipTxt_Enabled ;
   private int edtDltCodTxt_Enabled ;
   private int edtDltPzsTxt_Enabled ;
   private int fRowAdded ;
   private int edtDltNPieza_Enabled ;
   private int edtDltKgsPz_Enabled ;
   private int edtDltMtsPz_Enabled ;
   private int edtDltAncPz_Enabled ;
   private int edtavnRcdDeleted_1692_Enabled ;
   private int edtDltLin_Enabled ;
   private int edtDltFascod_Enabled ;
   private int edtDltFasDsc_Enabled ;
   private int edtDltKgsFs_Enabled ;
   private int edtDltMtsFs_Enabled ;
   private int edtDltPrKFs_Enabled ;
   private int edtDltPrMFs_Enabled ;
   private int edtDltPrKBFs_Enabled ;
   private int edtDltPrMBFs_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_1691_Enabled ;
   private int edtDltNTrozo_Enabled ;
   private int edtDltKgsTrz_Enabled ;
   private int edtDltMtsTrz_Enabled ;
   private int edtDltAncTrz_Enabled ;
   private int A12296DltPzsTxt ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int GRID2_IsPaging ;
   private int subGrid3_Backcolor ;
   private int subGrid3_Allbackcolor ;
   private int subGrid4_Backcolor ;
   private int subGrid4_Allbackcolor ;
   private int defedtDltNTrozo_Enabled ;
   private int defedtDltLin_Enabled ;
   private int defedtDltNPieza_Enabled ;
   private int defedtDltLinTxt_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int subGrid4_Selectedindex ;
   private int subGrid4_Selectioncolor ;
   private int subGrid4_Hoveringcolor ;
   private int subGrid3_Selectedindex ;
   private int subGrid3_Selectioncolor ;
   private int subGrid3_Hoveringcolor ;
   private int edtDltModCod_Backcolor ;
   private int edtDltTuboN_Backcolor ;
   private int edtDltTubo_Backcolor ;
   private int edtDltKgsCli_Backcolor ;
   private int edtDltPreMt_Backcolor ;
   private int edtDltPreKg_Backcolor ;
   private int edtDltEncCli_Backcolor ;
   private int edtDltUltFs_Backcolor ;
   private int edtDltUltTxt_Backcolor ;
   private int edtDltAlbObs_Backcolor ;
   private int edtDltAnc_Backcolor ;
   private int edtDltGrm2_Backcolor ;
   private int edtDltColClNr_Backcolor ;
   private int edtDltColClNm_Backcolor ;
   private int edtDltTc_Backcolor ;
   private int edtDltColNum_Backcolor ;
   private int edtDltColNom_Backcolor ;
   private int edtDltArtDsc_Backcolor ;
   private int edtDltArtCod_Backcolor ;
   private int edtDltTubos_Backcolor ;
   private int edtDltBultos_Backcolor ;
   private int edtDltPzs_Backcolor ;
   private int edtDltMts_Backcolor ;
   private int edtDltKgs_Backcolor ;
   private int edtDltP_Backcolor ;
   private int edtDltR_Backcolor ;
   private int edtDltHdr_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtAlbProCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ12176DltHdr ;
   private int ZZ12147DltPzs ;
   private int ZZ12149DltTubos ;
   private int ZZ12153DltColNum ;
   private int ZZ12156DltColClNr ;
   private long Z30AlbProCod ;
   private long A30AlbProCod ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID3_nFirstRecordOnPage ;
   private long GRID4_nFirstRecordOnPage ;
   private long GRID3_nCurrentRecord ;
   private long ZZ30AlbProCod ;
   private java.math.BigDecimal Z12145DltKgs ;
   private java.math.BigDecimal Z12146DltMts ;
   private java.math.BigDecimal Z12163DltPreKg ;
   private java.math.BigDecimal Z12164DltPreMt ;
   private java.math.BigDecimal Z12186DltKgsCli ;
   private java.math.BigDecimal Z12288DltRD ;
   private java.math.BigDecimal Z12289DltPKg ;
   private java.math.BigDecimal Z12291DltKgsTxt ;
   private java.math.BigDecimal Z12290DltPMt ;
   private java.math.BigDecimal Z12292DltMtsTxt ;
   private java.math.BigDecimal Z12293DltImpTxt ;
   private java.math.BigDecimal Z12166DltKgsPz ;
   private java.math.BigDecimal Z12167DltMtsPz ;
   private java.math.BigDecimal Z12169DltKgsTrz ;
   private java.math.BigDecimal Z12170DltMtsTrz ;
   private java.math.BigDecimal Z12174DltKgsFs ;
   private java.math.BigDecimal Z12175DltMtsFs ;
   private java.math.BigDecimal Z12189DltPrKFs ;
   private java.math.BigDecimal Z12190DltPrMFs ;
   private java.math.BigDecimal Z12191DltPrKBFs ;
   private java.math.BigDecimal Z12192DltPrMBFs ;
   private java.math.BigDecimal A12145DltKgs ;
   private java.math.BigDecimal A12146DltMts ;
   private java.math.BigDecimal A12163DltPreKg ;
   private java.math.BigDecimal A12164DltPreMt ;
   private java.math.BigDecimal A12186DltKgsCli ;
   private java.math.BigDecimal A12174DltKgsFs ;
   private java.math.BigDecimal A12175DltMtsFs ;
   private java.math.BigDecimal A12189DltPrKFs ;
   private java.math.BigDecimal A12190DltPrMFs ;
   private java.math.BigDecimal A12191DltPrKBFs ;
   private java.math.BigDecimal A12192DltPrMBFs ;
   private java.math.BigDecimal A12169DltKgsTrz ;
   private java.math.BigDecimal A12170DltMtsTrz ;
   private java.math.BigDecimal A12166DltKgsPz ;
   private java.math.BigDecimal A12167DltMtsPz ;
   private java.math.BigDecimal A12288DltRD ;
   private java.math.BigDecimal A12289DltPKg ;
   private java.math.BigDecimal A12291DltKgsTxt ;
   private java.math.BigDecimal A12290DltPMt ;
   private java.math.BigDecimal A12292DltMtsTxt ;
   private java.math.BigDecimal A12293DltImpTxt ;
   private java.math.BigDecimal ZZ12145DltKgs ;
   private java.math.BigDecimal ZZ12146DltMts ;
   private java.math.BigDecimal ZZ12163DltPreKg ;
   private java.math.BigDecimal ZZ12164DltPreMt ;
   private java.math.BigDecimal ZZ12186DltKgsCli ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z12178DltP ;
   private String Z12150DltArtCod ;
   private String Z12151DltArtDsc ;
   private String Z12152DltColNom ;
   private String Z12155DltColClNm ;
   private String Z12159DltAlbObs ;
   private String Z12162DltEncCli ;
   private String Z12188DltTuboN ;
   private String Z12287DltModCod ;
   private String Z12165DltDsc ;
   private String Z12294DltTipTxt ;
   private String Z12295DltCodTxt ;
   private String Z12180DltNPieza ;
   private String Z12172DltFascod ;
   private String Z12173DltFasDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbProCod_Internalname ;
   private String sGXsfl_186_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_170_idx="0001" ;
   private String sGXsfl_213_idx="0001" ;
   private String sGXsfl_222_idx="0001" ;
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
   private String edtAlbProCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtDltHdr_Internalname ;
   private String edtDltHdr_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtDltR_Internalname ;
   private String edtDltR_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtDltP_Internalname ;
   private String A12178DltP ;
   private String edtDltP_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtDltKgs_Internalname ;
   private String edtDltKgs_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtDltMts_Internalname ;
   private String edtDltMts_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtDltPzs_Internalname ;
   private String edtDltPzs_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtDltBultos_Internalname ;
   private String edtDltBultos_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtDltTubos_Internalname ;
   private String edtDltTubos_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtDltArtCod_Internalname ;
   private String A12150DltArtCod ;
   private String edtDltArtCod_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtDltArtDsc_Internalname ;
   private String A12151DltArtDsc ;
   private String edtDltArtDsc_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtDltColNom_Internalname ;
   private String A12152DltColNom ;
   private String edtDltColNom_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtDltColNum_Internalname ;
   private String edtDltColNum_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtDltTc_Internalname ;
   private String edtDltTc_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtDltColClNm_Internalname ;
   private String A12155DltColClNm ;
   private String edtDltColClNm_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtDltColClNr_Internalname ;
   private String edtDltColClNr_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtDltGrm2_Internalname ;
   private String edtDltGrm2_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtDltAnc_Internalname ;
   private String edtDltAnc_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtDltAlbObs_Internalname ;
   private String A12159DltAlbObs ;
   private String edtDltAlbObs_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtDltUltTxt_Internalname ;
   private String edtDltUltTxt_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtDltUltFs_Internalname ;
   private String edtDltUltFs_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtDltEncCli_Internalname ;
   private String A12162DltEncCli ;
   private String edtDltEncCli_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtDltPreKg_Internalname ;
   private String edtDltPreKg_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtDltPreMt_Internalname ;
   private String edtDltPreMt_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtDltKgsCli_Internalname ;
   private String edtDltKgsCli_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtDltTubo_Internalname ;
   private String edtDltTubo_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtDltTuboN_Internalname ;
   private String A12188DltTuboN ;
   private String edtDltTuboN_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtDltModCod_Internalname ;
   private String A12287DltModCod ;
   private String edtDltModCod_Jsonclick ;
   private String sMode1689 ;
   private String edtavnRcdDeleted_1689_Internalname ;
   private String edtDltLinTxt_Internalname ;
   private String edtDltDsc_Internalname ;
   private String edtDltRD_Internalname ;
   private String edtDltPKg_Internalname ;
   private String edtDltKgsTxt_Internalname ;
   private String edtDltPMt_Internalname ;
   private String edtDltMtsTxt_Internalname ;
   private String edtDltImpTxt_Internalname ;
   private String edtDltTipTxt_Internalname ;
   private String edtDltCodTxt_Internalname ;
   private String edtDltPzsTxt_Internalname ;
   private String subGrid1_Internalname ;
   private String sMode1690 ;
   private String edtDltNPieza_Internalname ;
   private String edtDltKgsPz_Internalname ;
   private String edtDltMtsPz_Internalname ;
   private String edtDltAncPz_Internalname ;
   private String subGrid2_Internalname ;
   private String sMode1692 ;
   private String edtavnRcdDeleted_1692_Internalname ;
   private String edtDltLin_Internalname ;
   private String edtDltFascod_Internalname ;
   private String edtDltFasDsc_Internalname ;
   private String edtDltKgsFs_Internalname ;
   private String edtDltMtsFs_Internalname ;
   private String edtDltPrKFs_Internalname ;
   private String edtDltPrMFs_Internalname ;
   private String edtDltPrKBFs_Internalname ;
   private String edtDltPrMBFs_Internalname ;
   private String subGrid4_Internalname ;
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
   private String AV33Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String edtavnRcdDeleted_1691_Internalname ;
   private String sMode1688 ;
   private String GXCCtl ;
   private String A12172DltFascod ;
   private String A12173DltFasDsc ;
   private String edtDltNTrozo_Internalname ;
   private String edtDltKgsTrz_Internalname ;
   private String edtDltMtsTrz_Internalname ;
   private String edtDltAncTrz_Internalname ;
   private String A12180DltNPieza ;
   private String A12165DltDsc ;
   private String A12294DltTipTxt ;
   private String A12295DltCodTxt ;
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
   private String sMode1691 ;
   private String sGXsfl_170_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1689_Jsonclick ;
   private String edtDltLinTxt_Jsonclick ;
   private String edtDltDsc_Jsonclick ;
   private String edtDltRD_Jsonclick ;
   private String edtDltPKg_Jsonclick ;
   private String edtDltKgsTxt_Jsonclick ;
   private String edtDltPMt_Jsonclick ;
   private String edtDltMtsTxt_Jsonclick ;
   private String edtDltImpTxt_Jsonclick ;
   private String edtDltTipTxt_Jsonclick ;
   private String edtDltCodTxt_Jsonclick ;
   private String edtDltPzsTxt_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock34_Internalname ;
   private String subGrid3_Internalname ;
   private String sGXsfl_186_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtDltNPieza_Jsonclick ;
   private String lblTextblock32_Jsonclick ;
   private String edtDltKgsPz_Jsonclick ;
   private String lblTextblock33_Jsonclick ;
   private String edtDltMtsPz_Jsonclick ;
   private String lblTextblock34_Jsonclick ;
   private String edtDltAncPz_Jsonclick ;
   private String sGXsfl_213_fel_idx="0001" ;
   private String subGrid3_Class ;
   private String subGrid3_Linesclass ;
   private String edtavnRcdDeleted_1691_Jsonclick ;
   private String edtDltNTrozo_Jsonclick ;
   private String edtDltKgsTrz_Jsonclick ;
   private String edtDltMtsTrz_Jsonclick ;
   private String edtDltAncTrz_Jsonclick ;
   private String sGXsfl_222_fel_idx="0001" ;
   private String subGrid4_Class ;
   private String subGrid4_Linesclass ;
   private String edtavnRcdDeleted_1692_Jsonclick ;
   private String edtDltLin_Jsonclick ;
   private String edtDltFascod_Jsonclick ;
   private String edtDltFasDsc_Jsonclick ;
   private String edtDltKgsFs_Jsonclick ;
   private String edtDltMtsFs_Jsonclick ;
   private String edtDltPrKFs_Jsonclick ;
   private String edtDltPrMFs_Jsonclick ;
   private String edtDltPrKBFs_Jsonclick ;
   private String edtDltPrMBFs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String subGrid2_Header ;
   private String lblTextblock31_Caption ;
   private String lblTextblock7_Caption ;
   private String lblTextblock8_Caption ;
   private String lblTextblock20_Caption ;
   private String subGrid4_Header ;
   private String subGrid3_Header ;
   private String ZZ396EmprCod ;
   private String ZZ12178DltP ;
   private String ZZ407EmprNom ;
   private String ZZ12150DltArtCod ;
   private String ZZ12151DltArtDsc ;
   private String ZZ12152DltColNom ;
   private String ZZ12155DltColClNm ;
   private String ZZ12159DltAlbObs ;
   private String ZZ12162DltEncCli ;
   private String ZZ12188DltTuboN ;
   private String ZZ12287DltModCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_170_Refreshing=false ;
   private boolean bGXsfl_186_Refreshing=false ;
   private boolean bGXsfl_222_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n12145DltKgs ;
   private boolean n12146DltMts ;
   private boolean n12147DltPzs ;
   private boolean n12148DltBultos ;
   private boolean n12149DltTubos ;
   private boolean n12150DltArtCod ;
   private boolean n12151DltArtDsc ;
   private boolean n12152DltColNom ;
   private boolean n12153DltColNum ;
   private boolean n12154DltTc ;
   private boolean n12155DltColClNm ;
   private boolean n12156DltColClNr ;
   private boolean n12157DltGrm2 ;
   private boolean n12158DltAnc ;
   private boolean n12159DltAlbObs ;
   private boolean n12160DltUltTxt ;
   private boolean n12161DltUltFs ;
   private boolean n12162DltEncCli ;
   private boolean n12163DltPreKg ;
   private boolean n12164DltPreMt ;
   private boolean n12186DltKgsCli ;
   private boolean n12187DltTubo ;
   private boolean n12188DltTuboN ;
   private boolean n12287DltModCod ;
   private boolean bGXsfl_213_Refreshing=false ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n12165DltDsc ;
   private boolean n12288DltRD ;
   private boolean n12289DltPKg ;
   private boolean n12291DltKgsTxt ;
   private boolean n12290DltPMt ;
   private boolean n12292DltMtsTxt ;
   private boolean n12293DltImpTxt ;
   private boolean n12294DltTipTxt ;
   private boolean n12295DltCodTxt ;
   private boolean n12296DltPzsTxt ;
   private boolean n12166DltKgsPz ;
   private boolean n12167DltMtsPz ;
   private boolean n12168DltAncPz ;
   private boolean n12169DltKgsTrz ;
   private boolean n12170DltMtsTrz ;
   private boolean n12171DltAncTrz ;
   private boolean n12172DltFascod ;
   private boolean n12173DltFasDsc ;
   private boolean n12174DltKgsFs ;
   private boolean n12175DltMtsFs ;
   private boolean n12189DltPrKFs ;
   private boolean n12190DltPrMFs ;
   private boolean n12191DltPrKBFs ;
   private boolean n12192DltPrMBFs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebGrid Grid4Container ;
   private com.genexus.webpanels.GXWebGrid Grid3Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebRow Grid3Row ;
   private com.genexus.webpanels.GXWebRow Grid4Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.webpanels.GXWebColumn Grid4Column ;
   private com.genexus.webpanels.GXWebColumn Grid3Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01J912_A407EmprNom ;
   private boolean[] T01J912_n407EmprNom ;
   private int[] T01J914_A12176DltHdr ;
   private byte[] T01J914_A12177DltR ;
   private String[] T01J914_A12178DltP ;
   private String[] T01J914_A407EmprNom ;
   private boolean[] T01J914_n407EmprNom ;
   private java.math.BigDecimal[] T01J914_A12145DltKgs ;
   private boolean[] T01J914_n12145DltKgs ;
   private java.math.BigDecimal[] T01J914_A12146DltMts ;
   private boolean[] T01J914_n12146DltMts ;
   private int[] T01J914_A12147DltPzs ;
   private boolean[] T01J914_n12147DltPzs ;
   private short[] T01J914_A12148DltBultos ;
   private boolean[] T01J914_n12148DltBultos ;
   private int[] T01J914_A12149DltTubos ;
   private boolean[] T01J914_n12149DltTubos ;
   private String[] T01J914_A12150DltArtCod ;
   private boolean[] T01J914_n12150DltArtCod ;
   private String[] T01J914_A12151DltArtDsc ;
   private boolean[] T01J914_n12151DltArtDsc ;
   private String[] T01J914_A12152DltColNom ;
   private boolean[] T01J914_n12152DltColNom ;
   private int[] T01J914_A12153DltColNum ;
   private boolean[] T01J914_n12153DltColNum ;
   private byte[] T01J914_A12154DltTc ;
   private boolean[] T01J914_n12154DltTc ;
   private String[] T01J914_A12155DltColClNm ;
   private boolean[] T01J914_n12155DltColClNm ;
   private int[] T01J914_A12156DltColClNr ;
   private boolean[] T01J914_n12156DltColClNr ;
   private short[] T01J914_A12157DltGrm2 ;
   private boolean[] T01J914_n12157DltGrm2 ;
   private short[] T01J914_A12158DltAnc ;
   private boolean[] T01J914_n12158DltAnc ;
   private String[] T01J914_A12159DltAlbObs ;
   private boolean[] T01J914_n12159DltAlbObs ;
   private short[] T01J914_A12160DltUltTxt ;
   private boolean[] T01J914_n12160DltUltTxt ;
   private short[] T01J914_A12161DltUltFs ;
   private boolean[] T01J914_n12161DltUltFs ;
   private String[] T01J914_A12162DltEncCli ;
   private boolean[] T01J914_n12162DltEncCli ;
   private java.math.BigDecimal[] T01J914_A12163DltPreKg ;
   private boolean[] T01J914_n12163DltPreKg ;
   private java.math.BigDecimal[] T01J914_A12164DltPreMt ;
   private boolean[] T01J914_n12164DltPreMt ;
   private java.math.BigDecimal[] T01J914_A12186DltKgsCli ;
   private boolean[] T01J914_n12186DltKgsCli ;
   private short[] T01J914_A12187DltTubo ;
   private boolean[] T01J914_n12187DltTubo ;
   private String[] T01J914_A12188DltTuboN ;
   private boolean[] T01J914_n12188DltTuboN ;
   private String[] T01J914_A12287DltModCod ;
   private boolean[] T01J914_n12287DltModCod ;
   private String[] T01J914_A396EmprCod ;
   private long[] T01J914_A30AlbProCod ;
   private String[] T01J913_A396EmprCod ;
   private String[] T01J915_A396EmprCod ;
   private String[] T01J916_A396EmprCod ;
   private long[] T01J916_A30AlbProCod ;
   private int[] T01J916_A12176DltHdr ;
   private byte[] T01J916_A12177DltR ;
   private String[] T01J916_A12178DltP ;
   private int[] T01J911_A12176DltHdr ;
   private byte[] T01J911_A12177DltR ;
   private String[] T01J911_A12178DltP ;
   private java.math.BigDecimal[] T01J911_A12145DltKgs ;
   private boolean[] T01J911_n12145DltKgs ;
   private java.math.BigDecimal[] T01J911_A12146DltMts ;
   private boolean[] T01J911_n12146DltMts ;
   private int[] T01J911_A12147DltPzs ;
   private boolean[] T01J911_n12147DltPzs ;
   private short[] T01J911_A12148DltBultos ;
   private boolean[] T01J911_n12148DltBultos ;
   private int[] T01J911_A12149DltTubos ;
   private boolean[] T01J911_n12149DltTubos ;
   private String[] T01J911_A12150DltArtCod ;
   private boolean[] T01J911_n12150DltArtCod ;
   private String[] T01J911_A12151DltArtDsc ;
   private boolean[] T01J911_n12151DltArtDsc ;
   private String[] T01J911_A12152DltColNom ;
   private boolean[] T01J911_n12152DltColNom ;
   private int[] T01J911_A12153DltColNum ;
   private boolean[] T01J911_n12153DltColNum ;
   private byte[] T01J911_A12154DltTc ;
   private boolean[] T01J911_n12154DltTc ;
   private String[] T01J911_A12155DltColClNm ;
   private boolean[] T01J911_n12155DltColClNm ;
   private int[] T01J911_A12156DltColClNr ;
   private boolean[] T01J911_n12156DltColClNr ;
   private short[] T01J911_A12157DltGrm2 ;
   private boolean[] T01J911_n12157DltGrm2 ;
   private short[] T01J911_A12158DltAnc ;
   private boolean[] T01J911_n12158DltAnc ;
   private String[] T01J911_A12159DltAlbObs ;
   private boolean[] T01J911_n12159DltAlbObs ;
   private short[] T01J911_A12160DltUltTxt ;
   private boolean[] T01J911_n12160DltUltTxt ;
   private short[] T01J911_A12161DltUltFs ;
   private boolean[] T01J911_n12161DltUltFs ;
   private String[] T01J911_A12162DltEncCli ;
   private boolean[] T01J911_n12162DltEncCli ;
   private java.math.BigDecimal[] T01J911_A12163DltPreKg ;
   private boolean[] T01J911_n12163DltPreKg ;
   private java.math.BigDecimal[] T01J911_A12164DltPreMt ;
   private boolean[] T01J911_n12164DltPreMt ;
   private java.math.BigDecimal[] T01J911_A12186DltKgsCli ;
   private boolean[] T01J911_n12186DltKgsCli ;
   private short[] T01J911_A12187DltTubo ;
   private boolean[] T01J911_n12187DltTubo ;
   private String[] T01J911_A12188DltTuboN ;
   private boolean[] T01J911_n12188DltTuboN ;
   private String[] T01J911_A12287DltModCod ;
   private boolean[] T01J911_n12287DltModCod ;
   private String[] T01J911_A396EmprCod ;
   private long[] T01J911_A30AlbProCod ;
   private String[] T01J917_A396EmprCod ;
   private long[] T01J917_A30AlbProCod ;
   private int[] T01J917_A12176DltHdr ;
   private byte[] T01J917_A12177DltR ;
   private String[] T01J917_A12178DltP ;
   private String[] T01J918_A396EmprCod ;
   private long[] T01J918_A30AlbProCod ;
   private int[] T01J918_A12176DltHdr ;
   private byte[] T01J918_A12177DltR ;
   private String[] T01J918_A12178DltP ;
   private int[] T01J910_A12176DltHdr ;
   private byte[] T01J910_A12177DltR ;
   private String[] T01J910_A12178DltP ;
   private java.math.BigDecimal[] T01J910_A12145DltKgs ;
   private boolean[] T01J910_n12145DltKgs ;
   private java.math.BigDecimal[] T01J910_A12146DltMts ;
   private boolean[] T01J910_n12146DltMts ;
   private int[] T01J910_A12147DltPzs ;
   private boolean[] T01J910_n12147DltPzs ;
   private short[] T01J910_A12148DltBultos ;
   private boolean[] T01J910_n12148DltBultos ;
   private int[] T01J910_A12149DltTubos ;
   private boolean[] T01J910_n12149DltTubos ;
   private String[] T01J910_A12150DltArtCod ;
   private boolean[] T01J910_n12150DltArtCod ;
   private String[] T01J910_A12151DltArtDsc ;
   private boolean[] T01J910_n12151DltArtDsc ;
   private String[] T01J910_A12152DltColNom ;
   private boolean[] T01J910_n12152DltColNom ;
   private int[] T01J910_A12153DltColNum ;
   private boolean[] T01J910_n12153DltColNum ;
   private byte[] T01J910_A12154DltTc ;
   private boolean[] T01J910_n12154DltTc ;
   private String[] T01J910_A12155DltColClNm ;
   private boolean[] T01J910_n12155DltColClNm ;
   private int[] T01J910_A12156DltColClNr ;
   private boolean[] T01J910_n12156DltColClNr ;
   private short[] T01J910_A12157DltGrm2 ;
   private boolean[] T01J910_n12157DltGrm2 ;
   private short[] T01J910_A12158DltAnc ;
   private boolean[] T01J910_n12158DltAnc ;
   private String[] T01J910_A12159DltAlbObs ;
   private boolean[] T01J910_n12159DltAlbObs ;
   private short[] T01J910_A12160DltUltTxt ;
   private boolean[] T01J910_n12160DltUltTxt ;
   private short[] T01J910_A12161DltUltFs ;
   private boolean[] T01J910_n12161DltUltFs ;
   private String[] T01J910_A12162DltEncCli ;
   private boolean[] T01J910_n12162DltEncCli ;
   private java.math.BigDecimal[] T01J910_A12163DltPreKg ;
   private boolean[] T01J910_n12163DltPreKg ;
   private java.math.BigDecimal[] T01J910_A12164DltPreMt ;
   private boolean[] T01J910_n12164DltPreMt ;
   private java.math.BigDecimal[] T01J910_A12186DltKgsCli ;
   private boolean[] T01J910_n12186DltKgsCli ;
   private short[] T01J910_A12187DltTubo ;
   private boolean[] T01J910_n12187DltTubo ;
   private String[] T01J910_A12188DltTuboN ;
   private boolean[] T01J910_n12188DltTuboN ;
   private String[] T01J910_A12287DltModCod ;
   private boolean[] T01J910_n12287DltModCod ;
   private String[] T01J910_A396EmprCod ;
   private long[] T01J910_A30AlbProCod ;
   private String[] T01J922_A396EmprCod ;
   private long[] T01J922_A30AlbProCod ;
   private int[] T01J922_A12176DltHdr ;
   private byte[] T01J922_A12177DltR ;
   private String[] T01J922_A12178DltP ;
   private String[] T01J922_A12180DltNPieza ;
   private String[] T01J923_A396EmprCod ;
   private long[] T01J923_A30AlbProCod ;
   private int[] T01J923_A12176DltHdr ;
   private byte[] T01J923_A12177DltR ;
   private String[] T01J923_A12178DltP ;
   private long[] T01J924_A30AlbProCod ;
   private int[] T01J924_A12176DltHdr ;
   private byte[] T01J924_A12177DltR ;
   private String[] T01J924_A12178DltP ;
   private short[] T01J924_A12179DltLinTxt ;
   private String[] T01J924_A12165DltDsc ;
   private boolean[] T01J924_n12165DltDsc ;
   private java.math.BigDecimal[] T01J924_A12288DltRD ;
   private boolean[] T01J924_n12288DltRD ;
   private java.math.BigDecimal[] T01J924_A12289DltPKg ;
   private boolean[] T01J924_n12289DltPKg ;
   private java.math.BigDecimal[] T01J924_A12291DltKgsTxt ;
   private boolean[] T01J924_n12291DltKgsTxt ;
   private java.math.BigDecimal[] T01J924_A12290DltPMt ;
   private boolean[] T01J924_n12290DltPMt ;
   private java.math.BigDecimal[] T01J924_A12292DltMtsTxt ;
   private boolean[] T01J924_n12292DltMtsTxt ;
   private java.math.BigDecimal[] T01J924_A12293DltImpTxt ;
   private boolean[] T01J924_n12293DltImpTxt ;
   private String[] T01J924_A12294DltTipTxt ;
   private boolean[] T01J924_n12294DltTipTxt ;
   private String[] T01J924_A12295DltCodTxt ;
   private boolean[] T01J924_n12295DltCodTxt ;
   private int[] T01J924_A12296DltPzsTxt ;
   private boolean[] T01J924_n12296DltPzsTxt ;
   private String[] T01J924_A396EmprCod ;
   private String[] T01J925_A396EmprCod ;
   private long[] T01J925_A30AlbProCod ;
   private int[] T01J925_A12176DltHdr ;
   private byte[] T01J925_A12177DltR ;
   private String[] T01J925_A12178DltP ;
   private short[] T01J925_A12179DltLinTxt ;
   private long[] T01J99_A30AlbProCod ;
   private int[] T01J99_A12176DltHdr ;
   private byte[] T01J99_A12177DltR ;
   private String[] T01J99_A12178DltP ;
   private short[] T01J99_A12179DltLinTxt ;
   private String[] T01J99_A12165DltDsc ;
   private boolean[] T01J99_n12165DltDsc ;
   private java.math.BigDecimal[] T01J99_A12288DltRD ;
   private boolean[] T01J99_n12288DltRD ;
   private java.math.BigDecimal[] T01J99_A12289DltPKg ;
   private boolean[] T01J99_n12289DltPKg ;
   private java.math.BigDecimal[] T01J99_A12291DltKgsTxt ;
   private boolean[] T01J99_n12291DltKgsTxt ;
   private java.math.BigDecimal[] T01J99_A12290DltPMt ;
   private boolean[] T01J99_n12290DltPMt ;
   private java.math.BigDecimal[] T01J99_A12292DltMtsTxt ;
   private boolean[] T01J99_n12292DltMtsTxt ;
   private java.math.BigDecimal[] T01J99_A12293DltImpTxt ;
   private boolean[] T01J99_n12293DltImpTxt ;
   private String[] T01J99_A12294DltTipTxt ;
   private boolean[] T01J99_n12294DltTipTxt ;
   private String[] T01J99_A12295DltCodTxt ;
   private boolean[] T01J99_n12295DltCodTxt ;
   private int[] T01J99_A12296DltPzsTxt ;
   private boolean[] T01J99_n12296DltPzsTxt ;
   private String[] T01J99_A396EmprCod ;
   private long[] T01J98_A30AlbProCod ;
   private int[] T01J98_A12176DltHdr ;
   private byte[] T01J98_A12177DltR ;
   private String[] T01J98_A12178DltP ;
   private short[] T01J98_A12179DltLinTxt ;
   private String[] T01J98_A12165DltDsc ;
   private boolean[] T01J98_n12165DltDsc ;
   private java.math.BigDecimal[] T01J98_A12288DltRD ;
   private boolean[] T01J98_n12288DltRD ;
   private java.math.BigDecimal[] T01J98_A12289DltPKg ;
   private boolean[] T01J98_n12289DltPKg ;
   private java.math.BigDecimal[] T01J98_A12291DltKgsTxt ;
   private boolean[] T01J98_n12291DltKgsTxt ;
   private java.math.BigDecimal[] T01J98_A12290DltPMt ;
   private boolean[] T01J98_n12290DltPMt ;
   private java.math.BigDecimal[] T01J98_A12292DltMtsTxt ;
   private boolean[] T01J98_n12292DltMtsTxt ;
   private java.math.BigDecimal[] T01J98_A12293DltImpTxt ;
   private boolean[] T01J98_n12293DltImpTxt ;
   private String[] T01J98_A12294DltTipTxt ;
   private boolean[] T01J98_n12294DltTipTxt ;
   private String[] T01J98_A12295DltCodTxt ;
   private boolean[] T01J98_n12295DltCodTxt ;
   private int[] T01J98_A12296DltPzsTxt ;
   private boolean[] T01J98_n12296DltPzsTxt ;
   private String[] T01J98_A396EmprCod ;
   private String[] T01J929_A396EmprCod ;
   private long[] T01J929_A30AlbProCod ;
   private int[] T01J929_A12176DltHdr ;
   private byte[] T01J929_A12177DltR ;
   private String[] T01J929_A12178DltP ;
   private short[] T01J929_A12179DltLinTxt ;
   private long[] T01J930_A30AlbProCod ;
   private int[] T01J930_A12176DltHdr ;
   private byte[] T01J930_A12177DltR ;
   private String[] T01J930_A12178DltP ;
   private String[] T01J930_A12180DltNPieza ;
   private java.math.BigDecimal[] T01J930_A12166DltKgsPz ;
   private boolean[] T01J930_n12166DltKgsPz ;
   private java.math.BigDecimal[] T01J930_A12167DltMtsPz ;
   private boolean[] T01J930_n12167DltMtsPz ;
   private short[] T01J930_A12168DltAncPz ;
   private boolean[] T01J930_n12168DltAncPz ;
   private String[] T01J930_A396EmprCod ;
   private String[] T01J931_A396EmprCod ;
   private long[] T01J931_A30AlbProCod ;
   private int[] T01J931_A12176DltHdr ;
   private byte[] T01J931_A12177DltR ;
   private String[] T01J931_A12178DltP ;
   private String[] T01J931_A12180DltNPieza ;
   private long[] T01J97_A30AlbProCod ;
   private int[] T01J97_A12176DltHdr ;
   private byte[] T01J97_A12177DltR ;
   private String[] T01J97_A12178DltP ;
   private String[] T01J97_A12180DltNPieza ;
   private java.math.BigDecimal[] T01J97_A12166DltKgsPz ;
   private boolean[] T01J97_n12166DltKgsPz ;
   private java.math.BigDecimal[] T01J97_A12167DltMtsPz ;
   private boolean[] T01J97_n12167DltMtsPz ;
   private short[] T01J97_A12168DltAncPz ;
   private boolean[] T01J97_n12168DltAncPz ;
   private String[] T01J97_A396EmprCod ;
   private long[] T01J96_A30AlbProCod ;
   private int[] T01J96_A12176DltHdr ;
   private byte[] T01J96_A12177DltR ;
   private String[] T01J96_A12178DltP ;
   private String[] T01J96_A12180DltNPieza ;
   private java.math.BigDecimal[] T01J96_A12166DltKgsPz ;
   private boolean[] T01J96_n12166DltKgsPz ;
   private java.math.BigDecimal[] T01J96_A12167DltMtsPz ;
   private boolean[] T01J96_n12167DltMtsPz ;
   private short[] T01J96_A12168DltAncPz ;
   private boolean[] T01J96_n12168DltAncPz ;
   private String[] T01J96_A396EmprCod ;
   private String[] T01J935_A396EmprCod ;
   private long[] T01J935_A30AlbProCod ;
   private int[] T01J935_A12176DltHdr ;
   private byte[] T01J935_A12177DltR ;
   private String[] T01J935_A12178DltP ;
   private String[] T01J935_A12180DltNPieza ;
   private long[] T01J936_A30AlbProCod ;
   private int[] T01J936_A12176DltHdr ;
   private byte[] T01J936_A12177DltR ;
   private String[] T01J936_A12178DltP ;
   private String[] T01J936_A12180DltNPieza ;
   private short[] T01J936_A12181DltNTrozo ;
   private java.math.BigDecimal[] T01J936_A12169DltKgsTrz ;
   private boolean[] T01J936_n12169DltKgsTrz ;
   private java.math.BigDecimal[] T01J936_A12170DltMtsTrz ;
   private boolean[] T01J936_n12170DltMtsTrz ;
   private short[] T01J936_A12171DltAncTrz ;
   private boolean[] T01J936_n12171DltAncTrz ;
   private String[] T01J936_A396EmprCod ;
   private String[] T01J937_A396EmprCod ;
   private long[] T01J937_A30AlbProCod ;
   private int[] T01J937_A12176DltHdr ;
   private byte[] T01J937_A12177DltR ;
   private String[] T01J937_A12178DltP ;
   private String[] T01J937_A12180DltNPieza ;
   private short[] T01J937_A12181DltNTrozo ;
   private long[] T01J95_A30AlbProCod ;
   private int[] T01J95_A12176DltHdr ;
   private byte[] T01J95_A12177DltR ;
   private String[] T01J95_A12178DltP ;
   private String[] T01J95_A12180DltNPieza ;
   private short[] T01J95_A12181DltNTrozo ;
   private java.math.BigDecimal[] T01J95_A12169DltKgsTrz ;
   private boolean[] T01J95_n12169DltKgsTrz ;
   private java.math.BigDecimal[] T01J95_A12170DltMtsTrz ;
   private boolean[] T01J95_n12170DltMtsTrz ;
   private short[] T01J95_A12171DltAncTrz ;
   private boolean[] T01J95_n12171DltAncTrz ;
   private String[] T01J95_A396EmprCod ;
   private long[] T01J94_A30AlbProCod ;
   private int[] T01J94_A12176DltHdr ;
   private byte[] T01J94_A12177DltR ;
   private String[] T01J94_A12178DltP ;
   private String[] T01J94_A12180DltNPieza ;
   private short[] T01J94_A12181DltNTrozo ;
   private java.math.BigDecimal[] T01J94_A12169DltKgsTrz ;
   private boolean[] T01J94_n12169DltKgsTrz ;
   private java.math.BigDecimal[] T01J94_A12170DltMtsTrz ;
   private boolean[] T01J94_n12170DltMtsTrz ;
   private short[] T01J94_A12171DltAncTrz ;
   private boolean[] T01J94_n12171DltAncTrz ;
   private String[] T01J94_A396EmprCod ;
   private String[] T01J941_A396EmprCod ;
   private long[] T01J941_A30AlbProCod ;
   private int[] T01J941_A12176DltHdr ;
   private byte[] T01J941_A12177DltR ;
   private String[] T01J941_A12178DltP ;
   private String[] T01J941_A12180DltNPieza ;
   private short[] T01J941_A12181DltNTrozo ;
   private long[] T01J942_A30AlbProCod ;
   private int[] T01J942_A12176DltHdr ;
   private byte[] T01J942_A12177DltR ;
   private String[] T01J942_A12178DltP ;
   private short[] T01J942_A12182DltLin ;
   private String[] T01J942_A12172DltFascod ;
   private boolean[] T01J942_n12172DltFascod ;
   private String[] T01J942_A12173DltFasDsc ;
   private boolean[] T01J942_n12173DltFasDsc ;
   private java.math.BigDecimal[] T01J942_A12174DltKgsFs ;
   private boolean[] T01J942_n12174DltKgsFs ;
   private java.math.BigDecimal[] T01J942_A12175DltMtsFs ;
   private boolean[] T01J942_n12175DltMtsFs ;
   private java.math.BigDecimal[] T01J942_A12189DltPrKFs ;
   private boolean[] T01J942_n12189DltPrKFs ;
   private java.math.BigDecimal[] T01J942_A12190DltPrMFs ;
   private boolean[] T01J942_n12190DltPrMFs ;
   private java.math.BigDecimal[] T01J942_A12191DltPrKBFs ;
   private boolean[] T01J942_n12191DltPrKBFs ;
   private java.math.BigDecimal[] T01J942_A12192DltPrMBFs ;
   private boolean[] T01J942_n12192DltPrMBFs ;
   private String[] T01J942_A396EmprCod ;
   private String[] T01J943_A396EmprCod ;
   private long[] T01J943_A30AlbProCod ;
   private int[] T01J943_A12176DltHdr ;
   private byte[] T01J943_A12177DltR ;
   private String[] T01J943_A12178DltP ;
   private short[] T01J943_A12182DltLin ;
   private long[] T01J93_A30AlbProCod ;
   private int[] T01J93_A12176DltHdr ;
   private byte[] T01J93_A12177DltR ;
   private String[] T01J93_A12178DltP ;
   private short[] T01J93_A12182DltLin ;
   private String[] T01J93_A12172DltFascod ;
   private boolean[] T01J93_n12172DltFascod ;
   private String[] T01J93_A12173DltFasDsc ;
   private boolean[] T01J93_n12173DltFasDsc ;
   private java.math.BigDecimal[] T01J93_A12174DltKgsFs ;
   private boolean[] T01J93_n12174DltKgsFs ;
   private java.math.BigDecimal[] T01J93_A12175DltMtsFs ;
   private boolean[] T01J93_n12175DltMtsFs ;
   private java.math.BigDecimal[] T01J93_A12189DltPrKFs ;
   private boolean[] T01J93_n12189DltPrKFs ;
   private java.math.BigDecimal[] T01J93_A12190DltPrMFs ;
   private boolean[] T01J93_n12190DltPrMFs ;
   private java.math.BigDecimal[] T01J93_A12191DltPrKBFs ;
   private boolean[] T01J93_n12191DltPrKBFs ;
   private java.math.BigDecimal[] T01J93_A12192DltPrMBFs ;
   private boolean[] T01J93_n12192DltPrMBFs ;
   private String[] T01J93_A396EmprCod ;
   private long[] T01J92_A30AlbProCod ;
   private int[] T01J92_A12176DltHdr ;
   private byte[] T01J92_A12177DltR ;
   private String[] T01J92_A12178DltP ;
   private short[] T01J92_A12182DltLin ;
   private String[] T01J92_A12172DltFascod ;
   private boolean[] T01J92_n12172DltFascod ;
   private String[] T01J92_A12173DltFasDsc ;
   private boolean[] T01J92_n12173DltFasDsc ;
   private java.math.BigDecimal[] T01J92_A12174DltKgsFs ;
   private boolean[] T01J92_n12174DltKgsFs ;
   private java.math.BigDecimal[] T01J92_A12175DltMtsFs ;
   private boolean[] T01J92_n12175DltMtsFs ;
   private java.math.BigDecimal[] T01J92_A12189DltPrKFs ;
   private boolean[] T01J92_n12189DltPrKFs ;
   private java.math.BigDecimal[] T01J92_A12190DltPrMFs ;
   private boolean[] T01J92_n12190DltPrMFs ;
   private java.math.BigDecimal[] T01J92_A12191DltPrKBFs ;
   private boolean[] T01J92_n12191DltPrKBFs ;
   private java.math.BigDecimal[] T01J92_A12192DltPrMBFs ;
   private boolean[] T01J92_n12192DltPrMBFs ;
   private String[] T01J92_A396EmprCod ;
   private String[] T01J947_A396EmprCod ;
   private long[] T01J947_A30AlbProCod ;
   private int[] T01J947_A12176DltHdr ;
   private byte[] T01J947_A12177DltR ;
   private String[] T01J947_A12178DltP ;
   private short[] T01J947_A12182DltLin ;
   private String[] T01J948_A407EmprNom ;
   private boolean[] T01J948_n407EmprNom ;
   private String[] T01J949_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdlt001__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdlt001__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdlt001__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdlt001__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdlt001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01J92", "SELECT AlbProCod, DltHdr, DltR, DltP, DltLin, DltFascod, DltFasDsc, DltKgsFs, DltMtsFs, DltPrKFs, DltPrMFs, DltPrKBFs, DltPrMBFs, EmprCod FROM TXPDLT004 WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ? AND DltLin = ?  FOR UPDATE OF DltFascod, DltFasDsc, DltKgsFs, DltMtsFs, DltPrKFs, DltPrMFs, DltPrKBFs, DltPrMBFs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J93", "SELECT AlbProCod, DltHdr, DltR, DltP, DltLin, DltFascod, DltFasDsc, DltKgsFs, DltMtsFs, DltPrKFs, DltPrMFs, DltPrKBFs, DltPrMBFs, EmprCod FROM TXPDLT004 WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ? AND DltLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J94", "SELECT AlbProCod, DltHdr, DltR, DltP, DltNPieza, DltNTrozo, DltKgsTrz, DltMtsTrz, DltAncTrz, EmprCod FROM TXPDLT003 WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ? AND DltNPieza = ? AND DltNTrozo = ?  FOR UPDATE OF DltKgsTrz, DltMtsTrz, DltAncTrz NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J95", "SELECT AlbProCod, DltHdr, DltR, DltP, DltNPieza, DltNTrozo, DltKgsTrz, DltMtsTrz, DltAncTrz, EmprCod FROM TXPDLT003 WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ? AND DltNPieza = ? AND DltNTrozo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J96", "SELECT AlbProCod, DltHdr, DltR, DltP, DltNPieza, DltKgsPz, DltMtsPz, DltAncPz, EmprCod FROM TXPDLT002 WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ? AND DltNPieza = ?  FOR UPDATE OF DltKgsPz, DltMtsPz, DltAncPz NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J97", "SELECT AlbProCod, DltHdr, DltR, DltP, DltNPieza, DltKgsPz, DltMtsPz, DltAncPz, EmprCod FROM TXPDLT002 WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ? AND DltNPieza = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J98", "SELECT AlbProCod, DltHdr, DltR, DltP, DltLinTxt, DltDsc, DltRD, DltPKg, DltKgsTxt, DltPMt, DltMtsTxt, DltImpTxt, DltTipTxt, DltCodTxt, DltPzsTxt, EmprCod FROM TXPDLT006 WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ? AND DltLinTxt = ?  FOR UPDATE OF DltDsc, DltRD, DltPKg, DltKgsTxt, DltPMt, DltMtsTxt, DltImpTxt, DltTipTxt, DltCodTxt, DltPzsTxt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J99", "SELECT AlbProCod, DltHdr, DltR, DltP, DltLinTxt, DltDsc, DltRD, DltPKg, DltKgsTxt, DltPMt, DltMtsTxt, DltImpTxt, DltTipTxt, DltCodTxt, DltPzsTxt, EmprCod FROM TXPDLT006 WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ? AND DltLinTxt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J910", "SELECT DltHdr, DltR, DltP, DltKgs, DltMts, DltPzs, DltBultos, DltTubos, DltArtCod, DltArtDsc, DltColNom, DltColNum, DltTc, DltColClNm, DltColClNr, DltGrm2, DltAnc, DltAlbObs, DltUltTxt, DltUltFs, DltEncCli, DltPreKg, DltPreMt, DltKgsCli, DltTubo, DltTuboN, DltModCod, EmprCod, AlbProCod FROM TXPDLT001 WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ?  FOR UPDATE OF DltKgs, DltMts, DltPzs, DltBultos, DltTubos, DltArtCod, DltArtDsc, DltColNom, DltColNum, DltTc, DltColClNm, DltColClNr, DltGrm2, DltAnc, DltAlbObs, DltUltTxt, DltUltFs, DltEncCli, DltPreKg, DltPreMt, DltKgsCli, DltTubo, DltTuboN, DltModCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J911", "SELECT DltHdr, DltR, DltP, DltKgs, DltMts, DltPzs, DltBultos, DltTubos, DltArtCod, DltArtDsc, DltColNom, DltColNum, DltTc, DltColClNm, DltColClNr, DltGrm2, DltAnc, DltAlbObs, DltUltTxt, DltUltFs, DltEncCli, DltPreKg, DltPreMt, DltKgsCli, DltTubo, DltTuboN, DltModCod, EmprCod, AlbProCod FROM TXPDLT001 WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J912", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J913", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J914", "SELECT /*+ FIRST_ROWS(100) */ TM1.DltHdr, TM1.DltR, TM1.DltP, T2.EmprNom, TM1.DltKgs, TM1.DltMts, TM1.DltPzs, TM1.DltBultos, TM1.DltTubos, TM1.DltArtCod, TM1.DltArtDsc, TM1.DltColNom, TM1.DltColNum, TM1.DltTc, TM1.DltColClNm, TM1.DltColClNr, TM1.DltGrm2, TM1.DltAnc, TM1.DltAlbObs, TM1.DltUltTxt, TM1.DltUltFs, TM1.DltEncCli, TM1.DltPreKg, TM1.DltPreMt, TM1.DltKgsCli, TM1.DltTubo, TM1.DltTuboN, TM1.DltModCod, TM1.EmprCod, TM1.AlbProCod FROM (TXPDLT001 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.AlbProCod = ? and TM1.DltHdr = ? and TM1.DltR = ? and TM1.DltP = ? ORDER BY TM1.EmprCod, TM1.AlbProCod, TM1.DltHdr, TM1.DltR, TM1.DltP ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J915", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J916", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, DltHdr, DltR, DltP FROM TXPDLT001 WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J917", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, DltHdr, DltR, DltP FROM TXPDLT001 WHERE ( AlbProCod > ? or AlbProCod = ? and DltHdr > ? or DltHdr = ? and AlbProCod = ? and DltR > ? or DltR = ? and DltHdr = ? and AlbProCod = ? and DltP > ?) and EmprCod = ? ORDER BY EmprCod, AlbProCod, DltHdr, DltR, DltP) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01J918", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, DltHdr, DltR, DltP FROM TXPDLT001 WHERE ( AlbProCod < ? or AlbProCod = ? and DltHdr < ? or DltHdr = ? and AlbProCod = ? and DltR < ? or DltR = ? and DltHdr = ? and AlbProCod = ? and DltP < ?) and EmprCod = ? ORDER BY EmprCod DESC, AlbProCod DESC, DltHdr DESC, DltR DESC, DltP DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01J919", "INSERT INTO TXPDLT001(DltHdr, DltR, DltP, DltKgs, DltMts, DltPzs, DltBultos, DltTubos, DltArtCod, DltArtDsc, DltColNom, DltColNum, DltTc, DltColClNm, DltColClNr, DltGrm2, DltAnc, DltAlbObs, DltUltTxt, DltUltFs, DltEncCli, DltPreKg, DltPreMt, DltKgsCli, DltTubo, DltTuboN, DltModCod, EmprCod, AlbProCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDLT001")
         ,new UpdateCursor("T01J920", "UPDATE TXPDLT001 SET DltKgs=?, DltMts=?, DltPzs=?, DltBultos=?, DltTubos=?, DltArtCod=?, DltArtDsc=?, DltColNom=?, DltColNum=?, DltTc=?, DltColClNm=?, DltColClNr=?, DltGrm2=?, DltAnc=?, DltAlbObs=?, DltUltTxt=?, DltUltFs=?, DltEncCli=?, DltPreKg=?, DltPreMt=?, DltKgsCli=?, DltTubo=?, DltTuboN=?, DltModCod=?  WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ?", GX_NOMASK, "TXPDLT001")
         ,new UpdateCursor("T01J921", "DELETE FROM TXPDLT001  WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ?", GX_NOMASK, "TXPDLT001")
         ,new ForEachCursor("T01J922", "SELECT * FROM (SELECT EmprCod, AlbProCod, DltHdr, DltR, DltP, DltNPieza FROM TXPDLT002 WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01J923", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod, DltHdr, DltR, DltP FROM TXPDLT001 WHERE EmprCod = ? ORDER BY EmprCod, AlbProCod, DltHdr, DltR, DltP ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J924", "SELECT AlbProCod, DltHdr, DltR, DltP, DltLinTxt, DltDsc, DltRD, DltPKg, DltKgsTxt, DltPMt, DltMtsTxt, DltImpTxt, DltTipTxt, DltCodTxt, DltPzsTxt, EmprCod FROM TXPDLT006 WHERE EmprCod = ? and AlbProCod = ? and DltHdr = ? and DltR = ? and DltP = ? and DltLinTxt = ? ORDER BY EmprCod, AlbProCod, DltHdr, DltR, DltP, DltLinTxt ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J925", "SELECT EmprCod, AlbProCod, DltHdr, DltR, DltP, DltLinTxt FROM TXPDLT006 WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ? AND DltLinTxt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01J926", "INSERT INTO TXPDLT006(AlbProCod, DltHdr, DltR, DltP, DltLinTxt, DltDsc, DltRD, DltPKg, DltKgsTxt, DltPMt, DltMtsTxt, DltImpTxt, DltTipTxt, DltCodTxt, DltPzsTxt, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDLT006")
         ,new UpdateCursor("T01J927", "UPDATE TXPDLT006 SET DltDsc=?, DltRD=?, DltPKg=?, DltKgsTxt=?, DltPMt=?, DltMtsTxt=?, DltImpTxt=?, DltTipTxt=?, DltCodTxt=?, DltPzsTxt=?  WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ? AND DltLinTxt = ?", GX_NOMASK, "TXPDLT006")
         ,new UpdateCursor("T01J928", "DELETE FROM TXPDLT006  WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ? AND DltLinTxt = ?", GX_NOMASK, "TXPDLT006")
         ,new ForEachCursor("T01J929", "SELECT EmprCod, AlbProCod, DltHdr, DltR, DltP, DltLinTxt FROM TXPDLT006 WHERE EmprCod = ? and AlbProCod = ? and DltHdr = ? and DltR = ? and DltP = ? ORDER BY EmprCod, AlbProCod, DltHdr, DltR, DltP, DltLinTxt ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J930", "SELECT AlbProCod, DltHdr, DltR, DltP, DltNPieza, DltKgsPz, DltMtsPz, DltAncPz, EmprCod FROM TXPDLT002 WHERE EmprCod = ? and AlbProCod = ? and DltHdr = ? and DltR = ? and DltP = ? and DltNPieza = ? ORDER BY EmprCod, AlbProCod, DltHdr, DltR, DltP, DltNPieza ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J931", "SELECT EmprCod, AlbProCod, DltHdr, DltR, DltP, DltNPieza FROM TXPDLT002 WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ? AND DltNPieza = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01J932", "INSERT INTO TXPDLT002(AlbProCod, DltHdr, DltR, DltP, DltNPieza, DltKgsPz, DltMtsPz, DltAncPz, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDLT002")
         ,new UpdateCursor("T01J933", "UPDATE TXPDLT002 SET DltKgsPz=?, DltMtsPz=?, DltAncPz=?  WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ? AND DltNPieza = ?", GX_NOMASK, "TXPDLT002")
         ,new UpdateCursor("T01J934", "DELETE FROM TXPDLT002  WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ? AND DltNPieza = ?", GX_NOMASK, "TXPDLT002")
         ,new ForEachCursor("T01J935", "SELECT EmprCod, AlbProCod, DltHdr, DltR, DltP, DltNPieza FROM TXPDLT002 WHERE EmprCod = ? and AlbProCod = ? and DltHdr = ? and DltR = ? and DltP = ? ORDER BY EmprCod, AlbProCod, DltHdr, DltR, DltP, DltNPieza ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J936", "SELECT AlbProCod, DltHdr, DltR, DltP, DltNPieza, DltNTrozo, DltKgsTrz, DltMtsTrz, DltAncTrz, EmprCod FROM TXPDLT003 WHERE EmprCod = ? and AlbProCod = ? and DltHdr = ? and DltR = ? and DltP = ? and DltNPieza = ? and DltNTrozo = ? ORDER BY EmprCod, AlbProCod, DltHdr, DltR, DltP, DltNPieza, DltNTrozo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J937", "SELECT EmprCod, AlbProCod, DltHdr, DltR, DltP, DltNPieza, DltNTrozo FROM TXPDLT003 WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ? AND DltNPieza = ? AND DltNTrozo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01J938", "INSERT INTO TXPDLT003(AlbProCod, DltHdr, DltR, DltP, DltNPieza, DltNTrozo, DltKgsTrz, DltMtsTrz, DltAncTrz, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDLT003")
         ,new UpdateCursor("T01J939", "UPDATE TXPDLT003 SET DltKgsTrz=?, DltMtsTrz=?, DltAncTrz=?  WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ? AND DltNPieza = ? AND DltNTrozo = ?", GX_NOMASK, "TXPDLT003")
         ,new UpdateCursor("T01J940", "DELETE FROM TXPDLT003  WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ? AND DltNPieza = ? AND DltNTrozo = ?", GX_NOMASK, "TXPDLT003")
         ,new ForEachCursor("T01J941", "SELECT EmprCod, AlbProCod, DltHdr, DltR, DltP, DltNPieza, DltNTrozo FROM TXPDLT003 WHERE EmprCod = ? and AlbProCod = ? and DltHdr = ? and DltR = ? and DltP = ? and DltNPieza = ? ORDER BY EmprCod, AlbProCod, DltHdr, DltR, DltP, DltNPieza, DltNTrozo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J942", "SELECT AlbProCod, DltHdr, DltR, DltP, DltLin, DltFascod, DltFasDsc, DltKgsFs, DltMtsFs, DltPrKFs, DltPrMFs, DltPrKBFs, DltPrMBFs, EmprCod FROM TXPDLT004 WHERE EmprCod = ? and AlbProCod = ? and DltHdr = ? and DltR = ? and DltP = ? and DltLin = ? ORDER BY EmprCod, AlbProCod, DltHdr, DltR, DltP, DltLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J943", "SELECT EmprCod, AlbProCod, DltHdr, DltR, DltP, DltLin FROM TXPDLT004 WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ? AND DltLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01J944", "INSERT INTO TXPDLT004(AlbProCod, DltHdr, DltR, DltP, DltLin, DltFascod, DltFasDsc, DltKgsFs, DltMtsFs, DltPrKFs, DltPrMFs, DltPrKBFs, DltPrMBFs, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDLT004")
         ,new UpdateCursor("T01J945", "UPDATE TXPDLT004 SET DltFascod=?, DltFasDsc=?, DltKgsFs=?, DltMtsFs=?, DltPrKFs=?, DltPrMFs=?, DltPrKBFs=?, DltPrMBFs=?  WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ? AND DltLin = ?", GX_NOMASK, "TXPDLT004")
         ,new UpdateCursor("T01J946", "DELETE FROM TXPDLT004  WHERE EmprCod = ? AND AlbProCod = ? AND DltHdr = ? AND DltR = ? AND DltP = ? AND DltLin = ?", GX_NOMASK, "TXPDLT004")
         ,new ForEachCursor("T01J947", "SELECT EmprCod, AlbProCod, DltHdr, DltR, DltP, DltLin FROM TXPDLT004 WHERE EmprCod = ? and AlbProCod = ? and DltHdr = ? and DltR = ? and DltP = ? ORDER BY EmprCod, AlbProCod, DltHdr, DltR, DltP, DltLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J948", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J949", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 28);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(13,5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 3);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 28);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(13,5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 3);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(16, 3);
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(16, 3);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(22,5);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(23,5);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((short[]) buf[45])[0] = rslt.getShort(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(26, 30);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(27, 13);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(28, 3);
               ((long[]) buf[52])[0] = rslt.getLong(29);
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(22,5);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(23,5);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((short[]) buf[45])[0] = rslt.getShort(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(26, 30);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(27, 13);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(28, 3);
               ((long[]) buf[52])[0] = rslt.getLong(29);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 13);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(18);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 20);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(23,5);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(24,5);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((short[]) buf[47])[0] = rslt.getShort(26);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(27, 30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(28, 13);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(29, 3);
               ((long[]) buf[54])[0] = rslt.getLong(30);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 22 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(16, 3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 28 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 34 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 3);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 40 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 28);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(13,5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 3);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 47 :
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 15 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 16 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[12]).intValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 16);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[16], 26);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[18], 13);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[20]).intValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[22]).byteValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[24], 13);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[26]).intValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[28]).shortValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[30]).shortValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[32], 30);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[34]).shortValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[36]).shortValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[38], 20);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[40], 5);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(23, (java.math.BigDecimal)parms[42], 5);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(25, ((Number) parms[46]).shortValue());
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[48], 30);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[50], 13);
               }
               stmt.setString(28, (String)parms[51], 3);
               stmt.setLong(29, ((Number) parms[52]).longValue());
               return;
            case 18 :
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
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 16);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 26);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 13);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[19]).byteValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 13);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[23]).intValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[27]).shortValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 30);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[31]).shortValue());
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
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 20);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[37], 5);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[39], 5);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[41], 2);
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
                  stmt.setString(23, (String)parms[45], 30);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 13);
               }
               stmt.setString(25, (String)parms[48], 3);
               stmt.setLong(26, ((Number) parms[49]).longValue());
               stmt.setInt(27, ((Number) parms[50]).intValue());
               stmt.setByte(28, ((Number) parms[51]).byteValue());
               stmt.setString(29, (String)parms[52], 1);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 24 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 30);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 5);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[14], 5);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[22], 6);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[24]).intValue());
               }
               stmt.setString(16, (String)parms[25], 3);
               return;
            case 25 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
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
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 5);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
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
                  stmt.setString(9, (String)parms[17], 6);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[19]).intValue());
               }
               stmt.setString(11, (String)parms[20], 3);
               stmt.setLong(12, ((Number) parms[21]).longValue());
               stmt.setInt(13, ((Number) parms[22]).intValue());
               stmt.setByte(14, ((Number) parms[23]).byteValue());
               stmt.setString(15, (String)parms[24], 1);
               stmt.setShort(16, ((Number) parms[25]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[10]).shortValue());
               }
               stmt.setString(9, (String)parms[11], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setLong(5, ((Number) parms[7]).longValue());
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setByte(7, ((Number) parms[9]).byteValue());
               stmt.setString(8, (String)parms[10], 1);
               stmt.setString(9, (String)parms[11], 9);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 36 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[11]).shortValue());
               }
               stmt.setString(10, (String)parms[12], 3);
               return;
            case 37 :
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
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setLong(5, ((Number) parms[7]).longValue());
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setByte(7, ((Number) parms[9]).byteValue());
               stmt.setString(8, (String)parms[10], 1);
               stmt.setString(9, (String)parms[11], 9);
               stmt.setShort(10, ((Number) parms[12]).shortValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 42 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 8);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 28);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[14], 5);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[16], 5);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[18], 5);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[20], 5);
               }
               stmt.setString(14, (String)parms[21], 3);
               return;
            case 43 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 28);
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
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 5);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 5);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 5);
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setLong(10, ((Number) parms[17]).longValue());
               stmt.setInt(11, ((Number) parms[18]).intValue());
               stmt.setByte(12, ((Number) parms[19]).byteValue());
               stmt.setString(13, (String)parms[20], 1);
               stmt.setShort(14, ((Number) parms[21]).shortValue());
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

