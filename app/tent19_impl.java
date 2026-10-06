package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tent19_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8770TipDocC = (short)(GXutil.lval( httpContext.GetPar( "TipDocC"))) ;
         n8770TipDocC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8770TipDocC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8770TipDocC), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A8770TipDocC) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8692NEnt19 = (int)(GXutil.lval( httpContext.GetPar( "NEnt19"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8692NEnt19", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8692NEnt19), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A8692NEnt19) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ENTRADAS EN LA 19", ""), (short)(0)) ;
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
      nRC_GXsfl_135 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_135"))) ;
      nGXsfl_135_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_135_idx"))) ;
      sGXsfl_135_idx = httpContext.GetPar( "sGXsfl_135_idx") ;
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

   public tent19_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tent19_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tent19_impl.class ));
   }

   public tent19_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENT19.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENT19.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENT19.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENT19.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TENT19.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nº Entrada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNEnt19_Internalname, GXutil.ltrim( localUtil.ntoc( A8692NEnt19, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNEnt19_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8692NEnt19), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8692NEnt19), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNEnt19_Jsonclick, 0, "", "", "", "", "", 1, edtNEnt19_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENT19.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Fecha-Hora Entrada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtFEnt19_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFEnt19_Internalname, localUtil.ttoc( A8693FEnt19, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A8693FEnt19, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFEnt19_Jsonclick, 0, "", "", "", "", "", 1, edtFEnt19_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENT19.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtFEnt19_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtFEnt19_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TENT19.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nº Interno", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNInt19_Internalname, GXutil.rtrim( A8694NInt19), GXutil.rtrim( localUtil.format( A8694NInt19, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNInt19_Jsonclick, 0, "", "", "", "", "", 1, edtNInt19_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Pedido", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNPed19_Internalname, GXutil.rtrim( A8695NPed19), GXutil.rtrim( localUtil.format( A8695NPed19, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNPed19_Jsonclick, 0, "", "", "", "", "", 1, edtNPed19_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Total Kgs", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTkgr_Internalname, GXutil.ltrim( localUtil.ntoc( A8704Tkgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTkgr_Enabled!=0) ? localUtil.format( A8704Tkgr, "ZZZZZ9.99") : localUtil.format( A8704Tkgr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTkgr_Jsonclick, 0, "", "", "", "", "", 1, edtTkgr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Total Mts", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTmts_Internalname, GXutil.ltrim( localUtil.ntoc( A8702Tmts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTmts_Enabled!=0) ? localUtil.format( A8702Tmts, "ZZZZZ9.99") : localUtil.format( A8702Tmts, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTmts_Jsonclick, 0, "", "", "", "", "", 1, edtTmts_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Total Pzas", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTpzs_Internalname, GXutil.ltrim( localUtil.ntoc( A8703Tpzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTpzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8703Tpzs), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8703Tpzs), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpzs_Jsonclick, 0, "", "", "", "", "", 1, edtTpzs_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "RecepcionAlbrec", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A8705NRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNRecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8705NRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8705NRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNRecCod_Jsonclick, 0, "", "", "", "", "", 1, edtNRecCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNestado_Internalname, GXutil.ltrim( localUtil.ntoc( A8706Nestado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNestado_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8706Nestado), "9") : localUtil.format( DecimalUtil.doubleToDec(A8706Nestado), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNestado_Jsonclick, 0, "", "", "", "", "", 1, edtNestado_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Usuario", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNUsucod_Internalname, GXutil.rtrim( A8708NUsucod), GXutil.rtrim( localUtil.format( A8708NUsucod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNUsucod_Jsonclick, 0, "", "", "", "", "", 1, edtNUsucod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtNObs_Internalname, GXutil.rtrim( A8709NObs), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", (short)(0), 1, edtNObs_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "UsuarioModifca", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNUsuMod_Internalname, GXutil.rtrim( A8710NUsuMod), GXutil.rtrim( localUtil.format( A8710NUsuMod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNUsuMod_Jsonclick, 0, "", "", "", "", "", 1, edtNUsuMod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "NFecNota", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtNFecNota_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNFecNota_Internalname, localUtil.ttoc( A8711NFecNota, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A8711NFecNota, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNFecNota_Jsonclick, 0, "", "", "", "", "", 1, edtNFecNota_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENT19.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtNFecNota_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtNFecNota_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TENT19.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod19_Internalname, GXutil.ltrim( localUtil.ntoc( A8841CliCod19, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod19_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8841CliCod19), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8841CliCod19), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod19_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod19_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom19_Internalname, GXutil.rtrim( A8842CliNom19), GXutil.rtrim( localUtil.format( A8842CliNom19, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom19_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom19_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Tipo Documento", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipDocC_Internalname, GXutil.ltrim( localUtil.ntoc( A8770TipDocC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipDocC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8770TipDocC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8770TipDocC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDocC_Jsonclick, 0, "", "", "", "", "", 1, edtTipDocC_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Descripcion Documento", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipDocD_Internalname, GXutil.rtrim( A8771TipDocD), GXutil.rtrim( localUtil.format( A8771TipDocD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDocD_Jsonclick, 0, "", "", "", "", "", 1, edtTipDocD_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Articulo", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt19_Internalname, GXutil.rtrim( A8772Art19), GXutil.rtrim( localUtil.format( A8772Art19, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt19_Jsonclick, 0, "", "", "", "", "", 1, edtArt19_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Dibujo", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibC19_Internalname, GXutil.rtrim( A8773DibC19), GXutil.rtrim( localUtil.format( A8773DibC19, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibC19_Jsonclick, 0, "", "", "", "", "", 1, edtDibC19_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Rendimiento", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArt19Rd_Internalname, GXutil.ltrim( localUtil.ntoc( A8843Art19Rd, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtArt19Rd_Enabled!=0) ? localUtil.format( A8843Art19Rd, "ZZ9.99") : localUtil.format( A8843Art19Rd, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArt19Rd_Jsonclick, 0, "", "", "", "", "", 1, edtArt19Rd_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Unidad K o M", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtUnid19_Internalname, GXutil.rtrim( A8847Unid19), GXutil.rtrim( localUtil.format( A8847Unid19, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUnid19_Jsonclick, 0, "", "", "", "", "", 1, edtUnid19_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENT19.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol135( ) ;
      nGXsfl_135_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1189 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1189 = (short)(1) ;
            scanStart12M1189( ) ;
            while ( RcdFound1189 != 0 )
            {
               init_level_properties1189( ) ;
               getByPrimaryKey12M1189( ) ;
               addRow12M1189( ) ;
               scanNext12M1189( ) ;
            }
            scanEnd12M1189( ) ;
            nBlankRcdCount1189 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B8702Tmts = A8702Tmts ;
         httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
         B8703Tpzs = A8703Tpzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
         B8704Tkgr = A8704Tkgr ;
         httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
         standaloneNotModal12M1189( ) ;
         standaloneModal12M1189( ) ;
         sMode1189 = Gx_mode ;
         while ( nGXsfl_135_idx < nRC_GXsfl_135 )
         {
            bGXsfl_135_Refreshing = true ;
            readRow12M1189( ) ;
            edtavnRcdDeleted_1189_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1189_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1189_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1189_Enabled), 5, 0), !bGXsfl_135_Refreshing);
            edtCodPz19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CODPZ19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCodPz19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodPz19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
            edtKgs19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "KGS19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtKgs19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKgs19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
            edtMts19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MTS19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMts19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMts19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
            edtDib19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIB19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDib19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDib19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
            edtOT19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OT19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOT19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOT19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
            edtCol19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COL19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCol19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCol19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
            edtColN19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLN19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtColN19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColN19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
            edtCodC19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CODC19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCodC19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodC19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
            edtNomC19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NOMC19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtNomC19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNomC19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
            edtTel19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TEL19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTel19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTel19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
            edtTura19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TURA19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTura19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTura19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
            edtTurb19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TURB19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTurb19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTurb19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
            edtTurc19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TURC19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTurc19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTurc19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
            edtColNN19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLNN19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtColNN19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNN19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
            if ( ( nRcdExists_1189 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal12M1189( ) ;
            }
            sendRow12M1189( ) ;
            bGXsfl_135_Refreshing = false ;
         }
         Gx_mode = sMode1189 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A8702Tmts = B8702Tmts ;
         httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
         A8703Tpzs = B8703Tpzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
         A8704Tkgr = B8704Tkgr ;
         httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1189 = (short)(5) ;
         nRcdExists_1189 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart12M1189( ) ;
            while ( RcdFound1189 != 0 )
            {
               sGXsfl_135_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_135_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1351189( ) ;
               init_level_properties1189( ) ;
               standaloneNotModal12M1189( ) ;
               getByPrimaryKey12M1189( ) ;
               standaloneModal12M1189( ) ;
               addRow12M1189( ) ;
               scanNext12M1189( ) ;
            }
            scanEnd12M1189( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1189 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_135_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_135_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_1351189( ) ;
      initAll12M1189( ) ;
      init_level_properties1189( ) ;
      B8702Tmts = A8702Tmts ;
      httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
      B8703Tpzs = A8703Tpzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
      B8704Tkgr = A8704Tkgr ;
      httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
      nRcdExists_1189 = (short)(0) ;
      nIsMod_1189 = (short)(0) ;
      nRcdDeleted_1189 = (short)(0) ;
      nBlankRcdCount1189 = (short)(nBlankRcdUsr1189+nBlankRcdCount1189) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1189 > 0 )
      {
         standaloneNotModal12M1189( ) ;
         standaloneModal12M1189( ) ;
         addRow12M1189( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCodPz19_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1189 = (short)(nBlankRcdCount1189-1) ;
      }
      Gx_mode = sMode1189 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A8702Tmts = B8702Tmts ;
      httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
      A8703Tpzs = B8703Tpzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
      A8704Tkgr = B8704Tkgr ;
      httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENT19.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENT19.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 155,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENT19.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENT19.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 157,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TENT19.htm");
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
         Z8692NEnt19 = (int)(localUtil.ctol( httpContext.cgiGet( "Z8692NEnt19"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8693FEnt19 = localUtil.ctot( httpContext.cgiGet( "Z8693FEnt19"), 0) ;
         Z8694NInt19 = httpContext.cgiGet( "Z8694NInt19") ;
         Z8695NPed19 = httpContext.cgiGet( "Z8695NPed19") ;
         Z8705NRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z8705NRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8706Nestado = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8706Nestado"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8708NUsucod = httpContext.cgiGet( "Z8708NUsucod") ;
         Z8709NObs = httpContext.cgiGet( "Z8709NObs") ;
         Z8710NUsuMod = httpContext.cgiGet( "Z8710NUsuMod") ;
         Z8711NFecNota = localUtil.ctot( httpContext.cgiGet( "Z8711NFecNota"), 0) ;
         Z8841CliCod19 = (int)(localUtil.ctol( httpContext.cgiGet( "Z8841CliCod19"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8842CliNom19 = httpContext.cgiGet( "Z8842CliNom19") ;
         Z8772Art19 = httpContext.cgiGet( "Z8772Art19") ;
         Z8773DibC19 = httpContext.cgiGet( "Z8773DibC19") ;
         Z8843Art19Rd = localUtil.ctond( httpContext.cgiGet( "Z8843Art19Rd")) ;
         Z8847Unid19 = httpContext.cgiGet( "Z8847Unid19") ;
         Z8770TipDocC = (short)(localUtil.ctol( httpContext.cgiGet( "Z8770TipDocC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O8702Tmts = localUtil.ctond( httpContext.cgiGet( "O8702Tmts")) ;
         O8703Tpzs = (int)(localUtil.ctol( httpContext.cgiGet( "O8703Tpzs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O8704Tkgr = localUtil.ctond( httpContext.cgiGet( "O8704Tkgr")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_135 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_135"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNEnt19_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNEnt19_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NENT19");
            AnyError = (short)(1) ;
            GX_FocusControl = edtNEnt19_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8692NEnt19 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A8692NEnt19", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8692NEnt19), 8, 0));
         }
         else
         {
            A8692NEnt19 = (int)(localUtil.ctol( httpContext.cgiGet( edtNEnt19_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8692NEnt19", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8692NEnt19), 8, 0));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtFEnt19_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "FENT19");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFEnt19_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8693FEnt19 = GXutil.resetTime( GXutil.nullDate() );
            n8693FEnt19 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8693FEnt19", localUtil.ttoc( A8693FEnt19, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A8693FEnt19 = localUtil.ctot( httpContext.cgiGet( edtFEnt19_Internalname)) ;
            n8693FEnt19 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8693FEnt19", localUtil.ttoc( A8693FEnt19, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A8694NInt19 = httpContext.cgiGet( edtNInt19_Internalname) ;
         n8694NInt19 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8694NInt19", A8694NInt19);
         A8695NPed19 = httpContext.cgiGet( edtNPed19_Internalname) ;
         n8695NPed19 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8695NPed19", A8695NPed19);
         A8704Tkgr = localUtil.ctond( httpContext.cgiGet( edtTkgr_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
         A8702Tmts = localUtil.ctond( httpContext.cgiGet( edtTmts_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
         A8703Tpzs = (int)(localUtil.ctol( httpContext.cgiGet( edtTpzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NRECCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtNRecCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8705NRecCod = 0 ;
            n8705NRecCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8705NRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8705NRecCod), 8, 0));
         }
         else
         {
            A8705NRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtNRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8705NRecCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8705NRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8705NRecCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNestado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNestado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NESTADO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtNestado_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8706Nestado = (byte)(0) ;
            n8706Nestado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8706Nestado", GXutil.str( A8706Nestado, 1, 0));
         }
         else
         {
            A8706Nestado = (byte)(localUtil.ctol( httpContext.cgiGet( edtNestado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8706Nestado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8706Nestado", GXutil.str( A8706Nestado, 1, 0));
         }
         A8708NUsucod = GXutil.upper( httpContext.cgiGet( edtNUsucod_Internalname)) ;
         n8708NUsucod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8708NUsucod", A8708NUsucod);
         A8709NObs = httpContext.cgiGet( edtNObs_Internalname) ;
         n8709NObs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8709NObs", A8709NObs);
         A8710NUsuMod = GXutil.upper( httpContext.cgiGet( edtNUsuMod_Internalname)) ;
         n8710NUsuMod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8710NUsuMod", A8710NUsuMod);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtNFecNota_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "NFECNOTA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtNFecNota_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8711NFecNota = GXutil.resetTime( GXutil.nullDate() );
            n8711NFecNota = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8711NFecNota", localUtil.ttoc( A8711NFecNota, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A8711NFecNota = localUtil.ctot( httpContext.cgiGet( edtNFecNota_Internalname)) ;
            n8711NFecNota = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8711NFecNota", localUtil.ttoc( A8711NFecNota, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod19_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod19_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD19");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliCod19_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8841CliCod19 = 0 ;
            n8841CliCod19 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8841CliCod19", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8841CliCod19), 6, 0));
         }
         else
         {
            A8841CliCod19 = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod19_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8841CliCod19 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8841CliCod19", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8841CliCod19), 6, 0));
         }
         A8842CliNom19 = httpContext.cgiGet( edtCliNom19_Internalname) ;
         n8842CliNom19 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8842CliNom19", A8842CliNom19);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipDocC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipDocC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPDOCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipDocC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8770TipDocC = (short)(0) ;
            n8770TipDocC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8770TipDocC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8770TipDocC), 4, 0));
         }
         else
         {
            A8770TipDocC = (short)(localUtil.ctol( httpContext.cgiGet( edtTipDocC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8770TipDocC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8770TipDocC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8770TipDocC), 4, 0));
         }
         A8771TipDocD = httpContext.cgiGet( edtTipDocD_Internalname) ;
         n8771TipDocD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8771TipDocD", A8771TipDocD);
         A8772Art19 = httpContext.cgiGet( edtArt19_Internalname) ;
         n8772Art19 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8772Art19", A8772Art19);
         A8773DibC19 = httpContext.cgiGet( edtDibC19_Internalname) ;
         n8773DibC19 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8773DibC19", A8773DibC19);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtArt19Rd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtArt19Rd_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ART19RD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtArt19Rd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8843Art19Rd = DecimalUtil.ZERO ;
            n8843Art19Rd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8843Art19Rd", GXutil.ltrimstr( A8843Art19Rd, 6, 2));
         }
         else
         {
            A8843Art19Rd = localUtil.ctond( httpContext.cgiGet( edtArt19Rd_Internalname)) ;
            n8843Art19Rd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8843Art19Rd", GXutil.ltrimstr( A8843Art19Rd, 6, 2));
         }
         A8847Unid19 = httpContext.cgiGet( edtUnid19_Internalname) ;
         n8847Unid19 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8847Unid19", A8847Unid19);
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
            A8692NEnt19 = (int)(GXutil.lval( httpContext.GetPar( "NEnt19"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8692NEnt19", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8692NEnt19), 8, 0));
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
            initAll12M1188( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1189_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1189_Enabled), 5, 0), !bGXsfl_135_Refreshing);
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
      disableAttributes12M1188( ) ;
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

   public void confirm_12M0( )
   {
      beforeValidate12M1188( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls12M1188( ) ;
         }
         else
         {
            checkExtendedTable12M1188( ) ;
            if ( AnyError == 0 )
            {
               zm12M1188( 5) ;
               zm12M1188( 6) ;
               zm12M1188( 7) ;
            }
            closeExtendedTableCursors12M1188( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1188 = Gx_mode ;
         confirm_12M1189( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1188 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1188 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues12M0( ) ;
      }
   }

   public void confirm_12M1189( )
   {
      s8702Tmts = O8702Tmts ;
      httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
      s8703Tpzs = O8703Tpzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
      s8704Tkgr = O8704Tkgr ;
      httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
      nGXsfl_135_idx = 0 ;
      while ( nGXsfl_135_idx < nRC_GXsfl_135 )
      {
         readRow12M1189( ) ;
         if ( ( nRcdExists_1189 != 0 ) || ( nIsMod_1189 != 0 ) )
         {
            getKey12M1189( ) ;
            if ( ( nRcdExists_1189 == 0 ) && ( nRcdDeleted_1189 == 0 ) )
            {
               if ( RcdFound1189 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate12M1189( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable12M1189( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors12M1189( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O8702Tmts = A8702Tmts ;
                     httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
                     O8703Tpzs = A8703Tpzs ;
                     httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
                     O8704Tkgr = A8704Tkgr ;
                     httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
                  }
               }
               else
               {
                  GXCCtl = "CODPZ19_" + sGXsfl_135_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCodPz19_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1189 != 0 )
               {
                  if ( nRcdDeleted_1189 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey12M1189( ) ;
                     load12M1189( ) ;
                     beforeValidate12M1189( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls12M1189( ) ;
                        O8702Tmts = A8702Tmts ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
                        O8703Tpzs = A8703Tpzs ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
                        O8704Tkgr = A8704Tkgr ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1189 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate12M1189( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable12M1189( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors12M1189( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O8702Tmts = A8702Tmts ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
                           O8703Tpzs = A8703Tpzs ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
                           O8704Tkgr = A8704Tkgr ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1189 == 0 )
                  {
                     GXCCtl = "CODPZ19_" + sGXsfl_135_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCodPz19_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1189_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1189, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCodPz19_Internalname, GXutil.rtrim( A8696CodPz19)) ;
         httpContext.changePostValue( edtKgs19_Internalname, GXutil.ltrim( localUtil.ntoc( A8697Kgs19, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMts19_Internalname, GXutil.ltrim( localUtil.ntoc( A8698Mts19, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDib19_Internalname, GXutil.rtrim( A8699Dib19)) ;
         httpContext.changePostValue( edtOT19_Internalname, GXutil.rtrim( A8700OT19)) ;
         httpContext.changePostValue( edtCol19_Internalname, GXutil.rtrim( A8701Col19)) ;
         httpContext.changePostValue( edtColN19_Internalname, GXutil.rtrim( A8844ColN19)) ;
         httpContext.changePostValue( edtCodC19_Internalname, GXutil.rtrim( A8845CodC19)) ;
         httpContext.changePostValue( edtNomC19_Internalname, GXutil.rtrim( A8846NomC19)) ;
         httpContext.changePostValue( edtTel19_Internalname, GXutil.ltrim( localUtil.ntoc( A8849Tel19, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTura19_Internalname, GXutil.ltrim( localUtil.ntoc( A8850Tura19, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTurb19_Internalname, GXutil.ltrim( localUtil.ntoc( A8851Turb19, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTurc19_Internalname, GXutil.ltrim( localUtil.ntoc( A8852Turc19, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColNN19_Internalname, GXutil.rtrim( A8865ColNN19)) ;
         httpContext.changePostValue( "ZT_"+"Z8696CodPz19_"+sGXsfl_135_idx, GXutil.rtrim( Z8696CodPz19)) ;
         httpContext.changePostValue( "ZT_"+"Z8697Kgs19_"+sGXsfl_135_idx, GXutil.ltrim( localUtil.ntoc( Z8697Kgs19, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8698Mts19_"+sGXsfl_135_idx, GXutil.ltrim( localUtil.ntoc( Z8698Mts19, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8699Dib19_"+sGXsfl_135_idx, GXutil.rtrim( Z8699Dib19)) ;
         httpContext.changePostValue( "ZT_"+"Z8700OT19_"+sGXsfl_135_idx, GXutil.rtrim( Z8700OT19)) ;
         httpContext.changePostValue( "ZT_"+"Z8701Col19_"+sGXsfl_135_idx, GXutil.rtrim( Z8701Col19)) ;
         httpContext.changePostValue( "ZT_"+"Z8844ColN19_"+sGXsfl_135_idx, GXutil.rtrim( Z8844ColN19)) ;
         httpContext.changePostValue( "ZT_"+"Z8845CodC19_"+sGXsfl_135_idx, GXutil.rtrim( Z8845CodC19)) ;
         httpContext.changePostValue( "ZT_"+"Z8846NomC19_"+sGXsfl_135_idx, GXutil.rtrim( Z8846NomC19)) ;
         httpContext.changePostValue( "ZT_"+"Z8849Tel19_"+sGXsfl_135_idx, GXutil.ltrim( localUtil.ntoc( Z8849Tel19, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8850Tura19_"+sGXsfl_135_idx, GXutil.ltrim( localUtil.ntoc( Z8850Tura19, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8851Turb19_"+sGXsfl_135_idx, GXutil.ltrim( localUtil.ntoc( Z8851Turb19, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8852Turc19_"+sGXsfl_135_idx, GXutil.ltrim( localUtil.ntoc( Z8852Turc19, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8865ColNN19_"+sGXsfl_135_idx, GXutil.rtrim( Z8865ColNN19)) ;
         httpContext.changePostValue( "T8698Mts19_"+sGXsfl_135_idx, GXutil.ltrim( localUtil.ntoc( O8698Mts19, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T8697Kgs19_"+sGXsfl_135_idx, GXutil.ltrim( localUtil.ntoc( O8697Kgs19, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1189_"+sGXsfl_135_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1189, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1189_"+sGXsfl_135_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1189, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1189_"+sGXsfl_135_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1189, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1189 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1189_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1189_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CODPZ19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodPz19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "KGS19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtKgs19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MTS19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMts19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIB19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDib19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OT19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOT19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COL19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCol19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLN19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColN19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CODC19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodC19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NOMC19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNomC19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TEL19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTel19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TURA19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTura19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TURB19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTurb19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TURC19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTurc19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLNN19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNN19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O8702Tmts = s8702Tmts ;
      httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
      O8703Tpzs = s8703Tpzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
      O8704Tkgr = s8704Tkgr ;
      httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption12M0( )
   {
   }

   public void zm12M1188( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8693FEnt19 = T012M5_A8693FEnt19[0] ;
            Z8694NInt19 = T012M5_A8694NInt19[0] ;
            Z8695NPed19 = T012M5_A8695NPed19[0] ;
            Z8705NRecCod = T012M5_A8705NRecCod[0] ;
            Z8706Nestado = T012M5_A8706Nestado[0] ;
            Z8708NUsucod = T012M5_A8708NUsucod[0] ;
            Z8709NObs = T012M5_A8709NObs[0] ;
            Z8710NUsuMod = T012M5_A8710NUsuMod[0] ;
            Z8711NFecNota = T012M5_A8711NFecNota[0] ;
            Z8841CliCod19 = T012M5_A8841CliCod19[0] ;
            Z8842CliNom19 = T012M5_A8842CliNom19[0] ;
            Z8772Art19 = T012M5_A8772Art19[0] ;
            Z8773DibC19 = T012M5_A8773DibC19[0] ;
            Z8843Art19Rd = T012M5_A8843Art19Rd[0] ;
            Z8847Unid19 = T012M5_A8847Unid19[0] ;
            Z8770TipDocC = T012M5_A8770TipDocC[0] ;
         }
         else
         {
            Z8693FEnt19 = A8693FEnt19 ;
            Z8694NInt19 = A8694NInt19 ;
            Z8695NPed19 = A8695NPed19 ;
            Z8705NRecCod = A8705NRecCod ;
            Z8706Nestado = A8706Nestado ;
            Z8708NUsucod = A8708NUsucod ;
            Z8709NObs = A8709NObs ;
            Z8710NUsuMod = A8710NUsuMod ;
            Z8711NFecNota = A8711NFecNota ;
            Z8841CliCod19 = A8841CliCod19 ;
            Z8842CliNom19 = A8842CliNom19 ;
            Z8772Art19 = A8772Art19 ;
            Z8773DibC19 = A8773DibC19 ;
            Z8843Art19Rd = A8843Art19Rd ;
            Z8847Unid19 = A8847Unid19 ;
            Z8770TipDocC = A8770TipDocC ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z8692NEnt19 = A8692NEnt19 ;
         Z8693FEnt19 = A8693FEnt19 ;
         Z8694NInt19 = A8694NInt19 ;
         Z8695NPed19 = A8695NPed19 ;
         Z8705NRecCod = A8705NRecCod ;
         Z8706Nestado = A8706Nestado ;
         Z8708NUsucod = A8708NUsucod ;
         Z8709NObs = A8709NObs ;
         Z8710NUsuMod = A8710NUsuMod ;
         Z8711NFecNota = A8711NFecNota ;
         Z8841CliCod19 = A8841CliCod19 ;
         Z8842CliNom19 = A8842CliNom19 ;
         Z8772Art19 = A8772Art19 ;
         Z8773DibC19 = A8773DibC19 ;
         Z8843Art19Rd = A8843Art19Rd ;
         Z8847Unid19 = A8847Unid19 ;
         Z396EmprCod = A396EmprCod ;
         Z8770TipDocC = A8770TipDocC ;
         Z407EmprNom = A407EmprNom ;
         Z8704Tkgr = A8704Tkgr ;
         Z8702Tmts = A8702Tmts ;
         Z8703Tpzs = A8703Tpzs ;
         Z8771TipDocD = A8771TipDocD ;
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

   public void load12M1188( )
   {
      /* Using cursor T012M11 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A8692NEnt19)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1188 = (short)(1) ;
         A407EmprNom = T012M11_A407EmprNom[0] ;
         n407EmprNom = T012M11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A8693FEnt19 = T012M11_A8693FEnt19[0] ;
         n8693FEnt19 = T012M11_n8693FEnt19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8693FEnt19", localUtil.ttoc( A8693FEnt19, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8694NInt19 = T012M11_A8694NInt19[0] ;
         n8694NInt19 = T012M11_n8694NInt19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8694NInt19", A8694NInt19);
         A8695NPed19 = T012M11_A8695NPed19[0] ;
         n8695NPed19 = T012M11_n8695NPed19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8695NPed19", A8695NPed19);
         A8705NRecCod = T012M11_A8705NRecCod[0] ;
         n8705NRecCod = T012M11_n8705NRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8705NRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8705NRecCod), 8, 0));
         A8706Nestado = T012M11_A8706Nestado[0] ;
         n8706Nestado = T012M11_n8706Nestado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8706Nestado", GXutil.str( A8706Nestado, 1, 0));
         A8708NUsucod = T012M11_A8708NUsucod[0] ;
         n8708NUsucod = T012M11_n8708NUsucod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8708NUsucod", A8708NUsucod);
         A8709NObs = T012M11_A8709NObs[0] ;
         n8709NObs = T012M11_n8709NObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8709NObs", A8709NObs);
         A8710NUsuMod = T012M11_A8710NUsuMod[0] ;
         n8710NUsuMod = T012M11_n8710NUsuMod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8710NUsuMod", A8710NUsuMod);
         A8711NFecNota = T012M11_A8711NFecNota[0] ;
         n8711NFecNota = T012M11_n8711NFecNota[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8711NFecNota", localUtil.ttoc( A8711NFecNota, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8841CliCod19 = T012M11_A8841CliCod19[0] ;
         n8841CliCod19 = T012M11_n8841CliCod19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8841CliCod19", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8841CliCod19), 6, 0));
         A8842CliNom19 = T012M11_A8842CliNom19[0] ;
         n8842CliNom19 = T012M11_n8842CliNom19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8842CliNom19", A8842CliNom19);
         A8771TipDocD = T012M11_A8771TipDocD[0] ;
         n8771TipDocD = T012M11_n8771TipDocD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8771TipDocD", A8771TipDocD);
         A8772Art19 = T012M11_A8772Art19[0] ;
         n8772Art19 = T012M11_n8772Art19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8772Art19", A8772Art19);
         A8773DibC19 = T012M11_A8773DibC19[0] ;
         n8773DibC19 = T012M11_n8773DibC19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8773DibC19", A8773DibC19);
         A8843Art19Rd = T012M11_A8843Art19Rd[0] ;
         n8843Art19Rd = T012M11_n8843Art19Rd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8843Art19Rd", GXutil.ltrimstr( A8843Art19Rd, 6, 2));
         A8847Unid19 = T012M11_A8847Unid19[0] ;
         n8847Unid19 = T012M11_n8847Unid19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8847Unid19", A8847Unid19);
         A8770TipDocC = T012M11_A8770TipDocC[0] ;
         n8770TipDocC = T012M11_n8770TipDocC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8770TipDocC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8770TipDocC), 4, 0));
         A8704Tkgr = T012M11_A8704Tkgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
         A8702Tmts = T012M11_A8702Tmts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
         A8703Tpzs = T012M11_A8703Tpzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
         zm12M1188( -4) ;
      }
      pr_default.close(7);
      onLoadActions12M1188( ) ;
   }

   public void onLoadActions12M1188( )
   {
      O8702Tmts = A8702Tmts ;
      httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
      O8703Tpzs = A8703Tpzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
      O8704Tkgr = A8704Tkgr ;
      httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
   }

   public void checkExtendedTable12M1188( )
   {
      nIsDirty_1188 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T012M6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T012M6_A407EmprNom[0] ;
      n407EmprNom = T012M6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T012M7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n8770TipDocC), Short.valueOf(A8770TipDocC)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDOC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDOCC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8771TipDocD = T012M7_A8771TipDocD[0] ;
      n8771TipDocD = T012M7_n8771TipDocD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8771TipDocD", A8771TipDocD);
      pr_default.close(5);
      /* Using cursor T012M9 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A8692NEnt19)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A8704Tkgr = T012M9_A8704Tkgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
         A8702Tmts = T012M9_A8702Tmts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
         A8703Tpzs = T012M9_A8703Tpzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
      }
      else
      {
         nIsDirty_1188 = (short)(1) ;
         A8704Tkgr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
         nIsDirty_1188 = (short)(1) ;
         A8702Tmts = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
         nIsDirty_1188 = (short)(1) ;
         A8703Tpzs = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
      }
      pr_default.close(6);
   }

   public void closeExtendedTableCursors12M1188( )
   {
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_5( String A396EmprCod )
   {
      /* Using cursor T012M12 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T012M12_A407EmprNom[0] ;
      n407EmprNom = T012M12_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_6( String A396EmprCod ,
                         short A8770TipDocC )
   {
      /* Using cursor T012M13 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n8770TipDocC), Short.valueOf(A8770TipDocC)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDOC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDOCC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8771TipDocD = T012M13_A8771TipDocD[0] ;
      n8771TipDocD = T012M13_n8771TipDocD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8771TipDocD", A8771TipDocD);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8771TipDocD))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_7( String A396EmprCod ,
                         int A8692NEnt19 )
   {
      /* Using cursor T012M15 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A8692NEnt19)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A8704Tkgr = T012M15_A8704Tkgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
         A8702Tmts = T012M15_A8702Tmts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
         A8703Tpzs = T012M15_A8703Tpzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
      }
      else
      {
         A8704Tkgr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
         A8702Tmts = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
         A8703Tpzs = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8704Tkgr, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8702Tmts, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8703Tpzs, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey12M1188( )
   {
      /* Using cursor T012M16 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A8692NEnt19)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1188 = (short)(1) ;
      }
      else
      {
         RcdFound1188 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T012M5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A8692NEnt19)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm12M1188( 4) ;
         RcdFound1188 = (short)(1) ;
         A8692NEnt19 = T012M5_A8692NEnt19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8692NEnt19", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8692NEnt19), 8, 0));
         A8693FEnt19 = T012M5_A8693FEnt19[0] ;
         n8693FEnt19 = T012M5_n8693FEnt19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8693FEnt19", localUtil.ttoc( A8693FEnt19, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8694NInt19 = T012M5_A8694NInt19[0] ;
         n8694NInt19 = T012M5_n8694NInt19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8694NInt19", A8694NInt19);
         A8695NPed19 = T012M5_A8695NPed19[0] ;
         n8695NPed19 = T012M5_n8695NPed19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8695NPed19", A8695NPed19);
         A8705NRecCod = T012M5_A8705NRecCod[0] ;
         n8705NRecCod = T012M5_n8705NRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8705NRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8705NRecCod), 8, 0));
         A8706Nestado = T012M5_A8706Nestado[0] ;
         n8706Nestado = T012M5_n8706Nestado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8706Nestado", GXutil.str( A8706Nestado, 1, 0));
         A8708NUsucod = T012M5_A8708NUsucod[0] ;
         n8708NUsucod = T012M5_n8708NUsucod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8708NUsucod", A8708NUsucod);
         A8709NObs = T012M5_A8709NObs[0] ;
         n8709NObs = T012M5_n8709NObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8709NObs", A8709NObs);
         A8710NUsuMod = T012M5_A8710NUsuMod[0] ;
         n8710NUsuMod = T012M5_n8710NUsuMod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8710NUsuMod", A8710NUsuMod);
         A8711NFecNota = T012M5_A8711NFecNota[0] ;
         n8711NFecNota = T012M5_n8711NFecNota[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8711NFecNota", localUtil.ttoc( A8711NFecNota, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8841CliCod19 = T012M5_A8841CliCod19[0] ;
         n8841CliCod19 = T012M5_n8841CliCod19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8841CliCod19", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8841CliCod19), 6, 0));
         A8842CliNom19 = T012M5_A8842CliNom19[0] ;
         n8842CliNom19 = T012M5_n8842CliNom19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8842CliNom19", A8842CliNom19);
         A8772Art19 = T012M5_A8772Art19[0] ;
         n8772Art19 = T012M5_n8772Art19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8772Art19", A8772Art19);
         A8773DibC19 = T012M5_A8773DibC19[0] ;
         n8773DibC19 = T012M5_n8773DibC19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8773DibC19", A8773DibC19);
         A8843Art19Rd = T012M5_A8843Art19Rd[0] ;
         n8843Art19Rd = T012M5_n8843Art19Rd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8843Art19Rd", GXutil.ltrimstr( A8843Art19Rd, 6, 2));
         A8847Unid19 = T012M5_A8847Unid19[0] ;
         n8847Unid19 = T012M5_n8847Unid19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8847Unid19", A8847Unid19);
         A396EmprCod = T012M5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8770TipDocC = T012M5_A8770TipDocC[0] ;
         n8770TipDocC = T012M5_n8770TipDocC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8770TipDocC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8770TipDocC), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z8692NEnt19 = A8692NEnt19 ;
         sMode1188 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load12M1188( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1188 = (short)(0) ;
            initializeNonKey12M1188( ) ;
         }
         Gx_mode = sMode1188 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1188 = (short)(0) ;
         initializeNonKey12M1188( ) ;
         sMode1188 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1188 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey12M1188( ) ;
      if ( RcdFound1188 == 0 )
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
      RcdFound1188 = (short)(0) ;
      /* Using cursor T012M17 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A8692NEnt19)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T012M17_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T012M17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T012M17_A8692NEnt19[0] < A8692NEnt19 ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T012M17_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T012M17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T012M17_A8692NEnt19[0] > A8692NEnt19 ) ) )
         {
            A396EmprCod = T012M17_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A8692NEnt19 = T012M17_A8692NEnt19[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8692NEnt19", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8692NEnt19), 8, 0));
            RcdFound1188 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound1188 = (short)(0) ;
      /* Using cursor T012M18 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A8692NEnt19)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T012M18_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T012M18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T012M18_A8692NEnt19[0] > A8692NEnt19 ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T012M18_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T012M18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T012M18_A8692NEnt19[0] < A8692NEnt19 ) ) )
         {
            A396EmprCod = T012M18_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A8692NEnt19 = T012M18_A8692NEnt19[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8692NEnt19", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8692NEnt19), 8, 0));
            RcdFound1188 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey12M1188( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A8702Tmts = O8702Tmts ;
         httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
         A8703Tpzs = O8703Tpzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
         A8704Tkgr = O8704Tkgr ;
         httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert12M1188( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1188 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A8692NEnt19 != Z8692NEnt19 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A8692NEnt19 = Z8692NEnt19 ;
               httpContext.ajax_rsp_assign_attri("", false, "A8692NEnt19", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8692NEnt19), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A8702Tmts = O8702Tmts ;
               httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
               A8703Tpzs = O8703Tpzs ;
               httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
               A8704Tkgr = O8704Tkgr ;
               httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
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
               A8702Tmts = O8702Tmts ;
               httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
               A8703Tpzs = O8703Tpzs ;
               httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
               A8704Tkgr = O8704Tkgr ;
               httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
               update12M1188( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A8692NEnt19 != Z8692NEnt19 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A8702Tmts = O8702Tmts ;
               httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
               A8703Tpzs = O8703Tpzs ;
               httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
               A8704Tkgr = O8704Tkgr ;
               httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert12M1188( ) ;
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
                  A8702Tmts = O8702Tmts ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
                  A8703Tpzs = O8703Tpzs ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
                  A8704Tkgr = O8704Tkgr ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert12M1188( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A8692NEnt19 != Z8692NEnt19 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8692NEnt19 = Z8692NEnt19 ;
         httpContext.ajax_rsp_assign_attri("", false, "A8692NEnt19", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8692NEnt19), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A8702Tmts = O8702Tmts ;
         httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
         A8703Tpzs = O8703Tpzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
         A8704Tkgr = O8704Tkgr ;
         httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
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
      getKey12M1188( ) ;
      if ( RcdFound1188 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A8692NEnt19 != Z8692NEnt19 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A8692NEnt19 = Z8692NEnt19 ;
            httpContext.ajax_rsp_assign_attri("", false, "A8692NEnt19", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8692NEnt19), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A8692NEnt19 != Z8692NEnt19 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tent19");
      GX_FocusControl = edtFEnt19_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_12M0( ) ;
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
      if ( RcdFound1188 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtFEnt19_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart12M1188( ) ;
      if ( RcdFound1188 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFEnt19_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd12M1188( ) ;
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
      if ( RcdFound1188 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFEnt19_Internalname ;
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
      if ( RcdFound1188 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFEnt19_Internalname ;
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
      scanStart12M1188( ) ;
      if ( RcdFound1188 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1188 != 0 )
         {
            scanNext12M1188( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFEnt19_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd12M1188( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency12M1188( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T012M4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A8692NEnt19)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENT19"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || !( GXutil.dateCompare(Z8693FEnt19, T012M4_A8693FEnt19[0]) ) || ( GXutil.strcmp(Z8694NInt19, T012M4_A8694NInt19[0]) != 0 ) || ( GXutil.strcmp(Z8695NPed19, T012M4_A8695NPed19[0]) != 0 ) || ( Z8705NRecCod != T012M4_A8705NRecCod[0] ) || ( Z8706Nestado != T012M4_A8706Nestado[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8708NUsucod, T012M4_A8708NUsucod[0]) != 0 ) || ( GXutil.strcmp(Z8709NObs, T012M4_A8709NObs[0]) != 0 ) || ( GXutil.strcmp(Z8710NUsuMod, T012M4_A8710NUsuMod[0]) != 0 ) || !( GXutil.dateCompare(Z8711NFecNota, T012M4_A8711NFecNota[0]) ) || ( Z8841CliCod19 != T012M4_A8841CliCod19[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8842CliNom19, T012M4_A8842CliNom19[0]) != 0 ) || ( GXutil.strcmp(Z8772Art19, T012M4_A8772Art19[0]) != 0 ) || ( GXutil.strcmp(Z8773DibC19, T012M4_A8773DibC19[0]) != 0 ) || ( DecimalUtil.compareTo(Z8843Art19Rd, T012M4_A8843Art19Rd[0]) != 0 ) || ( GXutil.strcmp(Z8847Unid19, T012M4_A8847Unid19[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z8770TipDocC != T012M4_A8770TipDocC[0] ) )
         {
            if ( !( GXutil.dateCompare(Z8693FEnt19, T012M4_A8693FEnt19[0]) ) )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"FEnt19");
               GXutil.writeLogRaw("Old: ",Z8693FEnt19);
               GXutil.writeLogRaw("Current: ",T012M4_A8693FEnt19[0]);
            }
            if ( GXutil.strcmp(Z8694NInt19, T012M4_A8694NInt19[0]) != 0 )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"NInt19");
               GXutil.writeLogRaw("Old: ",Z8694NInt19);
               GXutil.writeLogRaw("Current: ",T012M4_A8694NInt19[0]);
            }
            if ( GXutil.strcmp(Z8695NPed19, T012M4_A8695NPed19[0]) != 0 )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"NPed19");
               GXutil.writeLogRaw("Old: ",Z8695NPed19);
               GXutil.writeLogRaw("Current: ",T012M4_A8695NPed19[0]);
            }
            if ( Z8705NRecCod != T012M4_A8705NRecCod[0] )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"NRecCod");
               GXutil.writeLogRaw("Old: ",Z8705NRecCod);
               GXutil.writeLogRaw("Current: ",T012M4_A8705NRecCod[0]);
            }
            if ( Z8706Nestado != T012M4_A8706Nestado[0] )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"Nestado");
               GXutil.writeLogRaw("Old: ",Z8706Nestado);
               GXutil.writeLogRaw("Current: ",T012M4_A8706Nestado[0]);
            }
            if ( GXutil.strcmp(Z8708NUsucod, T012M4_A8708NUsucod[0]) != 0 )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"NUsucod");
               GXutil.writeLogRaw("Old: ",Z8708NUsucod);
               GXutil.writeLogRaw("Current: ",T012M4_A8708NUsucod[0]);
            }
            if ( GXutil.strcmp(Z8709NObs, T012M4_A8709NObs[0]) != 0 )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"NObs");
               GXutil.writeLogRaw("Old: ",Z8709NObs);
               GXutil.writeLogRaw("Current: ",T012M4_A8709NObs[0]);
            }
            if ( GXutil.strcmp(Z8710NUsuMod, T012M4_A8710NUsuMod[0]) != 0 )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"NUsuMod");
               GXutil.writeLogRaw("Old: ",Z8710NUsuMod);
               GXutil.writeLogRaw("Current: ",T012M4_A8710NUsuMod[0]);
            }
            if ( !( GXutil.dateCompare(Z8711NFecNota, T012M4_A8711NFecNota[0]) ) )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"NFecNota");
               GXutil.writeLogRaw("Old: ",Z8711NFecNota);
               GXutil.writeLogRaw("Current: ",T012M4_A8711NFecNota[0]);
            }
            if ( Z8841CliCod19 != T012M4_A8841CliCod19[0] )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"CliCod19");
               GXutil.writeLogRaw("Old: ",Z8841CliCod19);
               GXutil.writeLogRaw("Current: ",T012M4_A8841CliCod19[0]);
            }
            if ( GXutil.strcmp(Z8842CliNom19, T012M4_A8842CliNom19[0]) != 0 )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"CliNom19");
               GXutil.writeLogRaw("Old: ",Z8842CliNom19);
               GXutil.writeLogRaw("Current: ",T012M4_A8842CliNom19[0]);
            }
            if ( GXutil.strcmp(Z8772Art19, T012M4_A8772Art19[0]) != 0 )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"Art19");
               GXutil.writeLogRaw("Old: ",Z8772Art19);
               GXutil.writeLogRaw("Current: ",T012M4_A8772Art19[0]);
            }
            if ( GXutil.strcmp(Z8773DibC19, T012M4_A8773DibC19[0]) != 0 )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"DibC19");
               GXutil.writeLogRaw("Old: ",Z8773DibC19);
               GXutil.writeLogRaw("Current: ",T012M4_A8773DibC19[0]);
            }
            if ( DecimalUtil.compareTo(Z8843Art19Rd, T012M4_A8843Art19Rd[0]) != 0 )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"Art19Rd");
               GXutil.writeLogRaw("Old: ",Z8843Art19Rd);
               GXutil.writeLogRaw("Current: ",T012M4_A8843Art19Rd[0]);
            }
            if ( GXutil.strcmp(Z8847Unid19, T012M4_A8847Unid19[0]) != 0 )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"Unid19");
               GXutil.writeLogRaw("Old: ",Z8847Unid19);
               GXutil.writeLogRaw("Current: ",T012M4_A8847Unid19[0]);
            }
            if ( Z8770TipDocC != T012M4_A8770TipDocC[0] )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"TipDocC");
               GXutil.writeLogRaw("Old: ",Z8770TipDocC);
               GXutil.writeLogRaw("Current: ",T012M4_A8770TipDocC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENT19"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert12M1188( )
   {
      beforeValidate12M1188( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12M1188( ) ;
      }
      if ( AnyError == 0 )
      {
         zm12M1188( 0) ;
         checkOptimisticConcurrency12M1188( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm12M1188( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert12M1188( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012M19 */
                  pr_default.execute(14, new Object[] {Integer.valueOf(A8692NEnt19), Boolean.valueOf(n8693FEnt19), A8693FEnt19, Boolean.valueOf(n8694NInt19), A8694NInt19, Boolean.valueOf(n8695NPed19), A8695NPed19, Boolean.valueOf(n8705NRecCod), Integer.valueOf(A8705NRecCod), Boolean.valueOf(n8706Nestado), Byte.valueOf(A8706Nestado), Boolean.valueOf(n8708NUsucod), A8708NUsucod, Boolean.valueOf(n8709NObs), A8709NObs, Boolean.valueOf(n8710NUsuMod), A8710NUsuMod, Boolean.valueOf(n8711NFecNota), A8711NFecNota, Boolean.valueOf(n8841CliCod19), Integer.valueOf(A8841CliCod19), Boolean.valueOf(n8842CliNom19), A8842CliNom19, Boolean.valueOf(n8772Art19), A8772Art19, Boolean.valueOf(n8773DibC19), A8773DibC19, Boolean.valueOf(n8843Art19Rd), A8843Art19Rd, Boolean.valueOf(n8847Unid19), A8847Unid19, A396EmprCod, Boolean.valueOf(n8770TipDocC), Short.valueOf(A8770TipDocC)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENT19");
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
                        processLevel12M1188( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption12M0( ) ;
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
            load12M1188( ) ;
         }
         endLevel12M1188( ) ;
      }
      closeExtendedTableCursors12M1188( ) ;
   }

   public void update12M1188( )
   {
      beforeValidate12M1188( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12M1188( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency12M1188( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm12M1188( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate12M1188( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012M20 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n8693FEnt19), A8693FEnt19, Boolean.valueOf(n8694NInt19), A8694NInt19, Boolean.valueOf(n8695NPed19), A8695NPed19, Boolean.valueOf(n8705NRecCod), Integer.valueOf(A8705NRecCod), Boolean.valueOf(n8706Nestado), Byte.valueOf(A8706Nestado), Boolean.valueOf(n8708NUsucod), A8708NUsucod, Boolean.valueOf(n8709NObs), A8709NObs, Boolean.valueOf(n8710NUsuMod), A8710NUsuMod, Boolean.valueOf(n8711NFecNota), A8711NFecNota, Boolean.valueOf(n8841CliCod19), Integer.valueOf(A8841CliCod19), Boolean.valueOf(n8842CliNom19), A8842CliNom19, Boolean.valueOf(n8772Art19), A8772Art19, Boolean.valueOf(n8773DibC19), A8773DibC19, Boolean.valueOf(n8843Art19Rd), A8843Art19Rd, Boolean.valueOf(n8847Unid19), A8847Unid19, Boolean.valueOf(n8770TipDocC), Short.valueOf(A8770TipDocC), A396EmprCod, Integer.valueOf(A8692NEnt19)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENT19");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENT19"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate12M1188( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel12M1188( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption12M0( ) ;
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
         endLevel12M1188( ) ;
      }
      closeExtendedTableCursors12M1188( ) ;
   }

   public void deferredUpdate12M1188( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate12M1188( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency12M1188( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls12M1188( ) ;
         afterConfirm12M1188( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete12M1188( ) ;
            if ( AnyError == 0 )
            {
               A8702Tmts = O8702Tmts ;
               httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
               A8703Tpzs = O8703Tpzs ;
               httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
               A8704Tkgr = O8704Tkgr ;
               httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
               scanStart12M1189( ) ;
               while ( RcdFound1189 != 0 )
               {
                  getByPrimaryKey12M1189( ) ;
                  delete12M1189( ) ;
                  scanNext12M1189( ) ;
                  O8702Tmts = A8702Tmts ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
                  O8703Tpzs = A8703Tpzs ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
                  O8704Tkgr = A8704Tkgr ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
               }
               scanEnd12M1189( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012M21 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A8692NEnt19)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENT19");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1188 == 0 )
                        {
                           initAll12M1188( ) ;
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
                        resetCaption12M0( ) ;
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
      sMode1188 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel12M1188( ) ;
      Gx_mode = sMode1188 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls12M1188( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T012M22 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         A407EmprNom = T012M22_A407EmprNom[0] ;
         n407EmprNom = T012M22_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(17);
         /* Using cursor T012M24 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A8692NEnt19)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            A8704Tkgr = T012M24_A8704Tkgr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
            A8702Tmts = T012M24_A8702Tmts[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
            A8703Tpzs = T012M24_A8703Tpzs[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
         }
         else
         {
            A8704Tkgr = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
            A8702Tmts = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
            A8703Tpzs = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
         }
         pr_default.close(18);
         /* Using cursor T012M25 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n8770TipDocC), Short.valueOf(A8770TipDocC)});
         A8771TipDocD = T012M25_A8771TipDocD[0] ;
         n8771TipDocD = T012M25_n8771TipDocD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8771TipDocD", A8771TipDocD);
         pr_default.close(19);
      }
   }

   public void processNestedLevel12M1189( )
   {
      s8702Tmts = O8702Tmts ;
      httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
      s8703Tpzs = O8703Tpzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
      s8704Tkgr = O8704Tkgr ;
      httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
      nGXsfl_135_idx = 0 ;
      while ( nGXsfl_135_idx < nRC_GXsfl_135 )
      {
         readRow12M1189( ) ;
         if ( ( nRcdExists_1189 != 0 ) || ( nIsMod_1189 != 0 ) )
         {
            standaloneNotModal12M1189( ) ;
            getKey12M1189( ) ;
            if ( ( nRcdExists_1189 == 0 ) && ( nRcdDeleted_1189 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert12M1189( ) ;
            }
            else
            {
               if ( RcdFound1189 != 0 )
               {
                  if ( ( nRcdDeleted_1189 != 0 ) && ( nRcdExists_1189 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete12M1189( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1189 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update12M1189( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1189 == 0 )
                  {
                     GXCCtl = "CODPZ19_" + sGXsfl_135_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCodPz19_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O8702Tmts = A8702Tmts ;
            httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
            O8703Tpzs = A8703Tpzs ;
            httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
            O8704Tkgr = A8704Tkgr ;
            httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1189_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1189, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCodPz19_Internalname, GXutil.rtrim( A8696CodPz19)) ;
         httpContext.changePostValue( edtKgs19_Internalname, GXutil.ltrim( localUtil.ntoc( A8697Kgs19, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMts19_Internalname, GXutil.ltrim( localUtil.ntoc( A8698Mts19, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDib19_Internalname, GXutil.rtrim( A8699Dib19)) ;
         httpContext.changePostValue( edtOT19_Internalname, GXutil.rtrim( A8700OT19)) ;
         httpContext.changePostValue( edtCol19_Internalname, GXutil.rtrim( A8701Col19)) ;
         httpContext.changePostValue( edtColN19_Internalname, GXutil.rtrim( A8844ColN19)) ;
         httpContext.changePostValue( edtCodC19_Internalname, GXutil.rtrim( A8845CodC19)) ;
         httpContext.changePostValue( edtNomC19_Internalname, GXutil.rtrim( A8846NomC19)) ;
         httpContext.changePostValue( edtTel19_Internalname, GXutil.ltrim( localUtil.ntoc( A8849Tel19, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTura19_Internalname, GXutil.ltrim( localUtil.ntoc( A8850Tura19, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTurb19_Internalname, GXutil.ltrim( localUtil.ntoc( A8851Turb19, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTurc19_Internalname, GXutil.ltrim( localUtil.ntoc( A8852Turc19, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColNN19_Internalname, GXutil.rtrim( A8865ColNN19)) ;
         httpContext.changePostValue( "ZT_"+"Z8696CodPz19_"+sGXsfl_135_idx, GXutil.rtrim( Z8696CodPz19)) ;
         httpContext.changePostValue( "ZT_"+"Z8697Kgs19_"+sGXsfl_135_idx, GXutil.ltrim( localUtil.ntoc( Z8697Kgs19, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8698Mts19_"+sGXsfl_135_idx, GXutil.ltrim( localUtil.ntoc( Z8698Mts19, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8699Dib19_"+sGXsfl_135_idx, GXutil.rtrim( Z8699Dib19)) ;
         httpContext.changePostValue( "ZT_"+"Z8700OT19_"+sGXsfl_135_idx, GXutil.rtrim( Z8700OT19)) ;
         httpContext.changePostValue( "ZT_"+"Z8701Col19_"+sGXsfl_135_idx, GXutil.rtrim( Z8701Col19)) ;
         httpContext.changePostValue( "ZT_"+"Z8844ColN19_"+sGXsfl_135_idx, GXutil.rtrim( Z8844ColN19)) ;
         httpContext.changePostValue( "ZT_"+"Z8845CodC19_"+sGXsfl_135_idx, GXutil.rtrim( Z8845CodC19)) ;
         httpContext.changePostValue( "ZT_"+"Z8846NomC19_"+sGXsfl_135_idx, GXutil.rtrim( Z8846NomC19)) ;
         httpContext.changePostValue( "ZT_"+"Z8849Tel19_"+sGXsfl_135_idx, GXutil.ltrim( localUtil.ntoc( Z8849Tel19, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8850Tura19_"+sGXsfl_135_idx, GXutil.ltrim( localUtil.ntoc( Z8850Tura19, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8851Turb19_"+sGXsfl_135_idx, GXutil.ltrim( localUtil.ntoc( Z8851Turb19, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8852Turc19_"+sGXsfl_135_idx, GXutil.ltrim( localUtil.ntoc( Z8852Turc19, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8865ColNN19_"+sGXsfl_135_idx, GXutil.rtrim( Z8865ColNN19)) ;
         httpContext.changePostValue( "T8698Mts19_"+sGXsfl_135_idx, GXutil.ltrim( localUtil.ntoc( O8698Mts19, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T8697Kgs19_"+sGXsfl_135_idx, GXutil.ltrim( localUtil.ntoc( O8697Kgs19, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1189_"+sGXsfl_135_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1189, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1189_"+sGXsfl_135_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1189, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1189_"+sGXsfl_135_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1189, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1189 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1189_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1189_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CODPZ19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodPz19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "KGS19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtKgs19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MTS19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMts19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DIB19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDib19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OT19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOT19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COL19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCol19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLN19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColN19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CODC19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodC19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NOMC19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNomC19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TEL19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTel19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TURA19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTura19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TURB19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTurb19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TURC19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTurc19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLNN19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNN19_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll12M1189( ) ;
      if ( AnyError != 0 )
      {
         O8702Tmts = s8702Tmts ;
         httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
         O8703Tpzs = s8703Tpzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
         O8704Tkgr = s8704Tkgr ;
         httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
      }
      nRcdExists_1189 = (short)(0) ;
      nIsMod_1189 = (short)(0) ;
      nRcdDeleted_1189 = (short)(0) ;
   }

   public void processLevel12M1188( )
   {
      /* Save parent mode. */
      sMode1188 = Gx_mode ;
      processNestedLevel12M1189( ) ;
      if ( AnyError != 0 )
      {
         O8702Tmts = s8702Tmts ;
         httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
         O8703Tpzs = s8703Tpzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
         O8704Tkgr = s8704Tkgr ;
         httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1188 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel12M1188( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete12M1188( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tent19");
         if ( AnyError == 0 )
         {
            confirmValues12M0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tent19");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart12M1188( )
   {
      /* Using cursor T012M26 */
      pr_default.execute(20);
      RcdFound1188 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1188 = (short)(1) ;
         A396EmprCod = T012M26_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8692NEnt19 = T012M26_A8692NEnt19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8692NEnt19", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8692NEnt19), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext12M1188( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound1188 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1188 = (short)(1) ;
         A396EmprCod = T012M26_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8692NEnt19 = T012M26_A8692NEnt19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8692NEnt19", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8692NEnt19), 8, 0));
      }
   }

   public void scanEnd12M1188( )
   {
      pr_default.close(20);
   }

   public void afterConfirm12M1188( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert12M1188( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate12M1188( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete12M1188( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete12M1188( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate12M1188( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes12M1188( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtNEnt19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNEnt19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNEnt19_Enabled), 5, 0), true);
      edtFEnt19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFEnt19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFEnt19_Enabled), 5, 0), true);
      edtNInt19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNInt19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNInt19_Enabled), 5, 0), true);
      edtNPed19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNPed19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNPed19_Enabled), 5, 0), true);
      edtTkgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTkgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTkgr_Enabled), 5, 0), true);
      edtTmts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTmts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTmts_Enabled), 5, 0), true);
      edtTpzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTpzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTpzs_Enabled), 5, 0), true);
      edtNRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNRecCod_Enabled), 5, 0), true);
      edtNestado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNestado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNestado_Enabled), 5, 0), true);
      edtNUsucod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNUsucod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNUsucod_Enabled), 5, 0), true);
      edtNObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNObs_Enabled), 5, 0), true);
      edtNUsuMod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNUsuMod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNUsuMod_Enabled), 5, 0), true);
      edtNFecNota_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNFecNota_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNFecNota_Enabled), 5, 0), true);
      edtCliCod19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod19_Enabled), 5, 0), true);
      edtCliNom19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom19_Enabled), 5, 0), true);
      edtTipDocC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDocC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDocC_Enabled), 5, 0), true);
      edtTipDocD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDocD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDocD_Enabled), 5, 0), true);
      edtArt19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt19_Enabled), 5, 0), true);
      edtDibC19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibC19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibC19_Enabled), 5, 0), true);
      edtArt19Rd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArt19Rd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArt19Rd_Enabled), 5, 0), true);
      edtUnid19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUnid19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUnid19_Enabled), 5, 0), true);
   }

   public void zm12M1189( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8697Kgs19 = T012M3_A8697Kgs19[0] ;
            Z8698Mts19 = T012M3_A8698Mts19[0] ;
            Z8699Dib19 = T012M3_A8699Dib19[0] ;
            Z8700OT19 = T012M3_A8700OT19[0] ;
            Z8701Col19 = T012M3_A8701Col19[0] ;
            Z8844ColN19 = T012M3_A8844ColN19[0] ;
            Z8845CodC19 = T012M3_A8845CodC19[0] ;
            Z8846NomC19 = T012M3_A8846NomC19[0] ;
            Z8849Tel19 = T012M3_A8849Tel19[0] ;
            Z8850Tura19 = T012M3_A8850Tura19[0] ;
            Z8851Turb19 = T012M3_A8851Turb19[0] ;
            Z8852Turc19 = T012M3_A8852Turc19[0] ;
            Z8865ColNN19 = T012M3_A8865ColNN19[0] ;
         }
         else
         {
            Z8697Kgs19 = A8697Kgs19 ;
            Z8698Mts19 = A8698Mts19 ;
            Z8699Dib19 = A8699Dib19 ;
            Z8700OT19 = A8700OT19 ;
            Z8701Col19 = A8701Col19 ;
            Z8844ColN19 = A8844ColN19 ;
            Z8845CodC19 = A8845CodC19 ;
            Z8846NomC19 = A8846NomC19 ;
            Z8849Tel19 = A8849Tel19 ;
            Z8850Tura19 = A8850Tura19 ;
            Z8851Turb19 = A8851Turb19 ;
            Z8852Turc19 = A8852Turc19 ;
            Z8865ColNN19 = A8865ColNN19 ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z396EmprCod = A396EmprCod ;
         Z8692NEnt19 = A8692NEnt19 ;
         Z8696CodPz19 = A8696CodPz19 ;
         Z8697Kgs19 = A8697Kgs19 ;
         Z8698Mts19 = A8698Mts19 ;
         Z8699Dib19 = A8699Dib19 ;
         Z8700OT19 = A8700OT19 ;
         Z8701Col19 = A8701Col19 ;
         Z8844ColN19 = A8844ColN19 ;
         Z8845CodC19 = A8845CodC19 ;
         Z8846NomC19 = A8846NomC19 ;
         Z8849Tel19 = A8849Tel19 ;
         Z8850Tura19 = A8850Tura19 ;
         Z8851Turb19 = A8851Turb19 ;
         Z8852Turc19 = A8852Turc19 ;
         Z8865ColNN19 = A8865ColNN19 ;
      }
   }

   public void standaloneNotModal12M1189( )
   {
   }

   public void standaloneModal12M1189( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCodPz19_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCodPz19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodPz19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      }
      else
      {
         edtCodPz19_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCodPz19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodPz19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      }
   }

   public void load12M1189( )
   {
      /* Using cursor T012M27 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A8692NEnt19), A8696CodPz19});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1189 = (short)(1) ;
         A8697Kgs19 = T012M27_A8697Kgs19[0] ;
         n8697Kgs19 = T012M27_n8697Kgs19[0] ;
         A8698Mts19 = T012M27_A8698Mts19[0] ;
         n8698Mts19 = T012M27_n8698Mts19[0] ;
         A8699Dib19 = T012M27_A8699Dib19[0] ;
         n8699Dib19 = T012M27_n8699Dib19[0] ;
         A8700OT19 = T012M27_A8700OT19[0] ;
         n8700OT19 = T012M27_n8700OT19[0] ;
         A8701Col19 = T012M27_A8701Col19[0] ;
         n8701Col19 = T012M27_n8701Col19[0] ;
         A8844ColN19 = T012M27_A8844ColN19[0] ;
         n8844ColN19 = T012M27_n8844ColN19[0] ;
         A8845CodC19 = T012M27_A8845CodC19[0] ;
         n8845CodC19 = T012M27_n8845CodC19[0] ;
         A8846NomC19 = T012M27_A8846NomC19[0] ;
         n8846NomC19 = T012M27_n8846NomC19[0] ;
         A8849Tel19 = T012M27_A8849Tel19[0] ;
         n8849Tel19 = T012M27_n8849Tel19[0] ;
         A8850Tura19 = T012M27_A8850Tura19[0] ;
         n8850Tura19 = T012M27_n8850Tura19[0] ;
         A8851Turb19 = T012M27_A8851Turb19[0] ;
         n8851Turb19 = T012M27_n8851Turb19[0] ;
         A8852Turc19 = T012M27_A8852Turc19[0] ;
         n8852Turc19 = T012M27_n8852Turc19[0] ;
         A8865ColNN19 = T012M27_A8865ColNN19[0] ;
         n8865ColNN19 = T012M27_n8865ColNN19[0] ;
         zm12M1189( -8) ;
      }
      pr_default.close(21);
      onLoadActions12M1189( ) ;
   }

   public void onLoadActions12M1189( )
   {
      if ( isIns( )  )
      {
         A8704Tkgr = O8704Tkgr.add(A8697Kgs19) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A8704Tkgr = O8704Tkgr.add(A8697Kgs19).subtract(O8697Kgs19) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A8704Tkgr = O8704Tkgr.subtract(O8697Kgs19) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A8703Tpzs = (int)(O8703Tpzs+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A8703Tpzs = O8703Tpzs ;
            httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A8703Tpzs = (int)(O8703Tpzs-1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         A8702Tmts = O8702Tmts.add(A8698Mts19) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A8702Tmts = O8702Tmts.add(A8698Mts19).subtract(O8698Mts19) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A8702Tmts = O8702Tmts.subtract(O8698Mts19) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
            }
         }
      }
   }

   public void checkExtendedTable12M1189( )
   {
      nIsDirty_1189 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal12M1189( ) ;
      if ( isIns( )  )
      {
         nIsDirty_1189 = (short)(1) ;
         A8704Tkgr = O8704Tkgr.add(A8697Kgs19) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1189 = (short)(1) ;
            A8704Tkgr = O8704Tkgr.add(A8697Kgs19).subtract(O8697Kgs19) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1189 = (short)(1) ;
               A8704Tkgr = O8704Tkgr.subtract(O8697Kgs19) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_1189 = (short)(1) ;
         A8703Tpzs = (int)(O8703Tpzs+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1189 = (short)(1) ;
            A8703Tpzs = O8703Tpzs ;
            httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1189 = (short)(1) ;
               A8703Tpzs = (int)(O8703Tpzs-1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_1189 = (short)(1) ;
         A8702Tmts = O8702Tmts.add(A8698Mts19) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1189 = (short)(1) ;
            A8702Tmts = O8702Tmts.add(A8698Mts19).subtract(O8698Mts19) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1189 = (short)(1) ;
               A8702Tmts = O8702Tmts.subtract(O8698Mts19) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
            }
         }
      }
   }

   public void closeExtendedTableCursors12M1189( )
   {
   }

   public void enableDisable12M1189( )
   {
   }

   public void getKey12M1189( )
   {
      /* Using cursor T012M28 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A8692NEnt19), A8696CodPz19});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1189 = (short)(1) ;
      }
      else
      {
         RcdFound1189 = (short)(0) ;
      }
      pr_default.close(22);
   }

   public void getByPrimaryKey12M1189( )
   {
      /* Using cursor T012M3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A8692NEnt19), A8696CodPz19});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm12M1189( 8) ;
         RcdFound1189 = (short)(1) ;
         initializeNonKey12M1189( ) ;
         A8696CodPz19 = T012M3_A8696CodPz19[0] ;
         A8697Kgs19 = T012M3_A8697Kgs19[0] ;
         n8697Kgs19 = T012M3_n8697Kgs19[0] ;
         A8698Mts19 = T012M3_A8698Mts19[0] ;
         n8698Mts19 = T012M3_n8698Mts19[0] ;
         A8699Dib19 = T012M3_A8699Dib19[0] ;
         n8699Dib19 = T012M3_n8699Dib19[0] ;
         A8700OT19 = T012M3_A8700OT19[0] ;
         n8700OT19 = T012M3_n8700OT19[0] ;
         A8701Col19 = T012M3_A8701Col19[0] ;
         n8701Col19 = T012M3_n8701Col19[0] ;
         A8844ColN19 = T012M3_A8844ColN19[0] ;
         n8844ColN19 = T012M3_n8844ColN19[0] ;
         A8845CodC19 = T012M3_A8845CodC19[0] ;
         n8845CodC19 = T012M3_n8845CodC19[0] ;
         A8846NomC19 = T012M3_A8846NomC19[0] ;
         n8846NomC19 = T012M3_n8846NomC19[0] ;
         A8849Tel19 = T012M3_A8849Tel19[0] ;
         n8849Tel19 = T012M3_n8849Tel19[0] ;
         A8850Tura19 = T012M3_A8850Tura19[0] ;
         n8850Tura19 = T012M3_n8850Tura19[0] ;
         A8851Turb19 = T012M3_A8851Turb19[0] ;
         n8851Turb19 = T012M3_n8851Turb19[0] ;
         A8852Turc19 = T012M3_A8852Turc19[0] ;
         n8852Turc19 = T012M3_n8852Turc19[0] ;
         A8865ColNN19 = T012M3_A8865ColNN19[0] ;
         n8865ColNN19 = T012M3_n8865ColNN19[0] ;
         O8698Mts19 = A8698Mts19 ;
         n8698Mts19 = false ;
         O8697Kgs19 = A8697Kgs19 ;
         n8697Kgs19 = false ;
         Z396EmprCod = A396EmprCod ;
         Z8692NEnt19 = A8692NEnt19 ;
         Z8696CodPz19 = A8696CodPz19 ;
         sMode1189 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal12M1189( ) ;
         load12M1189( ) ;
         Gx_mode = sMode1189 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1189 = (short)(0) ;
         initializeNonKey12M1189( ) ;
         sMode1189 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal12M1189( ) ;
         Gx_mode = sMode1189 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes12M1189( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency12M1189( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T012M2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A8692NEnt19), A8696CodPz19});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENT191"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z8697Kgs19, T012M2_A8697Kgs19[0]) != 0 ) || ( DecimalUtil.compareTo(Z8698Mts19, T012M2_A8698Mts19[0]) != 0 ) || ( GXutil.strcmp(Z8699Dib19, T012M2_A8699Dib19[0]) != 0 ) || ( GXutil.strcmp(Z8700OT19, T012M2_A8700OT19[0]) != 0 ) || ( GXutil.strcmp(Z8701Col19, T012M2_A8701Col19[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8844ColN19, T012M2_A8844ColN19[0]) != 0 ) || ( GXutil.strcmp(Z8845CodC19, T012M2_A8845CodC19[0]) != 0 ) || ( GXutil.strcmp(Z8846NomC19, T012M2_A8846NomC19[0]) != 0 ) || ( Z8849Tel19 != T012M2_A8849Tel19[0] ) || ( Z8850Tura19 != T012M2_A8850Tura19[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z8851Turb19 != T012M2_A8851Turb19[0] ) || ( Z8852Turc19 != T012M2_A8852Turc19[0] ) || ( GXutil.strcmp(Z8865ColNN19, T012M2_A8865ColNN19[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z8697Kgs19, T012M2_A8697Kgs19[0]) != 0 )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"Kgs19");
               GXutil.writeLogRaw("Old: ",Z8697Kgs19);
               GXutil.writeLogRaw("Current: ",T012M2_A8697Kgs19[0]);
            }
            if ( DecimalUtil.compareTo(Z8698Mts19, T012M2_A8698Mts19[0]) != 0 )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"Mts19");
               GXutil.writeLogRaw("Old: ",Z8698Mts19);
               GXutil.writeLogRaw("Current: ",T012M2_A8698Mts19[0]);
            }
            if ( GXutil.strcmp(Z8699Dib19, T012M2_A8699Dib19[0]) != 0 )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"Dib19");
               GXutil.writeLogRaw("Old: ",Z8699Dib19);
               GXutil.writeLogRaw("Current: ",T012M2_A8699Dib19[0]);
            }
            if ( GXutil.strcmp(Z8700OT19, T012M2_A8700OT19[0]) != 0 )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"OT19");
               GXutil.writeLogRaw("Old: ",Z8700OT19);
               GXutil.writeLogRaw("Current: ",T012M2_A8700OT19[0]);
            }
            if ( GXutil.strcmp(Z8701Col19, T012M2_A8701Col19[0]) != 0 )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"Col19");
               GXutil.writeLogRaw("Old: ",Z8701Col19);
               GXutil.writeLogRaw("Current: ",T012M2_A8701Col19[0]);
            }
            if ( GXutil.strcmp(Z8844ColN19, T012M2_A8844ColN19[0]) != 0 )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"ColN19");
               GXutil.writeLogRaw("Old: ",Z8844ColN19);
               GXutil.writeLogRaw("Current: ",T012M2_A8844ColN19[0]);
            }
            if ( GXutil.strcmp(Z8845CodC19, T012M2_A8845CodC19[0]) != 0 )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"CodC19");
               GXutil.writeLogRaw("Old: ",Z8845CodC19);
               GXutil.writeLogRaw("Current: ",T012M2_A8845CodC19[0]);
            }
            if ( GXutil.strcmp(Z8846NomC19, T012M2_A8846NomC19[0]) != 0 )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"NomC19");
               GXutil.writeLogRaw("Old: ",Z8846NomC19);
               GXutil.writeLogRaw("Current: ",T012M2_A8846NomC19[0]);
            }
            if ( Z8849Tel19 != T012M2_A8849Tel19[0] )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"Tel19");
               GXutil.writeLogRaw("Old: ",Z8849Tel19);
               GXutil.writeLogRaw("Current: ",T012M2_A8849Tel19[0]);
            }
            if ( Z8850Tura19 != T012M2_A8850Tura19[0] )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"Tura19");
               GXutil.writeLogRaw("Old: ",Z8850Tura19);
               GXutil.writeLogRaw("Current: ",T012M2_A8850Tura19[0]);
            }
            if ( Z8851Turb19 != T012M2_A8851Turb19[0] )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"Turb19");
               GXutil.writeLogRaw("Old: ",Z8851Turb19);
               GXutil.writeLogRaw("Current: ",T012M2_A8851Turb19[0]);
            }
            if ( Z8852Turc19 != T012M2_A8852Turc19[0] )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"Turc19");
               GXutil.writeLogRaw("Old: ",Z8852Turc19);
               GXutil.writeLogRaw("Current: ",T012M2_A8852Turc19[0]);
            }
            if ( GXutil.strcmp(Z8865ColNN19, T012M2_A8865ColNN19[0]) != 0 )
            {
               GXutil.writeLogln("tent19:[seudo value changed for attri]"+"ColNN19");
               GXutil.writeLogRaw("Old: ",Z8865ColNN19);
               GXutil.writeLogRaw("Current: ",T012M2_A8865ColNN19[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENT191"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert12M1189( )
   {
      beforeValidate12M1189( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12M1189( ) ;
      }
      if ( AnyError == 0 )
      {
         zm12M1189( 0) ;
         checkOptimisticConcurrency12M1189( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm12M1189( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert12M1189( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012M29 */
                  pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A8692NEnt19), A8696CodPz19, Boolean.valueOf(n8697Kgs19), A8697Kgs19, Boolean.valueOf(n8698Mts19), A8698Mts19, Boolean.valueOf(n8699Dib19), A8699Dib19, Boolean.valueOf(n8700OT19), A8700OT19, Boolean.valueOf(n8701Col19), A8701Col19, Boolean.valueOf(n8844ColN19), A8844ColN19, Boolean.valueOf(n8845CodC19), A8845CodC19, Boolean.valueOf(n8846NomC19), A8846NomC19, Boolean.valueOf(n8849Tel19), Short.valueOf(A8849Tel19), Boolean.valueOf(n8850Tura19), Long.valueOf(A8850Tura19), Boolean.valueOf(n8851Turb19), Long.valueOf(A8851Turb19), Boolean.valueOf(n8852Turc19), Long.valueOf(A8852Turc19), Boolean.valueOf(n8865ColNN19), A8865ColNN19});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENT191");
                  if ( (pr_default.getStatus(23) == 1) )
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
            load12M1189( ) ;
         }
         endLevel12M1189( ) ;
      }
      closeExtendedTableCursors12M1189( ) ;
   }

   public void update12M1189( )
   {
      beforeValidate12M1189( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12M1189( ) ;
      }
      if ( ( nIsMod_1189 != 0 ) || ( nIsDirty_1189 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency12M1189( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm12M1189( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate12M1189( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T012M30 */
                     pr_default.execute(24, new Object[] {Boolean.valueOf(n8697Kgs19), A8697Kgs19, Boolean.valueOf(n8698Mts19), A8698Mts19, Boolean.valueOf(n8699Dib19), A8699Dib19, Boolean.valueOf(n8700OT19), A8700OT19, Boolean.valueOf(n8701Col19), A8701Col19, Boolean.valueOf(n8844ColN19), A8844ColN19, Boolean.valueOf(n8845CodC19), A8845CodC19, Boolean.valueOf(n8846NomC19), A8846NomC19, Boolean.valueOf(n8849Tel19), Short.valueOf(A8849Tel19), Boolean.valueOf(n8850Tura19), Long.valueOf(A8850Tura19), Boolean.valueOf(n8851Turb19), Long.valueOf(A8851Turb19), Boolean.valueOf(n8852Turc19), Long.valueOf(A8852Turc19), Boolean.valueOf(n8865ColNN19), A8865ColNN19, A396EmprCod, Integer.valueOf(A8692NEnt19), A8696CodPz19});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENT191");
                     if ( (pr_default.getStatus(24) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENT191"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate12M1189( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey12M1189( ) ;
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
            endLevel12M1189( ) ;
         }
      }
      closeExtendedTableCursors12M1189( ) ;
   }

   public void deferredUpdate12M1189( )
   {
   }

   public void delete12M1189( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate12M1189( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency12M1189( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls12M1189( ) ;
         afterConfirm12M1189( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete12M1189( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T012M31 */
               pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A8692NEnt19), A8696CodPz19});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENT191");
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
      sMode1189 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel12M1189( ) ;
      Gx_mode = sMode1189 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls12M1189( )
   {
      standaloneModal12M1189( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  )
         {
            A8704Tkgr = O8704Tkgr.add(A8697Kgs19) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A8704Tkgr = O8704Tkgr.add(A8697Kgs19).subtract(O8697Kgs19) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A8704Tkgr = O8704Tkgr.subtract(O8697Kgs19) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A8703Tpzs = (int)(O8703Tpzs+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A8703Tpzs = O8703Tpzs ;
               httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A8703Tpzs = (int)(O8703Tpzs-1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
               }
            }
         }
         if ( isIns( )  )
         {
            A8702Tmts = O8702Tmts.add(A8698Mts19) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A8702Tmts = O8702Tmts.add(A8698Mts19).subtract(O8698Mts19) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A8702Tmts = O8702Tmts.subtract(O8698Mts19) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
               }
            }
         }
      }
   }

   public void endLevel12M1189( )
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

   public void scanStart12M1189( )
   {
      /* Scan By routine */
      /* Using cursor T012M32 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A8692NEnt19)});
      RcdFound1189 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1189 = (short)(1) ;
         A8696CodPz19 = T012M32_A8696CodPz19[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext12M1189( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound1189 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1189 = (short)(1) ;
         A8696CodPz19 = T012M32_A8696CodPz19[0] ;
      }
   }

   public void scanEnd12M1189( )
   {
      pr_default.close(26);
   }

   public void afterConfirm12M1189( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert12M1189( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate12M1189( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete12M1189( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete12M1189( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate12M1189( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes12M1189( )
   {
      edtCodPz19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodPz19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodPz19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      edtKgs19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtKgs19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKgs19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      edtMts19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMts19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMts19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      edtDib19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDib19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDib19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      edtOT19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOT19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOT19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      edtCol19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCol19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCol19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      edtColN19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColN19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColN19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      edtCodC19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodC19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodC19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      edtNomC19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNomC19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNomC19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      edtTel19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTel19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTel19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      edtTura19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTura19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTura19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      edtTurb19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTurb19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTurb19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      edtTurc19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTurc19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTurc19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      edtColNN19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNN19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNN19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
   }

   public void send_integrity_lvl_hashes12M1189( )
   {
   }

   public void send_integrity_lvl_hashes12M1188( )
   {
   }

   public void subsflControlProps_1351189( )
   {
      edtavnRcdDeleted_1189_Internalname = "vNRCDDELETED_1189_"+sGXsfl_135_idx ;
      edtCodPz19_Internalname = "CODPZ19_"+sGXsfl_135_idx ;
      edtKgs19_Internalname = "KGS19_"+sGXsfl_135_idx ;
      edtMts19_Internalname = "MTS19_"+sGXsfl_135_idx ;
      edtDib19_Internalname = "DIB19_"+sGXsfl_135_idx ;
      edtOT19_Internalname = "OT19_"+sGXsfl_135_idx ;
      edtCol19_Internalname = "COL19_"+sGXsfl_135_idx ;
      edtColN19_Internalname = "COLN19_"+sGXsfl_135_idx ;
      edtCodC19_Internalname = "CODC19_"+sGXsfl_135_idx ;
      edtNomC19_Internalname = "NOMC19_"+sGXsfl_135_idx ;
      edtTel19_Internalname = "TEL19_"+sGXsfl_135_idx ;
      edtTura19_Internalname = "TURA19_"+sGXsfl_135_idx ;
      edtTurb19_Internalname = "TURB19_"+sGXsfl_135_idx ;
      edtTurc19_Internalname = "TURC19_"+sGXsfl_135_idx ;
      edtColNN19_Internalname = "COLNN19_"+sGXsfl_135_idx ;
   }

   public void subsflControlProps_fel_1351189( )
   {
      edtavnRcdDeleted_1189_Internalname = "vNRCDDELETED_1189_"+sGXsfl_135_fel_idx ;
      edtCodPz19_Internalname = "CODPZ19_"+sGXsfl_135_fel_idx ;
      edtKgs19_Internalname = "KGS19_"+sGXsfl_135_fel_idx ;
      edtMts19_Internalname = "MTS19_"+sGXsfl_135_fel_idx ;
      edtDib19_Internalname = "DIB19_"+sGXsfl_135_fel_idx ;
      edtOT19_Internalname = "OT19_"+sGXsfl_135_fel_idx ;
      edtCol19_Internalname = "COL19_"+sGXsfl_135_fel_idx ;
      edtColN19_Internalname = "COLN19_"+sGXsfl_135_fel_idx ;
      edtCodC19_Internalname = "CODC19_"+sGXsfl_135_fel_idx ;
      edtNomC19_Internalname = "NOMC19_"+sGXsfl_135_fel_idx ;
      edtTel19_Internalname = "TEL19_"+sGXsfl_135_fel_idx ;
      edtTura19_Internalname = "TURA19_"+sGXsfl_135_fel_idx ;
      edtTurb19_Internalname = "TURB19_"+sGXsfl_135_fel_idx ;
      edtTurc19_Internalname = "TURC19_"+sGXsfl_135_fel_idx ;
      edtColNN19_Internalname = "COLNN19_"+sGXsfl_135_fel_idx ;
   }

   public void addRow12M1189( )
   {
      nGXsfl_135_idx = (int)(nGXsfl_135_idx+1) ;
      sGXsfl_135_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_135_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1351189( ) ;
      sendRow12M1189( ) ;
   }

   public void sendRow12M1189( )
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
         if ( ((int)((nGXsfl_135_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1189_" + sGXsfl_135_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 136,'',false,'" + sGXsfl_135_idx + "',135)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1189_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1189, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1189_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1189), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1189), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1189_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1189_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1189_" + sGXsfl_135_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 137,'',false,'" + sGXsfl_135_idx + "',135)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCodPz19_Internalname,GXutil.rtrim( A8696CodPz19),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,137);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCodPz19_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCodPz19_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1189_" + sGXsfl_135_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 138,'',false,'" + sGXsfl_135_idx + "',135)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKgs19_Internalname,GXutil.ltrim( localUtil.ntoc( A8697Kgs19, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtKgs19_Enabled!=0) ? localUtil.format( A8697Kgs19, "ZZZZZ9.99") : localUtil.format( A8697Kgs19, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,138);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtKgs19_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtKgs19_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1189_" + sGXsfl_135_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 139,'',false,'" + sGXsfl_135_idx + "',135)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMts19_Internalname,GXutil.ltrim( localUtil.ntoc( A8698Mts19, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMts19_Enabled!=0) ? localUtil.format( A8698Mts19, "ZZZZZ9.99") : localUtil.format( A8698Mts19, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,139);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMts19_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMts19_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1189_" + sGXsfl_135_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 140,'',false,'" + sGXsfl_135_idx + "',135)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDib19_Internalname,GXutil.rtrim( A8699Dib19),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,140);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDib19_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDib19_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1189_" + sGXsfl_135_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 141,'',false,'" + sGXsfl_135_idx + "',135)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOT19_Internalname,GXutil.rtrim( A8700OT19),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOT19_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOT19_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1189_" + sGXsfl_135_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 142,'',false,'" + sGXsfl_135_idx + "',135)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCol19_Internalname,GXutil.rtrim( A8701Col19),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,142);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCol19_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCol19_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1189_" + sGXsfl_135_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 143,'',false,'" + sGXsfl_135_idx + "',135)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColN19_Internalname,GXutil.rtrim( A8844ColN19),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,143);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColN19_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtColN19_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1189_" + sGXsfl_135_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 144,'',false,'" + sGXsfl_135_idx + "',135)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCodC19_Internalname,GXutil.rtrim( A8845CodC19),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,144);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCodC19_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCodC19_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1189_" + sGXsfl_135_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 145,'',false,'" + sGXsfl_135_idx + "',135)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNomC19_Internalname,GXutil.rtrim( A8846NomC19),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,145);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNomC19_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtNomC19_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1189_" + sGXsfl_135_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 146,'',false,'" + sGXsfl_135_idx + "',135)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTel19_Internalname,GXutil.ltrim( localUtil.ntoc( A8849Tel19, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTel19_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8849Tel19), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8849Tel19), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,146);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTel19_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTel19_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1189_" + sGXsfl_135_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 147,'',false,'" + sGXsfl_135_idx + "',135)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTura19_Internalname,GXutil.ltrim( localUtil.ntoc( A8850Tura19, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTura19_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8850Tura19), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8850Tura19), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,147);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTura19_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTura19_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1189_" + sGXsfl_135_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 148,'',false,'" + sGXsfl_135_idx + "',135)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTurb19_Internalname,GXutil.ltrim( localUtil.ntoc( A8851Turb19, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTurb19_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8851Turb19), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8851Turb19), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,148);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTurb19_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTurb19_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1189_" + sGXsfl_135_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 149,'',false,'" + sGXsfl_135_idx + "',135)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTurc19_Internalname,GXutil.ltrim( localUtil.ntoc( A8852Turc19, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTurc19_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8852Turc19), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8852Turc19), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,149);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTurc19_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTurc19_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1189_" + sGXsfl_135_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 150,'',false,'" + sGXsfl_135_idx + "',135)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColNN19_Internalname,GXutil.rtrim( A8865ColNN19),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,150);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColNN19_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtColNN19_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes12M1189( ) ;
      GXCCtl = "Z8696CodPz19_" + sGXsfl_135_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8696CodPz19));
      GXCCtl = "Z8697Kgs19_" + sGXsfl_135_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8697Kgs19, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8698Mts19_" + sGXsfl_135_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8698Mts19, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8699Dib19_" + sGXsfl_135_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8699Dib19));
      GXCCtl = "Z8700OT19_" + sGXsfl_135_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8700OT19));
      GXCCtl = "Z8701Col19_" + sGXsfl_135_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8701Col19));
      GXCCtl = "Z8844ColN19_" + sGXsfl_135_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8844ColN19));
      GXCCtl = "Z8845CodC19_" + sGXsfl_135_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8845CodC19));
      GXCCtl = "Z8846NomC19_" + sGXsfl_135_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8846NomC19));
      GXCCtl = "Z8849Tel19_" + sGXsfl_135_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8849Tel19, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8850Tura19_" + sGXsfl_135_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8850Tura19, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8851Turb19_" + sGXsfl_135_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8851Turb19, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8852Turc19_" + sGXsfl_135_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8852Turc19, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8865ColNN19_" + sGXsfl_135_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8865ColNN19));
      GXCCtl = "O8698Mts19_" + sGXsfl_135_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O8698Mts19, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O8697Kgs19_" + sGXsfl_135_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O8697Kgs19, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1189_" + sGXsfl_135_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1189, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1189_" + sGXsfl_135_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1189, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1189_" + sGXsfl_135_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1189, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1189_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1189_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CODPZ19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodPz19_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "KGS19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtKgs19_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MTS19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMts19_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DIB19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDib19_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OT19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOT19_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COL19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCol19_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLN19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColN19_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CODC19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCodC19_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "NOMC19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNomC19_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TEL19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTel19_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TURA19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTura19_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TURB19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTurb19_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TURC19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTurc19_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLNN19_"+sGXsfl_135_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColNN19_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow12M1189( )
   {
      nGXsfl_135_idx = (int)(nGXsfl_135_idx+1) ;
      sGXsfl_135_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_135_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1351189( ) ;
      edtavnRcdDeleted_1189_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1189_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCodPz19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CODPZ19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtKgs19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "KGS19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMts19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MTS19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDib19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DIB19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOT19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OT19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCol19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COL19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtColN19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLN19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCodC19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CODC19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtNomC19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NOMC19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTel19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TEL19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTura19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TURA19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTurb19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TURB19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTurc19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TURC19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtColNN19_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLNN19_"+sGXsfl_135_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1189_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1189_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1189");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1189_Internalname ;
         wbErr = true ;
         nRcdDeleted_1189 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1189 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1189_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A8696CodPz19 = httpContext.cgiGet( edtCodPz19_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtKgs19_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtKgs19_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "KGS19_" + sGXsfl_135_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtKgs19_Internalname ;
         wbErr = true ;
         A8697Kgs19 = DecimalUtil.ZERO ;
         n8697Kgs19 = false ;
      }
      else
      {
         A8697Kgs19 = localUtil.ctond( httpContext.cgiGet( edtKgs19_Internalname)) ;
         n8697Kgs19 = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMts19_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMts19_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MTS19_" + sGXsfl_135_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMts19_Internalname ;
         wbErr = true ;
         A8698Mts19 = DecimalUtil.ZERO ;
         n8698Mts19 = false ;
      }
      else
      {
         A8698Mts19 = localUtil.ctond( httpContext.cgiGet( edtMts19_Internalname)) ;
         n8698Mts19 = false ;
      }
      A8699Dib19 = httpContext.cgiGet( edtDib19_Internalname) ;
      n8699Dib19 = false ;
      A8700OT19 = httpContext.cgiGet( edtOT19_Internalname) ;
      n8700OT19 = false ;
      A8701Col19 = httpContext.cgiGet( edtCol19_Internalname) ;
      n8701Col19 = false ;
      A8844ColN19 = httpContext.cgiGet( edtColN19_Internalname) ;
      n8844ColN19 = false ;
      A8845CodC19 = httpContext.cgiGet( edtCodC19_Internalname) ;
      n8845CodC19 = false ;
      A8846NomC19 = httpContext.cgiGet( edtNomC19_Internalname) ;
      n8846NomC19 = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTel19_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTel19_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "TEL19_" + sGXsfl_135_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTel19_Internalname ;
         wbErr = true ;
         A8849Tel19 = (short)(0) ;
         n8849Tel19 = false ;
      }
      else
      {
         A8849Tel19 = (short)(localUtil.ctol( httpContext.cgiGet( edtTel19_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8849Tel19 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTura19_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTura19_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
      {
         GXCCtl = "TURA19_" + sGXsfl_135_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTura19_Internalname ;
         wbErr = true ;
         A8850Tura19 = 0 ;
         n8850Tura19 = false ;
      }
      else
      {
         A8850Tura19 = localUtil.ctol( httpContext.cgiGet( edtTura19_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n8850Tura19 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTurb19_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTurb19_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
      {
         GXCCtl = "TURB19_" + sGXsfl_135_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTurb19_Internalname ;
         wbErr = true ;
         A8851Turb19 = 0 ;
         n8851Turb19 = false ;
      }
      else
      {
         A8851Turb19 = localUtil.ctol( httpContext.cgiGet( edtTurb19_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n8851Turb19 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTurc19_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTurc19_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
      {
         GXCCtl = "TURC19_" + sGXsfl_135_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTurc19_Internalname ;
         wbErr = true ;
         A8852Turc19 = 0 ;
         n8852Turc19 = false ;
      }
      else
      {
         A8852Turc19 = localUtil.ctol( httpContext.cgiGet( edtTurc19_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n8852Turc19 = false ;
      }
      A8865ColNN19 = httpContext.cgiGet( edtColNN19_Internalname) ;
      n8865ColNN19 = false ;
      GXCCtl = "Z8696CodPz19_" + sGXsfl_135_idx ;
      Z8696CodPz19 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8697Kgs19_" + sGXsfl_135_idx ;
      Z8697Kgs19 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8698Mts19_" + sGXsfl_135_idx ;
      Z8698Mts19 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8699Dib19_" + sGXsfl_135_idx ;
      Z8699Dib19 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8700OT19_" + sGXsfl_135_idx ;
      Z8700OT19 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8701Col19_" + sGXsfl_135_idx ;
      Z8701Col19 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8844ColN19_" + sGXsfl_135_idx ;
      Z8844ColN19 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8845CodC19_" + sGXsfl_135_idx ;
      Z8845CodC19 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8846NomC19_" + sGXsfl_135_idx ;
      Z8846NomC19 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8849Tel19_" + sGXsfl_135_idx ;
      Z8849Tel19 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8850Tura19_" + sGXsfl_135_idx ;
      Z8850Tura19 = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z8851Turb19_" + sGXsfl_135_idx ;
      Z8851Turb19 = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z8852Turc19_" + sGXsfl_135_idx ;
      Z8852Turc19 = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z8865ColNN19_" + sGXsfl_135_idx ;
      Z8865ColNN19 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O8698Mts19_" + sGXsfl_135_idx ;
      O8698Mts19 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O8697Kgs19_" + sGXsfl_135_idx ;
      O8697Kgs19 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1189_" + sGXsfl_135_idx ;
      nRcdDeleted_1189 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1189_" + sGXsfl_135_idx ;
      nRcdExists_1189 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1189_" + sGXsfl_135_idx ;
      nIsMod_1189 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCodPz19_Enabled = edtCodPz19_Enabled ;
   }

   public void confirmValues12M0( )
   {
      nGXsfl_135_idx = 0 ;
      sGXsfl_135_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_135_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1351189( ) ;
      while ( nGXsfl_135_idx < nRC_GXsfl_135 )
      {
         nGXsfl_135_idx = (int)(nGXsfl_135_idx+1) ;
         sGXsfl_135_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_135_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1351189( ) ;
         httpContext.changePostValue( "Z8696CodPz19_"+sGXsfl_135_idx, httpContext.cgiGet( "ZT_"+"Z8696CodPz19_"+sGXsfl_135_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8696CodPz19_"+sGXsfl_135_idx) ;
         httpContext.changePostValue( "Z8697Kgs19_"+sGXsfl_135_idx, httpContext.cgiGet( "ZT_"+"Z8697Kgs19_"+sGXsfl_135_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8697Kgs19_"+sGXsfl_135_idx) ;
         httpContext.changePostValue( "Z8698Mts19_"+sGXsfl_135_idx, httpContext.cgiGet( "ZT_"+"Z8698Mts19_"+sGXsfl_135_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8698Mts19_"+sGXsfl_135_idx) ;
         httpContext.changePostValue( "Z8699Dib19_"+sGXsfl_135_idx, httpContext.cgiGet( "ZT_"+"Z8699Dib19_"+sGXsfl_135_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8699Dib19_"+sGXsfl_135_idx) ;
         httpContext.changePostValue( "Z8700OT19_"+sGXsfl_135_idx, httpContext.cgiGet( "ZT_"+"Z8700OT19_"+sGXsfl_135_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8700OT19_"+sGXsfl_135_idx) ;
         httpContext.changePostValue( "Z8701Col19_"+sGXsfl_135_idx, httpContext.cgiGet( "ZT_"+"Z8701Col19_"+sGXsfl_135_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8701Col19_"+sGXsfl_135_idx) ;
         httpContext.changePostValue( "Z8844ColN19_"+sGXsfl_135_idx, httpContext.cgiGet( "ZT_"+"Z8844ColN19_"+sGXsfl_135_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8844ColN19_"+sGXsfl_135_idx) ;
         httpContext.changePostValue( "Z8845CodC19_"+sGXsfl_135_idx, httpContext.cgiGet( "ZT_"+"Z8845CodC19_"+sGXsfl_135_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8845CodC19_"+sGXsfl_135_idx) ;
         httpContext.changePostValue( "Z8846NomC19_"+sGXsfl_135_idx, httpContext.cgiGet( "ZT_"+"Z8846NomC19_"+sGXsfl_135_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8846NomC19_"+sGXsfl_135_idx) ;
         httpContext.changePostValue( "Z8849Tel19_"+sGXsfl_135_idx, httpContext.cgiGet( "ZT_"+"Z8849Tel19_"+sGXsfl_135_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8849Tel19_"+sGXsfl_135_idx) ;
         httpContext.changePostValue( "Z8850Tura19_"+sGXsfl_135_idx, httpContext.cgiGet( "ZT_"+"Z8850Tura19_"+sGXsfl_135_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8850Tura19_"+sGXsfl_135_idx) ;
         httpContext.changePostValue( "Z8851Turb19_"+sGXsfl_135_idx, httpContext.cgiGet( "ZT_"+"Z8851Turb19_"+sGXsfl_135_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8851Turb19_"+sGXsfl_135_idx) ;
         httpContext.changePostValue( "Z8852Turc19_"+sGXsfl_135_idx, httpContext.cgiGet( "ZT_"+"Z8852Turc19_"+sGXsfl_135_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8852Turc19_"+sGXsfl_135_idx) ;
         httpContext.changePostValue( "Z8865ColNN19_"+sGXsfl_135_idx, httpContext.cgiGet( "ZT_"+"Z8865ColNN19_"+sGXsfl_135_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8865ColNN19_"+sGXsfl_135_idx) ;
      }
      httpContext.changePostValue( "O8698Mts19", httpContext.cgiGet( "T8698Mts19")) ;
      httpContext.deletePostValue( "T8698Mts19") ;
      httpContext.changePostValue( "O8697Kgs19", httpContext.cgiGet( "T8697Kgs19")) ;
      httpContext.deletePostValue( "T8697Kgs19") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tent19", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z8692NEnt19", GXutil.ltrim( localUtil.ntoc( Z8692NEnt19, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8693FEnt19", localUtil.ttoc( Z8693FEnt19, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8694NInt19", GXutil.rtrim( Z8694NInt19));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8695NPed19", GXutil.rtrim( Z8695NPed19));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8705NRecCod", GXutil.ltrim( localUtil.ntoc( Z8705NRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8706Nestado", GXutil.ltrim( localUtil.ntoc( Z8706Nestado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8708NUsucod", GXutil.rtrim( Z8708NUsucod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8709NObs", GXutil.rtrim( Z8709NObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8710NUsuMod", GXutil.rtrim( Z8710NUsuMod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8711NFecNota", localUtil.ttoc( Z8711NFecNota, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8841CliCod19", GXutil.ltrim( localUtil.ntoc( Z8841CliCod19, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8842CliNom19", GXutil.rtrim( Z8842CliNom19));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8772Art19", GXutil.rtrim( Z8772Art19));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8773DibC19", GXutil.rtrim( Z8773DibC19));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8843Art19Rd", GXutil.ltrim( localUtil.ntoc( Z8843Art19Rd, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8847Unid19", GXutil.rtrim( Z8847Unid19));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8770TipDocC", GXutil.ltrim( localUtil.ntoc( Z8770TipDocC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8702Tmts", GXutil.ltrim( localUtil.ntoc( O8702Tmts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8703Tpzs", GXutil.ltrim( localUtil.ntoc( O8703Tpzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8704Tkgr", GXutil.ltrim( localUtil.ntoc( O8704Tkgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_135", GXutil.ltrim( localUtil.ntoc( nGXsfl_135_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tent19", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TENT19" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ENTRADAS EN LA 19", "") ;
   }

   public void initializeNonKey12M1188( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A8693FEnt19 = GXutil.resetTime( GXutil.nullDate() );
      n8693FEnt19 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8693FEnt19", localUtil.ttoc( A8693FEnt19, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A8694NInt19 = "" ;
      n8694NInt19 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8694NInt19", A8694NInt19);
      A8695NPed19 = "" ;
      n8695NPed19 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8695NPed19", A8695NPed19);
      A8704Tkgr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
      A8702Tmts = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
      A8703Tpzs = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
      A8705NRecCod = 0 ;
      n8705NRecCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8705NRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8705NRecCod), 8, 0));
      A8706Nestado = (byte)(0) ;
      n8706Nestado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8706Nestado", GXutil.str( A8706Nestado, 1, 0));
      A8708NUsucod = "" ;
      n8708NUsucod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8708NUsucod", A8708NUsucod);
      A8709NObs = "" ;
      n8709NObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8709NObs", A8709NObs);
      A8710NUsuMod = "" ;
      n8710NUsuMod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8710NUsuMod", A8710NUsuMod);
      A8711NFecNota = GXutil.resetTime( GXutil.nullDate() );
      n8711NFecNota = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8711NFecNota", localUtil.ttoc( A8711NFecNota, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A8841CliCod19 = 0 ;
      n8841CliCod19 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8841CliCod19", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8841CliCod19), 6, 0));
      A8842CliNom19 = "" ;
      n8842CliNom19 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8842CliNom19", A8842CliNom19);
      A8770TipDocC = (short)(0) ;
      n8770TipDocC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8770TipDocC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8770TipDocC), 4, 0));
      A8771TipDocD = "" ;
      n8771TipDocD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8771TipDocD", A8771TipDocD);
      A8772Art19 = "" ;
      n8772Art19 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8772Art19", A8772Art19);
      A8773DibC19 = "" ;
      n8773DibC19 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8773DibC19", A8773DibC19);
      A8843Art19Rd = DecimalUtil.ZERO ;
      n8843Art19Rd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8843Art19Rd", GXutil.ltrimstr( A8843Art19Rd, 6, 2));
      A8847Unid19 = "" ;
      n8847Unid19 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8847Unid19", A8847Unid19);
      O8702Tmts = A8702Tmts ;
      httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
      O8703Tpzs = A8703Tpzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
      O8704Tkgr = A8704Tkgr ;
      httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
      Z8693FEnt19 = GXutil.resetTime( GXutil.nullDate() );
      Z8694NInt19 = "" ;
      Z8695NPed19 = "" ;
      Z8705NRecCod = 0 ;
      Z8706Nestado = (byte)(0) ;
      Z8708NUsucod = "" ;
      Z8709NObs = "" ;
      Z8710NUsuMod = "" ;
      Z8711NFecNota = GXutil.resetTime( GXutil.nullDate() );
      Z8841CliCod19 = 0 ;
      Z8842CliNom19 = "" ;
      Z8772Art19 = "" ;
      Z8773DibC19 = "" ;
      Z8843Art19Rd = DecimalUtil.ZERO ;
      Z8847Unid19 = "" ;
      Z8770TipDocC = (short)(0) ;
   }

   public void initAll12M1188( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A8692NEnt19 = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8692NEnt19", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8692NEnt19), 8, 0));
      initializeNonKey12M1188( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey12M1189( )
   {
      A8697Kgs19 = DecimalUtil.ZERO ;
      n8697Kgs19 = false ;
      A8698Mts19 = DecimalUtil.ZERO ;
      n8698Mts19 = false ;
      A8699Dib19 = "" ;
      n8699Dib19 = false ;
      A8700OT19 = "" ;
      n8700OT19 = false ;
      A8701Col19 = "" ;
      n8701Col19 = false ;
      A8844ColN19 = "" ;
      n8844ColN19 = false ;
      A8845CodC19 = "" ;
      n8845CodC19 = false ;
      A8846NomC19 = "" ;
      n8846NomC19 = false ;
      A8849Tel19 = (short)(0) ;
      n8849Tel19 = false ;
      A8850Tura19 = 0 ;
      n8850Tura19 = false ;
      A8851Turb19 = 0 ;
      n8851Turb19 = false ;
      A8852Turc19 = 0 ;
      n8852Turc19 = false ;
      A8865ColNN19 = "" ;
      n8865ColNN19 = false ;
      O8698Mts19 = A8698Mts19 ;
      n8698Mts19 = false ;
      O8697Kgs19 = A8697Kgs19 ;
      n8697Kgs19 = false ;
      Z8697Kgs19 = DecimalUtil.ZERO ;
      Z8698Mts19 = DecimalUtil.ZERO ;
      Z8699Dib19 = "" ;
      Z8700OT19 = "" ;
      Z8701Col19 = "" ;
      Z8844ColN19 = "" ;
      Z8845CodC19 = "" ;
      Z8846NomC19 = "" ;
      Z8849Tel19 = (short)(0) ;
      Z8850Tura19 = 0 ;
      Z8851Turb19 = 0 ;
      Z8852Turc19 = 0 ;
      Z8865ColNN19 = "" ;
   }

   public void initAll12M1189( )
   {
      A8696CodPz19 = "" ;
      initializeNonKey12M1189( ) ;
   }

   public void standaloneModalInsert12M1189( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824154269", true, true);
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
      httpContext.AddJavascriptSource("tent19.js", "?2026824154269", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1189( )
   {
      edtCodPz19_Enabled = defedtCodPz19_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodPz19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodPz19_Enabled), 5, 0), !bGXsfl_135_Refreshing);
   }

   public void startgridcontrol135( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1189, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1189_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8696CodPz19));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCodPz19_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8697Kgs19, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtKgs19_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8698Mts19, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMts19_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8699Dib19));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDib19_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8700OT19));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOT19_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8701Col19));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCol19_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8844ColN19));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtColN19_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8845CodC19));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCodC19_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8846NomC19));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtNomC19_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8849Tel19, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTel19_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8850Tura19, (byte)(10), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTura19_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8851Turb19, (byte)(10), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTurb19_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8852Turc19, (byte)(10), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTurc19_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8865ColNN19));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtColNN19_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtNEnt19_Internalname = "NENT19" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtFEnt19_Internalname = "FENT19" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtNInt19_Internalname = "NINT19" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtNPed19_Internalname = "NPED19" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtTkgr_Internalname = "TKGR" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtTmts_Internalname = "TMTS" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtTpzs_Internalname = "TPZS" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtNRecCod_Internalname = "NRECCOD" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtNestado_Internalname = "NESTADO" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtNUsucod_Internalname = "NUSUCOD" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtNObs_Internalname = "NOBS" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtNUsuMod_Internalname = "NUSUMOD" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtNFecNota_Internalname = "NFECNOTA" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtCliCod19_Internalname = "CLICOD19" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtCliNom19_Internalname = "CLINOM19" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtTipDocC_Internalname = "TIPDOCC" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtTipDocD_Internalname = "TIPDOCD" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtArt19_Internalname = "ART19" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtDibC19_Internalname = "DIBC19" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtArt19Rd_Internalname = "ART19RD" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtUnid19_Internalname = "UNID19" ;
      edtavnRcdDeleted_1189_Internalname = "vNRCDDELETED_1189" ;
      edtCodPz19_Internalname = "CODPZ19" ;
      edtKgs19_Internalname = "KGS19" ;
      edtMts19_Internalname = "MTS19" ;
      edtDib19_Internalname = "DIB19" ;
      edtOT19_Internalname = "OT19" ;
      edtCol19_Internalname = "COL19" ;
      edtColN19_Internalname = "COLN19" ;
      edtCodC19_Internalname = "CODC19" ;
      edtNomC19_Internalname = "NOMC19" ;
      edtTel19_Internalname = "TEL19" ;
      edtTura19_Internalname = "TURA19" ;
      edtTurb19_Internalname = "TURB19" ;
      edtTurc19_Internalname = "TURC19" ;
      edtColNN19_Internalname = "COLNN19" ;
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
      Form.setCaption( httpContext.getMessage( "ENTRADAS EN LA 19", "") );
      edtColNN19_Jsonclick = "" ;
      edtTurc19_Jsonclick = "" ;
      edtTurb19_Jsonclick = "" ;
      edtTura19_Jsonclick = "" ;
      edtTel19_Jsonclick = "" ;
      edtNomC19_Jsonclick = "" ;
      edtCodC19_Jsonclick = "" ;
      edtColN19_Jsonclick = "" ;
      edtCol19_Jsonclick = "" ;
      edtOT19_Jsonclick = "" ;
      edtDib19_Jsonclick = "" ;
      edtMts19_Jsonclick = "" ;
      edtKgs19_Jsonclick = "" ;
      edtCodPz19_Jsonclick = "" ;
      edtavnRcdDeleted_1189_Jsonclick = "" ;
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
      edtColNN19_Enabled = 1 ;
      edtTurc19_Enabled = 1 ;
      edtTurb19_Enabled = 1 ;
      edtTura19_Enabled = 1 ;
      edtTel19_Enabled = 1 ;
      edtNomC19_Enabled = 1 ;
      edtCodC19_Enabled = 1 ;
      edtColN19_Enabled = 1 ;
      edtCol19_Enabled = 1 ;
      edtOT19_Enabled = 1 ;
      edtDib19_Enabled = 1 ;
      edtMts19_Enabled = 1 ;
      edtKgs19_Enabled = 1 ;
      edtCodPz19_Enabled = 1 ;
      edtavnRcdDeleted_1189_Enabled = 1 ;
      edtUnid19_Jsonclick = "" ;
      edtUnid19_Backcolor = (int)(0xFFFFFF) ;
      edtUnid19_Enabled = 1 ;
      edtArt19Rd_Jsonclick = "" ;
      edtArt19Rd_Backcolor = (int)(0xFFFFFF) ;
      edtArt19Rd_Enabled = 1 ;
      edtDibC19_Jsonclick = "" ;
      edtDibC19_Backcolor = (int)(0xFFFFFF) ;
      edtDibC19_Enabled = 1 ;
      edtArt19_Jsonclick = "" ;
      edtArt19_Backcolor = (int)(0xFFFFFF) ;
      edtArt19_Enabled = 1 ;
      edtTipDocD_Jsonclick = "" ;
      edtTipDocD_Backcolor = (int)(0xFFFFFF) ;
      edtTipDocD_Enabled = 0 ;
      edtTipDocC_Jsonclick = "" ;
      edtTipDocC_Backcolor = (int)(0xFFFFFF) ;
      edtTipDocC_Enabled = 1 ;
      edtCliNom19_Jsonclick = "" ;
      edtCliNom19_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom19_Enabled = 1 ;
      edtCliCod19_Jsonclick = "" ;
      edtCliCod19_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod19_Enabled = 1 ;
      edtNFecNota_Jsonclick = "" ;
      edtNFecNota_Backcolor = (int)(0xFFFFFF) ;
      edtNFecNota_Enabled = 1 ;
      edtNUsuMod_Jsonclick = "" ;
      edtNUsuMod_Backcolor = (int)(0xFFFFFF) ;
      edtNUsuMod_Enabled = 1 ;
      edtNObs_Backcolor = (int)(0xFFFFFF) ;
      edtNObs_Enabled = 1 ;
      edtNUsucod_Jsonclick = "" ;
      edtNUsucod_Backcolor = (int)(0xFFFFFF) ;
      edtNUsucod_Enabled = 1 ;
      edtNestado_Jsonclick = "" ;
      edtNestado_Backcolor = (int)(0xFFFFFF) ;
      edtNestado_Enabled = 1 ;
      edtNRecCod_Jsonclick = "" ;
      edtNRecCod_Backcolor = (int)(0xFFFFFF) ;
      edtNRecCod_Enabled = 1 ;
      edtTpzs_Jsonclick = "" ;
      edtTpzs_Backcolor = (int)(0xFFFFFF) ;
      edtTpzs_Enabled = 0 ;
      edtTmts_Jsonclick = "" ;
      edtTmts_Backcolor = (int)(0xFFFFFF) ;
      edtTmts_Enabled = 0 ;
      edtTkgr_Jsonclick = "" ;
      edtTkgr_Backcolor = (int)(0xFFFFFF) ;
      edtTkgr_Enabled = 0 ;
      edtNPed19_Jsonclick = "" ;
      edtNPed19_Backcolor = (int)(0xFFFFFF) ;
      edtNPed19_Enabled = 1 ;
      edtNInt19_Jsonclick = "" ;
      edtNInt19_Backcolor = (int)(0xFFFFFF) ;
      edtNInt19_Enabled = 1 ;
      edtFEnt19_Jsonclick = "" ;
      edtFEnt19_Backcolor = (int)(0xFFFFFF) ;
      edtFEnt19_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtNEnt19_Jsonclick = "" ;
      edtNEnt19_Backcolor = (int)(0xFFFFFF) ;
      edtNEnt19_Enabled = 1 ;
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
      subsflControlProps_1351189( ) ;
      while ( nGXsfl_135_idx <= nRC_GXsfl_135 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal12M1189( ) ;
         standaloneModal12M1189( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow12M1189( ) ;
         nGXsfl_135_idx = (int)(nGXsfl_135_idx+1) ;
         sGXsfl_135_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_135_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1351189( ) ;
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
      /* Using cursor T012M22 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T012M22_A407EmprNom[0] ;
      n407EmprNom = T012M22_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(17);
      /* Using cursor T012M24 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A8692NEnt19)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         A8704Tkgr = T012M24_A8704Tkgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
         A8702Tmts = T012M24_A8702Tmts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
         A8703Tpzs = T012M24_A8703Tpzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
      }
      else
      {
         A8704Tkgr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrimstr( A8704Tkgr, 9, 2));
         A8702Tmts = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrimstr( A8702Tmts, 9, 2));
         A8703Tpzs = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8703Tpzs), 6, 0));
      }
      pr_default.close(18);
      GX_FocusControl = edtFEnt19_Internalname ;
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
      /* Using cursor T012M22 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T012M22_A407EmprNom[0] ;
      n407EmprNom = T012M22_n407EmprNom[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Nent19( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T012M24 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A8692NEnt19)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         A8704Tkgr = T012M24_A8704Tkgr[0] ;
         A8702Tmts = T012M24_A8702Tmts[0] ;
         A8703Tpzs = T012M24_A8703Tpzs[0] ;
      }
      else
      {
         A8704Tkgr = DecimalUtil.doubleToDec(0) ;
         A8702Tmts = DecimalUtil.doubleToDec(0) ;
         A8703Tpzs = 0 ;
      }
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8693FEnt19", localUtil.ttoc( A8693FEnt19, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A8694NInt19", GXutil.rtrim( A8694NInt19));
      httpContext.ajax_rsp_assign_attri("", false, "A8695NPed19", GXutil.rtrim( A8695NPed19));
      httpContext.ajax_rsp_assign_attri("", false, "A8705NRecCod", GXutil.ltrim( localUtil.ntoc( A8705NRecCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8706Nestado", GXutil.ltrim( localUtil.ntoc( A8706Nestado, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8708NUsucod", GXutil.rtrim( A8708NUsucod));
      httpContext.ajax_rsp_assign_attri("", false, "A8709NObs", GXutil.rtrim( A8709NObs));
      httpContext.ajax_rsp_assign_attri("", false, "A8710NUsuMod", GXutil.rtrim( A8710NUsuMod));
      httpContext.ajax_rsp_assign_attri("", false, "A8711NFecNota", localUtil.ttoc( A8711NFecNota, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A8841CliCod19", GXutil.ltrim( localUtil.ntoc( A8841CliCod19, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8842CliNom19", GXutil.rtrim( A8842CliNom19));
      httpContext.ajax_rsp_assign_attri("", false, "A8770TipDocC", GXutil.ltrim( localUtil.ntoc( A8770TipDocC, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8772Art19", GXutil.rtrim( A8772Art19));
      httpContext.ajax_rsp_assign_attri("", false, "A8773DibC19", GXutil.rtrim( A8773DibC19));
      httpContext.ajax_rsp_assign_attri("", false, "A8843Art19Rd", GXutil.ltrim( localUtil.ntoc( A8843Art19Rd, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8847Unid19", GXutil.rtrim( A8847Unid19));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A8771TipDocD", GXutil.rtrim( A8771TipDocD));
      httpContext.ajax_rsp_assign_attri("", false, "A8704Tkgr", GXutil.ltrim( localUtil.ntoc( A8704Tkgr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8702Tmts", GXutil.ltrim( localUtil.ntoc( A8702Tmts, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8703Tpzs", GXutil.ltrim( localUtil.ntoc( A8703Tpzs, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8692NEnt19", GXutil.ltrim( localUtil.ntoc( Z8692NEnt19, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8693FEnt19", localUtil.ttoc( Z8693FEnt19, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8694NInt19", GXutil.rtrim( Z8694NInt19));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8695NPed19", GXutil.rtrim( Z8695NPed19));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8705NRecCod", GXutil.ltrim( localUtil.ntoc( Z8705NRecCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8706Nestado", GXutil.ltrim( localUtil.ntoc( Z8706Nestado, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8708NUsucod", GXutil.rtrim( Z8708NUsucod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8709NObs", GXutil.rtrim( Z8709NObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8710NUsuMod", GXutil.rtrim( Z8710NUsuMod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8711NFecNota", localUtil.ttoc( Z8711NFecNota, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8841CliCod19", GXutil.ltrim( localUtil.ntoc( Z8841CliCod19, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8842CliNom19", GXutil.rtrim( Z8842CliNom19));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8770TipDocC", GXutil.ltrim( localUtil.ntoc( Z8770TipDocC, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8772Art19", GXutil.rtrim( Z8772Art19));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8773DibC19", GXutil.rtrim( Z8773DibC19));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8843Art19Rd", GXutil.ltrim( localUtil.ntoc( Z8843Art19Rd, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8847Unid19", GXutil.rtrim( Z8847Unid19));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8771TipDocD", GXutil.rtrim( Z8771TipDocD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8704Tkgr", GXutil.ltrim( localUtil.ntoc( Z8704Tkgr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8702Tmts", GXutil.ltrim( localUtil.ntoc( Z8702Tmts, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8703Tpzs", GXutil.ltrim( localUtil.ntoc( Z8703Tpzs, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8702Tmts", GXutil.ltrim( localUtil.ntoc( O8702Tmts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8703Tpzs", GXutil.ltrim( localUtil.ntoc( O8703Tpzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8704Tkgr", GXutil.ltrim( localUtil.ntoc( O8704Tkgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Tipdocc( )
   {
      n8770TipDocC = false ;
      n8771TipDocD = false ;
      /* Using cursor T012M25 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n8770TipDocC), Short.valueOf(A8770TipDocC)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDOC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDOCC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A8771TipDocD = T012M25_A8771TipDocD[0] ;
      n8771TipDocD = T012M25_n8771TipDocD[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8771TipDocD", GXutil.rtrim( A8771TipDocD));
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
      setEventMetadata("VALID_NENT19","{handler:'valid_Nent19',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8692NEnt19',fld:'NENT19',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_NENT19",",oparms:[{av:'A8693FEnt19',fld:'FENT19',pic:'99/99/99 99:99:99'},{av:'A8694NInt19',fld:'NINT19',pic:''},{av:'A8695NPed19',fld:'NPED19',pic:''},{av:'A8705NRecCod',fld:'NRECCOD',pic:'ZZZZZZZ9'},{av:'A8706Nestado',fld:'NESTADO',pic:'9'},{av:'A8708NUsucod',fld:'NUSUCOD',pic:'@!'},{av:'A8709NObs',fld:'NOBS',pic:''},{av:'A8710NUsuMod',fld:'NUSUMOD',pic:'@!'},{av:'A8711NFecNota',fld:'NFECNOTA',pic:'99/99/99 99:99:99'},{av:'A8841CliCod19',fld:'CLICOD19',pic:'ZZZZZ9'},{av:'A8842CliNom19',fld:'CLINOM19',pic:''},{av:'A8770TipDocC',fld:'TIPDOCC',pic:'ZZZ9'},{av:'A8772Art19',fld:'ART19',pic:''},{av:'A8773DibC19',fld:'DIBC19',pic:''},{av:'A8843Art19Rd',fld:'ART19RD',pic:'ZZ9.99'},{av:'A8847Unid19',fld:'UNID19',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A8771TipDocD',fld:'TIPDOCD',pic:''},{av:'A8704Tkgr',fld:'TKGR',pic:'ZZZZZ9.99'},{av:'A8702Tmts',fld:'TMTS',pic:'ZZZZZ9.99'},{av:'A8703Tpzs',fld:'TPZS',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z8692NEnt19'},{av:'Z8693FEnt19'},{av:'Z8694NInt19'},{av:'Z8695NPed19'},{av:'Z8705NRecCod'},{av:'Z8706Nestado'},{av:'Z8708NUsucod'},{av:'Z8709NObs'},{av:'Z8710NUsuMod'},{av:'Z8711NFecNota'},{av:'Z8841CliCod19'},{av:'Z8842CliNom19'},{av:'Z8770TipDocC'},{av:'Z8772Art19'},{av:'Z8773DibC19'},{av:'Z8843Art19Rd'},{av:'Z8847Unid19'},{av:'Z407EmprNom'},{av:'Z8771TipDocD'},{av:'Z8704Tkgr'},{av:'Z8702Tmts'},{av:'Z8703Tpzs'},{av:'O8702Tmts'},{av:'O8703Tpzs'},{av:'O8704Tkgr'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_TIPDOCC","{handler:'valid_Tipdocc',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8770TipDocC',fld:'TIPDOCC',pic:'ZZZ9'},{av:'A8771TipDocD',fld:'TIPDOCD',pic:''}]");
      setEventMetadata("VALID_TIPDOCC",",oparms:[{av:'A8771TipDocD',fld:'TIPDOCD',pic:''}]}");
      setEventMetadata("VALID_CODPZ19","{handler:'valid_Codpz19',iparms:[]");
      setEventMetadata("VALID_CODPZ19",",oparms:[]}");
      setEventMetadata("VALID_KGS19","{handler:'valid_Kgs19',iparms:[]");
      setEventMetadata("VALID_KGS19",",oparms:[]}");
      setEventMetadata("VALID_MTS19","{handler:'valid_Mts19',iparms:[]");
      setEventMetadata("VALID_MTS19",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Colnn19',iparms:[]");
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
      pr_default.close(17);
      pr_default.close(19);
      pr_default.close(18);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z8693FEnt19 = GXutil.resetTime( GXutil.nullDate() );
      Z8694NInt19 = "" ;
      Z8695NPed19 = "" ;
      Z8708NUsucod = "" ;
      Z8709NObs = "" ;
      Z8710NUsuMod = "" ;
      Z8711NFecNota = GXutil.resetTime( GXutil.nullDate() );
      Z8842CliNom19 = "" ;
      Z8772Art19 = "" ;
      Z8773DibC19 = "" ;
      Z8843Art19Rd = DecimalUtil.ZERO ;
      Z8847Unid19 = "" ;
      O8702Tmts = DecimalUtil.ZERO ;
      O8704Tkgr = DecimalUtil.ZERO ;
      Z8696CodPz19 = "" ;
      Z8697Kgs19 = DecimalUtil.ZERO ;
      Z8698Mts19 = DecimalUtil.ZERO ;
      Z8699Dib19 = "" ;
      Z8700OT19 = "" ;
      Z8701Col19 = "" ;
      Z8844ColN19 = "" ;
      Z8845CodC19 = "" ;
      Z8846NomC19 = "" ;
      Z8865ColNN19 = "" ;
      O8698Mts19 = DecimalUtil.ZERO ;
      O8697Kgs19 = DecimalUtil.ZERO ;
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
      A8693FEnt19 = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock5_Jsonclick = "" ;
      A8694NInt19 = "" ;
      lblTextblock6_Jsonclick = "" ;
      A8695NPed19 = "" ;
      lblTextblock7_Jsonclick = "" ;
      A8704Tkgr = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      A8702Tmts = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A8708NUsucod = "" ;
      lblTextblock13_Jsonclick = "" ;
      A8709NObs = "" ;
      lblTextblock14_Jsonclick = "" ;
      A8710NUsuMod = "" ;
      lblTextblock15_Jsonclick = "" ;
      A8711NFecNota = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      A8842CliNom19 = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      A8771TipDocD = "" ;
      lblTextblock20_Jsonclick = "" ;
      A8772Art19 = "" ;
      lblTextblock21_Jsonclick = "" ;
      A8773DibC19 = "" ;
      lblTextblock22_Jsonclick = "" ;
      A8843Art19Rd = DecimalUtil.ZERO ;
      lblTextblock23_Jsonclick = "" ;
      A8847Unid19 = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B8702Tmts = DecimalUtil.ZERO ;
      B8704Tkgr = DecimalUtil.ZERO ;
      sMode1189 = "" ;
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
      sMode1188 = "" ;
      s8702Tmts = DecimalUtil.ZERO ;
      s8704Tkgr = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A8696CodPz19 = "" ;
      A8697Kgs19 = DecimalUtil.ZERO ;
      A8698Mts19 = DecimalUtil.ZERO ;
      A8699Dib19 = "" ;
      A8700OT19 = "" ;
      A8701Col19 = "" ;
      A8844ColN19 = "" ;
      A8845CodC19 = "" ;
      A8846NomC19 = "" ;
      A8865ColNN19 = "" ;
      T8698Mts19 = DecimalUtil.ZERO ;
      T8697Kgs19 = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      Z8704Tkgr = DecimalUtil.ZERO ;
      Z8702Tmts = DecimalUtil.ZERO ;
      Z8771TipDocD = "" ;
      T012M11_A8692NEnt19 = new int[1] ;
      T012M11_A407EmprNom = new String[] {""} ;
      T012M11_n407EmprNom = new boolean[] {false} ;
      T012M11_A8693FEnt19 = new java.util.Date[] {GXutil.nullDate()} ;
      T012M11_n8693FEnt19 = new boolean[] {false} ;
      T012M11_A8694NInt19 = new String[] {""} ;
      T012M11_n8694NInt19 = new boolean[] {false} ;
      T012M11_A8695NPed19 = new String[] {""} ;
      T012M11_n8695NPed19 = new boolean[] {false} ;
      T012M11_A8705NRecCod = new int[1] ;
      T012M11_n8705NRecCod = new boolean[] {false} ;
      T012M11_A8706Nestado = new byte[1] ;
      T012M11_n8706Nestado = new boolean[] {false} ;
      T012M11_A8708NUsucod = new String[] {""} ;
      T012M11_n8708NUsucod = new boolean[] {false} ;
      T012M11_A8709NObs = new String[] {""} ;
      T012M11_n8709NObs = new boolean[] {false} ;
      T012M11_A8710NUsuMod = new String[] {""} ;
      T012M11_n8710NUsuMod = new boolean[] {false} ;
      T012M11_A8711NFecNota = new java.util.Date[] {GXutil.nullDate()} ;
      T012M11_n8711NFecNota = new boolean[] {false} ;
      T012M11_A8841CliCod19 = new int[1] ;
      T012M11_n8841CliCod19 = new boolean[] {false} ;
      T012M11_A8842CliNom19 = new String[] {""} ;
      T012M11_n8842CliNom19 = new boolean[] {false} ;
      T012M11_A8771TipDocD = new String[] {""} ;
      T012M11_n8771TipDocD = new boolean[] {false} ;
      T012M11_A8772Art19 = new String[] {""} ;
      T012M11_n8772Art19 = new boolean[] {false} ;
      T012M11_A8773DibC19 = new String[] {""} ;
      T012M11_n8773DibC19 = new boolean[] {false} ;
      T012M11_A8843Art19Rd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012M11_n8843Art19Rd = new boolean[] {false} ;
      T012M11_A8847Unid19 = new String[] {""} ;
      T012M11_n8847Unid19 = new boolean[] {false} ;
      T012M11_A396EmprCod = new String[] {""} ;
      T012M11_A8770TipDocC = new short[1] ;
      T012M11_n8770TipDocC = new boolean[] {false} ;
      T012M11_A8704Tkgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012M11_A8702Tmts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012M11_A8703Tpzs = new int[1] ;
      T012M6_A407EmprNom = new String[] {""} ;
      T012M6_n407EmprNom = new boolean[] {false} ;
      T012M7_A8771TipDocD = new String[] {""} ;
      T012M7_n8771TipDocD = new boolean[] {false} ;
      T012M9_A8704Tkgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012M9_A8702Tmts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012M9_A8703Tpzs = new int[1] ;
      T012M12_A407EmprNom = new String[] {""} ;
      T012M12_n407EmprNom = new boolean[] {false} ;
      T012M13_A8771TipDocD = new String[] {""} ;
      T012M13_n8771TipDocD = new boolean[] {false} ;
      T012M15_A8704Tkgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012M15_A8702Tmts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012M15_A8703Tpzs = new int[1] ;
      T012M16_A396EmprCod = new String[] {""} ;
      T012M16_A8692NEnt19 = new int[1] ;
      T012M5_A8692NEnt19 = new int[1] ;
      T012M5_A8693FEnt19 = new java.util.Date[] {GXutil.nullDate()} ;
      T012M5_n8693FEnt19 = new boolean[] {false} ;
      T012M5_A8694NInt19 = new String[] {""} ;
      T012M5_n8694NInt19 = new boolean[] {false} ;
      T012M5_A8695NPed19 = new String[] {""} ;
      T012M5_n8695NPed19 = new boolean[] {false} ;
      T012M5_A8705NRecCod = new int[1] ;
      T012M5_n8705NRecCod = new boolean[] {false} ;
      T012M5_A8706Nestado = new byte[1] ;
      T012M5_n8706Nestado = new boolean[] {false} ;
      T012M5_A8708NUsucod = new String[] {""} ;
      T012M5_n8708NUsucod = new boolean[] {false} ;
      T012M5_A8709NObs = new String[] {""} ;
      T012M5_n8709NObs = new boolean[] {false} ;
      T012M5_A8710NUsuMod = new String[] {""} ;
      T012M5_n8710NUsuMod = new boolean[] {false} ;
      T012M5_A8711NFecNota = new java.util.Date[] {GXutil.nullDate()} ;
      T012M5_n8711NFecNota = new boolean[] {false} ;
      T012M5_A8841CliCod19 = new int[1] ;
      T012M5_n8841CliCod19 = new boolean[] {false} ;
      T012M5_A8842CliNom19 = new String[] {""} ;
      T012M5_n8842CliNom19 = new boolean[] {false} ;
      T012M5_A8772Art19 = new String[] {""} ;
      T012M5_n8772Art19 = new boolean[] {false} ;
      T012M5_A8773DibC19 = new String[] {""} ;
      T012M5_n8773DibC19 = new boolean[] {false} ;
      T012M5_A8843Art19Rd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012M5_n8843Art19Rd = new boolean[] {false} ;
      T012M5_A8847Unid19 = new String[] {""} ;
      T012M5_n8847Unid19 = new boolean[] {false} ;
      T012M5_A396EmprCod = new String[] {""} ;
      T012M5_A8770TipDocC = new short[1] ;
      T012M5_n8770TipDocC = new boolean[] {false} ;
      T012M17_A396EmprCod = new String[] {""} ;
      T012M17_A8692NEnt19 = new int[1] ;
      T012M18_A396EmprCod = new String[] {""} ;
      T012M18_A8692NEnt19 = new int[1] ;
      T012M4_A8692NEnt19 = new int[1] ;
      T012M4_A8693FEnt19 = new java.util.Date[] {GXutil.nullDate()} ;
      T012M4_n8693FEnt19 = new boolean[] {false} ;
      T012M4_A8694NInt19 = new String[] {""} ;
      T012M4_n8694NInt19 = new boolean[] {false} ;
      T012M4_A8695NPed19 = new String[] {""} ;
      T012M4_n8695NPed19 = new boolean[] {false} ;
      T012M4_A8705NRecCod = new int[1] ;
      T012M4_n8705NRecCod = new boolean[] {false} ;
      T012M4_A8706Nestado = new byte[1] ;
      T012M4_n8706Nestado = new boolean[] {false} ;
      T012M4_A8708NUsucod = new String[] {""} ;
      T012M4_n8708NUsucod = new boolean[] {false} ;
      T012M4_A8709NObs = new String[] {""} ;
      T012M4_n8709NObs = new boolean[] {false} ;
      T012M4_A8710NUsuMod = new String[] {""} ;
      T012M4_n8710NUsuMod = new boolean[] {false} ;
      T012M4_A8711NFecNota = new java.util.Date[] {GXutil.nullDate()} ;
      T012M4_n8711NFecNota = new boolean[] {false} ;
      T012M4_A8841CliCod19 = new int[1] ;
      T012M4_n8841CliCod19 = new boolean[] {false} ;
      T012M4_A8842CliNom19 = new String[] {""} ;
      T012M4_n8842CliNom19 = new boolean[] {false} ;
      T012M4_A8772Art19 = new String[] {""} ;
      T012M4_n8772Art19 = new boolean[] {false} ;
      T012M4_A8773DibC19 = new String[] {""} ;
      T012M4_n8773DibC19 = new boolean[] {false} ;
      T012M4_A8843Art19Rd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012M4_n8843Art19Rd = new boolean[] {false} ;
      T012M4_A8847Unid19 = new String[] {""} ;
      T012M4_n8847Unid19 = new boolean[] {false} ;
      T012M4_A396EmprCod = new String[] {""} ;
      T012M4_A8770TipDocC = new short[1] ;
      T012M4_n8770TipDocC = new boolean[] {false} ;
      T012M22_A407EmprNom = new String[] {""} ;
      T012M22_n407EmprNom = new boolean[] {false} ;
      T012M24_A8704Tkgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012M24_A8702Tmts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012M24_A8703Tpzs = new int[1] ;
      T012M25_A8771TipDocD = new String[] {""} ;
      T012M25_n8771TipDocD = new boolean[] {false} ;
      T012M26_A396EmprCod = new String[] {""} ;
      T012M26_A8692NEnt19 = new int[1] ;
      T012M27_A396EmprCod = new String[] {""} ;
      T012M27_A8692NEnt19 = new int[1] ;
      T012M27_A8696CodPz19 = new String[] {""} ;
      T012M27_A8697Kgs19 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012M27_n8697Kgs19 = new boolean[] {false} ;
      T012M27_A8698Mts19 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012M27_n8698Mts19 = new boolean[] {false} ;
      T012M27_A8699Dib19 = new String[] {""} ;
      T012M27_n8699Dib19 = new boolean[] {false} ;
      T012M27_A8700OT19 = new String[] {""} ;
      T012M27_n8700OT19 = new boolean[] {false} ;
      T012M27_A8701Col19 = new String[] {""} ;
      T012M27_n8701Col19 = new boolean[] {false} ;
      T012M27_A8844ColN19 = new String[] {""} ;
      T012M27_n8844ColN19 = new boolean[] {false} ;
      T012M27_A8845CodC19 = new String[] {""} ;
      T012M27_n8845CodC19 = new boolean[] {false} ;
      T012M27_A8846NomC19 = new String[] {""} ;
      T012M27_n8846NomC19 = new boolean[] {false} ;
      T012M27_A8849Tel19 = new short[1] ;
      T012M27_n8849Tel19 = new boolean[] {false} ;
      T012M27_A8850Tura19 = new long[1] ;
      T012M27_n8850Tura19 = new boolean[] {false} ;
      T012M27_A8851Turb19 = new long[1] ;
      T012M27_n8851Turb19 = new boolean[] {false} ;
      T012M27_A8852Turc19 = new long[1] ;
      T012M27_n8852Turc19 = new boolean[] {false} ;
      T012M27_A8865ColNN19 = new String[] {""} ;
      T012M27_n8865ColNN19 = new boolean[] {false} ;
      T012M28_A396EmprCod = new String[] {""} ;
      T012M28_A8692NEnt19 = new int[1] ;
      T012M28_A8696CodPz19 = new String[] {""} ;
      T012M3_A396EmprCod = new String[] {""} ;
      T012M3_A8692NEnt19 = new int[1] ;
      T012M3_A8696CodPz19 = new String[] {""} ;
      T012M3_A8697Kgs19 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012M3_n8697Kgs19 = new boolean[] {false} ;
      T012M3_A8698Mts19 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012M3_n8698Mts19 = new boolean[] {false} ;
      T012M3_A8699Dib19 = new String[] {""} ;
      T012M3_n8699Dib19 = new boolean[] {false} ;
      T012M3_A8700OT19 = new String[] {""} ;
      T012M3_n8700OT19 = new boolean[] {false} ;
      T012M3_A8701Col19 = new String[] {""} ;
      T012M3_n8701Col19 = new boolean[] {false} ;
      T012M3_A8844ColN19 = new String[] {""} ;
      T012M3_n8844ColN19 = new boolean[] {false} ;
      T012M3_A8845CodC19 = new String[] {""} ;
      T012M3_n8845CodC19 = new boolean[] {false} ;
      T012M3_A8846NomC19 = new String[] {""} ;
      T012M3_n8846NomC19 = new boolean[] {false} ;
      T012M3_A8849Tel19 = new short[1] ;
      T012M3_n8849Tel19 = new boolean[] {false} ;
      T012M3_A8850Tura19 = new long[1] ;
      T012M3_n8850Tura19 = new boolean[] {false} ;
      T012M3_A8851Turb19 = new long[1] ;
      T012M3_n8851Turb19 = new boolean[] {false} ;
      T012M3_A8852Turc19 = new long[1] ;
      T012M3_n8852Turc19 = new boolean[] {false} ;
      T012M3_A8865ColNN19 = new String[] {""} ;
      T012M3_n8865ColNN19 = new boolean[] {false} ;
      T012M2_A396EmprCod = new String[] {""} ;
      T012M2_A8692NEnt19 = new int[1] ;
      T012M2_A8696CodPz19 = new String[] {""} ;
      T012M2_A8697Kgs19 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012M2_n8697Kgs19 = new boolean[] {false} ;
      T012M2_A8698Mts19 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012M2_n8698Mts19 = new boolean[] {false} ;
      T012M2_A8699Dib19 = new String[] {""} ;
      T012M2_n8699Dib19 = new boolean[] {false} ;
      T012M2_A8700OT19 = new String[] {""} ;
      T012M2_n8700OT19 = new boolean[] {false} ;
      T012M2_A8701Col19 = new String[] {""} ;
      T012M2_n8701Col19 = new boolean[] {false} ;
      T012M2_A8844ColN19 = new String[] {""} ;
      T012M2_n8844ColN19 = new boolean[] {false} ;
      T012M2_A8845CodC19 = new String[] {""} ;
      T012M2_n8845CodC19 = new boolean[] {false} ;
      T012M2_A8846NomC19 = new String[] {""} ;
      T012M2_n8846NomC19 = new boolean[] {false} ;
      T012M2_A8849Tel19 = new short[1] ;
      T012M2_n8849Tel19 = new boolean[] {false} ;
      T012M2_A8850Tura19 = new long[1] ;
      T012M2_n8850Tura19 = new boolean[] {false} ;
      T012M2_A8851Turb19 = new long[1] ;
      T012M2_n8851Turb19 = new boolean[] {false} ;
      T012M2_A8852Turc19 = new long[1] ;
      T012M2_n8852Turc19 = new boolean[] {false} ;
      T012M2_A8865ColNN19 = new String[] {""} ;
      T012M2_n8865ColNN19 = new boolean[] {false} ;
      T012M32_A396EmprCod = new String[] {""} ;
      T012M32_A8692NEnt19 = new int[1] ;
      T012M32_A8696CodPz19 = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ8693FEnt19 = GXutil.resetTime( GXutil.nullDate() );
      ZZ8694NInt19 = "" ;
      ZZ8695NPed19 = "" ;
      ZZ8708NUsucod = "" ;
      ZZ8709NObs = "" ;
      ZZ8710NUsuMod = "" ;
      ZZ8711NFecNota = GXutil.resetTime( GXutil.nullDate() );
      ZZ8842CliNom19 = "" ;
      ZZ8772Art19 = "" ;
      ZZ8773DibC19 = "" ;
      ZZ8843Art19Rd = DecimalUtil.ZERO ;
      ZZ8847Unid19 = "" ;
      ZZ407EmprNom = "" ;
      ZZ8771TipDocD = "" ;
      ZZ8704Tkgr = DecimalUtil.ZERO ;
      ZZ8702Tmts = DecimalUtil.ZERO ;
      ZO8702Tmts = DecimalUtil.ZERO ;
      ZO8704Tkgr = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tent19__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tent19__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tent19__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tent19__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tent19__default(),
         new Object[] {
             new Object[] {
            T012M2_A396EmprCod, T012M2_A8692NEnt19, T012M2_A8696CodPz19, T012M2_A8697Kgs19, T012M2_n8697Kgs19, T012M2_A8698Mts19, T012M2_n8698Mts19, T012M2_A8699Dib19, T012M2_n8699Dib19, T012M2_A8700OT19,
            T012M2_n8700OT19, T012M2_A8701Col19, T012M2_n8701Col19, T012M2_A8844ColN19, T012M2_n8844ColN19, T012M2_A8845CodC19, T012M2_n8845CodC19, T012M2_A8846NomC19, T012M2_n8846NomC19, T012M2_A8849Tel19,
            T012M2_n8849Tel19, T012M2_A8850Tura19, T012M2_n8850Tura19, T012M2_A8851Turb19, T012M2_n8851Turb19, T012M2_A8852Turc19, T012M2_n8852Turc19, T012M2_A8865ColNN19, T012M2_n8865ColNN19
            }
            , new Object[] {
            T012M3_A396EmprCod, T012M3_A8692NEnt19, T012M3_A8696CodPz19, T012M3_A8697Kgs19, T012M3_n8697Kgs19, T012M3_A8698Mts19, T012M3_n8698Mts19, T012M3_A8699Dib19, T012M3_n8699Dib19, T012M3_A8700OT19,
            T012M3_n8700OT19, T012M3_A8701Col19, T012M3_n8701Col19, T012M3_A8844ColN19, T012M3_n8844ColN19, T012M3_A8845CodC19, T012M3_n8845CodC19, T012M3_A8846NomC19, T012M3_n8846NomC19, T012M3_A8849Tel19,
            T012M3_n8849Tel19, T012M3_A8850Tura19, T012M3_n8850Tura19, T012M3_A8851Turb19, T012M3_n8851Turb19, T012M3_A8852Turc19, T012M3_n8852Turc19, T012M3_A8865ColNN19, T012M3_n8865ColNN19
            }
            , new Object[] {
            T012M4_A8692NEnt19, T012M4_A8693FEnt19, T012M4_n8693FEnt19, T012M4_A8694NInt19, T012M4_n8694NInt19, T012M4_A8695NPed19, T012M4_n8695NPed19, T012M4_A8705NRecCod, T012M4_n8705NRecCod, T012M4_A8706Nestado,
            T012M4_n8706Nestado, T012M4_A8708NUsucod, T012M4_n8708NUsucod, T012M4_A8709NObs, T012M4_n8709NObs, T012M4_A8710NUsuMod, T012M4_n8710NUsuMod, T012M4_A8711NFecNota, T012M4_n8711NFecNota, T012M4_A8841CliCod19,
            T012M4_n8841CliCod19, T012M4_A8842CliNom19, T012M4_n8842CliNom19, T012M4_A8772Art19, T012M4_n8772Art19, T012M4_A8773DibC19, T012M4_n8773DibC19, T012M4_A8843Art19Rd, T012M4_n8843Art19Rd, T012M4_A8847Unid19,
            T012M4_n8847Unid19, T012M4_A396EmprCod, T012M4_A8770TipDocC, T012M4_n8770TipDocC
            }
            , new Object[] {
            T012M5_A8692NEnt19, T012M5_A8693FEnt19, T012M5_n8693FEnt19, T012M5_A8694NInt19, T012M5_n8694NInt19, T012M5_A8695NPed19, T012M5_n8695NPed19, T012M5_A8705NRecCod, T012M5_n8705NRecCod, T012M5_A8706Nestado,
            T012M5_n8706Nestado, T012M5_A8708NUsucod, T012M5_n8708NUsucod, T012M5_A8709NObs, T012M5_n8709NObs, T012M5_A8710NUsuMod, T012M5_n8710NUsuMod, T012M5_A8711NFecNota, T012M5_n8711NFecNota, T012M5_A8841CliCod19,
            T012M5_n8841CliCod19, T012M5_A8842CliNom19, T012M5_n8842CliNom19, T012M5_A8772Art19, T012M5_n8772Art19, T012M5_A8773DibC19, T012M5_n8773DibC19, T012M5_A8843Art19Rd, T012M5_n8843Art19Rd, T012M5_A8847Unid19,
            T012M5_n8847Unid19, T012M5_A396EmprCod, T012M5_A8770TipDocC, T012M5_n8770TipDocC
            }
            , new Object[] {
            T012M6_A407EmprNom, T012M6_n407EmprNom
            }
            , new Object[] {
            T012M7_A8771TipDocD, T012M7_n8771TipDocD
            }
            , new Object[] {
            T012M9_A8704Tkgr, T012M9_A8702Tmts, T012M9_A8703Tpzs
            }
            , new Object[] {
            T012M11_A8692NEnt19, T012M11_A407EmprNom, T012M11_n407EmprNom, T012M11_A8693FEnt19, T012M11_n8693FEnt19, T012M11_A8694NInt19, T012M11_n8694NInt19, T012M11_A8695NPed19, T012M11_n8695NPed19, T012M11_A8705NRecCod,
            T012M11_n8705NRecCod, T012M11_A8706Nestado, T012M11_n8706Nestado, T012M11_A8708NUsucod, T012M11_n8708NUsucod, T012M11_A8709NObs, T012M11_n8709NObs, T012M11_A8710NUsuMod, T012M11_n8710NUsuMod, T012M11_A8711NFecNota,
            T012M11_n8711NFecNota, T012M11_A8841CliCod19, T012M11_n8841CliCod19, T012M11_A8842CliNom19, T012M11_n8842CliNom19, T012M11_A8771TipDocD, T012M11_n8771TipDocD, T012M11_A8772Art19, T012M11_n8772Art19, T012M11_A8773DibC19,
            T012M11_n8773DibC19, T012M11_A8843Art19Rd, T012M11_n8843Art19Rd, T012M11_A8847Unid19, T012M11_n8847Unid19, T012M11_A396EmprCod, T012M11_A8770TipDocC, T012M11_n8770TipDocC, T012M11_A8704Tkgr, T012M11_A8702Tmts,
            T012M11_A8703Tpzs
            }
            , new Object[] {
            T012M12_A407EmprNom, T012M12_n407EmprNom
            }
            , new Object[] {
            T012M13_A8771TipDocD, T012M13_n8771TipDocD
            }
            , new Object[] {
            T012M15_A8704Tkgr, T012M15_A8702Tmts, T012M15_A8703Tpzs
            }
            , new Object[] {
            T012M16_A396EmprCod, T012M16_A8692NEnt19
            }
            , new Object[] {
            T012M17_A396EmprCod, T012M17_A8692NEnt19
            }
            , new Object[] {
            T012M18_A396EmprCod, T012M18_A8692NEnt19
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T012M22_A407EmprNom, T012M22_n407EmprNom
            }
            , new Object[] {
            T012M24_A8704Tkgr, T012M24_A8702Tmts, T012M24_A8703Tpzs
            }
            , new Object[] {
            T012M25_A8771TipDocD, T012M25_n8771TipDocD
            }
            , new Object[] {
            T012M26_A396EmprCod, T012M26_A8692NEnt19
            }
            , new Object[] {
            T012M27_A396EmprCod, T012M27_A8692NEnt19, T012M27_A8696CodPz19, T012M27_A8697Kgs19, T012M27_n8697Kgs19, T012M27_A8698Mts19, T012M27_n8698Mts19, T012M27_A8699Dib19, T012M27_n8699Dib19, T012M27_A8700OT19,
            T012M27_n8700OT19, T012M27_A8701Col19, T012M27_n8701Col19, T012M27_A8844ColN19, T012M27_n8844ColN19, T012M27_A8845CodC19, T012M27_n8845CodC19, T012M27_A8846NomC19, T012M27_n8846NomC19, T012M27_A8849Tel19,
            T012M27_n8849Tel19, T012M27_A8850Tura19, T012M27_n8850Tura19, T012M27_A8851Turb19, T012M27_n8851Turb19, T012M27_A8852Turc19, T012M27_n8852Turc19, T012M27_A8865ColNN19, T012M27_n8865ColNN19
            }
            , new Object[] {
            T012M28_A396EmprCod, T012M28_A8692NEnt19, T012M28_A8696CodPz19
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T012M32_A396EmprCod, T012M32_A8692NEnt19, T012M32_A8696CodPz19
            }
         }
      );
   }

   private byte Z8706Nestado ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A8706Nestado ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ8706Nestado ;
   private short Z8770TipDocC ;
   private short Z8849Tel19 ;
   private short nRcdDeleted_1189 ;
   private short nRcdExists_1189 ;
   private short nIsMod_1189 ;
   private short A8770TipDocC ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1189 ;
   private short RcdFound1189 ;
   private short nBlankRcdUsr1189 ;
   private short A8849Tel19 ;
   private short RcdFound1188 ;
   private short nIsDirty_1188 ;
   private short nIsDirty_1189 ;
   private short ZZ8770TipDocC ;
   private int Z8692NEnt19 ;
   private int Z8705NRecCod ;
   private int Z8841CliCod19 ;
   private int O8703Tpzs ;
   private int nRC_GXsfl_135 ;
   private int nGXsfl_135_idx=1 ;
   private int A8692NEnt19 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtNEnt19_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtFEnt19_Enabled ;
   private int edtNInt19_Enabled ;
   private int edtNPed19_Enabled ;
   private int edtTkgr_Enabled ;
   private int edtTmts_Enabled ;
   private int A8703Tpzs ;
   private int edtTpzs_Enabled ;
   private int A8705NRecCod ;
   private int edtNRecCod_Enabled ;
   private int edtNestado_Enabled ;
   private int edtNUsucod_Enabled ;
   private int edtNObs_Enabled ;
   private int edtNUsuMod_Enabled ;
   private int edtNFecNota_Enabled ;
   private int A8841CliCod19 ;
   private int edtCliCod19_Enabled ;
   private int edtCliNom19_Enabled ;
   private int edtTipDocC_Enabled ;
   private int edtTipDocD_Enabled ;
   private int edtArt19_Enabled ;
   private int edtDibC19_Enabled ;
   private int edtArt19Rd_Enabled ;
   private int edtUnid19_Enabled ;
   private int B8703Tpzs ;
   private int edtavnRcdDeleted_1189_Enabled ;
   private int edtCodPz19_Enabled ;
   private int edtKgs19_Enabled ;
   private int edtMts19_Enabled ;
   private int edtDib19_Enabled ;
   private int edtOT19_Enabled ;
   private int edtCol19_Enabled ;
   private int edtColN19_Enabled ;
   private int edtCodC19_Enabled ;
   private int edtNomC19_Enabled ;
   private int edtTel19_Enabled ;
   private int edtTura19_Enabled ;
   private int edtTurb19_Enabled ;
   private int edtTurc19_Enabled ;
   private int edtColNN19_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int s8703Tpzs ;
   private int GX_JID ;
   private int Z8703Tpzs ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtCodPz19_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtUnid19_Backcolor ;
   private int edtArt19Rd_Backcolor ;
   private int edtDibC19_Backcolor ;
   private int edtArt19_Backcolor ;
   private int edtTipDocD_Backcolor ;
   private int edtTipDocC_Backcolor ;
   private int edtCliNom19_Backcolor ;
   private int edtCliCod19_Backcolor ;
   private int edtNFecNota_Backcolor ;
   private int edtNUsuMod_Backcolor ;
   private int edtNObs_Backcolor ;
   private int edtNUsucod_Backcolor ;
   private int edtNestado_Backcolor ;
   private int edtNRecCod_Backcolor ;
   private int edtTpzs_Backcolor ;
   private int edtTmts_Backcolor ;
   private int edtTkgr_Backcolor ;
   private int edtNPed19_Backcolor ;
   private int edtNInt19_Backcolor ;
   private int edtFEnt19_Backcolor ;
   private int edtNEnt19_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ8692NEnt19 ;
   private int ZZ8705NRecCod ;
   private int ZZ8841CliCod19 ;
   private int ZZ8703Tpzs ;
   private int ZO8703Tpzs ;
   private long Z8850Tura19 ;
   private long Z8851Turb19 ;
   private long Z8852Turc19 ;
   private long GRID1_nFirstRecordOnPage ;
   private long A8850Tura19 ;
   private long A8851Turb19 ;
   private long A8852Turc19 ;
   private java.math.BigDecimal Z8843Art19Rd ;
   private java.math.BigDecimal O8702Tmts ;
   private java.math.BigDecimal O8704Tkgr ;
   private java.math.BigDecimal Z8697Kgs19 ;
   private java.math.BigDecimal Z8698Mts19 ;
   private java.math.BigDecimal O8698Mts19 ;
   private java.math.BigDecimal O8697Kgs19 ;
   private java.math.BigDecimal A8704Tkgr ;
   private java.math.BigDecimal A8702Tmts ;
   private java.math.BigDecimal A8843Art19Rd ;
   private java.math.BigDecimal B8702Tmts ;
   private java.math.BigDecimal B8704Tkgr ;
   private java.math.BigDecimal s8702Tmts ;
   private java.math.BigDecimal s8704Tkgr ;
   private java.math.BigDecimal A8697Kgs19 ;
   private java.math.BigDecimal A8698Mts19 ;
   private java.math.BigDecimal T8698Mts19 ;
   private java.math.BigDecimal T8697Kgs19 ;
   private java.math.BigDecimal Z8704Tkgr ;
   private java.math.BigDecimal Z8702Tmts ;
   private java.math.BigDecimal ZZ8843Art19Rd ;
   private java.math.BigDecimal ZZ8704Tkgr ;
   private java.math.BigDecimal ZZ8702Tmts ;
   private java.math.BigDecimal ZO8702Tmts ;
   private java.math.BigDecimal ZO8704Tkgr ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z8694NInt19 ;
   private String Z8695NPed19 ;
   private String Z8708NUsucod ;
   private String Z8709NObs ;
   private String Z8710NUsuMod ;
   private String Z8842CliNom19 ;
   private String Z8772Art19 ;
   private String Z8773DibC19 ;
   private String Z8847Unid19 ;
   private String Z8696CodPz19 ;
   private String Z8699Dib19 ;
   private String Z8700OT19 ;
   private String Z8701Col19 ;
   private String Z8844ColN19 ;
   private String Z8845CodC19 ;
   private String Z8846NomC19 ;
   private String Z8865ColNN19 ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_135_idx="0001" ;
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
   private String edtNEnt19_Internalname ;
   private String edtNEnt19_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtFEnt19_Internalname ;
   private String edtFEnt19_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtNInt19_Internalname ;
   private String A8694NInt19 ;
   private String edtNInt19_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtNPed19_Internalname ;
   private String A8695NPed19 ;
   private String edtNPed19_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtTkgr_Internalname ;
   private String edtTkgr_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtTmts_Internalname ;
   private String edtTmts_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtTpzs_Internalname ;
   private String edtTpzs_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtNRecCod_Internalname ;
   private String edtNRecCod_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtNestado_Internalname ;
   private String edtNestado_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtNUsucod_Internalname ;
   private String A8708NUsucod ;
   private String edtNUsucod_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtNObs_Internalname ;
   private String A8709NObs ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtNUsuMod_Internalname ;
   private String A8710NUsuMod ;
   private String edtNUsuMod_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtNFecNota_Internalname ;
   private String edtNFecNota_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtCliCod19_Internalname ;
   private String edtCliCod19_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtCliNom19_Internalname ;
   private String A8842CliNom19 ;
   private String edtCliNom19_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtTipDocC_Internalname ;
   private String edtTipDocC_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtTipDocD_Internalname ;
   private String A8771TipDocD ;
   private String edtTipDocD_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtArt19_Internalname ;
   private String A8772Art19 ;
   private String edtArt19_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtDibC19_Internalname ;
   private String A8773DibC19 ;
   private String edtDibC19_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtArt19Rd_Internalname ;
   private String edtArt19Rd_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtUnid19_Internalname ;
   private String A8847Unid19 ;
   private String edtUnid19_Jsonclick ;
   private String sMode1189 ;
   private String edtavnRcdDeleted_1189_Internalname ;
   private String edtCodPz19_Internalname ;
   private String edtKgs19_Internalname ;
   private String edtMts19_Internalname ;
   private String edtDib19_Internalname ;
   private String edtOT19_Internalname ;
   private String edtCol19_Internalname ;
   private String edtColN19_Internalname ;
   private String edtCodC19_Internalname ;
   private String edtNomC19_Internalname ;
   private String edtTel19_Internalname ;
   private String edtTura19_Internalname ;
   private String edtTurb19_Internalname ;
   private String edtTurc19_Internalname ;
   private String edtColNN19_Internalname ;
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
   private String sMode1188 ;
   private String GXCCtl ;
   private String A8696CodPz19 ;
   private String A8699Dib19 ;
   private String A8700OT19 ;
   private String A8701Col19 ;
   private String A8844ColN19 ;
   private String A8845CodC19 ;
   private String A8846NomC19 ;
   private String A8865ColNN19 ;
   private String Z407EmprNom ;
   private String Z8771TipDocD ;
   private String sGXsfl_135_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1189_Jsonclick ;
   private String edtCodPz19_Jsonclick ;
   private String edtKgs19_Jsonclick ;
   private String edtMts19_Jsonclick ;
   private String edtDib19_Jsonclick ;
   private String edtOT19_Jsonclick ;
   private String edtCol19_Jsonclick ;
   private String edtColN19_Jsonclick ;
   private String edtCodC19_Jsonclick ;
   private String edtNomC19_Jsonclick ;
   private String edtTel19_Jsonclick ;
   private String edtTura19_Jsonclick ;
   private String edtTurb19_Jsonclick ;
   private String edtTurc19_Jsonclick ;
   private String edtColNN19_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ8694NInt19 ;
   private String ZZ8695NPed19 ;
   private String ZZ8708NUsucod ;
   private String ZZ8709NObs ;
   private String ZZ8710NUsuMod ;
   private String ZZ8842CliNom19 ;
   private String ZZ8772Art19 ;
   private String ZZ8773DibC19 ;
   private String ZZ8847Unid19 ;
   private String ZZ407EmprNom ;
   private String ZZ8771TipDocD ;
   private java.util.Date Z8693FEnt19 ;
   private java.util.Date Z8711NFecNota ;
   private java.util.Date A8693FEnt19 ;
   private java.util.Date A8711NFecNota ;
   private java.util.Date ZZ8693FEnt19 ;
   private java.util.Date ZZ8711NFecNota ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n8770TipDocC ;
   private boolean wbErr ;
   private boolean bGXsfl_135_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n8693FEnt19 ;
   private boolean n8694NInt19 ;
   private boolean n8695NPed19 ;
   private boolean n8705NRecCod ;
   private boolean n8706Nestado ;
   private boolean n8708NUsucod ;
   private boolean n8709NObs ;
   private boolean n8710NUsuMod ;
   private boolean n8711NFecNota ;
   private boolean n8841CliCod19 ;
   private boolean n8842CliNom19 ;
   private boolean n8771TipDocD ;
   private boolean n8772Art19 ;
   private boolean n8773DibC19 ;
   private boolean n8843Art19Rd ;
   private boolean n8847Unid19 ;
   private boolean Gx_longc ;
   private boolean n8697Kgs19 ;
   private boolean n8698Mts19 ;
   private boolean n8699Dib19 ;
   private boolean n8700OT19 ;
   private boolean n8701Col19 ;
   private boolean n8844ColN19 ;
   private boolean n8845CodC19 ;
   private boolean n8846NomC19 ;
   private boolean n8849Tel19 ;
   private boolean n8850Tura19 ;
   private boolean n8851Turb19 ;
   private boolean n8852Turc19 ;
   private boolean n8865ColNN19 ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private int[] T012M11_A8692NEnt19 ;
   private String[] T012M11_A407EmprNom ;
   private boolean[] T012M11_n407EmprNom ;
   private java.util.Date[] T012M11_A8693FEnt19 ;
   private boolean[] T012M11_n8693FEnt19 ;
   private String[] T012M11_A8694NInt19 ;
   private boolean[] T012M11_n8694NInt19 ;
   private String[] T012M11_A8695NPed19 ;
   private boolean[] T012M11_n8695NPed19 ;
   private int[] T012M11_A8705NRecCod ;
   private boolean[] T012M11_n8705NRecCod ;
   private byte[] T012M11_A8706Nestado ;
   private boolean[] T012M11_n8706Nestado ;
   private String[] T012M11_A8708NUsucod ;
   private boolean[] T012M11_n8708NUsucod ;
   private String[] T012M11_A8709NObs ;
   private boolean[] T012M11_n8709NObs ;
   private String[] T012M11_A8710NUsuMod ;
   private boolean[] T012M11_n8710NUsuMod ;
   private java.util.Date[] T012M11_A8711NFecNota ;
   private boolean[] T012M11_n8711NFecNota ;
   private int[] T012M11_A8841CliCod19 ;
   private boolean[] T012M11_n8841CliCod19 ;
   private String[] T012M11_A8842CliNom19 ;
   private boolean[] T012M11_n8842CliNom19 ;
   private String[] T012M11_A8771TipDocD ;
   private boolean[] T012M11_n8771TipDocD ;
   private String[] T012M11_A8772Art19 ;
   private boolean[] T012M11_n8772Art19 ;
   private String[] T012M11_A8773DibC19 ;
   private boolean[] T012M11_n8773DibC19 ;
   private java.math.BigDecimal[] T012M11_A8843Art19Rd ;
   private boolean[] T012M11_n8843Art19Rd ;
   private String[] T012M11_A8847Unid19 ;
   private boolean[] T012M11_n8847Unid19 ;
   private String[] T012M11_A396EmprCod ;
   private short[] T012M11_A8770TipDocC ;
   private boolean[] T012M11_n8770TipDocC ;
   private java.math.BigDecimal[] T012M11_A8704Tkgr ;
   private java.math.BigDecimal[] T012M11_A8702Tmts ;
   private int[] T012M11_A8703Tpzs ;
   private String[] T012M6_A407EmprNom ;
   private boolean[] T012M6_n407EmprNom ;
   private String[] T012M7_A8771TipDocD ;
   private boolean[] T012M7_n8771TipDocD ;
   private java.math.BigDecimal[] T012M9_A8704Tkgr ;
   private java.math.BigDecimal[] T012M9_A8702Tmts ;
   private int[] T012M9_A8703Tpzs ;
   private String[] T012M12_A407EmprNom ;
   private boolean[] T012M12_n407EmprNom ;
   private String[] T012M13_A8771TipDocD ;
   private boolean[] T012M13_n8771TipDocD ;
   private java.math.BigDecimal[] T012M15_A8704Tkgr ;
   private java.math.BigDecimal[] T012M15_A8702Tmts ;
   private int[] T012M15_A8703Tpzs ;
   private String[] T012M16_A396EmprCod ;
   private int[] T012M16_A8692NEnt19 ;
   private int[] T012M5_A8692NEnt19 ;
   private java.util.Date[] T012M5_A8693FEnt19 ;
   private boolean[] T012M5_n8693FEnt19 ;
   private String[] T012M5_A8694NInt19 ;
   private boolean[] T012M5_n8694NInt19 ;
   private String[] T012M5_A8695NPed19 ;
   private boolean[] T012M5_n8695NPed19 ;
   private int[] T012M5_A8705NRecCod ;
   private boolean[] T012M5_n8705NRecCod ;
   private byte[] T012M5_A8706Nestado ;
   private boolean[] T012M5_n8706Nestado ;
   private String[] T012M5_A8708NUsucod ;
   private boolean[] T012M5_n8708NUsucod ;
   private String[] T012M5_A8709NObs ;
   private boolean[] T012M5_n8709NObs ;
   private String[] T012M5_A8710NUsuMod ;
   private boolean[] T012M5_n8710NUsuMod ;
   private java.util.Date[] T012M5_A8711NFecNota ;
   private boolean[] T012M5_n8711NFecNota ;
   private int[] T012M5_A8841CliCod19 ;
   private boolean[] T012M5_n8841CliCod19 ;
   private String[] T012M5_A8842CliNom19 ;
   private boolean[] T012M5_n8842CliNom19 ;
   private String[] T012M5_A8772Art19 ;
   private boolean[] T012M5_n8772Art19 ;
   private String[] T012M5_A8773DibC19 ;
   private boolean[] T012M5_n8773DibC19 ;
   private java.math.BigDecimal[] T012M5_A8843Art19Rd ;
   private boolean[] T012M5_n8843Art19Rd ;
   private String[] T012M5_A8847Unid19 ;
   private boolean[] T012M5_n8847Unid19 ;
   private String[] T012M5_A396EmprCod ;
   private short[] T012M5_A8770TipDocC ;
   private boolean[] T012M5_n8770TipDocC ;
   private String[] T012M17_A396EmprCod ;
   private int[] T012M17_A8692NEnt19 ;
   private String[] T012M18_A396EmprCod ;
   private int[] T012M18_A8692NEnt19 ;
   private int[] T012M4_A8692NEnt19 ;
   private java.util.Date[] T012M4_A8693FEnt19 ;
   private boolean[] T012M4_n8693FEnt19 ;
   private String[] T012M4_A8694NInt19 ;
   private boolean[] T012M4_n8694NInt19 ;
   private String[] T012M4_A8695NPed19 ;
   private boolean[] T012M4_n8695NPed19 ;
   private int[] T012M4_A8705NRecCod ;
   private boolean[] T012M4_n8705NRecCod ;
   private byte[] T012M4_A8706Nestado ;
   private boolean[] T012M4_n8706Nestado ;
   private String[] T012M4_A8708NUsucod ;
   private boolean[] T012M4_n8708NUsucod ;
   private String[] T012M4_A8709NObs ;
   private boolean[] T012M4_n8709NObs ;
   private String[] T012M4_A8710NUsuMod ;
   private boolean[] T012M4_n8710NUsuMod ;
   private java.util.Date[] T012M4_A8711NFecNota ;
   private boolean[] T012M4_n8711NFecNota ;
   private int[] T012M4_A8841CliCod19 ;
   private boolean[] T012M4_n8841CliCod19 ;
   private String[] T012M4_A8842CliNom19 ;
   private boolean[] T012M4_n8842CliNom19 ;
   private String[] T012M4_A8772Art19 ;
   private boolean[] T012M4_n8772Art19 ;
   private String[] T012M4_A8773DibC19 ;
   private boolean[] T012M4_n8773DibC19 ;
   private java.math.BigDecimal[] T012M4_A8843Art19Rd ;
   private boolean[] T012M4_n8843Art19Rd ;
   private String[] T012M4_A8847Unid19 ;
   private boolean[] T012M4_n8847Unid19 ;
   private String[] T012M4_A396EmprCod ;
   private short[] T012M4_A8770TipDocC ;
   private boolean[] T012M4_n8770TipDocC ;
   private String[] T012M22_A407EmprNom ;
   private boolean[] T012M22_n407EmprNom ;
   private java.math.BigDecimal[] T012M24_A8704Tkgr ;
   private java.math.BigDecimal[] T012M24_A8702Tmts ;
   private int[] T012M24_A8703Tpzs ;
   private String[] T012M25_A8771TipDocD ;
   private boolean[] T012M25_n8771TipDocD ;
   private String[] T012M26_A396EmprCod ;
   private int[] T012M26_A8692NEnt19 ;
   private String[] T012M27_A396EmprCod ;
   private int[] T012M27_A8692NEnt19 ;
   private String[] T012M27_A8696CodPz19 ;
   private java.math.BigDecimal[] T012M27_A8697Kgs19 ;
   private boolean[] T012M27_n8697Kgs19 ;
   private java.math.BigDecimal[] T012M27_A8698Mts19 ;
   private boolean[] T012M27_n8698Mts19 ;
   private String[] T012M27_A8699Dib19 ;
   private boolean[] T012M27_n8699Dib19 ;
   private String[] T012M27_A8700OT19 ;
   private boolean[] T012M27_n8700OT19 ;
   private String[] T012M27_A8701Col19 ;
   private boolean[] T012M27_n8701Col19 ;
   private String[] T012M27_A8844ColN19 ;
   private boolean[] T012M27_n8844ColN19 ;
   private String[] T012M27_A8845CodC19 ;
   private boolean[] T012M27_n8845CodC19 ;
   private String[] T012M27_A8846NomC19 ;
   private boolean[] T012M27_n8846NomC19 ;
   private short[] T012M27_A8849Tel19 ;
   private boolean[] T012M27_n8849Tel19 ;
   private long[] T012M27_A8850Tura19 ;
   private boolean[] T012M27_n8850Tura19 ;
   private long[] T012M27_A8851Turb19 ;
   private boolean[] T012M27_n8851Turb19 ;
   private long[] T012M27_A8852Turc19 ;
   private boolean[] T012M27_n8852Turc19 ;
   private String[] T012M27_A8865ColNN19 ;
   private boolean[] T012M27_n8865ColNN19 ;
   private String[] T012M28_A396EmprCod ;
   private int[] T012M28_A8692NEnt19 ;
   private String[] T012M28_A8696CodPz19 ;
   private String[] T012M3_A396EmprCod ;
   private int[] T012M3_A8692NEnt19 ;
   private String[] T012M3_A8696CodPz19 ;
   private java.math.BigDecimal[] T012M3_A8697Kgs19 ;
   private boolean[] T012M3_n8697Kgs19 ;
   private java.math.BigDecimal[] T012M3_A8698Mts19 ;
   private boolean[] T012M3_n8698Mts19 ;
   private String[] T012M3_A8699Dib19 ;
   private boolean[] T012M3_n8699Dib19 ;
   private String[] T012M3_A8700OT19 ;
   private boolean[] T012M3_n8700OT19 ;
   private String[] T012M3_A8701Col19 ;
   private boolean[] T012M3_n8701Col19 ;
   private String[] T012M3_A8844ColN19 ;
   private boolean[] T012M3_n8844ColN19 ;
   private String[] T012M3_A8845CodC19 ;
   private boolean[] T012M3_n8845CodC19 ;
   private String[] T012M3_A8846NomC19 ;
   private boolean[] T012M3_n8846NomC19 ;
   private short[] T012M3_A8849Tel19 ;
   private boolean[] T012M3_n8849Tel19 ;
   private long[] T012M3_A8850Tura19 ;
   private boolean[] T012M3_n8850Tura19 ;
   private long[] T012M3_A8851Turb19 ;
   private boolean[] T012M3_n8851Turb19 ;
   private long[] T012M3_A8852Turc19 ;
   private boolean[] T012M3_n8852Turc19 ;
   private String[] T012M3_A8865ColNN19 ;
   private boolean[] T012M3_n8865ColNN19 ;
   private String[] T012M2_A396EmprCod ;
   private int[] T012M2_A8692NEnt19 ;
   private String[] T012M2_A8696CodPz19 ;
   private java.math.BigDecimal[] T012M2_A8697Kgs19 ;
   private boolean[] T012M2_n8697Kgs19 ;
   private java.math.BigDecimal[] T012M2_A8698Mts19 ;
   private boolean[] T012M2_n8698Mts19 ;
   private String[] T012M2_A8699Dib19 ;
   private boolean[] T012M2_n8699Dib19 ;
   private String[] T012M2_A8700OT19 ;
   private boolean[] T012M2_n8700OT19 ;
   private String[] T012M2_A8701Col19 ;
   private boolean[] T012M2_n8701Col19 ;
   private String[] T012M2_A8844ColN19 ;
   private boolean[] T012M2_n8844ColN19 ;
   private String[] T012M2_A8845CodC19 ;
   private boolean[] T012M2_n8845CodC19 ;
   private String[] T012M2_A8846NomC19 ;
   private boolean[] T012M2_n8846NomC19 ;
   private short[] T012M2_A8849Tel19 ;
   private boolean[] T012M2_n8849Tel19 ;
   private long[] T012M2_A8850Tura19 ;
   private boolean[] T012M2_n8850Tura19 ;
   private long[] T012M2_A8851Turb19 ;
   private boolean[] T012M2_n8851Turb19 ;
   private long[] T012M2_A8852Turc19 ;
   private boolean[] T012M2_n8852Turc19 ;
   private String[] T012M2_A8865ColNN19 ;
   private boolean[] T012M2_n8865ColNN19 ;
   private String[] T012M32_A396EmprCod ;
   private int[] T012M32_A8692NEnt19 ;
   private String[] T012M32_A8696CodPz19 ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tent19__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tent19__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tent19__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tent19__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tent19__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T012M2", "SELECT EmprCod, NEnt19, CodPz19, Kgs19, Mts19, Dib19, OT19, Col19, ColN19, CodC19, NomC19, Tel19, Tura19, Turb19, Turc19, ColNN19 FROM TXPENT191 WHERE EmprCod = ? AND NEnt19 = ? AND CodPz19 = ?  FOR UPDATE OF Kgs19, Mts19, Dib19, OT19, Col19, ColN19, CodC19, NomC19, Tel19, Tura19, Turb19, Turc19, ColNN19 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012M3", "SELECT EmprCod, NEnt19, CodPz19, Kgs19, Mts19, Dib19, OT19, Col19, ColN19, CodC19, NomC19, Tel19, Tura19, Turb19, Turc19, ColNN19 FROM TXPENT191 WHERE EmprCod = ? AND NEnt19 = ? AND CodPz19 = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012M4", "SELECT NEnt19, FEnt19, NInt19, NPed19, NRecCod, Nestado, NUsucod, NObs, NUsuMod, NFecNota, CliCod19, CliNom19, Art19, DibC19, Art19Rd, Unid19, EmprCod, TipDocC FROM TXPENT19 WHERE EmprCod = ? AND NEnt19 = ?  FOR UPDATE OF FEnt19, NInt19, NPed19, NRecCod, Nestado, NUsucod, NObs, NUsuMod, NFecNota, CliCod19, CliNom19, Art19, DibC19, Art19Rd, Unid19, TipDocC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012M5", "SELECT NEnt19, FEnt19, NInt19, NPed19, NRecCod, Nestado, NUsucod, NObs, NUsuMod, NFecNota, CliCod19, CliNom19, Art19, DibC19, Art19Rd, Unid19, EmprCod, TipDocC FROM TXPENT19 WHERE EmprCod = ? AND NEnt19 = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012M6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012M7", "SELECT TipDocD FROM TXPTIPDOC WHERE EmprCod = ? AND TipDocC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012M9", "SELECT COALESCE( T1.Tkgr, 0) AS Tkgr, COALESCE( T1.Tmts, 0) AS Tmts, COALESCE( T1.Tpzs, 0) AS Tpzs FROM (SELECT SUM(Kgs19) AS Tkgr, EmprCod, NEnt19, SUM(Mts19) AS Tmts, COUNT(*) AS Tpzs FROM TXPENT191 GROUP BY EmprCod, NEnt19 ) T1 WHERE T1.EmprCod = ? AND T1.NEnt19 = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012M11", "SELECT /*+ FIRST_ROWS(100) */ TM1.NEnt19, T2.EmprNom, TM1.FEnt19, TM1.NInt19, TM1.NPed19, TM1.NRecCod, TM1.Nestado, TM1.NUsucod, TM1.NObs, TM1.NUsuMod, TM1.NFecNota, TM1.CliCod19, TM1.CliNom19, T4.TipDocD, TM1.Art19, TM1.DibC19, TM1.Art19Rd, TM1.Unid19, TM1.EmprCod, TM1.TipDocC, COALESCE( T3.Tkgr, 0) AS Tkgr, COALESCE( T3.Tmts, 0) AS Tmts, COALESCE( T3.Tpzs, 0) AS Tpzs FROM (((TXPENT19 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(Kgs19) AS Tkgr, EmprCod, NEnt19, SUM(Mts19) AS Tmts, COUNT(*) AS Tpzs FROM TXPENT191 GROUP BY EmprCod, NEnt19 ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.NEnt19 = TM1.NEnt19) LEFT JOIN TXPTIPDOC T4 ON T4.EmprCod = TM1.EmprCod AND T4.TipDocC = TM1.TipDocC) WHERE TM1.EmprCod = ? and TM1.NEnt19 = ? ORDER BY TM1.EmprCod, TM1.NEnt19 ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012M12", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012M13", "SELECT TipDocD FROM TXPTIPDOC WHERE EmprCod = ? AND TipDocC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012M15", "SELECT COALESCE( T1.Tkgr, 0) AS Tkgr, COALESCE( T1.Tmts, 0) AS Tmts, COALESCE( T1.Tpzs, 0) AS Tpzs FROM (SELECT SUM(Kgs19) AS Tkgr, EmprCod, NEnt19, SUM(Mts19) AS Tmts, COUNT(*) AS Tpzs FROM TXPENT191 GROUP BY EmprCod, NEnt19 ) T1 WHERE T1.EmprCod = ? AND T1.NEnt19 = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012M16", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, NEnt19 FROM TXPENT19 WHERE EmprCod = ? AND NEnt19 = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012M17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, NEnt19 FROM TXPENT19 WHERE ( EmprCod > ? or EmprCod = ? and NEnt19 > ?) ORDER BY EmprCod, NEnt19) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012M18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, NEnt19 FROM TXPENT19 WHERE ( EmprCod < ? or EmprCod = ? and NEnt19 < ?) ORDER BY EmprCod DESC, NEnt19 DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T012M19", "INSERT INTO TXPENT19(NEnt19, FEnt19, NInt19, NPed19, NRecCod, Nestado, NUsucod, NObs, NUsuMod, NFecNota, CliCod19, CliNom19, Art19, DibC19, Art19Rd, Unid19, EmprCod, TipDocC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPENT19")
         ,new UpdateCursor("T012M20", "UPDATE TXPENT19 SET FEnt19=?, NInt19=?, NPed19=?, NRecCod=?, Nestado=?, NUsucod=?, NObs=?, NUsuMod=?, NFecNota=?, CliCod19=?, CliNom19=?, Art19=?, DibC19=?, Art19Rd=?, Unid19=?, TipDocC=?  WHERE EmprCod = ? AND NEnt19 = ?", GX_NOMASK, "TXPENT19")
         ,new UpdateCursor("T012M21", "DELETE FROM TXPENT19  WHERE EmprCod = ? AND NEnt19 = ?", GX_NOMASK, "TXPENT19")
         ,new ForEachCursor("T012M22", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012M24", "SELECT COALESCE( T1.Tkgr, 0) AS Tkgr, COALESCE( T1.Tmts, 0) AS Tmts, COALESCE( T1.Tpzs, 0) AS Tpzs FROM (SELECT SUM(Kgs19) AS Tkgr, EmprCod, NEnt19, SUM(Mts19) AS Tmts, COUNT(*) AS Tpzs FROM TXPENT191 GROUP BY EmprCod, NEnt19 ) T1 WHERE T1.EmprCod = ? AND T1.NEnt19 = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012M25", "SELECT TipDocD FROM TXPTIPDOC WHERE EmprCod = ? AND TipDocC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012M26", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, NEnt19 FROM TXPENT19 ORDER BY EmprCod, NEnt19 ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012M27", "SELECT EmprCod, NEnt19, CodPz19, Kgs19, Mts19, Dib19, OT19, Col19, ColN19, CodC19, NomC19, Tel19, Tura19, Turb19, Turc19, ColNN19 FROM TXPENT191 WHERE EmprCod = ? and NEnt19 = ? and CodPz19 = ? ORDER BY EmprCod, NEnt19, CodPz19 ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012M28", "SELECT EmprCod, NEnt19, CodPz19 FROM TXPENT191 WHERE EmprCod = ? AND NEnt19 = ? AND CodPz19 = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T012M29", "INSERT INTO TXPENT191(EmprCod, NEnt19, CodPz19, Kgs19, Mts19, Dib19, OT19, Col19, ColN19, CodC19, NomC19, Tel19, Tura19, Turb19, Turc19, ColNN19) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPENT191")
         ,new UpdateCursor("T012M30", "UPDATE TXPENT191 SET Kgs19=?, Mts19=?, Dib19=?, OT19=?, Col19=?, ColN19=?, CodC19=?, NomC19=?, Tel19=?, Tura19=?, Turb19=?, Turc19=?, ColNN19=?  WHERE EmprCod = ? AND NEnt19 = ? AND CodPz19 = ?", GX_NOMASK, "TXPENT191")
         ,new UpdateCursor("T012M31", "DELETE FROM TXPENT191  WHERE EmprCod = ? AND NEnt19 = ? AND CodPz19 = ?", GX_NOMASK, "TXPENT191")
         ,new ForEachCursor("T012M32", "SELECT EmprCod, NEnt19, CodPz19 FROM TXPENT191 WHERE EmprCod = ? and NEnt19 = ? ORDER BY EmprCod, NEnt19, CodPz19 ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 40);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 28);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 40);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 40);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 28);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 40);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 300);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 3);
               ((short[]) buf[32])[0] = rslt.getShort(18);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 300);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 3);
               ((short[]) buf[32])[0] = rslt.getShort(18);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 300);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 40);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 3);
               ((short[]) buf[36])[0] = rslt.getShort(20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(22,2);
               ((int[]) buf[40])[0] = rslt.getInt(23);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 40);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 28);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 40);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 14 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[2], false);
               }
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
                  stmt.setString(4, (String)parms[6], 20);
               }
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 8);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 300);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 8);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[18], false);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[20]).intValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 30);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 16);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[26], 16);
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
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[30], 1);
               }
               stmt.setString(17, (String)parms[31], 3);
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[33]).shortValue());
               }
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 20);
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
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 8);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 300);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 8);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[17], false);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[19]).intValue());
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
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 16);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 16);
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
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[31]).shortValue());
               }
               stmt.setString(17, (String)parms[32], 3);
               stmt.setInt(18, ((Number) parms[33]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
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
                  stmt.setString(7, (String)parms[10], 10);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[12], 13);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 40);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[16], 11);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[18], 28);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(13, ((Number) parms[22]).longValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(14, ((Number) parms[24]).longValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(15, ((Number) parms[26]).longValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[28], 40);
               }
               return;
            case 24 :
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
                  stmt.setString(4, (String)parms[7], 10);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 13);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 40);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 11);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 28);
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
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(10, ((Number) parms[19]).longValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(11, ((Number) parms[21]).longValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(12, ((Number) parms[23]).longValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 40);
               }
               stmt.setString(14, (String)parms[26], 3);
               stmt.setInt(15, ((Number) parms[27]).intValue());
               stmt.setString(16, (String)parms[28], 9);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

