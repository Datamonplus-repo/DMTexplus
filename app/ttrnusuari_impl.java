package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrnusuari_impl extends GXDataArea
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
         A943GrpId = httpContext.GetPar( "GrpId") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A943GrpId) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "USUARI", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtUsurCod_Internalname ;
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

   public ttrnusuari_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrnusuari_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrnusuari_impl.class ));
   }

   public ttrnusuari_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnUSUARI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnUSUARI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnUSUARI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnUSUARI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTrnUSUARI.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnUSUARI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtUsurCod_Internalname, GXutil.rtrim( A850UsurCod), GXutil.rtrim( localUtil.format( A850UsurCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsurCod_Jsonclick, 0, "", "", "", "", "", 1, edtUsurCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrnUSUARI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnUSUARI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre largo", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnUSUARI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtUsurNom_Internalname, GXutil.rtrim( A854UsurNom), GXutil.rtrim( localUtil.format( A854UsurNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsurNom_Jsonclick, 0, "", "", "", "", "", 1, edtUsurNom_Enabled, 0, "text", "", 35, "chr", 1, "row", 35, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrnUSUARI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Password", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnUSUARI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtUsurPwd_Internalname, GXutil.rtrim( A855UsurPwd), GXutil.rtrim( localUtil.format( A855UsurPwd, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsurPwd_Jsonclick, 0, "", "", "", "", "", 1, edtUsurPwd_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrnUSUARI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Ult. fecha acceso", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnUSUARI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtUsurFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtUsurFec_Internalname, localUtil.format(A851UsurFec, "99/99/99"), localUtil.format( A851UsurFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsurFec_Jsonclick, 0, "", "", "", "", "", 1, edtUsurFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrnUSUARI.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtUsurFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtUsurFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrnUSUARI.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Mail", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnUSUARI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtUsuMail_Internalname, GXutil.rtrim( A10513UsuMail), GXutil.rtrim( localUtil.format( A10513UsuMail, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUsuMail_Jsonclick, 0, "", "", "", "", "", 1, edtUsuMail_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrnUSUARI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Contraseña Autentificcion", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnUSUARI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtUsuMailP_Internalname, A10713UsuMailP, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", (short)(0), 1, edtUsuMailP_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TTrnUSUARI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Usuario Autentificacion", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnUSUARI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtUsuMailU_Internalname, A10714UsuMailU, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", (short)(0), 1, edtUsuMailU_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TTrnUSUARI.htm");
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
         nBlankRcdCount127 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_127 = (short)(1) ;
            scanStart1J7127( ) ;
            while ( RcdFound127 != 0 )
            {
               init_level_properties127( ) ;
               getByPrimaryKey1J7127( ) ;
               addRow1J7127( ) ;
               scanNext1J7127( ) ;
            }
            scanEnd1J7127( ) ;
            nBlankRcdCount127 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1J7127( ) ;
         standaloneModal1J7127( ) ;
         sMode127 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow1J7127( ) ;
            edtavnRcdDeleted_127_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_127_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_127_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_127_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtGrpId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GRPID_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGrpId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpId_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtGrpTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GRPTXT_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGrpTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpTxt_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtGrpPri_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GRPPRI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGrpPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpPri_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_127 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1J7127( ) ;
            }
            sendRow1J7127( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode127 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount127 = (short)(5) ;
         nRcdExists_127 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1J7127( ) ;
            while ( RcdFound127 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_55127( ) ;
               init_level_properties127( ) ;
               standaloneNotModal1J7127( ) ;
               getByPrimaryKey1J7127( ) ;
               standaloneModal1J7127( ) ;
               addRow1J7127( ) ;
               scanNext1J7127( ) ;
            }
            scanEnd1J7127( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode127 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_55127( ) ;
      initAll1J7127( ) ;
      init_level_properties127( ) ;
      nRcdExists_127 = (short)(0) ;
      nIsMod_127 = (short)(0) ;
      nRcdDeleted_127 = (short)(0) ;
      nBlankRcdCount127 = (short)(nBlankRcdUsr127+nBlankRcdCount127) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount127 > 0 )
      {
         standaloneNotModal1J7127( ) ;
         standaloneModal1J7127( ) ;
         addRow1J7127( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtGrpId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount127 = (short)(nBlankRcdCount127-1) ;
      }
      Gx_mode = sMode127 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnUSUARI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnUSUARI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnUSUARI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnUSUARI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTrnUSUARI.htm");
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
      e111J72 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z850UsurCod = httpContext.cgiGet( "Z850UsurCod") ;
            Z854UsurNom = httpContext.cgiGet( "Z854UsurNom") ;
            Z855UsurPwd = httpContext.cgiGet( "Z855UsurPwd") ;
            Z851UsurFec = localUtil.ctod( httpContext.cgiGet( "Z851UsurFec"), 0) ;
            Z10513UsuMail = httpContext.cgiGet( "Z10513UsuMail") ;
            Z10713UsuMailP = httpContext.cgiGet( "Z10713UsuMailP") ;
            Z10714UsuMailU = httpContext.cgiGet( "Z10714UsuMailU") ;
            Z14371UsurGuid = GXutil.strToGuid(httpContext.cgiGet( "Z14371UsurGuid")) ;
            A14371UsurGuid = GXutil.strToGuid(httpContext.cgiGet( "Z14371UsurGuid")) ;
            n14371UsurGuid = false ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14371UsurGuid = GXutil.strToGuid(httpContext.cgiGet( "USURGUID")) ;
            /* Read variables values. */
            A850UsurCod = GXutil.upper( httpContext.cgiGet( edtUsurCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A850UsurCod", A850UsurCod);
            A854UsurNom = httpContext.cgiGet( edtUsurNom_Internalname) ;
            n854UsurNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A854UsurNom", A854UsurNom);
            A855UsurPwd = GXutil.upper( httpContext.cgiGet( edtUsurPwd_Internalname)) ;
            n855UsurPwd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A855UsurPwd", A855UsurPwd);
            if ( localUtil.vcdate( httpContext.cgiGet( edtUsurFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "USURFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUsurFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A851UsurFec = GXutil.nullDate() ;
               n851UsurFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A851UsurFec", localUtil.format(A851UsurFec, "99/99/99"));
            }
            else
            {
               A851UsurFec = localUtil.ctod( httpContext.cgiGet( edtUsurFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n851UsurFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A851UsurFec", localUtil.format(A851UsurFec, "99/99/99"));
            }
            A10513UsuMail = httpContext.cgiGet( edtUsuMail_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10513UsuMail", A10513UsuMail);
            A10713UsuMailP = httpContext.cgiGet( edtUsuMailP_Internalname) ;
            n10713UsuMailP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10713UsuMailP", A10713UsuMailP);
            A10714UsuMailU = httpContext.cgiGet( edtUsuMailU_Internalname) ;
            n10714UsuMailU = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10714UsuMailU", A10714UsuMailU);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TTrnUSUARI");
            forbiddenHiddens.add("UsurGuid", A14371UsurGuid.toString());
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A850UsurCod, Z850UsurCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ttrnusuari:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
               A850UsurCod = httpContext.GetPar( "UsurCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A850UsurCod", A850UsurCod);
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
                        e111J72 ();
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
            initAll1J7110( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_127_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_127_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      disableAttributes1J7110( ) ;
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

   public void confirm_1J70( )
   {
      beforeValidate1J7110( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1J7110( ) ;
         }
         else
         {
            checkExtendedTable1J7110( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1J7110( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode110 = Gx_mode ;
         confirm_1J7127( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode110 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode110 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1J70( ) ;
      }
   }

   public void confirm_1J7127( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1J7127( ) ;
         if ( ( nRcdExists_127 != 0 ) || ( nIsMod_127 != 0 ) )
         {
            getKey1J7127( ) ;
            if ( ( nRcdExists_127 == 0 ) && ( nRcdDeleted_127 == 0 ) )
            {
               if ( RcdFound127 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1J7127( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1J7127( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1J7127( 4) ;
                     }
                     closeExtendedTableCursors1J7127( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "GRPID_" + sGXsfl_55_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtGrpId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound127 != 0 )
               {
                  if ( nRcdDeleted_127 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1J7127( ) ;
                     load1J7127( ) ;
                     beforeValidate1J7127( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1J7127( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_127 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1J7127( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1J7127( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1J7127( 4) ;
                           }
                           closeExtendedTableCursors1J7127( ) ;
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
                  if ( nRcdDeleted_127 == 0 )
                  {
                     GXCCtl = "GRPID_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtGrpId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_127_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_127, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGrpId_Internalname, GXutil.rtrim( A943GrpId)) ;
         httpContext.changePostValue( edtGrpTxt_Internalname, GXutil.rtrim( A944GrpTxt)) ;
         httpContext.changePostValue( edtGrpPri_Internalname, GXutil.ltrim( localUtil.ntoc( A952GrpPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z943GrpId_"+sGXsfl_55_idx, GXutil.rtrim( Z943GrpId)) ;
         httpContext.changePostValue( "ZT_"+"Z952GrpPri_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z952GrpPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_127_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_127, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_127_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_127, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_127_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_127, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_127 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_127_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_127_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GRPID_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GRPTXT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GRPPRI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpPri_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1J70( )
   {
   }

   public void e111J72( )
   {
      /* Start Routine */
      returnInSub = false ;
   }

   public void zm1J7110( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z854UsurNom = T01J76_A854UsurNom[0] ;
            Z855UsurPwd = T01J76_A855UsurPwd[0] ;
            Z851UsurFec = T01J76_A851UsurFec[0] ;
            Z10513UsuMail = T01J76_A10513UsuMail[0] ;
            Z10713UsuMailP = T01J76_A10713UsuMailP[0] ;
            Z10714UsuMailU = T01J76_A10714UsuMailU[0] ;
            Z14371UsurGuid = T01J76_A14371UsurGuid[0] ;
         }
         else
         {
            Z854UsurNom = A854UsurNom ;
            Z855UsurPwd = A855UsurPwd ;
            Z851UsurFec = A851UsurFec ;
            Z10513UsuMail = A10513UsuMail ;
            Z10713UsuMailP = A10713UsuMailP ;
            Z10714UsuMailU = A10714UsuMailU ;
            Z14371UsurGuid = A14371UsurGuid ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z850UsurCod = A850UsurCod ;
         Z854UsurNom = A854UsurNom ;
         Z855UsurPwd = A855UsurPwd ;
         Z851UsurFec = A851UsurFec ;
         Z10513UsuMail = A10513UsuMail ;
         Z10713UsuMailP = A10713UsuMailP ;
         Z10714UsuMailU = A10714UsuMailU ;
         Z14371UsurGuid = A14371UsurGuid ;
      }
   }

   public void standaloneNotModal( )
   {
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
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
      if ( isIns( )  && java.util.UUID.fromString("00000000-0000-0000-0000-000000000000").equals(A14371UsurGuid) && ( Gx_BScreen == 0 ) )
      {
         A14371UsurGuid = java.util.UUID.randomUUID( ) ;
         n14371UsurGuid = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14371UsurGuid", A14371UsurGuid.toString());
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

   public void load1J7110( )
   {
      /* Using cursor T01J77 */
      pr_default.execute(5, new Object[] {A850UsurCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound110 = (short)(1) ;
         A854UsurNom = T01J77_A854UsurNom[0] ;
         n854UsurNom = T01J77_n854UsurNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A854UsurNom", A854UsurNom);
         A855UsurPwd = T01J77_A855UsurPwd[0] ;
         n855UsurPwd = T01J77_n855UsurPwd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A855UsurPwd", A855UsurPwd);
         A851UsurFec = T01J77_A851UsurFec[0] ;
         n851UsurFec = T01J77_n851UsurFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A851UsurFec", localUtil.format(A851UsurFec, "99/99/99"));
         A10513UsuMail = T01J77_A10513UsuMail[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10513UsuMail", A10513UsuMail);
         A10713UsuMailP = T01J77_A10713UsuMailP[0] ;
         n10713UsuMailP = T01J77_n10713UsuMailP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10713UsuMailP", A10713UsuMailP);
         A10714UsuMailU = T01J77_A10714UsuMailU[0] ;
         n10714UsuMailU = T01J77_n10714UsuMailU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10714UsuMailU", A10714UsuMailU);
         A14371UsurGuid = T01J77_A14371UsurGuid[0] ;
         n14371UsurGuid = T01J77_n14371UsurGuid[0] ;
         zm1J7110( -2) ;
      }
      pr_default.close(5);
      onLoadActions1J7110( ) ;
   }

   public void onLoadActions1J7110( )
   {
   }

   public void checkExtendedTable1J7110( )
   {
      nIsDirty_110 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1J7110( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1J7110( )
   {
      /* Using cursor T01J78 */
      pr_default.execute(6, new Object[] {A850UsurCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound110 = (short)(1) ;
      }
      else
      {
         RcdFound110 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01J76 */
      pr_default.execute(4, new Object[] {A850UsurCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1J7110( 2) ;
         RcdFound110 = (short)(1) ;
         A850UsurCod = T01J76_A850UsurCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A850UsurCod", A850UsurCod);
         A854UsurNom = T01J76_A854UsurNom[0] ;
         n854UsurNom = T01J76_n854UsurNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A854UsurNom", A854UsurNom);
         A855UsurPwd = T01J76_A855UsurPwd[0] ;
         n855UsurPwd = T01J76_n855UsurPwd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A855UsurPwd", A855UsurPwd);
         A851UsurFec = T01J76_A851UsurFec[0] ;
         n851UsurFec = T01J76_n851UsurFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A851UsurFec", localUtil.format(A851UsurFec, "99/99/99"));
         A10513UsuMail = T01J76_A10513UsuMail[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10513UsuMail", A10513UsuMail);
         A10713UsuMailP = T01J76_A10713UsuMailP[0] ;
         n10713UsuMailP = T01J76_n10713UsuMailP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10713UsuMailP", A10713UsuMailP);
         A10714UsuMailU = T01J76_A10714UsuMailU[0] ;
         n10714UsuMailU = T01J76_n10714UsuMailU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10714UsuMailU", A10714UsuMailU);
         A14371UsurGuid = T01J76_A14371UsurGuid[0] ;
         n14371UsurGuid = T01J76_n14371UsurGuid[0] ;
         Z850UsurCod = A850UsurCod ;
         sMode110 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1J7110( ) ;
         if ( AnyError == 1 )
         {
            RcdFound110 = (short)(0) ;
            initializeNonKey1J7110( ) ;
         }
         Gx_mode = sMode110 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound110 = (short)(0) ;
         initializeNonKey1J7110( ) ;
         sMode110 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode110 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1J7110( ) ;
      if ( RcdFound110 == 0 )
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
      RcdFound110 = (short)(0) ;
      /* Using cursor T01J79 */
      pr_default.execute(7, new Object[] {A850UsurCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01J79_A850UsurCod[0], A850UsurCod) < 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01J79_A850UsurCod[0], A850UsurCod) > 0 ) ) )
         {
            A850UsurCod = T01J79_A850UsurCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A850UsurCod", A850UsurCod);
            RcdFound110 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound110 = (short)(0) ;
      /* Using cursor T01J710 */
      pr_default.execute(8, new Object[] {A850UsurCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01J710_A850UsurCod[0], A850UsurCod) > 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01J710_A850UsurCod[0], A850UsurCod) < 0 ) ) )
         {
            A850UsurCod = T01J710_A850UsurCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A850UsurCod", A850UsurCod);
            RcdFound110 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1J7110( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtUsurCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1J7110( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound110 == 1 )
         {
            if ( GXutil.strcmp(A850UsurCod, Z850UsurCod) != 0 )
            {
               A850UsurCod = Z850UsurCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A850UsurCod", A850UsurCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "USURCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUsurCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtUsurCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1J7110( ) ;
               GX_FocusControl = edtUsurCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A850UsurCod, Z850UsurCod) != 0 )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtUsurCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1J7110( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "USURCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtUsurCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtUsurCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1J7110( ) ;
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
      if ( GXutil.strcmp(A850UsurCod, Z850UsurCod) != 0 )
      {
         A850UsurCod = Z850UsurCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A850UsurCod", A850UsurCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "USURCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsurCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtUsurCod_Internalname ;
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
      getKey1J7110( ) ;
      if ( RcdFound110 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "USURCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtUsurCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A850UsurCod, Z850UsurCod) != 0 )
         {
            A850UsurCod = Z850UsurCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A850UsurCod", A850UsurCod);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "USURCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtUsurCod_Internalname ;
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
         if ( GXutil.strcmp(A850UsurCod, Z850UsurCod) != 0 )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "USURCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtUsurCod_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrnusuari");
      GX_FocusControl = edtUsurNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1J70( ) ;
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
      if ( RcdFound110 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "USURCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUsurCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtUsurNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1J7110( ) ;
      if ( RcdFound110 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtUsurNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1J7110( ) ;
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
      if ( RcdFound110 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtUsurNom_Internalname ;
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
      if ( RcdFound110 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtUsurNom_Internalname ;
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
      scanStart1J7110( ) ;
      if ( RcdFound110 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound110 != 0 )
         {
            scanNext1J7110( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtUsurNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1J7110( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1J7110( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01J75 */
         pr_default.execute(3, new Object[] {A850UsurCod});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUSUARI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z854UsurNom, T01J75_A854UsurNom[0]) != 0 ) || ( GXutil.strcmp(Z855UsurPwd, T01J75_A855UsurPwd[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z851UsurFec), GXutil.resetTime(T01J75_A851UsurFec[0])) ) || ( GXutil.strcmp(Z10513UsuMail, T01J75_A10513UsuMail[0]) != 0 ) || ( GXutil.strcmp(Z10713UsuMailP, T01J75_A10713UsuMailP[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10714UsuMailU, T01J75_A10714UsuMailU[0]) != 0 ) || !( Z14371UsurGuid.equals( T01J75_A14371UsurGuid[0] ) ) )
         {
            if ( GXutil.strcmp(Z854UsurNom, T01J75_A854UsurNom[0]) != 0 )
            {
               GXutil.writeLogln("ttrnusuari:[seudo value changed for attri]"+"UsurNom");
               GXutil.writeLogRaw("Old: ",Z854UsurNom);
               GXutil.writeLogRaw("Current: ",T01J75_A854UsurNom[0]);
            }
            if ( GXutil.strcmp(Z855UsurPwd, T01J75_A855UsurPwd[0]) != 0 )
            {
               GXutil.writeLogln("ttrnusuari:[seudo value changed for attri]"+"UsurPwd");
               GXutil.writeLogRaw("Old: ",Z855UsurPwd);
               GXutil.writeLogRaw("Current: ",T01J75_A855UsurPwd[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z851UsurFec), GXutil.resetTime(T01J75_A851UsurFec[0])) ) )
            {
               GXutil.writeLogln("ttrnusuari:[seudo value changed for attri]"+"UsurFec");
               GXutil.writeLogRaw("Old: ",Z851UsurFec);
               GXutil.writeLogRaw("Current: ",T01J75_A851UsurFec[0]);
            }
            if ( GXutil.strcmp(Z10513UsuMail, T01J75_A10513UsuMail[0]) != 0 )
            {
               GXutil.writeLogln("ttrnusuari:[seudo value changed for attri]"+"UsuMail");
               GXutil.writeLogRaw("Old: ",Z10513UsuMail);
               GXutil.writeLogRaw("Current: ",T01J75_A10513UsuMail[0]);
            }
            if ( GXutil.strcmp(Z10713UsuMailP, T01J75_A10713UsuMailP[0]) != 0 )
            {
               GXutil.writeLogln("ttrnusuari:[seudo value changed for attri]"+"UsuMailP");
               GXutil.writeLogRaw("Old: ",Z10713UsuMailP);
               GXutil.writeLogRaw("Current: ",T01J75_A10713UsuMailP[0]);
            }
            if ( GXutil.strcmp(Z10714UsuMailU, T01J75_A10714UsuMailU[0]) != 0 )
            {
               GXutil.writeLogln("ttrnusuari:[seudo value changed for attri]"+"UsuMailU");
               GXutil.writeLogRaw("Old: ",Z10714UsuMailU);
               GXutil.writeLogRaw("Current: ",T01J75_A10714UsuMailU[0]);
            }
            if ( !( Z14371UsurGuid.equals( T01J75_A14371UsurGuid[0] ) ) )
            {
               GXutil.writeLogln("ttrnusuari:[seudo value changed for attri]"+"UsurGuid");
               GXutil.writeLogRaw("Old: ",Z14371UsurGuid);
               GXutil.writeLogRaw("Current: ",T01J75_A14371UsurGuid[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPUSUARI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1J7110( )
   {
      beforeValidate1J7110( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J7110( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1J7110( 0) ;
         checkOptimisticConcurrency1J7110( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J7110( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1J7110( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01J711 */
                  pr_default.execute(9, new Object[] {A850UsurCod, Boolean.valueOf(n854UsurNom), A854UsurNom, Boolean.valueOf(n855UsurPwd), A855UsurPwd, Boolean.valueOf(n851UsurFec), A851UsurFec, A10513UsuMail, Boolean.valueOf(n10713UsuMailP), A10713UsuMailP, Boolean.valueOf(n10714UsuMailU), A10714UsuMailU, Boolean.valueOf(n14371UsurGuid), A14371UsurGuid});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUSUARI");
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
                        processLevel1J7110( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1J70( ) ;
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
            load1J7110( ) ;
         }
         endLevel1J7110( ) ;
      }
      closeExtendedTableCursors1J7110( ) ;
   }

   public void update1J7110( )
   {
      beforeValidate1J7110( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J7110( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J7110( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J7110( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1J7110( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01J712 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n854UsurNom), A854UsurNom, Boolean.valueOf(n855UsurPwd), A855UsurPwd, Boolean.valueOf(n851UsurFec), A851UsurFec, A10513UsuMail, Boolean.valueOf(n10713UsuMailP), A10713UsuMailP, Boolean.valueOf(n10714UsuMailU), A10714UsuMailU, Boolean.valueOf(n14371UsurGuid), A14371UsurGuid, A850UsurCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUSUARI");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUSUARI"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1J7110( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1J7110( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1J70( ) ;
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
         endLevel1J7110( ) ;
      }
      closeExtendedTableCursors1J7110( ) ;
   }

   public void deferredUpdate1J7110( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1J7110( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J7110( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1J7110( ) ;
         afterConfirm1J7110( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1J7110( ) ;
            if ( AnyError == 0 )
            {
               scanStart1J7127( ) ;
               while ( RcdFound127 != 0 )
               {
                  getByPrimaryKey1J7127( ) ;
                  delete1J7127( ) ;
                  scanNext1J7127( ) ;
               }
               scanEnd1J7127( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01J713 */
                  pr_default.execute(11, new Object[] {A850UsurCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUSUARI");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound110 == 0 )
                        {
                           initAll1J7110( ) ;
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
                        resetCaption1J70( ) ;
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
      sMode110 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1J7110( ) ;
      Gx_mode = sMode110 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1J7110( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01J714 */
         pr_default.execute(12, new Object[] {A850UsurCod});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "USUEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
      }
   }

   public void processNestedLevel1J7127( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1J7127( ) ;
         if ( ( nRcdExists_127 != 0 ) || ( nIsMod_127 != 0 ) )
         {
            standaloneNotModal1J7127( ) ;
            getKey1J7127( ) ;
            if ( ( nRcdExists_127 == 0 ) && ( nRcdDeleted_127 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1J7127( ) ;
            }
            else
            {
               if ( RcdFound127 != 0 )
               {
                  if ( ( nRcdDeleted_127 != 0 ) && ( nRcdExists_127 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1J7127( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_127 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1J7127( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_127 == 0 )
                  {
                     GXCCtl = "GRPID_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtGrpId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_127_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_127, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGrpId_Internalname, GXutil.rtrim( A943GrpId)) ;
         httpContext.changePostValue( edtGrpTxt_Internalname, GXutil.rtrim( A944GrpTxt)) ;
         httpContext.changePostValue( edtGrpPri_Internalname, GXutil.ltrim( localUtil.ntoc( A952GrpPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z943GrpId_"+sGXsfl_55_idx, GXutil.rtrim( Z943GrpId)) ;
         httpContext.changePostValue( "ZT_"+"Z952GrpPri_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z952GrpPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_127_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_127, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_127_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_127, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_127_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_127, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_127 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_127_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_127_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GRPID_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GRPTXT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GRPPRI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpPri_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1J7127( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_127 = (short)(0) ;
      nIsMod_127 = (short)(0) ;
      nRcdDeleted_127 = (short)(0) ;
   }

   public void processLevel1J7110( )
   {
      /* Save parent mode. */
      sMode110 = Gx_mode ;
      processNestedLevel1J7127( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode110 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1J7110( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1J7110( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrnusuari");
         if ( AnyError == 0 )
         {
            confirmValues1J70( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrnusuari");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1J7110( )
   {
      /* Using cursor T01J715 */
      pr_default.execute(13);
      RcdFound110 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound110 = (short)(1) ;
         A850UsurCod = T01J715_A850UsurCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A850UsurCod", A850UsurCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1J7110( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound110 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound110 = (short)(1) ;
         A850UsurCod = T01J715_A850UsurCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A850UsurCod", A850UsurCod);
      }
   }

   public void scanEnd1J7110( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1J7110( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1J7110( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1J7110( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1J7110( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1J7110( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1J7110( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1J7110( )
   {
      edtUsurCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsurCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsurCod_Enabled), 5, 0), true);
      edtUsurNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsurNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsurNom_Enabled), 5, 0), true);
      edtUsurPwd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsurPwd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsurPwd_Enabled), 5, 0), true);
      edtUsurFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsurFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsurFec_Enabled), 5, 0), true);
      edtUsuMail_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuMail_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuMail_Enabled), 5, 0), true);
      edtUsuMailP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuMailP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuMailP_Enabled), 5, 0), true);
      edtUsuMailU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUsuMailU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUsuMailU_Enabled), 5, 0), true);
   }

   public void zm1J7127( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z952GrpPri = T01J73_A952GrpPri[0] ;
         }
         else
         {
            Z952GrpPri = A952GrpPri ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z850UsurCod = A850UsurCod ;
         Z952GrpPri = A952GrpPri ;
         Z943GrpId = A943GrpId ;
         Z944GrpTxt = A944GrpTxt ;
      }
   }

   public void standaloneNotModal1J7127( )
   {
   }

   public void standaloneModal1J7127( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtGrpId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGrpId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpId_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtGrpId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGrpId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpId_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
   }

   public void load1J7127( )
   {
      /* Using cursor T01J716 */
      pr_default.execute(14, new Object[] {A850UsurCod, A943GrpId});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound127 = (short)(1) ;
         A944GrpTxt = T01J716_A944GrpTxt[0] ;
         n944GrpTxt = T01J716_n944GrpTxt[0] ;
         A952GrpPri = T01J716_A952GrpPri[0] ;
         zm1J7127( -3) ;
      }
      pr_default.close(14);
      onLoadActions1J7127( ) ;
   }

   public void onLoadActions1J7127( )
   {
   }

   public void checkExtendedTable1J7127( )
   {
      nIsDirty_127 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1J7127( ) ;
      /* Using cursor T01J74 */
      pr_default.execute(2, new Object[] {A943GrpId});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "GRPID_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRUPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrpId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A944GrpTxt = T01J74_A944GrpTxt[0] ;
      n944GrpTxt = T01J74_n944GrpTxt[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1J7127( )
   {
      pr_default.close(2);
   }

   public void enableDisable1J7127( )
   {
   }

   public void gxload_4( String A943GrpId )
   {
      /* Using cursor T01J717 */
      pr_default.execute(15, new Object[] {A943GrpId});
      if ( (pr_default.getStatus(15) == 101) )
      {
         GXCCtl = "GRPID_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRUPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrpId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A944GrpTxt = T01J717_A944GrpTxt[0] ;
      n944GrpTxt = T01J717_n944GrpTxt[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A944GrpTxt))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void getKey1J7127( )
   {
      /* Using cursor T01J718 */
      pr_default.execute(16, new Object[] {A850UsurCod, A943GrpId});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound127 = (short)(1) ;
      }
      else
      {
         RcdFound127 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey1J7127( )
   {
      /* Using cursor T01J73 */
      pr_default.execute(1, new Object[] {A850UsurCod, A943GrpId});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1J7127( 3) ;
         RcdFound127 = (short)(1) ;
         initializeNonKey1J7127( ) ;
         A952GrpPri = T01J73_A952GrpPri[0] ;
         A943GrpId = T01J73_A943GrpId[0] ;
         Z850UsurCod = A850UsurCod ;
         Z943GrpId = A943GrpId ;
         sMode127 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1J7127( ) ;
         load1J7127( ) ;
         Gx_mode = sMode127 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound127 = (short)(0) ;
         initializeNonKey1J7127( ) ;
         sMode127 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1J7127( ) ;
         Gx_mode = sMode127 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1J7127( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1J7127( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01J72 */
         pr_default.execute(0, new Object[] {A850UsurCod, A943GrpId});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUSUGRP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z952GrpPri != T01J72_A952GrpPri[0] ) )
         {
            if ( Z952GrpPri != T01J72_A952GrpPri[0] )
            {
               GXutil.writeLogln("ttrnusuari:[seudo value changed for attri]"+"GrpPri");
               GXutil.writeLogRaw("Old: ",Z952GrpPri);
               GXutil.writeLogRaw("Current: ",T01J72_A952GrpPri[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPUSUGRP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1J7127( )
   {
      beforeValidate1J7127( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J7127( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1J7127( 0) ;
         checkOptimisticConcurrency1J7127( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J7127( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1J7127( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01J719 */
                  pr_default.execute(17, new Object[] {A850UsurCod, Byte.valueOf(A952GrpPri), A943GrpId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUSUGRP");
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
            load1J7127( ) ;
         }
         endLevel1J7127( ) ;
      }
      closeExtendedTableCursors1J7127( ) ;
   }

   public void update1J7127( )
   {
      beforeValidate1J7127( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J7127( ) ;
      }
      if ( ( nIsMod_127 != 0 ) || ( nIsDirty_127 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1J7127( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1J7127( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1J7127( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01J720 */
                     pr_default.execute(18, new Object[] {Byte.valueOf(A952GrpPri), A850UsurCod, A943GrpId});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUSUGRP");
                     if ( (pr_default.getStatus(18) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUSUGRP"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1J7127( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1J7127( ) ;
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
            endLevel1J7127( ) ;
         }
      }
      closeExtendedTableCursors1J7127( ) ;
   }

   public void deferredUpdate1J7127( )
   {
   }

   public void delete1J7127( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1J7127( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J7127( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1J7127( ) ;
         afterConfirm1J7127( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1J7127( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01J721 */
               pr_default.execute(19, new Object[] {A850UsurCod, A943GrpId});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUSUGRP");
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
      sMode127 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1J7127( ) ;
      Gx_mode = sMode127 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1J7127( )
   {
      standaloneModal1J7127( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01J722 */
         pr_default.execute(20, new Object[] {A943GrpId});
         A944GrpTxt = T01J722_A944GrpTxt[0] ;
         n944GrpTxt = T01J722_n944GrpTxt[0] ;
         pr_default.close(20);
      }
   }

   public void endLevel1J7127( )
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

   public void scanStart1J7127( )
   {
      /* Scan By routine */
      /* Using cursor T01J723 */
      pr_default.execute(21, new Object[] {A850UsurCod});
      RcdFound127 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound127 = (short)(1) ;
         A943GrpId = T01J723_A943GrpId[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1J7127( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound127 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound127 = (short)(1) ;
         A943GrpId = T01J723_A943GrpId[0] ;
      }
   }

   public void scanEnd1J7127( )
   {
      pr_default.close(21);
   }

   public void afterConfirm1J7127( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1J7127( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1J7127( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1J7127( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1J7127( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1J7127( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1J7127( )
   {
      edtGrpId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrpId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpId_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtGrpTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrpTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpTxt_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtGrpPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrpPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpPri_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashes1J7127( )
   {
   }

   public void send_integrity_lvl_hashes1J7110( )
   {
   }

   public void subsflControlProps_55127( )
   {
      edtavnRcdDeleted_127_Internalname = "vNRCDDELETED_127_"+sGXsfl_55_idx ;
      edtGrpId_Internalname = "GRPID_"+sGXsfl_55_idx ;
      edtGrpTxt_Internalname = "GRPTXT_"+sGXsfl_55_idx ;
      edtGrpPri_Internalname = "GRPPRI_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_55127( )
   {
      edtavnRcdDeleted_127_Internalname = "vNRCDDELETED_127_"+sGXsfl_55_fel_idx ;
      edtGrpId_Internalname = "GRPID_"+sGXsfl_55_fel_idx ;
      edtGrpTxt_Internalname = "GRPTXT_"+sGXsfl_55_fel_idx ;
      edtGrpPri_Internalname = "GRPPRI_"+sGXsfl_55_fel_idx ;
   }

   public void addRow1J7127( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_55127( ) ;
      sendRow1J7127( ) ;
   }

   public void sendRow1J7127( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_127_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_127_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_127, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_127_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_127), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_127), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_127_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_127_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_127_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGrpId_Internalname,GXutil.rtrim( A943GrpId),GXutil.rtrim( localUtil.format( A943GrpId, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGrpId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGrpId_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGrpTxt_Internalname,GXutil.rtrim( A944GrpTxt),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGrpTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGrpTxt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_127_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGrpPri_Internalname,GXutil.ltrim( localUtil.ntoc( A952GrpPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtGrpPri_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A952GrpPri), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A952GrpPri), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGrpPri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGrpPri_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1J7127( ) ;
      GXCCtl = "Z943GrpId_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z943GrpId));
      GXCCtl = "Z952GrpPri_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z952GrpPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_127_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_127, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_127_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_127, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_127_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_127, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_127_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_127_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRPID_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpId_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRPTXT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRPPRI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpPri_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1J7127( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_55127( ) ;
      edtavnRcdDeleted_127_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_127_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGrpId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GRPID_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGrpTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GRPTXT_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGrpPri_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GRPPRI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_127_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_127_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_127");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_127_Internalname ;
         wbErr = true ;
         nRcdDeleted_127 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_127 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_127_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A943GrpId = GXutil.upper( httpContext.cgiGet( edtGrpId_Internalname)) ;
      A944GrpTxt = httpContext.cgiGet( edtGrpTxt_Internalname) ;
      n944GrpTxt = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGrpPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGrpPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "GRPPRI_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrpPri_Internalname ;
         wbErr = true ;
         A952GrpPri = (byte)(0) ;
      }
      else
      {
         A952GrpPri = (byte)(localUtil.ctol( httpContext.cgiGet( edtGrpPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      GXCCtl = "Z943GrpId_" + sGXsfl_55_idx ;
      Z943GrpId = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z952GrpPri_" + sGXsfl_55_idx ;
      Z952GrpPri = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_127_" + sGXsfl_55_idx ;
      nRcdDeleted_127 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_127_" + sGXsfl_55_idx ;
      nRcdExists_127 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_127_" + sGXsfl_55_idx ;
      nIsMod_127 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtGrpId_Enabled = edtGrpId_Enabled ;
   }

   public void confirmValues1J70( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_55127( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_55127( ) ;
         httpContext.changePostValue( "Z943GrpId_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z943GrpId_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z943GrpId_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z952GrpPri_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z952GrpPri_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z952GrpPri_"+sGXsfl_55_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttrnusuari", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TTrnUSUARI");
      forbiddenHiddens.add("UsurGuid", A14371UsurGuid.toString());
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ttrnusuari:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z850UsurCod", GXutil.rtrim( Z850UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z854UsurNom", GXutil.rtrim( Z854UsurNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z855UsurPwd", GXutil.rtrim( Z855UsurPwd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z851UsurFec", localUtil.dtoc( Z851UsurFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10513UsuMail", GXutil.rtrim( Z10513UsuMail));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10713UsuMailP", Z10713UsuMailP);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10714UsuMailU", Z10714UsuMailU);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14371UsurGuid", Z14371UsurGuid.toString());
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "USURGUID", A14371UsurGuid.toString());
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
      return formatLink("app.ttrnusuari", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTrnUSUARI" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "USUARI", "") ;
   }

   public void initializeNonKey1J7110( )
   {
      A854UsurNom = "" ;
      n854UsurNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A854UsurNom", A854UsurNom);
      A855UsurPwd = "" ;
      n855UsurPwd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A855UsurPwd", A855UsurPwd);
      A851UsurFec = GXutil.nullDate() ;
      n851UsurFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A851UsurFec", localUtil.format(A851UsurFec, "99/99/99"));
      A10513UsuMail = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10513UsuMail", A10513UsuMail);
      A10713UsuMailP = "" ;
      n10713UsuMailP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10713UsuMailP", A10713UsuMailP);
      A10714UsuMailU = "" ;
      n10714UsuMailU = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10714UsuMailU", A10714UsuMailU);
      A14371UsurGuid = java.util.UUID.randomUUID( ) ;
      n14371UsurGuid = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14371UsurGuid", A14371UsurGuid.toString());
      Z854UsurNom = "" ;
      Z855UsurPwd = "" ;
      Z851UsurFec = GXutil.nullDate() ;
      Z10513UsuMail = "" ;
      Z10713UsuMailP = "" ;
      Z10714UsuMailU = "" ;
      Z14371UsurGuid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
   }

   public void initAll1J7110( )
   {
      A850UsurCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A850UsurCod", A850UsurCod);
      initializeNonKey1J7110( ) ;
   }

   public void standaloneModalInsert( )
   {
      A14371UsurGuid = i14371UsurGuid ;
      n14371UsurGuid = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14371UsurGuid", A14371UsurGuid.toString());
   }

   public void initializeNonKey1J7127( )
   {
      A944GrpTxt = "" ;
      n944GrpTxt = false ;
      A952GrpPri = (byte)(0) ;
      Z952GrpPri = (byte)(0) ;
   }

   public void initAll1J7127( )
   {
      A943GrpId = "" ;
      initializeNonKey1J7127( ) ;
   }

   public void standaloneModalInsert1J7127( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202612718514548", true, true);
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
      httpContext.AddJavascriptSource("ttrnusuari.js", "?202612718514548", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties127( )
   {
      edtGrpId_Enabled = defedtGrpId_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrpId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpId_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_127, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_127_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A943GrpId));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpId_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A944GrpTxt));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A952GrpPri, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpPri_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtUsurCod_Internalname = "USURCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtUsurNom_Internalname = "USURNOM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtUsurPwd_Internalname = "USURPWD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtUsurFec_Internalname = "USURFEC" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtUsuMail_Internalname = "USUMAIL" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtUsuMailP_Internalname = "USUMAILP" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtUsuMailU_Internalname = "USUMAILU" ;
      edtavnRcdDeleted_127_Internalname = "vNRCDDELETED_127" ;
      edtGrpId_Internalname = "GRPID" ;
      edtGrpTxt_Internalname = "GRPTXT" ;
      edtGrpPri_Internalname = "GRPPRI" ;
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
      Form.setCaption( httpContext.getMessage( "USUARI", "") );
      edtGrpPri_Jsonclick = "" ;
      edtGrpTxt_Jsonclick = "" ;
      edtGrpId_Jsonclick = "" ;
      edtavnRcdDeleted_127_Jsonclick = "" ;
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
      edtGrpPri_Enabled = 1 ;
      edtGrpTxt_Enabled = 0 ;
      edtGrpId_Enabled = 1 ;
      edtavnRcdDeleted_127_Enabled = 1 ;
      edtUsuMailU_Backcolor = (int)(0xFFFFFF) ;
      edtUsuMailU_Enabled = 1 ;
      edtUsuMailP_Backcolor = (int)(0xFFFFFF) ;
      edtUsuMailP_Enabled = 1 ;
      edtUsuMail_Jsonclick = "" ;
      edtUsuMail_Backcolor = (int)(0xFFFFFF) ;
      edtUsuMail_Enabled = 1 ;
      edtUsurFec_Jsonclick = "" ;
      edtUsurFec_Backcolor = (int)(0xFFFFFF) ;
      edtUsurFec_Enabled = 1 ;
      edtUsurPwd_Jsonclick = "" ;
      edtUsurPwd_Backcolor = (int)(0xFFFFFF) ;
      edtUsurPwd_Enabled = 1 ;
      edtUsurNom_Jsonclick = "" ;
      edtUsurNom_Backcolor = (int)(0xFFFFFF) ;
      edtUsurNom_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtUsurCod_Jsonclick = "" ;
      edtUsurCod_Backcolor = (int)(0xFFFFFF) ;
      edtUsurCod_Enabled = 1 ;
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
      subsflControlProps_55127( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1J7127( ) ;
         standaloneModal1J7127( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1J7127( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_55127( ) ;
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
      GX_FocusControl = edtUsurNom_Internalname ;
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

   public void valid_Usurcod( )
   {
      n14371UsurGuid = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A854UsurNom", GXutil.rtrim( A854UsurNom));
      httpContext.ajax_rsp_assign_attri("", false, "A855UsurPwd", GXutil.rtrim( A855UsurPwd));
      httpContext.ajax_rsp_assign_attri("", false, "A851UsurFec", localUtil.format(A851UsurFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A10513UsuMail", GXutil.rtrim( A10513UsuMail));
      httpContext.ajax_rsp_assign_attri("", false, "A10713UsuMailP", A10713UsuMailP);
      httpContext.ajax_rsp_assign_attri("", false, "A10714UsuMailU", A10714UsuMailU);
      httpContext.ajax_rsp_assign_attri("", false, "A14371UsurGuid", A14371UsurGuid.toString());
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z850UsurCod", GXutil.rtrim( Z850UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z854UsurNom", GXutil.rtrim( Z854UsurNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z855UsurPwd", GXutil.rtrim( Z855UsurPwd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z851UsurFec", localUtil.format(Z851UsurFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10513UsuMail", GXutil.rtrim( Z10513UsuMail));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10713UsuMailP", Z10713UsuMailP);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10714UsuMailU", Z10714UsuMailU);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14371UsurGuid", Z14371UsurGuid.toString());
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Grpid( )
   {
      n944GrpTxt = false ;
      /* Using cursor T01J722 */
      pr_default.execute(20, new Object[] {A943GrpId});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRUPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRPID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrpId_Internalname ;
      }
      A944GrpTxt = T01J722_A944GrpTxt[0] ;
      n944GrpTxt = T01J722_n944GrpTxt[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A944GrpTxt", GXutil.rtrim( A944GrpTxt));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A14371UsurGuid',fld:'USURGUID',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_USURCOD","{handler:'valid_Usurcod',iparms:[{av:'A850UsurCod',fld:'USURCOD',pic:'@!'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A14371UsurGuid',fld:'USURGUID',pic:''}]");
      setEventMetadata("VALID_USURCOD",",oparms:[{av:'A854UsurNom',fld:'USURNOM',pic:''},{av:'A855UsurPwd',fld:'USURPWD',pic:'@!'},{av:'A851UsurFec',fld:'USURFEC',pic:''},{av:'A10513UsuMail',fld:'USUMAIL',pic:''},{av:'A10713UsuMailP',fld:'USUMAILP',pic:''},{av:'A10714UsuMailU',fld:'USUMAILU',pic:''},{av:'A14371UsurGuid',fld:'USURGUID',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z850UsurCod'},{av:'Z854UsurNom'},{av:'Z855UsurPwd'},{av:'Z851UsurFec'},{av:'Z10513UsuMail'},{av:'Z10713UsuMailP'},{av:'Z10714UsuMailU'},{av:'Z14371UsurGuid'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_GRPID","{handler:'valid_Grpid',iparms:[{av:'A943GrpId',fld:'GRPID',pic:'@!'},{av:'A944GrpTxt',fld:'GRPTXT',pic:''}]");
      setEventMetadata("VALID_GRPID",",oparms:[{av:'A944GrpTxt',fld:'GRPTXT',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Grppri',iparms:[]");
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
      pr_default.close(20);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z850UsurCod = "" ;
      Z854UsurNom = "" ;
      Z855UsurPwd = "" ;
      Z851UsurFec = GXutil.nullDate() ;
      Z10513UsuMail = "" ;
      Z10713UsuMailP = "" ;
      Z10714UsuMailU = "" ;
      Z14371UsurGuid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      Z943GrpId = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A943GrpId = "" ;
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
      A850UsurCod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      A854UsurNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      A855UsurPwd = "" ;
      lblTextblock4_Jsonclick = "" ;
      A851UsurFec = GXutil.nullDate() ;
      lblTextblock5_Jsonclick = "" ;
      A10513UsuMail = "" ;
      lblTextblock6_Jsonclick = "" ;
      A10713UsuMailP = "" ;
      lblTextblock7_Jsonclick = "" ;
      A10714UsuMailU = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode127 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A14371UsurGuid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode110 = "" ;
      GXCCtl = "" ;
      A944GrpTxt = "" ;
      T01J77_A850UsurCod = new String[] {""} ;
      T01J77_A854UsurNom = new String[] {""} ;
      T01J77_n854UsurNom = new boolean[] {false} ;
      T01J77_A855UsurPwd = new String[] {""} ;
      T01J77_n855UsurPwd = new boolean[] {false} ;
      T01J77_A851UsurFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01J77_n851UsurFec = new boolean[] {false} ;
      T01J77_A10513UsuMail = new String[] {""} ;
      T01J77_A10713UsuMailP = new String[] {""} ;
      T01J77_n10713UsuMailP = new boolean[] {false} ;
      T01J77_A10714UsuMailU = new String[] {""} ;
      T01J77_n10714UsuMailU = new boolean[] {false} ;
      T01J77_A14371UsurGuid = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      T01J77_n14371UsurGuid = new boolean[] {false} ;
      T01J78_A850UsurCod = new String[] {""} ;
      T01J76_A850UsurCod = new String[] {""} ;
      T01J76_A854UsurNom = new String[] {""} ;
      T01J76_n854UsurNom = new boolean[] {false} ;
      T01J76_A855UsurPwd = new String[] {""} ;
      T01J76_n855UsurPwd = new boolean[] {false} ;
      T01J76_A851UsurFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01J76_n851UsurFec = new boolean[] {false} ;
      T01J76_A10513UsuMail = new String[] {""} ;
      T01J76_A10713UsuMailP = new String[] {""} ;
      T01J76_n10713UsuMailP = new boolean[] {false} ;
      T01J76_A10714UsuMailU = new String[] {""} ;
      T01J76_n10714UsuMailU = new boolean[] {false} ;
      T01J76_A14371UsurGuid = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      T01J76_n14371UsurGuid = new boolean[] {false} ;
      T01J79_A850UsurCod = new String[] {""} ;
      T01J710_A850UsurCod = new String[] {""} ;
      T01J75_A850UsurCod = new String[] {""} ;
      T01J75_A854UsurNom = new String[] {""} ;
      T01J75_n854UsurNom = new boolean[] {false} ;
      T01J75_A855UsurPwd = new String[] {""} ;
      T01J75_n855UsurPwd = new boolean[] {false} ;
      T01J75_A851UsurFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01J75_n851UsurFec = new boolean[] {false} ;
      T01J75_A10513UsuMail = new String[] {""} ;
      T01J75_A10713UsuMailP = new String[] {""} ;
      T01J75_n10713UsuMailP = new boolean[] {false} ;
      T01J75_A10714UsuMailU = new String[] {""} ;
      T01J75_n10714UsuMailU = new boolean[] {false} ;
      T01J75_A14371UsurGuid = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      T01J75_n14371UsurGuid = new boolean[] {false} ;
      T01J714_A850UsurCod = new String[] {""} ;
      T01J714_A5159EmprCodU = new String[] {""} ;
      T01J715_A850UsurCod = new String[] {""} ;
      Z944GrpTxt = "" ;
      T01J716_A850UsurCod = new String[] {""} ;
      T01J716_A944GrpTxt = new String[] {""} ;
      T01J716_n944GrpTxt = new boolean[] {false} ;
      T01J716_A952GrpPri = new byte[1] ;
      T01J716_A943GrpId = new String[] {""} ;
      T01J74_A944GrpTxt = new String[] {""} ;
      T01J74_n944GrpTxt = new boolean[] {false} ;
      T01J717_A944GrpTxt = new String[] {""} ;
      T01J717_n944GrpTxt = new boolean[] {false} ;
      T01J718_A850UsurCod = new String[] {""} ;
      T01J718_A943GrpId = new String[] {""} ;
      T01J73_A850UsurCod = new String[] {""} ;
      T01J73_A952GrpPri = new byte[1] ;
      T01J73_A943GrpId = new String[] {""} ;
      T01J72_A850UsurCod = new String[] {""} ;
      T01J72_A952GrpPri = new byte[1] ;
      T01J72_A943GrpId = new String[] {""} ;
      T01J722_A944GrpTxt = new String[] {""} ;
      T01J722_n944GrpTxt = new boolean[] {false} ;
      T01J723_A850UsurCod = new String[] {""} ;
      T01J723_A943GrpId = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i14371UsurGuid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ850UsurCod = "" ;
      ZZ854UsurNom = "" ;
      ZZ855UsurPwd = "" ;
      ZZ851UsurFec = GXutil.nullDate() ;
      ZZ10513UsuMail = "" ;
      ZZ10713UsuMailP = "" ;
      ZZ10714UsuMailU = "" ;
      ZZ14371UsurGuid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrnusuari__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrnusuari__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrnusuari__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrnusuari__default(),
         new Object[] {
             new Object[] {
            T01J72_A850UsurCod, T01J72_A952GrpPri, T01J72_A943GrpId
            }
            , new Object[] {
            T01J73_A850UsurCod, T01J73_A952GrpPri, T01J73_A943GrpId
            }
            , new Object[] {
            T01J74_A944GrpTxt, T01J74_n944GrpTxt
            }
            , new Object[] {
            T01J75_A850UsurCod, T01J75_A854UsurNom, T01J75_n854UsurNom, T01J75_A855UsurPwd, T01J75_n855UsurPwd, T01J75_A851UsurFec, T01J75_n851UsurFec, T01J75_A10513UsuMail, T01J75_A10713UsuMailP, T01J75_n10713UsuMailP,
            T01J75_A10714UsuMailU, T01J75_n10714UsuMailU, T01J75_A14371UsurGuid, T01J75_n14371UsurGuid
            }
            , new Object[] {
            T01J76_A850UsurCod, T01J76_A854UsurNom, T01J76_n854UsurNom, T01J76_A855UsurPwd, T01J76_n855UsurPwd, T01J76_A851UsurFec, T01J76_n851UsurFec, T01J76_A10513UsuMail, T01J76_A10713UsuMailP, T01J76_n10713UsuMailP,
            T01J76_A10714UsuMailU, T01J76_n10714UsuMailU, T01J76_A14371UsurGuid, T01J76_n14371UsurGuid
            }
            , new Object[] {
            T01J77_A850UsurCod, T01J77_A854UsurNom, T01J77_n854UsurNom, T01J77_A855UsurPwd, T01J77_n855UsurPwd, T01J77_A851UsurFec, T01J77_n851UsurFec, T01J77_A10513UsuMail, T01J77_A10713UsuMailP, T01J77_n10713UsuMailP,
            T01J77_A10714UsuMailU, T01J77_n10714UsuMailU, T01J77_A14371UsurGuid, T01J77_n14371UsurGuid
            }
            , new Object[] {
            T01J78_A850UsurCod
            }
            , new Object[] {
            T01J79_A850UsurCod
            }
            , new Object[] {
            T01J710_A850UsurCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01J714_A850UsurCod, T01J714_A5159EmprCodU
            }
            , new Object[] {
            T01J715_A850UsurCod
            }
            , new Object[] {
            T01J716_A850UsurCod, T01J716_A944GrpTxt, T01J716_n944GrpTxt, T01J716_A952GrpPri, T01J716_A943GrpId
            }
            , new Object[] {
            T01J717_A944GrpTxt, T01J717_n944GrpTxt
            }
            , new Object[] {
            T01J718_A850UsurCod, T01J718_A943GrpId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01J722_A944GrpTxt, T01J722_n944GrpTxt
            }
            , new Object[] {
            T01J723_A850UsurCod, T01J723_A943GrpId
            }
         }
      );
      Z14371UsurGuid = java.util.UUID.randomUUID( ) ;
      n14371UsurGuid = false ;
      A14371UsurGuid = java.util.UUID.randomUUID( ) ;
      n14371UsurGuid = false ;
      i14371UsurGuid = java.util.UUID.randomUUID( ) ;
      n14371UsurGuid = false ;
   }

   private byte Z952GrpPri ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A952GrpPri ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short nRcdDeleted_127 ;
   private short nRcdExists_127 ;
   private short nIsMod_127 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount127 ;
   private short RcdFound127 ;
   private short nBlankRcdUsr127 ;
   private short RcdFound110 ;
   private short nIsDirty_110 ;
   private short nIsDirty_127 ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtUsurCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtUsurNom_Enabled ;
   private int edtUsurPwd_Enabled ;
   private int edtUsurFec_Enabled ;
   private int edtUsuMail_Enabled ;
   private int edtUsuMailP_Enabled ;
   private int edtUsuMailU_Enabled ;
   private int edtavnRcdDeleted_127_Enabled ;
   private int edtGrpId_Enabled ;
   private int edtGrpTxt_Enabled ;
   private int edtGrpPri_Enabled ;
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
   private int defedtGrpId_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtUsuMailU_Backcolor ;
   private int edtUsuMailP_Backcolor ;
   private int edtUsuMail_Backcolor ;
   private int edtUsurFec_Backcolor ;
   private int edtUsurPwd_Backcolor ;
   private int edtUsurNom_Backcolor ;
   private int edtUsurCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z850UsurCod ;
   private String Z854UsurNom ;
   private String Z855UsurPwd ;
   private String Z10513UsuMail ;
   private String Z943GrpId ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A943GrpId ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtUsurCod_Internalname ;
   private String sGXsfl_55_idx="0001" ;
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
   private String A850UsurCod ;
   private String edtUsurCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtUsurNom_Internalname ;
   private String A854UsurNom ;
   private String edtUsurNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtUsurPwd_Internalname ;
   private String A855UsurPwd ;
   private String edtUsurPwd_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtUsurFec_Internalname ;
   private String edtUsurFec_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtUsuMail_Internalname ;
   private String A10513UsuMail ;
   private String edtUsuMail_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtUsuMailP_Internalname ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtUsuMailU_Internalname ;
   private String sMode127 ;
   private String edtavnRcdDeleted_127_Internalname ;
   private String edtGrpId_Internalname ;
   private String edtGrpTxt_Internalname ;
   private String edtGrpPri_Internalname ;
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
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode110 ;
   private String GXCCtl ;
   private String A944GrpTxt ;
   private String Z944GrpTxt ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_127_Jsonclick ;
   private String edtGrpId_Jsonclick ;
   private String edtGrpTxt_Jsonclick ;
   private String edtGrpPri_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ850UsurCod ;
   private String ZZ854UsurNom ;
   private String ZZ855UsurPwd ;
   private String ZZ10513UsuMail ;
   private java.util.Date Z851UsurFec ;
   private java.util.Date A851UsurFec ;
   private java.util.Date ZZ851UsurFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n14371UsurGuid ;
   private boolean n854UsurNom ;
   private boolean n855UsurPwd ;
   private boolean n851UsurFec ;
   private boolean n10713UsuMailP ;
   private boolean n10714UsuMailU ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n944GrpTxt ;
   private String Z10713UsuMailP ;
   private String Z10714UsuMailU ;
   private String A10713UsuMailP ;
   private String A10714UsuMailU ;
   private String ZZ10713UsuMailP ;
   private String ZZ10714UsuMailU ;
   private java.util.UUID Z14371UsurGuid ;
   private java.util.UUID A14371UsurGuid ;
   private java.util.UUID i14371UsurGuid ;
   private java.util.UUID ZZ14371UsurGuid ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01J77_A850UsurCod ;
   private String[] T01J77_A854UsurNom ;
   private boolean[] T01J77_n854UsurNom ;
   private String[] T01J77_A855UsurPwd ;
   private boolean[] T01J77_n855UsurPwd ;
   private java.util.Date[] T01J77_A851UsurFec ;
   private boolean[] T01J77_n851UsurFec ;
   private String[] T01J77_A10513UsuMail ;
   private String[] T01J77_A10713UsuMailP ;
   private boolean[] T01J77_n10713UsuMailP ;
   private String[] T01J77_A10714UsuMailU ;
   private boolean[] T01J77_n10714UsuMailU ;
   private java.util.UUID[] T01J77_A14371UsurGuid ;
   private boolean[] T01J77_n14371UsurGuid ;
   private String[] T01J78_A850UsurCod ;
   private String[] T01J76_A850UsurCod ;
   private String[] T01J76_A854UsurNom ;
   private boolean[] T01J76_n854UsurNom ;
   private String[] T01J76_A855UsurPwd ;
   private boolean[] T01J76_n855UsurPwd ;
   private java.util.Date[] T01J76_A851UsurFec ;
   private boolean[] T01J76_n851UsurFec ;
   private String[] T01J76_A10513UsuMail ;
   private String[] T01J76_A10713UsuMailP ;
   private boolean[] T01J76_n10713UsuMailP ;
   private String[] T01J76_A10714UsuMailU ;
   private boolean[] T01J76_n10714UsuMailU ;
   private java.util.UUID[] T01J76_A14371UsurGuid ;
   private boolean[] T01J76_n14371UsurGuid ;
   private String[] T01J79_A850UsurCod ;
   private String[] T01J710_A850UsurCod ;
   private String[] T01J75_A850UsurCod ;
   private String[] T01J75_A854UsurNom ;
   private boolean[] T01J75_n854UsurNom ;
   private String[] T01J75_A855UsurPwd ;
   private boolean[] T01J75_n855UsurPwd ;
   private java.util.Date[] T01J75_A851UsurFec ;
   private boolean[] T01J75_n851UsurFec ;
   private String[] T01J75_A10513UsuMail ;
   private String[] T01J75_A10713UsuMailP ;
   private boolean[] T01J75_n10713UsuMailP ;
   private String[] T01J75_A10714UsuMailU ;
   private boolean[] T01J75_n10714UsuMailU ;
   private java.util.UUID[] T01J75_A14371UsurGuid ;
   private boolean[] T01J75_n14371UsurGuid ;
   private String[] T01J714_A850UsurCod ;
   private String[] T01J714_A5159EmprCodU ;
   private String[] T01J715_A850UsurCod ;
   private String[] T01J716_A850UsurCod ;
   private String[] T01J716_A944GrpTxt ;
   private boolean[] T01J716_n944GrpTxt ;
   private byte[] T01J716_A952GrpPri ;
   private String[] T01J716_A943GrpId ;
   private String[] T01J74_A944GrpTxt ;
   private boolean[] T01J74_n944GrpTxt ;
   private String[] T01J717_A944GrpTxt ;
   private boolean[] T01J717_n944GrpTxt ;
   private String[] T01J718_A850UsurCod ;
   private String[] T01J718_A943GrpId ;
   private String[] T01J73_A850UsurCod ;
   private byte[] T01J73_A952GrpPri ;
   private String[] T01J73_A943GrpId ;
   private String[] T01J72_A850UsurCod ;
   private byte[] T01J72_A952GrpPri ;
   private String[] T01J72_A943GrpId ;
   private String[] T01J722_A944GrpTxt ;
   private boolean[] T01J722_n944GrpTxt ;
   private String[] T01J723_A850UsurCod ;
   private String[] T01J723_A943GrpId ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttrnusuari__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrnusuari__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrnusuari__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrnusuari__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01J72", "SELECT UsurCod, GrpPri, GrpId FROM TXPUSUGRP WHERE UsurCod = ? AND GrpId = ?  FOR UPDATE OF GrpPri NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J73", "SELECT UsurCod, GrpPri, GrpId FROM TXPUSUGRP WHERE UsurCod = ? AND GrpId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J74", "SELECT GrpTxt FROM TXPGRUPOS WHERE GrpId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J75", "SELECT UsurCod, UsurNom, UsurPwd, UsurFec, UsuMail, UsuMailP, UsuMailU, UsurGuid FROM TXPUSUARI WHERE UsurCod = ?  FOR UPDATE OF UsurNom, UsurPwd, UsurFec, UsuMail, UsuMailP, UsuMailU, UsurGuid NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J76", "SELECT UsurCod, UsurNom, UsurPwd, UsurFec, UsuMail, UsuMailP, UsuMailU, UsurGuid FROM TXPUSUARI WHERE UsurCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J77", "SELECT /*+ FIRST_ROWS(100) */ TM1.UsurCod, TM1.UsurNom, TM1.UsurPwd, TM1.UsurFec, TM1.UsuMail, TM1.UsuMailP, TM1.UsuMailU, TM1.UsurGuid FROM TXPUSUARI TM1 WHERE TM1.UsurCod = ? ORDER BY TM1.UsurCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J78", "SELECT /*+ FIRST_ROWS(1) */ UsurCod FROM TXPUSUARI WHERE UsurCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J79", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ UsurCod FROM TXPUSUARI WHERE ( UsurCod > ?) ORDER BY UsurCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01J710", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ UsurCod FROM TXPUSUARI WHERE ( UsurCod < ?) ORDER BY UsurCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01J711", "INSERT INTO TXPUSUARI(UsurCod, UsurNom, UsurPwd, UsurFec, UsuMail, UsuMailP, UsuMailU, UsurGuid, UsurTpo, UsurCmbPwd, UsurTkn, UsurTknCrd, UsurTknVto, UsurPrint, UsurSockt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ')", GX_NOMASK, "TXPUSUARI")
         ,new UpdateCursor("T01J712", "UPDATE TXPUSUARI SET UsurNom=?, UsurPwd=?, UsurFec=?, UsuMail=?, UsuMailP=?, UsuMailU=?, UsurGuid=?  WHERE UsurCod = ?", GX_NOMASK, "TXPUSUARI")
         ,new UpdateCursor("T01J713", "DELETE FROM TXPUSUARI  WHERE UsurCod = ?", GX_NOMASK, "TXPUSUARI")
         ,new ForEachCursor("T01J714", "SELECT * FROM (SELECT UsurCod, EmprCodU FROM TXPUSUEMP WHERE UsurCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01J715", "SELECT /*+ FIRST_ROWS(100) */ UsurCod FROM TXPUSUARI ORDER BY UsurCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J716", "SELECT T1.UsurCod, T2.GrpTxt, T1.GrpPri, T1.GrpId FROM (TXPUSUGRP T1 INNER JOIN TXPGRUPOS T2 ON T2.GrpId = T1.GrpId) WHERE T1.UsurCod = ? and T1.GrpId = ? ORDER BY T1.UsurCod, T1.GrpId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J717", "SELECT GrpTxt FROM TXPGRUPOS WHERE GrpId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J718", "SELECT UsurCod, GrpId FROM TXPUSUGRP WHERE UsurCod = ? AND GrpId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01J719", "INSERT INTO TXPUSUGRP(UsurCod, GrpPri, GrpId) VALUES(?, ?, ?)", GX_NOMASK, "TXPUSUGRP")
         ,new UpdateCursor("T01J720", "UPDATE TXPUSUGRP SET GrpPri=?  WHERE UsurCod = ? AND GrpId = ?", GX_NOMASK, "TXPUSUGRP")
         ,new UpdateCursor("T01J721", "DELETE FROM TXPUSUGRP  WHERE UsurCod = ? AND GrpId = ?", GX_NOMASK, "TXPUSUGRP")
         ,new ForEachCursor("T01J722", "SELECT GrpTxt FROM TXPGRUPOS WHERE GrpId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J723", "SELECT UsurCod, GrpId FROM TXPUSUGRP WHERE UsurCod = ? ORDER BY UsurCod, GrpId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 35);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 40);
               ((String[]) buf[8])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[12])[0] = rslt.getGUID(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 35);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 40);
               ((String[]) buf[8])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[12])[0] = rslt.getGUID(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 35);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 40);
               ((String[]) buf[8])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[12])[0] = rslt.getGUID(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 10);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
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
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 8);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 35);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 10);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[6]);
               }
               stmt.setString(5, (String)parms[7], 40);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[9], 200);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[11], 200);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setGUID(8, (java.util.UUID)parms[13]);
               }
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 35);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 10);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
               }
               stmt.setString(4, (String)parms[6], 40);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[8], 200);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[10], 200);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setGUID(7, (java.util.UUID)parms[12]);
               }
               stmt.setString(8, (String)parms[13], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 18 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 8);
               return;
      }
   }

}

