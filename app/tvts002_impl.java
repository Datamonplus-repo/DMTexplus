package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tvts002_impl extends GXDataArea
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
         A10940Vts_Nbarca = httpContext.GetPar( "Vts_Nbarca") ;
         httpContext.ajax_rsp_assign_attri("", false, "A10940Vts_Nbarca", A10940Vts_Nbarca);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A10940Vts_Nbarca) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "REGISTRO 80y81", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtVts_Nbarca_Internalname ;
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
      nRC_GXsfl_65 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_65"))) ;
      nGXsfl_65_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_65_idx"))) ;
      sGXsfl_65_idx = httpContext.GetPar( "sGXsfl_65_idx") ;
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

   public tvts002_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tvts002_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tvts002_impl.class ));
   }

   public tvts002_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVTS002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVTS002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVTS002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVTS002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TVTS002.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVTS002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVTS002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVTS002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVTS002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "N Barcada (8)+Numero de Barra(1)+sinvalor", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVTS002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVts_Nbarca_Internalname, GXutil.rtrim( A10940Vts_Nbarca), GXutil.rtrim( localUtil.format( A10940Vts_Nbarca, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVts_Nbarca_Jsonclick, 0, "", "", "", "", "", 1, edtVts_Nbarca_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVTS002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Clave 808189", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVTS002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVts_Rgto_Internalname, GXutil.rtrim( A10951Vts_Rgto), GXutil.rtrim( localUtil.format( A10951Vts_Rgto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVts_Rgto_Jsonclick, 0, "", "", "", "", "", 1, edtVts_Rgto_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVTS002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVTS002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVTS002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVts_maqf_Internalname, GXutil.rtrim( A10963Vts_maqf), GXutil.rtrim( localUtil.format( A10963Vts_maqf, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVts_maqf_Jsonclick, 0, "", "", "", "", "", 1, edtVts_maqf_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVTS002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Fecha Inicio", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVTS002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtVts_FecI_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVts_FecI_Internalname, localUtil.format(A10952Vts_FecI, "99/99/99"), localUtil.format( A10952Vts_FecI, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVts_FecI_Jsonclick, 0, "", "", "", "", "", 1, edtVts_FecI_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVTS002.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtVts_FecI_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtVts_FecI_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TVTS002.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Hora Inicio", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVTS002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtVts_HorI_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVts_HorI_Internalname, localUtil.ttoc( A10953Vts_HorI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10953Vts_HorI, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVts_HorI_Jsonclick, 0, "", "", "", "", "", 1, edtVts_HorI_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVTS002.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtVts_HorI_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtVts_HorI_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TVTS002.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Fecha Fin", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVTS002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtVts_FecF_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVts_FecF_Internalname, localUtil.format(A10954Vts_FecF, "99/99/99"), localUtil.format( A10954Vts_FecF, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVts_FecF_Jsonclick, 0, "", "", "", "", "", 1, edtVts_FecF_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVTS002.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtVts_FecF_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtVts_FecF_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TVTS002.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Hora Fin", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVTS002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtVts_HorF_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVts_HorF_Internalname, localUtil.ttoc( A10955Vts_HorF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10955Vts_HorF, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVts_HorF_Jsonclick, 0, "", "", "", "", "", 1, edtVts_HorF_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVTS002.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtVts_HorF_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtVts_HorF_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TVTS002.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol65( ) ;
      nGXsfl_65_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1463 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1463 = (short)(1) ;
            scanStart1A91463( ) ;
            while ( RcdFound1463 != 0 )
            {
               init_level_properties1463( ) ;
               getByPrimaryKey1A91463( ) ;
               addRow1A91463( ) ;
               scanNext1A91463( ) ;
            }
            scanEnd1A91463( ) ;
            nBlankRcdCount1463 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1A91463( ) ;
         standaloneModal1A91463( ) ;
         sMode1463 = Gx_mode ;
         while ( nGXsfl_65_idx < nRC_GXsfl_65 )
         {
            bGXsfl_65_Refreshing = true ;
            readRow1A91463( ) ;
            edtavnRcdDeleted_1463_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1463_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1463_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1463_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtVts_Linef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_LINEF_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVts_Linef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Linef_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtVts_Prodf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_PRODF_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVts_Prodf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Prodf_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtVts_Comenf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_COMENF_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVts_Comenf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Comenf_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtVts_Concf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_CONCF_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVts_Concf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Concf_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtVts_Cantf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_CANTF_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVts_Cantf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Cantf_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtVts_undf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_UNDF_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVts_undf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_undf_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtVts_Exisf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_EXISF_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVts_Exisf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Exisf_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtVts_Nord_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_NORD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVts_Nord_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Nord_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtVts_Tnq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_TNQ_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVts_Tnq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Tnq_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtVts_Any_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_ANY_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVts_Any_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Any_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            if ( ( nRcdExists_1463 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1A91463( ) ;
            }
            sendRow1A91463( ) ;
            bGXsfl_65_Refreshing = false ;
         }
         Gx_mode = sMode1463 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1463 = (short)(5) ;
         nRcdExists_1463 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1A91463( ) ;
            while ( RcdFound1463 != 0 )
            {
               sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_651463( ) ;
               init_level_properties1463( ) ;
               standaloneNotModal1A91463( ) ;
               getByPrimaryKey1A91463( ) ;
               standaloneModal1A91463( ) ;
               addRow1A91463( ) ;
               scanNext1A91463( ) ;
            }
            scanEnd1A91463( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1463 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_651463( ) ;
      initAll1A91463( ) ;
      init_level_properties1463( ) ;
      nRcdExists_1463 = (short)(0) ;
      nIsMod_1463 = (short)(0) ;
      nRcdDeleted_1463 = (short)(0) ;
      nBlankRcdCount1463 = (short)(nBlankRcdUsr1463+nBlankRcdCount1463) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1463 > 0 )
      {
         standaloneNotModal1A91463( ) ;
         standaloneModal1A91463( ) ;
         addRow1A91463( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtVts_Linef_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1463 = (short)(nBlankRcdCount1463-1) ;
      }
      Gx_mode = sMode1463 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVTS002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVTS002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVTS002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVTS002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TVTS002.htm");
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
      e111A92 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z10940Vts_Nbarca = httpContext.cgiGet( "Z10940Vts_Nbarca") ;
            Z10951Vts_Rgto = httpContext.cgiGet( "Z10951Vts_Rgto") ;
            Z10963Vts_maqf = httpContext.cgiGet( "Z10963Vts_maqf") ;
            Z10952Vts_FecI = localUtil.ctod( httpContext.cgiGet( "Z10952Vts_FecI"), 0) ;
            Z10953Vts_HorI = localUtil.ctot( httpContext.cgiGet( "Z10953Vts_HorI"), 0) ;
            Z10954Vts_FecF = localUtil.ctod( httpContext.cgiGet( "Z10954Vts_FecF"), 0) ;
            Z10955Vts_HorF = localUtil.ctot( httpContext.cgiGet( "Z10955Vts_HorF"), 0) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_65 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_65"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A10940Vts_Nbarca = httpContext.cgiGet( edtVts_Nbarca_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10940Vts_Nbarca", A10940Vts_Nbarca);
            A10951Vts_Rgto = httpContext.cgiGet( edtVts_Rgto_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10951Vts_Rgto", A10951Vts_Rgto);
            A10963Vts_maqf = httpContext.cgiGet( edtVts_maqf_Internalname) ;
            n10963Vts_maqf = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10963Vts_maqf", A10963Vts_maqf);
            if ( localUtil.vcdate( httpContext.cgiGet( edtVts_FecI_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "VTS_FECI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVts_FecI_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10952Vts_FecI = GXutil.nullDate() ;
               n10952Vts_FecI = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10952Vts_FecI", localUtil.format(A10952Vts_FecI, "99/99/99"));
            }
            else
            {
               A10952Vts_FecI = localUtil.ctod( httpContext.cgiGet( edtVts_FecI_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n10952Vts_FecI = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10952Vts_FecI", localUtil.format(A10952Vts_FecI, "99/99/99"));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtVts_HorI_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "VTS_HORI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVts_HorI_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10953Vts_HorI = GXutil.resetTime( GXutil.nullDate() );
               n10953Vts_HorI = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10953Vts_HorI", localUtil.ttoc( A10953Vts_HorI, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A10953Vts_HorI = localUtil.ctot( httpContext.cgiGet( edtVts_HorI_Internalname)) ;
               n10953Vts_HorI = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10953Vts_HorI", localUtil.ttoc( A10953Vts_HorI, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtVts_FecF_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "VTS_FECF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVts_FecF_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10954Vts_FecF = GXutil.nullDate() ;
               n10954Vts_FecF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10954Vts_FecF", localUtil.format(A10954Vts_FecF, "99/99/99"));
            }
            else
            {
               A10954Vts_FecF = localUtil.ctod( httpContext.cgiGet( edtVts_FecF_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n10954Vts_FecF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10954Vts_FecF", localUtil.format(A10954Vts_FecF, "99/99/99"));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtVts_HorF_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "VTS_HORF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVts_HorF_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10955Vts_HorF = GXutil.resetTime( GXutil.nullDate() );
               n10955Vts_HorF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10955Vts_HorF", localUtil.ttoc( A10955Vts_HorF, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A10955Vts_HorF = localUtil.ctot( httpContext.cgiGet( edtVts_HorF_Internalname)) ;
               n10955Vts_HorF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10955Vts_HorF", localUtil.ttoc( A10955Vts_HorF, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
               A10940Vts_Nbarca = httpContext.GetPar( "Vts_Nbarca") ;
               httpContext.ajax_rsp_assign_attri("", false, "A10940Vts_Nbarca", A10940Vts_Nbarca);
               A10951Vts_Rgto = httpContext.GetPar( "Vts_Rgto") ;
               httpContext.ajax_rsp_assign_attri("", false, "A10951Vts_Rgto", A10951Vts_Rgto);
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
                        e111A92 ();
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
            initAll1A91462( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1463_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1463_Enabled), 5, 0), !bGXsfl_65_Refreshing);
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
      disableAttributes1A91462( ) ;
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

   public void confirm_1A90( )
   {
      beforeValidate1A91462( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1A91462( ) ;
         }
         else
         {
            checkExtendedTable1A91462( ) ;
            if ( AnyError == 0 )
            {
               zm1A91462( 2) ;
               zm1A91462( 3) ;
            }
            closeExtendedTableCursors1A91462( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1462 = Gx_mode ;
         confirm_1A91463( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1462 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1462 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1A90( ) ;
      }
   }

   public void confirm_1A91463( )
   {
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow1A91463( ) ;
         if ( ( nRcdExists_1463 != 0 ) || ( nIsMod_1463 != 0 ) )
         {
            getKey1A91463( ) ;
            if ( ( nRcdExists_1463 == 0 ) && ( nRcdDeleted_1463 == 0 ) )
            {
               if ( RcdFound1463 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1A91463( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1A91463( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1A91463( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "VTS_LINEF_" + sGXsfl_65_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtVts_Linef_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1463 != 0 )
               {
                  if ( nRcdDeleted_1463 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1A91463( ) ;
                     load1A91463( ) ;
                     beforeValidate1A91463( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1A91463( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1463 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1A91463( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1A91463( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1A91463( ) ;
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
                  if ( nRcdDeleted_1463 == 0 )
                  {
                     GXCCtl = "VTS_LINEF_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtVts_Linef_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1463_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1463, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_Linef_Internalname, GXutil.ltrim( localUtil.ntoc( A10956Vts_Linef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_Prodf_Internalname, GXutil.rtrim( A10957Vts_Prodf)) ;
         httpContext.changePostValue( edtVts_Comenf_Internalname, GXutil.rtrim( A10958Vts_Comenf)) ;
         httpContext.changePostValue( edtVts_Concf_Internalname, GXutil.ltrim( localUtil.ntoc( A10959Vts_Concf, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_Cantf_Internalname, GXutil.ltrim( localUtil.ntoc( A10960Vts_Cantf, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_undf_Internalname, GXutil.ltrim( localUtil.ntoc( A10961Vts_undf, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_Exisf_Internalname, GXutil.ltrim( localUtil.ntoc( A10962Vts_Exisf, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_Nord_Internalname, GXutil.ltrim( localUtil.ntoc( A11174Vts_Nord, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_Tnq_Internalname, GXutil.ltrim( localUtil.ntoc( A11175Vts_Tnq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_Any_Internalname, GXutil.ltrim( localUtil.ntoc( A11176Vts_Any, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10956Vts_Linef_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z10956Vts_Linef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10957Vts_Prodf_"+sGXsfl_65_idx, GXutil.rtrim( Z10957Vts_Prodf)) ;
         httpContext.changePostValue( "ZT_"+"Z10958Vts_Comenf_"+sGXsfl_65_idx, GXutil.rtrim( Z10958Vts_Comenf)) ;
         httpContext.changePostValue( "ZT_"+"Z10959Vts_Concf_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z10959Vts_Concf, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10960Vts_Cantf_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z10960Vts_Cantf, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10961Vts_undf_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z10961Vts_undf, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10962Vts_Exisf_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z10962Vts_Exisf, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11174Vts_Nord_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11174Vts_Nord, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11175Vts_Tnq_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11175Vts_Tnq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11176Vts_Any_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11176Vts_Any, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1463_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1463, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1463_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1463, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1463_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1463, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1463 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1463_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1463_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_LINEF_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Linef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_PRODF_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Prodf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_COMENF_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Comenf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_CONCF_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Concf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_CANTF_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Cantf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_UNDF_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_undf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_EXISF_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Exisf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_NORD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Nord_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_TNQ_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Tnq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_ANY_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Any_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1A90( )
   {
   }

   public void e111A92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tvts002_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      tvts002_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tvts002_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tvts002_impl.this.A396EmprCod = GXv_char2[0] ;
      tvts002_impl.this.AV11EmprNom = GXv_char3[0] ;
      tvts002_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1A91462( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10963Vts_maqf = T01A95_A10963Vts_maqf[0] ;
            Z10952Vts_FecI = T01A95_A10952Vts_FecI[0] ;
            Z10953Vts_HorI = T01A95_A10953Vts_HorI[0] ;
            Z10954Vts_FecF = T01A95_A10954Vts_FecF[0] ;
            Z10955Vts_HorF = T01A95_A10955Vts_HorF[0] ;
         }
         else
         {
            Z10963Vts_maqf = A10963Vts_maqf ;
            Z10952Vts_FecI = A10952Vts_FecI ;
            Z10953Vts_HorI = A10953Vts_HorI ;
            Z10954Vts_FecF = A10954Vts_FecF ;
            Z10955Vts_HorF = A10955Vts_HorF ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z10951Vts_Rgto = A10951Vts_Rgto ;
         Z10963Vts_maqf = A10963Vts_maqf ;
         Z10952Vts_FecI = A10952Vts_FecI ;
         Z10953Vts_HorI = A10953Vts_HorI ;
         Z10954Vts_FecF = A10954Vts_FecF ;
         Z10955Vts_HorF = A10955Vts_HorF ;
         Z396EmprCod = A396EmprCod ;
         Z10940Vts_Nbarca = A10940Vts_Nbarca ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TVTS002" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01A96 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01A96_A407EmprNom[0] ;
      n407EmprNom = T01A96_n407EmprNom[0] ;
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

   public void load1A91462( )
   {
      /* Using cursor T01A98 */
      pr_default.execute(6, new Object[] {A396EmprCod, A10940Vts_Nbarca, A10951Vts_Rgto});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1462 = (short)(1) ;
         A407EmprNom = T01A98_A407EmprNom[0] ;
         n407EmprNom = T01A98_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10963Vts_maqf = T01A98_A10963Vts_maqf[0] ;
         n10963Vts_maqf = T01A98_n10963Vts_maqf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10963Vts_maqf", A10963Vts_maqf);
         A10952Vts_FecI = T01A98_A10952Vts_FecI[0] ;
         n10952Vts_FecI = T01A98_n10952Vts_FecI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10952Vts_FecI", localUtil.format(A10952Vts_FecI, "99/99/99"));
         A10953Vts_HorI = T01A98_A10953Vts_HorI[0] ;
         n10953Vts_HorI = T01A98_n10953Vts_HorI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10953Vts_HorI", localUtil.ttoc( A10953Vts_HorI, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10954Vts_FecF = T01A98_A10954Vts_FecF[0] ;
         n10954Vts_FecF = T01A98_n10954Vts_FecF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10954Vts_FecF", localUtil.format(A10954Vts_FecF, "99/99/99"));
         A10955Vts_HorF = T01A98_A10955Vts_HorF[0] ;
         n10955Vts_HorF = T01A98_n10955Vts_HorF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10955Vts_HorF", localUtil.ttoc( A10955Vts_HorF, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         zm1A91462( -1) ;
      }
      pr_default.close(6);
      onLoadActions1A91462( ) ;
   }

   public void onLoadActions1A91462( )
   {
   }

   public void checkExtendedTable1A91462( )
   {
      nIsDirty_1462 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01A97 */
      pr_default.execute(5, new Object[] {A396EmprCod, A10940Vts_Nbarca});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "REGISTRO 79", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VTS_NBARCA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVts_Nbarca_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1A91462( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         String A10940Vts_Nbarca )
   {
      /* Using cursor T01A99 */
      pr_default.execute(7, new Object[] {A396EmprCod, A10940Vts_Nbarca});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "REGISTRO 79", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VTS_NBARCA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVts_Nbarca_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1A91462( )
   {
      /* Using cursor T01A910 */
      pr_default.execute(8, new Object[] {A396EmprCod, A10940Vts_Nbarca, A10951Vts_Rgto});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1462 = (short)(1) ;
      }
      else
      {
         RcdFound1462 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01A95 */
      pr_default.execute(3, new Object[] {A396EmprCod, A10940Vts_Nbarca, A10951Vts_Rgto});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01A95_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1A91462( 1) ;
         RcdFound1462 = (short)(1) ;
         A10951Vts_Rgto = T01A95_A10951Vts_Rgto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10951Vts_Rgto", A10951Vts_Rgto);
         A10963Vts_maqf = T01A95_A10963Vts_maqf[0] ;
         n10963Vts_maqf = T01A95_n10963Vts_maqf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10963Vts_maqf", A10963Vts_maqf);
         A10952Vts_FecI = T01A95_A10952Vts_FecI[0] ;
         n10952Vts_FecI = T01A95_n10952Vts_FecI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10952Vts_FecI", localUtil.format(A10952Vts_FecI, "99/99/99"));
         A10953Vts_HorI = T01A95_A10953Vts_HorI[0] ;
         n10953Vts_HorI = T01A95_n10953Vts_HorI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10953Vts_HorI", localUtil.ttoc( A10953Vts_HorI, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10954Vts_FecF = T01A95_A10954Vts_FecF[0] ;
         n10954Vts_FecF = T01A95_n10954Vts_FecF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10954Vts_FecF", localUtil.format(A10954Vts_FecF, "99/99/99"));
         A10955Vts_HorF = T01A95_A10955Vts_HorF[0] ;
         n10955Vts_HorF = T01A95_n10955Vts_HorF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10955Vts_HorF", localUtil.ttoc( A10955Vts_HorF, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10940Vts_Nbarca = T01A95_A10940Vts_Nbarca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10940Vts_Nbarca", A10940Vts_Nbarca);
         Z396EmprCod = A396EmprCod ;
         Z10940Vts_Nbarca = A10940Vts_Nbarca ;
         Z10951Vts_Rgto = A10951Vts_Rgto ;
         sMode1462 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1A91462( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1462 = (short)(0) ;
            initializeNonKey1A91462( ) ;
         }
         Gx_mode = sMode1462 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1462 = (short)(0) ;
         initializeNonKey1A91462( ) ;
         sMode1462 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1462 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1A91462( ) ;
      if ( RcdFound1462 == 0 )
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
      RcdFound1462 = (short)(0) ;
      /* Using cursor T01A911 */
      pr_default.execute(9, new Object[] {A10940Vts_Nbarca, A10940Vts_Nbarca, A10951Vts_Rgto, A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01A911_A10940Vts_Nbarca[0], A10940Vts_Nbarca) < 0 ) || ( GXutil.strcmp(T01A911_A10940Vts_Nbarca[0], A10940Vts_Nbarca) == 0 ) && ( GXutil.strcmp(T01A911_A10951Vts_Rgto[0], A10951Vts_Rgto) < 0 ) ) && ( GXutil.strcmp(T01A911_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01A911_A10940Vts_Nbarca[0], A10940Vts_Nbarca) > 0 ) || ( GXutil.strcmp(T01A911_A10940Vts_Nbarca[0], A10940Vts_Nbarca) == 0 ) && ( GXutil.strcmp(T01A911_A10951Vts_Rgto[0], A10951Vts_Rgto) > 0 ) ) && ( GXutil.strcmp(T01A911_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10940Vts_Nbarca = T01A911_A10940Vts_Nbarca[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10940Vts_Nbarca", A10940Vts_Nbarca);
            A10951Vts_Rgto = T01A911_A10951Vts_Rgto[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10951Vts_Rgto", A10951Vts_Rgto);
            RcdFound1462 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1462 = (short)(0) ;
      /* Using cursor T01A912 */
      pr_default.execute(10, new Object[] {A10940Vts_Nbarca, A10940Vts_Nbarca, A10951Vts_Rgto, A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01A912_A10940Vts_Nbarca[0], A10940Vts_Nbarca) > 0 ) || ( GXutil.strcmp(T01A912_A10940Vts_Nbarca[0], A10940Vts_Nbarca) == 0 ) && ( GXutil.strcmp(T01A912_A10951Vts_Rgto[0], A10951Vts_Rgto) > 0 ) ) && ( GXutil.strcmp(T01A912_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01A912_A10940Vts_Nbarca[0], A10940Vts_Nbarca) < 0 ) || ( GXutil.strcmp(T01A912_A10940Vts_Nbarca[0], A10940Vts_Nbarca) == 0 ) && ( GXutil.strcmp(T01A912_A10951Vts_Rgto[0], A10951Vts_Rgto) < 0 ) ) && ( GXutil.strcmp(T01A912_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10940Vts_Nbarca = T01A912_A10940Vts_Nbarca[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10940Vts_Nbarca", A10940Vts_Nbarca);
            A10951Vts_Rgto = T01A912_A10951Vts_Rgto[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10951Vts_Rgto", A10951Vts_Rgto);
            RcdFound1462 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1A91462( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtVts_Nbarca_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1A91462( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1462 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10940Vts_Nbarca, Z10940Vts_Nbarca) != 0 ) || ( GXutil.strcmp(A10951Vts_Rgto, Z10951Vts_Rgto) != 0 ) )
            {
               A10940Vts_Nbarca = Z10940Vts_Nbarca ;
               httpContext.ajax_rsp_assign_attri("", false, "A10940Vts_Nbarca", A10940Vts_Nbarca);
               A10951Vts_Rgto = Z10951Vts_Rgto ;
               httpContext.ajax_rsp_assign_attri("", false, "A10951Vts_Rgto", A10951Vts_Rgto);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtVts_Nbarca_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1A91462( ) ;
               GX_FocusControl = edtVts_Nbarca_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10940Vts_Nbarca, Z10940Vts_Nbarca) != 0 ) || ( GXutil.strcmp(A10951Vts_Rgto, Z10951Vts_Rgto) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtVts_Nbarca_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1A91462( ) ;
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
                  GX_FocusControl = edtVts_Nbarca_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1A91462( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10940Vts_Nbarca, Z10940Vts_Nbarca) != 0 ) || ( GXutil.strcmp(A10951Vts_Rgto, Z10951Vts_Rgto) != 0 ) )
      {
         A10940Vts_Nbarca = Z10940Vts_Nbarca ;
         httpContext.ajax_rsp_assign_attri("", false, "A10940Vts_Nbarca", A10940Vts_Nbarca);
         A10951Vts_Rgto = Z10951Vts_Rgto ;
         httpContext.ajax_rsp_assign_attri("", false, "A10951Vts_Rgto", A10951Vts_Rgto);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtVts_Nbarca_Internalname ;
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
      getKey1A91462( ) ;
      if ( RcdFound1462 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10940Vts_Nbarca, Z10940Vts_Nbarca) != 0 ) || ( GXutil.strcmp(A10951Vts_Rgto, Z10951Vts_Rgto) != 0 ) )
         {
            A10940Vts_Nbarca = Z10940Vts_Nbarca ;
            httpContext.ajax_rsp_assign_attri("", false, "A10940Vts_Nbarca", A10940Vts_Nbarca);
            A10951Vts_Rgto = Z10951Vts_Rgto ;
            httpContext.ajax_rsp_assign_attri("", false, "A10951Vts_Rgto", A10951Vts_Rgto);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10940Vts_Nbarca, Z10940Vts_Nbarca) != 0 ) || ( GXutil.strcmp(A10951Vts_Rgto, Z10951Vts_Rgto) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tvts002");
      GX_FocusControl = edtVts_maqf_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1A90( ) ;
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
      if ( RcdFound1462 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtVts_maqf_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1A91462( ) ;
      if ( RcdFound1462 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVts_maqf_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1A91462( ) ;
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
      if ( RcdFound1462 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVts_maqf_Internalname ;
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
      if ( RcdFound1462 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVts_maqf_Internalname ;
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
      scanStart1A91462( ) ;
      if ( RcdFound1462 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1462 != 0 )
         {
            scanNext1A91462( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVts_maqf_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1A91462( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1A91462( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01A94 */
         pr_default.execute(2, new Object[] {A396EmprCod, A10940Vts_Nbarca, A10951Vts_Rgto});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPVTS002"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z10963Vts_maqf, T01A94_A10963Vts_maqf[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z10952Vts_FecI), GXutil.resetTime(T01A94_A10952Vts_FecI[0])) ) || !( GXutil.dateCompare(Z10953Vts_HorI, T01A94_A10953Vts_HorI[0]) ) || !( GXutil.dateCompare(GXutil.resetTime(Z10954Vts_FecF), GXutil.resetTime(T01A94_A10954Vts_FecF[0])) ) || !( GXutil.dateCompare(Z10955Vts_HorF, T01A94_A10955Vts_HorF[0]) ) )
         {
            if ( GXutil.strcmp(Z10963Vts_maqf, T01A94_A10963Vts_maqf[0]) != 0 )
            {
               GXutil.writeLogln("tvts002:[seudo value changed for attri]"+"Vts_maqf");
               GXutil.writeLogRaw("Old: ",Z10963Vts_maqf);
               GXutil.writeLogRaw("Current: ",T01A94_A10963Vts_maqf[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z10952Vts_FecI), GXutil.resetTime(T01A94_A10952Vts_FecI[0])) ) )
            {
               GXutil.writeLogln("tvts002:[seudo value changed for attri]"+"Vts_FecI");
               GXutil.writeLogRaw("Old: ",Z10952Vts_FecI);
               GXutil.writeLogRaw("Current: ",T01A94_A10952Vts_FecI[0]);
            }
            if ( !( GXutil.dateCompare(Z10953Vts_HorI, T01A94_A10953Vts_HorI[0]) ) )
            {
               GXutil.writeLogln("tvts002:[seudo value changed for attri]"+"Vts_HorI");
               GXutil.writeLogRaw("Old: ",Z10953Vts_HorI);
               GXutil.writeLogRaw("Current: ",T01A94_A10953Vts_HorI[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z10954Vts_FecF), GXutil.resetTime(T01A94_A10954Vts_FecF[0])) ) )
            {
               GXutil.writeLogln("tvts002:[seudo value changed for attri]"+"Vts_FecF");
               GXutil.writeLogRaw("Old: ",Z10954Vts_FecF);
               GXutil.writeLogRaw("Current: ",T01A94_A10954Vts_FecF[0]);
            }
            if ( !( GXutil.dateCompare(Z10955Vts_HorF, T01A94_A10955Vts_HorF[0]) ) )
            {
               GXutil.writeLogln("tvts002:[seudo value changed for attri]"+"Vts_HorF");
               GXutil.writeLogRaw("Old: ",Z10955Vts_HorF);
               GXutil.writeLogRaw("Current: ",T01A94_A10955Vts_HorF[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPVTS002"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1A91462( )
   {
      beforeValidate1A91462( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1A91462( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1A91462( 0) ;
         checkOptimisticConcurrency1A91462( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1A91462( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1A91462( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01A913 */
                  pr_default.execute(11, new Object[] {A10951Vts_Rgto, Boolean.valueOf(n10963Vts_maqf), A10963Vts_maqf, Boolean.valueOf(n10952Vts_FecI), A10952Vts_FecI, Boolean.valueOf(n10953Vts_HorI), A10953Vts_HorI, Boolean.valueOf(n10954Vts_FecF), A10954Vts_FecF, Boolean.valueOf(n10955Vts_HorF), A10955Vts_HorF, A396EmprCod, A10940Vts_Nbarca});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPVTS002");
                  if ( (pr_default.getStatus(11) == 1) )
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
                        processLevel1A91462( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1A90( ) ;
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
            load1A91462( ) ;
         }
         endLevel1A91462( ) ;
      }
      closeExtendedTableCursors1A91462( ) ;
   }

   public void update1A91462( )
   {
      beforeValidate1A91462( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1A91462( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1A91462( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1A91462( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1A91462( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01A914 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n10963Vts_maqf), A10963Vts_maqf, Boolean.valueOf(n10952Vts_FecI), A10952Vts_FecI, Boolean.valueOf(n10953Vts_HorI), A10953Vts_HorI, Boolean.valueOf(n10954Vts_FecF), A10954Vts_FecF, Boolean.valueOf(n10955Vts_HorF), A10955Vts_HorF, A396EmprCod, A10940Vts_Nbarca, A10951Vts_Rgto});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPVTS002");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPVTS002"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1A91462( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1A91462( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1A90( ) ;
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
         endLevel1A91462( ) ;
      }
      closeExtendedTableCursors1A91462( ) ;
   }

   public void deferredUpdate1A91462( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1A91462( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1A91462( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1A91462( ) ;
         afterConfirm1A91462( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1A91462( ) ;
            if ( AnyError == 0 )
            {
               scanStart1A91463( ) ;
               while ( RcdFound1463 != 0 )
               {
                  getByPrimaryKey1A91463( ) ;
                  delete1A91463( ) ;
                  scanNext1A91463( ) ;
               }
               scanEnd1A91463( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01A915 */
                  pr_default.execute(13, new Object[] {A396EmprCod, A10940Vts_Nbarca, A10951Vts_Rgto});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPVTS002");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1462 == 0 )
                        {
                           initAll1A91462( ) ;
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
                        resetCaption1A90( ) ;
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
      sMode1462 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1A91462( ) ;
      Gx_mode = sMode1462 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1A91462( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1A91463( )
   {
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow1A91463( ) ;
         if ( ( nRcdExists_1463 != 0 ) || ( nIsMod_1463 != 0 ) )
         {
            standaloneNotModal1A91463( ) ;
            getKey1A91463( ) ;
            if ( ( nRcdExists_1463 == 0 ) && ( nRcdDeleted_1463 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1A91463( ) ;
            }
            else
            {
               if ( RcdFound1463 != 0 )
               {
                  if ( ( nRcdDeleted_1463 != 0 ) && ( nRcdExists_1463 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1A91463( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1463 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1A91463( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1463 == 0 )
                  {
                     GXCCtl = "VTS_LINEF_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtVts_Linef_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1463_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1463, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_Linef_Internalname, GXutil.ltrim( localUtil.ntoc( A10956Vts_Linef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_Prodf_Internalname, GXutil.rtrim( A10957Vts_Prodf)) ;
         httpContext.changePostValue( edtVts_Comenf_Internalname, GXutil.rtrim( A10958Vts_Comenf)) ;
         httpContext.changePostValue( edtVts_Concf_Internalname, GXutil.ltrim( localUtil.ntoc( A10959Vts_Concf, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_Cantf_Internalname, GXutil.ltrim( localUtil.ntoc( A10960Vts_Cantf, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_undf_Internalname, GXutil.ltrim( localUtil.ntoc( A10961Vts_undf, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_Exisf_Internalname, GXutil.ltrim( localUtil.ntoc( A10962Vts_Exisf, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_Nord_Internalname, GXutil.ltrim( localUtil.ntoc( A11174Vts_Nord, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_Tnq_Internalname, GXutil.ltrim( localUtil.ntoc( A11175Vts_Tnq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_Any_Internalname, GXutil.ltrim( localUtil.ntoc( A11176Vts_Any, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10956Vts_Linef_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z10956Vts_Linef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10957Vts_Prodf_"+sGXsfl_65_idx, GXutil.rtrim( Z10957Vts_Prodf)) ;
         httpContext.changePostValue( "ZT_"+"Z10958Vts_Comenf_"+sGXsfl_65_idx, GXutil.rtrim( Z10958Vts_Comenf)) ;
         httpContext.changePostValue( "ZT_"+"Z10959Vts_Concf_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z10959Vts_Concf, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10960Vts_Cantf_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z10960Vts_Cantf, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10961Vts_undf_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z10961Vts_undf, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10962Vts_Exisf_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z10962Vts_Exisf, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11174Vts_Nord_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11174Vts_Nord, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11175Vts_Tnq_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11175Vts_Tnq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11176Vts_Any_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z11176Vts_Any, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1463_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1463, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1463_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1463, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1463_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1463, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1463 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1463_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1463_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_LINEF_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Linef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_PRODF_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Prodf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_COMENF_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Comenf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_CONCF_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Concf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_CANTF_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Cantf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_UNDF_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_undf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_EXISF_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Exisf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_NORD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Nord_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_TNQ_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Tnq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_ANY_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Any_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1A91463( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1463 = (short)(0) ;
      nIsMod_1463 = (short)(0) ;
      nRcdDeleted_1463 = (short)(0) ;
   }

   public void processLevel1A91462( )
   {
      /* Save parent mode. */
      sMode1462 = Gx_mode ;
      processNestedLevel1A91463( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1462 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1A91462( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1A91462( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tvts002");
         if ( AnyError == 0 )
         {
            confirmValues1A90( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tvts002");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1A91462( )
   {
      /* Scan By routine */
      /* Using cursor T01A916 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      RcdFound1462 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1462 = (short)(1) ;
         A10940Vts_Nbarca = T01A916_A10940Vts_Nbarca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10940Vts_Nbarca", A10940Vts_Nbarca);
         A10951Vts_Rgto = T01A916_A10951Vts_Rgto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10951Vts_Rgto", A10951Vts_Rgto);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1A91462( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1462 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1462 = (short)(1) ;
         A10940Vts_Nbarca = T01A916_A10940Vts_Nbarca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10940Vts_Nbarca", A10940Vts_Nbarca);
         A10951Vts_Rgto = T01A916_A10951Vts_Rgto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10951Vts_Rgto", A10951Vts_Rgto);
      }
   }

   public void scanEnd1A91462( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1A91462( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1A91462( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1A91462( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1A91462( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1A91462( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1A91462( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1A91462( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtVts_Nbarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_Nbarca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Nbarca_Enabled), 5, 0), true);
      edtVts_Rgto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_Rgto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Rgto_Enabled), 5, 0), true);
      edtVts_maqf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_maqf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_maqf_Enabled), 5, 0), true);
      edtVts_FecI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_FecI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_FecI_Enabled), 5, 0), true);
      edtVts_HorI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_HorI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_HorI_Enabled), 5, 0), true);
      edtVts_FecF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_FecF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_FecF_Enabled), 5, 0), true);
      edtVts_HorF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_HorF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_HorF_Enabled), 5, 0), true);
   }

   public void zm1A91463( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10957Vts_Prodf = T01A93_A10957Vts_Prodf[0] ;
            Z10958Vts_Comenf = T01A93_A10958Vts_Comenf[0] ;
            Z10959Vts_Concf = T01A93_A10959Vts_Concf[0] ;
            Z10960Vts_Cantf = T01A93_A10960Vts_Cantf[0] ;
            Z10961Vts_undf = T01A93_A10961Vts_undf[0] ;
            Z10962Vts_Exisf = T01A93_A10962Vts_Exisf[0] ;
            Z11174Vts_Nord = T01A93_A11174Vts_Nord[0] ;
            Z11175Vts_Tnq = T01A93_A11175Vts_Tnq[0] ;
            Z11176Vts_Any = T01A93_A11176Vts_Any[0] ;
         }
         else
         {
            Z10957Vts_Prodf = A10957Vts_Prodf ;
            Z10958Vts_Comenf = A10958Vts_Comenf ;
            Z10959Vts_Concf = A10959Vts_Concf ;
            Z10960Vts_Cantf = A10960Vts_Cantf ;
            Z10961Vts_undf = A10961Vts_undf ;
            Z10962Vts_Exisf = A10962Vts_Exisf ;
            Z11174Vts_Nord = A11174Vts_Nord ;
            Z11175Vts_Tnq = A11175Vts_Tnq ;
            Z11176Vts_Any = A11176Vts_Any ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z396EmprCod = A396EmprCod ;
         Z10940Vts_Nbarca = A10940Vts_Nbarca ;
         Z10951Vts_Rgto = A10951Vts_Rgto ;
         Z10956Vts_Linef = A10956Vts_Linef ;
         Z10957Vts_Prodf = A10957Vts_Prodf ;
         Z10958Vts_Comenf = A10958Vts_Comenf ;
         Z10959Vts_Concf = A10959Vts_Concf ;
         Z10960Vts_Cantf = A10960Vts_Cantf ;
         Z10961Vts_undf = A10961Vts_undf ;
         Z10962Vts_Exisf = A10962Vts_Exisf ;
         Z11174Vts_Nord = A11174Vts_Nord ;
         Z11175Vts_Tnq = A11175Vts_Tnq ;
         Z11176Vts_Any = A11176Vts_Any ;
      }
   }

   public void standaloneNotModal1A91463( )
   {
   }

   public void standaloneModal1A91463( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtVts_Linef_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtVts_Linef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Linef_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      else
      {
         edtVts_Linef_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtVts_Linef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Linef_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
   }

   public void load1A91463( )
   {
      /* Using cursor T01A917 */
      pr_default.execute(15, new Object[] {A396EmprCod, A10940Vts_Nbarca, A10951Vts_Rgto, Short.valueOf(A10956Vts_Linef)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1463 = (short)(1) ;
         A10957Vts_Prodf = T01A917_A10957Vts_Prodf[0] ;
         n10957Vts_Prodf = T01A917_n10957Vts_Prodf[0] ;
         A10958Vts_Comenf = T01A917_A10958Vts_Comenf[0] ;
         n10958Vts_Comenf = T01A917_n10958Vts_Comenf[0] ;
         A10959Vts_Concf = T01A917_A10959Vts_Concf[0] ;
         n10959Vts_Concf = T01A917_n10959Vts_Concf[0] ;
         A10960Vts_Cantf = T01A917_A10960Vts_Cantf[0] ;
         n10960Vts_Cantf = T01A917_n10960Vts_Cantf[0] ;
         A10961Vts_undf = T01A917_A10961Vts_undf[0] ;
         n10961Vts_undf = T01A917_n10961Vts_undf[0] ;
         A10962Vts_Exisf = T01A917_A10962Vts_Exisf[0] ;
         n10962Vts_Exisf = T01A917_n10962Vts_Exisf[0] ;
         A11174Vts_Nord = T01A917_A11174Vts_Nord[0] ;
         n11174Vts_Nord = T01A917_n11174Vts_Nord[0] ;
         A11175Vts_Tnq = T01A917_A11175Vts_Tnq[0] ;
         n11175Vts_Tnq = T01A917_n11175Vts_Tnq[0] ;
         A11176Vts_Any = T01A917_A11176Vts_Any[0] ;
         n11176Vts_Any = T01A917_n11176Vts_Any[0] ;
         zm1A91463( -4) ;
      }
      pr_default.close(15);
      onLoadActions1A91463( ) ;
   }

   public void onLoadActions1A91463( )
   {
   }

   public void checkExtendedTable1A91463( )
   {
      nIsDirty_1463 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1A91463( ) ;
   }

   public void closeExtendedTableCursors1A91463( )
   {
   }

   public void enableDisable1A91463( )
   {
   }

   public void getKey1A91463( )
   {
      /* Using cursor T01A918 */
      pr_default.execute(16, new Object[] {A396EmprCod, A10940Vts_Nbarca, A10951Vts_Rgto, Short.valueOf(A10956Vts_Linef)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1463 = (short)(1) ;
      }
      else
      {
         RcdFound1463 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey1A91463( )
   {
      /* Using cursor T01A93 */
      pr_default.execute(1, new Object[] {A396EmprCod, A10940Vts_Nbarca, A10951Vts_Rgto, Short.valueOf(A10956Vts_Linef)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01A93_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1A91463( 4) ;
         RcdFound1463 = (short)(1) ;
         initializeNonKey1A91463( ) ;
         A10956Vts_Linef = T01A93_A10956Vts_Linef[0] ;
         A10957Vts_Prodf = T01A93_A10957Vts_Prodf[0] ;
         n10957Vts_Prodf = T01A93_n10957Vts_Prodf[0] ;
         A10958Vts_Comenf = T01A93_A10958Vts_Comenf[0] ;
         n10958Vts_Comenf = T01A93_n10958Vts_Comenf[0] ;
         A10959Vts_Concf = T01A93_A10959Vts_Concf[0] ;
         n10959Vts_Concf = T01A93_n10959Vts_Concf[0] ;
         A10960Vts_Cantf = T01A93_A10960Vts_Cantf[0] ;
         n10960Vts_Cantf = T01A93_n10960Vts_Cantf[0] ;
         A10961Vts_undf = T01A93_A10961Vts_undf[0] ;
         n10961Vts_undf = T01A93_n10961Vts_undf[0] ;
         A10962Vts_Exisf = T01A93_A10962Vts_Exisf[0] ;
         n10962Vts_Exisf = T01A93_n10962Vts_Exisf[0] ;
         A11174Vts_Nord = T01A93_A11174Vts_Nord[0] ;
         n11174Vts_Nord = T01A93_n11174Vts_Nord[0] ;
         A11175Vts_Tnq = T01A93_A11175Vts_Tnq[0] ;
         n11175Vts_Tnq = T01A93_n11175Vts_Tnq[0] ;
         A11176Vts_Any = T01A93_A11176Vts_Any[0] ;
         n11176Vts_Any = T01A93_n11176Vts_Any[0] ;
         Z396EmprCod = A396EmprCod ;
         Z10940Vts_Nbarca = A10940Vts_Nbarca ;
         Z10951Vts_Rgto = A10951Vts_Rgto ;
         Z10956Vts_Linef = A10956Vts_Linef ;
         sMode1463 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1A91463( ) ;
         load1A91463( ) ;
         Gx_mode = sMode1463 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1463 = (short)(0) ;
         initializeNonKey1A91463( ) ;
         sMode1463 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1A91463( ) ;
         Gx_mode = sMode1463 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1A91463( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1A91463( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01A92 */
         pr_default.execute(0, new Object[] {A396EmprCod, A10940Vts_Nbarca, A10951Vts_Rgto, Short.valueOf(A10956Vts_Linef)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPVTS003"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10957Vts_Prodf, T01A92_A10957Vts_Prodf[0]) != 0 ) || ( GXutil.strcmp(Z10958Vts_Comenf, T01A92_A10958Vts_Comenf[0]) != 0 ) || ( DecimalUtil.compareTo(Z10959Vts_Concf, T01A92_A10959Vts_Concf[0]) != 0 ) || ( DecimalUtil.compareTo(Z10960Vts_Cantf, T01A92_A10960Vts_Cantf[0]) != 0 ) || ( Z10961Vts_undf != T01A92_A10961Vts_undf[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z10962Vts_Exisf, T01A92_A10962Vts_Exisf[0]) != 0 ) || ( Z11174Vts_Nord != T01A92_A11174Vts_Nord[0] ) || ( Z11175Vts_Tnq != T01A92_A11175Vts_Tnq[0] ) || ( Z11176Vts_Any != T01A92_A11176Vts_Any[0] ) )
         {
            if ( GXutil.strcmp(Z10957Vts_Prodf, T01A92_A10957Vts_Prodf[0]) != 0 )
            {
               GXutil.writeLogln("tvts002:[seudo value changed for attri]"+"Vts_Prodf");
               GXutil.writeLogRaw("Old: ",Z10957Vts_Prodf);
               GXutil.writeLogRaw("Current: ",T01A92_A10957Vts_Prodf[0]);
            }
            if ( GXutil.strcmp(Z10958Vts_Comenf, T01A92_A10958Vts_Comenf[0]) != 0 )
            {
               GXutil.writeLogln("tvts002:[seudo value changed for attri]"+"Vts_Comenf");
               GXutil.writeLogRaw("Old: ",Z10958Vts_Comenf);
               GXutil.writeLogRaw("Current: ",T01A92_A10958Vts_Comenf[0]);
            }
            if ( DecimalUtil.compareTo(Z10959Vts_Concf, T01A92_A10959Vts_Concf[0]) != 0 )
            {
               GXutil.writeLogln("tvts002:[seudo value changed for attri]"+"Vts_Concf");
               GXutil.writeLogRaw("Old: ",Z10959Vts_Concf);
               GXutil.writeLogRaw("Current: ",T01A92_A10959Vts_Concf[0]);
            }
            if ( DecimalUtil.compareTo(Z10960Vts_Cantf, T01A92_A10960Vts_Cantf[0]) != 0 )
            {
               GXutil.writeLogln("tvts002:[seudo value changed for attri]"+"Vts_Cantf");
               GXutil.writeLogRaw("Old: ",Z10960Vts_Cantf);
               GXutil.writeLogRaw("Current: ",T01A92_A10960Vts_Cantf[0]);
            }
            if ( Z10961Vts_undf != T01A92_A10961Vts_undf[0] )
            {
               GXutil.writeLogln("tvts002:[seudo value changed for attri]"+"Vts_undf");
               GXutil.writeLogRaw("Old: ",Z10961Vts_undf);
               GXutil.writeLogRaw("Current: ",T01A92_A10961Vts_undf[0]);
            }
            if ( DecimalUtil.compareTo(Z10962Vts_Exisf, T01A92_A10962Vts_Exisf[0]) != 0 )
            {
               GXutil.writeLogln("tvts002:[seudo value changed for attri]"+"Vts_Exisf");
               GXutil.writeLogRaw("Old: ",Z10962Vts_Exisf);
               GXutil.writeLogRaw("Current: ",T01A92_A10962Vts_Exisf[0]);
            }
            if ( Z11174Vts_Nord != T01A92_A11174Vts_Nord[0] )
            {
               GXutil.writeLogln("tvts002:[seudo value changed for attri]"+"Vts_Nord");
               GXutil.writeLogRaw("Old: ",Z11174Vts_Nord);
               GXutil.writeLogRaw("Current: ",T01A92_A11174Vts_Nord[0]);
            }
            if ( Z11175Vts_Tnq != T01A92_A11175Vts_Tnq[0] )
            {
               GXutil.writeLogln("tvts002:[seudo value changed for attri]"+"Vts_Tnq");
               GXutil.writeLogRaw("Old: ",Z11175Vts_Tnq);
               GXutil.writeLogRaw("Current: ",T01A92_A11175Vts_Tnq[0]);
            }
            if ( Z11176Vts_Any != T01A92_A11176Vts_Any[0] )
            {
               GXutil.writeLogln("tvts002:[seudo value changed for attri]"+"Vts_Any");
               GXutil.writeLogRaw("Old: ",Z11176Vts_Any);
               GXutil.writeLogRaw("Current: ",T01A92_A11176Vts_Any[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPVTS003"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1A91463( )
   {
      beforeValidate1A91463( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1A91463( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1A91463( 0) ;
         checkOptimisticConcurrency1A91463( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1A91463( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1A91463( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01A919 */
                  pr_default.execute(17, new Object[] {A396EmprCod, A10940Vts_Nbarca, A10951Vts_Rgto, Short.valueOf(A10956Vts_Linef), Boolean.valueOf(n10957Vts_Prodf), A10957Vts_Prodf, Boolean.valueOf(n10958Vts_Comenf), A10958Vts_Comenf, Boolean.valueOf(n10959Vts_Concf), A10959Vts_Concf, Boolean.valueOf(n10960Vts_Cantf), A10960Vts_Cantf, Boolean.valueOf(n10961Vts_undf), Byte.valueOf(A10961Vts_undf), Boolean.valueOf(n10962Vts_Exisf), A10962Vts_Exisf, Boolean.valueOf(n11174Vts_Nord), Short.valueOf(A11174Vts_Nord), Boolean.valueOf(n11175Vts_Tnq), Short.valueOf(A11175Vts_Tnq), Boolean.valueOf(n11176Vts_Any), Short.valueOf(A11176Vts_Any)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPVTS003");
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
            load1A91463( ) ;
         }
         endLevel1A91463( ) ;
      }
      closeExtendedTableCursors1A91463( ) ;
   }

   public void update1A91463( )
   {
      beforeValidate1A91463( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1A91463( ) ;
      }
      if ( ( nIsMod_1463 != 0 ) || ( nIsDirty_1463 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1A91463( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1A91463( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1A91463( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01A920 */
                     pr_default.execute(18, new Object[] {Boolean.valueOf(n10957Vts_Prodf), A10957Vts_Prodf, Boolean.valueOf(n10958Vts_Comenf), A10958Vts_Comenf, Boolean.valueOf(n10959Vts_Concf), A10959Vts_Concf, Boolean.valueOf(n10960Vts_Cantf), A10960Vts_Cantf, Boolean.valueOf(n10961Vts_undf), Byte.valueOf(A10961Vts_undf), Boolean.valueOf(n10962Vts_Exisf), A10962Vts_Exisf, Boolean.valueOf(n11174Vts_Nord), Short.valueOf(A11174Vts_Nord), Boolean.valueOf(n11175Vts_Tnq), Short.valueOf(A11175Vts_Tnq), Boolean.valueOf(n11176Vts_Any), Short.valueOf(A11176Vts_Any), A396EmprCod, A10940Vts_Nbarca, A10951Vts_Rgto, Short.valueOf(A10956Vts_Linef)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPVTS003");
                     if ( (pr_default.getStatus(18) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPVTS003"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1A91463( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1A91463( ) ;
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
            endLevel1A91463( ) ;
         }
      }
      closeExtendedTableCursors1A91463( ) ;
   }

   public void deferredUpdate1A91463( )
   {
   }

   public void delete1A91463( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1A91463( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1A91463( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1A91463( ) ;
         afterConfirm1A91463( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1A91463( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01A921 */
               pr_default.execute(19, new Object[] {A396EmprCod, A10940Vts_Nbarca, A10951Vts_Rgto, Short.valueOf(A10956Vts_Linef)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPVTS003");
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
      sMode1463 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1A91463( ) ;
      Gx_mode = sMode1463 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1A91463( )
   {
      standaloneModal1A91463( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1A91463( )
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

   public void scanStart1A91463( )
   {
      /* Scan By routine */
      /* Using cursor T01A922 */
      pr_default.execute(20, new Object[] {A396EmprCod, A10940Vts_Nbarca, A10951Vts_Rgto});
      RcdFound1463 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1463 = (short)(1) ;
         A10956Vts_Linef = T01A922_A10956Vts_Linef[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1A91463( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound1463 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1463 = (short)(1) ;
         A10956Vts_Linef = T01A922_A10956Vts_Linef[0] ;
      }
   }

   public void scanEnd1A91463( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1A91463( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1A91463( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1A91463( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1A91463( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1A91463( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1A91463( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1A91463( )
   {
      edtVts_Linef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_Linef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Linef_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtVts_Prodf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_Prodf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Prodf_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtVts_Comenf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_Comenf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Comenf_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtVts_Concf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_Concf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Concf_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtVts_Cantf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_Cantf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Cantf_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtVts_undf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_undf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_undf_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtVts_Exisf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_Exisf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Exisf_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtVts_Nord_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_Nord_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Nord_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtVts_Tnq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_Tnq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Tnq_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtVts_Any_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_Any_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Any_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void send_integrity_lvl_hashes1A91463( )
   {
   }

   public void send_integrity_lvl_hashes1A91462( )
   {
   }

   public void subsflControlProps_651463( )
   {
      edtavnRcdDeleted_1463_Internalname = "vNRCDDELETED_1463_"+sGXsfl_65_idx ;
      edtVts_Linef_Internalname = "VTS_LINEF_"+sGXsfl_65_idx ;
      edtVts_Prodf_Internalname = "VTS_PRODF_"+sGXsfl_65_idx ;
      edtVts_Comenf_Internalname = "VTS_COMENF_"+sGXsfl_65_idx ;
      edtVts_Concf_Internalname = "VTS_CONCF_"+sGXsfl_65_idx ;
      edtVts_Cantf_Internalname = "VTS_CANTF_"+sGXsfl_65_idx ;
      edtVts_undf_Internalname = "VTS_UNDF_"+sGXsfl_65_idx ;
      edtVts_Exisf_Internalname = "VTS_EXISF_"+sGXsfl_65_idx ;
      edtVts_Nord_Internalname = "VTS_NORD_"+sGXsfl_65_idx ;
      edtVts_Tnq_Internalname = "VTS_TNQ_"+sGXsfl_65_idx ;
      edtVts_Any_Internalname = "VTS_ANY_"+sGXsfl_65_idx ;
   }

   public void subsflControlProps_fel_651463( )
   {
      edtavnRcdDeleted_1463_Internalname = "vNRCDDELETED_1463_"+sGXsfl_65_fel_idx ;
      edtVts_Linef_Internalname = "VTS_LINEF_"+sGXsfl_65_fel_idx ;
      edtVts_Prodf_Internalname = "VTS_PRODF_"+sGXsfl_65_fel_idx ;
      edtVts_Comenf_Internalname = "VTS_COMENF_"+sGXsfl_65_fel_idx ;
      edtVts_Concf_Internalname = "VTS_CONCF_"+sGXsfl_65_fel_idx ;
      edtVts_Cantf_Internalname = "VTS_CANTF_"+sGXsfl_65_fel_idx ;
      edtVts_undf_Internalname = "VTS_UNDF_"+sGXsfl_65_fel_idx ;
      edtVts_Exisf_Internalname = "VTS_EXISF_"+sGXsfl_65_fel_idx ;
      edtVts_Nord_Internalname = "VTS_NORD_"+sGXsfl_65_fel_idx ;
      edtVts_Tnq_Internalname = "VTS_TNQ_"+sGXsfl_65_fel_idx ;
      edtVts_Any_Internalname = "VTS_ANY_"+sGXsfl_65_fel_idx ;
   }

   public void addRow1A91463( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651463( ) ;
      sendRow1A91463( ) ;
   }

   public void sendRow1A91463( )
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
         if ( ((int)((nGXsfl_65_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1463_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1463_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1463, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1463_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1463), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1463), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1463_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1463_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1463_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVts_Linef_Internalname,GXutil.ltrim( localUtil.ntoc( A10956Vts_Linef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10956Vts_Linef), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVts_Linef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVts_Linef_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1463_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVts_Prodf_Internalname,GXutil.rtrim( A10957Vts_Prodf),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVts_Prodf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVts_Prodf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1463_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVts_Comenf_Internalname,GXutil.rtrim( A10958Vts_Comenf),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVts_Comenf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVts_Comenf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1463_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVts_Concf_Internalname,GXutil.ltrim( localUtil.ntoc( A10959Vts_Concf, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtVts_Concf_Enabled!=0) ? localUtil.format( A10959Vts_Concf, "ZZZZ9.99999") : localUtil.format( A10959Vts_Concf, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVts_Concf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVts_Concf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1463_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVts_Cantf_Internalname,GXutil.ltrim( localUtil.ntoc( A10960Vts_Cantf, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtVts_Cantf_Enabled!=0) ? localUtil.format( A10960Vts_Cantf, "ZZZZZZ9.99999") : localUtil.format( A10960Vts_Cantf, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVts_Cantf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVts_Cantf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1463_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVts_undf_Internalname,GXutil.ltrim( localUtil.ntoc( A10961Vts_undf, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtVts_undf_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10961Vts_undf), "9") : localUtil.format( DecimalUtil.doubleToDec(A10961Vts_undf), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVts_undf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVts_undf_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1463_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVts_Exisf_Internalname,GXutil.ltrim( localUtil.ntoc( A10962Vts_Exisf, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtVts_Exisf_Enabled!=0) ? localUtil.format( A10962Vts_Exisf, "ZZZZZZ9.99999") : localUtil.format( A10962Vts_Exisf, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVts_Exisf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVts_Exisf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1463_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVts_Nord_Internalname,GXutil.ltrim( localUtil.ntoc( A11174Vts_Nord, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtVts_Nord_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11174Vts_Nord), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11174Vts_Nord), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVts_Nord_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVts_Nord_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1463_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVts_Tnq_Internalname,GXutil.ltrim( localUtil.ntoc( A11175Vts_Tnq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtVts_Tnq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11175Vts_Tnq), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11175Vts_Tnq), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVts_Tnq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVts_Tnq_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1463_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVts_Any_Internalname,GXutil.ltrim( localUtil.ntoc( A11176Vts_Any, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtVts_Any_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11176Vts_Any), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11176Vts_Any), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVts_Any_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVts_Any_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1A91463( ) ;
      GXCCtl = "Z10956Vts_Linef_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10956Vts_Linef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10957Vts_Prodf_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10957Vts_Prodf));
      GXCCtl = "Z10958Vts_Comenf_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10958Vts_Comenf));
      GXCCtl = "Z10959Vts_Concf_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10959Vts_Concf, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10960Vts_Cantf_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10960Vts_Cantf, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10961Vts_undf_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10961Vts_undf, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10962Vts_Exisf_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10962Vts_Exisf, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11174Vts_Nord_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11174Vts_Nord, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11175Vts_Tnq_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11175Vts_Tnq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11176Vts_Any_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11176Vts_Any, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1463_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1463, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1463_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1463, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1463_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1463, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1463_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1463_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VTS_LINEF_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Linef_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VTS_PRODF_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Prodf_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VTS_COMENF_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Comenf_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VTS_CONCF_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Concf_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VTS_CANTF_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Cantf_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VTS_UNDF_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_undf_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VTS_EXISF_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Exisf_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VTS_NORD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Nord_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VTS_TNQ_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Tnq_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VTS_ANY_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Any_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1A91463( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651463( ) ;
      edtavnRcdDeleted_1463_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1463_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVts_Linef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_LINEF_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVts_Prodf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_PRODF_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVts_Comenf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_COMENF_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVts_Concf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_CONCF_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVts_Cantf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_CANTF_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVts_undf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_UNDF_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVts_Exisf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_EXISF_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVts_Nord_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_NORD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVts_Tnq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_TNQ_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVts_Any_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_ANY_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1463_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1463_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1463");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1463_Internalname ;
         wbErr = true ;
         nRcdDeleted_1463 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1463 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1463_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVts_Linef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVts_Linef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "VTS_LINEF_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVts_Linef_Internalname ;
         wbErr = true ;
         A10956Vts_Linef = (short)(0) ;
      }
      else
      {
         A10956Vts_Linef = (short)(localUtil.ctol( httpContext.cgiGet( edtVts_Linef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A10957Vts_Prodf = httpContext.cgiGet( edtVts_Prodf_Internalname) ;
      n10957Vts_Prodf = false ;
      A10958Vts_Comenf = httpContext.cgiGet( edtVts_Comenf_Internalname) ;
      n10958Vts_Comenf = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVts_Concf_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVts_Concf_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
      {
         GXCCtl = "VTS_CONCF_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVts_Concf_Internalname ;
         wbErr = true ;
         A10959Vts_Concf = DecimalUtil.ZERO ;
         n10959Vts_Concf = false ;
      }
      else
      {
         A10959Vts_Concf = localUtil.ctond( httpContext.cgiGet( edtVts_Concf_Internalname)) ;
         n10959Vts_Concf = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVts_Cantf_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVts_Cantf_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "VTS_CANTF_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVts_Cantf_Internalname ;
         wbErr = true ;
         A10960Vts_Cantf = DecimalUtil.ZERO ;
         n10960Vts_Cantf = false ;
      }
      else
      {
         A10960Vts_Cantf = localUtil.ctond( httpContext.cgiGet( edtVts_Cantf_Internalname)) ;
         n10960Vts_Cantf = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVts_undf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVts_undf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "VTS_UNDF_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVts_undf_Internalname ;
         wbErr = true ;
         A10961Vts_undf = (byte)(0) ;
         n10961Vts_undf = false ;
      }
      else
      {
         A10961Vts_undf = (byte)(localUtil.ctol( httpContext.cgiGet( edtVts_undf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10961Vts_undf = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVts_Exisf_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVts_Exisf_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "VTS_EXISF_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVts_Exisf_Internalname ;
         wbErr = true ;
         A10962Vts_Exisf = DecimalUtil.ZERO ;
         n10962Vts_Exisf = false ;
      }
      else
      {
         A10962Vts_Exisf = localUtil.ctond( httpContext.cgiGet( edtVts_Exisf_Internalname)) ;
         n10962Vts_Exisf = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVts_Nord_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVts_Nord_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "VTS_NORD_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVts_Nord_Internalname ;
         wbErr = true ;
         A11174Vts_Nord = (short)(0) ;
         n11174Vts_Nord = false ;
      }
      else
      {
         A11174Vts_Nord = (short)(localUtil.ctol( httpContext.cgiGet( edtVts_Nord_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n11174Vts_Nord = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVts_Tnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVts_Tnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "VTS_TNQ_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVts_Tnq_Internalname ;
         wbErr = true ;
         A11175Vts_Tnq = (short)(0) ;
         n11175Vts_Tnq = false ;
      }
      else
      {
         A11175Vts_Tnq = (short)(localUtil.ctol( httpContext.cgiGet( edtVts_Tnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n11175Vts_Tnq = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVts_Any_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVts_Any_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "VTS_ANY_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVts_Any_Internalname ;
         wbErr = true ;
         A11176Vts_Any = (short)(0) ;
         n11176Vts_Any = false ;
      }
      else
      {
         A11176Vts_Any = (short)(localUtil.ctol( httpContext.cgiGet( edtVts_Any_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n11176Vts_Any = false ;
      }
      GXCCtl = "Z10956Vts_Linef_" + sGXsfl_65_idx ;
      Z10956Vts_Linef = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10957Vts_Prodf_" + sGXsfl_65_idx ;
      Z10957Vts_Prodf = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10958Vts_Comenf_" + sGXsfl_65_idx ;
      Z10958Vts_Comenf = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10959Vts_Concf_" + sGXsfl_65_idx ;
      Z10959Vts_Concf = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10960Vts_Cantf_" + sGXsfl_65_idx ;
      Z10960Vts_Cantf = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10961Vts_undf_" + sGXsfl_65_idx ;
      Z10961Vts_undf = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10962Vts_Exisf_" + sGXsfl_65_idx ;
      Z10962Vts_Exisf = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11174Vts_Nord_" + sGXsfl_65_idx ;
      Z11174Vts_Nord = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11175Vts_Tnq_" + sGXsfl_65_idx ;
      Z11175Vts_Tnq = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11176Vts_Any_" + sGXsfl_65_idx ;
      Z11176Vts_Any = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1463_" + sGXsfl_65_idx ;
      nRcdDeleted_1463 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1463_" + sGXsfl_65_idx ;
      nRcdExists_1463 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1463_" + sGXsfl_65_idx ;
      nIsMod_1463 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtVts_Linef_Enabled = edtVts_Linef_Enabled ;
   }

   public void confirmValues1A90( )
   {
      nGXsfl_65_idx = 0 ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651463( ) ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_651463( ) ;
         httpContext.changePostValue( "Z10956Vts_Linef_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z10956Vts_Linef_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10956Vts_Linef_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z10957Vts_Prodf_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z10957Vts_Prodf_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10957Vts_Prodf_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z10958Vts_Comenf_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z10958Vts_Comenf_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10958Vts_Comenf_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z10959Vts_Concf_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z10959Vts_Concf_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10959Vts_Concf_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z10960Vts_Cantf_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z10960Vts_Cantf_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10960Vts_Cantf_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z10961Vts_undf_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z10961Vts_undf_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10961Vts_undf_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z10962Vts_Exisf_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z10962Vts_Exisf_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10962Vts_Exisf_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z11174Vts_Nord_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z11174Vts_Nord_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11174Vts_Nord_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z11175Vts_Tnq_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z11175Vts_Tnq_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11175Vts_Tnq_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z11176Vts_Any_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z11176Vts_Any_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11176Vts_Any_"+sGXsfl_65_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tvts002", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10940Vts_Nbarca", GXutil.rtrim( Z10940Vts_Nbarca));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10951Vts_Rgto", GXutil.rtrim( Z10951Vts_Rgto));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10963Vts_maqf", GXutil.rtrim( Z10963Vts_maqf));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10952Vts_FecI", localUtil.dtoc( Z10952Vts_FecI, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10953Vts_HorI", localUtil.ttoc( Z10953Vts_HorI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10954Vts_FecF", localUtil.dtoc( Z10954Vts_FecF, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10955Vts_HorF", localUtil.ttoc( Z10955Vts_HorF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_65", GXutil.ltrim( localUtil.ntoc( nGXsfl_65_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tvts002", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TVTS002" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "REGISTRO 80y81", "") ;
   }

   public void initializeNonKey1A91462( )
   {
      A10963Vts_maqf = "" ;
      n10963Vts_maqf = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10963Vts_maqf", A10963Vts_maqf);
      A10952Vts_FecI = GXutil.nullDate() ;
      n10952Vts_FecI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10952Vts_FecI", localUtil.format(A10952Vts_FecI, "99/99/99"));
      A10953Vts_HorI = GXutil.resetTime( GXutil.nullDate() );
      n10953Vts_HorI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10953Vts_HorI", localUtil.ttoc( A10953Vts_HorI, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A10954Vts_FecF = GXutil.nullDate() ;
      n10954Vts_FecF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10954Vts_FecF", localUtil.format(A10954Vts_FecF, "99/99/99"));
      A10955Vts_HorF = GXutil.resetTime( GXutil.nullDate() );
      n10955Vts_HorF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10955Vts_HorF", localUtil.ttoc( A10955Vts_HorF, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Z10963Vts_maqf = "" ;
      Z10952Vts_FecI = GXutil.nullDate() ;
      Z10953Vts_HorI = GXutil.resetTime( GXutil.nullDate() );
      Z10954Vts_FecF = GXutil.nullDate() ;
      Z10955Vts_HorF = GXutil.resetTime( GXutil.nullDate() );
   }

   public void initAll1A91462( )
   {
      A10940Vts_Nbarca = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10940Vts_Nbarca", A10940Vts_Nbarca);
      A10951Vts_Rgto = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10951Vts_Rgto", A10951Vts_Rgto);
      initializeNonKey1A91462( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1A91463( )
   {
      A10957Vts_Prodf = "" ;
      n10957Vts_Prodf = false ;
      A10958Vts_Comenf = "" ;
      n10958Vts_Comenf = false ;
      A10959Vts_Concf = DecimalUtil.ZERO ;
      n10959Vts_Concf = false ;
      A10960Vts_Cantf = DecimalUtil.ZERO ;
      n10960Vts_Cantf = false ;
      A10961Vts_undf = (byte)(0) ;
      n10961Vts_undf = false ;
      A10962Vts_Exisf = DecimalUtil.ZERO ;
      n10962Vts_Exisf = false ;
      A11174Vts_Nord = (short)(0) ;
      n11174Vts_Nord = false ;
      A11175Vts_Tnq = (short)(0) ;
      n11175Vts_Tnq = false ;
      A11176Vts_Any = (short)(0) ;
      n11176Vts_Any = false ;
      Z10957Vts_Prodf = "" ;
      Z10958Vts_Comenf = "" ;
      Z10959Vts_Concf = DecimalUtil.ZERO ;
      Z10960Vts_Cantf = DecimalUtil.ZERO ;
      Z10961Vts_undf = (byte)(0) ;
      Z10962Vts_Exisf = DecimalUtil.ZERO ;
      Z11174Vts_Nord = (short)(0) ;
      Z11175Vts_Tnq = (short)(0) ;
      Z11176Vts_Any = (short)(0) ;
   }

   public void initAll1A91463( )
   {
      A10956Vts_Linef = (short)(0) ;
      initializeNonKey1A91463( ) ;
   }

   public void standaloneModalInsert1A91463( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241561221", true, true);
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
      httpContext.AddJavascriptSource("tvts002.js", "?20268241561221", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1463( )
   {
      edtVts_Linef_Enabled = defedtVts_Linef_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_Linef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Linef_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void startgridcontrol65( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1463, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1463_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10956Vts_Linef, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Linef_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10957Vts_Prodf));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Prodf_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10958Vts_Comenf));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Comenf_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10959Vts_Concf, (byte)(11), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Concf_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10960Vts_Cantf, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Cantf_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10961Vts_undf, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_undf_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10962Vts_Exisf, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Exisf_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11174Vts_Nord, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Nord_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11175Vts_Tnq, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Tnq_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11176Vts_Any, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Any_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtVts_Nbarca_Internalname = "VTS_NBARCA" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtVts_Rgto_Internalname = "VTS_RGTO" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtVts_maqf_Internalname = "VTS_MAQF" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtVts_FecI_Internalname = "VTS_FECI" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtVts_HorI_Internalname = "VTS_HORI" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtVts_FecF_Internalname = "VTS_FECF" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtVts_HorF_Internalname = "VTS_HORF" ;
      edtavnRcdDeleted_1463_Internalname = "vNRCDDELETED_1463" ;
      edtVts_Linef_Internalname = "VTS_LINEF" ;
      edtVts_Prodf_Internalname = "VTS_PRODF" ;
      edtVts_Comenf_Internalname = "VTS_COMENF" ;
      edtVts_Concf_Internalname = "VTS_CONCF" ;
      edtVts_Cantf_Internalname = "VTS_CANTF" ;
      edtVts_undf_Internalname = "VTS_UNDF" ;
      edtVts_Exisf_Internalname = "VTS_EXISF" ;
      edtVts_Nord_Internalname = "VTS_NORD" ;
      edtVts_Tnq_Internalname = "VTS_TNQ" ;
      edtVts_Any_Internalname = "VTS_ANY" ;
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
      Form.setCaption( httpContext.getMessage( "REGISTRO 80y81", "") );
      edtVts_Any_Jsonclick = "" ;
      edtVts_Tnq_Jsonclick = "" ;
      edtVts_Nord_Jsonclick = "" ;
      edtVts_Exisf_Jsonclick = "" ;
      edtVts_undf_Jsonclick = "" ;
      edtVts_Cantf_Jsonclick = "" ;
      edtVts_Concf_Jsonclick = "" ;
      edtVts_Comenf_Jsonclick = "" ;
      edtVts_Prodf_Jsonclick = "" ;
      edtVts_Linef_Jsonclick = "" ;
      edtavnRcdDeleted_1463_Jsonclick = "" ;
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
      edtVts_Any_Enabled = 1 ;
      edtVts_Tnq_Enabled = 1 ;
      edtVts_Nord_Enabled = 1 ;
      edtVts_Exisf_Enabled = 1 ;
      edtVts_undf_Enabled = 1 ;
      edtVts_Cantf_Enabled = 1 ;
      edtVts_Concf_Enabled = 1 ;
      edtVts_Comenf_Enabled = 1 ;
      edtVts_Prodf_Enabled = 1 ;
      edtVts_Linef_Enabled = 1 ;
      edtavnRcdDeleted_1463_Enabled = 1 ;
      edtVts_HorF_Jsonclick = "" ;
      edtVts_HorF_Backcolor = (int)(0xFFFFFF) ;
      edtVts_HorF_Enabled = 1 ;
      edtVts_FecF_Jsonclick = "" ;
      edtVts_FecF_Backcolor = (int)(0xFFFFFF) ;
      edtVts_FecF_Enabled = 1 ;
      edtVts_HorI_Jsonclick = "" ;
      edtVts_HorI_Backcolor = (int)(0xFFFFFF) ;
      edtVts_HorI_Enabled = 1 ;
      edtVts_FecI_Jsonclick = "" ;
      edtVts_FecI_Backcolor = (int)(0xFFFFFF) ;
      edtVts_FecI_Enabled = 1 ;
      edtVts_maqf_Jsonclick = "" ;
      edtVts_maqf_Backcolor = (int)(0xFFFFFF) ;
      edtVts_maqf_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtVts_Rgto_Jsonclick = "" ;
      edtVts_Rgto_Backcolor = (int)(0xFFFFFF) ;
      edtVts_Rgto_Enabled = 1 ;
      edtVts_Nbarca_Jsonclick = "" ;
      edtVts_Nbarca_Backcolor = (int)(0xFFFFFF) ;
      edtVts_Nbarca_Enabled = 1 ;
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
      subsflControlProps_651463( ) ;
      while ( nGXsfl_65_idx <= nRC_GXsfl_65 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1A91463( ) ;
         standaloneModal1A91463( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1A91463( ) ;
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_651463( ) ;
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
      /* Using cursor T01A923 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01A923_A407EmprNom[0] ;
      n407EmprNom = T01A923_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(21);
      /* Using cursor T01A924 */
      pr_default.execute(22, new Object[] {A396EmprCod, A10940Vts_Nbarca});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "REGISTRO 79", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VTS_NBARCA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVts_Nbarca_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(22);
      GX_FocusControl = edtVts_maqf_Internalname ;
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

   public void valid_Vts_nbarca( )
   {
      /* Using cursor T01A924 */
      pr_default.execute(22, new Object[] {A396EmprCod, A10940Vts_Nbarca});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "REGISTRO 79", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VTS_NBARCA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVts_Nbarca_Internalname ;
      }
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Vts_rgto( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10963Vts_maqf", GXutil.rtrim( A10963Vts_maqf));
      httpContext.ajax_rsp_assign_attri("", false, "A10952Vts_FecI", localUtil.format(A10952Vts_FecI, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A10953Vts_HorI", localUtil.ttoc( A10953Vts_HorI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A10954Vts_FecF", localUtil.format(A10954Vts_FecF, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A10955Vts_HorF", localUtil.ttoc( A10955Vts_HorF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10940Vts_Nbarca", GXutil.rtrim( Z10940Vts_Nbarca));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10951Vts_Rgto", GXutil.rtrim( Z10951Vts_Rgto));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10963Vts_maqf", GXutil.rtrim( Z10963Vts_maqf));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10952Vts_FecI", localUtil.format(Z10952Vts_FecI, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10953Vts_HorI", localUtil.ttoc( Z10953Vts_HorI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10954Vts_FecF", localUtil.format(Z10954Vts_FecF, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10955Vts_HorF", localUtil.ttoc( Z10955Vts_HorF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      setEventMetadata("VALID_VTS_NBARCA","{handler:'valid_Vts_nbarca',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10940Vts_Nbarca',fld:'VTS_NBARCA',pic:''}]");
      setEventMetadata("VALID_VTS_NBARCA",",oparms:[]}");
      setEventMetadata("VALID_VTS_RGTO","{handler:'valid_Vts_rgto',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10940Vts_Nbarca',fld:'VTS_NBARCA',pic:''},{av:'A10951Vts_Rgto',fld:'VTS_RGTO',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_VTS_RGTO",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10963Vts_maqf',fld:'VTS_MAQF',pic:''},{av:'A10952Vts_FecI',fld:'VTS_FECI',pic:''},{av:'A10953Vts_HorI',fld:'VTS_HORI',pic:'99/99/99 99:99'},{av:'A10954Vts_FecF',fld:'VTS_FECF',pic:''},{av:'A10955Vts_HorF',fld:'VTS_HORF',pic:'99/99/99 99:99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z10940Vts_Nbarca'},{av:'Z10951Vts_Rgto'},{av:'Z407EmprNom'},{av:'Z10963Vts_maqf'},{av:'Z10952Vts_FecI'},{av:'Z10953Vts_HorI'},{av:'Z10954Vts_FecF'},{av:'Z10955Vts_HorF'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_VTS_LINEF","{handler:'valid_Vts_linef',iparms:[]");
      setEventMetadata("VALID_VTS_LINEF",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Vts_any',iparms:[]");
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
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z10940Vts_Nbarca = "" ;
      Z10951Vts_Rgto = "" ;
      Z10963Vts_maqf = "" ;
      Z10952Vts_FecI = GXutil.nullDate() ;
      Z10953Vts_HorI = GXutil.resetTime( GXutil.nullDate() );
      Z10954Vts_FecF = GXutil.nullDate() ;
      Z10955Vts_HorF = GXutil.resetTime( GXutil.nullDate() );
      Z10957Vts_Prodf = "" ;
      Z10958Vts_Comenf = "" ;
      Z10959Vts_Concf = DecimalUtil.ZERO ;
      Z10960Vts_Cantf = DecimalUtil.ZERO ;
      Z10962Vts_Exisf = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A10940Vts_Nbarca = "" ;
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
      A10951Vts_Rgto = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A10963Vts_maqf = "" ;
      lblTextblock6_Jsonclick = "" ;
      A10952Vts_FecI = GXutil.nullDate() ;
      lblTextblock7_Jsonclick = "" ;
      A10953Vts_HorI = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock8_Jsonclick = "" ;
      A10954Vts_FecF = GXutil.nullDate() ;
      lblTextblock9_Jsonclick = "" ;
      A10955Vts_HorF = GXutil.resetTime( GXutil.nullDate() );
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1463 = "" ;
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
      sMode1462 = "" ;
      GXCCtl = "" ;
      A10957Vts_Prodf = "" ;
      A10958Vts_Comenf = "" ;
      A10959Vts_Concf = DecimalUtil.ZERO ;
      A10960Vts_Cantf = DecimalUtil.ZERO ;
      A10962Vts_Exisf = DecimalUtil.ZERO ;
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
      T01A96_A407EmprNom = new String[] {""} ;
      T01A96_n407EmprNom = new boolean[] {false} ;
      T01A98_A10951Vts_Rgto = new String[] {""} ;
      T01A98_A407EmprNom = new String[] {""} ;
      T01A98_n407EmprNom = new boolean[] {false} ;
      T01A98_A10963Vts_maqf = new String[] {""} ;
      T01A98_n10963Vts_maqf = new boolean[] {false} ;
      T01A98_A10952Vts_FecI = new java.util.Date[] {GXutil.nullDate()} ;
      T01A98_n10952Vts_FecI = new boolean[] {false} ;
      T01A98_A10953Vts_HorI = new java.util.Date[] {GXutil.nullDate()} ;
      T01A98_n10953Vts_HorI = new boolean[] {false} ;
      T01A98_A10954Vts_FecF = new java.util.Date[] {GXutil.nullDate()} ;
      T01A98_n10954Vts_FecF = new boolean[] {false} ;
      T01A98_A10955Vts_HorF = new java.util.Date[] {GXutil.nullDate()} ;
      T01A98_n10955Vts_HorF = new boolean[] {false} ;
      T01A98_A396EmprCod = new String[] {""} ;
      T01A98_A10940Vts_Nbarca = new String[] {""} ;
      T01A97_A396EmprCod = new String[] {""} ;
      T01A99_A396EmprCod = new String[] {""} ;
      T01A910_A396EmprCod = new String[] {""} ;
      T01A910_A10940Vts_Nbarca = new String[] {""} ;
      T01A910_A10951Vts_Rgto = new String[] {""} ;
      T01A95_A10951Vts_Rgto = new String[] {""} ;
      T01A95_A10963Vts_maqf = new String[] {""} ;
      T01A95_n10963Vts_maqf = new boolean[] {false} ;
      T01A95_A10952Vts_FecI = new java.util.Date[] {GXutil.nullDate()} ;
      T01A95_n10952Vts_FecI = new boolean[] {false} ;
      T01A95_A10953Vts_HorI = new java.util.Date[] {GXutil.nullDate()} ;
      T01A95_n10953Vts_HorI = new boolean[] {false} ;
      T01A95_A10954Vts_FecF = new java.util.Date[] {GXutil.nullDate()} ;
      T01A95_n10954Vts_FecF = new boolean[] {false} ;
      T01A95_A10955Vts_HorF = new java.util.Date[] {GXutil.nullDate()} ;
      T01A95_n10955Vts_HorF = new boolean[] {false} ;
      T01A95_A396EmprCod = new String[] {""} ;
      T01A95_A10940Vts_Nbarca = new String[] {""} ;
      T01A911_A396EmprCod = new String[] {""} ;
      T01A911_A10940Vts_Nbarca = new String[] {""} ;
      T01A911_A10951Vts_Rgto = new String[] {""} ;
      T01A912_A396EmprCod = new String[] {""} ;
      T01A912_A10940Vts_Nbarca = new String[] {""} ;
      T01A912_A10951Vts_Rgto = new String[] {""} ;
      T01A94_A10951Vts_Rgto = new String[] {""} ;
      T01A94_A10963Vts_maqf = new String[] {""} ;
      T01A94_n10963Vts_maqf = new boolean[] {false} ;
      T01A94_A10952Vts_FecI = new java.util.Date[] {GXutil.nullDate()} ;
      T01A94_n10952Vts_FecI = new boolean[] {false} ;
      T01A94_A10953Vts_HorI = new java.util.Date[] {GXutil.nullDate()} ;
      T01A94_n10953Vts_HorI = new boolean[] {false} ;
      T01A94_A10954Vts_FecF = new java.util.Date[] {GXutil.nullDate()} ;
      T01A94_n10954Vts_FecF = new boolean[] {false} ;
      T01A94_A10955Vts_HorF = new java.util.Date[] {GXutil.nullDate()} ;
      T01A94_n10955Vts_HorF = new boolean[] {false} ;
      T01A94_A396EmprCod = new String[] {""} ;
      T01A94_A10940Vts_Nbarca = new String[] {""} ;
      T01A916_A396EmprCod = new String[] {""} ;
      T01A916_A10940Vts_Nbarca = new String[] {""} ;
      T01A916_A10951Vts_Rgto = new String[] {""} ;
      T01A917_A396EmprCod = new String[] {""} ;
      T01A917_A10940Vts_Nbarca = new String[] {""} ;
      T01A917_A10951Vts_Rgto = new String[] {""} ;
      T01A917_A10956Vts_Linef = new short[1] ;
      T01A917_A10957Vts_Prodf = new String[] {""} ;
      T01A917_n10957Vts_Prodf = new boolean[] {false} ;
      T01A917_A10958Vts_Comenf = new String[] {""} ;
      T01A917_n10958Vts_Comenf = new boolean[] {false} ;
      T01A917_A10959Vts_Concf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01A917_n10959Vts_Concf = new boolean[] {false} ;
      T01A917_A10960Vts_Cantf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01A917_n10960Vts_Cantf = new boolean[] {false} ;
      T01A917_A10961Vts_undf = new byte[1] ;
      T01A917_n10961Vts_undf = new boolean[] {false} ;
      T01A917_A10962Vts_Exisf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01A917_n10962Vts_Exisf = new boolean[] {false} ;
      T01A917_A11174Vts_Nord = new short[1] ;
      T01A917_n11174Vts_Nord = new boolean[] {false} ;
      T01A917_A11175Vts_Tnq = new short[1] ;
      T01A917_n11175Vts_Tnq = new boolean[] {false} ;
      T01A917_A11176Vts_Any = new short[1] ;
      T01A917_n11176Vts_Any = new boolean[] {false} ;
      T01A918_A396EmprCod = new String[] {""} ;
      T01A918_A10940Vts_Nbarca = new String[] {""} ;
      T01A918_A10951Vts_Rgto = new String[] {""} ;
      T01A918_A10956Vts_Linef = new short[1] ;
      T01A93_A396EmprCod = new String[] {""} ;
      T01A93_A10940Vts_Nbarca = new String[] {""} ;
      T01A93_A10951Vts_Rgto = new String[] {""} ;
      T01A93_A10956Vts_Linef = new short[1] ;
      T01A93_A10957Vts_Prodf = new String[] {""} ;
      T01A93_n10957Vts_Prodf = new boolean[] {false} ;
      T01A93_A10958Vts_Comenf = new String[] {""} ;
      T01A93_n10958Vts_Comenf = new boolean[] {false} ;
      T01A93_A10959Vts_Concf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01A93_n10959Vts_Concf = new boolean[] {false} ;
      T01A93_A10960Vts_Cantf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01A93_n10960Vts_Cantf = new boolean[] {false} ;
      T01A93_A10961Vts_undf = new byte[1] ;
      T01A93_n10961Vts_undf = new boolean[] {false} ;
      T01A93_A10962Vts_Exisf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01A93_n10962Vts_Exisf = new boolean[] {false} ;
      T01A93_A11174Vts_Nord = new short[1] ;
      T01A93_n11174Vts_Nord = new boolean[] {false} ;
      T01A93_A11175Vts_Tnq = new short[1] ;
      T01A93_n11175Vts_Tnq = new boolean[] {false} ;
      T01A93_A11176Vts_Any = new short[1] ;
      T01A93_n11176Vts_Any = new boolean[] {false} ;
      T01A92_A396EmprCod = new String[] {""} ;
      T01A92_A10940Vts_Nbarca = new String[] {""} ;
      T01A92_A10951Vts_Rgto = new String[] {""} ;
      T01A92_A10956Vts_Linef = new short[1] ;
      T01A92_A10957Vts_Prodf = new String[] {""} ;
      T01A92_n10957Vts_Prodf = new boolean[] {false} ;
      T01A92_A10958Vts_Comenf = new String[] {""} ;
      T01A92_n10958Vts_Comenf = new boolean[] {false} ;
      T01A92_A10959Vts_Concf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01A92_n10959Vts_Concf = new boolean[] {false} ;
      T01A92_A10960Vts_Cantf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01A92_n10960Vts_Cantf = new boolean[] {false} ;
      T01A92_A10961Vts_undf = new byte[1] ;
      T01A92_n10961Vts_undf = new boolean[] {false} ;
      T01A92_A10962Vts_Exisf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01A92_n10962Vts_Exisf = new boolean[] {false} ;
      T01A92_A11174Vts_Nord = new short[1] ;
      T01A92_n11174Vts_Nord = new boolean[] {false} ;
      T01A92_A11175Vts_Tnq = new short[1] ;
      T01A92_n11175Vts_Tnq = new boolean[] {false} ;
      T01A92_A11176Vts_Any = new short[1] ;
      T01A92_n11176Vts_Any = new boolean[] {false} ;
      T01A922_A396EmprCod = new String[] {""} ;
      T01A922_A10940Vts_Nbarca = new String[] {""} ;
      T01A922_A10951Vts_Rgto = new String[] {""} ;
      T01A922_A10956Vts_Linef = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01A923_A407EmprNom = new String[] {""} ;
      T01A923_n407EmprNom = new boolean[] {false} ;
      T01A924_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ10940Vts_Nbarca = "" ;
      ZZ10951Vts_Rgto = "" ;
      ZZ407EmprNom = "" ;
      ZZ10963Vts_maqf = "" ;
      ZZ10952Vts_FecI = GXutil.nullDate() ;
      ZZ10953Vts_HorI = GXutil.resetTime( GXutil.nullDate() );
      ZZ10954Vts_FecF = GXutil.nullDate() ;
      ZZ10955Vts_HorF = GXutil.resetTime( GXutil.nullDate() );
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tvts002__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tvts002__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tvts002__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tvts002__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tvts002__default(),
         new Object[] {
             new Object[] {
            T01A92_A396EmprCod, T01A92_A10940Vts_Nbarca, T01A92_A10951Vts_Rgto, T01A92_A10956Vts_Linef, T01A92_A10957Vts_Prodf, T01A92_n10957Vts_Prodf, T01A92_A10958Vts_Comenf, T01A92_n10958Vts_Comenf, T01A92_A10959Vts_Concf, T01A92_n10959Vts_Concf,
            T01A92_A10960Vts_Cantf, T01A92_n10960Vts_Cantf, T01A92_A10961Vts_undf, T01A92_n10961Vts_undf, T01A92_A10962Vts_Exisf, T01A92_n10962Vts_Exisf, T01A92_A11174Vts_Nord, T01A92_n11174Vts_Nord, T01A92_A11175Vts_Tnq, T01A92_n11175Vts_Tnq,
            T01A92_A11176Vts_Any, T01A92_n11176Vts_Any
            }
            , new Object[] {
            T01A93_A396EmprCod, T01A93_A10940Vts_Nbarca, T01A93_A10951Vts_Rgto, T01A93_A10956Vts_Linef, T01A93_A10957Vts_Prodf, T01A93_n10957Vts_Prodf, T01A93_A10958Vts_Comenf, T01A93_n10958Vts_Comenf, T01A93_A10959Vts_Concf, T01A93_n10959Vts_Concf,
            T01A93_A10960Vts_Cantf, T01A93_n10960Vts_Cantf, T01A93_A10961Vts_undf, T01A93_n10961Vts_undf, T01A93_A10962Vts_Exisf, T01A93_n10962Vts_Exisf, T01A93_A11174Vts_Nord, T01A93_n11174Vts_Nord, T01A93_A11175Vts_Tnq, T01A93_n11175Vts_Tnq,
            T01A93_A11176Vts_Any, T01A93_n11176Vts_Any
            }
            , new Object[] {
            T01A94_A10951Vts_Rgto, T01A94_A10963Vts_maqf, T01A94_n10963Vts_maqf, T01A94_A10952Vts_FecI, T01A94_n10952Vts_FecI, T01A94_A10953Vts_HorI, T01A94_n10953Vts_HorI, T01A94_A10954Vts_FecF, T01A94_n10954Vts_FecF, T01A94_A10955Vts_HorF,
            T01A94_n10955Vts_HorF, T01A94_A396EmprCod, T01A94_A10940Vts_Nbarca
            }
            , new Object[] {
            T01A95_A10951Vts_Rgto, T01A95_A10963Vts_maqf, T01A95_n10963Vts_maqf, T01A95_A10952Vts_FecI, T01A95_n10952Vts_FecI, T01A95_A10953Vts_HorI, T01A95_n10953Vts_HorI, T01A95_A10954Vts_FecF, T01A95_n10954Vts_FecF, T01A95_A10955Vts_HorF,
            T01A95_n10955Vts_HorF, T01A95_A396EmprCod, T01A95_A10940Vts_Nbarca
            }
            , new Object[] {
            T01A96_A407EmprNom, T01A96_n407EmprNom
            }
            , new Object[] {
            T01A97_A396EmprCod
            }
            , new Object[] {
            T01A98_A10951Vts_Rgto, T01A98_A407EmprNom, T01A98_n407EmprNom, T01A98_A10963Vts_maqf, T01A98_n10963Vts_maqf, T01A98_A10952Vts_FecI, T01A98_n10952Vts_FecI, T01A98_A10953Vts_HorI, T01A98_n10953Vts_HorI, T01A98_A10954Vts_FecF,
            T01A98_n10954Vts_FecF, T01A98_A10955Vts_HorF, T01A98_n10955Vts_HorF, T01A98_A396EmprCod, T01A98_A10940Vts_Nbarca
            }
            , new Object[] {
            T01A99_A396EmprCod
            }
            , new Object[] {
            T01A910_A396EmprCod, T01A910_A10940Vts_Nbarca, T01A910_A10951Vts_Rgto
            }
            , new Object[] {
            T01A911_A396EmprCod, T01A911_A10940Vts_Nbarca, T01A911_A10951Vts_Rgto
            }
            , new Object[] {
            T01A912_A396EmprCod, T01A912_A10940Vts_Nbarca, T01A912_A10951Vts_Rgto
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01A916_A396EmprCod, T01A916_A10940Vts_Nbarca, T01A916_A10951Vts_Rgto
            }
            , new Object[] {
            T01A917_A396EmprCod, T01A917_A10940Vts_Nbarca, T01A917_A10951Vts_Rgto, T01A917_A10956Vts_Linef, T01A917_A10957Vts_Prodf, T01A917_n10957Vts_Prodf, T01A917_A10958Vts_Comenf, T01A917_n10958Vts_Comenf, T01A917_A10959Vts_Concf, T01A917_n10959Vts_Concf,
            T01A917_A10960Vts_Cantf, T01A917_n10960Vts_Cantf, T01A917_A10961Vts_undf, T01A917_n10961Vts_undf, T01A917_A10962Vts_Exisf, T01A917_n10962Vts_Exisf, T01A917_A11174Vts_Nord, T01A917_n11174Vts_Nord, T01A917_A11175Vts_Tnq, T01A917_n11175Vts_Tnq,
            T01A917_A11176Vts_Any, T01A917_n11176Vts_Any
            }
            , new Object[] {
            T01A918_A396EmprCod, T01A918_A10940Vts_Nbarca, T01A918_A10951Vts_Rgto, T01A918_A10956Vts_Linef
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01A922_A396EmprCod, T01A922_A10940Vts_Nbarca, T01A922_A10951Vts_Rgto, T01A922_A10956Vts_Linef
            }
            , new Object[] {
            T01A923_A407EmprNom, T01A923_n407EmprNom
            }
            , new Object[] {
            T01A924_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TVTS002" ;
   }

   private byte Z10961Vts_undf ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A10961Vts_undf ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z10956Vts_Linef ;
   private short Z11174Vts_Nord ;
   private short Z11175Vts_Tnq ;
   private short Z11176Vts_Any ;
   private short nRcdDeleted_1463 ;
   private short nRcdExists_1463 ;
   private short nIsMod_1463 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1463 ;
   private short RcdFound1463 ;
   private short nBlankRcdUsr1463 ;
   private short A10956Vts_Linef ;
   private short A11174Vts_Nord ;
   private short A11175Vts_Tnq ;
   private short A11176Vts_Any ;
   private short RcdFound1462 ;
   private short nIsDirty_1462 ;
   private short nIsDirty_1463 ;
   private int nRC_GXsfl_65 ;
   private int nGXsfl_65_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtVts_Nbarca_Enabled ;
   private int edtVts_Rgto_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtVts_maqf_Enabled ;
   private int edtVts_FecI_Enabled ;
   private int edtVts_HorI_Enabled ;
   private int edtVts_FecF_Enabled ;
   private int edtVts_HorF_Enabled ;
   private int edtavnRcdDeleted_1463_Enabled ;
   private int edtVts_Linef_Enabled ;
   private int edtVts_Prodf_Enabled ;
   private int edtVts_Comenf_Enabled ;
   private int edtVts_Concf_Enabled ;
   private int edtVts_Cantf_Enabled ;
   private int edtVts_undf_Enabled ;
   private int edtVts_Exisf_Enabled ;
   private int edtVts_Nord_Enabled ;
   private int edtVts_Tnq_Enabled ;
   private int edtVts_Any_Enabled ;
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
   private int defedtVts_Linef_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtVts_HorF_Backcolor ;
   private int edtVts_FecF_Backcolor ;
   private int edtVts_HorI_Backcolor ;
   private int edtVts_FecI_Backcolor ;
   private int edtVts_maqf_Backcolor ;
   private int edtVts_Rgto_Backcolor ;
   private int edtVts_Nbarca_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z10959Vts_Concf ;
   private java.math.BigDecimal Z10960Vts_Cantf ;
   private java.math.BigDecimal Z10962Vts_Exisf ;
   private java.math.BigDecimal A10959Vts_Concf ;
   private java.math.BigDecimal A10960Vts_Cantf ;
   private java.math.BigDecimal A10962Vts_Exisf ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z10940Vts_Nbarca ;
   private String Z10951Vts_Rgto ;
   private String Z10963Vts_maqf ;
   private String Z10957Vts_Prodf ;
   private String Z10958Vts_Comenf ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A10940Vts_Nbarca ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtVts_Nbarca_Internalname ;
   private String sGXsfl_65_idx="0001" ;
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
   private String edtVts_Nbarca_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtVts_Rgto_Internalname ;
   private String A10951Vts_Rgto ;
   private String edtVts_Rgto_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtVts_maqf_Internalname ;
   private String A10963Vts_maqf ;
   private String edtVts_maqf_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtVts_FecI_Internalname ;
   private String edtVts_FecI_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtVts_HorI_Internalname ;
   private String edtVts_HorI_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtVts_FecF_Internalname ;
   private String edtVts_FecF_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtVts_HorF_Internalname ;
   private String edtVts_HorF_Jsonclick ;
   private String sMode1463 ;
   private String edtavnRcdDeleted_1463_Internalname ;
   private String edtVts_Linef_Internalname ;
   private String edtVts_Prodf_Internalname ;
   private String edtVts_Comenf_Internalname ;
   private String edtVts_Concf_Internalname ;
   private String edtVts_Cantf_Internalname ;
   private String edtVts_undf_Internalname ;
   private String edtVts_Exisf_Internalname ;
   private String edtVts_Nord_Internalname ;
   private String edtVts_Tnq_Internalname ;
   private String edtVts_Any_Internalname ;
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
   private String sMode1462 ;
   private String GXCCtl ;
   private String A10957Vts_Prodf ;
   private String A10958Vts_Comenf ;
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
   private String sGXsfl_65_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1463_Jsonclick ;
   private String edtVts_Linef_Jsonclick ;
   private String edtVts_Prodf_Jsonclick ;
   private String edtVts_Comenf_Jsonclick ;
   private String edtVts_Concf_Jsonclick ;
   private String edtVts_Cantf_Jsonclick ;
   private String edtVts_undf_Jsonclick ;
   private String edtVts_Exisf_Jsonclick ;
   private String edtVts_Nord_Jsonclick ;
   private String edtVts_Tnq_Jsonclick ;
   private String edtVts_Any_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ10940Vts_Nbarca ;
   private String ZZ10951Vts_Rgto ;
   private String ZZ407EmprNom ;
   private String ZZ10963Vts_maqf ;
   private java.util.Date Z10953Vts_HorI ;
   private java.util.Date Z10955Vts_HorF ;
   private java.util.Date A10953Vts_HorI ;
   private java.util.Date A10955Vts_HorF ;
   private java.util.Date ZZ10953Vts_HorI ;
   private java.util.Date ZZ10955Vts_HorF ;
   private java.util.Date Z10952Vts_FecI ;
   private java.util.Date Z10954Vts_FecF ;
   private java.util.Date A10952Vts_FecI ;
   private java.util.Date A10954Vts_FecF ;
   private java.util.Date ZZ10952Vts_FecI ;
   private java.util.Date ZZ10954Vts_FecF ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_65_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n10963Vts_maqf ;
   private boolean n10952Vts_FecI ;
   private boolean n10953Vts_HorI ;
   private boolean n10954Vts_FecF ;
   private boolean n10955Vts_HorF ;
   private boolean returnInSub ;
   private boolean n10957Vts_Prodf ;
   private boolean n10958Vts_Comenf ;
   private boolean n10959Vts_Concf ;
   private boolean n10960Vts_Cantf ;
   private boolean n10961Vts_undf ;
   private boolean n10962Vts_Exisf ;
   private boolean n11174Vts_Nord ;
   private boolean n11175Vts_Tnq ;
   private boolean n11176Vts_Any ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01A96_A407EmprNom ;
   private boolean[] T01A96_n407EmprNom ;
   private String[] T01A98_A10951Vts_Rgto ;
   private String[] T01A98_A407EmprNom ;
   private boolean[] T01A98_n407EmprNom ;
   private String[] T01A98_A10963Vts_maqf ;
   private boolean[] T01A98_n10963Vts_maqf ;
   private java.util.Date[] T01A98_A10952Vts_FecI ;
   private boolean[] T01A98_n10952Vts_FecI ;
   private java.util.Date[] T01A98_A10953Vts_HorI ;
   private boolean[] T01A98_n10953Vts_HorI ;
   private java.util.Date[] T01A98_A10954Vts_FecF ;
   private boolean[] T01A98_n10954Vts_FecF ;
   private java.util.Date[] T01A98_A10955Vts_HorF ;
   private boolean[] T01A98_n10955Vts_HorF ;
   private String[] T01A98_A396EmprCod ;
   private String[] T01A98_A10940Vts_Nbarca ;
   private String[] T01A97_A396EmprCod ;
   private String[] T01A99_A396EmprCod ;
   private String[] T01A910_A396EmprCod ;
   private String[] T01A910_A10940Vts_Nbarca ;
   private String[] T01A910_A10951Vts_Rgto ;
   private String[] T01A95_A10951Vts_Rgto ;
   private String[] T01A95_A10963Vts_maqf ;
   private boolean[] T01A95_n10963Vts_maqf ;
   private java.util.Date[] T01A95_A10952Vts_FecI ;
   private boolean[] T01A95_n10952Vts_FecI ;
   private java.util.Date[] T01A95_A10953Vts_HorI ;
   private boolean[] T01A95_n10953Vts_HorI ;
   private java.util.Date[] T01A95_A10954Vts_FecF ;
   private boolean[] T01A95_n10954Vts_FecF ;
   private java.util.Date[] T01A95_A10955Vts_HorF ;
   private boolean[] T01A95_n10955Vts_HorF ;
   private String[] T01A95_A396EmprCod ;
   private String[] T01A95_A10940Vts_Nbarca ;
   private String[] T01A911_A396EmprCod ;
   private String[] T01A911_A10940Vts_Nbarca ;
   private String[] T01A911_A10951Vts_Rgto ;
   private String[] T01A912_A396EmprCod ;
   private String[] T01A912_A10940Vts_Nbarca ;
   private String[] T01A912_A10951Vts_Rgto ;
   private String[] T01A94_A10951Vts_Rgto ;
   private String[] T01A94_A10963Vts_maqf ;
   private boolean[] T01A94_n10963Vts_maqf ;
   private java.util.Date[] T01A94_A10952Vts_FecI ;
   private boolean[] T01A94_n10952Vts_FecI ;
   private java.util.Date[] T01A94_A10953Vts_HorI ;
   private boolean[] T01A94_n10953Vts_HorI ;
   private java.util.Date[] T01A94_A10954Vts_FecF ;
   private boolean[] T01A94_n10954Vts_FecF ;
   private java.util.Date[] T01A94_A10955Vts_HorF ;
   private boolean[] T01A94_n10955Vts_HorF ;
   private String[] T01A94_A396EmprCod ;
   private String[] T01A94_A10940Vts_Nbarca ;
   private String[] T01A916_A396EmprCod ;
   private String[] T01A916_A10940Vts_Nbarca ;
   private String[] T01A916_A10951Vts_Rgto ;
   private String[] T01A917_A396EmprCod ;
   private String[] T01A917_A10940Vts_Nbarca ;
   private String[] T01A917_A10951Vts_Rgto ;
   private short[] T01A917_A10956Vts_Linef ;
   private String[] T01A917_A10957Vts_Prodf ;
   private boolean[] T01A917_n10957Vts_Prodf ;
   private String[] T01A917_A10958Vts_Comenf ;
   private boolean[] T01A917_n10958Vts_Comenf ;
   private java.math.BigDecimal[] T01A917_A10959Vts_Concf ;
   private boolean[] T01A917_n10959Vts_Concf ;
   private java.math.BigDecimal[] T01A917_A10960Vts_Cantf ;
   private boolean[] T01A917_n10960Vts_Cantf ;
   private byte[] T01A917_A10961Vts_undf ;
   private boolean[] T01A917_n10961Vts_undf ;
   private java.math.BigDecimal[] T01A917_A10962Vts_Exisf ;
   private boolean[] T01A917_n10962Vts_Exisf ;
   private short[] T01A917_A11174Vts_Nord ;
   private boolean[] T01A917_n11174Vts_Nord ;
   private short[] T01A917_A11175Vts_Tnq ;
   private boolean[] T01A917_n11175Vts_Tnq ;
   private short[] T01A917_A11176Vts_Any ;
   private boolean[] T01A917_n11176Vts_Any ;
   private String[] T01A918_A396EmprCod ;
   private String[] T01A918_A10940Vts_Nbarca ;
   private String[] T01A918_A10951Vts_Rgto ;
   private short[] T01A918_A10956Vts_Linef ;
   private String[] T01A93_A396EmprCod ;
   private String[] T01A93_A10940Vts_Nbarca ;
   private String[] T01A93_A10951Vts_Rgto ;
   private short[] T01A93_A10956Vts_Linef ;
   private String[] T01A93_A10957Vts_Prodf ;
   private boolean[] T01A93_n10957Vts_Prodf ;
   private String[] T01A93_A10958Vts_Comenf ;
   private boolean[] T01A93_n10958Vts_Comenf ;
   private java.math.BigDecimal[] T01A93_A10959Vts_Concf ;
   private boolean[] T01A93_n10959Vts_Concf ;
   private java.math.BigDecimal[] T01A93_A10960Vts_Cantf ;
   private boolean[] T01A93_n10960Vts_Cantf ;
   private byte[] T01A93_A10961Vts_undf ;
   private boolean[] T01A93_n10961Vts_undf ;
   private java.math.BigDecimal[] T01A93_A10962Vts_Exisf ;
   private boolean[] T01A93_n10962Vts_Exisf ;
   private short[] T01A93_A11174Vts_Nord ;
   private boolean[] T01A93_n11174Vts_Nord ;
   private short[] T01A93_A11175Vts_Tnq ;
   private boolean[] T01A93_n11175Vts_Tnq ;
   private short[] T01A93_A11176Vts_Any ;
   private boolean[] T01A93_n11176Vts_Any ;
   private String[] T01A92_A396EmprCod ;
   private String[] T01A92_A10940Vts_Nbarca ;
   private String[] T01A92_A10951Vts_Rgto ;
   private short[] T01A92_A10956Vts_Linef ;
   private String[] T01A92_A10957Vts_Prodf ;
   private boolean[] T01A92_n10957Vts_Prodf ;
   private String[] T01A92_A10958Vts_Comenf ;
   private boolean[] T01A92_n10958Vts_Comenf ;
   private java.math.BigDecimal[] T01A92_A10959Vts_Concf ;
   private boolean[] T01A92_n10959Vts_Concf ;
   private java.math.BigDecimal[] T01A92_A10960Vts_Cantf ;
   private boolean[] T01A92_n10960Vts_Cantf ;
   private byte[] T01A92_A10961Vts_undf ;
   private boolean[] T01A92_n10961Vts_undf ;
   private java.math.BigDecimal[] T01A92_A10962Vts_Exisf ;
   private boolean[] T01A92_n10962Vts_Exisf ;
   private short[] T01A92_A11174Vts_Nord ;
   private boolean[] T01A92_n11174Vts_Nord ;
   private short[] T01A92_A11175Vts_Tnq ;
   private boolean[] T01A92_n11175Vts_Tnq ;
   private short[] T01A92_A11176Vts_Any ;
   private boolean[] T01A92_n11176Vts_Any ;
   private String[] T01A922_A396EmprCod ;
   private String[] T01A922_A10940Vts_Nbarca ;
   private String[] T01A922_A10951Vts_Rgto ;
   private short[] T01A922_A10956Vts_Linef ;
   private String[] T01A923_A407EmprNom ;
   private boolean[] T01A923_n407EmprNom ;
   private String[] T01A924_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tvts002__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvts002__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvts002__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvts002__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvts002__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01A92", "SELECT EmprCod, Vts_Nbarca, Vts_Rgto, Vts_Linef, Vts_Prodf, Vts_Comenf, Vts_Concf, Vts_Cantf, Vts_undf, Vts_Exisf, Vts_Nord, Vts_Tnq, Vts_Any FROM TXPVTS003 WHERE EmprCod = ? AND Vts_Nbarca = ? AND Vts_Rgto = ? AND Vts_Linef = ?  FOR UPDATE OF Vts_Prodf, Vts_Comenf, Vts_Concf, Vts_Cantf, Vts_undf, Vts_Exisf, Vts_Nord, Vts_Tnq, Vts_Any NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01A93", "SELECT EmprCod, Vts_Nbarca, Vts_Rgto, Vts_Linef, Vts_Prodf, Vts_Comenf, Vts_Concf, Vts_Cantf, Vts_undf, Vts_Exisf, Vts_Nord, Vts_Tnq, Vts_Any FROM TXPVTS003 WHERE EmprCod = ? AND Vts_Nbarca = ? AND Vts_Rgto = ? AND Vts_Linef = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01A94", "SELECT Vts_Rgto, Vts_maqf, Vts_FecI, Vts_HorI, Vts_FecF, Vts_HorF, EmprCod, Vts_Nbarca FROM TXPVTS002 WHERE EmprCod = ? AND Vts_Nbarca = ? AND Vts_Rgto = ?  FOR UPDATE OF Vts_maqf, Vts_FecI, Vts_HorI, Vts_FecF, Vts_HorF NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01A95", "SELECT Vts_Rgto, Vts_maqf, Vts_FecI, Vts_HorI, Vts_FecF, Vts_HorF, EmprCod, Vts_Nbarca FROM TXPVTS002 WHERE EmprCod = ? AND Vts_Nbarca = ? AND Vts_Rgto = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01A96", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01A97", "SELECT EmprCod FROM TXPVTS000 WHERE EmprCod = ? AND Vts_Nbarca = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01A98", "SELECT /*+ FIRST_ROWS(100) */ TM1.Vts_Rgto, T2.EmprNom, TM1.Vts_maqf, TM1.Vts_FecI, TM1.Vts_HorI, TM1.Vts_FecF, TM1.Vts_HorF, TM1.EmprCod, TM1.Vts_Nbarca FROM (TXPVTS002 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Vts_Nbarca = ? and TM1.Vts_Rgto = ? ORDER BY TM1.EmprCod, TM1.Vts_Nbarca, TM1.Vts_Rgto ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01A99", "SELECT EmprCod FROM TXPVTS000 WHERE EmprCod = ? AND Vts_Nbarca = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01A910", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Vts_Nbarca, Vts_Rgto FROM TXPVTS002 WHERE EmprCod = ? AND Vts_Nbarca = ? AND Vts_Rgto = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01A911", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Vts_Nbarca, Vts_Rgto FROM TXPVTS002 WHERE ( Vts_Nbarca > ? or Vts_Nbarca = ? and Vts_Rgto > ?) and EmprCod = ? ORDER BY EmprCod, Vts_Nbarca, Vts_Rgto) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01A912", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Vts_Nbarca, Vts_Rgto FROM TXPVTS002 WHERE ( Vts_Nbarca < ? or Vts_Nbarca = ? and Vts_Rgto < ?) and EmprCod = ? ORDER BY EmprCod DESC, Vts_Nbarca DESC, Vts_Rgto DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01A913", "INSERT INTO TXPVTS002(Vts_Rgto, Vts_maqf, Vts_FecI, Vts_HorI, Vts_FecF, Vts_HorF, EmprCod, Vts_Nbarca) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPVTS002")
         ,new UpdateCursor("T01A914", "UPDATE TXPVTS002 SET Vts_maqf=?, Vts_FecI=?, Vts_HorI=?, Vts_FecF=?, Vts_HorF=?  WHERE EmprCod = ? AND Vts_Nbarca = ? AND Vts_Rgto = ?", GX_NOMASK, "TXPVTS002")
         ,new UpdateCursor("T01A915", "DELETE FROM TXPVTS002  WHERE EmprCod = ? AND Vts_Nbarca = ? AND Vts_Rgto = ?", GX_NOMASK, "TXPVTS002")
         ,new ForEachCursor("T01A916", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Vts_Nbarca, Vts_Rgto FROM TXPVTS002 WHERE EmprCod = ? ORDER BY EmprCod, Vts_Nbarca, Vts_Rgto ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01A917", "SELECT EmprCod, Vts_Nbarca, Vts_Rgto, Vts_Linef, Vts_Prodf, Vts_Comenf, Vts_Concf, Vts_Cantf, Vts_undf, Vts_Exisf, Vts_Nord, Vts_Tnq, Vts_Any FROM TXPVTS003 WHERE EmprCod = ? and Vts_Nbarca = ? and Vts_Rgto = ? and Vts_Linef = ? ORDER BY EmprCod, Vts_Nbarca, Vts_Rgto, Vts_Linef ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01A918", "SELECT EmprCod, Vts_Nbarca, Vts_Rgto, Vts_Linef FROM TXPVTS003 WHERE EmprCod = ? AND Vts_Nbarca = ? AND Vts_Rgto = ? AND Vts_Linef = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01A919", "INSERT INTO TXPVTS003(EmprCod, Vts_Nbarca, Vts_Rgto, Vts_Linef, Vts_Prodf, Vts_Comenf, Vts_Concf, Vts_Cantf, Vts_undf, Vts_Exisf, Vts_Nord, Vts_Tnq, Vts_Any) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPVTS003")
         ,new UpdateCursor("T01A920", "UPDATE TXPVTS003 SET Vts_Prodf=?, Vts_Comenf=?, Vts_Concf=?, Vts_Cantf=?, Vts_undf=?, Vts_Exisf=?, Vts_Nord=?, Vts_Tnq=?, Vts_Any=?  WHERE EmprCod = ? AND Vts_Nbarca = ? AND Vts_Rgto = ? AND Vts_Linef = ?", GX_NOMASK, "TXPVTS003")
         ,new UpdateCursor("T01A921", "DELETE FROM TXPVTS003  WHERE EmprCod = ? AND Vts_Nbarca = ? AND Vts_Rgto = ? AND Vts_Linef = ?", GX_NOMASK, "TXPVTS003")
         ,new ForEachCursor("T01A922", "SELECT EmprCod, Vts_Nbarca, Vts_Rgto, Vts_Linef FROM TXPVTS003 WHERE EmprCod = ? and Vts_Nbarca = ? and Vts_Rgto = ? ORDER BY EmprCod, Vts_Nbarca, Vts_Rgto, Vts_Linef ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01A923", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01A924", "SELECT EmprCod FROM TXPVTS000 WHERE EmprCod = ? AND Vts_Nbarca = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 45);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 45);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((String[]) buf[12])[0] = rslt.getString(8, 10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((String[]) buf[12])[0] = rslt.getString(8, 10);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((String[]) buf[14])[0] = rslt.getString(9, 10);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 45);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 6);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[4]);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[6], false);
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
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[10], false);
               }
               stmt.setString(7, (String)parms[11], 3);
               stmt.setString(8, (String)parms[12], 10);
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], false);
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
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[9], false);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setString(7, (String)parms[11], 10);
               stmt.setString(8, (String)parms[12], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 15);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 45);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 5);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[11], 5);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[15], 5);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[21]).shortValue());
               }
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 15);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 45);
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
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
               stmt.setString(10, (String)parms[18], 3);
               stmt.setString(11, (String)parms[19], 10);
               stmt.setString(12, (String)parms[20], 6);
               stmt.setShort(13, ((Number) parms[21]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
      }
   }

}

