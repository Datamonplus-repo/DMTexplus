package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tfrtohd_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
      {
         gxnrgrid2_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla Intercambio HDR", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtFTHdr_Internalname ;
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
      nRC_GXsfl_130 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_130"))) ;
      nGXsfl_130_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_130_idx"))) ;
      sGXsfl_130_idx = httpContext.GetPar( "sGXsfl_130_idx") ;
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
      nRC_GXsfl_167 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_167"))) ;
      nGXsfl_167_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_167_idx"))) ;
      sGXsfl_167_idx = httpContext.GetPar( "sGXsfl_167_idx") ;
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

   public void gxnrgrid3_newrow_invoke( )
   {
      nRC_GXsfl_178 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_178"))) ;
      nGXsfl_178_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_178_idx"))) ;
      sGXsfl_178_idx = httpContext.GetPar( "sGXsfl_178_idx") ;
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
      nRC_GXsfl_193 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_193"))) ;
      nGXsfl_193_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_193_idx"))) ;
      sGXsfl_193_idx = httpContext.GetPar( "sGXsfl_193_idx") ;
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

   public tfrtohd_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tfrtohd_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfrtohd_impl.class ));
   }

   public tfrtohd_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFRTOHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFRTOHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFRTOHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFRTOHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TFRTOHD.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Hdr", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFTHdr_Internalname, GXutil.ltrim( localUtil.ntoc( A13528FTHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFTHdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13528FTHdr), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13528FTHdr), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFTHdr_Jsonclick, 0, "", "", "", "", "", 1, edtFTHdr_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "R", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFTHdrR_Internalname, GXutil.ltrim( localUtil.ntoc( A13529FTHdrR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFTHdrR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13529FTHdrR), "9") : localUtil.format( DecimalUtil.doubleToDec(A13529FTHdrR), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFTHdrR_Jsonclick, 0, "", "", "", "", "", 1, edtFTHdrR_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "P", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFTHdrP_Internalname, GXutil.rtrim( A13530FTHdrP), GXutil.rtrim( localUtil.format( A13530FTHdrP, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFTHdrP_Jsonclick, 0, "", "", "", "", "", 1, edtFTHdrP_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFRTOHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFTClicod_Internalname, GXutil.ltrim( localUtil.ntoc( A13531FTClicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFTClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13531FTClicod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13531FTClicod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFTClicod_Jsonclick, 0, "", "", "", "", "", 1, edtFTClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFTCliNom_Internalname, GXutil.rtrim( A13532FTCliNom), GXutil.rtrim( localUtil.format( A13532FTCliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFTCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtFTCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Articulo", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFTArticulo_Internalname, GXutil.rtrim( A13533FTArticulo), GXutil.rtrim( localUtil.format( A13533FTArticulo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFTArticulo_Jsonclick, 0, "", "", "", "", "", 1, edtFTArticulo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFTArtDsc_Internalname, GXutil.rtrim( A13534FTArtDsc), GXutil.rtrim( localUtil.format( A13534FTArtDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFTArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtFTArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Ancho (cm)", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFTAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A13535FTAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFTAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13535FTAnc), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13535FTAnc), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFTAnc_Jsonclick, 0, "", "", "", "", "", 1, edtFTAnc_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Grm2", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFTGrm2_Internalname, GXutil.ltrim( localUtil.ntoc( A13536FTGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFTGrm2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13536FTGrm2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13536FTGrm2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFTGrm2_Jsonclick, 0, "", "", "", "", "", 1, edtFTGrm2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Color", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFTColor_Internalname, GXutil.rtrim( A13537FTColor), GXutil.rtrim( localUtil.format( A13537FTColor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFTColor_Jsonclick, 0, "", "", "", "", "", 1, edtFTColor_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Numero", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFTColorNum_Internalname, GXutil.ltrim( localUtil.ntoc( A13538FTColorNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFTColorNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13538FTColorNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13538FTColorNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFTColorNum_Jsonclick, 0, "", "", "", "", "", 1, edtFTColorNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFTEstado_Internalname, GXutil.ltrim( localUtil.ntoc( A13539FTEstado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFTEstado_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13539FTEstado), "9") : localUtil.format( DecimalUtil.doubleToDec(A13539FTEstado), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFTEstado_Jsonclick, 0, "", "", "", "", "", 1, edtFTEstado_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Metros", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFTMetros_Internalname, GXutil.ltrim( localUtil.ntoc( A13540FTMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFTMetros_Enabled!=0) ? localUtil.format( A13540FTMetros, "ZZZZZ9.99") : localUtil.format( A13540FTMetros, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFTMetros_Jsonclick, 0, "", "", "", "", "", 1, edtFTMetros_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Kilos", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFTKilos_Internalname, GXutil.ltrim( localUtil.ntoc( A13541FTKilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFTKilos_Enabled!=0) ? localUtil.format( A13541FTKilos, "ZZZZZ9.99") : localUtil.format( A13541FTKilos, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFTKilos_Jsonclick, 0, "", "", "", "", "", 1, edtFTKilos_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Piezas", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFTPzas_Internalname, GXutil.ltrim( localUtil.ntoc( A13542FTPzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFTPzas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13542FTPzas), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13542FTPzas), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFTPzas_Jsonclick, 0, "", "", "", "", "", 1, edtFTPzas_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Situacion", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFTSituacio_Internalname, GXutil.ltrim( localUtil.ntoc( A13561FTSituacio, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFTSituacio_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13561FTSituacio), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A13561FTSituacio), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFTSituacio_Jsonclick, 0, "", "", "", "", "", 1, edtFTSituacio_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Articulo ERP", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFTArticExt_Internalname, GXutil.rtrim( A13588FTArticExt), GXutil.rtrim( localUtil.format( A13588FTArticExt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFTArticExt_Jsonclick, 0, "", "", "", "", "", 1, edtFTArticExt_Enabled, 0, "text", "", 70, "chr", 1, "row", 70, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Hdr ERP", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFTHdrExt_Internalname, GXutil.rtrim( A13589FTHdrExt), GXutil.rtrim( localUtil.format( A13589FTHdrExt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFTHdrExt_Jsonclick, 0, "", "", "", "", "", 1, edtFTHdrExt_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Tipo HDR: A(acabado), T(Tinte), E(Estampacion)", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFTTipo_Internalname, GXutil.rtrim( A13590FTTipo), GXutil.rtrim( localUtil.format( A13590FTTipo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFTTipo_Jsonclick, 0, "", "", "", "", "", 1, edtFTTipo_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtFTObs_Internalname, A13591FTObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", (short)(0), 1, edtFTObs_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TFRTOHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol130( ) ;
      /* Save parent mode. */
      sMode1860 = Gx_mode ;
      nGXsfl_130_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1860 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1860 = (short)(1) ;
            scanStart1OI1860( ) ;
            while ( RcdFound1860 != 0 )
            {
               init_level_properties1860( ) ;
               getByPrimaryKey1OI1860( ) ;
               addRow1OI1860( ) ;
               scanNext1OI1860( ) ;
            }
            scanEnd1OI1860( ) ;
            nBlankRcdCount1860 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1OI1860( ) ;
         standaloneModal1OI1860( ) ;
         sMode1860 = Gx_mode ;
         while ( nGXsfl_130_idx < nRC_GXsfl_130 )
         {
            bGXsfl_130_Refreshing = true ;
            readRow1OI1860( ) ;
            edtFTCLote_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTCLOTE_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTCLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCLote_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            edtFTCEmpesa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTCEMPESA_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTCEmpesa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCEmpesa_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            edtFTCEmpesaE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTCEMPESAE_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTCEmpesaE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCEmpesaE_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            edtFTCAncho_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTCANCHO_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTCAncho_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCAncho_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            edtFTCMetros_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTCMETROS_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTCMetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCMetros_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            edtFTCUltLine_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTCULTLINE_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTCUltLine_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCUltLine_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            if ( ( nRcdExists_1860 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1OI1860( ) ;
            }
            sendRow1OI1860( ) ;
            bGXsfl_130_Refreshing = false ;
         }
         Gx_mode = sMode1860 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1860 = (short)(5) ;
         nRcdExists_1860 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1OI1860( ) ;
            while ( RcdFound1860 != 0 )
            {
               sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1301860( ) ;
               init_level_properties1860( ) ;
               standaloneNotModal1OI1860( ) ;
               getByPrimaryKey1OI1860( ) ;
               standaloneModal1OI1860( ) ;
               addRow1OI1860( ) ;
               scanNext1OI1860( ) ;
            }
            scanEnd1OI1860( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1860 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_1301860( ) ;
      initAll1OI1860( ) ;
      init_level_properties1860( ) ;
      nRcdExists_1860 = (short)(0) ;
      nIsMod_1860 = (short)(0) ;
      nRcdDeleted_1860 = (short)(0) ;
      nBlankRcdCount1860 = (short)(nBlankRcdUsr1860+nBlankRcdCount1860) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1860 > 0 )
      {
         standaloneNotModal1OI1860( ) ;
         standaloneModal1OI1860( ) ;
         addRow1OI1860( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtFTCLote_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1860 = (short)(nBlankRcdCount1860-1) ;
      }
      Gx_mode = sMode1860 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode1860 ;
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
      startgridcontrol178( ) ;
      nGXsfl_178_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1854 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1854 = (short)(1) ;
            scanStart1OI1854( ) ;
            while ( RcdFound1854 != 0 )
            {
               init_level_properties1854( ) ;
               getByPrimaryKey1OI1854( ) ;
               addRow1OI1854( ) ;
               scanNext1OI1854( ) ;
            }
            scanEnd1OI1854( ) ;
            nBlankRcdCount1854 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1OI1854( ) ;
         standaloneModal1OI1854( ) ;
         sMode1854 = Gx_mode ;
         while ( nGXsfl_178_idx < nRC_GXsfl_178 )
         {
            bGXsfl_178_Refreshing = true ;
            readRow1OI1854( ) ;
            edtavnRcdDeleted_1854_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1854_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1854_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1854_Enabled), 5, 0), !bGXsfl_178_Refreshing);
            edtFTFProceso_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTFPROCESO_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTFProceso_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTFProceso_Enabled), 5, 0), !bGXsfl_178_Refreshing);
            edtFTFOrden_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTFORDEN_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTFOrden_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTFOrden_Enabled), 5, 0), !bGXsfl_178_Refreshing);
            edtFTMaquina_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTMAQUINA_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTMaquina_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTMaquina_Enabled), 5, 0), !bGXsfl_178_Refreshing);
            edtFTFFase_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTFFASE_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTFFase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTFFase_Enabled), 5, 0), !bGXsfl_178_Refreshing);
            edtFTFFaseDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTFFASEDSC_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTFFaseDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTFFaseDsc_Enabled), 5, 0), !bGXsfl_178_Refreshing);
            edtFTFEstado_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTFESTADO_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTFEstado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTFEstado_Enabled), 5, 0), !bGXsfl_178_Refreshing);
            edtFTFInicio_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTFINICIO_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTFInicio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTFInicio_Enabled), 5, 0), !bGXsfl_178_Refreshing);
            edtFTFFin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTFFIN_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTFFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTFFin_Enabled), 5, 0), !bGXsfl_178_Refreshing);
            edtFTFMetros_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTFMETROS_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTFMetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTFMetros_Enabled), 5, 0), !bGXsfl_178_Refreshing);
            edtFTTKilos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTTKILOS_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTTKilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTTKilos_Enabled), 5, 0), !bGXsfl_178_Refreshing);
            if ( ( nRcdExists_1854 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1OI1854( ) ;
            }
            sendRow1OI1854( ) ;
            bGXsfl_178_Refreshing = false ;
         }
         Gx_mode = sMode1854 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1854 = (short)(5) ;
         nRcdExists_1854 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1OI1854( ) ;
            while ( RcdFound1854 != 0 )
            {
               sGXsfl_178_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_178_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1781854( ) ;
               init_level_properties1854( ) ;
               standaloneNotModal1OI1854( ) ;
               getByPrimaryKey1OI1854( ) ;
               standaloneModal1OI1854( ) ;
               addRow1OI1854( ) ;
               scanNext1OI1854( ) ;
            }
            scanEnd1OI1854( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1854 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_178_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_178_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_1781854( ) ;
      initAll1OI1854( ) ;
      init_level_properties1854( ) ;
      nRcdExists_1854 = (short)(0) ;
      nIsMod_1854 = (short)(0) ;
      nRcdDeleted_1854 = (short)(0) ;
      nBlankRcdCount1854 = (short)(nBlankRcdUsr1854+nBlankRcdCount1854) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1854 > 0 )
      {
         standaloneNotModal1OI1854( ) ;
         standaloneModal1OI1854( ) ;
         addRow1OI1854( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtFTFProceso_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1854 = (short)(nBlankRcdCount1854-1) ;
      }
      Gx_mode = sMode1854 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Grid3Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Grid3", Grid3Container, subGrid3_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid3ContainerData", Grid3Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid3ContainerData"+"V", Grid3Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid3ContainerData"+"V"+"\" value='"+Grid3Container.GridValuesHidden()+"'/>") ;
      }
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol193( ) ;
      nGXsfl_193_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1853 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1853 = (short)(1) ;
            scanStart1OI1853( ) ;
            while ( RcdFound1853 != 0 )
            {
               init_level_properties1853( ) ;
               getByPrimaryKey1OI1853( ) ;
               addRow1OI1853( ) ;
               scanNext1OI1853( ) ;
            }
            scanEnd1OI1853( ) ;
            nBlankRcdCount1853 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1OI1853( ) ;
         standaloneModal1OI1853( ) ;
         sMode1853 = Gx_mode ;
         while ( nGXsfl_193_idx < nRC_GXsfl_193 )
         {
            bGXsfl_193_Refreshing = true ;
            readRow1OI1853( ) ;
            edtavnRcdDeleted_1853_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1853_"+sGXsfl_193_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1853_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1853_Enabled), 5, 0), !bGXsfl_193_Refreshing);
            edtFTPieza_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTPIEZA_"+sGXsfl_193_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTPieza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTPieza_Enabled), 5, 0), !bGXsfl_193_Refreshing);
            edtFTPMetros_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTPMETROS_"+sGXsfl_193_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTPMetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTPMetros_Enabled), 5, 0), !bGXsfl_193_Refreshing);
            edtFTPKilos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTPKILOS_"+sGXsfl_193_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTPKilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTPKilos_Enabled), 5, 0), !bGXsfl_193_Refreshing);
            edtFTPAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTPANC_"+sGXsfl_193_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTPAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTPAnc_Enabled), 5, 0), !bGXsfl_193_Refreshing);
            edtFTPUbicaci_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTPUBICACI_"+sGXsfl_193_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTPUbicaci_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTPUbicaci_Enabled), 5, 0), !bGXsfl_193_Refreshing);
            edtFTPMtsAut_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTPMTSAUT_"+sGXsfl_193_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTPMtsAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTPMtsAut_Enabled), 5, 0), !bGXsfl_193_Refreshing);
            edtFTPKgsAut_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTPKGSAUT_"+sGXsfl_193_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTPKgsAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTPKgsAut_Enabled), 5, 0), !bGXsfl_193_Refreshing);
            edtFTPPiezaOr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTPPIEZAOR_"+sGXsfl_193_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTPPiezaOr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTPPiezaOr_Enabled), 5, 0), !bGXsfl_193_Refreshing);
            if ( ( nRcdExists_1853 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1OI1853( ) ;
            }
            sendRow1OI1853( ) ;
            bGXsfl_193_Refreshing = false ;
         }
         Gx_mode = sMode1853 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1853 = (short)(5) ;
         nRcdExists_1853 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1OI1853( ) ;
            while ( RcdFound1853 != 0 )
            {
               sGXsfl_193_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_193_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1931853( ) ;
               init_level_properties1853( ) ;
               standaloneNotModal1OI1853( ) ;
               getByPrimaryKey1OI1853( ) ;
               standaloneModal1OI1853( ) ;
               addRow1OI1853( ) ;
               scanNext1OI1853( ) ;
            }
            scanEnd1OI1853( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1853 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_193_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_193_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_1931853( ) ;
      initAll1OI1853( ) ;
      init_level_properties1853( ) ;
      nRcdExists_1853 = (short)(0) ;
      nIsMod_1853 = (short)(0) ;
      nRcdDeleted_1853 = (short)(0) ;
      nBlankRcdCount1853 = (short)(nBlankRcdUsr1853+nBlankRcdCount1853) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1853 > 0 )
      {
         standaloneNotModal1OI1853( ) ;
         standaloneModal1OI1853( ) ;
         addRow1OI1853( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtFTPieza_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1853 = (short)(nBlankRcdCount1853-1) ;
      }
      Gx_mode = sMode1853 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 205,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFRTOHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFRTOHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 207,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFRTOHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 208,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFRTOHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TFRTOHD.htm");
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
      e111OI2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z13528FTHdr = (int)(localUtil.ctol( httpContext.cgiGet( "Z13528FTHdr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13529FTHdrR = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13529FTHdrR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13530FTHdrP = httpContext.cgiGet( "Z13530FTHdrP") ;
            Z13531FTClicod = (int)(localUtil.ctol( httpContext.cgiGet( "Z13531FTClicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13532FTCliNom = httpContext.cgiGet( "Z13532FTCliNom") ;
            Z13533FTArticulo = httpContext.cgiGet( "Z13533FTArticulo") ;
            Z13534FTArtDsc = httpContext.cgiGet( "Z13534FTArtDsc") ;
            Z13535FTAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z13535FTAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13536FTGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z13536FTGrm2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13537FTColor = httpContext.cgiGet( "Z13537FTColor") ;
            Z13538FTColorNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z13538FTColorNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13539FTEstado = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13539FTEstado"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13540FTMetros = localUtil.ctond( httpContext.cgiGet( "Z13540FTMetros")) ;
            Z13541FTKilos = localUtil.ctond( httpContext.cgiGet( "Z13541FTKilos")) ;
            Z13542FTPzas = (int)(localUtil.ctol( httpContext.cgiGet( "Z13542FTPzas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13561FTSituacio = (byte)(localUtil.ctol( httpContext.cgiGet( "Z13561FTSituacio"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13588FTArticExt = httpContext.cgiGet( "Z13588FTArticExt") ;
            Z13589FTHdrExt = httpContext.cgiGet( "Z13589FTHdrExt") ;
            Z13590FTTipo = httpContext.cgiGet( "Z13590FTTipo") ;
            Z13591FTObs = httpContext.cgiGet( "Z13591FTObs") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_130 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_130"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            nRC_GXsfl_178 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_178"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            nRC_GXsfl_193 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_193"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFTHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFTHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FTHDR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFTHdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13528FTHdr = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A13528FTHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13528FTHdr), 8, 0));
            }
            else
            {
               A13528FTHdr = (int)(localUtil.ctol( httpContext.cgiGet( edtFTHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13528FTHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13528FTHdr), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFTHdrR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFTHdrR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FTHDRR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFTHdrR_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13529FTHdrR = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13529FTHdrR", GXutil.str( A13529FTHdrR, 1, 0));
            }
            else
            {
               A13529FTHdrR = (byte)(localUtil.ctol( httpContext.cgiGet( edtFTHdrR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13529FTHdrR", GXutil.str( A13529FTHdrR, 1, 0));
            }
            A13530FTHdrP = httpContext.cgiGet( edtFTHdrP_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13530FTHdrP", A13530FTHdrP);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFTClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFTClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FTCLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFTClicod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13531FTClicod = 0 ;
               n13531FTClicod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13531FTClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13531FTClicod), 6, 0));
            }
            else
            {
               A13531FTClicod = (int)(localUtil.ctol( httpContext.cgiGet( edtFTClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13531FTClicod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13531FTClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13531FTClicod), 6, 0));
            }
            A13532FTCliNom = httpContext.cgiGet( edtFTCliNom_Internalname) ;
            n13532FTCliNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13532FTCliNom", A13532FTCliNom);
            A13533FTArticulo = httpContext.cgiGet( edtFTArticulo_Internalname) ;
            n13533FTArticulo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13533FTArticulo", A13533FTArticulo);
            A13534FTArtDsc = httpContext.cgiGet( edtFTArtDsc_Internalname) ;
            n13534FTArtDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13534FTArtDsc", A13534FTArtDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFTAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFTAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FTANC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFTAnc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13535FTAnc = (short)(0) ;
               n13535FTAnc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13535FTAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13535FTAnc), 3, 0));
            }
            else
            {
               A13535FTAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtFTAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13535FTAnc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13535FTAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13535FTAnc), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFTGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFTGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FTGRM2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFTGrm2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13536FTGrm2 = (short)(0) ;
               n13536FTGrm2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13536FTGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13536FTGrm2), 4, 0));
            }
            else
            {
               A13536FTGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtFTGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13536FTGrm2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13536FTGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13536FTGrm2), 4, 0));
            }
            A13537FTColor = httpContext.cgiGet( edtFTColor_Internalname) ;
            n13537FTColor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13537FTColor", A13537FTColor);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFTColorNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFTColorNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FTCOLORNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFTColorNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13538FTColorNum = 0 ;
               n13538FTColorNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13538FTColorNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13538FTColorNum), 6, 0));
            }
            else
            {
               A13538FTColorNum = (int)(localUtil.ctol( httpContext.cgiGet( edtFTColorNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13538FTColorNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13538FTColorNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13538FTColorNum), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFTEstado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFTEstado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FTESTADO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFTEstado_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13539FTEstado = (byte)(0) ;
               n13539FTEstado = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13539FTEstado", GXutil.str( A13539FTEstado, 1, 0));
            }
            else
            {
               A13539FTEstado = (byte)(localUtil.ctol( httpContext.cgiGet( edtFTEstado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13539FTEstado = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13539FTEstado", GXutil.str( A13539FTEstado, 1, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFTMetros_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFTMetros_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FTMETROS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFTMetros_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13540FTMetros = DecimalUtil.ZERO ;
               n13540FTMetros = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13540FTMetros", GXutil.ltrimstr( A13540FTMetros, 9, 2));
            }
            else
            {
               A13540FTMetros = localUtil.ctond( httpContext.cgiGet( edtFTMetros_Internalname)) ;
               n13540FTMetros = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13540FTMetros", GXutil.ltrimstr( A13540FTMetros, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFTKilos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFTKilos_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FTKILOS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFTKilos_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13541FTKilos = DecimalUtil.ZERO ;
               n13541FTKilos = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13541FTKilos", GXutil.ltrimstr( A13541FTKilos, 9, 2));
            }
            else
            {
               A13541FTKilos = localUtil.ctond( httpContext.cgiGet( edtFTKilos_Internalname)) ;
               n13541FTKilos = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13541FTKilos", GXutil.ltrimstr( A13541FTKilos, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFTPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFTPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FTPZAS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFTPzas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13542FTPzas = 0 ;
               n13542FTPzas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13542FTPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13542FTPzas), 6, 0));
            }
            else
            {
               A13542FTPzas = (int)(localUtil.ctol( httpContext.cgiGet( edtFTPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13542FTPzas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13542FTPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13542FTPzas), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFTSituacio_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFTSituacio_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FTSITUACIO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFTSituacio_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13561FTSituacio = (byte)(0) ;
               n13561FTSituacio = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13561FTSituacio", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13561FTSituacio), 2, 0));
            }
            else
            {
               A13561FTSituacio = (byte)(localUtil.ctol( httpContext.cgiGet( edtFTSituacio_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13561FTSituacio = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13561FTSituacio", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13561FTSituacio), 2, 0));
            }
            A13588FTArticExt = httpContext.cgiGet( edtFTArticExt_Internalname) ;
            n13588FTArticExt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13588FTArticExt", A13588FTArticExt);
            A13589FTHdrExt = httpContext.cgiGet( edtFTHdrExt_Internalname) ;
            n13589FTHdrExt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13589FTHdrExt", A13589FTHdrExt);
            A13590FTTipo = httpContext.cgiGet( edtFTTipo_Internalname) ;
            n13590FTTipo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13590FTTipo", A13590FTTipo);
            A13591FTObs = httpContext.cgiGet( edtFTObs_Internalname) ;
            n13591FTObs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13591FTObs", A13591FTObs);
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
               A13528FTHdr = (int)(GXutil.lval( httpContext.GetPar( "FTHdr"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13528FTHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13528FTHdr), 8, 0));
               A13529FTHdrR = (byte)(GXutil.lval( httpContext.GetPar( "FTHdrR"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13529FTHdrR", GXutil.str( A13529FTHdrR, 1, 0));
               A13530FTHdrP = httpContext.GetPar( "FTHdrP") ;
               httpContext.ajax_rsp_assign_attri("", false, "A13530FTHdrP", A13530FTHdrP);
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
                        e111OI2 ();
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
            initAll1OI1852( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1861_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1861_Enabled), 5, 0), !bGXsfl_167_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1854_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1854_Enabled), 5, 0), !bGXsfl_178_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1853_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1853_Enabled), 5, 0), !bGXsfl_193_Refreshing);
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
      disableAttributes1OI1852( ) ;
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

   public void confirm_1OI0( )
   {
      beforeValidate1OI1852( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1OI1852( ) ;
         }
         else
         {
            checkExtendedTable1OI1852( ) ;
            if ( AnyError == 0 )
            {
               zm1OI1852( 2) ;
            }
            closeExtendedTableCursors1OI1852( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1852 = Gx_mode ;
         confirm_1OI1860( ) ;
         if ( AnyError == 0 )
         {
            confirm_1OI1854( ) ;
            if ( AnyError == 0 )
            {
               confirm_1OI1853( ) ;
               if ( AnyError == 0 )
               {
                  /* Restore parent mode. */
                  Gx_mode = sMode1852 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  IsConfirmed = (short)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
               }
            }
         }
         /* Restore parent mode. */
         Gx_mode = sMode1852 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1OI0( ) ;
      }
   }

   public void confirm_1OI1853( )
   {
      nGXsfl_193_idx = 0 ;
      while ( nGXsfl_193_idx < nRC_GXsfl_193 )
      {
         readRow1OI1853( ) ;
         if ( ( nRcdExists_1853 != 0 ) || ( nIsMod_1853 != 0 ) )
         {
            getKey1OI1853( ) ;
            if ( ( nRcdExists_1853 == 0 ) && ( nRcdDeleted_1853 == 0 ) )
            {
               if ( RcdFound1853 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1OI1853( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1OI1853( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1OI1853( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "FTPIEZA_" + sGXsfl_193_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFTPieza_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1853 != 0 )
               {
                  if ( nRcdDeleted_1853 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1OI1853( ) ;
                     load1OI1853( ) ;
                     beforeValidate1OI1853( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1OI1853( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1853 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1OI1853( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1OI1853( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1OI1853( ) ;
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
                  if ( nRcdDeleted_1853 == 0 )
                  {
                     GXCCtl = "FTPIEZA_" + sGXsfl_193_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFTPieza_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1853_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1853, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTPieza_Internalname, GXutil.rtrim( A13543FTPieza)) ;
         httpContext.changePostValue( edtFTPMetros_Internalname, GXutil.ltrim( localUtil.ntoc( A13544FTPMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTPKilos_Internalname, GXutil.ltrim( localUtil.ntoc( A13545FTPKilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTPAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A13546FTPAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTPUbicaci_Internalname, GXutil.rtrim( A13547FTPUbicaci)) ;
         httpContext.changePostValue( edtFTPMtsAut_Internalname, GXutil.ltrim( localUtil.ntoc( A13557FTPMtsAut, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTPKgsAut_Internalname, GXutil.ltrim( localUtil.ntoc( A13558FTPKgsAut, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTPPiezaOr_Internalname, GXutil.rtrim( A13559FTPPiezaOr)) ;
         httpContext.changePostValue( "ZT_"+"Z13543FTPieza_"+sGXsfl_193_idx, GXutil.rtrim( Z13543FTPieza)) ;
         httpContext.changePostValue( "ZT_"+"Z13544FTPMetros_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( Z13544FTPMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13545FTPKilos_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( Z13545FTPKilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13546FTPAnc_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( Z13546FTPAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13547FTPUbicaci_"+sGXsfl_193_idx, GXutil.rtrim( Z13547FTPUbicaci)) ;
         httpContext.changePostValue( "ZT_"+"Z13557FTPMtsAut_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( Z13557FTPMtsAut, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13558FTPKgsAut_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( Z13558FTPKgsAut, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13559FTPPiezaOr_"+sGXsfl_193_idx, GXutil.rtrim( Z13559FTPPiezaOr)) ;
         httpContext.changePostValue( "nRcdDeleted_1853_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1853, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1853_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1853, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1853_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1853, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1853 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1853_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1853_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTPIEZA_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPieza_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTPMETROS_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPMetros_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTPKILOS_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPKilos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTPANC_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTPUBICACI_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPUbicaci_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTPMTSAUT_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPMtsAut_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTPKGSAUT_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPKgsAut_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTPPIEZAOR_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPPiezaOr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1OI1854( )
   {
      nGXsfl_178_idx = 0 ;
      while ( nGXsfl_178_idx < nRC_GXsfl_178 )
      {
         readRow1OI1854( ) ;
         if ( ( nRcdExists_1854 != 0 ) || ( nIsMod_1854 != 0 ) )
         {
            getKey1OI1854( ) ;
            if ( ( nRcdExists_1854 == 0 ) && ( nRcdDeleted_1854 == 0 ) )
            {
               if ( RcdFound1854 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1OI1854( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1OI1854( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1OI1854( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "FTFPROCESO_" + sGXsfl_178_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFTFProceso_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1854 != 0 )
               {
                  if ( nRcdDeleted_1854 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1OI1854( ) ;
                     load1OI1854( ) ;
                     beforeValidate1OI1854( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1OI1854( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1854 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1OI1854( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1OI1854( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1OI1854( ) ;
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
                  if ( nRcdDeleted_1854 == 0 )
                  {
                     GXCCtl = "FTFPROCESO_" + sGXsfl_178_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFTFProceso_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1854_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1854, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTFProceso_Internalname, GXutil.rtrim( A13548FTFProceso)) ;
         httpContext.changePostValue( edtFTFOrden_Internalname, GXutil.ltrim( localUtil.ntoc( A13549FTFOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTMaquina_Internalname, GXutil.rtrim( A13560FTMaquina)) ;
         httpContext.changePostValue( edtFTFFase_Internalname, GXutil.rtrim( A13550FTFFase)) ;
         httpContext.changePostValue( edtFTFFaseDsc_Internalname, GXutil.rtrim( A13551FTFFaseDsc)) ;
         httpContext.changePostValue( edtFTFEstado_Internalname, GXutil.ltrim( localUtil.ntoc( A13552FTFEstado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTFInicio_Internalname, localUtil.ttoc( A13553FTFInicio, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtFTFFin_Internalname, localUtil.ttoc( A13554FTFFin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtFTFMetros_Internalname, GXutil.ltrim( localUtil.ntoc( A13555FTFMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTTKilos_Internalname, GXutil.ltrim( localUtil.ntoc( A13556FTTKilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13548FTFProceso_"+sGXsfl_178_idx, GXutil.rtrim( Z13548FTFProceso)) ;
         httpContext.changePostValue( "ZT_"+"Z13549FTFOrden_"+sGXsfl_178_idx, GXutil.ltrim( localUtil.ntoc( Z13549FTFOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13560FTMaquina_"+sGXsfl_178_idx, GXutil.rtrim( Z13560FTMaquina)) ;
         httpContext.changePostValue( "ZT_"+"Z13550FTFFase_"+sGXsfl_178_idx, GXutil.rtrim( Z13550FTFFase)) ;
         httpContext.changePostValue( "ZT_"+"Z13551FTFFaseDsc_"+sGXsfl_178_idx, GXutil.rtrim( Z13551FTFFaseDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z13552FTFEstado_"+sGXsfl_178_idx, GXutil.ltrim( localUtil.ntoc( Z13552FTFEstado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13553FTFInicio_"+sGXsfl_178_idx, localUtil.ttoc( Z13553FTFInicio, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z13554FTFFin_"+sGXsfl_178_idx, localUtil.ttoc( Z13554FTFFin, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z13555FTFMetros_"+sGXsfl_178_idx, GXutil.ltrim( localUtil.ntoc( Z13555FTFMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13556FTTKilos_"+sGXsfl_178_idx, GXutil.ltrim( localUtil.ntoc( Z13556FTTKilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1854_"+sGXsfl_178_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1854, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1854_"+sGXsfl_178_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1854, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1854_"+sGXsfl_178_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1854, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1854 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1854_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1854_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTFPROCESO_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFProceso_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTFORDEN_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFOrden_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTMAQUINA_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTMaquina_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTFFASE_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFFase_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTFFASEDSC_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFFaseDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTFESTADO_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFEstado_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTFINICIO_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFInicio_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTFFIN_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFFin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTFMETROS_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFMetros_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTTKILOS_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTTKilos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1OI1861( )
   {
      nGXsfl_167_idx = 0 ;
      while ( nGXsfl_167_idx < nRC_GXsfl_167 )
      {
         readRow1OI1861( ) ;
         if ( ( nRcdExists_1861 != 0 ) || ( nIsMod_1861 != 0 ) )
         {
            getKey1OI1861( ) ;
            if ( ( nRcdExists_1861 == 0 ) && ( nRcdDeleted_1861 == 0 ) )
            {
               if ( RcdFound1861 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1OI1861( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1OI1861( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1OI1861( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "FTCLOTE_" + sGXsfl_130_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFTCLote_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1861 != 0 )
               {
                  if ( nRcdDeleted_1861 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1OI1861( ) ;
                     load1OI1861( ) ;
                     beforeValidate1OI1861( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1OI1861( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1861 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1OI1861( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1OI1861( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1OI1861( ) ;
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
                  if ( nRcdDeleted_1861 == 0 )
                  {
                     GXCCtl = "FTCLOTE_" + sGXsfl_130_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFTCLote_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1861_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1861, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTCLinea_Internalname, GXutil.ltrim( localUtil.ntoc( A13598FTCLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTCPresen_Internalname, GXutil.rtrim( A13599FTCPresen)) ;
         httpContext.changePostValue( edtFTCLong_Internalname, GXutil.ltrim( localUtil.ntoc( A13600FTCLong, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTCLMts_Internalname, GXutil.ltrim( localUtil.ntoc( A13601FTCLMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTCLObs_Internalname, GXutil.rtrim( A13602FTCLObs)) ;
         httpContext.changePostValue( edtFTCLEtique_Internalname, GXutil.rtrim( A13603FTCLEtique)) ;
         httpContext.changePostValue( "ZT_"+"Z13598FTCLinea_"+sGXsfl_167_idx, GXutil.ltrim( localUtil.ntoc( Z13598FTCLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13599FTCPresen_"+sGXsfl_167_idx, GXutil.rtrim( Z13599FTCPresen)) ;
         httpContext.changePostValue( "ZT_"+"Z13600FTCLong_"+sGXsfl_167_idx, GXutil.ltrim( localUtil.ntoc( Z13600FTCLong, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13601FTCLMts_"+sGXsfl_167_idx, GXutil.ltrim( localUtil.ntoc( Z13601FTCLMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13602FTCLObs_"+sGXsfl_167_idx, GXutil.rtrim( Z13602FTCLObs)) ;
         httpContext.changePostValue( "ZT_"+"Z13603FTCLEtique_"+sGXsfl_167_idx, GXutil.rtrim( Z13603FTCLEtique)) ;
         httpContext.changePostValue( "nRcdDeleted_1861_"+sGXsfl_167_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1861, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1861_"+sGXsfl_167_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1861, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1861_"+sGXsfl_167_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1861, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1861 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1861_"+sGXsfl_167_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1861_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTCLINEA_"+sGXsfl_167_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCLinea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTCPRESEN_"+sGXsfl_167_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCPresen_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTCLONG_"+sGXsfl_167_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCLong_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTCLMTS_"+sGXsfl_167_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCLMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTCLOBS_"+sGXsfl_167_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCLObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTCLETIQUE_"+sGXsfl_167_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCLEtique_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1OI1860( )
   {
      nGXsfl_130_idx = 0 ;
      while ( nGXsfl_130_idx < nRC_GXsfl_130 )
      {
         readRow1OI1860( ) ;
         if ( ( nRcdExists_1860 != 0 ) || ( nIsMod_1860 != 0 ) )
         {
            getKey1OI1860( ) ;
            if ( ( nRcdExists_1860 == 0 ) && ( nRcdDeleted_1860 == 0 ) )
            {
               if ( RcdFound1860 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1OI1860( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1OI1860( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1OI1860( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode1860 = Gx_mode ;
                        confirm_1OI1861( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode1860 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode1860 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "FTCLOTE_" + sGXsfl_130_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFTCLote_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1860 != 0 )
               {
                  if ( nRcdDeleted_1860 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1OI1860( ) ;
                     load1OI1860( ) ;
                     beforeValidate1OI1860( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1OI1860( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1860 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1OI1860( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1OI1860( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1OI1860( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode1860 = Gx_mode ;
                              confirm_1OI1861( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode1860 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode1860 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1860 == 0 )
                  {
                     GXCCtl = "FTCLOTE_" + sGXsfl_130_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFTCLote_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtFTCLote_Internalname, GXutil.rtrim( A13592FTCLote)) ;
         httpContext.changePostValue( edtFTCEmpesa_Internalname, GXutil.rtrim( A13593FTCEmpesa)) ;
         httpContext.changePostValue( edtFTCEmpesaE_Internalname, GXutil.rtrim( A13594FTCEmpesaE)) ;
         httpContext.changePostValue( edtFTCAncho_Internalname, GXutil.ltrim( localUtil.ntoc( A13595FTCAncho, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTCMetros_Internalname, GXutil.ltrim( localUtil.ntoc( A13596FTCMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTCUltLine_Internalname, GXutil.ltrim( localUtil.ntoc( A13597FTCUltLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13592FTCLote_"+sGXsfl_130_idx, GXutil.rtrim( Z13592FTCLote)) ;
         httpContext.changePostValue( "ZT_"+"Z13593FTCEmpesa_"+sGXsfl_130_idx, GXutil.rtrim( Z13593FTCEmpesa)) ;
         httpContext.changePostValue( "ZT_"+"Z13594FTCEmpesaE_"+sGXsfl_130_idx, GXutil.rtrim( Z13594FTCEmpesaE)) ;
         httpContext.changePostValue( "ZT_"+"Z13595FTCAncho_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z13595FTCAncho, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13596FTCMetros_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z13596FTCMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13597FTCUltLine_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z13597FTCUltLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_167_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_167, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1860_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1860, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1860_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1860, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1860_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1860, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1860 != 0 )
         {
            httpContext.changePostValue( "FTCLOTE_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCLote_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTCEMPESA_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCEmpesa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTCEMPESAE_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCEmpesaE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTCANCHO_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCAncho_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTCMETROS_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCMetros_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTCULTLINE_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCUltLine_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1OI0( )
   {
   }

   public void e111OI2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tfrtohd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tfrtohd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tfrtohd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tfrtohd_impl.this.A396EmprCod = GXv_char2[0] ;
      tfrtohd_impl.this.AV11EmprNom = GXv_char3[0] ;
      tfrtohd_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1OI1852( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13531FTClicod = T01OI11_A13531FTClicod[0] ;
            Z13532FTCliNom = T01OI11_A13532FTCliNom[0] ;
            Z13533FTArticulo = T01OI11_A13533FTArticulo[0] ;
            Z13534FTArtDsc = T01OI11_A13534FTArtDsc[0] ;
            Z13535FTAnc = T01OI11_A13535FTAnc[0] ;
            Z13536FTGrm2 = T01OI11_A13536FTGrm2[0] ;
            Z13537FTColor = T01OI11_A13537FTColor[0] ;
            Z13538FTColorNum = T01OI11_A13538FTColorNum[0] ;
            Z13539FTEstado = T01OI11_A13539FTEstado[0] ;
            Z13540FTMetros = T01OI11_A13540FTMetros[0] ;
            Z13541FTKilos = T01OI11_A13541FTKilos[0] ;
            Z13542FTPzas = T01OI11_A13542FTPzas[0] ;
            Z13561FTSituacio = T01OI11_A13561FTSituacio[0] ;
            Z13588FTArticExt = T01OI11_A13588FTArticExt[0] ;
            Z13589FTHdrExt = T01OI11_A13589FTHdrExt[0] ;
            Z13590FTTipo = T01OI11_A13590FTTipo[0] ;
            Z13591FTObs = T01OI11_A13591FTObs[0] ;
         }
         else
         {
            Z13531FTClicod = A13531FTClicod ;
            Z13532FTCliNom = A13532FTCliNom ;
            Z13533FTArticulo = A13533FTArticulo ;
            Z13534FTArtDsc = A13534FTArtDsc ;
            Z13535FTAnc = A13535FTAnc ;
            Z13536FTGrm2 = A13536FTGrm2 ;
            Z13537FTColor = A13537FTColor ;
            Z13538FTColorNum = A13538FTColorNum ;
            Z13539FTEstado = A13539FTEstado ;
            Z13540FTMetros = A13540FTMetros ;
            Z13541FTKilos = A13541FTKilos ;
            Z13542FTPzas = A13542FTPzas ;
            Z13561FTSituacio = A13561FTSituacio ;
            Z13588FTArticExt = A13588FTArticExt ;
            Z13589FTHdrExt = A13589FTHdrExt ;
            Z13590FTTipo = A13590FTTipo ;
            Z13591FTObs = A13591FTObs ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z13528FTHdr = A13528FTHdr ;
         Z13529FTHdrR = A13529FTHdrR ;
         Z13530FTHdrP = A13530FTHdrP ;
         Z13531FTClicod = A13531FTClicod ;
         Z13532FTCliNom = A13532FTCliNom ;
         Z13533FTArticulo = A13533FTArticulo ;
         Z13534FTArtDsc = A13534FTArtDsc ;
         Z13535FTAnc = A13535FTAnc ;
         Z13536FTGrm2 = A13536FTGrm2 ;
         Z13537FTColor = A13537FTColor ;
         Z13538FTColorNum = A13538FTColorNum ;
         Z13539FTEstado = A13539FTEstado ;
         Z13540FTMetros = A13540FTMetros ;
         Z13541FTKilos = A13541FTKilos ;
         Z13542FTPzas = A13542FTPzas ;
         Z13561FTSituacio = A13561FTSituacio ;
         Z13588FTArticExt = A13588FTArticExt ;
         Z13589FTHdrExt = A13589FTHdrExt ;
         Z13590FTTipo = A13590FTTipo ;
         Z13591FTObs = A13591FTObs ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TFRTOHD" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      /* Using cursor T01OI12 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01OI12_A407EmprNom[0] ;
      n407EmprNom = T01OI12_n407EmprNom[0] ;
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

   public void load1OI1852( )
   {
      /* Using cursor T01OI13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1852 = (short)(1) ;
         A407EmprNom = T01OI13_A407EmprNom[0] ;
         n407EmprNom = T01OI13_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A13531FTClicod = T01OI13_A13531FTClicod[0] ;
         n13531FTClicod = T01OI13_n13531FTClicod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13531FTClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13531FTClicod), 6, 0));
         A13532FTCliNom = T01OI13_A13532FTCliNom[0] ;
         n13532FTCliNom = T01OI13_n13532FTCliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13532FTCliNom", A13532FTCliNom);
         A13533FTArticulo = T01OI13_A13533FTArticulo[0] ;
         n13533FTArticulo = T01OI13_n13533FTArticulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13533FTArticulo", A13533FTArticulo);
         A13534FTArtDsc = T01OI13_A13534FTArtDsc[0] ;
         n13534FTArtDsc = T01OI13_n13534FTArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13534FTArtDsc", A13534FTArtDsc);
         A13535FTAnc = T01OI13_A13535FTAnc[0] ;
         n13535FTAnc = T01OI13_n13535FTAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13535FTAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13535FTAnc), 3, 0));
         A13536FTGrm2 = T01OI13_A13536FTGrm2[0] ;
         n13536FTGrm2 = T01OI13_n13536FTGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13536FTGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13536FTGrm2), 4, 0));
         A13537FTColor = T01OI13_A13537FTColor[0] ;
         n13537FTColor = T01OI13_n13537FTColor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13537FTColor", A13537FTColor);
         A13538FTColorNum = T01OI13_A13538FTColorNum[0] ;
         n13538FTColorNum = T01OI13_n13538FTColorNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13538FTColorNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13538FTColorNum), 6, 0));
         A13539FTEstado = T01OI13_A13539FTEstado[0] ;
         n13539FTEstado = T01OI13_n13539FTEstado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13539FTEstado", GXutil.str( A13539FTEstado, 1, 0));
         A13540FTMetros = T01OI13_A13540FTMetros[0] ;
         n13540FTMetros = T01OI13_n13540FTMetros[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13540FTMetros", GXutil.ltrimstr( A13540FTMetros, 9, 2));
         A13541FTKilos = T01OI13_A13541FTKilos[0] ;
         n13541FTKilos = T01OI13_n13541FTKilos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13541FTKilos", GXutil.ltrimstr( A13541FTKilos, 9, 2));
         A13542FTPzas = T01OI13_A13542FTPzas[0] ;
         n13542FTPzas = T01OI13_n13542FTPzas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13542FTPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13542FTPzas), 6, 0));
         A13561FTSituacio = T01OI13_A13561FTSituacio[0] ;
         n13561FTSituacio = T01OI13_n13561FTSituacio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13561FTSituacio", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13561FTSituacio), 2, 0));
         A13588FTArticExt = T01OI13_A13588FTArticExt[0] ;
         n13588FTArticExt = T01OI13_n13588FTArticExt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13588FTArticExt", A13588FTArticExt);
         A13589FTHdrExt = T01OI13_A13589FTHdrExt[0] ;
         n13589FTHdrExt = T01OI13_n13589FTHdrExt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13589FTHdrExt", A13589FTHdrExt);
         A13590FTTipo = T01OI13_A13590FTTipo[0] ;
         n13590FTTipo = T01OI13_n13590FTTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13590FTTipo", A13590FTTipo);
         A13591FTObs = T01OI13_A13591FTObs[0] ;
         n13591FTObs = T01OI13_n13591FTObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13591FTObs", A13591FTObs);
         zm1OI1852( -1) ;
      }
      pr_default.close(11);
      onLoadActions1OI1852( ) ;
   }

   public void onLoadActions1OI1852( )
   {
   }

   public void checkExtendedTable1OI1852( )
   {
      nIsDirty_1852 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1OI1852( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1OI1852( )
   {
      /* Using cursor T01OI14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1852 = (short)(1) ;
      }
      else
      {
         RcdFound1852 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01OI11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP});
      if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01OI11_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1OI1852( 1) ;
         RcdFound1852 = (short)(1) ;
         A13528FTHdr = T01OI11_A13528FTHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13528FTHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13528FTHdr), 8, 0));
         A13529FTHdrR = T01OI11_A13529FTHdrR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13529FTHdrR", GXutil.str( A13529FTHdrR, 1, 0));
         A13530FTHdrP = T01OI11_A13530FTHdrP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13530FTHdrP", A13530FTHdrP);
         A13531FTClicod = T01OI11_A13531FTClicod[0] ;
         n13531FTClicod = T01OI11_n13531FTClicod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13531FTClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13531FTClicod), 6, 0));
         A13532FTCliNom = T01OI11_A13532FTCliNom[0] ;
         n13532FTCliNom = T01OI11_n13532FTCliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13532FTCliNom", A13532FTCliNom);
         A13533FTArticulo = T01OI11_A13533FTArticulo[0] ;
         n13533FTArticulo = T01OI11_n13533FTArticulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13533FTArticulo", A13533FTArticulo);
         A13534FTArtDsc = T01OI11_A13534FTArtDsc[0] ;
         n13534FTArtDsc = T01OI11_n13534FTArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13534FTArtDsc", A13534FTArtDsc);
         A13535FTAnc = T01OI11_A13535FTAnc[0] ;
         n13535FTAnc = T01OI11_n13535FTAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13535FTAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13535FTAnc), 3, 0));
         A13536FTGrm2 = T01OI11_A13536FTGrm2[0] ;
         n13536FTGrm2 = T01OI11_n13536FTGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13536FTGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13536FTGrm2), 4, 0));
         A13537FTColor = T01OI11_A13537FTColor[0] ;
         n13537FTColor = T01OI11_n13537FTColor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13537FTColor", A13537FTColor);
         A13538FTColorNum = T01OI11_A13538FTColorNum[0] ;
         n13538FTColorNum = T01OI11_n13538FTColorNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13538FTColorNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13538FTColorNum), 6, 0));
         A13539FTEstado = T01OI11_A13539FTEstado[0] ;
         n13539FTEstado = T01OI11_n13539FTEstado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13539FTEstado", GXutil.str( A13539FTEstado, 1, 0));
         A13540FTMetros = T01OI11_A13540FTMetros[0] ;
         n13540FTMetros = T01OI11_n13540FTMetros[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13540FTMetros", GXutil.ltrimstr( A13540FTMetros, 9, 2));
         A13541FTKilos = T01OI11_A13541FTKilos[0] ;
         n13541FTKilos = T01OI11_n13541FTKilos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13541FTKilos", GXutil.ltrimstr( A13541FTKilos, 9, 2));
         A13542FTPzas = T01OI11_A13542FTPzas[0] ;
         n13542FTPzas = T01OI11_n13542FTPzas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13542FTPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13542FTPzas), 6, 0));
         A13561FTSituacio = T01OI11_A13561FTSituacio[0] ;
         n13561FTSituacio = T01OI11_n13561FTSituacio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13561FTSituacio", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13561FTSituacio), 2, 0));
         A13588FTArticExt = T01OI11_A13588FTArticExt[0] ;
         n13588FTArticExt = T01OI11_n13588FTArticExt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13588FTArticExt", A13588FTArticExt);
         A13589FTHdrExt = T01OI11_A13589FTHdrExt[0] ;
         n13589FTHdrExt = T01OI11_n13589FTHdrExt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13589FTHdrExt", A13589FTHdrExt);
         A13590FTTipo = T01OI11_A13590FTTipo[0] ;
         n13590FTTipo = T01OI11_n13590FTTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13590FTTipo", A13590FTTipo);
         A13591FTObs = T01OI11_A13591FTObs[0] ;
         n13591FTObs = T01OI11_n13591FTObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13591FTObs", A13591FTObs);
         Z396EmprCod = A396EmprCod ;
         Z13528FTHdr = A13528FTHdr ;
         Z13529FTHdrR = A13529FTHdrR ;
         Z13530FTHdrP = A13530FTHdrP ;
         sMode1852 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1OI1852( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1852 = (short)(0) ;
            initializeNonKey1OI1852( ) ;
         }
         Gx_mode = sMode1852 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1852 = (short)(0) ;
         initializeNonKey1OI1852( ) ;
         sMode1852 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1852 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(9);
   }

   public void getEqualNoModal( )
   {
      getKey1OI1852( ) ;
      if ( RcdFound1852 == 0 )
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
      RcdFound1852 = (short)(0) ;
      /* Using cursor T01OI15 */
      pr_default.execute(13, new Object[] {Integer.valueOf(A13528FTHdr), Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), Byte.valueOf(A13529FTHdrR), Integer.valueOf(A13528FTHdr), A13530FTHdrP, A396EmprCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T01OI15_A13528FTHdr[0] < A13528FTHdr ) || ( T01OI15_A13528FTHdr[0] == A13528FTHdr ) && ( T01OI15_A13529FTHdrR[0] < A13529FTHdrR ) || ( T01OI15_A13529FTHdrR[0] == A13529FTHdrR ) && ( T01OI15_A13528FTHdr[0] == A13528FTHdr ) && ( GXutil.strcmp(T01OI15_A13530FTHdrP[0], A13530FTHdrP) < 0 ) ) && ( GXutil.strcmp(T01OI15_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T01OI15_A13528FTHdr[0] > A13528FTHdr ) || ( T01OI15_A13528FTHdr[0] == A13528FTHdr ) && ( T01OI15_A13529FTHdrR[0] > A13529FTHdrR ) || ( T01OI15_A13529FTHdrR[0] == A13529FTHdrR ) && ( T01OI15_A13528FTHdr[0] == A13528FTHdr ) && ( GXutil.strcmp(T01OI15_A13530FTHdrP[0], A13530FTHdrP) > 0 ) ) && ( GXutil.strcmp(T01OI15_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A13528FTHdr = T01OI15_A13528FTHdr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13528FTHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13528FTHdr), 8, 0));
            A13529FTHdrR = T01OI15_A13529FTHdrR[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13529FTHdrR", GXutil.str( A13529FTHdrR, 1, 0));
            A13530FTHdrP = T01OI15_A13530FTHdrP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13530FTHdrP", A13530FTHdrP);
            RcdFound1852 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound1852 = (short)(0) ;
      /* Using cursor T01OI16 */
      pr_default.execute(14, new Object[] {Integer.valueOf(A13528FTHdr), Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), Byte.valueOf(A13529FTHdrR), Integer.valueOf(A13528FTHdr), A13530FTHdrP, A396EmprCod});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( T01OI16_A13528FTHdr[0] > A13528FTHdr ) || ( T01OI16_A13528FTHdr[0] == A13528FTHdr ) && ( T01OI16_A13529FTHdrR[0] > A13529FTHdrR ) || ( T01OI16_A13529FTHdrR[0] == A13529FTHdrR ) && ( T01OI16_A13528FTHdr[0] == A13528FTHdr ) && ( GXutil.strcmp(T01OI16_A13530FTHdrP[0], A13530FTHdrP) > 0 ) ) && ( GXutil.strcmp(T01OI16_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( T01OI16_A13528FTHdr[0] < A13528FTHdr ) || ( T01OI16_A13528FTHdr[0] == A13528FTHdr ) && ( T01OI16_A13529FTHdrR[0] < A13529FTHdrR ) || ( T01OI16_A13529FTHdrR[0] == A13529FTHdrR ) && ( T01OI16_A13528FTHdr[0] == A13528FTHdr ) && ( GXutil.strcmp(T01OI16_A13530FTHdrP[0], A13530FTHdrP) < 0 ) ) && ( GXutil.strcmp(T01OI16_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A13528FTHdr = T01OI16_A13528FTHdr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13528FTHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13528FTHdr), 8, 0));
            A13529FTHdrR = T01OI16_A13529FTHdrR[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13529FTHdrR", GXutil.str( A13529FTHdrR, 1, 0));
            A13530FTHdrP = T01OI16_A13530FTHdrP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13530FTHdrP", A13530FTHdrP);
            RcdFound1852 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1OI1852( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtFTHdr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1OI1852( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1852 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13528FTHdr != Z13528FTHdr ) || ( A13529FTHdrR != Z13529FTHdrR ) || ( GXutil.strcmp(A13530FTHdrP, Z13530FTHdrP) != 0 ) )
            {
               A13528FTHdr = Z13528FTHdr ;
               httpContext.ajax_rsp_assign_attri("", false, "A13528FTHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13528FTHdr), 8, 0));
               A13529FTHdrR = Z13529FTHdrR ;
               httpContext.ajax_rsp_assign_attri("", false, "A13529FTHdrR", GXutil.str( A13529FTHdrR, 1, 0));
               A13530FTHdrP = Z13530FTHdrP ;
               httpContext.ajax_rsp_assign_attri("", false, "A13530FTHdrP", A13530FTHdrP);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtFTHdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1OI1852( ) ;
               GX_FocusControl = edtFTHdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13528FTHdr != Z13528FTHdr ) || ( A13529FTHdrR != Z13529FTHdrR ) || ( GXutil.strcmp(A13530FTHdrP, Z13530FTHdrP) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtFTHdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1OI1852( ) ;
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
                  GX_FocusControl = edtFTHdr_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1OI1852( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13528FTHdr != Z13528FTHdr ) || ( A13529FTHdrR != Z13529FTHdrR ) || ( GXutil.strcmp(A13530FTHdrP, Z13530FTHdrP) != 0 ) )
      {
         A13528FTHdr = Z13528FTHdr ;
         httpContext.ajax_rsp_assign_attri("", false, "A13528FTHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13528FTHdr), 8, 0));
         A13529FTHdrR = Z13529FTHdrR ;
         httpContext.ajax_rsp_assign_attri("", false, "A13529FTHdrR", GXutil.str( A13529FTHdrR, 1, 0));
         A13530FTHdrP = Z13530FTHdrP ;
         httpContext.ajax_rsp_assign_attri("", false, "A13530FTHdrP", A13530FTHdrP);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtFTHdr_Internalname ;
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
      getKey1OI1852( ) ;
      if ( RcdFound1852 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13528FTHdr != Z13528FTHdr ) || ( A13529FTHdrR != Z13529FTHdrR ) || ( GXutil.strcmp(A13530FTHdrP, Z13530FTHdrP) != 0 ) )
         {
            A13528FTHdr = Z13528FTHdr ;
            httpContext.ajax_rsp_assign_attri("", false, "A13528FTHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13528FTHdr), 8, 0));
            A13529FTHdrR = Z13529FTHdrR ;
            httpContext.ajax_rsp_assign_attri("", false, "A13529FTHdrR", GXutil.str( A13529FTHdrR, 1, 0));
            A13530FTHdrP = Z13530FTHdrP ;
            httpContext.ajax_rsp_assign_attri("", false, "A13530FTHdrP", A13530FTHdrP);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13528FTHdr != Z13528FTHdr ) || ( A13529FTHdrR != Z13529FTHdrR ) || ( GXutil.strcmp(A13530FTHdrP, Z13530FTHdrP) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tfrtohd");
      GX_FocusControl = edtFTClicod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1OI0( ) ;
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
      if ( RcdFound1852 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtFTClicod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1OI1852( ) ;
      if ( RcdFound1852 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFTClicod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1OI1852( ) ;
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
      if ( RcdFound1852 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFTClicod_Internalname ;
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
      if ( RcdFound1852 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFTClicod_Internalname ;
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
      scanStart1OI1852( ) ;
      if ( RcdFound1852 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1852 != 0 )
         {
            scanNext1OI1852( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFTClicod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1OI1852( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1OI1852( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01OI10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP});
         if ( (pr_default.getStatus(8) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFRTOHD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(8) == 101) || ( Z13531FTClicod != T01OI10_A13531FTClicod[0] ) || ( GXutil.strcmp(Z13532FTCliNom, T01OI10_A13532FTCliNom[0]) != 0 ) || ( GXutil.strcmp(Z13533FTArticulo, T01OI10_A13533FTArticulo[0]) != 0 ) || ( GXutil.strcmp(Z13534FTArtDsc, T01OI10_A13534FTArtDsc[0]) != 0 ) || ( Z13535FTAnc != T01OI10_A13535FTAnc[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13536FTGrm2 != T01OI10_A13536FTGrm2[0] ) || ( GXutil.strcmp(Z13537FTColor, T01OI10_A13537FTColor[0]) != 0 ) || ( Z13538FTColorNum != T01OI10_A13538FTColorNum[0] ) || ( Z13539FTEstado != T01OI10_A13539FTEstado[0] ) || ( DecimalUtil.compareTo(Z13540FTMetros, T01OI10_A13540FTMetros[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z13541FTKilos, T01OI10_A13541FTKilos[0]) != 0 ) || ( Z13542FTPzas != T01OI10_A13542FTPzas[0] ) || ( Z13561FTSituacio != T01OI10_A13561FTSituacio[0] ) || ( GXutil.strcmp(Z13588FTArticExt, T01OI10_A13588FTArticExt[0]) != 0 ) || ( GXutil.strcmp(Z13589FTHdrExt, T01OI10_A13589FTHdrExt[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13590FTTipo, T01OI10_A13590FTTipo[0]) != 0 ) || ( GXutil.strcmp(Z13591FTObs, T01OI10_A13591FTObs[0]) != 0 ) )
         {
            if ( Z13531FTClicod != T01OI10_A13531FTClicod[0] )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTClicod");
               GXutil.writeLogRaw("Old: ",Z13531FTClicod);
               GXutil.writeLogRaw("Current: ",T01OI10_A13531FTClicod[0]);
            }
            if ( GXutil.strcmp(Z13532FTCliNom, T01OI10_A13532FTCliNom[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTCliNom");
               GXutil.writeLogRaw("Old: ",Z13532FTCliNom);
               GXutil.writeLogRaw("Current: ",T01OI10_A13532FTCliNom[0]);
            }
            if ( GXutil.strcmp(Z13533FTArticulo, T01OI10_A13533FTArticulo[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTArticulo");
               GXutil.writeLogRaw("Old: ",Z13533FTArticulo);
               GXutil.writeLogRaw("Current: ",T01OI10_A13533FTArticulo[0]);
            }
            if ( GXutil.strcmp(Z13534FTArtDsc, T01OI10_A13534FTArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTArtDsc");
               GXutil.writeLogRaw("Old: ",Z13534FTArtDsc);
               GXutil.writeLogRaw("Current: ",T01OI10_A13534FTArtDsc[0]);
            }
            if ( Z13535FTAnc != T01OI10_A13535FTAnc[0] )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTAnc");
               GXutil.writeLogRaw("Old: ",Z13535FTAnc);
               GXutil.writeLogRaw("Current: ",T01OI10_A13535FTAnc[0]);
            }
            if ( Z13536FTGrm2 != T01OI10_A13536FTGrm2[0] )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTGrm2");
               GXutil.writeLogRaw("Old: ",Z13536FTGrm2);
               GXutil.writeLogRaw("Current: ",T01OI10_A13536FTGrm2[0]);
            }
            if ( GXutil.strcmp(Z13537FTColor, T01OI10_A13537FTColor[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTColor");
               GXutil.writeLogRaw("Old: ",Z13537FTColor);
               GXutil.writeLogRaw("Current: ",T01OI10_A13537FTColor[0]);
            }
            if ( Z13538FTColorNum != T01OI10_A13538FTColorNum[0] )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTColorNum");
               GXutil.writeLogRaw("Old: ",Z13538FTColorNum);
               GXutil.writeLogRaw("Current: ",T01OI10_A13538FTColorNum[0]);
            }
            if ( Z13539FTEstado != T01OI10_A13539FTEstado[0] )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTEstado");
               GXutil.writeLogRaw("Old: ",Z13539FTEstado);
               GXutil.writeLogRaw("Current: ",T01OI10_A13539FTEstado[0]);
            }
            if ( DecimalUtil.compareTo(Z13540FTMetros, T01OI10_A13540FTMetros[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTMetros");
               GXutil.writeLogRaw("Old: ",Z13540FTMetros);
               GXutil.writeLogRaw("Current: ",T01OI10_A13540FTMetros[0]);
            }
            if ( DecimalUtil.compareTo(Z13541FTKilos, T01OI10_A13541FTKilos[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTKilos");
               GXutil.writeLogRaw("Old: ",Z13541FTKilos);
               GXutil.writeLogRaw("Current: ",T01OI10_A13541FTKilos[0]);
            }
            if ( Z13542FTPzas != T01OI10_A13542FTPzas[0] )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTPzas");
               GXutil.writeLogRaw("Old: ",Z13542FTPzas);
               GXutil.writeLogRaw("Current: ",T01OI10_A13542FTPzas[0]);
            }
            if ( Z13561FTSituacio != T01OI10_A13561FTSituacio[0] )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTSituacio");
               GXutil.writeLogRaw("Old: ",Z13561FTSituacio);
               GXutil.writeLogRaw("Current: ",T01OI10_A13561FTSituacio[0]);
            }
            if ( GXutil.strcmp(Z13588FTArticExt, T01OI10_A13588FTArticExt[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTArticExt");
               GXutil.writeLogRaw("Old: ",Z13588FTArticExt);
               GXutil.writeLogRaw("Current: ",T01OI10_A13588FTArticExt[0]);
            }
            if ( GXutil.strcmp(Z13589FTHdrExt, T01OI10_A13589FTHdrExt[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTHdrExt");
               GXutil.writeLogRaw("Old: ",Z13589FTHdrExt);
               GXutil.writeLogRaw("Current: ",T01OI10_A13589FTHdrExt[0]);
            }
            if ( GXutil.strcmp(Z13590FTTipo, T01OI10_A13590FTTipo[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTTipo");
               GXutil.writeLogRaw("Old: ",Z13590FTTipo);
               GXutil.writeLogRaw("Current: ",T01OI10_A13590FTTipo[0]);
            }
            if ( GXutil.strcmp(Z13591FTObs, T01OI10_A13591FTObs[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTObs");
               GXutil.writeLogRaw("Old: ",Z13591FTObs);
               GXutil.writeLogRaw("Current: ",T01OI10_A13591FTObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFRTOHD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OI1852( )
   {
      beforeValidate1OI1852( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OI1852( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OI1852( 0) ;
         checkOptimisticConcurrency1OI1852( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OI1852( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OI1852( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OI17 */
                  pr_default.execute(15, new Object[] {Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, Boolean.valueOf(n13531FTClicod), Integer.valueOf(A13531FTClicod), Boolean.valueOf(n13532FTCliNom), A13532FTCliNom, Boolean.valueOf(n13533FTArticulo), A13533FTArticulo, Boolean.valueOf(n13534FTArtDsc), A13534FTArtDsc, Boolean.valueOf(n13535FTAnc), Short.valueOf(A13535FTAnc), Boolean.valueOf(n13536FTGrm2), Short.valueOf(A13536FTGrm2), Boolean.valueOf(n13537FTColor), A13537FTColor, Boolean.valueOf(n13538FTColorNum), Integer.valueOf(A13538FTColorNum), Boolean.valueOf(n13539FTEstado), Byte.valueOf(A13539FTEstado), Boolean.valueOf(n13540FTMetros), A13540FTMetros, Boolean.valueOf(n13541FTKilos), A13541FTKilos, Boolean.valueOf(n13542FTPzas), Integer.valueOf(A13542FTPzas), Boolean.valueOf(n13561FTSituacio), Byte.valueOf(A13561FTSituacio), Boolean.valueOf(n13588FTArticExt), A13588FTArticExt, Boolean.valueOf(n13589FTHdrExt), A13589FTHdrExt, Boolean.valueOf(n13590FTTipo), A13590FTTipo, Boolean.valueOf(n13591FTObs), A13591FTObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFRTOHD");
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
                        processLevel1OI1852( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1OI0( ) ;
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
            load1OI1852( ) ;
         }
         endLevel1OI1852( ) ;
      }
      closeExtendedTableCursors1OI1852( ) ;
   }

   public void update1OI1852( )
   {
      beforeValidate1OI1852( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OI1852( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OI1852( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OI1852( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1OI1852( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OI18 */
                  pr_default.execute(16, new Object[] {Boolean.valueOf(n13531FTClicod), Integer.valueOf(A13531FTClicod), Boolean.valueOf(n13532FTCliNom), A13532FTCliNom, Boolean.valueOf(n13533FTArticulo), A13533FTArticulo, Boolean.valueOf(n13534FTArtDsc), A13534FTArtDsc, Boolean.valueOf(n13535FTAnc), Short.valueOf(A13535FTAnc), Boolean.valueOf(n13536FTGrm2), Short.valueOf(A13536FTGrm2), Boolean.valueOf(n13537FTColor), A13537FTColor, Boolean.valueOf(n13538FTColorNum), Integer.valueOf(A13538FTColorNum), Boolean.valueOf(n13539FTEstado), Byte.valueOf(A13539FTEstado), Boolean.valueOf(n13540FTMetros), A13540FTMetros, Boolean.valueOf(n13541FTKilos), A13541FTKilos, Boolean.valueOf(n13542FTPzas), Integer.valueOf(A13542FTPzas), Boolean.valueOf(n13561FTSituacio), Byte.valueOf(A13561FTSituacio), Boolean.valueOf(n13588FTArticExt), A13588FTArticExt, Boolean.valueOf(n13589FTHdrExt), A13589FTHdrExt, Boolean.valueOf(n13590FTTipo), A13590FTTipo, Boolean.valueOf(n13591FTObs), A13591FTObs, A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFRTOHD");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFRTOHD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1OI1852( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1OI1852( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1OI0( ) ;
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
         endLevel1OI1852( ) ;
      }
      closeExtendedTableCursors1OI1852( ) ;
   }

   public void deferredUpdate1OI1852( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1OI1852( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OI1852( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OI1852( ) ;
         afterConfirm1OI1852( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OI1852( ) ;
            if ( AnyError == 0 )
            {
               scanStart1OI1854( ) ;
               while ( RcdFound1854 != 0 )
               {
                  getByPrimaryKey1OI1854( ) ;
                  delete1OI1854( ) ;
                  scanNext1OI1854( ) ;
               }
               scanEnd1OI1854( ) ;
               scanStart1OI1853( ) ;
               while ( RcdFound1853 != 0 )
               {
                  getByPrimaryKey1OI1853( ) ;
                  delete1OI1853( ) ;
                  scanNext1OI1853( ) ;
               }
               scanEnd1OI1853( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OI19 */
                  pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFRTOHD");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1852 == 0 )
                        {
                           initAll1OI1852( ) ;
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
                        resetCaption1OI0( ) ;
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
      sMode1852 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1OI1852( ) ;
      Gx_mode = sMode1852 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1OI1852( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01OI20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Crudo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void processNestedLevel1OI1860( )
   {
      nGXsfl_130_idx = 0 ;
      while ( nGXsfl_130_idx < nRC_GXsfl_130 )
      {
         readRow1OI1860( ) ;
         if ( ( nRcdExists_1860 != 0 ) || ( nIsMod_1860 != 0 ) )
         {
            standaloneNotModal1OI1860( ) ;
            getKey1OI1860( ) ;
            if ( ( nRcdExists_1860 == 0 ) && ( nRcdDeleted_1860 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1OI1860( ) ;
            }
            else
            {
               if ( RcdFound1860 != 0 )
               {
                  if ( ( nRcdDeleted_1860 != 0 ) && ( nRcdExists_1860 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1OI1860( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1860 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1OI1860( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1860 == 0 )
                  {
                     GXCCtl = "FTCLOTE_" + sGXsfl_130_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFTCLote_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtFTCLote_Internalname, GXutil.rtrim( A13592FTCLote)) ;
         httpContext.changePostValue( edtFTCEmpesa_Internalname, GXutil.rtrim( A13593FTCEmpesa)) ;
         httpContext.changePostValue( edtFTCEmpesaE_Internalname, GXutil.rtrim( A13594FTCEmpesaE)) ;
         httpContext.changePostValue( edtFTCAncho_Internalname, GXutil.ltrim( localUtil.ntoc( A13595FTCAncho, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTCMetros_Internalname, GXutil.ltrim( localUtil.ntoc( A13596FTCMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTCUltLine_Internalname, GXutil.ltrim( localUtil.ntoc( A13597FTCUltLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13592FTCLote_"+sGXsfl_130_idx, GXutil.rtrim( Z13592FTCLote)) ;
         httpContext.changePostValue( "ZT_"+"Z13593FTCEmpesa_"+sGXsfl_130_idx, GXutil.rtrim( Z13593FTCEmpesa)) ;
         httpContext.changePostValue( "ZT_"+"Z13594FTCEmpesaE_"+sGXsfl_130_idx, GXutil.rtrim( Z13594FTCEmpesaE)) ;
         httpContext.changePostValue( "ZT_"+"Z13595FTCAncho_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z13595FTCAncho, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13596FTCMetros_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z13596FTCMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13597FTCUltLine_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z13597FTCUltLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_167_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_167, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1860_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1860, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1860_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1860, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1860_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1860, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1860 != 0 )
         {
            httpContext.changePostValue( "FTCLOTE_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCLote_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTCEMPESA_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCEmpesa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTCEMPESAE_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCEmpesaE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTCANCHO_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCAncho_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTCMETROS_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCMetros_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTCULTLINE_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCUltLine_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1OI1860( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1860 = (short)(0) ;
      nIsMod_1860 = (short)(0) ;
      nRcdDeleted_1860 = (short)(0) ;
   }

   public void processNestedLevel1OI1854( )
   {
      nGXsfl_178_idx = 0 ;
      while ( nGXsfl_178_idx < nRC_GXsfl_178 )
      {
         readRow1OI1854( ) ;
         if ( ( nRcdExists_1854 != 0 ) || ( nIsMod_1854 != 0 ) )
         {
            standaloneNotModal1OI1854( ) ;
            getKey1OI1854( ) ;
            if ( ( nRcdExists_1854 == 0 ) && ( nRcdDeleted_1854 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1OI1854( ) ;
            }
            else
            {
               if ( RcdFound1854 != 0 )
               {
                  if ( ( nRcdDeleted_1854 != 0 ) && ( nRcdExists_1854 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1OI1854( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1854 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1OI1854( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1854 == 0 )
                  {
                     GXCCtl = "FTFPROCESO_" + sGXsfl_178_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFTFProceso_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1854_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1854, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTFProceso_Internalname, GXutil.rtrim( A13548FTFProceso)) ;
         httpContext.changePostValue( edtFTFOrden_Internalname, GXutil.ltrim( localUtil.ntoc( A13549FTFOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTMaquina_Internalname, GXutil.rtrim( A13560FTMaquina)) ;
         httpContext.changePostValue( edtFTFFase_Internalname, GXutil.rtrim( A13550FTFFase)) ;
         httpContext.changePostValue( edtFTFFaseDsc_Internalname, GXutil.rtrim( A13551FTFFaseDsc)) ;
         httpContext.changePostValue( edtFTFEstado_Internalname, GXutil.ltrim( localUtil.ntoc( A13552FTFEstado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTFInicio_Internalname, localUtil.ttoc( A13553FTFInicio, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtFTFFin_Internalname, localUtil.ttoc( A13554FTFFin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtFTFMetros_Internalname, GXutil.ltrim( localUtil.ntoc( A13555FTFMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTTKilos_Internalname, GXutil.ltrim( localUtil.ntoc( A13556FTTKilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13548FTFProceso_"+sGXsfl_178_idx, GXutil.rtrim( Z13548FTFProceso)) ;
         httpContext.changePostValue( "ZT_"+"Z13549FTFOrden_"+sGXsfl_178_idx, GXutil.ltrim( localUtil.ntoc( Z13549FTFOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13560FTMaquina_"+sGXsfl_178_idx, GXutil.rtrim( Z13560FTMaquina)) ;
         httpContext.changePostValue( "ZT_"+"Z13550FTFFase_"+sGXsfl_178_idx, GXutil.rtrim( Z13550FTFFase)) ;
         httpContext.changePostValue( "ZT_"+"Z13551FTFFaseDsc_"+sGXsfl_178_idx, GXutil.rtrim( Z13551FTFFaseDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z13552FTFEstado_"+sGXsfl_178_idx, GXutil.ltrim( localUtil.ntoc( Z13552FTFEstado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13553FTFInicio_"+sGXsfl_178_idx, localUtil.ttoc( Z13553FTFInicio, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z13554FTFFin_"+sGXsfl_178_idx, localUtil.ttoc( Z13554FTFFin, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z13555FTFMetros_"+sGXsfl_178_idx, GXutil.ltrim( localUtil.ntoc( Z13555FTFMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13556FTTKilos_"+sGXsfl_178_idx, GXutil.ltrim( localUtil.ntoc( Z13556FTTKilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1854_"+sGXsfl_178_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1854, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1854_"+sGXsfl_178_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1854, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1854_"+sGXsfl_178_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1854, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1854 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1854_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1854_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTFPROCESO_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFProceso_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTFORDEN_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFOrden_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTMAQUINA_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTMaquina_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTFFASE_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFFase_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTFFASEDSC_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFFaseDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTFESTADO_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFEstado_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTFINICIO_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFInicio_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTFFIN_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFFin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTFMETROS_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFMetros_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTTKILOS_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTTKilos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1OI1854( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1854 = (short)(0) ;
      nIsMod_1854 = (short)(0) ;
      nRcdDeleted_1854 = (short)(0) ;
   }

   public void processNestedLevel1OI1853( )
   {
      nGXsfl_193_idx = 0 ;
      while ( nGXsfl_193_idx < nRC_GXsfl_193 )
      {
         readRow1OI1853( ) ;
         if ( ( nRcdExists_1853 != 0 ) || ( nIsMod_1853 != 0 ) )
         {
            standaloneNotModal1OI1853( ) ;
            getKey1OI1853( ) ;
            if ( ( nRcdExists_1853 == 0 ) && ( nRcdDeleted_1853 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1OI1853( ) ;
            }
            else
            {
               if ( RcdFound1853 != 0 )
               {
                  if ( ( nRcdDeleted_1853 != 0 ) && ( nRcdExists_1853 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1OI1853( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1853 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1OI1853( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1853 == 0 )
                  {
                     GXCCtl = "FTPIEZA_" + sGXsfl_193_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFTPieza_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1853_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1853, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTPieza_Internalname, GXutil.rtrim( A13543FTPieza)) ;
         httpContext.changePostValue( edtFTPMetros_Internalname, GXutil.ltrim( localUtil.ntoc( A13544FTPMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTPKilos_Internalname, GXutil.ltrim( localUtil.ntoc( A13545FTPKilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTPAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A13546FTPAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTPUbicaci_Internalname, GXutil.rtrim( A13547FTPUbicaci)) ;
         httpContext.changePostValue( edtFTPMtsAut_Internalname, GXutil.ltrim( localUtil.ntoc( A13557FTPMtsAut, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTPKgsAut_Internalname, GXutil.ltrim( localUtil.ntoc( A13558FTPKgsAut, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTPPiezaOr_Internalname, GXutil.rtrim( A13559FTPPiezaOr)) ;
         httpContext.changePostValue( "ZT_"+"Z13543FTPieza_"+sGXsfl_193_idx, GXutil.rtrim( Z13543FTPieza)) ;
         httpContext.changePostValue( "ZT_"+"Z13544FTPMetros_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( Z13544FTPMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13545FTPKilos_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( Z13545FTPKilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13546FTPAnc_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( Z13546FTPAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13547FTPUbicaci_"+sGXsfl_193_idx, GXutil.rtrim( Z13547FTPUbicaci)) ;
         httpContext.changePostValue( "ZT_"+"Z13557FTPMtsAut_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( Z13557FTPMtsAut, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13558FTPKgsAut_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( Z13558FTPKgsAut, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13559FTPPiezaOr_"+sGXsfl_193_idx, GXutil.rtrim( Z13559FTPPiezaOr)) ;
         httpContext.changePostValue( "nRcdDeleted_1853_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1853, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1853_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1853, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1853_"+sGXsfl_193_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1853, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1853 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1853_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1853_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTPIEZA_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPieza_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTPMETROS_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPMetros_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTPKILOS_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPKilos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTPANC_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTPUBICACI_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPUbicaci_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTPMTSAUT_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPMtsAut_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTPKGSAUT_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPKgsAut_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTPPIEZAOR_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPPiezaOr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1OI1853( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1853 = (short)(0) ;
      nIsMod_1853 = (short)(0) ;
      nRcdDeleted_1853 = (short)(0) ;
   }

   public void processLevel1OI1852( )
   {
      /* Save parent mode. */
      sMode1852 = Gx_mode ;
      processNestedLevel1OI1860( ) ;
      processNestedLevel1OI1854( ) ;
      processNestedLevel1OI1853( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1852 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1OI1852( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(8);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1OI1852( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tfrtohd");
         if ( AnyError == 0 )
         {
            confirmValues1OI0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tfrtohd");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1OI1852( )
   {
      /* Scan By routine */
      /* Using cursor T01OI21 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      RcdFound1852 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1852 = (short)(1) ;
         A13528FTHdr = T01OI21_A13528FTHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13528FTHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13528FTHdr), 8, 0));
         A13529FTHdrR = T01OI21_A13529FTHdrR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13529FTHdrR", GXutil.str( A13529FTHdrR, 1, 0));
         A13530FTHdrP = T01OI21_A13530FTHdrP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13530FTHdrP", A13530FTHdrP);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1OI1852( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound1852 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1852 = (short)(1) ;
         A13528FTHdr = T01OI21_A13528FTHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13528FTHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13528FTHdr), 8, 0));
         A13529FTHdrR = T01OI21_A13529FTHdrR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13529FTHdrR", GXutil.str( A13529FTHdrR, 1, 0));
         A13530FTHdrP = T01OI21_A13530FTHdrP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13530FTHdrP", A13530FTHdrP);
      }
   }

   public void scanEnd1OI1852( )
   {
      pr_default.close(19);
   }

   public void afterConfirm1OI1852( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1OI1852( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OI1852( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OI1852( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OI1852( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OI1852( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OI1852( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtFTHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTHdr_Enabled), 5, 0), true);
      edtFTHdrR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTHdrR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTHdrR_Enabled), 5, 0), true);
      edtFTHdrP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTHdrP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTHdrP_Enabled), 5, 0), true);
      edtFTClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTClicod_Enabled), 5, 0), true);
      edtFTCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCliNom_Enabled), 5, 0), true);
      edtFTArticulo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTArticulo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTArticulo_Enabled), 5, 0), true);
      edtFTArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTArtDsc_Enabled), 5, 0), true);
      edtFTAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTAnc_Enabled), 5, 0), true);
      edtFTGrm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTGrm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTGrm2_Enabled), 5, 0), true);
      edtFTColor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTColor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTColor_Enabled), 5, 0), true);
      edtFTColorNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTColorNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTColorNum_Enabled), 5, 0), true);
      edtFTEstado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTEstado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTEstado_Enabled), 5, 0), true);
      edtFTMetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTMetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTMetros_Enabled), 5, 0), true);
      edtFTKilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTKilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTKilos_Enabled), 5, 0), true);
      edtFTPzas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTPzas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTPzas_Enabled), 5, 0), true);
      edtFTSituacio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTSituacio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTSituacio_Enabled), 5, 0), true);
      edtFTArticExt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTArticExt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTArticExt_Enabled), 5, 0), true);
      edtFTHdrExt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTHdrExt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTHdrExt_Enabled), 5, 0), true);
      edtFTTipo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTTipo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTTipo_Enabled), 5, 0), true);
      edtFTObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTObs_Enabled), 5, 0), true);
   }

   public void zm1OI1860( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13593FTCEmpesa = T01OI9_A13593FTCEmpesa[0] ;
            Z13594FTCEmpesaE = T01OI9_A13594FTCEmpesaE[0] ;
            Z13595FTCAncho = T01OI9_A13595FTCAncho[0] ;
            Z13596FTCMetros = T01OI9_A13596FTCMetros[0] ;
            Z13597FTCUltLine = T01OI9_A13597FTCUltLine[0] ;
         }
         else
         {
            Z13593FTCEmpesa = A13593FTCEmpesa ;
            Z13594FTCEmpesaE = A13594FTCEmpesaE ;
            Z13595FTCAncho = A13595FTCAncho ;
            Z13596FTCMetros = A13596FTCMetros ;
            Z13597FTCUltLine = A13597FTCUltLine ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z396EmprCod = A396EmprCod ;
         Z13528FTHdr = A13528FTHdr ;
         Z13529FTHdrR = A13529FTHdrR ;
         Z13530FTHdrP = A13530FTHdrP ;
         Z13592FTCLote = A13592FTCLote ;
         Z13593FTCEmpesa = A13593FTCEmpesa ;
         Z13594FTCEmpesaE = A13594FTCEmpesaE ;
         Z13595FTCAncho = A13595FTCAncho ;
         Z13596FTCMetros = A13596FTCMetros ;
         Z13597FTCUltLine = A13597FTCUltLine ;
      }
   }

   public void standaloneNotModal1OI1860( )
   {
   }

   public void standaloneModal1OI1860( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtFTCLote_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFTCLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCLote_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      }
      else
      {
         edtFTCLote_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFTCLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCLote_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      }
   }

   public void load1OI1860( )
   {
      /* Using cursor T01OI22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13592FTCLote});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1860 = (short)(1) ;
         A13593FTCEmpesa = T01OI22_A13593FTCEmpesa[0] ;
         n13593FTCEmpesa = T01OI22_n13593FTCEmpesa[0] ;
         A13594FTCEmpesaE = T01OI22_A13594FTCEmpesaE[0] ;
         n13594FTCEmpesaE = T01OI22_n13594FTCEmpesaE[0] ;
         A13595FTCAncho = T01OI22_A13595FTCAncho[0] ;
         n13595FTCAncho = T01OI22_n13595FTCAncho[0] ;
         A13596FTCMetros = T01OI22_A13596FTCMetros[0] ;
         n13596FTCMetros = T01OI22_n13596FTCMetros[0] ;
         A13597FTCUltLine = T01OI22_A13597FTCUltLine[0] ;
         n13597FTCUltLine = T01OI22_n13597FTCUltLine[0] ;
         zm1OI1860( -3) ;
      }
      pr_default.close(20);
      onLoadActions1OI1860( ) ;
   }

   public void onLoadActions1OI1860( )
   {
   }

   public void checkExtendedTable1OI1860( )
   {
      nIsDirty_1860 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1OI1860( ) ;
   }

   public void closeExtendedTableCursors1OI1860( )
   {
   }

   public void enableDisable1OI1860( )
   {
   }

   public void getKey1OI1860( )
   {
      /* Using cursor T01OI23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13592FTCLote});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1860 = (short)(1) ;
      }
      else
      {
         RcdFound1860 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKey1OI1860( )
   {
      /* Using cursor T01OI9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13592FTCLote});
      if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01OI9_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1OI1860( 3) ;
         RcdFound1860 = (short)(1) ;
         initializeNonKey1OI1860( ) ;
         A13592FTCLote = T01OI9_A13592FTCLote[0] ;
         A13593FTCEmpesa = T01OI9_A13593FTCEmpesa[0] ;
         n13593FTCEmpesa = T01OI9_n13593FTCEmpesa[0] ;
         A13594FTCEmpesaE = T01OI9_A13594FTCEmpesaE[0] ;
         n13594FTCEmpesaE = T01OI9_n13594FTCEmpesaE[0] ;
         A13595FTCAncho = T01OI9_A13595FTCAncho[0] ;
         n13595FTCAncho = T01OI9_n13595FTCAncho[0] ;
         A13596FTCMetros = T01OI9_A13596FTCMetros[0] ;
         n13596FTCMetros = T01OI9_n13596FTCMetros[0] ;
         A13597FTCUltLine = T01OI9_A13597FTCUltLine[0] ;
         n13597FTCUltLine = T01OI9_n13597FTCUltLine[0] ;
         Z396EmprCod = A396EmprCod ;
         Z13528FTHdr = A13528FTHdr ;
         Z13529FTHdrR = A13529FTHdrR ;
         Z13530FTHdrP = A13530FTHdrP ;
         Z13592FTCLote = A13592FTCLote ;
         sMode1860 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1OI1860( ) ;
         load1OI1860( ) ;
         Gx_mode = sMode1860 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1860 = (short)(0) ;
         initializeNonKey1OI1860( ) ;
         sMode1860 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1OI1860( ) ;
         Gx_mode = sMode1860 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1OI1860( ) ;
      }
      pr_default.close(7);
   }

   public void checkOptimisticConcurrency1OI1860( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01OI8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13592FTCLote});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFRTOH3"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(6) == 101) || ( GXutil.strcmp(Z13593FTCEmpesa, T01OI8_A13593FTCEmpesa[0]) != 0 ) || ( GXutil.strcmp(Z13594FTCEmpesaE, T01OI8_A13594FTCEmpesaE[0]) != 0 ) || ( Z13595FTCAncho != T01OI8_A13595FTCAncho[0] ) || ( DecimalUtil.compareTo(Z13596FTCMetros, T01OI8_A13596FTCMetros[0]) != 0 ) || ( Z13597FTCUltLine != T01OI8_A13597FTCUltLine[0] ) )
         {
            if ( GXutil.strcmp(Z13593FTCEmpesa, T01OI8_A13593FTCEmpesa[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTCEmpesa");
               GXutil.writeLogRaw("Old: ",Z13593FTCEmpesa);
               GXutil.writeLogRaw("Current: ",T01OI8_A13593FTCEmpesa[0]);
            }
            if ( GXutil.strcmp(Z13594FTCEmpesaE, T01OI8_A13594FTCEmpesaE[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTCEmpesaE");
               GXutil.writeLogRaw("Old: ",Z13594FTCEmpesaE);
               GXutil.writeLogRaw("Current: ",T01OI8_A13594FTCEmpesaE[0]);
            }
            if ( Z13595FTCAncho != T01OI8_A13595FTCAncho[0] )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTCAncho");
               GXutil.writeLogRaw("Old: ",Z13595FTCAncho);
               GXutil.writeLogRaw("Current: ",T01OI8_A13595FTCAncho[0]);
            }
            if ( DecimalUtil.compareTo(Z13596FTCMetros, T01OI8_A13596FTCMetros[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTCMetros");
               GXutil.writeLogRaw("Old: ",Z13596FTCMetros);
               GXutil.writeLogRaw("Current: ",T01OI8_A13596FTCMetros[0]);
            }
            if ( Z13597FTCUltLine != T01OI8_A13597FTCUltLine[0] )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTCUltLine");
               GXutil.writeLogRaw("Old: ",Z13597FTCUltLine);
               GXutil.writeLogRaw("Current: ",T01OI8_A13597FTCUltLine[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFRTOH3"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OI1860( )
   {
      beforeValidate1OI1860( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OI1860( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OI1860( 0) ;
         checkOptimisticConcurrency1OI1860( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OI1860( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OI1860( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OI24 */
                  pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13592FTCLote, Boolean.valueOf(n13593FTCEmpesa), A13593FTCEmpesa, Boolean.valueOf(n13594FTCEmpesaE), A13594FTCEmpesaE, Boolean.valueOf(n13595FTCAncho), Short.valueOf(A13595FTCAncho), Boolean.valueOf(n13596FTCMetros), A13596FTCMetros, Boolean.valueOf(n13597FTCUltLine), Short.valueOf(A13597FTCUltLine)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFRTOH3");
                  if ( (pr_default.getStatus(22) == 1) )
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
                        processLevel1OI1860( ) ;
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
            load1OI1860( ) ;
         }
         endLevel1OI1860( ) ;
      }
      closeExtendedTableCursors1OI1860( ) ;
   }

   public void update1OI1860( )
   {
      beforeValidate1OI1860( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OI1860( ) ;
      }
      if ( ( nIsMod_1860 != 0 ) || ( nIsDirty_1860 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1OI1860( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1OI1860( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1OI1860( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01OI25 */
                     pr_default.execute(23, new Object[] {Boolean.valueOf(n13593FTCEmpesa), A13593FTCEmpesa, Boolean.valueOf(n13594FTCEmpesaE), A13594FTCEmpesaE, Boolean.valueOf(n13595FTCAncho), Short.valueOf(A13595FTCAncho), Boolean.valueOf(n13596FTCMetros), A13596FTCMetros, Boolean.valueOf(n13597FTCUltLine), Short.valueOf(A13597FTCUltLine), A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13592FTCLote});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFRTOH3");
                     if ( (pr_default.getStatus(23) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFRTOH3"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1OI1860( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel1OI1860( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey1OI1860( ) ;
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
            endLevel1OI1860( ) ;
         }
      }
      closeExtendedTableCursors1OI1860( ) ;
   }

   public void deferredUpdate1OI1860( )
   {
   }

   public void delete1OI1860( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1OI1860( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OI1860( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OI1860( ) ;
         afterConfirm1OI1860( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OI1860( ) ;
            if ( AnyError == 0 )
            {
               scanStart1OI1861( ) ;
               while ( RcdFound1861 != 0 )
               {
                  getByPrimaryKey1OI1861( ) ;
                  delete1OI1861( ) ;
                  scanNext1OI1861( ) ;
               }
               scanEnd1OI1861( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OI26 */
                  pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13592FTCLote});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFRTOH3");
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
      sMode1860 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1OI1860( ) ;
      Gx_mode = sMode1860 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1OI1860( )
   {
      standaloneModal1OI1860( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1OI1861( )
   {
      nGXsfl_167_idx = 0 ;
      while ( nGXsfl_167_idx < nRC_GXsfl_167 )
      {
         readRow1OI1861( ) ;
         if ( ( nRcdExists_1861 != 0 ) || ( nIsMod_1861 != 0 ) )
         {
            standaloneNotModal1OI1861( ) ;
            getKey1OI1861( ) ;
            if ( ( nRcdExists_1861 == 0 ) && ( nRcdDeleted_1861 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1OI1861( ) ;
            }
            else
            {
               if ( RcdFound1861 != 0 )
               {
                  if ( ( nRcdDeleted_1861 != 0 ) && ( nRcdExists_1861 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1OI1861( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1861 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1OI1861( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1861 == 0 )
                  {
                     GXCCtl = "FTCLOTE_" + sGXsfl_130_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFTCLote_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1861_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1861, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTCLinea_Internalname, GXutil.ltrim( localUtil.ntoc( A13598FTCLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTCPresen_Internalname, GXutil.rtrim( A13599FTCPresen)) ;
         httpContext.changePostValue( edtFTCLong_Internalname, GXutil.ltrim( localUtil.ntoc( A13600FTCLong, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTCLMts_Internalname, GXutil.ltrim( localUtil.ntoc( A13601FTCLMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFTCLObs_Internalname, GXutil.rtrim( A13602FTCLObs)) ;
         httpContext.changePostValue( edtFTCLEtique_Internalname, GXutil.rtrim( A13603FTCLEtique)) ;
         httpContext.changePostValue( "ZT_"+"Z13598FTCLinea_"+sGXsfl_167_idx, GXutil.ltrim( localUtil.ntoc( Z13598FTCLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13599FTCPresen_"+sGXsfl_167_idx, GXutil.rtrim( Z13599FTCPresen)) ;
         httpContext.changePostValue( "ZT_"+"Z13600FTCLong_"+sGXsfl_167_idx, GXutil.ltrim( localUtil.ntoc( Z13600FTCLong, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13601FTCLMts_"+sGXsfl_167_idx, GXutil.ltrim( localUtil.ntoc( Z13601FTCLMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13602FTCLObs_"+sGXsfl_167_idx, GXutil.rtrim( Z13602FTCLObs)) ;
         httpContext.changePostValue( "ZT_"+"Z13603FTCLEtique_"+sGXsfl_167_idx, GXutil.rtrim( Z13603FTCLEtique)) ;
         httpContext.changePostValue( "nRcdDeleted_1861_"+sGXsfl_167_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1861, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1861_"+sGXsfl_167_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1861, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1861_"+sGXsfl_167_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1861, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1861 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1861_"+sGXsfl_167_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1861_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTCLINEA_"+sGXsfl_167_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCLinea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTCPRESEN_"+sGXsfl_167_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCPresen_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTCLONG_"+sGXsfl_167_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCLong_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTCLMTS_"+sGXsfl_167_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCLMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTCLOBS_"+sGXsfl_167_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCLObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FTCLETIQUE_"+sGXsfl_167_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCLEtique_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1OI1861( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1861 = (short)(0) ;
      nIsMod_1861 = (short)(0) ;
      nRcdDeleted_1861 = (short)(0) ;
   }

   public void processLevel1OI1860( )
   {
      /* Save parent mode. */
      sMode1860 = Gx_mode ;
      processNestedLevel1OI1861( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1860 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1OI1860( )
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

   public void scanStart1OI1860( )
   {
      /* Scan By routine */
      /* Using cursor T01OI27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP});
      RcdFound1860 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1860 = (short)(1) ;
         A13592FTCLote = T01OI27_A13592FTCLote[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1OI1860( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound1860 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1860 = (short)(1) ;
         A13592FTCLote = T01OI27_A13592FTCLote[0] ;
      }
   }

   public void scanEnd1OI1860( )
   {
      pr_default.close(25);
   }

   public void afterConfirm1OI1860( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1OI1860( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OI1860( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OI1860( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OI1860( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OI1860( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OI1860( )
   {
      edtFTCLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTCLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCLote_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      edtFTCEmpesa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTCEmpesa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCEmpesa_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      edtFTCEmpesaE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTCEmpesaE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCEmpesaE_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      edtFTCAncho_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTCAncho_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCAncho_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      edtFTCMetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTCMetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCMetros_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      edtFTCUltLine_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTCUltLine_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCUltLine_Enabled), 5, 0), !bGXsfl_130_Refreshing);
   }

   public void zm1OI1861( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13599FTCPresen = T01OI7_A13599FTCPresen[0] ;
            Z13600FTCLong = T01OI7_A13600FTCLong[0] ;
            Z13601FTCLMts = T01OI7_A13601FTCLMts[0] ;
            Z13602FTCLObs = T01OI7_A13602FTCLObs[0] ;
            Z13603FTCLEtique = T01OI7_A13603FTCLEtique[0] ;
         }
         else
         {
            Z13599FTCPresen = A13599FTCPresen ;
            Z13600FTCLong = A13600FTCLong ;
            Z13601FTCLMts = A13601FTCLMts ;
            Z13602FTCLObs = A13602FTCLObs ;
            Z13603FTCLEtique = A13603FTCLEtique ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z396EmprCod = A396EmprCod ;
         Z13528FTHdr = A13528FTHdr ;
         Z13529FTHdrR = A13529FTHdrR ;
         Z13530FTHdrP = A13530FTHdrP ;
         Z13592FTCLote = A13592FTCLote ;
         Z13598FTCLinea = A13598FTCLinea ;
         Z13599FTCPresen = A13599FTCPresen ;
         Z13600FTCLong = A13600FTCLong ;
         Z13601FTCLMts = A13601FTCLMts ;
         Z13602FTCLObs = A13602FTCLObs ;
         Z13603FTCLEtique = A13603FTCLEtique ;
      }
   }

   public void standaloneNotModal1OI1861( )
   {
   }

   public void standaloneModal1OI1861( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtFTCLinea_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFTCLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCLinea_Enabled), 5, 0), !bGXsfl_167_Refreshing);
      }
      else
      {
         edtFTCLinea_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFTCLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCLinea_Enabled), 5, 0), !bGXsfl_167_Refreshing);
      }
   }

   public void load1OI1861( )
   {
      /* Using cursor T01OI28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13592FTCLote, Short.valueOf(A13598FTCLinea)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1861 = (short)(1) ;
         A13599FTCPresen = T01OI28_A13599FTCPresen[0] ;
         n13599FTCPresen = T01OI28_n13599FTCPresen[0] ;
         A13600FTCLong = T01OI28_A13600FTCLong[0] ;
         n13600FTCLong = T01OI28_n13600FTCLong[0] ;
         A13601FTCLMts = T01OI28_A13601FTCLMts[0] ;
         n13601FTCLMts = T01OI28_n13601FTCLMts[0] ;
         A13602FTCLObs = T01OI28_A13602FTCLObs[0] ;
         n13602FTCLObs = T01OI28_n13602FTCLObs[0] ;
         A13603FTCLEtique = T01OI28_A13603FTCLEtique[0] ;
         n13603FTCLEtique = T01OI28_n13603FTCLEtique[0] ;
         zm1OI1861( -4) ;
      }
      pr_default.close(26);
      onLoadActions1OI1861( ) ;
   }

   public void onLoadActions1OI1861( )
   {
   }

   public void checkExtendedTable1OI1861( )
   {
      nIsDirty_1861 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1OI1861( ) ;
   }

   public void closeExtendedTableCursors1OI1861( )
   {
   }

   public void enableDisable1OI1861( )
   {
   }

   public void getKey1OI1861( )
   {
      /* Using cursor T01OI29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13592FTCLote, Short.valueOf(A13598FTCLinea)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1861 = (short)(1) ;
      }
      else
      {
         RcdFound1861 = (short)(0) ;
      }
      pr_default.close(27);
   }

   public void getByPrimaryKey1OI1861( )
   {
      /* Using cursor T01OI7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13592FTCLote, Short.valueOf(A13598FTCLinea)});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T01OI7_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1OI1861( 4) ;
         RcdFound1861 = (short)(1) ;
         initializeNonKey1OI1861( ) ;
         A13598FTCLinea = T01OI7_A13598FTCLinea[0] ;
         A13599FTCPresen = T01OI7_A13599FTCPresen[0] ;
         n13599FTCPresen = T01OI7_n13599FTCPresen[0] ;
         A13600FTCLong = T01OI7_A13600FTCLong[0] ;
         n13600FTCLong = T01OI7_n13600FTCLong[0] ;
         A13601FTCLMts = T01OI7_A13601FTCLMts[0] ;
         n13601FTCLMts = T01OI7_n13601FTCLMts[0] ;
         A13602FTCLObs = T01OI7_A13602FTCLObs[0] ;
         n13602FTCLObs = T01OI7_n13602FTCLObs[0] ;
         A13603FTCLEtique = T01OI7_A13603FTCLEtique[0] ;
         n13603FTCLEtique = T01OI7_n13603FTCLEtique[0] ;
         Z396EmprCod = A396EmprCod ;
         Z13528FTHdr = A13528FTHdr ;
         Z13529FTHdrR = A13529FTHdrR ;
         Z13530FTHdrP = A13530FTHdrP ;
         Z13592FTCLote = A13592FTCLote ;
         Z13598FTCLinea = A13598FTCLinea ;
         sMode1861 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1OI1861( ) ;
         load1OI1861( ) ;
         Gx_mode = sMode1861 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1861 = (short)(0) ;
         initializeNonKey1OI1861( ) ;
         sMode1861 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1OI1861( ) ;
         Gx_mode = sMode1861 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1OI1861( ) ;
      }
      pr_default.close(5);
   }

   public void checkOptimisticConcurrency1OI1861( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01OI6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13592FTCLote, Short.valueOf(A13598FTCLinea)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFRTOH4"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( GXutil.strcmp(Z13599FTCPresen, T01OI6_A13599FTCPresen[0]) != 0 ) || ( Z13600FTCLong != T01OI6_A13600FTCLong[0] ) || ( DecimalUtil.compareTo(Z13601FTCLMts, T01OI6_A13601FTCLMts[0]) != 0 ) || ( GXutil.strcmp(Z13602FTCLObs, T01OI6_A13602FTCLObs[0]) != 0 ) || ( GXutil.strcmp(Z13603FTCLEtique, T01OI6_A13603FTCLEtique[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z13599FTCPresen, T01OI6_A13599FTCPresen[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTCPresen");
               GXutil.writeLogRaw("Old: ",Z13599FTCPresen);
               GXutil.writeLogRaw("Current: ",T01OI6_A13599FTCPresen[0]);
            }
            if ( Z13600FTCLong != T01OI6_A13600FTCLong[0] )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTCLong");
               GXutil.writeLogRaw("Old: ",Z13600FTCLong);
               GXutil.writeLogRaw("Current: ",T01OI6_A13600FTCLong[0]);
            }
            if ( DecimalUtil.compareTo(Z13601FTCLMts, T01OI6_A13601FTCLMts[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTCLMts");
               GXutil.writeLogRaw("Old: ",Z13601FTCLMts);
               GXutil.writeLogRaw("Current: ",T01OI6_A13601FTCLMts[0]);
            }
            if ( GXutil.strcmp(Z13602FTCLObs, T01OI6_A13602FTCLObs[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTCLObs");
               GXutil.writeLogRaw("Old: ",Z13602FTCLObs);
               GXutil.writeLogRaw("Current: ",T01OI6_A13602FTCLObs[0]);
            }
            if ( GXutil.strcmp(Z13603FTCLEtique, T01OI6_A13603FTCLEtique[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTCLEtique");
               GXutil.writeLogRaw("Old: ",Z13603FTCLEtique);
               GXutil.writeLogRaw("Current: ",T01OI6_A13603FTCLEtique[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFRTOH4"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OI1861( )
   {
      beforeValidate1OI1861( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OI1861( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OI1861( 0) ;
         checkOptimisticConcurrency1OI1861( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OI1861( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OI1861( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OI30 */
                  pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13592FTCLote, Short.valueOf(A13598FTCLinea), Boolean.valueOf(n13599FTCPresen), A13599FTCPresen, Boolean.valueOf(n13600FTCLong), Short.valueOf(A13600FTCLong), Boolean.valueOf(n13601FTCLMts), A13601FTCLMts, Boolean.valueOf(n13602FTCLObs), A13602FTCLObs, Boolean.valueOf(n13603FTCLEtique), A13603FTCLEtique});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFRTOH4");
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
            load1OI1861( ) ;
         }
         endLevel1OI1861( ) ;
      }
      closeExtendedTableCursors1OI1861( ) ;
   }

   public void update1OI1861( )
   {
      beforeValidate1OI1861( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OI1861( ) ;
      }
      if ( ( nIsMod_1861 != 0 ) || ( nIsDirty_1861 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1OI1861( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1OI1861( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1OI1861( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01OI31 */
                     pr_default.execute(29, new Object[] {Boolean.valueOf(n13599FTCPresen), A13599FTCPresen, Boolean.valueOf(n13600FTCLong), Short.valueOf(A13600FTCLong), Boolean.valueOf(n13601FTCLMts), A13601FTCLMts, Boolean.valueOf(n13602FTCLObs), A13602FTCLObs, Boolean.valueOf(n13603FTCLEtique), A13603FTCLEtique, A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13592FTCLote, Short.valueOf(A13598FTCLinea)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFRTOH4");
                     if ( (pr_default.getStatus(29) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFRTOH4"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1OI1861( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1OI1861( ) ;
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
            endLevel1OI1861( ) ;
         }
      }
      closeExtendedTableCursors1OI1861( ) ;
   }

   public void deferredUpdate1OI1861( )
   {
   }

   public void delete1OI1861( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1OI1861( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OI1861( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OI1861( ) ;
         afterConfirm1OI1861( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OI1861( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01OI32 */
               pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13592FTCLote, Short.valueOf(A13598FTCLinea)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFRTOH4");
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
      sMode1861 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1OI1861( ) ;
      Gx_mode = sMode1861 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1OI1861( )
   {
      standaloneModal1OI1861( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1OI1861( )
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

   public void scanStart1OI1861( )
   {
      /* Scan By routine */
      /* Using cursor T01OI33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13592FTCLote});
      RcdFound1861 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1861 = (short)(1) ;
         A13598FTCLinea = T01OI33_A13598FTCLinea[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1OI1861( )
   {
      /* Scan next routine */
      pr_default.readNext(31);
      RcdFound1861 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1861 = (short)(1) ;
         A13598FTCLinea = T01OI33_A13598FTCLinea[0] ;
      }
   }

   public void scanEnd1OI1861( )
   {
      pr_default.close(31);
   }

   public void afterConfirm1OI1861( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1OI1861( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OI1861( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OI1861( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OI1861( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OI1861( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OI1861( )
   {
      edtFTCLinea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTCLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCLinea_Enabled), 5, 0), !bGXsfl_167_Refreshing);
      edtFTCPresen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTCPresen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCPresen_Enabled), 5, 0), !bGXsfl_167_Refreshing);
      edtFTCLong_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTCLong_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCLong_Enabled), 5, 0), !bGXsfl_167_Refreshing);
      edtFTCLMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTCLMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCLMts_Enabled), 5, 0), !bGXsfl_167_Refreshing);
      edtFTCLObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTCLObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCLObs_Enabled), 5, 0), !bGXsfl_167_Refreshing);
      edtFTCLEtique_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTCLEtique_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCLEtique_Enabled), 5, 0), !bGXsfl_167_Refreshing);
   }

   public void send_integrity_lvl_hashes1OI1861( )
   {
   }

   public void send_integrity_lvl_hashes1OI1860( )
   {
   }

   public void zm1OI1854( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13560FTMaquina = T01OI5_A13560FTMaquina[0] ;
            Z13550FTFFase = T01OI5_A13550FTFFase[0] ;
            Z13551FTFFaseDsc = T01OI5_A13551FTFFaseDsc[0] ;
            Z13552FTFEstado = T01OI5_A13552FTFEstado[0] ;
            Z13553FTFInicio = T01OI5_A13553FTFInicio[0] ;
            Z13554FTFFin = T01OI5_A13554FTFFin[0] ;
            Z13555FTFMetros = T01OI5_A13555FTFMetros[0] ;
            Z13556FTTKilos = T01OI5_A13556FTTKilos[0] ;
         }
         else
         {
            Z13560FTMaquina = A13560FTMaquina ;
            Z13550FTFFase = A13550FTFFase ;
            Z13551FTFFaseDsc = A13551FTFFaseDsc ;
            Z13552FTFEstado = A13552FTFEstado ;
            Z13553FTFInicio = A13553FTFInicio ;
            Z13554FTFFin = A13554FTFFin ;
            Z13555FTFMetros = A13555FTFMetros ;
            Z13556FTTKilos = A13556FTTKilos ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z396EmprCod = A396EmprCod ;
         Z13528FTHdr = A13528FTHdr ;
         Z13529FTHdrR = A13529FTHdrR ;
         Z13530FTHdrP = A13530FTHdrP ;
         Z13548FTFProceso = A13548FTFProceso ;
         Z13549FTFOrden = A13549FTFOrden ;
         Z13560FTMaquina = A13560FTMaquina ;
         Z13550FTFFase = A13550FTFFase ;
         Z13551FTFFaseDsc = A13551FTFFaseDsc ;
         Z13552FTFEstado = A13552FTFEstado ;
         Z13553FTFInicio = A13553FTFInicio ;
         Z13554FTFFin = A13554FTFFin ;
         Z13555FTFMetros = A13555FTFMetros ;
         Z13556FTTKilos = A13556FTTKilos ;
      }
   }

   public void standaloneNotModal1OI1854( )
   {
   }

   public void standaloneModal1OI1854( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtFTFProceso_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFTFProceso_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTFProceso_Enabled), 5, 0), !bGXsfl_178_Refreshing);
      }
      else
      {
         edtFTFProceso_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFTFProceso_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTFProceso_Enabled), 5, 0), !bGXsfl_178_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtFTFOrden_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFTFOrden_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTFOrden_Enabled), 5, 0), !bGXsfl_178_Refreshing);
      }
      else
      {
         edtFTFOrden_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFTFOrden_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTFOrden_Enabled), 5, 0), !bGXsfl_178_Refreshing);
      }
   }

   public void load1OI1854( )
   {
      /* Using cursor T01OI34 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13548FTFProceso, Short.valueOf(A13549FTFOrden)});
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound1854 = (short)(1) ;
         A13560FTMaquina = T01OI34_A13560FTMaquina[0] ;
         n13560FTMaquina = T01OI34_n13560FTMaquina[0] ;
         A13550FTFFase = T01OI34_A13550FTFFase[0] ;
         n13550FTFFase = T01OI34_n13550FTFFase[0] ;
         A13551FTFFaseDsc = T01OI34_A13551FTFFaseDsc[0] ;
         n13551FTFFaseDsc = T01OI34_n13551FTFFaseDsc[0] ;
         A13552FTFEstado = T01OI34_A13552FTFEstado[0] ;
         n13552FTFEstado = T01OI34_n13552FTFEstado[0] ;
         A13553FTFInicio = T01OI34_A13553FTFInicio[0] ;
         n13553FTFInicio = T01OI34_n13553FTFInicio[0] ;
         A13554FTFFin = T01OI34_A13554FTFFin[0] ;
         n13554FTFFin = T01OI34_n13554FTFFin[0] ;
         A13555FTFMetros = T01OI34_A13555FTFMetros[0] ;
         n13555FTFMetros = T01OI34_n13555FTFMetros[0] ;
         A13556FTTKilos = T01OI34_A13556FTTKilos[0] ;
         n13556FTTKilos = T01OI34_n13556FTTKilos[0] ;
         zm1OI1854( -5) ;
      }
      pr_default.close(32);
      onLoadActions1OI1854( ) ;
   }

   public void onLoadActions1OI1854( )
   {
   }

   public void checkExtendedTable1OI1854( )
   {
      nIsDirty_1854 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1OI1854( ) ;
   }

   public void closeExtendedTableCursors1OI1854( )
   {
   }

   public void enableDisable1OI1854( )
   {
   }

   public void getKey1OI1854( )
   {
      /* Using cursor T01OI35 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13548FTFProceso, Short.valueOf(A13549FTFOrden)});
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound1854 = (short)(1) ;
      }
      else
      {
         RcdFound1854 = (short)(0) ;
      }
      pr_default.close(33);
   }

   public void getByPrimaryKey1OI1854( )
   {
      /* Using cursor T01OI5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13548FTFProceso, Short.valueOf(A13549FTFOrden)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01OI5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1OI1854( 5) ;
         RcdFound1854 = (short)(1) ;
         initializeNonKey1OI1854( ) ;
         A13548FTFProceso = T01OI5_A13548FTFProceso[0] ;
         A13549FTFOrden = T01OI5_A13549FTFOrden[0] ;
         A13560FTMaquina = T01OI5_A13560FTMaquina[0] ;
         n13560FTMaquina = T01OI5_n13560FTMaquina[0] ;
         A13550FTFFase = T01OI5_A13550FTFFase[0] ;
         n13550FTFFase = T01OI5_n13550FTFFase[0] ;
         A13551FTFFaseDsc = T01OI5_A13551FTFFaseDsc[0] ;
         n13551FTFFaseDsc = T01OI5_n13551FTFFaseDsc[0] ;
         A13552FTFEstado = T01OI5_A13552FTFEstado[0] ;
         n13552FTFEstado = T01OI5_n13552FTFEstado[0] ;
         A13553FTFInicio = T01OI5_A13553FTFInicio[0] ;
         n13553FTFInicio = T01OI5_n13553FTFInicio[0] ;
         A13554FTFFin = T01OI5_A13554FTFFin[0] ;
         n13554FTFFin = T01OI5_n13554FTFFin[0] ;
         A13555FTFMetros = T01OI5_A13555FTFMetros[0] ;
         n13555FTFMetros = T01OI5_n13555FTFMetros[0] ;
         A13556FTTKilos = T01OI5_A13556FTTKilos[0] ;
         n13556FTTKilos = T01OI5_n13556FTTKilos[0] ;
         Z396EmprCod = A396EmprCod ;
         Z13528FTHdr = A13528FTHdr ;
         Z13529FTHdrR = A13529FTHdrR ;
         Z13530FTHdrP = A13530FTHdrP ;
         Z13548FTFProceso = A13548FTFProceso ;
         Z13549FTFOrden = A13549FTFOrden ;
         sMode1854 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1OI1854( ) ;
         load1OI1854( ) ;
         Gx_mode = sMode1854 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1854 = (short)(0) ;
         initializeNonKey1OI1854( ) ;
         sMode1854 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1OI1854( ) ;
         Gx_mode = sMode1854 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1OI1854( ) ;
      }
      pr_default.close(3);
   }

   public void checkOptimisticConcurrency1OI1854( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01OI4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13548FTFProceso, Short.valueOf(A13549FTFOrden)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFRTOH2"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z13560FTMaquina, T01OI4_A13560FTMaquina[0]) != 0 ) || ( GXutil.strcmp(Z13550FTFFase, T01OI4_A13550FTFFase[0]) != 0 ) || ( GXutil.strcmp(Z13551FTFFaseDsc, T01OI4_A13551FTFFaseDsc[0]) != 0 ) || ( Z13552FTFEstado != T01OI4_A13552FTFEstado[0] ) || !( GXutil.dateCompare(Z13553FTFInicio, T01OI4_A13553FTFInicio[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z13554FTFFin, T01OI4_A13554FTFFin[0]) ) || ( DecimalUtil.compareTo(Z13555FTFMetros, T01OI4_A13555FTFMetros[0]) != 0 ) || ( DecimalUtil.compareTo(Z13556FTTKilos, T01OI4_A13556FTTKilos[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z13560FTMaquina, T01OI4_A13560FTMaquina[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTMaquina");
               GXutil.writeLogRaw("Old: ",Z13560FTMaquina);
               GXutil.writeLogRaw("Current: ",T01OI4_A13560FTMaquina[0]);
            }
            if ( GXutil.strcmp(Z13550FTFFase, T01OI4_A13550FTFFase[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTFFase");
               GXutil.writeLogRaw("Old: ",Z13550FTFFase);
               GXutil.writeLogRaw("Current: ",T01OI4_A13550FTFFase[0]);
            }
            if ( GXutil.strcmp(Z13551FTFFaseDsc, T01OI4_A13551FTFFaseDsc[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTFFaseDsc");
               GXutil.writeLogRaw("Old: ",Z13551FTFFaseDsc);
               GXutil.writeLogRaw("Current: ",T01OI4_A13551FTFFaseDsc[0]);
            }
            if ( Z13552FTFEstado != T01OI4_A13552FTFEstado[0] )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTFEstado");
               GXutil.writeLogRaw("Old: ",Z13552FTFEstado);
               GXutil.writeLogRaw("Current: ",T01OI4_A13552FTFEstado[0]);
            }
            if ( !( GXutil.dateCompare(Z13553FTFInicio, T01OI4_A13553FTFInicio[0]) ) )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTFInicio");
               GXutil.writeLogRaw("Old: ",Z13553FTFInicio);
               GXutil.writeLogRaw("Current: ",T01OI4_A13553FTFInicio[0]);
            }
            if ( !( GXutil.dateCompare(Z13554FTFFin, T01OI4_A13554FTFFin[0]) ) )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTFFin");
               GXutil.writeLogRaw("Old: ",Z13554FTFFin);
               GXutil.writeLogRaw("Current: ",T01OI4_A13554FTFFin[0]);
            }
            if ( DecimalUtil.compareTo(Z13555FTFMetros, T01OI4_A13555FTFMetros[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTFMetros");
               GXutil.writeLogRaw("Old: ",Z13555FTFMetros);
               GXutil.writeLogRaw("Current: ",T01OI4_A13555FTFMetros[0]);
            }
            if ( DecimalUtil.compareTo(Z13556FTTKilos, T01OI4_A13556FTTKilos[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTTKilos");
               GXutil.writeLogRaw("Old: ",Z13556FTTKilos);
               GXutil.writeLogRaw("Current: ",T01OI4_A13556FTTKilos[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFRTOH2"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OI1854( )
   {
      beforeValidate1OI1854( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OI1854( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OI1854( 0) ;
         checkOptimisticConcurrency1OI1854( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OI1854( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OI1854( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OI36 */
                  pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13548FTFProceso, Short.valueOf(A13549FTFOrden), Boolean.valueOf(n13560FTMaquina), A13560FTMaquina, Boolean.valueOf(n13550FTFFase), A13550FTFFase, Boolean.valueOf(n13551FTFFaseDsc), A13551FTFFaseDsc, Boolean.valueOf(n13552FTFEstado), Byte.valueOf(A13552FTFEstado), Boolean.valueOf(n13553FTFInicio), A13553FTFInicio, Boolean.valueOf(n13554FTFFin), A13554FTFFin, Boolean.valueOf(n13555FTFMetros), A13555FTFMetros, Boolean.valueOf(n13556FTTKilos), A13556FTTKilos});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFRTOH2");
                  if ( (pr_default.getStatus(34) == 1) )
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
            load1OI1854( ) ;
         }
         endLevel1OI1854( ) ;
      }
      closeExtendedTableCursors1OI1854( ) ;
   }

   public void update1OI1854( )
   {
      beforeValidate1OI1854( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OI1854( ) ;
      }
      if ( ( nIsMod_1854 != 0 ) || ( nIsDirty_1854 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1OI1854( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1OI1854( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1OI1854( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01OI37 */
                     pr_default.execute(35, new Object[] {Boolean.valueOf(n13560FTMaquina), A13560FTMaquina, Boolean.valueOf(n13550FTFFase), A13550FTFFase, Boolean.valueOf(n13551FTFFaseDsc), A13551FTFFaseDsc, Boolean.valueOf(n13552FTFEstado), Byte.valueOf(A13552FTFEstado), Boolean.valueOf(n13553FTFInicio), A13553FTFInicio, Boolean.valueOf(n13554FTFFin), A13554FTFFin, Boolean.valueOf(n13555FTFMetros), A13555FTFMetros, Boolean.valueOf(n13556FTTKilos), A13556FTTKilos, A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13548FTFProceso, Short.valueOf(A13549FTFOrden)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFRTOH2");
                     if ( (pr_default.getStatus(35) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFRTOH2"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1OI1854( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1OI1854( ) ;
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
            endLevel1OI1854( ) ;
         }
      }
      closeExtendedTableCursors1OI1854( ) ;
   }

   public void deferredUpdate1OI1854( )
   {
   }

   public void delete1OI1854( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1OI1854( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OI1854( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OI1854( ) ;
         afterConfirm1OI1854( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OI1854( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01OI38 */
               pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13548FTFProceso, Short.valueOf(A13549FTFOrden)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFRTOH2");
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
      sMode1854 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1OI1854( ) ;
      Gx_mode = sMode1854 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1OI1854( )
   {
      standaloneModal1OI1854( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1OI1854( )
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

   public void scanStart1OI1854( )
   {
      /* Scan By routine */
      /* Using cursor T01OI39 */
      pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP});
      RcdFound1854 = (short)(0) ;
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound1854 = (short)(1) ;
         A13548FTFProceso = T01OI39_A13548FTFProceso[0] ;
         A13549FTFOrden = T01OI39_A13549FTFOrden[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1OI1854( )
   {
      /* Scan next routine */
      pr_default.readNext(37);
      RcdFound1854 = (short)(0) ;
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound1854 = (short)(1) ;
         A13548FTFProceso = T01OI39_A13548FTFProceso[0] ;
         A13549FTFOrden = T01OI39_A13549FTFOrden[0] ;
      }
   }

   public void scanEnd1OI1854( )
   {
      pr_default.close(37);
   }

   public void afterConfirm1OI1854( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1OI1854( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OI1854( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OI1854( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OI1854( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OI1854( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OI1854( )
   {
      edtFTFProceso_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTFProceso_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTFProceso_Enabled), 5, 0), !bGXsfl_178_Refreshing);
      edtFTFOrden_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTFOrden_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTFOrden_Enabled), 5, 0), !bGXsfl_178_Refreshing);
      edtFTMaquina_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTMaquina_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTMaquina_Enabled), 5, 0), !bGXsfl_178_Refreshing);
      edtFTFFase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTFFase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTFFase_Enabled), 5, 0), !bGXsfl_178_Refreshing);
      edtFTFFaseDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTFFaseDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTFFaseDsc_Enabled), 5, 0), !bGXsfl_178_Refreshing);
      edtFTFEstado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTFEstado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTFEstado_Enabled), 5, 0), !bGXsfl_178_Refreshing);
      edtFTFInicio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTFInicio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTFInicio_Enabled), 5, 0), !bGXsfl_178_Refreshing);
      edtFTFFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTFFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTFFin_Enabled), 5, 0), !bGXsfl_178_Refreshing);
      edtFTFMetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTFMetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTFMetros_Enabled), 5, 0), !bGXsfl_178_Refreshing);
      edtFTTKilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTTKilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTTKilos_Enabled), 5, 0), !bGXsfl_178_Refreshing);
   }

   public void send_integrity_lvl_hashes1OI1854( )
   {
   }

   public void zm1OI1853( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13544FTPMetros = T01OI3_A13544FTPMetros[0] ;
            Z13545FTPKilos = T01OI3_A13545FTPKilos[0] ;
            Z13546FTPAnc = T01OI3_A13546FTPAnc[0] ;
            Z13547FTPUbicaci = T01OI3_A13547FTPUbicaci[0] ;
            Z13557FTPMtsAut = T01OI3_A13557FTPMtsAut[0] ;
            Z13558FTPKgsAut = T01OI3_A13558FTPKgsAut[0] ;
            Z13559FTPPiezaOr = T01OI3_A13559FTPPiezaOr[0] ;
         }
         else
         {
            Z13544FTPMetros = A13544FTPMetros ;
            Z13545FTPKilos = A13545FTPKilos ;
            Z13546FTPAnc = A13546FTPAnc ;
            Z13547FTPUbicaci = A13547FTPUbicaci ;
            Z13557FTPMtsAut = A13557FTPMtsAut ;
            Z13558FTPKgsAut = A13558FTPKgsAut ;
            Z13559FTPPiezaOr = A13559FTPPiezaOr ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z396EmprCod = A396EmprCod ;
         Z13528FTHdr = A13528FTHdr ;
         Z13529FTHdrR = A13529FTHdrR ;
         Z13530FTHdrP = A13530FTHdrP ;
         Z13543FTPieza = A13543FTPieza ;
         Z13544FTPMetros = A13544FTPMetros ;
         Z13545FTPKilos = A13545FTPKilos ;
         Z13546FTPAnc = A13546FTPAnc ;
         Z13547FTPUbicaci = A13547FTPUbicaci ;
         Z13557FTPMtsAut = A13557FTPMtsAut ;
         Z13558FTPKgsAut = A13558FTPKgsAut ;
         Z13559FTPPiezaOr = A13559FTPPiezaOr ;
      }
   }

   public void standaloneNotModal1OI1853( )
   {
   }

   public void standaloneModal1OI1853( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtFTPieza_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFTPieza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTPieza_Enabled), 5, 0), !bGXsfl_193_Refreshing);
      }
      else
      {
         edtFTPieza_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFTPieza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTPieza_Enabled), 5, 0), !bGXsfl_193_Refreshing);
      }
   }

   public void load1OI1853( )
   {
      /* Using cursor T01OI40 */
      pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13543FTPieza});
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound1853 = (short)(1) ;
         A13544FTPMetros = T01OI40_A13544FTPMetros[0] ;
         n13544FTPMetros = T01OI40_n13544FTPMetros[0] ;
         A13545FTPKilos = T01OI40_A13545FTPKilos[0] ;
         n13545FTPKilos = T01OI40_n13545FTPKilos[0] ;
         A13546FTPAnc = T01OI40_A13546FTPAnc[0] ;
         n13546FTPAnc = T01OI40_n13546FTPAnc[0] ;
         A13547FTPUbicaci = T01OI40_A13547FTPUbicaci[0] ;
         n13547FTPUbicaci = T01OI40_n13547FTPUbicaci[0] ;
         A13557FTPMtsAut = T01OI40_A13557FTPMtsAut[0] ;
         n13557FTPMtsAut = T01OI40_n13557FTPMtsAut[0] ;
         A13558FTPKgsAut = T01OI40_A13558FTPKgsAut[0] ;
         n13558FTPKgsAut = T01OI40_n13558FTPKgsAut[0] ;
         A13559FTPPiezaOr = T01OI40_A13559FTPPiezaOr[0] ;
         n13559FTPPiezaOr = T01OI40_n13559FTPPiezaOr[0] ;
         zm1OI1853( -6) ;
      }
      pr_default.close(38);
      onLoadActions1OI1853( ) ;
   }

   public void onLoadActions1OI1853( )
   {
   }

   public void checkExtendedTable1OI1853( )
   {
      nIsDirty_1853 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1OI1853( ) ;
   }

   public void closeExtendedTableCursors1OI1853( )
   {
   }

   public void enableDisable1OI1853( )
   {
   }

   public void getKey1OI1853( )
   {
      /* Using cursor T01OI41 */
      pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13543FTPieza});
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound1853 = (short)(1) ;
      }
      else
      {
         RcdFound1853 = (short)(0) ;
      }
      pr_default.close(39);
   }

   public void getByPrimaryKey1OI1853( )
   {
      /* Using cursor T01OI3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13543FTPieza});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01OI3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1OI1853( 6) ;
         RcdFound1853 = (short)(1) ;
         initializeNonKey1OI1853( ) ;
         A13543FTPieza = T01OI3_A13543FTPieza[0] ;
         A13544FTPMetros = T01OI3_A13544FTPMetros[0] ;
         n13544FTPMetros = T01OI3_n13544FTPMetros[0] ;
         A13545FTPKilos = T01OI3_A13545FTPKilos[0] ;
         n13545FTPKilos = T01OI3_n13545FTPKilos[0] ;
         A13546FTPAnc = T01OI3_A13546FTPAnc[0] ;
         n13546FTPAnc = T01OI3_n13546FTPAnc[0] ;
         A13547FTPUbicaci = T01OI3_A13547FTPUbicaci[0] ;
         n13547FTPUbicaci = T01OI3_n13547FTPUbicaci[0] ;
         A13557FTPMtsAut = T01OI3_A13557FTPMtsAut[0] ;
         n13557FTPMtsAut = T01OI3_n13557FTPMtsAut[0] ;
         A13558FTPKgsAut = T01OI3_A13558FTPKgsAut[0] ;
         n13558FTPKgsAut = T01OI3_n13558FTPKgsAut[0] ;
         A13559FTPPiezaOr = T01OI3_A13559FTPPiezaOr[0] ;
         n13559FTPPiezaOr = T01OI3_n13559FTPPiezaOr[0] ;
         Z396EmprCod = A396EmprCod ;
         Z13528FTHdr = A13528FTHdr ;
         Z13529FTHdrR = A13529FTHdrR ;
         Z13530FTHdrP = A13530FTHdrP ;
         Z13543FTPieza = A13543FTPieza ;
         sMode1853 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1OI1853( ) ;
         load1OI1853( ) ;
         Gx_mode = sMode1853 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1853 = (short)(0) ;
         initializeNonKey1OI1853( ) ;
         sMode1853 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1OI1853( ) ;
         Gx_mode = sMode1853 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1OI1853( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1OI1853( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01OI2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13543FTPieza});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFRTOH1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z13544FTPMetros, T01OI2_A13544FTPMetros[0]) != 0 ) || ( DecimalUtil.compareTo(Z13545FTPKilos, T01OI2_A13545FTPKilos[0]) != 0 ) || ( Z13546FTPAnc != T01OI2_A13546FTPAnc[0] ) || ( GXutil.strcmp(Z13547FTPUbicaci, T01OI2_A13547FTPUbicaci[0]) != 0 ) || ( DecimalUtil.compareTo(Z13557FTPMtsAut, T01OI2_A13557FTPMtsAut[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z13558FTPKgsAut, T01OI2_A13558FTPKgsAut[0]) != 0 ) || ( GXutil.strcmp(Z13559FTPPiezaOr, T01OI2_A13559FTPPiezaOr[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z13544FTPMetros, T01OI2_A13544FTPMetros[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTPMetros");
               GXutil.writeLogRaw("Old: ",Z13544FTPMetros);
               GXutil.writeLogRaw("Current: ",T01OI2_A13544FTPMetros[0]);
            }
            if ( DecimalUtil.compareTo(Z13545FTPKilos, T01OI2_A13545FTPKilos[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTPKilos");
               GXutil.writeLogRaw("Old: ",Z13545FTPKilos);
               GXutil.writeLogRaw("Current: ",T01OI2_A13545FTPKilos[0]);
            }
            if ( Z13546FTPAnc != T01OI2_A13546FTPAnc[0] )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTPAnc");
               GXutil.writeLogRaw("Old: ",Z13546FTPAnc);
               GXutil.writeLogRaw("Current: ",T01OI2_A13546FTPAnc[0]);
            }
            if ( GXutil.strcmp(Z13547FTPUbicaci, T01OI2_A13547FTPUbicaci[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTPUbicaci");
               GXutil.writeLogRaw("Old: ",Z13547FTPUbicaci);
               GXutil.writeLogRaw("Current: ",T01OI2_A13547FTPUbicaci[0]);
            }
            if ( DecimalUtil.compareTo(Z13557FTPMtsAut, T01OI2_A13557FTPMtsAut[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTPMtsAut");
               GXutil.writeLogRaw("Old: ",Z13557FTPMtsAut);
               GXutil.writeLogRaw("Current: ",T01OI2_A13557FTPMtsAut[0]);
            }
            if ( DecimalUtil.compareTo(Z13558FTPKgsAut, T01OI2_A13558FTPKgsAut[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTPKgsAut");
               GXutil.writeLogRaw("Old: ",Z13558FTPKgsAut);
               GXutil.writeLogRaw("Current: ",T01OI2_A13558FTPKgsAut[0]);
            }
            if ( GXutil.strcmp(Z13559FTPPiezaOr, T01OI2_A13559FTPPiezaOr[0]) != 0 )
            {
               GXutil.writeLogln("tfrtohd:[seudo value changed for attri]"+"FTPPiezaOr");
               GXutil.writeLogRaw("Old: ",Z13559FTPPiezaOr);
               GXutil.writeLogRaw("Current: ",T01OI2_A13559FTPPiezaOr[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFRTOH1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OI1853( )
   {
      beforeValidate1OI1853( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OI1853( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OI1853( 0) ;
         checkOptimisticConcurrency1OI1853( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OI1853( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OI1853( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OI42 */
                  pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13543FTPieza, Boolean.valueOf(n13544FTPMetros), A13544FTPMetros, Boolean.valueOf(n13545FTPKilos), A13545FTPKilos, Boolean.valueOf(n13546FTPAnc), Short.valueOf(A13546FTPAnc), Boolean.valueOf(n13547FTPUbicaci), A13547FTPUbicaci, Boolean.valueOf(n13557FTPMtsAut), A13557FTPMtsAut, Boolean.valueOf(n13558FTPKgsAut), A13558FTPKgsAut, Boolean.valueOf(n13559FTPPiezaOr), A13559FTPPiezaOr});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFRTOH1");
                  if ( (pr_default.getStatus(40) == 1) )
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
            load1OI1853( ) ;
         }
         endLevel1OI1853( ) ;
      }
      closeExtendedTableCursors1OI1853( ) ;
   }

   public void update1OI1853( )
   {
      beforeValidate1OI1853( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OI1853( ) ;
      }
      if ( ( nIsMod_1853 != 0 ) || ( nIsDirty_1853 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1OI1853( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1OI1853( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1OI1853( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01OI43 */
                     pr_default.execute(41, new Object[] {Boolean.valueOf(n13544FTPMetros), A13544FTPMetros, Boolean.valueOf(n13545FTPKilos), A13545FTPKilos, Boolean.valueOf(n13546FTPAnc), Short.valueOf(A13546FTPAnc), Boolean.valueOf(n13547FTPUbicaci), A13547FTPUbicaci, Boolean.valueOf(n13557FTPMtsAut), A13557FTPMtsAut, Boolean.valueOf(n13558FTPKgsAut), A13558FTPKgsAut, Boolean.valueOf(n13559FTPPiezaOr), A13559FTPPiezaOr, A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13543FTPieza});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFRTOH1");
                     if ( (pr_default.getStatus(41) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFRTOH1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1OI1853( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1OI1853( ) ;
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
            endLevel1OI1853( ) ;
         }
      }
      closeExtendedTableCursors1OI1853( ) ;
   }

   public void deferredUpdate1OI1853( )
   {
   }

   public void delete1OI1853( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1OI1853( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OI1853( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OI1853( ) ;
         afterConfirm1OI1853( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OI1853( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01OI44 */
               pr_default.execute(42, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP, A13543FTPieza});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFRTOH1");
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
      sMode1853 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1OI1853( ) ;
      Gx_mode = sMode1853 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1OI1853( )
   {
      standaloneModal1OI1853( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1OI1853( )
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

   public void scanStart1OI1853( )
   {
      /* Scan By routine */
      /* Using cursor T01OI45 */
      pr_default.execute(43, new Object[] {A396EmprCod, Integer.valueOf(A13528FTHdr), Byte.valueOf(A13529FTHdrR), A13530FTHdrP});
      RcdFound1853 = (short)(0) ;
      if ( (pr_default.getStatus(43) != 101) )
      {
         RcdFound1853 = (short)(1) ;
         A13543FTPieza = T01OI45_A13543FTPieza[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1OI1853( )
   {
      /* Scan next routine */
      pr_default.readNext(43);
      RcdFound1853 = (short)(0) ;
      if ( (pr_default.getStatus(43) != 101) )
      {
         RcdFound1853 = (short)(1) ;
         A13543FTPieza = T01OI45_A13543FTPieza[0] ;
      }
   }

   public void scanEnd1OI1853( )
   {
      pr_default.close(43);
   }

   public void afterConfirm1OI1853( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1OI1853( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OI1853( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OI1853( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OI1853( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OI1853( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OI1853( )
   {
      edtFTPieza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTPieza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTPieza_Enabled), 5, 0), !bGXsfl_193_Refreshing);
      edtFTPMetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTPMetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTPMetros_Enabled), 5, 0), !bGXsfl_193_Refreshing);
      edtFTPKilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTPKilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTPKilos_Enabled), 5, 0), !bGXsfl_193_Refreshing);
      edtFTPAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTPAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTPAnc_Enabled), 5, 0), !bGXsfl_193_Refreshing);
      edtFTPUbicaci_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTPUbicaci_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTPUbicaci_Enabled), 5, 0), !bGXsfl_193_Refreshing);
      edtFTPMtsAut_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTPMtsAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTPMtsAut_Enabled), 5, 0), !bGXsfl_193_Refreshing);
      edtFTPKgsAut_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTPKgsAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTPKgsAut_Enabled), 5, 0), !bGXsfl_193_Refreshing);
      edtFTPPiezaOr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTPPiezaOr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTPPiezaOr_Enabled), 5, 0), !bGXsfl_193_Refreshing);
   }

   public void send_integrity_lvl_hashes1OI1853( )
   {
   }

   public void send_integrity_lvl_hashes1OI1852( )
   {
   }

   public void subsflControlProps_1301860( )
   {
      lblTextblock23_Internalname = "TEXTBLOCK23_"+sGXsfl_130_idx ;
      edtFTCLote_Internalname = "FTCLOTE_"+sGXsfl_130_idx ;
      lblTextblock24_Internalname = "TEXTBLOCK24_"+sGXsfl_130_idx ;
      edtFTCEmpesa_Internalname = "FTCEMPESA_"+sGXsfl_130_idx ;
      lblTextblock25_Internalname = "TEXTBLOCK25_"+sGXsfl_130_idx ;
      edtFTCEmpesaE_Internalname = "FTCEMPESAE_"+sGXsfl_130_idx ;
      lblTextblock26_Internalname = "TEXTBLOCK26_"+sGXsfl_130_idx ;
      edtFTCAncho_Internalname = "FTCANCHO_"+sGXsfl_130_idx ;
      lblTextblock27_Internalname = "TEXTBLOCK27_"+sGXsfl_130_idx ;
      edtFTCMetros_Internalname = "FTCMETROS_"+sGXsfl_130_idx ;
      lblTextblock28_Internalname = "TEXTBLOCK28_"+sGXsfl_130_idx ;
      edtFTCUltLine_Internalname = "FTCULTLINE_"+sGXsfl_130_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_130_idx ;
   }

   public void subsflControlProps_fel_1301860( )
   {
      lblTextblock23_Internalname = "TEXTBLOCK23_"+sGXsfl_130_fel_idx ;
      edtFTCLote_Internalname = "FTCLOTE_"+sGXsfl_130_fel_idx ;
      lblTextblock24_Internalname = "TEXTBLOCK24_"+sGXsfl_130_fel_idx ;
      edtFTCEmpesa_Internalname = "FTCEMPESA_"+sGXsfl_130_fel_idx ;
      lblTextblock25_Internalname = "TEXTBLOCK25_"+sGXsfl_130_fel_idx ;
      edtFTCEmpesaE_Internalname = "FTCEMPESAE_"+sGXsfl_130_fel_idx ;
      lblTextblock26_Internalname = "TEXTBLOCK26_"+sGXsfl_130_fel_idx ;
      edtFTCAncho_Internalname = "FTCANCHO_"+sGXsfl_130_fel_idx ;
      lblTextblock27_Internalname = "TEXTBLOCK27_"+sGXsfl_130_fel_idx ;
      edtFTCMetros_Internalname = "FTCMETROS_"+sGXsfl_130_fel_idx ;
      lblTextblock28_Internalname = "TEXTBLOCK28_"+sGXsfl_130_fel_idx ;
      edtFTCUltLine_Internalname = "FTCULTLINE_"+sGXsfl_130_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_130_fel_idx ;
   }

   public void addRow1OI1860( )
   {
      nRC_GXsfl_167 = 0 ;
      nGXsfl_130_idx = (int)(nGXsfl_130_idx+1) ;
      sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1301860( ) ;
      sendRow1OI1860( ) ;
   }

   public void sendRow1OI1860( )
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
         if ( ((int)((nGXsfl_130_idx) % (2))) == 0 )
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
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_130_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_130_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_130_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock23_Internalname,httpContext.getMessage( "Lote de Tejeduria", ""),"","",lblTextblock23_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1860_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 138,'',false,'" + sGXsfl_130_idx + "',130)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTCLote_Internalname,GXutil.rtrim( A13592FTCLote),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,138);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTCLote_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtFTCLote_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(20),"chr",Integer.valueOf(1),"row",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock24_Internalname,httpContext.getMessage( "Codigo Empesa VERTEX", ""),"","",lblTextblock24_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1860_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 143,'',false,'" + sGXsfl_130_idx + "',130)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTCEmpesa_Internalname,GXutil.rtrim( A13593FTCEmpesa),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,143);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTCEmpesa_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtFTCEmpesa_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(16),"chr",Integer.valueOf(1),"row",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock25_Internalname,httpContext.getMessage( "Codigo Empesa ERP", ""),"","",lblTextblock25_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1860_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 148,'',false,'" + sGXsfl_130_idx + "',130)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTCEmpesaE_Internalname,GXutil.rtrim( A13594FTCEmpesaE),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,148);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTCEmpesaE_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtFTCEmpesaE_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(20),"chr",Integer.valueOf(1),"row",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock26_Internalname,httpContext.getMessage( "Ancho (cm)", ""),"","",lblTextblock26_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1860_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 153,'',false,'" + sGXsfl_130_idx + "',130)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTCAncho_Internalname,GXutil.ltrim( localUtil.ntoc( A13595FTCAncho, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFTCAncho_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13595FTCAncho), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13595FTCAncho), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,153);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTCAncho_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtFTCAncho_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock27_Internalname,httpContext.getMessage( "Total Metros", ""),"","",lblTextblock27_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1860_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 158,'',false,'" + sGXsfl_130_idx + "',130)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTCMetros_Internalname,GXutil.ltrim( localUtil.ntoc( A13596FTCMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFTCMetros_Enabled!=0) ? localUtil.format( A13596FTCMetros, "ZZZZZ9.99") : localUtil.format( A13596FTCMetros, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,158);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTCMetros_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtFTCMetros_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(9),"chr",Integer.valueOf(1),"row",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock28_Internalname,httpContext.getMessage( "Ultima Linea Presentacion", ""),"","",lblTextblock28_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1860_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 163,'',false,'" + sGXsfl_130_idx + "',130)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTCUltLine_Internalname,GXutil.ltrim( localUtil.ntoc( A13597FTCUltLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFTCUltLine_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13597FTCUltLine), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13597FTCUltLine), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,163);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTCUltLine_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtFTCUltLine_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
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
      startgridcontrol167( ) ;
      nGXsfl_167_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1861 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1861 = (short)(1) ;
            scanStart1OI1861( ) ;
            while ( RcdFound1861 != 0 )
            {
               init_level_properties1861( ) ;
               getByPrimaryKey1OI1861( ) ;
               addRow1OI1861( ) ;
               scanNext1OI1861( ) ;
            }
            scanEnd1OI1861( ) ;
            nBlankRcdCount1861 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1OI1861( ) ;
         standaloneModal1OI1861( ) ;
         sMode1861 = Gx_mode ;
         while ( nGXsfl_167_idx < nRC_GXsfl_167 )
         {
            bGXsfl_167_Refreshing = true ;
            readRow1OI1861( ) ;
            edtavnRcdDeleted_1861_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1861_"+sGXsfl_167_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1861_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1861_Enabled), 5, 0), !bGXsfl_167_Refreshing);
            edtFTCLinea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTCLINEA_"+sGXsfl_167_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTCLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCLinea_Enabled), 5, 0), !bGXsfl_167_Refreshing);
            edtFTCPresen_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTCPRESEN_"+sGXsfl_167_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTCPresen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCPresen_Enabled), 5, 0), !bGXsfl_167_Refreshing);
            edtFTCLong_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTCLONG_"+sGXsfl_167_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTCLong_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCLong_Enabled), 5, 0), !bGXsfl_167_Refreshing);
            edtFTCLMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTCLMTS_"+sGXsfl_167_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTCLMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCLMts_Enabled), 5, 0), !bGXsfl_167_Refreshing);
            edtFTCLObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTCLOBS_"+sGXsfl_167_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTCLObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCLObs_Enabled), 5, 0), !bGXsfl_167_Refreshing);
            edtFTCLEtique_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTCLETIQUE_"+sGXsfl_167_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFTCLEtique_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCLEtique_Enabled), 5, 0), !bGXsfl_167_Refreshing);
            if ( ( nRcdExists_1861 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1OI1861( ) ;
            }
            sendRow1OI1861( ) ;
            bGXsfl_167_Refreshing = false ;
         }
         Gx_mode = sMode1861 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1861 = (short)(5) ;
         nRcdExists_1861 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1OI1861( ) ;
            while ( RcdFound1861 != 0 )
            {
               sGXsfl_167_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_167_idx+1), 4, 0), (short)(4), "0") + sGXsfl_130_idx ;
               subsflControlProps_1671861( ) ;
               init_level_properties1861( ) ;
               standaloneNotModal1OI1861( ) ;
               getByPrimaryKey1OI1861( ) ;
               standaloneModal1OI1861( ) ;
               addRow1OI1861( ) ;
               scanNext1OI1861( ) ;
            }
            scanEnd1OI1861( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1861 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_167_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_167_idx+1), 4, 0), (short)(4), "0") + sGXsfl_130_idx ;
      subsflControlProps_1671861( ) ;
      initAll1OI1861( ) ;
      init_level_properties1861( ) ;
      nRcdExists_1861 = (short)(0) ;
      nIsMod_1861 = (short)(0) ;
      nRcdDeleted_1861 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 130 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_130_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1861 = (short)(nBlankRcdUsr1861+nBlankRcdCount1861) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1861 > 0 )
      {
         standaloneNotModal1OI1861( ) ;
         standaloneModal1OI1861( ) ;
         addRow1OI1861( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtFTCLinea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1861 = (short)(nBlankRcdCount1861-1) ;
      }
      Gx_mode = sMode1861 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_130_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_130_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_130_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1OI1860( ) ;
      GXCCtl = "Z13592FTCLote_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13592FTCLote));
      GXCCtl = "Z13593FTCEmpesa_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13593FTCEmpesa));
      GXCCtl = "Z13594FTCEmpesaE_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13594FTCEmpesaE));
      GXCCtl = "Z13595FTCAncho_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13595FTCAncho, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13596FTCMetros_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13596FTCMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13597FTCUltLine_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13597FTCUltLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_167_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_167_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1860_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1860, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1860_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1860, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1860_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1860, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTCLOTE_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCLote_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTCEMPESA_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCEmpesa_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTCEMPESAE_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCEmpesaE_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTCANCHO_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCAncho_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTCMETROS_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCMetros_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTCULTLINE_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCUltLine_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_130_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1OI1860( )
   {
      nGXsfl_130_idx = (int)(nGXsfl_130_idx+1) ;
      sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1301860( ) ;
      edtFTCLote_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTCLOTE_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTCEmpesa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTCEMPESA_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTCEmpesaE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTCEMPESAE_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTCAncho_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTCANCHO_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTCMetros_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTCMETROS_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTCUltLine_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTCULTLINE_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A13592FTCLote = httpContext.cgiGet( edtFTCLote_Internalname) ;
      A13593FTCEmpesa = httpContext.cgiGet( edtFTCEmpesa_Internalname) ;
      n13593FTCEmpesa = false ;
      A13594FTCEmpesaE = httpContext.cgiGet( edtFTCEmpesaE_Internalname) ;
      n13594FTCEmpesaE = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFTCAncho_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFTCAncho_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "FTCANCHO_" + sGXsfl_130_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFTCAncho_Internalname ;
         wbErr = true ;
         A13595FTCAncho = (short)(0) ;
         n13595FTCAncho = false ;
      }
      else
      {
         A13595FTCAncho = (short)(localUtil.ctol( httpContext.cgiGet( edtFTCAncho_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13595FTCAncho = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFTCMetros_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFTCMetros_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "FTCMETROS_" + sGXsfl_130_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFTCMetros_Internalname ;
         wbErr = true ;
         A13596FTCMetros = DecimalUtil.ZERO ;
         n13596FTCMetros = false ;
      }
      else
      {
         A13596FTCMetros = localUtil.ctond( httpContext.cgiGet( edtFTCMetros_Internalname)) ;
         n13596FTCMetros = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFTCUltLine_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFTCUltLine_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "FTCULTLINE_" + sGXsfl_130_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFTCUltLine_Internalname ;
         wbErr = true ;
         A13597FTCUltLine = (short)(0) ;
         n13597FTCUltLine = false ;
      }
      else
      {
         A13597FTCUltLine = (short)(localUtil.ctol( httpContext.cgiGet( edtFTCUltLine_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13597FTCUltLine = false ;
      }
      GXCCtl = "Z13592FTCLote_" + sGXsfl_130_idx ;
      Z13592FTCLote = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13593FTCEmpesa_" + sGXsfl_130_idx ;
      Z13593FTCEmpesa = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13594FTCEmpesaE_" + sGXsfl_130_idx ;
      Z13594FTCEmpesaE = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13595FTCAncho_" + sGXsfl_130_idx ;
      Z13595FTCAncho = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13596FTCMetros_" + sGXsfl_130_idx ;
      Z13596FTCMetros = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13597FTCUltLine_" + sGXsfl_130_idx ;
      Z13597FTCUltLine = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_167_" + sGXsfl_130_idx ;
      nRC_GXsfl_167 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1860_" + sGXsfl_130_idx ;
      nRcdDeleted_1860 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1860_" + sGXsfl_130_idx ;
      nRcdExists_1860 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1860_" + sGXsfl_130_idx ;
      nIsMod_1860 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_167_" + sGXsfl_130_idx ;
      nRC_GXsfl_167 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1671861( )
   {
      edtavnRcdDeleted_1861_Internalname = "vNRCDDELETED_1861_"+sGXsfl_167_idx ;
      edtFTCLinea_Internalname = "FTCLINEA_"+sGXsfl_167_idx ;
      edtFTCPresen_Internalname = "FTCPRESEN_"+sGXsfl_167_idx ;
      edtFTCLong_Internalname = "FTCLONG_"+sGXsfl_167_idx ;
      edtFTCLMts_Internalname = "FTCLMTS_"+sGXsfl_167_idx ;
      edtFTCLObs_Internalname = "FTCLOBS_"+sGXsfl_167_idx ;
      edtFTCLEtique_Internalname = "FTCLETIQUE_"+sGXsfl_167_idx ;
   }

   public void subsflControlProps_fel_1671861( )
   {
      edtavnRcdDeleted_1861_Internalname = "vNRCDDELETED_1861_"+sGXsfl_167_fel_idx ;
      edtFTCLinea_Internalname = "FTCLINEA_"+sGXsfl_167_fel_idx ;
      edtFTCPresen_Internalname = "FTCPRESEN_"+sGXsfl_167_fel_idx ;
      edtFTCLong_Internalname = "FTCLONG_"+sGXsfl_167_fel_idx ;
      edtFTCLMts_Internalname = "FTCLMTS_"+sGXsfl_167_fel_idx ;
      edtFTCLObs_Internalname = "FTCLOBS_"+sGXsfl_167_fel_idx ;
      edtFTCLEtique_Internalname = "FTCLETIQUE_"+sGXsfl_167_fel_idx ;
   }

   public void addRow1OI1861( )
   {
      nGXsfl_167_idx = (int)(nGXsfl_167_idx+1) ;
      sGXsfl_167_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_167_idx), 4, 0), (short)(4), "0") + sGXsfl_130_idx ;
      subsflControlProps_1671861( ) ;
      sendRow1OI1861( ) ;
   }

   public void sendRow1OI1861( )
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
         if ( ((int)((nGXsfl_167_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1861_" + sGXsfl_167_idx + "',1);gx.fn.setControlValue('nIsMod_1860_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 168,'',false,'" + sGXsfl_167_idx + "',167)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1861_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1861, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1861_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1861), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1861), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,168);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1861_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1861_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(167),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1861_" + sGXsfl_167_idx + "',1);gx.fn.setControlValue('nIsMod_1860_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 169,'',false,'" + sGXsfl_167_idx + "',167)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTCLinea_Internalname,GXutil.ltrim( localUtil.ntoc( A13598FTCLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13598FTCLinea), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,169);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTCLinea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFTCLinea_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(167),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1861_" + sGXsfl_167_idx + "',1);gx.fn.setControlValue('nIsMod_1860_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 170,'',false,'" + sGXsfl_167_idx + "',167)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTCPresen_Internalname,GXutil.rtrim( A13599FTCPresen),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,170);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTCPresen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFTCPresen_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(167),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1861_" + sGXsfl_167_idx + "',1);gx.fn.setControlValue('nIsMod_1860_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 171,'',false,'" + sGXsfl_167_idx + "',167)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTCLong_Internalname,GXutil.ltrim( localUtil.ntoc( A13600FTCLong, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFTCLong_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13600FTCLong), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13600FTCLong), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,171);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTCLong_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFTCLong_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(167),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1861_" + sGXsfl_167_idx + "',1);gx.fn.setControlValue('nIsMod_1860_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 172,'',false,'" + sGXsfl_167_idx + "',167)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTCLMts_Internalname,GXutil.ltrim( localUtil.ntoc( A13601FTCLMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFTCLMts_Enabled!=0) ? localUtil.format( A13601FTCLMts, "ZZZZZ9.99") : localUtil.format( A13601FTCLMts, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,172);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTCLMts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFTCLMts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(167),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1861_" + sGXsfl_167_idx + "',1);gx.fn.setControlValue('nIsMod_1860_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 173,'',false,'" + sGXsfl_167_idx + "',167)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTCLObs_Internalname,GXutil.rtrim( A13602FTCLObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,173);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTCLObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFTCLObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(167),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1861_" + sGXsfl_167_idx + "',1);gx.fn.setControlValue('nIsMod_1860_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 174,'',false,'" + sGXsfl_167_idx + "',167)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTCLEtique_Internalname,GXutil.rtrim( A13603FTCLEtique),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,174);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTCLEtique_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFTCLEtique_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(167),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes1OI1861( ) ;
      GXCCtl = "Z13598FTCLinea_" + sGXsfl_167_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13598FTCLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13599FTCPresen_" + sGXsfl_167_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13599FTCPresen));
      GXCCtl = "Z13600FTCLong_" + sGXsfl_167_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13600FTCLong, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13601FTCLMts_" + sGXsfl_167_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13601FTCLMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13602FTCLObs_" + sGXsfl_167_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13602FTCLObs));
      GXCCtl = "Z13603FTCLEtique_" + sGXsfl_167_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13603FTCLEtique));
      GXCCtl = "nRcdDeleted_1861_" + sGXsfl_167_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1861, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1861_" + sGXsfl_167_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1861, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1861_" + sGXsfl_167_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1861, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1861_"+sGXsfl_167_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1861_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTCLINEA_"+sGXsfl_167_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCLinea_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTCPRESEN_"+sGXsfl_167_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCPresen_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTCLONG_"+sGXsfl_167_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCLong_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTCLMTS_"+sGXsfl_167_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCLMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTCLOBS_"+sGXsfl_167_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCLObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTCLETIQUE_"+sGXsfl_167_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCLEtique_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow1OI1861( )
   {
      nGXsfl_167_idx = (int)(nGXsfl_167_idx+1) ;
      sGXsfl_167_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_167_idx), 4, 0), (short)(4), "0") + sGXsfl_130_idx ;
      subsflControlProps_1671861( ) ;
      edtavnRcdDeleted_1861_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1861_"+sGXsfl_167_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTCLinea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTCLINEA_"+sGXsfl_167_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTCPresen_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTCPRESEN_"+sGXsfl_167_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTCLong_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTCLONG_"+sGXsfl_167_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTCLMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTCLMTS_"+sGXsfl_167_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTCLObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTCLOBS_"+sGXsfl_167_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTCLEtique_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTCLETIQUE_"+sGXsfl_167_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1861_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1861_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1861");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1861_Internalname ;
         wbErr = true ;
         nRcdDeleted_1861 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1861 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1861_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFTCLinea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFTCLinea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "FTCLINEA_" + sGXsfl_167_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFTCLinea_Internalname ;
         wbErr = true ;
         A13598FTCLinea = (short)(0) ;
      }
      else
      {
         A13598FTCLinea = (short)(localUtil.ctol( httpContext.cgiGet( edtFTCLinea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A13599FTCPresen = httpContext.cgiGet( edtFTCPresen_Internalname) ;
      n13599FTCPresen = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFTCLong_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFTCLong_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "FTCLONG_" + sGXsfl_167_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFTCLong_Internalname ;
         wbErr = true ;
         A13600FTCLong = (short)(0) ;
         n13600FTCLong = false ;
      }
      else
      {
         A13600FTCLong = (short)(localUtil.ctol( httpContext.cgiGet( edtFTCLong_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13600FTCLong = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFTCLMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFTCLMts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "FTCLMTS_" + sGXsfl_167_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFTCLMts_Internalname ;
         wbErr = true ;
         A13601FTCLMts = DecimalUtil.ZERO ;
         n13601FTCLMts = false ;
      }
      else
      {
         A13601FTCLMts = localUtil.ctond( httpContext.cgiGet( edtFTCLMts_Internalname)) ;
         n13601FTCLMts = false ;
      }
      A13602FTCLObs = httpContext.cgiGet( edtFTCLObs_Internalname) ;
      n13602FTCLObs = false ;
      A13603FTCLEtique = httpContext.cgiGet( edtFTCLEtique_Internalname) ;
      n13603FTCLEtique = false ;
      GXCCtl = "Z13598FTCLinea_" + sGXsfl_167_idx ;
      Z13598FTCLinea = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13599FTCPresen_" + sGXsfl_167_idx ;
      Z13599FTCPresen = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13600FTCLong_" + sGXsfl_167_idx ;
      Z13600FTCLong = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13601FTCLMts_" + sGXsfl_167_idx ;
      Z13601FTCLMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13602FTCLObs_" + sGXsfl_167_idx ;
      Z13602FTCLObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13603FTCLEtique_" + sGXsfl_167_idx ;
      Z13603FTCLEtique = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1861_" + sGXsfl_167_idx ;
      nRcdDeleted_1861 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1861_" + sGXsfl_167_idx ;
      nRcdExists_1861 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1861_" + sGXsfl_167_idx ;
      nIsMod_1861 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1781854( )
   {
      edtavnRcdDeleted_1854_Internalname = "vNRCDDELETED_1854_"+sGXsfl_178_idx ;
      edtFTFProceso_Internalname = "FTFPROCESO_"+sGXsfl_178_idx ;
      edtFTFOrden_Internalname = "FTFORDEN_"+sGXsfl_178_idx ;
      edtFTMaquina_Internalname = "FTMAQUINA_"+sGXsfl_178_idx ;
      edtFTFFase_Internalname = "FTFFASE_"+sGXsfl_178_idx ;
      edtFTFFaseDsc_Internalname = "FTFFASEDSC_"+sGXsfl_178_idx ;
      edtFTFEstado_Internalname = "FTFESTADO_"+sGXsfl_178_idx ;
      edtFTFInicio_Internalname = "FTFINICIO_"+sGXsfl_178_idx ;
      edtFTFFin_Internalname = "FTFFIN_"+sGXsfl_178_idx ;
      edtFTFMetros_Internalname = "FTFMETROS_"+sGXsfl_178_idx ;
      edtFTTKilos_Internalname = "FTTKILOS_"+sGXsfl_178_idx ;
   }

   public void subsflControlProps_fel_1781854( )
   {
      edtavnRcdDeleted_1854_Internalname = "vNRCDDELETED_1854_"+sGXsfl_178_fel_idx ;
      edtFTFProceso_Internalname = "FTFPROCESO_"+sGXsfl_178_fel_idx ;
      edtFTFOrden_Internalname = "FTFORDEN_"+sGXsfl_178_fel_idx ;
      edtFTMaquina_Internalname = "FTMAQUINA_"+sGXsfl_178_fel_idx ;
      edtFTFFase_Internalname = "FTFFASE_"+sGXsfl_178_fel_idx ;
      edtFTFFaseDsc_Internalname = "FTFFASEDSC_"+sGXsfl_178_fel_idx ;
      edtFTFEstado_Internalname = "FTFESTADO_"+sGXsfl_178_fel_idx ;
      edtFTFInicio_Internalname = "FTFINICIO_"+sGXsfl_178_fel_idx ;
      edtFTFFin_Internalname = "FTFFIN_"+sGXsfl_178_fel_idx ;
      edtFTFMetros_Internalname = "FTFMETROS_"+sGXsfl_178_fel_idx ;
      edtFTTKilos_Internalname = "FTTKILOS_"+sGXsfl_178_fel_idx ;
   }

   public void addRow1OI1854( )
   {
      nGXsfl_178_idx = (int)(nGXsfl_178_idx+1) ;
      sGXsfl_178_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_178_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1781854( ) ;
      sendRow1OI1854( ) ;
   }

   public void sendRow1OI1854( )
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
         if ( ((int)((nGXsfl_178_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1854_" + sGXsfl_178_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 179,'',false,'" + sGXsfl_178_idx + "',178)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1854_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1854, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1854_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1854), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1854), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,179);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1854_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1854_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(178),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1854_" + sGXsfl_178_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 180,'',false,'" + sGXsfl_178_idx + "',178)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTFProceso_Internalname,GXutil.rtrim( A13548FTFProceso),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,180);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTFProceso_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFTFProceso_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(178),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1854_" + sGXsfl_178_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 181,'',false,'" + sGXsfl_178_idx + "',178)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTFOrden_Internalname,GXutil.ltrim( localUtil.ntoc( A13549FTFOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13549FTFOrden), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,181);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTFOrden_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFTFOrden_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(178),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1854_" + sGXsfl_178_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 182,'',false,'" + sGXsfl_178_idx + "',178)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTMaquina_Internalname,GXutil.rtrim( A13560FTMaquina),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,182);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTMaquina_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFTMaquina_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(178),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1854_" + sGXsfl_178_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 183,'',false,'" + sGXsfl_178_idx + "',178)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTFFase_Internalname,GXutil.rtrim( A13550FTFFase),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,183);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTFFase_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFTFFase_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(178),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1854_" + sGXsfl_178_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 184,'',false,'" + sGXsfl_178_idx + "',178)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTFFaseDsc_Internalname,GXutil.rtrim( A13551FTFFaseDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,184);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTFFaseDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFTFFaseDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(178),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1854_" + sGXsfl_178_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 185,'',false,'" + sGXsfl_178_idx + "',178)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTFEstado_Internalname,GXutil.ltrim( localUtil.ntoc( A13552FTFEstado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFTFEstado_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13552FTFEstado), "9") : localUtil.format( DecimalUtil.doubleToDec(A13552FTFEstado), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,185);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTFEstado_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFTFEstado_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(178),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1854_" + sGXsfl_178_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 186,'',false,'" + sGXsfl_178_idx + "',178)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTFInicio_Internalname,localUtil.ttoc( A13553FTFInicio, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A13553FTFInicio, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,186);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTFInicio_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFTFInicio_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(178),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1854_" + sGXsfl_178_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 187,'',false,'" + sGXsfl_178_idx + "',178)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTFFin_Internalname,localUtil.ttoc( A13554FTFFin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A13554FTFFin, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,187);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTFFin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFTFFin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(178),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1854_" + sGXsfl_178_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 188,'',false,'" + sGXsfl_178_idx + "',178)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTFMetros_Internalname,GXutil.ltrim( localUtil.ntoc( A13555FTFMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFTFMetros_Enabled!=0) ? localUtil.format( A13555FTFMetros, "ZZZZZ9.99") : localUtil.format( A13555FTFMetros, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,188);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTFMetros_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFTFMetros_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(178),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1854_" + sGXsfl_178_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 189,'',false,'" + sGXsfl_178_idx + "',178)\"" ;
      ROClassString = "Attribute" ;
      Grid3Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTTKilos_Internalname,GXutil.ltrim( localUtil.ntoc( A13556FTTKilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFTTKilos_Enabled!=0) ? localUtil.format( A13556FTTKilos, "ZZZZZ9.99") : localUtil.format( A13556FTTKilos, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,189);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTTKilos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFTTKilos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(178),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid3Row);
      send_integrity_lvl_hashes1OI1854( ) ;
      GXCCtl = "Z13548FTFProceso_" + sGXsfl_178_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13548FTFProceso));
      GXCCtl = "Z13549FTFOrden_" + sGXsfl_178_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13549FTFOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13560FTMaquina_" + sGXsfl_178_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13560FTMaquina));
      GXCCtl = "Z13550FTFFase_" + sGXsfl_178_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13550FTFFase));
      GXCCtl = "Z13551FTFFaseDsc_" + sGXsfl_178_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13551FTFFaseDsc));
      GXCCtl = "Z13552FTFEstado_" + sGXsfl_178_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13552FTFEstado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13553FTFInicio_" + sGXsfl_178_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z13553FTFInicio, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z13554FTFFin_" + sGXsfl_178_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z13554FTFFin, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z13555FTFMetros_" + sGXsfl_178_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13555FTFMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13556FTTKilos_" + sGXsfl_178_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13556FTTKilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1854_" + sGXsfl_178_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1854, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1854_" + sGXsfl_178_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1854, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1854_" + sGXsfl_178_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1854, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1854_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1854_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTFPROCESO_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFProceso_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTFORDEN_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFOrden_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTMAQUINA_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTMaquina_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTFFASE_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFFase_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTFFASEDSC_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFFaseDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTFESTADO_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFEstado_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTFINICIO_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFInicio_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTFFIN_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFFin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTFMETROS_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFMetros_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTTKILOS_"+sGXsfl_178_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTTKilos_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid3Container.AddRow(Grid3Row);
   }

   public void readRow1OI1854( )
   {
      nGXsfl_178_idx = (int)(nGXsfl_178_idx+1) ;
      sGXsfl_178_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_178_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1781854( ) ;
      edtavnRcdDeleted_1854_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1854_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTFProceso_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTFPROCESO_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTFOrden_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTFORDEN_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTMaquina_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTMAQUINA_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTFFase_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTFFASE_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTFFaseDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTFFASEDSC_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTFEstado_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTFESTADO_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTFInicio_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTFINICIO_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTFFin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTFFIN_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTFMetros_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTFMETROS_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTTKilos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTTKILOS_"+sGXsfl_178_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1854_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1854_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1854");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1854_Internalname ;
         wbErr = true ;
         nRcdDeleted_1854 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1854 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1854_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A13548FTFProceso = httpContext.cgiGet( edtFTFProceso_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFTFOrden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFTFOrden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "FTFORDEN_" + sGXsfl_178_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFTFOrden_Internalname ;
         wbErr = true ;
         A13549FTFOrden = (short)(0) ;
      }
      else
      {
         A13549FTFOrden = (short)(localUtil.ctol( httpContext.cgiGet( edtFTFOrden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A13560FTMaquina = httpContext.cgiGet( edtFTMaquina_Internalname) ;
      n13560FTMaquina = false ;
      A13550FTFFase = httpContext.cgiGet( edtFTFFase_Internalname) ;
      n13550FTFFase = false ;
      A13551FTFFaseDsc = httpContext.cgiGet( edtFTFFaseDsc_Internalname) ;
      n13551FTFFaseDsc = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFTFEstado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFTFEstado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "FTFESTADO_" + sGXsfl_178_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFTFEstado_Internalname ;
         wbErr = true ;
         A13552FTFEstado = (byte)(0) ;
         n13552FTFEstado = false ;
      }
      else
      {
         A13552FTFEstado = (byte)(localUtil.ctol( httpContext.cgiGet( edtFTFEstado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13552FTFEstado = false ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtFTFInicio_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "FTFINICIO_" + sGXsfl_178_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFTFInicio_Internalname ;
         wbErr = true ;
         A13553FTFInicio = GXutil.resetTime( GXutil.nullDate() );
         n13553FTFInicio = false ;
      }
      else
      {
         A13553FTFInicio = localUtil.ctot( httpContext.cgiGet( edtFTFInicio_Internalname)) ;
         n13553FTFInicio = false ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtFTFFin_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "FTFFIN_" + sGXsfl_178_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFTFFin_Internalname ;
         wbErr = true ;
         A13554FTFFin = GXutil.resetTime( GXutil.nullDate() );
         n13554FTFFin = false ;
      }
      else
      {
         A13554FTFFin = localUtil.ctot( httpContext.cgiGet( edtFTFFin_Internalname)) ;
         n13554FTFFin = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFTFMetros_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFTFMetros_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "FTFMETROS_" + sGXsfl_178_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFTFMetros_Internalname ;
         wbErr = true ;
         A13555FTFMetros = DecimalUtil.ZERO ;
         n13555FTFMetros = false ;
      }
      else
      {
         A13555FTFMetros = localUtil.ctond( httpContext.cgiGet( edtFTFMetros_Internalname)) ;
         n13555FTFMetros = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFTTKilos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFTTKilos_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "FTTKILOS_" + sGXsfl_178_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFTTKilos_Internalname ;
         wbErr = true ;
         A13556FTTKilos = DecimalUtil.ZERO ;
         n13556FTTKilos = false ;
      }
      else
      {
         A13556FTTKilos = localUtil.ctond( httpContext.cgiGet( edtFTTKilos_Internalname)) ;
         n13556FTTKilos = false ;
      }
      GXCCtl = "Z13548FTFProceso_" + sGXsfl_178_idx ;
      Z13548FTFProceso = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13549FTFOrden_" + sGXsfl_178_idx ;
      Z13549FTFOrden = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13560FTMaquina_" + sGXsfl_178_idx ;
      Z13560FTMaquina = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13550FTFFase_" + sGXsfl_178_idx ;
      Z13550FTFFase = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13551FTFFaseDsc_" + sGXsfl_178_idx ;
      Z13551FTFFaseDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13552FTFEstado_" + sGXsfl_178_idx ;
      Z13552FTFEstado = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13553FTFInicio_" + sGXsfl_178_idx ;
      Z13553FTFInicio = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z13554FTFFin_" + sGXsfl_178_idx ;
      Z13554FTFFin = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z13555FTFMetros_" + sGXsfl_178_idx ;
      Z13555FTFMetros = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13556FTTKilos_" + sGXsfl_178_idx ;
      Z13556FTTKilos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1854_" + sGXsfl_178_idx ;
      nRcdDeleted_1854 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1854_" + sGXsfl_178_idx ;
      nRcdExists_1854 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1854_" + sGXsfl_178_idx ;
      nIsMod_1854 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_1931853( )
   {
      edtavnRcdDeleted_1853_Internalname = "vNRCDDELETED_1853_"+sGXsfl_193_idx ;
      edtFTPieza_Internalname = "FTPIEZA_"+sGXsfl_193_idx ;
      edtFTPMetros_Internalname = "FTPMETROS_"+sGXsfl_193_idx ;
      edtFTPKilos_Internalname = "FTPKILOS_"+sGXsfl_193_idx ;
      edtFTPAnc_Internalname = "FTPANC_"+sGXsfl_193_idx ;
      edtFTPUbicaci_Internalname = "FTPUBICACI_"+sGXsfl_193_idx ;
      edtFTPMtsAut_Internalname = "FTPMTSAUT_"+sGXsfl_193_idx ;
      edtFTPKgsAut_Internalname = "FTPKGSAUT_"+sGXsfl_193_idx ;
      edtFTPPiezaOr_Internalname = "FTPPIEZAOR_"+sGXsfl_193_idx ;
   }

   public void subsflControlProps_fel_1931853( )
   {
      edtavnRcdDeleted_1853_Internalname = "vNRCDDELETED_1853_"+sGXsfl_193_fel_idx ;
      edtFTPieza_Internalname = "FTPIEZA_"+sGXsfl_193_fel_idx ;
      edtFTPMetros_Internalname = "FTPMETROS_"+sGXsfl_193_fel_idx ;
      edtFTPKilos_Internalname = "FTPKILOS_"+sGXsfl_193_fel_idx ;
      edtFTPAnc_Internalname = "FTPANC_"+sGXsfl_193_fel_idx ;
      edtFTPUbicaci_Internalname = "FTPUBICACI_"+sGXsfl_193_fel_idx ;
      edtFTPMtsAut_Internalname = "FTPMTSAUT_"+sGXsfl_193_fel_idx ;
      edtFTPKgsAut_Internalname = "FTPKGSAUT_"+sGXsfl_193_fel_idx ;
      edtFTPPiezaOr_Internalname = "FTPPIEZAOR_"+sGXsfl_193_fel_idx ;
   }

   public void addRow1OI1853( )
   {
      nGXsfl_193_idx = (int)(nGXsfl_193_idx+1) ;
      sGXsfl_193_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_193_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1931853( ) ;
      sendRow1OI1853( ) ;
   }

   public void sendRow1OI1853( )
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
         if ( ((int)((nGXsfl_193_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1853_" + sGXsfl_193_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 194,'',false,'" + sGXsfl_193_idx + "',193)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1853_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1853, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1853_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1853), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1853), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,194);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1853_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1853_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(193),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1853_" + sGXsfl_193_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 195,'',false,'" + sGXsfl_193_idx + "',193)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTPieza_Internalname,GXutil.rtrim( A13543FTPieza),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,195);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTPieza_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFTPieza_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(193),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1853_" + sGXsfl_193_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 196,'',false,'" + sGXsfl_193_idx + "',193)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTPMetros_Internalname,GXutil.ltrim( localUtil.ntoc( A13544FTPMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFTPMetros_Enabled!=0) ? localUtil.format( A13544FTPMetros, "ZZZZZ9.99") : localUtil.format( A13544FTPMetros, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,196);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTPMetros_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFTPMetros_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(193),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1853_" + sGXsfl_193_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 197,'',false,'" + sGXsfl_193_idx + "',193)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTPKilos_Internalname,GXutil.ltrim( localUtil.ntoc( A13545FTPKilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFTPKilos_Enabled!=0) ? localUtil.format( A13545FTPKilos, "ZZZZZ9.99") : localUtil.format( A13545FTPKilos, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,197);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTPKilos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFTPKilos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(193),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1853_" + sGXsfl_193_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 198,'',false,'" + sGXsfl_193_idx + "',193)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTPAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A13546FTPAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFTPAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13546FTPAnc), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13546FTPAnc), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,198);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTPAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFTPAnc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(193),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1853_" + sGXsfl_193_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 199,'',false,'" + sGXsfl_193_idx + "',193)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTPUbicaci_Internalname,GXutil.rtrim( A13547FTPUbicaci),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,199);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTPUbicaci_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFTPUbicaci_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(193),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1853_" + sGXsfl_193_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 200,'',false,'" + sGXsfl_193_idx + "',193)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTPMtsAut_Internalname,GXutil.ltrim( localUtil.ntoc( A13557FTPMtsAut, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFTPMtsAut_Enabled!=0) ? localUtil.format( A13557FTPMtsAut, "ZZZZZ9.99") : localUtil.format( A13557FTPMtsAut, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,200);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTPMtsAut_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFTPMtsAut_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(193),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1853_" + sGXsfl_193_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 201,'',false,'" + sGXsfl_193_idx + "',193)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTPKgsAut_Internalname,GXutil.ltrim( localUtil.ntoc( A13558FTPKgsAut, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFTPKgsAut_Enabled!=0) ? localUtil.format( A13558FTPKgsAut, "ZZZZZ9.99") : localUtil.format( A13558FTPKgsAut, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,201);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTPKgsAut_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFTPKgsAut_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(193),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1853_" + sGXsfl_193_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 202,'',false,'" + sGXsfl_193_idx + "',193)\"" ;
      ROClassString = "Attribute" ;
      Grid4Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFTPPiezaOr_Internalname,GXutil.rtrim( A13559FTPPiezaOr),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,202);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFTPPiezaOr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFTPPiezaOr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(193),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid4Row);
      send_integrity_lvl_hashes1OI1853( ) ;
      GXCCtl = "Z13543FTPieza_" + sGXsfl_193_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13543FTPieza));
      GXCCtl = "Z13544FTPMetros_" + sGXsfl_193_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13544FTPMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13545FTPKilos_" + sGXsfl_193_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13545FTPKilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13546FTPAnc_" + sGXsfl_193_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13546FTPAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13547FTPUbicaci_" + sGXsfl_193_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13547FTPUbicaci));
      GXCCtl = "Z13557FTPMtsAut_" + sGXsfl_193_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13557FTPMtsAut, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13558FTPKgsAut_" + sGXsfl_193_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13558FTPKgsAut, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13559FTPPiezaOr_" + sGXsfl_193_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13559FTPPiezaOr));
      GXCCtl = "nRcdDeleted_1853_" + sGXsfl_193_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1853, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1853_" + sGXsfl_193_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1853, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1853_" + sGXsfl_193_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1853, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1853_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1853_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTPIEZA_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPieza_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTPMETROS_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPMetros_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTPKILOS_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPKilos_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTPANC_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTPUBICACI_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPUbicaci_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTPMTSAUT_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPMtsAut_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTPKGSAUT_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPKgsAut_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FTPPIEZAOR_"+sGXsfl_193_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPPiezaOr_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid4Container.AddRow(Grid4Row);
   }

   public void readRow1OI1853( )
   {
      nGXsfl_193_idx = (int)(nGXsfl_193_idx+1) ;
      sGXsfl_193_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_193_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1931853( ) ;
      edtavnRcdDeleted_1853_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1853_"+sGXsfl_193_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTPieza_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTPIEZA_"+sGXsfl_193_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTPMetros_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTPMETROS_"+sGXsfl_193_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTPKilos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTPKILOS_"+sGXsfl_193_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTPAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTPANC_"+sGXsfl_193_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTPUbicaci_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTPUBICACI_"+sGXsfl_193_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTPMtsAut_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTPMTSAUT_"+sGXsfl_193_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTPKgsAut_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTPKGSAUT_"+sGXsfl_193_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFTPPiezaOr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FTPPIEZAOR_"+sGXsfl_193_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1853_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1853_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1853");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1853_Internalname ;
         wbErr = true ;
         nRcdDeleted_1853 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1853 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1853_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A13543FTPieza = httpContext.cgiGet( edtFTPieza_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFTPMetros_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFTPMetros_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "FTPMETROS_" + sGXsfl_193_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFTPMetros_Internalname ;
         wbErr = true ;
         A13544FTPMetros = DecimalUtil.ZERO ;
         n13544FTPMetros = false ;
      }
      else
      {
         A13544FTPMetros = localUtil.ctond( httpContext.cgiGet( edtFTPMetros_Internalname)) ;
         n13544FTPMetros = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFTPKilos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFTPKilos_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "FTPKILOS_" + sGXsfl_193_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFTPKilos_Internalname ;
         wbErr = true ;
         A13545FTPKilos = DecimalUtil.ZERO ;
         n13545FTPKilos = false ;
      }
      else
      {
         A13545FTPKilos = localUtil.ctond( httpContext.cgiGet( edtFTPKilos_Internalname)) ;
         n13545FTPKilos = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFTPAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFTPAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "FTPANC_" + sGXsfl_193_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFTPAnc_Internalname ;
         wbErr = true ;
         A13546FTPAnc = (short)(0) ;
         n13546FTPAnc = false ;
      }
      else
      {
         A13546FTPAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtFTPAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13546FTPAnc = false ;
      }
      A13547FTPUbicaci = httpContext.cgiGet( edtFTPUbicaci_Internalname) ;
      n13547FTPUbicaci = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFTPMtsAut_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFTPMtsAut_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "FTPMTSAUT_" + sGXsfl_193_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFTPMtsAut_Internalname ;
         wbErr = true ;
         A13557FTPMtsAut = DecimalUtil.ZERO ;
         n13557FTPMtsAut = false ;
      }
      else
      {
         A13557FTPMtsAut = localUtil.ctond( httpContext.cgiGet( edtFTPMtsAut_Internalname)) ;
         n13557FTPMtsAut = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFTPKgsAut_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFTPKgsAut_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "FTPKGSAUT_" + sGXsfl_193_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFTPKgsAut_Internalname ;
         wbErr = true ;
         A13558FTPKgsAut = DecimalUtil.ZERO ;
         n13558FTPKgsAut = false ;
      }
      else
      {
         A13558FTPKgsAut = localUtil.ctond( httpContext.cgiGet( edtFTPKgsAut_Internalname)) ;
         n13558FTPKgsAut = false ;
      }
      A13559FTPPiezaOr = httpContext.cgiGet( edtFTPPiezaOr_Internalname) ;
      n13559FTPPiezaOr = false ;
      GXCCtl = "Z13543FTPieza_" + sGXsfl_193_idx ;
      Z13543FTPieza = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13544FTPMetros_" + sGXsfl_193_idx ;
      Z13544FTPMetros = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13545FTPKilos_" + sGXsfl_193_idx ;
      Z13545FTPKilos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13546FTPAnc_" + sGXsfl_193_idx ;
      Z13546FTPAnc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13547FTPUbicaci_" + sGXsfl_193_idx ;
      Z13547FTPUbicaci = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13557FTPMtsAut_" + sGXsfl_193_idx ;
      Z13557FTPMtsAut = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13558FTPKgsAut_" + sGXsfl_193_idx ;
      Z13558FTPKgsAut = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13559FTPPiezaOr_" + sGXsfl_193_idx ;
      Z13559FTPPiezaOr = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1853_" + sGXsfl_193_idx ;
      nRcdDeleted_1853 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1853_" + sGXsfl_193_idx ;
      nRcdExists_1853 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1853_" + sGXsfl_193_idx ;
      nIsMod_1853 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtFTCLinea_Enabled = edtFTCLinea_Enabled ;
      defedtFTPieza_Enabled = edtFTPieza_Enabled ;
      defedtFTFOrden_Enabled = edtFTFOrden_Enabled ;
      defedtFTFProceso_Enabled = edtFTFProceso_Enabled ;
      defedtFTCLote_Enabled = edtFTCLote_Enabled ;
   }

   public void confirmValues1OI0( )
   {
      nGXsfl_130_idx = 0 ;
      sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1301860( ) ;
      while ( nGXsfl_130_idx < nRC_GXsfl_130 )
      {
         nGXsfl_130_idx = (int)(nGXsfl_130_idx+1) ;
         sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1301860( ) ;
         httpContext.changePostValue( "Z13592FTCLote_"+sGXsfl_130_idx, httpContext.cgiGet( "ZT_"+"Z13592FTCLote_"+sGXsfl_130_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13592FTCLote_"+sGXsfl_130_idx) ;
         httpContext.changePostValue( "Z13593FTCEmpesa_"+sGXsfl_130_idx, httpContext.cgiGet( "ZT_"+"Z13593FTCEmpesa_"+sGXsfl_130_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13593FTCEmpesa_"+sGXsfl_130_idx) ;
         httpContext.changePostValue( "Z13594FTCEmpesaE_"+sGXsfl_130_idx, httpContext.cgiGet( "ZT_"+"Z13594FTCEmpesaE_"+sGXsfl_130_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13594FTCEmpesaE_"+sGXsfl_130_idx) ;
         httpContext.changePostValue( "Z13595FTCAncho_"+sGXsfl_130_idx, httpContext.cgiGet( "ZT_"+"Z13595FTCAncho_"+sGXsfl_130_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13595FTCAncho_"+sGXsfl_130_idx) ;
         httpContext.changePostValue( "Z13596FTCMetros_"+sGXsfl_130_idx, httpContext.cgiGet( "ZT_"+"Z13596FTCMetros_"+sGXsfl_130_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13596FTCMetros_"+sGXsfl_130_idx) ;
         httpContext.changePostValue( "Z13597FTCUltLine_"+sGXsfl_130_idx, httpContext.cgiGet( "ZT_"+"Z13597FTCUltLine_"+sGXsfl_130_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13597FTCUltLine_"+sGXsfl_130_idx) ;
      }
      nGXsfl_167_idx = 0 ;
      sGXsfl_167_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_167_idx), 4, 0), (short)(4), "0") + sGXsfl_130_idx ;
      subsflControlProps_1671861( ) ;
      while ( nGXsfl_167_idx < nRC_GXsfl_167 )
      {
         nGXsfl_167_idx = (int)(nGXsfl_167_idx+1) ;
         sGXsfl_167_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_167_idx), 4, 0), (short)(4), "0") + sGXsfl_130_idx ;
         subsflControlProps_1671861( ) ;
         httpContext.changePostValue( "Z13598FTCLinea_"+sGXsfl_167_idx, httpContext.cgiGet( "ZT_"+"Z13598FTCLinea_"+sGXsfl_167_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13598FTCLinea_"+sGXsfl_167_idx) ;
         httpContext.changePostValue( "Z13599FTCPresen_"+sGXsfl_167_idx, httpContext.cgiGet( "ZT_"+"Z13599FTCPresen_"+sGXsfl_167_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13599FTCPresen_"+sGXsfl_167_idx) ;
         httpContext.changePostValue( "Z13600FTCLong_"+sGXsfl_167_idx, httpContext.cgiGet( "ZT_"+"Z13600FTCLong_"+sGXsfl_167_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13600FTCLong_"+sGXsfl_167_idx) ;
         httpContext.changePostValue( "Z13601FTCLMts_"+sGXsfl_167_idx, httpContext.cgiGet( "ZT_"+"Z13601FTCLMts_"+sGXsfl_167_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13601FTCLMts_"+sGXsfl_167_idx) ;
         httpContext.changePostValue( "Z13602FTCLObs_"+sGXsfl_167_idx, httpContext.cgiGet( "ZT_"+"Z13602FTCLObs_"+sGXsfl_167_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13602FTCLObs_"+sGXsfl_167_idx) ;
         httpContext.changePostValue( "Z13603FTCLEtique_"+sGXsfl_167_idx, httpContext.cgiGet( "ZT_"+"Z13603FTCLEtique_"+sGXsfl_167_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13603FTCLEtique_"+sGXsfl_167_idx) ;
      }
      nGXsfl_178_idx = 0 ;
      sGXsfl_178_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_178_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1781854( ) ;
      while ( nGXsfl_178_idx < nRC_GXsfl_178 )
      {
         nGXsfl_178_idx = (int)(nGXsfl_178_idx+1) ;
         sGXsfl_178_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_178_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1781854( ) ;
         httpContext.changePostValue( "Z13548FTFProceso_"+sGXsfl_178_idx, httpContext.cgiGet( "ZT_"+"Z13548FTFProceso_"+sGXsfl_178_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13548FTFProceso_"+sGXsfl_178_idx) ;
         httpContext.changePostValue( "Z13549FTFOrden_"+sGXsfl_178_idx, httpContext.cgiGet( "ZT_"+"Z13549FTFOrden_"+sGXsfl_178_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13549FTFOrden_"+sGXsfl_178_idx) ;
         httpContext.changePostValue( "Z13560FTMaquina_"+sGXsfl_178_idx, httpContext.cgiGet( "ZT_"+"Z13560FTMaquina_"+sGXsfl_178_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13560FTMaquina_"+sGXsfl_178_idx) ;
         httpContext.changePostValue( "Z13550FTFFase_"+sGXsfl_178_idx, httpContext.cgiGet( "ZT_"+"Z13550FTFFase_"+sGXsfl_178_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13550FTFFase_"+sGXsfl_178_idx) ;
         httpContext.changePostValue( "Z13551FTFFaseDsc_"+sGXsfl_178_idx, httpContext.cgiGet( "ZT_"+"Z13551FTFFaseDsc_"+sGXsfl_178_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13551FTFFaseDsc_"+sGXsfl_178_idx) ;
         httpContext.changePostValue( "Z13552FTFEstado_"+sGXsfl_178_idx, httpContext.cgiGet( "ZT_"+"Z13552FTFEstado_"+sGXsfl_178_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13552FTFEstado_"+sGXsfl_178_idx) ;
         httpContext.changePostValue( "Z13553FTFInicio_"+sGXsfl_178_idx, httpContext.cgiGet( "ZT_"+"Z13553FTFInicio_"+sGXsfl_178_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13553FTFInicio_"+sGXsfl_178_idx) ;
         httpContext.changePostValue( "Z13554FTFFin_"+sGXsfl_178_idx, httpContext.cgiGet( "ZT_"+"Z13554FTFFin_"+sGXsfl_178_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13554FTFFin_"+sGXsfl_178_idx) ;
         httpContext.changePostValue( "Z13555FTFMetros_"+sGXsfl_178_idx, httpContext.cgiGet( "ZT_"+"Z13555FTFMetros_"+sGXsfl_178_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13555FTFMetros_"+sGXsfl_178_idx) ;
         httpContext.changePostValue( "Z13556FTTKilos_"+sGXsfl_178_idx, httpContext.cgiGet( "ZT_"+"Z13556FTTKilos_"+sGXsfl_178_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13556FTTKilos_"+sGXsfl_178_idx) ;
      }
      nGXsfl_193_idx = 0 ;
      sGXsfl_193_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_193_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1931853( ) ;
      while ( nGXsfl_193_idx < nRC_GXsfl_193 )
      {
         nGXsfl_193_idx = (int)(nGXsfl_193_idx+1) ;
         sGXsfl_193_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_193_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1931853( ) ;
         httpContext.changePostValue( "Z13543FTPieza_"+sGXsfl_193_idx, httpContext.cgiGet( "ZT_"+"Z13543FTPieza_"+sGXsfl_193_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13543FTPieza_"+sGXsfl_193_idx) ;
         httpContext.changePostValue( "Z13544FTPMetros_"+sGXsfl_193_idx, httpContext.cgiGet( "ZT_"+"Z13544FTPMetros_"+sGXsfl_193_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13544FTPMetros_"+sGXsfl_193_idx) ;
         httpContext.changePostValue( "Z13545FTPKilos_"+sGXsfl_193_idx, httpContext.cgiGet( "ZT_"+"Z13545FTPKilos_"+sGXsfl_193_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13545FTPKilos_"+sGXsfl_193_idx) ;
         httpContext.changePostValue( "Z13546FTPAnc_"+sGXsfl_193_idx, httpContext.cgiGet( "ZT_"+"Z13546FTPAnc_"+sGXsfl_193_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13546FTPAnc_"+sGXsfl_193_idx) ;
         httpContext.changePostValue( "Z13547FTPUbicaci_"+sGXsfl_193_idx, httpContext.cgiGet( "ZT_"+"Z13547FTPUbicaci_"+sGXsfl_193_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13547FTPUbicaci_"+sGXsfl_193_idx) ;
         httpContext.changePostValue( "Z13557FTPMtsAut_"+sGXsfl_193_idx, httpContext.cgiGet( "ZT_"+"Z13557FTPMtsAut_"+sGXsfl_193_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13557FTPMtsAut_"+sGXsfl_193_idx) ;
         httpContext.changePostValue( "Z13558FTPKgsAut_"+sGXsfl_193_idx, httpContext.cgiGet( "ZT_"+"Z13558FTPKgsAut_"+sGXsfl_193_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13558FTPKgsAut_"+sGXsfl_193_idx) ;
         httpContext.changePostValue( "Z13559FTPPiezaOr_"+sGXsfl_193_idx, httpContext.cgiGet( "ZT_"+"Z13559FTPPiezaOr_"+sGXsfl_193_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13559FTPPiezaOr_"+sGXsfl_193_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tfrtohd", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z13528FTHdr", GXutil.ltrim( localUtil.ntoc( Z13528FTHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13529FTHdrR", GXutil.ltrim( localUtil.ntoc( Z13529FTHdrR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13530FTHdrP", GXutil.rtrim( Z13530FTHdrP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13531FTClicod", GXutil.ltrim( localUtil.ntoc( Z13531FTClicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13532FTCliNom", GXutil.rtrim( Z13532FTCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13533FTArticulo", GXutil.rtrim( Z13533FTArticulo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13534FTArtDsc", GXutil.rtrim( Z13534FTArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13535FTAnc", GXutil.ltrim( localUtil.ntoc( Z13535FTAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13536FTGrm2", GXutil.ltrim( localUtil.ntoc( Z13536FTGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13537FTColor", GXutil.rtrim( Z13537FTColor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13538FTColorNum", GXutil.ltrim( localUtil.ntoc( Z13538FTColorNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13539FTEstado", GXutil.ltrim( localUtil.ntoc( Z13539FTEstado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13540FTMetros", GXutil.ltrim( localUtil.ntoc( Z13540FTMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13541FTKilos", GXutil.ltrim( localUtil.ntoc( Z13541FTKilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13542FTPzas", GXutil.ltrim( localUtil.ntoc( Z13542FTPzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13561FTSituacio", GXutil.ltrim( localUtil.ntoc( Z13561FTSituacio, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13588FTArticExt", GXutil.rtrim( Z13588FTArticExt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13589FTHdrExt", GXutil.rtrim( Z13589FTHdrExt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13590FTTipo", GXutil.rtrim( Z13590FTTipo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13591FTObs", Z13591FTObs);
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_130", GXutil.ltrim( localUtil.ntoc( nGXsfl_130_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_178", GXutil.ltrim( localUtil.ntoc( nGXsfl_178_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_193", GXutil.ltrim( localUtil.ntoc( nGXsfl_193_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tfrtohd", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TFRTOHD" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla Intercambio HDR", "") ;
   }

   public void initializeNonKey1OI1852( )
   {
      A13531FTClicod = 0 ;
      n13531FTClicod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13531FTClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13531FTClicod), 6, 0));
      A13532FTCliNom = "" ;
      n13532FTCliNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13532FTCliNom", A13532FTCliNom);
      A13533FTArticulo = "" ;
      n13533FTArticulo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13533FTArticulo", A13533FTArticulo);
      A13534FTArtDsc = "" ;
      n13534FTArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13534FTArtDsc", A13534FTArtDsc);
      A13535FTAnc = (short)(0) ;
      n13535FTAnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13535FTAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13535FTAnc), 3, 0));
      A13536FTGrm2 = (short)(0) ;
      n13536FTGrm2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13536FTGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13536FTGrm2), 4, 0));
      A13537FTColor = "" ;
      n13537FTColor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13537FTColor", A13537FTColor);
      A13538FTColorNum = 0 ;
      n13538FTColorNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13538FTColorNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13538FTColorNum), 6, 0));
      A13539FTEstado = (byte)(0) ;
      n13539FTEstado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13539FTEstado", GXutil.str( A13539FTEstado, 1, 0));
      A13540FTMetros = DecimalUtil.ZERO ;
      n13540FTMetros = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13540FTMetros", GXutil.ltrimstr( A13540FTMetros, 9, 2));
      A13541FTKilos = DecimalUtil.ZERO ;
      n13541FTKilos = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13541FTKilos", GXutil.ltrimstr( A13541FTKilos, 9, 2));
      A13542FTPzas = 0 ;
      n13542FTPzas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13542FTPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13542FTPzas), 6, 0));
      A13561FTSituacio = (byte)(0) ;
      n13561FTSituacio = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13561FTSituacio", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13561FTSituacio), 2, 0));
      A13588FTArticExt = "" ;
      n13588FTArticExt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13588FTArticExt", A13588FTArticExt);
      A13589FTHdrExt = "" ;
      n13589FTHdrExt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13589FTHdrExt", A13589FTHdrExt);
      A13590FTTipo = "" ;
      n13590FTTipo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13590FTTipo", A13590FTTipo);
      A13591FTObs = "" ;
      n13591FTObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13591FTObs", A13591FTObs);
      Z13531FTClicod = 0 ;
      Z13532FTCliNom = "" ;
      Z13533FTArticulo = "" ;
      Z13534FTArtDsc = "" ;
      Z13535FTAnc = (short)(0) ;
      Z13536FTGrm2 = (short)(0) ;
      Z13537FTColor = "" ;
      Z13538FTColorNum = 0 ;
      Z13539FTEstado = (byte)(0) ;
      Z13540FTMetros = DecimalUtil.ZERO ;
      Z13541FTKilos = DecimalUtil.ZERO ;
      Z13542FTPzas = 0 ;
      Z13561FTSituacio = (byte)(0) ;
      Z13588FTArticExt = "" ;
      Z13589FTHdrExt = "" ;
      Z13590FTTipo = "" ;
      Z13591FTObs = "" ;
   }

   public void initAll1OI1852( )
   {
      A13528FTHdr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13528FTHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13528FTHdr), 8, 0));
      A13529FTHdrR = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13529FTHdrR", GXutil.str( A13529FTHdrR, 1, 0));
      A13530FTHdrP = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13530FTHdrP", A13530FTHdrP);
      initializeNonKey1OI1852( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1OI1860( )
   {
      A13593FTCEmpesa = "" ;
      n13593FTCEmpesa = false ;
      A13594FTCEmpesaE = "" ;
      n13594FTCEmpesaE = false ;
      A13595FTCAncho = (short)(0) ;
      n13595FTCAncho = false ;
      A13596FTCMetros = DecimalUtil.ZERO ;
      n13596FTCMetros = false ;
      A13597FTCUltLine = (short)(0) ;
      n13597FTCUltLine = false ;
      Z13593FTCEmpesa = "" ;
      Z13594FTCEmpesaE = "" ;
      Z13595FTCAncho = (short)(0) ;
      Z13596FTCMetros = DecimalUtil.ZERO ;
      Z13597FTCUltLine = (short)(0) ;
   }

   public void initAll1OI1860( )
   {
      A13592FTCLote = "" ;
      initializeNonKey1OI1860( ) ;
   }

   public void standaloneModalInsert1OI1860( )
   {
   }

   public void initializeNonKey1OI1861( )
   {
      A13599FTCPresen = "" ;
      n13599FTCPresen = false ;
      A13600FTCLong = (short)(0) ;
      n13600FTCLong = false ;
      A13601FTCLMts = DecimalUtil.ZERO ;
      n13601FTCLMts = false ;
      A13602FTCLObs = "" ;
      n13602FTCLObs = false ;
      A13603FTCLEtique = "" ;
      n13603FTCLEtique = false ;
      Z13599FTCPresen = "" ;
      Z13600FTCLong = (short)(0) ;
      Z13601FTCLMts = DecimalUtil.ZERO ;
      Z13602FTCLObs = "" ;
      Z13603FTCLEtique = "" ;
   }

   public void initAll1OI1861( )
   {
      A13598FTCLinea = (short)(0) ;
      initializeNonKey1OI1861( ) ;
   }

   public void standaloneModalInsert1OI1861( )
   {
   }

   public void initializeNonKey1OI1854( )
   {
      A13560FTMaquina = "" ;
      n13560FTMaquina = false ;
      A13550FTFFase = "" ;
      n13550FTFFase = false ;
      A13551FTFFaseDsc = "" ;
      n13551FTFFaseDsc = false ;
      A13552FTFEstado = (byte)(0) ;
      n13552FTFEstado = false ;
      A13553FTFInicio = GXutil.resetTime( GXutil.nullDate() );
      n13553FTFInicio = false ;
      A13554FTFFin = GXutil.resetTime( GXutil.nullDate() );
      n13554FTFFin = false ;
      A13555FTFMetros = DecimalUtil.ZERO ;
      n13555FTFMetros = false ;
      A13556FTTKilos = DecimalUtil.ZERO ;
      n13556FTTKilos = false ;
      Z13560FTMaquina = "" ;
      Z13550FTFFase = "" ;
      Z13551FTFFaseDsc = "" ;
      Z13552FTFEstado = (byte)(0) ;
      Z13553FTFInicio = GXutil.resetTime( GXutil.nullDate() );
      Z13554FTFFin = GXutil.resetTime( GXutil.nullDate() );
      Z13555FTFMetros = DecimalUtil.ZERO ;
      Z13556FTTKilos = DecimalUtil.ZERO ;
   }

   public void initAll1OI1854( )
   {
      A13548FTFProceso = "" ;
      A13549FTFOrden = (short)(0) ;
      initializeNonKey1OI1854( ) ;
   }

   public void standaloneModalInsert1OI1854( )
   {
   }

   public void initializeNonKey1OI1853( )
   {
      A13544FTPMetros = DecimalUtil.ZERO ;
      n13544FTPMetros = false ;
      A13545FTPKilos = DecimalUtil.ZERO ;
      n13545FTPKilos = false ;
      A13546FTPAnc = (short)(0) ;
      n13546FTPAnc = false ;
      A13547FTPUbicaci = "" ;
      n13547FTPUbicaci = false ;
      A13557FTPMtsAut = DecimalUtil.ZERO ;
      n13557FTPMtsAut = false ;
      A13558FTPKgsAut = DecimalUtil.ZERO ;
      n13558FTPKgsAut = false ;
      A13559FTPPiezaOr = "" ;
      n13559FTPPiezaOr = false ;
      Z13544FTPMetros = DecimalUtil.ZERO ;
      Z13545FTPKilos = DecimalUtil.ZERO ;
      Z13546FTPAnc = (short)(0) ;
      Z13547FTPUbicaci = "" ;
      Z13557FTPMtsAut = DecimalUtil.ZERO ;
      Z13558FTPKgsAut = DecimalUtil.ZERO ;
      Z13559FTPPiezaOr = "" ;
   }

   public void initAll1OI1853( )
   {
      A13543FTPieza = "" ;
      initializeNonKey1OI1853( ) ;
   }

   public void standaloneModalInsert1OI1853( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415105286", true, true);
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
      httpContext.AddJavascriptSource("tfrtohd.js", "?202682415105286", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1860( )
   {
      edtFTCLote_Enabled = defedtFTCLote_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTCLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCLote_Enabled), 5, 0), !bGXsfl_130_Refreshing);
   }

   public void init_level_properties1861( )
   {
      edtFTCLinea_Enabled = defedtFTCLinea_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTCLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTCLinea_Enabled), 5, 0), !bGXsfl_167_Refreshing);
   }

   public void init_level_properties1854( )
   {
      edtFTFOrden_Enabled = defedtFTFOrden_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTFOrden_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTFOrden_Enabled), 5, 0), !bGXsfl_178_Refreshing);
      edtFTFProceso_Enabled = defedtFTFProceso_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTFProceso_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTFProceso_Enabled), 5, 0), !bGXsfl_178_Refreshing);
   }

   public void init_level_properties1853( )
   {
      edtFTPieza_Enabled = defedtFTPieza_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFTPieza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFTPieza_Enabled), 5, 0), !bGXsfl_193_Refreshing);
   }

   public void startgridcontrol130( )
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
      Grid1Column.AddObjectProperty("Value", lblTextblock23_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13592FTCLote));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCLote_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock24_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13593FTCEmpesa));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCEmpesa_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock25_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13594FTCEmpesaE));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCEmpesaE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock10_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13595FTCAncho, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCAncho_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock27_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13596FTCMetros, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCMetros_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock28_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13597FTCUltLine, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCUltLine_Enabled, (byte)(5), (byte)(0), ".", "")));
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

   public void startgridcontrol178( )
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
      Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1854, (byte)(4), (byte)(0), ".", "")));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1854_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.rtrim( A13548FTFProceso));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFProceso_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13549FTFOrden, (byte)(4), (byte)(0), ".", "")));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFOrden_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.rtrim( A13560FTMaquina));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTMaquina_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.rtrim( A13550FTFFase));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFFase_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.rtrim( A13551FTFFaseDsc));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFFaseDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13552FTFEstado, (byte)(1), (byte)(0), ".", "")));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFEstado_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", localUtil.ttoc( A13553FTFInicio, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFInicio_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", localUtil.ttoc( A13554FTFFin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFFin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13555FTFMetros, (byte)(9), (byte)(2), ".", "")));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTFMetros_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid3Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13556FTTKilos, (byte)(9), (byte)(2), ".", "")));
      Grid3Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTTKilos_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid3Container.AddColumnProperties(Grid3Column);
      Grid3Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid3_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid3_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid3_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid3_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid3Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid3_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol193( )
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
      Grid4Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1853, (byte)(4), (byte)(0), ".", "")));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1853_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.rtrim( A13543FTPieza));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPieza_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13544FTPMetros, (byte)(9), (byte)(2), ".", "")));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPMetros_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13545FTPKilos, (byte)(9), (byte)(2), ".", "")));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPKilos_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13546FTPAnc, (byte)(3), (byte)(0), ".", "")));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.rtrim( A13547FTPUbicaci));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPUbicaci_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13557FTPMtsAut, (byte)(9), (byte)(2), ".", "")));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPMtsAut_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13558FTPKgsAut, (byte)(9), (byte)(2), ".", "")));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPKgsAut_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid4Column.AddObjectProperty("Value", GXutil.rtrim( A13559FTPPiezaOr));
      Grid4Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTPPiezaOr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid4Container.AddColumnProperties(Grid4Column);
      Grid4Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid4_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid4_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid4_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid4_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid4_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid4_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid4Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid4_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol167( )
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
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1861, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1861_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13598FTCLinea, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCLinea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A13599FTCPresen));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCPresen_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13600FTCLong, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCLong_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13601FTCLMts, (byte)(9), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCLMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A13602FTCLObs));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCLObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A13603FTCLEtique));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFTCLEtique_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtFTHdr_Internalname = "FTHDR" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtFTHdrR_Internalname = "FTHDRR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtFTHdrP_Internalname = "FTHDRP" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtFTClicod_Internalname = "FTCLICOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtFTCliNom_Internalname = "FTCLINOM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtFTArticulo_Internalname = "FTARTICULO" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtFTArtDsc_Internalname = "FTARTDSC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtFTAnc_Internalname = "FTANC" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtFTGrm2_Internalname = "FTGRM2" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtFTColor_Internalname = "FTCOLOR" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtFTColorNum_Internalname = "FTCOLORNUM" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtFTEstado_Internalname = "FTESTADO" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtFTMetros_Internalname = "FTMETROS" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtFTKilos_Internalname = "FTKILOS" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtFTPzas_Internalname = "FTPZAS" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtFTSituacio_Internalname = "FTSITUACIO" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtFTArticExt_Internalname = "FTARTICEXT" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtFTHdrExt_Internalname = "FTHDREXT" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtFTTipo_Internalname = "FTTIPO" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtFTObs_Internalname = "FTOBS" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtFTCLote_Internalname = "FTCLOTE" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtFTCEmpesa_Internalname = "FTCEMPESA" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtFTCEmpesaE_Internalname = "FTCEMPESAE" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtFTCAncho_Internalname = "FTCANCHO" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtFTCMetros_Internalname = "FTCMETROS" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtFTCUltLine_Internalname = "FTCULTLINE" ;
      edtavnRcdDeleted_1861_Internalname = "vNRCDDELETED_1861" ;
      edtFTCLinea_Internalname = "FTCLINEA" ;
      edtFTCPresen_Internalname = "FTCPRESEN" ;
      edtFTCLong_Internalname = "FTCLONG" ;
      edtFTCLMts_Internalname = "FTCLMTS" ;
      edtFTCLObs_Internalname = "FTCLOBS" ;
      edtFTCLEtique_Internalname = "FTCLETIQUE" ;
      tblTable3_Internalname = "TABLE3" ;
      edtavnRcdDeleted_1854_Internalname = "vNRCDDELETED_1854" ;
      edtFTFProceso_Internalname = "FTFPROCESO" ;
      edtFTFOrden_Internalname = "FTFORDEN" ;
      edtFTMaquina_Internalname = "FTMAQUINA" ;
      edtFTFFase_Internalname = "FTFFASE" ;
      edtFTFFaseDsc_Internalname = "FTFFASEDSC" ;
      edtFTFEstado_Internalname = "FTFESTADO" ;
      edtFTFInicio_Internalname = "FTFINICIO" ;
      edtFTFFin_Internalname = "FTFFIN" ;
      edtFTFMetros_Internalname = "FTFMETROS" ;
      edtFTTKilos_Internalname = "FTTKILOS" ;
      edtavnRcdDeleted_1853_Internalname = "vNRCDDELETED_1853" ;
      edtFTPieza_Internalname = "FTPIEZA" ;
      edtFTPMetros_Internalname = "FTPMETROS" ;
      edtFTPKilos_Internalname = "FTPKILOS" ;
      edtFTPAnc_Internalname = "FTPANC" ;
      edtFTPUbicaci_Internalname = "FTPUBICACI" ;
      edtFTPMtsAut_Internalname = "FTPMTSAUT" ;
      edtFTPKgsAut_Internalname = "FTPKGSAUT" ;
      edtFTPPiezaOr_Internalname = "FTPPIEZAOR" ;
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
      subGrid2_Allowcollapsing = (byte)(0) ;
      subGrid2_Allowselection = (byte)(0) ;
      subGrid2_Header = "" ;
      subGrid4_Allowcollapsing = (byte)(0) ;
      subGrid4_Allowselection = (byte)(0) ;
      subGrid4_Header = "" ;
      subGrid3_Allowcollapsing = (byte)(0) ;
      subGrid3_Allowselection = (byte)(0) ;
      subGrid3_Header = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      lblTextblock28_Caption = httpContext.getMessage( "Ultima Linea Presentacion", "") ;
      lblTextblock27_Caption = httpContext.getMessage( "Total Metros", "") ;
      lblTextblock10_Caption = httpContext.getMessage( "Ancho (cm)", "") ;
      lblTextblock25_Caption = httpContext.getMessage( "Codigo Empesa ERP", "") ;
      lblTextblock24_Caption = httpContext.getMessage( "Codigo Empesa VERTEX", "") ;
      lblTextblock23_Caption = httpContext.getMessage( "Lote de Tejeduria", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Tabla Intercambio HDR", "") );
      edtFTPPiezaOr_Jsonclick = "" ;
      edtFTPKgsAut_Jsonclick = "" ;
      edtFTPMtsAut_Jsonclick = "" ;
      edtFTPUbicaci_Jsonclick = "" ;
      edtFTPAnc_Jsonclick = "" ;
      edtFTPKilos_Jsonclick = "" ;
      edtFTPMetros_Jsonclick = "" ;
      edtFTPieza_Jsonclick = "" ;
      edtavnRcdDeleted_1853_Jsonclick = "" ;
      subGrid4_Class = "" ;
      subGrid4_Backcolorstyle = (byte)(2) ;
      edtFTTKilos_Jsonclick = "" ;
      edtFTFMetros_Jsonclick = "" ;
      edtFTFFin_Jsonclick = "" ;
      edtFTFInicio_Jsonclick = "" ;
      edtFTFEstado_Jsonclick = "" ;
      edtFTFFaseDsc_Jsonclick = "" ;
      edtFTFFase_Jsonclick = "" ;
      edtFTMaquina_Jsonclick = "" ;
      edtFTFOrden_Jsonclick = "" ;
      edtFTFProceso_Jsonclick = "" ;
      edtavnRcdDeleted_1854_Jsonclick = "" ;
      subGrid3_Class = "" ;
      subGrid3_Backcolorstyle = (byte)(2) ;
      edtFTCLEtique_Jsonclick = "" ;
      edtFTCLObs_Jsonclick = "" ;
      edtFTCLMts_Jsonclick = "" ;
      edtFTCLong_Jsonclick = "" ;
      edtFTCPresen_Jsonclick = "" ;
      edtFTCLinea_Jsonclick = "" ;
      edtavnRcdDeleted_1861_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtFTCUltLine_Jsonclick = "" ;
      edtFTCMetros_Jsonclick = "" ;
      edtFTCAncho_Jsonclick = "" ;
      edtFTCEmpesaE_Jsonclick = "" ;
      edtFTCEmpesa_Jsonclick = "" ;
      edtFTCLote_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtFTCLEtique_Enabled = 1 ;
      edtFTCLObs_Enabled = 1 ;
      edtFTCLMts_Enabled = 1 ;
      edtFTCLong_Enabled = 1 ;
      edtFTCPresen_Enabled = 1 ;
      edtFTCLinea_Enabled = 1 ;
      edtavnRcdDeleted_1861_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtFTPPiezaOr_Enabled = 1 ;
      edtFTPKgsAut_Enabled = 1 ;
      edtFTPMtsAut_Enabled = 1 ;
      edtFTPUbicaci_Enabled = 1 ;
      edtFTPAnc_Enabled = 1 ;
      edtFTPKilos_Enabled = 1 ;
      edtFTPMetros_Enabled = 1 ;
      edtFTPieza_Enabled = 1 ;
      edtavnRcdDeleted_1853_Enabled = 1 ;
      edtFTTKilos_Enabled = 1 ;
      edtFTFMetros_Enabled = 1 ;
      edtFTFFin_Enabled = 1 ;
      edtFTFInicio_Enabled = 1 ;
      edtFTFEstado_Enabled = 1 ;
      edtFTFFaseDsc_Enabled = 1 ;
      edtFTFFase_Enabled = 1 ;
      edtFTMaquina_Enabled = 1 ;
      edtFTFOrden_Enabled = 1 ;
      edtFTFProceso_Enabled = 1 ;
      edtavnRcdDeleted_1854_Enabled = 1 ;
      edtFTCUltLine_Enabled = 1 ;
      edtFTCMetros_Enabled = 1 ;
      edtFTCAncho_Enabled = 1 ;
      edtFTCEmpesaE_Enabled = 1 ;
      edtFTCEmpesa_Enabled = 1 ;
      edtFTCLote_Enabled = 1 ;
      edtFTObs_Backcolor = (int)(0xFFFFFF) ;
      edtFTObs_Enabled = 1 ;
      edtFTTipo_Jsonclick = "" ;
      edtFTTipo_Backcolor = (int)(0xFFFFFF) ;
      edtFTTipo_Enabled = 1 ;
      edtFTHdrExt_Jsonclick = "" ;
      edtFTHdrExt_Backcolor = (int)(0xFFFFFF) ;
      edtFTHdrExt_Enabled = 1 ;
      edtFTArticExt_Jsonclick = "" ;
      edtFTArticExt_Backcolor = (int)(0xFFFFFF) ;
      edtFTArticExt_Enabled = 1 ;
      edtFTSituacio_Jsonclick = "" ;
      edtFTSituacio_Backcolor = (int)(0xFFFFFF) ;
      edtFTSituacio_Enabled = 1 ;
      edtFTPzas_Jsonclick = "" ;
      edtFTPzas_Backcolor = (int)(0xFFFFFF) ;
      edtFTPzas_Enabled = 1 ;
      edtFTKilos_Jsonclick = "" ;
      edtFTKilos_Backcolor = (int)(0xFFFFFF) ;
      edtFTKilos_Enabled = 1 ;
      edtFTMetros_Jsonclick = "" ;
      edtFTMetros_Backcolor = (int)(0xFFFFFF) ;
      edtFTMetros_Enabled = 1 ;
      edtFTEstado_Jsonclick = "" ;
      edtFTEstado_Backcolor = (int)(0xFFFFFF) ;
      edtFTEstado_Enabled = 1 ;
      edtFTColorNum_Jsonclick = "" ;
      edtFTColorNum_Backcolor = (int)(0xFFFFFF) ;
      edtFTColorNum_Enabled = 1 ;
      edtFTColor_Jsonclick = "" ;
      edtFTColor_Backcolor = (int)(0xFFFFFF) ;
      edtFTColor_Enabled = 1 ;
      edtFTGrm2_Jsonclick = "" ;
      edtFTGrm2_Backcolor = (int)(0xFFFFFF) ;
      edtFTGrm2_Enabled = 1 ;
      edtFTAnc_Jsonclick = "" ;
      edtFTAnc_Backcolor = (int)(0xFFFFFF) ;
      edtFTAnc_Enabled = 1 ;
      edtFTArtDsc_Jsonclick = "" ;
      edtFTArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtFTArtDsc_Enabled = 1 ;
      edtFTArticulo_Jsonclick = "" ;
      edtFTArticulo_Backcolor = (int)(0xFFFFFF) ;
      edtFTArticulo_Enabled = 1 ;
      edtFTCliNom_Jsonclick = "" ;
      edtFTCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtFTCliNom_Enabled = 1 ;
      edtFTClicod_Jsonclick = "" ;
      edtFTClicod_Backcolor = (int)(0xFFFFFF) ;
      edtFTClicod_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtFTHdrP_Jsonclick = "" ;
      edtFTHdrP_Backcolor = (int)(0xFFFFFF) ;
      edtFTHdrP_Enabled = 1 ;
      edtFTHdrR_Jsonclick = "" ;
      edtFTHdrR_Backcolor = (int)(0xFFFFFF) ;
      edtFTHdrR_Enabled = 1 ;
      edtFTHdr_Jsonclick = "" ;
      edtFTHdr_Backcolor = (int)(0xFFFFFF) ;
      edtFTHdr_Enabled = 1 ;
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
      subsflControlProps_1301860( ) ;
      while ( nGXsfl_130_idx <= nRC_GXsfl_130 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1OI1860( ) ;
         standaloneModal1OI1860( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1OI1860( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_130_idx = (int)(nGXsfl_130_idx+1) ;
         sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1301860( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1671861( ) ;
      while ( nGXsfl_167_idx <= nRC_GXsfl_167 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1OI1860( ) ;
         standaloneModal1OI1860( ) ;
         standaloneNotModal1OI1861( ) ;
         standaloneModal1OI1861( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1OI1861( ) ;
         nGXsfl_167_idx = (int)(nGXsfl_167_idx+1) ;
         sGXsfl_167_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_167_idx), 4, 0), (short)(4), "0") + sGXsfl_130_idx ;
         subsflControlProps_1671861( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid2Container)) ;
      /* End function gxnrGrid2_newrow */
   }

   public void gxnrgrid3_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1781854( ) ;
      while ( nGXsfl_178_idx <= nRC_GXsfl_178 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1OI1854( ) ;
         standaloneModal1OI1854( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1OI1854( ) ;
         nGXsfl_178_idx = (int)(nGXsfl_178_idx+1) ;
         sGXsfl_178_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_178_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1781854( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid3Container)) ;
      /* End function gxnrGrid3_newrow */
   }

   public void gxnrgrid4_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1931853( ) ;
      while ( nGXsfl_193_idx <= nRC_GXsfl_193 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1OI1853( ) ;
         standaloneModal1OI1853( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1OI1853( ) ;
         nGXsfl_193_idx = (int)(nGXsfl_193_idx+1) ;
         sGXsfl_193_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_193_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1931853( ) ;
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
      /* Using cursor T01OI46 */
      pr_default.execute(44, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(44) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01OI46_A407EmprNom[0] ;
      n407EmprNom = T01OI46_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(44);
      GX_FocusControl = edtFTClicod_Internalname ;
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

   public void valid_Fthdrp( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A13531FTClicod", GXutil.ltrim( localUtil.ntoc( A13531FTClicod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13532FTCliNom", GXutil.rtrim( A13532FTCliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A13533FTArticulo", GXutil.rtrim( A13533FTArticulo));
      httpContext.ajax_rsp_assign_attri("", false, "A13534FTArtDsc", GXutil.rtrim( A13534FTArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A13535FTAnc", GXutil.ltrim( localUtil.ntoc( A13535FTAnc, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13536FTGrm2", GXutil.ltrim( localUtil.ntoc( A13536FTGrm2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13537FTColor", GXutil.rtrim( A13537FTColor));
      httpContext.ajax_rsp_assign_attri("", false, "A13538FTColorNum", GXutil.ltrim( localUtil.ntoc( A13538FTColorNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13539FTEstado", GXutil.ltrim( localUtil.ntoc( A13539FTEstado, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13540FTMetros", GXutil.ltrim( localUtil.ntoc( A13540FTMetros, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13541FTKilos", GXutil.ltrim( localUtil.ntoc( A13541FTKilos, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13542FTPzas", GXutil.ltrim( localUtil.ntoc( A13542FTPzas, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13561FTSituacio", GXutil.ltrim( localUtil.ntoc( A13561FTSituacio, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13588FTArticExt", GXutil.rtrim( A13588FTArticExt));
      httpContext.ajax_rsp_assign_attri("", false, "A13589FTHdrExt", GXutil.rtrim( A13589FTHdrExt));
      httpContext.ajax_rsp_assign_attri("", false, "A13590FTTipo", GXutil.rtrim( A13590FTTipo));
      httpContext.ajax_rsp_assign_attri("", false, "A13591FTObs", A13591FTObs);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13528FTHdr", GXutil.ltrim( localUtil.ntoc( Z13528FTHdr, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13529FTHdrR", GXutil.ltrim( localUtil.ntoc( Z13529FTHdrR, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13530FTHdrP", GXutil.rtrim( Z13530FTHdrP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13531FTClicod", GXutil.ltrim( localUtil.ntoc( Z13531FTClicod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13532FTCliNom", GXutil.rtrim( Z13532FTCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13533FTArticulo", GXutil.rtrim( Z13533FTArticulo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13534FTArtDsc", GXutil.rtrim( Z13534FTArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13535FTAnc", GXutil.ltrim( localUtil.ntoc( Z13535FTAnc, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13536FTGrm2", GXutil.ltrim( localUtil.ntoc( Z13536FTGrm2, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13537FTColor", GXutil.rtrim( Z13537FTColor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13538FTColorNum", GXutil.ltrim( localUtil.ntoc( Z13538FTColorNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13539FTEstado", GXutil.ltrim( localUtil.ntoc( Z13539FTEstado, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13540FTMetros", GXutil.ltrim( localUtil.ntoc( Z13540FTMetros, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13541FTKilos", GXutil.ltrim( localUtil.ntoc( Z13541FTKilos, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13542FTPzas", GXutil.ltrim( localUtil.ntoc( Z13542FTPzas, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13561FTSituacio", GXutil.ltrim( localUtil.ntoc( Z13561FTSituacio, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13588FTArticExt", GXutil.rtrim( Z13588FTArticExt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13589FTHdrExt", GXutil.rtrim( Z13589FTHdrExt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13590FTTipo", GXutil.rtrim( Z13590FTTipo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13591FTObs", Z13591FTObs);
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
      setEventMetadata("VALID_FTHDR","{handler:'valid_Fthdr',iparms:[]");
      setEventMetadata("VALID_FTHDR",",oparms:[]}");
      setEventMetadata("VALID_FTHDRR","{handler:'valid_Fthdrr',iparms:[]");
      setEventMetadata("VALID_FTHDRR",",oparms:[]}");
      setEventMetadata("VALID_FTHDRP","{handler:'valid_Fthdrp',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13528FTHdr',fld:'FTHDR',pic:'ZZZZZZZ9'},{av:'A13529FTHdrR',fld:'FTHDRR',pic:'9'},{av:'A13530FTHdrP',fld:'FTHDRP',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_FTHDRP",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A13531FTClicod',fld:'FTCLICOD',pic:'ZZZZZ9'},{av:'A13532FTCliNom',fld:'FTCLINOM',pic:''},{av:'A13533FTArticulo',fld:'FTARTICULO',pic:''},{av:'A13534FTArtDsc',fld:'FTARTDSC',pic:''},{av:'A13535FTAnc',fld:'FTANC',pic:'ZZ9'},{av:'A13536FTGrm2',fld:'FTGRM2',pic:'ZZZ9'},{av:'A13537FTColor',fld:'FTCOLOR',pic:''},{av:'A13538FTColorNum',fld:'FTCOLORNUM',pic:'ZZZZZ9'},{av:'A13539FTEstado',fld:'FTESTADO',pic:'9'},{av:'A13540FTMetros',fld:'FTMETROS',pic:'ZZZZZ9.99'},{av:'A13541FTKilos',fld:'FTKILOS',pic:'ZZZZZ9.99'},{av:'A13542FTPzas',fld:'FTPZAS',pic:'ZZZZZ9'},{av:'A13561FTSituacio',fld:'FTSITUACIO',pic:'Z9'},{av:'A13588FTArticExt',fld:'FTARTICEXT',pic:''},{av:'A13589FTHdrExt',fld:'FTHDREXT',pic:''},{av:'A13590FTTipo',fld:'FTTIPO',pic:''},{av:'A13591FTObs',fld:'FTOBS',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z13528FTHdr'},{av:'Z13529FTHdrR'},{av:'Z13530FTHdrP'},{av:'Z407EmprNom'},{av:'Z13531FTClicod'},{av:'Z13532FTCliNom'},{av:'Z13533FTArticulo'},{av:'Z13534FTArtDsc'},{av:'Z13535FTAnc'},{av:'Z13536FTGrm2'},{av:'Z13537FTColor'},{av:'Z13538FTColorNum'},{av:'Z13539FTEstado'},{av:'Z13540FTMetros'},{av:'Z13541FTKilos'},{av:'Z13542FTPzas'},{av:'Z13561FTSituacio'},{av:'Z13588FTArticExt'},{av:'Z13589FTHdrExt'},{av:'Z13590FTTipo'},{av:'Z13591FTObs'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_FTCLOTE","{handler:'valid_Ftclote',iparms:[]");
      setEventMetadata("VALID_FTCLOTE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Ftcultline',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_FTCLINEA","{handler:'valid_Ftclinea',iparms:[]");
      setEventMetadata("VALID_FTCLINEA",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Ftcletique',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_FTFPROCESO","{handler:'valid_Ftfproceso',iparms:[]");
      setEventMetadata("VALID_FTFPROCESO",",oparms:[]}");
      setEventMetadata("VALID_FTFORDEN","{handler:'valid_Ftforden',iparms:[]");
      setEventMetadata("VALID_FTFORDEN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Fttkilos',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_FTPIEZA","{handler:'valid_Ftpieza',iparms:[]");
      setEventMetadata("VALID_FTPIEZA",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Ftppiezaor',iparms:[]");
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
      pr_default.close(44);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z13530FTHdrP = "" ;
      Z13532FTCliNom = "" ;
      Z13533FTArticulo = "" ;
      Z13534FTArtDsc = "" ;
      Z13537FTColor = "" ;
      Z13540FTMetros = DecimalUtil.ZERO ;
      Z13541FTKilos = DecimalUtil.ZERO ;
      Z13588FTArticExt = "" ;
      Z13589FTHdrExt = "" ;
      Z13590FTTipo = "" ;
      Z13591FTObs = "" ;
      Z13592FTCLote = "" ;
      Z13593FTCEmpesa = "" ;
      Z13594FTCEmpesaE = "" ;
      Z13596FTCMetros = DecimalUtil.ZERO ;
      Z13599FTCPresen = "" ;
      Z13601FTCLMts = DecimalUtil.ZERO ;
      Z13602FTCLObs = "" ;
      Z13603FTCLEtique = "" ;
      Z13548FTFProceso = "" ;
      Z13560FTMaquina = "" ;
      Z13550FTFFase = "" ;
      Z13551FTFFaseDsc = "" ;
      Z13553FTFInicio = GXutil.resetTime( GXutil.nullDate() );
      Z13554FTFFin = GXutil.resetTime( GXutil.nullDate() );
      Z13555FTFMetros = DecimalUtil.ZERO ;
      Z13556FTTKilos = DecimalUtil.ZERO ;
      Z13543FTPieza = "" ;
      Z13544FTPMetros = DecimalUtil.ZERO ;
      Z13545FTPKilos = DecimalUtil.ZERO ;
      Z13547FTPUbicaci = "" ;
      Z13557FTPMtsAut = DecimalUtil.ZERO ;
      Z13558FTPKgsAut = DecimalUtil.ZERO ;
      Z13559FTPPiezaOr = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A13530FTHdrP = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A13532FTCliNom = "" ;
      lblTextblock8_Jsonclick = "" ;
      A13533FTArticulo = "" ;
      lblTextblock9_Jsonclick = "" ;
      A13534FTArtDsc = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A13537FTColor = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      A13540FTMetros = DecimalUtil.ZERO ;
      lblTextblock16_Jsonclick = "" ;
      A13541FTKilos = DecimalUtil.ZERO ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      A13588FTArticExt = "" ;
      lblTextblock20_Jsonclick = "" ;
      A13589FTHdrExt = "" ;
      lblTextblock21_Jsonclick = "" ;
      A13590FTTipo = "" ;
      lblTextblock22_Jsonclick = "" ;
      A13591FTObs = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1860 = "" ;
      Grid3Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1854 = "" ;
      Grid4Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1853 = "" ;
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
      sMode1852 = "" ;
      GXCCtl = "" ;
      A13543FTPieza = "" ;
      A13544FTPMetros = DecimalUtil.ZERO ;
      A13545FTPKilos = DecimalUtil.ZERO ;
      A13547FTPUbicaci = "" ;
      A13557FTPMtsAut = DecimalUtil.ZERO ;
      A13558FTPKgsAut = DecimalUtil.ZERO ;
      A13559FTPPiezaOr = "" ;
      A13548FTFProceso = "" ;
      A13560FTMaquina = "" ;
      A13550FTFFase = "" ;
      A13551FTFFaseDsc = "" ;
      A13553FTFInicio = GXutil.resetTime( GXutil.nullDate() );
      A13554FTFFin = GXutil.resetTime( GXutil.nullDate() );
      A13555FTFMetros = DecimalUtil.ZERO ;
      A13556FTTKilos = DecimalUtil.ZERO ;
      A13599FTCPresen = "" ;
      A13601FTCLMts = DecimalUtil.ZERO ;
      A13602FTCLObs = "" ;
      A13603FTCLEtique = "" ;
      A13592FTCLote = "" ;
      A13593FTCEmpesa = "" ;
      A13594FTCEmpesaE = "" ;
      A13596FTCMetros = DecimalUtil.ZERO ;
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
      T01OI12_A407EmprNom = new String[] {""} ;
      T01OI12_n407EmprNom = new boolean[] {false} ;
      T01OI13_A13528FTHdr = new int[1] ;
      T01OI13_A13529FTHdrR = new byte[1] ;
      T01OI13_A13530FTHdrP = new String[] {""} ;
      T01OI13_A407EmprNom = new String[] {""} ;
      T01OI13_n407EmprNom = new boolean[] {false} ;
      T01OI13_A13531FTClicod = new int[1] ;
      T01OI13_n13531FTClicod = new boolean[] {false} ;
      T01OI13_A13532FTCliNom = new String[] {""} ;
      T01OI13_n13532FTCliNom = new boolean[] {false} ;
      T01OI13_A13533FTArticulo = new String[] {""} ;
      T01OI13_n13533FTArticulo = new boolean[] {false} ;
      T01OI13_A13534FTArtDsc = new String[] {""} ;
      T01OI13_n13534FTArtDsc = new boolean[] {false} ;
      T01OI13_A13535FTAnc = new short[1] ;
      T01OI13_n13535FTAnc = new boolean[] {false} ;
      T01OI13_A13536FTGrm2 = new short[1] ;
      T01OI13_n13536FTGrm2 = new boolean[] {false} ;
      T01OI13_A13537FTColor = new String[] {""} ;
      T01OI13_n13537FTColor = new boolean[] {false} ;
      T01OI13_A13538FTColorNum = new int[1] ;
      T01OI13_n13538FTColorNum = new boolean[] {false} ;
      T01OI13_A13539FTEstado = new byte[1] ;
      T01OI13_n13539FTEstado = new boolean[] {false} ;
      T01OI13_A13540FTMetros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI13_n13540FTMetros = new boolean[] {false} ;
      T01OI13_A13541FTKilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI13_n13541FTKilos = new boolean[] {false} ;
      T01OI13_A13542FTPzas = new int[1] ;
      T01OI13_n13542FTPzas = new boolean[] {false} ;
      T01OI13_A13561FTSituacio = new byte[1] ;
      T01OI13_n13561FTSituacio = new boolean[] {false} ;
      T01OI13_A13588FTArticExt = new String[] {""} ;
      T01OI13_n13588FTArticExt = new boolean[] {false} ;
      T01OI13_A13589FTHdrExt = new String[] {""} ;
      T01OI13_n13589FTHdrExt = new boolean[] {false} ;
      T01OI13_A13590FTTipo = new String[] {""} ;
      T01OI13_n13590FTTipo = new boolean[] {false} ;
      T01OI13_A13591FTObs = new String[] {""} ;
      T01OI13_n13591FTObs = new boolean[] {false} ;
      T01OI13_A396EmprCod = new String[] {""} ;
      T01OI14_A396EmprCod = new String[] {""} ;
      T01OI14_A13528FTHdr = new int[1] ;
      T01OI14_A13529FTHdrR = new byte[1] ;
      T01OI14_A13530FTHdrP = new String[] {""} ;
      T01OI11_A13528FTHdr = new int[1] ;
      T01OI11_A13529FTHdrR = new byte[1] ;
      T01OI11_A13530FTHdrP = new String[] {""} ;
      T01OI11_A13531FTClicod = new int[1] ;
      T01OI11_n13531FTClicod = new boolean[] {false} ;
      T01OI11_A13532FTCliNom = new String[] {""} ;
      T01OI11_n13532FTCliNom = new boolean[] {false} ;
      T01OI11_A13533FTArticulo = new String[] {""} ;
      T01OI11_n13533FTArticulo = new boolean[] {false} ;
      T01OI11_A13534FTArtDsc = new String[] {""} ;
      T01OI11_n13534FTArtDsc = new boolean[] {false} ;
      T01OI11_A13535FTAnc = new short[1] ;
      T01OI11_n13535FTAnc = new boolean[] {false} ;
      T01OI11_A13536FTGrm2 = new short[1] ;
      T01OI11_n13536FTGrm2 = new boolean[] {false} ;
      T01OI11_A13537FTColor = new String[] {""} ;
      T01OI11_n13537FTColor = new boolean[] {false} ;
      T01OI11_A13538FTColorNum = new int[1] ;
      T01OI11_n13538FTColorNum = new boolean[] {false} ;
      T01OI11_A13539FTEstado = new byte[1] ;
      T01OI11_n13539FTEstado = new boolean[] {false} ;
      T01OI11_A13540FTMetros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI11_n13540FTMetros = new boolean[] {false} ;
      T01OI11_A13541FTKilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI11_n13541FTKilos = new boolean[] {false} ;
      T01OI11_A13542FTPzas = new int[1] ;
      T01OI11_n13542FTPzas = new boolean[] {false} ;
      T01OI11_A13561FTSituacio = new byte[1] ;
      T01OI11_n13561FTSituacio = new boolean[] {false} ;
      T01OI11_A13588FTArticExt = new String[] {""} ;
      T01OI11_n13588FTArticExt = new boolean[] {false} ;
      T01OI11_A13589FTHdrExt = new String[] {""} ;
      T01OI11_n13589FTHdrExt = new boolean[] {false} ;
      T01OI11_A13590FTTipo = new String[] {""} ;
      T01OI11_n13590FTTipo = new boolean[] {false} ;
      T01OI11_A13591FTObs = new String[] {""} ;
      T01OI11_n13591FTObs = new boolean[] {false} ;
      T01OI11_A396EmprCod = new String[] {""} ;
      T01OI15_A396EmprCod = new String[] {""} ;
      T01OI15_A13528FTHdr = new int[1] ;
      T01OI15_A13529FTHdrR = new byte[1] ;
      T01OI15_A13530FTHdrP = new String[] {""} ;
      T01OI16_A396EmprCod = new String[] {""} ;
      T01OI16_A13528FTHdr = new int[1] ;
      T01OI16_A13529FTHdrR = new byte[1] ;
      T01OI16_A13530FTHdrP = new String[] {""} ;
      T01OI10_A13528FTHdr = new int[1] ;
      T01OI10_A13529FTHdrR = new byte[1] ;
      T01OI10_A13530FTHdrP = new String[] {""} ;
      T01OI10_A13531FTClicod = new int[1] ;
      T01OI10_n13531FTClicod = new boolean[] {false} ;
      T01OI10_A13532FTCliNom = new String[] {""} ;
      T01OI10_n13532FTCliNom = new boolean[] {false} ;
      T01OI10_A13533FTArticulo = new String[] {""} ;
      T01OI10_n13533FTArticulo = new boolean[] {false} ;
      T01OI10_A13534FTArtDsc = new String[] {""} ;
      T01OI10_n13534FTArtDsc = new boolean[] {false} ;
      T01OI10_A13535FTAnc = new short[1] ;
      T01OI10_n13535FTAnc = new boolean[] {false} ;
      T01OI10_A13536FTGrm2 = new short[1] ;
      T01OI10_n13536FTGrm2 = new boolean[] {false} ;
      T01OI10_A13537FTColor = new String[] {""} ;
      T01OI10_n13537FTColor = new boolean[] {false} ;
      T01OI10_A13538FTColorNum = new int[1] ;
      T01OI10_n13538FTColorNum = new boolean[] {false} ;
      T01OI10_A13539FTEstado = new byte[1] ;
      T01OI10_n13539FTEstado = new boolean[] {false} ;
      T01OI10_A13540FTMetros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI10_n13540FTMetros = new boolean[] {false} ;
      T01OI10_A13541FTKilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI10_n13541FTKilos = new boolean[] {false} ;
      T01OI10_A13542FTPzas = new int[1] ;
      T01OI10_n13542FTPzas = new boolean[] {false} ;
      T01OI10_A13561FTSituacio = new byte[1] ;
      T01OI10_n13561FTSituacio = new boolean[] {false} ;
      T01OI10_A13588FTArticExt = new String[] {""} ;
      T01OI10_n13588FTArticExt = new boolean[] {false} ;
      T01OI10_A13589FTHdrExt = new String[] {""} ;
      T01OI10_n13589FTHdrExt = new boolean[] {false} ;
      T01OI10_A13590FTTipo = new String[] {""} ;
      T01OI10_n13590FTTipo = new boolean[] {false} ;
      T01OI10_A13591FTObs = new String[] {""} ;
      T01OI10_n13591FTObs = new boolean[] {false} ;
      T01OI10_A396EmprCod = new String[] {""} ;
      T01OI20_A396EmprCod = new String[] {""} ;
      T01OI20_A13528FTHdr = new int[1] ;
      T01OI20_A13529FTHdrR = new byte[1] ;
      T01OI20_A13530FTHdrP = new String[] {""} ;
      T01OI20_A13592FTCLote = new String[] {""} ;
      T01OI21_A396EmprCod = new String[] {""} ;
      T01OI21_A13528FTHdr = new int[1] ;
      T01OI21_A13529FTHdrR = new byte[1] ;
      T01OI21_A13530FTHdrP = new String[] {""} ;
      T01OI22_A396EmprCod = new String[] {""} ;
      T01OI22_A13528FTHdr = new int[1] ;
      T01OI22_A13529FTHdrR = new byte[1] ;
      T01OI22_A13530FTHdrP = new String[] {""} ;
      T01OI22_A13592FTCLote = new String[] {""} ;
      T01OI22_A13593FTCEmpesa = new String[] {""} ;
      T01OI22_n13593FTCEmpesa = new boolean[] {false} ;
      T01OI22_A13594FTCEmpesaE = new String[] {""} ;
      T01OI22_n13594FTCEmpesaE = new boolean[] {false} ;
      T01OI22_A13595FTCAncho = new short[1] ;
      T01OI22_n13595FTCAncho = new boolean[] {false} ;
      T01OI22_A13596FTCMetros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI22_n13596FTCMetros = new boolean[] {false} ;
      T01OI22_A13597FTCUltLine = new short[1] ;
      T01OI22_n13597FTCUltLine = new boolean[] {false} ;
      T01OI23_A396EmprCod = new String[] {""} ;
      T01OI23_A13528FTHdr = new int[1] ;
      T01OI23_A13529FTHdrR = new byte[1] ;
      T01OI23_A13530FTHdrP = new String[] {""} ;
      T01OI23_A13592FTCLote = new String[] {""} ;
      T01OI9_A396EmprCod = new String[] {""} ;
      T01OI9_A13528FTHdr = new int[1] ;
      T01OI9_A13529FTHdrR = new byte[1] ;
      T01OI9_A13530FTHdrP = new String[] {""} ;
      T01OI9_A13592FTCLote = new String[] {""} ;
      T01OI9_A13593FTCEmpesa = new String[] {""} ;
      T01OI9_n13593FTCEmpesa = new boolean[] {false} ;
      T01OI9_A13594FTCEmpesaE = new String[] {""} ;
      T01OI9_n13594FTCEmpesaE = new boolean[] {false} ;
      T01OI9_A13595FTCAncho = new short[1] ;
      T01OI9_n13595FTCAncho = new boolean[] {false} ;
      T01OI9_A13596FTCMetros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI9_n13596FTCMetros = new boolean[] {false} ;
      T01OI9_A13597FTCUltLine = new short[1] ;
      T01OI9_n13597FTCUltLine = new boolean[] {false} ;
      T01OI8_A396EmprCod = new String[] {""} ;
      T01OI8_A13528FTHdr = new int[1] ;
      T01OI8_A13529FTHdrR = new byte[1] ;
      T01OI8_A13530FTHdrP = new String[] {""} ;
      T01OI8_A13592FTCLote = new String[] {""} ;
      T01OI8_A13593FTCEmpesa = new String[] {""} ;
      T01OI8_n13593FTCEmpesa = new boolean[] {false} ;
      T01OI8_A13594FTCEmpesaE = new String[] {""} ;
      T01OI8_n13594FTCEmpesaE = new boolean[] {false} ;
      T01OI8_A13595FTCAncho = new short[1] ;
      T01OI8_n13595FTCAncho = new boolean[] {false} ;
      T01OI8_A13596FTCMetros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI8_n13596FTCMetros = new boolean[] {false} ;
      T01OI8_A13597FTCUltLine = new short[1] ;
      T01OI8_n13597FTCUltLine = new boolean[] {false} ;
      T01OI27_A396EmprCod = new String[] {""} ;
      T01OI27_A13528FTHdr = new int[1] ;
      T01OI27_A13529FTHdrR = new byte[1] ;
      T01OI27_A13530FTHdrP = new String[] {""} ;
      T01OI27_A13592FTCLote = new String[] {""} ;
      T01OI28_A396EmprCod = new String[] {""} ;
      T01OI28_A13528FTHdr = new int[1] ;
      T01OI28_A13529FTHdrR = new byte[1] ;
      T01OI28_A13530FTHdrP = new String[] {""} ;
      T01OI28_A13592FTCLote = new String[] {""} ;
      T01OI28_A13598FTCLinea = new short[1] ;
      T01OI28_A13599FTCPresen = new String[] {""} ;
      T01OI28_n13599FTCPresen = new boolean[] {false} ;
      T01OI28_A13600FTCLong = new short[1] ;
      T01OI28_n13600FTCLong = new boolean[] {false} ;
      T01OI28_A13601FTCLMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI28_n13601FTCLMts = new boolean[] {false} ;
      T01OI28_A13602FTCLObs = new String[] {""} ;
      T01OI28_n13602FTCLObs = new boolean[] {false} ;
      T01OI28_A13603FTCLEtique = new String[] {""} ;
      T01OI28_n13603FTCLEtique = new boolean[] {false} ;
      T01OI29_A396EmprCod = new String[] {""} ;
      T01OI29_A13528FTHdr = new int[1] ;
      T01OI29_A13529FTHdrR = new byte[1] ;
      T01OI29_A13530FTHdrP = new String[] {""} ;
      T01OI29_A13592FTCLote = new String[] {""} ;
      T01OI29_A13598FTCLinea = new short[1] ;
      T01OI7_A396EmprCod = new String[] {""} ;
      T01OI7_A13528FTHdr = new int[1] ;
      T01OI7_A13529FTHdrR = new byte[1] ;
      T01OI7_A13530FTHdrP = new String[] {""} ;
      T01OI7_A13592FTCLote = new String[] {""} ;
      T01OI7_A13598FTCLinea = new short[1] ;
      T01OI7_A13599FTCPresen = new String[] {""} ;
      T01OI7_n13599FTCPresen = new boolean[] {false} ;
      T01OI7_A13600FTCLong = new short[1] ;
      T01OI7_n13600FTCLong = new boolean[] {false} ;
      T01OI7_A13601FTCLMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI7_n13601FTCLMts = new boolean[] {false} ;
      T01OI7_A13602FTCLObs = new String[] {""} ;
      T01OI7_n13602FTCLObs = new boolean[] {false} ;
      T01OI7_A13603FTCLEtique = new String[] {""} ;
      T01OI7_n13603FTCLEtique = new boolean[] {false} ;
      sMode1861 = "" ;
      T01OI6_A396EmprCod = new String[] {""} ;
      T01OI6_A13528FTHdr = new int[1] ;
      T01OI6_A13529FTHdrR = new byte[1] ;
      T01OI6_A13530FTHdrP = new String[] {""} ;
      T01OI6_A13592FTCLote = new String[] {""} ;
      T01OI6_A13598FTCLinea = new short[1] ;
      T01OI6_A13599FTCPresen = new String[] {""} ;
      T01OI6_n13599FTCPresen = new boolean[] {false} ;
      T01OI6_A13600FTCLong = new short[1] ;
      T01OI6_n13600FTCLong = new boolean[] {false} ;
      T01OI6_A13601FTCLMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI6_n13601FTCLMts = new boolean[] {false} ;
      T01OI6_A13602FTCLObs = new String[] {""} ;
      T01OI6_n13602FTCLObs = new boolean[] {false} ;
      T01OI6_A13603FTCLEtique = new String[] {""} ;
      T01OI6_n13603FTCLEtique = new boolean[] {false} ;
      T01OI33_A396EmprCod = new String[] {""} ;
      T01OI33_A13528FTHdr = new int[1] ;
      T01OI33_A13529FTHdrR = new byte[1] ;
      T01OI33_A13530FTHdrP = new String[] {""} ;
      T01OI33_A13592FTCLote = new String[] {""} ;
      T01OI33_A13598FTCLinea = new short[1] ;
      T01OI34_A396EmprCod = new String[] {""} ;
      T01OI34_A13528FTHdr = new int[1] ;
      T01OI34_A13529FTHdrR = new byte[1] ;
      T01OI34_A13530FTHdrP = new String[] {""} ;
      T01OI34_A13548FTFProceso = new String[] {""} ;
      T01OI34_A13549FTFOrden = new short[1] ;
      T01OI34_A13560FTMaquina = new String[] {""} ;
      T01OI34_n13560FTMaquina = new boolean[] {false} ;
      T01OI34_A13550FTFFase = new String[] {""} ;
      T01OI34_n13550FTFFase = new boolean[] {false} ;
      T01OI34_A13551FTFFaseDsc = new String[] {""} ;
      T01OI34_n13551FTFFaseDsc = new boolean[] {false} ;
      T01OI34_A13552FTFEstado = new byte[1] ;
      T01OI34_n13552FTFEstado = new boolean[] {false} ;
      T01OI34_A13553FTFInicio = new java.util.Date[] {GXutil.nullDate()} ;
      T01OI34_n13553FTFInicio = new boolean[] {false} ;
      T01OI34_A13554FTFFin = new java.util.Date[] {GXutil.nullDate()} ;
      T01OI34_n13554FTFFin = new boolean[] {false} ;
      T01OI34_A13555FTFMetros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI34_n13555FTFMetros = new boolean[] {false} ;
      T01OI34_A13556FTTKilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI34_n13556FTTKilos = new boolean[] {false} ;
      T01OI35_A396EmprCod = new String[] {""} ;
      T01OI35_A13528FTHdr = new int[1] ;
      T01OI35_A13529FTHdrR = new byte[1] ;
      T01OI35_A13530FTHdrP = new String[] {""} ;
      T01OI35_A13548FTFProceso = new String[] {""} ;
      T01OI35_A13549FTFOrden = new short[1] ;
      T01OI5_A396EmprCod = new String[] {""} ;
      T01OI5_A13528FTHdr = new int[1] ;
      T01OI5_A13529FTHdrR = new byte[1] ;
      T01OI5_A13530FTHdrP = new String[] {""} ;
      T01OI5_A13548FTFProceso = new String[] {""} ;
      T01OI5_A13549FTFOrden = new short[1] ;
      T01OI5_A13560FTMaquina = new String[] {""} ;
      T01OI5_n13560FTMaquina = new boolean[] {false} ;
      T01OI5_A13550FTFFase = new String[] {""} ;
      T01OI5_n13550FTFFase = new boolean[] {false} ;
      T01OI5_A13551FTFFaseDsc = new String[] {""} ;
      T01OI5_n13551FTFFaseDsc = new boolean[] {false} ;
      T01OI5_A13552FTFEstado = new byte[1] ;
      T01OI5_n13552FTFEstado = new boolean[] {false} ;
      T01OI5_A13553FTFInicio = new java.util.Date[] {GXutil.nullDate()} ;
      T01OI5_n13553FTFInicio = new boolean[] {false} ;
      T01OI5_A13554FTFFin = new java.util.Date[] {GXutil.nullDate()} ;
      T01OI5_n13554FTFFin = new boolean[] {false} ;
      T01OI5_A13555FTFMetros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI5_n13555FTFMetros = new boolean[] {false} ;
      T01OI5_A13556FTTKilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI5_n13556FTTKilos = new boolean[] {false} ;
      T01OI4_A396EmprCod = new String[] {""} ;
      T01OI4_A13528FTHdr = new int[1] ;
      T01OI4_A13529FTHdrR = new byte[1] ;
      T01OI4_A13530FTHdrP = new String[] {""} ;
      T01OI4_A13548FTFProceso = new String[] {""} ;
      T01OI4_A13549FTFOrden = new short[1] ;
      T01OI4_A13560FTMaquina = new String[] {""} ;
      T01OI4_n13560FTMaquina = new boolean[] {false} ;
      T01OI4_A13550FTFFase = new String[] {""} ;
      T01OI4_n13550FTFFase = new boolean[] {false} ;
      T01OI4_A13551FTFFaseDsc = new String[] {""} ;
      T01OI4_n13551FTFFaseDsc = new boolean[] {false} ;
      T01OI4_A13552FTFEstado = new byte[1] ;
      T01OI4_n13552FTFEstado = new boolean[] {false} ;
      T01OI4_A13553FTFInicio = new java.util.Date[] {GXutil.nullDate()} ;
      T01OI4_n13553FTFInicio = new boolean[] {false} ;
      T01OI4_A13554FTFFin = new java.util.Date[] {GXutil.nullDate()} ;
      T01OI4_n13554FTFFin = new boolean[] {false} ;
      T01OI4_A13555FTFMetros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI4_n13555FTFMetros = new boolean[] {false} ;
      T01OI4_A13556FTTKilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI4_n13556FTTKilos = new boolean[] {false} ;
      T01OI39_A396EmprCod = new String[] {""} ;
      T01OI39_A13528FTHdr = new int[1] ;
      T01OI39_A13529FTHdrR = new byte[1] ;
      T01OI39_A13530FTHdrP = new String[] {""} ;
      T01OI39_A13548FTFProceso = new String[] {""} ;
      T01OI39_A13549FTFOrden = new short[1] ;
      T01OI40_A396EmprCod = new String[] {""} ;
      T01OI40_A13528FTHdr = new int[1] ;
      T01OI40_A13529FTHdrR = new byte[1] ;
      T01OI40_A13530FTHdrP = new String[] {""} ;
      T01OI40_A13543FTPieza = new String[] {""} ;
      T01OI40_A13544FTPMetros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI40_n13544FTPMetros = new boolean[] {false} ;
      T01OI40_A13545FTPKilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI40_n13545FTPKilos = new boolean[] {false} ;
      T01OI40_A13546FTPAnc = new short[1] ;
      T01OI40_n13546FTPAnc = new boolean[] {false} ;
      T01OI40_A13547FTPUbicaci = new String[] {""} ;
      T01OI40_n13547FTPUbicaci = new boolean[] {false} ;
      T01OI40_A13557FTPMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI40_n13557FTPMtsAut = new boolean[] {false} ;
      T01OI40_A13558FTPKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI40_n13558FTPKgsAut = new boolean[] {false} ;
      T01OI40_A13559FTPPiezaOr = new String[] {""} ;
      T01OI40_n13559FTPPiezaOr = new boolean[] {false} ;
      T01OI41_A396EmprCod = new String[] {""} ;
      T01OI41_A13528FTHdr = new int[1] ;
      T01OI41_A13529FTHdrR = new byte[1] ;
      T01OI41_A13530FTHdrP = new String[] {""} ;
      T01OI41_A13543FTPieza = new String[] {""} ;
      T01OI3_A396EmprCod = new String[] {""} ;
      T01OI3_A13528FTHdr = new int[1] ;
      T01OI3_A13529FTHdrR = new byte[1] ;
      T01OI3_A13530FTHdrP = new String[] {""} ;
      T01OI3_A13543FTPieza = new String[] {""} ;
      T01OI3_A13544FTPMetros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI3_n13544FTPMetros = new boolean[] {false} ;
      T01OI3_A13545FTPKilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI3_n13545FTPKilos = new boolean[] {false} ;
      T01OI3_A13546FTPAnc = new short[1] ;
      T01OI3_n13546FTPAnc = new boolean[] {false} ;
      T01OI3_A13547FTPUbicaci = new String[] {""} ;
      T01OI3_n13547FTPUbicaci = new boolean[] {false} ;
      T01OI3_A13557FTPMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI3_n13557FTPMtsAut = new boolean[] {false} ;
      T01OI3_A13558FTPKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI3_n13558FTPKgsAut = new boolean[] {false} ;
      T01OI3_A13559FTPPiezaOr = new String[] {""} ;
      T01OI3_n13559FTPPiezaOr = new boolean[] {false} ;
      T01OI2_A396EmprCod = new String[] {""} ;
      T01OI2_A13528FTHdr = new int[1] ;
      T01OI2_A13529FTHdrR = new byte[1] ;
      T01OI2_A13530FTHdrP = new String[] {""} ;
      T01OI2_A13543FTPieza = new String[] {""} ;
      T01OI2_A13544FTPMetros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI2_n13544FTPMetros = new boolean[] {false} ;
      T01OI2_A13545FTPKilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI2_n13545FTPKilos = new boolean[] {false} ;
      T01OI2_A13546FTPAnc = new short[1] ;
      T01OI2_n13546FTPAnc = new boolean[] {false} ;
      T01OI2_A13547FTPUbicaci = new String[] {""} ;
      T01OI2_n13547FTPUbicaci = new boolean[] {false} ;
      T01OI2_A13557FTPMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI2_n13557FTPMtsAut = new boolean[] {false} ;
      T01OI2_A13558FTPKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OI2_n13558FTPKgsAut = new boolean[] {false} ;
      T01OI2_A13559FTPPiezaOr = new String[] {""} ;
      T01OI2_n13559FTPPiezaOr = new boolean[] {false} ;
      T01OI45_A396EmprCod = new String[] {""} ;
      T01OI45_A13528FTHdr = new int[1] ;
      T01OI45_A13529FTHdrR = new byte[1] ;
      T01OI45_A13530FTHdrP = new String[] {""} ;
      T01OI45_A13543FTPieza = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock23_Jsonclick = "" ;
      ROClassString = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      lblTextblock27_Jsonclick = "" ;
      lblTextblock28_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      Grid3Row = new com.genexus.webpanels.GXWebRow();
      subGrid3_Linesclass = "" ;
      Grid4Row = new com.genexus.webpanels.GXWebRow();
      subGrid4_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid3Column = new com.genexus.webpanels.GXWebColumn();
      Grid4Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      T01OI46_A407EmprNom = new String[] {""} ;
      T01OI46_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ13530FTHdrP = "" ;
      ZZ407EmprNom = "" ;
      ZZ13532FTCliNom = "" ;
      ZZ13533FTArticulo = "" ;
      ZZ13534FTArtDsc = "" ;
      ZZ13537FTColor = "" ;
      ZZ13540FTMetros = DecimalUtil.ZERO ;
      ZZ13541FTKilos = DecimalUtil.ZERO ;
      ZZ13588FTArticExt = "" ;
      ZZ13589FTHdrExt = "" ;
      ZZ13590FTTipo = "" ;
      ZZ13591FTObs = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tfrtohd__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tfrtohd__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tfrtohd__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tfrtohd__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tfrtohd__default(),
         new Object[] {
             new Object[] {
            T01OI2_A396EmprCod, T01OI2_A13528FTHdr, T01OI2_A13529FTHdrR, T01OI2_A13530FTHdrP, T01OI2_A13543FTPieza, T01OI2_A13544FTPMetros, T01OI2_n13544FTPMetros, T01OI2_A13545FTPKilos, T01OI2_n13545FTPKilos, T01OI2_A13546FTPAnc,
            T01OI2_n13546FTPAnc, T01OI2_A13547FTPUbicaci, T01OI2_n13547FTPUbicaci, T01OI2_A13557FTPMtsAut, T01OI2_n13557FTPMtsAut, T01OI2_A13558FTPKgsAut, T01OI2_n13558FTPKgsAut, T01OI2_A13559FTPPiezaOr, T01OI2_n13559FTPPiezaOr
            }
            , new Object[] {
            T01OI3_A396EmprCod, T01OI3_A13528FTHdr, T01OI3_A13529FTHdrR, T01OI3_A13530FTHdrP, T01OI3_A13543FTPieza, T01OI3_A13544FTPMetros, T01OI3_n13544FTPMetros, T01OI3_A13545FTPKilos, T01OI3_n13545FTPKilos, T01OI3_A13546FTPAnc,
            T01OI3_n13546FTPAnc, T01OI3_A13547FTPUbicaci, T01OI3_n13547FTPUbicaci, T01OI3_A13557FTPMtsAut, T01OI3_n13557FTPMtsAut, T01OI3_A13558FTPKgsAut, T01OI3_n13558FTPKgsAut, T01OI3_A13559FTPPiezaOr, T01OI3_n13559FTPPiezaOr
            }
            , new Object[] {
            T01OI4_A396EmprCod, T01OI4_A13528FTHdr, T01OI4_A13529FTHdrR, T01OI4_A13530FTHdrP, T01OI4_A13548FTFProceso, T01OI4_A13549FTFOrden, T01OI4_A13560FTMaquina, T01OI4_n13560FTMaquina, T01OI4_A13550FTFFase, T01OI4_n13550FTFFase,
            T01OI4_A13551FTFFaseDsc, T01OI4_n13551FTFFaseDsc, T01OI4_A13552FTFEstado, T01OI4_n13552FTFEstado, T01OI4_A13553FTFInicio, T01OI4_n13553FTFInicio, T01OI4_A13554FTFFin, T01OI4_n13554FTFFin, T01OI4_A13555FTFMetros, T01OI4_n13555FTFMetros,
            T01OI4_A13556FTTKilos, T01OI4_n13556FTTKilos
            }
            , new Object[] {
            T01OI5_A396EmprCod, T01OI5_A13528FTHdr, T01OI5_A13529FTHdrR, T01OI5_A13530FTHdrP, T01OI5_A13548FTFProceso, T01OI5_A13549FTFOrden, T01OI5_A13560FTMaquina, T01OI5_n13560FTMaquina, T01OI5_A13550FTFFase, T01OI5_n13550FTFFase,
            T01OI5_A13551FTFFaseDsc, T01OI5_n13551FTFFaseDsc, T01OI5_A13552FTFEstado, T01OI5_n13552FTFEstado, T01OI5_A13553FTFInicio, T01OI5_n13553FTFInicio, T01OI5_A13554FTFFin, T01OI5_n13554FTFFin, T01OI5_A13555FTFMetros, T01OI5_n13555FTFMetros,
            T01OI5_A13556FTTKilos, T01OI5_n13556FTTKilos
            }
            , new Object[] {
            T01OI6_A396EmprCod, T01OI6_A13528FTHdr, T01OI6_A13529FTHdrR, T01OI6_A13530FTHdrP, T01OI6_A13592FTCLote, T01OI6_A13598FTCLinea, T01OI6_A13599FTCPresen, T01OI6_n13599FTCPresen, T01OI6_A13600FTCLong, T01OI6_n13600FTCLong,
            T01OI6_A13601FTCLMts, T01OI6_n13601FTCLMts, T01OI6_A13602FTCLObs, T01OI6_n13602FTCLObs, T01OI6_A13603FTCLEtique, T01OI6_n13603FTCLEtique
            }
            , new Object[] {
            T01OI7_A396EmprCod, T01OI7_A13528FTHdr, T01OI7_A13529FTHdrR, T01OI7_A13530FTHdrP, T01OI7_A13592FTCLote, T01OI7_A13598FTCLinea, T01OI7_A13599FTCPresen, T01OI7_n13599FTCPresen, T01OI7_A13600FTCLong, T01OI7_n13600FTCLong,
            T01OI7_A13601FTCLMts, T01OI7_n13601FTCLMts, T01OI7_A13602FTCLObs, T01OI7_n13602FTCLObs, T01OI7_A13603FTCLEtique, T01OI7_n13603FTCLEtique
            }
            , new Object[] {
            T01OI8_A396EmprCod, T01OI8_A13528FTHdr, T01OI8_A13529FTHdrR, T01OI8_A13530FTHdrP, T01OI8_A13592FTCLote, T01OI8_A13593FTCEmpesa, T01OI8_n13593FTCEmpesa, T01OI8_A13594FTCEmpesaE, T01OI8_n13594FTCEmpesaE, T01OI8_A13595FTCAncho,
            T01OI8_n13595FTCAncho, T01OI8_A13596FTCMetros, T01OI8_n13596FTCMetros, T01OI8_A13597FTCUltLine, T01OI8_n13597FTCUltLine
            }
            , new Object[] {
            T01OI9_A396EmprCod, T01OI9_A13528FTHdr, T01OI9_A13529FTHdrR, T01OI9_A13530FTHdrP, T01OI9_A13592FTCLote, T01OI9_A13593FTCEmpesa, T01OI9_n13593FTCEmpesa, T01OI9_A13594FTCEmpesaE, T01OI9_n13594FTCEmpesaE, T01OI9_A13595FTCAncho,
            T01OI9_n13595FTCAncho, T01OI9_A13596FTCMetros, T01OI9_n13596FTCMetros, T01OI9_A13597FTCUltLine, T01OI9_n13597FTCUltLine
            }
            , new Object[] {
            T01OI10_A13528FTHdr, T01OI10_A13529FTHdrR, T01OI10_A13530FTHdrP, T01OI10_A13531FTClicod, T01OI10_n13531FTClicod, T01OI10_A13532FTCliNom, T01OI10_n13532FTCliNom, T01OI10_A13533FTArticulo, T01OI10_n13533FTArticulo, T01OI10_A13534FTArtDsc,
            T01OI10_n13534FTArtDsc, T01OI10_A13535FTAnc, T01OI10_n13535FTAnc, T01OI10_A13536FTGrm2, T01OI10_n13536FTGrm2, T01OI10_A13537FTColor, T01OI10_n13537FTColor, T01OI10_A13538FTColorNum, T01OI10_n13538FTColorNum, T01OI10_A13539FTEstado,
            T01OI10_n13539FTEstado, T01OI10_A13540FTMetros, T01OI10_n13540FTMetros, T01OI10_A13541FTKilos, T01OI10_n13541FTKilos, T01OI10_A13542FTPzas, T01OI10_n13542FTPzas, T01OI10_A13561FTSituacio, T01OI10_n13561FTSituacio, T01OI10_A13588FTArticExt,
            T01OI10_n13588FTArticExt, T01OI10_A13589FTHdrExt, T01OI10_n13589FTHdrExt, T01OI10_A13590FTTipo, T01OI10_n13590FTTipo, T01OI10_A13591FTObs, T01OI10_n13591FTObs, T01OI10_A396EmprCod
            }
            , new Object[] {
            T01OI11_A13528FTHdr, T01OI11_A13529FTHdrR, T01OI11_A13530FTHdrP, T01OI11_A13531FTClicod, T01OI11_n13531FTClicod, T01OI11_A13532FTCliNom, T01OI11_n13532FTCliNom, T01OI11_A13533FTArticulo, T01OI11_n13533FTArticulo, T01OI11_A13534FTArtDsc,
            T01OI11_n13534FTArtDsc, T01OI11_A13535FTAnc, T01OI11_n13535FTAnc, T01OI11_A13536FTGrm2, T01OI11_n13536FTGrm2, T01OI11_A13537FTColor, T01OI11_n13537FTColor, T01OI11_A13538FTColorNum, T01OI11_n13538FTColorNum, T01OI11_A13539FTEstado,
            T01OI11_n13539FTEstado, T01OI11_A13540FTMetros, T01OI11_n13540FTMetros, T01OI11_A13541FTKilos, T01OI11_n13541FTKilos, T01OI11_A13542FTPzas, T01OI11_n13542FTPzas, T01OI11_A13561FTSituacio, T01OI11_n13561FTSituacio, T01OI11_A13588FTArticExt,
            T01OI11_n13588FTArticExt, T01OI11_A13589FTHdrExt, T01OI11_n13589FTHdrExt, T01OI11_A13590FTTipo, T01OI11_n13590FTTipo, T01OI11_A13591FTObs, T01OI11_n13591FTObs, T01OI11_A396EmprCod
            }
            , new Object[] {
            T01OI12_A407EmprNom, T01OI12_n407EmprNom
            }
            , new Object[] {
            T01OI13_A13528FTHdr, T01OI13_A13529FTHdrR, T01OI13_A13530FTHdrP, T01OI13_A407EmprNom, T01OI13_n407EmprNom, T01OI13_A13531FTClicod, T01OI13_n13531FTClicod, T01OI13_A13532FTCliNom, T01OI13_n13532FTCliNom, T01OI13_A13533FTArticulo,
            T01OI13_n13533FTArticulo, T01OI13_A13534FTArtDsc, T01OI13_n13534FTArtDsc, T01OI13_A13535FTAnc, T01OI13_n13535FTAnc, T01OI13_A13536FTGrm2, T01OI13_n13536FTGrm2, T01OI13_A13537FTColor, T01OI13_n13537FTColor, T01OI13_A13538FTColorNum,
            T01OI13_n13538FTColorNum, T01OI13_A13539FTEstado, T01OI13_n13539FTEstado, T01OI13_A13540FTMetros, T01OI13_n13540FTMetros, T01OI13_A13541FTKilos, T01OI13_n13541FTKilos, T01OI13_A13542FTPzas, T01OI13_n13542FTPzas, T01OI13_A13561FTSituacio,
            T01OI13_n13561FTSituacio, T01OI13_A13588FTArticExt, T01OI13_n13588FTArticExt, T01OI13_A13589FTHdrExt, T01OI13_n13589FTHdrExt, T01OI13_A13590FTTipo, T01OI13_n13590FTTipo, T01OI13_A13591FTObs, T01OI13_n13591FTObs, T01OI13_A396EmprCod
            }
            , new Object[] {
            T01OI14_A396EmprCod, T01OI14_A13528FTHdr, T01OI14_A13529FTHdrR, T01OI14_A13530FTHdrP
            }
            , new Object[] {
            T01OI15_A396EmprCod, T01OI15_A13528FTHdr, T01OI15_A13529FTHdrR, T01OI15_A13530FTHdrP
            }
            , new Object[] {
            T01OI16_A396EmprCod, T01OI16_A13528FTHdr, T01OI16_A13529FTHdrR, T01OI16_A13530FTHdrP
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01OI20_A396EmprCod, T01OI20_A13528FTHdr, T01OI20_A13529FTHdrR, T01OI20_A13530FTHdrP, T01OI20_A13592FTCLote
            }
            , new Object[] {
            T01OI21_A396EmprCod, T01OI21_A13528FTHdr, T01OI21_A13529FTHdrR, T01OI21_A13530FTHdrP
            }
            , new Object[] {
            T01OI22_A396EmprCod, T01OI22_A13528FTHdr, T01OI22_A13529FTHdrR, T01OI22_A13530FTHdrP, T01OI22_A13592FTCLote, T01OI22_A13593FTCEmpesa, T01OI22_n13593FTCEmpesa, T01OI22_A13594FTCEmpesaE, T01OI22_n13594FTCEmpesaE, T01OI22_A13595FTCAncho,
            T01OI22_n13595FTCAncho, T01OI22_A13596FTCMetros, T01OI22_n13596FTCMetros, T01OI22_A13597FTCUltLine, T01OI22_n13597FTCUltLine
            }
            , new Object[] {
            T01OI23_A396EmprCod, T01OI23_A13528FTHdr, T01OI23_A13529FTHdrR, T01OI23_A13530FTHdrP, T01OI23_A13592FTCLote
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01OI27_A396EmprCod, T01OI27_A13528FTHdr, T01OI27_A13529FTHdrR, T01OI27_A13530FTHdrP, T01OI27_A13592FTCLote
            }
            , new Object[] {
            T01OI28_A396EmprCod, T01OI28_A13528FTHdr, T01OI28_A13529FTHdrR, T01OI28_A13530FTHdrP, T01OI28_A13592FTCLote, T01OI28_A13598FTCLinea, T01OI28_A13599FTCPresen, T01OI28_n13599FTCPresen, T01OI28_A13600FTCLong, T01OI28_n13600FTCLong,
            T01OI28_A13601FTCLMts, T01OI28_n13601FTCLMts, T01OI28_A13602FTCLObs, T01OI28_n13602FTCLObs, T01OI28_A13603FTCLEtique, T01OI28_n13603FTCLEtique
            }
            , new Object[] {
            T01OI29_A396EmprCod, T01OI29_A13528FTHdr, T01OI29_A13529FTHdrR, T01OI29_A13530FTHdrP, T01OI29_A13592FTCLote, T01OI29_A13598FTCLinea
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01OI33_A396EmprCod, T01OI33_A13528FTHdr, T01OI33_A13529FTHdrR, T01OI33_A13530FTHdrP, T01OI33_A13592FTCLote, T01OI33_A13598FTCLinea
            }
            , new Object[] {
            T01OI34_A396EmprCod, T01OI34_A13528FTHdr, T01OI34_A13529FTHdrR, T01OI34_A13530FTHdrP, T01OI34_A13548FTFProceso, T01OI34_A13549FTFOrden, T01OI34_A13560FTMaquina, T01OI34_n13560FTMaquina, T01OI34_A13550FTFFase, T01OI34_n13550FTFFase,
            T01OI34_A13551FTFFaseDsc, T01OI34_n13551FTFFaseDsc, T01OI34_A13552FTFEstado, T01OI34_n13552FTFEstado, T01OI34_A13553FTFInicio, T01OI34_n13553FTFInicio, T01OI34_A13554FTFFin, T01OI34_n13554FTFFin, T01OI34_A13555FTFMetros, T01OI34_n13555FTFMetros,
            T01OI34_A13556FTTKilos, T01OI34_n13556FTTKilos
            }
            , new Object[] {
            T01OI35_A396EmprCod, T01OI35_A13528FTHdr, T01OI35_A13529FTHdrR, T01OI35_A13530FTHdrP, T01OI35_A13548FTFProceso, T01OI35_A13549FTFOrden
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01OI39_A396EmprCod, T01OI39_A13528FTHdr, T01OI39_A13529FTHdrR, T01OI39_A13530FTHdrP, T01OI39_A13548FTFProceso, T01OI39_A13549FTFOrden
            }
            , new Object[] {
            T01OI40_A396EmprCod, T01OI40_A13528FTHdr, T01OI40_A13529FTHdrR, T01OI40_A13530FTHdrP, T01OI40_A13543FTPieza, T01OI40_A13544FTPMetros, T01OI40_n13544FTPMetros, T01OI40_A13545FTPKilos, T01OI40_n13545FTPKilos, T01OI40_A13546FTPAnc,
            T01OI40_n13546FTPAnc, T01OI40_A13547FTPUbicaci, T01OI40_n13547FTPUbicaci, T01OI40_A13557FTPMtsAut, T01OI40_n13557FTPMtsAut, T01OI40_A13558FTPKgsAut, T01OI40_n13558FTPKgsAut, T01OI40_A13559FTPPiezaOr, T01OI40_n13559FTPPiezaOr
            }
            , new Object[] {
            T01OI41_A396EmprCod, T01OI41_A13528FTHdr, T01OI41_A13529FTHdrR, T01OI41_A13530FTHdrP, T01OI41_A13543FTPieza
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01OI45_A396EmprCod, T01OI45_A13528FTHdr, T01OI45_A13529FTHdrR, T01OI45_A13530FTHdrP, T01OI45_A13543FTPieza
            }
            , new Object[] {
            T01OI46_A407EmprNom, T01OI46_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TFRTOHD" ;
   }

   private byte Z13529FTHdrR ;
   private byte Z13539FTEstado ;
   private byte Z13561FTSituacio ;
   private byte Z13552FTFEstado ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A13529FTHdrR ;
   private byte A13539FTEstado ;
   private byte A13561FTSituacio ;
   private byte A13552FTFEstado ;
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
   private byte subGrid3_Allowselection ;
   private byte subGrid3_Allowhovering ;
   private byte subGrid3_Allowcollapsing ;
   private byte subGrid3_Collapsed ;
   private byte subGrid4_Allowselection ;
   private byte subGrid4_Allowhovering ;
   private byte subGrid4_Allowcollapsing ;
   private byte subGrid4_Collapsed ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte ZZ13529FTHdrR ;
   private byte ZZ13539FTEstado ;
   private byte ZZ13561FTSituacio ;
   private short Z13535FTAnc ;
   private short Z13536FTGrm2 ;
   private short Z13595FTCAncho ;
   private short Z13597FTCUltLine ;
   private short nRcdDeleted_1860 ;
   private short nRcdExists_1860 ;
   private short nIsMod_1860 ;
   private short Z13598FTCLinea ;
   private short Z13600FTCLong ;
   private short nRcdDeleted_1861 ;
   private short nRcdExists_1861 ;
   private short nIsMod_1861 ;
   private short Z13549FTFOrden ;
   private short nRcdDeleted_1854 ;
   private short nRcdExists_1854 ;
   private short nIsMod_1854 ;
   private short Z13546FTPAnc ;
   private short nRcdDeleted_1853 ;
   private short nRcdExists_1853 ;
   private short nIsMod_1853 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A13535FTAnc ;
   private short A13536FTGrm2 ;
   private short nBlankRcdCount1860 ;
   private short RcdFound1860 ;
   private short nBlankRcdUsr1860 ;
   private short nBlankRcdCount1854 ;
   private short RcdFound1854 ;
   private short nBlankRcdUsr1854 ;
   private short nBlankRcdCount1853 ;
   private short RcdFound1853 ;
   private short nBlankRcdUsr1853 ;
   private short A13546FTPAnc ;
   private short A13549FTFOrden ;
   private short RcdFound1861 ;
   private short A13598FTCLinea ;
   private short A13600FTCLong ;
   private short A13595FTCAncho ;
   private short A13597FTCUltLine ;
   private short RcdFound1852 ;
   private short nIsDirty_1852 ;
   private short nIsDirty_1860 ;
   private short nIsDirty_1861 ;
   private short nIsDirty_1854 ;
   private short nIsDirty_1853 ;
   private short nBlankRcdCount1861 ;
   private short nBlankRcdUsr1861 ;
   private short subGrid1_Borderwidth ;
   private short ZZ13535FTAnc ;
   private short ZZ13536FTGrm2 ;
   private int Z13528FTHdr ;
   private int Z13531FTClicod ;
   private int Z13538FTColorNum ;
   private int Z13542FTPzas ;
   private int nRC_GXsfl_130 ;
   private int nGXsfl_130_idx=1 ;
   private int nRC_GXsfl_178 ;
   private int nGXsfl_178_idx=1 ;
   private int nRC_GXsfl_193 ;
   private int nGXsfl_193_idx=1 ;
   private int nRC_GXsfl_167 ;
   private int nGXsfl_167_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A13528FTHdr ;
   private int edtFTHdr_Enabled ;
   private int edtFTHdrR_Enabled ;
   private int edtFTHdrP_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int A13531FTClicod ;
   private int edtFTClicod_Enabled ;
   private int edtFTCliNom_Enabled ;
   private int edtFTArticulo_Enabled ;
   private int edtFTArtDsc_Enabled ;
   private int edtFTAnc_Enabled ;
   private int edtFTGrm2_Enabled ;
   private int edtFTColor_Enabled ;
   private int A13538FTColorNum ;
   private int edtFTColorNum_Enabled ;
   private int edtFTEstado_Enabled ;
   private int edtFTMetros_Enabled ;
   private int edtFTKilos_Enabled ;
   private int A13542FTPzas ;
   private int edtFTPzas_Enabled ;
   private int edtFTSituacio_Enabled ;
   private int edtFTArticExt_Enabled ;
   private int edtFTHdrExt_Enabled ;
   private int edtFTTipo_Enabled ;
   private int edtFTObs_Enabled ;
   private int edtFTCLote_Enabled ;
   private int edtFTCEmpesa_Enabled ;
   private int edtFTCEmpesaE_Enabled ;
   private int edtFTCAncho_Enabled ;
   private int edtFTCMetros_Enabled ;
   private int edtFTCUltLine_Enabled ;
   private int fRowAdded ;
   private int edtavnRcdDeleted_1854_Enabled ;
   private int edtFTFProceso_Enabled ;
   private int edtFTFOrden_Enabled ;
   private int edtFTMaquina_Enabled ;
   private int edtFTFFase_Enabled ;
   private int edtFTFFaseDsc_Enabled ;
   private int edtFTFEstado_Enabled ;
   private int edtFTFInicio_Enabled ;
   private int edtFTFFin_Enabled ;
   private int edtFTFMetros_Enabled ;
   private int edtFTTKilos_Enabled ;
   private int edtavnRcdDeleted_1853_Enabled ;
   private int edtFTPieza_Enabled ;
   private int edtFTPMetros_Enabled ;
   private int edtFTPKilos_Enabled ;
   private int edtFTPAnc_Enabled ;
   private int edtFTPUbicaci_Enabled ;
   private int edtFTPMtsAut_Enabled ;
   private int edtFTPKgsAut_Enabled ;
   private int edtFTPPiezaOr_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_1861_Enabled ;
   private int edtFTCLinea_Enabled ;
   private int edtFTCPresen_Enabled ;
   private int edtFTCLong_Enabled ;
   private int edtFTCLMts_Enabled ;
   private int edtFTCLObs_Enabled ;
   private int edtFTCLEtique_Enabled ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int subGrid3_Backcolor ;
   private int subGrid3_Allbackcolor ;
   private int subGrid4_Backcolor ;
   private int subGrid4_Allbackcolor ;
   private int defedtFTCLinea_Enabled ;
   private int defedtFTPieza_Enabled ;
   private int defedtFTFOrden_Enabled ;
   private int defedtFTFProceso_Enabled ;
   private int defedtFTCLote_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid3_Selectedindex ;
   private int subGrid3_Selectioncolor ;
   private int subGrid3_Hoveringcolor ;
   private int subGrid4_Selectedindex ;
   private int subGrid4_Selectioncolor ;
   private int subGrid4_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtFTObs_Backcolor ;
   private int edtFTTipo_Backcolor ;
   private int edtFTHdrExt_Backcolor ;
   private int edtFTArticExt_Backcolor ;
   private int edtFTSituacio_Backcolor ;
   private int edtFTPzas_Backcolor ;
   private int edtFTKilos_Backcolor ;
   private int edtFTMetros_Backcolor ;
   private int edtFTEstado_Backcolor ;
   private int edtFTColorNum_Backcolor ;
   private int edtFTColor_Backcolor ;
   private int edtFTGrm2_Backcolor ;
   private int edtFTAnc_Backcolor ;
   private int edtFTArtDsc_Backcolor ;
   private int edtFTArticulo_Backcolor ;
   private int edtFTCliNom_Backcolor ;
   private int edtFTClicod_Backcolor ;
   private int edtFTHdrP_Backcolor ;
   private int edtFTHdrR_Backcolor ;
   private int edtFTHdr_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ13528FTHdr ;
   private int ZZ13531FTClicod ;
   private int ZZ13538FTColorNum ;
   private int ZZ13542FTPzas ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID3_nFirstRecordOnPage ;
   private long GRID4_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private java.math.BigDecimal Z13540FTMetros ;
   private java.math.BigDecimal Z13541FTKilos ;
   private java.math.BigDecimal Z13596FTCMetros ;
   private java.math.BigDecimal Z13601FTCLMts ;
   private java.math.BigDecimal Z13555FTFMetros ;
   private java.math.BigDecimal Z13556FTTKilos ;
   private java.math.BigDecimal Z13544FTPMetros ;
   private java.math.BigDecimal Z13545FTPKilos ;
   private java.math.BigDecimal Z13557FTPMtsAut ;
   private java.math.BigDecimal Z13558FTPKgsAut ;
   private java.math.BigDecimal A13540FTMetros ;
   private java.math.BigDecimal A13541FTKilos ;
   private java.math.BigDecimal A13544FTPMetros ;
   private java.math.BigDecimal A13545FTPKilos ;
   private java.math.BigDecimal A13557FTPMtsAut ;
   private java.math.BigDecimal A13558FTPKgsAut ;
   private java.math.BigDecimal A13555FTFMetros ;
   private java.math.BigDecimal A13556FTTKilos ;
   private java.math.BigDecimal A13601FTCLMts ;
   private java.math.BigDecimal A13596FTCMetros ;
   private java.math.BigDecimal ZZ13540FTMetros ;
   private java.math.BigDecimal ZZ13541FTKilos ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z13530FTHdrP ;
   private String Z13532FTCliNom ;
   private String Z13533FTArticulo ;
   private String Z13534FTArtDsc ;
   private String Z13537FTColor ;
   private String Z13588FTArticExt ;
   private String Z13589FTHdrExt ;
   private String Z13590FTTipo ;
   private String Z13592FTCLote ;
   private String Z13593FTCEmpesa ;
   private String Z13594FTCEmpesaE ;
   private String Z13599FTCPresen ;
   private String Z13602FTCLObs ;
   private String Z13603FTCLEtique ;
   private String Z13548FTFProceso ;
   private String Z13560FTMaquina ;
   private String Z13550FTFFase ;
   private String Z13551FTFFaseDsc ;
   private String Z13543FTPieza ;
   private String Z13547FTPUbicaci ;
   private String Z13559FTPPiezaOr ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtFTHdr_Internalname ;
   private String sGXsfl_130_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_167_idx="0001" ;
   private String sGXsfl_178_idx="0001" ;
   private String sGXsfl_193_idx="0001" ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtFTHdr_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtFTHdrR_Internalname ;
   private String edtFTHdrR_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtFTHdrP_Internalname ;
   private String A13530FTHdrP ;
   private String edtFTHdrP_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtFTClicod_Internalname ;
   private String edtFTClicod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtFTCliNom_Internalname ;
   private String A13532FTCliNom ;
   private String edtFTCliNom_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtFTArticulo_Internalname ;
   private String A13533FTArticulo ;
   private String edtFTArticulo_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtFTArtDsc_Internalname ;
   private String A13534FTArtDsc ;
   private String edtFTArtDsc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtFTAnc_Internalname ;
   private String edtFTAnc_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtFTGrm2_Internalname ;
   private String edtFTGrm2_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtFTColor_Internalname ;
   private String A13537FTColor ;
   private String edtFTColor_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtFTColorNum_Internalname ;
   private String edtFTColorNum_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtFTEstado_Internalname ;
   private String edtFTEstado_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtFTMetros_Internalname ;
   private String edtFTMetros_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtFTKilos_Internalname ;
   private String edtFTKilos_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtFTPzas_Internalname ;
   private String edtFTPzas_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtFTSituacio_Internalname ;
   private String edtFTSituacio_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtFTArticExt_Internalname ;
   private String A13588FTArticExt ;
   private String edtFTArticExt_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtFTHdrExt_Internalname ;
   private String A13589FTHdrExt ;
   private String edtFTHdrExt_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtFTTipo_Internalname ;
   private String A13590FTTipo ;
   private String edtFTTipo_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtFTObs_Internalname ;
   private String sMode1860 ;
   private String edtFTCLote_Internalname ;
   private String edtFTCEmpesa_Internalname ;
   private String edtFTCEmpesaE_Internalname ;
   private String edtFTCAncho_Internalname ;
   private String edtFTCMetros_Internalname ;
   private String edtFTCUltLine_Internalname ;
   private String subGrid1_Internalname ;
   private String sMode1854 ;
   private String edtavnRcdDeleted_1854_Internalname ;
   private String edtFTFProceso_Internalname ;
   private String edtFTFOrden_Internalname ;
   private String edtFTMaquina_Internalname ;
   private String edtFTFFase_Internalname ;
   private String edtFTFFaseDsc_Internalname ;
   private String edtFTFEstado_Internalname ;
   private String edtFTFInicio_Internalname ;
   private String edtFTFFin_Internalname ;
   private String edtFTFMetros_Internalname ;
   private String edtFTTKilos_Internalname ;
   private String subGrid3_Internalname ;
   private String sMode1853 ;
   private String edtavnRcdDeleted_1853_Internalname ;
   private String edtFTPieza_Internalname ;
   private String edtFTPMetros_Internalname ;
   private String edtFTPKilos_Internalname ;
   private String edtFTPAnc_Internalname ;
   private String edtFTPUbicaci_Internalname ;
   private String edtFTPMtsAut_Internalname ;
   private String edtFTPKgsAut_Internalname ;
   private String edtFTPPiezaOr_Internalname ;
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
   private String edtavnRcdDeleted_1861_Internalname ;
   private String sMode1852 ;
   private String GXCCtl ;
   private String A13543FTPieza ;
   private String A13547FTPUbicaci ;
   private String A13559FTPPiezaOr ;
   private String A13548FTFProceso ;
   private String A13560FTMaquina ;
   private String A13550FTFFase ;
   private String A13551FTFFaseDsc ;
   private String edtFTCLinea_Internalname ;
   private String edtFTCPresen_Internalname ;
   private String A13599FTCPresen ;
   private String edtFTCLong_Internalname ;
   private String edtFTCLMts_Internalname ;
   private String edtFTCLObs_Internalname ;
   private String A13602FTCLObs ;
   private String edtFTCLEtique_Internalname ;
   private String A13603FTCLEtique ;
   private String A13592FTCLote ;
   private String A13593FTCEmpesa ;
   private String A13594FTCEmpesaE ;
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
   private String sMode1861 ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock28_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_130_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String ROClassString ;
   private String edtFTCLote_Jsonclick ;
   private String lblTextblock24_Jsonclick ;
   private String edtFTCEmpesa_Jsonclick ;
   private String lblTextblock25_Jsonclick ;
   private String edtFTCEmpesaE_Jsonclick ;
   private String lblTextblock26_Jsonclick ;
   private String edtFTCAncho_Jsonclick ;
   private String lblTextblock27_Jsonclick ;
   private String edtFTCMetros_Jsonclick ;
   private String lblTextblock28_Jsonclick ;
   private String edtFTCUltLine_Jsonclick ;
   private String sGXsfl_167_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_1861_Jsonclick ;
   private String edtFTCLinea_Jsonclick ;
   private String edtFTCPresen_Jsonclick ;
   private String edtFTCLong_Jsonclick ;
   private String edtFTCLMts_Jsonclick ;
   private String edtFTCLObs_Jsonclick ;
   private String edtFTCLEtique_Jsonclick ;
   private String sGXsfl_178_fel_idx="0001" ;
   private String subGrid3_Class ;
   private String subGrid3_Linesclass ;
   private String edtavnRcdDeleted_1854_Jsonclick ;
   private String edtFTFProceso_Jsonclick ;
   private String edtFTFOrden_Jsonclick ;
   private String edtFTMaquina_Jsonclick ;
   private String edtFTFFase_Jsonclick ;
   private String edtFTFFaseDsc_Jsonclick ;
   private String edtFTFEstado_Jsonclick ;
   private String edtFTFInicio_Jsonclick ;
   private String edtFTFFin_Jsonclick ;
   private String edtFTFMetros_Jsonclick ;
   private String edtFTTKilos_Jsonclick ;
   private String sGXsfl_193_fel_idx="0001" ;
   private String subGrid4_Class ;
   private String subGrid4_Linesclass ;
   private String edtavnRcdDeleted_1853_Jsonclick ;
   private String edtFTPieza_Jsonclick ;
   private String edtFTPMetros_Jsonclick ;
   private String edtFTPKilos_Jsonclick ;
   private String edtFTPAnc_Jsonclick ;
   private String edtFTPUbicaci_Jsonclick ;
   private String edtFTPMtsAut_Jsonclick ;
   private String edtFTPKgsAut_Jsonclick ;
   private String edtFTPPiezaOr_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String lblTextblock23_Caption ;
   private String lblTextblock24_Caption ;
   private String lblTextblock25_Caption ;
   private String lblTextblock10_Caption ;
   private String lblTextblock27_Caption ;
   private String lblTextblock28_Caption ;
   private String subGrid3_Header ;
   private String subGrid4_Header ;
   private String subGrid2_Header ;
   private String ZZ396EmprCod ;
   private String ZZ13530FTHdrP ;
   private String ZZ407EmprNom ;
   private String ZZ13532FTCliNom ;
   private String ZZ13533FTArticulo ;
   private String ZZ13534FTArtDsc ;
   private String ZZ13537FTColor ;
   private String ZZ13588FTArticExt ;
   private String ZZ13589FTHdrExt ;
   private String ZZ13590FTTipo ;
   private java.util.Date Z13553FTFInicio ;
   private java.util.Date Z13554FTFFin ;
   private java.util.Date A13553FTFInicio ;
   private java.util.Date A13554FTFFin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_130_Refreshing=false ;
   private boolean bGXsfl_178_Refreshing=false ;
   private boolean bGXsfl_193_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n13531FTClicod ;
   private boolean n13532FTCliNom ;
   private boolean n13533FTArticulo ;
   private boolean n13534FTArtDsc ;
   private boolean n13535FTAnc ;
   private boolean n13536FTGrm2 ;
   private boolean n13537FTColor ;
   private boolean n13538FTColorNum ;
   private boolean n13539FTEstado ;
   private boolean n13540FTMetros ;
   private boolean n13541FTKilos ;
   private boolean n13542FTPzas ;
   private boolean n13561FTSituacio ;
   private boolean n13588FTArticExt ;
   private boolean n13589FTHdrExt ;
   private boolean n13590FTTipo ;
   private boolean n13591FTObs ;
   private boolean bGXsfl_167_Refreshing=false ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n13593FTCEmpesa ;
   private boolean n13594FTCEmpesaE ;
   private boolean n13595FTCAncho ;
   private boolean n13596FTCMetros ;
   private boolean n13597FTCUltLine ;
   private boolean n13599FTCPresen ;
   private boolean n13600FTCLong ;
   private boolean n13601FTCLMts ;
   private boolean n13602FTCLObs ;
   private boolean n13603FTCLEtique ;
   private boolean n13560FTMaquina ;
   private boolean n13550FTFFase ;
   private boolean n13551FTFFaseDsc ;
   private boolean n13552FTFEstado ;
   private boolean n13553FTFInicio ;
   private boolean n13554FTFFin ;
   private boolean n13555FTFMetros ;
   private boolean n13556FTTKilos ;
   private boolean n13544FTPMetros ;
   private boolean n13545FTPKilos ;
   private boolean n13546FTPAnc ;
   private boolean n13547FTPUbicaci ;
   private boolean n13557FTPMtsAut ;
   private boolean n13558FTPKgsAut ;
   private boolean n13559FTPPiezaOr ;
   private String Z13591FTObs ;
   private String A13591FTObs ;
   private String ZZ13591FTObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid3Container ;
   private com.genexus.webpanels.GXWebGrid Grid4Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebRow Grid3Row ;
   private com.genexus.webpanels.GXWebRow Grid4Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid3Column ;
   private com.genexus.webpanels.GXWebColumn Grid4Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01OI12_A407EmprNom ;
   private boolean[] T01OI12_n407EmprNom ;
   private int[] T01OI13_A13528FTHdr ;
   private byte[] T01OI13_A13529FTHdrR ;
   private String[] T01OI13_A13530FTHdrP ;
   private String[] T01OI13_A407EmprNom ;
   private boolean[] T01OI13_n407EmprNom ;
   private int[] T01OI13_A13531FTClicod ;
   private boolean[] T01OI13_n13531FTClicod ;
   private String[] T01OI13_A13532FTCliNom ;
   private boolean[] T01OI13_n13532FTCliNom ;
   private String[] T01OI13_A13533FTArticulo ;
   private boolean[] T01OI13_n13533FTArticulo ;
   private String[] T01OI13_A13534FTArtDsc ;
   private boolean[] T01OI13_n13534FTArtDsc ;
   private short[] T01OI13_A13535FTAnc ;
   private boolean[] T01OI13_n13535FTAnc ;
   private short[] T01OI13_A13536FTGrm2 ;
   private boolean[] T01OI13_n13536FTGrm2 ;
   private String[] T01OI13_A13537FTColor ;
   private boolean[] T01OI13_n13537FTColor ;
   private int[] T01OI13_A13538FTColorNum ;
   private boolean[] T01OI13_n13538FTColorNum ;
   private byte[] T01OI13_A13539FTEstado ;
   private boolean[] T01OI13_n13539FTEstado ;
   private java.math.BigDecimal[] T01OI13_A13540FTMetros ;
   private boolean[] T01OI13_n13540FTMetros ;
   private java.math.BigDecimal[] T01OI13_A13541FTKilos ;
   private boolean[] T01OI13_n13541FTKilos ;
   private int[] T01OI13_A13542FTPzas ;
   private boolean[] T01OI13_n13542FTPzas ;
   private byte[] T01OI13_A13561FTSituacio ;
   private boolean[] T01OI13_n13561FTSituacio ;
   private String[] T01OI13_A13588FTArticExt ;
   private boolean[] T01OI13_n13588FTArticExt ;
   private String[] T01OI13_A13589FTHdrExt ;
   private boolean[] T01OI13_n13589FTHdrExt ;
   private String[] T01OI13_A13590FTTipo ;
   private boolean[] T01OI13_n13590FTTipo ;
   private String[] T01OI13_A13591FTObs ;
   private boolean[] T01OI13_n13591FTObs ;
   private String[] T01OI13_A396EmprCod ;
   private String[] T01OI14_A396EmprCod ;
   private int[] T01OI14_A13528FTHdr ;
   private byte[] T01OI14_A13529FTHdrR ;
   private String[] T01OI14_A13530FTHdrP ;
   private int[] T01OI11_A13528FTHdr ;
   private byte[] T01OI11_A13529FTHdrR ;
   private String[] T01OI11_A13530FTHdrP ;
   private int[] T01OI11_A13531FTClicod ;
   private boolean[] T01OI11_n13531FTClicod ;
   private String[] T01OI11_A13532FTCliNom ;
   private boolean[] T01OI11_n13532FTCliNom ;
   private String[] T01OI11_A13533FTArticulo ;
   private boolean[] T01OI11_n13533FTArticulo ;
   private String[] T01OI11_A13534FTArtDsc ;
   private boolean[] T01OI11_n13534FTArtDsc ;
   private short[] T01OI11_A13535FTAnc ;
   private boolean[] T01OI11_n13535FTAnc ;
   private short[] T01OI11_A13536FTGrm2 ;
   private boolean[] T01OI11_n13536FTGrm2 ;
   private String[] T01OI11_A13537FTColor ;
   private boolean[] T01OI11_n13537FTColor ;
   private int[] T01OI11_A13538FTColorNum ;
   private boolean[] T01OI11_n13538FTColorNum ;
   private byte[] T01OI11_A13539FTEstado ;
   private boolean[] T01OI11_n13539FTEstado ;
   private java.math.BigDecimal[] T01OI11_A13540FTMetros ;
   private boolean[] T01OI11_n13540FTMetros ;
   private java.math.BigDecimal[] T01OI11_A13541FTKilos ;
   private boolean[] T01OI11_n13541FTKilos ;
   private int[] T01OI11_A13542FTPzas ;
   private boolean[] T01OI11_n13542FTPzas ;
   private byte[] T01OI11_A13561FTSituacio ;
   private boolean[] T01OI11_n13561FTSituacio ;
   private String[] T01OI11_A13588FTArticExt ;
   private boolean[] T01OI11_n13588FTArticExt ;
   private String[] T01OI11_A13589FTHdrExt ;
   private boolean[] T01OI11_n13589FTHdrExt ;
   private String[] T01OI11_A13590FTTipo ;
   private boolean[] T01OI11_n13590FTTipo ;
   private String[] T01OI11_A13591FTObs ;
   private boolean[] T01OI11_n13591FTObs ;
   private String[] T01OI11_A396EmprCod ;
   private String[] T01OI15_A396EmprCod ;
   private int[] T01OI15_A13528FTHdr ;
   private byte[] T01OI15_A13529FTHdrR ;
   private String[] T01OI15_A13530FTHdrP ;
   private String[] T01OI16_A396EmprCod ;
   private int[] T01OI16_A13528FTHdr ;
   private byte[] T01OI16_A13529FTHdrR ;
   private String[] T01OI16_A13530FTHdrP ;
   private int[] T01OI10_A13528FTHdr ;
   private byte[] T01OI10_A13529FTHdrR ;
   private String[] T01OI10_A13530FTHdrP ;
   private int[] T01OI10_A13531FTClicod ;
   private boolean[] T01OI10_n13531FTClicod ;
   private String[] T01OI10_A13532FTCliNom ;
   private boolean[] T01OI10_n13532FTCliNom ;
   private String[] T01OI10_A13533FTArticulo ;
   private boolean[] T01OI10_n13533FTArticulo ;
   private String[] T01OI10_A13534FTArtDsc ;
   private boolean[] T01OI10_n13534FTArtDsc ;
   private short[] T01OI10_A13535FTAnc ;
   private boolean[] T01OI10_n13535FTAnc ;
   private short[] T01OI10_A13536FTGrm2 ;
   private boolean[] T01OI10_n13536FTGrm2 ;
   private String[] T01OI10_A13537FTColor ;
   private boolean[] T01OI10_n13537FTColor ;
   private int[] T01OI10_A13538FTColorNum ;
   private boolean[] T01OI10_n13538FTColorNum ;
   private byte[] T01OI10_A13539FTEstado ;
   private boolean[] T01OI10_n13539FTEstado ;
   private java.math.BigDecimal[] T01OI10_A13540FTMetros ;
   private boolean[] T01OI10_n13540FTMetros ;
   private java.math.BigDecimal[] T01OI10_A13541FTKilos ;
   private boolean[] T01OI10_n13541FTKilos ;
   private int[] T01OI10_A13542FTPzas ;
   private boolean[] T01OI10_n13542FTPzas ;
   private byte[] T01OI10_A13561FTSituacio ;
   private boolean[] T01OI10_n13561FTSituacio ;
   private String[] T01OI10_A13588FTArticExt ;
   private boolean[] T01OI10_n13588FTArticExt ;
   private String[] T01OI10_A13589FTHdrExt ;
   private boolean[] T01OI10_n13589FTHdrExt ;
   private String[] T01OI10_A13590FTTipo ;
   private boolean[] T01OI10_n13590FTTipo ;
   private String[] T01OI10_A13591FTObs ;
   private boolean[] T01OI10_n13591FTObs ;
   private String[] T01OI10_A396EmprCod ;
   private String[] T01OI20_A396EmprCod ;
   private int[] T01OI20_A13528FTHdr ;
   private byte[] T01OI20_A13529FTHdrR ;
   private String[] T01OI20_A13530FTHdrP ;
   private String[] T01OI20_A13592FTCLote ;
   private String[] T01OI21_A396EmprCod ;
   private int[] T01OI21_A13528FTHdr ;
   private byte[] T01OI21_A13529FTHdrR ;
   private String[] T01OI21_A13530FTHdrP ;
   private String[] T01OI22_A396EmprCod ;
   private int[] T01OI22_A13528FTHdr ;
   private byte[] T01OI22_A13529FTHdrR ;
   private String[] T01OI22_A13530FTHdrP ;
   private String[] T01OI22_A13592FTCLote ;
   private String[] T01OI22_A13593FTCEmpesa ;
   private boolean[] T01OI22_n13593FTCEmpesa ;
   private String[] T01OI22_A13594FTCEmpesaE ;
   private boolean[] T01OI22_n13594FTCEmpesaE ;
   private short[] T01OI22_A13595FTCAncho ;
   private boolean[] T01OI22_n13595FTCAncho ;
   private java.math.BigDecimal[] T01OI22_A13596FTCMetros ;
   private boolean[] T01OI22_n13596FTCMetros ;
   private short[] T01OI22_A13597FTCUltLine ;
   private boolean[] T01OI22_n13597FTCUltLine ;
   private String[] T01OI23_A396EmprCod ;
   private int[] T01OI23_A13528FTHdr ;
   private byte[] T01OI23_A13529FTHdrR ;
   private String[] T01OI23_A13530FTHdrP ;
   private String[] T01OI23_A13592FTCLote ;
   private String[] T01OI9_A396EmprCod ;
   private int[] T01OI9_A13528FTHdr ;
   private byte[] T01OI9_A13529FTHdrR ;
   private String[] T01OI9_A13530FTHdrP ;
   private String[] T01OI9_A13592FTCLote ;
   private String[] T01OI9_A13593FTCEmpesa ;
   private boolean[] T01OI9_n13593FTCEmpesa ;
   private String[] T01OI9_A13594FTCEmpesaE ;
   private boolean[] T01OI9_n13594FTCEmpesaE ;
   private short[] T01OI9_A13595FTCAncho ;
   private boolean[] T01OI9_n13595FTCAncho ;
   private java.math.BigDecimal[] T01OI9_A13596FTCMetros ;
   private boolean[] T01OI9_n13596FTCMetros ;
   private short[] T01OI9_A13597FTCUltLine ;
   private boolean[] T01OI9_n13597FTCUltLine ;
   private String[] T01OI8_A396EmprCod ;
   private int[] T01OI8_A13528FTHdr ;
   private byte[] T01OI8_A13529FTHdrR ;
   private String[] T01OI8_A13530FTHdrP ;
   private String[] T01OI8_A13592FTCLote ;
   private String[] T01OI8_A13593FTCEmpesa ;
   private boolean[] T01OI8_n13593FTCEmpesa ;
   private String[] T01OI8_A13594FTCEmpesaE ;
   private boolean[] T01OI8_n13594FTCEmpesaE ;
   private short[] T01OI8_A13595FTCAncho ;
   private boolean[] T01OI8_n13595FTCAncho ;
   private java.math.BigDecimal[] T01OI8_A13596FTCMetros ;
   private boolean[] T01OI8_n13596FTCMetros ;
   private short[] T01OI8_A13597FTCUltLine ;
   private boolean[] T01OI8_n13597FTCUltLine ;
   private String[] T01OI27_A396EmprCod ;
   private int[] T01OI27_A13528FTHdr ;
   private byte[] T01OI27_A13529FTHdrR ;
   private String[] T01OI27_A13530FTHdrP ;
   private String[] T01OI27_A13592FTCLote ;
   private String[] T01OI28_A396EmprCod ;
   private int[] T01OI28_A13528FTHdr ;
   private byte[] T01OI28_A13529FTHdrR ;
   private String[] T01OI28_A13530FTHdrP ;
   private String[] T01OI28_A13592FTCLote ;
   private short[] T01OI28_A13598FTCLinea ;
   private String[] T01OI28_A13599FTCPresen ;
   private boolean[] T01OI28_n13599FTCPresen ;
   private short[] T01OI28_A13600FTCLong ;
   private boolean[] T01OI28_n13600FTCLong ;
   private java.math.BigDecimal[] T01OI28_A13601FTCLMts ;
   private boolean[] T01OI28_n13601FTCLMts ;
   private String[] T01OI28_A13602FTCLObs ;
   private boolean[] T01OI28_n13602FTCLObs ;
   private String[] T01OI28_A13603FTCLEtique ;
   private boolean[] T01OI28_n13603FTCLEtique ;
   private String[] T01OI29_A396EmprCod ;
   private int[] T01OI29_A13528FTHdr ;
   private byte[] T01OI29_A13529FTHdrR ;
   private String[] T01OI29_A13530FTHdrP ;
   private String[] T01OI29_A13592FTCLote ;
   private short[] T01OI29_A13598FTCLinea ;
   private String[] T01OI7_A396EmprCod ;
   private int[] T01OI7_A13528FTHdr ;
   private byte[] T01OI7_A13529FTHdrR ;
   private String[] T01OI7_A13530FTHdrP ;
   private String[] T01OI7_A13592FTCLote ;
   private short[] T01OI7_A13598FTCLinea ;
   private String[] T01OI7_A13599FTCPresen ;
   private boolean[] T01OI7_n13599FTCPresen ;
   private short[] T01OI7_A13600FTCLong ;
   private boolean[] T01OI7_n13600FTCLong ;
   private java.math.BigDecimal[] T01OI7_A13601FTCLMts ;
   private boolean[] T01OI7_n13601FTCLMts ;
   private String[] T01OI7_A13602FTCLObs ;
   private boolean[] T01OI7_n13602FTCLObs ;
   private String[] T01OI7_A13603FTCLEtique ;
   private boolean[] T01OI7_n13603FTCLEtique ;
   private String[] T01OI6_A396EmprCod ;
   private int[] T01OI6_A13528FTHdr ;
   private byte[] T01OI6_A13529FTHdrR ;
   private String[] T01OI6_A13530FTHdrP ;
   private String[] T01OI6_A13592FTCLote ;
   private short[] T01OI6_A13598FTCLinea ;
   private String[] T01OI6_A13599FTCPresen ;
   private boolean[] T01OI6_n13599FTCPresen ;
   private short[] T01OI6_A13600FTCLong ;
   private boolean[] T01OI6_n13600FTCLong ;
   private java.math.BigDecimal[] T01OI6_A13601FTCLMts ;
   private boolean[] T01OI6_n13601FTCLMts ;
   private String[] T01OI6_A13602FTCLObs ;
   private boolean[] T01OI6_n13602FTCLObs ;
   private String[] T01OI6_A13603FTCLEtique ;
   private boolean[] T01OI6_n13603FTCLEtique ;
   private String[] T01OI33_A396EmprCod ;
   private int[] T01OI33_A13528FTHdr ;
   private byte[] T01OI33_A13529FTHdrR ;
   private String[] T01OI33_A13530FTHdrP ;
   private String[] T01OI33_A13592FTCLote ;
   private short[] T01OI33_A13598FTCLinea ;
   private String[] T01OI34_A396EmprCod ;
   private int[] T01OI34_A13528FTHdr ;
   private byte[] T01OI34_A13529FTHdrR ;
   private String[] T01OI34_A13530FTHdrP ;
   private String[] T01OI34_A13548FTFProceso ;
   private short[] T01OI34_A13549FTFOrden ;
   private String[] T01OI34_A13560FTMaquina ;
   private boolean[] T01OI34_n13560FTMaquina ;
   private String[] T01OI34_A13550FTFFase ;
   private boolean[] T01OI34_n13550FTFFase ;
   private String[] T01OI34_A13551FTFFaseDsc ;
   private boolean[] T01OI34_n13551FTFFaseDsc ;
   private byte[] T01OI34_A13552FTFEstado ;
   private boolean[] T01OI34_n13552FTFEstado ;
   private java.util.Date[] T01OI34_A13553FTFInicio ;
   private boolean[] T01OI34_n13553FTFInicio ;
   private java.util.Date[] T01OI34_A13554FTFFin ;
   private boolean[] T01OI34_n13554FTFFin ;
   private java.math.BigDecimal[] T01OI34_A13555FTFMetros ;
   private boolean[] T01OI34_n13555FTFMetros ;
   private java.math.BigDecimal[] T01OI34_A13556FTTKilos ;
   private boolean[] T01OI34_n13556FTTKilos ;
   private String[] T01OI35_A396EmprCod ;
   private int[] T01OI35_A13528FTHdr ;
   private byte[] T01OI35_A13529FTHdrR ;
   private String[] T01OI35_A13530FTHdrP ;
   private String[] T01OI35_A13548FTFProceso ;
   private short[] T01OI35_A13549FTFOrden ;
   private String[] T01OI5_A396EmprCod ;
   private int[] T01OI5_A13528FTHdr ;
   private byte[] T01OI5_A13529FTHdrR ;
   private String[] T01OI5_A13530FTHdrP ;
   private String[] T01OI5_A13548FTFProceso ;
   private short[] T01OI5_A13549FTFOrden ;
   private String[] T01OI5_A13560FTMaquina ;
   private boolean[] T01OI5_n13560FTMaquina ;
   private String[] T01OI5_A13550FTFFase ;
   private boolean[] T01OI5_n13550FTFFase ;
   private String[] T01OI5_A13551FTFFaseDsc ;
   private boolean[] T01OI5_n13551FTFFaseDsc ;
   private byte[] T01OI5_A13552FTFEstado ;
   private boolean[] T01OI5_n13552FTFEstado ;
   private java.util.Date[] T01OI5_A13553FTFInicio ;
   private boolean[] T01OI5_n13553FTFInicio ;
   private java.util.Date[] T01OI5_A13554FTFFin ;
   private boolean[] T01OI5_n13554FTFFin ;
   private java.math.BigDecimal[] T01OI5_A13555FTFMetros ;
   private boolean[] T01OI5_n13555FTFMetros ;
   private java.math.BigDecimal[] T01OI5_A13556FTTKilos ;
   private boolean[] T01OI5_n13556FTTKilos ;
   private String[] T01OI4_A396EmprCod ;
   private int[] T01OI4_A13528FTHdr ;
   private byte[] T01OI4_A13529FTHdrR ;
   private String[] T01OI4_A13530FTHdrP ;
   private String[] T01OI4_A13548FTFProceso ;
   private short[] T01OI4_A13549FTFOrden ;
   private String[] T01OI4_A13560FTMaquina ;
   private boolean[] T01OI4_n13560FTMaquina ;
   private String[] T01OI4_A13550FTFFase ;
   private boolean[] T01OI4_n13550FTFFase ;
   private String[] T01OI4_A13551FTFFaseDsc ;
   private boolean[] T01OI4_n13551FTFFaseDsc ;
   private byte[] T01OI4_A13552FTFEstado ;
   private boolean[] T01OI4_n13552FTFEstado ;
   private java.util.Date[] T01OI4_A13553FTFInicio ;
   private boolean[] T01OI4_n13553FTFInicio ;
   private java.util.Date[] T01OI4_A13554FTFFin ;
   private boolean[] T01OI4_n13554FTFFin ;
   private java.math.BigDecimal[] T01OI4_A13555FTFMetros ;
   private boolean[] T01OI4_n13555FTFMetros ;
   private java.math.BigDecimal[] T01OI4_A13556FTTKilos ;
   private boolean[] T01OI4_n13556FTTKilos ;
   private String[] T01OI39_A396EmprCod ;
   private int[] T01OI39_A13528FTHdr ;
   private byte[] T01OI39_A13529FTHdrR ;
   private String[] T01OI39_A13530FTHdrP ;
   private String[] T01OI39_A13548FTFProceso ;
   private short[] T01OI39_A13549FTFOrden ;
   private String[] T01OI40_A396EmprCod ;
   private int[] T01OI40_A13528FTHdr ;
   private byte[] T01OI40_A13529FTHdrR ;
   private String[] T01OI40_A13530FTHdrP ;
   private String[] T01OI40_A13543FTPieza ;
   private java.math.BigDecimal[] T01OI40_A13544FTPMetros ;
   private boolean[] T01OI40_n13544FTPMetros ;
   private java.math.BigDecimal[] T01OI40_A13545FTPKilos ;
   private boolean[] T01OI40_n13545FTPKilos ;
   private short[] T01OI40_A13546FTPAnc ;
   private boolean[] T01OI40_n13546FTPAnc ;
   private String[] T01OI40_A13547FTPUbicaci ;
   private boolean[] T01OI40_n13547FTPUbicaci ;
   private java.math.BigDecimal[] T01OI40_A13557FTPMtsAut ;
   private boolean[] T01OI40_n13557FTPMtsAut ;
   private java.math.BigDecimal[] T01OI40_A13558FTPKgsAut ;
   private boolean[] T01OI40_n13558FTPKgsAut ;
   private String[] T01OI40_A13559FTPPiezaOr ;
   private boolean[] T01OI40_n13559FTPPiezaOr ;
   private String[] T01OI41_A396EmprCod ;
   private int[] T01OI41_A13528FTHdr ;
   private byte[] T01OI41_A13529FTHdrR ;
   private String[] T01OI41_A13530FTHdrP ;
   private String[] T01OI41_A13543FTPieza ;
   private String[] T01OI3_A396EmprCod ;
   private int[] T01OI3_A13528FTHdr ;
   private byte[] T01OI3_A13529FTHdrR ;
   private String[] T01OI3_A13530FTHdrP ;
   private String[] T01OI3_A13543FTPieza ;
   private java.math.BigDecimal[] T01OI3_A13544FTPMetros ;
   private boolean[] T01OI3_n13544FTPMetros ;
   private java.math.BigDecimal[] T01OI3_A13545FTPKilos ;
   private boolean[] T01OI3_n13545FTPKilos ;
   private short[] T01OI3_A13546FTPAnc ;
   private boolean[] T01OI3_n13546FTPAnc ;
   private String[] T01OI3_A13547FTPUbicaci ;
   private boolean[] T01OI3_n13547FTPUbicaci ;
   private java.math.BigDecimal[] T01OI3_A13557FTPMtsAut ;
   private boolean[] T01OI3_n13557FTPMtsAut ;
   private java.math.BigDecimal[] T01OI3_A13558FTPKgsAut ;
   private boolean[] T01OI3_n13558FTPKgsAut ;
   private String[] T01OI3_A13559FTPPiezaOr ;
   private boolean[] T01OI3_n13559FTPPiezaOr ;
   private String[] T01OI2_A396EmprCod ;
   private int[] T01OI2_A13528FTHdr ;
   private byte[] T01OI2_A13529FTHdrR ;
   private String[] T01OI2_A13530FTHdrP ;
   private String[] T01OI2_A13543FTPieza ;
   private java.math.BigDecimal[] T01OI2_A13544FTPMetros ;
   private boolean[] T01OI2_n13544FTPMetros ;
   private java.math.BigDecimal[] T01OI2_A13545FTPKilos ;
   private boolean[] T01OI2_n13545FTPKilos ;
   private short[] T01OI2_A13546FTPAnc ;
   private boolean[] T01OI2_n13546FTPAnc ;
   private String[] T01OI2_A13547FTPUbicaci ;
   private boolean[] T01OI2_n13547FTPUbicaci ;
   private java.math.BigDecimal[] T01OI2_A13557FTPMtsAut ;
   private boolean[] T01OI2_n13557FTPMtsAut ;
   private java.math.BigDecimal[] T01OI2_A13558FTPKgsAut ;
   private boolean[] T01OI2_n13558FTPKgsAut ;
   private String[] T01OI2_A13559FTPPiezaOr ;
   private boolean[] T01OI2_n13559FTPPiezaOr ;
   private String[] T01OI45_A396EmprCod ;
   private int[] T01OI45_A13528FTHdr ;
   private byte[] T01OI45_A13529FTHdrR ;
   private String[] T01OI45_A13530FTHdrP ;
   private String[] T01OI45_A13543FTPieza ;
   private String[] T01OI46_A407EmprNom ;
   private boolean[] T01OI46_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tfrtohd__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfrtohd__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfrtohd__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfrtohd__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfrtohd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01OI2", "SELECT EmprCod, FTHdr, FTHdrR, FTHdrP, FTPieza, FTPMetros, FTPKilos, FTPAnc, FTPUbicaci, FTPMtsAut, FTPKgsAut, FTPPiezaOr FROM TXPFRTOH1 WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ? AND FTPieza = ?  FOR UPDATE OF FTPMetros, FTPKilos, FTPAnc, FTPUbicaci, FTPMtsAut, FTPKgsAut, FTPPiezaOr NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OI3", "SELECT EmprCod, FTHdr, FTHdrR, FTHdrP, FTPieza, FTPMetros, FTPKilos, FTPAnc, FTPUbicaci, FTPMtsAut, FTPKgsAut, FTPPiezaOr FROM TXPFRTOH1 WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ? AND FTPieza = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OI4", "SELECT EmprCod, FTHdr, FTHdrR, FTHdrP, FTFProceso, FTFOrden, FTMaquina, FTFFase, FTFFaseDsc, FTFEstado, FTFInicio, FTFFin, FTFMetros, FTTKilos FROM TXPFRTOH2 WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ? AND FTFProceso = ? AND FTFOrden = ?  FOR UPDATE OF FTMaquina, FTFFase, FTFFaseDsc, FTFEstado, FTFInicio, FTFFin, FTFMetros, FTTKilos NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OI5", "SELECT EmprCod, FTHdr, FTHdrR, FTHdrP, FTFProceso, FTFOrden, FTMaquina, FTFFase, FTFFaseDsc, FTFEstado, FTFInicio, FTFFin, FTFMetros, FTTKilos FROM TXPFRTOH2 WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ? AND FTFProceso = ? AND FTFOrden = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OI6", "SELECT EmprCod, FTHdr, FTHdrR, FTHdrP, FTCLote, FTCLinea, FTCPresen, FTCLong, FTCLMts, FTCLObs, FTCLEtique FROM TXPFRTOH4 WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ? AND FTCLote = ? AND FTCLinea = ?  FOR UPDATE OF FTCPresen, FTCLong, FTCLMts, FTCLObs, FTCLEtique NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OI7", "SELECT EmprCod, FTHdr, FTHdrR, FTHdrP, FTCLote, FTCLinea, FTCPresen, FTCLong, FTCLMts, FTCLObs, FTCLEtique FROM TXPFRTOH4 WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ? AND FTCLote = ? AND FTCLinea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OI8", "SELECT EmprCod, FTHdr, FTHdrR, FTHdrP, FTCLote, FTCEmpesa, FTCEmpesaE, FTCAncho, FTCMetros, FTCUltLine FROM TXPFRTOH3 WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ? AND FTCLote = ?  FOR UPDATE OF FTCEmpesa, FTCEmpesaE, FTCAncho, FTCMetros, FTCUltLine NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OI9", "SELECT EmprCod, FTHdr, FTHdrR, FTHdrP, FTCLote, FTCEmpesa, FTCEmpesaE, FTCAncho, FTCMetros, FTCUltLine FROM TXPFRTOH3 WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ? AND FTCLote = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OI10", "SELECT FTHdr, FTHdrR, FTHdrP, FTClicod, FTCliNom, FTArticulo, FTArtDsc, FTAnc, FTGrm2, FTColor, FTColorNum, FTEstado, FTMetros, FTKilos, FTPzas, FTSituacio, FTArticExt, FTHdrExt, FTTipo, FTObs, EmprCod FROM TXPFRTOHD WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ?  FOR UPDATE OF FTClicod, FTCliNom, FTArticulo, FTArtDsc, FTAnc, FTGrm2, FTColor, FTColorNum, FTEstado, FTMetros, FTKilos, FTPzas, FTSituacio, FTArticExt, FTHdrExt, FTTipo, FTObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OI11", "SELECT FTHdr, FTHdrR, FTHdrP, FTClicod, FTCliNom, FTArticulo, FTArtDsc, FTAnc, FTGrm2, FTColor, FTColorNum, FTEstado, FTMetros, FTKilos, FTPzas, FTSituacio, FTArticExt, FTHdrExt, FTTipo, FTObs, EmprCod FROM TXPFRTOHD WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OI12", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OI13", "SELECT /*+ FIRST_ROWS(100) */ TM1.FTHdr, TM1.FTHdrR, TM1.FTHdrP, T2.EmprNom, TM1.FTClicod, TM1.FTCliNom, TM1.FTArticulo, TM1.FTArtDsc, TM1.FTAnc, TM1.FTGrm2, TM1.FTColor, TM1.FTColorNum, TM1.FTEstado, TM1.FTMetros, TM1.FTKilos, TM1.FTPzas, TM1.FTSituacio, TM1.FTArticExt, TM1.FTHdrExt, TM1.FTTipo, TM1.FTObs, TM1.EmprCod FROM (TXPFRTOHD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.FTHdr = ? and TM1.FTHdrR = ? and TM1.FTHdrP = ? ORDER BY TM1.EmprCod, TM1.FTHdr, TM1.FTHdrR, TM1.FTHdrP ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OI14", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, FTHdr, FTHdrR, FTHdrP FROM TXPFRTOHD WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OI15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, FTHdr, FTHdrR, FTHdrP FROM TXPFRTOHD WHERE ( FTHdr > ? or FTHdr = ? and FTHdrR > ? or FTHdrR = ? and FTHdr = ? and FTHdrP > ?) and EmprCod = ? ORDER BY EmprCod, FTHdr, FTHdrR, FTHdrP) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OI16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, FTHdr, FTHdrR, FTHdrP FROM TXPFRTOHD WHERE ( FTHdr < ? or FTHdr = ? and FTHdrR < ? or FTHdrR = ? and FTHdr = ? and FTHdrP < ?) and EmprCod = ? ORDER BY EmprCod DESC, FTHdr DESC, FTHdrR DESC, FTHdrP DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01OI17", "INSERT INTO TXPFRTOHD(FTHdr, FTHdrR, FTHdrP, FTClicod, FTCliNom, FTArticulo, FTArtDsc, FTAnc, FTGrm2, FTColor, FTColorNum, FTEstado, FTMetros, FTKilos, FTPzas, FTSituacio, FTArticExt, FTHdrExt, FTTipo, FTObs, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPFRTOHD")
         ,new UpdateCursor("T01OI18", "UPDATE TXPFRTOHD SET FTClicod=?, FTCliNom=?, FTArticulo=?, FTArtDsc=?, FTAnc=?, FTGrm2=?, FTColor=?, FTColorNum=?, FTEstado=?, FTMetros=?, FTKilos=?, FTPzas=?, FTSituacio=?, FTArticExt=?, FTHdrExt=?, FTTipo=?, FTObs=?  WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ?", GX_NOMASK, "TXPFRTOHD")
         ,new UpdateCursor("T01OI19", "DELETE FROM TXPFRTOHD  WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ?", GX_NOMASK, "TXPFRTOHD")
         ,new ForEachCursor("T01OI20", "SELECT * FROM (SELECT EmprCod, FTHdr, FTHdrR, FTHdrP, FTCLote FROM TXPFRTOH3 WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OI21", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, FTHdr, FTHdrR, FTHdrP FROM TXPFRTOHD WHERE EmprCod = ? ORDER BY EmprCod, FTHdr, FTHdrR, FTHdrP ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OI22", "SELECT EmprCod, FTHdr, FTHdrR, FTHdrP, FTCLote, FTCEmpesa, FTCEmpesaE, FTCAncho, FTCMetros, FTCUltLine FROM TXPFRTOH3 WHERE EmprCod = ? and FTHdr = ? and FTHdrR = ? and FTHdrP = ? and FTCLote = ? ORDER BY EmprCod, FTHdr, FTHdrR, FTHdrP, FTCLote ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OI23", "SELECT EmprCod, FTHdr, FTHdrR, FTHdrP, FTCLote FROM TXPFRTOH3 WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ? AND FTCLote = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01OI24", "INSERT INTO TXPFRTOH3(EmprCod, FTHdr, FTHdrR, FTHdrP, FTCLote, FTCEmpesa, FTCEmpesaE, FTCAncho, FTCMetros, FTCUltLine) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPFRTOH3")
         ,new UpdateCursor("T01OI25", "UPDATE TXPFRTOH3 SET FTCEmpesa=?, FTCEmpesaE=?, FTCAncho=?, FTCMetros=?, FTCUltLine=?  WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ? AND FTCLote = ?", GX_NOMASK, "TXPFRTOH3")
         ,new UpdateCursor("T01OI26", "DELETE FROM TXPFRTOH3  WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ? AND FTCLote = ?", GX_NOMASK, "TXPFRTOH3")
         ,new ForEachCursor("T01OI27", "SELECT EmprCod, FTHdr, FTHdrR, FTHdrP, FTCLote FROM TXPFRTOH3 WHERE EmprCod = ? and FTHdr = ? and FTHdrR = ? and FTHdrP = ? ORDER BY EmprCod, FTHdr, FTHdrR, FTHdrP, FTCLote ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OI28", "SELECT EmprCod, FTHdr, FTHdrR, FTHdrP, FTCLote, FTCLinea, FTCPresen, FTCLong, FTCLMts, FTCLObs, FTCLEtique FROM TXPFRTOH4 WHERE EmprCod = ? and FTHdr = ? and FTHdrR = ? and FTHdrP = ? and FTCLote = ? and FTCLinea = ? ORDER BY EmprCod, FTHdr, FTHdrR, FTHdrP, FTCLote, FTCLinea ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OI29", "SELECT EmprCod, FTHdr, FTHdrR, FTHdrP, FTCLote, FTCLinea FROM TXPFRTOH4 WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ? AND FTCLote = ? AND FTCLinea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01OI30", "INSERT INTO TXPFRTOH4(EmprCod, FTHdr, FTHdrR, FTHdrP, FTCLote, FTCLinea, FTCPresen, FTCLong, FTCLMts, FTCLObs, FTCLEtique) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPFRTOH4")
         ,new UpdateCursor("T01OI31", "UPDATE TXPFRTOH4 SET FTCPresen=?, FTCLong=?, FTCLMts=?, FTCLObs=?, FTCLEtique=?  WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ? AND FTCLote = ? AND FTCLinea = ?", GX_NOMASK, "TXPFRTOH4")
         ,new UpdateCursor("T01OI32", "DELETE FROM TXPFRTOH4  WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ? AND FTCLote = ? AND FTCLinea = ?", GX_NOMASK, "TXPFRTOH4")
         ,new ForEachCursor("T01OI33", "SELECT EmprCod, FTHdr, FTHdrR, FTHdrP, FTCLote, FTCLinea FROM TXPFRTOH4 WHERE EmprCod = ? and FTHdr = ? and FTHdrR = ? and FTHdrP = ? and FTCLote = ? ORDER BY EmprCod, FTHdr, FTHdrR, FTHdrP, FTCLote, FTCLinea ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OI34", "SELECT EmprCod, FTHdr, FTHdrR, FTHdrP, FTFProceso, FTFOrden, FTMaquina, FTFFase, FTFFaseDsc, FTFEstado, FTFInicio, FTFFin, FTFMetros, FTTKilos FROM TXPFRTOH2 WHERE EmprCod = ? and FTHdr = ? and FTHdrR = ? and FTHdrP = ? and FTFProceso = ? and FTFOrden = ? ORDER BY EmprCod, FTHdr, FTHdrR, FTHdrP, FTFProceso, FTFOrden ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OI35", "SELECT EmprCod, FTHdr, FTHdrR, FTHdrP, FTFProceso, FTFOrden FROM TXPFRTOH2 WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ? AND FTFProceso = ? AND FTFOrden = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01OI36", "INSERT INTO TXPFRTOH2(EmprCod, FTHdr, FTHdrR, FTHdrP, FTFProceso, FTFOrden, FTMaquina, FTFFase, FTFFaseDsc, FTFEstado, FTFInicio, FTFFin, FTFMetros, FTTKilos) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPFRTOH2")
         ,new UpdateCursor("T01OI37", "UPDATE TXPFRTOH2 SET FTMaquina=?, FTFFase=?, FTFFaseDsc=?, FTFEstado=?, FTFInicio=?, FTFFin=?, FTFMetros=?, FTTKilos=?  WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ? AND FTFProceso = ? AND FTFOrden = ?", GX_NOMASK, "TXPFRTOH2")
         ,new UpdateCursor("T01OI38", "DELETE FROM TXPFRTOH2  WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ? AND FTFProceso = ? AND FTFOrden = ?", GX_NOMASK, "TXPFRTOH2")
         ,new ForEachCursor("T01OI39", "SELECT EmprCod, FTHdr, FTHdrR, FTHdrP, FTFProceso, FTFOrden FROM TXPFRTOH2 WHERE EmprCod = ? and FTHdr = ? and FTHdrR = ? and FTHdrP = ? ORDER BY EmprCod, FTHdr, FTHdrR, FTHdrP, FTFProceso, FTFOrden ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OI40", "SELECT EmprCod, FTHdr, FTHdrR, FTHdrP, FTPieza, FTPMetros, FTPKilos, FTPAnc, FTPUbicaci, FTPMtsAut, FTPKgsAut, FTPPiezaOr FROM TXPFRTOH1 WHERE EmprCod = ? and FTHdr = ? and FTHdrR = ? and FTHdrP = ? and FTPieza = ? ORDER BY EmprCod, FTHdr, FTHdrR, FTHdrP, FTPieza ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OI41", "SELECT EmprCod, FTHdr, FTHdrR, FTHdrP, FTPieza FROM TXPFRTOH1 WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ? AND FTPieza = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01OI42", "INSERT INTO TXPFRTOH1(EmprCod, FTHdr, FTHdrR, FTHdrP, FTPieza, FTPMetros, FTPKilos, FTPAnc, FTPUbicaci, FTPMtsAut, FTPKgsAut, FTPPiezaOr) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPFRTOH1")
         ,new UpdateCursor("T01OI43", "UPDATE TXPFRTOH1 SET FTPMetros=?, FTPKilos=?, FTPAnc=?, FTPUbicaci=?, FTPMtsAut=?, FTPKgsAut=?, FTPPiezaOr=?  WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ? AND FTPieza = ?", GX_NOMASK, "TXPFRTOH1")
         ,new UpdateCursor("T01OI44", "DELETE FROM TXPFRTOH1  WHERE EmprCod = ? AND FTHdr = ? AND FTHdrR = ? AND FTHdrP = ? AND FTPieza = ?", GX_NOMASK, "TXPFRTOH1")
         ,new ForEachCursor("T01OI45", "SELECT EmprCod, FTHdr, FTHdrR, FTHdrP, FTPieza FROM TXPFRTOH1 WHERE EmprCod = ? and FTHdr = ? and FTHdrR = ? and FTHdrP = ? ORDER BY EmprCod, FTHdr, FTHdrR, FTHdrP, FTPieza ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OI46", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 9);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               ((String[]) buf[11])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 9);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 28);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 28);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 70);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 3);
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 70);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 70);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(19, 20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 28);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               ((String[]) buf[11])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 9);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 44 :
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
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 20);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 20);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 20);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 20);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 14 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 15 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 30);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 16);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 26);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[12]).shortValue());
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
                  stmt.setString(10, (String)parms[16], 13);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[18]).intValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[20]).byteValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[24], 2);
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
                  stmt.setByte(16, ((Number) parms[28]).byteValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[30], 70);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[32], 20);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[34], 1);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[36], 200);
               }
               stmt.setString(21, (String)parms[37], 3);
               return;
            case 16 :
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
                  stmt.setString(2, (String)parms[3], 30);
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 26);
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
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[17]).byteValue());
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
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[21], 2);
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
                  stmt.setByte(13, ((Number) parms[25]).byteValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 70);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 20);
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
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 200);
               }
               stmt.setString(18, (String)parms[34], 3);
               stmt.setInt(19, ((Number) parms[35]).intValue());
               stmt.setByte(20, ((Number) parms[36]).byteValue());
               stmt.setString(21, (String)parms[37], 1);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 20);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 20);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 20);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 16);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 20);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[10]).shortValue());
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
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[14]).shortValue());
               }
               return;
            case 23 :
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
                  stmt.setString(2, (String)parms[3], 20);
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
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setByte(8, ((Number) parms[12]).byteValue());
               stmt.setString(9, (String)parms[13], 1);
               stmt.setString(10, (String)parms[14], 20);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 20);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 20);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 20);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 20);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[13], 10);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[15], 20);
               }
               return;
            case 29 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 2);
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
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 10);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 20);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setByte(8, ((Number) parms[12]).byteValue());
               stmt.setString(9, (String)parms[13], 1);
               stmt.setString(10, (String)parms[14], 20);
               stmt.setShort(11, ((Number) parms[15]).shortValue());
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 20);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 20);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 6);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[9], 8);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[11], 28);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[15], false);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[17], false);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[21], 2);
               }
               return;
            case 35 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 8);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 28);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[11], false);
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
               stmt.setString(9, (String)parms[16], 3);
               stmt.setInt(10, ((Number) parms[17]).intValue());
               stmt.setByte(11, ((Number) parms[18]).byteValue());
               stmt.setString(12, (String)parms[19], 1);
               stmt.setString(13, (String)parms[20], 8);
               stmt.setShort(14, ((Number) parms[21]).shortValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
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
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 10);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[14], 2);
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
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[18], 9);
               }
               return;
            case 41 :
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
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 10);
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
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 9);
               }
               stmt.setString(8, (String)parms[14], 3);
               stmt.setInt(9, ((Number) parms[15]).intValue());
               stmt.setByte(10, ((Number) parms[16]).byteValue());
               stmt.setString(11, (String)parms[17], 1);
               stmt.setString(12, (String)parms[18], 9);
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

